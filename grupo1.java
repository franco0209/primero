class Calculator {
	//Metodos de la calcualdora
	int add(int a, int b){ return a+b; }
	int sub(int a, int b){ return 0; }
	int mul(int a, int b){ return 0; }
	int div(int a, int b){ return 0; }
	int mod(int a, int b){ return 0; }
	
	//Pruebas
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		System.out.println(c1.add(10,10));
	}
}
