
public class GameManager implements GameEntity {


	@Override
	public void Save(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Member member,String guncellenen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PersonCheck(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void satisYap(Game game, Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getName() +"adl� oyuncu"+game.getName()+"oyunu satmak istiyor."+ "\n Bu oyunun fiyat� :"+ game.price +"Tl dir.");
		System.out.println("Oyun hakk�nda bilgi :"+ game.description +"Bu oyunun numaras�" + game.gameId);
	}

	@Override
	public void kampanyaGirisi(Game game, Member member,String kampanya) {
		// TODO Auto-generated method stub
	
		System.out.println(member.name +"adl� oyuncu"+game.name+"oyuna �u kampanyay� ekledi."+ "\n"+ kampanya);
	
	}


	

}
