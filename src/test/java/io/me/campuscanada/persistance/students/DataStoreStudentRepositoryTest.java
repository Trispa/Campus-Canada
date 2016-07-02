//package io.me.campuscanada.persistance.students;
//
//import static org.junit.Assert.*;
//
//
//
//import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
//import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
//import com.google.cloud.datastore.Datastore;
//import com.google.cloud.datastore.DatastoreOptions;
//import com.google.cloud.datastore.Key;
//import com.google.cloud.datastore.KeyFactory;
//
//import io.me.campuscanada.domain.students.Student;
//import io.me.campuscanada.persistance.transformers.StudentDTOTransformer;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//@RunWith(MockitoJUnitRunner.class)
//public class DataStoreStudentRepositoryTest {
//	
//	@Mock
//	private StudentDTOTransformer transformer;
//	@Mock
//	private Student student;
//	@Mock
//	Datastore datastore;
//	private DataStoreServices dataStoreServices = new DataStoreServices(datastore);
//	private DataStoreStudentRepository dataStoreStudentRepository;
//	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
//	
//	@Before
//	public void setUp(){
//		datastore = DatastoreOptions.defaultInstance().service();  
//		dataStoreStudentRepository = new  DataStoreStudentRepository(transformer, dataStoreServices, datastore);
//		helper.setUp();
//	}
//	
//	@After
//	public void tearDown(){
//		helper.tearDown();
//	}
//	@Test
//	public void givenAStudentIdWhenFindByIdShouldReturnTheRightStudentWithTheGoodId() {
//		dataStoreStudentRepository.addStudent(student);
//		KeyFactory keyFactory = datastore.newKeyFactory().kind("student");
//		String id = Long.toString(student.getStudentId().id);
//    	Key key = keyFactory.newKey(id);
//		assertTrue( datastore.get(key).equals(student));
//		
//	}
//	
////	@Test
////	public void givenAkindAndAKeyWhenLoadEntityFromDataBaseShouldReturnTheExpectedKind() {
////		fail("Not yet implemented");
////	}
////	@Test
////	public void givenAstudentWhenAddStudentShoulAddTheStudentEntityInDatabase() {
////		fail("Not yet implemented");
////	}
////	@Test
////	public void givenAstudentWhenRemoveStudentShouldRemoveTheGivenStudentFromeDatabase() {
////		fail("Not yet implemented");
////	}
//}
