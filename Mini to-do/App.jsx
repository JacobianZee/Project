import { useReducer, useState } from 'react'
import './App.css'

function reducer(state,action){
  switch(action.type){
    case 'add': return {
      age:state.age+1
    }
    default:
      return state
  }
}

function form(){
  const [state, dispatch] = useReducer((state,action) => (
    {...state,...action}),
    {first:"",last:""});
  const person = useState({first:"",last:""})

    return(
      <div className='firstAndlastField'>
        {/*take note that dispatch is like a setter() e.g setName */}
        <input type="text" value={state.first} onChange={(e) => dispatch(e.target.value)}/>
        <input type="text" value={state.last} onChange={(e) => dispatch(e.target.value)}/>       
      </div>
    )
}

function App() {
  const [state, dispatch] = useReducer(reducer, {age:0})//first thing to be declared, because it is a hook
  const [name, setName] = useState("") 
  const [list,setListnames] = useState(["Lydia","Martha","Phillip","Isaac","Gontse","Elias","Boitumelo","Lebohang","Mamello"]);
  
   

  function handleaddage(){
    dispatch({type:'add'})
  }  

  function handleinput(){
    //return the same list
    name === "" ? setListnames([...list]) : 
    //return current list plus an added name
    setListnames([...list,name]) 
    setName("")   
  }  

 return(

  <div>
    <div className='navigation'>
       <BrowserRouter>
      {/* Navigation */}
      <nav>        
        <Link to="/form">form secton</Link>
      </nav>
    </BrowserRouter>  

    {/* Routes */}
    <Routes>
        <Route path="/form" element={<form />}></Route>
    </Routes>  
    </div>
    <h3>Family names</h3>
      <div className='listnames'>
        <ol>
          {list.map(nameI => <li key={nameI}>{nameI}</li>)}
        </ol> 
      </div>         
        <div className='listsection'>
          <input type="text" placeholder= 'e.g John' value={name} onChange={e => setName(e.target.value)}/> 
          <button onClick={handleinput}>Add Name</button>
        </div>
        <div className='ageSection'>
          <button onClick={handleaddage}>Increase age</button>
          <p>The current age is {state.age}</p> 
        </div>    
  </div>
 )

}

export default App
