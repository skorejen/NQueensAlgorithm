package ads.handinTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenSolverTest {

    private QueenSolver q;

    @Test
    void getSolutions_4Queens(){
        q = new QueenSolver(4);
        Assertions.assertEquals(q.getSolutions(),2);
    }
    @Test
    void getSolutions_5Queens(){
        q = new QueenSolver(5);
        Assertions.assertEquals(q.getSolutions(),10);
    }

    @Test
    void getSolutions_6Queens(){
        q = new QueenSolver(6);
        Assertions.assertEquals(q.getSolutions(),4);
    }

    @Test
    void getSolutions_7Queens(){
        q = new QueenSolver(7);
        Assertions.assertEquals(q.getSolutions(),40);
    }

    @Test
    void getSolutions_8Queens(){
        q = new QueenSolver(8);
        Assertions.assertEquals(q.getSolutions(),92);
    }

    @Test
    void getSolutions_9Queens(){
        q = new QueenSolver(9);
        Assertions.assertEquals(q.getSolutions(),352);
    }

    @Test
    void getSolutions_10Queens(){
        q = new QueenSolver(10);
        Assertions.assertEquals(q.getSolutions(),724);
    }

    @Test
    void getSolutions_11Queens(){
        q = new QueenSolver(11);
        Assertions.assertEquals(q.getSolutions(),2680);
    }

    @Test
    void getSolutions_12Queens(){
        q = new QueenSolver(12);
        Assertions.assertEquals(q.getSolutions(),14200);
    }





}