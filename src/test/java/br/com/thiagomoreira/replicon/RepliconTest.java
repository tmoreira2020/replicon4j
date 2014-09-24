/**
 * Copyright (C) 2014 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.thiagomoreira.replicon;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;

import br.com.thiagomoreira.replicon.model.Project;
import br.com.thiagomoreira.replicon.model.Status;

public class RepliconTest {

	@Test
	public void getProject() throws Exception {
		String projectUri = "urn:replicon-tenant:company:project:001";
		Replicon replicon = new Replicon("company", "username", "password");

		MockRestServiceServer mockServer = MockRestServiceServer
				.createServer(replicon.restTemplate);

		String response = FileUtils.readFileToString(new File(
				"src/test/resources/getProjectResponse.json"), "UTF-8");
		mockServer
				.expect(requestTo(replicon.getBaseServiceUrl()
						+ "/ProjectService1.svc/GetProjectDetails"))
				.andExpect(method(HttpMethod.POST))
				.andRespond(withSuccess(response, MediaType.APPLICATION_JSON));
		Project project = replicon.getProject(projectUri);

		mockServer.verify();

		Assert.assertEquals(projectUri, project.getUri());

		// Status
		Status status = project.getStatus();
		Assert.assertNotNull(status);
		Assert.assertEquals(Status.INPROGRESS, status.getName());
	}
}
