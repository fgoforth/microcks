/*
 * Licensed to Laurent Broudoux (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.github.microcks.web.dto;

/**
 * Data Transfer object for basic header with its values (comma separated string).
 * @author laurent
 */
public class HeaderDTO {

   private String name;
   private String values;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getValues() {
      return values;
   }

   public void setValues(String values) {
      this.values = values;
   }
}
