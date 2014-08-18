package br.com.thiagomoreira.replicon.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {

	protected Department department;
	protected String displayText;
	protected String email;
	protected String slug;
	protected User user;
	protected String uri;

}
