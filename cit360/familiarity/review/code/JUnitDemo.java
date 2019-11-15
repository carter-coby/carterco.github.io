/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code;

import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Objects;

/**
 *
 * @author cobyc
 */
public class JUnitDemo {
    private String testString;
    private int testInt;
    private int[] list = new int[5];

    //I have to override the hashCode and the equals methods
    //Or assertSame() will break.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.testString);
        hash = 23 * hash + this.testInt;
        hash = 23 * hash + Arrays.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JUnitDemo other = (JUnitDemo) obj;
        if (this.testInt != other.testInt) {
            return false;
        }
        if (!Objects.equals(this.testString, other.testString)) {
            return false;
        }
        if (!Arrays.equals(this.list, other.list)) {
            return false;
        }
        return true;
    }
    
    JUnitDemo()
    {
        testString = "This is a test string for the JUnit test.";
        testInt = 100;
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
    }
    
    public String getString()
    {
        return testString;
    }
    
    public int getInt()
    {
        return testInt;
    }
    
    public int[] getList()
    {
        return list;
    }
    
    public static void main(String[] args)
    {
        JUnitDemo jUnitDemo = new JUnitDemo();
        System.out.println(jUnitDemo.getString());
        System.out.println(jUnitDemo.getInt());
        System.out.println(jUnitDemo.getList());
    }
}
