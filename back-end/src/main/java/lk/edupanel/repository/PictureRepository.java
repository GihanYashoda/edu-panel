package lk.edupanel.repository;

import lk.edupanel.entity.Lecturer;
import lk.edupanel.entity.Picture;

import java.util.List;

public interface PictureRepository {

    Picture savePicture(Picture picture);

    void updatePicture(Picture picture);

    void deletePictureByLecturer(Lecturer lecturer);

    boolean existsPictureByLecturer(Lecturer lecturer);

    Picture findPictureByLecturer(Lecturer lecturer);

    List<Picture> findAllPictures();

    long countPictures();
}
