/**
 * Copyright 2017 ZTE Corporation.
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

package org.openo.holmes.rulemgt;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import io.dropwizard.db.DataSourceFactory;
import org.junit.Before;

public class RuleAppConfigTest {

    private RuleAppConfig ruleAppConfig;

    @Before
    public void setUp(){
        ruleAppConfig = new RuleAppConfig();
    }

    public void getDataSourceFactory() throws Exception {
        assertThat(ruleAppConfig.getDataSourceFactory(), notNullValue());
    }

    public void setDataSourceFactory() throws Exception {
        final DataSourceFactory factory = new DataSourceFactory();
        ruleAppConfig.setDataSourceFactory(factory);
        assertThat(ruleAppConfig.getDataSourceFactory(), equalTo(factory));
    }

    public void getApidescription() throws Exception {
        assertThat(ruleAppConfig.getApidescription(), equalTo("Holmes rule management rest API"));
    }

    public void setApidescription() throws Exception {
        final String value = "desc";
        ruleAppConfig.setApidescription(value);
        assertThat(ruleAppConfig.getApidescription(), equalTo(value));
    }

}