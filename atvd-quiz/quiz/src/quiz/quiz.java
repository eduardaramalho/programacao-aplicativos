package quiz;

import java.util.Scanner;

public class quiz {
	//Tema ESPORTE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Dados do usuario(Breno)
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		
		//Primeira quest�o(Breno)
		System.out.println("\nA dura��o normal de uma partida para todas as equipes com\njogadores de idade igual ou acima de_______ anos � de_______ tempos de_______ minutos.\nO intervalo de jogo � normalmente de_______ minutos.\nA sequ�ncia que preenche corretamente as lacunas do texto �\n");
		System.out.println("1 - 14|04|20|10\n2 - 12|02|25|20\n3 - 08|03|15|15\n4 - 16|02|30|10");
		int q1 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q1 <1 || q1 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q1 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q1 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		
		
		//Segunda quest�o(Breno)
		System.out.println("\nI. O voleibol � uma modalidade esportiva rica em regras. Nesse esporte, n�o � permitido, por exemplo, fazer a bola passar sobre a rede, utilizar luvas durante o jogo e nem mesmo formar duplas para uma competi��o.");
		System.out.println("II. A pr�tica do v�lei n�o exige a realiza��o de movimentos dos membros superiores, pois os movimentos repetitivos praticados pelos atletas desse esporte compreendem apenas os movimentos dos membros inferiores.");
		System.out.println("\nMarque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras\n2 - A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 -As duas afirmativas s�o falsas.\n");
		int q2 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q2 <1 || q2 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q2 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q2 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Terceira quest�o(Breno)
		System.out.println("\nI. O atletismo contribui para o desenvolvimento das habilidades motoras b�sicas dos alunos, que s�o utilizadas na maioria das atividades desportivas. Essas habilidades, quando trabalhadas de forma pontual, desencadeiam uma s�rie de fatores intr�nsecos ao desenvolvimento e aprimoramento dos fundamentos b�sicos e a pr�pria cultura desportiva do educando.\r\n"
				+ "\r\n"
				+ "II. A ludicidade pr�pria do atletismo molda o comportamento infantil, pois brincando de correr, pular e arremessar, as crian�as aprendem e s�o motivadas a cooperar com os companheiros, a desobedecer as regras do jogo, a desrespeitar os direitos dos outros, a acatar a autoridade, a assumir responsabilidade e a aceitar penalidades que lhe s�o impostas.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 - A alternativa l � verdadeira, e a ll � falsa.\n3 - A afirmativa ll � verdadeira, e a l � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q3 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q3 <1 || q3 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q3 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q3 == 2) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Quarta quest�o(Breno)
		System.out.println("\nI. O atletismo � um esporte muito simples e barato, uma vez que n�o demanda de materiais caros para exercer sua pr�tica, sendo, portanto, f�cil de ser praticado pelos alunos em forma de oficinas. Essa pr�tica proporciona infinitos benef�cios aos educandos, entre eles a aquisi��o e manuten��o de uma boa sa�de, o desenvolvimento motor e afetivo, independ�ncia e a autonomia.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "II. O atletismo representa um conjunto de esportes constitu�do por v�rias modalidades, como a corrida, a marcha, os lan�amentos e os saltos. De modo geral, no ambiente escolar, o Professor de Educa��o F�sica deve compelir o educando a realizar as atividades com insatisfa��o, evitando seguir quaisquer princ�pios de higiene ou de preserva��o da sa�de dos alunos.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 - A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q4 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q4 <1 || q4 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q4 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q4 == 2) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Quinta quest�o(Breno)
		System.out.println("I. O voleibol busca promover a desagrega��o do grupo de atletas, pois trata-se de um esporte competitivo e que deve ser praticado exclusivamente em torneios.\r\n"
				+ "\r\n"
				+ "II. No voleibol, n�o � permitido fazer a bola passar sobre a rede, o que caracteriza uma falta. Assim, para marcar um ponto, o jogador deve acertar a bola na rede do time advers�rio ap�s um saque �nico.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 - A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q5 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q5 <1 || q5 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q5 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q5 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Sexta quest�o(Breno)
		System.out.println("I. O voleibol � um esporte jogado com uma bola e inclui diversos passes com as m�os. O objetivo principal desse jogo � lan�ar a bola por cima da rede e faz�-la tocar no ch�o do lado do advers�rio.\r\n"
				+ "\r\n"
				+ "II. O treinamento de defesa para o voleibol escolar pode ser um dos fundamentos mais dif�ceis de se praticar e treinar quando se disp�e apenas de quadras de cimento.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 -  As duas afirmativas s�o verdadeiras\n2 - A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q6 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q6 <1 || q6 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q6 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q6 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Setima quest�o(Breno)
		System.out.println("I. O voleibol busca promover a desagrega��o do grupo de atletas, pois trata-se de um esporte competitivo e que deve ser praticado exclusivamente em torneios.\r\n"
				+ "\r\n"
				+ "II. No voleibol, n�o � permitido fazer a bola passar sobre a rede, o que caracteriza uma falta. Assim, para marcar um ponto, o jogador deve acertar a bola na rede do time advers�rio ap�s um saque �nico.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 -  A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q7 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q7 <1 || q7 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q7 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q7 == 4) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Oitava quest�o(Breno)
		System.out.println("I. A dan�a, na Educa��o F�sica escolar, oferece oportunidade aos alunos de experimentar atividades diversificadas que contemplam a pluralidade cultural, pois por meio da dan�a � poss�vel aos alunos desenvolver diferentes movimentos corporais e reconhecer seu pr�prio corpo.\r\n"
				+ "\r\n"
				+ "II. As dan�as e as brincadeiras cantadas que t�m como caracter�sticas comuns a inten��o de express�o e comunica��o mediante gestos e a presen�a de est�mulos sonoros, no contexto da Educa��o F�sica escolar e � luz dos Par�metros Curriculares Nacionais, s�o consideradas atividades r�tmicas e expressivas.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA: ");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 - A afirmativa I � verdadeira, e a II � falsa.\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q8 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q8 <1 || q8 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q8 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q8 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Nona quest�o(Breno)
		System.out.println("Analise as afirmativas a seguir:\r\n"
				+ "\r\n"
				+ "I. No contexto da Educa��o F�sica escolar, a dan�a permite criar condi��es para que os educandos possam desenvolver seu sentimento de coletividade, suas capacidades criativas, superar desafios, valorizar a �tica e organizar os pr�prios conflitos internos e externos.\r\n"
				+ "\r\n"
				+ "II. A dan�a, na Educa��o F�sica escolar, permite criar condi��es para os educandos descobrirem novos espa�os e formas, superando as suas limita��es e condi��es para enfrentar novos desafios em rela��o aos aspectos motores, sociais, afetivos e cognitivos.\r\n"
				+ "\r\n"
				+ "Marque a alternativa CORRETA:");
		System.out.println("1 - As duas afirmativas s�o verdadeiras.\n2 - A afirmativa I � verdadeira, e a II � falsa\n3 - A afirmativa II � verdadeira, e a I � falsa.\n4 - As duas afirmativas s�o falsas.\n");
		int q9 = sc.nextInt();
		
		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q9 <1 || q9 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q9 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q9 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		//Decima quest�o(Breno)
		System.out.println("Informe se � verdadeiro (V) ou falso (F) o que se afirma sobre o voleibol.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "( ) A bola ser� esf�rica, dotada de uma capa flex�vel de couro ou couro sint�tico, al�m de uma c�mara interior feita de borracha ou material similar.\r\n"
				+ "\r\n"
				+ "( ) A quadra de jogo � um ret�ngulo medindo 18 metros x 9 metros, circundada por uma zona livre de, no m�nimo, 3 metros de largura em todos os lados.\r\n"
				+ "\r\n"
				+ "( ) A rede � colocada verticalmente sobre a linha central; sua parte superior � ajustada a 2,43 metros do solo para as mulheres e a 2,24 metros para os homens.\r\n"
				+ "\r\n"
				+ "( ) A superf�cie para a sua pr�tica deve ser plana, horizontal e uniforme; n�o deve apresentar nenhum perigo de les�o aos jogadores. � proibido jogar sobre uma superf�cie rugosa ou escorregadia.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "De acordo com as afirma��es, a sequ�ncia correta �");
		System.out.println("1 - V, V, F, V.\n2 - F, V, V, F.\n3 - V, F, F, V.\n4 - F, F, V, F.\n");
		int q10 = sc.nextInt();

		//Verifica se a alternativa esta 1 e 4(Eduarda)
		while(q10 <1 || q10 >4) {
			System.out.println("Alternativa invalida!");
			System.out.println("Tente novamente:");
			q10 = sc.nextInt();
		}
		
		//Analisa se a quest�o esta correta ou errada(Breno)
		if(q10 == 1) {
			System.out.println("Correto!");
		}else {
			System.out.println("Errado!");
		}
		
		System.out.println("Obrigado por responder nosso quiz "+nome+"!");
		System.out.println("Criado por Breno e Eduarda!");
		
		sc.close();
	}

}