package com.stocktaking.AppRestController;


import com.stocktaking.AppEntity.T_Type;
import com.stocktaking.AppRestControllerInterface.Type_ControllerInterface;
import com.stocktaking.AppService.Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Type_Controller implements Type_ControllerInterface
{
    @Autowired
    Type_Service typeService;

    public Type_Controller()
    {
        super();
    }

    /*
        Zona de Constructor
    */
    @Override
    public Long createTypeController(T_Type newType)
    {
        if (newType != null)
        {
            // Si no tiene id
            if(newType.getId() == null)
            {
                return typeService.createTypeService(newType);
            }
            else
            {

            }
        }
        return null;
    }

    /*
        Zona de implementaciones
    */
    @Override
    public List<T_Type> readTypeAllController()
    {
        List<T_Type> typesToReturn = null;
        typesToReturn = typeService.readTypeAllService();
        return typesToReturn;
    }

    @Override
    public T_Type readTypeIdController(Long id)
    {
        T_Type typeToReturn = null;
        if(typeService.findTypeByIdService(id).isPresent())
        {
            typeToReturn = typeService.findTypeByIdService(id).get();
        }
        else
        {

        }
        return typeToReturn;
    }

    @Override
    public T_Type updateTypeController(T_Type type)
    {
        T_Type typeToReturn = null;


        typeToReturn = typeService.updateType(type);


        return typeToReturn;
    }

    @Override
    public String deleteTypeId(Long id)
    {
        String stringToReturn = "";

        if(id != null)
        {
            if (typeService.findTypeByIdService(id).isPresent())
            {
                typeService.deleteTypeId(id);
                stringToReturn = "Tipo eliminado correctamente";
            }
            else
            {
                stringToReturn = "Tipo con ID " + id + " no existe";
            }
        }
        else
        {

        }
        return stringToReturn;
    }
}
