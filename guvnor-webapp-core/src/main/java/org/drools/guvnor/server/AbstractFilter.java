/*
 * Copyright 2012 JBoss Inc
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

package org.drools.guvnor.server;

import org.drools.repository.RepositoryFilter;

public abstract class AbstractFilter<T>
    implements
    RepositoryFilter {
    
    private final Class<T> clazz;

    public AbstractFilter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @SuppressWarnings("unchecked")
    public boolean accept(Object artifact,
                          String action) {
        if ( artifact == null || !clazz.isAssignableFrom( artifact.getClass() ) ) {
            return false;
        }

        return checkPermission( (T) artifact,
                                action );
    }

    protected abstract boolean checkPermission(T t,
                                               String action);
}
