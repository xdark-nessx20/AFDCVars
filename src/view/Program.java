package view;

import model.Automaton;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        Automaton afd = new Automaton();
        Icon gifclose = new ImageIcon(Program.class.getResource("/close.gif"));
        while(true){
            String num = JOptionPane.showInputDialog(null,
                    "Type a C Variable identifier/name: \nDon't write if you wanna exit", "AFD C Vars",
                    JOptionPane.QUESTION_MESSAGE);
            if(num == null || num.isBlank()) break;

            String afdAnswer = afd.verifyIdentifier(num);
            processAnswer(afdAnswer);
        }
        JOptionPane.showMessageDialog(null, "Closing... Press OK", "AFD C Vars",
                JOptionPane.PLAIN_MESSAGE, gifclose);

    }

    private static void processAnswer(String answer){
        // abrir el gif correcto
        String fileName = (answer.contains("Valid")) ? "/bien.gif" : "/mal.gif";
        Icon gif = new ImageIcon(Program.class.getResource(fileName));

        JOptionPane.showMessageDialog(null, answer, "AFD Roman Nums", JOptionPane.PLAIN_MESSAGE, gif);
    }




//        //Valid
//        afd.verifyIdentifier("myVar");
//        afd.verifyIdentifier("user_name");
//        afd.verifyIdentifier("_totalValue");
//        afd.verifyIdentifier("counter$");
//        afd.verifyIdentifier("$");
//        afd.verifyIdentifier("wi1pi2");
//        //Invalids
//        System.out.println();
//        //System.out.printf("Unable to open file '%1$s'", "text");
//        afd.verifyIdentifier("@price");
//        afd.verifyIdentifier("my var");
//        afd.verifyIdentifier("123var");
//        afd.verifyIdentifier("void");
//        afd.verifyIdentifier("total-value");
//        afd.verifyIdentifier("x+y");
//        afd.verifyIdentifier("*pointer");
    }
