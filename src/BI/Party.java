package BI;

import java.util.ArrayList;

public class Party {
	private ArrayList<Candidate> candidates=new ArrayList<Candidate>();
	private int noOfvotes;
	public Party(ArrayList<Candidate> candidates, int noOfvotes) {
		super();
		this.candidates = candidates;
		this.noOfvotes = noOfvotes;
	}
	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}
	public int getNoOfvotes() {
		return noOfvotes;
	}
	public void setNoOfvotes(int noOfvotes) {
		this.noOfvotes = noOfvotes;
	}
	

}
