package br.com.thiagomoreira.replicon.model;

import lombok.Data;

@Data
public class TaskAllocation {

	protected DateRange allocationDateRange;
	protected Task task;
}
