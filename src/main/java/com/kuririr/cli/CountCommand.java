package com.kuririr.cli;


import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "count", description = "Hitung jumlah kata")
public class CountCommand implements Runnable {


@Parameters(paramLabel = "TEXT")
private String text;


public void run() {
String[] parts = text.trim().split("\\s+");
System.out.println(parts.length);
}
}
