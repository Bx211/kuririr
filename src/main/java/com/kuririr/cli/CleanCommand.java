package com.kuririr.cli;


import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "clean", description = "Hapus simbol dari teks")
public class CleanCommand implements Runnable {


@Parameters(paramLabel = "TEXT")
private String text;


public void run() {
System.out.println(text.replaceAll("[^a-zA-Z0-9 ]+", ""));
}
}
