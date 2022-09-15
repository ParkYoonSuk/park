package projectoracle;

public class NaverDTO {
	private String id;

	private String pw;

	private String name;

	private String gender;

	private String birth;

	private String email;

	private String phone;

	

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	

	public String getPw() {

		return pw;

	}

	public void setPw(String pw) {

		this.pw = pw;

	}

	

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	

	public String getBirth() {

		return birth;

	}

	public void setBirth(String birth) {

		this.birth = birth;

	}

	

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	

	public String getPhone() {

		return phone;

	}

	public void setPhone(String phone) {

		this.phone = phone;

	}

	

	

	@Override

	public String toString() {

		String str = String.format("아이디:%s \n이름:%s \n성별:%s \n생일:%s \n이메일:%s \n번호:%s \n",

				id, name, gender, birth, email, phone);

				

		return str;

	}	

}
