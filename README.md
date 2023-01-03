# HashCoder
Client and Web-Service(SOAP), client send file to server (array of bytes) and server returns hash sum 
  Client:
    -All exceptions handled
    -File convert to array of bytes and send it to the server as 1 array
  Server:
    -get all data and convert it to MessageDigest and return hash sum
    -all hash summ logging in system
