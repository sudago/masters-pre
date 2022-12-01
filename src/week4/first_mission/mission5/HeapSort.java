package week4.first_mission.mission5;

public class HeapSort implements Comparable<Integer> {
    HeapSort heapSort = new HeapSort();
    public HeapSort() {}

    public void insertHeap(int n){
        heapSort.insertHeap(n);
    }

    public void printHeap(){
        heapSort.printHeap();
    }

    public int getHeapSize(){
        return heapSort.getHeapSize();
    }
    
    public int deleteHeap(){
        return 0;
    }

    @Override
    public int compareTo(Integer o) {
        
    }
}
