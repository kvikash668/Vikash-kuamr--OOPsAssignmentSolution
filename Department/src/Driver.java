
public class Driver {

	public static void main(String[] args) {
//		AdminDepartment obj1 = new AdminDepartment();
//		obj1.setDepartmentName("\n\n Welcome to Admin Department");
//		obj1.setTodaysWork("\n Complete your documents Submission");
//		obj1.setWorkDeadline("\n Complete by EOD");
//		obj1.setIsTodayAHoliday("\n Today is not a holiday");
//		System.out.println(obj1.getDepartmentName()+ obj1.getTodaysWork() +obj1.getWorkDeadline()+ obj1.getIsTodayAHoliday() );
//		
//		HrDepartment obj2 = new HrDepartment();
//		obj2.setDepartmentName("\n Welcome to Hr Department");
//		obj2.setTodaysWork("\n Fill today’s timesheet and mark your attendance");
//		obj2.setWorkDeadline("\n Complete by EOD");
//		obj2.setDoActivity("\n team Lunch");
//		obj2.setIsTodayAHoliday("\n Today is not a holiday");
//		
//		System.out.println(obj2.getDepartmentName()+ obj2.getDoActivity()+ obj2.getTodaysWork() +obj2.getWorkDeadline() + obj2.getIsTodayAHoliday());
//		
//		TechDepartment obj3 = new TechDepartment();
//		obj3.setDepartmentName("\n Welcome to Tech Department");
//		obj3.setTodaysWork("\n Complete coding of module 1");
//		obj3.setWorkDeadline("\n Complete by EOD");
//		obj3.setIsTodayAHoliday("\n Today is not a holiday");
//		obj3.setTechStackInformation("\n core Java");
//		System.out.println(obj3.getDepartmentName() + obj3.getTodaysWork() +obj3.getWorkDeadline()+ obj3.getTechStackInformation()+ obj3.getIsTodayAHoliday());
//		
		SuperDepartment obj = new SuperDepartment();
		obj.departmentName();
		obj.getTodaysWork();
		obj.getWorkDeadline();
		obj.getIsTodayAHoliday();
		
		System.out.println(obj.departmentName()+ obj.getTodaysWork() +obj.getWorkDeadline()+ obj.getIsTodayAHoliday() );
		
		
		
		AdminDepartment obj1 = new AdminDepartment();
		obj1.departmentName();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		obj1.getIsTodayAHoliday();
		System.out.println(obj1.departmentName()+ obj1.getTodaysWork() +obj1.getWorkDeadline()+ obj1.getIsTodayAHoliday() );
		
		HrDepartment obj2 = new HrDepartment();
		obj2.departmentName();
		obj2.getTodaysWork();
		obj2.doActivity();
		obj2.getWorkDeadline();
		obj2.getIsTodayAHoliday();
		System.out.println(obj2.departmentName()+ obj2.doActivity()+ obj2.getTodaysWork() +obj2.getWorkDeadline() + obj2.getIsTodayAHoliday());
		
		TechDepartment obj3 = new TechDepartment();
		obj3.departmentName();
		obj3.getTodaysWork();
		obj3.getWorkDeadline();
		obj3.getTechStackInformation();
		obj3.getIsTodayAHoliday();
		
		System.out.println(obj3.departmentName() + obj3.getTodaysWork() +obj3.getWorkDeadline()+ obj3.getTechStackInformation()+ obj3.getIsTodayAHoliday());
		
		
		
		
		
		
	}


	}


