package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++ ) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("����", "�ڰ渮");
		library[3] = new Book("����", "�����ó� ���̰�");
		library[4] = new Book("�׸��� �ƹ��� ������", "�ư��� ũ����Ƽ");
	
		for(int i = 0; i < library.length; i++ ) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++ ) {
			library[i].showBookInfo();
		}
	}

}
