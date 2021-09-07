package org.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@Table(name =" user_data")

public class User {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private @Getter @Setter int userId;
	private @Getter @Setter String userName;
	private @Getter @Setter String userSurname;
	private @Getter @Setter int userPincode;
	private @Getter @Setter String  userDob;
	private @Getter @Setter String userJoiningdate;

}
