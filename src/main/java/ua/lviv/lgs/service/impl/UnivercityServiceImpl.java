package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UnivercityReprository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

import java.util.List;
@Service
public class UnivercityServiceImpl implements UnivercityService {
    @Autowired
    private UnivercityReprository universityRepository;

    @Override
    public Univercity create(Univercity university) {
        return universityRepository.save(university);
    }

    @Override
    public List<Univercity> createAll(List<Univercity> universitiesList) {
        return universityRepository.saveAll(universitiesList);
    }

    @Override
    public List<Univercity> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public Univercity findById(int id) {
        return universityRepository.getOne((long) id);
    }

    @Override
    public Univercity findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public List<Univercity> findByNumberOfStudents(int numberOfStudents) {
        return universityRepository.findByNumberOfStudents(numberOfStudents);
    }

    @Override
    public Univercity update(Univercity university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(int id) {
        universityRepository.deleteById((long) id);
    }
}
