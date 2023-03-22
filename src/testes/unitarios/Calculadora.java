package testes.unitarios;

public class Calculadora {
	public int soma(int a, int b){
		int x = 10;
		//codigo para testar @Timeout
//		while(x > 0) {
//			try {
//				Thread.sleep(200);
//				x--;
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
		return a+b;
	}
	
	public int dividir(int a, int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		
		return a/b;
	}
}
