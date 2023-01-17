package jsp03.ex01;

import java.sql.Date;

public class MemberBean { //useBean�׼��±� - ȸ������ ������ �� �����ϰ�..
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	private Address addr; //���� Ŭ������ �θ��� �ڽ����� ���°�!!
	
	public MemberBean() {
		
	}
	
	public MemberBean(String id, String pwd, String name, String email) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.email=email;
	}
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	//�ʵ尡 private���� ���� ���ؼ� getter setter �̿� �ʿ�~!
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
}