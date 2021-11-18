package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FourForm;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textWelcome = Text.of(FourForm.TEXT_WELCOME).viewedBy(actor).asString();
        if (question.equals((textWelcome))){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
