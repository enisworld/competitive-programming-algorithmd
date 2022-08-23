/**
 * <pre>İkili üs alma işlemi
 * 		- Bir sayının üssü alınacağı zaman, üs değerinin ikili sayı formatına çevirerek üs alınması düşünülmüştür.
 * 		  Örnek:
 * 			soru: 3 sayısının 13. kuvvetini alınız.
 * 			çözüm: ilk olarak üs değeri olan 13'ü ikili formata çevirelim.
 * 					13 = (1101)
 * 					3^13 = 3^8 * 3^4 * 3^1
 * 					şeklinde parçalara ayırarak üs alma işlemi yapılır.
 * 		Problemi aşağıdaki formatta genelleyebiliriz.
 * 		a^n sayısı için; 
 * 
 *  			{ 1     		if n==0
 * 		a^n =	{ a^(n/2)^2		if n > 0 ve n çift sayı
 *			{ (a^((n-1)/2)^2)*a	if n > 0 ve n tek sayı
 *  </pre>
 * @author enisamuk
 *
 */
public class BinaryExponentiation {
	/**
	 * Bu metot, çözüm için recursive fonksiyon kullanılarak yazılmıştır.
	 * @param number
	 * @param pow
	 * @return
	 */
	public long binaryPowRecursive(long number, long pow) {
		if (pow == 0) {
			return 1;
		}
		long result = binaryPowRecursive(number, pow/2);
		
		if (pow%2 == 1) {
			return result*result*number;
		}
		else {
			return result*result;
		}
	}
	
	/**
	 * Bu metot girilen ilk parametredeki sayinin ikinci parametreye göre üs alma işlemini yapmaktadır.
	 * @param number	-	Üssü alınacak sayi
	 * @param pow		-	Üs
	 * @return
	 */
	public long binaryPow(long number, long pow) {
		long result = 1;
		while (pow>0) {
			if (((pow & 1)) == 1) {
				result = result*number;
			}
			number = number*number;
			pow = pow>>1;
		}
		return result;
	}
	
	/**
	 * Bu metot girilen bir sayının üssü alınırken aynı zamanda "mod"unun alınmasını sağlamak için oluşturulmuştur.
	 * @param number
	 * @param pow
	 * @param modularNum
	 * @return
	 */
	public long binaryPowAndMod(long number, long pow, long modularNum) {
		long result = 1;
		number %= modularNum;
		while (pow>0) {
			if (((pow & 1)) == 1) {
				result = result * number % modularNum;
			}
			number = number * number % modularNum;
			pow = pow>>1;
		}
		
		return result;
	}
}
