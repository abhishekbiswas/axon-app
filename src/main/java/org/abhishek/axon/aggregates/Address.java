package org.abhishek.axon.aggregates;

/**
 * Created by abhishek on 10/03/15.
 */
public class Address {

    private String flatNo;
    private String appartment;

    public Address(String flatNo, String appartment){
        this.flatNo = flatNo;
        this.appartment = appartment;
    }

    @Override
    public String toString(){
        return ("{" + flatNo + ", " + appartment + "}");
    }

    public String getFlatNo() {
        return flatNo;
    }

    public String getAppartment() {
        return appartment;
    }
}
