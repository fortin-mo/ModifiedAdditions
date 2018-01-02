package com.modified.modifiedadditions.permissions;

import com.chrismin13.additionsapi.permissions.PermissionType;
import com.chrismin13.additionsapi.permissions.ItemPermissions;

public class ChiselPermissions extends ItemPermissions
{
    private String chisel;
    
    public ChiselPermissions(String s, PermissionType permissionType) {
        super(s, permissionType);
        this.chisel = String.valueOf(this.getPermissionPrefix()) + "." + this.getType().getPermission() + ".chisel";
    }
    
    public String getChisel() {
        return this.chisel;
    }
    
    public void setChisel(String chisel) {
        this.chisel = chisel;
    }
}
