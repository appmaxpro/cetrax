# Embedded Cetrax
For applications that require an embedded storage solution, for example Agents that require local persistence for 
caching or buffering, the embedded implementation of Cetrax can be used. Embedded Cetrax uses 
[H2](https://www.h2database.com/) for the underlying storage engine.

To use Cetrax embedded in your application, add [this dependency](https://search.maven.org/artifact/io.cetrax/cetrax-h2) 
to the `pom.xml`:
```xml
<dependency>
    <groupId>io.cetrax</groupId>
    <artifactId>cetrax-h2</artifactId>
    <version>${cetrax-h2.version}</version>
</dependency>
```

Here is a sample application:
```java
import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;

import java.io.IOException;

class Example {
    public static void main(String[] args) throws IOException {
        String namespace = "namespace";
        String key = "key";
        byte[] value = "value".getBytes();

        // create an instance of Cetrax on H2 and store the database in the given path
        Cetrax cetrax = new CetraxOnH2("/tmp/example/db");
        
        // create the namespace if not exists
        cetrax.objects().create(namespace);
        // store an object
        cetrax.objects().store(namespace, key, value);
        byte[] returned = cetrax.objects().get(namespace, key);
        
        System.out.println(
                "stored: " + new String(value) + "\n" +
                "retrieved: " + new String(returned)
        );
    }
}
```
