package in.kanth.services;

public class ServiceObjectFactory {

	public EmployeeService getEmployeeService() {
		return new EmployeeService();
	}

	public ManagerService getManagerService() {
		return new ManagerService();
	}

	public SupportService getSupportService() {
		return new SupportService();
	}

	public CompanyService getCompanyService() {
		return new CompanyService();
	}
	
	public DetailListService getDetailListService(){
		return new DetailListService();
	}
}
