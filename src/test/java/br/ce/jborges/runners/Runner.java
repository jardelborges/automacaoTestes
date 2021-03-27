package br.ce.jborges.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/realizar_login.feature",
		snippets = SnippetType.CAMELCASE,
		plugin = "pretty",
		glue = "br.ce.jborges.steps",
		monochrome = true,
		dryRun = false
		)

public class Runner {

}
