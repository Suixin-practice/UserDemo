package javaooOne;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringDemo {
	public static void main(String[] args) {
		//indexOf��ͷ��ʼ�ж��ַ������Ƿ����ĳ���ַ������������Ӧ������
		String password = "123456abc";
		System.out.println(password.indexOf("2", 0));
		//�ַ�����ȡ��[1,3)����ҿ��Ĺ���
		System.out.println(password.substring(1, 3));
		
		
		
		
		
		
		
		
	}
		//lastIndexOf��ĩβ��ʼ�ж��ַ������Ƿ����ĳ���ַ������������Ӧ������
		//�ж��ַ�����ֻ����һ��С���㣬�����ٵ�һλ�����һλ
//	 public static boolean isDecimal(String str){
//		 boolean isDecimal = true;
//		 for (int i = 0; i < str.length(); i++) {
//			 //charater�෽���ж��ַ������Ƿ�Ϊ���֣���ĸ����Сд���ַ��Ĵ�Сд��ʽ
//			if(!Character.isDigit(str.charAt(i))) {
//				if(str.charAt(i)=='.') {
//					if(isDecimal==0 || i==str.length()-1) {//���С�����ڵ�һλ�����һλ
//						isDecimal= false;
//						break;
//					}
//				}else {
//					isDecimal= false;
//					break;
//				}
//			}
//		}
//		 //�ж�С��������
//		 if(!(str.contains(".")&&str.indexOf('.')==str.lastIndexOf('.'))) {
//			 return false;
//		 }
//		 if(str.indexOf('.')==0 || str.indexOf(".")==str.length()-1) {
//			 
//		 }
//	 }
//		
		
		
		
		
		
		
		
		
//		String value = "1111";
////		value += "222";
//		value = value.concat("3333");//�����ַ���
//		System.out.println(value);
//		String value1 = "Hello world";
//		value1.concat("good");
//		System.out.println(value1);
		
		//trimȥ���ַ�����������Ŀո�
//		Scanner input = new Scanner(System.in);
//		System.out.println("�������û�����");
//		String uNmae = input.nextLine().trim();
//		System.out.println(uNmae);
//		String name = "abcdef";
//		name.toCharArray();
//		System.out.println(name);
//		String a = "abc";
//		String b = "def";
//		String c = a+b;
//		System.out.println(c);
//		//�ַ����ȽϷ�����equals
//		System.out.println("abc".equals(a));
//		//����Ƿ���ĳ���ַ���ͷstartsWith������Ƿ���ĳ���ַ���βendsWith
//		System.out.println("abc".startsWith("ab"));
//		System.out.println("abc".endsWith("d"));
//		//�ж�һ���ַ����Ƿ������һ���ַ���
//		System.out.println("abcdef".contains("a"));
		
}
