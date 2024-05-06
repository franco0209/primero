class Calculator {
	//Metodos de la calcualdora
	int add(int a, int b){ return a+b; } //suma 2 enteros
	int sub(int a, int b){ return a-b; } //resta 2 enteros
	int mul(int a, int b){ return 0; }
	int div(int a, int b){ return 0; }
	int mod(int a, int b){ return 0; }
	

}

 //Pruebas
class Grupo1 {
	public static void main(String[] args){
		//Creacion de objeto Calculator
		Calculator c1 = new Calculator();

		//Pruebas de los metodos:
		System.out.println(c1.add(10,10));
		System.out.println(c1.sub(2024,2004));
	}
}
