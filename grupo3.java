class Calculator {
	//Metodos de la calcualdora
	int add(int a, int b){ return a+b; } //suma 2 enteros
	int sub(int a, int b){ return a-b; } //resta 2 enteros
	int mul(int a, int b){ return a*b; } //multiplica 2 enteros
	int div(int a, int b){ return a/b; } // divide 2 enteros
	int mod(int a, int b){ return a%b; } // halla el modulo de 2 enteros
	

}

 //Pruebas
class grupo3 {
	public static void main(String[] args){
		//Creacion de objeto Calculator
		Calculator c1 = new Calculator();

		//Pruebas de los metodos:
		System.out.println(c1.add(10,10));
		System.out.println(c1.sub(2024,2004));
		
		//Pruebas de los otros metodos:
		System.out.println(c1.mul(10,10));
		System.out.println(c1.div(2024,2004));

		//Prueba del otro metodo:
		System.out.println(c1.mod(2024,2004));
	}
}
