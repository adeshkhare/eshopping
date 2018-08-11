$(function() {
	// solving active menu 
	
	switch(menu) {
	
	case 'About Us' :
		$('#about').addClass('active');
		break;
		
	case 'Contacts' :
		$('#contact').addClass('active');
		break;
		
	default :
		$('#home').addClass('active');
		break;
	}
});