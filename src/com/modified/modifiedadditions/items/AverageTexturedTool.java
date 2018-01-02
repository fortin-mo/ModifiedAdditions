// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items;

import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;

public class AverageTexturedTool extends CustomTexturedTool
{
    public AverageTexturedTool(DamageableItem damageableItem, int fakeDurability, Material material, Material material2, String idName, String displayName, String defaultTexture) {
        this(damageableItem, fakeDurability, idName, displayName, defaultTexture);
        this.addAllCustomRecipes(this.getToolType().getCustomShapedRecipe(material, material2));
    }
    
    public AverageTexturedTool(DamageableItem damageableItem, int fakeDurability, String idName, String displayName, String defaultTexture) {
        super(damageableItem, idName, defaultTexture);
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
