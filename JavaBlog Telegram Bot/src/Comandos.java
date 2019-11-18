

//essa classe recebe os comandos do bot e em seguida fornece as ações solicitadas pelo comando selecionado
public class Comandos {
	
	private Cadastro_Local local = new Cadastro_Local();
	private String comandos = "/cadastrar_localizacao\n/cadastrar_categ\n/cadastrar_bem \n/listar_localizacao \n/listar_categorias\n/listar_bens_de_uma_localizacao\n"
			+ "/buscar_bem_por_codigo\n/buscar_bem_por_nome\n/buscar_bem_por_descricao\n/movimentar_bem\n/gerar_relatorio";
	
	
	
	//recebe os comandos e executa as ações de acordo com o que foi solicitado
	public void Receptor() {
	
		Receber_msg captura_dmensagens = new Receber_msg();
		Enviarmsg enviar = new Enviarmsg();
		
		
		
		
		String msgcaptura = captura_dmensagens.recebido();
		
			//se digitar help esse comando é invocado
			if(msgcaptura.equals("/help") ) {
			
				enviar.montarMsg( captura_dmensagens.up() , comandos);
				
				msgcaptura = "";
			//comando cadastrar localização
			}else if(msgcaptura.equals("/cadastrar_localizacao")) {
				
			enviar.montarMsg(captura_dmensagens.up(), "digite o nome da localização:");
			
			do {
				
			local.setLocal(captura_dmensagens.recebido());
			
			}while(local.getLocal().equals(""));
			
			enviar.montarMsg(captura_dmensagens.up(), "digite a descrição:");
			
				do {
				
				local.setDescricaoLocal(captura_dmensagens.recebido() );
				
				}while(local.getDescricaoLocal().equals(""));
				
			local.criar();	
			
			enviar.montarMsg(captura_dmensagens.up(), "LOCALIZAÇÃO CADASTRADA!!!" );
			
			msgcaptura = "";
			}//fim if
			
			
			
			
		
}//fim metodo
	
}	//fim classe
	
		

