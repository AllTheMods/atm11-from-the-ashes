/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires strainers
package server_scripts.recipes

// Ore pieces that must not be obtainable in From the Ashes.
// Matching JEI hiding lives in client_scripts/recipe_viewer/hide_items.groovy
def REMOVED_ORE_PIECES = ["allthemodium", "vibranium", "unobtainium"]

// The strainer recipe for each piece is filed under the block it is strained from
def STRAINING_SOURCE = [
    allthemodium: "purified_deepslate",
    vibranium   : "purified_netherrack",
    unobtainium : "purified_end_stone"
]

$ServerEvents.recipes((allthemods) -> {
  REMOVED_ORE_PIECES.each { type ->
    // Straining recipe that drops strainers:ore_piece[strainers:ore_type="<type>"]
    allthemods.remove([id: "strainers:straining/compat/allthemodium/${STRAINING_SOURCE[type]}/${type}"])
    // 2x2 crafting recipe that turns four pieces into the ore block
    allthemods.remove([id: "strainers:ore_piece/${type}"])
  }
})
