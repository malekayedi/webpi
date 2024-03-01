import React from 'react';
import {Button, Table } from 'reactstrap';
import { Link } from 'react-router-dom';



import ComponentCard from '../../components/ComponentCard';

const Newss = () => {
  const [News, setNews] = React.useState([]);

  React.useEffect(() => {
    fetch("http://localhost:8090/web/affichertoutNews")
      .then((res) => res.json())
      .then((result) => {
        setNews(result);
      });
  }, []);
  return (
    <>
      
     

      <ComponentCard
        title="News Table"
        
      >
        <Button className="btn" color="primary" size="lg">
          <Link to="/NewsForm" className="btn"  color="primary" size="lg" >Add News</Link>
      </Button>
        {News.map((news) => (
        <Table responsive>
          <thead>
            <tr>
              <th>Title</th>
              <th>Description</th>
              <th>Date news</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>{news.title}</td>
              <td>{news.description}</td>
              <td>{news.datenews}</td>
            </tr>
            
          </tbody>
        </Table>
        ))}
      </ComponentCard>

     
    </>
  );
};

export default Newss;
