

/**
 * Campus Canada
 */
package io.me.campuscanada.persistance.students;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
public class DataStoreServices{
	
	private Datastore dataStore = DatastoreOptions.defaultInstance().service();	
	
	public  DataStoreServices(Datastore dataStore){
		this.dataStore = dataStore;
	}
	
	public void  addEntity(Entity E){
		dataStore.add(E);
	}
	
	public Entity getEntity(Key k){
		return dataStore.get(k);
	}	

	public void delete(Key key) {
		dataStore.delete(key);
		
	}
	
	
	
}

