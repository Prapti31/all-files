
function Mainpage(){
    return (
        <div className="container-fluid">
            <center>
            <p><h1>Welcome to JobSpace</h1></p>
            <img src="https://media.istockphoto.com/photos/brunette-woman-picture-id488470902?k=20&m=488470902&s=612x612&w=0&h=CYd2LQ4Wv8o2ALNtRqqu4AcBMjqCh8o54IGTScFiLfU=" height="200px" width="250px" alt="job-search image"/>
            <br/>
                <br/>
            <div className="container">
                <a href="/login" button type="button" className="btn btn-success">Login</a>
                <br/>
                <br/>
                <a href="/register" button type="button" className="btn btn-success">Register</a>
            </div>
            <br/>
            <br/>
            <div>
            <footer>
                <p><h5>Copyrights reversed to Hands Company and Co. <sup>&copy;</sup> </h5></p>
            </footer>
            </div>
            </center>
        </div>
    )
}
export default Mainpage;