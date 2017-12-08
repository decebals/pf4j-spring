/*
 * Copyright 2014 Decebal Suiu
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
package org.pf4j.demo;

import org.pf4j.Extension;
import org.pf4j.demo.api.Greeting;
import org.springframework.context.annotation.Scope;

/**
 * @author Decebal Suiu
 */
@Extension
@Scope("prototype")
public class WhazzupGreeting implements Greeting {

    @Override
    public String getGreeting() {
        return "Whazzup";
    }

}
