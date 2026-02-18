
import { useState } from 'react'
import './App.css'
import data from "./data"
import './style.css';


export default function App() {

  const [selected, setSelected] = useState(null)

  function handleSingleSelection(getCurrentID){
    setSelected(getCurrentID === selected? null:getCurrentID);    
  }

  return (   
    <> 
      <div><h1>100 Business Studies Questions</h1></div> 
      <div className="Wrapper">
        {
          data.map((dataItem) => <div className="title" onClick={()=>handleSingleSelection(dataItem.id)} >
            <div className="item">
              <h3>{dataItem.question}</h3>                   
            </div> 
              {
                selected === dataItem.id ?
                <div className="contents">{dataItem.answer}</div>: "+"
              } 
            </div>         
          )
        }      
      </div>      
    </>
  )
}


