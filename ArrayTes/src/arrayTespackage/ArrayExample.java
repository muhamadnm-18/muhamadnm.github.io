package arrayTespackage;

class ArrayExample {
	public static void main(String[] args){
		String[] dataProdi = new String[10];
		dataProdi[0] = "Administrasi";
		dataProdi[1] = "Agroteknologi";
		dataProdi[2] = "Teknik Elektro";
		dataProdi[3] = "Bahasa Arab";
		dataProdi[4] = "Bahasa Inggris";
		dataProdi[5] = "Teknik Informatika";
		dataProdi[6] = "Fisika";
		dataProdi[7] = "Kimia";
		dataProdi[8] = "Biologi";
		dataProdi[9] = "Manajemen";
		
		for(int x = 0; x < dataProdi.length; x++) {
			if(dataProdi[x].equals(dataProdi[3]))
				continue;
			else
				System.out.println("Indeks ke-" + (x) + ": " + dataProdi[x]);
		}
	}
}