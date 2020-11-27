package com.song.scaffold.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name ="object")
@Component
public class ObjectScaffold implements Serializable {
    @Id
    //进行主键回填
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String attribute;
    private String methode;
    private String date;
}
