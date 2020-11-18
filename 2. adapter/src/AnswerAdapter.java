import java.util.ArrayList;
import java.util.Arrays;

public class AnswerAdapter implements AdapterInterface {
    AnswerInterface answer;

    public AnswerAdapter(AnswerInterface val){
        this.answer = val;
    }

    @Override
    public boolean request() {
        return this.answer.answer();
    }
}
