package com.partu.entity;

import org.hibernate.Session;

import com.partu.utility.HibernetConnection;

public class MainEmployee {

	Session session=HibernetConnection.getsession();
}
