package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Create a Job object with just ID
        Job testJob = new Job();
        // Get the string representation using the toString method
        String expected = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(expected, testJob.toString());
    }



    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual = testJob.toString();
        assertTrue(actual.contains("ID: " + testJob.getId()));
        assertTrue(actual.contains("Name: Product tester"));
        assertTrue(actual.contains("Employer: ACME"));
        assertTrue(actual.contains("Location: Desert"));
        assertTrue(actual.contains("Position Type: Quality control"));
        assertTrue(actual.contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job();
        String actual = testJob.toString();
        assertTrue(actual.contains("Name: Data not available"));
        assertTrue(actual.contains("Employer: Data not available"));
        assertTrue(actual.contains("Location: Data not available"));
        assertTrue(actual.contains("Position Type: Data not available"));
        assertTrue(actual.contains("Core Competency: Data not available"));
    }


}

