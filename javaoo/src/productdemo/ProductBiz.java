package productdemo;

import javax.swing.JOptionPane;

public class ProductBiz {
	public static void main(String[] args) {
		//��������ÿ����Ʒ������
		int[] counts = new int[3];
		double total =0;//֧�����
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ����");
			product.setName(name);
			//�����û��������Ʒ�ĵ��ۣ�����ֵ���ַ�������
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ���:");
			//��Ҫ���ַ���ת��Ϊdouble����
			//ת��ǰ������֤
			product.setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺�������");
			counts[i] = Integer.parseInt(strCount);
			
			//�ۼ��ܽ��
			total += product.getPrice() * counts[i];
		}
		System.out.println("��Ʒ���ܽ��Ϊ"+total);
	}
}
