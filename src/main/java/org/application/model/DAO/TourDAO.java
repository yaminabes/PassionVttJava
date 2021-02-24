package model.DAO;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestParsingException;
import kong.unirest.json.JSONObject;
import model.Coureur;
import model.Course;
import model.Tour;
import model.DAO.exception.ApiException;
import model.Entity;

public class TourDAO implements DAO {

    @Override
    public Entity findById(int id) throws ApiException {
        CourseDAO courseDAO = new CourseDAO();
        CoureurDAO coureurDAO = new CoureurDAO();
        HttpResponse<Tour> response = Unirest.get("tours/"+id).asObject(Tour.class);
        response.getBody().setCourse((Course) courseDAO.findById(response.getBody().getCourse().getId()));
        response.getBody().setCoureur((Coureur) coureurDAO.findById(response.getBody().getCoureur().getId()));
        return response.getBody();
    }

    @Override
    public Entity[] findAll() throws ApiException {
        return new Entity[0];
    }

    @Override
    public void insert(Entity entity) throws ApiException {
        JSONObject jsonObject = new JSONObject(entity) ;
        jsonObject.remove("id");
        jsonObject.remove("coureur");
        jsonObject.put("coureur","api/coureurs/" + ((Tour)entity).getCoureur().getId());
        jsonObject.remove("course");
        jsonObject.put("course","api/courses/" + ((Tour)entity).getCourse().getId());
        HttpResponse<JsonNode> response = Unirest.post("tours").body(jsonObject).asJson() ;
        if (response.getStatus() != 201 ) throw new ApiException(response.getStatusText());
        entity.setId(response.getBody().getObject().getInt("id"));
    }

    @Override
    public void update(Entity entity) throws ApiException {
        JSONObject jsonObject = new JSONObject(entity) ;
        jsonObject.remove("id");
        jsonObject.remove("coureur");
        jsonObject.put("coureur","api/coureurs/" + ((Tour)entity).getCoureur().getId());
        jsonObject.remove("course");
        jsonObject.put("course","api/courses/" + ((Tour)entity).getCourse().getId());
        HttpResponse<JsonNode> response = Unirest.put("tours/"+entity.getId()).body(jsonObject).asJson() ;
        if (response.getStatus() != 200 ) throw new ApiException(response.getStatusText());
    }

    @Override
    public void delete(Entity entity) throws ApiException {
        HttpResponse<JsonNode> response = Unirest.delete("tours/"+entity.getId()).asJson() ;
        if (response.getStatus() != 204 ) throw new ApiException(response.getStatusText());
    }
}
