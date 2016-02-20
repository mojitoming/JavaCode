import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {

	public void testSort1() {
		List<Integer> intList = new ArrayList<Integer>();
		// 插入十个100以内的不重复的随机整数
		Random rand = new Random(47);
		int k;
		for (int i = 0; i < 10; i++) {
			do {
				k = rand.nextInt(100);
			} while (intList.contains(k));
			intList.add(k);
			System.out.println("成功添加整数：" + k);
		}
		System.out.println("----------排序前-----------");
		for (Integer integer : intList) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("----------排序后-----------");
		Collections.sort(intList);
		for (Integer integer : intList) {
			System.out.print(integer + " ");
		}
	}

	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("------------排序前---------------");
		for (String string : stringList) {
			System.out.print(string + " ");
		}
		System.out.println();
		Collections.sort(stringList);
		System.out.println("------------排序后---------------");
		for (String string : stringList) {
			System.out.print(string + " ");
		}
	}

	/**
	 * 1.创建完List<String>之后添加10条随机的字符串 
	 * 2.每条字符串的长度为10以内的随机整数
	 * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复 
	 * 4.每条随机生成的字符串不可以重复
	 */
	public void testSort3() {
		List<String> strList = new ArrayList<String>();
		StringBuilder strBuilder;
		String baseStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			do {
				int k = random.nextInt(10) + 1;
				strBuilder = new StringBuilder();
				for (int j = 0; j < k; j++) {
					strBuilder.append(baseStr.charAt(random.nextInt(baseStr
							.length())));
				}
			} while (strList.contains(strBuilder.toString()));
			System.out.println("将要添加字符串：" + strBuilder);
			strList.add(strBuilder.toString());
		}
		System.out.println("----------排序前------------");
		for (String string : strList) {
			System.out.println("元素：" + string);
		}
		System.out.println("----------排序后------------");
		Collections.sort(strList);
		for (String string : strList) {
			System.out.println("元素：" + string);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct = new CollectionTest();
		ct.testSort3();
	}

}
