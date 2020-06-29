$(function(){
    $('#allEmployeesButton').on('click', function(event) {
        $.getJSON("http://localhost:5000/employees/", function(result) {
            $.each(result, function(key, value) {
                var tBodyHtml =+ `
                        <tr>
                            <td>${value.id}</td>
                            <td>${value.name}</td>
                            <td>${value.contract}</td>
                        </tr>`;
              $("#employee-table tbody").append(tBodyHtml);
            });
        });
    });
});