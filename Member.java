
public class Member {
	int id ;
	String name;
	String surname;
	String nationalId;
	String datetime;
	public Member() {
		
	}
	public Member(int id, String name, String surname, String nationalId, String datetime) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalId = nationalId;
		this.datetime = datetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
