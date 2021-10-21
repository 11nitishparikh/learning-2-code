package recursion;

public class _09_MazePath {

	public static void main(String[] args) {
		mazePath(0,0,2,2,"");

	}

	private static void mazePath(int curRow, int curCol, int endRow, int endCol,String result) {
		if(curRow == endRow && curCol == endCol){
			System.out.println(result);
			return;
		}
		
		if(curRow > endRow || curCol > endCol){
			return;
		}
		mazePath(curRow,curCol+1,endRow,endCol,result+"H");
		mazePath(curRow+1,curCol,endRow,endCol,result+"V");
	}

}
