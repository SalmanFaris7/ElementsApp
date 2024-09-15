/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class Node {
    private String synonym;
    private String name;
    private String origin;
    private int period;
    
    public Node leftChild;
    public Node rightChild;

    public Node(String synonym, String name, String origin, int period) {
        this.synonym = synonym;
        this.name = name;
        this.origin = origin;
        this.period = period;
    }

    public String getSynonym() {
        return synonym;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPeriod() {
        return period;
    }
    
    
}
