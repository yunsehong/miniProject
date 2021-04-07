package com.kh.mini_Project.model;

import java.io.Serializable;

public class Review implements Serializable{

	private static final long serialVersionUID = -2321097657596400634L;
	private double userScore;
	private String review;
	
	public Review() {}

	public Review(double userScore, String review) {
		super();
		this.userScore = userScore;
		this.review = review;
	}

	public double getUserScore() {
		return userScore;
	}

	public void setUserScore(double userScore) {
		this.userScore = userScore;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		long temp;
		temp = Double.doubleToLongBits(userScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (Double.doubleToLongBits(userScore) != Double.doubleToLongBits(other.userScore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [userScore=" + userScore + ", review=" + review + "]";
	}
	
	
}
