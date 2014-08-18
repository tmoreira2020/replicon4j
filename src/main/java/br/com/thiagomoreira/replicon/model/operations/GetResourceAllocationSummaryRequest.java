package br.com.thiagomoreira.replicon.model.operations;

import br.com.thiagomoreira.replicon.model.DateRange;
import lombok.Data;

@Data
public class GetResourceAllocationSummaryRequest {

	protected String resourceUri;
	protected DateRange dateRange;

}
