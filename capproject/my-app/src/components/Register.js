

function Register(){

    return(
      <center>
        <form className='container'>
        <h3><u>Register</u></h3>
        <br/>
        <div className="mb-3">
          <label>Name</label>
          <input
            type="name"
            className="form-control col-4"
            placeholder="Enter name"
          />
          </div>
          <div className="mb-3">
          <label>UserName</label>
          <input
            type="uname"
            className="form-control col-4"
            placeholder="Enter username"
          />
          </div>
          <div className="mb-3">
          <label>Password</label>
          <input
            type="password"
            className="form-control col-4"
            placeholder="Enter password"
          />
        </div>
          <div className="mb-3">
          <label>Company Name</label>
          <input
            type="text"
            className="form-control col-4"
            placeholder="Enter companyname"
          />
        </div>
        <div className="mb-3">
          <label>Email address</label>
          <input
            type="email"
            className="form-control col-4"
            placeholder="Enter email"
          />
        </div>
        <div className="mb-3">
          <label>Location</label>
          <input
            type="city"
            className="form-control col-4"
            placeholder="City"
          />
        </div>
        <div className="mb-3">
          <label>Admin/User</label>
        <input className="form-control col-4" list="datalistOptions"  id="opt" placeholder="Admin/User"/>
                            <datalist id="datalistOptions">
                            <option value="Admin"/>
                            <option value="User"/>
                            </datalist>
        </div>
        <div className="mb-3">
          <div className="custom-control custom-checkbox">
            <input
              type="checkbox"
              className="custom-control-input"
              id="customCheck1"
            />
            <label className="custom-control-label" htmlFor="customCheck1">
              Remember me
            </label>
            <p>By creating an account you agree to our <a href="#">Terms & conditions</a></p>
          </div>
        </div>
        <div className="d-grid">
          <a href ="/login" className="btn btn-primary">
            Submit
          </a>
        </div>
        <p className="forgot-password text-right">
          <a href="#">Forgot password?</a>
        </p>
        <div className="container text-right">
        <footer>
                <p><sup>&copy;</sup> Copyrights reversed to Hands Company and Co. </p>
            </footer>
        </div>
      </form>
      </center>
      
    )
}
export default Register