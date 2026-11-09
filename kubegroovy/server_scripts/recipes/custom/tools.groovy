/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.recipes.custom

$ServerEvents.recipes((allthemods) -> {
  // Wooden Shears
  allthemods.shaped("kubegroovy:wooden_shears", [" P", "P "], [
      P: "#minecraft:planks"
  ]).id("kubegroovy:wooden_shears")
})
