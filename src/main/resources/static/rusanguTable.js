$(document).ready(function () {
	var table = $('#banklist').DataTable({
		"sAjaxSource": "/rusangu",
		"processing": true,
		"serverSide": true,
		"pageLength": 3,
		"sAjaxDataProp": "",
		"order": [[0, "asc"]],
		"aoColumns": [
			{ "mData": "id" },
			{ "mData": "name" },
			{ "mData": "post" },
			{ "mData": "dept" },
			{ "mData": "salary" },
			{ "mData": "status" },
			{ "mData": "createdt" }
		]
	})
});