// This function is responsable for requesting the data to the API.
function getData() {
  const options = {
    method: 'GET',
    mode: 'cors',
    cache: 'default'
  }

  // Requesting the following API with the previously defined 'options'
  fetch('http://worldclockapi.com/api/json/utc/now', options)
  .then(response => {response.json()
    .then( data => updateData(data))
  })
  .catch(e => console.log('Error: ' + e.message))
}

// This function is responsable for updating the data to the HTML page.
function updateData(data) {
  // Loops through every element received from the API request.
  for(const field in data){
    // Verify if the element ('field') exists in the HTML page (as 'id'), and if so, updates it.
    if(document.querySelector("#"+field.replace('$',''))) {
      document.querySelector("#"+field).value = data[field];
      console.log(field + ': ' + data[field])
    }
  }
}

document.getElementById("refreshButton").onclick = function() {
  console.log('Refreshing data...')
  getData();
}

getData();