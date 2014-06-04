/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.dataset.engine;

import java.util.List;

import org.dashbuilder.dataset.index.DataSetIndexNode;
import org.dashbuilder.model.dataset.DataSet;
import org.dashbuilder.model.dataset.filter.DataSetFilter;
import org.dashbuilder.model.dataset.group.DataSetGroup;
import org.dashbuilder.model.dataset.sort.DataSetSort;

/**
 * It provides access to a data set row subset.
 */
public interface DataSetRowSet {

    DataSet getDataSet();
    List<Integer> getRows();

}