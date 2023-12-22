package studenti;

public class Studenti {
int id;
String ime;
int godini;
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getIme() {
	return ime;
}
public void setime(String Ime) {
	this.Ime=Ime
}
public int getGodini() {
	return godini;
}
public void setGodini(int Godini) {
	
	package studenti;
	public class Glavna{
		public static void main(String[]args) {
			Student marko =new Student();	
			marko.setId(1);
			marko.setIme("Marko");
			marko.setGodini(18);
			System.out.printl("REden broj"+ marko.getId()+"e studentot"+marko.getIme()+"star"+marko.getGodini()+"godini");
			
		}
	}
}
}
