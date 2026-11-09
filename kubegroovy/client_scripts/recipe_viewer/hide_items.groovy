/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.recipe_viewer

import net.minecraft.world.item.ItemStack

// strainers:ore_piece is a single item; the ore is stored in the strainers:ore_type component.
// Recipes for these are removed in server_scripts/recipes/strainers.groovy
def HIDDEN_ORE_PIECES = ["allthemodium", "vibranium", "unobtainium"] as Set

$RecipeViewerEvents.removeEntriesCompletely("item", (allthemods) -> {
  if ($Platform.isLoaded("strainers")) {
    allthemods.remove { ItemStack stack ->
      if (stack.id != "strainers:ore_piece") return false
      def oreType = stack.get("strainers:ore_type")
      return oreType != null && HIDDEN_ORE_PIECES.contains(oreType.toString())
    }
  }
})
