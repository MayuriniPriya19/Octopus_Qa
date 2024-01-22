package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScatterChart {
	
private WebDriver driver;
	
	public ScatterChart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NavigateToScatterChart() {
		
		//////---Draft-----///////
		try {
			Thread.sleep(15000);
			driver.findElement(By.id("octopusDataCanvas")).click();
			driver.get("https://qa.bi-octopus.com/reports/draft");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	/////--SearchReport--------/////
		try {
			Thread.sleep(10000);
			
			WebElement SearchReport = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			SearchReport.click();
			SearchReport.sendKeys("Scatter_Chart_Test");
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	////-----Click Edit Button-----/////////
		try {
			// Delay
	        Thread.sleep(5000); // (5 seconds)
	        System.out.println("Click on edit icon...");
	        // Wait for the edit button to be clickable
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        System.out.println("Waiting for the button to be clickable...");
	        // Edit button
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-icon-only ant-btn-background-ghost']/i[@class='anticon anticon-edit']")
	        ));
	        
	     // button.click();
	        System.out.println("Button is clickable.");

	     // JavascriptExecutor to click the button
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", button);
	        System.out.println("Clicked the button.");
	        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	/////------------Add Area Chart-------/////////
		try {
			// Delay
	        Thread.sleep(15000); // (5 seconds)
	        System.out.println("Click on edit icon...");
	        // Wait for the edit button to be clickable
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        System.out.println("Waiting for the button to be clickable...");
	        // Edit button
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//img[contains(@alt, 'SCATTER') and contains(@src, 'data:image/svg+xml,')]")
	        ));
//	        button.click();
	        System.out.println("Button is clickable.");

	     // JavascriptExecutor to click the button
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", button);
	        System.out.println("Clicked the button.");
	              
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Find the element by id using XPath
	    WebElement chartElement = driver.findElement(By.xpath("//*[@id='19549']"));
	    
	    // Perform a right-click using Actions class
	    Actions actions = new Actions(driver);
	    actions.contextClick(chartElement).build().perform();
	    System.out.println("Right clicks on the chart");
	    
	///////-------Configuration---------////////// 
	    try {
			// Delay
	        Thread.sleep(25000); // (5 seconds)
	        System.out.println("Click on edit icon...");
	        // Wait for the edit button to be clickable
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        System.out.println("Waiting for the button to be clickable...");
	        // Edit button
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//li[@class='ant-dropdown-menu-item' and @role='menuitem' and text()='Configurations']")
	        ));
	     //button.click();
	        System.out.println("Button is clickable.");

	     // JavascriptExecutor to click the button
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", button);
	        System.out.println("Clicked the button."); 
	    
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	//////-----------Select Model------------/////////
	    try {
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[@class='ant-select-selection__placeholder' and text()='Select a model']")).click();
			
			// Finding the input field using XPath
		     WebElement searchInput1 = driver.findElement(By.xpath("//div[@class='modelSelectBox']"));

		     // Create an Actions object
		     Actions actions1 = new Actions(driver);

		     // Double click on the search input field
		     actions1.doubleClick(searchInput1).perform();

		     // Type the text "filter test 2"
		     actions1.sendKeys("Mayu_demo6").perform();
		     WebElement dropdownItem = driver.findElement(By.xpath("//li[contains(text(),'Mayu_demo6')]"));
		     dropdownItem.click();
		     Thread.sleep(10000);
		     driver.findElement(By.xpath("//div[@class='ant-menu-submenu-title' and span[text()='Student_Copy']]")).click();
		     
		  // Locate the source element (element to be dragged)- x axis
		     WebElement draggableElement = driver.findElement(By.xpath("//li[@class='ant-menu-item' and contains(., 'student name')]"));
		     
		  // Locate the target element (element to drop onto)
		     WebElement droppableElement = driver.findElement(By.id("xAxis"));
		     
		     
		  // Perform drag-and-drop- x axis
		     actions.dragAndDrop(draggableElement, droppableElement).perform();
		     System.out.println("dd");
		     
		  // Locate the source element (element to be dragged)- y axis
		     WebElement draggableElement1 = driver.findElement(By.xpath("//li[@class='ant-menu-item' and contains(., 'marks')]"));
		     
		  // Locate the target element (element to drop onto)
		     WebElement droppableElement1 = driver.findElement(By.id("yAxis"));
		     
		  // Perform drag-and-drop- y axis
		     actions.dragAndDrop(draggableElement1, droppableElement1).perform();
		     System.out.println("nn");
		     
		     Thread.sleep(5000);
		  // Locate the source element (element to be dragged)- filters axis
		     WebElement draggableElement2 = driver.findElement(By.xpath("//li[@class='ant-menu-item' and contains(., 'subject')]"));
		     
		  // Locate the target element (element to drop onto)
		     WebElement droppableElement2 = driver.findElement(By.id("filters"));
		     
		  // Perform drag-and-drop- filters axis
		     actions.dragAndDrop(draggableElement2, droppableElement2).perform();	
		     System.out.println("aa");
		     
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	/////------Save------------/////////////
	    
	    //try {
	  	//Thread.sleep(5000);
	     //driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg' and span[text()='Save']]")).click();
	     //System.out.println("Save the Report test test");
	  //} catch (InterruptedException e) {
	  	 //TODO Auto-generated catch block
	  	//e.printStackTrace();
	  //}
	    
//////////////////-----------------Formatting-------------------------------------------//////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    try {
	    	Thread.sleep(5000);
	    	WebElement activeTab = driver.findElement(By.xpath("//div[@role='tab' and @aria-disabled='false' and @aria-selected='false']"));
	    	activeTab.click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////------------Title-------------/////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[@id='titleText']")).clear();
	    	driver.findElement(By.xpath("//input[@id='titleText']")).sendKeys("Scatter Chart Test");

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    /////-----------Font Family-------////////////////////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@class='ant-select-selection-selected-value' and @title='Open Sans']")).click();

	    	driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item' and text()='Montserrat']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }


	    //////////----------Font Size---------///////////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@class='ant-select-selection-selected-value' and @title='20px' and contains(@style, 'display: block; opacity: 1;')]")).click();

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item' and text()='24px']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////////----------- Clear Bold-------------////

	    try {
	    	
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@id='fontWeight']")).click();
	    	
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////-----------Bold----------/////////////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@id='fontWeight']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////////////-----------Italic-------------////////////////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@id='fontStyle']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////////////-----------UnderLine-------------////////////////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@id='textDecoration']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////////------FontColor-------------///////////////////

	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@class='ant-btn colorButton']")).click();

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@class='saturation-black']")).click();

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary' and span='Add']")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ///////////-------Text Align-------/////

	    try {

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//label[@class='ant-radio-button-wrapper' and span/input[@type='radio' and @value='center']]")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
	    
//////////////////-----------------Conditional Formatting-------------------------------------------//////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    try {
	    	Thread.sleep(5000);
	    	WebElement activeTab = driver.findElement(By.xpath("//div[@role='tab' and @aria-disabled='false' and @aria-selected='false' and contains(@class, 'ant-tabs-tab') and text()='Conditional Formattings']"));
	    	activeTab.click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////////--------Add Button-------////////

	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector(".ant-collapse-content-box > div > .ant-btn")).click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    /////////-----------Input Value-------//////
	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[@class='ant-input' and @placeholder='Value' and @type='text' and @value='']")).sendKeys("5");
			
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    ////-------------Conditional Color--------/////////////

	    //try {
	    	//Thread.sleep(5000);
	    	//driver.findElement(By.xpath("//button[@class='ant-btn colorButton' and normalize-space(span)='#CCCCCC']")).click();

	    	//Thread.sleep(10000);
	    	//driver.findElement(By.xpath("//div[@class='saturation-black']")).click();

	    	//Thread.sleep(5000);
	    	//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary' and span='Add']")).click();

	    	//Thread.sleep(5000);
	    	//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary' and span='Apply']")).click();

	    //} catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	//e.printStackTrace();
	    //}

	    /////-------Save---------//////////
	    //try {
		//Thread.sleep(5000);
	    //driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg' and span[text()='Save']]")).click();
	    //System.out.println("Save the Report test test");
	    //} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	    
///////////////////////////-------------------------Advanced-------------------------////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@role='tab' and @aria-disabled='false' and @aria-selected='false' and contains(@class, 'ant-tabs-tab') and text()='Advanced']"))
	    	.click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

////--------Switch button-------------///////

	    try {
	    	Thread.sleep(5000);
	    	WebDriverWait wait = new WebDriverWait(driver, 15);
	    	WebElement toggleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[3]/div[4]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/button")));
	    	// Click on the toggle button
	    	toggleButton.click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    try {
	    	Thread.sleep(5000);

	    	WebElement SearchReport = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
	    	SearchReport.click();
	    	SearchReport.sendKeys("SH 609");

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary' and span='Select']"))
	    	.click();

	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[@type='radio' and @class='ant-radio-input' and @value='filter_mapping']"))
	    	.click();


	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }

	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[contains(@class, 'ant-btn-primary') and .//span[text()='Add']]"))
	    	.click();
	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
	    
	  
		
		
	}
}
