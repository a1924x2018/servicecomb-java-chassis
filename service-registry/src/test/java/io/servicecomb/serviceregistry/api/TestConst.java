/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicecomb.serviceregistry.api;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.servicecomb.config.ConfigUtil;

public class TestConst {
  @Before
  public void setUp() {
    System.setProperty("cse.service.registry.api.version", "v4");
    System.setProperty("cse.config.client.tenantName", "testtenane");
    ConfigUtil.createLocalConfig();
  }

  @After
  public void tearDown() {
    System.getProperties().remove("cse.service.registry.api.version");
    System.getProperties().remove("cse.config.client.tenantName");
  }

  @Test
  public void testV4URL() {
    Assert.assertEquals("/v4/testtenane/registry/microservices", Const.REGISTRY_API.MICROSERVICE_OPERATION_ALL);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s", Const.REGISTRY_API.MICROSERVICE_OPERATION_ONE);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/instances",
        Const.REGISTRY_API.MICROSERVICE_INSTANCE_OPERATION_ALL);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/instances/%s",
        Const.REGISTRY_API.MICROSERVICE_INSTANCE_OPERATION_ONE);
    Assert.assertEquals("/v4/testtenane/registry/existence", Const.REGISTRY_API.MICROSERVICE_EXISTENCE);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/schemas/%s", Const.REGISTRY_API.MICROSERVICE_SCHEMA);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/instances/%s/heartbeat",
        Const.REGISTRY_API.MICROSERVICE_HEARTBEAT);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/watcher", Const.REGISTRY_API.MICROSERVICE_WATCH);
    Assert.assertEquals("/v4/testtenane/registry/instances", Const.REGISTRY_API.MICROSERVICE_INSTANCES);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/properties",
        Const.REGISTRY_API.MICROSERVICE_PROPERTIES);
    Assert.assertEquals("/v4/testtenane/registry/microservices/%s/instances/%s/properties",
        Const.REGISTRY_API.MICROSERVICE_INSTANCE_PROPERTIES);
  }
}