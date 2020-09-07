package com.github.rkurcwald;

public class NumberFun {
	public static long findNextSquare(long sq)
	{
	    long square=(long)Math.sqrt(sq);
	   
	    if(square*square== sq)
	    {
	    	return (long)Math.pow(square+1, 2);
	    }
	    else
	    {
	    	return -1;
	    }
	}
}
