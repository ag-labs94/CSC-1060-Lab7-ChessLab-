public class Main {

    public static void main(String[] args) throws Exception {

        //String fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
        FenFileReader fenFileReader = new FenFileReader();
        String[] fens = fenFileReader.readFenFile("resources/chess_positions.fen");

        for(int i = 0; i < fens.length; i++) {
            String fen = fens[i];
            System.out.println(fen);

            Board board = new Board(fen);
            board.print();

            System.out.println("Next best move is... ");
            ChessApiClient chessApiClient = new ChessApiClient();
            String bestMove = chessApiClient.callRestAPIForNextMove(fen);
            System.out.println(bestMove);
            Thread.sleep(2000);
        }



    }

}