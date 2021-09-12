package TestBase;

import Pages.*;

public class PageInitializer extends BaseClass {

    protected static LoginPageElements login;
    protected static DashboardPageElements dash;
    protected static AddEmployeePageElements addEmp;
    protected static PimPageElements pimPage;
    protected static PersonalDetailsPageElements persDetails;

    public static void initializePageObjects(){
    login= new LoginPageElements();
    dash=new DashboardPageElements();
    addEmp= new AddEmployeePageElements();
    pimPage= new PimPageElements();
    persDetails= new PersonalDetailsPageElements();

    }
}
