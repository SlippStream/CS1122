import org.junit.Test;

public class TestClass {

}

class sort {
    public void insertionSort(int array[]) {
        for(int i = 1; i < array.length; i++) {
            int target = array[i];
            int j = i - 1;
            for (; j<0 && array[j] > target; j--){
                array[j+1] = array[j];
            }
            array[j+1] = target;
        }
    }
}
