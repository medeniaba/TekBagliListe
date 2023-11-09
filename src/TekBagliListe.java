import java.util.Scanner;


class Eleman {
	int icerik ;
	Eleman ileri ;


Eleman (int icerik ){
	
	this.icerik= icerik ;
	ileri = null ;

}
}



public class TekBagliListe {

	Eleman bas ;
	Eleman son ;
	
	public TekBagliListe () {
		
		bas = null ;
		son = null ; 
	}
  
	void ListeBasinaEkle(Eleman yeni ) {
		if(bas == null ) {
			
			bas = yeni ; 
			son = yeni ; 
		}
		else {
			yeni.ileri=bas ;
			bas = yeni ; 
			
		}
		
	}
	
	void ListeSonunaEkle(Eleman yeni ) {
		
		if ( bas ==  null ) {
			
			bas = yeni ;
		}
		
		
		else 
			son.ileri = yeni  ;
	         son = yeni  ;
	}
	
	void ListeOrtaEkle(Eleman yeni , Eleman once) {
		yeni.ileri= once.ileri ;
		once.ileri = yeni ;
		
		
		
	}
	
	void yazdır (Eleman bas ) {
		
		int sayac = 0 ; 
		Eleman tmp = bas ; 
		if ( bas == null ) {
			
			System.out.print("Liste boş ");
		    
			}
		
		else {
			while ( tmp != null )
			{
					
				
				System.out.print(tmp.icerik + " --->" + " ");
			      
				tmp = tmp.ileri ;
				sayac ++ ; 
							   
			
			}
			
			System.out.println("Baglı listedeki eleman sayısı : >>> " + sayac );
			
			
		}
		
	}
	
	
	void listesonuii() {
		Eleman tmp , once ; 
		tmp = bas ; 
		once = null ;
		while ( tmp.ileri != null ) {
			once = tmp ; 
			tmp = tmp.ileri ; 
			
			
		}
		if ( once == null ) {
			bas = null ; 
			son = null ; 
			
		}
		else {
			once.ileri = null ; 
			son = once ; 
		
			
		}		
		
	}
	
	void listeortasi1 ( Eleman silinen ) {
		
		Eleman tmp = bas ; 
		Eleman once = null ; 
		
		while (tmp != silinen ) {
			
			once = tmp ; 
			tmp = tmp.ileri ; 
			
			
		}
		
		
		once.ileri = tmp.ileri ; 
		tmp.ileri = null ;
		
		
		
		
		
	}
	
	

		
		
		
	
	
	
	public static void main(String[] args) {
	 
		TekBagliListe  list  = new TekBagliListe  () ;
		
		Eleman elemanbir = new Eleman (5);
		Eleman elemaniki = new Eleman (6);
		Eleman elemanuc = new Eleman  (7);
	
		list.ListeBasinaEkle(elemanbir);
		list.ListeSonunaEkle(elemaniki);
		list.ListeOrtaEkle(elemanuc, elemanbir);
		list.yazdır(elemanbir);
		

}}