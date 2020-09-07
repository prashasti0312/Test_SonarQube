Created a Continuous Integration pipeline using Eclipse, GitHub, Jenkins, Maven and SonarQube.
Basically, the process goes as follows:
1. Code is pushed to GitHub directly from  Eclipse.
2. As soon as Jenkins finds changes in the source code repository, it fetches the new code.
3. Maven creates the build.
4. Then it is passed to SonarQube for code quality analysis.
