
public class TypeMain {

	public static void main(String[] args) {
		
		// 1. 문자열 합치기
		String number = "letter";
		String name = "number";
		
		// 1-1. concat 사용
		String result1 = number.concat(name);
		System.out.println(result1);
		
		// 1-2. + 사용
		String result2 = number+name;
		System.out.println(result2);
		
		// 1-3. 문자+인덱스+문자+인덱스로 합치기 
		for (int i=1; i<4; i++) {
			String resultNumber = name+i;
			String resultName = number+i; 
			System.out.println(resultNumber+"/"+resultName);
		}
		
		// 2. 문자 -> 정수 형 변환
		String str1 = "0";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1 + 2); // 2
		
		// 3. 정수 -> 문자 형 변환 
		int num2 = 0;
		String str2 = Integer.toString(num2);
		System.out.println(str2 + 2); // 02

	}

}
