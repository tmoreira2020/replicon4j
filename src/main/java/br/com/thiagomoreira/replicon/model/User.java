package br.com.thiagomoreira.replicon.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	protected String loginName;
	protected String uri;
}