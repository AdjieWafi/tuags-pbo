public class tumbuhan{
	private String kingdom;
	private String subKingdom;
	private String superDivisi;
	private String divisi;
	private String kelas;
	private String subKelas;
	private String ordo;
	private String famili;
	private String genus;
	private String spesies;
	
	public tumbuhan (String kingdom, String subKingdom, String superDivisi, 
	String divisi, String kelas, String subKelas, String ordo, String famili, String genus, String spesies){
	
	this.kingdom = kingdom;
	this.subKingdom = subKingdom;
	this.superDivisi = superDivisi;
	this.divisi = divisi;
	this.kelas = kelas;
	this.subKelas = subKelas;
	this.ordo = ordo;
	this.famili = famili;
	this.genus = genus;
	this.spesies = spesies;
	}
	
	public String kingdom(){
		return kingdom;
	}
	
	public String subKingdom(){
		return subKingdom;
	}
	
	public String superDivisi(){
		return superDivisi;
	}
	
	public String divisi(){
		return divisi;
	}
	
	public String kelas(){
		return kelas;
	}
	
	public String subKelas(){
		return subKelas;
	}
	
	public String ordo(){
		return ordo;
	}
	
	public String famili(){
		return famili;
	}
	
	public String genus(){
		return genus;
	}
	
	public String spesies(){
		return spesies;
	}
}