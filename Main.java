public class Main {
	
	public static void main (String[] args) {
		GameManager gamemanager = new GameManager();
		MemberManager membermanager = new MemberManager();
		String kampanya = "Bugüne özel %30 indirim!";
		Member member = new Member();
		member.id = 1;
		member.name = "Tugba";
		member.surname="Ozkan";
		member.datetime = "05-09-2021";
		member.nationalId ="01234567891";
		Game game = new Game(1,15.54,"Command & Conquer, Command & Conquer serisindeki iptal edilmiþ gerçek zamanlý bir strateji video oyunudur. ");
		game.name = "Command & Conquer" ;
		gamemanager.satisYap(game, member);
		gamemanager.kampanyaGirisi(game, member, kampanya);
		membermanager.PersonCheck(member);
		membermanager.Save(member);
		membermanager.Delete(member);
		membermanager.Update(member,"irem");
		membermanager.Save(member);
	}
}
