
    function checkParams() {
        var lname = $('#lastName').val();
        var fname = $('#firstName').val();
        var mname = $('#middleName').val();

        if(lname.length != 0 &amp;&amp; fname.length != 0 &amp;&amp; mname.length != 0) {
            $('#del').removeAttr('disabled');
        } else {
            $('#del').attr('disabled', 'disabled');
        }
    }

