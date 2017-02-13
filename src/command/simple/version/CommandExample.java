package command.simple.version;

/**
 * Created by Clemencio Morales Lucas.
 */
import java.util.*;
public class CommandExample {

    interface Command { void execute(); }

    static class GoalKeeper implements Command {
        public void execute() {
            System.out.println(this.getClass().getSimpleName() + ": Avoid the ball to cross the goal's line");
        }  }

    static class Defender implements Command {
        public void execute() {
            System.out.println(this.getClass().getSimpleName() + ": Stop attackers from the other team");
        }  }

    static class Midfielder implements Command {
        public void execute() {
            System.out.println(this.getClass().getSimpleName() + ": Create game and assist attackers of the team");
        }  }

    static class Attacker implements Command {
        public void execute() {
            System.out.println(this.getClass().getSimpleName() + ": Receive the ball and score");
        }  }

    public static List produceTeam() {
        List queue = new ArrayList();
        queue.add( new GoalKeeper() );
        queue.add( new Defender() );
        queue.add( new Midfielder() );
        queue.add( new Attacker() );
        return queue;
    }

    public static void teamWork( List queue ) {
        for (Iterator it = queue.iterator(); it.hasNext(); )
            ((Command)it.next()).execute();
    }

    public static void main( String[] args ) {
        List queue = produceTeam();
        System.out.println("====TEAM'S MISSION:====");
        teamWork(queue);
    }}
