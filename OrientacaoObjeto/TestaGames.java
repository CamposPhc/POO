package OrientacaoObjeto;

public class TestaGames {

	public static void main(String[] args) {
		produto jogo1 = new produto("Cult of the lamb",42.99,"aventura",16,"pix");
		produto jogo2 = new produto("Castlevania",15.99,"ação-aventura",18,"boleto");
		
		jogo1.visualizar();
		jogo2.visualizar();
	}

}