package br.com.thiagomoreira.replicon.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {

	protected String displayText;
	protected String name;
	protected String uri;
}
