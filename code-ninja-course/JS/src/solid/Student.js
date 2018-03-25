class Student {
	
	constructor(_emailAddress, _universityID) {
			this.universityID = _universityID;
			this.emailAddress = _emailAddress;
		}
	
	getEmailAddress() {
		throw "Not Implemented";
	}
	
	getUniversityID() {
		throw "Not Implemented";}
	
	getMonthlyEbookAllowance(){
		throw "Not Implemented";
	}
	
	getCurrentlyBorrowedEbooks() {
		throw "Not Implemented";
	}
	setMonthlyEbookAllowance(allowence) {
		throw "Not Implemented";
	}
	
	setCurrentlyBorrowedEbooks(books){
		throw "Not Implemented";
	}

}
