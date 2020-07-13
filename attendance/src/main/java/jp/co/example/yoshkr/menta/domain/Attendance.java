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
public class Attendance {
  @Id
  @GeneratedValue
  private Long id;
  @NotNull
  private Long memberId;
  @NotNull
  @Size(min = 4, max = 4)
  private String targetYear;
  @NotNull
  @Size(min = 4, max = 4)
  private String targetFiscalYear;
  @NotNull
  @Size(min = 6, max = 6)
  private String targetMonth;
  @NotNull
  @Size(min = 2, max = 2)
  private String targetDate;
  @NotNull
  @Size(min = 4, max = 4)
  private String workStart;
  @NotNull
  @Size(min = 4, max = 4)
  private String workEnd;
  @NotNull
  @Size(min = 4, max = 4)
  private String refreshStart;
  @NotNull
  @Size(min = 4, max = 4)
  private String refreshEnd;

  private Date insertDate;

  private Date updateDate;
}
