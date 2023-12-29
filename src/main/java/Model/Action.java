package Model;

public class Action {

    private String action;

    public Action(String action) {
        this.action = action;
    }

    public void doAction() {
        System.out.println(" может выполнить команду " + this.action);
    }

    public String getAction() {
        return action;
    }


}