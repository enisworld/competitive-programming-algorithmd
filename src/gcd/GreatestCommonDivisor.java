/**
 * Bu sinif iki sayının en büyük ortak bölenini bulmak için oluşturulmustur.
 * 	En büyük ortak böleni bulmak için aşağıdaki yöntemler kullanılmıştır.
 * 		1- Öklid Algoritması
 * 		2- 
 * 
 * @author eamuk
 *
 */
public class GreatestCommonDivisor {
	
	/**
	 * Öklid algoritmasına göre en büyük ortak böleni bulması için oluşturulmuş bir metottur.
	 * 
	 * 	Adımlar
	 * 		1- Bu algoritmaya göre sayılardan biri 0 olana kadar küçük sayı büyük sayıdan çıkartılır
	 * 		2- Recursive bir şekilde bu devam eder. Fonksiyona en son giren sayılardan biri 0 olduktan sonra diğer sayı en büyük ortak bölendir.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int gcd (int a, int b) {
	    if (b == 0)
	        return a;
	    else
	        return gcd (b, a % b);
	}
	/**
	 * En büyük ortak kat aşağıdaki formül ile hesaplanır.
	 * 
	 * 	LCM(a,b) = (a * b)/GCD(a,b)
	 * @return
	 */
	public int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	
	
	
	public int binaryGCD (int a, int b) {
		if (b == 0)
			return a;
		else if ((a%2) != 0 && (b%2) == 0 )
	        return gcd (b, a % b);
		else if((a%2) == 0 || (b%2) != 0)
	        return gcd (a,b);
		else
			System.out.println("ELSE");
			return 0;
	}
