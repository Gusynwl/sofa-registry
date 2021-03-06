/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.server.data.cache;

import com.alipay.sofa.registry.common.model.metaserver.DataNode;

import java.util.HashMap;
import java.util.Map;

/**
 * change info of datacenters
 *
 * @author qian.lqlq
 * @version $Id: DataServerChangeItem.java, v 0.1 2018-05-05 17:37 qian.lqlq Exp $
 */
public class DataServerChangeItem {

    /** datacenter -> Map<ip, DataNode> */
    private Map<String, Map<String, DataNode>> serverMap;

    /** datacenter -> version */
    private Map<String, Long>                  versionMap;

    /**
     * constructor
     */
    public DataServerChangeItem() {
        this(new HashMap<>(), new HashMap<>());
    }

    /**
     * constructor
     * @param serverMap
     * @param versionMap
     */
    public DataServerChangeItem(Map<String, Map<String, DataNode>> serverMap,
                                Map<String, Long> versionMap) {
        this.serverMap = serverMap;
        this.versionMap = versionMap;
    }

    /**
     * Getter method for property <tt>serverMap</tt>.
     *
     * @return property value of serverMap
     */
    public Map<String, Map<String, DataNode>> getServerMap() {
        return serverMap;
    }

    /**
     * Getter method for property <tt>versionMap</tt>.
     *
     * @return property value of versionMap
     */
    public Map<String, Long> getVersionMap() {
        return versionMap;
    }

    @Override
    public String toString() {
        return "DataServerChangeItem{" + "serverMap=" + serverMap + ", versionMap=" + versionMap
               + '}';
    }
}