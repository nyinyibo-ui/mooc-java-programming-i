import static org.junit.Assert.*;
import org.junit.Test;


public class ExerciseManagementTest {

    @Test
    public void  exercisetListEmptyAtBeginning(){
        ExerciseManagement management=new ExerciseManagement();
        assertEquals(0,management.exerciseList().size());
}
    
    @Test 
    public void addingExerciseGrowingListByOne(){
        ExerciseManagement management =new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1,management.exerciseList.size());
    }
    
    @Test
    public void testExerciseIsInTheList(){
        ExerciseManagement management=new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test 
    public void execiseCanBeMarkedAsCompleted(){
        ExerciseManagement management=new ExerciseManagement();
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertTrue(management.isCompleted("New Exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        ExerciseManagement management=new ExerciseManagement();
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertFalse(management.isCompleted("Some Exercise"));
    }
}
