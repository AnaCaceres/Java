public abstract class Component {
    private final ComponentName name;
    private final ComponentType type;

    public Component(final ComponentName name, sinal ComponentType type){
        this.name = name;
        this.type = type;
    }

    @Override 
    public String toString(){
        return name + " " + type;
    }
    
    public void println(){
        System.out.println(toString());
    }
}