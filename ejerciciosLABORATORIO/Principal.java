package prueba;
import java.util.Scanner;
public class Principal {
	public static void main (String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Rectangulo ArreRectan[] = new Rectangulo[20];
		Coordenada ArreCord[] = new Coordenada[50];
		int i;
		double X,Y;
		Coordenada c1 = new Coordenada (5.5,1.1);
		Coordenada c2 = new Coordenada (2.3,0.5);
		Rectangulo h1= new Rectangulo(c1,c2);
		Coordenada c3 = new Coordenada (5.4,-2.6);
		Coordenada c4 = new Coordenada (5, 6);
		Rectangulo h2 = new Rectangulo (c3,c4);
		ContainerRect b1 = new ContainerRect (0); 
		
		
		System.out.println("Cuantos rectangulo mostrara?");
		int n = Scanner.nextInt();
		b1.setN(n);
		for (i=0;i<n;i++) {
			System.out.print("Ingresa la primera esquina:");
			X = Scanner.nextDouble();
			Y = Scanner.nextDouble();
			System.out.println();
			ArreCord[(i*4)] = new Coordenada(X,Y);
			
			System.out.print("Ingresa la primera esquina opuesta:");
			X = Scanner.nextDouble();
			Y = Scanner.nextDouble();
			System.out.println();
			ArreCord[(i*4)+1] = new Coordenada(X,Y);
			ArreRectan[(i*2)] = new Rectangulo(ArreCord[i*4],ArreCord[(i*4)+1]);
			
			System.out.print("Ingresa la segunda esquina:");
			X = Scanner.nextDouble();
			Y = Scanner.nextDouble();
			System.out.println();
			ArreCord[(i*4)+2] = new Coordenada(X,Y);
			
			System.out.print("Ingresa la segunda esquina:");
			X = Scanner.nextDouble();
			Y = Scanner.nextDouble();
			System.out.println();
			ArreCord[(i*4)+3] = new Coordenada(X,Y);
			ArreRectan[(i*2)+1] = new Rectangulo(ArreCord[(i*4)+2],ArreCord[(i*4)+3]);
			
			System.out.println("Rectangulo A="+ArreRectan[i*2].toString());
			System.out.println("Rectangulo B="+ArreRectan[(i*2)+1].toString());
			Verificador V1=new Verificador(ArreRectan[i*2], ArreRectan[(i*4)+1]);
			V1.Verific (ArreRectan[i*2], ArreRectan[(i*2)+1]);
		}
	}
}