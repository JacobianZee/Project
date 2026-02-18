import { useReducer } from 'react'
import './App.css'


    function Form(){
       const [state, dispatch] = useReducer((state,action) => (
        {...state,...action}),
        {first:"",last:""});
     // const [person,setPerson] = useState({first:"",last:""});

      return(
        <div className='firstAndlastField'>
          {/*take note that dispatch is like a setter() e.g setName */}
          <input placeholder ='Name' type="text" value={state.first} onChange={(e) => dispatch({first: e.target.value})}/>
          <input placeholder ='Surname' type="text" value={state.last} onChange={(e) => dispatch({last: e.target.value})}/> 
           
            <div className='Realtimeupdate'>
              <p>My name is {state.first}</p>
              <p>My surname is {state.last}</p>
            </div>      
        </div>
      )
    }

 function App () {
     return <Form/>
  }
  


 export default App
