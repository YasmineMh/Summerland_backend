package com.summerland.business;

import java.util.ArrayList;

import com.summerland.entities.Owner;

public interface IBusinessOwner {

	ArrayList<Owner> getOwner();

	Owner findById(long id);

}
