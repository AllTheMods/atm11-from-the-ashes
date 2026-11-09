/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package startup_scripts.items

//Wooden Shears
$StartupEvents.registry("item") { allthemods ->
  allthemods.create("wooden_shears", "shears").with {
    displayName("Wooden Shears")
    texture("kubegroovy:item/wooden_shears")
    maxDamage(59) // iron shears have 238
  }
}
