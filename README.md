# IridiumColorAPI

```xml
<repository>
    <id>pvpcraft-cz</id>
    <url>https://repo.pvpcraft.cz/releases/</url>
</repository>
```
```xml
<dependency>
    <groupId>com.iridium</groupId>
    <artifactId>IridiumColorAPI</artifactId>
    <version>1.0.7</version>
</dependency>
```
# Usage
To add a gradient simply use the <GRADIENT> tags
```java
IridiumColorAPI.process("<GRADIENT:2C08BA>Cool string with a gradient</GRADIENT:028A97>");
```
![Gradient Text](https://i.imgur.com/M1l5OM9.png)

The number after the rainbow represents the saturation
```java
IridiumColorAPI.process("<RAINBOW1>THIS IS A REALLY COOL Rainbow</RAINBOW>");
```

![Rainbow](https://i.imgur.com/5GhSFo1.png)

```java
IridiumColorAPI.process("<RAINBOW100>THIS IS A REALLY COOL Rainbow</RAINBOW>");
```
![Rainbow](https://i.imgur.com/Rieftuz.png)
```java
IridiumColorAPI.process("<SOLID:FF0080>Cool RGB SUPPORT");
```
![RGB Text](https://i.imgur.com/IudqIpb.png)

If your server version is pre 1.16 it will map the color to the nearest supported value(This also works with gradient)
In the example above, it will map to &5 as this is the closest

![Legacy RGB](https://i.imgur.com/8RMmCAX.png)
