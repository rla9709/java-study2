package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++ ) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("토지", "박경리");
		library[3] = new Book("악의", "히가시노 게이고");
		library[4] = new Book("그리고 아무도 없었다", "아가사 크리스티");
	
		for(int i = 0; i < library.length; i++ ) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++ ) {
			library[i].showBookInfo();
		}
	}

}
