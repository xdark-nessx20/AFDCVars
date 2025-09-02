package view;

import model.Automaton;

public class Program {
    public static void main(String[] args) {
        Automaton afd = new Automaton();

        /*
        static{
            UIManager.put("OptionPane.background", Color.decode("#03045E"));
            UIManager.put("Panel.background", Color.decode("#03045E"));
            UIManager.put("OptionPane.messageForeground", Color.decode("#FFFFFF"));
            UIManager.put("Button.background", Color.decode("#00B4D8"));
            UIManager.put("Button.foreground", Color.decode("#FFFFFF"));
        }
         while(true){
            String num = JOptionPane.showInputDialog(null,
                "Type a roman number between I and L: \nDon't write if you wanna exit", "AFD Roman Nums",
                JOptionPane.QUESTION_MESSAGE);
            if(num == null || num.isBlank()) break;

            String afdAnswer = afd.verify(num);
            processAnswer(afdAnswer);
        }
        JOptionPane.showMessageDialog(null, "Closing...", "AFD Roman Nums",
            JOptionPane.WARNING_MESSAGE);

        private static void processAnswer(String answer){
            int messageType = (answer.contains("Valid"))? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(null, answer, "AFD Roman Nums", messageType);
        }


        */

        //Valid
        afd.verifyIdentifier("myVar");
        afd.verifyIdentifier("user_name");
        afd.verifyIdentifier("_totalValue");
        afd.verifyIdentifier("counter$");
        afd.verifyIdentifier("$");
        afd.verifyIdentifier("wi1pi2");
        //Invalids
        System.out.println();
        //System.out.printf("Unable to open file '%1$s'", "text");
        afd.verifyIdentifier("@price");
        afd.verifyIdentifier("my var");
        afd.verifyIdentifier("123var");
        afd.verifyIdentifier("void");
        afd.verifyIdentifier("total-value");
        afd.verifyIdentifier("x+y");
        afd.verifyIdentifier("*pointer");
    }
}
