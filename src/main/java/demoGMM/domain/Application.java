package demoGMM.domain;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@javax.persistence.Entity
public class Application
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String attribute;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String attribute2;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String attribute3;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
	@javax.persistence.JoinTable
	protected Set<Group> groups;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.OneToOne(mappedBy = "application234")
	protected MyClass2 myclass2;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
	@javax.persistence.JoinTable
	@javax.persistence.JoinColumn(nullable = false)
	protected Set<Theme> theme2;
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
	public Application(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Theme defaultTheme() {
		// TODO : to implement
		return new Theme();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetMyclass2(MyClass2 myMyclass2) {
		if (this.myclass2 != myMyclass2) {
			if (myMyclass2 != null){
				if (this.myclass2 != myMyclass2) {
					MyClass2 oldmyclass2 = this.myclass2;
					this.myclass2 = myMyclass2;
					if (oldmyclass2 != null)
						oldmyclass2.unsetApplication234();
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
	public String getAttribute() {
		return this.attribute;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getAttribute2() {
		return this.attribute2;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getAttribute3() {
		return this.attribute3;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Theme> getTheme2() {
		if(this.theme2 == null) {
				this.theme2 = new HashSet<Theme>();
		}
		return (Set<Theme>) this.theme2;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Group> getGroups() {
		if(this.groups == null) {
				this.groups = new HashSet<Group>();
		}
		return (Set<Group>) this.groups;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public MyClass2 getMyclass2() {
		return this.myclass2;	
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
	public void addAllTheme2(Set<Theme> newTheme2) {
		if (this.theme2 == null) {
			this.theme2 = new HashSet<Theme>();
		}
		this.theme2.addAll(newTheme2);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllGroups(Set<Group> newGroups) {
		if (this.groups == null) {
			this.groups = new HashSet<Group>();
		}
		this.groups.addAll(newGroups);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllTheme2(Set<Theme> newTheme2) {
		if(this.theme2 == null) {
			return;
		}
		
		this.theme2.removeAll(newTheme2);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAttribute(String myAttribute) {
		this.attribute = myAttribute;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAttribute2(String myAttribute2) {
		this.attribute2 = myAttribute2;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAttribute3(String myAttribute3) {
		this.attribute3 = myAttribute3;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllGroups(Set<Group> newGroups) {
		if(this.groups == null) {
			return;
		}
		
		this.groups.removeAll(newGroups);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addTheme2(Theme newTheme2) {
		if(this.theme2 == null) {
			this.theme2 = new HashSet<Theme>();
		}
		
		this.theme2.add(newTheme2);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAttribute() {
		this.attribute = "";	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAttribute2() {
		this.attribute2 = "";	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAttribute3() {
		this.attribute3 = "";	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addGroups(Group newGroups) {
		if(this.groups == null) {
			this.groups = new HashSet<Group>();
		}
		
		this.groups.add(newGroups);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setMyclass2(MyClass2 myMyclass2) {
		this.basicSetMyclass2(myMyclass2);
		myMyclass2.basicSetApplication234(this);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeTheme2(Theme oldTheme2) {
		if(this.theme2 == null)
			return;
		
		this.theme2.remove(oldTheme2);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeGroups(Group oldGroups) {
		if(this.groups == null)
			return;
		
		this.groups.remove(oldGroups);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetMyclass2() {
		if (this.myclass2 == null)
			return;
		MyClass2 oldmyclass2 = this.myclass2;
		this.myclass2 = null;
		oldmyclass2.unsetApplication234();	
	}
	
}

