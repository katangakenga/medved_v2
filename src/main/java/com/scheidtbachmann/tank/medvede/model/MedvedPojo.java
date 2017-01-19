package com.scheidtbachmann.tank.medvede.model;

/**
 * Created by lorman.erich on 9. 4. 2015.
 */
public class MedvedPojo {

  private Long id;
  private String meno;
  private Long vek;

  public MedvedPojo(final Long id, final String meno, final Long vek) {
    this.id = id;
    this.meno = meno;
    this.vek = vek;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getMeno() {
    return meno;
  }

  public void setMeno(final String meno) {
    this.meno = meno;
  }

  public Long getVek() {return vek; }

  public void setVek(final Long vek) {this.vek = vek; }

  public String toString(){
    return vek + meno + id;
  }
}

