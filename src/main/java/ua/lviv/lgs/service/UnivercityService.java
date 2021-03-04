package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityService {

    Univercity create(Univercity university);

    List<Univercity> createAll(List<Univercity> universitiesList);
    Univercity findById(int id);

    Univercity update(Univercity university);

    void deleteById(int id);

    List<Univercity> findAll();

    Univercity findByName(String name);

    List<Univercity> findByNumberOfStudents(int amountOfStudents);

}
