$(document).ready(function () {
	console.log("X=============START-The_JavaScript_JQuery_function===========X")
	var table = $('#banklist').DataTable({
		"sAjaxSource": "/rusangu",
		"processing": true,
		// "serverSide": true,
		"pageLength": 7,
		"sAjaxDataProp": "",
		"order": [[0, "asc"]],
		"aoColumns": [
			{ "mData": "id" },
			{ "mData": "name" },
			{ "mData": "mobile" },
			{ "mData": "office" },
			{ "mData": "stars" },
			{ "mData": "stars" },
			{ "mData": "createdt" }
		]
	})
	console.log("Z===========================END-2020===========================Z")
});