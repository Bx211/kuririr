package com.kuririr.cli;


import picocli.CommandLine;
import picocli.CommandLine.Command;


@Command(
name = "kuririr",
subcommands = {CleanCommand.class, SlugCommand.class, CountCommand.class}
)
public class Main implements Runnable {
public static void main(String[] args) {
new CommandLine(new Main()).execute(args);
}


public void run() {
System.out.println("Gunakan subcommand: clean, slug, count");
}
}
