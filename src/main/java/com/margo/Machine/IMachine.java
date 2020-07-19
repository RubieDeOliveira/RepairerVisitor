package com.margo.Machine;

import com.margo.Repairer.IMachineVisitor;

public interface IMachine {
    void accept(IMachineVisitor visitor);
}
