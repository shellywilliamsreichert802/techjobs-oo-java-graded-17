package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here
    private Job job1;
    private Job job2;

    @Before
    public void setUp() {
        job1 = new Job();
        job2 = new Job();
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    //Test the Empty Constructor
    @Test
    public void testSettingJobId() {
        assertNotEquals(job1.getId(), job2.getId());
    }

    //***Test the Full Constructor
    private Job testJob;

    @Test
    public void testJobConstructorSetsAllFields() {
        // Check the class and value of each field
        assertTrue(testJob instanceof Job);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    //Test the equals Method
    @Test
    public void testJobsForEquality() {
        // Check if the two jobs are equal
        assertFalse(job1.equals(job2));
    }
}

