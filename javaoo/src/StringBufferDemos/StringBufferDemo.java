package StringBufferDemos;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("��ã�");
		StringBuffer strBuffer1 = new StringBuffer("��ã�");
		StringBuffer strBuffer2 = new StringBuffer("��ã�");
		//�ַ�����ת
		System.out.println(strBuffer.reverse());
		//����
		strBuffer.insert(3, "abc");
		System.out.println(strBuffer);
		//ɾ��  [1,2)�±��Ԫ��
		strBuffer.delete(1,2);
		System.out.println(strBuffer);
		//�޸�
		strBuffer1.replace(2, 4, "����");
		System.out.println(strBuffer1);
		
		strBuffer1.setCharAt(3, '��');
		System.out.println(strBuffer1);
		
		System.out.println(strBuffer1.capacity());
		
		//����ַ���
		strBuffer.setLength(0);
		//������
		strBuffer.trimToSize();
		//		final int N = 500000;
//		long startTime = System.currentTimeMillis();
//		String str="*";
//		for (int i = 0; i < N; i++) {
//			str +="*";
//		}
//		long endTime= System.currentTimeMillis();
//		System.out.println("+=��ʱ"+(endTime-startTime)+"����");
//	//ʹ��stringBuffer�����ַ���ƴ��
//	startTime = System.currentTimeMillis();//�õ�ѭ����ʼ��ʱ��
//	StringBuffer str1 = new StringBuffer("*");
//	for (int i = 0; i < N; i++) {
//		str1.append("*");
//	}
//	endTime= System.currentTimeMillis();//�õ�ѭ��������ʱ��
//	System.out.println(endTime-startTime);
//	
//	//stringBuilder
//	startTime = System.currentTimeMillis();//�õ�ѭ����ʼ��ʱ��
//	StringBuilder str2 = new StringBuilder("*");
//	for (int i = 0; i < N; i++) {
//		str2.append("*");
//	}
//	endTime= System.currentTimeMillis();//�õ�ѭ��������ʱ��
//	System.out.println(endTime-startTime);
//	
	}
}
