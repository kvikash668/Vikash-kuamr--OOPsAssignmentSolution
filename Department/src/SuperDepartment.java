
//public class SuperDepartment {
////	private String DepartmentName;
////	private String TodaysWork;
////	private String WorkDeadline;
////	private String IsTodayAHoliday;
//
//public String getDepartmentName() {
//		return DepartmentName;
//	}
//	public void setDepartmentName(String departmentName) {
//		this.DepartmentName = departmentName;
//	}
//	public String getTodaysWork() {
//		return TodaysWork;
//	}
//	public void setTodaysWork(String todaysWork) {
//		TodaysWork = todaysWork;
//	}
//	public String getWorkDeadline() {
//		return WorkDeadline;
//	}
//	public void setWorkDeadline(String workDeadline) {
//		WorkDeadline = workDeadline;
//	}
//
//	public String getIsTodayAHoliday() {
//		return IsTodayAHoliday;
//	}
//	public void setIsTodayAHoliday(String isTodayAHoliday) {
//		this.IsTodayAHoliday = isTodayAHoliday;
//	}
//}
//class AdminDepartment extends SuperDepartment {
//	
//	}
//	
//class HrDepartment extends SuperDepartment {
//	private String DoActivity;
//
//	public String getDoActivity() {
//		return DoActivity;
//	}
//
//	public void setDoActivity(String doActivity) {
//		DoActivity = doActivity;
//	}
//	
//	
//}
//class TechDepartment extends SuperDepartment {
//	private String TechStackInformation;
//
//	public String getTechStackInformation() {
//		return TechStackInformation;
//	}
//
//	public void setTechStackInformation(String techStackInformation) {
//		TechStackInformation = techStackInformation;
//	}
//	
//	
//	
//}

public class SuperDepartment {
	String departmentName = "\n Welcome to Super Department" ;
	
	public String departmentName() {
		
	     return departmentName;
   }
	String getTodaysWork = "\n No work as of now";
	public String getTodaysWork() {	
	  return getTodaysWork;
	  
     }
	String getWorkDeadline = "\n Complete by EOD";
	public String getWorkDeadline() {		
		
		return getWorkDeadline;
		}
	String getIsTodayAHoliday = "\n Today is not a holiday";
	
	public String getIsTodayAHoliday() {
		
		return getIsTodayAHoliday;
   }
}

class AdminDepartment extends SuperDepartment {
	
String departmentName = "\n Welcome to Admin Department" ;
	
	public String departmentName() {
		
	     return departmentName;
   }
	String getTodaysWork = "\n Complete your documents Submission";
	public String getTodaysWork() {	
	  return getTodaysWork;
	  
     }
	String getWorkDeadline = "\n Complete by EOD";
	public String getWorkDeadline() {		
		
		return getWorkDeadline;
		}
	
	
}
	
class HrDepartment extends SuperDepartment {
String departmentName = "\n Welcome to Hr Department" ;
	
	public String departmentName() {
		
	     return departmentName;
   }
	String getTodaysWork = "\n Fill today’s timesheet and mark your attendance";
	public String getTodaysWork() {	
	  return getTodaysWork;
	  
     }
	String getWorkDeadline = "\n Complete by EOD";
	public String getWorkDeadline() {		
		
		return getWorkDeadline;
		}

           String doActivity = "\n team Lunch";
	
	          public String doActivity() {
		
		            return doActivity;
	
         }
}

class TechDepartment extends SuperDepartment {
String departmentName = "\n Welcome to Tech Department" ;
	
	public String departmentName() {
		
	     return departmentName;
   }
	String getTodaysWork = "\n Complete coding of module 1";
	public String getTodaysWork() {	
	  return getTodaysWork;
	  
     }
	
	String getWorkDeadline = "\n Complete by EOD";
	public String getWorkDeadline() {		
		
		return getWorkDeadline;
		}

           String getTechStackInformation = "\n Core java";
	
	          public String getTechStackInformation() {
		
		            return getTechStackInformation;
	
         }
}
	