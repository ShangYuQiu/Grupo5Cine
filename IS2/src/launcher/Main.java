package launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import control.Controller;

public class Main {

	private static String _inFile = null;
	//private static String _outFile = null;
	
	private static void parseArgs(String[] args) {
		
		Options cmdLineOptions = buildOptions();
		CommandLineParser parser = new DefaultParser();
		
		try {
			CommandLine line = parser.parse(cmdLineOptions, args);
			parseInFileOption(line);
			
			
			
			String[] remaining = line.getArgs();
			if (remaining.length > 0) {
				String error = "Illegal arguments:";
				for (String o : remaining)
					error += (" " + o);
				throw new ParseException(error);
			}
		}
		catch (ParseException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(1);
		}
	}
	
	private static Options buildOptions() {
		
		Options cmdLineOptions = new Options();
		
		cmdLineOptions.addOption(Option.builder("i").longOpt("input").hasArg().desc("Events input file").build());
		return cmdLineOptions;
	}
	
	private static void parseInFileOption(CommandLine line) throws ParseException {
		_inFile = line.getOptionValue("i");
		if (_inFile == null) {
			throw new ParseException("An events file is missing");
		}
	}
	
	private static void cargar() throws IOException {
		InputStream is = new FileInputStream(new File(_inFile));
		Controller controller = new Controller();
		
		controller.load(is);
		}
	
	private static void start(String[] args) throws IOException {
		parseArgs(args);
		cargar();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			start(args);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
