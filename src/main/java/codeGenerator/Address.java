package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public varType varType;


    public Address(int num, varType varType) {
        this.num = num;
        this.varType = varType;
    }

    public String toString() {
        return num + "";
    }
}


public IndirectAddress extends Address {
    @Override
    public String toString() {
        return "@" + num;
    }
}


public ImidiateAddress extends Address {
    @Override
    public String toString() {
        return "#" + num;
    }
}
