import { useEffect, useState } from 'react';
import { Link, useHistory } from 'react-router-dom';
import jobService from '../services/job.service';
import UserService from '../services/User.service';

const UserPage = () => {
  const[appliedjob,setAppliedJobs]=useState([]);
  const [job, setJobs] = useState([]);

  const init = () => {
    jobService.getAll()
      .then(response => {
        console.log('Printing job data', response.data);
        setJobs(response.data);
      })
      .catch(error => {
        console.log('Something went wrong', error);
      }) 
  }
  const applyJob = (id) => {
    console.log('Printing id', id);
    if(window.confirm('are you sure you want to apply'))
    UserService.create(job)
      .then(response => {
        console.log('job applied successfully', response.data);
        init();
      })
      .catch(error => {
        console.log('Something went wrong', error);
      })
  }


  useEffect(()=> {
    init();
  }, []);

  

  return (
    <div className="container">
      <h3>List of jobs</h3>
      <hr/>
      <div>
        <table className="table table-bordered table-striped">
          <thead className="thead-dark">
            <tr>
              <th>Logo</th>
              <th>Company Name</th>
              <th>Desgination</th>
              <th>Yrs of Exp</th>
              <th>Job description</th>
              <th>Location</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
          {
            job.map(job => (
              <tr key={job.id}>
                <td align="center"><img src={job.logo} width="50" height="45" alt="Company logo"/></td>
                <td>{job.companyname}</td>
                <td>{job.designation}</td>
                <td>{job.yrsofexp}</td>
                <td>{job.jobdesc}</td>
                <td>{job.location}</td>
                <td>
                  <button className="btn btn-success" onClick={()=>{
                      applyJob(job.id);
                  }}> Apply </button>
                </td>
              </tr>
            ))
          }
          </tbody>
        </table>
        
      </div>
    </div>
  );
}

export default UserPage

