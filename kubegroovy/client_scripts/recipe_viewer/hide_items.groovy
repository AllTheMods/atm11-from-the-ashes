/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.recipe_viewer

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.ItemStack
import net.neoforged.neoforge.fluids.FluidStack

// Strainers items that stay
def STRAINERS_KEEP = [
    "strainers:seed_bag",
    "strainers:sapling_bag",
    "strainers:flower_bag",
    "strainers:water_drop",
    "strainers:lava_drop"
] as Set

$RecipeViewerEvents.removeEntriesCompletely("item", (allthemods) -> {
  if ($Platform.isLoaded("strainers")) {
    // Every other Strainers item and block, including every ore piece variant
    allthemods.remove { ItemStack stack ->
      def id = BuiltInRegistries.ITEM.getKey(stack.item)
      return id.namespace == "strainers" && !STRAINERS_KEEP.contains(id.toString())
    }
  }
})

$RecipeViewerEvents.removeEntriesCompletely("fluid", (allthemods) -> {
  if ($Platform.isLoaded("strainers")) {
    // Eroding, purifying and salty water
    allthemods.remove { FluidStack stack ->
      BuiltInRegistries.FLUID.getKey(stack.fluid).namespace == "strainers"
    }
  }
})
