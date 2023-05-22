
import scanner.token.Token;
import semantic.symbol.Symbol;
import semantic.symbol.SymbolTable;
import semantic.symbol.SymbolType;

public class symbolTableInterface {
    private SymbolTable symbolTable;

    public symbolTableInterface(Memory memory) {
        symbolTable = new SymbolTable(memory);
    }

    public addMethod(String className, String methodName, int blockAddress){
        symbolTable.addMethod(className, methodName, blockAddress);
    }

    public getVarType(String className, String methodName, String value){
        Symbol s = symbolTable.get(className, methodName, value);
        varType t = varType.Int;
        switch (s.type) {
            case Bool:
                t = varType.Bool;
                break;
            case Int:
                t = varType.Int;
                break;
        }
        return t;
    }

    public getVarType(String className, String methodName){
        Symbol s = symbolTable.get(className, methodName);
        varType t = varType.Int;
        switch (s.type) {
            case Bool:
                t = varType.Bool;
                break;
            case Int:
                t = varType.Int;
                break;
        }
        return t;
    }

    public int getAddress(String className, String methodName, String value){
        Symbol s = symbolTable.get(className, methodName, value);
        return s.address;
    }

    public int getAddress(String className, String methodName){
        Symbol s = symbolTable.get(className, methodName, value);
        return s.address;
    }

    public Address get(String value){
        return symbolTable.get(value)
    }

    public startCall(String className, String methodName){
        symbolTable.startCall(className, methodName);
    }

    public getNextParam(String className, String methodName){
        symbolTable.getNextParam(className, methodName);
    }

    public varType getMethodReturnType(String className, String methodName){
        if(symbolTable.getMethodReturnType(className, methodName) == Bool){
            return varType.Bood
        }else{
            return varType.Int
        }
    }
    public int getMethodReturnAddress(String className, String methodName) {
        return symbolTable.getMethodReturnAddress(className, methodName)
    }

    public int getMethodCallerAddress(String className, String methodName) {
        return symbolTable.getMethodCallerAddress(className, methodName)
    }

    public int getMethodAddress(String className, String methodName) {
        return symbolTable.getMethodAddress(className, methodName)
    }

    public int getMethodAddress(String className, String methodName) {
        return symbolTable.getMethodAddress(className, methodName)
    }

}