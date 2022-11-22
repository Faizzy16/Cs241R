‹?php 
error_reporting(o);

$servername="localhost";
$username= "root";
$password="";
$dbname="S11197826"

$conn = mysqli_connect ($servername, $username,$password,$dbname ) ;

if($conn)

{

//echo "connection ok";

}

else

{

echo "Connection failed" mysqli_connect_error();

if($_POST['LC']
{
$_POST['mail];
$_POST['psw'];


	$query=	INSERT INTO account values('$mail','$psw');
	
	$data= mysli_query($query);
	if($data)
	{
	echo"data inserted into database";
	}
	else
	{
	echo "failed"
	
	}
}




}
?>



