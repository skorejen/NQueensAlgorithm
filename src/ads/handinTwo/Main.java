package ads.handinTwo;

public class Main {

    public static void main(String[] args) {
        Integer queenNo;
        if(args.length > 0){
        queenNo = Integer.parseInt(args[0]);
        } else {
            queenNo = 5;
        }
        QueenSolver q = new QueenSolver(queenNo);
        System.out.println(q.getSolutions());
    }
}
