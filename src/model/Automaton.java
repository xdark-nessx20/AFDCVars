package model;

import static model.Language.KEYWORDS;

public class Automaton {
    private State currentState;

    public Automaton() {
        this.currentState = State.INI;
    }

    public void verifyIdentifier(String identifier){
        try{
            if(isKeyword(identifier)) throw new Exception();

            for(int i = 0; i < identifier.length(); i++){
                char  c = identifier.charAt(i);
                currentState = currentState.nextState(c);
                if(currentState == State.ERROR) throw new Exception();
            }
            System.out.printf("'%s' is a valid identifier\n", identifier);
        } catch (Exception e) {
            System.out.printf("'%s' is an invalid identifier\n", identifier);
        } finally {
            currentState = State.getInitialState();
        }
    }

    private boolean isKeyword(String varName){
        return KEYWORDS.contains(varName);
    }
}
