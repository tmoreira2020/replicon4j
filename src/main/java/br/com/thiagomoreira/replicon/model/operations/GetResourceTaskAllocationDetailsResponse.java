package br.com.thiagomoreira.replicon.model.operations;

import br.com.thiagomoreira.replicon.model.Resource;
import br.com.thiagomoreira.replicon.model.TaskAllocation;
import lombok.Data;

@Data
public class GetResourceTaskAllocationDetailsResponse {

	protected TaskAllocation[] entries;
	protected Resource resource;
}
