// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;

public class AverageTexturedTool extends CustomTexturedTool
{
    public AverageTexturedTool(DamageableItem damageableItem, int n, Material material, Material material2, String s, String s2, String s3) {
        this(damageableItem, n, s, s2, s3);
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(material, material2));
    }
    
    public AverageTexturedTool(DamageableItem damageableItem, int fakeDurability, String s, String displayName, String s2) {
        super(damageableItem, s, s2);
        this.setDisplayName(displayName);
        this.setUnbreakable(true);
        this.setFakeDurability(fakeDurability);
        this.setEnchantable(true);
        this.setToolLikeAttributes(true);
        this.setUnbreakableVisibility(false);
        this.setAttributeVisibility(false);
        this.setCombinedInCrafting(true);
    }
}
