/*
 * Copyright 2005-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.samples.airline.client.sws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Arjen Poutsma
 */
public class Driver {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "org/springframework/ws/samples/airline/client/sws/applicationContext.xml");
        GetFlights getFlights = applicationContext.getBean("getFlights", GetFlights.class);
        getFlights.getFlights();

        GetFrequentFlyerMileage getFrequentFlyerMileage = applicationContext
                .getBean("getFrequentFlyerMileage", GetFrequentFlyerMileage.class);
        getFrequentFlyerMileage.getFrequentFlyerMileage();

    }

}
