# Transitioning from Java to Kotlin
This is the repository for the LinkedIn Learning course Transitioning from Java to Kotlin. The full course is available from [LinkedIn Learning][lil-course-url].

![Transitioning from Java to Kotlin][lil-thumbnail-url] 

If you’re a web developer, you may be considering a switch from Java to Kotlin. Kotlin is probably best well-known as the language for Android development—it’s concise, flexible, and includes a powerful set of modern language features—but it’s also a great choice for JVM-based web development. In this course, Nate Ebel guides you through the transition from Java to Kotlin for server application development. He starts by exploring Kotlin’s place in the JVM ecosystem, then shows you how to migrate an existing Java-based Spring Boot application to Kotlin. He also shows you how to build a new application using Ktor, a Kotlin-based client/server framework. If you’ve wondered what Kotlin’s features can do for your JVM web development, join Nate in this course.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"


### Instructor

Nate Ebel 
                            


                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/nate-ebel).

[lil-course-url]: https://www.linkedin.com/learning/transitioning-from-java-to-kotlin?dApp=59033956
[lil-thumbnail-url]: https://cdn.lynda.com/course/3080244/3080244-1669145655463-16x9.jpg
