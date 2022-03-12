package launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import control.Controller;
import factory.Builder;
import factory.BuilderBasedFactory;
import factory.Factory;
import factory.NewFilmBuilder;
import cine.model.*;

public class Main {

	private static String _inFile = null;
	//private static String _outFile = null;
	private static Factory<Event> _eventsFactory = null;
	
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
		
		Cine cine = new Cine();
		
		InputStream is = new FileInputStream(new File(_inFile));
		Controller controller = new Controller(cine, _eventsFactory, new Scanner(System.in));
		
		controller.load(is);
		controller.run();
		}
	
	private static void initFactories() {
		
		ArrayList<Builder<Event>> ebs = new ArrayList<>();
		ebs.add(new NewFilmBuilder());
		
		_eventsFactory = new BuilderBasedFactory<Event>(ebs);
	}
	
	private static void start(String[] args) throws IOException {
		initFactories();
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
