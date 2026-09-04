package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.*;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        //EJB
        UserService userEJBMongoDb = new UserEJB(new UserMongoDao());
        userEJBMongoDb.save(user);

        UserService userEJBMySqlDao = new UserEJB( new UserMysqlDao());
        userEJBMySqlDao.save(user);

        UserService userEJBOracle = new UserEJB(new UserOracleDao());
        userEJBOracle.save(user);

        UserService userEJBPostgres = new UserEJB(new UserPostgresDao());
        userEJBPostgres.save(user);

        //REST
        UserService userRestMongoDb = new UserRest(new UserMongoDao());
        userEJBMongoDb.save(user);

        UserService userRestMySqlDao = new UserRest( new UserMysqlDao());
        userRestMySqlDao.save(user);

        UserService userRestOracle = new UserRest(new UserOracleDao());
        userEJBOracle.save(user);

        UserService userRestPostgres = new UserRest(new UserPostgresDao());
        userEJBPostgres.save(user);

        //SOAP
        UserService userSoapMongoDb = new UserSoap(new UserMongoDao());
        userSoapMongoDb.save(user);

        UserService userSoapMySqlDao = new UserSoap( new UserMysqlDao());
        userSoapMySqlDao.save(user);

        UserService userSoapOracle = new UserSoap(new UserOracleDao());
        userEJBOracle.save(user);

        UserService userSoapPostgres = new UserSoap(new UserPostgresDao());
        userSoapPostgres.save(user);
    }
}
