# helloworld-demo

javac -cp ./src/main/java ./src/main/java/*.java ./src/main/java/**/*.java -d ./out/
jar cvfm Executable.jar ./src/main/resources/META-INF/MANIFEST.MF -C ./out/ .
cp Executable.jar /tmp 
