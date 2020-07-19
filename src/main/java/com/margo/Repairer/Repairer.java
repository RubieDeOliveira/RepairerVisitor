package com.margo.Repairer;

import com.margo.Machine.CoffeeMachine;
import com.margo.Machine.WasherMachine;

public class Repairer implements IMachineVisitor {

    public String visit(CoffeeMachine coffeeMachine) {
        String result = "Fixing " + coffeeMachine.getName();
        result += "\nFirst, checking water level\nThen, descaling the machine,\nThen checking if there are broken pieces.\n...\nFix done.";
        return result;
    }

    public String visit(WasherMachine washerMachine) {
        String result = "Fixing " + washerMachine.getName();
        result += "\nChecking filters\nThen, machine drum check,\nThen checking if there are broken pieces.\n...\nFix done.";
        return result;
    }
}
