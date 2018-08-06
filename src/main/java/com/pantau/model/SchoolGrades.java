package com.pantau.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_grades")
public class SchoolGrades implements Serializable {

	private static final long serialVersionUID = -6543920511642844934L;

	private Integer gradesId;
	private String schoolName;
	private String schoolAddress;
	private int classroom;
	private int semester;
	private String academicYear;
	private String homeroomTeacher;
	private int rank;
	private Integer id;
	private String lessonValue;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "grades_id", unique = true, nullable = false)
	public Integer getGradesId() {
		return this.gradesId;
	}

	public void setGradesId(Integer gradesId) {
		this.gradesId = gradesId;
	}

	@Column(name = "school_name", nullable = false, length = 100)
	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Column(name = "school_address", nullable = false, length = 100)
	public String getSchoolAddress() {
		return this.schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	@Column(name = "classroom", nullable = false)
	public int getClassroom() {
		return this.classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	@Column(name = "semester", nullable = false)
	public int getSemester() {
		return this.semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Column(name = "academic_year", nullable = false, length = 4)
	public String getAcademicYear() {
		return this.academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	@Column(name = "homeroom_teacher", nullable = false, length = 15)
	public String getHomeroomTeacher() {
		return this.homeroomTeacher;
	}

	public void setHomeroomTeacher(String homeroomTeacher) {
		this.homeroomTeacher = homeroomTeacher;
	}

	@Column(name = "rank", nullable = false)
	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "lesson_value", nullable = false, length = 20)
	public String getLessonValue() {
		return this.lessonValue;
	}

	public void setLessonValue(String lessonValue) {
		this.lessonValue = lessonValue;
	}

}
