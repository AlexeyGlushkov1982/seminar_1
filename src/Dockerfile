FROM bellsoft/liberica-openjre-alpine:11.0.16.1-1
COPY ./src ./src
RUN javac -sourcepath ./src -d ./out ./src/main/Main.java
RUN java -classpath ./out main.Main

