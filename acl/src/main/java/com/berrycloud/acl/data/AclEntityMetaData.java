package com.berrycloud.acl.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

public class AclEntityMetaData {

	private SingularAttribute<? super Object, ?> idAttribute;
	private List<OwnerData> ownerDataList = new ArrayList<>();
	private List<OwnerData> ownerGroupDataList = new ArrayList<>();
	private List<ParentData> parentDataList = new ArrayList<>();
	private List<PermissionLinkData> permissionLinkList = new ArrayList<>();

	public List<OwnerData> getOwnerDataList() {
		return ownerDataList;
	}

	public void setOwnerDataList(List<OwnerData> ownerDataList) {
		this.ownerDataList = ownerDataList;
	}

	public List<ParentData> getParentDataList() {
		return parentDataList;
	}

	public void setDataParentList(List<ParentData> parentDataList) {
		this.parentDataList = parentDataList;
	}

	public List<OwnerData> getOwnerGroupDataList() {
		return ownerGroupDataList;
	}

	public void setOwnerGroupDataList(List<OwnerData> ownerGroupDataList) {
		this.ownerGroupDataList = ownerGroupDataList;
	}

	public List<PermissionLinkData> getPermissionLinkList() {
		return permissionLinkList;
	}

	public void setPermissionLinkList(List<PermissionLinkData> permissionLinkList) {
		this.permissionLinkList = permissionLinkList;
	}

	public SingularAttribute<? super Object, ?> getIdAttribute() {
		return idAttribute;
	}

	public void setIdAttribute(SingularAttribute<? super Object, ?> idAttribute) {
		this.idAttribute = idAttribute;
	}

}
