import java.util.Scanner;

public class RetoFinde{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		int [] nombres = new int [24];
		Scanner scan = new Scanner(System.in);
		System.out.print("N�mero de alumnos por grupo: ");
		int alumnos = scan.nextInt();
		
		while(24 % alumnos != 0) {
			System.out.print("Introduzca otro n�mero para que haya el mismo n�mero de alumnos por grupo: ");
			alumnos = scan.nextInt();}
		
		String [] nombres1 = {"V�ctor B.","V�ctor C.","Carlos","Manuel","Adri�n E.","Nacho","Daniel","Adri�n G.","Jorge","Diego",
				"�lvaro","Suheb","Miguel","Sergio M.","Guillermo","Alberto","C�sar","David","Antonio","Marius","Ioan","Miguel","Pablo","Sergio"};
		
		for(int i = 0; i < nombres.length; i++) {
			
			int auxiliar = (int) Math.floor(Math.random()*23 + 1);
		
			for(int x = 23; x != -1; x--) {
				if(nombres[x] == auxiliar) {
					auxiliar = 1;
					for(int a = 23; a != -1; a--) {
						if(nombres[a] == auxiliar) {
							auxiliar++;
							a = 23;
						}
						if(a == 0) {
							nombres[i] = auxiliar;
						}
					}
						}
				if(x == 0) {
					nombres[i] = auxiliar;
				}
				}
			System.out.print(nombres1[auxiliar - 1]);
			
			if((i + 1) % alumnos == 0) {
				System.out.println(" ");
				System.out.println("-");
				}
			else {
				System.out.print(" , ");
			}
				
				}
				}
}
				
				
				
				
			
		

		
			

		
		
			


		
		

	