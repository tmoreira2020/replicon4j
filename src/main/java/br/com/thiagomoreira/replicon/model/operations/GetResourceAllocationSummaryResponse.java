package br.com.thiagomoreira.replicon.model.operations;

import lombok.Data;
import br.com.thiagomoreira.replicon.model.DateRange;
import br.com.thiagomoreira.replicon.model.ProjectAllocation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetResourceAllocationSummaryResponse {

	protected DateRange allocationSummaryDateRange;
	protected ProjectAllocation[] projectsAllocatedTo;
}
