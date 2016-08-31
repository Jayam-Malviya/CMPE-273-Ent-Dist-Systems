/**
 *	This file create's local variable inside the function & also global variable to be used outside of this file 
 */

(function(){
	document.write("<br/>Variable.js Starts...");
	function variableDemo(){
		document.write("<br/>variableDemo function method Starts...");
		document.write("<br/>Vehilce Type - "+globalDreamVehicle+"<br/>"); // accessing the global defined+initialized variable
		var carName; // declared uninitialized local varaible
		document.write(carName); // outputs in undefined
		carName = 'Ferrari';
		ferrariPrice = 125000;  // global varaible
		document.write("<br/>  Car - "+carName);
		ferrariTerminator;
		delete this.carName;
		document.write("<br/>variableDemo function method Ends...");
	}
	variableDemo();
	document.write("<br/>  "+ferrariPrice); 
	document.write("<br/> Car name - "+carName); // carName doesnt exist outside the variableDemo function, 
	//because it was locally declared & its existence is only till the fucntion body
	document.write("<br/>Variable.js Ends...");
})();