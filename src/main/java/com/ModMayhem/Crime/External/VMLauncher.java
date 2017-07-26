package com.ModMayhem.Crime.External;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VMLauncher {
public void RunCommand() {
	ProcessBuilder process = new ProcessBuilder().command("run 'VirtualBox.exe'");
	   process.redirectErrorStream(true);
       try {
		process.start();
	} catch (IOException e) {
		e.printStackTrace();
	}
       ProcessBuilder process2 = new ProcessBuilder().command("run 'VirtualBox.exe'");
	   process2.redirectErrorStream(true);
       try {
		process2.start();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

