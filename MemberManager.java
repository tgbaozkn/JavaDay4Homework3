
public class MemberManager implements Entity {

	@Override
	public void Save(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.id+"Nolu Oyun üyesi"+ member.name +"kaydedildi.");
	}

	@Override
	public void Delete(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.id+"Nolu Oyun üyesi"+ member.name +"SÝLÝNDÝ.");
		
	}

	@Override
	public void Update(Member member,String guncellenen) {
		// TODO Auto-generated method stub
		member.name = guncellenen;
		System.out.println(member.id + "Nolu oyun üyesi adýný þuna günceledi :"+ guncellenen);
		
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
