const { log } = require("console");
const os = require("os");
console.log("CPU Architecture:  " + os.arch());
console.log("free memory:  " + os.freemem());
console.log("total memory:  " + os.totalmem() + "\n");
// console.log(
//   "network interfaces  :  " + JSON.stringify(os.networkInterfaces()) + "\n"
// );
console.log("temprary directories  :  " + os.tmpdir());
console.log("Endianness  :  " + os.endianness());
console.log("host name  :  " + os.hostname());
console.log("os type  :  " + os.type());
console.log("os platform  :  " + os.platform());
console.log("os release  :  " + os.release());
