package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public int getId() {
        return id;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // Empty constructor to initialize the id field
    public Job() {
        id = nextId;
        nextId++;
        name = "";
        employer = new Employer("");
        location = new Location("");
        positionType = new PositionType("");
        coreCompetency = new CoreCompetency("");
    }
    // Constructor with 5 parameters
    public Job(String name, Employer employer, Location location,
               PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the empty constructor to initialize id
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // toString method
    @Override
    public String toString() {
        // Start with blank line it separates previous text
        String result = System.lineSeparator();
        // adds _(ie.ID/Name/etc) field label and value then a new line
        result += "ID: " + this.getId() + System.lineSeparator();
        // when empty "Data not available" then new line
        result += "Name: " + (this.getName().isEmpty() ? "Data not available" : this.getName()) + System.lineSeparator();
        result += "Employer: " + (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue()) + System.lineSeparator();
        result += "Location: " + (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue()) + System.lineSeparator();
        result += "Position Type: " + (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue()) + System.lineSeparator();
        result += "Core Competency: " + (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue()) + System.lineSeparator();
        // Add a blank line to end to separate from following text
        // result += System.lineSeparator();

        return result;
    }

//    public String toString() {
//        return System.lineSeparator() +
//                "ID: " + this.getId() + System.lineSeparator() +
//                "Name: Data not available" + System.lineSeparator() +
//                "Employer: Data not available" + System.lineSeparator() +
//                "Location: Data not available" + System.lineSeparator() +
//                "Position Type: Data not available" + System.lineSeparator() +
//                "Core Competency: Data not available" + System.lineSeparator();
//    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        // Check if the object being compared is the same as the current object
        if (this == o) return true;
        // Check if the object being compared is null or belongs to a different class
        if (o == null || getClass() != o.getClass()) return false;
        // Cast the object being compared to a Job object
        Job job = (Job) o;
        // Compare the id of the current object with the id of the object being compared
        return id == job.id;
        //Only need to check for same id. Nothing else. So don't need code below.
        //== job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    //The hashCode method is overridden to generate a hash code based on the id field of the Job class
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}

//
//    @Override // Custom equals() method
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Job job)) return false;
//        Job otherJob = (Job) o;
//        return getId() == otherJob.getId();
//    }
//
//    @Override // Custom hashCode() method
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//    //  and id.
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public PositionType getPositionType() {
//        return positionType;
//    }
//
//    public void setPositionType(PositionType positionType) {
//        this.positionType = positionType;
//    }
//
//    public CoreCompetency getCoreCompetency() {
//        return coreCompetency;
//    }
//
//    public void setCoreCompetency(CoreCompetency coreCompetency) {
//        this.coreCompetency = coreCompetency;
//    }
//
//    public int getId() {
//        return id;
//    }
//
////    @Override
////    public String toString() {
////        // TODO: Implement the toString method
////        // Start with a blank line
////        String result = System.lineSeparator();
////
////        // Add labels and data for each field (you'll need to access the fields here)
////
////        // End with a blank line
////        result += System.lineSeparator();
////
////        return result;
////    }
//}
