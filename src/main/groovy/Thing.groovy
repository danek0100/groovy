
// An Abstract class can't be instantiated, but it
// can contain fields, and abstract or concrete met
abstract class Thing{
    public String name;
    public Thing() {}

    def getInfo(){
        println("The things name is ${name}");
    }
}