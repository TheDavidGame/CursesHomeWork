package proModule.home2;

import java.util.HashSet;
import java.util.Set;

public class PowerfulSet<T> {
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2){
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
