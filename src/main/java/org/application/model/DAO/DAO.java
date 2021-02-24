package model.DAO;

import model.DAO.exception.ApiException;
import model.Entity;

public interface DAO {

    public Entity findById(int id) throws ApiException;

    public Entity[] findAll() throws ApiException;

    public void insert(Entity entity) throws ApiException;

    public void update(Entity entity) throws ApiException;

    public void delete(Entity entity) throws ApiException;

}
