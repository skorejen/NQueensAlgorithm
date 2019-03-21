package ads.handinTwo;

public class Main {

    public static void main(String[] args) {
        Integer queenNo;
        if(args.length > 0){
        queenNo = Integer.parseInt(args[0]);
        } else {
            queenNo = 12;
        }
        QueenSolver q = new QueenSolver(queenNo);
        long a = System.currentTimeMillis();
        System.out.println(q.getSolutions());
        System.out.println(System.currentTimeMillis()-a);
    }
}
