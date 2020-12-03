import chainofresponsibilitypattern.*;
import tools.PrintTool;

public class ChainOfReponsibilityTest {
    public static void Main() {
        PrintTool.print("Scenario:You can ask the guides questions, and they will try to help you.if he can not solve your question, then he will let his colleague to help you.");
        // new some guides
        GuideMan tom=new UselessGuideMan("Tom");
        GuideMan bob=new GateGuideMan("Bob");
        GuideMan dick=new GoodGuideMan("Dick");
        GuideMan patrick=new FoodGuideMan("patrick");
        //make the chain
        tom.setNextGuide(bob).setNextGuide(patrick).setNextGuide(dick);

        //let guides solve questions
        PrintTool.print("Scenario: here comes a little girl and she asks a question");
        Question question1=new Question("Where is the gate?");
        tom.trySolveQuestion(question1.getQuestion());

        PrintTool.print("Scenario: here comes a little boy and she asks a question");
        Question question2=new Question("Where can I eat some food?");
        tom.trySolveQuestion(question2.getQuestion());
    }
}
