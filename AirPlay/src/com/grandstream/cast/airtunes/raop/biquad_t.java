package com.grandstream.cast.airtunes.raop;

/**
 * biquad_t struct
 * @author bencall
 *
 */
public class biquad_t {
	public double[] hist = new double[2];
    public double[] a = new double[2];
    public double[] b = new double[3];
}