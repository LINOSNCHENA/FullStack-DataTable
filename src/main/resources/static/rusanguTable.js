$(document).ready( function () {
	 var table = $('#bank1').DataTable({
			"sAjaxSource": "/rusangu",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"   },
		          { "mData": "name" },
				  { "mData": "post" },
				  { "mData": "dept" 	},
				  { "mData": "salary"   },
				  { "mData": "status"   },
				  { "mData": "createdt" }
			]
	 })
});