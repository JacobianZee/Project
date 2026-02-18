import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'


//Usage
function CreateForm() {
  return ( 
      <>
        <div>
          <h1>Personal form</h1>
          <form>
            <label>
               Name: <input type="text" />
            </label>
          </form>
        </div>
      </>)    
   }




createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App/>
  </StrictMode>,
)
