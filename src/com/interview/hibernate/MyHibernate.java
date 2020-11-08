package com.interview.hibernate;

/*
 * The Hibernate lifecycle contains the following states: -

    Transient state		:	new Object();
    Persistent state	:	save(), persist(), saveOrUpdate() or update()
    Detached state		:	close(), clear(), evict(), detach()
    
    detach to persist : save (), saveOrUpdate(), merge(), lock();
============================================================
 * void persist() 
	return void
	It guarantees that it will not execute an INSERT statement if it is called outside of transaction boundaries. 
	
Serializable save()
	return Serializable 
	method does not guarantee the same, it returns an identifier, and if an INSERT has to be executed to get the 
	identifier (like "identity" generator), this INSERT happens immediately, no matter if you are inside or outside 
	of a transaction.



 * --------------------------------------
 * Difference between Get and Load method
 * --------------------------------------
 *  1 .The main difference between get() vs load() method is that get() involves database hit 
 *  if an object doesn't exist in Session Cache and returns a fully initialized object which may 
 *  involve several database calls while load method can return proxy in place and only initialize the object 
 *  or hit the database if any method other than getId() is called on object.
 *  
 *  2. Database hit
 *  Get method always hit the database while load() method may not always hit the database, depending 
 *  upon which method is called.
 *  
 *  3. get() return null if object is not found whereas load() throws ObjectNotFoundException()
 *  
 * --------------- 
 * Optimistic Lock
 * ---------------
 * 
 * 1. Optimistic lock is used to ensure that data stays consistent between concurrent reads and updates.
 * 2. In order to use optimistic locking, we need to have an entity including a property with @Version annotation. 
 * 3. While using it, each transaction that reads data holds the value of the version property.
 * 	  Before the transaction wants to make an update, it checks the version property again.
 * 4. If the value has changed in the meantime an OptimisticLockException is thrown. 
 *    Otherwise, the transaction commits the update and increments a value version property.
 *    
 *    -------------------
 *    Pessimistic locking
 *    -------------------
 *    To lock on DB table
 *    List cars = entityManager.createQuery("select c from Car c", Car.class)
                .setLockMode(LockModeType.PESSIMISTIC_WRITE)
                .getResultList();
 */
//@Entity
class Student {

	int id;

	// @Version
	private Integer version;

	// getter & setter
}

public class MyHibernate {

}
