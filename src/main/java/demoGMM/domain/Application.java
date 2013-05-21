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
	
	@javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
	@javax.persistence.JoinTable
	protected Set<Group> groups;
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
	
}

