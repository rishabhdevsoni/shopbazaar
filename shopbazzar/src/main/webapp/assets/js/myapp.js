$(function(){
	//solving the active menu problem
	switch(menu)
	{
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact us':
		$('#contact').addClass('active');
		break;
	case 'listProducts':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
	});
	