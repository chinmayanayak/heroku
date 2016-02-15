package test_java;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.att.tta.model.GridRowDataModel;

/*
 * company is the base controller
 */
@Controller
@RequestMapping("/company")
public class Company {
	
	/*
	 * compaydetails is the rest api which perform the operation based on option
	 * 1 - create new company
	 * 2 - get list of company
	 * 3 - get details of company
	 * 4- update company
	 * 5 - add beneficiary
	 * 
	 * RETURN - CompanyModel
	 * Company model will contain all getter and setter methods and will be populated from data source
	 * along with that a status field will be added for failure and success
	 */
	@RequestMapping(value = "/companydetails", method = RequestMethod.POST)
	public @ResponseBody CompanyModel getDashboardData(@RequestParam(required=true) String option,
			@RequestParam(required=true)  companyID,
			@RequestParam(required=true)  name,
			@RequestParam(required=true)  address,
			@RequestParam(required=true)  city,
			@RequestParam(required=true)  country,
			@RequestParam(required=false)  email,
			@RequestParam(required=false)  phNum,
			@RequestParam(required=false)  beneficiaryOwners
  ) 
	{
		int optiopn = Integer.parseInt(option);
		switch(option){
		case 1:
			// perform operation for create a new company
			break;
		case 2:
			// get list of all companies
			break;
		case 3:
			// perform about get details of comapny
			break;
		case 4:
			// perform operation for update a company
			break;
		case 5:
			// perform operation to beneficiary to company
			break;
		default:
			new CompanyModel().setStatus("failue");
		}
		
		
	}

	
}
