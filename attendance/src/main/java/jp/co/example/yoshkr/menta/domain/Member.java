package jp.co.example.yoshkr.menta.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Member{
  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  @Size(min = 1, max = 255)
  private String name;

  @NotNull
  @Size(min = 1, max = 255)
  private String password;

  private Date insertDate;

  private Date updateDate;
}