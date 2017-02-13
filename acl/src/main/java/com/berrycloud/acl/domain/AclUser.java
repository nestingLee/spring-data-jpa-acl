package com.berrycloud.acl.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public abstract class AclUser<ID extends Serializable, R extends AclRole<? extends Serializable>> extends AclOwner<ID> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private ID id;

  @Column(unique = true, nullable = false)
  private String username;
  @JsonIgnore
  private String password;

  @ManyToMany
  private Set<R> aclRoles;

  public AclUser() {
  }

  public AclUser(String username) {
    this(username, "password");
  }

  public AclUser(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public ID getId() {
    return id;
  }

  public void setId(ID id) {
    this.id = id;
  }

  public Set<R> getAclRoles() {
    return aclRoles;
  }

  public void setAclRoles(Set<R> aclRoles) {
    this.aclRoles = aclRoles;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}