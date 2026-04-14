public class Main {

    public static void main(String[] args) {

        String fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
        System.out.println(fen);

        Board board = new Board(fen);
        board.print();
        System.out.println();


    }

}