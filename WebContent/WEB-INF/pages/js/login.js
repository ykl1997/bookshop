$()
{
	$(".singup").hide();
	$("#tologin").click(function() {
		$(".login").show();
		$(".singup").hide();
		$("#tologin").css("background", "rgba(240, 240, 240, 0.4)");
		$("#tosignup").css("background", "rgba(3, 3, 3, 0.4)");

	})

	$("#tosignup").click(function() {
		$(".singup").show();
		$(".login").hide();
		$("#tosignup").css("background", "rgba(240, 240, 240, 0.4)");
		$("#tologin").css("background", "rgba(3, 3, 3, 0.4)");
	});

	$("#username").blur(function() {
		let username = this.value;
		$.ajax({
			url : "checksignup?username=" + username,
			contentType : 'text/json,charset=utf-8',
			success : function(result) {
				$("#exist").html(decodeURI(result));
			}
		})
	});

}
