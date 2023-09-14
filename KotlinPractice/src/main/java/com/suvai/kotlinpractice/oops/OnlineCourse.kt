package com.suvai.kotlin_practice.oops

class OnlineCourse(val courseName: String, val lecturer: String) { // primary constructor
    var courseTopic = "Not decided yet."//"Android application development course with Vaibhav"

    constructor(courseName: String, lecturer: String, courseTopic: String) : this(
        courseName,
        lecturer
    ) {// secondary constructor
        this.courseTopic = courseTopic
    }

}