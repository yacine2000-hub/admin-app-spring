package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.AppUserEntity;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
   //Une methode qui permet de recupérer un utilisateur par rapport à son email
    AppUserEntity findByEmail(String email);
}
