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
package com.berrycloud.acl.repository;

/**
 * Interface for repositories with property support.
 *
 * @author István Rátkai (Selindek)
 */
import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mapping.PersistentProperty;

public interface PropertyRepository<T, ID extends Serializable> {

    Object findProperty(ID id, PersistentProperty<? extends PersistentProperty<?>> property, Pageable pageable);

    Object findProperty(ID id, PersistentProperty<? extends PersistentProperty<?>> property, Serializable propertyId);

    /**
     * Helper method for calling clear on the EntityManager.
     *
     */
    void clear();

}
