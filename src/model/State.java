package model;

import static model.Language.NUMBERS;
import static model.Language.NOT_ALLOWED_DELIMITERS;

public enum State {
    INI(false),
    OK(true),
    ERROR(false);

    private final boolean acceptationState;

    State(boolean acceptationState) {
        this.acceptationState = acceptationState;
    }

    public boolean isAcceptationState() {
        return acceptationState;
    }

    public static State getInitialState() {
        return INI;
    }

    public State nextState(char c) {
        return switch (this){
            case INI -> (NUMBERS.contains(c) || NOT_ALLOWED_DELIMITERS.contains(c))? ERROR: OK;
            case OK -> (NOT_ALLOWED_DELIMITERS.contains(c))? ERROR: OK;
            default -> ERROR;
        };
    }



}
