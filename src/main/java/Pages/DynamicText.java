package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicText {
	
private WebDriver driver;
	
	public DynamicText(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NavigateToDynamicText() {
		
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
			SearchReport.sendKeys("Dynamic_Text_Test");
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
		
	/////------------Add Dynamic Text-------/////////
		try {
			// Delay
	        Thread.sleep(15000); // (5 seconds)
	        System.out.println("Click on edit icon...");
	        // Wait for the edit button to be clickable
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        System.out.println("Waiting for the button to be clickable...");
	        // Edit button
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//img[@alt='DYNAMIC_TEXT']")
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
		
		////////--------Right clicks on the chart------//////////
		try {
			Thread.sleep(5000);
			// Find the element by id using XPath
		    WebElement chartElement = driver.findElement(By.xpath("//*[@id='19608']"));
		    
		    // Perform a right-click using Actions class
		    Actions actions = new Actions(driver);
		    actions.contextClick(chartElement).build().perform();
		    System.out.println("Right clicks on the chart");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
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
	    
	    //////////----------SendTex---------/////////
	    try {
	    	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable' and @contenteditable='true']")).sendKeys("Testing Demo");
			Thread.sleep(5000);
			
			//driver.findElement(By.xpath("//button[@class='se-btn _se_command_bold se-tooltip'][@data-command='bold'][@tabindex='-1']")).click();
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	/////-------------SelectAll---------/////////////////////
	    try {
	    	
			Thread.sleep(5000);
			
			WebElement paragraphElement = driver.findElement(By.cssSelector(".se-wrapper-wysiwyg > p"));
			paragraphElement.sendKeys(Keys.CONTROL + "a");
			
			//Actions actions = new Actions(driver);
			//actions.contextClick(paragraphElement).perform();
			
	/////---------Bold-----------//////////
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='se-btn _se_command_bold se-tooltip'][@data-command='bold'][@tabindex='-1']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='button' and contains(@class, 'se-btn') and contains(@class, '_se_command_bold') and contains(@class, 'se-tooltip') and @data-command='bold']")).click();
			
	/////////--------Italic-------///////////
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, '_se_command_italic')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, '_se_command_italic')]")).click();
			
	///////////----------Underline-------///////////
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, '_se_command_underline')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, '_se_command_underline')]")).click();
			
	/////////----fontsize---------//////////////////
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, 'se-btn-select') and contains(@class, 'se-btn-tool-size')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li/button[@class='se-btn-list' and @data-value='18px' and @title='18px' and @style='font-size:18px;']")).click();
		    	  
	////////---FontAlin----------///////////////
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[.//button[@class='se-btn se-btn-align se-tooltip' and @data-command='align' and @data-display='submenu' and @tabindex='-1']]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[.//button[@class='se-btn-list se-btn-align' and @data-value='center' and @title='Align center']]")).click();
			
	////////---FontList----------///////////////
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[.//button[@class='se-btn se-tooltip' and @data-command='list' and @data-display='submenu' and @tabindex='-1']]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[.//button[@class='se-btn-list se-tooltip' and @data-command='UL' and @title='Unordered list']]")).click();
				
	//////////----FontFamily----------///////////	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[button[@class='se-btn se-btn-select se-btn-tool-font se-tooltip' and @data-command='font' and @data-display='submenu' and @tabindex='-1']]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[button[@type='button' and @class='se-btn-list' and @data-value='Arial' and @data-txt='Arial' and @title='Arial' and @style='font-family:Arial;']]")).click();
						
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
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
	         
	      // Locate the source element (element to be dragged)- y axis
	         WebElement draggableElement1 = driver.findElement(By.xpath("//li[@class='ant-menu-item' and contains(., 'marks')]"));
	         
	      // Locate the target element (element to drop onto)
	         WebElement droppableElement1 = driver.findElement(By.id("dynamicYAxis"));
	         
	      // Perform drag-and-drop- y axis
	         actions1.dragAndDrop(draggableElement1, droppableElement1).perform();
	         System.out.println("nn");
	         
	    	} catch (InterruptedException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    	}
	    
	    /////-----------Copy & Past-------////////
	    try {
	    	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='button' and contains(@class, 'ant-btn copy-button ant-btn-link') and i[@aria-label='icon: copy']]")).click();
			WebElement paragraphElement = driver.findElement(By.xpath("//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable' and @contenteditable='true']"));
			paragraphElement.sendKeys(Keys.CONTROL + "v");
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   //////////--------CodeViewButton------///////////
	    try {
	    	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, 'se-code-view-enabled') and contains(@class, '_se_command_codeView')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(@class, 'se-btn') and contains(@class, 'se-code-view-enabled') and contains(@class, '_se_command_codeView')]")).click();
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    /////////-------Preview button------///////////
	    try {
	    	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='button' and @role='switch' and @aria-checked='false' and contains(@class, 'show-prev-switch')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='button' and @role='switch' and @aria-checked='true' and contains(@class, 'show-prev-switch')]")).click();
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    
////////////////////////////////---------------------Formatting------------------------/////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    try {
			Thread.sleep(5000);
			WebElement activeTab = driver.findElement(By.xpath("//div[@role='tab' and @aria-disabled='false' and @aria-selected='false']"));
		    activeTab.click();
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    ////////////--------shadow--------///////////////
	    try {
			Thread.sleep(5000);
			WebElement activeTab = driver.findElement(By.xpath("//div[contains(@class, 'ant-slider') and contains(@class, 'ant-slider-with-marks')]"));
		    activeTab.click();
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
////////////--------Transparency--------///////////////
    try {
		Thread.sleep(5000);
		
		WebElement activeTab = driver.findElement(By.xpath("(//div[@class='ant-slider-step'])[34]"));
	    activeTab.click();
		
		//String modifiedSelector = ":nth-child(1) > :nth-child(2) > .ant-form-item > .ant-form-item-control-wrapper > .ant-form-item-control > .ant-form-item-children > .ant-row > .ant-col > .ant-slider > .ant-slider-handle";
		//WebElement modifiedElement = activeTab.findElement(By.cssSelector(modifiedSelector));
		//activeTap.click();
			
		//WebElement activeTab = driver.findElement(By.cssSelector(modifiedSelector));
	    //activeTab.click();
	} catch (InterruptedException e) {
		 //TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
	//////////----------Background Color-----------///////////  
	    try {
			Thread.sleep(5000);
			WebElement activeTab = driver.findElement(By.xpath("//button[contains(@class, 'ant-btn') and contains(@class, 'colorButton') and @style='width: 100%; text-transform: uppercase;']"));
		    activeTab.click();
		    
		    Thread.sleep(2000);
		    WebElement activeTab1 = driver.findElement(By.xpath("//div[@title=\"#BD10E0\" and @tabindex=\"0\" and contains(@style, 'background: rgb(189, 16, 224);')]"));
		    activeTab1.click();
		    
		    Thread.sleep(2000);
		    WebElement activeTab2 = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary\" and @type=\"button\" and @style=\"float: right;\"]"));
		    activeTab2.click();
		    	    
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 /////////////------Border Width  //////// 
	    //try {
			//Thread.sleep(5000);
			
			//WebElement activeTab = driver.findElement(By.cssSelector("div.ant-slider-handle[role=\"slider\"][aria-valuemin=\"0\"][aria-valuemax=\"50\"][aria-valuenow=\"8\"][aria-disabled=\"false\"][style=\"left: 16%; right: auto; transform: translateX(-50%);\"]"));
		    //activeTab.click();

			
			//WebElement activeTab2 = driver.findElement(By.xpath("//div[@class=\"ant-slider-handle\" and @role=\"slider\" and @aria-valuemin=\"0\" and @aria-valuemax=\"50\" and @aria-valuenow=\"8\" and @aria-disabled=\"false\" and @style=\"left: 16%; right: auto; transform: translateX(-50%);\"]"));
		    //activeTab2.click();
				    
		//} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	    
	    
////////////--------Border Radius--------///////////////
    //try {
		//Thread.sleep(5000);
		//WebElement activeTab = driver.findElement(By.xpath("//div[@class=\"ant-slider-handle\" and @role=\"slider\" and @aria-valuemin=\"0\" and @aria-valuemax=\"50\" and @aria-valuenow=\"16\" and @aria-disabled=\"false\" and @style=\"left: 32%; right: auto; transform: translateX(-50%);\"]"));
	    //activeTab.click();
	//} catch (InterruptedException e) {
		 //TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	    
//////////----------Border Color-----------///////////  
  //try {
		//Thread.sleep(5000);
		//WebElement activeTab = driver.findElement(By.xpath("//button[@class='ant-btn colorButton']/div[@class='colorPick' and @style='background-color: rgb(0, 0, 0);']/following-sibling::span[text()='#000000']"));
	    //activeTab.click();
	    
	    //Thread.sleep(2000);
	    //WebElement activeTab1 = driver.findElement(By.xpath("//div[@title=\"#BD10E0\" and @tabindex=\"0\" and contains(@style, 'background: rgb(189, 16, 224);')]"));
	    //activeTab1.click();
	    
	    //Thread.sleep(2000);
	    //WebElement activeTab2 = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary\" and @type=\"button\" and @style=\"float: right;\"]"));
	    //activeTab2.click();
	    	    
	//} catch (InterruptedException e) {
		 //TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	    
////////////-----Background Image----------//////////
	    
	    //try {
			//Thread.sleep(5000);
			
			//WebElement activeTab = driver.findElement(By.xpath("//div[@class='dynamicImagePicker']"));
		    //activeTab.click();
			
		//} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	    
/////////-------Preview button------///////////
	    try {
	    	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='button' and @role='switch' and @aria-checked='false' and contains(@class, 'show-prev-switch')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='button' and @role='switch' and @aria-checked='true' and contains(@class, 'show-prev-switch')]")).click();
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
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

	    try {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//div[@class='ant-collapse-header' and contains(@aria-expanded, 'false') and contains(., 'Custom CSS')]")).click();

	    } catch (InterruptedException e) {
	    	//TODO Auto-generated catch block
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

	}
}
