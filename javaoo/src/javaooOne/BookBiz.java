package javaooOne;

public class BookBiz {
	public int sellBook(Book book) {
		//1�жϿ���Ƿ����1
		//2ͼ��Ŀ��-1
		//3������������
		if(!(book.getCount()>1)) {
			return -1;
		}
		book.setCount(book.getCount()-1);
		return 1;
	}
}
