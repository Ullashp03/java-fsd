var myData = [
    {"dealId" : 0, "client_name" : "Microsoft", "project_name" : "Apollo Project", "project_manager" : "Mary", "project_cost" : 1000},
    {"dealId" : 1, "client_name" : "Intel", "project_name" : "Hermes Project", "project_manager" : "Bob", "project_cost" : 10000},
    {"dealId" : 2, "client_name" : "Apple", "project_name" : "Zeus Project", "project_manager" : "Jane", "project_cost" : 100000}
 ]
 
 var currentDealId = myData.length;
 
 function CreateTableFromJSON() {    
    
 
    // EXTRACT VALUE FOR HTML HEADER. 
    // ('Deal ID', 'Deal Name', 'Category' and 'Price')
    var col = [];
    for (var i = 0; i < myData.length; i++) {
        for (var key in myData[i]) {
            if (col.indexOf(key) === -1) {
                col.push(key);
            }
        }
    }
 
    // CREATE DYNAMIC TABLE.
    var table = document.createElement("table");
 
    // CREATE HTML TABLE HEADER ROW USING THE EXTRACTED HEADERS ABOVE.
 
    var tr = table.insertRow(-1);                   // TABLE ROW.
 
    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      // TABLE HEADER.
        th.innerHTML = col[i];
        tr.appendChild(th);
    }
 
    // ADD JSON DATA TO THE TABLE AS ROWS.
    for (var i = 0; i < myData.length; i++) {
 
        tr = table.insertRow(-1);
 
        for (var j = 0; j < col.length; j++) {
            var tabCell = tr.insertCell(-1);
            tabCell.innerHTML = myData[i][col[j]];
        }
        // Insert Extra Cell for the Delete Icon
        //TODO: Complete this
        var tabCell2 = tr.insertCell(-1);
        tabCell2.innerHTML = "<button onclick='DeleteRow(this)'> Delete </button>";
 
    }
 
    // FINALLY ADD THE NEWLY CREATED TABLE WITH JSON DATA TO A CONTAINER.
    var divContainer = document.getElementById("showData");
    divContainer.innerHTML = "";
    divContainer.appendChild(table);
 }
 function editDeal(){
    var cost = document.getElementById("cost").value;
    var dealId = document.getElementById("dealId").value;
    document.getElementById("cost").value="";
    document.getElementById("dealId").value="";
    for(var i = 0; i < myData.length; i++){ 
       if ( myData[i].dealId == dealId) { 
          myData[i].project_cost=cost; 
       }
   }
   console.log("Editing Cost");
   console.log(myData);
   CreateTableFromJSON();
 }
 function AddNewDeal() {
    var clientName = document.getElementById("clientNameInput").value;
    var projectName = document.getElementById("projectNameInput").value;
    var projectManager = document.getElementById("projectManagerInput").value;
    var projectCost = document.getElementById("projectCostInput").value;
 
 
    document.getElementById("clientNameInput").value = "";
    document.getElementById("projectNameInput").value = "";
    document.getElementById("projectManagerInput").value = "";
    document.getElementById("projectCostInput").value = "";
 
 
    InsertRow(currentDealId, clientName, projectName, projectManager, projectCost);
    console.log("Inserted Row");
    console.log(myData);
 
 }
 
 function InsertRow(dealId, clientName, projectName, projectManager, projectCost) {
    myData.push({"dealId": dealId, "client_name" : clientName, "project_name" : projectName, "project_manager" : projectManager, "project_cost" : projectCost})
    currentDealId++;
    CreateTableFromJSON();
 
 }
 
 function DeleteRow(element) {
    //var dealId=element.parentNode.parentNode.rowIndex-1;
    var dealId=element.parentNode.parentNode.firstChild.innerHTML;
    console.log(dealId);
    for( var i = 0; i < myData.length; i++){ 
    
        if ( myData[i].dealId == dealId) { 
    
            myData.splice(i, 1); 
        }
    
    }
    CreateTableFromJSON();
    console.log("Deleted Row");
    console.log(myData);
 }