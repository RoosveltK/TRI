import java.util.Scanner;
public class MainApp
{
    public static void main(String[] args)
     {
		Scanner entre=new Scanner(System.in);
		boolean varBoucle = true;
		while(varBoucle)
		{
			System.out.print("Entrer la taille tu tableau: ");
			int n=entre.nextInt();
			int tab[] =new int[n];
			for(int i=0;i<tab.length;i++) 
			{
				System.out.print("Entrer la valeur tab["+(i+1)+"]: " );
				tab[i]=entre.nextInt();
			}
			afficheTableau(tab);
			System.out.println("Selectionner le tri que vous souhaiter effectuer\n 1-Tri Insertion\n 2-Tri Bulle\n 3-TRi fusion\n");
			int choix = entre.nextInt();
			switch(choix)
			{
				case 1:
					tab = Tri.tri_insertion(tab);
					afficheTableau(tab);
				break;
				case 2:
					tab = Tri.tri_bulle(tab);
					afficheTableau(tab);
				break;
				case 3:
					tab = Tri.tri_fusion(tab);
					afficheTableau(tab);
				break;
				default:
					System.out.println("Pas de tri pour cette option");
				break;		
			}
			System.out.println("Voulez vous continuer ? 0-autres chiffres et 1-Oui");
			int choix1 = entre.nextInt();
			if(choix1==1)
				varBoucle = false;
		}
		entre.close();
	}

	public static void afficheTableau(int tab[])
	{
		System.out.println("On obtient le tableau suivant: ");
			for(int i=0;i<tab.length;i++) 
			{
				System.out.print("["+tab[i]+"] " );
			}
			System.out.println("");	
	}
}

