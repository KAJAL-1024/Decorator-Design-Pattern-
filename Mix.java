import java.util.Scanner;
class Mix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Base Emulsion"+'\n'+"1.Nerolac \n2.Berger \n3.Asian Paints");
		int a = 0, x = 0;
		PaintShop ps;
		//while (x<3){
			a = sc.nextInt();
			if (a==1){
				ps=new Nerolac();
				//break;
			}
			else if (a==2){
				ps=new Berger();
				//break;
			}
			else{
				ps=new Asian();
				//break;
			}
			/*else{
				System.out.println("Invalid Choice");
				++x;
			}*/
		//}
		a=0;
		System.out.println("Select Color"+'\n'+"1.Cyan \n2.Yellow \n3.Magenta \n4.White");
		//while (x<3){
			a = sc.nextInt();
			if (a==1){
				ps=new blue(ps);
				ps=new green(ps);
				//break;
			}
			else if (a==2){
				ps=new red(ps);
				ps=new green(ps);
				//break;
			}
			else if (a==3){
				ps=new blue(ps);
				ps=new red(ps);
				//break;
			}
			else if (a==4){
				/*ps=new red(ps);
				ps=new blue(ps);
				ps=new green(ps);*/				
				//break;
			}
			/*else{
				System.out.println("Invalid Choice");
				++x;
			}
		}*/
		if (x!=3)
			System.out.println("Type: "+ps.base()+"\nM.R.P.: "+ps.cost());
	}
}