
public class MemberManager implements Entity {

	@Override
	public void Save(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.id+"Nolu Oyun �yesi"+ member.name +"kaydedildi.");
	}

	@Override
	public void Delete(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.id+"Nolu Oyun �yesi"+ member.name +"S�L�ND�.");
		
	}

	@Override
	public void Update(Member member,String guncellenen) {
		// TODO Auto-generated method stub
		member.name = guncellenen;
		System.out.println(member.id + "Nolu oyun �yesi ad�n� �una g�nceledi :"+ guncellenen);
		
	}

	@Override
	public void PersonCheck(Member member) {
		// TODO Auto-generated method stub
		if(member.nationalId.length() == 11 ) {
			System.out.println("Youre a real person ,welcome the game." + member.name);
					
		}
		else {
			System.out.println("Youre arent a real person,please enter your national identity number.");
		}
		
	
	}

}
