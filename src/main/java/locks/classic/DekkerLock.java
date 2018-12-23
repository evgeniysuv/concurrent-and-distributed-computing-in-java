package locks.classic;

/**
 * Created by esuv on 12/23/18
 * <p>
 * http://garryowen.csisdmz.ul.ie/~cs4023/resources/oth9.pdf
 */
public class DekkerLock {

    private boolean t1WantsToEnter = false;
    private boolean t2WantsToEnter = false;
    private int favoredThreadId = 1;

    public void lockT1() {
        t1WantsToEnter = true;
        while (t2WantsToEnter) {
            if (favoredThreadId == 2) {
                t1WantsToEnter = false;
                while (favoredThreadId == 2) ; //busy wait
                t1WantsToEnter = true;
            }
        }
        //critical section
        favoredThreadId = 2;
        t1WantsToEnter = false;
    }

    public void lockT2() {
        t2WantsToEnter = true;
        while (t1WantsToEnter) {
            if (favoredThreadId == 1) {
                t2WantsToEnter = false;
                while (favoredThreadId == 1) ; //busy wait
                t2WantsToEnter = true;
            }
        }
        //critical section
        favoredThreadId = 1;
        t2WantsToEnter = false;
    }
}
