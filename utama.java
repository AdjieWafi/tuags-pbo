public class utama {
	public static void main (String [] args){
		tumbuhan p = new tumbuhan("plantae", "tracheobionta", "spermatopytha", "magnoliophyta", "magnoliopsida", "Rosidae", 
		"Sapindales", "anacaridiaciae","Mangifera", "Mangifera Indica L");
		
		System.out.println("klasifikasi pohon mangga");
		System.out.println("Kingdom : "+p.kingdom());
		System.out.println("famili : "+p.famili());
		System.out.println("genus : "+p.genus());
		System.out.println("species : "+p.spesies());
		
	}
}