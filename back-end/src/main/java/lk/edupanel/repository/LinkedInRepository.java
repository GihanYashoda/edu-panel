package lk.edupanel.repository;

import lk.edupanel.entity.Lecturer;
import lk.edupanel.entity.LinkedIn;

import java.util.List;

public interface LinkedInRepository {

    LinkedIn saveLinkedIn(LinkedIn linkedIn);

    void updateLinkedIn(LinkedIn linkedIn);

    void deleteLinkedInByLecturer(Lecturer lecturer);

    boolean existLinkedInByLecturer(Lecturer lecturer);

    LinkedIn findLinkedInByLecturer(Lecturer lecturer);

    List<LinkedIn> findAllLinkedIns();

    long countLinkedIns();
}