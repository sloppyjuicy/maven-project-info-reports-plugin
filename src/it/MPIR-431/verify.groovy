/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
String html = new File( basedir, 'target/reports/dependencies.html' ).text

// Revise after DOXIA-704
def summaryLine = '''\
<tr class="b">
<td style="text-align: right;">compile: 1</td>
<td style="text-align: right;">compile: 45.5 kB</td>
<td style="text-align: right;">compile: 47</td>
<td style="text-align: right;">compile: 36</td>
<td style="text-align: right;">compile: 4</td>
<td rowspan="3" style="text-align: center; vertical-align: middle;">1.3</td>
<td style="text-align: right;">compile: 1</td></tr>
<tr class="a">
<td style="text-align: right;">runtime: 1</td>
<td style="text-align: right;">runtime: 284.2 kB</td>
<td style="text-align: right;">runtime: 155</td>
<td style="text-align: right;">runtime: 133</td>
<td style="text-align: right;">runtime: 10</td>
<td style="text-align: right;">runtime: 1</td></tr>
<tr class="b">
<td style="text-align: right;">provided: 1</td>
<td style="text-align: right;">provided: 85.7 kB</td>
<td style="text-align: right;">provided: 209</td>
<td style="text-align: right;">provided: 192</td>
<td style="text-align: right;">provided: 4</td>
<td style="text-align: right;">-</td></tr>
<tr class="a">
<td style="text-align: right;">test: 3</td>
<td style="text-align: right;">test: 2.2 MB</td>
<td style="text-align: right;">test: 1619</td>
<td style="text-align: right;">test: 1493</td>
<td style="text-align: right;">test: 91</td>
<td style="text-align: center;">1.8</td>
<td style="text-align: right;">test: 3</td></tr>'''

assert html.contains( summaryLine.replaceAll( "\n", System.lineSeparator() ) )
