package com.epam.rd.autotasks;

public class DecrementingCarousel {
    int capacity;
    int[] values;
    int position;
    int actionLimit;
    private boolean carouselCondition=false;

    public DecrementingCarousel(int capacity) {
        this.capacity=capacity;
        values=new int[this.capacity];
    }

    public boolean addElement(int element){
        if (!carouselCondition && element>0 && position<capacity ) {
            values[position++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        if (carouselCondition)
            return null;
        carouselCondition = true;
        return new CarouselRun(this);
    }
}
