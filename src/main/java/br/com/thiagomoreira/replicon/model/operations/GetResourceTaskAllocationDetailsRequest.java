package br.com.thiagomoreira.replicon.model.operations;

import lombok.Data;

@Data
public class GetResourceTaskAllocationDetailsRequest {

	protected String projectUri;
	protected String resourceUri;
}
