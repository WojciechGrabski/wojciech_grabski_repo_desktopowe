import java.until.Random;
public class SortowanieTablic {
	public static void main(String[] args) {
	final int ilosc elementow = 100;
	Random r = new Random(); 
	int[] tab = new int(ilosc elementow);
	
	fot (int i = 0; i < ilosc elementow; i++){
		tab[i] = r.nextInt(bound 100) + 1;
		}
	System.out.println("Przed sortowaniem");
	long millisActualTime = System.currentTimeMillis();
	
	for (int i = 0; i < tab.length; i++){
		for (int j = 1; j < tab.length; j++){
			if (tab[i] < tab[j - 1]) ; {
				int wieksza = tab [j - 1];
				tab[j - 1] = tab[j];
				tab[j] = wieksza;
				}
			}
		}
	long executionTime = System.currentTimeMillis() - millisActualTime;
	System.out.println("Sortowanie bąbelkowe czas wykonania: "+executionTime);
	}
}
	