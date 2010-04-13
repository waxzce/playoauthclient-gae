package models.oauthclient;

import play.*;
//import play.modules.oauthclient.ICredentials;

import siena.*;

@Table("Credentials")
public class Credentials extends Model {


@Id(Generator.AUTO_INCREMENT)
    public Long id;
    
	private String token;

	private String secret;

	public void setToken(String token) {
		this.token = token;
		save();
	}

	public String getToken() {
		return token;
	}

	public void setSecret(String secret) {
		this.secret = secret;
		save();
	}

	public String getSecret() {
		return secret;
	}
	public Credentials save(){
		if(this.id == null){
			this.insert();
		}else{
			this.update();
		}
		return this;
	}

}
