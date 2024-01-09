package lk.edupanel.to;

import lk.edupanel.util.LecturerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerTO implements Serializable {
    private Integer id;
    private String name;
    private String designation;
    private String qualifications;
    private LecturerType type;
    private Integer displayOrder;
    private String picture;
    private String linkedin;
}
