package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityReprository extends JpaRepository<Univercity, Long> {
    Univercity findByName(String name);

    List<Univercity> findByNumberOfStudents(int numberOfStudents);
}
