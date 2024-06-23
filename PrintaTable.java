public class PrintaTable{
	public static void main(String[] args){
		//int a = 0;//
		double b = 1;

			System.out.printf("%s%20s%20s%n", "a", "b", "pow(a,b)");

				for(int a = 1; a <= 5; ++a){

					b = b + 1;
					double pow = Math.pow(a, b);

					System.out.printf("%d%20.0f%20.0f%n", a, b, pow);
				}
	}
}