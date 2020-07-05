$("#num").keyup(function() {
	if(this.value.length<1){
		this.value='1';
	}
	if (this.value.length == 1) {
		this.value = this.value.replace(/[^1-9]/g, '')
	} else {
		this.value = this.value.replace(/\D/g, '')
	}
})

$("#num").change(function() {
	let id = $(".id").val();
	let num = this.value;
	$.ajax({
		url : "changprince?num=" + num + "&id=" + id,
		success : function(result) {
			$("#yuan").html(result);
		}
	})
});

$("#num").on('input',function() {
	let id = $(".id").val();
	let num = this.value;
	$.ajax({
		url : "changprince?num=" + num + "&id=" + id,
		success : function(result) {
			$("#yuan").html(result);
		}
	})
});