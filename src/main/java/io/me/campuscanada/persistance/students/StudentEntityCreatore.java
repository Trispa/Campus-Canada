/**
* Campus Canada
*/
package io.me.campuscanada.persistance.students;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;

/**
 * A snippet for Google Cloud Datastore showing how to create an entity.
 */

public class StudentEntityCreatore {
    public StudentEntityCreatore() {
		
	}
	Datastore datastore = DatastoreOptions.defaultInstance().service();
    public Entity  createStudentEntityCreatore (StudentEntity studentEntity){
    	KeyFactory keyFactory = datastore.newKeyFactory().kind("Student");
    	String id = Long.toString(studentEntity.Id);
    	Key key = keyFactory.newKey(id);
    	Entity entity = Entity.builder(key)
        .set("email", studentEntity.email)
        .set("authSource", studentEntity.authSource)
        .set("authId", studentEntity.authId)
        .set("firstName", studentEntity.firstName)
        .set("lastName", studentEntity.lastName)
        .set("adress", studentEntity.adress)
        .set("cycle", studentEntity.cycle)
        .set("countryOfResidence", studentEntity.countryOfResidence)
        .build();
     datastore.put(entity);
     return entity;
    }
  }
