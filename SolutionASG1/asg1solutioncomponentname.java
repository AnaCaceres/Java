public final class ComponentName {
    private final String name;

    public ComponentName(final String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}