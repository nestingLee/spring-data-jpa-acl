/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.berrycloud.acl.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Default implementation of the {@link AclUser} interface.
 *
 * @author István Rátkai (Selindek)
 *
 */
@Entity
public class SimpleAclUser implements AclUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String username;
    @JsonIgnore
    private String password;

    @ManyToMany
    private Set<SimpleAclRole> aclRoles;

    public SimpleAclUser() {
    }

    public SimpleAclUser(String username) {
        this(username, "password");
    }

    public SimpleAclUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<SimpleAclRole> getAclRoles() {
        return aclRoles;
    }

    public void setAclRoles(Set<SimpleAclRole> aclRoles) {
        this.aclRoles = aclRoles;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
