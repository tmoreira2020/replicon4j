package br.com.thiagomoreira.replicon.model;

import lombok.Data;

@Data
public class ProjectAllocation {

	protected int allocatedDaysCount;
	protected DateRange allocationDateRange;
	protected Project project;
	protected Resource resource;
	protected Duration totalProjectsDuration;

}
