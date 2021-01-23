let addBlog=document.getElementById("addBlog");

console.log(addBlog);

addBlog.onclick =function add(){
	console.log("onclick");
	document.getElementById('popup').style.display = "block";
} 

function div_hide(){
document.getElementById('popup').style.display = "none";
}
