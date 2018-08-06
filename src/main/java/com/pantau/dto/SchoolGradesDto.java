package com.pantau.dto;

public class SchoolGradesDto {

	private String schoolName;
	private String schoolAddress;
	private int classroom;
	private int semester;
	private String academicYear;
	private String homeroomTeacher;
	private int rank;
	private Integer id;
	private String lessonValue;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getHomeroomTeacher() {
		return homeroomTeacher;
	}

	public void setHomeroomTeacher(String homeroomTeacher) {
		this.homeroomTeacher = homeroomTeacher;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLessonValue() {
		return lessonValue;
	}

	public void setLessonValue(String lessonValue) {
		this.lessonValue = lessonValue;
	}

}
