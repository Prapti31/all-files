import { BrowserRouter, Switch, Route } from 'react-router-dom';
import NotFound from './components/NotFound';
import 'bootstrap/dist/css/bootstrap.min.css';
import Mainpage from './components/Mainpage';
import Login from './components/Login';
import Register from './components/Register';
import Dashboard from './components/Dashboard';
import AddJob from './components/AddJob';
import logo from './logo.svg'
import DashboardAdmin from './components/DashboardAdmin';
import UserPage from './components/UserPage';
import UserProfile from './components/UserProfile';

function App() {
  return (
    <BrowserRouter>
      <div>
        <div>
          <Switch>
            <Route exact path="/" component={Mainpage} />
            <Route path="/login" component={Login} />
            <Route path="/register" component={Register} />
            <Route path="/dashboard" component={Dashboard} />
            <Route path="/add" component={AddJob} />
            <Route path="/adminpage" component={DashboardAdmin} />
            <Route path="/userpage" component={UserPage} />
            <Route path="/userprofile" component={UserProfile} />
            <Route path="*" component={NotFound} />
          </Switch>
        </div>
      </div>
    </BrowserRouter>
  );
}


export default App;
