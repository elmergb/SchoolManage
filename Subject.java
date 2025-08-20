class Subject {
    String subjectCode;
    String subjectName;
    int units;

    Subject (String subjectCode, String subjectName, int units){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.units = units;
    }

    public String getSubjectCode() { return subjectCode;}
    public String getSubjectName() { return subjectName;}
    public int getUnits() { return units;}

}

