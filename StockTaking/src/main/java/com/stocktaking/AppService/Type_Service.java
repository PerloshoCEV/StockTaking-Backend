package com.stocktaking.AppService;

import com.stocktaking.AppEntity.T_Type;
import com.stocktaking.AppRepository.Type_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Type_Service
{
    Type_Repository repository;

    public Type_Service(Type_Repository repository)
    {
        super();
        this.repository = repository;
    }

    public Long createTypeService(T_Type newType)
    {
        T_Type typeToSave = repository.save(newType);
        return typeToSave.getId();
    }

    public List<T_Type> readTypeAllService()
    {
        return repository.findAll();
    }

    public T_Type readTypeId(Long id)
    {
        return repository.getReferenceById(id);
    }

    public T_Type updateType(T_Type type)
    {
        T_Type typeToUpdated = repository.getReferenceById(type.getId());
        typeToUpdated.setAll
                (
                        type.getName(),
                        type.getDescription()
                );
        return repository.save(typeToUpdated);
    }

    public void deleteTypeId(Long id)
    {
        repository.delete(repository.getReferenceById(id));
    }

    public Optional<T_Type> findTypeByIdService(Long id)
    {
        return repository.findById(id);
    }

}

