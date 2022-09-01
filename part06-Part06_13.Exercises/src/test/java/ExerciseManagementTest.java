
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;

    public void initialize(){
        management = new ExerciseManagement();
    }
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    public void addedExerciseIsInList() {             
        management.add("Write a test");        
        assertTrue(management.exerciseList().contains("Write a test"));    
    }
    
    public void exerciseCanBeMarkedAsCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertTrue(management.isCompleted("New exercise"));
    }
    
    public void ifNotMarkedCompletedIsNotCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertFalse(management.isCompleted("Some exercise"));
    }
}

