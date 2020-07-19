package com.margo.Repairer;

import com.margo.Machine.CoffeeMachine;
import com.margo.Machine.WasherMachine;

public interface IMachineVisitor {
    String visit(CoffeeMachine coffeeMachine);
    String visit(WasherMachine washerMachine);
}
