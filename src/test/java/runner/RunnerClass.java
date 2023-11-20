package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;                      // NOTE- stepNotifications = true; ---> this will show steps in j unit
import io.cucumber.junit.CucumberOptions;               // NOTE- strict = true; monochrome=true;

@RunWith(Cucumber.class)

  //@CucumberOptions(features="featureFiles/OpenGoogle.feature",glue="stepDefinitions")  // this is for OpenGoogle.feature file

  
  //  @CucumberOptions(   stepNotifications = true ,features="featureFiles/Orange.feature",glue="stepDefinitions")  // this is for Orange.feature file.

   
 //    @CucumberOptions(   stepNotifications = true ,features="featureFiles/RegularExprssion.feature",glue="stepDefinitions") // this for regular expression file

// @CucumberOptions(   stepNotifications = true ,features="featureFiles/LoginwithData.feature",glue="stepDefinitions") // this for login with data file


 // @CucumberOptions(   stepNotifications = true ,features="featureFiles/DatatableWithoutHeader.feature",glue="stepDefinitions") // this is for datatable without header


  /* @CucumberOptions(   stepNotifications = true ,
   						features="featureFiles/DatatableWithHeader.feature",
   						glue="stepDefinitions"
   						) // this for datatable with header  */


  /*   @CucumberOptions(   stepNotifications = true ,
      						features="featureFiles/SendingDataDatatable.feature",
      						glue="stepDefinitions",
      						monochrome=true,
      						dryRun = false,
      						plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"}     						
      						) // this is for SendingDataDatatable    */



			/*		@CucumberOptions(   stepNotifications = true ,
						features="featureFiles",  // this step will have access to all feature file rather than a particular file.
						glue="stepDefinitions",
						monochrome=true,
						dryRun = true,
						plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"} ,   						
						tags="@alpha"  // this step is for single tag
						
					/*	tags=" not @alpha" */ // this step will run features which contains other than alpha tag 
						
					/*	tags = "@alpha or @beta"  */  // this step will run feature which contains either alpha or beta . we can add even more tags
						
					/*	tags = "@alpha and @beta" */  //this step will run features which contains both alpha and beta tag in them . otherwise it will not execute(only two features can be added using <and>. )
						
						
						/*	) */
	
	/*		@CucumberOptions(   stepNotifications = true ,
				features="featureFiles",  // this step will have access to all feature file rather than a particular file.
				glue="stepDefinitions",
				monochrome=true,
				dryRun = false,
				plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"} ,   						
				tags="@Hooks" )
				
				// the CucumberOptions is for - without @Before and @After annotation refer hook / ThanosHooks.class
*/
     
	/*		@CucumberOptions(   stepNotifications = true ,
					features="featureFiles",  // this step will have access to all feature file rather than a particular file.
					glue={"stepDefinitions","hooks"},  // Note- hooks package is glued here
					monochrome=true,
					dryRun = false,
					plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"} ,   						
					tags="@Hooks" )
				//	the above is hooks with - 2 @Before and 2 @After in hooks package   */
	

	/*	  @CucumberOptions(   stepNotifications = true ,
				features="featureFiles",  // this step will have access to all feature file rather than a particular file.
				glue={"stepDefinitions","hooks"},  // Note- hooks package is glued here
				monochrome=true,
				dryRun = false,
				plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"} ,   						
				tags="@taggedhooks" ) */

 
            @CucumberOptions(   stepNotifications = true ,
					features="featureFiles",  // this step will have access to all feature file rather than a particular file.
					glue={"stepDefinitions","hooks"},  // Note- hooks package is glued here
					monochrome=true,
					dryRun = false,
					plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"} ,   						
					tags="@background" )


	public class RunnerClass {
	  
	
	// RunnnerClass should combine both feature file and  step Definitions
	
	// Runner define
}
