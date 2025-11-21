package com.kuririr.cli;


import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "slug", description = "Buat slug dari teks")
public class SlugCommand implements Runnable {


@Parameters(paramLabel = "TEXT")
private String text;


public void run() {
String slug = text.toLowerCase()
.replaceAll("[^a-z0-9]+", "-")
.replaceAll("^-|-$", "");
System.out.println(slug);
}
}
