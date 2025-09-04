package model;

import static model.Language.KEYWORDS;

public class Automaton {
    private State currentState;

    public Automaton() {
        this.currentState = State.INI;
    }

    public String verifyIdentifier(String identifier){
        try{
            if(isKeyword(identifier)) throw new Exception("Invalid Identifier: \"" + identifier + "\" is a keyword");

            for(int i = 0; i < identifier.length(); i++){
                char  c = identifier.charAt(i);
                currentState = currentState.nextState(c);
                if(currentState == State.ERROR) throw new Exception("Invalid symbol detected at char: \"" + c + "\", digit " + (++i));
            }
            return "\"" + identifier + "\" is a Valid Identifier";
        } catch (Exception e) {
            return e.getMessage();
        } finally {
            currentState = State.getInitialState();
        }
    }

    private boolean isKeyword(String varName){
        return KEYWORDS.contains(varName);
    }
}
