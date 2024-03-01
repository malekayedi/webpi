import React from 'react';
import { Row, Col, Button, FormGroup, Label } from 'reactstrap';
import { useForm } from 'react-hook-form';
import Form from 'react-validation/build/form';

import ComponentCard from '../../components/ComponentCard';

const NewsForm = () => {
  const { register, formState: { errors } } = useForm(); // initialise the hook
  // const [News, setNews] = useState({
  //   Title: '',
  //   description: '',
  //   datenews: '',
    
  // });
  
  const [Title,setTitle]= React.useState('')
  const [description,setDescription]= React.useState('')
  const [datenews,setDatenews]= React.useState('')

  const Newsadd = (e) => {
    e.preventDefault();
    const Newss = { Title, description, datenews }; // Utiliser les mêmes noms que dans le formulaire
    console.log("Data to be sent:", Newss); // Vérifiez les valeurs avant l'envoi
    fetch("http://localhost:8090/web/ajouterNews", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(Newss)
    }).then(() => {
      console.log("New News added");
    });
  };
  // const onSubmit = (data) => {
  //   setNews(data);
  // };
  return (
    <>
      <Row>
        <Col sm="12">
          <ComponentCard title="Form Validation">
            <Form>
              <FormGroup>
                <Label className="control-Label" htmlFor="Title">
                  Title *
                </Label>
                <div className="mb-2">
                  <input
                    type="text"
                    {...register('Title', { required: true })}
                    className="form-control"
                    value={Title}
                    onChange={(e)=>setTitle(e.target.value)}
                  />
                </div>
                <span className="text-danger">{errors.Title && 'Title name is required.'}</span>
              </FormGroup>
              
              <FormGroup>
                <Label className="control-Label" htmlFor="datenews">
                  Date News *
                </Label>
                <div className="mb-2">
                  <input
                    type="date"
                    {...register('DateNews', { required: true })}
                    className="form-control"
                    value={datenews}
                    onChange={(e)=>setDatenews(e.target.value)}
                  />
                </div>
                <span className="text-danger">{errors.datenews && 'DateNews is required.'}</span>
              </FormGroup>
              
              <FormGroup>
                <Label className="control-Label" htmlFor="description">
                  Description *
                </Label>
                <div className="mb-2">
                  <input
                    type="text"
                    {...register('description', { required: true })}
                    className="form-control"
                    value={description}
                    onChange={(e)=>setDescription(e.target.value)}
                  />
                </div>
                <span className="text-danger">{errors.description && 'Description is required.'}</span>
              </FormGroup>
              {/* <FormGroup>
                <Label>Are you a developer?</Label>
                <br />
                <FormGroup check inline>
                  <Input
                    type="radio"
                    value="Yes"
                    {...register('developer', { required: true })}
                  />
                  <Label check>Yes</Label>
                </FormGroup>
                <FormGroup check inline>
                  <Input
                    type="radio"
                    value="No"
                    {...register('developer', { required: true })}
                  />
                  <Label check>No</Label>
                </FormGroup>
                <span className="text-danger">{errors.developer && 'Please select value.'}</span>
              </FormGroup> */}
              <FormGroup>
                <Button className="button btn-info" type="submit" onClick={Newsadd}>
                  Submit
                </Button>
              </FormGroup>
            </Form>
            <hr />
           
          </ComponentCard>
        </Col>
      </Row>
    </>
  );
};

export default NewsForm;
