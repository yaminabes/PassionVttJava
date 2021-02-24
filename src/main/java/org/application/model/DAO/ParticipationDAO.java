package model.DAO;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestParsingException;
import kong.unirest.json.JSONObject;
import model.Participation;
import model.DAO.exception.ApiException;
import model.Entity;

public class ParticipationDAO implements DAO {

    @Override
    public Entity findById(int id) throws ApiException {
        HttpResponse<Participation> response = Unirest.get("participations/"+id).asObject(Participation.class);
        if (response.getStatus() != 200 ) throw new ApiException(response.getStatusText());
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
        HttpResponse<JsonNode> response = Unirest.post("participations").body(jsonObject).asJson() ;
        if (response.getStatus() != 201 ) throw new ApiException(response.getStatusText());
        entity.setId(response.getBody().getObject().getInt("id"));
    }

    @Override
    public void update(Entity entity) throws ApiException {
        HttpResponse<JsonNode> response = Unirest.put("participations/"+entity.getId()).body(entity).asJson() ;
        if (response.getStatus() != 200 ) throw new ApiException(response.getStatusText());
    }

    @Override
    public void delete(Entity entity) throws ApiException {
        HttpResponse<JsonNode> response = Unirest.delete("participations/"+entity.getId()).asJson() ;
        if (response.getStatus() != 204 ) throw new ApiException(response.getStatusText());
    }
}
