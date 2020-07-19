package com.margo;

import com.margo.Machine.CoffeeMachine;
import com.margo.Machine.WasherMachine;
import com.margo.Repairer.Repairer;

public class Main {

    public static void main(String[] args) {
        Repairer repartor = new Repairer();

        System.out.println(repartor.visit(new CoffeeMachine()));
        System.out.println(repartor.visit(new WasherMachine()));
    }
}
