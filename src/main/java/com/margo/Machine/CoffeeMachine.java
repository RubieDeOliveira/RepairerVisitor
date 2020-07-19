package com.margo.Machine;

import com.margo.Repairer.IMachineVisitor;

public class CoffeeMachine implements IMachine{
    private String name;
    /*private Double capacity;
    private String brand;
    private String type;*/

    public CoffeeMachine(){
        this.name = "coffee machine";
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IMachineVisitor visitor) {
        visitor.visit(this);
    }
}
