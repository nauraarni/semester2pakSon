
package modifier;

public class Author {
    
    Person p = new Person();
    
    public Author(){
        //akan terjadi error karema atribut name
        //telah diberikan modifier protected
        p.name = "";
    }
    
}
