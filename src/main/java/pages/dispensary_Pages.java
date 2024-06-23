package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.python.modules.thread.thread;

public class dispensary_Pages extends StartupPage {

	


	String pageName = this.getClass().getSimpleName();
	public dispensary_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		return null;
	}


	/**@Test2
	 * about this method verifyDispensaryModuleIsPresentOrNot() 
	 * @param : null
	 * @description : vverify the Dispensary module is present or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryModuleIsPresentOrNot() throws Exception {
		return null;
	}

	/**@Test3
	 * about this method verifyAllSubModulesArePresentAndClickOnDispensary() 
	 * @param : null
	 * @description : verify all sub-modules are displayed correctly after clicking on the "Dispensary" Module.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
		return null;
	}


	/**@Test4
	 * about this method scrollToButtomAndVerifytheFields() 
	 * @param : null
	 * @description : scroll to the bottom of the "Sale" page and verify that "Print Invoice" button  , "Discard" button  ,"Invoice History" and  "Credit Limitis and Balance" text are peresent or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean scrollToButtomAndVerifytheFields() throws Exception {
		return null;
	}



	/**@Test5
	 * about this method performTheKeyboardOperationToOpenthePopup() 
	 * @param : null
	 * @description : Perform the keyboard operation to open the  popup and verify that the popup is displayed or not.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean performTheKeyboardOperationToOpenthePopup() throws Exception {
		return null;
	}


	/**@Test6
	 * about this method validateErrorMessageInFirstnameTextfield() 
	 * @param : null
	 * @description : Validate the error message in firstname textfield after click on "Ok" button
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateErrorMessageInFirstnameTextfield() throws Exception {
		return null;
	}

	/**@Test7
	 * about this method fillAllTheTextfieldsInsideTheAddNewPatientVerifyTheFirstName() 
	 * @param : Map<String, String>
	 * @description : Fill all the textfields which are present inside the Add New Patient popup. and verify that value is present after enter the values.
	 * @return : String
	 * @author : Yaksha
	 */
	public String fillAllTheTextfieldsInsideTheAddNewPatientVerifyTheFirstName(Map<String, String> expectedData) throws Exception {
		return null;
	}



	/**@Test8
	 * about this method navigateToLastPageOfTheStockDetailsAndFetchTotalStockValue() 
	 * @param : null
	 * @description : Navigate to the Last page of the stock details list pagenation and fetch the total stock value
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean navigateToLastPageOfTheStockDetailsAndFetchTotalStockValue() throws Exception {
		return null;
	}


	/**@Test9
	 * about this method checkMainDispensaryIsSelectedFromFilterStockDropdown() 
	 * @param : null
	 * @description : check "Main Dispensary" is selected from filter stock dropdown and select main store.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean checkMainDispensaryIsSelectedFromFilterStockDropdown() throws Exception {
		return null;
	}


	/**@Test10
	 * about this method validateCreateRequisitionButtonIsPresent() 
	 * @param : null
	 * @description : validate "create requisition" button is present or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean validateCreateRequisitionButtonIsPresent() throws Exception {
		return null;
	}


	/**@Test11
	 * about this method verifyNewItemTextFieldIsPresent() 
	 * @param : null
	 * @description : verify "Item Name" text field is present in "Add Requisition" page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyNewItemTextFieldIsPresent() throws Exception {
		return null;
	}


	/**@Test12
	 * about this method verifyRequisitionDetailsPrintPageIsDisplayed() 
	 * @param : null
	 * @description : verify Requisition Details Print page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean verifyRequisitionDetailsPrintPageIsDisplayed() throws Exception {
		return null;
	}


	/**@Test13
	 * about this method getTheMedicineNameFromRequisitionDetailsPrintPage() 
	 * @param : null
	 * @description : Get the medicine name from the "Requisition Details Print" page
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean getTheMedicineNameFromRequisitionDetailsPrintPage() throws Exception {
		return null;
	}


	/**@Test14
	 * about this method getThePlaceHolderNameOfAddressTextfiled() 
	 * @param : null
	 * @description : Get the place holder name of address textfiled and verify  the place holder name.
	 * @return : String
	 * @author : Yaksha
	 */
	public String getThePlaceHolderNameOfAddressTextfiled(Map<String, String> expectedData) throws Exception {
		return null;
	}


	/**@Test15
	 * about this method closeNewSSUPatientRegistrationPopupByUsingJsExecutor() 
	 * @param : null
	 * @description : Close this "New SSU Patient Registration" popup by using javaScript.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean closeNewSSUPatientRegistrationPopupByUsingJsExecutor() throws Exception {
		return null;
	}

	/**@Test16
	 * about this method verifyToolTipOfAnElement()
	 * @param : null
	 * @description :go to appointmentTab and verify the TOOLTIP value/text
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyToolTipOfAnElement() throws Exception {
		return null;
	}

	/**@Test17
	 * about this method verifyIndiaIsSelectedFromCountryDropdown() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : it will select the country as per json expected data
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyIndiaIsSelectedFromCountryDropdown(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test18
	 * about this method takingScreenshotOfTheCurrentPage() 
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		return null;
	}

	/**@Test19
	 * about this method uploadImageInScannedImagesSection() 
	 * @param : Map<String, String>
	 * @description : Upload a image in Scanned Images section.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean uploadImageInScannedImagesSection(String pathOfTheFile) throws Exception {
		return null;
	}

	/**@Test20
	 * about this method handleAlertPopup()
	 * @param : null
	 * @description : 
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean handleAlertPopup() throws Exception {

		return false;
	}

	/**@Test21
	 * about this method tickAllCheckboxesThenValidateThenUntick() 
	 * @param : null
	 * @description : First, tick all check boxes and validate that the all selected checkboxes are selected or not then untick them then close Add Other Charges.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean handleCheckBox() throws Exception {

		return null;
	}

}
