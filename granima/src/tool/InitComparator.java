package tool;

import java.util.Comparator;

import nima.Archetype;


public class InitComparator implements Comparator<Archetype> {
    @Override
    public int compare(Archetype o1, Archetype o2) {
    	Integer i1 = o1.getRolledInit();
		Integer i2 = o2.getRolledInit();
        return i1.compareTo(i2);
    }
}
