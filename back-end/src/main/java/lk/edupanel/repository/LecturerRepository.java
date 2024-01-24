package lk.edupanel.repository;

import lk.edupanel.entity.Lecturer;

import java.util.List;

public interface LecturerRepository {

    Lecturer saveLecturer(Lecturer lecturer);

    void updateLecturer(Lecturer lecturer);

    void deleteLecturer(int id);

    boolean existsLecturerById(int id);

    Lecturer findLecturerById(int id);

    List<Lecturer> findAllLecturers();

    long countLecturers();
}
