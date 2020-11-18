import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        Boolean ans1 = false;
        AdapterInterface answer;

        switch (reader.readLine()) {
            case "Yep" -> {
                Yep adaptee = new Yep();
                answer = new AnswerAdapter(adaptee);
            } case "Yes" -> {
                Yes adaptee = new Yes();
                answer = new AnswerAdapter(adaptee);
            }
            case "True" -> {
                True adaptee = new True();
                answer = new AnswerAdapter(adaptee);
            }
            case "Oh yeah" -> {
                OhYeah adaptee = new OhYeah();
                answer = new AnswerAdapter(adaptee);
            }
            case "Great" -> {
                Great adaptee = new Great();
                answer = new AnswerAdapter(adaptee);
            }
            case "Sure" -> {
                Sure adaptee = new Sure();
                answer = new AnswerAdapter(adaptee);
            }
            case "Love to" -> {
                LoveTo adaptee = new LoveTo();
                answer = new AnswerAdapter(adaptee);
            }
            case "Of course" -> {
                OfCourse adaptee = new OfCourse();
                answer = new AnswerAdapter(adaptee);
            }
            case "Always" -> {
                Always adaptee = new Always();
                answer = new AnswerAdapter(adaptee);
            }
            case "Never done otherwise" -> {
                NeverDoneOtherwise adaptee = new NeverDoneOtherwise();
                answer = new AnswerAdapter(adaptee);
            }
            default -> {
                writer.write("1");
                False adaptee = new False();
                answer = new AnswerAdapter(adaptee);
            }
        }

        ans1 = answer.request();

        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}