package demoGMM.domain;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@javax.persistence.Entity
public abstract class User
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String login;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String firstname;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String lastname;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String email;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	@javax.persistence.Column(nullable = false)
	protected Date birthday;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.ManyToOne
	@javax.persistence.JoinColumn(nullable = false)
	protected Group group;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id
	@javax.persistence.Column(nullable = false)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public User(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetGroup(Group myGroup) {
		if (this.group != myGroup) {
			if (myGroup != null){
				if (this.group != myGroup) {
					Group oldgroup = this.group;
					this.group = myGroup;
					if (oldgroup != null)
						oldgroup.removeUsers(this);
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getLogin() {
		return this.login;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getFirstname() {
		return this.firstname;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getLastname() {
		return this.lastname;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getEmail() {
		return this.email;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getBirthday() {
		return this.birthday;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Group getGroup() {
		return this.group;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setLogin(String myLogin) {
		this.login = myLogin;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setFirstname(String myFirstname) {
		this.firstname = myFirstname;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setLastname(String myLastname) {
		this.lastname = myLastname;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEmail(String myEmail) {
		this.email = myEmail;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setBirthday(Date myBirthday) {
		this.birthday = myBirthday;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setGroup(Group myGroup) {
		this.basicSetGroup(myGroup);
		myGroup.addUsers(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetLogin() {
		this.login = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetFirstname() {
		this.firstname = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetLastname() {
		this.lastname = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEmail() {
		this.email = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetBirthday() {
		this.birthday = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetGroup() {
		if (this.group == null)
			return;
		Group oldgroup = this.group;
		this.group = null;
		oldgroup.removeUsers(this);	
	}
	
}

