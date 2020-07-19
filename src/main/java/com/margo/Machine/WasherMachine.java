package com.margo.Machine;

import com.margo.Repairer.IMachineVisitor;

public class WasherMachine implements IMachine{
    private String name;
    /*private int capacity;
    private int tourPerMinute;*/

    public WasherMachine(){
        this.name = "washer machine";
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IMachineVisitor visitor) {
        visitor.visit(this);
    }
}
