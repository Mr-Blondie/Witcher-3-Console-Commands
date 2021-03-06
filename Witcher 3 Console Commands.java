addmoney(#) - adds "#" amount of Crowns
removemoney(#) - removes "#" amount of Crowns

activateAllGlossaryCharacters() - enable all characters in glossary
activateAllGlossaryBeastiary() - enable all monsters in glossary

Cat(1) - see in the dark, Cat(0) to turn it off
Drunk(1) - drunk effect, Drunk(0) to turn it off

{Combat
god - godmode (toggle, type god to turn off), there is also god2 and god3
healme - heals the player
killall - kill all enemies in sight, killall(50) kills all enemies in 50y range
likeaboss - damage set to 40% of targets MAX health
addabl('name') to add a buff and rmvabl('name') to remove it
addabl('DamageBuff') - 200 Attack Power, 200 Spell Power
addabl('ForceCriticalHits') - 100% Critical Chance
addabl(ForceFinisher)
addabl(ForceDismemberment)
addabl('ConAthletic') - 1000 Vitality, 100 Stamina and higher Stamina Regen
addabl('ConImmortal') - 998000 Vitality
addabl('StatsRangedSuperLame') - increased aim duration
}

{Geralt Abilities
cleardevelop - CAUTION: resets Geralt to level 1, gives you starting gear
witchcraft - CAUTION: gives you 1 of everything, the game may hang for a couple of minutes
addexp(#) - adds "#" experience
setlevel(#) - sets level to "#", leveldown not available
levelup - increase level by 1
addskillpoints(#) - increase skillpoints by "#"
}

{learnskill('name') - teaches Geralt skill "name
e.g. learnskill('sword_s1') to teach Geralt Whirl
{Skills}
learnskill('sword_2')
learnskill('sword_5')
learnskill('sword_s1')
learnskill('sword_s2')
learnskill('sword_s3')
learnskill('sword_s4')
learnskill('sword_s5')
learnskill('sword_s6')
learnskill('sword_s7')
learnskill('sword_s8')
learnskill('sword_s9')
learnskill('sword_s10')
learnskill('sword_s11')
learnskill('sword_s12')
learnskill('sword_s13')
learnskill('sword_s15')
learnskill('sword_s16')
learnskill('sword_s17')
learnskill('sword_s18')
learnskill('sword_s19')
learnskill('sword_s20')
learnskill('sword_s21')
learnskill('magic_1')
learnskill('magic_2')
learnskill('magic_3')
learnskill('magic_4')
learnskill('magic_5')
learnskill('magic_s1')
learnskill('magic_s2')
learnskill('magic_s3')
learnskill('magic_s4')
learnskill('magic_s5')
learnskill('magic_s6')
learnskill('magic_s7')
learnskill('magic_s8')
learnskill('magic_s9')
learnskill('magic_s10')
learnskill('magic_s11')
learnskill('magic_s12')
learnskill('magic_s13')
learnskill('magic_s14')
learnskill('magic_s15')
learnskill('magic_s16')
learnskill('magic_s17')
learnskill('magic_s18')
learnskill('magic_s19')
learnskill('magic_s20')
learnskill('alchemy_s1')
learnskill('alchemy_s2')
learnskill('alchemy_s3')
learnskill('alchemy_s4')
learnskill('alchemy_s5')
learnskill('alchemy_s6')
learnskill('alchemy_s7')
learnskill('alchemy_s8')
learnskill('alchemy_s9')
learnskill('alchemy_s10')
learnskill('alchemy_s11')
learnskill('alchemy_s12')
learnskill('alchemy_s13')
learnskill('alchemy_s14')
learnskill('alchemy_s15')
learnskill('alchemy_s16')
learnskill('alchemy_s17')
learnskill('alchemy_s18')
learnskill('alchemy_s19')
learnskill('perk_1')
learnskill('perk_1_day_ability')
learnskill('perk_1_night_ability')
learnskill('perk_2')
learnskill('perk_3')
learnskill('perk_4')
learnskill('perk_5')
learnskill('perk_6')
learnskill('perk_7')
learnskill('perk_10')
learnskill('perk_11')
learnskill('perk_12')
}

{buffme('name',duration) - buffs Geralt with 'name' for 'duration' seconds
e.g. buffme('EET_Cat',600) - buffs Geralt with Catseye for 600 seconds
Buff Effects
buffme('EET_AbilityOnLowHealth',600)
buffme('EET_AdrenalineDrain',600)
buffme('EET_AirBoost',600)
buffme('EET_AirDrain',600)
buffme('EET_AirDrainDive',600)
buffme('EET_AutoAirRegen',600)
buffme('EET_AutoEssenceRegen',600)
buffme('EET_AutoMoraleRegen',600)
buffme('EET_AutoPanicRegen',600)
buffme('EET_AutoStaminaRegen',600)
buffme('EET_AutoSwimmingStaminaRegen',600)
buffme('EET_AutoVitalityRegen',600)
buffme('EET_AxiiGuardMe',600)
buffme('EET_BattleTrance',600)
buffme('EET_BlackBlood',600)
buffme('EET_Bleeding',600)
buffme('EET_BleedingTracking',600)
buffme('EET_Blindness',600)
buffme('EET_Blizzard',600)
buffme('EET_BoostedEssenceRegen',600)
buffme('EET_BoostedStaminaRegen',600)
buffme('EET_Burning',600)
buffme('EET_Cat',600)
buffme('EET_Choking',600)
buffme('EET_Confusion',600)
buffme('EET_CounterStrikeHit',600)
buffme('EET_DoTHPRegenReduce',600)
buffme('EET_DoppelgangerEssenceRegen',600)
buffme('EET_Drowning',600)
buffme('EET_Drunkenness',600)
buffme('EET_Edible',600)
buffme('EET_EnhancedArmor',600)
buffme('EET_EnhancedWeapon',600)
buffme('EET_Fact',600)
buffme('EET_FireAura',600)
buffme('EET_Frozen',600)
buffme('EET_FullMoon',600)
buffme('EET_GoldenOriole',600)
buffme('EET_HeavyKnockdown',600)
buffme('EET_Hypnotized',600)
buffme('EET_IgnorePain',600)
buffme('EET_Immobilized',600)
buffme('EET_KillerWhale',600)
buffme('EET_Knockdown',600)
buffme('EET_KnockdownTypeApplicator',600)
buffme('EET_LongStagger',600)
buffme('EET_LowHealth',600)
buffme('EET_MariborForest',600)
buffme('EET_Mutagen01',600) - Katakan
buffme('EET_Mutagen02',600) - Arachas
buffme('EET_Mutagen03',600) - Cockatrice
buffme('EET_Mutagen04',600) - Archgriffin
buffme('EET_Mutagen05',600) - Water Hag
buffme('EET_Mutagen06',600) - Nightwraith
buffme('EET_Mutagen07',600) - Ekimmara
buffme('EET_Mutagen08',600) - Chort
buffme('EET_Mutagen09',600) - Foglet
buffme('EET_Mutagen10',600) - Wyvern
buffme('EET_Mutagen11',600) - Doppler
buffme('EET_Mutagen12',600) - Troll
buffme('EET_Mutagen13',600) - Noonwraith
buffme('EET_Mutagen14',600) - Succubus
buffme('EET_Mutagen15',600) - Alghoul
buffme('EET_Mutagen16',600) - Fiend
buffme('EET_Mutagen17',600) - Forktail
buffme('EET_Mutagen18',600) - Grave Hag
buffme('EET_Mutagen19',600) - Wraith
buffme('EET_Mutagen20',600) - Earth Elemental
buffme('EET_Mutagen21',600) - Ekhidna
buffme('EET_Mutagen22',600) - Ancient Leshen
buffme('EET_Mutagen23',600) - Basilisk
buffme('EET_Mutagen24',600) - Werewolf
buffme('EET_Mutagen25',600) - Nekker Warrior
buffme('EET_Mutagen26',600) - Leshen
buffme('EET_Mutagen27',600) - Griffin
buffme('EET_Mutagen28',600) - Reliever
buffme('EET_OverEncumbered',600)
buffme('EET_Paralyzed',600)
buffme('EET_PetriPhiltre',600)
buffme('EET_PheromoneBear',600)
buffme('EET_PheromoneDrowner',600)
buffme('EET_PheromoneNekker',600)
buffme('EET_Poison',600)
buffme('EET_PoisonCritical',600)
buffme('EET_Pull',600)
buffme('EET_Ragdoll',600)
buffme('EET_ShrineAard',600)
buffme('EET_ShrineAxii',600)
buffme('EET_ShrineIgni',600)
buffme('EET_ShrineQuen',600)
buffme('EET_ShrineYrden',600)
buffme('EET_SilverDust',600)
buffme('EET_Slowdown',600)
buffme('EET_SlowdownAxii',600)
buffme('EET_SlowdownFrost',600)
buffme('EET_Snowstorm',600)
buffme('EET_SnowstormQ403',600)
buffme('EET_Stagger',600)
buffme('EET_StaggerAura',600)
buffme('EET_StaminaDrain',600)
buffme('EET_StaminaDrainSwimming',600)
buffme('EET_Swallow',600)
buffme('EET_Swarm',600)
buffme('EET_TawnyOwl',600)
buffme('EET_Thunderbolt',600)
buffme('EET_Toxicity',600)
buffme('EET_Undefined',600)
buffme('EET_Unused1',600)
buffme('EET_Unused2',600)
buffme('EET_VitalityDrain',600)
buffme('EET_WeatherBonus',600)
buffme('EET_WellFed',600)
buffme('EET_WellHydrated',600)
buffme('EET_WhiteHoney',600)
buffme('EET_WhiteRaffardDecoction',600)
buffme('EET_WitchHypnotized',600)
buffme('EET_WraithBlindness',600)
buffme('EET_YrdenHealthDrain',600)
addabl('Rune veles lesser _Stats') - +2% Sign intensity
addabl('Rune veles _Stats') - +3% Sign intensity
addabl('Rune veles greater _Stats') - +5% Sign intensity
}

{Character Looks
addHair1
addHair2
addHair3
addHairDLC1
addHairDLC2
addHairDLC3
setbeard(0,0) - shaved
setbeard(0,1) -
setbeard(0,2) -
setbeard(0,3) -
setbeard(0,4) - long beard
setbeard(1) - grows a beard
settattoo(0) - hides the blue stripe tattoo from the Witcher 2 quest "Hangover"
settattoo(1) - show the blue stripe tattoo from the Witcher 2 quest "Hangover"
shave - removes beard
WitcherHairstyle('1') - sets Hairstyle 1
WitcherHairstyle('2') - sets Hairstyle 2
WitcherHairstyle('3') - sets Hairstyle 3
setcustomhead('name') - changes Geralt's Head, removecustomhead to reset
e.g. setcustomhead('head_robbery') - Geralt with the robbery mask
}

{Geralt Heads
setcustomhead('head_0')
setcustomhead('head_0_tattoo')
setcustomhead('head_1')
setcustomhead('head_1_tattoo')
setcustomhead('head_2')
setcustomhead('head_2_tattoo')
setcustomhead('head_3')
setcustomhead('head_3_tattoo')
setcustomhead('head_4')
setcustomhead('head_4_tattoo')
setcustomhead('head_shaving1')
setcustomhead('head_shaving2')
setcustomhead('head_shaving3')
setcustomhead('head_robbery')
setcustomhead('head_robbery_tattoo')
setcustomhead('head_5')
setcustomhead('head_5_tattoo')
setcustomhead('head_6')
setcustomhead('head_6_tattoo')
setcustomhead('head_7')
setcustomhead('head_7_tattoo')
}

Inventory and Items
additem('name',#,slot) - adds "#" amount of items with the name "name" to the "slot" in players inventory. "#" and "slot" are nonmandatory.
removeitem('name') - removes the item "name" from the player
e.g. additem('Autogen Armor') adds 1 Kaer Mohren Armor to your inventory, around your level Range
e.g. additem('Torlara',1,1) adds 1 Tor Lara Sword to the Witchers Steelsword Slot

{Gwent Cards
additem('gwint_card_albrich')
additem('gwint_card_arachas_behemoth')
additem('gwint_card_arachas')
additem('gwint_card_arachas2')
additem('gwint_card_arachas3')
additem('gwint_card_archer_support')
additem('gwint_card_archer_support2')
additem('gwint_card_assire')
additem('gwint_card_avallach')
additem('gwint_card_ballista_officer')
additem('gwint_card_ballista')
additem('gwint_card_barclay')
additem('gwint_card_black_archer')
additem('gwint_card_black_archer2')
additem('gwint_card_blue_stripes')
additem('gwint_card_blue_stripes2')
additem('gwint_card_blue_stripes3')
additem('gwint_card_botchling')
additem('gwint_card_bruxa')
additem('gwint_card_cahir')
additem('gwint_card_catapult')
additem('gwint_card_catapult2')
additem('gwint_card_celaeno_harpy')
additem('gwint_card_ciaran')
additem('gwint_card_ciri')
additem('gwint_card_clear_sky')
additem('gwint_card_cockatrice')
additem('gwint_card_combat_engineer')
additem('gwint_card_crinfrid')
additem('gwint_card_crinfrid2')
additem('gwint_card_crinfrid3')
additem('gwint_card_crone_brewess')
additem('gwint_card_crone_weavess')
additem('gwint_card_crone_whispess')
additem('gwint_card_cynthia')
additem('gwint_card_dandelion')
additem('gwint_card_dennis')
additem('gwint_card_dijkstra')
additem('gwint_card_dol_archer')
additem('gwint_card_dol_dwarf')
additem('gwint_card_dol_dwarf2')
additem('gwint_card_dol_dwarf3')
additem('gwint_card_dol_infantry')
additem('gwint_card_dol_infantry2')
additem('gwint_card_dol_infantry3')
additem('gwint_card_draug')
additem('gwint_card_dummy')
additem('gwint_card_dun_banner_medic')
additem('gwint_card_earth_elemental')
additem('gwint_card_eithne')
additem('gwint_card_ekkima')
additem('gwint_card_elf_skirmisher')
additem('gwint_card_elf_skirmisher2')
additem('gwint_card_elf_skirmisher3')
additem('gwint_card_emhyr_bronze')
additem('gwint_card_emhyr_copper')
additem('gwint_card_emhyr_gold')
additem('gwint_card_emhyr_silver')
additem('gwint_card_emiel')
additem('gwint_card_endrega')
additem('gwint_card_eredin_bronze')
additem('gwint_card_eredin_copper')
additem('gwint_card_eredin_gold')
additem('gwint_card_eredin_silver')
additem('gwint_card_esterad')
additem('gwint_card_fiend')
additem('gwint_card_filavandrel')
additem('gwint_card_fire_elemental')
additem('gwint_card_fleder')
additem('gwint_card_fog')
additem('gwint_card_fogling')
additem('gwint_card_foltest_bronze')
additem('gwint_card_foltest_copper')
additem('gwint_card_foltest_gold')
additem('gwint_card_foltest_silver')
additem('gwint_card_forktail')
additem('gwint_card_francesca_bronze')
additem('gwint_card_francesca_copper')
additem('gwint_card_francesca_gold')
additem('gwint_card_francesca_silver')
additem('gwint_card_frightener')
additem('gwint_card_fringilla')
additem('gwint_card_frost')
additem('gwint_card_gargoyle')
additem('gwint_card_garkain')
additem('gwint_card_geralt')
additem('gwint_card_ghoul')
additem('gwint_card_ghoul2')
additem('gwint_card_ghoul3')
additem('gwint_card_grave_hag')
additem('gwint_card_griffin')
additem('gwint_card_harpy')
additem('gwint_card_havekar_nurse')
additem('gwint_card_havekar_nurse2')
additem('gwint_card_havekar_nurse3')
additem('gwint_card_havekar_support')
additem('gwint_card_havekar_support2')
additem('gwint_card_havekar_support3')
additem('gwint_card_heavy_zerri')
additem('gwint_card_horn')
additem('gwint_card_ice_giant')
additem('gwint_card_ida')
additem('gwint_card_imlerith')
additem('gwint_card_impera_brigade')
additem('gwint_card_impera_brigade2')
additem('gwint_card_impera_brigade3')
additem('gwint_card_impera_brigade4')
additem('gwint_card_iorveth')
additem('gwint_card_isengrim')
additem('gwint_card_kaedwen')
additem('gwint_card_kaedwen2')
additem('gwint_card_katakan')
additem('gwint_card_kayran')
additem('gwint_card_leshen')
additem('gwint_card_letho')
additem('gwint_card_mahakam')
additem('gwint_card_mahakam2')
additem('gwint_card_mahakam3')
additem('gwint_card_mahakam4')
additem('gwint_card_mahakam5')
additem('gwint_card_menno')
additem('gwint_card_milva')
additem('gwint_card_moorvran')
additem('gwint_card_morteisen')
additem('gwint_card_natalis')
additem('gwint_card_nausicaa')
additem('gwint_card_nausicaa2')
additem('gwint_card_nausicaa3')
additem('gwint_card_nekker')
additem('gwint_card_nekker2')
additem('gwint_card_nekker3')
additem('gwint_card_philippa')
additem('gwint_card_plague_maiden')
additem('gwint_card_poor_infantry')
additem('gwint_card_poor_infantry2')
additem('gwint_card_poor_infantry3')
additem('gwint_card_puttkammer')
additem('gwint_card_rain')
additem('gwint_card_rainfarn')
additem('gwint_card_renuald')
additem('gwint_card_riordain')
additem('gwint_card_rotten')
additem('gwint_card_saskia')
additem('gwint_card_scorch')
additem('gwint_card_shilard')
additem('gwint_card_siege_support')
additem('gwint_card_siege_tower')
additem('gwint_card_siegfried')
additem('gwint_card_stefan')
additem('gwint_card_stennis')
additem('gwint_card_sweers')
additem('gwint_card_thaler')
additem('gwint_card_tibor')
additem('gwint_card_toruviel')
additem('gwint_card_triss')
additem('gwint_card_vanhemar')
additem('gwint_card_vattier')
additem('gwint_card_vernon')
additem('gwint_card_vesemir')
additem('gwint_card_villen')
additem('gwint_card_vreemde')
additem('gwint_card_vrihedd_brigade')
additem('gwint_card_vrihedd_brigade2')
additem('gwint_card_vrihedd_cadet')
additem('gwint_card_werewolf')
additem('gwint_card_witch_hunters')
additem('gwint_card_wyvern')
additem('gwint_card_yaevinn')
additem('gwint_card_yennefer')
additem('gwint_card_young_emissary')
additem('gwint_card_young_emissary2')
additem('gwint_card_zerri')
additem('gwint_card_zoltan')
}

{Swords
additem('Dwarven silver sword 1')
additem('Dwarven silver sword 2')
additem('Dwarven sword 1')
additem('Dwarven sword 2')
additem('Elven silver sword 1')
additem('Elven silver sword 2')
additem('Gnomish silver sword 1')
additem('Gnomish silver sword 2')
additem('Gnomish sword 1')
additem('Gnomish sword 2')
additem('Inquisitor sword 1')
additem('Inquisitor sword 2')
additem('Long Steel Sword')
additem('Nilfgaardian sword 1')
additem('Nilfgaardian sword 2')
additem('Nilfgaardian sword 3')
additem('Nilfgaardian sword 4')
additem('No Mans Land sword 1 q2')
additem('No Mans Land sword 1')
additem('No Mans Land sword 2')
additem('No Mans Land sword 3')
additem('No Mans Land sword 4')
additem('Novigraadan sword 1')
additem('Novigraadan sword 2')
additem('Novigraadan sword 3')
additem('Novigraadan sword 4')
additem('Rusty Nilfgaardian sword')
additem('Rusty No Mans Land sword')
additem('Rusty Novigraadan sword')
additem('Rusty Skellige sword')
additem('Scoiatael sword 1')
additem('Scoiatael sword 2')
additem('Scoiatael sword 3')
additem('Scoiatael sword 4')
additem('Short Steel Sword')
additem('Short sword 1')
additem('Short sword 2')
additem('Silver sword 1')
additem('Silver sword 2')
additem('Silver sword 3')
additem('Silver sword 4')
additem('Silver sword 5')
additem('Silver sword 6')
additem('Silver sword 7')
additem('Silver sword 8')
additem('Skellige sword 1')
additem('Skellige sword 2')
additem('Skellige sword 4')
additem('sq304 Novigraadan sword 4')
additem('Wild Hunt sword 1')
additem('Wild Hunt sword 2')
additem('Wild Hunt sword 3')
additem('Wild Hunt sword 4')
additem('Witcher Silver Sword')
additem('Wooden sword')
}

{Crossbows
additem('Bear School Crossbow')
additem('Crossbow 1')
additem('Crossbow 2')
additem('Crossbow 3')
additem('Crossbow 4')
additem('Crossbow 5')
additem('Crossbow 6')
additem('Crossbow 7')
additem('Crossbow q206')
additem('Lynx School Crossbow')
}

{Relic Swords
additem('Abarad')
additem('Addandeith')
additem('Aerondight')
additem('Anathema')
additem('Angivare')
additem('Anth')
additem('Arainne')
additem('Arbitrator')
additem('Ardaenye')
additem('Ashrune')
additem('Azurewrath')
additem('Barbersurgeon')
additem('Beannshie')
additem('Blackunicorn')
additem('Bladeofys')
additem('Bloedeaedd')
additem('Bloodsword')
additem('Breathofthenorth')
additem('Caerme')
additem('Caroline')
additem('Cheesecutter')
additem('Cleaver')
additem('Dancer')
additem('Daystar')
additem('Deargdeith')
additem('Deireadh')
additem('Deithwen')
additem('Devine')
additem('Dyaebl')
additem('Fate')
additem('Forgottenvransword')
additem('Gloryofthenorth')
additem('Gwestog')
additem('Gwyhyr')
additem('Gynvael')
additem('Gynvaelaedd')
additem('Harpy')
additem('Harvall')
additem('Havcaaren')
additem('Headtaker')
additem('Hjalmar_Short_Steel_Sword')
additem('Inis')
additem('Karabela')
additem('Loathen')
additem('Longclaw')
additem('Lune')
additem('Moonblade')
additem('Mourner')
additem('Naevdeseidhe')
additem('Negotiator')
additem('Princessxenthiasword')
additem('Reachofthedamned')
additem('Robustswordofdolblathanna')
additem('Roseofaelirenn')
additem('Tlareg')
additem('Torlara')
additem('Torzirael')
additem('Ultimatum')
additem('Virgin')
additem('Vynbleidd')
additem('Weeper')
additem('WitcherSilverWolf')
additem('Wolf')
additem('Zerrikanterment')
}

{Crafted Weapons
additem('Arbitrator_crafted_Stats')
additem('Beannshie_crafted_Stats')
additem('Bear School silver sword 1')
additem('Bear School silver sword 2')
additem('Bear School silver sword 3')
additem('Bear School silver sword')
additem('Bear School steel sword 1')
additem('Bear School steel sword 2')
additem('Bear School steel sword 3')
additem('Bear School steel sword')
additem('Blackunicorn')
additem('Dwarven silver sword 1_crafted')
additem('Dwarven silver sword 2_crafted')
additem('Dwarven sword 1_crafted')
additem('Dwarven sword 2_crafted')
additem('Elven silver sword 1_crafted')
additem('Elven silver sword 2_crafted')
additem('Gnomish silver sword 1_crafted')
additem('Gnomish silver sword 2_crafted')
additem('Gnomish sword 1_crafted')
additem('Gnomish sword 2_crafted')
additem('Gryphon School silver sword 1')
additem('Gryphon School silver sword 2')
additem('Gryphon School silver sword 3')
additem('Gryphon School silver sword')
additem('Gryphon School steel sword 1')
additem('Gryphon School steel sword 2')
additem('Gryphon School steel sword 3')
additem('Gryphon School steel sword')
additem('Harpy')
additem('Inquisitor sword 1_crafted')
additem('Inquisitor sword 2_crafted')
additem('Longclaw')
additem('Lynx School silver sword 1')
additem('Lynx School silver sword 2')
additem('Lynx School silver sword 3')
additem('Lynx School silver sword')
additem('Lynx School steel sword 1')
additem('Lynx School steel sword 2')
additem('Lynx School steel sword 3')
additem('Lynx School steel sword')
additem('Negotiator')
additem('Nilfgaardian sword 1_crafted')
additem('Nilfgaardian sword 4_crafted')
additem('No Mans Land sword 1_crafted')
additem('No Mans Land sword 2_crafted')
additem('No Mans Land sword 3_crafted')
additem('No Mans Land sword 4_crafted')
additem('Novigraadan sword 1_crafted')
additem('Novigraadan sword 2_crafted')
additem('Novigraadan sword 3_crafted')
additem('Novigraadan sword 4_crafted')
additem('Scoiatael sword 1_crafted')
additem('Scoiatael sword 2_crafted')
additem('Scoiatael sword 3_crafted')
additem('Scoiatael sword 4_crafted')
additem('Short sword 1_crafted')
additem('Short sword 2_crafted')
additem('Silver sword 1_crafted')
additem('Silver sword 2_crafted')
additem('Silver sword 3_crafted')
additem('Silver sword 4_crafted')
additem('Silver sword 5_crafted')
additem('Silver sword 6_crafted')
additem('Silver sword 7_crafted')
additem('Skellige sword 1_crafted')
additem('Skellige sword 2_crafted')
additem('Skellige sword 3_crafted')
additem('Skellige sword 4_crafted')
additem('q402 Skellige sword 3') - Winter's Blade
additem('Viper School silver sword')
additem('Viper School steel sword')
additem('Weeper')
}

{NPC Weapons
additem('Bandit Shield 01')
additem('Bandit Shield 02')
additem('Bandit Shield 03')
additem('Bandit Shield 04')
additem('Baron Guard Shield 01')
additem('bow_01')
additem('bow_02')
additem('bow_elven_01')
additem('Caranthil Staff Broken')
additem('Caranthil Staff')
additem('crossbow_01')
additem('Imlerith Mace')
additem('Imlerith Shield')
additem('Nilfgaard Shield 01')
additem('Nilfgaard Shield 02')
additem('Novigrad Shield 01')
additem('Novigrad Shield 02')
additem('NPC CyprianWhorenson sword')
additem('NPC Dandelion Short Steel Sword')
additem('NPC Eredin Sword')
additem('NPC Hjalmar_Short_Steel_Sword')
additem('NPC Inquisitor sword 1')
additem('NPC Nilfgaardian sword 1')
additem('NPC Nilfgaardian sword 2')
additem('NPC Nilfgaardian sword 3')
additem('NPC Nilfgaardian sword 4')
additem('NPC No Mans Land sword 1 q2')
additem('NPC No Mans Land sword 1')
additem('NPC No Mans Land sword 2')
additem('NPC No Mans Land sword 3')
additem('NPC No Mans Land sword 4')
additem('NPC Novigraadan sword 1')
additem('NPC Novigraadan sword 2')
additem('NPC Novigraadan sword 3')
additem('NPC Novigraadan sword 4')
additem('NPC q402 Skellige sword 3')
additem('NPC Rusty Nilfgaardian sword')
additem('NPC Rusty No Mans Land sword')
additem('NPC Rusty Novigraadan sword')
additem('NPC Rusty Skellige sword')
additem('NPC Scoiatael sword 1')
additem('NPC Scoiatael sword 2')
additem('NPC Scoiatael sword 3')
additem('NPC Scoiatael sword 4')
additem('NPC Short sword 1')
additem('NPC Short sword 2')
additem('NPC Skellige sword 1')
additem('NPC Skellige sword 2')
additem('NPC Skellige sword 3')
additem('NPC Skellige sword 4')
additem('NPC Vesemir Silver Sword q403 upgrade')
additem('NPC Vesemir Silver Sword')
additem('NPC Vesemir Steel Sword')
additem('NPC Wildhunt sword 2')
additem('NPC Witcher Silver Sword q403 upgrade')
additem('NPC Witcher Silver Sword')
additem('NPC Witcher Steel Sword')
additem('Q1_axe1h_mq2024_spirit')
additem('Q1_axe1h')
additem('Q1_Axe2h')
additem('Q1_brokenSpear')
additem('Q1_cleaver1h')
additem('Q1_club1h')
additem('Q1_Guisarme2h')
additem('Q1_Halberd2h')
additem('Q1_Hammer2h')
additem('Q1_mace1h')
additem('Q1_Mage_Staff2h')
additem('Q1_pickaxe1h')
additem('Q1_Pitchfork2h')
additem('Q1_Shield')
additem('Q1_Spear2h')
additem('Q1_ZoltanAxe2h')
additem('Q2_axe1h')
additem('Q2_Axe2h')
additem('Q2_cleaver1h')
additem('Q2_Guisarme2h')
additem('Q2_Halberd2h')
additem('Q2_Hammer2h')
additem('Q2_mace1h')
additem('Q2_Mage_Staff2h')
additem('Q2_Spear2h')
additem('Q3_DwarvenAxe2h')
additem('Q3_DwarvenHammer2h')
additem('Q3_Mage_Staff2h')
additem('q505 crafted sword')
additem('Redanian Shield 01')
additem('Skellige Brokvar Shield 01')
additem('Skellige Craite Shield 01')
additem('Skellige Dimun Shield 01')
additem('Skellige Drummond Shield 01')
additem('Skellige Heymaey Shield 01')
additem('Skellige Tuiseach Shield 01')
additem('sq303_blunt_sword')
additem('Temeria Shield 01')
additem('Zireael Phantom Sword')
additem('Zireael Sword')
}

{Test Weapons
additem('Test Player Override Sword')
additem('guisarme_test')
additem('axe_test')
additem('mace_test')
additem('dwarven_hammer_test')
}

{Relic Armor
additem('Heavy armor 01r')
additem('Heavy armor 02r')
additem('Heavy armor 03r')
additem('Heavy armor 04r')
additem('Heavy armor 05r')
additem('Light armor 01r')
additem('Light armor 02r')
additem('Light armor 03r')
additem('Light armor 04r')
additem('Light armor 06r')
additem('Light armor 07r')
additem('Light armor 08r')
additem('Light armor 09r')
additem('Medium armor 01r')
additem('Medium armor 02r')
additem('Medium armor 03r')
additem('Medium armor 04r')
additem('Medium armor 05r')
additem('Medium armor 07r')
additem('Medium armor 10r')
additem('Medium armor 11r')
additem('Oathbreaker armor')
additem('q108 Medium armor 10 _Stats')
additem('Relic Heavy 3 armor')
additem('Shadaal armor')
additem('Shiadhal armor')
additem('Thyssen armor')
additem('Zireael armor')
}

{Body Armor
additem('Bear Armor 1')
additem('Bear Armor 2')
additem('Bear Armor 3')
additem('Bear Armor')
additem('Gryphon Armor 1')
additem('Gryphon Armor 2')
additem('Gryphon Armor 3')
additem('Gryphon Armor')
additem('Heavy armor 01_crafted')
additem('Heavy armor 02_crafted')
additem('Heavy armor 03_crafted')
additem('Heavy armor 04_crafted')
additem('Light armor 01_crafted')
additem('Light armor 02_crafted')
additem('Light armor 03_crafted')
additem('Light armor 04_crafted')
additem('Light armor 05_crafted')
additem('Light armor 06_crafted')
additem('Light armor 07_crafted')
additem('Light armor 08_crafted')
additem('Lynx Armor 1')
additem('Lynx Armor 2')
additem('Lynx Armor 3')
additem('Lynx Armor')
additem('Medium armor 01_crafted')
additem('Medium armor 02_crafted')
additem('Medium armor 03_crafted')
additem('Medium armor 04_crafted')
additem('Relic Heavy 3 crafted')
additem('Starting Armor 1')
additem('Thyssen armor crafted')
}

{Gloves
additem('Bear Gloves 1')
additem('Bear Gloves 2')
additem('Bear Gloves 3')
additem('Bear Gloves 4')
additem('Gloves 01_crafted')
additem('Gloves 02_crafted')
additem('Gloves 03_crafted')
additem('Gloves 04_crafted')
additem('Gryphon Gloves 1')
additem('Gryphon Gloves 2')
additem('Gryphon Gloves 3')
additem('Gryphon Gloves 4')
additem('Heavy gloves 01_crafted')
additem('Heavy gloves 02_crafted')
additem('Heavy gloves 03_crafted')
additem('Heavy gloves 04_crafted')
additem('Lynx Gloves 1')
additem('Lynx Gloves 2')
additem('Lynx Gloves 3')
additem('Lynx Gloves 4')
}

{Armor and Wearable Pants
additem('Bath Towel Pants 01')
additem('Bear Pants 1')
additem('Bear Pants 2')
additem('Bear Pants 3')
additem('Bear Pants 4')
additem('Ciri pants 01')
additem('Gryphon Pants 1')
additem('Gryphon Pants 2')
additem('Gryphon Pants 3')
additem('Gryphon Pants 4')
additem('Heavy pants 01_crafted')
additem('Heavy pants 01')
additem('Heavy pants 02_crafted')
additem('Heavy pants 02')
additem('Heavy pants 03_crafted')
additem('Heavy pants 03')
additem('Heavy pants 04_crafted')
additem('Heavy pants 04')
additem('Lynx Pants 1')
additem('Lynx Pants 2')
additem('Lynx Pants 3')
additem('Lynx Pants 4')
additem('Nilfgaardian Casual Pants')
additem('Pants 01 q2')
additem('Pants 01_crafted')
additem('Pants 01')
additem('Pants 02_crafted')
additem('Pants 02')
additem('Pants 03_crafted')
additem('Pants 03')
additem('Pants 04_crafted')
additem('Pants 04')
additem('Skellige Casual Pants 01')
additem('Skellige Casual Pants 02')
additem('Starting Pants')
additem('Wild Hunt pants 01')
additem('Yennefers Dress')
}

{Boots
additem('Bear Boots 1')
additem('Bear Boots 2')
additem('Bear Boots 3')
additem('Bear Boots 4')
additem('Boots 01 q2')
additem('Boots 01_crafted')
additem('Boots 01')
additem('Boots 012')
additem('Boots 02_crafted')
additem('Boots 02')
additem('Boots 022')
additem('Boots 03_crafted')
additem('Boots 03')
additem('Boots 032')
additem('Boots 04_crafted')
additem('Boots 04')
additem('Boots 05')
additem('Boots 06')
additem('Boots 07_crafted')
additem('Boots 07')
additem('Gryphon Boots 1')
additem('Gryphon Boots 2')
additem('Gryphon Boots 3')
additem('Gryphon Boots 4')
additem('Heavy boots 01_crafted')
additem('Heavy boots 01')
additem('Heavy boots 02_crafted')
additem('Heavy boots 02')
additem('Heavy boots 03_crafted')
additem('Heavy boots 03')
additem('Heavy boots 04_crafted')
additem('Heavy boots 04')
additem('Heavy boots 05')
additem('Heavy boots 06')
additem('Heavy boots 07_crafted')
additem('Heavy boots 07')
additem('Heavy boots 08_crafted')
additem('Heavy boots 08')
additem('Lynx Boots 1')
additem('Lynx Boots 2')
additem('Lynx Boots 3')
additem('Lynx Boots 4')
additem('Nilfgaardian casual shoes')
additem('Radovid boots 01')
additem('Skellige casual shoes')
additem('Starting Boots')
}

{Horse Upgrades
additem('Horse Bag 1')
additem('Horse Bag 2')
additem('Horse Bag 3')
additem('Horse Blinder 1')
additem('Horse Blinder 2')
additem('Horse Blinder 3')
additem('Horse Saddle 0')
additem('Horse Harness 0')
additem('Horse Hair 0')
additem('Horse Saddle 1')
additem('Horse Saddle 1v2')
additem('Horse Saddle 1v3')
additem('Horse Saddle 1v4')
additem('Horse Saddle 2')
additem('Horse Saddle 2v2')
additem('Horse Saddle 2v3')
additem('Horse Saddle 2v4')
additem('Horse Saddle 3')
additem('Horse Saddle 3v2')
additem('Horse Saddle 3v3')
additem('Horse Saddle 3v4')
additem('Horse Saddle 4')
additem('Horse skinned tail')
additem('Horse apex tail')
additem('Horse Universal Reins')
additem('Horse Cutscene Reins')
}

{Runes and Glyphs
additem('Glyph aard greater')
additem('Glyph aard lesser')
additem('Glyph aard')
additem('Glyph axii greater')
additem('Glyph axii lesser')
additem('Glyph axii')
additem('Glyph igni greater')
additem('Glyph igni lesser')
additem('Glyph igni')
additem('Glyph quen greater')
additem('Glyph quen lesser')
additem('Glyph quen')
additem('Glyph yrden greater')
additem('Glyph yrden lesser')
additem('Glyph yrden')
additem('Rune dazhbog greater')
additem('Rune dazhbog lesser')
additem('Rune dazhbog')
additem('Rune devana greater')
additem('Rune devana lesser')
additem('Rune devana')
additem('Rune elemental greater')
additem('Rune elemental lesser')
additem('Rune elemental')
additem('Rune morana greater')
additem('Rune morana lesser')
additem('Rune morana')
additem('Rune perun greater')
additem('Rune perun lesser')
additem('Rune perun')
additem('Rune quentin greater')
additem('Rune quentin lesser')
additem('Rune quentin')
additem('Rune stribog greater')
additem('Rune stribog lesser')
additem('Rune stribog')
additem('Rune svarog greater')
additem('Rune svarog lesser')
additem('Rune svarog')
additem('Rune triglav greater')
additem('Rune triglav lesser')
additem('Rune triglav')
additem('Rune veles greater')
additem('Rune veles lesser')
additem('Rune veles')
additem('Rune zoria greater')
additem('Rune zoria lesser')
additem('Rune zoria')
additem('Dazhbog rune rare')
additem('Dazhbog rune')
additem('Devana rune rare')
additem('Devana rune')
additem('Elemental rune rare')
additem('Elemental rune')
additem('Forgotten soul rare')
additem('Forgotten soul')
additem('Morana rune rare')
additem('Morana rune')
additem('Perun rune rare')
additem('Perun rune')
additem('Philosophers stone rare')
additem('Philosophers stone')
additem('Phosphorescent crystal rare')
additem('Phosphorescent crystal')
additem('Shattered core rare')
additem('Shattered core')
additem('Stribog rune rare')
additem('Stribog rune')
additem('Svarog rune rare')
additem('Svarog rune')
additem('Triglav rune rare')
additem('Triglav rune')
additem('Veles rune rare')
additem('Veles rune')
additem('Zoria rune rare')
additem('Zoria rune')
}

{Mutagens
additem('Greater mutagen red')
additem('Greater mutagen green')
additem('Greater mutagen blue')
additem('Mutagen red')
additem('Mutagen green')
additem('Mutagen blue')
additem('Lesser mutagen red')
additem('Lesser mutagen green')
additem('Lesser mutagen blue')
additem('Ancient Leshy mutagen')
additem('Arachas mutagen')
additem('Basilisk mutagen')
additem('Cockatrice mutagen')
additem('Czart mutagen')
additem('Dao mutagen')
additem('Doppler mutagen')
additem('Ekimma mutagen')
additem('Fiend mutagen')
additem('Fogling 1 mutagen')
additem('Fogling 2 mutagen')
additem('Forktail mutagen')
additem('Grave Hag mutagen')
additem('Gryphon mutagen')
additem('Katakan mutagen')
additem('Lamia mutagen')
additem('Leshy mutagen')
additem('Nekker Warrior mutagen')
additem('Nightwraith mutagen')
additem('Noonwraith mutagen')
additem('Succubus mutagen')
additem('Troll mutagen')
additem('Volcanic Gryphon mutagen')
additem('Water Hag mutagen')
additem('Werewolf mutagen')
additem('Wraith mutagen')
additem('Wyvern mutagen')
}

{Decorations and Masks
additem('Geralt mask 01') - Wolf Mask
additem('Geralt mask 02') - Harlequin Mask
additem('Geralt mask 03') - Bird Mask
NPC Masks
additem('Triss mask') - Triss Fox Mask, not equippable
additem('Dijkstra mask') - Dijkstra's Mask
additem('Voorhis mask') - Voorhis' Mask
additem('Albert mask') - Albert Vegelbuds Mask
additem('Ingrid mask') - Ingrid Vegelbuds Mask
additem('False Albert mask 01')
additem('False Albert mask 02')
additem('Frog mask')
additem('Luiza mask') - Luisa la Valette's Mask
additem('Witch Hunter mask') - Voorhis' Mask
additem('Dandelions crimson mask') - Crimson Avenger Mask
additem('Geralt robbery mask') - not visible, but 2 slots on it ğŸ™‚
additem('Guest mask man 01')
additem('Guest mask man 02')
additem('Guest mask man 03')
additem('Guest mask man 04')
additem('Guest mask man 05')
additem('Guest mask man 06')
additem('Guest mask man 07')
additem('Guest mask man 08')
additem('Guest mask man 09')
additem('Guest mask man 10')
additem('Guest mask man 11')
additem('Guest mask man 12')
additem('Guest mask man 13')
additem('Guest mask woman 01')
additem('Guest mask woman 02')
additem('Guest mask woman 03')
additem('Guest mask woman 04')
additem('Guest mask woman 05')
additem('Guest mask woman 06')
additem('Guest mask woman 07')
additem('Guest mask woman 08')
additem('Guest mask woman 09')
additem('Guest mask woman 10')
additem('Guest mask woman 11')
additem('Guest mask woman 12')
additem('Guest mask woman 13')
additem('Guest mask woman 14')
additem('Guest mask woman 15')
additem('Guest mask woman 16')
additem('Guest mask woman 17')
additem('Guest mask woman 18')
additem('Guest mask woman 19')
}

{Trophies
additem('mh101_cockatrice_trophy')
additem('mh102_arachas_trophy')
additem('mh103_nightwraith_trophy')
additem('mh104_ekimma_trophy')
additem('mh105_wyvern_trophy')
additem('mh106_gravehag_trophy')
additem('mh107_czart_trophy')
additem('mh108_fogling_trophy')
additem('mh201_cave_troll_trophy')
additem('mh202_nekker_warrior_trophy')
additem('mh203_water_hag_trophy')
additem('mh204_leshy_trophy')
additem('mh206_fiend_trophy')
additem('mh207_wraith_trophy')
additem('mh208_forktail_trophy')
additem('mh210_lamia_trophy')
additem('mh301_gryphon_trophy')
additem('mh302_leshy_trophy')
additem('mh303_succubus_trophy')
additem('mh304_katakan_trophy')
additem('mh305_doppler_trophy')
additem('mh306_dao_trophy')
additem('mh307_minion_trophy')
additem('mh308_noonwraith_trophy')
additem('mq0003_noonwraith_trophy')
additem('mq1051_wyvern_trophy')
additem('q002_griffin_trophy')
additem('sq108_griffin_trophy')
additem('Werewolf Trophy')
}

{Schematics and Recipes
additem('Arbitrator schematic')
additem('ArmorRepairKit_1 schematic')
additem('ArmorRepairKit_2 schematic')
additem('ArmorRepairKit_3 schematic')
additem('Beannshie schematic')
additem('Bear Armor schematic')
additem('Bear Boots schematic')
additem('Bear Gloves schematic')
additem('Bear Pants schematic')
additem('Bear School Crossbow schematic')
additem('Bear School silver sword schematic')
additem('Bear School silver sword Upgrade schematic 1')
additem('Bear School silver sword Upgrade schematic 2')
additem('Bear School silver sword Upgrade schematic 3')
additem('Bear School steel sword schematic')
additem('Bear School steel sword Upgrade schematic 1')
additem('Bear School steel sword Upgrade schematic 2')
additem('Bear School steel sword Upgrade schematic 3')
additem('Blackunicorn schematic')
additem('Blasting powder schematic')
additem('Boots 1 schematic')
additem('Boots 2 schematic')
additem('Boots 3 schematic')
additem('Boots 4 schematic')
additem('Boots 7 schematic')
additem('Dark iron ingot schematic')
additem('Dark steel ingot schematic 1')
additem('Dark steel ingot schematic')
additem('Dark steel plate schematic')
additem('Dark steel plate schematic')
additem('Draconide leather schematic')
additem('Dwarven silver sword 1 schematic')
additem('Dwarven silver sword 2 schematic')
additem('Dwarven sword 1 schematic')
additem('Dwarven sword 2 schematic')
additem('Dwimeryte ingot schematic 1')
additem('Dwimeryte ingot schematic')
additem('Dwimeryte ore schematic')
additem('Dwimeryte plate schematic')
additem('Elven silver sword 1 schematic')
additem('Elven silver sword 2 schematic')
additem('Gloves 1 schematic')
additem('Gloves 2 schematic')
additem('Gloves 3 schematic')
additem('Gloves 4 schematic')
additem('Glowing ingot schematic')
additem('Glyph aard greater schematic')
additem('Glyph aard lesser schematic')
additem('Glyph aard schematic')
additem('Glyph axii greater schematic')
additem('Glyph axii lesser schematic')
additem('Glyph axii schematic')
additem('Glyph igni greater schematic')
additem('Glyph igni lesser schematic')
additem('Glyph igni schematic')
additem('Glyph infusion greater schematic')
additem('Glyph infusion lesser schematic')
additem('Glyph quen greater schematic')
additem('Glyph quen lesser schematic')
additem('Glyph quen schematic')
additem('Glyph yrden greater schematic')
additem('Glyph yrden lesser schematic')
additem('Glyph yrden schematic')
additem('Gnomish silver sword 1 schematic')
additem('Gnomish silver sword 2 schematic')
additem('Gnomish sword 1 schematic')
additem('Gnomish sword 2 schematic')
additem('Gryphon Armor schematic')
additem('Gryphon Boots schematic')
additem('Gryphon Gloves schematic')
additem('Gryphon Pants schematic')
additem('Gryphon School silver sword schematic')
additem('Gryphon School silver sword Upgrade schematic 1')
additem('Gryphon School silver sword Upgrade schematic 2')
additem('Gryphon School silver sword Upgrade schematic 3')
additem('Gryphon School steel sword schematic')
additem('Gryphon School steel sword Upgrade schematic 1')
additem('Gryphon School steel sword Upgrade schematic 2')
additem('Gryphon School steel sword Upgrade schematic 3')
additem('Haft schematic')
additem('Hardened leather schematic')
additem('Hardened timber schematic')
additem('Harpy schematic')
additem('Heavy Armor 1 schematic')
additem('Heavy Armor 2 schematic')
additem('Heavy Armor 3 schematic')
additem('Heavy Armor 4 schematic')
additem('Heavy Boots 1 schematic')
additem('Heavy Boots 2 schematic')
additem('Heavy Boots 3 schematic')
additem('Heavy Boots 4 schematic')
additem('Heavy Boots 7 schematic')
additem('Heavy Boots 8 schematic')
additem('Heavy Gloves 1 schematic')
additem('Heavy Gloves 2 schematic')
additem('Heavy Gloves 3 schematic')
additem('Heavy Gloves 4 schematic')
additem('Heavy Pants 1 schematic')
additem('Heavy Pants 2 schematic')
additem('Heavy Pants 3 schematic')
additem('Heavy Pants 4 schematic')
additem('Infused crystal schematic')
additem('Infused dust schematic')
additem('Infused shard schematic')
additem('Inquisitor sword 1 schematic')
additem('Inquisitor sword 2 schematic')
additem('Iron ingot schematic')
additem('Leather schematic')
additem('Leather squares schematic')
additem('Light Armor 1 schematic')
additem('Light Armor 2 schematic')
additem('Light Armor 3 schematic')
additem('Light Armor 4 schematic')
additem('Light Armor 5 schematic')
additem('Light Armor 6 schematic')
additem('Light Armor 7 schematic')
additem('Light Armor 8 schematic')
additem('Linen schematic')
additem('Longclaw schematic')
additem('Lynx Armor schematic')
additem('Lynx Boots schematic')
additem('Lynx Gloves schematic')
additem('Lynx Pants schematic')
additem('Lynx School Crossbow schematic')
additem('Lynx School silver sword schematic')
additem('Lynx School silver sword Upgrade schematic 1')
additem('Lynx School silver sword Upgrade schematic 2')
additem('Lynx School silver sword Upgrade schematic 3')
additem('Lynx School steel sword schematic')
additem('Lynx School steel sword Upgrade schematic 1')
additem('Lynx School steel sword Upgrade schematic 2')
additem('Lynx School steel sword Upgrade schematic 3')
additem('Medium Armor 1 schematic')
additem('Medium Armor 2 schematic')
additem('Medium Armor 3 schematic')
additem('Medium Armor 4 schematic')
additem('Meteorite ingot schematic')
additem('Meteorite silver ingot schematic')
additem('Meteorite silver plate schematic')
additem('Negotiator schematic')
additem('Nilfgaardian sword 1 schematic')
additem('Nilfgaardian sword 4 schematic')
additem('No Mans Land sword 1 schematic')
additem('No Mans Land sword 2 schematic')
additem('No Mans Land sword 3 schematic')
additem('No Mans Land sword 4 schematic')
additem('Novigraadan sword 1 schematic')
additem('Novigraadan sword 4 schematic')
additem('Pants 1 schematic')
additem('Pants 2 schematic')
additem('Pants 3 schematic')
additem('Pants 4 schematic')
additem('Relic Heavy 3 schematic')
additem('Resin schematic')
additem('Rune dazhbog greater schematic')
additem('Rune dazhbog lesser schematic')
additem('Rune dazhbog schematic')
additem('Rune devana greater schematic')
additem('Rune devana lesser schematic')
additem('Rune devana schematic')
additem('Rune elemental greater schematic')
additem('Rune elemental lesser schematic')
additem('Rune elemental schematic')
additem('Rune morana greater schematic')
additem('Rune morana lesser schematic')
additem('Rune morana schematic')
additem('Rune perun greater schematic')
additem('Rune perun lesser schematic')
additem('Rune perun schematic')
additem('Rune stribog greater schematic')
additem('Rune stribog lesser schematic')
additem('Rune stribog schematic')
additem('Rune svarog greater schematic')
additem('Rune svarog lesser schematic')
additem('Rune svarog schematic')
additem('Rune triglav greater schematic')
additem('Rune triglav lesser schematic')
additem('Rune triglav schematic')
additem('Rune veles greater schematic')
additem('Rune veles lesser schematic')
additem('Rune veles schematic')
additem('Rune zoria greater schematic')
additem('Rune zoria lesser schematic')
additem('Rune zoria schematic')
additem('Runestone greater schematic')
additem('Runestone lesser schematic')
additem('Scoiatael sword 2 schematic')
additem('Scoiatael sword 3 schematic')
additem('Short sword 1 schematic')
additem('Short sword 2 schematic')
additem('Silk schematic')
additem('Silver ingot schematic 1')
additem('Silver ingot schematic')
additem('Silver ore schematic')
additem('Silver plate schematic')
additem('Silver sword 1 schematic')
additem('Silver sword 2 schematic')
additem('Silver sword 3 schematic')
additem('Silver sword 4 schematic')
additem('Silver sword 6 schematic')
additem('Silver sword 7 schematic')
additem('Skellige sword 1 schematic')
additem('Skellige sword 2 schematic')
additem('Smithing tools dwarven schematic')
additem('Smithing tools elven schematic')
additem('Smithing tools gnomish schematic')
additem('Smithing tools schematic')
additem('Starting Armor Upgrade schematic 1')
additem('Steel ingot schematic 1')
additem('Steel ingot schematic')
additem('Steel plate schematic')
additem('String schematic')
additem('Thread schematic')
additem('Thyssen Armor schematic')
additem('Viper Silver sword schematic')
additem('Viper Steel sword schematic')
additem('WeaponRepairKit_1 schematic')
additem('WeaponRepairKit_2 schematic')
additem('WeaponRepairKit_3 schematic')
additem('Weeper schematic')
additem('Whetstone dwarven schematic')
additem('Whetstone elven schematic')
additem('Whetstone gnomish schematic')
additem('Witcher Bear Boots Upgrade schematic 1')
additem('Witcher Bear Boots Upgrade schematic 2')
additem('Witcher Bear Boots Upgrade schematic 3')
additem('Witcher Bear Gloves Upgrade schematic 1')
additem('Witcher Bear Gloves Upgrade schematic 2')
additem('Witcher Bear Gloves Upgrade schematic 3')
additem('Witcher Bear Jacket Upgrade schematic 1')
additem('Witcher Bear Jacket Upgrade schematic 2')
additem('Witcher Bear Jacket Upgrade schematic 3')
additem('Witcher Bear Pants Upgrade schematic 1')
additem('Witcher Bear Pants Upgrade schematic 2')
additem('Witcher Bear Pants Upgrade schematic 3')
additem('Witcher Gryphon Boots Upgrade schematic 1')
additem('Witcher Gryphon Boots Upgrade schematic 2')
additem('Witcher Gryphon Boots Upgrade schematic 3')
additem('Witcher Gryphon Gloves Upgrade schematic 1')
additem('Witcher Gryphon Gloves Upgrade schematic 2')
additem('Witcher Gryphon Gloves Upgrade schematic 3')
additem('Witcher Gryphon Jacket Upgrade schematic 1')
additem('Witcher Gryphon Jacket Upgrade schematic 2')
additem('Witcher Gryphon Jacket Upgrade schematic 3')
additem('Witcher Gryphon Pants Upgrade schematic 1')
additem('Witcher Gryphon Pants Upgrade schematic 2')
additem('Witcher Gryphon Pants Upgrade schematic 3')
additem('Witcher Lynx Boots Upgrade schematic 1')
additem('Witcher Lynx Boots Upgrade schematic 2')
additem('Witcher Lynx Boots Upgrade schematic 3')
additem('Witcher Lynx Gloves Upgrade schematic 1')
additem('Witcher Lynx Gloves Upgrade schematic 2')
additem('Witcher Lynx Gloves Upgrade schematic 3')
additem('Witcher Lynx Jacket Upgrade schematic 1')
additem('Witcher Lynx Jacket Upgrade schematic 2')
additem('Witcher Lynx Jacket Upgrade schematic 3')
additem('Witcher Lynx Pants Upgrade schematic 1')
additem('Witcher Lynx Pants Upgrade schematic 2')
additem('Witcher Lynx Pants Upgrade schematic 3')
}

{Books
additem('Armor maintenance')
additem('Beasts vol 1')
additem('Beasts vol 2')
additem('Boat vol 1')
additem('Boat vol 2')
additem('Book of Arachases')
additem('Cursed Monsters vol 1')
additem('Cursed Monsters vol 2')
additem('Draconides vol 1')
additem('Draconides vol 2')
additem('flotsam_experiment')
additem('Gear improvement')
additem('Glossary Temerian Dynasty')
additem('gp_prologue_bandit_note01')
additem('gp_prologue_bandit_note02')
additem('gp_prologue_bandit_note03')
additem('gp_prologue_cultist_note01')
additem('gp_prologue_cultist_note02')
additem('Horse vol 1')
additem('Horse vol 2')
additem('Hybrid Monsters vol 1')
additem('Hybrid Monsters vol 2')
additem('Insectoids vol 1')
additem('Insectoids vol 2')
additem('Jacob of Varazze Chronicles')
additem('Journey into the mind')
additem('lore_about_the_fourth_witch')
additem('lore_aleksanders_notes')
additem('lore_an_seidhe_and_aen_elle')
additem('lore_basics_of_magic')
additem('lore_bells_of_beauclair')
additem('lore_brother_adalbert_bestiary')
additem('lore_cirilla_of_cintra')
additem('lore_conjunction_of_spheres')
additem('lore_cult_of_freyia')
additem('lore_cult_of_hemdall')
additem('lore_druids')
additem('lore_elder_blood')
additem('lore_elven_legends')
additem('lore_elven_ruins')
additem('lore_elven_sages')
additem('lore_fall_of_wyzima')
additem('lore_fate_of_temeria')
additem('lore_goetia')
additem('lore_hydromancy')
additem('lore_imperial_edict_i')
additem('lore_imperial_edict_ii')
additem('lore_inteligence_report_about_ciri')
additem('lore_journals_from_urskar_1')
additem('lore_journals_from_urskar_2')
additem('lore_journals_from_urskar_3')
additem('lore_journals_from_urskar_4')
additem('lore_journals_from_urskar_5')
additem('lore_journals_from_urskar_6')
additem('lore_journals_from_urskar_7')
additem('lore_kovir')
additem('lore_last_wish')
additem('lore_lodge_of_sorceresses')
additem('lore_monstrum')
additem('lore_naglfar_demonic_drakkar')
additem('lore_necromancy')
additem('lore_nilfgaardian_empire')
additem('lore_nilfgaardian_history_book')
additem('lore_nilfgaardian_royal_dynasty')
additem('lore_nilfgaardian_transport_orders')
additem('lore_non_humans')
additem('lore_novigrad')
additem('lore_oneiromancy')
additem('lore_oxenfurt')
additem('lore_polymorphism')
additem('lore_popiels_journal')
additem('lore_principles_of_eternal_fire')
additem('lore_prophecy_of_ithlinne')
additem('lore_radovid_propaganda_pamphlet')
additem('lore_radovids_rise_to_power')
additem('lore_ragnarok')
additem('lore_redania')
additem('lore_redanian_secret_service')
additem('lore_sands_of_zerrikania')
additem('lore_skellige_heroes_broddr')
additem('lore_skellige_heroes_grymmdjarr')
additem('lore_skellige_heroes_modolf')
additem('lore_skellige_heroes_otkell')
additem('lore_skellige_heroes_sove')
additem('lore_skellige_heroes_tyr')
additem('lore_skellige_island')
additem('lore_study_on_white_cold')
additem('lore_summit_of_loc_muinne')
additem('lore_the_great_four')
additem('lore_theory_of_spheres')
additem('lore_third_war_with_nilfgaard')
additem('lore_tyromancy')
additem('lore_unfinished_war_annals')
additem('lore_velen')
additem('lore_war_between_astrals')
additem('lore_wars_with_nilfgaard')
additem('lore_wild_hunt')
additem('lore_witch_hunters')
additem('lore_witcher_signs')
additem('lore_witchers')
additem('lore_yennefer_journals')
additem('lw_bm6_merchant_note')
additem('lw_cb17_bandits_note')
additem('lw_cp13_bandit_note')
additem('lw_cp13_refugee_note')
additem('lw_cp14_bandit_note')
additem('lw_cp14_child_note')
additem('lw_cp33_treasure_note')
additem('lw_cp36_note')
additem('lw_cp39_captains_log')
additem('lw_de_wett_note')
additem('lw_de11_note')
additem('lw_de32_treasure_note')
additem('lw_gf2_white_note')
additem('lw_gr_poi_042_letter')
additem('lw_gr12_ferry_man_note')
additem('lw_gr13_poppy_slaver_note')
additem('lw_gr13_slaver_note')
additem('lw_gr15_bandits_note')
additem('lw_gr15_ghouls_note')
additem('lw_gr29_bandit_note')
additem('lw_gr34_note')
additem('lw_gr39_note')
additem('lw_gr40_note')
additem('lw_gr41_note')
additem('lw_gr7_soldiers_note')
additem('lw_hs2_bandit_note')
additem('lw_hs2_scoiatael_note')
additem('lw_mp4_merchant_note')
additem('lw_prologue_fallen_soldier_letter01')
additem('lw_prologue_temerian_loot_manifest')
additem('lw_prologue_temerian_treasure_note')
additem('lw_sb12_pirate_note')
additem('lw_sb13_smugglers_note')
additem('lw_sb14_fisherman_letter')
additem('lw_sb14_pirate_note')
additem('lw_sb18_camps_note')
additem('lw_sb2_base_camp_map')
additem('lw_sb2_base_camp_note')
additem('lw_sb2_sunken_ships_map')
additem('lw_sb2_sunken_ships_note')
additem('lw_sb20_chest_note')
additem('lw_sb24_note')
additem('lw_sb3_camps_note')
additem('lw_sb3_giggler_note_pirates')
additem('lw_sb3_giggler_note_workers')
additem('lw_sb5_giggler_leader_note')
additem('lw_sk_poi_005_treasure_note')
additem('lw_sk_poi_050_note')
additem('lw_sk_poi_056_note')
additem('lw_sk16_village_note')
additem('lw_sk25_bandits_note')
additem('lw_sk25_blood_countess_note')
additem('lw_sk3_ship_note')
additem('lw_sk30_villager_note')
additem('lw_sk31_note')
additem('lw_sk32_note')
additem('lw_sk38_treasure_note')
additem('lw_sk4_note')
additem('lw_sk41_prison_island_note')
additem('lw_sk42_treasure_note')
additem('lw_sk57_treasure_note')
additem('lw_sk86_guards_note')
additem('lw_sk86_old_mans_note')
additem('lw_tm_underwater_dungeon_note')
additem('lw_tm12_bandit_note')
additem('lw_tm15_treasure_hunter_note')
additem('lw_tm5_villager_note')
additem('lw_tm6_note')
additem('Magical Monsters vol 1')
additem('Magical Monsters vol 2')
additem('mq1051_orders_note')
additem('Necronomicon')
additem('Necrophage vol 1')
additem('Necrophage vol 2')
additem('Nilfgard arms and tactics')
additem('noon_shadow_loot_note')
additem('Norther Kingdoms arms and tactics')
additem('Ogres vol 1')
additem('Ogres vol 2')
additem('Orders from Shilard')
additem('Poems of Gonzal de Verceo')
additem('poi_telescope_note')
additem('poi_temerian_treasure_note')
additem('Relict Monsters vol 1')
additem('Relict Monsters vol 2')
additem('sk48_splintered_ships_note')
additem('Skelige arms and tactics')
additem('Specters vol 1')
additem('Specters vol 2')
additem('Theatre Glossary vol 1')
additem('Theatre Glossary vol 2')
additem('Vampires vol 1')
additem('Vampires vol 2')
additem('Weapon maintenance')
additem('Wild Hunt')
}

{Notices
additem('br201_notice')
additem('br202_notice')
additem('br301_notice')
additem('br302_notice')
additem('cg_notice_baron')
additem('cg_notice_mousesack')
additem('cg_notice_sq306_maverick')
additem('cg_notice_stjepan')
additem('cg_notice_vivaldi')
additem('ff100_notice')
additem('ff200_notice')
additem('ff300_notice')
additem('hr101_notice')
additem('hr200_notice')
additem('item_name_mq1051_contract')
additem('item_name_mq2052_contract')
additem('item_name_mq3031_notice')
additem('item_name_sq201_werewolf_contract')
additem('item_name_sq210_notice')
additem('mh101_contract')
additem('mh102_contract')
additem('mh103_contract')
additem('mh104_contract')
additem('mh106_contract')
additem('mh107_contract')
additem('mh108_contract')
additem('mh201_contract')
additem('mh202_contract')
additem('mh203_contract')
additem('mh206_contract')
additem('mh207_contract')
additem('mh210_contract')
additem('mh401_contract')
additem('mh402_contract')
additem('mh403_contract')
additem('mh404_contract')
additem('mh405_contract')
additem('mh406_contract')
additem('mh407_contract')
additem('mh408_contract')
additem('mq0001_contract')
additem('mq0003_contract')
additem('mq1002_3012_notice')
additem('mq1006_notice')
additem('mq1011_notice')
additem('mq1013_notice')
additem('mq1016_notice')
additem('mq1022_notice')
additem('mq1043_notice')
additem('mq1050_notice')
additem('mq2001_notice_board_holmstein')
additem('mq2001_notice_board_kaer_trolde')
additem('mq2030_nithing')
additem('poi_bandit_camp_3_note')
additem('q301_notice_haunted_house')
additem('sq102_contract')
additem('sq104_werewolf')
additem('sq106_name_ekimma_contract')
additem('sq108_griffon_contract')
additem('sq204_forest_spirit_contract')
additem('sq305_notice')
}

{Alchemy Potions
additem('Black Blood 1')
additem('Black Blood 2')
additem('Black Blood 3')
additem('Blizzard 1')
additem('Blizzard 2')
additem('Blizzard 3')
additem('Cat 1')
additem('Cat 2')
additem('Cat 3')
additem('Clearing Potion')
additem('Full Moon 1')
additem('Full Moon 2')
additem('Full Moon 3')
additem('Golden Oriole 1')
additem('Golden Oriole 2')
additem('Golden Oriole 3')
additem('Killer Whale 1')
additem('Maribor Forest 1')
additem('Maribor Forest 2')
additem('Maribor Forest 3')
additem('Petri Philtre 1')
additem('Petri Philtre 2')
additem('Petri Philtre 3')
additem('Pheromone Potion Bear 1')
additem('Pheromone Potion Drowner 1')
additem('Pheromone Potion Nekker 1')
additem('Pops Antidote')
additem('Swallow 1')
additem('Swallow 2')
additem('Swallow 3')
additem('Tawny Owl 1')
additem('Tawny Owl 2')
additem('Tawny Owl 3')
additem('Thunderbolt 1')
additem('Thunderbolt 2')
additem('Thunderbolt 3')
additem('Trial Potion Kit')
additem('Village drink')
additem('White Honey 1')
additem('White Honey 2')
additem('White Honey 3')
additem('White Raffards Decoction 1')
additem('White Raffards Decoction 2')
additem('White Raffards Decoction 3')
}

{Alchemy Oils
additem('Beast Oil 1')
additem('Beast Oil 2')
additem('Beast Oil 3')
additem('Cursed Oil 1')
additem('Cursed Oil 2')
additem('Cursed Oil 3')
additem('Draconide Oil 1')
additem('Draconide Oil 2')
additem('Draconide Oil 3')
additem('Hanged Man Venom 1')
additem('Hanged Man Venom 2')
additem('Hanged Man Venom 3')
additem('Hybrid Oil 1')
additem('Hybrid Oil 2')
additem('Hybrid Oil 3')
additem('Insectoid Oil 1')
additem('Insectoid Oil 2')
additem('Insectoid Oil 3')
additem('Magicals Oil 1')
additem('Magicals Oil 2')
additem('Magicals Oil 3')
additem('Necrophage Oil 1')
additem('Necrophage Oil 2')
additem('Necrophage Oil 3')
additem('Ogre Oil 1')
additem('Ogre Oil 2')
additem('Ogre Oil 3')
additem('Relic Oil 1')
additem('Relic Oil 2')
additem('Relic Oil 3')
additem('Specter Oil 1')
additem('Specter Oil 2')
additem('Specter Oil 3')
additem('Vampire Oil 1')
additem('Vampire Oil 2')
additem('Vampire Oil 3')
}

{Alchemy Petards
additem('Alkali Bomb 1')
additem('Alkali Bomb 2')
additem('Alkali Bomb 3')
additem('Dancing Star 1')
additem('Dancing Star 2')
additem('Dancing Star 3')
additem('Devils Puffball 1')
additem('Devils Puffball 2')
additem('Devils Puffball 3')
additem('Dragons Dream 1')
additem('Dragons Dream 2')
additem('Dragons Dream 3')
additem('Dwimeritium Bomb 1')
additem('Dwimeritium Bomb 2')
additem('Dwimeritium Bomb 3')
additem('Fungi Bomb 1')
additem('Glue Bomb 1')
additem('Grapeshot 1')
additem('Grapeshot 2')
additem('Grapeshot 3')
additem('Salt Bomb 1')
additem('Samum 1')
additem('Samum 2')
additem('Samum 3')
additem('Shrapnel Bomb 1')
additem('Silver Dust Bomb 1')
additem('Silver Dust Bomb 2')
additem('Silver Dust Bomb 3')
additem('Snow Ball')
additem('Tutorial Bomb')
additem('Virus Bomb 1')
additem('White Frost 1')
additem('White Frost 2')
additem('White Frost 3')
}

{Alchemy Mutagens
additem('Greater mutagen red')
additem('Greater mutagen green')
additem('Greater mutagen blue')
additem('Mutagen red')
additem('Mutagen green')
additem('Mutagen blue')
additem('Lesser mutagen red')
additem('Lesser mutagen green')
additem('Lesser mutagen blue')
additem('Ancient Leshy mutagen')
additem('Arachas mutagen')
additem('Basilisk mutagen')
additem('Cockatrice mutagen')
additem('Czart mutagen')
additem('Dao mutagen')
additem('Doppler mutagen')
additem('Ekimma mutagen')
additem('Fiend mutagen')
additem('Fogling 1 mutagen')
additem('Fogling 2 mutagen')
additem('Forktail mutagen')
additem('Grave Hag mutagen')
additem('Gryphon mutagen')
additem('Katakan mutagen')
additem('Lamia mutagen')
additem('Leshy mutagen')
additem('Nekker Warrior mutagen')
additem('Nightwraith mutagen')
additem('Noonwraith mutagen')
additem('Succubus mutagen')
additem('Troll mutagen')
additem('Volcanic Gryphon mutagen')
additem('Water Hag mutagen')
additem('Werewolf mutagen')
additem('Wraith mutagen')
additem('Wyvern mutagen')
}

{Alchemy Substances
additem('Aether')
additem('Albedo')
additem('Hydragenum')
additem('Nigredo')
additem('Quebrith')
additem('Rebis')
additem('Rubedo')
additem('Vermilion')
additem('Vitriol')
}

{Alchemy Recipes
additem('Recipe for Bear Pheromone Potion 1')
additem('Recipe for Black Blood 1')
additem('Recipe for Black Blood 2')
additem('Recipe for Black Blood 3')
additem('Recipe for Blizzard 1')
additem('Recipe for Blizzard 2')
additem('Recipe for Blizzard 3')
additem('Recipe for Cat 1')
additem('Recipe for Cat 2')
additem('Recipe for Cat 3')
additem('Recipe for Czart Lure')
additem('Recipe for Drowner Pheromone Potion 1')
additem('Recipe for Full Moon 1')
additem('Recipe for Full Moon 2')
additem('Recipe for Full Moon 3')
additem('Recipe for Golden Oriole 1')
additem('Recipe for Golden Oriole 2')
additem('Recipe for Golden Oriole 3')
additem('Recipe for Killer Whale 1')
additem('Recipe for Maribor Forest 1')
additem('Recipe for Maribor Forest 2')
additem('Recipe for Maribor Forest 3')
additem('Recipe for Nekker Pheromone Potion 1')
additem('Recipe for Petris Philtre 1')
additem('Recipe for Petris Philtre 2')
additem('Recipe for Petris Philtre 3')
additem('Recipe for Pops Antidote')
additem('Recipe for Swallow 1')
additem('Recipe for Swallow 2')
additem('Recipe for Swallow 3')
additem('Recipe for Tawny Owl 1')
additem('Recipe for Tawny Owl 2')
additem('Recipe for Tawny Owl 3')
additem('Recipe for Thunderbolt 1')
additem('Recipe for Thunderbolt 2')
additem('Recipe for Thunderbolt 3')
additem('Recipe for Trial Potion Kit')
additem('Recipe for White Honey 1')
additem('Recipe for White Honey 2')
additem('Recipe for White Honey 3')
additem('Recipe for White Raffards Decoction 1')
additem('Recipe for White Raffards Decoction 2')
additem('Recipe for White Raffards Decoction 3')
additem('Recipe for Beast Oil 1')
additem('Recipe for Beast Oil 2')
additem('Recipe for Beast Oil 3')
additem('Recipe for Cursed Oil 1')
additem('Recipe for Cursed Oil 2')
additem('Recipe for Cursed Oil 3')
additem('Recipe for Hanged Man Venom 1')
additem('Recipe for Hanged Man Venom 2')
additem('Recipe for Hanged Man Venom 3')
additem('Recipe for Hybrid Oil 1')
additem('Recipe for Hybrid Oil 2')
additem('Recipe for Hybrid Oil 3')
additem('Recipe for Insectoid Oil 1')
additem('Recipe for Insectoid Oil 2')
additem('Recipe for Insectoid Oil 3')
additem('Recipe for Magicals Oil 1')
additem('Recipe for Magicals Oil 2')
additem('Recipe for Magicals Oil 3')
additem('Recipe for Necrophage Oil 1')
additem('Recipe for Necrophage Oil 2')
additem('Recipe for Necrophage Oil 3')
additem('Recipe for Specter Oil 1')
additem('Recipe for Specter Oil 2')
additem('Recipe for Specter Oil 3')
additem('Recipe for Vampire Oil 1')
additem('Recipe for Vampire Oil 2')
additem('Recipe for Vampire Oil 3')
additem('Recipe for Draconide Oil 1')
additem('Recipe for Draconide Oil 2')
additem('Recipe for Draconide Oil 3')
additem('Recipe for Ogre Oil 1')
additem('Recipe for Ogre Oil 2')
additem('Recipe for Ogre Oil 3')
additem('Recipe for Relic Oil 1')
additem('Recipe for Relic Oil 2')
additem('Recipe for Relic Oil 3')
additem('Recipe for Dancing Star 1')
additem('Recipe for Dancing Star 2')
additem('Recipe for Dancing Star 3')
additem('Recipe for Devils Puffball 1')
additem('Recipe for Devils Puffball 2')
additem('Recipe for Devils Puffball 3')
additem('Recipe for Dragons Dream 1')
additem('Recipe for Dragons Dream 2')
additem('Recipe for Dragons Dream 3')
additem('Recipe for Dwimeritium Bomb 1')
additem('Recipe for Dwimeritium Bomb 2')
additem('Recipe for Dwimeritium Bomb 3')
additem('Recipe for Fungi Bomb 1')
additem('Recipe for Glue Bomb 1')
additem('Recipe for Grapeshot 1')
additem('Recipe for Grapeshot 2')
additem('Recipe for Grapeshot 3')
additem('Recipe for Salt Bomb 1')
additem('Recipe for Samum 1')
additem('Recipe for Samum 2')
additem('Recipe for Samum 3')
additem('Recipe for Shrapnel Bomb 1')
additem('Recipe for Silver Dust Bomb 1')
additem('Recipe for Silver Dust Bomb 2')
additem('Recipe for Silver Dust Bomb 3')
additem('Recipe for Virus Bomb 1')
additem('Recipe for White Frost 1')
additem('Recipe for White Frost 2')
additem('Recipe for White Frost 3')
additem('Recipe for Mutagen red')
additem('Recipe for Mutagen green')
additem('Recipe for Mutagen blue')
additem('Recipe for Greater mutagen red')
additem('Recipe for Greater mutagen green')
additem('Recipe for Greater mutagen blue')
additem('Recipe for Mutagen 1') - Katakan
additem('Recipe for Mutagen 2') - Arachas
additem('Recipe for Mutagen 3') - Cockatrice
additem('Recipe for Mutagen 4') - Archgriffin
additem('Recipe for Mutagen 5') - Water Hag
additem('Recipe for Mutagen 6') - Nightwraith
additem('Recipe for Mutagen 7') - Ekimmara
additem('Recipe for Mutagen 8') - Chort
additem('Recipe for Mutagen 9') - Foglet
additem('Recipe for Mutagen 10') - Wyvern
additem('Recipe for Mutagen 11') - Doppler
additem('Recipe for Mutagen 12') - Troll
additem('Recipe for Mutagen 13') - Noonwraith
additem('Recipe for Mutagen 14') - Succubus
additem('Recipe for Mutagen 15') - Alghoul
additem('Recipe for Mutagen 16') - Fiend
additem('Recipe for Mutagen 17') - Forktail
additem('Recipe for Mutagen 18') - Grave Hag
additem('Recipe for Mutagen 19') - Wraith
additem('Recipe for Mutagen 20') - Earth Elemental
additem('Recipe for Mutagen 21') - Ekhidna
additem('Recipe for Mutagen 22') - Ancient Leshen
additem('Recipe for Mutagen 23') - Basilisk
additem('Recipe for Mutagen 24') - Werewolf
additem('Recipe for Mutagen 25') - Nekker Warrior
additem('Recipe for Mutagen 26') - Leshen
additem('Recipe for Mutagen 27') - Griffin
additem('Recipe for Mutagen 28') - Reliever
additem('Recipe for Aether')
additem('Recipe for Albedo')
additem('Recipe for Hydragenum')
additem('Recipe for Nigredo')
additem('Recipe for Quebrith')
additem('Recipe for Rebis')
additem('Recipe for Rubedo')
additem('Recipe for Vermilion')
additem('Recipe for Vitriol')
}

{Drinks and Food
additem('Alcohest')
additem('Apple juice')
additem('Apple')
additem('Baked apple')
additem('Baked potato')
additem('Banana')
additem('Beauclair White')
additem('Bell pepper')
additem('Blueberries')
additem('Bottled water')
additem('Bread')
additem('Bun')
additem('Burned bread')
additem('Burned bun')
additem('Butter Bandalura')
additem('Candy')
additem('Cheese')
additem('Cherry cordia')
additem('Cherry Cordial')
additem('Chicken leg')
additem('Chicken sandwich')
additem('Chicken')
additem('Chips')
additem('Cows milk')
additem('Cucumber')
additem('Dijkstra Dry')
additem('Dried fruit and nuts')
additem('Dried fruit')
additem('Dwarven spirit')
additem('Egg')
additem('Empty bottle')
additem('Erveluce')
additem('Est Est')
additem('Fish')
additem('Fondue')
additem('Free nilfgaardian lemon')
additem('Free roasted chicken leg')
additem('Fried fish')
additem('Fried meat')
additem('Goats milk')
additem('Grapes')
additem('Grilled chicken sandwich')
additem('Grilled pork')
additem('Gutted fish')
additem('Ham sandwich')
additem('Honeycomb')
additem('Kaedwenian Stout')
additem('Local pepper vodka')
additem('Mahakam Spirit')
additem('Mandrake cordial')
additem('Mettina Rose')
additem('Mushroom')
additem('Mutton curry')
additem('Mutton leg')
additem('Nilfgaardian Lemon')
additem('Olive')
additem('Onion')
additem('Pear')
additem('Pepper')
additem('Plum')
additem('Pork')
additem('Potatoes')
additem('Raspberries')
additem('Raspberry juice')
additem('Raw meat')
additem('Redanian Herbal')
additem('Redanian Lager')
additem('Rivian Kriek')
additem('Roasted chicken leg')
additem('Roasted chicken')
additem('Strawberries')
additem('Temerian Rye')
additem('Tirnalia potion')
additem('Toffee')
additem('Very good honey')
additem('Vinegar')
additem('Viziman Champion')
additem('White Gull 1')
additem('Wolf liver')
}

{Miscellaneous Items
additem('an_skellige_map')
additem('ard_skellige_map')
additem('Armor maintenancet')
additem('armor_repair_kit_1')
additem('armor_repair_kit_2')
additem('armor_repair_kit_3')
additem('ciris_phylactery')
additem('Crowns')
additem('Dismantle Kit')
additem('faroe_map')
additem('Florens')
additem('hindarsfjal_map')
additem('Illusion Medallion')
additem('mh107_czart_lure')
additem('Oil Lamp') - Powerful Lightsource
additem('ore_oxenfurt')
additem('Orens')
additem('Potestaquisitor')
additem('Q1_short_steel_sword')
additem('q103_bell')
additem('q203_eyeofloki')
additem('q403_ciri_meteor')
additem('spikeroog_map')
additem('undvik_map')
additem('weapon_repair_kit_1')
additem('weapon_repair_kit_2')
additem('weapon_repair_kit_3')
}

{Crafting Materials and Alchemy Ingredients
additem('Aether')
additem('Albedo')
additem('Alchemical paste')
additem('Alchemists powder')
additem('Alghoul bone marrow')
additem('Alghoul claw')
additem('Amber dust')
additem('Amber flawless')
additem('Amber fossil')
additem('Amber')
additem('Amethyst dust')
additem('Amethyst flawless')
additem('Amethyst')
additem('Arachas eyes')
additem('Arachas venom')
additem('Ashes')
additem('Axe head')
additem('Bag of grain')
additem('Bag of weed')
additem('Bandalur butter knife')
additem('Basilisk plate')
additem('Basilisk venom')
additem('Bear fat')
additem('Bear pelt')
additem('Berserker pelt')
additem('Black pearl dust')
additem('Black pearl')
additem('Blasting powder')
additem('Blunt axe')
additem('Blunt pickaxe')
additem('Book')
additem('Bottle')
additem('Broken paddle')
additem('Broken rakes')
additem('Calcium equum')
additem('Candelabra')
additem('Candle')
additem('Casket')
additem('Cave Troll liver')
additem('Chain')
additem('Child doll')
additem('Chitin scale')
additem('Coal')
additem('Cockatrice egg')
additem('Cockatrice maw')
additem('Cotton')
additem('Cow hide')
additem('Crystalized essence')
additem('Cyclops eye')
additem('Czart hide')
additem('Dark iron ingot')
additem('Dark iron ore')
additem('Dark iron plate')
additem('Dark steel ingot')
additem('Dark steel plate')
additem('Deer hide')
additem('Diamond dust')
additem('Diamond flawless')
additem('Diamond')
additem('Dog tallow')
additem('Draconide leather')
additem('Dragon scales')
additem('Drowned dead tongue')
additem('Drowner brain')
additem('Drum')
additem('Ducal water')
additem('Dwimeritium chains')
additem('Dwimeritium shackles')
additem('Dwimeryte ingot')
additem('Dwimeryte ore')
additem('Dwimeryte plate')
additem('Dye')
additem('Ekimma epidermis')
additem('Elemental essence')
additem('Emerald dust')
additem('Emerald flawless')
additem('Emerald')
additem('Empty vial')
additem('Endriag chitin plates')
additem('Endriag embryo')
additem('Endriag heart')
additem('Erynie eye')
additem('Feather')
additem('Fiber')
additem('Fiend eye')
additem('Fifth essence')
additem('Fishing net')
additem('Fishing rod')
additem('Fisstech')
additem('Flask')
additem('Flowers')
additem('Flute_junk')
additem('Fogling teeth')
additem('Forktail plate')
additem('Fox pelt')
additem('Fur square')
additem('Gargoyle dust')
additem('Gargoyle heart')
additem('Ghoul blood')
additem('Glamarye')
additem('Glass')
additem('Glowing ingot')
additem('Glowing ore')
additem('Glyph infusion greater')
additem('Glyph infusion lesser')
additem('Goat hide')
additem('Goblet')
additem('Gold candelabra')
additem('Gold diamond necklace')
additem('Gold diamond ring')
additem('Gold mineral')
additem('Gold ore')
additem('Gold pearl necklace')
additem('Gold ring')
additem('Gold ruby ring')
additem('Gold sapphire necklace')
additem('Gold sapphire ring')
additem('Golden casket')
additem('Golden mug')
additem('Golden platter')
additem('Golem heart')
additem('Grave Hag ear')
additem('Greater Rotfiend blood')
additem('Gryphon egg')
additem('Gryphon feathers')
additem('Haft')
additem('Hag teeth')
additem('Hardened leather')
additem('Hardened timber')
additem('Harpy egg')
additem('Harpy feathers')
additem('Harpy talon')
additem('Horse hide')
additem('Hydragenum')
additem('Infused crystal')
additem('Infused dust')
additem('Infused shard')
additem('Inkwell')
additem('Iron ingot')
additem('Iron Lamp')
additem('Iron oil candle')
additem('Iron ore')
additem('Jar')
additem('Jug')
additem('Jumping rope')
additem('Ladle')
additem('Lamia lock of hair')
additem('Lead ore')
additem('Leather squares')
additem('Leather straps')
additem('Leather')
additem('Leshy resin')
additem('Linen')
additem('Lunar shards')
additem('Lute')
additem('Melitele figurine')
additem('Meteorite ingot')
additem('Meteorite ore')
additem('Meteorite plate')
additem('Meteorite silver ingot')
additem('Meteorite silver plate')
additem('Monstrous blood')
additem('Monstrous bone')
additem('Monstrous brain')
additem('Monstrous claw')
additem('Monstrous dust')
additem('Monstrous ear')
additem('Monstrous egg')
additem('Monstrous essence')
additem('Monstrous eye')
additem('Monstrous feather')
additem('Monstrous hair')
additem('Monstrous heart')
additem('Monstrous hide')
additem('Monstrous liver')
additem('Monstrous plate')
additem('Monstrous saliva')
additem('Monstrous tongue')
additem('Monstrous tooth')
additem('Mug')
additem('Nails')
additem('Necrophage skin')
additem('Nekker blood')
additem('Nekker claw')
additem('Nekker eye')
additem('Nekker heart')
additem('Nekker warrior liver')
additem('Nightwraith dark essence')
additem('Nightwraiths hair')
additem('Nigredo')
additem('Nilfgaardian special forces insignia')
additem('Noonwraith light essence')
additem('Note')
additem('Oil')
additem('Old bear skin')
additem('Old goat skin')
additem('Old rusty breadknife')
additem('Old sheep skin')
additem('Optima mater')
additem('Ornate silver shield replica')
additem('Ornate silver sword replica')
additem('Parchment')
additem('Patchwork vest')
additem('Pearl')
additem('Perfume')
additem('Phosphorus')
additem('Pickaxe head')
additem('Pig hide')
additem('Platter')
additem('Powdered pearl')
additem('Pure silver')
additem('Quebrith')
additem('Quicksilver solution')
additem('Rabbit pelt')
additem('Razor')
additem('Rebis')
additem('Redanian special forces insignia')
additem('Resin')
additem('Rope')
additem('Rotfiend blood')
additem('Rotten meat')
additem('Rubedo')
additem('Ruby dust')
additem('Ruby flawless')
additem('Ruby')
additem('Runestone greater')
additem('Runestone lesser')
additem('Rusty hammer head')
additem('Salt pepper shaker')
additem('Saltpetre')
additem('Sap')
additem('Sapphire dust')
additem('Sapphire flawless')
additem('Sapphire')
additem('Scoiatael trophies')
additem('Seashell')
additem('Shell')
additem('Silk')
additem('Silver amber necklace')
additem('Silver amber ring')
additem('Silver candelabra')
additem('Silver casket')
additem('Silver emerald necklace')
additem('Silver emerald ring')
additem('Silver ingot')
additem('Silver mineral')
additem('Silver mug')
additem('Silver ore')
additem('Silver pantaloons')
additem('Silver plate')
additem('Silver platter')
additem('Silver ruby necklace')
additem('Silver sapphire ring')
additem('Silver teapot')
additem('Silverware')
additem('Siren vocal cords')
additem('Skull')
additem('Smithing tools dwarven')
additem('Smithing tools elven')
additem('Smithing tools gnomish')
additem('Smithing tools')
additem('Smoking pipe')
additem('Specter dust')
additem('Stammelfords dust')
additem('Steel ingot')
additem('Steel plate')
additem('String')
additem('Sulfur')
additem('Temerian special forces insignia')
additem('Thread')
additem('Timber')
additem('Troll skin')
additem('Twine')
additem('Valuable fossil')
additem('Vampire fang')
additem('Vampire saliva')
additem('Venom extract')
additem('Vermilion')
additem('Vitriol')
additem('Voodoo doll')
additem('Water essence')
additem('Water Hag teeth')
additem('Wax')
additem('Werewolf pelt')
additem('Werewolf saliva')
additem('Whetstone dwarven')
additem('Whetstone elven')
additem('Whetstone gnomish')
additem('Whetstone')
additem('White bear pelt')
additem('White wolf pelt')
additem('Wine stone')
additem('Wire rope')
additem('Wire')
additem('Wolf pelt')
additem('Wooden rung rope ladder')
additem('Worn leather pelt')
additem('Wraith essence')
additem('Wyvern egg')
additem('Wyvern plate')
}

{Quest Items
additem('cg100_barons_notes')
additem('cg300_roches_list')
additem('FeromoneBomb')
additem('lw_sb13_note')
additem('lw_temerian_soldiers_journal')
additem('mh103_girls_journal')
additem('mh103_killers_knife')
additem('mh106_hags_skulls')
additem('mh107_fiend_dung')
additem('mh207_lighthouse_keeper_letter')
additem('mh301_merc_contract')
additem('mh305_doppler_letter')
additem('mh306_mages_journal')
additem('mh306_tenant_journal')
additem('mh307_minion_lair_key')
additem('mh308_dagger')
additem('mq0002_box')
additem('mq0003_girls_diary')
additem('mq0003_ornate_bracelet')
additem('mq0004_burnt_papers')
additem('mq0004_frying_pan')
additem('mq0004_thalers_monocle')
additem('mq1001_dog_collar')
additem('mq1001_locker_diary')
additem('mq1001_locker_key')
additem('mq1002_aeramas_journal_2')
additem('mq1002_aeramas_journal')
additem('mq1002_artifact_1')
additem('mq1002_artifact_2')
additem('mq1002_artifact_3')
additem('mq1010_ring')
additem('mq1014_old_mine_journal')
additem('mq1015_hang_man_note')
additem('mq1017_nilfgaardian_letter')
additem('mq1019_oil')
additem('mq1022_paint')
additem('mq1023_fake_papers')
additem('mq1028_muggs_papers')
additem('mq1033_fight_diary')
additem('mq1036_refugee_letter')
additem('mq1050_dragon_root')
additem('mq1051_spyglass')
additem('mq1052_bandit_key')
additem('mq1052_monster_trophy')
additem('mq1053_letter_to_emhyr')
additem('mq1053_martins_notes')
additem('mq1053_report')
additem('mq1053_skull')
additem('mq1055_letters')
additem('mq1056_chain_cutter')
additem('mq2001_horn')
additem('mq2001_journal_1a')
additem('mq2001_journal_1b')
additem('mq2001_journal_1c')
additem('mq2001_journal_2a')
additem('mq2001_journal_2b')
additem('mq2001_kuilu')
additem('mq2002_sword')
additem('mq2003_bandit_journal')
additem('mq2006_key_1')
additem('mq2006_key_2')
additem('mq2006_map_1')
additem('mq2006_map_2')
additem('mq2008_journal')
additem('mq2010_lumbermill_journal_1')
additem('mq2010_lumbermill_journal_2')
additem('mq2010_lumbermill_journal_3')
additem('mq2012_letter')
additem('mq2015_kurisus_note')
additem('mq2018_lugos_note')
additem('mq2030_shawl')
additem('mq2033_captain_journal')
additem('mq2033_captain_note')
additem('mq2033_tp_stone')
additem('mq2037_dimun_directions')
additem('mq2037_drakkar_chest_key')
additem('mq2038_headsman_sword')
additem('mq2039_Honeycomb')
additem('mq2041_dexterity_token')
additem('mq2043_conviction_token')
additem('mq2048_guide_notes')
additem('mq2048_ships_logbook')
additem('mq2048_stone_medalion')
additem('mq2048_waxed_letters')
additem('mq2049_book_1')
additem('mq2049_book_2')
additem('mq2049_book_3')
additem('mq2049_book_4')
additem('mq2049_book_5')
additem('mq3002_hidden_messages_note_01')
additem('mq3002_hidden_messages_note_02')
additem('mq3002_hidden_messages_note_03')
additem('mq3012_noble_statuette')
additem('mq3012_soldier_statuette')
additem('mq3017_reds_diary')
additem('mq3026_horse_racing_leaflet')
additem('mq3026_varese_invitation')
additem('mq3027_fluff_book_1')
additem('mq3027_fluff_book_2')
additem('mq3027_fluff_book_3')
additem('mq3027_fluff_book_4')
additem('mq3027_letter')
additem('mq3027_my_manifest')
additem('mq3030_trader_documents')
additem('mq3031_mother_of_pearl')
additem('mq3032_basilisk_leather')
additem('mq3032_leather_boots')
additem('mq3035_philppa_ring')
additem('mq3035_talar_notes')
additem('mq3039_loot_chest_key')
additem('mq4001_book')
additem('mq4002_note')
additem('mq4003_husband_ring')
additem('mq4003_letter')
additem('mq4003_siren_ring')
additem('mq4004_boy_remains')
additem('mq4005_note_1')
additem('mq4006_book')
additem('q001_academic_book')
additem('q001_bedroom_key')
additem('q001_crystal_skull')
additem('q001_letter_from_yenn')
additem('q002_yenn_notes_about_ciri')
additem('q101_candle_instruction')
additem('q101_hendrik_notes')
additem('q101_hendrik_trapdoor_key')
additem('q103_about_eve')
additem('q103_baron_dagger')
additem('q103_botch_blood')
additem('q103_curse_book')
additem('q103_incense')
additem('q103_letter_from_graden_1')
additem('q103_letter_from_graden_2')
additem('q103_love_letter')
additem('q103_medallion')
additem('q103_nilfgaardian_demand')
additem('q103_safe_conduct')
additem('q103_spinning_top')
additem('q103_talisman')
additem('q103_tamara_prayer')
additem('q103_wooden_doll')
additem('q104_aleksander_letter')
additem('q104_avallach_notes')
additem('q104_avallach_poetry')
additem('q104_cure_recipe')
additem('q104_eye_ink_recipe')
additem('q104_oillamp')
additem('q105_book_about_witches')
additem('q105_johnnys_doll')
additem('q105_marabella_receptions')
additem('q105_ravens_feather')
additem('q105_ritual_dagger')
additem('q105_soltis_ear')
additem('q105_witch_bones')
additem('q106_alexander_notes_01')
additem('q106_alexander_notes_02')
additem('q106_alexander_notes_03')
additem('q106_alexander_notes_04')
additem('q106_anabelle_remains')
additem('q106_anabelle_vial')
additem('q106_magic_communicator')
additem('q106_note_from_keira')
additem('q107_doll_anna')
additem('q107_doll1')
additem('q107_doll2')
additem('q107_doll3')
additem('q107_doll5')
additem('q107_doll6')
additem('q108_necklet')
additem('q109_popiels_formula')
additem('q110_bill_of_exchange')
additem('q111_ergot_beer')
additem('q111_falkas_coin')
additem('q111_fugas_top_key')
additem('q111_imlerith_acorn')
additem('q201_criminal')
additem('q201_mead')
additem('q201_mousesack_letter')
additem('q201_pine_cone')
additem('q201_poisoned_source')
additem('q201_skull')
additem('q201_wild_hunt_book')
additem('q201_yen_journal_1')
additem('q202_nails')
additem('q202_navigator_horn')
additem('q202_sail')
additem('q202_shackles')
additem('q203_broken_eyeofloki')
additem('q203_broksvard')
additem('q203_chest_key')
additem('q205_avallach_book')
additem('q205_gaelnos_root')
additem('q205_hvitr_universal_key')
additem('q205_mirt_green')
additem('q205_mirt_yellow')
additem('q205_swallow_green')
additem('q205_swallow_yellow')
additem('q206_arits_letter')
additem('q206_arnvalds_letter')
additem('q206_herb_mixture')
additem('q206_wine_sample')
additem('q208_heroesmead')
additem('q210_avallach_lover_notes')
additem('q210_avallach_notes_01')
additem('q210_avallach_notes_02')
additem('q210_letter_for_emhyr')
additem('q210_solarstein')
additem('q301_burdock')
additem('q301_drawing_crib')
additem('q301_drawing_oven')
additem('q301_haunted_doll')
additem('q301_magic_rat_incense')
additem('q301_rose_remembrance')
additem('q301_triss_parcel')
additem('q302_casino_register')
additem('q302_crafter_notes')
additem('q302_dijkstras_notes')
additem('q302_estate_key')
additem('q302_igor_note')
additem('q302_rico_thugs_notes')
additem('q302_ring_door_key')
additem('q302_roche_letter')
additem('q302_roche_report')
additem('q302_whoreson_letter_to_radowid')
additem('q302_zdenek_contract')
additem('q303_bomb_cap')
additem('q303_bomb_fragment')
additem('q303_contact_note')
additem('q303_dudus_briefing')
additem('q303_marked_bible')
additem('q303_note_for_ciri')
additem('q303_wine_bottle')
additem('q304_ambasador_letter')
additem('q304_dandelion_ballad')
additem('q304_dandelion_diary')
additem('q304_letter_1')
additem('q304_letter_2')
additem('q304_letter_3')
additem('q304_priscilla_letter')
additem('q304_rosa_lover_letter')
additem('q305_dandelion_signet')
additem('q305_script_comedy_title1')
additem('q305_script_comedy_title2')
additem('q305_script_drama_title1')
additem('q305_script_drama_title2')
additem('q305_script_for_irina')
additem('q308_anneke_invite')
additem('q308_coroner_msg')
additem('q308_last_invite')
additem('q308_nathanel_sermon_1')
additem('q308_priscilla_invite')
additem('q308_psycho_farewell')
additem('q308_sermon_1')
additem('q308_sermon_2')
additem('q308_sermon_3')
additem('q308_sermon_4')
additem('q308_sermon_5')
additem('q308_vegelbud_invite')
additem('q308_vg_ethanol')
additem('q308_vg_guillotine')
additem('q308_vg_paraffin')
additem('q309_glejt_from_dijkstra')
additem('q309_key_letters')
additem('q309_key_orders')
additem('q309_key_piece1')
additem('q309_key_piece2')
additem('q309_key_piece3')
additem('q309_mssg_from_triss')
additem('q309_note_from_varese')
additem('q309_three_keys_combined')
additem('q309_witch_hunters_orders')
additem('q310_backdoor_key')
additem('q310_cell_key')
additem('q310_explorer_note')
additem('q310_journal_notes_1')
additem('q310_journal_notes_2')
additem('q310_lever')
additem('q310_sewer_door_key')
additem('q310_wine')
additem('q310_yen_trinket')
additem('q311_aen_elle_notes')
additem('q311_lost_diary1')
additem('q311_lost_diary2')
additem('q311_lost_diary3')
additem('q311_lost_diary4')
additem('q401_avallachs_wisp')
additem('q401_bread')
additem('q401_bucket_and_rag')
additem('q401_cheese')
additem('q401_disgusting_meal')
additem('q401_forktail_brain')
additem('q401_sausages')
additem('q401_trial_key_ingredient_a')
additem('q401_trial_key_ingredient_b')
additem('q401_trial_key_ingredient_c')
additem('q401_triss_earring')
additem('q401_yen_journal_2')
additem('q403_treaty')
additem('q504_fish')
additem('q505_gems')
additem('q505_nilf_diary_lost1')
additem('q505_nilf_diary_lost2')
additem('q505_nilf_diary_won1')
additem('quest_test_ring')
additem('scrambled_eggs')
additem('sq101_letter_from_keira')
additem('sq101_safe_goods')
additem('sq101_shipment_list')
additem('sq102_dolores_diary')
additem('sq102_huberts_diary')
additem('sq102_loose_papers')
additem('sq104_key')
additem('sq104_notes')
additem('sq106_hammond_whereabouts')
additem('sq106_manuscript')
additem('sq107_vault_key')
additem('sq108_acid_gland')
additem('sq108_smith_tools')
additem('sq201_chamber_key')
additem('sq201_cursed_jewel')
additem('sq201_padlock_key')
additem('sq201_rotten_meat')
additem('sq201_ship_manifesto')
additem('sq201_werewolf_meat')
additem('sq202_book_1')
additem('sq202_book_2')
additem('sq202_half_seal')
additem('sq204_leshy_talisman')
additem('sq204_wolf_heart')
additem('sq205_brewing_instructions')
additem('sq205_brewmasters_log')
additem('sq205_fernflower_petal')
additem('sq205_moonshine_spirit')
additem('sq205_preserved_mash')
additem('sq206_sleipnir_formula')
additem('sq206_sleipnir_ingredient')
additem('sq206_sleipnir_potion')
additem('sq207_portal_stone_blue')
additem('sq207_portal_stone_green')
additem('sq207_portal_stone_red')
additem('sq208_ashes')
additem('sq208_herbs')
additem('sq208_letter')
additem('sq208_otkell_journal')
additem('sq208_portait_brodrr')
additem('sq208_portait_otkell')
additem('sq208_portait_saemingr')
additem('sq208_portait_tyr')
additem('sq208_raghnaroog')
additem('sq210_blank_brain')
additem('sq210_burnt_heart')
additem('sq210_conch')
additem('sq210_drm_brain')
additem('sq210_gog_book')
additem('sq210_gog_brain')
additem('sq210_gog_recipe')
additem('sq210_gold_token')
additem('sq210_golems_charged_heart')
additem('sq210_golems_heart')
additem('sq302_agates')
additem('sq302_crystal')
additem('sq302_eyes')
additem('sq302_generator_2')
additem('sq302_generator_3')
additem('sq302_philippa_letter')
additem('sq303_lesser_white_honey')
additem('sq303_robbery_speech')
additem('sq304_aluminium')
additem('sq304_chemicals')
additem('sq304_ferrum_cadmiae')
additem('sq304_ledger_book')
additem('sq304_monster_trophy')
additem('sq304_smithing_mtrls')
additem('sq304_thermite')
additem('sq305_conduct')
additem('sq305_trophies')
additem('sq306_sacha_letter')
additem('sq307_cat_accessories')
additem('sq307_cattrap')
additem('sq307_flower')
additem('sq308_martin_mask')
additem('sq309_girl_notebook')
additem('sq309_iorweth_arrow')
additem('sq309_mage_letter')
additem('sq310_ledger_book')
additem('sq310_package')
additem('sq311_spy_papers')
additem('sq312_medicine')
additem('sq313_iorveth_letters')
additem('sq314_cure_recipe')
additem('sq314_cure')
additem('sq314_var_rechte_journal')
additem('sq401_old_sword')
additem('sq401_orders')
additem('sq402_aether')
additem('sq402_florence_flask_with_water')
additem('sq402_florence_flask')
additem('sq402_hydragenum')
additem('sq402_ingredient')
additem('sq402_quebrith')
additem('sq402_rebis')
additem('sq402_vitriol')
additem('th003_journal_wolf_part3')
additem('th004_map_wolf_jacket_upgrade1')
additem('th005_map_wolf_jacket_upgrade2')
additem('th006_map_wolf_jacket_upgrade3')
additem('th007_map_wolf_gloves_upgrade1')
additem('th008_map_wolf_pants_upgrade1')
additem('th009_map_wolf_boots_upgrade1')
additem('th010_map_wolf_silver_sword_upgrade1')
additem('th011_map_wolf_silver_sword_upgrade2')
additem('th012_map_wolf_silver_sword_upgrade3')
additem('th013_map_wolf_steel_sword_upgrade1')
additem('th014_map_wolf_steel_sword_upgrade2')
additem('th015_map_wolf_steel_sword_upgrade3')
additem('th1001_journal_viper_part1')
additem('th1001_journal_viper_part2')
additem('th1003_ireneus_lab_key')
additem('th1003_journal_cat_lady')
additem('th1003_journal_lynx_part1')
additem('th1003_journal_lynx_part2')
additem('th1003_journal_lynx_part3')
additem('th1003_journal_lynx_part4')
additem('th1003_journal_lynx_part5')
additem('th1003_journal_lynx_part6')
additem('th1003_journal_lynx_part7')
additem('th1003_journal_lynx_part8')
additem('th1003_map_lynx_upgrade1a')
additem('th1003_map_lynx_upgrade1b')
additem('th1003_map_lynx_upgrade2')
additem('th1003_map_lynx_upgrade3')
additem('th1005_journal_gryphon_part1')
additem('th1005_journal_gryphon_part2')
additem('th1005_journal_gryphon_part3')
additem('th1005_journal_gryphon_part4')
additem('th1005_journal_gryphon_part5')
additem('th1005_journal_gryphon_part6')
additem('th1005_journal_gryphon_part7')
additem('th1005_map_gryphon_upgrade1a')
additem('th1005_map_gryphon_upgrade1b')
additem('th1005_map_gryphon_upgrade2')
additem('th1005_map_gryphon_upgrade3')
additem('th1007_journal_bear_part1')
additem('th1007_journal_bear_part2')
additem('th1007_journal_bear_part3')
additem('th1007_journal_bear_part4')
additem('th1007_journal_bear_part5')
additem('th1007_journal_bear_part6')
additem('th1007_journal_bear_part7')
additem('th1007_map_bear_upgrade1a')
additem('th1007_map_bear_upgrade1b')
additem('th1007_map_bear_upgrade2')
additem('th1007_map_bear_upgrade3')
additem('th1009_journal_wolf_part1')
additem('th1009_journal_wolf_part2')
additem('vivaldis_bill_of_exchange')
additem('yennefers_omelette_fantasie')
additem('yennefers_omelette')
}

{DLC Items
additem('DLC1 Temerian Armor')
additem('DLC1 Temerian Boots')
additem('DLC1 Temerian Gloves')
additem('DLC1 Temerian Pants')
additem('DLC5 Nilfgaardian Armor')
additem('DLC5 Nilfgaardian Boots')
additem('DLC5 Nilfgaardian Gloves')
additem('DLC5 Nilfgaardian Pants')
additem('DLC1 Temerian HorseBag')
additem('DLC1 Temerian HorseBlinders')
additem('DLC1 Temerian HorseSaddle')
additem('DLC5 Nilfgaardian HorseBag')
additem('DLC5 Nilfgaardian HorseBlinders')
additem('DLC5 Nilfgaardian HorseSaddle')
additem('DLC13 Nilfgaardian Crossbow')
additem('DLC13 Skellige Crossbow')
additem('DLC13 Elven Crossbow')
additem('DLC14 Skellige Armor')
additem('DLC14 Skellige Boots')
additem('DLC14 Skellige Gloves')
additem('DLC14 Skellige Pants')
additem('DLC14 Skellige HorseBag')
additem('DLC14 Skellige HorseBlinders')
additem('DLC14 Skellige HorseSaddle')
additem('Wolf Armor')
additem('Wolf Armor 1')
additem('Wolf Armor 2')
additem('Wolf Armor 3')
additem('Wolf School steel sword')
additem('Wolf School steel sword 1')
additem('Wolf School steel sword 2')
additem('Leather squares')
additem('Wolf School silver sword')
additem('Wolf School silver sword 1')
additem('Wolf School silver sword 2')
additem('Wolf Armor')
additem('Wolf Armor 1')
additem('Wolf Armor 2')
additem('Wolf Gloves 1')
additem('Wolf Gloves 2')
additem('Wolf Gloves 3')
additem('Wolf Pants 1')
additem('Wolf Pants 2')
additem('Wolf Pants 3')
additem('Wolf Boots 1')
additem('Wolf Boots 2')
additem('Wolf Boots 3')
additem('Wolf Armor schematic')
additem('Wolf Boots schematic')
additem('Wolf Gloves schematic')
additem('Wolf Pants schematic')
additem('Witcher Wolf Jacket Upgrade schematic 1')
additem('Witcher Wolf Jacket Upgrade schematic 2')
additem('Witcher Wolf Jacket Upgrade schematic 3')
additem('Witcher Wolf Boots Upgrade schematic 1')
additem('Witcher Wolf Pants Upgrade schematic 1')
additem('Witcher Wolf Gloves Upgrade schematic 1')
additem('Wolf School steel sword Upgrade schematic 1')
additem('Wolf School steel sword Upgrade schematic 2')
additem('Wolf School steel sword Upgrade schematic 3')
additem('Wolf School silver sword Upgrade schematic 1')
additem('Wolf School silver sword Upgrade schematic 2')
additem('Wolf School silver sword Upgrade schematic 3')
additem('Leather squares')
additem('th1009_journal_wolf_part1a')
additem('th1009_journal_wolf_part2a')
additem('th1009_journal_wolf_part3a')
additem('th1009_journal_wolf_part4')
additem('th1009_map_wolf_upgrade1a')
additem('th1009_map_wolf_upgrade1b')
additem('th1009_map_wolf_upgrade2')
additem('th1009_map_wolf_upgrade2b')
additem('NGP DLC1 Temerian Armor')
additem('NGP DLC1 Temerian Boots')
additem('NGP DLC1 Temerian Gloves')
additem('NGP DLC1 Temerian Pants')
additem('NGP DLC5 Nilfgaardian Armor')
additem('NGP DLC5 Nilfgaardian Boots')
additem('NGP DLC5 Nilfgaardian Gloves')
additem('NGP DLC5 Nilfgaardian Pants')
additem('NGP DLC14 Skellige Armor')
additem('NGP DLC14 Skellige Boots')
additem('NGP DLC14 Skellige Gloves')
additem('NGP DLC14 Skellige Pants')
additem('NGP Starting Pants')
additem('NGP Pants 01')
additem('NGP Pants 01 q2')
additem('NGP Pants 02')
additem('NGP Pants 03')
additem('NGP Pants 04')
additem('NGP Heavy pants 01')
additem('NGP Heavy pants 02')
additem('NGP Heavy pants 03')
additem('NGP Heavy pants 04')
additem('NGP Nilfgaardian Casual Pants')
additem('NGP Skellige Casual Pants 01')
additem('NGP Skellige Casual Pants 02')
additem('NGP Bath Towel Pants 01')
additem('NGP Pants 01_crafted')
additem('NGP Pants 02_crafted')
additem('NGP Pants 03_crafted')
additem('NGP Pants 04_crafted')
additem('NGP Heavy pants 01_crafted')
additem('NGP Heavy pants 02_crafted')
additem('NGP Heavy pants 03_crafted')
additem('NGP Heavy pants 04_crafted')
additem('NGP Lynx Pants 1')
additem('NGP Lynx Pants 2')
additem('NGP Lynx Pants 3')
additem('NGP Lynx Pants 4')
additem('NGP Gryphon Pants 1')
additem('NGP Gryphon Pants 2')
additem('NGP Gryphon Pants 3')
additem('NGP Gryphon Pants 4')
additem('NGP Bear Pants 1')
additem('NGP Bear Pants 1')
additem('NGP Bear Pants 2')
additem('NGP Bear Pants 3')
additem('NGP Bear Pants 4')
additem('NGP Wolf Armor')
additem('NGP Wolf Armor 1')
additem('NGP Wolf Armor 2')
additem('NGP Wolf Armor 3')
additem('NGP Wolf School steel sword')
additem('NGP Wolf School steel sword 1')
additem('NGP Wolf School steel sword 2')
additem('NGP Wolf School silver sword')
additem('NGP Wolf School silver sword 1')
additem('NGP Wolf School silver sword 2')
additem('NGP Wolf Armor')
additem('NGP Wolf Armor 1')
additem('NGP Wolf Armor 2')
additem('NGP Wolf Gloves 2')
additem('NGP Wolf Gloves 3')
additem('NGP Wolf Pants 1')
additem('NGP Wolf Pants 2')
additem('NGP Wolf Pants 3')
additem('NGP Wolf Boots 1')
additem('NGP Wolf Boots 2')
additem('NGP Wolf Boots 3')
}

{test commands to add each type of item once
Inventory Dev Commands
addbolts
addarmor
addarmor2
addbooks
addboots
addcharacterdecorations
addcraft
addcraftedboots
addcraftedranged
addcraftedsilver
addcraftedsilverrelic
addcraftedsteel
addcraftedsteelrelic
addcraftingingre
addCraftingItem
addcrossbows
adddrinks
addfood
addgloves
addherbs
additemalchemy
additemcrafting
additemfood
additemleather
additemmetals
additemmonstrous
additemrunesupgrades
additemsprecious
addjunk
addjunk2
addkeys
addlore
addlore2
addmisc
addhorseitems
addmutageningredients
addmutagenrecipes
addmutagens
addpants
addquestitems
addquestitems2
addquestitems3
addrecipesbombs
addrecipesoils
addrecipespotions
addrecipespotions2
addschematicsarmor
addschematicsbolts
addschematicsboots
addschematicscomponents
addschematicsgloves
addschematicspants
addschematicsupgrades
addsets
addsilverswords
addsilverswords2
addsteelswords
addsteelswords2
addtreasurehuntitems
addtrophies
addupgrades
addvaluables
addwolfdlc
learnallschematics
}

{Horse
for more carryweight add the buffs from all 3 types of bags - use rmvabl(name) to remove them
addabl(HorseBag1)
addabl(HorseBag2)
addabl(HorseBag3)
additem('Horse Bag 3') â€“ largest bag
additem('Horse Saddle 4') â€“ best saddle
additem('Horse Blinder 3') â€“ best blinder
staminapony â€“ unlimited stamina horse
instantMount('horse') - puts player on a horse
}

{NPC Commands
dismember - dismembers an NPC
appearance(name) - target an NPC and type the command
Ciri
Ciri - play as Cirilla, use 'Geralt' to return to Geralt
spawn('cirilla') - spawns Cirilla NPC
Abilities, for playable Ciri
addabl(CiriBlink) - give Ciri the blink ability
addabl(CiriCharge) - give Ciri the charge ability
addabl(Ciri_Rage) - give Ciri the rage ability
additem(q403_ciri_meteor) - gives Ciri the meteor
addabl(Ciri_Q205) - gain 250 vitality
addabl(Ciri_Q305) - gain 500 vitality and 100 attack power
addabl(Ciri_Q403) - gain 2000 vitality and 500 attack power
addabl(Ciri_Q111) - gain 2500 vitality and 600 attack power
addabl(Ciri_Q501) - gain 2500 vitality and 80 attack power
Appearances for Ciri
appearance(ciri_winter)
appearance(__q103_dirty)
appearance(__q103_wounded)
appearance(__q205_bandaged_naked)
appearance(__q205_bandaged)
appearance(__q205_bathtowel)
appearance(__q205_naked)
appearance(__q305_dudu)
appearance(__q310_masked)
appearance(__q505_covered_01)
appearance(__q505_covered_02)
appearance(__q505_hooded_02)
appearance(__q505_hooded)
Triss
spawn('triss') - spawns Triss Merrigold NPC
appearance(triss)
appearance(triss_dress)
appearance(triss_hooded_01)
appearance(triss_hooded_02)
appearance(triss_lingerie)
appearance(triss_naked)
appearance(triss_tortured_bloddy_face)
appearance(triss_tortured)
Yennefer
spawn('yennefer') - spawns Yennefer of Vengerberg NPC
appearance(yennefer_gown)
appearance(yennefer_head_towel)
appearance(yennefer_hooded)
appearance(yennefer_hooded_02)
appearance(yennefer_lingerie)
appearance(yennefer_naked_no_hair)
appearance(yennefer_naked_panties)
appearance(yennefer_naked)
appearance(yennefer_no_pendant)
appearance(yennefer_travel_outfit)
Keira
spawn('keira') - spawns Keira Metz NPC
appearance(naked)
appearance(naked_lingerie)
appearance(keira_metz_sorceress)
appearance(keria_metz)
}

{spawn('name',#,x,true/false) - spawns "#" amount of "true=hostile or false=friendly" "name"-NPCs in distance "x"
e.g. spawn('wyvern_lvl2') - spawns 1 strong Wyvern
e.g. spawn('wyvern_lvl2',10,20,true) - spawns 10 hostile, strong Wyverns in distance 20

Humans
spawn('witcher')
spawn('vesemir')
spawn('yennefer')
spawn('triss')
spawn('keira')
spawn('grenn')
spawn('cirilla')
spawn('zoltan')
spawn('sorceress')
Bosses
spawn('witch1')
spawn('witch_1')
spawn('witch2')
spawn('witch_2')
spawn('witch3')
spawn('witch_3')
spawn('witch_q105')
spawn('eredin')
spawn('imlerith')
spawn('caranthir')
Various Humans
spawn('fists')
spawn('fists_medium')
spawn('fists_hard')
spawn('shield')
spawn('shield_axe')
spawn('shield_mace')
spawn('shield_hard')
spawn('hammer2h')
spawn('hammer2h_hard')
spawn('axe2h')
spawn('halberd2h')
spawn('spear2h')
spawn('bow')
spawn('bow_hard')
spawn('sword1h')
spawn('sword1h_easy')
spawn('sword1h_hard')
spawn('sword1h_super_hard')
spawn('axe1h')
spawn('axe1h_hard')
spawn('club1h')
spawn('club1h_hard')
spawn('1hand')
spawn('1handed')
spawn('sword2h')
spawn('shortsword_hard')
spawn('bowman')
spawn('bowman_hard')
spawn('xbow')
spawn('rider')
spawn('shovel_test')
spawn('pitchfork')
Warriors of the Wild Hunt
spawn('wildhunt_sword')
spawn('wild_hunt_axe')
spawn('wild_hunt_halberd')
spawn('wild_hunt_hammer')
spawn('wild_hunt_minion')
spawn('wild_hunt_spear')
spawn('wild_hunt_sword')
spawn('wildhunt_axe')
spawn('wildhunt_halberd')
spawn('wildhunt_hammer')
spawn('wildhunt_minion')
spawn('wildhunt_spear')
Monsters
spawn('ice_giant')
spawn('icegiant')
spawn('siren')
spawn('bees')
spawn('black_troll')
spawn('blacktroll')
spawn('cave_troll')
spawn('cavetroll')
spawn('cockatrice')
spawn('troll')
spawn('troll_black')
spawn('djinn')
spawn('drowner')
spawn('ddead')
spawn('drowneddead')
spawn('drowned_dead')
spawn('nekker')
spawn('nekker_warrior')
spawn('bies')
spawn('lessog')
spawn('leszy')
spawn('leshy')
spawn('leshen')
spawn('lessun')
spawn('dao')
spawn('ifryt')
spawn('ifrit')
spawn('golem')
spawn('arachas')
spawn('arachas_armored')
spawn('armoredarachas')
spawn('arachas_poison')
spawn('poisonarachas')
spawn('poisonedarachas')
spawn('warewolf')
spawn('werewolf')
spawn('lycanthrope')
spawn('lycan')
spawn('endriaga')
spawn('endrega')
spawn('endriaga_worker')
spawn('endriaga_tailed')
spawn('endriaga_spikey')
spawn('wight')
spawn('wyvern')
spawn('basilisk')
spawn('harpy')
spawn('gryphon')
spawn('griffon')
spawn('wolf')
spawn('wolf_alpha')
spawn('wolf_white')
spawn('evil_dog')
spawn('wild_dog')
spawn('simulacrum')
spawn('erynia')
spawn('fogling')
spawn('forktail')
spawn('fugas')
spawn('gargoyle')
spawn('ghoul')
spawn('ghoul_lesser')
spawn('alghoul')
spawn('wildhunt_mage')
spawn('gravehag')
spawn('miscreant')
spawn('nightwraith')
spawn('noonwraith')
spawn('pesta')
spawn('iris')
spawn('volcanic_gryphon')
spawn('wraith')
spawn('waterhag')
spawn('czart')
spawn('willo_wisp')
spawn('willowisp')
spawn('katakan')
spawn('katakan_large')
spawn('katakanlarge')
spawn('gravehag_barons_wife')
spawn('baronswife')
spawn('ekima')
spawn('ekimma')
spawn('lamia')
spawn('bear')
spawn('bear_black')
spawn('bear_berserker')
spawn('bear_grizzly')
spawn('grizzly')
spawn('bear_white')
spawn('cyclop')
spawn('cyclops')
spawn('rotfiend')
spawn('rotfiend_large')
spawn('succubus')
spawn('heart')
spawn('him')
spawn('frozen_soldier')
spawn('ice_golem')
spawn('botchling')
spawn('alghoul_lvl1')
spawn('alghoul_lvl2')
spawn('alghoul_lvl3')
spawn('alghoul_mh')
spawn('arachas_lvl1')
spawn('arachas_lvl2__armored')
spawn('arachas_lvl3__poison')
spawn('arachas_mh__poison')
spawn('basilisk_lvl1')
spawn('bear_berserker_lvl1')
spawn('bear_lvl1__black')
spawn('bear_lvl2__grizzly')
spawn('bear_lvl3__white')
spawn('bies_lvl1')
spawn('bies_lvl2')
spawn('bies_mh')
spawn('black_mage_lvl1')
spawn('blood_flies')
spawn('burnedman_lvl1')
spawn('cockatrice_lvl1')
spawn('cockatrice_mh')
spawn('cyclop_lvl1')
spawn('czart_lvl1')
spawn('czart_mh')
spawn('drowner_lvl1')
spawn('drowner_lvl2')
spawn('drowner_lvl3')
spawn('drowner_lvl4__dead')
spawn('elemental_dao_lvl1')
spawn('elemental_dao_lvl2')
spawn('elemental_dao_lvl3__ice')
spawn('elemental_dao_mh')
spawn('endriaga_lvl1__worker')
spawn('endriaga_lvl2__tailed')
spawn('endriaga_lvl3__spikey')
spawn('fogling_lvl1')
spawn('fogling_lvl1__doppelganger')
spawn('fogling_lvl2')
spawn('fogling_lvl3__willowisp')
spawn('fogling_mh')
spawn('forktail_lvl1')
spawn('forktail_lvl2')
spawn('forktail_mh')
spawn('fugas_lvl1')
spawn('fugas_lvl2')
spawn('gargoyle_lvl1')
spawn('ghoul_lvl1')
spawn('ghoul_lvl2')
spawn('ghoul_lvl3')
spawn('golem_lvl1')
spawn('golem_lvl2')
spawn('golem_lvl2__ifryt')
spawn('golem_lvl3')
spawn('gryphon_lvl1')
spawn('gryphon_lvl2')
spawn('gryphon_lvl3__volcanic')
spawn('gryphon_mh__volcanic')
spawn('hag_grave_lvl1')
spawn('hag_grave_lvl1__barons_wife')
spawn('hag_grave__mh')
spawn('hag_water_lvl1')
spawn('hag_water_lvl2')
spawn('hag_water_mh')
spawn('harpy_lvl1')
spawn('harpy_lvl2')
spawn('harpy_lvl3__erynia')
spawn('lessog_lvl1')
spawn('lessog_lvl2__ancient')
spawn('lessog_mh')
spawn('nekker_lvl1')
spawn('nekker_lvl2')
spawn('nekker_lvl3__warrior')
spawn('nekker_mh__warrior')
spawn('nightwraith_lvl1')
spawn('nightwraith_lvl1__doppelganger')
spawn('nightwraith_mh')
spawn('noonwraith_lvl1')
spawn('noonwraith_lvl1__doppelganger')
spawn('noonwraith_mh')
spawn('rotfiend_lvl1')
spawn('rotfiend_lvl2')
spawn('siren_lvl1')
spawn('siren_lvl2__lamia')
spawn('siren_mh__lamia')
spawn('troll_cave_lvl1')
spawn('troll_cave_lvl2')
spawn('troll_cave_lvl3__ice')
spawn('troll_cave_mh__black')
spawn('vampire_ekima_lvl1')
spawn('vampire_ekima_mh')
spawn('vampire_katakan_lvl1')
spawn('vampire_katakan_mh')
spawn('werewolf_lvl1')
spawn('werewolf_lvl2')
spawn('werewolf_lvl3__lycan')
spawn('werewolf_lvl4__lycan')
spawn('wild_dog_lvl1')
spawn('wildhunt_minion_lvl1')
spawn('wildhunt_minion_lvl2')
spawn('wildhunt_minion_mh')
spawn('wolf_lvl1')
spawn('wolf_lvl1__summon')
spawn('wolf_lvl1__summon_were')
spawn('wolf_lvl2__alpha')
spawn('wolf_white_lvl2')
spawn('wolf_white_lvl3__alpha')
spawn('wraith_lvl1')
spawn('wraith_mh')
spawn('wyvern_lvl1')
spawn('wyvern_lvl2')
spawn('wyvern_mh')
spawn('_quest__bear_grizzly_honey')
spawn('_quest__endriaga_spiral')
spawn('_quest__fogling')
spawn('_quest__godling')
spawn('_quest__him')
spawn('_quest__miscreant')
spawn('_quest__miscreant_greater')
spawn('_quest__noonwright_pesta')
spawn('_quest__werewolf')
spawn('_quest__witch_1')
spawn('_quest__witch_2')
spawn('_quest__witch_3')
Animals
spawn('bat')
spawn('cat')
spawn('chicken')
spawn('cow')
spawn('crab')
spawn('crow')
spawn('deer')
spawn('dog')
spawn('fish_kingfish')
spawn('fish_mackerel')
spawn('fish_roach')
spawn('fish_tuna')
spawn('goat')
spawn('goose')
spawn('goose_leader')
spawn('hare')
spawn('mountain_goat')
spawn('owl')
spawn('pig')
spawn('pigeon')
spawn('ram')
spawn('rat')
spawn('rooster')
spawn('seagull')
spawn('sheep')
spawn('snow_deer')
spawn('snow_rabbit')
spawn('sparrow')
spawn('swallow')
spawn('toad')
spawn('whale')
Miscellaneous Stuff
spawn('boat')
spawn('playerHorse')
spawn('horse')
spawn('horse_manager')
spawn('poison_cloud')
spawn('rotfiend_explode')
spawn('barrel')
spawn('grapeshot')
spawn('petard')
spawn('beehive')
spawn('stand_puke')
spawn('pawelmtest')
spawn('projectile_rift')
spawn('projectile_rift2')
spawn('ground_rift')
spawn('lure_cloud')
spawn('yennefer_bubble')
spawn('yennefer_bubble_2')
spawn('yennefer_bubble_3')
spawn('denied_area')
}

{spawnt(#) - spawns a group of hostiles
e.g. spawnt(64) - spawns a group of Novigrad Guards

Spawn random enounter mobs
spawnt(01) - Witcher Hunters; other numbers are 01-09
spawnt(61) - Bandits; other numbers are 61, 63, 65
spawnt(64) - Novigrad Guards; other numbers are 64, 68, 70, 73, 75, 80
spawnt(67) - Thugs; other numbers are 67, 77
spawnt(83) - Redanian Soldiers; other numbers are 83, 85-90, 92-99
spawnt(100) - Skellige Bandits; other numbers are 100-104, 106-126, 128-133
spawnt(134) - Wild Hunt Warriors; other numbers are 134-135, 137-140
}

Gwent Game
secretgwint - play a Gwent Game anywhere
winGwint(true) - win current Gwent Game
addgwintcards - adds 1 of each card, except 'gwint_card_katakan'

{Gwent Cards
additem('gwint_card_emhyr_gold')
additem('gwint_card_emhyr_silver')
additem('gwint_card_emhyr_bronze')
additem('gwint_card_emhyr_copper')
additem('gwint_card_foltest_gold')
additem('gwint_card_foltest_silver')
additem('gwint_card_foltest_bronze')
additem('gwint_card_foltest_copper')
additem('gwint_card_francesca_gold')
additem('gwint_card_francesca_silver')
additem('gwint_card_francesca_bronze')
additem('gwint_card_francesca_copper')
additem('gwint_card_eredin_gold')
additem('gwint_card_eredin_silver')
additem('gwint_card_eredin_bronze')
additem('gwint_card_eredin_copper')
additem('gwint_card_impera_brigade')
additem('gwint_card_impera_brigade2')
additem('gwint_card_impera_brigade3')
additem('gwint_card_impera_brigade4')
additem('gwint_card_cynthia')
additem('gwint_card_letho')
additem('gwint_card_archer_support')
additem('gwint_card_archer_support2')
additem('gwint_card_assire')
additem('gwint_card_fringilla')
additem('gwint_card_nausicaa')
additem('gwint_card_nausicaa2')
additem('gwint_card_nausicaa3')
additem('gwint_card_stefan')
additem('gwint_card_black_archer')
additem('gwint_card_siege_support')
additem('gwint_card_menno')
additem('gwint_card_moorvran')
additem('gwint_card_tibor')
additem('gwint_card_albrich')
additem('gwint_card_morteisen')
additem('gwint_card_rainfarn')
additem('gwint_card_renuald')
additem('gwint_card_rotten')
additem('gwint_card_shilard')
additem('gwint_card_sweers')
additem('gwint_card_vanhemar')
additem('gwint_card_vattier')
additem('gwint_card_vreemde')
additem('gwint_card_cahir')
additem('gwint_card_puttkammer')
additem('gwint_card_black_archer2')
additem('gwint_card_heavy_zerri')
additem('gwint_card_zerri')
additem('gwint_card_combat_engineer')
additem('gwint_card_young_emissary')
additem('gwint_card_young_emissary2')
additem('gwint_card_natalis')
additem('gwint_card_esterad')
additem('gwint_card_witch_hunters')
additem('gwint_card_catapult')
additem('gwint_card_catapult2')
additem('gwint_card_siege_tower')
additem('gwint_card_ballista_officer')
additem('gwint_card_ballista')
additem('gwint_card_siegfried')
additem('gwint_card_blue_stripes')
additem('gwint_card_blue_stripes2')
additem('gwint_card_blue_stripes3')
additem('gwint_card_crinfrid')
additem('gwint_card_crinfrid2')
additem('gwint_card_crinfrid3')
additem('gwint_card_stennis')
additem('gwint_card_poor_infantry')
additem('gwint_card_poor_infantry2')
additem('gwint_card_poor_infantry3')
additem('gwint_card_kaedwen')
additem('gwint_card_kaedwen2')
additem('gwint_card_philippa')
additem('gwint_card_vernon')
additem('gwint_card_dun_banner_medic')
additem('gwint_card_thaler')
additem('gwint_card_dijkstra')
additem('gwint_card_eithne')
additem('gwint_card_iorveth')
additem('gwint_card_barclay')
additem('gwint_card_dennis')
additem('gwint_card_milva')
additem('gwint_card_ida')
additem('gwint_card_filavandrel')
additem('gwint_card_yaevinn')
additem('gwint_card_toruviel')
additem('gwint_card_riordain')
additem('gwint_card_ciaran')
additem('gwint_card_mahakam')
additem('gwint_card_mahakam2')
additem('gwint_card_mahakam3')
additem('gwint_card_mahakam4')
additem('gwint_card_mahakam5')
additem('gwint_card_vrihedd_brigade')
additem('gwint_card_vrihedd_brigade2')
additem('gwint_card_havekar_support')
additem('gwint_card_havekar_support2')
additem('gwint_card_havekar_support3')
additem('gwint_card_dol_infantry')
additem('gwint_card_dol_infantry2')
additem('gwint_card_dol_infantry3')
additem('gwint_card_dol_dwarf')
additem('gwint_card_dol_dwarf2')
additem('gwint_card_dol_dwarf3')
additem('gwint_card_elf_skirmisher')
additem('gwint_card_elf_skirmisher2')
additem('gwint_card_elf_skirmisher3')
additem('gwint_card_vrihedd_cadet')
additem('gwint_card_dol_archer')
additem('gwint_card_havekar_nurse')
additem('gwint_card_havekar_nurse2')
additem('gwint_card_havekar_nurse3')
additem('gwint_card_saskia')
additem('gwint_card_isengrim')
additem('gwint_card_draug')
additem('gwint_card_kayran')
additem('gwint_card_imlerith')
additem('gwint_card_leshen')
additem('gwint_card_forktail')
additem('gwint_card_earth_elemental')
additem('gwint_card_fiend')
additem('gwint_card_griffin')
additem('gwint_card_plague_maiden')
additem('gwint_card_werewolf')
additem('gwint_card_botchling')
additem('gwint_card_frightener')
additem('gwint_card_ice_giant')
additem('gwint_card_endrega')
additem('gwint_card_harpy')
additem('gwint_card_gargoyle')
additem('gwint_card_celaeno_harpy')
additem('gwint_card_fire_elemental')
additem('gwint_card_arachas_behemoth')
additem('gwint_card_nekker')
additem('gwint_card_nekker2')
additem('gwint_card_nekker3')
additem('gwint_card_ekkima')
additem('gwint_card_crone_whispess')
additem('gwint_card_crone_weavess')
additem('gwint_card_katakan')
additem('gwint_card_bruxa')
additem('gwint_card_grave_hag')
additem('gwint_card_garkain')
additem('gwint_card_fleder')
additem('gwint_card_arachas')
additem('gwint_card_arachas2')
additem('gwint_card_arachas3')
additem('gwint_card_fogling')
additem('gwint_card_wyvern')
additem('gwint_card_ghoul')
additem('gwint_card_ghoul2')
additem('gwint_card_ghoul3')
additem('gwint_card_crone_brewess')
additem('gwint_card_cockatrice')
additem('gwint_card_geralt')
additem('gwint_card_yennefer')
additem('gwint_card_vesemir')
additem('gwint_card_ciri')
additem('gwint_card_triss')
additem('gwint_card_dandelion')
additem('gwint_card_zoltan')
additem('gwint_card_emiel')
additem('gwint_card_villen')
additem('gwint_card_avallach')
additem('gwint_card_scorch')
additem('gwint_card_horn')
additem('gwint_card_dummy')
additem('gwint_card_frost')
additem('gwint_card_fog')
additem('gwint_card_rain')
additem('gwint_card_clear_sky')
}

{World and Travels
ShowKnownPins(1) - display all "?" on the map
ShowPins(1) - uncovercover all map pins
ShowAllFT(1) - uncover fast travel pins
AllowFT(1) - enables Fast Travel from anywhere
gotoWyzima - portal to Wyzima
gotoNovigrad - portal to Novigrad
gotoSkellige - portal to Skellige
gotoKaerMohren - portal to KaerMohren
gotoProlog - portal to the Prologue Zone White Orchard
gotoPrologWinter - portal to the Prologue Zone winterly White Orchard
}

{xy(posX,posY) - portal to the coordinates posx,posy - use god to survive the fall or type the coordinates again, just before you hit the ground
e.g. xy(104,140) - teleports player to Fisherman Village

XY Port Coordinates
xy(11,10) - lonely_pine_crossroadUp; RoadSign
xy(120,10) - lonely_pine_crossroadDown; RoadSign
xy(574,12) - lonely_pine_crossroad_right; RoadSign
xy(12,574) - lonely_pine_crossroadLeft; RoadSign
xy(-40,-348) - lonely_pine; RoadSign
xy(-31,-259) - lonely_pine_02; RoadSign
xy(212,121) - ft_harbor_01; Boat
xy(434,343) - ft_harbor_02; Boat
xy(1024,1024) - wm_pin_NMLandNovigrad; WorldMap
xy(1024,200) - wm_pin_Skellige_ArdSkellig; WorldMap
xy(500,400) - wm_pin_Kaer_Morhen; WorldMap
xy(200,300) - wm_pin_Prologue_Village; WorldMap
xy(750,900) - wm_pin_Wyzima; WorldMap
xy(200,1024) - wm_pin_Island_of_Myst; WorldMap
xy(1000,200) - ard_hugtand_port; Boat
xy(400,200) - kaer_trolde_port; Boat
xy(355,266) - forest_verge; RoadSign
xy(222,767) - valley_route; RoadSign
xy(333,444) - fyresdal_village; RoadSign
xy(545,667) - arinbjorn_village; RoadSign
xy(7,-41) - kaer_trolde_crach_castle; RoadSign
xy(100,356) - kaer_trolde_crach_castle_tunel; RoadSign
xy(,) - e3d_startpoint; RoadSign e3 demo start
xy(444,333) - druids; RoadSign
xy(100,200) - DebugBidonRS1; RoadSign
xy(200,100) - DebugBidonRS2; RoadSign
xy(104,140) - FishermenVillage; RoadSign
xy(44,242) - FerylundVillage; RoadSign
xy(864,837) - e3_fake_crystal_cavern; RoadSign e3 demo fake fasttravel point
xy(677,929) - e3_fake_giant_cliff_islands; RoadSign e3 demo fake fasttravel point
xy(1441,131) - e3_fake_burners_village; RoadSign e3 demo fake fasttravel point
xy(-1461,-6) - e3_fake_old_monastery; RoadSign e3 demo fake fasttravel point
xy(-441,28) - e3_fake_upper_arinbjorn; RoadSign e3 demo fake fasttravel point
xy(-537,197) - e3_fake_arinbjorn_quarry; RoadSign e3 demo fake fasttravel point
xy(-222,617) - e3_fake_holmstein; RoadSign e3 demo fake fasttravel point
xy(126,496) - e3_fake_fyresdal; RoadSign e3 demo fake fasttravel point
xy(334,184) - e3_fake_hemmingur; RoadSign e3 demo fake fasttravel point
xy(164,-200) - e3_fake_mountain_passage; RoadSign e3 demo fake fasttravel point
xy(-447,369) - e3_fake_skellige_tombs; RoadSign e3 demo fake fasttravel point
xy(-287,-899) - e3_fake_dimun_village; RoadSign e3 demo fake fasttravel point
xy(840,-835) - e3_fake_nordbukt; RoadSign e3 demo fake fasttravel point
xy(-1102,505) - skellige_undvik_road_sign; RoadSign Fast travel to igi beach
xy(500,500) - DEBUG_wm_pin_April; WorldMap DEBUG FOR DROID REQUEST
xy(600,600) - DEBUG_wm_pin_May; WorldMap DEBUG FOR DROID REQUEST
}

SpawnHorse
instantMount('horse')
spawnBoatAndMount
makeitrain - summons a storm
stoprain - stops the rain

{changeweather(name) - change the weather to name

Default Weather
changeweather(WT_Clear)
changeweather(WT_Light_Clouds)
changeweather(WT_Mid_Clouds)
changeweather(WT_Heavy_Clouds)
changeweather(WT_Light_Rain)
changeweather(WT_Light_Snow)
changeweather(WT_Blizzard)
changeweather(WT_Rain_Storm)
Island Mist
changeweather(WT_Heavy_Clouds)
Kaer Morhen
changeweather(WT_Clear)
changeweather(WT_Rain_Storm)
changeweather(WT_Light_Clouds)
changeweather(WT_Mid_Clouds)
changeweather(WT_Vesemir_burial_hour_3_30)
changeweather(WT_Heavy_Clouds)
changeweather(WT_Heavy_Clouds_Dark)
changeweather(WT_Blizzard)
changeweather(WT_Battle)
changeweather(WT_Battle_Forest)
Novigrad
changeweather(WT_Clear)
changeweather(WT_Rain_Storm)
changeweather(WT_Light_Clouds)
changeweather(WT_Mid_Clouds)
changeweather(WT_Mid_Clouds_Dark)
changeweather(WT_Heavy_Clouds)
changeweather(WT_Heavy_Clouds_Dark)
changeweather(WT_Snow)
Prolog
changeweather(WT_Clear)
changeweather(WT_Rain_Storm)
changeweather(WT_Light_Rain)
changeweather(WT_Light_Clouds)
changeweather(WT_Mid_Clouds)
changeweather(WT_Heavy_Clouds)
Skellige
changeweather(WT_Rain_Storm)
changeweather(WT_Mid_Clouds_Dark)
changeweather(WT_Mid_Clouds_Fog)
changeweather(WT_Mid_Clouds)
changeweather(WT_Heavy_Clouds)
changeweather(WT_Blizzard)
changeweather(WT_Wild_Hunt)
changeweather(WT_Heavy_Clouds_Dark)
changeweather(WT_q501_Blizzard)
changeweather(WT_q501_Storm)
changeweather(WT_Clear)
changeweather(WT_q501_Blizzard2)
changeweather(WT_lessun_forest)
changeweather(WT_q501_fight_ship_18_00)
changeweather(WT_q501_storm_arena)
Template Spiral
changeweather(Spiral_Eternal_Cold)
changeweather(Spiral_Aen_Elle)
changeweather(Spiral_Desert)
changeweather(Spiral_Dark_Valley)
changeweather(Clear)
changeweather(Winter Epilog)
changeweather(WT_Heavy_Clouds)
changeweather(WT_Mid_Clouds)
Wyzima
}changeweather(WT_Mid_Clouds)

settime(time) - sets time to time
TM(number) - sets how fast time passes ingame

Interface
fadeout() / fadein() - turns the screen black
dlgshow() - turns the HUD off, also roots Geralt in place ... use dlghide() to show the interface
testpause() - pause the game, use testunpause() to continue
ToggleCameraAutoRotation() - turn off camera auto-center

{DLC Items Codes
additem('Dye Default')
additem('Dye Black')
additem('Dye Blue')
additem('Dye Brown')
additem('Dye Gray')
additem('Dye Green')
additem('Dye Orange')
additem('Dye Pink')
additem('Dye Purple')
additem('Dye Red')
additem('Dye Turquoise')
additem('Dye White')
additem('Dye Yellow')
additem('Beast Oil 1')
additem('Beast Oil 2')
additem('Beast Oil 3')
additem('Cursed Oil 1')
additem('Cursed Oil 2')
additem('Hanged Man Venom 2')
additem('Hanged Man Venom 3')
additem('Hybrid Oil 1')
additem('Hybrid Oil 2')
additem('Insectoid Oil 1')
additem('Insectoid Oil 2')
additem('Insectoid Oil 3')
additem('Magicals Oil 2')
additem('Magicals Oil 3')
additem('Necrophage Oil 1')
additem('Rune stribog lesser')
additem('Rune stribog')
additem('Rune stribog greater')
additem('Rune dazhbog lesser')
additem('Rune devana lesser')
additem('Rune devana')
additem('Rune devana greater')
additem('Rune zoria lesser')
additem('Rune zoria')
additem('Rune zoria greater')
additem('Rune morana')
additem('Rune morana greater')
additem('Rune triglav')
additem('Rune veles lesser')
additem('Rune veles')
additem('Rune veles greater')
additem('Rune perun lesser')
additem('Rune perun')
additem('Rune perun greater')
additem('Rune elemental lesser')
additem('Rune elemental')
additem('Rune elemental greater')
additem('Rune pierog')
additem('Rune tvarog')
additem('Glyph igni')
additem('Glyph yrden lesser')
additem('Glyph binding lesser')
additem('Glyph binding')
additem('Glyph binding greater')
additem('Glyph warding lesser')
additem('Glyph warding')
additem('Glyph warding greater')
additem('Arbitrator')
additem('Whetstone')
additem('Killer Whale 1')
additem('Pops Antidote')
additem('mh107_czart_lure')
additem('fists')
additem('Illusion Medallion')
additem('Bodkin Bolt')
additem('Harpoon Bolt')
additem('Silver Dust Bomb 1')
additem('Silver Dust Bomb 3')
additem('mq1058_doll')
additem('q705_tissue_extractor')
additem('Lesser mutagen green')
additem('Mutagen blue')
additem('Greater mutagen blue')
additem('q403_ciri_meteor')
additem('Geralt fists')
additem('fists_lightning_lynx')
additem('mon_q704_cloud_giant_ep2_weapon')
additem('mon_q701_giant_ep2_weapon')
additem('bestiary_sharley_book')
additem('bestiary_barghest_book')
additem('bestiary_garkain_book')
additem('bestiary_alp_book')
additem('bestiary_bruxa_book')
additem('bestiary_spriggan_book')
additem('bestiary_fleder_book')
additem('bestiary_wight_book')
additem('bestiary_dracolizard_book')
additem('bestiary_panther_book')
additem('bestiary_kikimore_book')
additem('bestiary_scolopendromorph_book')
additem('mq7023_fluff_book_scolopendromorphs')
additem('bestiary_archespore_book')
additem('bestiary_protofleder_book')
additem('Wolf Armor schematic')
additem('Witcher Wolf Jacket Upgrade schematic 1')
additem('Witcher Wolf Jacket Upgrade schematic 2')
additem('Witcher Wolf Jacket Upgrade schematic 3')
additem('Wolf Gloves schematic')
additem('Witcher Wolf Gloves Upgrade schematic 1')
additem('Witcher Wolf Gloves Upgrade schematic 2')
additem('Witcher Wolf Gloves Upgrade schematic 3')
additem('Wolf Pants schematic')
additem('Witcher Wolf Pants Upgrade schematic 1')
additem('Witcher Wolf Pants Upgrade schematic 2')
additem('Witcher Wolf Pants Upgrade schematic 3')
additem('Wolf Boots schematic')
additem('Witcher Wolf Boots Upgrade schematic 1')
additem('Witcher Wolf Boots Upgrade schematic 2')
additem('Witcher Wolf Boots Upgrade schematic 3')
additem('Wolf School steel sword schematic')
additem('Wolf School steel sword Upgrade schematic 1')
additem('Wolf School steel sword Upgrade schematic 2')
additem('Wolf School steel sword Upgrade schematic 3')
additem('Wolf School silver sword schematic')
additem('Wolf School silver sword Upgrade schematic 1')
additem('Wolf School silver sword Upgrade schematic 2')
additem('Wolf School silver sword Upgrade schematic 3')
additem('NGP Wolf Armor schematic')
additem('NGP Witcher Wolf Jacket Upgrade schematic 1')
additem('NGP Witcher Wolf Jacket Upgrade schematic 2')
additem('NGP Witcher Wolf Jacket Upgrade schematic 3')
additem('NGP Wolf Gloves schematic')
additem('NGP Witcher Wolf Gloves Upgrade schematic 1')
additem('NGP Witcher Wolf Gloves Upgrade schematic 2')
additem('NGP Witcher Wolf Gloves Upgrade schematic 3')
additem('NGP Wolf Pants schematic')
additem('NGP Witcher Wolf Pants Upgrade schematic 1')
additem('NGP Witcher Wolf Pants Upgrade schematic 2')
additem('NGP Witcher Wolf Pants Upgrade schematic 3')
additem('NGP Wolf Boots schematic')
additem('NGP Witcher Wolf Boots Upgrade schematic 1')
additem('NGP Witcher Wolf Boots Upgrade schematic 2')
additem('NGP Witcher Wolf Boots Upgrade schematic 3')
additem('NGP Wolf School steel sword schematic')
additem('NGP Wolf School steel sword Upgrade schematic')
additem('NGP Wolf School steel sword Upgrade schematic')
additem('NGP Wolf School steel sword Upgrade schematic')
additem('NGP Wolf School silver sword schematic')
additem('NGP Wolf School silver sword Upgrade schemati')
additem('NGP Wolf School silver sword Upgrade schemati')
additem('NGP Wolf School silver sword Upgrade schemati')
additem('q702_wicht_trophy')
additem('Spoon wooden')
additem('Spoon wooden 2')
additem('Spoon metal')
additem('Spoon metal 2')
additem('Spoon silver')
additem('Spoon silver 2')
additem('Spoon gold')
additem('Spoon gold 2')
additem('Recipe for Greater mutagen red')
additem('Recipe for Greater mutagen green')
additem('Recipe for Greater mutagen blue')
additem('Meteorite silver plate schematic')
additem('Glowing ingot schematic')
additem('Dwimeryte ore schematic')
additem('Dwimeryte plate schematic')
additem('Infused dust schematic')
additem('Infused crystal schematic')
additem('Draconide infused leather schematic')
additem('Nickel ore schematic')
additem('Cupronickel ore schematic')
additem('Copper ore schematic')
additem('Copper ingot schematic')
additem('Copper plate schematic')
additem('Green gold ore schematic')
additem('Green gold ore schematic 1')
additem('Green gold ingot schematic')
additem('Green gold plate schematic')
additem('Orichalcum ore schematic')
additem('Orichalcum ore schematic 1')
additem('Orichalcum ingot schematic')
additem('Orichalcum plate schematic')
additem('Dwimeryte enriched ore schematic')
additem('Dwimeryte enriched ingot schematic')
additem('Dwimeryte enriched plate schematic')
additem('Recipe for Trial Potion Kit')
additem('q603_diarrhea_potion_recipe')
additem('NGP DLC1 Temerian Armor')
additem('NGP DLC1 Temerian Gloves')
additem('NGP DLC1 Temerian Pants')
additem('NGP DLC1 Temerian Boots')
additem('NGP DLC5 Nilfgaardian Armor')
additem('NGP DLC5 Nilfgaardian Gloves')
additem('NGP DLC5 Nilfgaardian Pants')
additem('NGP DLC5 Nilfgaardian Boots')
additem('NGP Wolf Armor')
additem('NGP Wolf Armor 1')
additem('NGP Wolf Armor 2')
additem('NGP Wolf Armor 3')
additem('NGP Wolf Boots 1')
additem('NGP Wolf Boots 2')
additem('NGP Wolf Boots 3')
additem('NGP Wolf Boots 4')
additem('NGP Wolf Gloves 1')
additem('NGP Wolf Gloves 2')
additem('NGP Wolf Gloves 3')
additem('NGP Wolf Gloves 4')
additem('NGP Wolf Pants 1')
additem('NGP Wolf Pants 2')
additem('NGP Wolf Pants 3')
additem('NGP Wolf Pants 4')
additem('NGP Wolf School steel sword')
additem('NGP Wolf School steel sword 1')
additem('NGP Wolf School steel sword 2')
additem('NGP Wolf School steel sword 3')
additem('NGP Wolf School silver sword')
additem('NGP Wolf School silver sword 1')
additem('NGP Wolf School silver sword 2')
additem('NGP Wolf School silver sword 3')
additem('NGP DLC14 Skellige Armor')
additem('NGP DLC14 Skellige Gloves')
additem('NGP DLC14 Skellige Pants')
additem('NGP DLC14 Skellige Boots')
additem('Gryphon Pants 3')
additem('Gryphon School steel sword 2')
additem('Bear School silver sword 3')
additem('Ofir Armor')
additem('Ofir Sabre 2')
additem('Crafted Burning Rose Armor')
additem('Crafted Burning Rose Gloves')
additem('Crafted Burning Rose Sword')
additem('Crafted Ofir Armor')
additem('Crafted Ofir Boots')
additem('Crafted Ofir Gloves')
additem('Crafted Ofir Pants')
additem('Crafted Ofir Steel Sword')
additem('EP1 Crafted Witcher Silver Sword')
additem('Olgierd Sabre')
additem('EP1 Witcher Armor')
additem('EP1 Witcher Boots')
additem('EP1 Witcher Gloves')
additem('EP1 Witcher Pants')
additem('EP1 Viper School steel sword')
additem('EP1 Viper School silver sword')
additem('Lynx Armor 4')
additem('Gryphon Armor 4')
additem('Bear Armor 4')
additem('Wolf Armor 4')
additem('Red Wolf Armor 1')
additem('Lynx Gloves 5')
additem('Gryphon Gloves 5')
additem('Bear Gloves 5')
additem('Red Wolf Gloves 1')
additem('Lynx Pants 5')
additem('Gryphon Pants 5')
additem('Wolf Pants 5')
additem('Red Wolf Pants 1')
additem('Lynx Boots 5')
additem('Gryphon Boots 5')
additem('Bear Boots 5')
additem('Wolf Boots 5')
additem('Red Wolf Boots 1')
additem('Lynx School steel sword 4')
additem('Gryphon School steel sword 4')
additem('Bear School steel sword 4')
additem('Wolf School steel sword 4')
additem('Red Wolf School steel sword 1')
additem('Lynx School silver sword 4')
additem('Gryphon School silver sword 4')
additem('Bear School silver sword 4')
additem('Wolf School silver sword 4')
additem('Red Wolf School silver sword 1')
additem('Guard Lvl1 Armor 3')
additem('Guard Lvl1 A Armor 3')
additem('Guard Lvl2 Armor 3')
additem('Guard Lvl2 A Armor 3')
additem('Knight Geralt Armor 3')
additem('Knight Geralt A Armor 3')
additem('q702_vampire_armor')
additem('Guard Lvl1 Gloves 3')
additem('Guard Lvl1 A Gloves 3')
additem('Guard Lvl2 Gloves 3')
additem('Guard Lvl2 A Gloves 3')
additem('Knight Geralt Gloves 3')
additem('Knight Geralt A Gloves 3')
additem('q702_vampire_gloves')
additem('Guard Lvl1 Pants 3')
additem('Guard Lvl1 A Pants 3')
additem('Guard Lvl2 Pants 3')
additem('Guard Lvl2 A Pants 3')
additem('Knight Geralt Pants 3')
additem('Knight Geralt A Pants 3')
additem('q702_vampire_pants')
additem('Guard Lvl1 Boots 3')
additem('Guard Lvl1 A Boots 3')
additem('Guard Lvl2 Boots 3')
additem('Guard Lvl2 A Boots 3')
additem('Knight Geralt Boots 3')
additem('Knight Geralt A Boots 3')
additem('q702_vampire_boots')
additem('Serpent Steel Sword 1')
additem('Serpent Steel Sword 2')
additem('Serpent Steel Sword 3')
additem('Guard lvl1 steel sword 3')
additem('Guard lvl2 steel sword 3')
additem('Knights steel sword 3')
additem('Hanza steel sword 3')
additem('Toussaint steel sword 3')
additem('q702 vampire steel sword')
additem('Serpent Silver Sword 1')
additem('Serpent Silver Sword 2')
additem('Serpent Silver Sword 3')
additem('q704_ft_golden_egg')
additem('mq7023_cake')
additem('Preview Hair')
additem('Half With Tail Hairstyle')
additem('q103_safe_conduct')
additem('EP1 Standalone Starting Armor')
additem('Arachas eyes')
additem('Bear pelt')
additem('Dwimeryte ingot')
additem('Hardened leather')
additem('Hardened timber')
additem('Harpy feathers')
additem('Horse hide')
additem('Iron ore')
additem('Leather straps')
additem('Leather')
additem('Linen')
additem('Meteorite ingot')
additem('Meteorite ore')
additem('Pure silver')
additem('Rabbit pelt')
additem('Rotfiend blood')
additem('Sapphire dust')
additem('Silk')
additem('Silver ingot')
additem('Silver ore')
additem('Specter dust')
additem('Steel ingot')
additem('Steel plate')
additem('Thread')
additem('Timber')
additem('Twine')
additem('Venom extract')
additem('Water essence')
additem('Wolf pelt')
additem('Alcohest')
additem('Dwarven spirit')
additem('Crossbow 5')
additem('Blunt Bolt')
additem('Broadhead Bolt')
additem('Split Bolt')
additem('Recipe for Maribor Forest 1')
additem('Recipe for Tawny Owl 1')
additem('Recipe for White Gull 1')
additem('Recipe for White Raffards Decoction 1')
additem('Recipe for Beast Oil 1')
additem('Recipe for Cursed Oil 1')
additem('Recipe for Hybrid Oil 1')
additem('Recipe for Insectoid Oil 1')
additem('Recipe for Magicals Oil 1')
additem('Recipe for Vampire Oil 1')
additem('Recipe for Draconide Oil 1')
additem('Recipe for Ogre Oil 1')
additem('Recipe for Relic Oil 1')
additem('Recipe for Beast Oil 2')
additem('Recipe for Cursed Oil 2')
additem('Recipe for Hybrid Oil 2')
additem('Recipe for Insectoid Oil 2')
additem('Recipe for Magicals Oil 2')
additem('Recipe for Necrophage Oil 2')
additem('Recipe for Specter Oil 2')
additem('Recipe for Vampire Oil 2')
additem('Recipe for Draconide Oil 2')
additem('Recipe for Ogre Oil 2')
additem('Recipe for Relic Oil 2')
additem('Recipe for Dancing Star 1')
additem('Recipe for White Frost 1')
additem('Recipe for Dwarven spirit 1')
additem('Swallow 2')
additem('Thunderbolt 2')
additem('Tawny Owl 2')
additem('Samum 2')
additem('Dragons Dream 1')
additem('White Frost 2')
additem('Devils Puffball 2')
additem('Dancing Star 2')
additem('Black Blood 1')
additem('Blizzard 1')
additem('Cat 2')
additem('Full Moon 1')
additem('Maribor Forest 1')
additem('White Gull 1')
additem('White Honey 2')
additem('White Raffards Decoction 1')
additem('Mutagen 17')
additem('Mutagen 19')
additem('Mutagen 27')
additem('armor_repair_kit_1')
additem('armor_repair_kit_2')
additem('armor_repair_kit_3')
additem('weapon_repair_kit_1')
additem('weapon_repair_kit_2')
additem('weapon_repair_kit_3')
additem('Cows milk')
additem('Dumpling')
additem('Horse Bag 2')
additem('Horse Saddle 2')
additem('Leather squares')
additem('Orichalcum ingot')
additem('Orichalcum plate')
additem('Dwimeryte plate')
additem('Dwimeryte enriched ingot')
additem('Ruby dust')
additem('Ruby')
additem('Ruby flawless')
additem('Sapphire')
additem('Monstrous brain')
additem('Monstrous blood')
additem('Monstrous bone')
additem('Monstrous claw')
additem('Monstrous ear')
additem('Monstrous egg')
additem('Monstrous eye')
additem('Monstrous essence')
additem('Monstrous feather')
additem('Monstrous heart')
additem('Monstrous liver')
additem('Monstrous plate')
additem('Monstrous saliva')
additem('Monstrous tongue')
additem('Siren vocal cords')
additem('Devil Saddle')
additem('PC Caretaker Shovel')
additem('Cat 1')
additem('Boots 2 schematic')
additem('No Mans Land sword 2')
additem('No Mans Land sword 3')
additem('Silver sword 5')
additem('Heavy pants 02')
additem('Heavy gloves 02')
additem('Heavy armor 02')
additem('Scoiatael sword 1')
additem('Horse Hair 0')
additem('gwint_card_foltest_platinium')
additem('gwint_card_emhyr_platinium')
additem('gwint_card_francesca_platinium')
additem('gwint_card_eredin_platinium')
additem('gwint_card_king_bran_bronze')
additem('gwint_card_vernon')
additem('gwint_card_natalis')
additem('gwint_card_esterad')
additem('gwint_card_philippa')
additem('gwint_card_thaler')
additem('gwint_card_dijkstra')
additem('gwint_card_siege_tower')
additem('gwint_card_blue_stripes')
additem('gwint_card_crinfrid')
additem('gwint_card_crinfrid2')
additem('gwint_card_crinfrid3')
additem('gwint_card_catapult')
additem('gwint_card_catapult2')
additem('gwint_card_poor_infantry2')
additem('gwint_card_poor_infantry3')
additem('gwint_card_letho')
additem('gwint_card_black_archer')
additem('gwint_card_menno')
additem('gwint_card_moorvran')
additem('gwint_card_tibor')
additem('gwint_card_albrich')
additem('gwint_card_combat_engineer')
additem('gwint_card_fringilla')
additem('gwint_card_cynthia')
additem('gwint_card_shilard')
additem('gwint_card_sweers')
additem('gwint_card_vanhemar')
additem('gwint_card_vattier')
additem('gwint_card_vreemde')
additem('gwint_card_cahir')
additem('gwint_card_puttkammer')
additem('gwint_card_heavy_zerri')
additem('gwint_card_zerri')
additem('gwint_card_impera_brigade')
additem('gwint_card_impera_brigade2')
additem('gwint_card_impera_brigade3')
additem('gwint_card_impera_brigade4')
additem('gwint_card_archer_support2')
additem('gwint_card_siege_support')
additem('gwint_card_nausicaa2')
additem('gwint_card_nausicaa3')
additem('gwint_card_stefan')
additem('gwint_card_young_emissary')
additem('gwint_card_young_emissary2')
additem('gwint_card_eithne')
additem('gwint_card_saskia')
additem('gwint_card_yaevinn')
additem('gwint_card_toruviel')
additem('gwint_card_havekar_support')
additem('gwint_card_havekar_support2')
additem('gwint_card_vrihedd_brigade2')
additem('gwint_card_dol_infantry')
additem('gwint_card_dol_infantry3')
additem('gwint_card_dol_dwarf')
additem('gwint_card_dol_dwarf2')
additem('gwint_card_dol_dwarf3')
additem('gwint_card_mahakam3')
additem('gwint_card_mahakam4')
additem('gwint_card_mahakam5')
additem('gwint_card_elf_skirmisher3')
additem('gwint_card_vrihedd_cadet')
additem('gwint_card_dol_archer')
additem('gwint_card_havekar_nurse')
additem('gwint_card_havekar_nurse2')
additem('gwint_card_havekar_nurse3')
additem('gwint_card_schirru')
additem('gwint_card_draug')
additem('gwint_card_kayran')
additem('gwint_card_imlerith')
additem('gwint_card_leshen')
additem('gwint_card_forktail')
additem('gwint_card_earth_elemental')
additem('gwint_card_fiend')
additem('gwint_card_plague_maiden')
additem('gwint_card_griffin')
additem('gwint_card_werewolf')
additem('gwint_card_botchling')
additem('gwint_card_frightener')
additem('gwint_card_endrega')
additem('gwint_card_harpy')
additem('gwint_card_cockatrice')
additem('gwint_card_gargoyle')
additem('gwint_card_celaeno_harpy')
additem('gwint_card_grave_hag')
additem('gwint_card_fire_elemental')
additem('gwint_card_fogling')
additem('gwint_card_wyvern')
additem('gwint_card_arachas_behemoth')
additem('gwint_card_arachas')
additem('gwint_card_arachas2')
additem('gwint_card_arachas3')
additem('gwint_card_nekker')
additem('gwint_card_nekker2')
additem('gwint_card_nekker3')
additem('gwint_card_ekkima')
additem('gwint_card_garkain')
additem('gwint_card_bruxa')
additem('gwint_card_katakan')
additem('gwint_card_ghoul')
additem('gwint_card_ghoul2')
additem('gwint_card_ghoul3')
additem('gwint_card_hjalmar')
additem('gwint_card_cerys')
additem('gwint_card_ermion')
additem('gwint_card_draig')
additem('gwint_card_holger_blackhand')
additem('gwint_card_madman_lugos')
additem('gwint_card_donar_an_hindar')
additem('gwint_card_udalryk')
additem('gwint_card_birna_bran')
additem('gwint_card_blueboy_lugos')
additem('gwint_card_svanrige')
additem('gwint_card_olaf')
additem('gwint_card_berserker')
additem('gwint_card_young_berserker')
additem('gwint_card_clan_tordarroch_armorsmith')
additem('gwint_card_clan_heymaey_skald')
additem('gwint_card_light_drakkar')
additem('gwint_card_clan_drummond_shieldmaiden3')
additem('gwint_card_clan_dimun_pirate')
additem('gwint_card_cock')
additem('gwint_card_geralt')
additem('gwint_card_vesemir')
additem('gwint_card_yennefer')
additem('gwint_card_ciri')
additem('gwint_card_dandelion')
additem('gwint_card_zoltan')
additem('gwint_card_emiel')
additem('gwint_card_villen')
additem('gwint_card_olgierd')
additem('gwint_card_mrmirror')
additem('gwint_card_mrmirror_foglet')
additem('gwint_card_cow')
additem('gwint_card_dummy')
additem('gwint_card_horn')
additem('gwint_card_scorch')
additem('gwint_card_frost')
additem('gwint_card_fog')
additem('gwint_card_clear_sky')
additem('gwint_card_mushroom')
additem('gwint_card_skellige_storm')
additem('Tracking Bolt')
additem('Target Point Bolt')
additem('Explosive Bolt')
additem('Blunt Bolt Legendary')
additem('Broadhead Bolt Legendary')
additem('Target Point Bolt Legendary')
additem('Split Bolt Legendary')
additem('Explosive Bolt Legendary')
additem('Autogen silver sword')
additem('Autogen Pants')
additem('Autogen Gloves')
additem('Autogen Boots')
additem('Autogen Armor')
additem('White Honey 3')
additem('Blizzard 3')
additem('White Raffards Decoction 3')
additem('Cat 3')
additem('Swallow 3')
additem('Black Blood 3')
additem('Maribor Forest 3')
additem('White Frost 3')
additem('Devils Puffball 3')
additem('Dancing Star 3')
additem('Dragons Dream 3')
additem('Gloves 01')
additem('Pants 01')
additem('vivaldis_bill_of_exchange')
additem('Florens')
additem('Tawny Owl 1')
additem('Bottled water')
additem('Witcher Silver Sword')
additem('Starting Gloves')
additem('Starting Pants')
additem('Starting Boots')
additem('Starting Armor')
additem('Celandine')
additem('Berbercane fruit')
additem('Hellebore petals')
additem('Cortinarius')
additem('Saltpetre')
additem('Calcium equum')
additem('Blowbill')
additem('Egg')
additem('Fiber')
additem('Sap')
additem('Resin')
additem('Wax')
additem('Lead ore')
additem('Gold mineral')
additem('Nails')
additem('Iron ingot')
additem('Wire')
additem('Silver mineral')
additem('Parchment')
additem('Amber')
additem('Amber fossil')
additem('Gold ore')
additem('Wire rope')
additem('Silver plate')
additem('Medium armor 11')
additem('Ekimma mutagen')
additem('Fogling 1 mutagen')
additem('Doppler mutagen')
additem('No Mans Land sword 3 schematic')
additem('Recipe for Vermilion')
additem('Scoiatael sword 2 schematic')
additem('Scoiatael sword 3 schematic')
additem('Recipe for Rubedo')
additem('Recipe for Rebis')
additem('Novigraadan sword 1 schematic')
additem('Novigraadan sword 4 schematic')
additem('Short Steel Sword')
additem('Spear 2')
additem('Apple')
additem('Kaedwenian Stout')
additem('Hjalmar_Short_Steel_Sword')
additem('Rusty No Mans Land sword')
additem('Inquisitor sword 2')
additem('Gnomish sword 2')
additem('an_skellige_map')
additem('ard_skellige_map')
additem('faroe_map')
additem('hindarsfjal_map')
additem('undvik_map')
additem('spikeroog_map')
additem('Katakan mutagen')
additem('Verbena')
additem('Arenaria')
additem('Longrube')
additem('Arachas mutagen')
additem('White myrtle')
additem('Han')
additem('Nostrix')
additem('Cockatrice mutagen')
additem('Pringrape')
additem('Volcanic Gryphon mutagen')
additem('Ribleaf')
additem('Ergot seeds')
additem('Water Hag mutagen')
additem('Bloodmoss')
additem('Green mold')
additem('Flowers')
additem('q103_bell')
additem('Samum 1')
additem('Dancing Star 1')
additem('Devils Puffball 1')
additem('Dragons Dream 2')
additem('White Frost 1')
additem('Grapeshot 1')
additem('Infused shard')
additem('Heavy Boots 2 schematic')
additem('Heavy Boots 1 schematic')
additem('Pants 1 schematic')
additem('Heavy Pants 2 schematic')
additem('Short sword 1')
additem('Short sword 2')
additem('Dwarven sword 1')
additem('Dwarven sword 2')
additem('Gnomish sword 1')
additem('Inquisitor sword 1')
additem('No Mans Land sword 1')
additem('No Mans Land sword 1 q2')
additem('Rusty Nilfgaardian sword')
additem('Nilfgaardian sword 1')
additem('Nilfgaardian sword 4')
additem('Rusty Novigraadan sword')
additem('Novigraadan sword 1')
additem('Novigraadan sword 3')
additem('Novigraadan sword 4')
additem('Scoiatael sword 2')
additem('Scoiatael sword 3')
additem('Rusty Skellige sword')
additem('Skellige sword 1')
additem('Skellige sword 4')
additem('Wild Hunt sword 1')
additem('Wild Hunt sword 2')
additem('Wild Hunt sword 3')
additem('Wild Hunt sword 4')
additem('Wolf Armor')
additem('Wolf Armor 1')
additem('Wolf Armor 2')
additem('Wolf Armor 3')
additem('Wolf Gloves 1')
additem('Wolf Gloves 2')
additem('Wolf Pants 1')
additem('Wolf Pants 2')
additem('Wolf Boots 1')
additem('Wolf Boots 2')
additem('Wolf School steel sword')
additem('Wolf School steel sword 1')
additem('Wolf School steel sword 2')
additem('Wolf School steel sword 3')
additem('Wolf School silver sword')
additem('Wolf School silver sword 1')
additem('Wolf School silver sword 2')
additem('Wolf School silver sword 3')
additem('Silver sword 6')
additem('Silver sword 7')
additem('Silver sword 8')
additem('Dwarven silver sword 1')
additem('Dwarven silver sword 2')
additem('Elven silver sword 1')
additem('Elven silver sword 2')
additem('Gnomish silver sword 1')
additem('Gnomish silver sword 2')
additem('Crossbow 1')
additem('Crossbow q206')
additem('Crossbow 2')
additem('Crossbow 3')
additem('Crossbow 4')
additem('Crossbow 6')
additem('Crossbow 7')
additem('Lynx School Crossbow')
additem('Bear School Crossbow')
additem('Nilfgaardian crossbow')
additem('Heavy armor 03')
additem('Heavy armor 04')
additem('Heavy armor 05')
additem('Light armor 02')
additem('Light armor 03')
additem('Light armor 04')
additem('Light armor 06')
additem('Light armor 07')
additem('Light armor 08')
additem('Light armor 09')
additem('Medium armor 01')
additem('Medium armor 02')
additem('Medium armor 03')
additem('Medium armor 04')
additem('Medium armor 05')
additem('Medium armor 07')
additem('Medium armor 10')
additem('Nilfgaardian Casual Suit 01')
additem('Nilfgaardian Casual Suit 02')
additem('Nilfgaardian Casual Suit 03')
additem('Skellige Casual Suit 01')
additem('Skellige Casual Suit 02')
additem('Geralt Shirt No Knife')
additem('sq108_heavy_armor')
additem('Pants 01 q2')
additem('Pants 03')
additem('Pants 04')
additem('Heavy pants 03')
additem('Heavy pants 04')
additem('Nilfgaardian Casual Pants')
additem('Skellige Casual Pants 01')
additem('Skellige Casual Pants 02')
additem('Bath Towel Pants 01')
additem('Ciri pants 01')
additem('Wild Hunt pants 01')
additem('Boots 01 q2')
additem('Boots 02')
additem('Boots 03')
additem('Heavy boots 03')
additem('Heavy boots 04')
additem('Nilfgaardian casual shoes')
additem('Skellige casual shoes')
additem('Radovid boots 01')
additem('Gloves 01 q2')
additem('Gloves 02')
additem('Gloves 03')
additem('Heavy gloves 03')
additem('Heavy gloves 04')
additem('Wild Hunt gloves 01')
additem('Wild Hunt')
additem('Horse vol 1')
additem('Horse vol 2')
additem('Boat vol 1')
additem('Boat vol 2')
additem('Gear improvement')
additem('Theatre Glossary vol 2')
additem('Jacob of Varazze Chronicles')
additem('Poems of Gonzal de Verceo')
additem('Book of Arachases')
additem('Glossary Temerian Dynasty')
additem('Orders from Shilard')
additem('Journey into the mind')
additem('Necronomicon')
additem('lore_imperial_edict_i')
additem('lore_imperial_edict_ii')
additem('lore_nilfgaardian_royal_dynasty')
additem('lore_nilfgaardian_history_book')
additem('lore_nilfgaardian_empire')
additem('lore_lodge_of_sorceresses')
additem('lore_third_war_with_nilfgaard')
additem('lore_wars_with_nilfgaard')
additem('lore_novigrad')
additem('lore_skellige_island')
additem('lore_skellige_heroes_sove')
additem('lore_skellige_heroes_tyr')
additem('lore_skellige_heroes_otkell')
additem('lore_skellige_heroes_modolf')
additem('lore_skellige_heroes_broddr')
additem('lore_skellige_heroes_grymmdjarr')
additem('lore_oxenfurt')
additem('lore_velen')
additem('lore_fate_of_temeria')
additem('lore_fall_of_wyzima')
additem('lore_summit_of_loc_muinne')
additem('lore_redania')
additem('lore_radovids_rise_to_power')
additem('lore_redanian_secret_service')
additem('lore_kovir')
additem('lore_basics_of_magic')
additem('lore_principles_of_eternal_fire')
additem('lore_cult_of_freyia')
additem('lore_cult_of_hemdall')
additem('lore_druids')
additem('lore_witchers')
additem('lore_monstrum')
additem('lore_radovid_propaganda_pamphlet')
additem('lore_the_great_four')
additem('lore_wild_hunt')
additem('lore_non_humans')
additem('lore_prophecy_of_ithlinne')
additem('lore_conjunction_of_spheres')
additem('lore_theory_of_spheres')
additem('lore_elder_blood')
additem('lore_an_seidhe_and_aen_elle')
additem('lore_cirilla_of_cintra')
additem('lore_elven_sages')
additem('lore_elven_ruins')
additem('lore_elven_legends')
additem('lore_witch_hunters')
additem('lore_goetia')
additem('lore_oneiromancy')
additem('lore_hydromancy')
additem('lore_necromancy')
additem('lore_tyromancy')
additem('lore_war_between_astrals')
additem('lore_witcher_signs')
additem('lore_last_wish')
additem('lore_bells_of_beauclair')
additem('lore_sands_of_zerrikania')
additem('lore_naglfar_demonic_drakkar')
additem('lore_ragnarok')
additem('lore_study_on_white_cold')
additem('Beauclair White')
additem('Cherry Cordial')
additem('Mandrake cordial')
additem('Mettina Rose')
additem('Nilfgaardian Lemon')
additem('Redanian Herbal')
additem('Redanian Lager')
additem('Temerian Rye')
additem('Viziman Champion')
additem('Baked apple')
additem('Banana')
additem('Bell pepper')
additem('Blueberries')
additem('Burned bread')
additem('Bun')
additem('Burned bun')
additem('Candy')
additem('Cheese')
additem('Chicken')
additem('Chicken leg')
additem('Roasted chicken leg')
additem('Roasted chicken')
additem('Chicken sandwich')
additem('Grilled chicken sandwich')
additem('Cucumber')
additem('Dried fruit')
additem('Dried fruit and nuts')
additem('Fish')
additem('Fried fish')
additem('Gutted fish')
additem('Fondue')
additem('Grapes')
additem('Ham sandwich')
additem('Very good honey')
additem('Honeycomb')
additem('Fried meat')
additem('Raw meat')
additem('Goats milk')
additem('Mushroom')
additem('Mutton curry')
additem('Mutton leg')
additem('Olive')
additem('Onion')
additem('Pear')
additem('Pepper')
additem('Plum')
additem('Pork')
additem('Grilled pork')
additem('Potatoes')
additem('Baked potato')
additem('Chips')
additem('Raspberry juice')
additem('Strawberries')
additem('Toffee')
additem('Vinegar')
additem('Butter Bandalura')
additem('Apple juice')
additem('q002_griffin_trophy')
additem('mh101_cockatrice_trophy')
additem('mh102_arachas_trophy')
additem('mh103_nightwraith_trophy')
additem('mh104_ekimma_trophy')
additem('mh105_wyvern_trophy')
additem('mh106_gravehag_trophy')
additem('mh107_czart_trophy')
additem('mh108_fogling_trophy')
additem('mh201_cave_troll_trophy')
additem('mh202_nekker_warrior_trophy')
additem('mh204_leshy_trophy')
additem('mh206_fiend_trophy')
additem('mh207_wraith_trophy')
additem('mh208_forktail_trophy')
additem('mh210_lamia_trophy')
additem('mq1051_wyvern_trophy')
additem('mh302_leshy_trophy')
additem('mh303_succubus_trophy')
additem('mh304_katakan_trophy')
additem('mh305_doppler_trophy')
additem('mh306_dao_trophy')
additem('mh308_noonwraith_trophy')
additem('sq108_griffin_trophy')
additem('mq0003_noonwraith_trophy')
additem('Painting_of_hemmelfart')
additem('Dismantle Kit')
additem('q106_magic_oillamp')
additem('Oil Lamp')
additem('ciris_phylactery')
additem('Horse Bag 1')
additem('Horse Bag 3')
additem('Horse Blinder 1')
additem('Horse Blinder 3')
additem('Horse Saddle 1')
additem('Horse Saddle 1v2')
additem('Horse Saddle 1v3')
additem('Horse Saddle 1v4')
additem('Horse Saddle 2v3')
additem('Horse Saddle 2v4')
additem('Horse Saddle 3')
additem('Horse Saddle 3v2')
additem('Horse Saddle 3v3')
additem('Horse Saddle 3v4')
additem('Horse Saddle 4')
additem('Shaved With Tail Hairstyle')
additem('Long Loose Hairstyle')
additem('Cockatrice egg')
additem('Crystalized essence')
additem('Cyclops eye')
additem('Dragon scales')
additem('Elemental essence')
additem('Fiend eye')
additem('Glowing ore')
additem('Golem heart')
additem('Gryphon egg')
additem('Gryphon feathers')
additem('Lamia lock of hair')
additem('Leshy resin')
additem('Nightwraith dark essence')
additem('Noonwraith light essence')
additem('Troll skin')
additem('Vampire fang')
additem('Vampire saliva')
additem('Werewolf pelt')
additem('Werewolf saliva')
additem('White bear pelt')
additem('White wolf pelt')
additem('Wyvern egg')
additem('Wyvern plate')
additem('Short sword 1 schematic')
additem('Short sword 2 schematic')
additem('No Mans Land sword 1 schematic')
additem('No Mans Land sword 2 schematic')
additem('Bear School Crossbow schematic')
additem('Nilfgaardian sword 1 schematic')
additem('Light Armor 1 schematic')
additem('Skellige sword 2 schematic')
additem('Gryphon School steel sword schematic')
additem('Viper Steel sword schematic')
additem('No Mans Land sword 4 schematic')
additem('Nilfgaardian sword 4 schematic')
additem('Inquisitor sword 1 schematic')
additem('Bear School steel sword schematic')
additem('Inquisitor sword 2 schematic')
additem('Silver sword 1 schematic')
additem('Silver sword 2 schematic')
additem('Dwarven sword 1 schematic')
additem('Dwarven sword 2 schematic')
additem('Boots 4 schematic')
additem('Gnomish sword 2 schematic')
additem('Silver sword 3 schematic')
additem('Pants 3 schematic')
additem('Silver sword 4 schematic')
additem('Pants 4 schematic')
additem('Silver sword 6 schematic')
additem('Heavy Pants 1 schematic')
additem('Silver sword 7 schematic')
additem('Bear School silver sword schematic')
additem('Heavy Pants 4 schematic')
additem('Elven silver sword 2 schematic')
additem('Gloves 1 schematic')
additem('Dwarven silver sword 1 schematic')
additem('Gloves 2 schematic')
additem('Dwarven silver sword 2 schematic')
additem('Gloves 3 schematic')
additem('Gnomish silver sword 1 schematic')
additem('Gloves 4 schematic')
additem('Gnomish silver sword 2 schematic')
additem('Heavy Gloves 1 schematic')
additem('Heavy Gloves 2 schematic')
additem('Heavy Gloves 3 schematic')
additem('Heavy Gloves 4 schematic')
additem('Gryphon Armor schematic')
additem('Bear Armor schematic')
additem('Witcher Bear Jacket Upgrade schematic 1')
additem('Witcher Bear Jacket Upgrade schematic 2')
additem('Witcher Bear Jacket Upgrade schematic 3')
additem('Witcher Bear Boots Upgrade schematic 1')
additem('Witcher Bear Pants Upgrade schematic 1')
additem('Bear School silver sword Upgrade schematic 1')
additem('Bear School silver sword Upgrade schematic 2')
additem('Bear School silver sword Upgrade schematic 3')
additem('Witcher Gryphon Jacket Upgrade schematic 1')
additem('Witcher Gryphon Jacket Upgrade schematic 2')
additem('Witcher Gryphon Jacket Upgrade schematic 3')
additem('Witcher Gryphon Boots Upgrade schematic 1')
additem('Witcher Gryphon Pants Upgrade schematic 1')
additem('Witcher Gryphon Gloves Upgrade schematic 1')
additem('Gryphon School steel sword Upgrade schematic')
additem('Gryphon School steel sword Upgrade schematic')
additem('Gryphon School steel sword Upgrade schematic')
additem('Gryphon School silver sword Upgrade schematic')
additem('Gryphon School silver sword Upgrade schematic')
additem('Gryphon School silver sword Upgrade schematic')
additem('Witcher Lynx Jacket Upgrade schematic 1')
additem('Witcher Lynx Jacket Upgrade schematic 2')
additem('Witcher Lynx Jacket Upgrade schematic 3')
additem('Witcher Lynx Boots Upgrade schematic 1')
additem('Witcher Lynx Pants Upgrade schematic 1')
additem('Witcher Lynx Gloves Upgrade schematic 1')
additem('Lynx School steel sword Upgrade schematic 1')
additem('Lynx School steel sword Upgrade schematic 2')
additem('Lynx School steel sword Upgrade schematic 3')
additem('Lynx School silver sword Upgrade schematic 2')
additem('Lynx School silver sword Upgrade schematic 3')
additem('Rune stribog schematic')
additem('Rune stribog greater schematic')
additem('Rune dazhbog lesser schematic')
additem('Rune dazhbog schematic')
additem('Rune dazhbog greater schematic')
additem('Rune devana lesser schematic')
additem('Rune devana schematic')
additem('Rune devana greater schematic')
additem('Rune zoria lesser schematic')
additem('Rune zoria schematic')
additem('Rune zoria greater schematic')
additem('Rune morana lesser schematic')
additem('Rune morana schematic')
additem('Rune morana greater schematic')
additem('Rune triglav lesser schematic')
additem('Rune triglav schematic')
additem('Rune triglav greater schematic')
additem('Rune svarog lesser schematic')
additem('Rune svarog schematic')
additem('Rune svarog greater schematic')
additem('Rune veles lesser schematic')
additem('Rune veles schematic')
additem('Rune veles greater schematic')
additem('Rune perun lesser schematic')
additem('Rune perun schematic')
additem('Rune perun greater schematic')
additem('Rune elemental lesser schematic')
additem('Rune elemental schematic')
additem('Rune elemental greater schematic')
additem('Short sword 1_crafted')
additem('Short sword 2_crafted')
additem('No Mans Land sword 1_crafted')
additem('No Mans Land sword 2_crafted')
additem('Skellige sword 1_crafted')
additem('Nilfgaardian sword 1_crafted')
additem('Novigraadan sword 1_crafted')
additem('No Mans Land sword 3_crafted')
additem('Novigraadan sword 4_crafted')
additem('Nilfgaardian sword 4_crafted')
additem('Scoiatael sword 3_crafted')
additem('Inquisitor sword 1_crafted')
additem('Inquisitor sword 2_crafted')
additem('Dwarven sword 1_crafted')
additem('Dwarven sword 2_crafted')
additem('Gnomish sword 1_crafted')
additem('Gnomish sword 2_crafted')
additem('Silver sword 1_crafted')
additem('Silver sword 2_crafted')
additem('Silver sword 3_crafted')
additem('Silver sword 4_crafted')
additem('Silver sword 6_crafted')
additem('Silver sword 7_crafted')
additem('Elven silver sword 1_crafted')
additem('Elven silver sword 2_crafted')
additem('Dwarven silver sword 1_crafted')
additem('Dwarven silver sword 2_crafted')
additem('Gnomish silver sword 1_crafted')
additem('Gnomish silver sword 2_crafted')
additem('Beannshie_crafted')
additem('Longclaw_crafted')
additem('Harpy_crafted')
additem('Negotiator_crafted')
additem('Weeper_crafted')
additem('Boots 01_crafted')
additem('Boots 02_crafted')
additem('Boots 03_crafted')
additem('Boots 04_crafted')
additem('Heavy boots 01_crafted')
additem('Heavy boots 02_crafted')
additem('Heavy boots 03_crafted')
additem('Heavy boots 04_crafted')
additem('Heavy Boots 3 schematic')
additem('Heavy Boots 4 schematic')
additem('Lynx Boots schematic')
additem('Lynx Gloves schematic')
additem('Lynx Pants schematic')
additem('Gryphon Boots schematic')
additem('Gryphon Gloves schematic')
additem('Gryphon Pants schematic')
additem('Bear Boots schematic')
additem('Bear Gloves schematic')
additem('Bear Pants schematic')
additem('Light Armor 2 schematic')
additem('Light Armor 3 schematic')
additem('W_Axe06')
additem('Fogling 2 mutagen')
additem('Forktail mutagen')
additem('Grave Hag mutagen')
additem('Wraith mutagen')
additem('Recipe Lesser Mutagen Red to Blue')
additem('Recipe Lesser Mutagen Red to Green')
additem('Recipe Lesser Mutagen Blue to Red')
additem('Recipe Lesser Mutagen Blue to Green')
additem('Recipe Lesser Mutagen Green to Red')
additem('Recipe Lesser Mutagen Green to Blue')
additem('Recipe Mutagen Red to Blue')
additem('Recipe Mutagen Red to Green')
additem('Recipe Mutagen Blue to Red')
additem('Recipe Mutagen Blue to Green')
additem('Recipe Mutagen Green to Red')
additem('Recipe Mutagen Green to Blue')
additem('Recipe Greater Mutagen Red to Blue')
additem('Recipe Greater Mutagen Red to Green')
additem('Recipe Greater Mutagen Blue to Red')
additem('Recipe Greater Mutagen Blue to Green')
additem('Recipe Greater Mutagen Green to Red')
additem('Recipe Greater Mutagen Green to Blue')
additem('Recipe for Beast Oil 3')
additem('Recipe for Cursed Oil 3')
additem('Recipe for Hanged Man Venom 3')
additem('Recipe for Hybrid Oil 3')
additem('Recipe for Insectoid Oil 3')
additem('Recipe for Magicals Oil 3')
additem('Recipe for Necrophage Oil 3')
additem('Recipe for Specter Oil 3')
additem('Recipe for Vampire Oil 3')
additem('Recipe for Ogre Oil 3')
additem('Recipe for Relic Oil 3')
additem('Recipe for Dancing Star 2')
additem('Recipe for Dancing Star 3')
additem('Recipe for Devils Puffball 1')
additem('Recipe for Devils Puffball 2')
additem('Recipe for Devils Puffball 3')
additem('Recipe for Dragons Dream 1')
additem('Recipe for Dragons Dream 2')
additem('Recipe for Dragons Dream 3')
additem('Recipe for Grapeshot 2')
additem('Recipe for Grapeshot 3')
additem('Recipe for Samum 2')
additem('Recipe for Silver Dust Bomb 1')
additem('Recipe for Silver Dust Bomb 2')
additem('Recipe for Silver Dust Bomb 3')
additem('Recipe for Black Blood 1')
additem('Recipe for Black Blood 2')
additem('Recipe for Black Blood 3')
additem('Recipe for Blizzard 1')
additem('Recipe for Blizzard 2')
additem('Recipe for Blizzard 3')
additem('Recipe for Cat 2')
additem('Recipe for Cat 3')
additem('Recipe for Bear Pheromone Potion 1')
additem('Recipe for Drowner Pheromone Potion 1')
additem('Recipe for Nekker Pheromone Potion 1')
additem('Recipe for Full Moon 1')
additem('Recipe for Full Moon 2')
additem('Recipe for Full Moon 3')
additem('Recipe for Golden Oriole 2')
additem('Recipe for Golden Oriole 3')
additem('Recipe for Killer Whale 1')
additem('Recipe for Maribor Forest 2')
additem('Recipe for Petris Philtre 3')
additem('Recipe for Swallow 2')
additem('Recipe for Swallow 3')
additem('Recipe for Tawny Owl 2')
additem('Recipe for Tawny Owl 3')
additem('Recipe for Thunderbolt 1')
additem('Recipe for Thunderbolt 2')
additem('Recipe for Thunderbolt 3')
additem('Recipe for White Honey 2')
additem('Recipe for White Honey 3')
additem('q202_hjalmar_cell_key')
additem('q205_key_to_burrow')
additem('q206_arnvalds_key')
additem('q206_arnvalds_chest_key')
additem('q208_yen_room_key')
additem('q301_crematory_key')
additem('q303_menges_skeleton_key')
additem('q303_vault_key')
additem('q305_key_midgets_house')
additem('q503_lockbox_key')
additem('sq102_barn_door_side_key')
additem('sq210_underwater_chest_key')
additem('sq210_underwater_gate2_key')
additem('sq210_underwater_gate1_key')
additem('sq302_philippa_key')
additem('sq303_pollys_key')
additem('sq304_warehouse_key')
additem('sq304_wrhs_indoor_key')
additem('sq310_zed_door_key')
additem('sq310_triangle_key')
additem('sq314_prison_key')
additem('mq2003_treasure_chamber_key')
additem('mq3002_chest_key')
additem('mq2020_slave_cells_key')
additem('mh207_lighthouse_door_key')
additem('mh104_ekimma_house_key')
additem('mq2020_pirate_lord_house_door')
additem('mh303_succubus_house_key')
additem('mh304_morge_door_key')
additem('mh304_katakan_hideout_door_key')
additem('mh306_dao_manor_door_key')
additem('gp_prologue_key01')
additem('lw_gr13_slavers_key')
additem('Silver sapphire ring')
additem('Fishing rod')
additem('Haft')
additem('Broken paddle')
additem('Broken rakes')
additem('Wooden rung rope ladder')
additem('Ashes')
additem('Valuable fossil')
additem('Feather')
additem('Rotten meat')
additem('Candle')
additem('Empty vial')
additem('Inkwell')
additem('Jar')
additem('Flask')
additem('Bottle')
additem('Jug')
additem('Fisstech')
additem('Glamarye')
additem('Shell')
additem('Worn leather pelt')
additem('Scoiatael trophies')
additem('Fox pelt')
additem('Nilfgaardian special forces insignia')
additem('Temerian special forces insignia')
additem('Redanian special forces insignia')
additem('Old sheep skin')
additem('Book')
additem('Old bear skin')
additem('Cow hide')
additem('Melitele figurine')
additem('Bandalur butter knife')
additem('Goblet')
additem('Old rusty breadknife')
additem('Salt pepper shaker')
additem('Razor')
additem('Axe head')
additem('Pickaxe head')
additem('Rusty hammer head')
additem('Blunt axe')
additem('Blunt pickaxe')
additem('Chain')
additem('Dwimeritium shackles')
additem('Glowing ingot')
additem('Dwimeritium chains')
additem('Alghoul claw')
additem('Harpy talon')
additem('Gargoyle heart')
additem('Amber dust')
additem('Amber flawless')
additem('Amethyst flawless')
additem('Black pearl dust')
additem('Powdered pearl')
additem('Diamond')
additem('Diamond flawless')
additem('Emerald flawless')
additem('Sapphire flawless')
additem('Golden mug')
additem('Golden platter')
additem('Silver pantaloons')
additem('Silverware')
additem('Silver teapot')
additem('Silver mug')
additem('Silver platter')
additem('Ornate silver sword replica')
additem('Ornate silver shield replica')
additem('Empty bottle')
additem('Flute')
additem('Skull')
additem('q305_painting_of_hemmelfart')
additem('mq3016_bards_belongings')
additem('sq202_tableware')
additem('q101_hendrik_trapdoor_key')
additem('q202_navigator_horn')
additem('q103_medallion')
additem('q103_botch_blood')
additem('q103_wooden_doll')
additem('q103_talisman')
additem('q103_incense')
additem('q104_oillamp')
additem('q105_ravens_feather')
additem('q105_ritual_dagger')
additem('q105_witch_bones')
additem('q106_magic_communicator')
additem('q106_anabelle_remains')
additem('q106_anabelle_vial')
additem('q107_doll1')
additem('q107_doll2')
additem('q107_doll3')
additem('q107_doll_anna')
additem('q107_doll5')
additem('q107_doll6')
additem('q108_necklet')
additem('q111_ergot_beer')
additem('q111_fugas_top_key')
additem('q111_falkas_coin')
additem('q201_mead')
additem('q201_pine_cone')
additem('q201_skull')
additem('q202_shackles')
additem('q202_sail')
additem('q203_chest_key')
additem('q203_broksvard')
additem('q205_mirt_green')
additem('q205_mirt_yellow')
additem('q205_hvitr_universal_key')
additem('q205_swallow_green')
additem('q205_swallow_yellow')
additem('q206_wine_sample')
additem('q206_herb_mixture')
additem('q208_heroesmead')
additem('q210_avallach_notes_01')
additem('q210_avallach_notes_02')
additem('q210_avallach_lover_notes')
additem('q210_solarstein')
additem('q301_rose_remembrance')
additem('q301_triss_parcel')
additem('q301_magic_rat_incense')
additem('q301_haunted_doll')
additem('q301_burdock')
additem('q302_estate_key')
additem('q302_ring_door_key')
additem('q303_bomb_fragment')
additem('q303_bomb_cap')
additem('q303_wine_bottle')
additem('q305_dandelion_signet')
additem('q309_key_piece1')
additem('q309_key_piece2')
additem('q309_key_piece3')
additem('q310_wine')
additem('q310_lever')
additem('q310_sewer_door_key')
additem('q310_cell_key')
additem('q401_forktail_brain')
additem('q401_sausages')
additem('q401_trial_key_ingredient_b')
additem('q401_bucket_and_rag')
additem('yennefers_omelette_fantasie')
additem('q401_disgusting_meal')
additem('q505_gems')
additem('sq104_key')
additem('sq201_werewolf_meat')
additem('sq201_cursed_jewel')
additem('sq204_wolf_heart')
additem('sq205_fernflower_petal')
additem('sq205_moonshine_spirit')
additem('sq207_portal_stone_red')
additem('sq207_portal_stone_blue')
additem('sq208_raghnaroog')
additem('sq210_golems_heart')
additem('sq302_generator_2')
additem('sq303_lesser_white_honey')
additem('sq304_chemicals')
additem('sq304_aluminium')
additem('sq304_thermite')
additem('sq402_florence_flask_with_water')
additem('sq302_eyes')
additem('sq303_blunt_sword')
additem('sq307_cattrap')
additem('sq307_flower')
additem('sq309_iorweth_arrow')
additem('sq314_cure_recipe')
additem('mq0002_box')
additem('mq0004_thalers_monocle')
additem('mq1001_dog_collar')
additem('mq1002_artifact_1')
additem('mq1006_elf_head')
additem('mq1010_ring')
additem('mq1050_dragon_root')
additem('mq1056_chain_cutter')
additem('mq2001_horn')
additem('mq2006_key_1')
additem('mq2030_shawl')
additem('mq2037_drakkar_chest_key')
additem('mq2048_stone_medalion')
additem('mq1019_oil')
additem('mq3012_soldier_statuette')
additem('mq3032_basilisk_leather')
additem('mq3039_loot_chest_key')
additem('mq1052_monster_trophy')
additem('mq1052_bandit_key')
additem('mq2041_dexterity_token')
additem('mq4003_siren_ring')
additem('mq4004_boy_remains')
additem('mh106_hags_skulls')
additem('mh203_water_hag_trophy')
additem('mh307_minion_lair_key')
additem('q001_academic_book')
additem('q101_hendrik_notes')
additem('q103_tamara_prayer')
additem('q103_letter_from_graden_2')
additem('q103_about_eve')
additem('q103_curse_book')
additem('q104_cure_recipe')
additem('q104_aleksander_letter')
additem('q104_avallach_poetry')
additem('q106_note_from_keira')
additem('q106_alexander_notes_02')
additem('q201_poisoned_source')
additem('q201_mousesack_letter')
additem('q205_avallach_book')
additem('q206_arnvalds_letter')
additem('q301_drawing_crib')
additem('q302_igor_note')
additem('q302_dijkstras_notes')
additem('q302_crafter_notes')
additem('q303_note_for_ciri')
additem('q303_contact_note')
additem('q304_dandelion_diary')
additem('q304_letter_2')
additem('q304_dandelion_ballad')
additem('q304_priscilla_letter')
additem('q304_ambasador_letter')
additem('q304_rosa_lover_letter')
additem('q305_script_drama_title1')
additem('q305_script_drama_title2')
additem('q305_script_comedy_title1')
additem('q305_script_comedy_title2')
additem('q305_script_for_irina')
additem('q308_coroner_msg')
additem('q308_sermon_1')
additem('q308_sermon_2')
additem('q308_sermon_3')
additem('q308_sermon_4')
additem('q308_sermon_5')
additem('q308_psycho_farewell')
additem('q308_vegelbud_invite')
additem('q308_priscilla_invite')
additem('q308_anneke_invite')
additem('q308_last_invite')
additem('q308_nathanel_sermon_1')
additem('q308_vg_paraffin')
additem('q308_vg_guillotine')
additem('q309_note_from_varese')
additem('q309_witch_hunters_orders')
additem('q309_glejt_from_dijkstra')
additem('q309_mssg_from_triss')
additem('q309_key_letters')
additem('q309_key_orders')
additem('q310_journal_notes_1')
additem('q310_journal_notes_2')
additem('q311_lost_diary1')
additem('q311_lost_diary2')
additem('q311_lost_diary3')
additem('q311_lost_diary4')
additem('q401_yen_journal_2')
additem('q310_yen_trinket')
additem('q310_explorer_note')
additem('q505_nilf_diary_lost1')
additem('q505_nilf_diary_lost2')
additem('q505_nilf_diary_won1')
additem('sq101_shipment_list')
additem('sq102_dolores_diary')
additem('sq102_huberts_diary')
additem('sq102_loose_papers')
additem('sq104_notes')
additem('sq106_manuscript')
additem('sq201_ship_manifesto')
additem('sq202_book_1')
additem('sq202_book_2')
additem('sq205_brewing_instructions')
additem('sq205_brewmasters_log')
additem('sq208_letter')
additem('sq208_otkell_journal')
additem('sq208_ashes')
additem('sq210_gog_book')
additem('sq210_gog_brain')
additem('sq210_blank_brain')
additem('sq210_drm_brain')
additem('sq210_gog_recipe')
additem('sq302_philippa_letter')
additem('sq311_spy_papers')
additem('sq309_mage_letter')
additem('sq310_ledger_book')
additem('sq313_iorveth_letters')
additem('sq401_orders')
additem('cg100_barons_notes')
additem('cg300_roches_list')
additem('mq0003_girls_diary')
additem('mq0004_burnt_papers')
additem('mq1001_locker_diary')
additem('mq1002_aeramas_journal')
additem('mq1002_aeramas_journal_2')
additem('mq1015_hang_man_note')
additem('mq1014_old_mine_journal')
additem('mq1017_nilfgaardian_letter')
additem('mq1023_fake_papers')
additem('mq1036_refugee_letter')
additem('mq1033_fight_diary')
additem('mq1053_letter_to_emhyr')
additem('mq1053_martins_notes')
additem('mq1055_letters')
additem('mq2001_journal_1a')
additem('mq2001_journal_1b')
additem('mq2001_journal_1c')
additem('mq2001_journal_2a')
additem('mq2001_journal_2b')
additem('mq2003_bandit_journal')
additem('mq2006_map_1')
additem('mq2006_map_2')
additem('mq2008_journal')
additem('mq2010_lumbermill_journal_1')
additem('mq2010_lumbermill_journal_2')
additem('mq2010_lumbermill_journal_3')
additem('mq2012_letter')
additem('mq2015_kurisus_note')
additem('mq2033_captain_note')
additem('mq2033_captain_journal')
additem('mq2037_dimun_directions')
additem('mq2039_Honeycomb')
additem('mq2048_guide_notes')
additem('mq2048_waxed_letters')
additem('mq2049_book_1')
additem('mq2049_book_2')
additem('mq2049_book_3')
additem('mq2049_book_4')
additem('mq2049_book_5')
additem('mq3002_hidden_messages_note_01')
additem('mq3002_hidden_messages_note_02')
additem('mq3002_hidden_messages_note_03')
additem('mq3017_reds_diary')
additem('mq3026_varese_invitation')
additem('mq3026_horse_racing_leaflet')
additem('mq3027_my_manifest')
additem('mq3027_fluff_book_1')
additem('mq3027_fluff_book_2')
additem('mq3027_fluff_book_3')
additem('mq3027_fluff_book_4')
additem('mq3027_letter')
additem('mq3030_trader_documents')
additem('mq3035_talar_notes')
additem('mq4003_letter')
additem('mq4005_note_1')
additem('mq4006_book')
additem('mh103_girls_journal')
additem('mh207_lighthouse_keeper_letter')
additem('mh305_doppler_letter')
additem('lw_temerian_soldiers_journal')
additem('lw_sb13_note')
additem('FeromoneBomb')
additem('sq402_vitriol')
additem('sq402_rebis')
additem('sq402_hydragenum')
additem('sq402_aether')
additem('sq402_quebrith')
additem('th1001_journal_viper_part1')
additem('th1009_journal_wolf_part1')
additem('th1009_journal_wolf_part2')
additem('th003_journal_wolf_part3')
additem('th004_map_wolf_jacket_upgrade1')
additem('th005_map_wolf_jacket_upgrade2')
additem('th006_map_wolf_jacket_upgrade3')
additem('th007_map_wolf_gloves_upgrade1')
additem('th008_map_wolf_pants_upgrade1')
additem('th009_map_wolf_boots_upgrade1')
additem('th010_map_wolf_silver_sword_upgrade1')
additem('th011_map_wolf_silver_sword_upgrade2')
additem('th012_map_wolf_silver_sword_upgrade3')
additem('th013_map_wolf_steel_sword_upgrade1')
additem('th1003_journal_cat_lady')
additem('th1003_journal_lynx_part1')
additem('th1003_journal_lynx_part2')
additem('th1003_journal_lynx_part4')
additem('th1003_journal_lynx_part5')
additem('th1003_journal_lynx_part6')
additem('th1005_journal_gryphon_part1')
additem('th1005_journal_gryphon_part2')
additem('th1005_journal_gryphon_part3')
additem('th1005_journal_gryphon_part4')
additem('th1005_journal_gryphon_part5')
additem('th1007_journal_bear_part1')
additem('th1007_journal_bear_part2')
additem('th1007_journal_bear_part3')
additem('th1007_journal_bear_part4')
additem('th1007_journal_bear_part5')
additem('th1007_journal_bear_part6')
additem('Geralt mask 01')
additem('Geralt mask 02')
additem('Geralt mask 03')
additem('Triss mask')
additem('Geralt robbery mask')
additem('Triss Earring')
additem('mq1013_Pretender pendant')
additem('Dijkstra mask')
additem('Voorhis mask')
additem('Ingrid mask')
additem('Luiza mask')
additem('Witch Hunter mask')
additem('Albert mask')
additem('False Albert mask 02')
additem('Guest mask man 01')
additem('Guest mask man 02')
additem('Guest mask man 03')
additem('Guest mask man 04')
additem('Guest mask man 05')
additem('Guest mask man 07')
additem('Guest mask man 08')
additem('Guest mask man 09')
additem('Guest mask man 11')
additem('Guest mask man 12')
additem('Guest mask man 13')
additem('Guest mask woman 01')
additem('Guest mask woman 02')
additem('Guest mask woman 03')
additem('Guest mask woman 04')
additem('Guest mask woman 05')
additem('Guest mask woman 06')
additem('Guest mask woman 07')
additem('Guest mask woman 08')
additem('Guest mask woman 09')
additem('Guest mask woman 10')
additem('Guest mask woman 14')
additem('Guest mask woman 15')
additem('Guest mask woman 16')
additem('Guest mask woman 17')
additem('Thunderbolt 3')
additem('Recipe for White Raffards Decoction 2')
additem('Recipe for White Raffards Decoction 3')
additem('Full Moon 2')
additem('Golden Oriole 2')
additem('Maribor Forest 2')
additem('Petri Philtre 1')
additem('Petri Philtre 2')
additem('Swallow 1')
additem('White Raffards Decoction 2')
additem('axe_test')
additem('mace_test')
additem('dwarven_hammer_test')
additem('Wolf Gloves 4')
additem('Wolf Pants 4')
additem('Wolf Boots 4')
additem('DLC1 Temerian Armor')
additem('DLC1 Temerian Boots')
additem('DLC1 Temerian Gloves')
additem('DLC1 Temerian Pants')
additem('Short Loose Hairstyle')
additem('Mohawk With Ponytail Hairstyle')
additem('Nilfgaardian Hairstyle')
additem('Red Wolf Armor 2')
additem('Red Wolf Gloves 2')
additem('Red Wolf Pants 2')
additem('Red Wolf Boots 2')
additem('Dye Solution')
additem('Recipe Dye Gray')
additem('Recipe Dye Brown')
additem('Recipe Dye Red')
additem('Recipe Dye Green')
additem('Recipe Dye Blue')
additem('Recipe Dye Black')
additem('Recipe Dye White')
additem('Recipe Dye Orange')
additem('Recipe Dye Pink')
additem('Recipe Dye Yellow')
additem('Recipe Dye Purple')
additem('Abarad')
additem('Caroline')
additem('Gynvaelaedd')
additem('Gynvael')
additem('Tlareg')
additem('Breathofthenorth')
additem('Torzirael')
additem('Zireael Sword')
additem('Ofir Sabre 1')
additem('Horse Saddle 6')
additem('Ofir Horse Bag')
additem('Ofir Horse Blinders')
additem('Soltis Vodka')
additem('Cornucopia')
additem('Burning Rose Sword')
additem('Geralt Kontusz')
additem('Geralt Kontusz Boots')
additem('Guard Lvl1 Armor 1')
additem('Guard Lvl1 Boots 1')
additem('Guard Lvl1 Gloves 1')
additem('Guard Lvl1 Pants 1')
additem('Guard Lvl1 Armor 2')
additem('Guard Lvl1 Boots 2')
additem('Guard Lvl1 Gloves 2')
additem('Guard Lvl1 Pants 2')
additem('Guard Lvl1 A Armor 1')
additem('Guard Lvl1 A Boots 1')
additem('Guard Lvl1 A Gloves 1')
additem('Guard Lvl1 A Pants 1')
additem('Guard Lvl1 A Armor 2')
additem('Guard Lvl1 A Boots 2')
additem('Guard Lvl2 Armor 1')
additem('Guard Lvl2 Boots 1')
additem('Guard Lvl2 Gloves 1')
additem('Guard Lvl2 Pants 1')
additem('Guard Lvl2 Armor 2')
additem('Guard Lvl2 Boots 2')
additem('Guard Lvl2 Gloves 2')
additem('Guard Lvl2 Pants 2')
additem('Guard Lvl2 A Armor 1')
additem('Guard Lvl2 A Armor 2')
additem('Guard Lvl2 A Boots 2')
additem('Guard Lvl2 A Gloves 2')
additem('Guard Lvl2 A Pants 2')
additem('Knight Geralt Armor 1')
additem('Knight Geralt Boots 1')
additem('Knight Geralt Gloves 1')
additem('Knight Geralt Pants 1')
additem('Knight Geralt Armor 2')
additem('Knight Geralt Boots 2')
additem('Knight Geralt Gloves 2')
additem('Knight Geralt Pants 2')
additem('Knight Geralt A Armor 1')
additem('Knight Geralt A Boots 1')
additem('Knight Geralt A Gloves 1')
additem('Knight Geralt A Pants 1')
additem('Knight Geralt A Armor 2')
additem('Knight Geralt A Boots 2')
additem('Knight Geralt A Gloves 2')
additem('Knight Geralt A Pants 2')
additem('Toussaint Armor 2')
additem('Toussaint Boots 2')
additem('Toussaint Gloves 2')
additem('Toussaint Pants 2')
additem('Toussaint Armor 3')
additem('Toussaint Boots 3')
additem('Toussaint Gloves 3')
additem('Toussaint Pants 3')
additem('sq701_geralt_armor')
additem('sq701_ravix_armor')
additem('q705_mandragora_gloves')
additem('Toussaint saddle')
additem('Toussaint saddle 2')
additem('Toussaint saddle 3')
additem('Toussaint saddle 4')
additem('Toussaint saddle 5')
additem('Toussaint saddle 6')
additem('Tourney Geralt Saddle')
additem('Tourney Ravix Saddle')
additem('Toussaint horsebag')
additem('Toussaint horse blinders')
additem('Toussaint horse blinders 2')
additem('Toussaint horse blinders 3')
additem('Toussaint horse blinders 4')
additem('Toussaint horse blinders 5')
additem('Toussaint horse blinders 6')
additem('q701_cyclops_trophy')
additem('q704_garkain_trophy')
additem('mq7002_spriggan_trophy')
additem('mq7009_griffin_trophy')
additem('mq7017_zmora_trophy')
additem('mq7010_dracolizard_trophy')
additem('mq7018_basilisk_trophy')
additem('mh701_sharley_matriarch_trophy')
additem('Lynx School steel sword Upgrade schematic 4')
additem('Lynx School silver sword Upgrade schematic 4')
additem('Witcher Lynx Jacket Upgrade schematic 4')
additem('Witcher Lynx Gloves Upgrade schematic 5')
additem('Witcher Lynx Boots Upgrade schematic 5')
additem('Witcher Lynx Pants Upgrade schematic 5')
additem('Gryphon School steel sword Upgrade schematic')
additem('Gryphon School silver sword Upgrade schematic')
additem('Witcher Gryphon Jacket Upgrade schematic 4')
additem('Witcher Gryphon Gloves Upgrade schematic 5')
additem('Witcher Gryphon Boots Upgrade schematic 5')
additem('Witcher Gryphon Pants Upgrade schematic 5')
additem('Bear School steel sword Upgrade schematic 4')
additem('Bear School silver sword Upgrade schematic 4')
additem('Witcher Bear Jacket Upgrade schematic 4')
additem('Witcher Bear Gloves Upgrade schematic 5')
additem('Witcher Bear Boots Upgrade schematic 5')
additem('Witcher Bear Pants Upgrade schematic 5')
additem('Wolf School steel sword Upgrade schematic 4')
additem('Wolf School silver sword Upgrade schematic 4')
additem('Witcher Wolf Jacket Upgrade schematic 4')
additem('Witcher Wolf Gloves Upgrade schematic 5')
additem('Witcher Wolf Boots Upgrade schematic 5')
additem('Witcher Wolf Pants Upgrade schematic 5')
additem('Red Wolf School steel sword schematic 1')
additem('Red Wolf School silver sword schematic 1')
additem('Witcher Red Wolf Jacket schematic 1')
additem('Witcher Red Wolf Gloves schematic 1')
additem('Witcher Red Wolf Boots schematic 1')
additem('Witcher Red Wolf Pants schematic 1')
additem('Red Wolf School steel sword 2')
additem('Red Wolf School silver sword 2')
additem('Guard Lvl1 steel sword 1')
additem('Guard Lvl1 steel sword 2')
additem('Guard Lvl2 steel sword 1')
additem('Guard Lvl2 steel sword 2')
additem('Knights steel sword 1')
additem('Knights steel sword 2')
additem('Squire steel sword 1')
additem('Squire steel sword 2')
additem('Unique steel sword')
additem('Unique silver sword')
additem('Gwent steel sword 1')
additem('sq701 Geralt of Rivia sword')
additem('sq701 Ravix of Fourhorn sword')
additem('mq7001 Toussaint steel sword')
additem('mq7007 Elven Sword')
additem('mq7011 Cianfanelli steel sword')
additem('Laundry stick')
additem('Laundry pole')
additem('q701_duchess_summons')
additem('q701_beast_picture_01')
additem('q701_beast_picture_02')
additem('q701_beast_picture_03')
additem('q701_corvo_bianco_deed')
additem('q701_victim_handkarchief')
additem('q701_coin_pouch')
additem('q701_swan_item')
additem('q701_unicorn_item')
additem('q701_cookie_lure')
additem('q701_apple_lure')
additem('q701_carrot_basket')
additem('q701_grain_cup')
additem('q701_gardens_lost_ring')
additem('q701_crayfish_soup')
additem('q701_pate')
additem('q702_wight_gland')
additem('q702_wight_brew')
additem('q702_wicht_key')
additem('q702_fly')
additem('q702_leaflet')
additem('q702_graveir_lure')
additem('q702_victims_names')
additem('q702_blackmail_letter')
additem('q702_bootblack_prices')
additem('q702_knight_oath')
additem('q702_love_letter')
additem('q702_marlena_father_letter')
additem('q702_marlena_letter')
additem('q702_mill_order')
additem('q702_tesham_mutna_cell_letter')
additem('q702_toy_store_closing_order')
additem('q702_toy_store_letter')
additem('q702_regeneration_elixir')
additem('q702_spoon_key_message')
additem('q702_wight_diary')
additem('q702_comissariat')
additem('q702_regis_biography')
additem('q702_regis_sentences')
additem('q702_cage_breeding_humans')
additem('q702_monster_curses')
additem('q702_vampire_transcript')
additem('q702_spoon_key')
additem('q702_secret_urn')
additem('q702_marlena_dowry')
additem('q702_breeding_humans')
additem('q703_bung')
additem('q703_geralt_wanted_note')
additem('q703_heart_of_toussaint')
additem('q703_paint_bomb_red')
additem('q703_unique_hunting_knife')
additem('q703_wooden_hammer')
additem('q704_caretakers_letter')
additem('q704_mages_notebook')
additem('q704_mages_notes_01')
additem('q704_mages_notes_02')
additem('q704_vampire_offering')
additem('q704_ft_bean_01')
additem('q704_ft_bean_02')
additem('q704_ft_bean_03')
additem('q704_ft_pipe')
additem('q704_ft_bottle_caps')
additem('q704_ft_corkscrew')
additem('q704_ft_fake_teeth')
additem('q704_ft_syanna_journal')
additem('q704_vampire_lure_bolt')
additem('q705_ah_letter')
additem('q705_dirty_clothes')
additem('q705_soap')
additem('q705_medal')
additem('q705_white_roses')
additem('q705_mandragora')
additem('q705_prison_stash_note')
additem('q705_pinup_poster')
additem('q705_geralt_mask')
additem('sq701_nest')
additem('sq701_geralt_shield')
additem('sq701_victory_laurels')
additem('sq703_peacock_feather')
additem('sq703_map')
additem('sq703_map_alternative')
additem('sq703_safari_picture')
additem('sq703_hunter_letter')
additem('sq703_wife_letter')
additem('sq703_accountance_book')
additem('mh701_lost_locket')
additem('mh701_fresh_blood')
additem('mh701_work_schedule')
additem('mh701_wine_list')
additem('mq7001_louis_urn')
additem('mq7001_margot_urn')
additem('mq7001_gwent_poems')
additem('mq7002_love_letter_01')
additem('mq7002_love_letter_02')
additem('mq7004_knight_item')
additem('mq7004_scarf')
additem('mq7004_storybook')
additem('mq7004_note_01')
additem('mq7004_note_02')
additem('mq7004_note_03')
additem('mq7006_egg')
additem('mq7007_tribute_food')
additem('mq7007_tribute_wine')
additem('mq7007_elven_shield')
additem('mq7007_elven_mask')
additem('mq7009_painter_accessories')
additem('mq7009_painting_pose1')
additem('mq7009_painting_pose1_grif')
additem('mq7009_painting_pose2')
additem('mq7009_painting_pose2_grif')
additem('mq7009_painting_pose3')
additem('mq7009_painting_pose3_grif')
additem('mq7010_still_note')
additem('mq7015_reginalds_balls')
additem('mq7015_reginalds_figurine')
additem('mq7017_mushroom_potion')
additem('mq7017_pinastri_note')
additem('mq7018_guild_contract_letter')
additem('mq7018_workers_letter_basilisk_alive')
additem('mq7018_workers_letter_basilisk_dead')
additem('mq7021_treasure_map')
additem('mq7021_filter')
additem('mq7023_letter_yen')
additem('mq7023_letter_triss')
additem('mq7023_letter_neutral')
additem('mq7023_map')
additem('mq7023_journal_laura')
additem('mq7023_gargoyle_hand')
additem('mq7023_megascope_crystal_2')
additem('mq7023_megascope_crystal_4')
additem('mq7023_centipede_albumen_mutated')
additem('mq7023_fluff_book_mutations')
additem('mq7024_alchemy_lab_note')
additem('cg700_base_deck')
additem('cg700_gwent_statue')
additem('cg700_letter_monniers_brother')
additem('cg700_letter_merchants')
additem('cg700_letter_purist')
additem('ff701_fist_fight_trophy')
additem('th700_prison_journal')
additem('th700_crypt_journal')
additem('th700_vault_journal')
additem('th700_lake_journal')
additem('th700_lake_fluff_note1')
additem('th700_lake_fluff_note2')
additem('th700_lake_fluff_note3')
additem('th700_preacher_bones')
additem('th701_wg_initial_note')
additem('th701_wg_swords_note')
additem('th701_wg_pants_note')
additem('th701_bear_contract')
additem('th701_bear_journal')
additem('th701_bear_notes')
additem('th701_cat_journal')
additem('th701_cat_notes')
additem('th701_cat_witcher_notes')
additem('th701_gryphon_moreau_letter')
additem('th701_gryphon_moreau_journal')
additem('th701_gryphon_jerome_letter')
additem('th701_power_core')
additem('th701_wolf_journal')
additem('th701_wolf_witcher_note')
additem('th701_elven_journal')
additem('th701_portal_crystal')
additem('th701_coward_journal')
additem('q701_crayfish_soup_recipe')
additem('q701_pate_recipe')
additem('q701_godfryd_book')
additem('q701_rydygier_book')
additem('q701_1st_victim_files')
additem('q701_2nd_victim_files')
additem('q701_3rd_victim_files')
additem('q701_goliath_book')
additem('q701_gardens_invitation')
additem('q701_wine_flier_01')
additem('q701_wine_flier_02')
additem('q701_wine_flier_03')
additem('q701_corvo_bianco_book')
additem('q701_fisherman_poetry')
additem('q703_killing_vampires')
additem('q703_history_of_est_est')
additem('q703_history_of_pomino')
additem('q703_one_handed_adalard')
additem('q703_napkin_love_letter')
additem('q703_letter_of_refusal')
additem('q703_piece_of_scenario')
additem('q704_ft_little_mermaid')
additem('q704_ft_letter_from_dandelion')
additem('sq701_registration_note')
additem('sq701_vivienne_note')
additem('sq701_rainfarn_note')
additem('sq701_guillaume_note')
additem('sq701_palmerin_note')
additem('sq701_tailles_note')
additem('sq701_anseis_note')
additem('sq701_horm_note')
additem('sq701_horm_emhyr_victory_note')
additem('sq701_fan_02_note')
additem('lore_biography_beledals_grandfather')
additem('mq7011_bank_book_filler_01')
additem('mq7011_bank_flier_01')
additem('mq7011_bank_flier_02')
additem('mq7020_hairdresser_recipe')
additem('mq7020_hairdresser_leaflet')
additem('mq7020_duvall_poem')
additem('mq7020_map')
additem('lore_basilisk_hunts')
additem('lore_toussaint_civil_war')
additem('lore_toussaint_nobles')
additem('lore_toussaint_ecology')
additem('lore_gwent_history')
additem('Bourgogne chardonnay')
additem('Chateau mont valjean')
additem('Bourgogne pinot noir')
additem('Saint mathieu rouge')
additem('Duke nicolas chardonnay')
additem('Chevalier adam pinot blanc reserve')
additem('Prince john merlot')
additem('Count var ochmann shiraz')
additem('Chateau de konrad cabernet')
additem('Geralt de rivia')
additem('White Wolf')
additem('Butcher of Blaviken')
additem('Pheasant gutted')
additem('Tarte tatin')
additem('Ratatouille')
additem('Baguette camembert')
additem('Crossaint honey')
additem('Herb toasts')
additem('Brioche')
additem('Flamiche')
additem('Camembert')
additem('Chocolate souffle')
additem('Pate chicken livers')
additem('Confit de canard')
additem('Baguette fish paste')
additem('Fish tarte')
additem('Boeuf bourguignon')
additem('Onion soup')
additem('Ham roasted')
additem('Tomato')
additem('Cookies')
additem('Ginger Bread')
additem('Magic Mushrooms')
additem('Draconide infused leather')
additem('Nickel mineral')
additem('Nickel ore')
additem('Copper mineral')
additem('Copper ore')
additem('Cupronickel ore')
additem('Copper ingot')
additem('Copper plate')
additem('Green gold mineral')
additem('Green gold ore')
additem('Green gold ingot')
additem('Green gold plate')
additem('Orichalcum mineral')
additem('Orichalcum ore')
additem('Dwimeryte enriched ore')
additem('Acid extract')
additem('Centipede discharge')
additem('Archespore juice')
additem('Kikimore discharge')
additem('Vampire blood')
additem('Monstrous carapace')
additem('Sharley dust')
additem('Wight ear')
additem('Wight hair')
additem('Sharley heart')
additem('Monstrous pincer')
additem('Centipede mandible')
additem('Dracolizard plate')
additem('Monstrous spore')
additem('Wight stomach')
additem('Monstrous vine')
additem('Archespore tendril')
additem('Monstrous wing')
additem('Peacock feather')
additem('Dull meteorite axe')
additem('Broken meteorite pickaxe')
additem('Hotel silver breadknife')
additem('Hotel silver goblet')
additem('Hotel silver teapot')
additem('Hotel silver fruitbowl')
additem('Hotel silver serving tray')
additem('Hotel silver wine bottle')
additem('Hotel silver cup')
additem('Copper salt pepper shaker')
additem('Copper mug')
additem('Copper platter')
additem('Copper casket')
additem('Copper candelabra')
additem('Cupronickel axe head')
additem('Cupronickel pickaxe head')
additem('Copper chain')
additem('Green gold ruby ring')
additem('Green gold sapphire ring')
additem('Green gold emerald ring')
additem('Green gold diamond ring')
additem('Green gold amber necklace')
additem('Green gold ruby necklace')
additem('Green gold sapphire necklace')
additem('Green gold emerald necklace')
additem('Green gold diamond necklace')
additem('Touissant knife')
additem('Bottle caps')
additem('Fake teeth')
additem('Corkscrew')
additem('Gingerbread man')
additem('Toys rich')
additem('Teapot teacups')
additem('Skeletal ashes')
additem('Magic mirror shard')
additem('Magic dust')
additem('Fourleaf clover')
additem('Magic gold')
additem('Holy basil')
additem('Blue lotus')
additem('Recipe Dye Turquoise')
additem('Recipe for Sharley Lure')
additem('Recipe for Mutation Serum')
additem('Red Wolf School steel sword Upgrade schematic')
additem('Serpent Steel Sword schematic 1')
additem('Guard Lvl2 steel sword 3 schematic')
additem('Knights Geralt steel sword 3 schematic')
additem('Hanza steel sword 3 schematic')
additem('Toussaint steel sword 3 schematic')
additem('Serpent Silver Sword schematic 1')
additem('Serpent Silver Sword schematic 2')
additem('Serpent Silver Sword schematic 3')
additem('Witcher Red Wolf Jacket Upgrade schematic 2')
additem('Witcher Red Wolf Gloves Upgrade schematic 2')
additem('Witcher Red Wolf Boots Upgrade schematic 2')
additem('Witcher Red Wolf Pants Upgrade schematic 2')
additem('Guard Lvl1 Gloves 3 schematic')
additem('Guard Lvl1 Pants 3 schematic')
additem('Guard Lvl1 A Gloves 3 schematic')
additem('Guard Lvl1 A Boots 3 schematic')
additem('Guard Lvl1 A Pants 3 schematic')
additem('Guard Lvl2 Armor 3 schematic')
additem('Guard Lvl2 Gloves 3 schematic')
additem('Guard Lvl2 Boots 3 schematic')
additem('Guard Lvl2 Pants 3 schematic')
additem('Guard Lvl2 A Armor 3 schematic')
additem('Guard Lvl2 A Gloves 3 schematic')
additem('Guard Lvl2 A Boots 3 schematic')
additem('Guard Lvl2 A Pants 3 schematic')
additem('Knight Geralt Armor 3 schematic')
additem('Knight Geralt Gloves 3 schematic')
additem('Knight Geralt Boots 3 schematic')
additem('Knight Geralt Pants 3 schematic')
additem('Knight Geralt A Armor 3 schematic')
additem('Knight Geralt A Gloves 3 schematic')
additem('Knight Geralt A Boots 3 schematic')
additem('Knight Geralt A Pants 3 schematic')
additem('q604_work_vodka_cup')
additem('arrow_01')
additem('bow_elven_01')
additem('Spyglass')
additem('Cup_01')
additem('Piece_of_wood_01')
additem('Floor_brush_man')
additem('Broom')
additem('Sponge')
additem('Drinking horn')
additem('Bottle_01')
additem('Lute 01')
additem('Sack')
additem('Oar_right')
additem('book_to_read')
additem('Fishing_rod')
additem('scythe_right')
additem('juggling_ball_right')
additem('juggling_ball_left')
additem('lw_de11_treasure_key')
additem('lw_de11_note')
additem('lw_de32_treasure_note')
additem('lw_gr13_slaver_note')
additem('lw_gr29_cage_key')
additem('lw_gr34_note')
additem('lw_gr34_treasure_key')
additem('lw_gr39_note')
additem('lw_gr39_treasure_key')
additem('lw_gr40_note')
additem('lw_gr40_treasure_key')
additem('lw_gr41_note')
additem('lw_gr41_treasure_key')
additem('lw_gr7_soldiers_note')
additem('lw_gr_poi_042_letter')
additem('lw_gr_poi_042_chest_key')
additem('lw_sb24_note')
additem('lw_sb24_treasure_key')
additem('lw_hs2_cage_key')
additem('lw_hs2_scoiatael_note')
additem('lw_sb13_smugglers_note')
additem('lw_sb14_pirate_note')
additem('lw_sb18_camps_note')
additem('lw_sb2_base_camp_note')
additem('lw_sb2_base_camp_map')
additem('lw_sb2_sunken_ships_map')
additem('lw_sb3_giggler_note_pirates')
additem('lw_sb3_giggler_note_workers')
additem('lw_tm12_cage_key')
additem('lw_tm12_bandit_note')
additem('lw_tm15_treasure_hunter_note')
additem('lw_tm6_note')
additem('lw_sk30_villager_note')
additem('lw_sk30_chest_key')
additem('lw_sk31_note')
additem('lw_sk31_treasure_key')
additem('lw_sk3_ship_note')
additem('lw_sk57_treasure_note')
additem('lw_sk57_treasure_key')
additem('lw_sk_poi_005_treasure_note')
additem('lw_sk_poi_056_note')
additem('lw_sk42_treasure_key')
additem('lw_sk_poi_050_note')
additem('Tutorial Bomb')
additem('Toy sword')
additem('toy_bow')
additem('NPC Wooden sword')
additem('mq4005 Silver sword 6 schematic')
additem('q302_roche_letter')
additem('lw_prologue_temerian_treasure_note')
additem('DLC5 Nilfgaardian Armor')
additem('th1003_ireneus_lab_key')
additem('th1005_journal_gryphon_part6')
additem('Shani Alcohol 2')
additem('Shani Alcohol 1')
additem('Shani Flower 3')
additem('Shani Flower 1')
additem('th1010_armor_note')
additem('th1010_schematic_armor')
additem('th1009_journal_wolf_part3a')
additem('th1009_journal_wolf_part2a')
additem('th1009_crystal')
additem('th1009_journal_wolf_part4')
additem('th1009_journal_wolf_part1a')
additem('Q2_Axe2h')
additem('Body feet 01')
additem('Body legs 01')
additem('Q1_short_steel_sword')
additem('Ciri Wolf Medallion')
additem('crossbow_01')
additem('q301_notice_haunted_house')
additem('Guest mask woman 19')
additem('cg_notice_baron')
additem('cg_notice_stjepan')
additem('cg_notice_vivaldi')
additem('cg_notice_mousesack')
additem('mh101_contract')
additem('mh103_contract')
additem('mh104_contract')
additem('mh106_contract')
additem('mh107_contract')
additem('mh302_contract')
additem('mh304_contract')
additem('mh305_contract')
additem('mq2030_nithing')
additem('NPC Skellige sword 1')
additem('mq2048 Male Handcuffs')
additem('Q1_club1h')
additem('q105_johnnys_doll')
additem('Q1_axe1h')
additem('head_robbery_mark_tattoo')
additem('head_robbery_tattoo')
additem('head_robbery_mark')
additem('head_robbery')
additem('Q1_Halberd2h')
additem('NPC Hjalmar_Short_Steel_Sword')
additem('NPC No Mans Land sword 3')
additem('NPC Inquisitor sword 1')
additem('NPC Witcher Silver Sword q403 upgrade')
additem('NPC Vesemir Steel Sword')
additem('NPC Vesemir Silver Sword')
additem('NPC Vesemir Silver Sword q403 upgrade')
additem('q403_treaty')
additem('Nilfgaardian Casual Pants no show')
additem('sq305_trophies')
additem('sq306_sacha_letter')
additem('q401_avallachs_wisp')
additem('Horse Universal Reins')
additem('head_1')
additem('head_2')
additem('head_3')
additem('head_4')
additem('head_1_tattoo')
additem('head_2_tattoo')
additem('head_3_tattoo')
additem('head_4_tattoo')
additem('head_0_mark')
additem('head_1_mark')
additem('head_2_mark')
additem('head_3_mark')
additem('head_4_mark')
additem('head_0_mark_tattoo')
additem('head_1_mark_tattoo')
additem('head_2_mark_tattoo')
additem('head_3_mark_tattoo')
additem('head_4_mark_tattoo')
additem('Body underwear 01')
additem('Frog mask')
additem('mq0004_thalers_monocle_wearable')
additem('scabbard_steel_nomansland_01')
additem('scabbard_silver_3_01')
additem('recipe_for_yennefers_omelette')
additem('recipe_for_scrambled_eggs')
additem('Blasting powder')
additem('Bear fat')
additem('Witcher Gryphon Pants Upgrade schematic 2')
additem('lw_sk25_bandits_note')
additem('lw_sk86_old_mans_note')
additem('lw_gr15_bandits_note')
additem('lw_gr15_ghouls_note')
additem('lw_gr13_poppy_slaver_note')
additem('lw_cp14_bandit_note')
additem('lw_gf2_white_note')
additem('lw_gr29_bandit_note')
additem('lw_hs2_bandit_note')
additem('lw_bm6_merchant_note')
additem('lw_prologue_temerian_loot_manifest')
additem('lw_sb20_chest_note')
additem('lw_de_wett_note')
additem('lw_cp36_note')
additem('mq1051_orders_note')
additem('noon_shadow_loot_note')
additem('Cockatrice maw')
additem('Ekimma epidermis')
additem('Cave Troll liver')
additem('Erynie eye')
additem('Fake_Arrow')
additem('q108 Medium armor 10')
additem('Ciri armor 01')
additem('Wild Hunt armor 01')
additem('mon_rat_weapon')
additem('mon_alghoul_weapon')
additem('mon_ancient_leshen_weapon')
additem('mon_him_weapon')
additem('mon_alpha_wolf_weapon')
additem('mon_arachas_weapon')
additem('mon_arachas_armored_weapon')
additem('mon_basilisk_wing_right')
additem('mon_bear_grizzly_weapon')
additem('mon_bear_white_weapon')
additem('mon_berserker_weapon')
additem('mon_cockatrice_wing_right')
additem('mon_cockatrice_wing_left')
additem('mon_cyclops_weapon')
additem('mon_czart_weapon')
additem('mon_dao_lesser_fist_right')
additem('mon_dao_lesser_fist_left')
additem('mon_dao_fist_right')
additem('mon_djinn_weapon')
additem('mon_drowner_weapon')
additem('mon_endriaga_worker_weapon')
additem('mon_endriaga_soldier_weapon')
additem('mon_endriaga_spikey_weapon')
additem('mon_erynia_weapon')
additem('mon_evil_dog_weapon')
additem('mon_bies_r_claw_weapon')
additem('mon_czart_r_claw_weapon')
additem('mon_czart_l_claw_weapon')
additem('mon_fogling_weapon')
additem('mon_forktail_head')
additem('mon_forktail_tail')
additem('mon_forktail_young_head')
additem('mon_forktail_young_tail')
additem('mon_fugas_weapon')
additem('mon_fugas_vomit')
additem('mon_fugas_lesser_weapon')
additem('mon_gargoyle_weapon')
additem('mon_giant_weapon')
additem('mon_grave_hag_weapon')
additem('mon_greater_miscreant_weapon')
additem('mon_griffon_lesser_wing_right')
additem('mon_griffon_wing_right')
additem('mon_griffon_wing_left')
additem('mon_griffon_volcanic_wing_right')
additem('mon_ice_giant_weapon')
additem('mon_ifrit_fist_right')
additem('mon_katakan_weapon')
additem('mon_katakan_large_weapon')
additem('mon_lamia_weapon')
additem('mon_leshen_weapon')
additem('mon_lycanthrope_weapon')
additem('mon_nekker_weapon')
additem('mon_nightwraith_weapon')
additem('mon_nightwraith_weapon_mh')
additem('mon_noonwraith_weapon')
additem('mon_pesta_weapon')
additem('mon_rotfiend_weapon')
additem('mon_rotfiend_large_weapon')
additem('mon_simulakrum_weapon_right')
additem('mon_simulakrum_weapon_left')
additem('mon_siren_weapon')
additem('mon_succubus_weapon')
additem('mon_troll_young_weapon')
additem('mon_troll_weapon')
additem('mon_troll_black_weapon')
additem('mon_troll_weapon_bart')
additem('mon_water_hag_greater_weapon')
additem('mon_werewolf_weapon')
additem('mon_werewolf_lesser_weapon')
additem('mon_wild_hunt_minion_lesser_weapon')
additem('mon_wild_hunt_minion_weapon')
additem('mon_willo_wisp_weapon')
additem('mon_witch3_weapon')
additem('mon_wolf_weapon')
additem('mon_wolf_white_weapon')
additem('mon_wraith_weapon')
additem('mon_wraith_weapon_mh207')
additem('mon_wraith_mh_weapon')
additem('mon_wyvern_head')
additem('mon_wyvern_tail')
additem('Boots 07_crafted')
additem('Heavy boots 07_crafted')
additem('Heavy boots 08_crafted')
additem('NPC Short Steel Sword')
additem('NPC Dandelion Short Steel Sword')
additem('NPC Rusty No Mans Land sword')
additem('NPC Rusty Skellige sword')
additem('NPC Rusty Novigraadan sword')
additem('NPC Short sword 1')
additem('NPC No Mans Land sword 1 q2')
additem('NPC No Mans Land sword 2')
additem('NPC Nilfgaardian sword 2')
additem('NPC Skellige sword 3')
additem('NPC q402 Skellige sword 3')
additem('NPC No Mans Land sword 4')
additem('NPC Skellige sword 4')
additem('NPC Scoiatael sword 2')
additem('NPC Novigraadan sword 4')
additem('NPC Nilfgaardian sword 4')
additem('NPC Scoiatael sword 3')
additem('NPC Scoiatael sword 4')
additem('NPC Wildhunt sword 2')
additem('Q1_axe1h_mq2024_spirit')
additem('Q1_pickaxe1h')
additem('Q1_mace1h')
additem('Q1_brokenSpear')
additem('Q2_Hammer2h')
additem('Q3_DwarvenAxe2h')
additem('Q2_Halberd2h')
additem('Q1_Guisarme2h')
additem('Q2_Guisarme2h')
additem('Q2_Mage_Staff2h')
additem('Q3_Mage_Staff2h')
additem('Q1_Pitchfork2h')
additem('Bandit Shield 03')
additem('Redanian Shield 01')
additem('Skellige Craite Shield 01')
additem('Skellige Dimun Shield 01')
additem('Skellige Tuiseach Shield 01')
additem('Temeria Shield 01')
additem('scabbard_silver_zirael')
additem('Glyph quen lesser schematic')
additem('Heavy pants 03_crafted')
additem('Long Steel Sword Scabbard')
additem('maw')
additem('Stammelfords dust')
additem('Phosphorus')
additem('Alchemists powder')
additem('Recipe for White Frost 2')
additem('Recipe for Dwimeritium Bomb 1')
additem('Recipe for Dwimeritium Bomb 2')
additem('Recipe for Dwimeritium Bomb 3')
additem('Ciri gloves 01')
additem('scabbard_steel_1_wood')
additem('scabbard_steel_1_02_02')
additem('scabbard_steel_nomansland_02')
additem('scabbard_steel_nomansland_03')
additem('scabbard_steel_nilfgaard_02')
additem('scabbard_steel_novigradian_01')
additem('sq304 Novigraadan sword 4')
additem('scabbard_steel_skellige_01')
additem('Sabre Scabbard v01')
additem('Scoiatael sword 4')
additem('scabbard_steel_3_02')
additem('scabbard_steel_3_01')
additem('Sabre Scabbard 02')
additem('scabbard_silver_3_03')
additem('scabbard_silver_1v_11')
additem('DLC10_Remorse')
additem('Test Player Override Sword')
additem('Iron Poker')
additem('Bag of weed')
additem('Glass')
additem('Gargoyle dust')
additem('Harpy egg')
additem('Nightwraiths hair')
additem('Forktail plate')
additem('Fogling teeth')
additem('Recipe for White Frost 3')
additem('Light armor 01r')
additem('Light armor 06r')
additem('Medium armor 07r')
additem('Medium armor 10r')
additem('Medium armor 11r')
additem('Heavy armor 01r')
additem('Heavy armor 02r')
additem('Heavy armor 04r')
additem('Heavy armor 05r')
additem('Geralt mask 01 no show')
additem('Albert mask no show')
additem('sq301__key_chain')
additem('Woman Panties 02')
additem('Woman Panties 03')
additem('ropes_belt_left')
additem('ropes_belt_right')
additem('Body torso wet hires')
additem('Body feet HighQuality')
additem('Body legs wet')
additem('Ciri body torso 01')
additem('Nithral body torso 01')
additem('Steel scabbard')
additem('Silver scabbard')
additem('scabbard_steel_1_01')
additem('scabbard_steel_1v_01')
additem('scabbard_steel_2v_01')
additem('scabbard_steel_3v_01')
additem('scabbard_steel_gryphon_01')
additem('scabbard_steel_lynx_01')
additem('Witcher Silver Sword Scabbard')
additem('scabbard_silver_1_01')
additem('scabbard_silver_1v_01')
additem('scabbard_silver_1v_02')
additem('scabbard_silver_1_10')
additem('scabbard_silver_2v_01')
additem('scabbard_silver_3v_01')
additem('scabbard_silver_bear_01')
additem('scabbard_silver_gryphon_01')
additem('scabbard_silver_lynx_01')
additem('Sabre Scabbard 01_2')
additem('Sabre Scabbard 01_3')
additem('Sabre Scabbard v02')
additem('Sabre Scabbard 07')
additem('Nilfgaardian Casual Suit 01 no show')
additem('Skellige casual shoes no show')
additem('Skellige Casual Pants 01 no show')
additem('Thief Armor')
additem('Thief Armor B')
additem('Thief Armor Y')
additem('Geralt Kontusz R')
additem('Ofir Armor B')
additem('Burning Rose Armor')
additem('Burning Rose Armor B')
additem('q704_vampire_armor')
additem('Beauclair Prison Shirt')
additem('DLC14 Skellige Armor')
additem('ore_oxenfurt')
additem('Novigraadan sword 2_crafted')
additem('Novigraadan sword 3_crafted')
additem('Skellige sword 3_crafted')
additem('Scoiatael sword 1_crafted')
additem('Scoiatael sword 4_crafted')
additem('Silver sword 5_crafted')
additem('Spear 1')
additem('Wild Hunt Spear')
additem('Halberd 1')
additem('Dwarven Axe')
additem('Twohanded Hammer 1')
additem('Club')
additem('Blackjack')
additem('Poker')
additem('Staff')
additem('Lucerne Hammer')
additem('Wand')
additem('Pickaxe')
additem('Shovel')
additem('Broom_Not_Work')
additem('Paling')
additem('Pitchfork')
additem('Rake')
additem('Scoop')
additem('Scythe')
additem('Shepard Stick')
additem('halberd')
additem('Bow 1')
additem('Bow 2')
additem('Long bow 1')
additem('Long bow 2')
additem('Dwarven crossbow')
additem('poor_garden_shears')
additem('baguette')
additem('rich_trumpet')
additem('gen_open_book_a')
additem('drawknife')
additem('sq703_megascope_switch')
additem('q703_bung_work')
additem('q703_wooden_hammer_work')
additem('perfume_bottle')
additem('makeup_puff')
additem('makeup_brush')
additem('rich_flower')
additem('rich_flower_lefthand')
additem('rich_umbrella')
additem('gen_bucket_c')
additem('poi_bar_a_05_note')
additem('poi_bar_a_10_key')
additem('poi_bar_a_12_note')
additem('camm_poi_ved_a_05')
additem('camm_poi_bar_b_04')
additem('camm_poi_ved_a_02')
additem('camm_poi_ved_a_01')
additem('camm_poi_bar_a_01')
additem('camm_poi_bar_a_02')
additem('camm_poi_bar_a_12')
additem('camm_poi_bar_a_03')
additem('camm_poi_car_b_03')
additem('camm_poi_gor_c_03')
additem('camm_poi_gor_d_06')
additem('camm_poi_gor_d_07')
additem('poi_car_a_11_note')
additem('poi_car_b_08_note')
additem('poi_car_b_08_key')
additem('poi_car_b_10_note_02')
additem('poi_car_b_10_note')
additem('poi_car_b_10_key')
additem('poi_dun_b_03_note')
additem('poi_gor_a_09_note')
additem('poi_gor_a_10_key')
additem('poi_gor_a_10_vine_edible')
additem('poi_gor_a_10_vine')
additem('poi_gor_a_10_note')
additem('poi_gor_b_04_note')
additem('poi_gor_b_04_key')
additem('poi_gor_b_13_note')
additem('poi_gor_c_03_note')
additem('poi_gor_c_14_note')
additem('poi_gor_d_05_note')
additem('poi_gor_d_06_note04')
additem('poi_gor_d_06_note03')
additem('poi_gor_d_06_note')
additem('poi_gor_d_17_note_b')
additem('poi_gor_d_06_note02')
additem('poi_gor_d_20_key')
additem('poi_ww_coronata_note_camp')
additem('poi_ww_coronata_note_stash')
additem('poi_ww_vermentino_note_camp')
additem('poi_ww_vermentino_key')
additem('poi_ww_vermentino_note_stash')
additem('poi_ww_belg_final_key')
additem('wine_wars_belgard_notice')
additem('poi_ww_belgard_secret_plot_proper_note')
additem('poi_ww_belgard_secret_plot_failsafe_note')
additem('poi_ww_coronata_key')
additem('poi_ww_ver_10_note')
additem('poi_ww_cor_03_note')
additem('poi_ww_cor_02_note')
additem('poi_vin_b_06_b')
additem('poi_vin_b_06_note')
additem('poi_san_a_01_note')
additem('poi_san_a_01_key')
additem('poi_san_b_02_note')
additem('poi_car_b_09_note')
additem('poi_ved_a_04_note')
additem('poi_san_b_02_key')
additem('poi_ved_a_02_note')
additem('poi_ved_a_03_note')
additem('poi_ved_a_03_key')
additem('poi_vin_b_05_note02')
additem('poi_vin_b_05_key')
additem('NPC Knights steel sword 1')
additem('milton_shield')
additem('NPC Knight steel sword')
additem('Damien sword')
additem('mq7020_le_papillon_lute')
additem('NPC Guard lvl1 Sword')
additem('dettlaff_arm')
additem('q703_paint_bomb_purple')
additem('q703_paint_bomb_yellow')
additem('q703_paint_bomb_blue')
additem('q703_paint_bomb_green')
additem('NPC Gregoire Sword')
additem('Beauclair elegant suit')
additem('Beauclair elegant pants')
additem('Beauclair elegant shoes')
additem('Only Geralt mandragora mask')
additem('Anarietta mandragora mask')
additem('q704_ft_goose_key')
additem('Golden ball')
additem('Golden thread')
additem('Magic food')
additem('Beauclair Casual Suit 01')
additem('Beauclair casual shoes 01')
additem('Beauclair Casual Pants 01')
additem('Beauclair Prison Pants')
additem('Beauclair Casual Suit with medal')
additem('Body torso nobelts')
additem('q705_bond')
additem('q701_nml_notice')
additem('mq7024_painting_novigrad_dandelion')
additem('q705_regis_reward_letter')
additem('cg700_tournament')
additem('mq7001_notice')
additem('mq7004_notice')
additem('Aerondight EP2')
additem('mq7006_notice')
additem('mq7010_quarry_contract')
additem('mq7018_contract')
additem('mq7021_left_behind_contract')
additem('mq7023_contract')
additem('mq7024_vineyard_key')
additem('mh701_contract')
additem('sq701_geralt_boots')
additem('sq703_contract')
additem('ep1_poi_01_key')
additem('ep1_poi_02_key_1')
additem('ep1_poi_02_note')
additem('ep1_poi_04_key')
additem('ep1_poi_04_note')
additem('ep1_poi_05_key')
additem('ep1_poi_05_note')
additem('ep1_poi_08_note_a')
additem('ep1_poi_10_key')
additem('ep1_poi_10_note')
additem('ep1_poi_26_note')
additem('ep1_poi_26_key')
additem('ep1_poi_26_note_b')
additem('ep1_poi_26_key_b')
additem('q603_auctioned_painting')
additem('q603_magister_glasses')
additem('q603_antique_statue')
additem('q603_olgierds_letters')
additem('q603_hoff_letter')
additem('q602_letter_from_witold')
additem('mq6002_contract')
additem('mq6003_tax_bill')
additem('mq6004_lab_key')
additem('NPC Burning Rose Sword')
additem('mq6004_broken_rose_orders')
additem('mq6005_nephrite')
additem('mq6005_painite')
additem('mq6005_pickaxe')
additem('mq6005_notice')
additem('NPC Olgierd Sabre')
additem('q601_contract')
additem('q601_sewers_key')
additem('q601_redanian_orders')
additem('q602_wrong_shoe_2')
additem('q602_wrong_shoe_1')
additem('q602_donkey_ears')
additem('q602_donkey_ears_no_show')
additem('Body palms cut')
additem('q602_cap')
additem('q602_shani_shoe')
additem('NPC Plank')
additem('Plank')
additem('q602_pig_contest_trophy')
additem('q602_graverobber_key')
additem('q602_olgierd_blood')
additem('Censer')
additem('Thief Armor No Medallion')
additem('Thief Pants B')
additem('Thief Gloves B')
additem('Thief Boots B')
additem('q603_max_house')
additem('q603_dwarf_wooden_sword')
additem('Torch Blunt Burning')
additem('q603_foltest_mask')
additem('q603_foltest_mask_no_show')
additem('q603_diarrhea_potion')
additem('q604_olgierd_pipe')
additem('q604_olgierd_knife')
additem('q604_bed_oillamp')
additem('q604_dressing_gown')
additem('q604_wedding_veil')
additem('q604_wedding_flowers')
additem('q604_mansion_back_key')
additem('q604_mansion_front_key')
additem('q604_gazebo_teaset')
additem('q604_iris_flower')
additem('q604_rose_painting')
additem('q604_tray')
additem('q604_dog_bowl')
additem('q604_cat_bowl')
additem('q604_mug')
additem('q604_paper_shred1')
additem('q604_demon_book')
additem('q604_genie_book')
additem('q604_candles')
additem('q604_chalk')
additem('q604_fruit_bowl')
additem('q604_chalice')
additem('Q604 Olgierd Sabre')
additem('q604_bloody_towel')
additem('q604_cup')
additem('q604_paint_palette')
additem('q604_worn_book')
additem('q604_comb')
additem('q604_small_painting')
additem('q604_sketchbook')
additem('q604_iris_remains')
additem('q605_black_magic_book')
additem('th1009_map_wolf_upgrade3b')
additem('th1009_map_wolf_upgrade2b')
additem('th1009_map_wolf_upgrade3')
additem('th1009_map_wolf_upgrade1a')
additem('th1009_map_wolf_upgrade1b')
additem('th1009_map_wolf_upgrade2')
additem('mq2052_contract')
additem('mq1058_contract')
additem('mq1058_cat_note')
additem('mq1058_cat_school_sword')
additem('mq1058_drawing')
additem('mq1058_cat_medallion')
additem('DLC1 Temerian HorseBag')
additem('DLC1 Temerian HorseBlinders')
additem('DLC1 Temerian HorseSaddle')
additem('ep1_poi_05_02_note')
additem('ep1_poi_08_key')
additem('th1010_pants_note')
additem('ep1_poi_08_note_b')
additem('Burning Rose Gloves')
additem('Crafted Burning Rose Sword schematic')
additem('th1010_boots_note')
additem('q603_auction_house_fluff_note_01')
additem('q603_auction_house_fluff_note_02')
additem('q603_auction_house_fluff_note_03')
additem('q605_scholar_key')
additem('q605_scholar_journal')
additem('DLC5 Nilfgaardian Boots')
additem('DLC5 Nilfgaardian Gloves')
additem('DLC5 Nilfgaardian Pants')
additem('DLC5 Nilfgaardian HorseBag')
additem('DLC5 Nilfgaardian HorseBlinders')
additem('DLC5 Nilfgaardian HorseSaddle')
additem('DLC13 Nilfgaardian Crossbow')
additem('scabbard_silver_wolf_01')
additem('scabbard_steel_wolf_01')
additem('Ofir Crossbow')
additem('Crafted Ofir Steel Sword schematic')
additem('Wolf Gloves 3')
additem('Wolf Pants 3')
additem('Wolf Boots 3')
additem('mon_black_spider_weapon')
additem('Glyph binding lesser schematic')
additem('Glyph mending lesser schematic')
additem('Glyph reinforcement lesser schematic')
additem('Glyph warding lesser schematic')
additem('Glyph binding schematic')
additem('Glyph mending schematic')
additem('Glyph warding schematic')
additem('Glyph reinforcement schematic')
additem('Glyph binding greater schematic')
additem('Glyph mending greater schematic')
additem('Glyph reinforcement greater schematic')
additem('Glyph warding greater schematic')
additem('mq6003_certificate_of_citizenship')
additem('mq6002_strange_meat')
additem('ep1_poi_14_note_b')
additem('ep1_poi_12_note_b')
additem('ep1_poi_03_note')
additem('Crafted Ofir Armor schematic')
additem('Crafted Ofir Pants schematic')
additem('q601_girls_letter')
additem('mon_toad_claw_weapon')
additem('mon_toad_tongue_weapon')
additem('q601_ofir_letter')
additem('Hakland Sabre')
additem('ep1_poi_01_note')
additem('EP1 Witcher Armor schematic')
additem('EP1 Witcher Boots schematic')
additem('EP1 Witcher Gloves schematic')
additem('EP1 Witcher Pants schematic')
additem('NPC Borsody Shield')
additem('EP1 Viper School steel sword schematic')
additem('Ofir Crossbow R')
additem('Burning Rose Gloves B')
additem('Burning Rose Sword B')
additem('Caretaker Shovel')
additem('mon_iris_weapon')
additem('mon_black_spider_large_weapon')
additem('NPC EP1 Steel Sword 2')
additem('Nekker Boots')
additem('ep1_poi_11_note')
additem('ep1_poi_13_note')
additem('ep1_poi_14_note_a')
additem('ep1_poi_16_note')
additem('ep1_poi_17_note')
additem('ep1_poi_23_note_a')
additem('q601_fluff_sculpture_note')
additem('q601_girls_letter_two')
additem('q602_shani_prescription')
additem('q602_wedding_expenses_list')
additem('q602_wedding_guests_list')
additem('q602_wedding_invitation')
additem('q602_wedding_songs_list')
additem('q602_dynasties')
additem('q602_letter_to_olgierd')
additem('q603_emhyr_mask')
additem('q603_henselt_mask')
additem('q603_radovid_mask')
additem('camm_trophy')
additem('Flower behind ear')
additem('sq701_item_wearable_feather')
additem('sq701_my_manifest')
additem('mq7020_letter_to_jl')
additem('lore_dun_tynne_legend')
additem('lore_vineyards_guide_part_i')
additem('lore_vineyards_guide_part_ii')
additem('lore_caed_myrkvid_guide')
additem('lore_knights_errant')
additem('lore_faramond_book')
additem('poi_gor_d_06_note05')
additem('fightclub_book')
additem('balaste_book')
additem('item_book_lore_royal_chronicle_1')
additem('item_book_lore_royal_chronicle_2')
additem('Spoon')
additem('q704_vampire_artifact_strange_aparatus')
additem('q704_vampire_artifact_copper_tablet')
additem('q704_vampire_artifact_strange_coins')
additem('q704_vampire_artifact_jewelry_1')
additem('q704_vampire_artifact_jewelry_2')
additem('q704_vampire_artifact_skull')
additem('q704_vampire_artifact_statuette')
additem('mq7024_gen_painting_landscape_a')
additem('mq7024_gen_painting_landscape_b')
additem('mq7024_gen_painting_landscape_c')
additem('mq7024_gen_painting_landscape_d')
additem('mq7024_gen_painting_portrait_a')
additem('mq7024_gen_painting_portrait_b')
additem('mq7024_gen_painting_portrait_c')
additem('mq7024_mandragora_painting_02')
additem('mq7024_mandragora_painting_03')
additem('mq7024_mandragora_painting_04')
additem('mq7024_palace_painting')
additem('mq7024_painting_battlefield')
additem('mq7024_painting_harbour')
additem('mq7024_painting_merchantwithpearl')
additem('mq7024_painting_prologue_village')
additem('mq7024_painting_stilllife')
additem('mq7024_painting_knight_on_horse')
additem('mq7024_painting_ciri_portrait')
additem('mq7024_painting_emhyr_portrait')
additem('Marovski necklace')
additem('Marovski bracelet')
additem('q701_phoenix_egg')
additem('q702_vampire_set_note')
additem('q704_vampire_mask')
additem('q703_hos_sketch')
additem('q705_note_ab_syanna')
additem('q705_note_from_sasha1')
additem('q705_note_from_sasha2')
additem('mq7003_herbs')
additem('mq7003_gems')
additem('mq7009_painting_pose2_ravix')
additem('mq7009_painting_pose2_grif_ravix')
additem('mq7014_alraune_item')
additem('mq7014_reagent')
additem('mq7014_alchemical_base')
additem('mq7014_herb')
additem('th700_prison_note1')
additem('th700_prison_note2')
additem('th700_prison_note3')
additem('mq7024_item__notebook')
additem('cutlery_rich_knife')
additem('rich_silver_goblet_b')
additem('rich_cane')
additem('q703_ah_wine_cup_work')
additem('q703_torch_work_right')
additem('q705_priscilla_lute')
additem('q705_yen_book')
additem('gen_barrel_open')
additem('hurdy_gurdy')
additem('cat_sitting_on_lap')
additem('rich_handkerchief')
additem('wine_bottle')
additem('assassination_letter')
additem('shield_polish')
additem('bucket_big_ep2')
additem('cutlery_rich_fork')
additem('Horse braided tail 2')
additem('Horse braided tail 1')
additem('Horse Hair 1 ep2')
additem('q704_ft_fairy_key')
additem('q706_wagon_key')
additem('q707_old_key')
additem('mh701_wine_cellar_key')
additem('mq7001_house_key')
additem('sq703_cellar_key')
additem('th701_wg_key')
additem('q704_vampire_gloves')
additem('q704_vampire_pants')
additem('Nazairi Mace')
additem('Knight Mace 1')
additem('Knight Mace 2')
additem('Knight Mace 3')
additem('mh702_contract')
additem('mh703_contract')
additem('mh704_contract')
additem('mq7008_lost_person_contract')
additem('mq7008_monster_contract')
additem('mq7015_contract')
additem('mq7022_hollow_knight_contract')
additem('ff701_notice')
additem('wine_wars_vermentino_notice')
additem('wine_wars_coronata_notice')
additem('Azurite?mineral')
additem('Toussaint Crossbow 1')
additem('Toussaint Crossbow 2')
additem('Toussaint steel sword 2')
additem('EP2 mask 02')
additem('EP2 mask 03')
additem('FT_Fisstech')
additem('poi_bar_a_01_note')
additem('poi_bar_b_04_note')
additem('poi_bar_b_05_note')
additem('poi_bar_b_14_note')
additem('poi_bar_a_05_note_b')
additem('poi_bar_b_06_note')
additem('poi_bar_a_10b_note')
additem('poi_bar_a_11_note')
additem('poi_car_a_05_note')
additem('poi_car_a_05b_note')
additem('poi_car_a_06_note')
additem('poi_car_a_07_note')
additem('poi_car_a_07_spoon')
additem('poi_san_a_03_note')
additem('poi_san_b_04_note')
additem('poi_san_b_05_note')
additem('poi_san_b_06_note')
additem('poi_ved_a_01_note')
additem('poi_ved_a_03b_note')
additem('poi_ved_a_05_note')
additem('poi_ved_a_05_key')
additem('poi_ved_a_06_note')
additem('poi_ved_a_07_note')
additem('poi_ved_a_08_note')
additem('poi_ved_a_08_b_note')
additem('poi_vin_b_04_note')
additem('poi_vin_b_05_note')
additem('poi_car_a_11_a_note')
additem('poi_car_a_11_b_note')
additem('poi_car_a_11_c_note')
additem('poi_ww_bel_09_note')
additem('poi_gor_a_01_note')
additem('poi_gor_a_08_note')
additem('poi_gor_a_10_note_b')
additem('poi_gor_b_04_note_b')
additem('poi_gor_b_11_note')
additem('poi_gor_b_12_note')
additem('poi_gor_d_05_key')
additem('poi_gor_d_07_note')
additem('poi_gor_d_17_note')
additem('poi_gor_d_18_note')
additem('poi_dun_a_04_note')
additem('poi_dun_b_08_note')
additem('poi_dun_b_08_note_b')
additem('poi_bar_a_08_note')
additem('poi_bar_a_09_note')
additem('poi_bar_a_09_plans')
additem('poi_bar_a_13_note')
additem('poi_ww_cor_01_note')
additem('poi_ww_cor_04_note')
additem('poi_ww_ver_13_note')
additem('poi_ww_bel_06_note')
additem('poi_ww_bel_08_note')
additem('NPC Laundry stick')
additem('NPC Ghost pole')
additem('Guard lvl1 steel sword 3 Autogen')
additem('scabbard_steel_3_06')
additem('Squire steel sword 3')
additem('Hanza steel sword 0')
additem('Hanza steel sword 1')
additem('Hanza steel sword 2')
additem('q704_scabbard_steel_vampire')
additem('scabbard_steel_vampire')
additem('q704 vampire steel sword')
additem('EP2 Silver sword 1')
additem('EP2 Silver sword 1R')
additem('EP2 Silver sword 2')
additem('EP2 Silver sword 3')
additem('EP2 Silver sword 3R')
additem('Serpent Silver Sword 1 Autogen')
additem('scabbard_silver_vampire')
additem('q704 vampire silver sword')
additem('mon_witch_cauldron')
additem('mon_witch_broom')
additem('Garlic')
additem('Barghest essence')
additem('Protofleder Mutagen')
additem('Loot_Bottle caps')
additem('Loot_Fake teeth')
additem('Loot_Corkscrew')
additem('Vampire Stake')
additem('Silver mirror')
additem('NPC Hanza steel sword')
additem('NPC Guard lvl2 Sword')
additem('sq701 Palmerin Shield')
additem('sq701 Troy Shield')
additem('sq701 Frenes Shield')
additem('sq701 Dornal Shield')
additem('sq701 Attre Shield')
additem('sq701 Attre Creiqiau Shield')
additem('sq701 Fourhorn Shield')
additem('sq701 Anseis Shield')
additem('sq701 Maecht Shield')
additem('sq701 Mettina Shield')
additem('NPC BoB Shield 1')
additem('NPC BoB Shield 2')
additem('NPC BoB Shield 3')
additem('NPC BoB Shield 4')
additem('NPC Dun Tynne Shield')
additem('NPC Hanza Shield')
additem('NPC bob Guard Shield')
additem('NPC Nazairi Mace')
additem('mon_fariywitch_weapon')
additem('scabbard_steel_wolf_ep2')
additem('scabbard_silver_wolf_ep2')
additem('bruxa_cloak')
additem('Fancy Bowl')
additem('Ravix of Fourhorn Crossbow')
additem('Geralt of Rivia Crossbow')
additem('Recipe for Alraune Reagent')
additem('mon_barghest_body')
additem('mon_dettlaff_claws_weapon')
additem('mon_barghest_bite')
additem('mon_boar_charge')
additem('mon_scolopendromorph_weapon')
additem('mon_archespor_weapon')
additem('mon_sharley_young_weapon')
additem('mon_sharley_weapon')
additem('mon_sharley_black_weapon')
additem('mon_bruxa_weapon')
additem('mon_dracolizard_tail')
additem('mon_dracolizard_head_weapon')
additem('mon_black_spider_ep2_weapon')
additem('mon_black_spider_large_ep2_weapon')
additem('mon_q701_giant_ep2_fist')
additem('mon_dettlaff_monster_weapon')
additem('mon_banshee_weapon')
additem('q603_sharley_trophy')
additem('Geralt Kontusz Boots R')
additem('Thief Boots')
additem('Thief Boots Y')
additem('Thief Boots No Medallion')
additem('Ofir Boots')
additem('Ofir Boots B')
additem('q601_fluff_note_one')
additem('q601_fluff_note_two')
additem('q601_fluff_note_three')
additem('q602_basics_of_medicine')
additem('q603_roberts_letter')
additem('q604_olgierd_letter')
additem('q604_toast_cup')
additem('ep1_poi_20_note')
additem('ep1_poi_24_note')
additem('ep1_poi_07_note')
additem('ep1_poi_12_note')
additem('ep1_poi_23_note_b')
additem('ep1_poi_25_note')
additem('ep1_poi_30_note')
additem('ep1_poi_02b_note')
additem('ep1_poi_26_note2')
additem('ep1_poi_26_note3')
additem('ep1_poi_35_note')
additem('ep1_poi_32_note')
additem('ep1_poi_02c_note')
additem('Horse Saddle 5')
additem('mq6002_key')
additem('Thief Pants')
additem('Thief Pants Y')
additem('Thief Pants No Medallion')
additem('Ofir Pants')
additem('Ofir Pants B')
additem('Rune pierog schematic')
additem('Rune tvarog schematic')
additem('Concealment Kit schematic')
additem('EP1 Crafted Witcher Silver Sword schematic')
additem('EP1 Viper School silver sword schematic')
additem('Crafted Burning Rose Armor schematic')
additem('Concealment Kit')
additem('Thief Gloves')
additem('Thief Gloves Y')
additem('Thief Gloves No Medallion')
additem('Torch Blunt')
additem('caretaker_body')
additem('Boar pelt')
additem('Boar tusk')
additem('q603_circus_bolt')
additem('q603_circus_crossbow')
additem('NPC Hakland Shield')
additem('NPC Hakland Spear')
additem('NPC EP1 Steel Sword')
additem('head_5')
additem('head_5_tattoo')
additem('head_6')
additem('head_6_tattoo')
additem('head_7')
additem('head_7_tattoo')
additem('Horse Hair Nilfgaardian')
additem('th1009_sorry_note')
additem('DLC14 Skellige Pants')
additem('DLC13 Skellige Crossbow')
additem('DLC13 Elven Crossbow')
additem('DLC14 Skellige Boots')
additem('DLC14 Skellige Gloves')
additem('DLC14 Skellige HorseBag')
additem('DLC14 Skellige HorseBlinders')
additem('Horse Hair 1 Skellige')
additem('DLC14 Skellige HorseSaddle')
}

{Hearts of Stone DLC Item Complete List:

additem('Soltis Vodka')
additem('Cornucopia')
additem('Devil Saddle')
additem('Horse Saddle 5')
additem('Horse Saddle 6')
additem('Ofir Horse Bag')
additem('Ofir Horse Blinders')
additem('Thief Pants')
additem('Thief Pants B')
additem('Thief Pants Y')
additem('Thief Pants No Medallion')
additem('Ofir Pants')
additem('Ofir Pants B')
additem('Plank')
additem('NPC Long Steel Sword')
additem('NPC torch')
additem('Shovel')
additem('PC Caretaker Shovel')
additem('NPC Olgierd Sabre')
additem('PC Olgierd Sabre')
additem('Ofir Sabre 1')
additem('Ofir Sabre 2')
additem('Hakland Sabre')
additem('Burning Rose Sword B') 
additem('Burning Rose Sword') 
additem('Ofir Crossbow')
additem('Ofir Crossbow R')
additem('PC Olgierd Sabre')
additem('Ofir Sabre 2')
additem('Burning Rose Gloves')
additem('Burning Rose Gloves B')
additem('Thief Gloves')
additem('Thief Gloves B')
additem('Thief Gloves Y')
additem('Thief Gloves No Medallion')
additem('Crafted Ofir Steel Sword')
additem('Crafted Burning Rose Sword') 
additem('EP1 Crafted Witcher Silver Sword')
additem('EP1 Viper School steel sword')
additem('EP1 Viper School silver sword')
additem('Crafted Ofir Steel Sword')
additem('Crafted Burning Rose Sword') 
additem('EP1 Crafted Witcher Silver Sword')
additem('EP1 Viper School steel sword')
additem('EP1 Viper School silver sword')
additem('Geralt_kontusz')
additem('Geralt_kontusz_r')
additem('Ofir Armor')
additem('Ofir Armor B')
additem('Thief Armor')
additem('Thief Armor B')
additem('Thief Armor Y')
additem('Thief Armor No Medallion')
additem('Burning Rose Armor')
additem('Burning Rose Armor B')
additem('Ofir Armor')
additem('Geralt Kontusz Boots')
additem('Geralt Kontusz Boots R')
additem('Thief Boots')
additem('Thief Boots B')
additem('Thief Boots Y')
additem('Thief Boots No Medallion')
additem('Ofir Boots')
additem('Ofir Boots B')
additem('Crafted Ofir Armor')
additem('Crafted Burning Rose Armor')
additem('EP1 Witcher Armor')
additem('Crafted Ofir Armor')
additem('Crafted Burning Rose Armor')
additem('EP1 Witcher Armor')
additem('Crafted Ofir Boots')
additem('EP1 Witcher Boots')
additem('Crafted Ofir Boots')
additem('EP1 Witcher Boots')
additem('Crafted Ofir Gloves')
additem('Crafted Burning Rose Gloves')
additem('EP1 Witcher Gloves')
additem('Crafted Ofir Gloves')
additem('Crafted Burning Rose Gloves')
additem('EP1 Witcher Gloves')
additem('Crafted Ofir Pants')
additem('EP1 Witcher Pants')
additem('Crafted Ofir Pants')
additem('EP1 Witcher Pants')
additem('Rune pierog')
additem('Rune tvarog')
additem('Glyph warding lesser')
additem('Glyph warding')
additem('Glyph warding greater')
additem('Glyph binding lesser')
additem('Glyph binding')
additem('Glyph binding greater')
additem('Glyph reinforcement lesser')
additem('Glyph reinforcement')
additem('Glyph reinforcement greater')
additem('Glyph mending lesser')
additem('Glyph mending')
additem('Glyph mending greater')
additem('Rune pierog schematic')
additem('Rune tvarog schematic')
additem('Glyph warding lesser schematic')
additem('Glyph warding schematic')
additem('Glyph warding greater schematic')
additem('Glyph binding lesser schematic')
additem('Glyph binding schematic')
additem('Glyph binding greater schematic')
additem('Glyph reinforcement lesser schematic')
additem('Glyph reinforcement schematic')
additem('Glyph reinforcement greater schematic')
additem('Glyph mending lesser schematic')
additem('Glyph mending schematic')
additem('Glyph mending greater schematic')
additem('Concealment Kit schematic')
additem('Crafted Ofir Steel Sword schematic')
additem('EP1 Viper School steel sword schematic')
additem('Crafted Burning Rose Sword schematic')
additem('EP1 Crafted Witcher Silver Sword schematic')
additem('EP1 Viper School silver sword schematic')
additem('Crafted Ofir Armor schematic')
additem('Crafted Ofir Boots schematic')
additem('Crafted Ofir Gloves schematic')
additem('Crafted Ofir Pants schematic')
additem('Crafted Burning Rose Armor schematic')
additem('Crafted Burning Rose Gloves schematic')
additem('EP1 Witcher Armor schematic')
additem('EP1 Witcher Boots schematic')
additem('EP1 Witcher Gloves schematic')
additem('EP1 Witcher Pants schematic')
additem('gwint_card_francesca_platinum')
additem('gwint_card_eredin_platinum')
additem('gwint_card_emhyr_platinum')
additem('gwint_card_foltest_platinum') 
additem('gwint_card_mrmirror_foglet')
}

{Blood and Wine DLC Item Codes

Grandmaster Bear School armor + weapon set

additem("Bear Pants 5")
additem("Bear Boots 5")
additem("Bear Gloves 5")
additem("Bear Armor 4")
additem("Bear School steel sword 4")
additem("Bear School silver sword 4")
Grandmaster Feline School armor + weapon set

additem("Lynx Pants 5")
additem("Lynx Boots 5")
additem("Lynx Gloves 5")
additem("Lynx Armor 4")
additem("Lynx School steel sword 4")
additem("Lynx School silver sword 4")
Grandmaster Griffin School armor + weapon set

additem("Gryphon Pants 5")
additem("Gryphon Boots 5")
additem("Gryphon Gloves 5")
additem("Gryphon Armor 4")
additem("Gryphon School steel sword 4")
additem("Gryphon School silver sword 4")
Grandmaster Wolf School armor + weapon set

additem("Wolf Pants 5")
additem("Wolf Boots 5")
additem("Wolf Gloves 5")
additem("Wolf Armor 4")
additem("Wolf School steel sword 4")
additem("Wolf School silver sword 4")
Manticore armor + weapon set

additem("Red Wolf Pants 1")
additem("Red Wolf Gloves 1")
additem("Red Wolf Boots 1")
additem("Red Wolf Armor 1")
additem("Red Wolf School steel sword 1")
additem("Red Wolf School silver sword 1")
Legendary Manticore armor + weapon set

additem("Red Wolf Pants 2")
additem("Red Wolf Gloves 2")
additem("Red Wolf Boots 2")
additem("Red Wolf Armor 2")
additem("Red Wolf School steel sword 2")
additem("Red Wolf School silver sword 2")
Hen Gaidth armor + weapon set

additem("q704_vampire_armor")
additem("q704_vampire_mask")
additem("q704_vampire_gloves")
additem("q704_vampire_pants")
additem("q704_vampire_boots")
additem("q704 vampire steel sword")
Tesham Mutna armor + weapon set

additem("q702_vampire_boots")
additem("q702_vampire_pants")
additem("q702_vampire_gloves")
additem("q702_vampire_armor")
additem("q702_vampire_mask")
additem("q702 vampire steel sword")
Dyes

additem("Dye Black")
additem("Dye White")
additem("Dye Gray")
additem("Dye Turquoise")
additem("Dye Brown")
additem("Dye Green")
additem("Dye Red")
additem("Dye Blue")
additem("Dye Orange")
additem("Dye Yellow")
additem("Dye Pink")
additem("Dye Purple")
Dye Solution, Remover + formulas

additem("Dye Default")
additem("Dye Solution")
additem("Recipe Dye Black")
additem("Recipe Dye White")
additem("Recipe Dye Gray")
additem("Recipe Dye Turquoise")
additem("Recipe Dye Brown")
additem("Recipe Dye Green")
additem("Recipe Dye Red")
additem("Recipe Dye Blue")
additem("Recipe Dye Orange")
additem("Recipe Dye Yellow")
additem("Recipe Dye Pink")
additem("Recipe Dye Purple")
Paintings to decorate your house with (Updated: 2016, June 4th) NOTE: You cannot hang the painting with Olgierd and Rose unfortunately.

additem("q603_auctioned_painting")
additem("q305_painting_of_hemmelfart")
additem("mq7024_painting_battlefield")
additem("mq7024_painting_ciri_portrait")
additem("mq7024_palace_painting")
additem("mq7024_mandragora_painting_02")
(changing "_a" with "_b" and "_c" works for the following:)
additem("mq7024_gen_painting_portrait_a")
additem("mq7024_gen_painting_landscape_a")
additem("mq7024_painting_stilllife")
More paintings can be found here (credits to /u/Geong-Gemynd): https://www.reddit.com/r/witcher/comments/4mlwd2/there_are_many_unused_paintings_in_the_blood_wine/
Trophies to decorate your house with (Updated: 2016, June 7th with 3rd trophy thanks to /u/simpy2)

additem("ff701_fist_fight_trophy")
additem("cg700_gwent_statue")
additem("q702_marlena_dowry")
The Shield you win from the tournament which you can also hang

additem("sq701_geralt_shield")
New awesome swords (Updated: 2016, June 4th - credits to /u/Zephinor)

additem("Aerondight EP2") ("Aerondight" from the "Five Virtues" quest - best silver sword)
additem("Unique steel sword") (Sword called "Vitis" that you get in the fairy tale land)
additem("Unique silver sword") ("Gesheft" sword from the Dark Souls 3 Easter egg - same damage as Aerondight but with sign intensity stats)
additem("Gwent steel sword 1")
additem("sq701 Geralt of Rivia sword") (Sword that Geralt wins from the tourney)
additem("Hanza steel sword 3")
additem("q704 vampire silver sword") (Sword called Canata that you can find in the Unseen Elder's lair)
additem("EP2 Silver sword 3R")
Toussaint swords

additem("Knights steel sword 1")
additem("Knights steel sword 2")
additem("Knights steel sword 3")
additem("Squire steel sword 1")
additem("Squire steel sword 2")
additem("Squire steel sword 3")
additem("Toussaint steel sword 3")
additem("Guard Lvl1 steel sword 1")
additem("Guard Lvl1 steel sword 2")
additem("Guard Lvl2 steel sword 1")
additem("Guard Lvl2 steel sword 2")
additem("mq7001 Toussaint steel sword")
All Toussaint armor:

Toussaint knight's tourney armor (lvl 48)

additem("Knight Geralt A Armor 3")
additem("Knight Geralt A Gloves 3")
additem("Knight Geralt A Pants 3")
additem("Knight Geralt A Boots 3")
Toussaint knight's tourney armor (lvl 46)

additem("Knight Geralt A Armor 2")
additem("Knight Geralt A Boots 2")
additem("Knight Geralt A Gloves 2")
additem("Knight Geralt A Pants 2")
Toussaint knight's tourney armor (lvl 45)

additem("Knight Geralt A Armor 1")
additem("Knight Geralt A Boots 1")
additem("Knight Geralt A Gloves 1")
additem("Knight Geralt A Pants 1")
Toussaint knight's armor (lvl 47)

additem("Knight Geralt Armor 3")
additem("Knight Geralt Gloves 3")
additem("Knight Geralt Pants 3")
additem("Knight Geralt Boots 3")
Toussaint knight's armor (lvl 43)

additem("Knight Geralt Armor 2")
additem("Knight Geralt Boots 2")
additem("Knight Geralt Gloves 2")
additem("Knight Geralt Pants 2")
Toussaint knight's armor (lvl 42)

additem("Knight Geralt Armor 1")
additem("Knight Geralt Boots 1")
additem("Knight Geralt Gloves 1")
additem("Knight Geralt Pants 1")
Toussaint armor (lvl 45)

additem("Toussaint Armor 2")
additem("Toussaint Boots 2")
additem("Toussaint Gloves 2")
additem("Toussaint Pants 2")
Toussaint armor (lvl 40)

additem("Toussaint Armor 3")
additem("Toussaint Boots 3")
additem("Toussaint Gloves 3")
additem("Toussaint Pants 3")
Toussaint Ducal Guardman's Armor (lvl 35)

additem("Guard Lvl1 Armor 1")
additem("Guard Lvl1 Boots 1")
additem("Guard Lvl1 Gloves 1")
additem("Guard Lvl1 Pants 1")
Toussaint Ducal Guardman's Armor (lvl 35, magic item)

additem("Guard Lvl1 Armor 2")
additem("Guard Lvl1 Boots 2")
additem("Guard Lvl1 Gloves 2")
additem("Guard Lvl1 Pants 2")
Toussaint Color Guardman's Armor (lvl 36)

additem("Guard Lvl1 A Armor 1")
additem("Guard Lvl1 A Boots 1")
additem("Guard Lvl1 A Gloves 1")
additem("Guard Lvl1 A Pants 1")
Toussaint Color Guardman's Armor (lvl 37)

additem("Guard Lvl1 A Armor 2")
additem("Guard Lvl1 A Boots 2")
additem("Guard Lvl1 A Gloves 2")
additem("Guard Lvl1 A Pants 2")
Toussaint Ducal Guard Officer's Armor (lvl 38)

additem("Guard Lvl2 Armor 1")
additem("Guard Lvl2 Boots 1")
additem("Guard Lvl2 Gloves 1")
additem("Guard Lvl2 Pants 1")
Toussaint Ducal Guard Officer's Armor (lvl 39)

additem("Guard Lvl2 Armor 2")
additem("Guard Lvl2 Boots 2")
additem("Guard Lvl2 Gloves 2")
additem("Guard Lvl2 Pants 2")
Toussaint Ducal Guard Captain's Armor (lvl 40)

additem("Guard Lvl2 A Armor 1")
additem("Guard Lvl2 A Boots 1")
additem("Guard Lvl2 A Gloves 1")
additem("Guard Lvl2 A Pants 1")
Toussaint Ducal Guard Captain's Armor (lvl 41)

additem("Guard Lvl2 A Armor 2")
additem("Guard Lvl2 A Boots 2")
additem("Guard Lvl2 A Gloves 2")
additem("Guard Lvl2 A Pants 2")
Toussaint horse stuff

additem("Toussaint saddle")
additem("Toussaint saddle 2")
additem("Toussaint saddle 3")
additem("Toussaint saddle 4")
additem("Toussaint saddle 5")
additem("Toussaint saddle 6")
additem("Toussaint horsebag")
additem("Toussaint horse blinders")
additem("Toussaint horse blinders 2")
additem("Toussaint horse blinders 3")
additem("Toussaint horse blinders 4")
additem("Toussaint horse blinders 5")
additem("Toussaint horse blinders 6")
Tourney stuff Geralt wins

additem("Geralt of Rivia Crossbow")
additem("sq701_geralt_armor")
additem("Tourney Geralt Saddle")
Toussaint formal wear (appears in Quest items tab in the inventory)

additem("Beauclair Casual Suit 01")
additem("Beauclair Casual Suit with medal")
additem("Beauclair casual shoes 01")
additem("Beauclair Casual Pants 01")
New monsters (compiled by /u/chance52)

spawn('alp') - spawns a level 47 alp
spawn('archespor_normal') - spawn a level 47 archespore
spawn('archespor_hard') - spawn a level 47 archespore
spawn('archespor_turret') - spawn a level 47 archespore
spawn('banshee') -spawns a level Beann'shie that looks like a quest boss but not called the same name
spawn(barghest') -spawns a level 40 Barghest
spawn('basilisk') -spawns a level 32 Basilisk
spawn('bigbadwolf') -Spawns a quest boss at low level
spawn('black_spider') - spawns a level 30 Arachnomorph
spawn('black_spider_large') - spawns a level 33 Arachnomorph
spawn('bruxa') - spawns a level 47 Bruxa
spawn('bruxa_cloak') - spawns a level 47 Bruxa
spawn('bruxa_commoner') -spawns a level 47 Bruxa
spawn('cloud_giant') - Spawns a quest boss
spawn('dracolizard') - spawns a level 40 slyzard
spawn('fleder') - spawns a level 47 Katakain
spawn('garkain') -spawns a level 47 Katakain
spawn('gravier') - spawn a level 40 scurver
spawn('kikimore') -spawns a level 5 kikimore warrior
spawn('kikimore_small') - spawns a level 1 kikimore worker
spawn('knight_giant') -spawns a level 30 cyclops looks and acts like a quest boss but no beastary update
spawn('oszluzg') - spawn a level 40 slyzard
spawn('panther') -spawns a level 1 Panther
spawn(scolopendromorph) -spawns a level 1 giant centipede named 'coco'
spawn('sharley') - spawns a level 36 Shaelmaar
spawn('sprigan') - spawn a level 37 spriggan
spawn('wight) -spawns a level 28 wight
spawn('q701_dagonet_giant') - spawns a level 30 cyclops looks and acts like a quest boss but no beastary update
spawn('q704_ft_pixie_01') - spawns level 47 pixie
spawn("dettlaff") - spawns a level 50 Dettlaff
spawn('name',#,x,true/false) - spawns "#" amount of "true=hostile or false=friendly" "name"-NPCs in distance "x", can't set monsters to friendly, only NPCs
}

{All new Gwent cards

additem("gwint_card_foltest_platinium")
additem("gwint_card_emhyr_platinium")
additem("gwint_card_francesca_platinium")
additem("gwint_card_eredin_platinium")
additem("gwint_card_king_bran_bronze")
additem("gwint_card_vernon")
additem("gwint_card_natalis")
additem("gwint_card_esterad")
additem("gwint_card_philippa")
additem("gwint_card_thaler")
additem("gwint_card_dijkstra")
additem("gwint_card_siege_tower")
additem("gwint_card_blue_stripes")
additem("gwint_card_crinfrid")
additem("gwint_card_crinfrid2")
additem("gwint_card_crinfrid3")
additem("gwint_card_catapult")
additem("gwint_card_catapult2")
additem("gwint_card_poor_infantry2")
additem("gwint_card_poor_infantry3")
additem("gwint_card_letho")
additem("gwint_card_black_archer")
additem("gwint_card_menno")
additem("gwint_card_moorvran")
additem("gwint_card_tibor")
additem("gwint_card_albrich")
additem("gwint_card_combat_engineer")
additem("gwint_card_fringilla")
additem("gwint_card_cynthia")
additem("gwint_card_shilard")
additem("gwint_card_sweers")
additem("gwint_card_vanhemar")
additem("gwint_card_vattier")
additem("gwint_card_vreemde")
additem("gwint_card_cahir")
additem("gwint_card_puttkammer")
additem("gwint_card_heavy_zerri")
additem("gwint_card_zerri")
additem("gwint_card_impera_brigade")
additem("gwint_card_impera_brigade2")
additem("gwint_card_impera_brigade3")
additem("gwint_card_impera_brigade4")
additem("gwint_card_archer_support2")
additem("gwint_card_siege_support")
additem("gwint_card_nausicaa2")
additem("gwint_card_nausicaa3")
additem("gwint_card_stefan")
additem("gwint_card_young_emissary")
additem("gwint_card_young_emissary2")
additem("gwint_card_eithne")
additem("gwint_card_saskia")
additem("gwint_card_yaevinn")
additem("gwint_card_toruviel")
additem("gwint_card_havekar_support")
additem("gwint_card_havekar_support2")
additem("gwint_card_vrihedd_brigade2")
additem("gwint_card_dol_infantry")
additem("gwint_card_dol_infantry3")
additem("gwint_card_dol_dwarf")
additem("gwint_card_dol_dwarf2")
additem("gwint_card_dol_dwarf3")
additem("gwint_card_mahakam3")
additem("gwint_card_mahakam4")
additem("gwint_card_mahakam5")
additem("gwint_card_elf_skirmisher3")
additem("gwint_card_vrihedd_cadet")
additem("gwint_card_dol_archer")
additem("gwint_card_havekar_nurse")
additem("gwint_card_havekar_nurse2")
additem("gwint_card_havekar_nurse3")
additem("gwint_card_schirru")
additem("gwint_card_draug")
additem("gwint_card_kayran")
additem("gwint_card_imlerith")
additem("gwint_card_leshen")
additem("gwint_card_forktail")
additem("gwint_card_earth_elemental")
additem("gwint_card_fiend")
additem("gwint_card_plague_maiden")
additem("gwint_card_griffin")
additem("gwint_card_werewolf")
additem("gwint_card_botchling")
additem("gwint_card_frightener")
additem("gwint_card_endrega")
additem("gwint_card_harpy")
additem("gwint_card_cockatrice")
additem("gwint_card_gargoyle")
additem("gwint_card_celaeno_harpy")
additem("gwint_card_grave_hag")
additem("gwint_card_fire_elemental")
additem("gwint_card_fogling")
additem("gwint_card_wyvern")
additem("gwint_card_arachas_behemoth")
additem("gwint_card_arachas")
additem("gwint_card_arachas2")
additem("gwint_card_arachas3")
additem("gwint_card_nekker")
additem("gwint_card_nekker2")
additem("gwint_card_nekker3")
additem("gwint_card_ekkima")
additem("gwint_card_garkain")
additem("gwint_card_bruxa")
additem("gwint_card_katakan")
additem("gwint_card_ghoul")
additem("gwint_card_ghoul2")
additem("gwint_card_ghoul3")
additem("gwint_card_hjalmar")
additem("gwint_card_cerys")
additem("gwint_card_ermion")
additem("gwint_card_draig")
additem("gwint_card_holger_blackhand")
additem("gwint_card_madman_lugos")
additem("gwint_card_donar_an_hindar")
additem("gwint_card_udalryk")
additem("gwint_card_birna_bran")
additem("gwint_card_blueboy_lugos")
additem("gwint_card_svanrige")
additem("gwint_card_olaf")
additem("gwint_card_berserker")
additem("gwint_card_young_berserker")
additem("gwint_card_clan_tordarroch_armorsmith")
additem("gwint_card_clan_heymaey_skald")
additem("gwint_card_light_drakkar")
additem("gwint_card_clan_drummond_shieldmaiden3")
additem("gwint_card_clan_dimun_pirate")
additem("gwint_card_cock")
additem("gwint_card_geralt")
additem("gwint_card_vesemir")
additem("gwint_card_yennefer")
additem("gwint_card_ciri")
additem("gwint_card_dandelion")
additem("gwint_card_zoltan")
additem("gwint_card_emiel")
additem("gwint_card_villen")
additem("gwint_card_olgierd")
additem("gwint_card_mrmirror")
additem("gwint_card_mrmirror_foglet")
additem("gwint_card_cow")
additem("gwint_card_dummy")
additem("gwint_card_horn")
additem("gwint_card_scorch")
additem("gwint_card_frost")
additem("gwint_card_fog")
additem("gwint_card_clear_sky")
additem("gwint_card_mushroom")
additem("gwint_card_skellige_storm")
}

{XY Coordinates Teleport

Toussaint 
xy(-970,-780) Hermit on a lake where Areonaut sword is 
xy(-400,-800) bed in Corvo Bianko , but only from distance, if you are too close, you will land on a roof 
xy(-388,-803) door to house at Corvo Bianko 
xy(-445,-1425) Grandmaster Craftsmans door 

places of power in Toussaint: 
xy(-185,725) Place of Power (P of P) Yarden 
xy(-1135,-950) cave entrance leading to P of P Axii 
xy(-645,-1866) P of P Aard (next to the cave entrance for Unseen) 
xy(645,-1495) P of P Quen 
xy(1065,-858) ! require GOD command ! P of P Igni, you will hard land at entrance to the cave with P of P 

'Land Of Thousand Fables'. From anywere in Toussaint: 
L of Th F can be reached before and after quest 'Beyond Hill and Dale' but it doesn't look as pretty as during the quest. 
You can find there a very good heavy golden Toussaint armor, but be honest you will ruin your game going there before the quest. If you missed it durring the quest - here you are - now you can get there back and grab it. 

xy(2552,1355) heavy Toussaint armor 
xy(2670,1355) Joss 
xy(2587,1300) Three Little Bears 
xy(2530,1280) Big Bad Wolf at grandmama’s house 
xy(2460,1455) Three Little Pigs 
xy(2540,1405) Longlocks tower 
xy(2605,1500) Little Flint Girl 
xy(2440,1350) Duck's House 
xy(2460,1260) Dwarf's camp with Duck in cage 
xy(2635,1445) place where you should plant seeds 

Anyway, this area is so small so riding on your unicorn is fast enough. 

And the last one for Toussaint :) 
xy(-2048,-3134) for ski board lovers ~ 35s slide down 

Rest from Witcher 3 Wild Hunt: 

White Orchard 
xy(5,-37) Amateur Armorer 
xy(57,5) door at the Inn 
xy(-231,6) Herbalis 
xy(-338,346) Nilfgaardian blacksmith 

Valen & Novigrad 
xy(224,148) Crow's Perch Yolanda craftsman 
xy(170,170) steps to Baron's House ( the shorter way to box / stash ) 
xy(2383,-1046) entrance to Quartermaster's tent at Nilfgaardian army camp 
xy(1718,1040) entrance to Armorer in Oxfenfurt 
xy(1165,-1018) Place of Power at sacred acron tree 
xy(-260,-110) Keira's Metz House 
xy(600,1700) Hattori, Master Blacksmith 
xy(718,1740) Dandelion's Inn ( box / stash ) 
xy(648,1972) Dijkstra's baths 
xy(588,2257) Place of Power Temple Island 
xy(540,1850) The Golden Sturgen Inn's door next to harbor where the big ships are 

Skeliga 
xy(-310,-765) Place of Power between Fornhala and Holmsteins Port 
xy(-1805,1455) Place of Power NW of Svorlag 
xy(-47,628) door to Inn at Kaer Trodle Harbor ( box /stash ) 
xy(1000,0) druids camp 
xy(270,1460) Ivar on the island 
}

{Quest ID Facts

addfact()
removefact() 

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_citizens_01.w2scene:
  lw_ww_geralt_of_rivia_wine

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_citizens_02.w2scene:
  mq7015_done
  mq7015_failed

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_herold_01.w2scene:
  mq7007_done
  mq7009_painting_bought
  mq7009_painting_ready
  q701_done
  q703_done
  q704_done
  q705_comm_ceremony_over
  q705_comm_syanna_in_cell
  q705_henrietta_dead
  sq701_tournament_ends

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_lower_poor_men_02.w2scene:
  mq7021_hugo_tavern_owner

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_lower_poor_men_03.w2scene:
  q702_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_palace_knights_01.w2scene:
  mq7002_grottore_dead

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_palace_nobles_01.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_poor_men_01.w2scene:
  mq7001_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_beauclair_poor_men_02.w2scene:
  mq7020_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_caroberta_woods_children_01.w2scene:
  mq7007_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_caroberta_woods_peasants_02.w2scene:
  lw_ww_belgard_to_consorcium
  lw_ww_uneasy_alliance

== dlc/bob/data/gameplay/community/dialogues/chats/chat_caroberta_woods_peasants_03.w2scene:
  cg700_tournament_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_dun_tynne_guards_01.w2scene:
  q703_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_sansretour_marsh_guards_01.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_vedette_valley_citizens_01.w2scene:
  q701_done

== dlc/bob/data/gameplay/community/dialogues/chats/chat_vineyards_peasants_02.w2scene:
  mq7018_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_banker_woman_02.w2scene:
  mq7011_bank_banned

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_01.w2scene:
  q703_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_02.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_04.w2scene:
  q703_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_05.w2scene:
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_06.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_07.w2scene:
  q704_done
  q705_henrietta_alive
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_08.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_12.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_13.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_21.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_22.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_01.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_02.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_04.w2scene:
  q703_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_05.w2scene:
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_06.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_07.w2scene:
  q704_done
  q705_henrietta_alive
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_08.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_bastard_visor_12.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_01.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_02.w2scene:
  q704_dettlaff_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_03.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_04.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_05.w2scene:
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_beggar_13.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_man_01.w2scene:
  q701_done
  q704_long_night_starts
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_man_02.w2scene:
  q701_done
  q704_long_night_starts
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_man_03.w2scene:
  mq7009_done
  q704_long_night_starts
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_woman_01.w2scene:
  mq7001_done
  mq7010_completed
  mq7024_started
  q704_long_night_starts
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_woman_02.w2scene:
  mh701_complete
  q703_done
  q704_long_night_starts
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_citizen_woman_03.w2scene:
  mq7001_done
  mq7024_started
  mq707_done
  q704_done
  q704_long_night_starts

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_clerk_01.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_clerk_02.w2scene:
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_clerk_03.w2scene:
  q704_dettlaff_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_01.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_02.w2scene:
  q703_in_mandragora
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_03.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_04.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_05.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_06.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_07.w2scene:
  q703_in_mandragora
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_08.w2scene:
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_09.w2scene:
  q704_dettlaff_dead
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_13.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_14.w2scene:
  q703_in_mandragora
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_man_16.w2scene:
  q703_in_mandragora
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_woman_01.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_woman_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_woman_03.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_drunk_woman_12.w2scene:
  q703_in_mandragora
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_palace_servant_man_01.w2scene:
  q701_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_palace_servant_man_02.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_palace_servant_man_03.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_palace_servant_man_13.w2scene:
  q702_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_01.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_03.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_04.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_05.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_man_01.w2scene:
  q701_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_man_02.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_man_03.w2scene:
  mq7024_started

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_man_04.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_prostitute_man_05.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_strong_01.w2scene:
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_strong_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_strong_03.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_strong_04.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_weak_01.w2scene:
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_weak_03.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_weak_04.w2scene:
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_beauclair_thug_weak_13.w2scene:
  q704_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nilfgaardian_sailor_01.w2scene:
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nilfgaardian_sailor_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nilfgaardian_sailor_03.w2scene:
  q705_henrietta_dead
  sq701_geralt_armor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nilfgaardian_sailor_12.w2scene:
  q703_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_man_01.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_man_02.w2scene:
  q703_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_man_03.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_woman_01.w2scene:
  q701_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_woman_02.w2scene:
  q705_henrietta_dead
  sq701_geralt_armor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_nlifgaardian_emissary_woman_03.w2scene:
  "sq701_geralt_armor
  sq701_done
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_armourer_01.w2scene:
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_armourer_02.w2scene:
  poi_bar_a_01_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_armourer_03.w2scene:
  poi_gor_d_05_done
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_01.w2scene:
  poi_bar_a_01_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_02.w2scene:
  poe_ved_a_post_active

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_03.w2scene:
  poi_bar_a_01_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_04.w2scene:
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_05.w2scene:
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_06.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_07.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_08.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_strong_09.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_01.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_02.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_03.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_07.w2scene:
  poi_bar_a_01_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_08.w2scene:
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bandit_weak_09.w2scene:
  poe_ved_a_post_active

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_barber_01.w2scene:
  mq7020_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_barber_03.w2scene:
  mq7020_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_01.w2scene:
  mq7009_done
  mq7015_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_02.w2scene:
  mq7007_done
  mq7020_done
  q704_syanna_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_03.w2scene:
  ff701_done
  q705_henrietta_alive
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_04.w2scene:
  q704_done
  q704_syanna_dead
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_05.w2scene:
  mq7010_completed
  poi_bar_a_01_done
  q703_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_06.w2scene:
  mq7007_done
  mq7018_basilisk_alive
  q705_henrietta_alive
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_man_12.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_01.w2scene:
  ff701_done
  mq7020_done
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_02.w2scene:
  mq7018_basilisk_alive
  mq7024_started
  q704_syanna_dead
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_03.w2scene:
  cg700_geralt_won_tournament
  lw_ww_got_wine
  mq7001_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_04.w2scene:
  mq7018_basilisk_alive
  mq7020_done
  q705_henrietta_alive
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_05.w2scene:
  mq7015_done
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bard_woman_06.w2scene:
  mq7015_done
  mq7018_basilisk_alive
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_blacksmith_01.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_blacksmith_02.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_blacksmith_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_blacksmith_13.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_man_01.w2scene:
  lw_ww_got_wine
  mh701_complete
  q704_dettlaff_dead
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_man_02.w2scene:
  mh701_complete
  mq7021_hugo_tavern_owner
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_man_03.w2scene:
  mq7015_done
  mq7021_hugo_tavern_owner
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_man_04.w2scene:
  mq7018_basilisk_alive
  mq7024_started
  q701_vset_gardens_block
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_man_12.w2scene:
  q701_vset_gardens_block

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_01.w2scene:
  mh701_complete
  mq7020_done
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_02.w2scene:
  q703_done
  q705_henrietta_alive
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_03.w2scene:
  cg700_geralt_won_tournament
  lw_ww_got_wine
  mh701_complete

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_04.w2scene:
  mq7015_done
  poi_bar_a_01_done
  q703_in_mandragora
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_11.w2scene:
  q701_vset_gardens_block
  q703_in_mandragora

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_12.w2scene:
  q701_vset_gardens_block

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_13.w2scene:
  q701_vset_gardens_block

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_bonvivant_woman_14.w2scene:
  q701_vset_gardens_block

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_boy_01.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_dockworker_01.w2scene:
  ff701_done
  mq7010_completed
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_dockworker_02.w2scene:
  ff701_done
  mq7021_hugo_tavern_owner
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_dockworker_03.w2scene:
  poi_bar_a_01_done
  q703_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_girl_03.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_herbalist_woman_01.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_herbalist_woman_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_herbalist_woman_03.w2scene:
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_man_01.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_man_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_man_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_woman_01.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_woman_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_innkeeper_woman_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_01.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q705_henrietta_dead
  sq701_toussaint_knight_01_visor
  vset_toussaint_knight_01_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_02.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  vset_toussaint_knight_02_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_03.w2scene:
  poe_ved_a_post_active
  poi_gor_d_05_done
  vset_toussaint_knight_03_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_04.w2scene:
  poi_bar_a_01_done
  poi_gor_d_05_done
  q701_done
  q705_henrietta_dead
  vset_toussaint_knight_04_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_05.w2scene:
  poe_ved_a_post_active
  q705_henrietta_dead
  sq701_won
  vset_toussaint_knight_05_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_06.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q704_done
  q705_henrietta_dead
  sq701_won
  vset_toussaint_knight_06_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_07.w2scene:
  q705_henrietta_dead
  sq701_geralt_armor
  sq701_won
  vset_toussaint_knight_07_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_08.w2scene:
  q704_done
  q705_henrietta_alive
  q705_henrietta_dead
  vset_toussaint_knight_08_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_09.w2scene:
  q704_done
  q705_henrietta_dead
  vset_toussaint_knight_09_visor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_11.w2scene:
  q705_henrietta_dead
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_12.w2scene:
  q704_dettlaff_dead
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_13.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_14.w2scene:
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_15.w2scene:
  q701_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_16.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_17.w2scene:
  poi_bar_a_01_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_18.w2scene:
  q703_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_19.w2scene:
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_knight_20.w2scene:
  q705_henrietta_alive
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_01.w2scene:
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_02.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_03.w2scene:
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_woman_01.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_woman_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_woman_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_medic_woman_12.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_man_01.w2scene:
  mq7024_started
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_man_02.w2scene:
  q703_in_mandragora
  q704_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_man_03.w2scene:
  lw_ww_got_wine
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_man_12.w2scene:
  q703_in_mandragora

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_woman_01.w2scene:
  q705_henrietta_dead
  sq701_geralt_armor

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_woman_02.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q705_henrietta_alive
  q705_henrietta_dead
  sq701_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_woman_03.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_woman_11.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_noble_woman_12.w2scene:
  q703_in_mandragora

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_man_01.w2scene:
  poi_gorgona_a_10_done
  q704_done
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_man_02.w2scene:
  mq7015_done
  q703_done
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_man_03.w2scene:
  poi_bar_a_01_done
  q703_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_man_12.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_woman_01.w2scene:
  mh701_complete
  q704_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_woman_02.w2scene:
  mq7009_done
  mq7010_completed
  q705_henrietta_alive
  q705_henrietta_dead
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_old_woman_03.w2scene:
  mh701_complete
  mq7007_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_01.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  q701_done
  q703_done
  q705_henrietta_alive
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_02.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  poi_gor_d_05_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_03.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  mq7024_started
  q704_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_04.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  mh701_complete
  poi_bar_a_05_done
  q703_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_05.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  q703_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_11.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_12.w2scene:
  lw_ww_wine_wars_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_13.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_14.w2scene:
  lw_ww_wine_wars_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_man_15.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_01.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  mq7024_started
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_02.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  poe_gor_c_post_active
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_03.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  mq7001_done
  q703_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_04.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  poi_gorgona_a_10_done
  q703_done
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_05.w2scene:
  lw_ww_got_wine
  lw_ww_wine_wars_done
  mq7010_completed
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_11.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_12.w2scene:
  lw_ww_wine_wars_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_13.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_14.w2scene:
  lw_ww_wine_wars_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_peasant_woman_15.w2scene:
  lw_ww_got_wine

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_man_01.w2scene:
  q703_done
  q704_done
  q704_syanna_dead
  q705_henrietta_dead
  sq701_tailles_active

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_man_02.w2scene:
  mq7015_done
  mq7021_hugo_tavern_owner
  mq7024_started
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_man_03.w2scene:
  q703_done
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_man_12.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_woman_01.w2scene:
  mq7024_started
  q705_henrietta_alive

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_woman_02.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_poor_woman_03.w2scene:
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_sailor_01.w2scene:
  q703_done
  q704_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_sailor_02.w2scene:
  q703_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_sailor_03.w2scene:
  q704_done
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_sailor_04.w2scene:
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_01.w2scene:
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_02.w2scene:
  q701_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_03.w2scene:
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_04.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done
  sq701_geralt_armor
  sq701_won

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_05.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_squire_12.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_trader_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_trader_12.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_vineyard_supervisor_01.w2scene:
  supervisor_01_playing_custom_line

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_vineyard_supervisor_02.w2scene:
  supervisor_02_playing_custom_line

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_wine_merchant_01.w2scene:
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_gor_d_05_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_wine_merchant_02.w2scene:
  q704_syanna_dead
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_wine_merchant_03.w2scene:
  q705_henrietta_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_wine_merchant_04.w2scene:
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_worker_01.w2scene:
  q703_done
  q704_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_worker_02.w2scene:
  q703_done
  q704_syanna_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_worker_03.w2scene:
  q703_done
  q704_dettlaff_dead

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_worker_04.w2scene:
  cg700_geralt_won_tournament
  q703_done

== dlc/bob/data/gameplay/community/dialogues/voicesets/vset_toussaint_worker_05.w2scene:
  q704_done
  sq701_won

== dlc/bob/data/gameplay/community/shops_and_craftsmen/bob_shops_and_craftsmen.w2phase:
  cg700_deck_counter
  cg700_got_first_card
  cg700_shop_tailor_played
  mq7008_innkeeper_stfu
  mq7008_innkeeper_talk
  mq7011_bank_banned
  mq7011_break_time
  mq7011_done
  mq7011_fistfight
  mq7011_geralt_teleported_out
  mq7011_taken
  mq7011_wine_owner_met
  q704_done
  q704_long_night_starts

== dlc/bob/data/living_world/merchants/shop_01_gallion_blacksmith.w2scene:
  shop_01_gallion_blacksmith_met
  th701_archmaster_found
  th701_find_archmaster

== dlc/bob/data/living_world/merchants/shop_02_crossing_innkeeper.w2scene:
  shop_02_crossing_innkeeper_met

== dlc/bob/data/living_world/merchants/shop_04_vedette_estate_wine_merchant.w2scene:
  shop_04_vedette_estate_wine_merchant_met
  th701_cat_started

== dlc/bob/data/living_world/merchants/shop_05_vermentino_armourer.w2scene:
  lw_ww_consorcium_created
  lw_ww_vermentino_cleared
  shop_05_armourer_about_consortium

== dlc/bob/data/living_world/merchants/shop_09_ravello_herbalist.w2scene:
  shop_09_ravello_herbalist_met

== dlc/bob/data/living_world/merchants/shop_10_longhollow_alchemist.w2scene:
  poi_vin_a_01_cleared
  poi_vin_a_01_merchant_met

== dlc/bob/data/living_world/merchants/shop_11_riverbank_cave_merchant.w2scene:
  poi_vin_b_03_cleared
  poi_vin_b_03_merchant_met

== dlc/bob/data/living_world/merchants/shop_12_tournament_meadows_armourer.w2scene:
  sq701_geralt_armor
  sq701_won_tournament

== dlc/bob/data/living_world/merchants/shop_13_tournament_meadows_blacksmith.w2scene:
  sq701_geralt_armor
  sq701_won_tournament

== dlc/bob/data/living_world/merchants/shop_14_tournament_meadows_barber.w2scene:
  dlc2_installed
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark
  sq701_geralt_armor
  sq701_won_tournament

== dlc/bob/data/living_world/merchants/shop_15_dun_tynne_hill_alchemist.w2scene:
  poi_dun_b_03_aftermath
  poi_dun_b_03_cleared
  poi_dun_b_03_merchant_met

== dlc/bob/data/living_world/merchants/shop_17_belgard_wine_blacksmith.w2scene:
  lw_ww_belgard_cleared
  shop_17_about_belgard_cleared

== dlc/bob/data/living_world/merchants/shop_18_cocatrice_inn_innkeeper.w2scene:
  q704_done
  shop_18_cocatrice_inn_innkeeper_met

== dlc/bob/data/living_world/merchants/shop_19_rafstmen_village_innkeeper.w2scene:
  mh701_fact_quartermaster_met
  shop_19_rafstmen_village_innkeeper_met

== dlc/bob/data/living_world/merchants/shop_21_quarry_harbour_armourer.w2scene:
  shop_21_quarry_harbour_armourer_met

== dlc/bob/data/living_world/merchants/shop_22_port_butcher.w2scene:
  sausage_lover

== dlc/bob/data/living_world/merchants/shop_24_quarry_blacksmith.w2scene:
  shop_24_quarry_blacksmith_met

== dlc/bob/data/living_world/merchants/shop_25_tournament_meadows_innkeper.w2scene:
  sq701_geralt_armor
  sq701_won_tournament

== dlc/bob/data/living_world/merchants/shop_26_mont_crane_armourer.w2scene:
  shop_26_mont_crane_armourer_met

== dlc/bob/data/living_world/merchants/shop_28_lake_village_barber.w2scene:
  dlc2_installed
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark
  shop_28_lake_village_barber_met

== dlc/bob/data/living_world/merchants/shop_29_murky_cave_merchant.w2scene:
  poi_car_a_04_cleared
  poi_car_a_04_merchant_met

== dlc/bob/data/living_world/merchants/shop_30_ronneville_herbalist.w2scene:
  shop_30_ronneville_herbalist_met

== dlc/bob/data/living_world/merchants/shop_31_trappers_village_innkeeper.w2scene:
  shop_31_trappers_village_innkeeper_met
  sq202_yen_girlfriend

== dlc/bob/data/living_world/merchants/shop_36_coronata_wine_herbalist.w2scene:
  lw_ww_consorcium_created
  lw_ww_coronata_cleared
  lw_ww_first_dialogue_played
  shop_36_coronata_herbalist_about_consortium

== dlc/bob/data/living_world/merchants/shop_37_city_west_innkeeper.w2scene:
  poi_car_a_11_spoon_note_read
  shop_37_city_west_innkeeper

== dlc/bob/data/living_world/merchants/shop_38_city_west_armourer.w2scene:
  th701_archmaster_found
  th701_find_archmaster

== dlc/bob/data/living_world/merchants/shop_39_city_west_blacksmith.w2scene:
  mq7001_blacksmith_met
  th701_archmaster_found
  th701_find_archmaster

== dlc/bob/data/living_world/merchants/shop_41_city_west_alchemist.w2scene:
  shop_41_city_west_alchemist_met

== dlc/bob/data/living_world/merchants/shop_43_city_east_wine_merchant.w2scene:
  shop_43_city_east_wine_merchant_met

== dlc/bob/data/living_world/merchants/shop_44_city_south_barber.w2scene:
  dlc2_installed
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark
  shop_44_city_south_barber_met

== dlc/bob/data/living_world/merchants/shop_45_city_east_merchant.w2scene:
  shop_45_city_east_merchant_met

== dlc/bob/data/living_world/merchants/shop_46_city_south_herbalist.w2scene:
  shop_46_city_south_herbalist_met

== dlc/bob/data/living_world/merchants/shop_47_brothel_mom.w2scene:
  shop_47_brothel_mom_met
  shop_47_brothel_mom_paid

== dlc/bob/data/living_world/merchants/shop_47_city_prostitute.w2scene:
  bob_prostitute_01_had_sex
  bob_prostitute_01_met
  bob_prostitute_02_had_sex
  bob_prostitute_02_met
  bob_prostitute_03_had_sex
  bob_prostitute_03_met

== dlc/bob/data/living_world/merchants/shop_47_sex_girl_1.w2scene:
  release_jp

== dlc/bob/data/living_world/merchants/shop_47_sex_girl_2.w2scene:
  release_jp

== dlc/bob/data/living_world/merchants/shop_47_sex_girl_3.w2scene:
  release_jp

== dlc/bob/data/living_world/merchants/shop_48_devils_cave_merchant.w2scene:
  poi_gor_b_02_cleared
  poi_gor_b_02_merch_info
  poi_gor_b_02_merchant_met
  shop_48_no_blackscreen

== dlc/bob/data/living_world/merchants/shop_49_roquestang_armourer.w2scene:
  shop_49_roquestang_armourer_met

== dlc/bob/data/living_world/merchants/shop_53_foxhollow_innkeeper.w2scene:
  shop_53_foxhollow_innkeeper_met
  shop_53_moreinfo

== dlc/bob/data/living_world/merchants/shop_beauclair_bank_clerks.w2scene:
  mq7011_asked_about_a38
  mq7011_bank_banned
  mq7011_clerk_a_heard
  mq7011_clerk_b_heard
  mq7011_clerks_done
  mq7011_taken
  mq7011_wine_owner_met

== dlc/bob/data/living_world/merchants/shop_beauclair_dyetrader.w2scene:
  dyetrader_met

== dlc/bob/data/living_world/merchants/shop_beauclair_moneylender.w2scene:
  beauclair_moneylender_met

== dlc/bob/data/living_world/merchants/shop_cammerlengo.w2scene:
  camm_quest_total
  cammerlengo_reward
  q705_henrietta_dead
  shop_cammerlengo_met
  shop_cammerlengo_quest_start

== dlc/bob/data/living_world/merchants/shop_tailor.w2scene:
  tailor_pierre_meet

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_01/poi_bar_a_01_phase.w2phase:
  cammerlengo_reward
  poe_bar_a_post_active
  poi_bar_a_01_boss_killed
  poi_bar_a_01_done
  poi_bar_a_01_kraken
  poi_bar_a_01_scale_up
  poi_bar_a_01_start
  shop_26_mont_crane_armourer_met
  th701_fdb_prison_complete

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_02/poi_bar_a_02.w2phase:
  cammerlengo_reward
  poe_bar_a_post_active
  poi_bar_a_02_done
  poi_bar_a_02_opened
  poi_bar_a_02_rescued

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_03/poi_bar_a_03_phase.w2phase:
  cammerlengo_reward
  poi_bar_a_03_done
  poi_bar_a_03_killed
  poi_bar_a_03_repaired
  poi_bar_a_03_show
  poi_bar_a_03_start

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_05/poi_bar_a_05_phase.w2phase:
  poi_bar_a_05_killed
  poi_bar_a_05_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_08/poi_bar_a_08_phase.w2phase:
  poe_bar_a_post_active
  poi_bar_a_08_discovered
  poi_bar_a_08_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_09/poi_bar_a_09_phase.w2phase:
  poe_bar_a_post_active
  poi_bar_a_09_discovered
  poi_bar_a_09_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_10/poi_bar_a_10_phase.w2phase:
  poe_bar_a_post_active
  poi_bar_a_10_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_12/poi_bar_a_12_phase.w2phase:
  actor_poi_bar_a_12_bandit_was_killed
  actor_poi_bar_a_12_knight_was_killed
  cammerlengo_reward
  poi_bar_a_12_dead
  poi_bar_a_12_done
  poi_bar_a_12_entered
  poi_bar_a_12_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_a_13/poi_bar_a_13_phase.w2phase:
  mq7010_finished
  mq7010_nest_burnt
  poi_bar_a_01_done
  poi_bar_a_13_opened

== dlc/bob/data/living_world/quests/barrens/poi_bar_b_04/poi_bar_b_04.w2phase:
  cammerlengo_reward
  mq7017_fact_race_abort_complete
  mq7017_fact_race_against_zmora
  poe_bar_b_post_active
  poi_bar_b_04_done
  poi_bar_b_04_killed
  poi_bar_b_04_show
  poi_bar_b_04_start
  shop_28_lake_village_barber_met

== dlc/bob/data/living_world/quests/beauclair/adder_and_jewels/adder_and_jewels_priscilla_song.w2phase:
  MeditationStarted

== dlc/bob/data/living_world/quests/bob_lw_tutorials.w2phase:
  cammerlengo_reward
  poi_pleg_start
  tut_near_noticeboard

== dlc/bob/data/living_world/quests/cammerlengo.w2phase:
  camm_final_reward_given
  camm_q704_visit
  camm_q704_visit_first
  camm_q704_visit_notice
  camm_quest_counter
  camm_quest_total
  camm_synchronizer
  cammerlengo_money
  cammerlengo_reward
  cammerlengo_taken
  poi_bar_a_01_done
  poi_bar_a_02_done
  poi_bar_a_03_done
  poi_bar_a_12_done
  poi_bar_a_12_entered
  poi_bar_b_04_done
  poi_car_b_03_done
  poi_gor_a_09_done
  poi_gor_a_09_entered
  poi_gor_b_12_done
  poi_gor_c_03_done
  poi_gor_d_05_done
  poi_gor_d_06_done
  poi_gor_d_07_done
  poi_gor_d_07_entered
  poi_ved_a_01_done
  poi_ved_a_02_done
  poi_ved_a_05_done
  q704_done
  q704_long_night_starts
  shop_cammerlengo_quest_start

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_a_01/poi_car_a_01.w2phase:
  car_a_01_generator_examinated
  car_a_01_generator_fixed
  car_a_01_lever_switched
  car_a_01_looted

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_a_04/poi_car_a_04.w2phase:
  poi_car_a_04_accepted
  poi_car_a_04_cleared
  poi_car_a_04_done
  poi_car_a_04_workers_enter_cave

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_a_05/poi_car_a_05.w2phase:
  cammerlengo_reward
  poi_car_a_05_done

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_a_11/poi_car_a_11.w2phase:
  car_a_11_asked_about_spoon
  poi_car_a_11_door_open
  poi_car_a_11_looted
  poi_car_a_11_spoon_note_read

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_b_03/poi_car_b_03_phase.w2phase:
  cammerlengo_reward
  poe_car_b_post_active
  poi_car_b_03_done
  poi_car_b_03_killed
  poi_car_b_03_show
  poi_car_b_03_start
  shop_30_ronneville_herbalist_met

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_b_08/poi_car_b_08_phase.w2phase:
  poi_car_b_08_opened

== dlc/bob/data/living_world/quests/caroberta_woods/poi_car_b_10/poi_car_b_10.w2phase:
  poi_car_b_10_looted
  poi_car_b_10_looted_bruce
  poi_car_b_10_looted_robin

== dlc/bob/data/living_world/quests/dun_tynne/poi_dun_a_01/poi_dun_a_01.w2phase:
  poi_dun_a_01_nest_destroyed
  supervisor_01_playing_custom_line

== dlc/bob/data/living_world/quests/dun_tynne/poi_dun_a_02/poi_dun_a_02.w2phase:
  poi_dun_a_02_nest_destroyed
  supervisor_02_playing_custom_line

== dlc/bob/data/living_world/quests/dun_tynne/poi_dun_a_04/poi_dun_a_04.w2phase:
  poe_dun_a_post_active
  poi_dun_a_04_looted
  poi_dun_a_04_most_killed
  poi_dun_a_04_nest_destroyed

== dlc/bob/data/living_world/quests/dun_tynne/poi_dun_b_03/poi_dun_b_03.w2phase:
  actor_poi_dun_b_03_scolo_was_killed
  poi_dun_b_03_aftermath
  poi_dun_b_03_cleared
  poi_dun_b_03_corpse_looted
  poi_dun_b_03_scene_active

== dlc/bob/data/living_world/quests/dun_tynne/poi_dun_b_08/poi_dun_b_08.w2phase:
  actor_poi_dun_b_08_bruxa_was_killed_by_GERALT
  poi_dun_b_08_looted

== dlc/bob/data/living_world/quests/ep2_pois.w2phase:
  bob_barber_scene_off
  bob_barber_scene_on
  lw_bob_barber_output
  q701_done
  q704_done
  q704_long_night_starts

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_a_01/poi_gor_a_01_phase.w2phase:
  poe_gor_a_post_active
  poi_gor_a_01_done
  poi_gor_a_01_looted

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_a_09/poi_gor_a_09_phase.w2phase:
  actor_poi_gor_a_09_knight_was_killed
  actor_poi_gor_a_09_monster_was_killed
  cammerlengo_reward
  poi_gor_a_09_dead
  poi_gor_a_09_done
  poi_gor_a_09_entered
  poi_gor_a_09_opened

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_a_10/poi_gor_a_10_phase.w2phase:
  mq7006_wisdom
  mq7006_wisdom_added_gor_a_10
  poi_gor_a_10_boss_killed
  poi_gor_a_10_boss_spawned
  poi_gor_a_10_candle_ignited
  poi_gor_a_10_opened
  poi_gor_a_10_puzzle_done
  poi_gor_a_10_wisdom_fail

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_b_02/poi_gor_b_02_phase.w2phase:
  poe_gor_b_post_active
  poi_gor_b_02_cleared
  poi_gor_b_02_merch_info
  poi_gor_b_02_merchant_met

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_b_04/poi_gor_b_04.w2phase:
  actor_poi_gor_b_04_monster_was_killed_by_GERALT
  poe_gor_b_post_active
  poi_gor_b_04_looted

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_b_12/poi_gor_b_12.w2phase:
  cammerlengo_reward
  poe_gor_b_post_active
  poi_gor_b_12_done
  poi_gor_b_12_killed
  poi_gor_b_12_show
  poi_gor_b_12_start

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_b_13/poi_gor_b_13_phase.w2phase:
  poe_gor_b_post_active
  poi_gor_b_13_destroyed

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_c_03/poi_gor_c_03.w2phase:
  cammerlengo_reward
  poe_gor_c_post_active
  poi_gor_c_03_crying
  poi_gor_c_03_done
  poi_gor_c_03_killed
  poi_gor_c_03_show
  poi_gor_c_03_start

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_c_14/poi_gor_c_14.w2phase:
  poi_gor_c_14_looted

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_05/poi_gor_d_05_phase.w2phase:
  cammerlengo_reward
  poe_gor_d_post_active
  poi_gor_d_05_boss_killed
  poi_gor_d_05_done
  poi_gor_d_05_kraken

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_06/poi_gor_d_06_phase.w2phase:
  cammerlengo_reward
  foxhollow_workers_despawn
  poe_gor_d_post_active
  poi_gor_d_06_done
  poi_gor_d_06_hide_grave
  poi_gor_d_06_killed
  poi_gor_d_06_show
  poi_gor_d_06_start
  shop_53_moreinfo

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_07/poi_gor_d_07_phase.w2phase:
  actor_poi_gor_d_07_knight_was_killed
  actor_poi_gor_d_07_monster_was_killed
  cammerlengo_reward
  poi_gor_d_07_dead
  poi_gor_d_07_done
  poi_gor_d_07_entered
  poi_gor_d_07_opened

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_17/poi_gor_d_17_phase.w2phase:
  poi_gor_d_05_done
  poi_gor_d_17_discovered
  poi_gor_d_17_opened

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_18/poi_gor_d_18_phase.w2phase:
  poi_gor_d_05_done
  poi_gor_d_18_discovered
  poi_gor_d_18_opened

== dlc/bob/data/living_world/quests/gorgona_foothills/poi_gor_d_20/poi_gor_d_20_phase.w2phase:
  poi_gor_d_20_opened

== dlc/bob/data/living_world/quests/lw_noticeboards.w2phase:
  lw_ww_consorcium_created
  poe_ved_a_post_active
  poi_bar_a_01_done
  poi_car_b_03_done
  poi_gor_d_05_done
  q704_done
  q705_completed

== dlc/bob/data/living_world/quests/lw_wine_wars/belgard_pois/poi_bel_ww5.w2phase:
  lw_poi_ww_bel_5_cry
  lw_ww5_bel_monsters_dead
  poi_ww_bel_05_show
  poi_ww_bel_05_start

== dlc/bob/data/living_world/quests/lw_wine_wars/belgard_pois/poi_bel_ww6.w2phase:
  lw_ww6_bel_monsters_dead
  poi_ww6_bel_cont_open

== dlc/bob/data/living_world/quests/lw_wine_wars/belgard_pois/poi_bel_ww7.w2phase:
  lw_ww7_bel_bandits_dead

== dlc/bob/data/living_world/quests/lw_wine_wars/belgard_pois/poi_bel_ww8.w2phase:
  poi_ww_bel_08_nest_destro

== dlc/bob/data/living_world/quests/lw_wine_wars/belgard_pois/poi_bel_ww9.w2phase:
  poi_san_ww9_nest_destroyed

== dlc/bob/data/living_world/quests/lw_wine_wars/coronata_pois/poi_cor_ww1.w2phase:
  poi_cor_ww1_done
  poi_cor_ww1_monsters_killed
  poi_cor_ww1_nest_is_down

== dlc/bob/data/living_world/quests/lw_wine_wars/coronata_pois/poi_cor_ww2.w2phase:
  lw_poi_ww_cor_2_cry
  poi_cor_ww2_monsters_killed
  poi_ww_cor_02_show
  poi_ww_cor_02_start

== dlc/bob/data/living_world/quests/lw_wine_wars/coronata_pois/poi_cor_ww3.w2phase:
  cor_ww3_bandits_dead
  poi_cor_ww3_done

== dlc/bob/data/living_world/quests/lw_wine_wars/coronata_pois/poi_cor_ww4_aftermath.w2phase:
  lw_ww_first_dialogue_played
  poi_ww4_cont_open

== dlc/bob/data/living_world/quests/lw_wine_wars/lw_wine_wars.w2phase:
  coronata_community_consortium
  coronata_community_rich
  lw_poi_ww_bel_5_done
  lw_poi_ww_bel_6_done
  lw_poi_ww_bel_7_done
  lw_poi_ww_bel_8_done
  lw_poi_ww_bel_9_done
  lw_poi_ww_cor_1_done
  lw_poi_ww_cor_2_done
  lw_poi_ww_cor_3_done
  lw_poi_ww_cor_4_done
  lw_poi_ww_cor_5_done
  lw_poi_ww_ver_10_done
  lw_poi_ww_ver_11_done
  lw_poi_ww_ver_12_done
  lw_poi_ww_ver_13_done
  lw_poi_ww_ver_9_done
  lw_ww_aftermath_ready
  lw_ww_archespores_cellar_open
  lw_ww_belgard_cleared
  lw_ww_belgard_com_drunks_despawn
  lw_ww_belgard_community_back
  lw_ww_belgard_counter
  lw_ww_belgard_increment
  lw_ww_belgard_poi_done
  lw_ww_belgard_secret_discovered
  lw_ww_belgard_skip_choices
  lw_ww_belgard_to_both
  lw_ww_belgard_to_consorcium
  lw_ww_belgard_to_coronata
  lw_ww_belgard_to_vermentino
  lw_ww_bulbs_destroyed
  lw_ww_bulbs_grown
  lw_ww_bulbs_not_destroyed
  lw_ww_clues_burnt
  lw_ww_consorcium_created
  lw_ww_consorcium_payed_early
  lw_ww_consortium_coronata_counter
  lw_ww_consortium_vermentino_counter
  lw_ww_coronata_cleared
  lw_ww_coronata_clue_found
  lw_ww_coronata_counter
  lw_ww_coronata_increment
  lw_ww_coronata_increment_active
  lw_ww_coronata_note_found
  lw_ww_coronata_poi_done
  lw_ww_fact_opening_dlg_playing
  lw_ww_first_dialogue_played
  lw_ww_first_poi_oneliner_playing
  lw_ww_got_wine
  lw_ww_one_clue_found
  lw_ww_secret_plot_conclusion_started
  lw_ww_shortcut_to_belgard
  lw_ww_starting_location_free_for_community
  lw_ww_sudden_end
  lw_ww_two_notes_found
  lw_ww_uneasy_alliance
  lw_ww_vermentino_cleared
  lw_ww_vermentino_clue_found
  lw_ww_vermentino_community_switch
  lw_ww_vermentino_counter
  lw_ww_vermentino_increment
  lw_ww_vermentino_increment_active
  lw_ww_vermentino_note_found
  lw_ww_vermentino_poi_done
  lw_ww_wine_wars_done
  stub
  vermentino_community_consortium
  vermentino_community_rich
  ww_belgaard_reached
  ww_cor_later
  ww_ver_later
  ww_wine_wars_notice_found

== dlc/bob/data/living_world/quests/lw_wine_wars/phases/lw_ww_noticeboard_quest_cleanup.w2phase:
  ww_wine_wars_notice_found

== dlc/bob/data/living_world/quests/lw_wine_wars/poi_stage_1/poi_ww_aftermaths.w2phase:
  lw_poi_ww_bel_5_cry
  lw_poi_ww_bel_5_done
  lw_poi_ww_bel_7_done
  lw_poi_ww_cor_2_cry
  lw_poi_ww_cor_2_done
  lw_poi_ww_ver_10_cry
  lw_poi_ww_ver_10_done
  lw_poi_ww_ver_12_cry
  lw_poi_ww_ver_12_done
  merchant_poi_san_ww7_active
  merchant_poi_ver_ww11_active
  merchant_poi_ver_ww3_active
  poi_cor_ww11_done
  poi_cor_ww1_done
  poi_cor_ww3_done
  poi_san_ww9_cleared
  poi_san_ww9_nest_destroyed

== dlc/bob/data/living_world/quests/lw_wine_wars/scenes/lw_ww_01_opening.w2scene:
  lw_ww_belgard_poi_done
  lw_ww_belgard_secret_discovered
  lw_ww_consorcium_created
  lw_ww_coronata_poi_done
  lw_ww_uneasy_alliance
  lw_ww_vermentino_poi_done

== dlc/bob/data/living_world/quests/lw_wine_wars/scenes/lw_ww_02_owners_default.w2scene:
  lw_ww_belgard_secret_discovered
  lw_ww_consorcium_created
  lw_ww_coronata_cleared
  lw_ww_coronata_note_found
  lw_ww_coronata_suspected
  lw_ww_vermentino_cleared
  lw_ww_vermentino_note_found
  lw_ww_vermentino_suspected

== dlc/bob/data/living_world/quests/lw_wine_wars/scenes/lw_ww_03_belgaard.w2scene:
  lw_ww_belgard_skip_choices
  lw_ww_uneasy_alliance

== dlc/bob/data/living_world/quests/lw_wine_wars/scenes/lw_ww_04_grande_finale.w2scene:
  lw_ww_butcher_of_blaviken_wine
  lw_ww_geralt_of_rivia_wine
  lw_ww_white_wolf_wine

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww10.w2phase:
  lw_poi_ww_ver_10_cry
  poi_ww_ver_10_show
  poi_ww_ver_10_start
  ww10_ver_monsters_dead

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww11.w2phase:
  poi_cor_ww11_done
  ver_ww11_bandits_dead

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww12.w2phase:
  lw_poi_ww_ver_12_cry
  lw_poi_ww_ver_12_done
  lw_ww12_ver_monsters_dead
  poi_ww_ver_12_show
  poi_ww_ver_12_start

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww13.w2phase:
  poi_ww_ver_13_started

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww13_hidden_treasure.w2phase:
  lw_ww_first_dialogue_played
  poi_ww_13_cont_open
  poi_ww_ver_13_started

== dlc/bob/data/living_world/quests/lw_wine_wars/vermentino_pois/poi_ver_ww9.w2phase:
  lw_ww_got_note_and_key
  lw_ww_got_some_note

== dlc/bob/data/living_world/quests/minor_pois.w2phase:
  bugfix_phantom_fact_353462
  mq7006_valor
  mq7006_valor_added_hanza
  mq7018_basilisk_dead
  poe_bar_b_post_active
  poi_bar_a_01_done
  poi_bar_a_08_opened
  poi_bar_a_11_opened
  poi_bar_a_12_done
  poi_bar_b_05_done
  poi_bar_b_06_looted
  poi_bar_b_14_looted
  poi_car_a_05_looted
  poi_car_a_06_looted
  poi_car_a_07_looted
  poi_gor_a_08_looted
  poi_gor_a_09_done
  poi_gor_b_11_opened
  poi_gor_d_05_done
  poi_gor_d_07_done
  poi_gor_d_19_opened
  poi_san_b_04_looted
  poi_san_b_06_looted
  poi_ved_a_01_done
  poi_ved_a_04_done
  poi_ved_a_05_done
  poi_ved_a_06_looted
  poi_vin_b_04_looted
  poi_vin_b_06_looted
  shop_cammerlengo_quest_start

== dlc/bob/data/living_world/quests/plegmund.w2phase:
  mq7010_lw_lebioda_hint
  poi_pleg_02_moved
  poi_pleg_04_done_first
  poi_pleg_helped
  poi_pleg_start
  poi_pleg_statue
  poi_pleg_timelapse_message

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_01/poi_pleg_01_phase.w2phase:
  actor_poi_pleg_01_bandit_01_was_killed
  actor_poi_pleg_01_bandit_02_was_killed
  actor_poi_pleg_01_bandit_03_was_killed
  actor_poi_pleg_01_bandit_04_was_killed
  actor_poi_pleg_01_bandit_05_was_killed
  actor_poi_pleg_01_bandit_06_was_killed
  actor_poi_pleg_01_bandit_07_was_killed
  poi_pleg_01_bandit_01_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_02_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_03_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_04_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_05_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_06_weapon_hit_by_PLAYER
  poi_pleg_01_bandit_07_weapon_hit_by_PLAYER
  poi_pleg_01_moved
  poi_pleg_04_done_first
  poi_pleg_helped
  poi_pleg_statue
  poi_pleg_timelapse_message

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_02/poi_pleg_02_phase.w2phase:
  poi_pleg_02_moved
  poi_pleg_02_play_anim_01
  poi_pleg_02_play_anim_02
  poi_pleg_02_play_anim_03
  poi_pleg_02_play_anim_04
  poi_pleg_02_play_anim_05
  poi_pleg_04_done_first
  poi_pleg_helped
  poi_pleg_statue
  poi_pleg_timelapse_message
  sq701_race_active

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_03/poi_pleg_03_phase.w2phase:
  actor_poi_pleg_03_spriggan_was_killed
  actor_poi_pleg_03_wolf_was_killed
  poi_pleg_03_moved
  poi_pleg_04_done_first
  poi_pleg_helped
  poi_pleg_statue
  poi_pleg_timelapse_message

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_04/poi_pleg_04_phase.w2phase:
  actor_poi_pleg_04_kikimore_was_killed
  poi_pleg_01_moved
  poi_pleg_02_moved
  poi_pleg_03_moved
  poi_pleg_04_done_first
  poi_pleg_04_moved
  poi_pleg_05_moved
  poi_pleg_helped
  poi_pleg_statue
  poi_pleg_timelapse_message

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_05/poi_pleg_05_phase.w2phase:
  actor_poi_pleg_05_bandit_was_killed
  poi_pleg_04_done_first
  poi_pleg_05_moved
  poi_pleg_helped
  poi_pleg_statue
  poi_pleg_timelapse_message

== dlc/bob/data/living_world/quests/plegmund/poi_pleg_statue.w2phase:
  foreman_dd_stop
  foreman_oneliner_start
  foreman_oneliner_stop
  lw_lebioda_statue_done
  mq7010_lw_lebioda_hint
  mq7010_update_statue
  poi_pleg_helped
  poi_pleg_start
  poi_pleg_statue
  poi_pleg_statue_done

== dlc/bob/data/living_world/quests/prostitutes.w2phase:
  shop_47_brothel_mom_paid
  shop_47_sex_start

== dlc/bob/data/living_world/quests/sansretour_marsh/poi_san_a_01/poi_san_a_01.w2phase:
  poi_san_a_01_looted

== dlc/bob/data/living_world/quests/sansretour_marsh/poi_san_b_02/poi_san_b_02.w2phase:
  poi_san_b_02_looted

== dlc/bob/data/living_world/quests/sansretour_marsh/poi_san_b_05/poi_san_b_05.w2phase:
  q704_done
  q704_long_night_starts

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_01/poi_ved_a_01.w2phase:
  cammerlengo_reward
  poe_ved_a_post_active
  poi_ved_a_01_boss_killed
  poi_ved_a_01_done
  poi_ved_a_01_kraken
  poi_ved_a_01_signal1
  poi_ved_a_01_signal2
  poi_ved_a_01_signal3
  poi_ved_a_01_signal4
  poi_ved_a_01_signal5
  poi_ved_a_01_signal6
  shop_01_gallion_blacksmith_met

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_02/poi_ved_a_02.w2phase:
  cammerlengo_reward
  poi_ved_a_02_done
  poi_ved_a_02_killed
  poi_ved_a_02_show
  poi_ved_a_02_start
  shop_02_crossing_innkeeper_met

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_03/poi_ved_a_03.w2phase:
  poi_ved_a_03_looted

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_05/poi_ved_a_05.w2phase:
  cammerlengo_reward
  poi_ved_a_05_done
  poi_ved_a_05_gate_opened
  poi_ved_a_05_killed
  shop_04_vedette_estate_wine_merchant_met

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_07/poi_ved_a_07.w2phase:
  poe_ved_a_post_active
  poi_ved_a_07_discovered
  poi_ved_a_07_looted

== dlc/bob/data/living_world/quests/vedette_valley/poi_ved_a_08/poi_ved_a_08.w2phase:
  poe_ved_a_post_active
  poi_ved_a_08_discovered
  poi_ved_a_08_looted

== dlc/bob/data/living_world/quests/vineyards/lumberjack_camp/vineyards_lumberjack_camp.w2phase:
  lumberjack_hammer_time

== dlc/bob/data/living_world/quests/vineyards/poi_vin_a_01/lw_poi_vin_a_01.w2phase:
  poe_vin_a_post_active
  poi_vin_a_01_accepted
  poi_vin_a_01_after_talk
  poi_vin_a_01_cleared

== dlc/bob/data/living_world/quests/vineyards/poi_vin_a_02/poi_vin_a_02_phase.w2phase:
  poe_vin_a_post_active
  poi_vin_a_02_nest_destro
  supervisor_02_playing_custom_line

== dlc/bob/data/living_world/quests/vineyards/poi_vin_b_03/poi_vin_b_03.w2phase:
  actor_poi_vin_b_03_ghoul_was_killed
  poi_vin_b_03_cleared
  poi_vin_b_03_workers_enter_cave

== dlc/bob/data/living_world/quests/vineyards/poi_vin_b_05/poi_vin_b_05.w2phase:
  poi_vin_b_05_looted

== dlc/bob/data/quests/additional_game_elements.w2phase:
  q305_completed
  q401_started
  q701_hook_done
  q701_peasants_no_help
  q701_vlge_done
  sq701_vivienne_novigrad
  sq701_vivienne_skellige

== dlc/bob/data/quests/bob_bugfix_phase.w2phase:
  46867301_4_0
  AlchemyTableExists
  bugfix_139151
  bugfix_154512
  bugfix_154525
  bugfix_154711
  bugfix_154748
  bugfix_154851
  bugfix_154886
  bugfix_154908
  bugfix_154913
  bugfix_154950
  bugfix_154958
  bugfix_154968
  bugfix_154968_v2
  bugfix_154995
  bugfix_155001
  bugfix_155002
  bugfix_155002_v2
  bugfix_155007
  bugfix_155013
  bugfix_155037
  bugfix_155048
  bugfix_155049_v2
  bugfix_155170
  bugfix_155174
  bugfix_155178
  bugfix_155183
  cg700_before_tournament
  cg700_tournament_started
  fix_stub_always_return_false
  foreman_oneliner_stop
  game_is_loaded
  lw_ww_belgard_to_coronata
  lw_ww_belgard_to_vermentino
  mq7001_fact_met_qg
  mq7001_fact_questgiver_objective_suspended
  mq7002_done
  mq7002_fact_knight_married
  mq7002_fact_plants_burning
  mq7004_done
  mq7004_job_taken
  mq7024_garden_in_progress
  mq7024_stables_in_progress
  poi_pleg_01_moved
  q309_triss_lover
  q702_delivered_wicht_gland
  q702_marlene_rescued
  q702_wight_disenchanted
  q702_wight_woman_default
  q703_entered_mandragora
  q703_mandragora_final_scene_ended
  q704_done
  q704_ft_fairy_tale_active
  q704_ft_jumped_into_fountain
  q704_long_night_starts
  q705_ciri_dd_start
  q705_ciri_dd_stop
  q705_ciri_empress
  q705_completed
  sq202_yen_girlfriend
  sq701_arena_active
  witcher3_game_finished

== dlc/bob/data/quests/bob_character_journal_entries.w2phase:
  butler_met
  mq7006_done
  mq7006_hermit_met
  q701_damien_start
  q701_guillaume_arena
  q701_guillaume_cyclops
  q701_henrietta_arena
  q701_henrietta_start
  q701_milton_dead
  q702_bootblack_saved
  q702_butler_met
  q702_dettlaff_met_first_time
  q702_regis_about_spoon_collector
  q702_regis_about_tesham_mutna
  q702_regis_after_tesham_mutna
  q702_regis_after_toy_storage
  q702_regis_met_first_time
  q703_add_syanna_entry
  q703_after_slaughter
  q703_ah_en_route_to_cr
  q703_damien_after_astre
  q703_done
  q703_mandragora_final_scene_ended
  q704_fairy_tale_done
  q704_gravity_cave_done
  q704_know_about_unseen
  q704_orphanage_done
  q704_syann_not_found_dettlaff_dies
  q704_syanna_dead
  q704_syanna_dies_dettlaff_dies
  q704_syanna_dies_dettlaff_lives
  q704_syanna_lives_dettlaff_dies
  q705_bootblack_told_truth
  q705_chr_ah_prison
  q705_chr_syanna_cell_talk
  q705_henrietta_alive
  q705_henrietta_dead
  q705_rich_bootblack_met
  sq701_finale_done_pond
  sq701_guillaume_curse_secret
  sq701_guillaume_dead
  sq701_guillaume_egg
  sq701_guillaume_egg_epilogue
  sq701_guillaume_pond_epilogue
  sq701_guillaume_start
  sq701_told_guillaume
  sq701_vivienne_meadow

== dlc/bob/data/quests/bob_mounted_equipment.w2phase:
  damien_eqp_mount
  damien_eqp_unmount
  milton_eqp_mount
  milton_eqp_unmount
  palmerin_eqp_mount
  palmerin_eqp_unmount
  q705_ciri_eqp_mount
  q705_ciri_eqp_unmount
  syanna_eqp_mount
  syanna_eqp_unmount

== dlc/bob/data/quests/bob_persistent_content.w2phase:
  game_is_loaded
  mq3035_fdb_radovid_dead
  mq3035_free_temeria
  mq7006_hermit_fight
  mq7006_switch_fisher
  mq7011_completed
  mq7011_done
  mq7015_hapilly_ended
  mq7020_done
  player_bitten_by_vampire
  q502_ciri_dead
  q502_ciri_survives
  q701_crime_scene_done
  q701_done
  q702_delivered_wicht_gland
  q702_done
  q702_gameplay_scene_playing
  q702_kikimora_eggs_destroyed
  q702_kikimora_eggs_seen
  q702_regis_crypt_wall_dispelled
  q702_spoon_key_obtained
  q702_tried_disenchanting_wight
  q702_wicht_trophy_taken
  q702_wight_diary_read
  q702_wight_killed
  q702_wight_killed_after_quest
  q702_wight_submerged
  q703_ah_en_route_to_cr
  q703_dt_peaceful_guards_dspn
  q703_mandragora_final_scene_ended
  q704_dettlaff_bossfight_begins
  q704_done
  q704_long_night_starts
  q705_completed
  regis_default_1st_floor
  th700_preacher_bones_rest
  th700_red_wolf_complete
  th701_fdb_bear_complete
  th701_fdb_cat_complete
  th701_fdb_gryphon_complete
  th701_fdb_wolf_complete
  vampire_invisibility >= 1

== dlc/bob/data/quests/bob_phase.w2phase:
  ep2_installed

== dlc/bob/data/quests/bob_quest_npc_default_dialogues.w2phase:
  anna_henrietta_dd_start
  anna_henrietta_dd_stop
  bootblack_dd_start
  bootblack_dd_stop
  bootblack_default_start
  foreman_dd_start
  foreman_dd_stop
  q702_wight_woman_away
  q702_wight_woman_default
  q704_long_night_starts
  q705_ciri_dd_start
  q705_ciri_dd_stop
  q705_ciri_empress
  q705_dandelion_dd_start
  q705_dandelion_dd_stop
  q705_triss_dd_start
  q705_triss_dd_stop
  q705_yen_dd_start
  q705_yen_dd_stop
  regis_dd_start
  regis_dd_stop
  wight_woman_dd_start
  wight_woman_dd_stop

== dlc/bob/data/quests/bob_tutorial.w2phase:
  ep1_installed
  kill_ep2_tutorials
  mq7024_alch_table_found
  q305_completed
  sq701_horse_combat_tutorial_start
  standalone_ep1
  standalone_ep2
  tut_got_char_dev_handler
  tutorial_system_is_running

== dlc/bob/data/quests/main_npcs/default_dialogues/default_anna_henrietta.w2scene:
  ah_default_first_met
  q702_finished

== dlc/bob/data/quests/main_npcs/default_dialogues/default_regis.w2scene:
  q601_geralt_has_demon_mark
  regis_default_first_met

== dlc/bob/data/quests/main_npcs/voicesets/vset_anna_henrietta.w2scene:
  q701_vset_gardens_block

== dlc/bob/data/quests/main_quests/bob_main_quests.w2phase:
  ep2_main_story_done

== dlc/bob/data/quests/main_quests/q701_wine_festival.w2phase:
  DebugNoLevelUpUpdates
  anna_henrietta_dd_stop
  kill_ep1_tutorials
  kill_ep2_tutorials
  milton_dd_start
  milton_dd_stop
  q701_opening_done

== dlc/bob/data/quests/main_quests/q702_hunt.w2phase:
  MeditationStarted
  bootblack_dd_start
  bootblack_dd_stop
  bootblack_default_start
  boy
  butler_default_ended
  cemetary
  dettlaff_dd_stop
  mill
  mq7006_generosity
  mq7006_generosity_added_q702
  mq7006_wisdom
  mq7006_wisdom_added_q702
  mq7023_messenger_scene
  mus_q702_02_regis_intro
  mus_q702_02_regis_intro_silent
  mus_q702_detlaff_combat
  mus_q702_toy_storage_amb
  q702_after_visions
  q702_barrel_broken_1
  q702_barrel_broken_3
  q702_bloodlust
  q702_bootblack_boots_security
  q702_bootblack_bribed_virtue
  q702_bootblack_rapists_beaten
  q702_bootblack_saved
  q702_brew_poglos
  q702_delivered_wicht_gland
  q702_destoryable_support_1
  q702_destoryable_support_2
  q702_destoryable_support_3
  q702_dettlaff_fight_time
  q702_dettlaff_met_first_time
  q702_disable_poe_car_b_pre_25
  q702_done
  q702_drawing_poster_checked
  q702_fight_dettlaff
  q702_find_hideout_wight_lair
  q702_gameplay_scene_playing
  q702_kaszet_scene_playing
  q702_keep_searching_toy_storage
  q702_lure_placed
  q702_marlene_rescued
  q702_mill_combat_chat
  q702_mill_investigation_done
  q702_mill_opening_chat_ended
  q702_mill_visited
  q702_mus_bob_fistfight
  q702_mus_bootblack_silence
  q702_mus_bootblack_talk
  q702_mus_q702_20_toy_store
  q702_mus_q702_dettlafs_hand
  q702_mus_q702_drinking_with_regis
  q702_mus_silence_for_visions
  q702_music_box_played
  q702_open_regis_crypt_door
  q702_open_werehouse_door
  q702_override_regis_apperance_bootblack
  q702_play_buttler_scene
  q702_reached_regis_crypt_door
  q702_regis_about_spoon_collector
  q702_regis_about_tesham_mutna
  q702_regis_after_tesham_mutna
  q702_regis_after_toy_storage
  q702_regis_bird_back
  q702_regis_cemetary_saved
  q702_regis_cooking_chat_plays
  q702_regis_crypt_sacrifice_back
  q702_regis_met_first_time
  q702_regis_mist
  q702_regis_open_door
  q702_regis_sacrafice_mus_q702_silent
  q702_regis_sacrifice_blood_dried
  q702_regis_sacrifice_later
  q702_reset_regis
  q702_sacrifice_stage_2
  q702_sacrifice_stage_3
  q702_sacrifice_stage_4
  q702_sample_taken
  q702_set_visions_toxicity
  q702_set_wight_toxicity
  q702_stage_2_regis_shouts
  q702_stop_regis_shouts
  q702_tesham_mutna_opened
  q702_three_spoons_checked
  q702_toy_storage_scene
  q702_toy_storage_suspend_played
  q702_tried_disenchanting_wight
  q702_vampire_symbol_1_seen
  q702_vampire_symbol_2_seen
  q702_vampire_symbol_3_seen
  q702_vision_seen
  q702_wicht_attacked_props
  q702_wicht_cupboard_later
  q702_wight_chair_hide
  q702_wight_chair_show
  q702_wight_cupboard
  q702_wight_curse_lifted
  q702_wight_dinner_props
  q702_wight_disenchanted
  q702_wight_disenchanted_later
  q702_wight_disenchanted_props
  q702_wight_disenchanting_failed_props
  q702_wight_is_cursed
  q702_wight_killed
  q702_wight_submerged
  regis_dd_start
  regis_dd_stop
  wicht
  wight_woman_dd_stop

== dlc/bob/data/quests/main_quests/q703_all_for_one.w2phase:
  aaa
  anna_henrietta_dd_start
  anna_henrietta_dd_stop
  dettlaff_dd_start
  dettlaff_dd_stop
  game_is_loaded
  mq7006_compassion
  mq7006_compassion_added_q703
  q701_vset_gardens_block
  q703
  q703_a02_s01_interrupted
  q703_a03_done
  q703_a03_poke_runner
  q703_a03_runner_hostile
  q703_a03_s02_fire_starts
  q703_a03_s02_interrupt
  q703_a04_done
  q703_a04_g_was_away
  q703_a04_s01_guards_hostile
  q703_a04_s01_interrupted
  q703_a06_s01_bandit_present
  q703_a06_s02_bandit_present
  q703_a06_s03_bandit_present
  q703_a06_s04_bandit_present
  q703_a06_s05_bandit_present
  q703_a06_s06_bandit_present
  q703_add_syanna_entry
  q703_after_panther_chat_start
  q703_after_slaughter
  q703_ah_busy
  q703_ah_by_barrel_04
  q703_ah_by_barrel_05
  q703_ah_by_barrel_06
  q703_ah_en_route_to_cr
  q703_ah_follow_start
  q703_ah_follow_stop
  q703_barrel_opened
  q703_borg_at_arena_06
  q703_borg_hostile
  q703_broken_pot_found
  q703_bung_is_quest_item
  q703_cecilias_door_opened
  q703_clue_cr_register_found
  q703_clue_parfume_box_found
  q703_cr_barrel_01_opened
  q703_cr_barrel_02_opened
  q703_cr_barrel_03_opened
  q703_cr_barrel_04_opened
  q703_cr_barrel_05_opened
  q703_cr_barrel_06_opened
  q703_cr_investigation_done
  q703_damien_after_astre
  q703_damien_dspn
  q703_deactivate_premandra_bandits
  q703_dettlaff_entrance_music
  q703_dettlaff_follow_start
  q703_dettlaff_follow_stop
  q703_dirt_tracks_found
  q703_disable_comment_from_a01
  q703_done
  q703_dt_peaceful_guards_dspn
  q703_dt_play_suspence_music
  q703_dt_play_syanna_theme
  q703_duchess_at_castel_ravello
  q703_dun_tynne_dog_cage_door_opened
  q703_entered_mandragora
  q703_equip_beauclair
  q703_equip_nilfgaardian_01
  q703_equip_nilfgaardian_02
  q703_equip_nilfgaardian_03
  q703_exchange_spot_deadeaters
  q703_exchange_spot_ended
  q703_g_found_suit
  q703_g_knocked
  q703_g_mandragora_mask_off
  q703_g_saw_panthers
  q703_g_talking_at_orianas
  q703_geralt_and_regis_away
  q703_geralt_dress_up
  q703_geralt_engaged_panthers
  q703_geralt_equips_his_nice_suit
  q703_geralt_equips_kontusz
  q703_geralt_equips_mask
  q703_geralt_escaped_panthers
  q703_had_nice_suit
  q703_hammer_is_quest_item
  q703_helped_roderik
  q703_horses_calm
  q703_in_mandragora
  q703_kill_ah_oneliners
  q703_knocking_ended
  q703_kontusz_pants_check
  q703_lisa_dspn
  q703_lisa_found
  q703_lounge_guard_friendly
  q703_mandragora_activities
  q703_mandragora_final_scene_ended
  q703_militia_hq_candle_off
  q703_move_archers
  q703_move_d_ah_to_ap
  q703_orianas_door_locked_attempt
  q703_palace_destroy_horse
  q703_palace_raport_stop_dark_ambient
  q703_palace_report_new_chat
  q703_panthers_attack
  q703_panthers_killed
  q703_player_on_horse_in_palace
  q703_port_guards_hq_comm_off
  q703_poster_1268_read
  q703_poster_1269_read
  q703_poster_1270_read
  q703_poster_erveluce_read
  q703_poster_est_est_read
  q703_poster_fiorano_read
  q703_poster_pomino_read
  q703_progress_time_near_mandragora
  q703_reequip_after_mandragora
  q703_regis_follow_start
  q703_regis_follow_stop
  q703_remove_combat_stance_lock
  q703_remove_lounge_guard_mask
  q703_road_rider_deactivation
  q703_roderik_done
  q703_roderik_interrupt
  q703_roderik_koed
  q703_runner_found_roderik
  q703_sculpture_done
  q703_show_astre_timelapse
  q703_show_bckgrnd_npcs
  q703_show_dt_timelapse
  q703_show_mandragora_courtains
  q703_show_timelapse_police
  q703_spawn_mill_guards
  q703_start_a03_s01
  q703_start_dt_soundtrack
  q703_throwing_done
  regis_dd_start
  regis_dd_stop

== dlc/bob/data/quests/main_quests/q704_truth.w2phase:
  cg700_tournament_done
  q704_active
  regis_dd_start
  regis_dd_stop
  sq701_finale_done_pond

== dlc/bob/data/quests/main_quests/q705_epilog.w2phase:
  anna_henrietta_dd_start
  anna_henrietta_dd_stop
  damien_eqp_mount
  damien_eqp_unmount
  mq7006_valor
  mq7006_valor_added_q705
  q702_money_given
  q704_dettlaff_dead
  q704_fairy_tale_done
  q704_syanna_dead
  q705_15_2weeks
  q705_audience_community
  q705_cannot_be_drunk
  q705_catacombs_active
  q705_chr_ah_prison
  q705_chr_syanna_cell_talk
  q705_city_restoration
  q705_comm_ceremony_over
  q705_comm_syanna_in_cell
  q705_completed
  q705_dandelion_dd_stop
  q705_dett_sya_dead
  q705_dlg_timelapse_prison
  q705_dlg_where_you_go
  q705_drunk_anim
  q705_drunk_regis_disappeared
  q705_geralt_got_medal
  q705_geralt_won_laundry
  q705_henrietta_alive
  q705_hide_logo
  q705_hide_prison_outside_comm
  q705_jack_important_dlg
  q705_looted_soap
  q705_lost_gwent
  q705_mus_09_dandelion_appears
  q705_mus_15_sad_syanna
  q705_mus_silent_ending
  q705_pickedup_clothes
  q705_prison_path
  q705_rapist_axiid
  q705_show_cut_man
  q705_show_logo
  q705_show_pinup_poster
  q705_show_sangreal
  q705_started
  q705_stash_disabled
  q705_syanna_correct
  q705_tailor_static
  q705_teleport_shoemaker
  q705_teleport_to_camp
  q705_tell_ah_ab_letter
  q705_timelapse_catacombs
  q705_timelapse_no_mandragora
  q705_timelapse_regis_crypt
  q705_told_ah_ab_letter
  q705_waiting_for_stash
  regis_dd_start
  regis_dd_stop
  standalone_ep1
  standalone_ep2
  syanna_eqp_unmount
  tailor_pierre_meet

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_cleanup.w2phase:
  anna_henrietta_dd_start
  q701_orangery_unlock

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_garden_scenes.w2phase:
  q701_ff_en_cours
  q701_gardens_start_noble_chats
  q701_gardens_started
  q701_grain_cup_used
  q701_lake_chats_progres
  q701_opening_done
  q701_ring_returned
  q701_unicorn_success
  q701_vset_gardens_block

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_gardens.w2phase:
  BombThrowDisallowSpecificTargets
  anna_henrietta_dd_stop
  game_is_loaded
  mq7006_wisdom
  mq7006_wisdom_added_q701
  q701_apple_lure_used
  q701_apples_found
  q701_carrot_basket_clue_found
  q701_carrot_basket_used
  q701_cookie_lure_used
  q701_cookie_tried
  q701_done
  q701_enable_wisdom_fact
  q701_gardens_final_stage
  q701_gardens_start_noble_chats
  q701_gardens_started
  q701_horse_appled
  q701_horse_axiied
  q701_horse_carroted
  q701_lake_chats_progres
  q701_milton_dead
  q701_nobles_start_listening
  q701_orangery_unlock
  q701_remove_ff_crowd
  q701_show_ff_crowd
  q701_show_fish_pieces
  q701_sweets_clue_a_found
  q701_sweets_clue_b_found
  q701_talking_cinematic
  q701_talking_trigger
  q701_temp_riddle_solved
  q701_unicorn_success
  q701_wrong_fishA_opened
  q701_wrong_fishB_opened
  q701_wrong_fishC_opened
  q701_wrong_fishD_opened
  q701_wrong_fish_used

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_nml_hook.w2phase:
  _debug_bob_start
  milton_eqp_mount
  milton_eqp_unmount
  palmerin_eqp_mount
  palmerin_eqp_unmount
  q305_completed
  q701_bob_hook_active
  q701_come_listen
  q701_desp_knight_horses
  q701_enable_ah_journal
  q701_heard_about_bob
  q701_henrietta_start
  q701_hide_nml_layers
  q701_hook_done
  q701_hook_show_gp
  q701_nml_spawn_horse
  q701_nml_traditional_silence
  q701_notice_taken
  q701_vlge_done
  q701_vlge_scene_step_1
  q701_vlge_scene_step_2
  q701_vlge_started
  standalone_ep1

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_tournament_gp_scenes.w2phase:
  MeditationStarted
  q701_opening_done
  q701_palmerin_approached
  q701_sharley_started

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/phases/q701_toussaint.w2phase:
  BombThrowDisallowSpecificTargets
  milton_dd_start
  milton_dd_stop
  mq7006_compassion
  mq7006_compassion_added_q701
  mq7024_start
  q701_13_about_body_medallion
  q701_13_bruxa_passing_med
  q701_ah_race_inprogress
  q701_ah_walks
  q701_bruxa_clue_found
  q701_bruxa_entry_read
  q701_bruxa_hack
  q701_bruxa_known
  q701_bruxa_music_loop_start
  q701_clear_cock_comm
  q701_crime_scene_done
  q701_cyclops_killed
  q701_damien_start
  q701_deactivate_clues
  q701_dive_objective
  q701_do_arena_timelapse
  q701_done_goofed_race
  q701_enable_comp_fact
  q701_gardens_started
  q701_geralt_cmnts_progress
  q701_giant_headshot_kill
  q701_guillaume_arena
  q701_guillaume_cyclops
  q701_henrietta_arena
  q701_hide_logo
  q701_knockout_commented
  q701_milton_follow
  q701_milton_rescu_start
  q701_milton_unfollow
  q701_monsters_killed
  q701_monsters_triggered
  q701_moving_body_clue_found
  q701_opening_done
  q701_palace_ramp_deactivate
  q701_palmerin_approached
  q701_palmerin_knockout
  q701_river_still_talking
  q701_set_evening_trnmnt
  q701_sh_scene_move_guards_in
  q701_sharley_cmnts_progress
  q701_sharley_fatality_desc
  q701_sharley_mercy_desc
  q701_sharley_silent
  q701_sharley_started
  q701_show_logo
  q701_show_pate
  q701_show_sharley_corpse
  q701_show_sharley_dying
  q701_trnmnt_mus_back_to_gp
  q701_trnmnt_scene_playing
  q701_victim_bloody_nets_clue_found
  q701_victim_boatmark_clue_found
  q701_victim_footsteps_clue_found
  q701_vineyard_bloody_ears_clue_found
  q701_vineyard_clawed_hand_clue_found
  q701_vineyard_oneliner
  q701_vineyard_path_found
  q701_vineyard_ripped_throat_clue_found
  standalone_ep2

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_01_vlge_precombat.w2scene:
  q701_notice_taken

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_12_gp_site_clues.w2scene:
  q701_trash_cmnts
  q701_victim_bloody_nets_clue_found
  q701_victim_boatmark_clue_found

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_13_about_body.w2scene:
  q701_god_punishment_mentioned

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_15_bruxa.w2scene:
  q701_bruxa_known

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_16_corpse_inspection.w2scene:
  q701_head_done
  q701_legs_done

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_21_duchess_after_fight.w2scene:
  q701_first_victim
  q701_palmerin_knockout
  q701_second_victim
  q701_third_victim

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_22_gp_ride_with_duchess.w2scene:
  q701_done_goofed_race

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_24_gp_gardens_more_scenes.w2scene:
  q701_ring_returned

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_24_servants_intercept.w2scene:
  q701_gold_fish_mentioned
  q701_unicorn_mentioned

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_25a_gp_swan_lake_shore_scene.w2scene:
  q701_shore_scene

== dlc/bob/data/quests/main_quests/quest_files/q701_wine_festival/scenes/q701_25b_geralt_cheater_fistfight.w2scene:
  q701_horse_appled
  q701_horse_axiied
  q701_horse_carroted

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/phases/q702_faith_of_marlene.w2phase:
  butler_default_ended
  mq7006_compassion
  mq7006_compassion_added_q702
  mus_q702_07_cursed
  q702_marlene_happy_ending
  q702_marlene_tells_her_story
  q702_mus_q702_silent_before_cursed
  q702_mus_silent_after_cursed
  q702_play_buttler_scene
  q702_wight_curse_lifted
  q702_wight_disenchanted_later
  q702_wight_story_uncovered
  q702_wight_woman_away
  q702_wight_woman_default
  wight_woman_dd_start
  wight_woman_dd_stop

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/phases/q702_wight_combat.w2phase:
  q702_gameplay_scene_playing
  q702_wight_killed
  q702_wight_submerged

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_01_beast_escapes.w2scene:
  q701_orangery_unlock

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_02_regis_intro.w2scene:
  q702_02_regenerate

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_04_cemetary_regis.w2scene:
  q502_ciri_dead
  q702_04_about_wicht
  q702_04_potion
  q702_04_ring_of_humanity
  q702_commented_crypt_door
  q702_reached_regis_crypt_door

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_05_wight_lair.w2scene:
  q702_generic_spoon_remark
  q702_wight_diary_read

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_06_wight_confrontation.w2scene:
  q702_wight_is_cursed

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_08_regis_vampire_vision.w2scene:
  q702_khagmar_mentioned
  q702_regis_mist

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_11_regis_sacrifice_done.w2scene:
  bootblack_boy_met

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_12_mill.w2scene:
  q702_mill_combat_chat
  q702_mill_investigation_done

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_18_bootblack_saved.w2scene:
  q702_18_come_back_bribe
  q702_bootblack_rapists_beaten

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_20_toy_store.w2scene:
  q702_21_letter
  q702_generic_toy_remark

== dlc/bob/data/quests/main_quests/quest_files/q702_hunt/scenes/q702_21_summ_up.w2scene:
  q702_21_letter
  q702_21_names

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/phases/q703_mandragora_activities.w2phase:
  BombThrowSpecificTargets
  q703_absinth_drunk
  q703_ah_follow_start
  q703_ah_follow_stop
  q703_ah_on_bombs
  q703_approached_pre_mand_bandits
  q703_blue_bombs_taken
  q703_bombs_disposed
  q703_bombs_taken
  q703_canvas_bomb_hit_type_q703_paint_bomb_blue_by_PLAYER
  q703_canvas_bomb_hit_type_q703_paint_bomb_green_by_PLAYER
  q703_canvas_bomb_hit_type_q703_paint_bomb_purple_by_PLAYER
  q703_canvas_bomb_hit_type_q703_paint_bomb_red_by_PLAYER
  q703_canvas_bomb_hit_type_q703_paint_bomb_yellow_by_PLAYER
  q703_canvas_hit_once
  q703_deactivate_premandra_bandits
  q703_doors_by_bouncer
  q703_entered_mandragora
  q703_green_bombs_taken
  q703_let_lanterns
  q703_lounge_guard_friendly
  q703_mandragora_activities
  q703_mandragora_painter_played
  q703_mandragora_sculpturer_played
  q703_more_lanterns_go
  q703_pre_mandra_bandits_killed
  q703_purple_bombs_taken
  q703_red_bombs_taken
  q703_sculpture_done
  q703_throwing_done
  q703_yellow_bombs_taken

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_02_at_castel_ravello.w2scene:
  q703_cintramanwine
  q703_whoarethey
  q703_wine_iri

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_02b_investigation_in_castel_ravello.w2scene:
  q703_ah_busy
  q703_g_knocked
  q703_poster_1269_read

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_06_entering_mandragora.w2scene:
  q703_equip_kontusz
  q703_pre_mandra_bandits_killed

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_07g_painting_range_gpl.w2scene:
  q703_painting_range_random_1
  q703_painting_range_random_2
  q703_painting_range_random_3

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_08_talk_with_lounge_guard.w2scene:
  q703_lounge_guard_met

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_11_mandragora_finale.w2scene:
  q702_mill_visited
  q703_exile
  q703_whathewanted
  q703_whysyanna

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_12_briefing_before_dun_tynne.w2scene:
  q703_attackfirst
  q703_pre_mandra_bandits_killed

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_14_a02_s01_bandits_b4_roderik_gpl.w2scene:
  q703_a02_s01_interrupted

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_14_a03_s02_ladders_and_barrels_gpl.w2scene:
  q703_a03_s02_interrupt
  q703_runner_found_roderik

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_14_a04_s01_dogs_and_weapon_stash_gpl.w2scene:
  q703_a04_s01_interrupted

== dlc/bob/data/quests/main_quests/quest_files/q703_all_for_one/scenes/q703_14c_roderick_interrogated.w2scene:
  q703_rode_1
  q703_rode_2
  q703_rode_3
  q703_syanna
  q703_wherethegirl

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_01_beginning.w2phase:
  q704_01_servant_enters_music
  q704_audiance_time_lapse
  q704_intro_scene_spawn_soldiers
  q704_know_about_unseen
  q704_load_vampire_siege
  q704_long_night_starts
  q704_to_damien_with_regis
  q704_to_oriana_no_regis

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_03_monster_hunt.w2phase:
  crossbow_was_fired
  q704_03b_music_start
  q704_03b_music_stop
  q704_diva_done_shortcut
  q704_fairy_tale_started
  q704_garkain_bestiary_read
  q704_important_clues_found
  q704_mh_birds_fly_away
  q704_mh_bodies_checked
  q704_mh_clues_found
  q704_mh_garkain_found
  q704_mh_garkain_hit_with_crossbow
  q704_monster_hunt_in_progress
  q704_monster_known
  q704_oriana_letter
  q704_orianas_part_done
  q704_original_go_alone
  q704_orphanage_done
  q704_orphanage_massacare
  q704_to_oriana_no_regis
  q704_weather_rain_storm

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_03b_search_for_damien.w2phase:
  q704_damien_found
  q704_killed_soldier_scene_triggered
  q704_massacare_reached
  q704_search_for_damien_started
  q704_to_damien_with_regis
  regis_dd_stop

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_04_vampire_cave.w2phase:
  actor_q704_gravity_cave_flipped_monster_was_killed
  actor_q704_gravity_cave_monster_01_was_killed
  actor_q704_gravity_cave_monster_02_was_killed
  actor_q704_gravity_cave_monster_03_was_killed
  actor_q704_gravity_cave_monster_04_was_killed
  actor_q704_gravity_cave_monster_05_was_killed
  actor_q704_gravity_cave_monster_06_was_killed
  actor_q704_gravity_cave_monster_was_killed
  q704_body_found
  q704_close_sanctum_door
  q704_confront_the_elder_objective_was_active
  q704_fight_for_life_no_potions
  q704_fight_for_life_started
  q704_gravity_cave_done
  q704_gravity_shift_in_progress
  q704_gravity_shifted
  q704_megascope_found
  q704_new_swallow_made
  q704_offering_found
  q704_original_go_alone
  q704_returned_to_normal_gravity
  q704_returned_to_normal_gravity_once
  q704_sanctum_entrance_failsafe_off
  q704_shortcut_to_detlaff_arena
  q704_stalagmite_done
  q704_tent_found
  q704_vampire_sanctum_door_opened
  q704_white_raffards_decoction_made
  regis_dd_start
  regis_dd_stop

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_05_finale.w2phase:
  ColumnDeath
  DettlaffDeath
  DettlaffPhase2
  dettlaff_vampire_weapon_hit_by_GERALT
  game_is_loaded
  q704_09_start_combat_music
  q704_bossfight_test
  q704_dettlaff_bossfight_begins
  q704_dettlaff_dead
  q704_done
  q704_finale_hide_foliage
  q704_shortcut_to_detlaff_arena
  q704_syann_not_found_dettlaff_dies
  q704_syanna_dead
  q704_syanna_dies_dettlaff_dies
  q704_syanna_dies_dettlaff_lives
  q704_syanna_freed
  q704_syanna_lives_dettlaff_dies
  q704_unseen_summons_music
  sq701_reached_meadow

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_06_vampire_siege.w2phase:
  actor_q704_bruxa_after_girl_was_killed
  actor_q704_delwyns_opponent_was_killed
  actor_q704_main_square_civilian_was_killed
  actor_q704_scene_bruxa_fighting_soldiers_was_killed
  actor_q704_sg_fleder_sp_01_was_killed
  actor_q704_sg_fleder_sp_02_was_killed
  actor_q704_sg_fleder_sp_05_was_killed
  actor_q704_sg_fleder_sp_06_was_killed
  actor_q704_soldiers_fighting_bruxa_01_was_killed
  actor_q704_soldiers_fighting_bruxa_02_was_killed
  actor_q704_soldiers_fighting_bruxa_03_was_killed
  actor_q704_soldiers_fighting_bruxa_04_was_killed
  actor_q704_soldiers_fighting_bruxa_05_was_killed
  actor_q704_soldiers_fighting_bruxa_06_was_killed
  actor_q704_soldiers_fighting_bruxa_07_was_killed
  actor_q704_soldiers_fighting_bruxa_08_was_killed
  actor_q704_soldiers_fighting_bruxa_was_killed
  actor_sq701_delwyn_was_killed
  game_is_loaded
  mq7006_valor
  mq7006_valor_added_q704_knights
  q704_batswarm_05_stagger
  q704_damien_found
  q704_delwyn_despawned
  q704_delwyn_killed
  q704_delwyns_opponent_weapon_hit_by_PLAYER
  q704_dettlaff_bossfight_begins
  q704_ft_fairy_tale_active
  q704_ft_jumped_into_fountain
  q704_killed_soldier_scene_triggered
  q704_load_vampire_siege
  q704_long_night_starts
  q704_start_bells
  q704_vampire_siege_people_running_scene_done
  q704_weather_rain_storm
  regis_dd_stop

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/phases/q704_persistent_content.w2phase:
  q704_failsafe_geralt_killed_by_unseen
  q704_fight_for_life_started
  q704_gravity_shift_in_progress
  q704_gravity_shifted
  q704_gravity_shifted_once
  q704_long_night_starts
  q704_new_swallow_made
  q704_returned_to_normal_gravity
  q704_returned_to_normal_gravity_once
  q704_sanctum_entrance_failsafe_off
  q704_shift_from_the_rock
  q704_stalagmite_done
  q704_vampire_sanctum_door_opened
  q704_white_raffards_decoction_made

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_02_next_move.w2scene:
  q702_recall_him
  q704_02_talked_about_dettlaff
  q704_02_talked_about_syanna
  q704_syanna_regis_1
  q704_syanna_regis_2

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_02_search_for_damien_oneliners.w2scene:
  q704_02b_bodies_oneliner_played
  q704_to_damien_with_regis

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_03b_diva_and_family.w2scene:
  q704_what_next_boy
  q704_whos_arnaud

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_06_regis_info_inject.w2scene:
  q704_damien_found
  q704_to_damien_with_regis

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_08_original_agrees.w2scene:
  q704_more_than_one_question
  q704_offering_found
  q704_original_mentions_gate
  q704_vampire_angry

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_08b_gravity_cave.w2scene:
  q704_body_found

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_08c_gravity_shift.w2scene:
  q704_gravity_shifted_once

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_09_detlaff_arrives.w2scene:
  q704_ribbon_found
  q704_syanna_freed

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_09b_dettlaff_combat_chat.w2scene:
  q704_syanna_dead
  q704_syanna_freed

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_talking_soldiers_oneliners.w2scene:
  q704_damien_found

== dlc/bob/data/quests/main_quests/quest_files/q704_truth/scenes/q704_vampire_siege_oneliners.w2scene:
  sq701_won_tournament

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/phases/q704_02_fairy_tale.w2phase:
  actor_q704_ft_fleder_was_killed
  q704_diva_done_shortcut
  q704_fairy_tale_done
  q704_fairy_tale_end_go_with_regis
  q704_fairy_tale_started
  q704_ft_bedroom_door_open
  q704_ft_gameplay_regis
  q704_ft_goose_done
  q704_ft_land_known
  q704_ft_saw_book_before
  q704_ft_scene_playing
  q704_ft_show_journal_deco
  q704_ft_start_syanna_theme
  q704_ft_talked_to_birds
  q704_ft_tried_open
  q704_ft_wardrobe_door_locked
  q704_ft_wardrobe_door_opened
  q704_monster_hunt_in_progress
  q704_ribbon_found
  q704_shortcut_to_detlaff_arena
  q704_syanna_freed
  q704_to_damien_with_regis
  regis_dd_start
  regis_dd_stop

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/phases/q704_02b_fairy_tale_land.w2phase:
  actor_q704_ft_pixie_first_was_killed
  actor_q704_ft_rapunzel_was_killed
  fairytaleWitchPhase2
  fairytaleWitchPhase3
  mq7006_compassion
  mq7006_compassion_q704
  mq7006_generosity
  mq7006_generosity_q704
  q704_detlaff_backstory
  q704_ft_activate_mappins
  q704_ft_after_giant
  q704_ft_all_beans
  q704_ft_bean_02_taken
  q704_ft_bean_stalk_grows
  q704_ft_big_bad_wolf_hostile
  q704_ft_blue_bean
  q704_ft_bonfire_on
  q704_ft_boy_done
  q704_ft_bremen_destroyed
  q704_ft_fairy_tale_active
  q704_ft_follow_clues_done
  q704_ft_found_prince
  q704_ft_freed_goose
  q704_ft_geralt_sex_undress
  q704_ft_goldilocks_done
  q704_ft_goose_done
  q704_ft_goose_key_objective
  q704_ft_goose_notice_read
  q704_ft_gwent_won
  q704_ft_had_sex
  q704_ft_how_many_beans
  q704_ft_jumped_from_tower
  q704_ft_jumped_into_fountain
  q704_ft_load_second_stalk
  q704_ft_meet_done
  q704_ft_move_unicorns
  q704_ft_pig_01_evil_killed
  q704_ft_pig_01_killed
  q704_ft_pig_house_destroyed
  q704_ft_pipe
  q704_ft_rapunzel_syanna_companion
  q704_ft_rapunzel_syanna_waits
  q704_ft_red_bean
  q704_ft_ribbon_won
  q704_ft_ride_unicorn
  q704_ft_rumcajs_dead
  q704_ft_saved_boy
  q704_ft_saw_first_wisp
  q704_ft_scene_playing
  q704_ft_syanna_hood
  q704_ft_syanna_hood_off
  q704_ft_syanna_naked
  q704_ft_talked_to_wolf
  q704_ft_unicorn_failsafe
  q704_ft_use_senses_done
  q704_ft_wawel_done
  q704_ft_welcome_poster_read
  q704_ft_witch_collision_destroyed
  q704_ft_witch_defeated
  q704_ft_yellow_bean
  q704_geralt_interested_pt2
  q704_pig_bean_taken
  q704_rapunzel_bean_taken
  q704_ribbon_found
  q704_run_horse_test
  q704_scnd_bean
  q704_syanna_hood
  q704_talked_to_match_girl
  q704_third_bean

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/phases/q704_2b_syanna_phase.w2phase:
  q704_ft_fighting_wolf
  q704_ft_ride_unicorn

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_01_tremblay.w2scene:
  q704_to_damien_with_regis

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_02_bedroom.w2scene:
  q704_ft_gameplay_regis
  q704_ft_land_known
  q704_ft_saw_book_before
  q704_ft_talked_to_birds
  q704_to_damien_with_regis

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_06_boy_cries_wolf.w2scene:
  q704_first_bean
  q704_ft_blue_bean
  q704_ft_boy_done
  q704_ft_red_bean
  q704_ft_yellow_bean
  q704_scnd_bean
  q704_third_bean

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_07_big_bad_wolf.w2scene:
  q704_ft_all_beans
  q704_ft_little_mermaid_killed
  q704_ft_syanna_hood
  q704_geralt_interested
  q704_werewolf_met

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_08_match_girl.w2scene:
  q704_ft_08_talked
  q704_ft_all_beans
  q704_ft_gwent_won
  q704_ft_ribbon_won
  q704_ribbon_deal_explained

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_09_three_little_pigs.w2scene:
  q704_ft_activate_mappins

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_10_rapunzel.w2scene:
  q704_ft_activate_mappins

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_exploration_oneliners.w2scene:
  q704_ft_all_beans

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_goose.w2scene:
  q704_ft_all_beans
  q704_ft_goose_notice_read

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_pig_bean.w2scene:
  q704_ft_all_beans

== dlc/bob/data/quests/main_quests/quest_files/q704b_fairy_tale/scenes/q704_ft_rapunzel_bean.w2scene:
  q704_ft_all_beans
  q704_ft_found_prince
  q704_ft_jumped_from_tower

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/phases/q705_duntynne.w2phase:
  bootblack_dd_start
  bootblack_dd_stop
  bootblack_default_start
  mq7006_valor
  mq7006_valor_added_q705
  q704_dettlaff_dead
  q705_change_time_shelter
  q705_dont_care_shoemaker
  q705_geralt_won_shelter
  q705_henrietta_dead
  q705_know_syanna_plot
  q705_mus_12_investigation
  q705_prison_path
  q705_regis_bootblack_chat
  q705_teleport_shoemaker
  q705_wear_boots_geralt

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/phases/q705_house.w2phase:
  butler_met
  game_is_loaded
  q309_triss_lover
  q503_ended
  q702_butler_met
  q705_butler_intro_done
  q705_ciri_dd_start
  q705_ciri_dd_stop
  q705_ciri_empress
  q705_ciri_eqp_unmount
  q705_dandelion_dd_start
  q705_dandelion_dd_stop
  q705_guest_waiting
  q705_henrietta_dead
  q705_hide_dandelion_home
  q705_show_sangreal
  q705_triss_dd_start
  q705_triss_dd_stop
  q705_yen_dd_start
  q705_yen_dd_stop
  q705_yen_told_unicorn
  sq202_yen_girlfriend
  standalone_ep1
  standalone_ep2
  witcher3_game_finished

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_01_prison_start_talk.w2scene:
  q704_dettlaff_dead

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_03b_gwent_players.w2scene:
  q705_prisoner_gwent_met

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_05_fight_prisoners.w2scene:
  q702_bootblack_rapists_beaten
  q705_rapist_axiid

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_06_guards_in_laundry.w2scene:
  q705_geralt_won_laundry

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_09_trembley_lets_out.w2scene:
  q308_open_spit_door
  q308_vg_met_1st_time
  q309_triss_lover
  q503_ended
  q704_damien_found
  q704_dettlaff_dead
  sq202_yen_girlfriend

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_09a_tell_henrietta.w2scene:
  q704_dettlaff_dead

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_10_talk_in_tailor.w2scene:
  q705_dont_care_shoemaker

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_11_talkto_shoemaker.w2scene:
  q702_money_given
  q705_dont_care_shoemaker
  q705_prison_path

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_12_found_letter.w2scene:
  q704_fairytale_done
  q705_prison_path
  q705_tell_ah_ab_letter

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_13_found_syanna.w2scene:
  q704_geralt_interested_pt2
  q704_know_syannas_dream
  q704_sex_done
  q704_syanna_blamed
  q704_turned_her_back
  q704_your_ending

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_15_ceremony_begins.w2scene:
  q705_know_syanna_plot
  q705_syanna_correct
  q705_told_AH

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_15a_start_ceremony.w2scene:
  q704_damien_found

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_16_regis_talk.w2scene:
  q704_dettlaff_dead
  q705_henrietta_dead
  q705_syanna_flowers

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_20a_yen_visit_vineyard.w2scene:
  q705_yen_first_met
  q705_yen_told_unicorn

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_20b_triss_visit_vineyard.w2scene:
  mq7024_garden_done
  mq7024_renovation_done
  q705_triss_house_met

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_20c_ciri_visit.w2scene:
  mq7024_guest_room_done
  mq7024_renovation_done
  q705_ciri_met

== dlc/bob/data/quests/main_quests/quest_files/q705_epilog/scenes/q705_20d_dandelion_visit.w2scene:
  120963397_1_1
  q308_vg_met_1st_time
  q705_dand_intro
  q705_henrietta_alive
  q705_prison_path

== dlc/bob/data/quests/minor_quests/bob_minor_quests.w2phase:
  q705_completed

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game.w2phase:
  EP2TournamentObjective1
  EP2TournamentObjective2
  EP2TournamentObjective3
  EP2TournamentObjective4
  HasEP2TournamentDeck
  cg700_active
  cg700_after_meeting_positions
  cg700_after_meeting_positions_reject
  cg700_all_cards_counter
  cg700_before_tournament
  cg700_deactivate_community
  cg700_deck_counter
  cg700_door_unlock
  cg700_dwarf_01_down
  cg700_dwarf_02_down
  cg700_dwarf_03_down
  cg700_ff_active
  cg700_fight_deco_switch
  cg700_geralt_beat_dwarf
  cg700_geralt_lost_sword
  cg700_geralt_won
  cg700_geralt_won_tournament
  cg700_got_first_card
  cg700_noticeboard_found
  cg700_poster_gwent_tournament_read
  cg700_price_display
  cg700_qualification_started
  cg700_scene_playing
  cg700_set_weather
  cg700_shop_09_played
  cg700_shop_12_played
  cg700_shop_13_played
  cg700_shop_14_played
  cg700_shop_18_played
  cg700_shop_19_played
  cg700_shop_22_played
  cg700_shop_25_played
  cg700_shop_31_played
  cg700_shop_32_played
  cg700_shop_37_played
  cg700_shop_38_played
  cg700_shop_41_played
  cg700_shop_43_played
  cg700_shop_45_played
  cg700_shop_46_played
  cg700_shop_47_played
  cg700_shop_camerling_played
  cg700_shop_tailor_played
  cg700_tournament_done
  cg700_tournament_started
  cg700_trophy_cabinet_swap
  cg700_wager_return
  cg700_wager_sword
  merchant_card_shop_cammerlengo_card_already_given
  mq7006_wisdom
  mq7006_wisdom_added_cg700
  q704_long_night_starts
  skel_gwint_base_deck_given

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game/scenes/cg700_01_meeting_monnier.w2scene:
  HasEP2TournamentDeck
  cg700_01_infos_01
  cg700_01_infos_02
  cg700_01_tournament_reject
  mq7024_start
  skel_gwint_base_deck_given

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game/scenes/cg700_05_tournament_2nd_round.w2scene:
  cg700_geralt_won
  cg700_player_naked
  cg700_wager_sword

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game/scenes/cg700_06b_tournament_finale.w2scene:
  cg700_geralt_won

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game/scenes/cg700_07_tomatoes_start.w2scene:
  cg700_geralt_won_tournament

== dlc/bob/data/quests/minor_quests/quest_files/cg700_card_game/scenes/cg700_08_tomatoes_end.w2scene:
  cg700_geralt_beat_dwarf
  cg700_geralt_lost_sword
  cg700_geralt_won_tournament
  merchant_card_shop_cammerlengo_card_already_given

== dlc/bob/data/quests/minor_quests/quest_files/cg700_gwent_players.w2phase:
  bob_barber_scene_off
  cg700_deck_counter
  cg700_got_first_card
  cg700_shop_09_played
  cg700_shop_12_played
  cg700_shop_13_played
  cg700_shop_14_played
  cg700_shop_18_played
  cg700_shop_19_played
  cg700_shop_22_played
  cg700_shop_25_played
  cg700_shop_31_played
  cg700_shop_32_played
  cg700_shop_37_played
  cg700_shop_38_played
  cg700_shop_41_played
  cg700_shop_43_played
  cg700_shop_45_played
  cg700_shop_46_played
  cg700_shop_47_played
  cg700_shop_camerling_played
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights.w2phase:
  ff701_br_won
  ff701_fdb_challenge_fight
  ff701_gb_won
  ff701_known
  ff701_master_won
  ff701_mnt_won

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_brienne.w2phase:
  ff01_straight_to_master
  ff701_br_brawler_01_hit_count
  ff701_br_brawler_01_weapon_hit_by_ff701_br_brawler_02
  ff701_br_brawler_02_hit_count
  ff701_br_brawler_02_weapon_hit_by_ff701_br_brawler_01
  ff701_br_brawlers_move
  ff701_br_fight_clear
  ff701_br_lost
  ff701_br_won
  ff701_fdb_br_active
  ff701_known
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_brienne/scenes/ff701_02_challenge_br.w2scene:
  ff701_knight_met
  ff701_known

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_brienne/scenes/ff701_03_result_br.w2scene:
  ff701_gb_won
  ff701_mnt_won

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_drunken_master/scenes/ff701_master_challenge.w2scene:
  ff701_master_known
  ff701_master_rules_told

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_drunken_master/scenes/ff701_master_result.w2scene:
  ff701_master_won

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_guybrush.w2phase:
  ff01_straight_to_master
  ff701_fdb_gb_active
  ff701_fdb_insults_ignored
  ff701_fdb_insults_won
  ff701_gb_brawler_01_hit_count
  ff701_gb_brawler_01_weapon_hit_by_ff701_gb_brawler_02
  ff701_gb_brawler_02_hit_count
  ff701_gb_brawler_02_weapon_hit_by_ff701_gb_brawler_01
  ff701_gb_lost
  ff701_gb_won
  ff701_guybrush_suspend
  ff701_known
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_guybrush/scenes/ff701_02_challenge_talk.w2scene:
  ff01_gp_met
  ff701_known

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_guybrush/scenes/ff701_03_result.w2scene:
  ff701_br_won
  ff701_fdb_insults_ignored
  ff701_fdb_insults_won
  ff701_mnt_won

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_master.w2phase:
  ff701_done
  ff701_fdb_master_active
  ff701_master_brawler_01_hit_count
  ff701_master_brawler_01_weapon_hit_by_ff701_master_brawler_02
  ff701_master_brawler_02_hit_count
  ff701_master_brawler_02_weapon_hit_by_ff701_master_brawler_01
  ff701_master_lost
  ff701_master_won
  mq7006_valor
  mq7006_valor_added_ff701
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_mountain.w2phase:
  ff01_straight_to_master
  ff701_counter_success
  ff701_despawn_brawlers
  ff701_fdb_challenge_fight
  ff701_fdb_mnt_active
  ff701_fdb_mnt_cheated
  ff701_known
  ff701_mnt_brawler_01_hit_count
  ff701_mnt_brawler_01_weapon_hit_by_ff701_mnt_brawler_02
  ff701_mnt_brawler_02_hit_count
  ff701_mnt_brawler_02_weapon_hit_by_ff701_mnt_brawler_01
  ff701_mnt_done
  ff701_mnt_lost
  ff701_mnt_suspend
  ff701_mnt_won
  ff701_remove_equipment
  ff701_remover_blockers
  q704_done
  q704_long_night_starts
  statistics_fist_fight_counter

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_mountain/scenes/ff701_02_challenge_mnt.w2scene:
  ff01_mount_met
  ff701_known

== dlc/bob/data/quests/minor_quests/quest_files/ff701_fistfights/ff701_mountain/scenes/ff701_03_result_mnt.w2scene:
  ff701_br_won
  ff701_fdb_challenge_fight
  ff701_fdb_mnt_cheated
  ff701_gb_won

== dlc/bob/data/quests/minor_quests/quest_files/mq7001_rest_in_peace.w2phase:
  mq7001_add_honour
  mq7001_blacksmith_met
  mq7001_curious_start
  mq7001_done
  mq7001_fact_daytime_pause
  mq7001_fact_heard_noise
  mq7001_fact_lost_sword
  mq7001_fact_met_qg
  mq7001_fact_nighttime_reset
  mq7001_fact_noise_dlg_finished
  mq7001_fact_qg_reward_start
  mq7001_fact_questgiver_objective_suspended
  mq7001_fact_rejected_qg
  mq7001_fact_reward_obj_suspend
  mq7001_fact_show_sound_clue
  mq7001_fact_start_noise
  mq7001_fact_stop_noise
  mq7001_fact_urn_taken
  mq7001_gwent_label_read
  mq7001_hiding
  mq7001_house_door_locked
  mq7001_in_progress
  mq7001_investigation_done
  mq7001_knows_cards
  mq7001_louis_moved
  mq7001_main_reward_taken
  mq7001_margot_moved
  mq7001_notice
  mq7001_quest_started
  mq7001_questgiver
  mq7001_robbers_objective
  mq7001_tomb_found
  mq7001_topside_clues
  mq7001_topside_done
  mq7001_topside_started
  mq7001_unlock_guard
  mq7001_urn_replaced
  mq7006_honor_added_mq7001
  mq7006_honour
  mq7011_heard_again
  q704_done
  q704_long_night_starts
  q705_catacombs_active

== dlc/bob/data/quests/minor_quests/quest_files/mq7001_rest_in_peace/scenes/mq7001_01_gp_cemetery_investigation.w2scene:
  mq7001_fact_heard_noise
  mq7001_questgiver

== dlc/bob/data/quests/minor_quests/quest_files/mq7001_rest_in_peace/scenes/mq7001_06_charles_the_questgiver.w2scene:
  mq7001_notice

== dlc/bob/data/quests/minor_quests/quest_files/mq7001_rest_in_peace/scenes/mq7001_10_investigation_comments.w2scene:
  mq7001_questgiver

== dlc/bob/data/quests/minor_quests/quest_files/mq7001_rest_in_peace/scenes/mq7001_11_grave_robbers.w2scene:
  mq7001_knows_cards

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight.w2phase:
  mq7002_done
  mq7002_fact_bestiary_read
  mq7002_fact_cave_clues_found
  mq7002_fact_child_clues_found
  mq7002_fact_disable_talk_fiancee
  mq7002_fact_enable_fiancee
  mq7002_fact_fiancee_cry
  mq7002_fact_fire_box_01
  mq7002_fact_fire_box_02
  mq7002_fact_fire_box_03
  mq7002_fact_fire_box_04
  mq7002_fact_found_body
  mq7002_fact_investigation_complete
  mq7002_fact_knight_helmet_off
  mq7002_fact_knight_married
  mq7002_fact_knight_no_chat
  mq7002_fact_monster_info
  mq7002_fact_monster_info_from_fiancee
  mq7002_fact_open_wall
  mq7002_fact_plants_burning
  mq7002_fact_quest_start_no_fiancee
  mq7002_fact_spawn_turret
  mq7002_fact_spawn_turret_02
  mq7002_fact_temp_spoke_to_fiancee
  mq7002_grottore_dead
  mq7002_helping_knight
  mq7002_knight_died
  mq7002_met_by_cave
  mq7002_monster_killed
  mq7002_took_quest_fiancee
  mq7006_valor
  mq7006_valor_added_mq7002
  q704_done
  q704_long_night_starts
  vset_toussaint_knight_02_visor

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_00a_fiancee_proposal.w2scene:
  mq7002_fiancee_met

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_02_approach_knight.w2scene:
  mq7002_met_by_cave
  mq7002_met_in_camp
  mq7002_took_quest_fiancee
  sq701_geralt_armor
  sq701_ravix_armor

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_03c_investigation.w2scene:
  mq7002_knight_died

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_03d_spriggan_arrives.w2scene:
  mq7002_knight_died

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_05_defeated_cyclop.w2scene:
  mq7002_cold_feet
  mq7002_took_quest_fiancee

== dlc/bob/data/quests/minor_quests/quest_files/mq7002_stubborn_knight/scenes/mq7002_06_back_to_fiancee.w2scene:
  mq7002_cold_feet

== dlc/bob/data/quests/minor_quests/quest_files/mq7004_bleeding_tree.w2phase:
  mq7004_done
  mq7004_fact_got_help
  mq7004_fact_hide_scarf
  mq7004_fact_music_devil_dog
  mq7004_fact_music_ghost
  mq7004_fact_music_sad
  mq7004_fact_music_witch_fight_complete
  mq7004_fact_music_wraith
  mq7004_fact_music_wraith_dead
  mq7004_fact_spirit_out
  mq7004_fact_suspend_community
  mq7004_job_taken
  mq7004_knight_knows
  mq7004_notice
  mq7004_panther_lived
  mq7004_ritual_begins
  mq7004_saw_tree
  mq7004_storybook_read
  mq7004_tree_ghost_killed
  mq7004_witch_forced
  mq7004_witch_met
  mq7006_valor
  mq7006_valor_added_mq7004
  mq7006_wisdom
  mq7006_wisdom_added_mq7004
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/mq7004_bleeding_tree/scenes/mq7004_00_geralt_oneliners.w2scene:
  mq7004_knight_knows

== dlc/bob/data/quests/minor_quests/quest_files/mq7004_bleeding_tree/scenes/mq7004_01_lumberjack.w2scene:
  mq7004_heard_the_story
  mq7004_notice
  mq7004_saw_tree

== dlc/bob/data/quests/minor_quests/quest_files/mq7004_bleeding_tree/scenes/mq7004_03_witch.w2scene:
  mq7004_storybook_read

== dlc/bob/data/quests/minor_quests/quest_files/mq7004_bleeding_tree/scenes/mq7004_06_tree_spirit.w2scene:
  mq7004_fact_got_help
  mq7004_knight_knows

== dlc/bob/data/quests/minor_quests/quest_files/mq7006_the_paths_of_destiny.w2phase:
  cg700_tournament_done
  ff701_done
  mh701_complete
  mq7001_done
  mq7002_done
  mq7004_done
  mq7006_add_virtues
  mq7006_all_virtues
  mq7006_compassion
  mq7006_done
  mq7006_fail_compassion
  mq7006_fail_generosity
  mq7006_fail_honour
  mq7006_fail_wisdom
  mq7006_failed
  mq7006_generosity
  mq7006_hermit_fight
  mq7006_hermit_met
  mq7006_honour
  mq7006_load_sword_container
  mq7006_not_ready_yet
  mq7006_notice_taken
  mq7006_quest_taken
  mq7006_switch_fisher
  mq7006_valor
  mq7006_virtue_of_compassion_read
  mq7006_virtue_of_generosity_read
  mq7006_virtue_of_honour_read
  mq7006_virtue_of_valor_read
  mq7006_virtue_of_wisdom_read
  mq7006_wisdom
  mq7009_done
  mq7010_finished
  mq7015_done
  mq7017_done
  mq7018_done
  mq7021_done
  mq7023_done
  mq7024_hermit_ready
  q701_done
  q702_done
  q702_wight_killed
  q703_done
  q704_done
  q704_long_night_starts
  q705_completed
  sq701_done

== dlc/bob/data/quests/minor_quests/quest_files/mq7006_the_paths_of_destiny/scenes/mq7006_01_hermit.w2scene:
  mq7006_all_virtues
  mq7006_compassion
  mq7006_generosity
  mq7006_honour
  mq7006_valor
  mq7006_wisdom

== dlc/bob/data/quests/minor_quests/quest_files/mq7007_gargoyles.w2phase:
  mq7007_brazier01_lit
  mq7007_brazier02_lit
  mq7007_brazier03_lit
  mq7007_brazier04_lit
  mq7007_brazier05_lit
  mq7007_brazier06_lit
  mq7007_braziers_save_routine
  mq7007_clue_line_playing
  mq7007_done
  mq7007_elven_shield_on
  mq7007_elven_sword_on
  mq7007_fail_quest_poster
  mq7007_geralt_mask_on
  mq7007_kneel_ineraction_on
  mq7007_not_interested_end
  mq7007_quest_failed
  mq7007_shield_drawn
  mq7007_stupid_failsafe
  mq7007_time_lapse
  mq7007_time_lapse_message
  mq7007_traveler_left_alone
  mq7007_tribute_food_on
  mq7007_tribute_wine_on
  mq7007_villa_door_destroyed
  mq7007_villa_door_found
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/mq7007_gargoyles/scenes/mq7007_01_villa_nobleman.w2scene:
  mq7007_imma_witcher
  mq7007_question_1
  mq7007_question_2

== dlc/bob/data/quests/minor_quests/quest_files/mq7007_gargoyles/scenes/mq7007_02_traveler.w2scene:
  mq7007_villa_door_found

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter.w2phase:
  MeditationStarted
  mq7006_valor
  mq7006_valor_added_mq7009
  mq7009_04_dlg_finished
  mq7009_add_griffin
  mq7009_bought_painting
  mq7009_disable_vo_painter
  mq7009_dlg_nekker_paintings
  mq7009_done
  mq7009_dont_change_weather
  mq7009_griffon_fight
  mq7009_heroic_painting
  mq7009_hour_for_painting
  mq7009_mob_despawned
  mq7009_mus_07_painting
  mq7009_nekker_painting_look
  mq7009_paint_cave_started
  mq7009_painting_brothel
  mq7009_painting_horse
  mq7009_painting_ready
  mq7009_painting_timelapse
  mq7009_vo_griffon_attack
  mq7009_would_buy
  q704_done
  q704_long_night_starts
  sq701_geralt_armor
  sq701_reached_meadow

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/phases/mq7009_adding_painting.w2phase:
  mq7006_generosity
  mq7006_generosity_added_mq7009
  mq7009_add_griffin
  mq7009_heroic_painting
  mq7009_mob_despawned
  mq7009_painting_bought
  mq7009_painting_horse
  sq701_geralt_armor

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_02_proposition.w2scene:
  mq7009_painter_met

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_03_lets_go.w2scene:
  mq7009_already_agreed

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_07_painting.w2scene:
  mq7009_french_girl_painting
  mq7009_heroic_painting
  mq7009_painting_horse

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_09_mob_talking.w2scene:
  mq7009_add_griffin
  mq7009_french_girl_painting
  mq7009_french_girl_pose
  mq7009_heroic_painting
  mq7009_painting_horse

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_10_painter_ab_painting.w2scene:
  mq7009_add_griffin
  mq7009_heroic_painting
  mq7009_painting_bought
  mq7009_painting_horse
  mq7009_would_buy
  sq701_geralt_armor

== dlc/bob/data/quests/minor_quests/quest_files/mq7009_painter/scenes/mq7009_painter_vset.w2scene:
  mq7009_disable_vo_painter
  mq7009_vo_griffon_attack

== dlc/bob/data/quests/minor_quests/quest_files/mq7010_airborne_cattle.w2phase:
  actor_mq7010_rotfiend_was_killed
  foreman_dd_start
  foreman_dd_stop
  foreman_oneliner_start
  mq7006_valor
  mq7006_valor_added_mq7010
  mq7010_autopsy_done
  mq7010_big_blood_trail_found
  mq7010_both_draco_killed
  mq7010_chats_off
  mq7010_completed
  mq7010_cow_corpse_clue_found
  mq7010_cow_seen
  mq7010_dracolizard_circle_start
  mq7010_dracolizard_circle_stop
  mq7010_end_draco_blood_found
  mq7010_final_flight_blood_trail
  mq7010_finished
  mq7010_mother_tracks_found
  mq7010_nest_burnt
  mq7010_notice_taken
  mq7010_oszluzg_known
  mq7010_oszluzgs_killed_comm
  mq7010_show_fake_trophy
  mq7010_small_blood_trail_found
  mq7010_taken
  mq7010_trophy_got
  mq7010_update_statue
  mq7010_walk_blood_trail_found
  mq7010_weak_dracolizard_circle_start
  mq7010_weak_dracolizard_circle_stop
  mq7010_worker_chats
  poi_pleg_final_timelapse_message
  poi_pleg_statue

== dlc/bob/data/quests/minor_quests/quest_files/mq7010_airborne_cattle/scenes/mq7010_01_hook_interrupt.w2scene:
  mq7010_notice_taken

== dlc/bob/data/quests/minor_quests/quest_files/mq7010_airborne_cattle/scenes/mq7010_02_cow_autopsy.w2scene:
  mq7010_begin_done
  mq7010_claw_marks
  mq7010_crater
  mq7010_emilien
  mq7010_ripped_guts

== dlc/bob/data/quests/minor_quests/quest_files/mq7010_airborne_cattle/scenes/mq7010_04_gp_foreman_outro.w2scene:
  poi_pleg_statue

== dlc/bob/data/quests/minor_quests/quest_files/mq7011_wheres_my_money.w2phase:
  mq7011_angry_que_ff
  mq7011_bank_banned
  mq7011_bank_entered
  mq7011_bank_locked_attempt
  mq7011_break_time
  mq7011_cianfanelli_by_vault
  mq7011_clerk_a_heard
  mq7011_clerk_b_door_tried
  mq7011_clerk_b_heard
  mq7011_clerks_done
  mq7011_closed_heard
  mq7011_completed
  mq7011_done
  mq7011_downstairs_comment
  mq7011_ff_done
  mq7011_ff_won
  mq7011_fistfight
  mq7011_geralt_teleported_out
  mq7011_knows_secret
  mq7011_leaving_scene_seen
  mq7011_looking_for_clerk_a
  mq7011_present_given
  mq7011_reward_ready
  mq7011_taken
  mq7011_trigger_angry_man
  mq7011_vault_door_attempt
  mq7011_vault_door_open
  mq7011_wine_owner_met
  q701_veteran_cmnts_prgrs
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/mq7011_wheres_my_money/scenes/mq7011_02_clerk_a.w2scene:
  mq7011_202first
  mq7011_clerk_a_heard
  mq7011_knows_secret

== dlc/bob/data/quests/minor_quests/quest_files/mq7011_wheres_my_money/scenes/mq7011_02_clerk_b.w2scene:
  mq7011_clerk_b_heard

== dlc/bob/data/quests/minor_quests/quest_files/mq7011_wheres_my_money/scenes/mq7011_02_clerk_e.w2scene:
  mq7011_bye
  mq7011_clerk_b_heard
  mq7011_e_bribe
  mq7011_taken

== dlc/bob/data/quests/minor_quests/quest_files/mq7011_wheres_my_money/scenes/mq7011_03_cianfanelli_intervention.w2scene:
  mq7011_cianfanelli_met
  mq7011_gimme

== dlc/bob/data/quests/minor_quests/quest_files/mq7015_souvenir.w2phase:
  mq7006_compassion
  mq7006_compassion_added_mq7015
  mq7006_honour
  mq7006_honour_added_mq7015
  mq7015_balls_gone_reported
  mq7015_balls_to_hugues
  mq7015_been_to_hugues
  mq7015_caretaker_talking
  mq7015_close_hugues_door
  mq7015_cloth_found
  mq7015_crowd_leaves
  mq7015_done
  mq7015_ff_lost
  mq7015_has_balls
  mq7015_hugues_concluded
  mq7015_hugues_door_opened
  mq7015_hugues_obituary_read
  mq7015_lock_caretakers_door
  mq7015_move_caretaker
  mq7015_move_tourists
  mq7015_notice
  mq7015_scent_mp
  mq7015_taken
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/mq7015_souvenir/scenes/mq7015_02_caretaker_dialog.w2scene:
  mq7015_caretaker_met
  mq7015_notice

== dlc/bob/data/quests/minor_quests/quest_files/mq7015_souvenir/scenes/mq7015_03_caretaker_near_statue.w2scene:
  mq7015_has_balls
  mq7015_took_balls
  mq7015_when_it_happened

== dlc/bob/data/quests/minor_quests/quest_files/mq7017_talking_horse.w2phase:
  mq7006_compassion
  mq7006_compassion_added_mq7017
  mq7006_generosity
  mq7006_generosity_added_mq7017
  mq7006_valor
  mq7006_valor_added_mq7017
  mq7017_done
  mq7017_fact_abort_music
  mq7017_fact_begin_music_manager
  mq7017_fact_clue
  mq7017_fact_hallucination_effect
  mq7017_fact_hallucination_effect_remove
  mq7017_fact_hermit_angry
  mq7017_fact_hermit_dies
  mq7017_fact_hermit_hates_geralt
  mq7017_fact_hermit_is_dead
  mq7017_fact_investigation_complete
  mq7017_fact_medallion
  mq7017_fact_music_end_fight
  mq7017_fact_music_end_harp
  mq7017_fact_music_fade_roach
  mq7017_fact_music_investigation_second
  mq7017_fact_music_panther_begin
  mq7017_fact_music_panther_fight
  mq7017_fact_music_race
  mq7017_fact_music_roach_theme
  mq7017_fact_music_spirit_arrives
  mq7017_fact_music_spirit_fight
  mq7017_fact_music_spirit_forgive
  mq7017_fact_pillow_clue
  mq7017_fact_race_abort_complete
  mq7017_fact_race_against_zmora
  mq7017_fact_race_done
  mq7017_fact_roach_scene_done
  mq7017_fact_spirit_fought
  mq7017_fact_warning_displayed
  mq7017_hermit_dd_start
  mq7017_mq7006_generosity_add
  mq7017_show_time_lapse
  q110_refused_reward

== dlc/bob/data/quests/minor_quests/quest_files/mq7017_talking_horse/mq7017_hermit_default.w2phase:
  mq7017_fact_flaggelant
  mq7017_fact_hermit_angry
  mq7017_fact_hermit_is_dead
  mq7017_hermit_dd_start
  mq7017_hermit_dd_stop

== dlc/bob/data/quests/minor_quests/quest_files/mq7017_talking_horse/scenes/mq7017_00_hermit_default.w2scene:
  mq7017_fact_flaggelant

== dlc/bob/data/quests/minor_quests/quest_files/mq7017_talking_horse/scenes/mq7017_2_meet_hermit.w2scene:
  mq7017_hermit_met

== dlc/bob/data/quests/minor_quests/quest_files/mq7017_talking_horse/scenes/mq7017_8_return_to_hermit.w2scene:
  mq7017_fact_potatoes
  mq7017_payment_accepted

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one.w2phase:
  MeditationStarted
  mq7006_compassion
  mq7006_compassion_added_mq7018
  mq7006_generosity
  mq7006_generosity_added_mq7018
  mq7006_valor
  mq7006_valor_added_mq7018
  mq7018_active
  mq7018_actors_cleaned_up
  mq7018_barrels_done
  mq7018_basilisk_alive
  mq7018_basilisk_dead
  mq7018_basilisk_spawn
  mq7018_conclusion_playing
  mq7018_contract_found
  mq7018_count_arrived
  mq7018_count_screaming
  mq7018_done
  mq7018_endscene_played
  mq7018_failed
  mq7018_first_clue_checked
  mq7018_generosity
  mq7018_gp_last_one
  mq7018_hunters_despawn
  mq7018_music_peace
  mq7018_music_suspense
  mq7018_music_tense
  mq7018_player_left_fight
  mq7018_poison_done
  mq7018_poster_warning_read
  mq7018_scale_done
  mq7018_scale_found
  mq7018_scene_playing
  mq7018_stash_disabled
  mq7018_trophy_taken

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one/phases/mq7018_lw_switches.w2phase:
  MeditationStarted
  bonus_mq7018_1
  bonus_mq7018_2
  mq7018_basilisk_alive
  mq7018_basilisk_dead
  mq7018_failed

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one/scenes/mq7018_00_camp.w2scene:
  mq7018_contract_found

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one/scenes/mq7018_01_meeting_count.w2scene:
  mq7018_01_info_given
  mq7018_poster_warning_read

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one/scenes/mq7018_02_way_to_nest.w2scene:
  mq7018_barrels_done
  mq7018_count_arrived
  mq7018_poison_done
  mq7018_scale_done

== dlc/bob/data/quests/minor_quests/quest_files/mq7018_last_one/scenes/mq7018_03_basilisk_nest.w2scene:
  mq7018_melee

== dlc/bob/data/quests/minor_quests/quest_files/mq7020_songs_of_glory.w2phase:
  mq7020_all_attack
  mq7020_barbers_house_done
  mq7020_bard_stops_following
  mq7020_bard_stops_singing
  mq7020_beau_duvall_weapon_hit_by_GERALT
  mq7020_diary_read
  mq7020_done
  mq7020_echinops_done
  mq7020_echinops_reached
  mq7020_fight_failsafe
  mq7020_important_scene_playing
  mq7020_investigation_done
  mq7020_investigation_skipped
  mq7020_jar_found_01
  mq7020_jar_found_02
  mq7020_jar_found_03
  mq7020_jars_found
  mq7020_jean_louis_ludovic_present
  mq7020_le_papillion_road_oneliner_start
  mq7020_le_papillion_road_oneliner_stop
  mq7020_long_night_door_objective
  mq7020_long_night_examine_objective
  mq7020_no_progress_in_long_time
  mq7020_one_jar_found
  mq7020_quest_initial_refused
  mq7020_quest_taken
  mq7020_riverside_path_done
  mq7020_squires_weapon_hit_by_GERALT
  mq7020_switch_doors_to_aardable
  mq7020_thugs_heard
  q704_done
  q704_long_night_starts
  sq701_papillon_free
  what_the_hell

== dlc/bob/data/quests/minor_quests/quest_files/mq7020_songs_of_glory/scenes/mq7020_02_hook_dialog.w2scene:
  mq7020_02_fact2
  mq7020_door_blown
  mq7020_door_blown_no_quest
  mq7020_le_papillon_met
  mq7020_refused_once
  q705_henrietta_dead
  sq701_geralt_armor

== dlc/bob/data/quests/minor_quests/quest_files/mq7020_songs_of_glory/scenes/mq7020_03a_bard_at_barbers_onliners.w2scene:
  mq7020_no_progress_in_long_time

== dlc/bob/data/quests/minor_quests/quest_files/mq7020_songs_of_glory/scenes/mq7020_04_geralt_investigation.w2scene:
  mq7020_first_jar_shorter
  mq7020_jars_found

== dlc/bob/data/quests/minor_quests/quest_files/mq7020_songs_of_glory/scenes/mq7020_05_le_papillon_commenting.w2scene:
  mq7020_traces_found
  q705_henrietta_dead

== dlc/bob/data/quests/minor_quests/quest_files/mq7021_left_behind.w2phase:
  mq7006_honour
  mq7006_honour_added_mq7021
  mq7006_wisdom
  mq7006_wisdom_added_mq7021
  mq7021_Ill_help
  mq7021_brothers_met
  mq7021_cave_found
  mq7021_clue_blood_splat_found
  mq7021_clue_chest_found
  mq7021_done
  mq7021_fabrice_found
  mq7021_fabrice_rescued
  mq7021_fdb_filter_given
  mq7021_fdb_notice_read
  mq7021_fdb_spawn_thugs
  mq7021_found_fabrice
  mq7021_hot_room_comment_made
  mq7021_hugo_tavern_owner
  mq7021_kikimoe_dead
  mq7021_left_behind_contract_taken
  mq7021_left_behind_quest_taken
  mq7021_on_blood_trail
  mq7021_quest_not_taken
  mq7021_return_to_brothers
  q704_done
  q704_long_night_starts

== dlc/bob/data/quests/minor_quests/quest_files/mq7021_left_behind/scenes/mq7021_02_brothers_vs_geralt_outside.w2scene:
  mq7021_back
  mq7021_fdb_notice_read
  mq7021_negotiation_success

== dlc/bob/data/quests/minor_quests/quest_files/mq7021_left_behind/scenes/mq7021_04_find_missing_guy.w2scene:
  mq7021_fdb_filter_given
  mq7021_help_filter
  mq7021_screw

== dlc/bob/data/quests/minor_quests/quest_files/mq7021_left_behind/scenes/mq7021_07_fabrice_dlg.w2scene:
  mq7021_hugo_tavern_owner

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations.w2phase:
  mq7006_generosity
  mq7006_generosity_added_mq7023
  mq7023_aard_widow_trace
  mq7023_check_map
  mq7023_close_contraption
  mq7023_container_inspected
  mq7023_contract_taken
  mq7023_contraption_placed_mq7023_energy_crystal
  mq7023_contraption_placed_mq7023_venom
  mq7023_cp_mq7023_megascope_crystal_2
  mq7023_cp_mq7023_megascope_crystal_4
  mq7023_crystal_placed_mq7023_megascope_crystal_2
  mq7023_crystal_placed_mq7023_megascope_crystal_4
  mq7023_crystals_bypass
  mq7023_cube_enter
  mq7023_cube_exit
  mq7023_done
  mq7023_exit_activated
  mq7023_first_crystal_done
  mq7023_found_grave
  mq7023_found_hevel
  mq7023_gargoyle_hidden
  mq7023_grave_poster_14_read
  mq7023_grave_poster_15_read
  mq7023_grave_poster_16_read
  mq7023_grave_poster_17_read
  mq7023_grave_poster_18_read
  mq7023_grave_poster_1_read
  mq7023_grave_poster_3_read
  mq7023_grave_poster_4_read
  mq7023_grave_poster_5_read
  mq7023_grave_poster_6_read
  mq7023_grave_poster_7_read
  mq7023_hint_playing
  mq7023_inspected_lid
  mq7023_jr_continue_10
  mq7023_jr_continue_11
  mq7023_jr_continue_8
  mq7023_jr_continue_9
  mq7023_jr_explore_1
  mq7023_jr_explore_2
  mq7023_jr_explore_3
  mq7023_jr_explore_4
  mq7023_jr_explore_5
  mq7023_jr_explore_6
  mq7023_jr_explore_7
  mq7023_jr_proceed_12
  mq7023_jr_proceed_13
  mq7023_jr_resume_13
  mq7023_jrn_look_grave
  mq7023_jrn_search_grave
  mq7023_jrn_track_robber
  mq7023_megascope_1
  mq7023_megascope_2
  mq7023_megascope_3
  mq7023_megascope_container
  mq7023_megascope_crystal_2_placed
  mq7023_megascope_crystal_4_placed
  mq7023_megascope_entry_2_played
  mq7023_megascope_entry_4_played
  mq7023_megascope_examined
  mq7023_megascope_missing
  mq7023_megascope_played
  mq7023_messenger_met
  mq7023_messenger_scene
  mq7023_oneliner_playing
  mq7023_open_contraption
  mq7023_pillow_active
  mq7023_qayin_alive
  mq7023_remains_examined
  mq7023_right_teleport
  mq7023_romance_triss
  mq7023_romance_yen
  mq7023_teleport_help
  mq7023_teleported
  mq7023_tipped_kid
  mq7023_to_lab
  mq7023_to_room_A
  mq7023_to_room_B
  mq7023_to_room_B_progress
  mq7023_to_room_C
  mq7023_to_room_C_progress
  mq7023_trigger_1_hit
  mq7023_trigger_2_hit
  mq7023_trigger_3_hit
  mq7023_trigger_4_hit
  mq7023_underwater_exit
  mq7023_wrong_teleport
  q309_triss_lover
  q701_ah_race_inprogress
  q704_done
  q704_long_night_starts
  ranged_weapon_shoot_start
  sq202_yen_girlfriend
  th700_fire_pillar_done
  th700_fire_pillar_full
  th700_fire_pillar_placed_th700_air_stone
  th700_fire_pillar_placed_th700_earth_stone
  th700_fire_pillar_placed_th700_fire_stone
  th700_fire_pillar_placed_th700_water_stone
  th700_wrong_stone

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations/phases/mq7023_underwater_tp.w2phase:
  mq7023_jr_continue_10
  mq7023_jr_continue_11
  mq7023_jr_continue_8
  mq7023_jr_continue_9
  mq7023_jr_explore_1
  mq7023_jr_explore_2
  mq7023_jr_explore_3
  mq7023_jr_explore_4
  mq7023_jr_explore_5
  mq7023_jr_explore_6
  mq7023_jr_explore_7
  mq7023_jr_proceed_12
  mq7023_jr_proceed_13
  mq7023_jr_resume_13
  mq7023_jr_resume_14
  mq7023_jr_resume_A
  mq7023_underwater_entry

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations/scenes/mq7023_01_letter.w2scene:
  mq7023_love_music
  mq7023_romance_triss
  mq7023_romance_yen

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations/scenes/mq7023_02_cemetery_oneliners.w2scene:
  mq7023_romance_triss

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations/scenes/mq7023_03b_megascope.w2scene:
  mq7023_comment1
  mq7023_comment2
  mq7023_lets_do_this
  mq7023_megascope_crystal_2_placed
  mq7023_megascope_crystal_4_placed
  mq7023_megascope_entry_1_played
  mq7023_megascope_entry_3_played
  mq7023_megascope_entry_5_played

== dlc/bob/data/quests/minor_quests/quest_files/mq7023_mutations/scenes/mq7023_05_lab_oneliners.w2scene:
  mq7023_megascope_played

== dlc/bob/data/quests/minor_quests/quest_files/mq7024_home.w2phase:
  AlchemyTableExists
  HouseMeditationTrigger
  StablesExists
  butler_dd_stop
  lw_ww_butcher_of_blaviken_wine
  lw_ww_first_shipment
  lw_ww_geralt_of_rivia_wine
  lw_ww_white_wolf_wine
  mq7024_24h_passed
  mq7024_alch_table_found
  mq7024_alchemy_table_mentioned
  mq7024_all_upgrades_comment
  mq7024_all_upgrades_done
  mq7024_armor_stands_2_start
  mq7024_armor_table_start
  mq7024_bed_upgrade_start
  mq7024_bed_upgraded
  mq7024_blackscreen_on
  mq7024_cellar_go_now
  mq7024_deck_medium
  mq7024_deck_monsters
  mq7024_deck_nilfgaard
  mq7024_deck_northern
  mq7024_deck_scoiatael
  mq7024_deck_skellige
  mq7024_deck_strong
  mq7024_done
  mq7024_finale_dial_timelapse
  mq7024_finale_timelapse_message
  mq7024_frontyard_tier1_comm
  mq7024_frontyard_tier2_comm
  mq7024_frontyard_upgrades_available
  mq7024_garden_done
  mq7024_garden_in_progress
  mq7024_garden_upgrade_start
  mq7024_guest_room_done
  mq7024_guest_room_start
  mq7024_house_tier1_comm
  mq7024_house_tier2_comm
  mq7024_house_upgrades_available
  mq7024_new_upgrade_a
  mq7024_new_upgrade_b
  mq7024_objective_count
  mq7024_renovation_comment
  mq7024_renovation_done
  mq7024_renovation_in_progress
  mq7024_renovation_start
  mq7024_skip_message_armor_stands
  mq7024_skip_message_armor_table
  mq7024_skip_message_bed
  mq7024_skip_message_garden
  mq7024_skip_message_guest_room
  mq7024_skip_message_renovation
  mq7024_skip_message_stable
  mq7024_skip_message_weapon_stands
  mq7024_skip_message_whetstone
  mq7024_stable_upgrade_start
  mq7024_stables_in_progress
  mq7024_start
  mq7024_trip02_shrug
  mq7024_trip_cellar_bow
  mq7024_trip_done
  mq7024_trip_gazebo_go
  mq7024_trip_oneline_start
  mq7024_trip_oneline_stop
  mq7024_trip_timelapse_message
  mq7024_wait_48h
  mq7024_wall_destroyed
  mq7024_weapon_stands_2_start
  mq7024_whetstone_start
  q702_play_buttler_scene
  q704_long_night_starts
  q705_butler_intro_done

== dlc/bob/data/quests/minor_quests/quest_files/th700_red_wolf.w2phase:
  th700_bruxa_reveal1
  th700_bruxa_reveal2
  th700_crypt_done
  th700_crypt_prayers1_read
  th700_crypt_prayers2_read
  th700_crypt_prayers3_read
  th700_crypt_prayers4_read
  th700_crypt_prayers5_read
  th700_crypt_prayers6_read
  th700_crypt_started
  th700_first_time_cough
  th700_found_troll_chapel
  th700_gave_beggar_money
  th700_hallucinations_active
  th700_lake_bandits_done
  th700_lake_done
  th700_lake_started
  th700_passed_trial
  th700_preacher_bones_rest
  th700_prison_done
  th700_prison_started
  th700_red_wolf_complete
  th700_started
  th700_troll_chapel_done
  th700_vault_done
  th700_vault_started
  th701_fdb_hunts_started
  th701_has_any_diagram

== dlc/bob/data/quests/minor_quests/quest_files/th700_red_wolf/scenes/th700_01_prison_oneliners.w2scene:
  th700_crypt_done

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear.w2phase:
  q704_done
  q704_long_night_starts
  slavko_met
  th700_red_wolf_asked
  th700_red_wolf_complete
  th701_archmaster_found
  th701_ask_zravko
  th701_bear_asked
  th701_cat_asked
  th701_contract_taken
  th701_fdb_bear_complete
  th701_fdb_cat_complete
  th701_fdb_gryphon_complete
  th701_fdb_hunts_started
  th701_fdb_wolf_complete
  th701_find_archmaster
  th701_griffin_asked
  th701_jrn_ask_witchers
  th701_jrn_find_archmaster
  th701_jrn_find_zdravko
  th701_jrn_report_zdravko
  th701_meta_complete
  th701_wolf_asked
  th701_wraith_seal_open

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear/th701_bear/scenes/th701_bear_oneliners.w2scene:
  mh701_matriarch_dead

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear/th701_bear/th701_bear.w2phase:
  th701_bear_started
  th701_fdb_bear_boots_looted
  th701_fdb_bear_cave_looted
  th701_fdb_bear_complete
  th701_fdb_bear_gloves_looted
  th701_fdb_bear_jacket_looted
  th701_fdb_bear_pants_looted
  th701_fdb_bear_silver_looted
  th701_fdb_bear_steel_looted
  th701_found_bear_mark

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear/th701_cat/th701_cat.w2phase:
  th701_cat_started
  th701_fdb_cat_boots_looted
  th701_fdb_cat_complete
  th701_fdb_cat_gloves_looted
  th701_fdb_cat_jacket_looted
  th701_fdb_cat_pants_looted
  th701_fdb_cat_silver_looted
  th701_fdb_cat_steel_looted
  th701_fdb_estate_door_locked

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear/th701_griffin/th701_gryphon.w2phase:
  mq7023_dust_played
  th701_activate_search_prison
  th701_dust_played
  th701_fdb_cat_complete
  th701_fdb_gryphon_boots_looted
  th701_fdb_gryphon_complete
  th701_fdb_gryphon_gloves_looted
  th701_fdb_gryphon_jacket_looted
  th701_fdb_gryphon_pants_looted
  th701_fdb_gryphon_silver_looted
  th701_fdb_gryphon_steel_looted
  th701_fdb_lever_on
  th701_fdb_prison_complete
  th701_fdb_ruins_portal_used
  th701_griffin_portal_active
  th701_griffin_started
  th701_keystone_placed

== dlc/bob/data/quests/minor_quests/quest_files/th701_archmastergear/th701_wolf/th701_wolf.w2phase:
  th701_fdb_wolf_boots_looted
  th701_fdb_wolf_complete
  th701_fdb_wolf_gloves_looted
  th701_fdb_wolf_jacket_looted
  th701_fdb_wolf_pants_looted
  th701_fdb_wolf_silver_looted
  th701_fdb_wolf_steel_looted
  th701_wolf_started
  th701_wraith_seal_open

== dlc/bob/data/quests/monster_hunts/mh701_tectonic_terror.w2phase:
  MeditationStarted
  mh701_cellar_door_unlocked
  mh701_cellar_explored
  mh701_cellar_wall_destroyed
  mh701_complete
  mh701_contract_taken
  mh701_done
  mh701_eggs_destroyed
  mh701_eggs_detected
  mh701_entered_tunnels
  mh701_found_lair
  mh701_geralt_speaking
  mh701_kikimora_egg_destoryed
  mh701_locket_collected
  mh701_locket_given_to_owner
  mh701_locket_returned
  mh701_matriarch_dead
  mh701_mushroom_counter_start
  mh701_nest_kikimore_dead
  mh701_oneliner_pause1
  mh701_pit_explored
  mh701_quest_taken
  mh701_sharley_escaped
  mh701_sharley_lure_potion_used
  mh701_sharley_tense_music
  mh701_trees_found
  mh701_wall_destroyed
  mq7006_compassion
  mq7006_compassion_added_mh701
  mq7006_valor
  mq7006_valor_added_mh701

== dlc/bob/data/quests/monster_hunts/quest_files/mh701_tectonic_terror/scenes/mh701_01_quartermaster_startpoint.w2scene:
  mh701_contract_taken
  mh701_deal_made
  mh701_fact_quartermaster_met
  mh701_think_thru
  mh701_will_call_mister
  mh701_witness_1
  mh701_witness_2

== dlc/bob/data/quests/monster_hunts/quest_files/mh701_tectonic_terror/scenes/mh701_02_vineyard_owner_wife.w2scene:
  mh701_eggs_destroyed
  mh701_wife_question_1
  mh701_wife_question_2

== dlc/bob/data/quests/monster_hunts/quest_files/mh701_tectonic_terror/scenes/mh701_04_quartermaster_hunt_complete.w2scene:
  mh701_locket_given_to_owner
  mh701_matriarch_dead
  mh701_wife_has_locket
  mh701_will_call_mister

== dlc/bob/data/quests/secondary_npcs/default_dialogues/default_bootblack.w2scene:
  bootblack_boy_met
  ep2_main_story_done
  q702_bootblack_bribed

== dlc/bob/data/quests/secondary_npcs/default_dialogues/default_butler.w2scene:
  butler_met
  lw_ww_first_shipment
  mq7024_about_upgrades
  mq7024_alch_table_found
  mq7024_all_upgrades_comment
  mq7024_all_upgrades_done
  mq7024_armor_stands_2_start
  mq7024_armor_table_start
  mq7024_bed_upgrade_start
  mq7024_butler_gwent
  mq7024_cellar_go_now
  mq7024_deck_medium
  mq7024_deck_monsters
  mq7024_deck_nilfgaard
  mq7024_deck_northern
  mq7024_deck_scoiatael
  mq7024_deck_skellige
  mq7024_deck_strong
  mq7024_disable_frontyard_choice
  mq7024_disable_house_choice
  mq7024_for_frontyard
  mq7024_frontyard_that_is
  mq7024_frontyard_tier1_comm
  mq7024_frontyard_tier2_comm
  mq7024_frontyard_upgrades_available
  mq7024_garden_upgrade_start
  mq7024_guest_room_start
  mq7024_house_tier2_comm
  mq7024_house_upgrades_available
  mq7024_new_upgrade_a
  mq7024_new_upgrade_b
  mq7024_renovation_comment
  mq7024_renovation_done
  mq7024_renovation_start
  mq7024_stable_upgrade_start
  mq7024_tell_me_more
  mq7024_trip_done
  mq7024_weapon_stands_2_start
  mq7024_whetstone_start
  q702_butler_met
  q702_marlene_is_eating
  q702_marlene_story
  q704_long_night_starts
  q705_guest_waiting
  q705_henrietta_dead

== dlc/bob/data/quests/secondary_npcs/default_dialogues/default_quarry_foreman.w2scene:
  mq7010_completed
  mq7010_cow_corpse_clue_found
  mq7010_finished
  mq7010_foreman_met
  mq7010_lw_lebioda_hint
  mq7010_more_info_heard
  mq7010_nest_burnt
  mq7010_taken
  poi_pleg_statue_done

== dlc/bob/data/quests/secondary_npcs/default_dialogues/default_slavko_atimstein.w2scene:
  MutationSystemEnabled
  slavko_met
  th700_red_wolf_complete
  th700_started
  th701_all_diagrams_found
  th701_all_witchers_heard
  th701_bear_started
  th701_cat_started
  th701_fdb_bear_complete
  th701_fdb_cat_complete
  th701_fdb_gryphon_complete
  th701_fdb_hunts_started
  th701_fdb_wolf_complete
  th701_griffin_started
  th701_has_any_diagram
  th701_quest_finished
  th701_show_off
  th701_witcher_asked
  th701_wolf_started

== dlc/bob/data/quests/secondary_npcs/default_dialogues/default_wight_woman.w2scene:
  q702_wight_woman_met

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_becauclair_bank_guard_01.w2scene:
  mq7011_bank_banned

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_becauclair_bank_guard_02.w2scene:
  mq7011_bank_banned

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_becauclair_bank_guard_03.w2scene:
  mq7011_bank_banned

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_damien.w2scene:
  q703_panthers_attack
  q705_henrietta_dead

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_guillaume.w2scene:
  guillaume_helmet_closed
  q701_giant_killed

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_kovir_nobleman.w2scene:
  sq703_completed

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_liam.w2scene:
  lw_ww_belgard_to_vermentino

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_mathilda.w2scene:
  lw_ww_belgard_to_coronata

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_milton.w2scene:
  milton_helmet_closed

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_palmerin.w2scene:
  vset_palmerin_visor

== dlc/bob/data/quests/secondary_npcs/voicesets/vset_poviss_wine_merchant.w2scene:
  poi_car_a_04_done

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/phases/sq701_shooting_range_tournament.w2phase:
  ranged_weapon_shoot_start
  shooting_range_sq701_target_geralt_01_was_hit
  shooting_range_sq701_target_geralt_02_was_hit
  shooting_range_sq701_target_geralt_03_was_hit
  shooting_range_sq701_target_geralt_04_was_hit
  shooting_range_sq701_target_geralt_05_was_hit
  shooting_range_sq701_target_geralt_06_was_hit
  shooting_range_sq701_target_geralt_07_was_hit
  shooting_range_sq701_target_geralt_08_was_hit
  shooting_range_sq701_target_geralt_09_was_hit
  shooting_range_sq701_target_horm_01_was_hit
  shooting_range_sq701_target_horm_02_was_hit
  shooting_range_sq701_target_horm_03_was_hit
  shooting_range_sq701_target_horm_04_was_hit
  shooting_range_sq701_target_horm_05_was_hit
  shooting_range_sq701_target_horm_06_was_hit
  shooting_range_sq701_target_horm_07_was_hit
  shooting_range_sq701_target_horm_08_was_hit
  shooting_range_sq701_target_horm_09_was_hit
  sq701_more_than_half
  sq701_target_horm_01_hit
  sq701_target_horm_02_hit
  sq701_target_horm_03_hit
  sq701_target_horm_04_hit
  sq701_target_horm_05_hit
  sq701_target_horm_06_hit
  sq701_target_horm_07_hit
  sq701_target_horm_08_hit
  sq701_target_horm_09_hit
  sq701_won_competitions

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_01_start_new.w2scene:
  sq701_01_hook_talked

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_02_tutorials.w2scene:
  sq701_fight_tutorial
  sq701_race_tutorial
  sq701_shoot_tutorial
  sq701_tutorials

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_03_registration.w2scene:
  q309_triss_lover
  sq202_yen_girlfriend

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_04_shooting_range_start.w2scene:
  sq701_geralt_armor
  sq701_gwent_01_won
  sq701_horm_half

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_05_shooting_range_end.w2scene:
  in_sq701_06_ds_shooting_range_end_talked
  sq701_geralt_armor
  sq701_won_competitions

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_08_race_start.w2scene:
  sq701_geralt_armor

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_09_race_end.w2scene:
  sq701_geralt_armor
  sq701_race_won

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_10_party.w2scene:
  sq701_clue_bruxa
  sq701_clue_illusions
  sq701_geralt_armor

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_11_duels.w2scene:
  sq701_anseis_duel_won
  sq701_tailles_fistfight_won

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_13_vivienne_tent.w2scene:
  sq701_clue_bruxa

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_14_meadow.w2scene:
  sq701_clue_bruxa

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_15_tent_guillaume.w2scene:
  sq701_geralt_armor
  sq701_guillaume_curse_secret

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_16_arena_team_start.w2scene:
  sq701_geralt_armor

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_17_arena_team_over.w2scene:
  sq701_geralt_armor
  sq701_won_arena
  sq701_won_competitions

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_18_gregoire.w2scene:
  lw_ww_got_wine
  sq701_geralt_armor
  sq701_vow_garter
  sq701_vow_heron
  sq701_vow_lady

== dlc/bob/data/quests/sidequests/quest_files/sq701_tournament/scenes/sq701_19_vivienne_decision.w2scene:
  sq701_told_guillaume
  sq701_told_guillaume_move_curse

== dlc/bob/data/quests/sidequests/quest_files/sq703_wine_wars/phases/sq703_lw_switches.w2phase:
  poi_gor_d_05_done
  sq703_investor_coronata
  sq703_investor_flovive
  sq703_investor_foxhollow
  sq703_investor_francollarts
  sq703_investor_travelling
  sq703_investor_vermentino

== dlc/bob/data/quests/sidequests/quest_files/sq703_wine_wars/scenes/sq703_00_contract.w2scene:
  sq703_active
  sq703_contract_refused

== dlc/bob/data/quests/sidequests/quest_files/sq703_wine_wars/scenes/sq703_01_safari_trip.w2scene:
  sq703_geralt_asslevel
  sq703_panthers_done
  sq703_panthers_killed
  sq703_peacock_ready
  sq703_peacocks_killed
  sq703_scene_01a_map
  sq703_scolopendro_discovered
  sq703_scolopendros_killed
  sq703_scolopendros_nest_01
  sq703_scolopendros_nest_01_bomb_hit
  sq703_scolopendros_nest_02
  sq703_scolopendros_nest_02_bomb_hit
  sq703_stormed_pit

== dlc/bob/data/quests/sidequests/quest_files/sq703_wine_wars/scenes/sq703_02_contract_completed.w2scene:
  sq703_geralt_asslevel

== dlc/bob/data/quests/sidequests/quest_files/sq703_wine_wars/scenes/sq703_03_picnic.w2scene:
  mq7024_trip_done
  sq703_picnic_completed

== dlc/bob/data/quests/sidequests/sq701_tournament.w2phase:
  NewGamePlus
  game_is_loaded
  mq7006_honour
  mq7006_honour_added_sq701
  mq7006_honour_sq701
  mq7006_valor
  mq7006_valor_sq701
  q602_geralt_possessed
  q701_ah_walks
  q701_opening_done
  q704_batswarm_05_stagger
  q704_done
  q704_long_night_starts
  ranged_weapon_shoot_start
  shooting_range_sq701_tut_target_01_was_hit
  shooting_range_sq701_tut_target_02_was_hit
  shooting_range_sq701_tut_target_03_was_hit
  shooting_range_sq701_tut_target_04_was_hit
  shooting_range_sq701_tut_target_05_was_hit
  shooting_range_sq701_tut_target_06_was_hit
  shooting_range_sq701_tut_target_wrong_was_hit
  sq701_add_laurels
  sq701_anseis_duel_won
  sq701_arena_active
  sq701_clue_bruxa
  sq701_clue_claw_marks
  sq701_clue_clothes
  sq701_clue_feather
  sq701_clue_illusions
  sq701_clue_naezan_salts
  sq701_clues_found
  sq701_delwyn_down
  sq701_delwyn_speaks
  sq701_done
  sq701_donimir_speaks
  sq701_duel_anseis
  sq701_duelled_w_anseis
  sq701_fight_tutorial
  sq701_finale_done
  sq701_finale_done_pond
  sq701_followed_bird
  sq701_geralt_armor
  sq701_guillaume_egg
  sq701_guillaume_egg_epilogue
  sq701_guillaume_pond_epilogue
  sq701_guillaume_start
  sq701_guy_down
  sq701_guy_speaks
  sq701_gwent_01_won
  sq701_horm_down
  sq701_horm_speaks
  sq701_horse_combat_tutorial_over
  sq701_horse_combat_tutorial_start
  sq701_knights_active
  sq701_lazaret
  sq701_llinos_down
  sq701_llinos_speaks
  sq701_lost_bird
  sq701_mirror_had_talk
  sq701_night_falls
  sq701_opposing_knight_down
  sq701_palmerin_down
  sq701_papillon_free
  sq701_race_active
  sq701_race_competition_active
  sq701_race_competition_track
  sq701_race_no_crossbow
  sq701_race_no_sword
  sq701_race_tut_no_crossbow
  sq701_race_tut_no_sword
  sq701_race_tutorial
  sq701_race_tutorial_active
  sq701_race_won
  sq701_rainfarn_speaks
  sq701_reached_meadow
  sq701_registration_switch
  sq701_shoot_comp_no_crossbow
  sq701_shoot_tut_no_crossbow
  sq701_shoot_tutorial
  sq701_shooting_range_competition_active
  sq701_shooting_range_early
  sq701_shooting_range_late
  sq701_shooting_range_start_active
  sq701_shooting_range_still_active
  sq701_shooting_range_tutorial_done
  sq701_shooting_range_vivienne_medaillon
  sq701_tailles_anseis_active
  sq701_tailles_fistfight_won
  sq701_target_race_01_hit
  sq701_target_race_02_hit
  sq701_target_race_03_hit
  sq701_target_race_04_hit
  sq701_target_race_05_hit
  sq701_target_race_06_hit
  sq701_target_race_07_hit
  sq701_target_race_tut_01_hit
  sq701_target_race_tut_02_hit
  sq701_told_guillaume
  sq701_tournament_ends
  sq701_turn_off_clues
  sq701_tutorial_shield
  sq701_vivienne_meadow
  sq701_vivienne_novigrad
  sq701_vivienne_speach
  sq701_won
  sq701_won_arena
  sq701_won_competitions
  sq701_won_tournament

== dlc/bob/data/quests/sidequests/sq703_wine_wars.w2phase:
  MeditationStarted
  mq7006_compassion
  mq7006_compassion_added_sq703
  q704_long_night_starts
  sq703_01b_sound_done
  sq703_active
  sq703_compassion
  sq703_completed
  sq703_contract_accepted
  sq703_contract_found
  sq703_contract_refused
  sq703_despawn_effect_started
  sq703_generic_trap_01_disarmed
  sq703_generic_trap_02_disarmed
  sq703_generic_trap_03_disarmed
  sq703_generic_trap_04_disarmed
  sq703_geralt_asslevel
  sq703_geralt_blinded
  sq703_gp_conversation_01_played
  sq703_investor_follow
  sq703_investor_sorry
  sq703_investor_travelling
  sq703_panther_run_off
  sq703_panthers_done
  sq703_panthers_killed
  sq703_panthers_started
  sq703_peacock_ready
  sq703_peacocks_done
  sq703_peacocks_killed
  sq703_picnic_ready
  sq703_poster_panther_read
  sq703_poster_peacock_read
  sq703_poster_scolopendro_read
  sq703_reward_painting_given
  sq703_scene_01a_map
  sq703_scene_01a_picture
  sq703_scene_playing
  sq703_scolopendro_01_axiied
  sq703_scolopendro_02_axiied
  sq703_scolopendro_discovered
  sq703_scolopendros_active
  sq703_scolopendros_done
  sq703_scolopendros_killed
  sq703_scolopendros_nest_01
  sq703_scolopendros_nest_01_bomb_hit
  sq703_scolopendros_nest_02
  sq703_scolopendros_nest_02_bomb_hit
  sq703_scolopendros_picture
  sq703_scolos_started
  sq703_spot_searching_start
  sq703_stormed_pit
  sq703_timejump
  sq703_timelapse_to_camp

== dlc/dlc10/data/quests/th1009_wolf/th1009_wolf.w2phase:
  q106_magic_oillamp_used
  th1009_comment_end
  th1009_fdb_boots_upgrade1_explored
  th1009_fdb_boots_upgrade2b_explored
  th1009_fdb_boots_upgrade3_explored
  th1009_fdb_boots_upgrade3b_explored
  th1009_fdb_ghost_cave_scene_done
  th1009_fdb_ghost_scene_done
  th1009_fdb_gloves_upgrade1_explored
  th1009_fdb_gloves_upgrade2b_explored
  th1009_fdb_gloves_upgrade3b_explored
  th1009_fdb_jacket_upgrade1_explored
  th1009_fdb_jacket_upgrade2_explored
  th1009_fdb_jacket_upgrade3_explored
  th1009_fdb_pants_upgrade1_explored
  th1009_fdb_pants_upgrade2b_explored
  th1009_fdb_pants_upgrade3b_explored
  th1009_fdb_silver_sword_looted
  th1009_fdb_silver_upgrade1_explored
  th1009_fdb_silver_upgrade2_explored
  th1009_fdb_silver_upgrade3_explored
  th1009_fdb_steel_sword_looted
  th1009_fdb_steel_upgrade1_explored
  th1009_fdb_steel_upgrade2_explored
  th1009_fdb_steel_upgrade3_explored
  th1009_fdb_upgrade_1b_a1_location
  th1009_fdb_upgrade_1b_b1_location
  th1009_fdb_upgrade_1b_c1_location
  th1009_fdb_upgrade_2a_location
  th1009_fdb_upgrade_2b_location
  th1009_fdb_upgrade_2ba_location
  th1009_fdb_upgrade_2bb_location
  th1009_fdb_upgrade_2bc_location
  th1009_fdb_upgrade_2c_location
  th1009_fdb_upgrade_3a_location
  th1009_fdb_upgrade_3b_location
  th1009_fdb_upgrade_3ba_location
  th1009_fdb_upgrade_3bb_location
  th1009_fdb_upgrade_3bc_location
  th1009_fdb_upgrade_3c_location
  th1009_fdb_upgrade_a1_a1_location
  th1009_fdb_upgrade_a1_b1_location
  th1009_fdb_upgrade_a1_c1_location
  th1009_fdb_upgrades_1a_done
  th1009_fdb_upgrades_1b_done
  th1009_fdb_upgrades_2_done
  th1009_fdb_upgrades_2b_done
  th1009_fdb_upgrades_3_done
  th1009_fdb_upgrades_3b_done
  th1009_fdb_varin_cave
  th1009_fdb_wolf_complete
  th1009_hieronim_note_read_first
  th1009_left_generator_active
  th1009_map_bear_upgrade3b
  th1009_map_wolf_upgrade1a
  th1009_map_wolf_upgrade1b
  th1009_map_wolf_upgrade2
  th1009_map_wolf_upgrade2b
  th1009_map_wolf_upgrade3
  th1009_right_generator_active
  th1009_tower_inspected
  th1009_tower_inspected_left
  th1009_tower_inspected_right
  th1009_use_lamp_played
  th1009_use_second_lamp_played

== dlc/dlc12/data/quest/mq2052_reversed_monster_hunt.w2phase:
  mq2052_fdb_boot_found
  mq2052_fdb_boulder_spot_found
  mq2052_fdb_cave_encounter
  mq2052_fdb_contract_found
  mq2052_fdb_convinced_monsters
  mq2052_fdb_killing_monsters
  mq2052_fdb_plan_discovered
  mq2052_fdb_quest_accepted
  mq2052_fdb_werewolf_comment

== dlc/dlc12/data/quest/quest_files/scenes/mq2052_03b_cave_blocked.w2scene:
  mq2052_fdb_boulder_spot_found

== dlc/dlc12/data/quest/quest_files/scenes/mq2052_06_finale.w2scene:
  mh201_cave_troll_spared
  mh303_succubus_spared
  mh305_doppler_kept_alive
  mq1057_convinced
  mq2052_fdb_first_argument
  mq2053_fdb_help_monster
  q105_johnny_voice_back
  q301_godling_sara_peacefully
  q401_helped_lambert
  q401_trolls_killed
  sq201_lied_2_morkvarg
  sq201_loan_shark_waiting

== dlc/dlc12/data/quest/quest_files/scenes/mq2052_06a_gameplay_oneliners.w2scene:
  mq2052_fdb_convinced_monsters

== dlc/dlc15/data/quests/mq1058_lynx_witcher.w2phase:
  mq1058_barn_necro_found
  mq1058_bomb_env_on
  mq1058_clue_elderman_found
  mq1058_girl_escorted
  mq1058_girls_tracks_stage_2_only
  mq1058_installed
  mq1058_investigation_done
  mq1058_job_taken
  mq1058_lock_movement
  mq1058_lynx_stash_opened
  mq1058_lynx_witcher_killed
  mq1058_necro_second_wave
  mq1058_stash_found
  mq1058_switch_barn_trigger
  mq1058_trigger_girl_hut
  mq1058_trigger_girl_trophy

== dlc/dlc15/data/quests/quest_files/scenes/mq1058_01_lynx_medallion.w2scene:
  mq1058_investigation_done

== dlc/dlc15/data/quests/quest_files/scenes/mq1058_02_child.w2scene:
  mq1058_doll_given
  mq1058_used_axii

== dlc/dlc15/data/quests/quest_files/scenes/mq1058_05_escort.w2scene:
  mq1058_accused
  mq1058_gold_given
  mq1058_lynx_witcher_killed
  mq1058_talked_girl

== dlc/dlc15/data/quests/quest_files/scenes/mq1058_geralt_oneliners.w2scene:
  mq1058_job_taken
  mq1058_medallion_found

== dlc/dlc2/data/quests/dlc2.w2phase:
  cg200_sjusta_active
  cg200_sjusta_defeated
  dlc2_installed

== dlc/dlc2/data/quests/scenes/shop_brokvar_barber_01.w2scene:
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark

== dlc/dlc2/data/quests/scenes/shop_glinsk_barber_01.w2scene:
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark
  shop_glinsk_barber_01_saved

== dlc/dlc2/data/quests/scenes/shop_kaer_trolde_sjusta.w2scene:
  import_geralt_has_tattoo
  q201_sjustamet
  q601_geralt_has_demon_mark
  sjusta_met

== dlc/dlc2/data/quests/scenes/shop_novi_poor_dist_drunk_barber_01.w2scene:
  import_geralt_has_tattoo
  novi_poor_drunk_barber_used
  q601_geralt_has_demon_mark

== dlc/dlc2/data/quests/scenes/shop_novi_rich_dist_barber_01.w2scene:
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark

== dlc/dlc2/data/quests/scenes/shop_whitebridge_barber_01.w2scene:
  import_geralt_has_tattoo
  q601_geralt_has_demon_mark

== dlc/dlc3/data/mh201_cave_troll.w2phase:
  mh201_body_found
  mh201_bones_found
  mh201_cave_troll_met
  mh201_cave_troll_spared
  mh201_cave_troll_weapon_hit_by_GERALT
  mh201_completed
  mh201_completed_troll_dead
  mh201_human_tracks_found
  mh201_initial_talk
  mh201_installed
  mh201_investigation_done
  mh201_job_taken
  mh201_trees_found
  mh201_troll_to_be_killed
  mh201_twist_discovered
  mh_201_total

== dlc/dlc3/data/scenes/mh201_04_reward.w2scene:
  actor_mh201_cave_troll_was_killed
  mh201_cave_troll_met
  mh201_contract_explained

== dlc/dlc3/data/scenes/mh201_geralt_oneliners.w2scene:
  mh201_forest_body_found

== dlc/dlc7/data/scenes/sq107_02_fool_after_harassment.w2scene:
  sq107_foolmet
  sq107_story_heard

== dlc/dlc7/data/scenes/sq107_03_fool.w2scene:
  sq107_knowwho
  sq107_location_known
  sq107_pig_decoded
  sq107_pig_villager_inspect
  sq107_receptacle_clue
  sq107_vault_explore_taken

== dlc/dlc7/data/scenes/sq107_03b_geralt_vault_oneliners.w2scene:
  sq107_marks_inspected

== dlc/dlc7/data/scenes/sq107_03b_vault_pig.w2scene:
  sq107_goldseen
  sq107_pig_decoded
  sq107_pig_topic1
  sq107_pig_topic2
  sq107_pig_topic3
  sq107_vault_pig_met

== dlc/dlc7/data/scenes/sq107_04_geralt_drives_pigs.w2scene:
  sq107_mnstr_atk

== dlc/dlc7/data/scenes/sq107_07_curse_removed.w2scene:
  sq107_pigs_in_herd

== dlc/dlc7/data/sq107_pigs.w2phase:
  actor_sq107_looters_vault_was_killed
  actor_sq107_lve_was_killed
  actor_sq107_pig_was_killed
  sq107_activate_pig_count
  sq107_alphapig1_follow
  sq107_alphapig1_unfollow
  sq107_alphapig2_follow
  sq107_alphapig2_unfollow
  sq107_alphapig3_follow
  sq107_alphapig3_unfollow
  sq107_alphapig4_follow
  sq107_alphapig4_unfollow
  sq107_clue_01
  sq107_clue_02
  sq107_complete
  sq107_curse_clues
  sq107_fact_available
  sq107_fdb_fool_points
  sq107_fdb_found_receptacle
  sq107_fdb_full_village
  sq107_fdb_half_village
  sq107_fdb_no_village
  sq107_first_pig
  sq107_fool_stfu
  sq107_fool_wander_start
  sq107_fool_wander_stop
  sq107_force_fool
  sq107_marauders_interacted
  sq107_p01_normalpig1_follow
  sq107_p01_normalpig1_unfollow
  sq107_p01_normalpig2_follow
  sq107_p01_normalpig2_unfollow
  sq107_p01_normalpig3_follow
  sq107_p01_normalpig3_unfollow
  sq107_p02_normalpig1_follow
  sq107_p02_normalpig1_unfollow
  sq107_p02_normalpig2_follow
  sq107_p02_normalpig2_unfollow
  sq107_p02_normalpig3_follow
  sq107_p02_normalpig3_unfollow
  sq107_p02_normalpig4_follow
  sq107_p02_normalpig4_unfollow
  sq107_p03_normalpig1_follow
  sq107_p03_normalpig1_unfollow
  sq107_p03_normalpig2_follow
  sq107_p03_normalpig2_unfollow
  sq107_p04_normalpig1_follow
  sq107_p04_normalpig1_unfollow
  sq107_pig_decoded
  sq107_pig_follow
  sq107_pig_herbalist_stfu
  sq107_pig_progress
  sq107_pig_unfollow
  sq107_pig_villager_inspect
  sq107_pigs_in_herd
  sq107_pigs_total
  sq107_real_pig_inspect
  sq107_receptacle_clue
  sq107_receptacle_ritual
  sq107_start_gathering
  sq107_vault_clues

== dlc/dlc9/dlc_new_game_plus_phase.w2phase:
  NewGamePlus
  witcher3_game_finished

== dlc/ep1/data/gameplay/community/dialogues/shop_circus_camp_merchant_01.w2scene:
  circus_camp_merchant_01_met

== dlc/ep1/data/gameplay/community/dialogues/shop_enchanter_01_lvl_0.w2scene:
  enchanter_01_met
  enchanter_about_property
  enchanter_about_trade

== dlc/ep1/data/gameplay/community/dialogues/shop_enchanter_01_lvl_1.w2scene:
  mq6005_painite_enabled
  scene_enchanter_01_level_1_unlocked

== dlc/ep1/data/gameplay/community/dialogues/shop_enchanter_01_lvl_2.w2scene:
  enchanter_01_level_2_unlocked
  mq6005_painite_enabled
  scene_enchanter_01_level_2_unlocked

== dlc/ep1/data/gameplay/community/dialogues/shop_enchanter_01_lvl_3.w2scene:
  scene_enchanter_01_level_3_unlocked

== dlc/ep1/data/gameplay/community/dialogues/shop_rescued_herbalist_01.w2scene:
  lw_rescued_herbalist_01_met

== dlc/ep1/data/gameplay/community/dialogues/shop_whitebridge_herbalist_01_ep1.w2scene:
  q603_auction_done
  q603_herbalist_password
  shop_whitebridge_gerbalist_met

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_01.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_02.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_03.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_04.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_05.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_man_06.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_01.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_02.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_03.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_04.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_05.w2scene:
  q602_gwent_lost

== dlc/ep1/data/gameplay/community/dialogues/voicesets/vset_drunk_weddingg_guest_woman_06.w2scene:
  q602_gwent_lost

== dlc/ep1/data/living_world/quests/ep1_poi_01/ep1_poi01_phase.w2phase:
  ep1_poi01_clear
  ep1_poi01_cont_open

== dlc/ep1/data/living_world/quests/ep1_poi_02/ep1_poi2_harpies.w2phase:
  ep1_poi_02_q_cont_open

== dlc/ep1/data/living_world/quests/ep1_poi_04/ep1_poi_04.w2phase:
  ep1_poi04_cont_open
  ep1_poi_04_bandits_dead
  ep1_poi_04_liberated

== dlc/ep1/data/living_world/quests/ep1_poi_05/ep1_poi_05.w2phase:
  ep1_poi05_cont_open
  ep1_poi_05_all_barrels_destroyed
  ep1_poi_05_barrel_destro
  ep1_poi_05_trapdoor_opened

== dlc/ep1/data/living_world/quests/ep1_poi_06/ep1_poi_06.w2phase:
  ep1_poi_06_clear
  ep1_poi_06_liberated

== dlc/ep1/data/living_world/quests/ep1_poi_07/ep1_poi_07.w2phase:
  ep1_poi_07_clear
  ep1_poi_07_liberated

== dlc/ep1/data/living_world/quests/ep1_poi_08/ep1_poi_08_phase.w2phase:
  ep1_poi_08_liberated
  ep1_poi_08_trapdoor_open
  ep1_poi_08_treasure_opened
  ep1_poi_8_ghouls_dead

== dlc/ep1/data/living_world/quests/ep1_poi_10/ep1_poi_10.w2phase:
  ep1_poi10b_cont_open

== dlc/ep1/data/living_world/quests/ep1_poi_20/ep1_poi_20.w2phase:
  ep1_poi_20_bandits dead
  lw_sk29_camp_killed
  sk102_pois_done

== dlc/ep1/data/living_world/quests/ep1_poi_26/ep1_poi_26.w2phase:
  ep1_poi_26_chest_b_opened
  ep1_poi_26_chest_opened
  ep1_poi_26_leshen_killed

== dlc/ep1/data/living_world/quests/ep1_poi_30/ep1_poi_30.w2phase:
  ep1_poi_30_liberated
  lw_ep1_poi_30_killed

== dlc/ep1/data/living_world/quests/ep1_poi_31/ep1_poi_31_phase.w2phase:
  lw_ep1_poi_31_nest_destroyed

== dlc/ep1/data/living_world/quests/ep1_poi_37/ep1_poi_37.w2phase:
  ep1_nekkers_nest01
  ep1_nekkers_nest02
  ep1_poi_37_community

== dlc/ep1/data/quests/ep1_additional_game_elements.w2phase:
  ep1_divine_whip_09a_clear
  ep1_divine_whip_11_clear
  ep1_divine_whip_12_clear
  ep1_divine_whip_14_clear
  ep1_divine_whip_23a_clear
  ep1_poi01_cont_open
  ep1_poi02_cont_open
  ep1_poi03_cont_open
  ep1_poi07_cont_open
  ep1_poi09_cont_open
  ep1_poi09b_cont_open
  ep1_poi10a_cont_open
  ep1_poi10b_cont_open
  ep1_poi11_cont_open
  ep1_poi12_cont_open
  ep1_poi13_cont_open
  ep1_poi14_cont_open
  ep1_poi15_cont_open
  ep1_poi16_cont_open
  ep1_poi17_cont_open
  ep1_poi23_cont_open
  ep1_poi_06_liberated
  ep1_poi_13_done
  ep1_poi_16_done
  ep1_poi_24_cont
  ep1_poi_32_cont
  ep1_poi_33_cont
  ep1_poi_35_cont
  ep1_poi_ofir_camp_cont_open
  q602_olgierd_final_done
  q602_walk_starts
  q603_herbalist_password

== dlc/ep1/data/quests/ep1_bugfixes.w2phase:
  actor_q603_rose_thug_01_was_killed
  actor_q603_rose_thug_02_was_killed
  actor_q603_rose_thug_03_was_killed
  bugfix_127637
  bugfix_129156
  bugfix_129238
  bugfix_129338
  bugfix_129434
  bugfix_129477
  bugfix_129493
  bugfix_130109
  bugfix_131436
  bugfix_132978
  bugfix_135083
  bugfix_154946
  ep1_divine_whip_23a_clear
  ep1_fdb_no_more_bugs
  ep1_poi09_cont_open
  ep1_poi11_cont_open
  ep1_poi12_cont_open
  ep1_poi13_cont_open
  ep1_poi14_cont_open
  ep1_poi16_cont_open
  ep1_poi23_cont_open
  ep1_poi23_cont_open2_bugfix
  q602_censer_ritual_done
  q602_crypt_censered
  q602_done
  q602_shani_romance_completed
  q602_wedding_game
  q602_wedding_start
  q603_auction_done
  q603_gamblers_card_failsafe_unlocked
  q603_gamblers_card_picked_up
  q603_herbalist_password
  q604_fdb_caretaker_dead
  q605_mirror_won
  q605_temple_dialogue_started
  standalone_ep1

== dlc/ep1/data/quests/ep1_character_entries.w2phase:
  q601_done
  q601_fdb_contract_accepted
  q601_geralt_has_demon_mark
  q601_shani_met
  q602_done
  q602_had_sex_with_shani
  q602_shani_girlfriend_w1
  q602_witold_introduced
  q603_auction_done
  q603_circus_artist_recruited
  q603_crew_gathering
  q603_demo_dwarf_killed
  q603_demo_dwarf_recruited
  q603_demo_dwarf_survived
  q603_done
  q603_dwarf_bombed
  q603_ewald_identity_known
  q603_ewald_killed
  q603_horst_killed
  q603_hostage_situation_done
  q603_pro_ewald
  q603_safecracker_killed
  q603_safecracker_recruited
  q603_thief_done
  q604_entered_summer_world
  q604_entered_winter_world
  q604_fdb_iris_found
  q604_fdb_rose_taken
  q604_met_demon_animals
  q604_more_info_animals
  q604_rose_painting_taken
  q605_mirror_banished
  q605_mirror_won
  q605_talked_to_crazy_scholar
  q605_talked_to_shani_oxen
  q605_three_wishes_done

== dlc/ep1/data/quests/ep1_initialization.w2phase:
  ep1_installed
  q101_fire_lit

== dlc/ep1/data/quests/ep1_persistant_content.w2phase:
  ep1_noticeboard_discovered
  q601_done
  q601_fdb_crossroads_meeting
  q601_fdb_monster_slain
  q601_fdb_ofir_mage_killed
  q601_fdb_ofir_soliders_killed
  q601_fdb_olgierd_confrontation
  q601_fdb_shani_not_at_home
  q602_olgierd_final_done
  q603_balcony_scene
  q603_circus_camp_default
  q603_thief_done
  q605_mirror_banished
  q605_mirror_won

== dlc/ep1/data/quests/ep1_tutorial.w2phase:
  enchanter_01_level_1_unlocked
  kill_ep1_tutorials
  q101_fire_lit
  q602_censer_tutorial
  standalone_ep1
  standalone_ep2
  tutorial_system_is_running

== dlc/ep1/data/quests/main_npcs/default_dialogues/olgierd_default.w2scene:
  cg600_played_gwent_with_olgierd_once
  cg600_won_card_from_olgierd
  olgierd_default_met
  q602_done
  q602_olgierd_final_done
  q603_done
  q603_olgierd_final_done
  q604_aviable_not_taken
  q604_olgierd_default_ofir_mentioned

== dlc/ep1/data/quests/main_npcs/default_dialogues/shani_default.w2scene:
  cg600_shani_played_once
  cg600_won_card_from_shani
  q601_fdb_shani_not_at_home
  q602_had_sex_with_shani
  q602_shani_girlfriend_w1
  q602_shani_romance_completed
  shani_met

== dlc/ep1/data/quests/main_npcs/voicesets/vset_shani.w2scene:
  shani_vset_disabled

== dlc/ep1/data/quests/mq6001_ofir_merchant.w2phase:
  mq6001_fdb_leaving_race
  mq6001_fdb_race_won
  mq6001_goats_scene
  mq6001_hide_saddle
  mq6001_race_agreed
  mq6001_race_ongoing
  mq6001_wagon_scene
  th1010_agreed_help
  th1010_agreed_help2
  th1010_spoke_w_merchant

== dlc/ep1/data/quests/mq6002_cannibals.w2phase:
  mq6002_blood_asked
  mq6002_cannibal_mom_asked
  mq6002_contract_taken
  mq6002_dead_woman
  mq6002_fooled
  mq6002_found_bag
  mq6002_found_blood
  mq6002_found_blood_neighbors
  mq6002_found_dead_apprentice
  mq6002_journal_blood
  mq6002_journal_report
  mq6002_journal_talk
  mq6002_no_more
  mq6002_open_larder
  mq6002_spared
  mq6002_started_quest
  mq6002_you_die_now
  q6002_crates_destroyed

== dlc/ep1/data/quests/mq6004_broken_rose.w2phase:
  ep1_divine_whip_12_clear
  mq6004_fact_axii_guards
  mq6004_fact_been_to_village
  mq6004_fact_broken_rose_lab_hostile
  mq6004_fact_broken_rose_leader_dead
  mq6004_fact_dead_supplier_found
  mq6004_fact_dealer_complete
  mq6004_fact_found_horseprints
  mq6004_fact_found_orders
  mq6004_fact_hiding_spot_found
  mq6004_fact_in_scene
  mq6004_fact_inside_lab
  mq6004_met_dealer
  mq6004_supplier_lab_investigation
  q601_fdb_contract_accepted
  q601_fdb_monster_slain

== dlc/ep1/data/quests/mq6005_enchanter.w2phase:
  GERALT_weapon_hit
  enchanter_01_level_1_unlocked
  enchanter_01_level_2_unlocked
  enchanter_01_level_3_unlocked
  enchanter_01_met
  mq6005_level_0_quest_active
  mq6005_lvl_2_timelapse
  mq6005_lvl_3_timelapse
  mq6005_notice_found
  mq6005_novi_rich_dist_general_store_01_painite_enable
  mq6005_novigrad_market_trader_01_painite_enable
  mq6005_novigrad_market_trader_03_painite_enable
  mq6005_painite_enabled
  mq6005_painite_locked
  mq6005_painite_search
  mq6005_painite_search_novi_rich_dist_general_store_01
  mq6005_painite_search_novigrad_market_trader_01
  mq6005_painite_search_novigrad_market_trader_03
  mq6005_upgrade_to_level_3_started

== dlc/ep1/data/quests/q601_intro.w2phase:
  q601_fdb_contract_accepted
  q601_fdb_contract_taken
  q601_fdb_crossroads_meeting

== dlc/ep1/data/quests/q602_wedding.w2phase:
  crypt
  ep1_poi_13_done
  ep1_poi_16_done
  ep1_poi_19_done
  fireeater_follow_start
  fireeater_follow_stop
  mq6001_race_ongoing
  olgierd
  q602_
  q602_censer_comment
  q602_censer_ritual_done
  q602_censer_tutorial
  q602_censer_used
  q602_chat_playing
  q602_comment_chat_game
  q602_crypt_censered
  q602_dance_music
  q602_dancing_scene
  q602_dancing_scene_played
  q602_despawn_folk_dancers
  q602_despawn_sexy_dancers
  q602_despawn_speach_spectators
  q602_destroyed_entites
  q602_diving_take_off_kontusz
  q602_diving_take_off_pants
  q602_dog_axiied
  q602_done
  q602_done_sitting
  q602_enter_stable
  q602_equip_cut_palm
  q602_family_hostile
  q602_fireeater_brought_back
  q602_fireeater_cap_given
  q602_fireeater_case_solved
  q602_fireeater_escort
  q602_fireeater_found
  q602_fireeater_killed
  q602_fireeater_left
  q602_fireeater_reached_river
  q602_geralt_done_juggling
  q602_geralt_juggled
  q602_geralt_juggling
  q602_geralt_possessed
  q602_gwent_lost
  q602_ladder_chat_played
  q602_mr_mirror_met
  q602_olgierd_final_done
  q602_open_pig_gate_shani
  q602_pants_failsafe
  q602_pick_up_gesture_1
  q602_pick_up_gesture_2
  q602_pick_up_gesture_3
  q602_pick_up_gesture_4
  q602_pig_chat_playing
  q602_pig_game
  q602_pig_game_chat_played
  q602_pig_game_cheating
  q602_pig_game_resigned
  q602_pig_game_won
  q602_pig_in_pen
  q602_put_on_boots
  q602_put_on_kontusz
  q602_remove_horse
  q602_secret_crypt_looted
  q602_sector_1
  q602_sector_2
  q602_sector_3
  q602_sector_4
  q602_sector_5
  q602_sector_6
  q602_sector_7
  q602_sector_8
  q602_set_time
  q602_shani_girlfriend_w1
  q602_shani_has_no_shoe
  q602_shani_has_shoe_back
  q602_shani_waits_by_crypt
  q602_shave_geralt
  q602_shoe_found
  q602_spawn_fireeater_audience
  q602_spawn_sexy_dancers
  q602_spawn_speach_spectators
  q602_take_off_ears
  q602_turn_off_crypt
  q602_turn_off_gameplay_chasing
  q602_turn_off_smoke
  q602_wedding_ceremony
  q602_wedding_game
  q602_wedding_horses_no
  q602_wedding_minor_activity
  q602_wedding_start
  q602_wedding_time_later
  q602_witold_introduced
  q602_witold_scene_playing
  q603_olgierd_final_done
  shani_dd_stop
  shani_follow_start
  shani_follow_stop
  shani_vset_disabled
  wedding

== dlc/ep1/data/quests/q603_bank.w2phase:
  GERALT_weapon_hit_by_mh301_merc_speaker
  actor_q603_diversion_guard_01_was_knocked_unconscious
  actor_q603_diversion_guard_05_was_knocked_unconscious
  block_falling_damage
  crossbow_was_fired
  ewald_mask
  mh301_greater_reward
  mh301_merc_speaker_weapon_hit_by_GERALT
  mq3026_race_pause
  mq3026_race_unpause
  q602_geralt_possessed
  q602_olgierd_final_done
  q603_16_prefight_setup
  q603_after_auction_fistfight_return_swords
  q603_after_spectacle
  q603_all_apples_done
  q603_all_quests_done
  q603_auction_connoisseur_done
  q603_auction_done
  q603_auction_gambler_done
  q603_auction_house_geralt_won_fistfight
  q603_auction_house_guards_disabled
  q603_auction_noblewoman_done
  q603_auction_scene_in_progress
  q603_auction_time_lapse
  q603_before_spectacle
  q603_circus_artist_mask
  q603_circus_artist_recruited
  q603_circus_camp_default
  q603_circus_elf_invisible
  q603_circus_elf_shot
  q603_circus_force_attack_area
  q603_crew_gathering
  q603_demo_dwarf_fight_won
  q603_demo_dwarf_killed
  q603_demo_dwarf_mask
  q603_demo_dwarf_recruited
  q603_demo_dwarf_survived
  q603_demo_dwarf_torch_extinguished
  q603_demolition_dwarf_recruited
  q603_diversion_chat_01_started
  q603_diversion_chat_02_started
  q603_diversion_chat_03_started
  q603_diversion_done
  q603_done
  q603_dwarf_bombed
  q603_dwarf_boom
  q603_dwarf_explosion
  q603_eveline_no_rope
  q603_ewald_blood_stain
  q603_ewald_identity_known
  q603_ewald_killed
  q603_explosive_barrel_weapon_hit
  q603_full_casket
  q603_gambler_lost_in_gwent
  q603_geralt_mask
  q603_get_in_man_done
  q603_getting_in_wooden_weapon_casimir
  q603_getting_in_wooden_weapon_eveline
  q603_ground_floor_hostile
  q603_heist_start_shortcut
  q603_herbalist_password
  q603_horst_killed
  q603_hostage_situation_done
  q603_hostage_situation_ended_in_combat
  q603_max_house_candles_off
  q603_max_house_picked_up
  q603_mob_thug_weapon_hit
  q603_negotiator_hostile
  q603_olgierd_final_done
  q603_only_box
  q603_open_hideout_door
  q603_pro_ewald
  q603_pro_horst
  q603_recruit_from_waiting
  q603_refuses_negotiations
  q603_safecracker_bailout
  q603_safecracker_dialogue_looped_unique
  q603_safecracker_killed
  q603_safecracker_mask
  q603_safecracker_recruited
  q603_safecracker_survived
  q603_secret_door_opened
  q603_secret_tunnel_exit_opened
  q603_shortcut_show_timelapse
  q603_shortcut_to_hideout
  q603_spawn_hostages
  q603_spectacle_community_on
  q603_spectacle_done
  q603_spectacle_in_progress
  q603_spectacle_timelapse
  q603_thief_body_found
  q603_thief_clue_footprints_found
  q603_thief_done
  q603_trap_door
  q603_unlock_diarrhea_potion
  q603_vault_specialist_done
  q603_vivaldi_follow_stop
  q603_vivaldis_oneliners
  vimme_vivladi_met

== dlc/ep1/data/quests/q604_mansion.w2phase:
  q604_appear_noiris_painting
  q604_chandelier_fallen
  q604_checked_dinner_painting
  q604_checked_olgierd_painting
  q604_correct_fruit_a
  q604_correct_fruit_b
  q604_correct_fruit_c
  q604_disappear_noiris_painting
  q604_dlg_gates_active
  q604_dlg_hear_digging_mus
  q604_dlg_parlour_candle1_on
  q604_dlg_parlour_candle2_on
  q604_dlg_parlour_candle3_on
  q604_dlg_parlour_candle4_on
  q604_dlg_parlour_candle5_on
  q604_dlg_parlour_candle6_on
  q604_dlg_parlour_fireplace1_on
  q604_dlg_parlour_fireplace2_on
  q604_dlg_show_blood_cellar
  q604_dlg_show_corridor_candles
  q604_dlg_show_parlour_candle
  q604_dlg_study_lights1
  q604_dlg_study_lights2
  q604_dlg_study_lights3
  q604_dlg_study_lights4
  q604_dlg_study_lights_penta
  q604_dlg_study_penta_off
  q604_dlg_study_physic
  q604_dlg_study_start_fire
  q604_entered_summer_world
  q604_entered_winter_world
  q604_etheral_spotted
  q604_examined_mismatched_painting
  q604_examined_winter_painting
  q604_fdb_bench_found
  q604_fdb_candles_lit
  q604_fdb_caretaker_dead
  q604_fdb_cat_clue_found
  q604_fdb_chalice_taken
  q604_fdb_contract_placed
  q604_fdb_dog_clue_found
  q604_fdb_easel_found
  q604_fdb_fertilizer_found
  q604_fdb_flower_found
  q604_fdb_fountain_found
  q604_fdb_front_door_checked
  q604_fdb_fruits_taken
  q604_fdb_garden_clues
  q604_fdb_grave_found
  q604_fdb_iris_found
  q604_fdb_letter_read
  q604_fdb_mug_placed
  q604_fdb_quest_completed
  q604_fdb_rose_taken
  q604_fdb_study_fire
  q604_fdb_summer_left
  q604_first_memory_seen
  q604_found_closed_gate
  q604_gazebo_done
  q604_hide_funeral_painting
  q604_last_ethereal_killed
  q604_lock_bedroom_door_scene
  q604_mem_book_placed
  q604_mem_catbowl_placed
  q604_mem_cup_placed
  q604_mem_dogbowl_placed
  q604_mem_palette_placed
  q604_mem_towel_placed
  q604_mem_tray_placed
  q604_met_demon_animals
  q604_more_info_animals
  q604_mus_iris_bury
  q604_mus_study
  q604_painting_fruits_placed
  q604_pentagram_again
  q604_rose_painting_taken
  q604_show_candles_pentagram
  q604_show_cutout_rose_painting
  q604_show_funeral_painting
  q604_show_iris_grave
  q604_shut_bedroom_door_scene
  q604_started
  q604_starting_dinner_scene
  q604_taking_rose_painting
  q604_try_cellar_door

== dlc/ep1/data/quests/q605_finale.w2phase:
  q602_pig_mascot_won
  q604_fdb_rose_taken
  q605_after_tavern_scene
  q605_broken_mirror_inspected
  q605_dlg_chose_olg_help
  q605_dlg_final_standoff
  q605_dlg_mirror_send_hell
  q605_dlg_olg_see_painting
  q605_dlg_play_whistle_mirror
  q605_fdb_all_is_quiet
  q605_fdb_party_on
  q605_hide_sand_scene
  q605_mirror_banished
  q605_mirror_comment_in_progress
  q605_mirror_won
  q605_remove_the_mark
  q605_scholar_door_destroyed
  q605_scholar_door_tried
  q605_talked_to_crazy_scholar
  q605_talked_to_shani_oxen
  q605_temple_dialogue_started
  q605_three_wishes_done
  q605_water_wall_destroyed
  shani_dd_start
  shani_dd_stop

== dlc/ep1/data/quests/quest_files/mq6001_ofir_merchant/scenes/mq6001_02_default_dialogue.w2scene:
  mq6001_fdb_merchant_first_met
  mq6001_fdb_race_won
  mq6001_horse_story
  mq6001_ofiri_horse_mentioned
  mq6001_race_agreed
  th1010_agreed_help

== dlc/ep1/data/quests/quest_files/mq6002_cannibals/scenes/mq6002_02_contract.w2scene:
  mq6002_didnt_take_contract

== dlc/ep1/data/quests/quest_files/mq6002_cannibals/scenes/mq6002_06_cannibal_mom.w2scene:
  mq6002_cannibal_mom_asked
  mq6002_cannibal_mom_welcome
  mq6002_found_blood
  mq6002_found_blood_neighbors

== dlc/ep1/data/quests/quest_files/mq6002_cannibals/scenes/mq6002_12_return_to_village_dead.w2scene:
  mq6002_no_more

== dlc/ep1/data/quests/quest_files/mq6002_cannibals/scenes/mq6002_15_reward.w2scene:
  mq6002_found_dead_apprentice
  mq6002_you_die_now

== dlc/ep1/data/quests/quest_files/mq6003_taxes/mq6003_taxes.w2phase:
  mq6003_fact_taxes_paid
  mq6003_flip_vivaldi_default

== dlc/ep1/data/quests/quest_files/mq6003_taxes/scenes/mq6003_tax_collector.w2scene:
  mq6003_guilty

== dlc/ep1/data/quests/quest_files/mq6003_taxes/scenes/mq6003_vimme_vivaldi_default_replacer.w2scene:
  q6003_vimme_told

== dlc/ep1/data/quests/quest_files/mq6004_broken_rose/scenes/mq6004_clues.w2scene:
  mq6004_fact_found_orders
  mq6004_met_dealer

== dlc/ep1/data/quests/quest_files/mq6004_broken_rose/scenes/mq6004_meet_the_dealer.w2scene:
  mq6004_fact_dealer_complete

== dlc/ep1/data/quests/quest_files/mq6004_broken_rose/scenes/mq6004_meet_the_guards.w2scene:
  mq6004_fact_found_orders
  mq6004_guards_met
  mq6004_met_dealer

== dlc/ep1/data/quests/quest_files/mq6004_broken_rose/scenes/mq6004_meet_the_leader.w2scene:
  mq6004_fact_axii_guards
  mq6004_met_dealer

== dlc/ep1/data/quests/quest_files/mq6005_enchanter/pickup_scenes/mq6005_geralt_oneliners.w2scene:
  mq6005_painite_comment_switch

== dlc/ep1/data/quests/quest_files/q601_intro/phases/q601_escape.w2phase:
  MeditationStarted
  olgierd_community_active
  olgierd_dd_start
  q601_done
  q601_fdb_after_decapitation
  q601_fdb_community_leaving
  q601_fdb_community_left
  q601_fdb_crossroads_meeting
  q601_fdb_defeated_olgierd
  q601_fdb_demon_mark
  q601_fdb_duel_crowd
  q601_fdb_duel_with_olgierd
  q601_fdb_fist_fight
  q601_fdb_flee_from_ofir
  q601_fdb_leaving_mansion
  q601_fdb_ofir_language_master
  q601_fdb_ofir_mage_killed
  q601_fdb_ofir_soliders_killed
  q601_fdb_olgierd_confrontation
  q601_fdb_skipped_crossroads
  q601_fdb_sound_duel_starts
  q601_fdb_sound_mirror_appears_manor
  q601_fdb_sound_mirror_appears_ship
  q601_fdb_sound_mirror_leaves_manor
  q601_fdb_sound_mirror_leaves_ship
  q601_fdb_sound_quest_finished
  q601_fdb_swords_equipped_storm
  q601_fdb_swords_unequipped_storm
  q601_geralt_has_demon_mark

== dlc/ep1/data/quests/quest_files/q601_intro/phases/q601_introduction.w2phase:
  olgierd_dd_stop
  q601_fdb_contract_accepted
  q601_fdb_contract_taken
  q601_fdb_fist_fight
  q601_fdb_geralt_olgierd_leaving
  q601_fdb_lost_fist_fight
  q601_fdb_olgierds_door_opened
  q601_fdb_oxenfurt_community
  q601_fdb_plate_appears
  q601_fdb_show_notice
  q601_fdb_won_fist_fight
  q601_olgierd_met

== dlc/ep1/data/quests/quest_files/q601_intro/phases/q601_monster_hunt.w2phase:
  q601_fdb_body_found
  q601_fdb_fell_through_pipe
  q601_fdb_key_obtained
  q601_fdb_lair_found
  q601_fdb_monster_slain
  q601_fdb_sewers_opened
  q601_fdb_sound_shani_found
  q601_shani_met
  shani_dd_stop
  shani_follow_start
  shani_follow_stop
  witcher3_game_finished

== dlc/ep1/data/quests/quest_files/q601_intro/scenes/q601_04a_attack_site.w2scene:
  q601_investigation

== dlc/ep1/data/quests/quest_files/q601_intro/scenes/q601_04b_body_found.w2scene:
  q601_body
  q601_fdb_key_obtained

== dlc/ep1/data/quests/quest_files/q601_intro/scenes/q601_11_mr_mirrior_crossing.w2scene:
  q601_mr_mirror_bridge
  q601_olgierd_wish

== dlc/ep1/data/quests/quest_files/q601_intro/scenes/q601_12_olgierd_confrontation.w2scene:
  q601_brother
  q601_harsh
  q601_house

== dlc/ep1/data/quests/quest_files/q602_wedding/phases/q602_olgierd.w2phase:
  olgierd_community_active
  q602_done
  q603_done
  q604_started

== dlc/ep1/data/quests/quest_files/q602_wedding/phases/q602_romance.w2phase:
  q602_alcohol_1
  q602_alcohol_2
  q602_cleanup
  q602_comment_alcohol_1
  q602_comment_alcohol_2
  q602_comment_flower_1
  q602_comment_flower_3
  q602_done
  q602_drunk_bards
  q602_flower_1
  q602_flower_3
  q602_had_sex_with_shani
  q602_left_wedding
  q602_load_blanket
  q602_pants_failsafe
  q602_pig_game_won
  q602_romance_music
  q602_sad_shani_poked
  q602_sex_time_later
  q602_shani_got_rowanberry
  q602_shani_likes_rowan
  q602_shani_puke
  q602_shani_romance_completed
  q602_walk_starts
  q602_wedding_minor_activity
  q602_wedding_no_bards
  shani_dd_start

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_01_visiting_shani.w2scene:
  mq3035_fdb_radovid_dead

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_02_meet_shani_crypt.w2scene:
  q601_fdb_wedding_notice

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_06_crypt_possession.w2scene:
  q602_crypt_info
  q602_invitation
  q602_yes_wedding

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_08_wedding_halflings_gwent.w2scene:
  q602_wedding_game

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_09_wedding_kissing_shani.w2scene:
  q602_shani_girlfriend_w1

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_10_wedding_lake.w2scene:
  q602_gwent_lost
  q602_wedding_game

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_11_wedding_devil_dog.w2scene:
  q602_gwent_lost

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_12_wedding_devil_dog_search.w2scene:
  q602_branch_found
  q602_devil_marks_checked
  q602_fireeater_killed
  q602_fireeater_left
  q602_shani_came_back_once
  q602_shani_stayed_once

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_13_wedding_devil_dog_found.w2scene:
  q602_gwent_lost

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_14_wedding_fireeater_found.w2scene:
  q602_14_report_found_fireeater
  q602_dog_axiied
  q602_wedding_game

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_16_wedding_pick_up.w2scene:
  q602_pig_game_cheating
  q602_shani_girlfriend_w1
  q602_wedding_game

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_16a_wedding_pigs.w2scene:
  q602_gwent_lost

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_16b_wedding_mr_mirror.w2scene:
  q602_wedding_game

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_17_wedding_finale.w2scene:
  q602_gwent_lost

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_19_dancing.w2scene:
  q602_alcohol_1
  q602_flower_1
  q602_flower_3
  q602_im_yours
  q602_shani_girlfriend_w1
  q602_shani_got_rowanberry
  q602_shani_puke

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_22_olgierd.w2scene:
  q603_done
  q603_olgierd_final_done

== dlc/ep1/data/quests/quest_files/q602_wedding/scenes/q602_23_secure.w2scene:
  q602_warned_player

== dlc/ep1/data/quests/quest_files/q603_bank/phases/q603_aftermath.w2phase:
  q603_aftermath_auctioning_enabled
  q603_auction_house_vivaldis_sign_seen
  q603_ewald_killed
  q603_horst_killed
  q603_olgierd_final_done

== dlc/ep1/data/quests/quest_files/q603_bank/phases/q603_auction_chats_control.w2phase:
  q603_auction_scene_in_progress

== dlc/ep1/data/quests/quest_files/q603_bank/phases/q603_painting.w2phase:
  q603_auction_done
  q603_know_about_bookseller
  q603_mq3027_override

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_01_auction_house_entrance.w2scene:
  q603_auction_start_talked_to
  vimme_vivladi_met

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_02b_clerks_chatting.w2scene:
  q603_02b_clerks_chat_switch

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_03a_gambler.w2scene:
  q603_agreed_to_cut
  q603_gambler_lost_in_gwent
  sq306_completed

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_03b_noblewoman.w2scene:
  q403_battle_ends
  q603_balcony_scene

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_03d_banquet_chats.w2scene:
  q603_auction_short_chat
  q603_banquet_chats

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_04_auction.w2scene:
  q603_04_geralt_buys_item_on_auction
  q603_04_will_bet
  q603_secret_shared
  q603_vimme_mean
  vivaldi_loan_taken

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_06_heist_plan.w2scene:
  mh301_completed
  mh301_merc_speaker_met
  q603_06_circus_artists_asked_about
  q603_06_safecracker_asked_about
  q603_about_patrols

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_07_circus_artists.w2scene:
  q603_07_shooting_option_selected
  q603_boyfriend_gone
  q603_demo_dwarf_recruited
  q603_diversion_done
  q603_left_circus_after_shooting
  q603_payment_discussed
  q603_safecracker_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_08_demo_dwarf.w2scene:
  q603_circus_artist_recruited
  q603_demo_dwarf_torch_extinguished
  q603_diversion_done

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_10_safecracker.w2scene:
  mh301_greater_reward
  q603_10_fistfight
  q603_10_gwent
  q603_10_negotiation
  q603_10_safecracker_met
  q603_10_want_to_free_safecracker
  q603_circus_artist_recruited
  q603_diversion_done
  q603_quinto_interrupted

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_10b_safecracker_default.w2scene:
  q603_circus_artist_recruited
  q603_diversion_done

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_11_final_preparations.w2scene:
  q603_demo_dwarf_recruited
  q603_shortcut_to_hideout

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_11b_diversion.w2scene:
  q603_cook_met
  q603_diversion_chat_stage

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_12_heist_starts.w2scene:
  q603_demo_dwarf_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_12b_chats.w2scene:
  q603_demo_dwarf_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_13_ground_floor_reached.w2scene:
  q603_demo_dwarf_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_14_hostage_situation.w2scene:
  q603_demo_dwarf_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_16_standoff.w2scene:
  q603_demo_dwarf_recruited
  q603_geralt_hesitates

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_17_brother_dies.w2scene:
  q603_demo_dwarf_recruited

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_18a_retreat_ewald.w2scene:
  q603_demo_dwarf_recruited
  q603_geralt_hesitates
  q603_well_discuss

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_18b_horst_retreat.w2scene:
  q603_demo_dwarf_recruited
  q603_mentioned_olgierd

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_21_olgierd.w2scene:
  q602_done
  q602_olgierd_final_done
  q603_full_casket
  q603_papers_explained
  q603_pro_ewald

== dlc/ep1/data/quests/quest_files/q603_bank/scenes/q603_geralt_oneliners.w2scene:
  q603_secret_shared

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_06_bury_iris_remains.w2scene:
  q604_ghost_recognized
  q604_item_put_iris_grave

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_08c_painting.w2scene:
  q604_correct_fruit_a
  q604_correct_fruit_b
  q604_correct_fruit_c
  q604_fdb_chalice_taken
  q604_fdb_fruits_taken

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_08d_dinner.w2scene:
  q604_brush_found
  q604_dinner_fireplace_lit

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_08f_bedroom.w2scene:
  q604_bowl_found
  q604_rug_found

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_10_study.w2scene:
  q604_pentagram_again

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_11_cellar.w2scene:
  q604_first_bit_found

== dlc/ep1/data/quests/quest_files/q604_mansion/scenes/q604_14_master_bedroom.w2scene:
  q604_comb_put_grave
  q604_know_about_rose
  q604_sketchbook_put_grave
  q604_small_picture_put_grave

== dlc/ep1/data/quests/quest_files/q605_finale/scenes/q605_03b_geralt_and_shani_gp.w2scene:
  mq3035_fdb_radovid_dead

== dlc/ep1/data/quests/quest_files/q605_finale/scenes/q605_04_temple_meeting.w2scene:
  q402_found_ciri
  q604_fdb_rose_taken
  q605_dlg_chose_olg_help
  q605_talked_to_crazy_scholar

== dlc/ep1/data/quests/quest_files/th1010_ofir_th/th1010_ofir_th.w2phase:
  th1010_agreed_help
  th1010_schematic_armor_obtained
  th1010_schematic_boots_obtained
  th1010_schematic_gloves_obtained
  th1010_schematic_obtained
  th1010_schematic_pants_obtained
  th1010_secret_found
  th1010_started_from_item

== dlc/ep1/data/quests/quest_npcs_default_dialogues_ep1.w2phase:
  cg600_won_card_from_olgierd
  cg600_won_card_from_shani
  mq6002_cannibal_mom_asked
  mq6002_fooled
  mq6002_found_dead_apprentice
  mq6002_journal_report
  olgierd_dd_start
  olgierd_dd_stop
  q602_done
  q602_olgierd_final_done
  q603_done
  q603_olgierd_final_done
  q604_aviable_not_taken
  q604_started
  shani_dd_start
  shani_dd_stop

== dlc/ep1/data/quests/secondary_npcs/default_dialogues/ewald_default.w2scene:
  q603_circus_artist_recruited
  q603_demolition_dwarf_recruited
  q603_safecracker_recruited

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_01.w2scene:
  novigrad_brothel_dist_pegleg_peggys_girl_01_met
  novigrad_brothel_dist_pegleg_peggys_girl_01_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_01_sex.w2scene:
  release_jp

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_02.w2scene:
  novigrad_brothel_dist_pegleg_peggys_girl_02_met
  novigrad_brothel_dist_pegleg_peggys_girl_02_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_02_sex.w2scene:
  release_jp

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_03.w2scene:
  novigrad_brothel_dist_pegleg_peggys_girl_02_met
  novigrad_brothel_dist_pegleg_peggys_girl_02_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_brothel_district_peggleg_peggys_girl_03_sex.w2scene:
  release_jp

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_01.w2scene:
  novigrad_rich_district_passiflora_girl_01_met
  novigrad_rich_district_passiflora_girl_01_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_01_sex.w2scene:
  release_jp

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_02.w2scene:
  novigrad_rich_district_passiflora_girl_02_met
  novigrad_rich_district_passiflora_girl_02_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_02_sex.w2scene:
  release_jp

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_03.w2scene:
  novigrad_rich_district_passiflora_girl_03_met
  novigrad_rich_district_passiflora_girl_03_slept_with

== gameplay/community/dialogues/brothels/brothels_novigrad_rich_district_passiflora_girl_03_sex.w2scene:
  release_jp

== gameplay/community/dialogues/epilogue/chat_radowid_alive_priest_and_soldiers_05_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_alive_soldiers_01_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_alive_soldiers_02_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_alive_soldiers_04_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_alive_soldiers_and_peasants_03_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_dead_children_01_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/epilogue/chat_radowid_dead_soldiers_and_merchants_01_m.w2scene:
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/nml/chats/chat_barons_manor_bandits_02_m.w2scene:
  q101_baron_men_attacked

== gameplay/community/dialogues/nml/chats/chat_barons_manor_bandits_03_m.w2scene:
  q401_gotten_uma

== gameplay/community/dialogues/nml/chats/chat_barons_manor_bandits_05_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_barons_manor_bandits_06_m.w2scene:
  mh101_completed

== gameplay/community/dialogues/nml/chats/chat_barons_manor_peasants_02_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_barons_manor_peasants_03_f.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_barons_manor_peasants_06_m.w2scene:
  q103_baron_confession

== gameplay/community/dialogues/nml/chats/chat_barons_manor_peasants_07_fm.w2scene:
  mh101_completed

== gameplay/community/dialogues/nml/chats/chat_brickmakers_pier_settlement_peasants_02_f.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_burrow_village_peasants_01_m.w2scene:
  mh108_done

== gameplay/community/dialogues/nml/chats/chat_burrow_village_peasants_02_f.w2scene:
  q105_completed

== gameplay/community/dialogues/nml/chats/chat_crossroad_inn_peasants_01_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_crossroad_inn_peasants_02_f.w2scene:
  q103_wife_reported

== gameplay/community/dialogues/nml/chats/chat_ekimma_moster_hunt.w2scene:
  mh104_completed

== gameplay/community/dialogues/nml/chats/chat_grave_hag_monster_hunt.w2scene:
  mh106_completed

== gameplay/community/dialogues/nml/chats/chat_makeshift_boats_yard_peasants_03_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_midcotts_village_peasants_02_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/chats/chat_mordy_village_peasants_02_f.w2scene:
  q103_buried_botch
  q103_killed_botch

== gameplay/community/dialogues/nml/chats/chat_nilfgaard_pig_farm_peasant_03_m.w2scene:
  sq107_complete

== gameplay/community/dialogues/nml/chats/chat_nilfgaard_pig_farm_peasants_02_fm.w2scene:
  sq107_complete

== gameplay/community/dialogues/nml/chats/chat_nilfgaard_pig_farm_peasants_04_m.w2scene:
  q107_baron_hanged
  sq107_complete

== gameplay/community/dialogues/nml/chats/chat_poppystone_village_peasants_04_m.w2scene:
  q107_baron_hanged

== gameplay/community/dialogues/nml/shops/shop_baron_quartermaster_01.w2scene:
  baron_quartermaster_01_met

== gameplay/community/dialogues/nml/shops/shop_barons_keep_fergus_blacksmith.w2scene:
  sq108_master_bsmith_helped

== gameplay/community/dialogues/nml/shops/shop_barons_keep_master_blacksmith.w2scene:
  sq108_master_bsmith_helped

== gameplay/community/dialogues/nml/shops/shop_nml_boat_maker.w2scene:
  nml_boat_maker_met
  nml_boat_maker_on

== gameplay/community/dialogues/nml/shops/shop_rudnik_shopkeeper_01.w2scene:
  rudnik_shopkeeper_01_met

== gameplay/community/dialogues/nml/shops/shop_snots_blacksmith_01.w2scene:
  snots_blacksmith_01_met

== gameplay/community/dialogues/nml/voicesets/vset_baron_bandit_strong_01.w2scene:
  q107_complete

== gameplay/community/dialogues/nml/voicesets/vset_baron_bandit_strong_02.w2scene:
  q107_complete

== gameplay/community/dialogues/nml/voicesets/vset_baron_bandit_weak_01.w2scene:
  q107_complete

== gameplay/community/dialogues/nml/voicesets/vset_baron_bandit_weak_03.w2scene:
  q107_complete

== gameplay/community/dialogues/nml/voicesets/vset_nilfgaardian_soldier_03.w2scene:
  q002_met_emhyr

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_man_01.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_man_02.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_man_03.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_woman_01.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_woman_02.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_old_woman_03.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_peasant_01.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_peasant_02.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_peasant_03.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_peasant_04.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_peasant_05.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_woman_01.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_woman_02.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_woman_03.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_woman_04.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/nml/voicesets/vset_verden_woman_05.w2scene:
  q103_start_burning_stables

== gameplay/community/dialogues/novigrad/chats/chat_dawn_estate_gardens_peasants_02_m.w2scene:
  sq301_completed

== gameplay/community/dialogues/novigrad/chats/chat_dawn_estate_peasants_02_fm.w2scene:
  q308_im_an_idiot
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/chats/chat_grain_fields_2_peasants_01_m.w2scene:
  mh308_done

== gameplay/community/dialogues/novigrad/chats/chat_nobleman_estate_2_noblemen_01_m.w2scene:
  mh307_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_brothel_district_citizens_01_m.w2scene:
  sq303_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_harbour_district_dockworkers_01_m.w2scene:
  sq303_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_harbour_district_eternal_fire_priest_01_m.w2scene:
  q303_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_main_square_citizens_01_fm.w2scene:
  mh305_done

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_main_square_poor_men_01_m.w2scene:
  q302_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_main_square_poor_men_02_m.w2scene:
  q302_completed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_poor_district_poor_women_02_f.w2scene:
  q308_im_an_idiot
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/chats/chat_novigrad_rich_district_nobles_01_m.w2scene:
  sq303_completed

== gameplay/community/dialogues/novigrad/chats/chat_outskirts_refugees_01_m.w2scene:
  mh308_done

== gameplay/community/dialogues/novigrad/chats/chat_vampire_hospital_peasants_01_fm.w2scene:
  q308_im_an_idiot
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/chats/novigrad_whitebridge_women_gossipers_chat.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/novigrad/shops/shop_novi_brothel_dist_dandelions_brothel_01.w2scene:
  novi_brothel_dist_dandelions_brothel_01_met

== gameplay/community/dialogues/novigrad/shops/shop_novi_brothel_dist_herbs_trader.w2scene:
  novi_poor_dist_herbs_trader_met

== gameplay/community/dialogues/novigrad/shops/shop_novi_brothel_dist_pegleg_peggys.w2scene:
  brothel_peggleg_peggys_pick_girl_on
  novi_brothel_dist_pegleg_peggys

== gameplay/community/dialogues/novigrad/shops/shop_novi_crematory_alchemist_01.w2scene:
  import_council_exists
  novi_crematory_alchemist_01_met

== gameplay/community/dialogues/novigrad/shops/shop_novi_poor_dist_drunk_barber_01.w2scene:
  novi_poor_drunk_barber_used

== gameplay/community/dialogues/novigrad/shops/shop_novi_poor_dist_loan_shark.w2scene:
  novi_poor_dist_loan_shark_met

== gameplay/community/dialogues/novigrad/shops/shop_novi_rich_dist_general_store_01.w2scene:
  mq1002_talked_about_aeramas
  mq6005_painite_search
  novi_rich_dist_general_store_met

== gameplay/community/dialogues/novigrad/shops/shop_novi_temple_dist_alchemist_01.w2scene:
  nov_temple_dist_alchemist_01

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_citizen_district_shopkeeper.w2scene:
  mq3004_block_shop
  mq3004_merchant_saved
  novigrad_citizen_district_shopkeeper_nonmet

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_kingfisher_inn_olivier.w2scene:
  olivier_met

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_market_book_merchant_01.w2scene:
  novigrad_book_merchant_01_met

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_market_trader_01.w2scene:
  mq6005_painite_search

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_market_trader_03.w2scene:
  mq6005_painite_search
  novi_market_trader_03

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_poor_district_junk_seller.w2scene:
  q305_poor_merchant_met
  shop_novi_junk_met

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_poor_district_nowhere_01.w2scene:
  novi_poor_district_nowhere_01_met

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_rich_district_armorer_01.w2scene:
  sq108_heard_about_blacksmith

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_rich_district_passiflora_serenity.w2scene:
  brothel_passiflora_pick_girl_on
  novi_rich_dist_passiflora
  sq306_passiflora_cleared_for_game
  sq315_fdb_passiflora_meeting

== gameplay/community/dialogues/novigrad/shops/shop_novigrad_whitebridge_inn_stjepan.w2scene:
  stjepan_innkeeper_met

== gameplay/community/dialogues/novigrad/shops/shop_roches_camp_quartermaster_01.w2scene:
  roches_camp_quartermaster_01_met

== gameplay/community/dialogues/novigrad/shops/shop_scoiatael_camp_novigrad.w2scene:
  shop_scoiatael_camp_novigrad_saved

== gameplay/community/dialogues/novigrad/shops/shop_whitebridge_redanian_armorer_01.w2scene:
  whitebridge_redanian_armorer_01_met

== gameplay/community/dialogues/novigrad/voicesets/vset_dwarf_man_01.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_elf_female_02.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_elf_man_02.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_guard_01.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_guard_02.w2scene:
  q308_nath_guilty

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_guard_03.w2scene:
  q308_psycho_comleted

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_guard_15.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_guard_16.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_priest_01.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_priest_02.w2scene:
  q303_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_priest_03.w2scene:
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_priest_21.w2scene:
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_eternal_fire_priest_22.w2scene:
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_mage_03.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_bard_02.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_bard_03.w2scene:
  mq3035_fdb_radovid_dead
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_man_01.w2scene:
  q303_witch_hunter_outpost_burned

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_man_02.w2scene:
  q208_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_man_03.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_woman_01.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_woman_02.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_woman_03.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_woman_24.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_citizen_woman_25.w2scene:
  sq303_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_dockworker_01.w2scene:
  q208_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_dockworker_02.w2scene:
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_dockworker_03.w2scene:
  q201_wolverstone_met
  q303_witch_hunter_outpost_burned

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_female_bard_01.w2scene:
  q308_nathanel_killed
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_female_bard_02.w2scene:
  q305_play_over
  q305_title2

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_female_bard_03.w2scene:
  q305_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_nobleman_01.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_nobleman_02.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_nobleman_03.w2scene:
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_nobleman_15.w2scene:
  sq304_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_nobleman_16.w2scene:
  q303_witch_hunter_outpost_burned

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_01.w2scene:
  q301_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_02.w2scene:
  q308_nathanel_killed
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_03.w2scene:
  q208_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_14.w2scene:
  q309_completed
  q309_failed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_15.w2scene:
  q101_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_noblewoman_16.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_01.w2scene:
  q110_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_02.w2scene:
  q303_witch_hunter_outpost_burned

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_03.w2scene:
  q206_cerys_queen

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_18.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_19.w2scene:
  q308_nath_guilty

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_man_20.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_01.w2scene:
  q206_cerys_queen

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_02.w2scene:
  q305_play_over
  q305_title2

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_03.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_18.w2scene:
  mq3035_fdb_radovid_dead
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_19.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_old_woman_20.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_peasant_02.w2scene:
  q101_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_peasant_03.w2scene:
  q110_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_01.w2scene:
  q305_play_over

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_02.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_03.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_16.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_24.w2scene:
  q305_play_over

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_man_25.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_01.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_02.w2scene:
  q308_nathanel_killed
  q308_vampire_psycho_killed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_03.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_19.w2scene:
  q301_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_23.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_24.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_poor_woman_25.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_prostitute_01.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_prostitute_02.w2scene:
  mq3041_quest_done
  q308_comleted

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_prostitute_03.w2scene:
  q305_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_prostitute_12.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_refugee_man_02.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_refugee_woman_01.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_refugee_woman_02.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_man_01.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_man_02.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_man_03.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_man_19.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_woman_03.w2scene:
  q310_started

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_woman_18.w2scene:
  q309_completed

== gameplay/community/dialogues/novigrad/voicesets/vset_novigrad_rich_woman_20.w2scene:
  q308_vampire_psycho_killed

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_citizens_03_m.w2scene:
  q302_completed

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_citizens_04_m.w2scene:
  q302_completed

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_inn_drunk_and_poor_men_01_m.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_poor_men_01_m.w2scene:
  mh304_done

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_suburbian_peasants_01_m.w2scene:
  mh301_completed

== gameplay/community/dialogues/oxenfurt/chats/chat_oxenfurt_traders_and_citizen_01_m.w2scene:
  mh301_completed

== gameplay/community/dialogues/oxenfurt/voicesets/vset_redanian_officer_01.w2scene:
  ff303_fdb_reactions

== gameplay/community/dialogues/prologue/chats/chat_prologue_village_2.w2scene:
  mq3035_fdb_radovid_dead

== gameplay/community/dialogues/prologue/chats/chat_prologue_village_3.w2scene:
  q002_killed_griffin

== gameplay/community/dialogues/prologue/chats/chat_prologue_village_river.w2scene:
  mq0003_hamlet_inhabited

== gameplay/community/dialogues/prologue/shops/prologue_nilfgaardian_camp_quartermaster.w2scene:
  nilf_camp_quartermaster_gwint_on
  nilfgaardian_camp_quartermaster_01_met
  q501_eredin_starts

== gameplay/community/dialogues/prologue/shops/shop_griffon_merchant_01.w2scene:
  shop_grifon_merchant_met

== gameplay/community/dialogues/skellige/chats/chat2_woman_villager_villager.w2scene:
  q202_hjalmar_saved

== gameplay/community/dialogues/skellige/chats/chat_arena_villagers_01_m.w2scene:
  mq2024_job_done

== gameplay/community/dialogues/skellige/chats/chat_arena_villagers_02_m.w2scene:
  mq2024_arena_reopened

== gameplay/community/dialogues/skellige/chats/chat_arinbjoer_inn_villagers_01_m.w2scene:
  q206_complete
  q206_svanrige_king

== gameplay/community/dialogues/skellige/chats/chat_arinbjoer_inn_villagers_02_m.w2scene:
  q206_svanrige_king

== gameplay/community/dialogues/skellige/chats/chat_arinbjoer_inn_villagers_03_m.w2scene:
  q206_complete
  q206_svanrige_king

== gameplay/community/dialogues/skellige/chats/chat_arinbjorn_shipwreck_village_villagers_02_m.w2scene:
  mh207_done

== gameplay/community/dialogues/skellige/chats/chat_blandare_villagers_02_m.w2scene:
  mh201_completed

== gameplay/community/dialogues/skellige/chats/chat_clan_brokvar_village_children_01_m.w2scene:
  mh210_done

== gameplay/community/dialogues/skellige/chats/chat_clan_dimun_village_warriors_01_m.w2scene:
  ff202_einar_lost
  q210_lugos_dead

== gameplay/community/dialogues/skellige/chats/chat_craite_village_fishermen_02_m.w2scene:
  mh203_done

== gameplay/community/dialogues/skellige/chats/chat_craite_village_warriors_02_m.w2scene:
  q206_complete

== gameplay/community/dialogues/skellige/chats/chat_fyresdal_villagers_01_m.w2scene:
  mh208_done

== gameplay/community/dialogues/skellige/chats/chat_hunter_old_women_young_man.w2scene:
  sq204_completed

== gameplay/community/dialogues/skellige/chats/chat_hunter_women.w2scene:
  sq204_completed

== gameplay/community/dialogues/skellige/chats/chat_kaer_trolde_castle_guards_01_m.w2scene:
  q206_complete

== gameplay/community/dialogues/skellige/chats/chat_kaer_trolde_castle_guards_02_m.w2scene:
  q206_complete

== gameplay/community/dialogues/skellige/chats/chat_kaer_trolde_servants_02_m.w2scene:
  q206_complete
  q206_svanrige_king

== gameplay/community/dialogues/skellige/chats/chat_kear_trolde_servants_01_m.w2scene:
  q206_complete
  q210_lugos_dead

== gameplay/community/dialogues/skellige/chats/chat_larvik_village_warriors_01_m.w2scene:
  mh202_done

== gameplay/community/dialogues/skellige/chats/chat_lugos_the_mads_keep_villagers_01_m.w2scene:
  q206_becca_queen
  q206_completed
  q206_svanrige_king

== gameplay/community/dialogues/skellige/chats/chat_lugos_the_mads_keep_villagers_03_m.w2scene:
  q201_fistfight

== gameplay/community/dialogues/skellige/chats/chat_southern_torch_lighthouse_villagers_01_m.w2scene:
  mh207_done

== gameplay/community/dialogues/skellige/shops/shop_arinbjorn_blacksmith.w2scene:
  kaer_trolde_blacksmith_01_met

== gameplay/community/dialogues/skellige/shops/shop_brokvar_innkeeper_01.w2scene:
  brokvar_innkeeper_01_met

== gameplay/community/dialogues/skellige/shops/shop_dimun_trader_01.w2scene:
  dimun_trader_01_met

== gameplay/community/dialogues/skellige/shops/shop_freya_temple_priestess_01.w2scene:
  freya_tempale_pristess_01_met

== gameplay/community/dialogues/skellige/shops/shop_fyresdal_smith_01.w2scene:
  fyresdal_smith_01_craft_nonmet
  fyresdal_smith_01_talked_to

== gameplay/community/dialogues/skellige/shops/shop_kaer_trolde_castle_armorer_01.w2scene:
  kaer_trolde_armorer_01_met
  q208_completed
  sq108_heard_about_blacksmith

== gameplay/community/dialogues/skellige/shops/shop_kaer_trolde_general.w2scene:
  shop_kaer_trolde

== gameplay/community/dialogues/skellige/shops/shop_kaer_trolde_sjusta.w2scene:
  q201_sjustamet
  sjusta_met

== gameplay/community/dialogues/skellige/shops/shop_larvik_warriors_hall_keeper_01.w2scene:
  larvik_warriors_hall_keeper_01_met

== gameplay/community/dialogues/skellige/shops/shop_lugos_keep_armorer_01.w2scene:
  lugos_keep_armoere_01_met

== gameplay/community/dialogues/skellige/shops/shop_lugos_keep_smith_01.w2scene:
  lugos_keep_blacksmith_01_met

== gameplay/community/dialogues/skellige/shops/shop_rannveig_herbalist_woman_01.w2scene:
  mq2030_curse_lifted

== gameplay/community/dialogues/skellige/shops/shop_tuiseach_smith_01.w2scene:
  tuiseach_smith_01_met

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_boatbuilder_03.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_druid_01.w2scene:
  q202_hjalmar_saved

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_druid_02.w2scene:
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_druid_03.w2scene:
  q202_hjalmar_saved
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_druid_04.w2scene:
  q202_hjalmar_saved

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_druid_05.w2scene:
  q206_becca_queen
  q206_svanrige_king
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_01.w2scene:
  q202_hjalmar_saved

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_02.w2scene:
  q206_becca_queen
  sq201_morkvarg_free

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_03.w2scene:
  q206_hjalmar_king
  q210_on_quest
  sq201_morkvarg_free

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_04.w2scene:
  q205_monster_curse_lifted
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_05.w2scene:
  q205_completed

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_fisherman_06.w2scene:
  q203_got_rid_of_him
  q206_hjalmar_king
  sq205_finished

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_guard_01.w2scene:
  q202_folan_lives
  q202_hjalmar_saved
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_guard_02.w2scene:
  q202_hjalmar_saved
  sq205_finished

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_guard_04.w2scene:
  q202_hjalmar_saved
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_guard_05.w2scene:
  q201_fistfight
  q202_hjalmar_saved

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_guard_06.w2scene:
  q202_hjalmar_saved
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_hunter_01.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him
  sq201_dead_4_ever

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_hunter_02.w2scene:
  q202_hjalmar_saved
  q206_berserkers_attacked

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_hunter_03.w2scene:
  q206_becca_queen
  q206_hjalmar_king
  q206_svanrige_king
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_innkeeper_01.w2scene:
  q205_quest_end
  q206_becca_queen
  q206_hjalmar_king
  q206_svanrige_king
  sq201_dead_4_ever

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_man_01.w2scene:
  q202_hjalmar_saved
  q206_becca_queen
  q206_hjalmar_king
  q206_svanrige_king

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_man_02.w2scene:
  q206_berserkers_attacked
  q206_hjalmar_king

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_man_03.w2scene:
  q203_got_rid_of_him
  q206_completed

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_man_04.w2scene:
  q206_berserkers_attacked
  q206_lady_bran_convicted1

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_woman_01.w2scene:
  q205_quest_end
  q206_becca_queen

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_woman_02.w2scene:
  q202_hjalmar_saved
  sq201_dead_4_ever

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_woman_03.w2scene:
  q201_fistfight
  q202_hjalmar_saved
  q203_got_rid_of_him
  q206_becca_queen
  q206_hjalmar_king
  sq201_dead_4_ever

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_old_woman_04.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him
  q206_hjalmar_king

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_priestess_01.w2scene:
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_priestess_02.w2scene:
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_priestess_03.w2scene:
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_01.w2scene:
  q202_hjalmar_saved
  q206_berserkers_attacked

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_02.w2scene:
  q206_becca_queen

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_03.w2scene:
  q206_becca_queen
  q206_hjalmar_king
  q206_svanrige_king

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_04.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_05.w2scene:
  q206_becca_queen
  q206_hjalmar_king
  q206_svanrige_king
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_villager_06.w2scene:
  q202_geralt_in_song
  q202_hjalmar_saved
  q203_got_rid_of_him
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_waitress_01.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_waitress_02.w2scene:
  q202_bring_hjalmar
  q202_folan_met
  q210_on_quest

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_warrior_01.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him
  q206_completed
  q206_hjalmar_king
  q206_svanrige_king

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_warrior_02.w2scene:
  q205_quest_end
  q206_berserkers_attacked

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_warrior_03.w2scene:
  nonmet_vset_skellige_warrior_03
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_warrior_04.w2scene:
  q202_hjalmar_saved
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_warrior_05.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_woman_01.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_woman_02.w2scene:
  q201_fistfight
  q202_bring_hjalmar
  q202_hjalmar_saved
  q203_got_rid_of_him
  q205_quest_end
  q206_becca_queen
  q206_berserkers_attacked
  q206_completed
  q206_hjalmar_king
  q206_svanrige_king
  q210_on_quest
  sq201_dead_4_ever

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_woman_03.w2scene:
  q202_bring_hjalmar

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_woman_04.w2scene:
  q202_hjalmar_saved
  q203_got_rid_of_him
  q205_quest_end

== gameplay/community/dialogues/skellige/voicesets/vset_skellige_woman_05.w2scene:
  q202_hjalmar_saved
  q206_hjalmar_king
  q206_svanrige_king

== gameplay/community/dialogues/skellige/voicesets/vset_wild_hunt_warrior_01.w2scene:
  q104_nithral_vset

== gameplay/community/dialogues/traveling_merchant/traveling_merchant_01.w2scene:
  traveling_merchant_01_crow_perch
  traveling_merchant_01_gp_switch
  traveling_merchant_01_gustfields
  traveling_merchant_01_homestead
  traveling_merchant_01_met

== gameplay/community/shops_and_craftsmen/nml_shops_and_craftsmen.w2phase:
  dlc2_installed
  q101_attacked_everyone
  q101_baron_men_attacked
  q101_finished
  q101_fire_lit
  q101_innkeeper_default
  q101_know_about_hendrik_bart
  q103_start_burning_stables
  q111_sabath_started
  sq108_master_blacksmith_failed
  sq108_master_bsmith_helped
  sq108_reward_armor_ready

== gameplay/community/shops_and_craftsmen/novigrad_shops_and_craftsmen.w2phase:
  brothel_passiflora_pick_girl_on
  brothel_peggleg_peggys_pick_girl_on
  dlc2_installed
  elihal_dd_start
  elihal_dd_stop
  hattori_default_start
  hattori_default_stop
  mh303_done
  mq3004_fdb_quest_active
  mq3027_my_manifest_known
  mq3041_quest_done
  mq6003_fact_taxes_paid
  mq6003_flip_vivaldi_default
  olivier_dd_start
  olivier_dd_stop
  q402_escort_completed
  sq304_sword_ready
  sq306_passiflora_cleared_for_game
  vivaldi_loan_taken

== gameplay/community/shops_and_craftsmen/prologue_shops_and_craftsmen.w2phase:
  bandit_camp_boss_opened
  prologue_griffon_merchant_activate

== gameplay/community/shops_and_craftsmen/skellige_shops_and_craftsmen.w2phase:
  arinbjorn_innkeeper_01_dialog_off
  arinbjorn_innkeeper_01_dialog_on
  dlc2_installed
  gremista_dd_start
  gremista_dd_stop
  kaer_trolde_castle_blacksmith_01_angry
  kaer_trolde_castle_blacksmith_01_off
  kaer_trolde_castle_blacksmith_01_on
  mq2030_curse_lifted
  mq2030_curse_reversed
  mq2030_shop_interrupt
  q501_eredin_starts
  sq209_barkeep_reset

== gameplay/community/shops_and_craftsmen/traveling_merchants/phases/patch_signal_phase_01.w2phase:
  achievement_need_for_speed
  dandelion_dd_start
  dandelion_dd_stop
  hr101_1_won
  hr101_2_won
  hr101_3_won
  hr201_won
  hr202_won
  hr203_won
  hr204_won
  mq1016_job_taken
  mq3017_helped_girl
  mq3026_won_night_race
  patch_phase_01
  q103_nml_part1_ciri
  q202_finished
  q205_completed
  q206_taken_reward_from_crach
  q208_completed
  q304_switch_off_gameplay_block
  q310_chase_active
  q310_ciri_to_sturgeon
  q310_started
  q310_yen_about_rita
  q310_yen_item_given
  q310_yen_novigrad
  sq102_completed
  sq301_add_mask_to_elihal
  sq301_fully_dressed
  sq301_got_suit
  witcher3_game_finished

== gameplay/community/shops_and_craftsmen/traveling_merchants/phases/patch_signal_phase_02.w2phase:
  actor_mq3031_nidas_was_killed
  gremista_dd_start
  hr101_1_item_reward
  hr101_1_won
  hr101_2_item_reward
  hr101_2_won
  hr101_3_item_reward
  hr101_3_won
  hr101_cart_happened
  hr101_known
  hr101_missed checkpoint
  hr101_racer_1
  hr101_racer_2
  hr101_racer_3
  hr101_start
  hr101_victory_count
  hr101_won
  hr101_won_temp
  mh201_completed
  mq1023_paid
  mq3031_active
  patch_phase_02
  q002_left_village
  q310_completed
  q310_riot_guards
  q501_eredin_died
  sq107_complete
  sq205_finished
  sq205_success
  witcher3_game_finished

== gameplay/community/shops_and_craftsmen/traveling_merchants/phases/traveling_merchants.w2phase:
  cg_innkeepers_done
  cg_lock_gwint_card_havekar_nurse3
  cg_lock_gwint_card_havekar_support3
  cg_lock_gwint_card_mahakam5
  cg_lock_gwint_card_vrihedd_brigade2
  de29_liberated
  ferry_station_1_complete
  lw_gr13_blacksmith_freed
  lw_gr13_cage
  lw_gr13_completed
  lw_tm12_attack
  lw_tm12_retroactive_fix
  mh104_job_taken
  mh210_initial_talk
  mh210_witness_done
  mh301_gryphon_spotted
  mh301_initial_talk
  mh301_investigation_done
  mh301_nest_spotted
  mh307_completed
  mh307_failed
  mh307_job_given
  mq1002_teleport_found
  mq1002_unlocked
  mq1016_aftermath_triggered
  mq1016_children_met
  mq1016_clue_mixed_tracks
  mq1016_clue_wolf_tracks
  mq1016_done
  mq1016_human_tracks
  mq1016_job_taken
  mq1016_kinds_found
  mq1016_old_lady_met
  mq1016_switch_off_chickens
  mq1016_take_kids_in
  mq1039_quest_failed
  mq1039_retroactive_fix_001
  mq2043_trial_succeeded
  mq3012_noble_statuette
  mq3012_soldier_statuette
  mq3012_spell_cast
  mq3035_fdb_contact_met
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_radovid_dead
  mq3035_fdb_roche_talar_dead
  mq4005_fdb_started
  nml_mp_tm5_cont
  old_bugfixing_phase_was_active
  olivier_dd_start
  patch_1_12
  q101_baron_men_attacked
  q101_finished
  q101_talked_to_thugs
  q104_elven_wizard
  q105_evil_spirit_destroyed
  q106_failed
  q109_confronted_keira
  q201_landed_on_skellige
  q205_completed
  q206_party_started
  q208_completed
  q210_on_quest
  q302_casino_destroyed
  q302_combat_casino
  q302_combat_ring
  q302_dijkstra_about_roche
  q302_find_camp
  q302_marks
  q302_ring_destroyed
  q302_roche_leaving_respawned
  q302_stone
  q302_whoreson
  q302_whoreson_found
  q308_sent_to_dawn_estate
  q309_completed
  q309_failed
  q309_for_disabling_sq302
  q309_keys_story_completed
  q309_letter_represions_started
  q309_saw_olivier_dead
  q309_told_triss_you_love_her
  q309_triss_abandons_mages
  q309_triss_stayed
  q309_wounded_represions_started
  q309_wounded_wh_blood
  q309_wounded_wh_scent
  q310_charmed_guards
  q310_dijkstras_other_leg
  q310_divination_done
  q310_has_wine
  q310_know_about_philippa
  q310_lodge
  q311_completed
  q401_reached_kaer_morhen
  q402_escort_completed
  q403_completed
  q403_hunting_stop
  q501_eredin_starts
  q501_naglfar_arrived
  radovid_fdb_ship_novigrad
  roche_dd_start
  roche_dd_stop
  sb5_container_opened_fact
  sk75_liberated
  sq102_camp_deserted
  sq202_yen_girlfriend
  sq205_known
  sq209_part_2_done
  sq209_part_2_started
  sq302_completed
  sq302_philippa_in_megascope
  sq302_sorceress_got_crystal
  sq303_renovation_completed
  sq312_fact_started
  sq315_fdb_passiflora_meeting
  sq315_fdb_quest_complete
  sq315_fdb_roche_in_passiflora
  sq315_fdb_roche_left
  talar_dd_start
  th1007_fdb_gate_opened
  th1007_fdb_throne_room
  th1007_fdb_wraiths_spawn
  th1009_fdb_varin_cave
  triss_dd_start
  triss_dd_stop
  witcher3_game_finished

== living_world/custom_events/nml/greyrocks/gr28_fort_mar/gr28_fort_mar.w2phase:
  lw_gr28_nest_destroyed

== living_world/custom_events/nml/the_mire/tm_underwater_dungeon.w2phase:
  tm_sunken_treasure_found

== living_world/custom_events/prologue/lw_bandit_camp_location.w2phase:
  bandit_camp_boss_opened

== living_world/custom_events/prologue/lw_deserter_stash_location.w2phase:
  all_telescope_cont_open
  telescope_cont_open_1
  telescope_cont_open_2
  telescope_cont_open_3

== living_world/custom_events/prologue/lw_global_mappin_status.w2phase:
  bandit_3_chest_opened
  bandit_4_chest_opened
  bandit_campfire2_opened
  bandit_campfire_opened
  bandits_camp_opened_1
  bandits_camp_opened_2
  bandits_road_opened
  bandits_sanctuary_opened
  beached_boats_opened
  boat_wreck_opened_1
  boat_wreck_opened_2
  cemetary_wraith_opened
  contraband_opened_1
  contraband_opened_2
  contraband_opened_3
  contraband_opened_4
  contraband_opened_5
  contraband_opened_6
  dead_horses_opened_1
  dead_horses_opened_2
  lw_prologue_temerian_treasure_opened
  spoils_of_war_opened
  waterhag_opened_01

== living_world/custom_events/prologue/lw_prologue_gate_opening.w2phase:
  lw_gate_opening

== living_world/custom_events/prologue/lw_prologue_temerian_treasure.w2phase:
  lw_prologue_temerian_treasure_opened_mill

== living_world/custom_events/prologue/road_protection_shrine.w2phase:
  road_shrine_free
  road_shrine_liberated

== living_world/custom_events/skellige/ard_skellig/lw_global_mappin_state_change_ard_skellig.w2phase:
  lw_sk57_treasure_found
  lynx_cont_lw_open
  sk100a_cont_open_1
  sk100a_cont_open_2
  sk100b_cont_open_1
  sk100b_cont_open_2
  sk101_cont_open_1
  sk101_cont_open_2
  sk102_cont_open_1
  sk102_cont_open_2
  sk102_cont_open_3
  sk103_cont_open_1
  sk103_cont_open_2
  sk103_cont_open_3
  sk103_opened
  sk104_cont_open_1
  sk104_cont_open_2
  sk104_cont_open_3
  sk105_cont_open
  sk105_cont_open_1
  sk105_cont_open_2
  sk105_cont_open_3
  sk106_cont_open
  sk106_cont_open_1
  sk106_cont_open_2
  sk106_cont_open_3
  sk107_cont_open_1
  sk107_cont_open_2
  sk107_cont_open_3
  sk108_cont_open
  sk109a_cont_open_1
  sk109a_cont_open_2
  sk109a_cont_open_3
  sk109b_cont_open_1
  sk109b_cont_open_2
  sk109b_cont_open_3
  sk109c_cont_open_1
  sk109c_cont_open_2
  sk109c_cont_open_3
  sk109d_cont_open_1
  sk109d_cont_open_2
  sk109d_cont_open_3
  sk109e_cont_open_1
  sk109e_cont_open_2
  sk109e_cont_open_3
  sk10_giantfoot_opened
  sk110_cont_open
  sk110_cont_open_1
  sk110_cont_open_2
  sk110_cont_open_3
  sk111_cont_open_1
  sk111_cont_open_2
  sk111_cont_open_3
  sk111_mp_skellige
  sk12_elven_ruin_opened_1
  sk12_elven_ruin_opened_2
  sk12_elven_ruin_opened_3
  sk12_elven_ruin_opened_4
  sk151_cont_open
  sk153_cont_open
  sk16_mauntain_opened
  sk181_cont_open_1
  sk181_cont_open_2
  sk181_cont_open_3
  sk182_cont_open_1
  sk182_cont_open_2
  sk182_cont_open_3
  sk186_cont_open_1
  sk186_cont_open_2
  sk186_cont_open_3
  sk187_cont_open_1
  sk187_cont_open_2
  sk187_cont_open_3
  sk188_cont_open_1
  sk188_cont_open_2
  sk188_cont_open_3
  sk18_mountain_path_opened
  sk190_cont_open_1
  sk190_cont_open_2
  sk190_cont_open_3
  sk193_cont_open_1
  sk193_cont_open_2
  sk193_cont_open_3
  sk197_cont_open_1
  sk197_cont_open_2
  sk197_cont_open_3
  sk198a_cont_open_1
  sk198a_cont_open_2
  sk198a_cont_open_3
  sk198b_cont_open_1
  sk198b_cont_open_2
  sk198b_cont_open_3
  sk198c_cont_open_1
  sk198c_cont_open_2
  sk198c_cont_open_3
  sk199_cont_open_1
  sk199_cont_open_2
  sk199_cont_open_3
  sk1_cont_opened
  sk200_cont_open
  sk20_seagull_island_opened
  sk22_path_of_power_open
  sk23_grave_opened
  sk25_guard_opened_1
  sk26_witchual_opened
  sk27_burial_opened
  sk28_campfire_opened
  sk32_siren_date_opened_1
  sk32_siren_date_opened_2
  sk36_chest_opened
  sk37_container_opened
  sk38_cont_open_skl
  sk41_cont_opened_1
  sk41_cont_opened_2
  sk41_cont_opened_3
  sk41_cont_opened_4
  sk46_opened
  sk55_cont_open
  sk58_cont_open
  sk59_cont_open_1
  sk59_cont_open_2
  sk59_cont_open_3
  sk59_cont_open_4
  sk60_castle_opened
  sk60_contra_opened_1
  sk60_contra_opened_2
  sk60_contra_opened_3
  sk61_cont_open_1
  sk61_cont_open_2
  sk62_cont_open_1
  sk62_cont_open_2
  sk62_cont_open_3
  sk63_mp_skellige_open_1
  sk63_mp_skellige_open_2
  sk63_mp_skellige_open_3
  sk64_cont_open_1
  sk64_cont_open_2
  sk64_cont_open_3
  sk65_cont_open_1
  sk65_cont_open_2
  sk65_cont_open_3
  sk66_cont_open_1
  sk66_cont_open_2
  sk66_cont_open_3
  sk67_cont_opened_1
  sk67_cont_opened_2
  sk67_cont_opened_3
  sk68_mp_skellige
  sk69_opened_1
  sk69_opened_2
  sk69_opened_3
  sk70_cont_opened
  sk71_cont_open
  sk72_cont_open_1
  sk72_cont_open_2
  sk72_cont_open_3
  sk72_wild_shore_opened
  sk73_cont_open_1
  sk73_cont_open_2
  sk73_cont_open_3
  sk74_cont_open_1
  sk74_cont_open_2
  sk74_cont_open_3
  sk75_cont_open
  sk76_cont_open
  sk77_cont_open_1
  sk77_cont_open_2
  sk77_cont_open_3
  sk78_cont_open
  sk79_cont_open
  sk80a_cont_open
  sk80b_cont_open_1
  sk80b_cont_open_2
  sk80b_cont_open_3
  sk80c_cont_open
  sk81_cont_open
  sk82_cont_open
  sk83_cont_open_1
  sk83_cont_open_2
  sk83_cont_open_3
  sk84_cont_open
  sk85_cont_open_1
  sk85_cont_open_2
  sk85_cont_open_3
  sk86_cont_open
  sk86_dark_castle_opened
  sk87_cont_open_1
  sk87_cont_open_2
  sk87_cont_open_3
  sk87a_cont_open_1
  sk87a_cont_open_2
  sk87a_cont_open_3
  sk87b_cont_open_1
  sk87b_cont_open_2
  sk87b_cont_open_3
  sk87c_cont_open_1
  sk87c_cont_open_2
  sk87c_cont_open_3
  sk88_cont_open
  sk89_cont_open_1
  sk89_cont_open_2
  sk89_cont_open_3
  sk90_cont_open
  sk91_cont_open
  sk92a_cont_open_1
  sk92a_cont_open_2
  sk92b_cont_open_1
  sk92b_cont_open_2
  sk93_cont_open_1
  sk93_cont_open_2
  sk94_cont_open_1
  sk94_cont_open_2
  sk95a_cont_open_1
  sk95a_cont_open_2
  sk95b_cont_open_1
  sk95b_cont_open_2
  sk96_cont_open_1
  sk97_cont_open_1
  sk97_cont_open_2
  sk97_cont_open_3
  sk97_cont_open_4
  sk98_cont_open
  sk99_a_cont_1
  sk99_a_cont_2
  sk99b_cont_1
  sk99b_cont_2
  sk_152_cont_open
  skq210_cont_open
  skq210_opened

== living_world/dialogue/nml/crow_perch/shop_glinsk_barber_01.w2scene:
  shop_glinsk_barber_01_saved

== living_world/dialogue/nml/crow_perch/shop_glinsk_general_store_01.w2scene:
  shop_glinsk_general_store_01

== living_world/dialogue/nml/greyrocks/shop_glinsk_armorer_01.w2scene:
  barons_armorer_met
  q102_completed
  sq108_heard_about_blacksmith
  sq108_heard_about_blacksmith_mappin

== living_world/dialogue/nml/homestead/shop_scoiatael_camp_oxenfurt.w2scene:
  hs2_merchant_reward

== living_world/dialogue/skellige/ard_skellig/shop_herbalist_community_herbalist_01.w2scene:
  herbalist_community_herbalist_01_met
  shop_herbalist_community_herbalist_01_saved

== living_world/dialogue/skellige/ard_skellig/shop_larvik_smith_01.w2scene:
  shop_larvik_smith_01_saved

== living_world/phases/living_world.w2phase:
  km_poi_leshy_open
  km_poi_wyvern_cont
  lw_n1_read
  q310_started
  q401_layers_km_loaded

== living_world/phases/no_mans_land/bald_mountain/lw_bald_mountain.w2phase:
  enter military_brothel_trigger

== living_world/phases/no_mans_land/bald_mountain/lw_bm6_miniboss.w2phase:
  lw_bm6_completed

== living_world/phases/no_mans_land/crookback_bog/lw_cb17_childprison.w2phase:
  lw_cb17_unlock

== living_world/phases/no_mans_land/crows_perch/cp11_hangmans_glade.w2phase:
  actor_lw_cp11_cyclops_was_killed
  lw_cp11_change_setup
  nml_mp_cp11_cont
  sq108_completed

== living_world/phases/no_mans_land/crows_perch/cp33_sunken_treasure.w2phase:
  cp33_chest_opened

== living_world/phases/no_mans_land/crows_perch/cp34_shipwreck_island.w2phase:
  lw_cp34_found_chest_01
  lw_cp34_found_chest_02
  lw_cp34_found_chest_03
  lw_cp34_found_chest_04

== living_world/phases/no_mans_land/crows_perch/lw_cp13_renegade_encampment.w2phase:
  fdb_glinsk_village_fixed
  lw_cp13_attack
  lw_cp13_cage_door_opened
  lw_cp13_cage_locked
  lw_cp13_completed
  lw_tm12_completed
  mp_lw_cp13_camp_activated
  mp_lw_tm12_refugee_camp_activated
  nw_cp13_posters_read

== living_world/phases/no_mans_land/crows_perch/lw_crows_perch.w2phase:
  cp5_liberated
  cp5_nest_down

== living_world/phases/no_mans_land/descent/lw_de11_granary_exchange.w2phase:
  lw_de11_treasure_opened

== living_world/phases/no_mans_land/descent/lw_de32_campfire_treasure.w2phase:
  de32_chest_opened

== living_world/phases/no_mans_land/descent/lw_sk_poi_029_camp.w2phase:
  de29_bandits_cleared
  de29_liberated
  sq102_camp_deserted

== living_world/phases/no_mans_land/greyrocks/gr11_ghouls.w2phase:
  ferry_station_3_complete
  gr11b_liberated

== living_world/phases/no_mans_land/greyrocks/gr16_prospector_camp.w2phase:
  lw_gr16_fb_completed
  lw_gr16_fb_spot1_killed
  lw_gr16_fb_spot3_killed
  lw_gr16_pc_completed
  lw_gr16_posters_read
  mq1022_fdb_troll_killed

== living_world/phases/no_mans_land/greyrocks/gr27_launch_jetty.w2phase:
  gr27_cleared
  gr27_complete
  gr27_liberated

== living_world/phases/no_mans_land/greyrocks/lw_gr12_ferry_station_2.w2phase:
  ferry_station_2_complete
  gr12_chest_opened
  gr12_drowners_dead
  gr12_liberated

== living_world/phases/no_mans_land/greyrocks/lw_gr13_slavers.w2phase:
  lw_cp13_completed
  lw_gr13_cage_locked
  lw_gr13_completed
  lw_gr13_loot_obtained
  lw_gr13_posters_read
  lw_tm12_completed
  mp_lw_gr13_ferry_station_3_active

== living_world/phases/no_mans_land/greyrocks/lw_gr29_pontar_bridge.w2phase:
  generic_merch_dd_stop
  lw_gr29_attack
  lw_gr29_cage_door_opened
  lw_gr29_cage_locked

== living_world/phases/no_mans_land/greyrocks/lw_gr34_miniboss.w2phase:
  lw_gr34_treasure_opened

== living_world/phases/no_mans_land/greyrocks/lw_gr38_campfire.w2phase:
  lw_gr38_campfire_cleared
  sq315_fdb_quest_active

== living_world/phases/no_mans_land/greyrocks/lw_gr39_buried_treasure.w2phase:
  lw_gr39_treasure_opened

== living_world/phases/no_mans_land/greyrocks/lw_gr40_buried_treasure.w2phase:
  lw_gr40_treasure_opened

== living_world/phases/no_mans_land/greyrocks/lw_gr41_buried_treasure.w2phase:
  lw_gr41_treasure_opened

== living_world/phases/no_mans_land/greyrocks/lw_gr7_hidden_pier.w2phase:
  lw_gr7_chest_opened

== living_world/phases/no_mans_land/greyrocks/lw_gr_poi_042_ponds.w2phase:
  lw_gr_poi_042_chest_unlocked

== living_world/phases/no_mans_land/greyrocks/lw_greyrocks.w2phase:
  ferry_station_1_complete
  ferry_station_2_complete
  ferry_station_3_complete

== living_world/phases/no_mans_land/greyrocks/lw_sb24_buried_treasure.w2phase:
  lw_sb24_treasure_opened

== living_world/phases/no_mans_land/homestead/lw_hs13_rotfiend_nest.w2phase:
  hs13_nest_destroyed

== living_world/phases/no_mans_land/homestead/lw_hs1_ursten.w2phase:
  lw_hs1_nest_1_destroyed
  lw_hs1_nest_boss_completed

== living_world/phases/no_mans_land/homestead/lw_hs20_harpies.w2phase:
  nml_mp_hs20_cont
  triss_dd_start

== living_world/phases/no_mans_land/homestead/lw_hs2_scoiatael_camp.w2phase:
  lw_hs2_cage_door_opened
  lw_hs2_cage_locked
  lw_hs2_completed
  mp_lw_hs2_bandit_camp_active

== living_world/phases/no_mans_land/lw_nml_nests_enabling_poe_groups.w2phase:
  cp34_ghouls_nest_nest_destr
  cp35_ghouls_nest_nest_destr
  lw_de_poi_032_nest_2_nest_destr

== living_world/phases/no_mans_land/lw_no_mans_land.w2phase:
  bm1_cont_opened2b
  bm1_cont_opened2c
  bm1a_cont _open1
  bm1a_cont _open2
  de100_cont_open
  de32_chest_opened
  de6_cont_open
  gf200_cont_open
  gf201_cont_open
  gf202_cont_open
  gf203_cont_open
  gf204_cont_open
  gr15_cont_open
  hs22_cont_open_nml
  lw_sb20_opened
  mp2_opened
  mq2048_done
  nml_mp_bm2_cont1
  nml_mp_bm2_cont2
  nml_mp_bm3_cont
  nml_mp_bm4_cont
  nml_mp_cb17_cont1
  nml_mp_cb17_cont2
  nml_mp_cb18_cont
  nml_mp_cb19_cont
  nml_mp_cp14_cont
  nml_mp_cp30_cont
  nml_mp_cp31_cont1
  nml_mp_cp31_cont2
  nml_mp_cp36_cont
  nml_mp_cp37_cont
  nml_mp_cp38_cont
  nml_mp_cp39_cont1
  nml_mp_cp39_cont2
  nml_mp_cp39_cont3
  nml_mp_de101_cont
  nml_mp_de102_cont
  nml_mp_de24_cont1
  nml_mp_de24_cont2
  nml_mp_de24_cont3
  nml_mp_de24_cont4
  nml_mp_de25_cont
  nml_mp_de27_cont
  nml_mp_de2_cont1
  nml_mp_de2_cont2
  nml_mp_de30
  nml_mp_de30_cont
  nml_mp_de31_cont
  nml_mp_gf2_cont
  nml_mp_gf42_cont1
  nml_mp_gf42_cont2
  nml_mp_gf43_cont1
  nml_mp_gf43_cont2
  nml_mp_gf43_cont3
  nml_mp_gf44_cont1
  nml_mp_gf44_cont2
  nml_mp_gf44_cont3
  nml_mp_gr100_cont
  nml_mp_gr28_cont1
  nml_mp_gr28_cont2
  nml_mp_gr31_cont
  nml_mp_gr33_cont
  nml_mp_gr38_cont1
  nml_mp_gr38_cont2
  nml_mp_gr38_cont3
  nml_mp_gr38_cont4
  nml_mp_gr38_cont5
  nml_mp_hs11_cont
  nml_mp_hs15_cont
  nml_mp_hs16_cont
  nml_mp_hs20_cont
  nml_mp_mp5_cont
  nml_mp_sb100_cont1
  nml_mp_sb100_cont2
  nml_mp_sb100_cont3
  nml_mp_sb11_cont
  nml_mp_sb12_cont
  nml_mp_sb18_cont
  nml_mp_sb19_cont1
  nml_mp_sb23_cont
  nml_mp_sb24_swamp_cont
  nml_mp_sb25_cont
  nml_mp_sb26_cont1
  nml_mp_sb26_cont2
  nml_mp_sb26_cont3
  nml_mp_sb30_cont1
  nml_mp_sb30_cont2
  nml_mp_sb5_cont
  nml_mp_sb7_cont
  nml_mp_tm100_cont
  nml_mp_tm101_cont
  nml_mp_tm5_cont
  pit_camp_opened_nml
  sb05_cont _open
  sb101_cont_open11
  sb7_camp_mp_cont
  th1005_fdb_armor_set_found
  tm201_cont_open
  wraith_nml_cont_open

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb10_cultists.w2phase:
  nml_doomsday_worshippers_on
  sb10_bandits_cleared
  sb10_liberated

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb13_broken_boats.w2phase:
  lw_sb13_chest_opened

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb14_fisherman_hut.w2phase:
  lw_sb14_attack
  lw_sb14_completed
  lw_sb14_posters_read
  lw_sb18_completed
  lw_sb3_completed
  mp_lw_sb14_active
  mp_lw_sb18_active
  mp_lw_sb3_active
  sb14_liberated

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb18_pirate_base.w2phase:
  lw_sb14_completed
  lw_sb18_attack
  lw_sb18_completed
  lw_sb2_completed
  lw_sb3_completed
  mp_lw_sb14_active
  mp_lw_sb2_active
  mp_lw_sb3_active

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb21_gigglers_village_normals.w2phase:
  sb21_spawn_normals

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb2_shipwreck_shore.w2phase:
  lw_sb14_completed
  lw_sb17_chest_opened
  lw_sb18_completed
  lw_sb2_attack
  lw_sb2_completed
  lw_sb2_posters_read
  lw_sb3_completed
  mp_lw_sb14_active
  mp_lw_sb18_active
  mp_lw_sb2_active
  mp_lw_sb3_active

== living_world/phases/no_mans_land/spitfire_bluff/lw_sb3_boatyard.w2phase:
  lw_sb14_completed
  lw_sb14_posters_read
  lw_sb17_completed
  lw_sb18_completed
  lw_sb2_completed
  lw_sb2_posters_read
  lw_sb3_attack
  lw_sb3_completed
  lw_sb3_posters_read
  lw_sb5_completed
  mp_lw_sb14_active
  mp_lw_sb17_active
  mp_lw_sb18_active
  mp_lw_sb2_active
  mp_lw_sb3_active
  mp_lw_sb7_active
  sb3_liberated

== living_world/phases/no_mans_land/the_mire/lw_tm12_refugee_camp.w2phase:
  actor_lw_tm12_boss_was_killed
  fdb_glinsk_village_fixed
  lw_cp13_completed
  lw_tm12_attack
  lw_tm12_cage_door_opened
  lw_tm12_cage_locked
  lw_tm12_completed
  lw_tm12_posters_read
  lw_tm12_retroactive_fix
  mp_lw_cp13_camp_activated
  mp_lw_tm12_refugee_camp_activated

== living_world/phases/no_mans_land/the_mire/lw_tm15_mini_boss.w2phase:
  tm15_chest_opened

== living_world/phases/no_mans_land/the_mire/lw_tm3_willows_grove.w2phase:
  lw_tm3_completed
  tm3_liberated

== living_world/phases/no_mans_land/the_mire/lw_tm4_brickmakers_settlement.w2phase:
  tm4_liberated
  tm4_workers_are_back

== living_world/phases/no_mans_land/the_mire/lw_tm6_tomb_raider_camp.w2phase:
  lw_tm6_treasure_opened

== living_world/phases/skellige/ard_skellig/lw_sk4_shipwreck_island.w2phase:
  lw_sk4_treasure_opened

== living_world/phases/skellige/ard_skellig/lw_sk52_island_village.w2phase:
  sk52_liberated
  sk52_wolves_dead

== living_world/phases/skellige/ard_skellig/lw_skl_ard_skellig.w2phase:
  hr204_completed
  sk106_cont_open
  sk75_destro
  sk75_lamia_dead
  sk75_liberated
  sk75_sirens_dead

== living_world/phases/skellige/ard_skellig/sk10_woodcutters_lodge.w2phase:
  sk10_liberated

== living_world/phases/skellige/ard_skellig/sk18_whale_graveyard.w2phase:
  lw_sk18_completed

== living_world/phases/skellige/ard_skellig/sk26_witchual.w2phase:
  lw_ard18_elemental_dead

== living_world/phases/skellige/ard_skellig/sk29_mushroom_farms.w2phase:
  lw_sk29_camp_killed
  lw_sk29_completed
  sk102_pois_done

== living_world/phases/skellige/ard_skellig/sk30_mushroom_lakes.w2phase:
  sk30_chest_opened

== living_world/phases/skellige/ard_skellig/sk31_castle_village.w2phase:
  lw_sk31_treasure_opened

== living_world/phases/skellige/ard_skellig/sk33_blind_eye_lumbermill.w2phase:
  lw_sk33_completed
  sk33_liberated

== living_world/phases/skellige/ard_skellig/sk39_southern_torch.w2phase:
  actor_sk39_siren_01_was_killed
  actor_sk39_siren_02_was_killed

== living_world/phases/skellige/ard_skellig/sk3_scuttled_ship.w2phase:
  sk3_container_opened

== living_world/phases/skellige/ard_skellig/sk57_treasure_hunt.w2phase:
  lw_sk57_treasure_found

== living_world/phases/skellige/ard_skellig/sk5_southern_shore.w2phase:
  lw_sk_poi_005_treasure_found

== living_world/phases/skellige/ard_skellig/sk90_pirate_coast_camp.w2phase:
  lw_sk90_attack
  lw_sk90_cage_door_opened
  lw_sk90_cage_locked
  lw_sk90_completed

== living_world/phases/skellige/faroe/lw_sk_poi_056.w2phase:
  lw_sk56_treasure_found

== living_world/phases/skellige/hindersfjall/lw_sk51_island_hut.w2phase:
  lw_sk51_completed
  sk51_liberated

== living_world/phases/skellige/spikeroog/sk42_power_stone.w2phase:
  lw_sk42_treasure_found

== living_world/phases/skellige/spikeroog/sk_50_new_1.w2phase:
  lw_sk50_treasure_found

== living_world/phases/skellige/water_pois/lw_sk38_volcano_island.w2phase:
  lw_sk38_treasure_opened

== living_world/phases/skellige/water_pois/sk48_splintered_ships.w2phase:
  sk48_container_opened_2

== living_world/treasure_hunting/th1001_viper_set.w2phase:
  start_th_tutorial
  th1003_fdb_viper_complete

== living_world/treasure_hunting/th1003_lynx/phases/th1003_lynx_set_upgrades.w2phase:
  th1003_fdb_boots_upgrade1_explored
  th1003_fdb_boots_upgrade1_location
  th1003_fdb_brick_used
  th1003_fdb_gloves_upgrade1_explored
  th1003_fdb_jacket_upgrade1_explored
  th1003_fdb_jacket_upgrade1_location
  th1003_fdb_jacket_upgrade2_explored
  th1003_fdb_jacket_upgrade2_location
  th1003_fdb_jacket_upgrade3_explored
  th1003_fdb_jacket_upgrade3_location
  th1003_fdb_pants_upgrade1_explored
  th1003_fdb_pants_upgrade1_location
  th1003_fdb_silver_sword_upgrade1_explored
  th1003_fdb_silver_sword_upgrade1_location
  th1003_fdb_silver_sword_upgrade2_explored
  th1003_fdb_silver_sword_upgrade2_location
  th1003_fdb_silver_sword_upgrade3_explored
  th1003_fdb_silver_sword_upgrade3_location
  th1003_fdb_steel_sword_upgrade1_explored
  th1003_fdb_steel_sword_upgrade1_location
  th1003_fdb_steel_sword_upgrade2_explored
  th1003_fdb_steel_sword_upgrade2_location
  th1003_fdb_steel_sword_upgrade3_explored
  th1003_fdb_steel_sword_upgrade3_location
  th1003_fdb_upgrades_1a_done
  th1003_fdb_upgrades_1b_done
  th1003_fdb_upgrades_2_done
  th1003_fdb_upgrades_3_done
  th1003_lynx_upgrade_01_gloves_location
  th1003_map_lynx_upgrade1a
  th1003_map_lynx_upgrade1b
  th1003_map_lynx_upgrade2
  th1003_map_lynx_upgrade3

== living_world/treasure_hunting/th1003_lynx_set.w2phase:
  th1003_fdb_armor_crossbow_looted
  th1003_fdb_armor_part_looted
  th1003_fdb_armor_set_looted
  th1003_fdb_armor_silver_sword_looted
  th1003_fdb_armor_steel_sword_looted
  th1003_fdb_ilussion_lab_dispelled
  th1003_fdb_lynx_complete
  th1003_fdb_silver_sword_clue
  th1003_fdb_steel_sword_clue
  th1003_lynx_armor_completed
  th1003_lynx_base_set_completed

== living_world/treasure_hunting/th1005_griffon/scenes/chat_th1005_verden_peasants_03_m.w2scene:
  th1005_fdb_armor_set_found

== living_world/treasure_hunting/th1005_gryphon_set.w2phase:
  th1005_fdb_armor_part_looted
  th1005_fdb_armor_set_clue
  th1005_fdb_armor_set_found
  th1005_fdb_armor_set_looted_looted
  th1005_fdb_boots_upgrade1_explored
  th1005_fdb_gloves_upgrade1_explored
  th1005_fdb_gryphon_complete
  th1005_fdb_illusion_removed
  th1005_fdb_jacket_upgrade1_explored
  th1005_fdb_jacket_upgrade2_explored
  th1005_fdb_jacket_upgrade3_explored
  th1005_fdb_pants_upgrade1_explored
  th1005_fdb_silver_sword_looted
  th1005_fdb_silver_sword_upgrade1_explored
  th1005_fdb_silver_sword_upgrade2_explored
  th1005_fdb_silver_sword_upgrade3_explored
  th1005_fdb_steel_sword_looted
  th1005_fdb_steel_sword_upgrade1_explored
  th1005_fdb_steel_sword_upgrade2_explored
  th1005_fdb_steel_sword_upgrade3_explored
  th1005_fdb_upgrade_1a_location
  th1005_fdb_upgrade_1b_location
  th1005_fdb_upgrade_1c_location
  th1005_fdb_upgrade_1d_location
  th1005_fdb_upgrade_1e_location
  th1005_fdb_upgrade_1f_location
  th1005_fdb_upgrade_2a_location
  th1005_fdb_upgrade_2b_location
  th1005_fdb_upgrade_2c_location
  th1005_fdb_upgrade_3a_location
  th1005_fdb_upgrade_3b_location
  th1005_fdb_upgrade_3c_location
  th1005_fdb_upgrades_1a_done
  th1005_fdb_upgrades_1b_done
  th1005_fdb_upgrades_2_done
  th1005_fdb_upgrades_3_done
  th1005_map_gryphon_upgrade1a
  th1005_map_gryphon_upgrade1b
  th1005_map_gryphon_upgrade2
  th1005_map_gryphon_upgrade3

== living_world/treasure_hunting/th1007_bear_set.w2phase:
  th1007_fdb_armor_location
  th1007_fdb_bear_complete
  th1007_fdb_boots_upgrade1_explored
  th1007_fdb_crossbow_location
  th1007_fdb_crossbow_looted
  th1007_fdb_gloves_upgrade1_explored
  th1007_fdb_jacket_upgrade1_explored
  th1007_fdb_jacket_upgrade2_explored
  th1007_fdb_jacket_upgrade3_explored
  th1007_fdb_pants_upgrade1_explored
  th1007_fdb_prison_opened
  th1007_fdb_silver_sword_location
  th1007_fdb_silver_sword_looted
  th1007_fdb_silver_upgrade1_explored
  th1007_fdb_silver_upgrade2_explored
  th1007_fdb_silver_upgrade3_explored
  th1007_fdb_steel_sword_location
  th1007_fdb_steel_sword_looted
  th1007_fdb_steel_upgrade1_explored
  th1007_fdb_steel_upgrade2_explored
  th1007_fdb_steel_upgrade3_explored
  th1007_fdb_throne_room
  th1007_fdb_upgrade1_location
  th1007_fdb_upgrade_1b_location
  th1007_fdb_upgrade_1c_location
  th1007_fdb_upgrade_1d_location
  th1007_fdb_upgrade_1e_location
  th1007_fdb_upgrade_1f_location
  th1007_fdb_upgrade_2a_location
  th1007_fdb_upgrade_2b_location
  th1007_fdb_upgrade_2c_location
  th1007_fdb_upgrade_3a_location
  th1007_fdb_upgrade_3b_location
  th1007_fdb_upgrade_3c_location
  th1007_fdb_upgrades_1a_done
  th1007_fdb_upgrades_1b_done
  th1007_fdb_upgrades_2_done
  th1007_fdb_upgrades_3_done
  th1007_map_bear_upgrade1a
  th1007_map_bear_upgrade1b
  th1007_map_bear_upgrade2
  th1007_map_bear_upgrade3

== quests/additional_game_elements.w2phase:
  hr101_1_won
  hr101_2_won
  hr101_3_won
  hr201_won
  hr202_won
  hr203_won
  hr204_won
  mh101_completed
  mh102_completed
  mh103_completed
  mh104_completed
  mh105_done
  mh106_completed
  mh107_completed
  mh108_done
  mh202_done
  mh203_done
  mh206_completed
  mh207_done
  mh208_done
  mh210_done
  mh301_completed
  mh302_completed
  mh303_done
  mh304_done
  mh305_done
  mh306_done
  mh307_completed
  mh308_done
  mq1051_fact_completed_mh
  mq3026_won_night_race
  q308_in_sewers_w_vg
  q310_divination_for_music
  q310_got_philippa
  sq310_fdb_sewer_tp

== quests/bugfixing_phase.w2phase:
  actor_mq3015_wyvern_was_killed
  actor_sq204_sven_was_knocked_unconscious
  bugfix_117400
  bugfix_119490
  bugfix_119862
  bugfix_120001
  bugfix_120381
  bugfix_120900
  bugfix_120933
  bugfix_121731
  bugfix_121786
  bugfix_121787
  bugfix_124021
  bugfix_128238
  bugfix_129016
  bugfix_129238
  bugfix_129268
  bugfix_129276
  bugfix_129281
  bugfix_129289
  bugfix_129327
  bugfix_129527
  bugfix_129667
  bugfix_129687
  bugfix_130094
  bugfix_130132
  bugfix_130208
  bugfix_130222
  bugfix_130259
  bugfix_130394
  bugfix_130919
  bugfix_131583
  bugfix_131608
  bugfix_131660
  bugfix_131662
  bugfix_131949
  bugfix_132198
  bugfix_132404
  bugfix_133266
  bugfix_133629
  bugfix_134433
  bugfix_135436
  bugfix_136994
  bugfix_141177
  bugfix_147796
  bugfix_153898
  bugfix_154314
  bugfix_154986
  bugfix_155003
  bugfix_155102
  bugfix_155136
  cg_gwent_almanac_in_possession
  cg_innkeepers_done
  cg_lock_gwint_card_havekar_nurse3
  cg_lock_gwint_card_havekar_support3
  cg_lock_gwint_card_mahakam5
  cg_lock_gwint_card_vrihedd_brigade2
  chapter1_completed
  de29_liberated
  ep1_installed
  ferry_station_1_complete
  fix_stub_always_return_false
  game_is_loaded
  hr101_1_item_reward
  hr101_1_won
  hr101_2_item_reward
  hr101_2_won
  hr101_3_item_reward
  hr101_3_won
  hr101_cart_happened
  hr101_known
  hr101_missed checkpoint
  hr101_racer_1
  hr101_racer_2
  hr101_racer_3
  hr101_start
  hr101_victory_count
  hr101_won
  hr101_won_temp
  keira_part1_dd_start
  lw_fdb_prologue_cementary_cleared
  lw_gr13_blacksmith_freed
  lw_gr13_cage
  lw_gr13_completed
  lw_prologue_temerian_treasure_opened_mill
  lw_sk50_treasure_found
  lw_tm12_attack
  lw_tm12_retroactive_fix
  mh101_completed
  mh102_completed
  mh103_completed
  mh104_completed
  mh104_job_taken
  mh105_done
  mh106_completed
  mh107_completed
  mh108_done
  mh210_initial_talk
  mh210_witness_done
  mh301_completed
  mh301_gryphon_spotted
  mh301_initial_talk
  mh301_investigation_done
  mh301_nest_spotted
  mh302_completed
  mh303_done
  mh304_done
  mh306_done
  mh307_completed
  mh307_failed
  mh307_job_given
  mh308_done
  mq1002_teleport_found
  mq1002_unlocked
  mq1016_aftermath_triggered
  mq1016_children_met
  mq1016_clue_mixed_tracks
  mq1016_clue_wolf_tracks
  mq1016_done
  mq1016_human_tracks
  mq1016_job_taken
  mq1016_kinds_found
  mq1016_old_lady_met
  mq1016_switch_off_chickens
  mq1016_take_kids_in
  mq1039_quest_failed
  mq1039_retroactive_fix_001
  mq2043_trial_succeeded
  mq3012_endgame
  mq3012_noble_bought
  mq3012_noble_statuette
  mq3012_soldier_statuette
  mq3012_spell_cast
  mq3012_warrior not active
  mq3015_done
  mq3015_encounter_ignored
  mq3015_scene_open_cage
  mq3015_scene_wivern_taunt
  mq3015_wyvern_free
  mq3035_fdb_contact_met
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_radovid_dead
  mq3035_fdb_roche_talar_dead
  mq4005_fdb_started
  new_ui_tutorials_hook
  nml_mp_tm5_cont
  old_bugfixing_phase_was_active
  olivier_dd_start
  patch_1_12
  q001_nightmare_ended
  q101_baron_men_attacked
  q101_finished
  q101_fire_lit
  q101_talked_to_thugs
  q102_completed
  q103_family_found
  q104_completed
  q104_elven_wizard
  q105_evil_spirit_destroyed
  q106_failed
  q109_confronted_keira
  q109_keira_defeated
  q109_keira_to_km
  q110_accepted_reward
  q110_calmed_down_ciri
  q110_completed
  q110_refused_reward
  q110_visited_emhyr
  q201_landed_on_skellige
  q205_completed
  q206_party_started
  q208_completed
  q210_on_quest
  q302_casino_destroyed
  q302_combat_casino
  q302_combat_ring
  q302_dijkstra_about_roche
  q302_fdb_cleaver_completed
  q302_find_camp
  q302_found_rico_interrogation
  q302_marks
  q302_post_mafia_completed
  q302_ring_destroyed
  q302_roche_leaving_respawned
  q302_stone
  q302_whoreson
  q302_whoreson_found
  q305_completed
  q308_sent_to_dawn_estate
  q309_completed
  q309_failed
  q309_for_disabling_sq302
  q309_found_with_bandits
  q309_keys_story_completed
  q309_letter_represions_started
  q309_saw_olivier_dead
  q309_told_triss_you_love_her
  q309_triss_abandons_mages
  q309_triss_stayed
  q309_wh_story_completed
  q309_wounded_represions_started
  q309_wounded_wh_blood
  q309_wounded_wh_mappin1
  q309_wounded_wh_mappin1a
  q309_wounded_wh_mappin2
  q309_wounded_wh_mappin3
  q309_wounded_wh_mappin4
  q309_wounded_wh_mappin5
  q309_wounded_wh_scent
  q310_charmed_guards
  q310_dijkstras_other_leg
  q310_divination_done
  q310_has_wine
  q310_know_about_philippa
  q310_lodge
  q311_completed
  q401_reached_kaer_morhen
  q401_yennefers_spell_on_uma_stop
  q402_escort_completed
  q403_completed
  q403_hunting_stop
  q501_eredin_starts
  q501_naglfar_arrived
  q601_done
  q602_shani_romance_completed
  q603_crew_gathering
  radovid_fdb_ship_novigrad
  roche_dd_start
  roche_dd_stop
  sb5_container_opened_fact
  sk75_liberated
  something
  sq102_camp_deserted
  sq108_completed
  sq108_griffin_completed
  sq108_master_bsmith_helped
  sq202_failed
  sq202_turn_off_security
  sq202_yen_girlfriend
  sq205_known
  sq209_part_2_done
  sq209_part_2_started
  sq301_ball_started
  sq301_completed
  sq301_failed
  sq302_completed
  sq302_philippa_in_megascope
  sq302_sorceress_got_crystal
  sq302_start
  sq303_renovation_completed
  sq312_fact_started
  sq315_fdb_passiflora_meeting
  sq315_fdb_quest_complete
  sq315_fdb_roche_in_passiflora
  sq315_fdb_roche_left
  standalone_ep1
  standalone_ep2
  talar_dd_start
  th1007_fdb_gate_opened
  th1007_fdb_throne_room
  th1007_fdb_wraiths_spawn
  th1009_fdb_varin_cave
  traveling_merchant_01_crow_perch
  traveling_merchant_01_gustfields
  traveling_merchant_01_homestead
  triss_dd_start
  triss_dd_stop
  tut_save_size_fix
  tutorial_system_is_running
  witcher3_game_finished

== quests/character_journal_entries.w2phase:
  anna_was_unfaithful
  carduin_met
  dijkstra_about_his_past
  dijkstra_met
  dlg_baron_wife_met
  import_arjan_dead
  met_donar_hindar
  mq1051_officer_glossary
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_fight_start
  mq3035_fdb_radovid_dead
  mq3035_fdb_roche_talar_dead
  q001_after_yenn_intro
  q001_dream_ciri_intro
  q001_nightmare_ended
  q001_vesemir_char_entry
  q001_vesemir_nightmare_talk
  q002_left_village
  q002_met_emhyr
  q002_met_voorhis
  q002_talked_to_yennefer
  q101_finished
  q101_hen_body_found
  q103_baron_confession
  q103_baron_met
  q103_daughter_visited
  q103_first_replacer_played
  q103_fisherman_about_signs
  q103_geralt_sent_to_guslar
  q103_graden_met
  q103_guslar_divination
  q103_guslar_saved
  q103_nml_part1_ciri
  q103_wife_reported
  q104_avallach_about_witches
  q104_elven_wizard
  q104_eredin_seen
  q104_keira_goes_to_mine
  q104_met_keira
  q105_completed
  q105_evil_heart_met
  q105_evil_spirit_destroyed
  q105_evil_spirit_released
  q105_gran_contacted_witches
  q105_help_spirit
  q105_johnny_met
  q105_johnny_voice_back
  q105_will_help_children
  q106_anabelle_met
  q106_didnt_trust_anabelle
  q106_fled_tower
  q106_graham_kissed
  q106_graham_tells_ab_tower
  q106_graham_to_morowa
  q106_keira_about_tower
  q106_more_info_graham
  q106_morowa_released
  q106_seen_morowa_released
  q107_anna_burnt
  q107_anna_disenchanted
  q107_anna_is_crazy
  q107_anna_is_monster
  q107_baron_hanged
  q107_graden_about_dolls
  q108_guslar_helped_with_father
  q108_guslar_pissed
  q108_seen_guslars_father
  q108_witch_hunter_killed
  q109_confronted_keira
  q109_keira_defeated
  q109_keira_to_km
  q109_keira_to_radovid
  q110_ciri_avallach_on_powers
  q110_completed
  q110_didnt_visit_emhyr
  q110_geralt_accepted_pay
  q110_geralt_refused_pay
  q110_visited_emhyr
  q111_3_witches_intro
  q111_3_witches_killed
  q111_fugas_met_factdb
  q111_godlin_jony_met_alone
  q111_godlin_sarah_n_jony_met
  q111_imlerith_dead
  q201_arnvald_met
  q201_candidates_introduced
  q201_crach_met
  q201_lady_bran_and_yen
  q201_lady_bran_met
  q201_met_svanrige
  q201_mousesack_met
  q201_talked_to_hjort
  q201_talked_to_holger
  q201_talked_to_lugos
  q201_talked_to_udalryk
  q202_8_dlg_start
  q202_bring_hjalmar
  q202_comehome_mate
  q202_eight_about_ship
  q202_folan_lives
  q202_geralt_went_for_giant
  q202_hjalmar_saved
  q202_kill_em_all
  q202_recognized_harald
  q202_vigi_alive
  q203_cataclysm_complete
  q203_cerys_saved
  q203_ciri_companion
  q203_found_becca
  q203_ghost_seen_ciri_out
  q203_him_begone
  q203_him_killed
  q203_udalryk_gouged_eye
  q203_udalryk_met
  q203_yen_mouse_quarrel
  q205_quest_end
  q205_spoke_to_donar
  q206_arnvald_died
  q206_arnvald_exposed
  q206_berserkers_attacked
  q206_cerys_queen
  q206_hjalmar_king
  q208_cerys_won
  q208_hjalmar_won
  q210_can_goto_emhyr
  q210_cerys_hjalmar_dead
  q210_cs_ciri_destroy_lab
  q210_emhyr_done
  q210_gave_lara_necklace
  q210_in_ava_we_trust
  q210_lab_done
  q210_lugos_dead
  q210_skjall_grave_visited
  q210_svanrige_cool_bro
  q210_tell_ava_ab_lab
  q210_tell_ava_ab_lara
  q210_tell_ava_ab_lover
  q210_visit_skjall_grave
  q301_burn_doppler
  q301_dreamer_about_dandelion
  q301_met_kob
  q301_met_looters_triss
  q301_private_talk_warehouse
  q301_triss_ab_corine
  q302_big_four_met
  q302_completed
  q302_dijkstra_about_roche
  q302_fdb_dead_prostitutes_found
  q302_fdb_spoke_with_radowid_chess_club
  q302_fdb_spoke_with_radowid_ship
  q302_fdb_whoreson_spared
  q302_whoreson_dead
  q302_whoreson_talked_about_ciri
  q303_completed
  q303_dandelion_release_info_known
  q303_dijkstras_problem_known
  q303_found_dudus_message
  q303_geralt_killed_menge
  q303_triss_killed_menge
  q303_triss_on_helping_with_menge
  q304_completed
  q304_dandelion_diary_read
  q304_elihal_visited
  q304_luiza_met
  q304_voorhis_met
  q304_zoltan_intro
  q305_blanka_testimony
  q305_completed
  q305_dudu_found
  q305_irinas_request_2
  q305_started
  q308_after_sewers
  q308_asked_cor_about_vg
  q308_asked_vg_about_scar
  q308_coroner_met_1st
  q308_didnt_ask_vg
  q308_im_an_idiot
  q308_nath_guilty
  q308_nath_killed
  q308_nath_not_guilty
  q308_sent_to_dawn_estate
  q308_vampire_psycho_killed
  q308_vg_met_1st_time
  q308_vongratz_accuses
  q309_after_plan_kingfisher
  q309_triss_left
  q309_triss_stayed
  q310_beer
  q310_ciri_faced_lodge
  q310_dijkstra_philippa_talked
  q310_dijkstra_spared
  q310_dijkstras_other_leg
  q310_divination_done
  q310_geralt_helped_ciri_talk
  q310_keira_done
  q310_keira_lambert_love
  q310_killed_sheala
  q310_know_about_philippa
  q310_left_sheala
  q310_lodge_talk_done
  q310_margaritta_rescued
  q310_met_dudu_as_whoreson
  q310_met_living_whoreson
  q310_triss_yennefer_payback
  q310_yen_about_rita
  q311_completed
  q311_started
  q401_charged_phylactery
  q401_gotten_uma
  q401_hunted_forktail_down
  q401_umas_curse_lifted
  q401_vesemir_uma_from_mountains
  q401_vesemir_uma_to_mountains
  q402_about_eredin
  q402_found_ciri
  q402_help
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_told_letho_to_go_elsewhere
  q403_battle_ends
  q403_canaris_intro
  q403_completed
  q403_folan_died
  q403_geralt_saved_lambert
  q403_keira_saved_lambert
  q403_lambert_dead
  q403_teleported_to_km
  q403_vesemir_buried
  q403_vigi_died
  q501_canaris_died
  q501_crach_dies
  q501_eredin_died
  q501_first_aval_talk
  q502_fdb_ciri_entered_tower
  q502_fdb_patrol_1_start
  roche_default_first_time
  sq101_completed
  sq101_no_sex_with_keira
  sq101_sex_with_keira
  sq102_didnt_help_letho
  sq102_helped_letho
  sq102_killed_headhunters
  sq102_let_headhunters_go
  sq102_letho_met
  sq106_finished
  sq202_yen_confession
  sq202_yen_girlfriend
  sq202_yen_just_friends
  sq209_blueboy_lugos_met
  sq209_part_2_done
  sq301_kissed_triss
  sq302_philippa_in_megascope
  sq302_witchhunter_about_philippa
  sq310_quest_done
  sq312_fact_ves_alive
  sq312_fdb_quest_accept
  sq312_ves_died
  sq315_fdb_talar_met
  sq315_plan_revealed
  vimme_vivladi_met
  xxxx

== quests/epilogues/epilogue.w2phase:
  mq3035_free_temeria
  q110_visited_emhyr
  q502_ciri_dead

== quests/epilogues/q503_ciri_dead_new.w2phase:
  q503_bandits_attacked
  q503_bandits_killed
  q503_bandits_peacefull
  q503_berem_before_bandits_ended
  q503_berem_final_battle_talks
  q503_disable_baron_comments
  q503_disable_swamp_encounters
  q503_ended
  q503_solved_bandits_with_werewolf
  q503_started
  q503_took_werewolf_quest
  q503_werewolf_escorted_to_witch
  q503_werewolf_killed
  q503_witch_combat_started

== quests/epilogues/q504_ciri_empress.w2phase:
  ciri_dd_stop
  dandelion_dd_stop
  q309_triss_lover
  q504_approached_bear
  q504_destroyed_przerebel
  q504_find_ciri_was_active
  q504_forktail_blood_discovered
  q504_forktail_tracks_discovered
  q504_horseman_lookat
  q504_nilfgaardians_arrive
  q504_start_music_go_home
  sq202_yen_girlfriend
  triss_dd_stop
  yennefer_dd_stop
  zoltan_dd_stop
  zoltan_eqp_unmount

== quests/epilogues/q505_epilogue3.w2phase:
  mq3035_fdb_radovid_dead
  mq3035_fdb_roche_talar_dead
  mq3035_free_temeria
  q002_witch_dd_start
  q002_witch_dd_stop
  q505_captured_dead3
  q505_captured_free1
  q505_captured_free2
  q505_change_ciri
  q505_clue_cauldron
  q505_clue_cups
  q505_clue_dead_dog
  q505_clue_loot
  q505_heard_help
  q505_herbalist_saved
  q505_nilfgaard_won
  q505_radovid
  q505_redania
  q505_sneezy_trail
  q505_started
  q505_too_far_dwarves
  q505_trigger_music_end
  q505_woman_fence_goes

== quests/epilogues/quest_files/q504_ciri_empress/scenes/q504_01b_talk_friends.w2scene:
  q308_open_spit_door
  q308_priscila_healed

== quests/epilogues/quest_files/q504_ciri_empress/scenes/q504_02bb_meet_horse_owner.w2scene:
  mq3035_completed
  mq3035_roche_dies

== quests/epilogues/quest_files/q504_ciri_empress/scenes/q504_10_cs_ciri_goes_home.w2scene:
  q208_yen_lover
  q309_triss_lover

== quests/epilogues/quest_files/q505_ciri_free/phases/q505_reseting_world_state.w2phase:
  mq3035_fdb_radovid_dead
  mq3035_fdb_roche_talar_dead
  mq3035_free_temeria

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_01_talk_to_emhyr.w2scene:
  q208_yen_lover
  q309_triss_lover

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_01b_ministers_table.w2scene:
  mq3035_free_temeria

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_01f_drilling.w2scene:
  q505_nilfgaard_won

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_02a_herold.w2scene:
  mq3035_fdb_roche_talar_dead

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_02b_women_herold.w2scene:
  q505_dijkstra_won

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_02e_villagers_queue.w2scene:
  q505_dijkstra_won

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_02g2_neighbour_cavalry.w2scene:
  q505_dijkstra_won

== quests/epilogues/quest_files/q505_ciri_free/scenes/q505_03_ciri.w2scene:
  q208_yen_lover
  q309_triss_lover
  q505_zirael_sword

== quests/ff_all_hubs.w2phase:
  ff101_won
  ff102_won
  ff103_won
  ff104_won
  ff201_won
  ff202_won
  ff203_won
  ff204_won
  ff205_known
  ff205_won
  ff301_won
  ff302_won
  ff303_won
  ff304_won
  ff_nml_known
  ff_nvg_known
  ff_skg_known
  q101_tavern_scenes_done

== quests/generic_quests/card_minigame_all_hubs/cg_card_minigame_meta.w2phase:
  cg300_lambert_override_triggered
  cg300_lambert_unlocked
  cg300_talar_omitted
  cg_innkeepers_done
  cg_nml_done
  cg_novigrad_done
  cg_old_friends_done
  cg_skellige_done
  cg_stjepan_discovered
  cg_talar_standalone_done
  gwint_all_cards_collected
  iveonethemaverick
  mq3035_fdb_roche_talar_dead
  q001_talked_about_stjepan
  q102_completed
  q309_saw_olivier_dead
  q401_completed
  q401_lambert_defeated_in_gwint
  q403_completed
  q403_keira_saved_lambert
  q403_lambert_dead
  sq301_completed
  sq301_failed
  sq306_completed
  sq306_defeated_tybalt
  sq315_fdb_quest_complete
  standalone_ep1
  standalone_ep2
  witcher3_game_finished

== quests/generic_quests/no_mans_land/cg100_no_mans_land.w2phase:
  cg100_prodigy_unlocked
  cg_baron_discovered
  cg_nml_done
  q105_will_help_children
  q107_baron_hanged
  q107_complete
  q107_failed
  q402_escort_completed

== quests/generic_quests/no_mans_land/ff101_blacksmith.w2phase:
  ff101_active
  ff101_fdb_active
  ff101_lost
  ff101_won
  ff_nml_known
  q101_tavern_scenes_done

== quests/generic_quests/no_mans_land/ff102_fisherman.w2phase:
  ff102_agreed
  ff102_fdb_active
  ff102_lost
  ff102_won
  ff_nml_known

== quests/generic_quests/no_mans_land/ff103_jonas.w2phase:
  ff103_fdb_active
  ff103_lost
  ff103_won
  ff_nml_known

== quests/generic_quests/no_mans_land/ff104_seargeant.w2phase:
  ff101_won
  ff102_won
  ff103_won
  ff104_fdb_active
  ff104_lost
  ff104_won
  ff204_won
  ff304_won
  ff_fdb_sergeant_for_fistfight
  q103_baron_at_default
  q103_baron_confession
  q103_daughter_found
  q103_get_uma
  q103_start_burning_stables
  q107_sergeant_busy
  q401_sergeant_releases_uma
  q401_started

== quests/generic_quests/no_mans_land/ff_nml.w2phase:
  q102_completed

== quests/generic_quests/no_mans_land/hr101_barons.w2phase:
  hr101_1_item_reward
  hr101_1_won
  hr101_2_item_reward
  hr101_2_won
  hr101_3_item_reward
  hr101_3_won
  hr101_cart_happened
  hr101_known
  hr101_missed checkpoint
  hr101_racer_1
  hr101_racer_2
  hr101_racer_3
  hr101_start
  hr101_victory_count
  hr101_won
  hr101_won_temp
  q102_completed
  q403_council

== quests/generic_quests/no_mans_land/mh101_cockatrice.w2phase:
  actor_mh101_cockatrice_was_killed
  mh101_bomb_target_bomb_hit_type_dancing_star_1
  mh101_bomb_target_bomb_hit_type_dancing_star_2
  mh101_bomb_target_bomb_hit_type_dancing_star_3
  mh101_bomb_target_bomb_hit_type_grapeshot_1
  mh101_bomb_target_bomb_hit_type_grapeshot_2
  mh101_bomb_target_bomb_hit_type_grapeshot_3
  mh101_bomb_target_bomb_hit_type_samum_1
  mh101_bomb_target_bomb_hit_type_samum_2
  mh101_bomb_target_bomb_hit_type_samum_3
  mh101_cocatrice_spawned
  mh101_cockatrice_bomb_hit_type_dancing_star_1
  mh101_cockatrice_bomb_hit_type_dancing_star_2
  mh101_cockatrice_bomb_hit_type_dancing_star_3
  mh101_cockatrice_bomb_hit_type_grapeshot_1
  mh101_cockatrice_bomb_hit_type_grapeshot_2
  mh101_cockatrice_bomb_hit_type_grapeshot_3
  mh101_cockatrice_bomb_hit_type_samum_1
  mh101_cockatrice_bomb_hit_type_samum_2
  mh101_cockatrice_bomb_hit_type_samum_3
  mh101_cockatrice_fly_out
  mh101_cockatrice_found
  mh101_cockatrice_lured_out
  mh101_completed
  mh101_initial_talk
  mh101_investigation_done
  mh101_job_taken
  mh101_skip_witness
  mh101_witnesses_done
  mh_101_4
  mh_101_5
  mh_101_total
  q101_baron_men_attacked
  q102_completed

== quests/generic_quests/no_mans_land/mh102_arachas.w2phase:
  actor_mh102_arachas_was_killed
  actor_mh102_young_arachas_was_killed
  mh102_arachas_egg_01_destroyed
  mh102_arachas_egg_02_destroyed
  mh102_arachas_egg_03_destroyed
  mh102_arachas_egg_04_destroyed
  mh102_arachas_egg_05_destroyed
  mh102_arachas_egg_06_destroyed
  mh102_arachas_egg_07_destroyed
  mh102_arachas_egg_08_destroyed
  mh102_arachas_egg_09_destroyed
  mh102_arachas_egg_10_destroyed
  mh102_arachas_egg_11_destroyed
  mh102_arachas_egg_12_destroyed
  mh102_arachas_eggs_destroyed
  mh102_arachas_found
  mh102_arachas_weapon_hit_by_PLAYER
  mh102_bodies_ladder_found
  mh102_bridge_ready
  mh102_completed
  mh102_dive_section_ended
  mh102_dive_section_entered
  mh102_egg_objective
  mh102_feeding_den_area_done
  mh102_goo_found
  mh102_goo_shoe_found
  mh102_investigation_done
  mh102_job_from_injured_man
  mh102_job_taken
  mh102_mappins_blood_area_done
  mh102_mappins_cave_entrance_done
  mh102_witness_already_cleared
  mh102_witness_done
  mh_102_total

== quests/generic_quests/no_mans_land/mh103_nightwraith.w2phase:
  MeditationStarted
  mh103_completed
  mh103_info_from_journal
  mh103_initial_talk
  mh103_investigation_done
  mh103_job_taken
  mh103_journal_found
  mh103_luring_active
  mh103_murder_place_found
  mh103_nightwraith_in_the_fields
  mh103_nightwraith_summoned
  mh103_torn_cloth_found
  mh103_witness_done
  mh_103_total

== quests/generic_quests/no_mans_land/mh104_ekimma.w2phase:
  mh104_completed
  mh104_ekimma_hostile
  mh104_ekimma_house_door_used
  mh104_ghouls_encountered
  mh104_investigation_done
  mh104_job_taken
  mh104_kill_ekimma_on
  mh104_nilfgaardian_body_checked
  mh104_open_trap_door
  mh104_reward_giver_mentioned
  mh104_stegna_done
  mh104_stegna_visited
  mh_104_total

== quests/generic_quests/no_mans_land/mh105_wyvern.w2phase:
  actor_mh105_lesser_wyvern_was_killed
  actor_mh105_royal_wyvern_was_killed
  mh105_cave_found
  mh105_done
  mh105_investigation_done
  mh105_job_from_refugees
  mh105_job_taken
  mh105_nest_01_destroyed
  mh105_nest_02_destroyed
  mh105_nest_03_destroyed
  mh105_nests_destroyed
  mh105_nests_found
  mh105_refugees_met
  mh105_refugees_saved
  mh105_royal_wyvern_summoned
  mh105_wagon_done
  mh105_wyvern_complete
  mh105_wyvern_nest_01_destroyed
  mh105_wyvern_nest_02_destroyed
  mh_105_4
  mh_105_total

== quests/generic_quests/no_mans_land/mh106_gravehag.w2phase:
  actor_mh106_feral_dogs_was_killed
  actor_mh106_ghouls_was_killed
  actor_mh106_gravehag_was_killed
  mh106_angels_seen
  mh106_block_noticeboard
  mh106_cementary_cleared
  mh106_cementary_monsters_killed
  mh106_completed
  mh106_grave_done
  mh106_gravehag_lured
  mh106_initial_talk
  mh106_investigation_done
  mh106_job_taken
  mh106_lair_found
  mh106_skulls_found
  mh106_soup_found

== quests/generic_quests/no_mans_land/mh107_fiend.w2phase:
  actor_mh107_czart_was_killed
  mh107_block_lure_oneliner
  mh107_cave_done
  mh107_combat_intro
  mh107_completed
  mh107_czart_lure_potion_used
  mh107_czart_lure_recipe_found
  mh107_forest_done
  mh107_investigation_done
  mh107_job_taken
  mh107_luring_done
  mh107_spot_01_done
  mh107_spot_02_done
  mh107_spot_03_done
  mh107_spot_04_done
  mh_107_1
  mh_107_2
  mh_107_3
  mh_107_4
  mh_107_5

== quests/generic_quests/no_mans_land/mh108_fogling.w2phase:
  actor_mh108_ancient_fogling_was_killed
  actor_mh108_lesser_fogling_was_killed
  mh108_7_days_passed
  mh108_ancient_fogling_spawned
  mh108_cave_entered
  mh108_done
  mh108_entrance_01_found
  mh108_entrance_02_found
  mh108_entrance_03_found
  mh108_hut_done
  mh108_illusion_discovered
  mh108_illusion_discovered_entrance_01
  mh108_illusion_discovered_entrance_02
  mh108_illusion_discovered_entrance_03
  mh108_investigation_done
  mh108_job_taken
  mh108_murder_scene_done
  mh108_track_illusion_dispeled
  mh108_tracks_shown
  mh108_wall_despawn
  mh108_will_be_back
  mh_108_2
  mh_108_4
  mh_108_total
  q104_completed
  q503_ended
  q503_started

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_01_card_prodigy.w2scene:
  cg100_01_already_talked

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_02_baron.w2scene:
  cg100_02_already_talked

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_03_hermit_seer.w2scene:
  cg100_03_already_talked

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_04_crossroads_innkeeper.w2scene:
  cg100_04_already_talked

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_05_boat_builder.w2scene:
  cg100_05_talked_to

== quests/generic_quests/no_mans_land/quest_files/cg100_no_mans_land/scenes/cg100_06_talar.w2scene:
  cg100_06_already_talked

== quests/generic_quests/no_mans_land/quest_files/ff101_blacksmith/scenes/ff101_02_bookie_talk.w2scene:
  ff101_nonmet

== quests/generic_quests/no_mans_land/quest_files/ff101_blacksmith/scenes/ff101_03_aftermath.w2scene:
  ff102_won
  ff103_won

== quests/generic_quests/no_mans_land/quest_files/ff102_fisherman/scenes/ff102_02_bookie_talk.w2scene:
  ff102_fake_default_met
  ff102_fight_again
  ff102_lost

== quests/generic_quests/no_mans_land/quest_files/ff102_fisherman/scenes/ff102_04_aftermath.w2scene:
  ff101_won
  ff103_won

== quests/generic_quests/no_mans_land/quest_files/ff103_jonas/scenes/ff103_02_bookie_talk.w2scene:
  ff103_fight

== quests/generic_quests/no_mans_land/quest_files/ff103_jonas/scenes/ff103_aftermath.w2scene:
  ff101_won
  ff102_won

== quests/generic_quests/no_mans_land/quest_files/ff104_seargeant/scenes/ff104_02_talk.w2scene:
  ff204_won
  ff304_won
  q107_baron_hanged_himself
  q107_complete

== quests/generic_quests/no_mans_land/quest_files/ff104_seargeant/scenes/ff104_03_aftermath.w2scene:
  ff204_won
  ff304_won

== quests/generic_quests/no_mans_land/quest_files/hr101_barons/scenes/hr101_01_beginning.w2scene:
  hr101_master_met

== quests/generic_quests/no_mans_land/quest_files/hr101_barons/scenes/hr101_05_start_race.w2scene:
  hr101_1_won
  hr101_2_won
  hr101_3_won
  hr101_race_explained

== quests/generic_quests/no_mans_land/quest_files/hr101_barons/scenes/hr101_06_end_race.w2scene:
  hr101_missed checkpoint
  hr101_won

== quests/generic_quests/no_mans_land/quest_files/mh101_cockatrice/phases/mh101_witness_control.w2phase:
  mh101_witnesses_done

== quests/generic_quests/no_mans_land/quest_files/mh101_cockatrice/scenes/mh101_reward_giver.w2scene:
  mh101_contract_offered
  mh101_normal_path

== quests/generic_quests/no_mans_land/quest_files/mh101_cockatrice/scenes/mh101_witness.w2scene:
  mh101_szymko_met

== quests/generic_quests/no_mans_land/quest_files/mh102_arachas/phases/mh102_mappin_handler.w2phase:
  mh102_cool_mappins_on
  mh102_dive_section_ended
  mh102_dive_section_entered
  mh102_feeding_den_area_done
  mh102_mappins_blood_area_done
  mh102_mappins_cave_entrance_done
  mh102_witness_done

== quests/generic_quests/no_mans_land/quest_files/mh102_arachas/phases/mh102_witness.w2phase:
  mh102_job_from_injured_man
  mh102_witness_done
  mh_102_total

== quests/generic_quests/no_mans_land/quest_files/mh102_arachas/scenes/mh102_clue_oneliners.w2scene:
  mh102_initial_talk

== quests/generic_quests/no_mans_land/quest_files/mh102_arachas/scenes/mh102_injured_man.w2scene:
  mh102_job_taken

== quests/generic_quests/no_mans_land/quest_files/mh102_arachas/scenes/mh102_tavern_man_reward.w2scene:
  mh102_contract_offered
  mh102_job_taken
  mh102_offer_declined
  mh102_tavern_man_met

== quests/generic_quests/no_mans_land/quest_files/mh103_nightwraith/scenes/mh103_02_reward_giver.w2scene:
  mh103_02_refused_once
  mh103_initial_talk
  mh103_investigation_done
  mh103_job_taken
  mh103_luring_active

== quests/generic_quests/no_mans_land/quest_files/mh103_nightwraith/scenes/mh103_geralt_oneliners.w2scene:
  mh103_initial_talk

== quests/generic_quests/no_mans_land/quest_files/mh104_ekimma/phases/mh104_achievements.w2phase:
  mh104_achievement_given

== quests/generic_quests/no_mans_land/quest_files/mh104_ekimma/phases/mh104_quest_giver.w2phase:
  mh104_completed
  mh104_ghouls_encountered
  mh104_initial_talk
  mh104_job_taken
  mh104_kill_initial_interaction

== quests/generic_quests/no_mans_land/quest_files/mh104_ekimma/scenes/mh104_01_nilfgaardian.w2scene:
  mh104_initial_talk
  mh104_job_taken
  mh104_refused_at_first
  mh104_stegna_done
  mh104_stegna_visited

== quests/generic_quests/no_mans_land/quest_files/mh104_ekimma/scenes/mh104_02_village.w2scene:
  mh104_initial_talk

== quests/generic_quests/no_mans_land/quest_files/mh104_ekimma/scenes/mh104_04_father.w2scene:
  mh104_reward_giver_mentioned

== quests/generic_quests/no_mans_land/quest_files/mh105_wyvern/scenes/mh105_01_quest_giver.w2scene:
  mh105_quest_giver_met
  mh105_quest_location_left
  mh105_refugees_saved

== quests/generic_quests/no_mans_land/quest_files/mh105_wyvern/scenes/mh105_02_refugees.w2scene:
  mh105_02_what_happened
  mh105_job_taken

== quests/generic_quests/no_mans_land/quest_files/mh105_wyvern/scenes/mh105_03_after_trophy.w2scene:
  mh105_refugees_met

== quests/generic_quests/no_mans_land/quest_files/mh106_gravehag/phases/mh106_reward_giver.w2phase:
  mh106_initial_talk

== quests/generic_quests/no_mans_land/quest_files/mh106_gravehag/scenes/mh106_geralts_oneliners.w2scene:
  mh106_adult_graves_switch

== quests/generic_quests/no_mans_land/quest_files/mh106_gravehag/scenes/mh106_gravedigger.w2scene:
  mh106_initial_talk
  mh106_refused_once

== quests/generic_quests/no_mans_land/quest_files/mh107_fiend/scenes/mh107_geralts_oneliners.w2scene:
  mh107_lure_scen_switch

== quests/generic_quests/no_mans_land/quest_files/mh107_fiend/scenes/mh107_hunter_01.w2scene:
  mh107_refused_once

== quests/generic_quests/no_mans_land/quest_files/mh108_fogling/scenes/mh108_reward.w2scene:
  mh108_7_days_passed
  mh108_did_haggle
  mh108_job_taken
  mh108_refused_once
  mh108_reward_giver_met
  mh108_will_be_back

== quests/generic_quests/novigrad/cg300_novigrad.w2phase:
  cg300_dijskstra_default_exit_failsafe
  cg_novigrad_done
  cg_vimme_vivaldi_discovered
  dijkstra_met
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_roche_talar_dead
  q310_dijkstras_other_leg
  witcher3_game_finished

== quests/generic_quests/novigrad/ff301_georg.w2phase:
  ff301_bribe_accepted
  ff301_fdb_active
  ff301_lost
  ff301_revenge
  ff301_timed
  ff301_won
  ff_nvg_known

== quests/generic_quests/novigrad/ff302_gypsy.w2phase:
  ff302_active
  ff302_fdb_active
  ff302_won
  ff_nvg_known

== quests/generic_quests/novigrad/ff303_guardcaptain.w2phase:
  ff303_active
  ff303_fdb_active
  ff303_fdb_reactions
  ff303_won
  ff_nvg_known

== quests/generic_quests/novigrad/ff304_tailor.w2phase:
  ff104_won
  ff204_won
  ff301_won
  ff302_won
  ff303_won
  ff304_active
  ff304_fdb_active
  ff304_won

== quests/generic_quests/novigrad/mh301_gryphon.w2phase:
  mh301_completed
  mh301_greater_reward
  mh301_gryphon_spotted
  mh301_initial_talk
  mh301_investigation_done
  mh301_job_taken
  mh301_know_about_reward
  mh301_nest_investigated
  mh301_nest_spotted
  mh301_ravine_low_done
  mh301_start_from_nest
  mh301_starting_condition_met
  mh_301_1
  mh_301_2
  mh_301_3
  mh_301_4
  mh_301_5
  mh_301_7
  mh_301_total

== quests/generic_quests/novigrad/mh302_leshy.w2phase:
  mh302_clue_bleed_out_found
  mh302_clue_blood_traces_on
  mh302_clue_dwarf_strangeld_found
  mh302_clue_footprints_on
  mh302_community_on
  mh302_completed
  mh302_hut_done
  mh302_hut_reached
  mh302_initial_talk
  mh302_investigation_done
  mh302_job_taken
  mh302_leshy_summoned
  mh302_totem_destroyed
  mh302_totem_found
  mh302_witnesses_done
  mh_302_1
  mh_302_total

== quests/generic_quests/novigrad/mh303_succubus.w2phase:
  mh303_done
  mh303_job_taken
  mh303_madam_axii
  mh303_maddam_talked_to
  mh303_met_succi
  mh303_perfumes_active
  mh303_succubus_spared

== quests/generic_quests/novigrad/mh304_katakan.w2phase:
  mh304_after_luring
  mh304_clue_body_01_primary
  mh304_clue_body_02_primary
  mh304_done
  mh304_job_taken
  mh304_luring
  mh304_turn_failsafe_on
  mh304_turn_off_market_community
  wait

== quests/generic_quests/novigrad/mh305_doppler.w2phase:
  mh305_clothes_found
  mh305_contract
  mh305_done
  mh305_doppler_handled
  mh305_doppler_kept_alive
  mh305_job_taken
  mh305_merchant_spawned
  mh305_morph_cold_run
  mh305_show_focus_elements

== quests/generic_quests/novigrad/mh306_dao.w2phase:
  actor_mh306_dao_was_killed
  mh306_crystal_destroyed
  mh306_dao_freed
  mh306_done
  mh306_door_switch_used
  mh306_job_taken
  mh306_main_clues_found
  mh306_support_destroyed
  mh306_wall_destroyed

== quests/generic_quests/novigrad/mh307_minion.w2phase:
  mh307_clue_blood
  mh307_clue_hive
  mh307_completed
  mh307_failed
  mh307_job_given
  mh307_job_taken
  mh307_lair_found
  mh307_pawn_checked
  mh307_tried_opening_door

== quests/generic_quests/novigrad/mh308_noonwraith.w2phase:
  MeditationStarted
  mh308_done
  mh308_farmers_house_door_open
  mh308_fields_done
  mh308_fields_started
  mh308_footprints_checked
  mh308_initial_talk
  mh308_investigation_done
  mh308_job_taken
  mh308_noonwraith_spawned
  mh308_tower_done
  mh308_tower_started
  mh_308_5
  mh_308_all_bodies_found
  mh_308_total

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_01_dijkstra.w2scene:
  cg300_01_talked

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_02_zoltan.w2scene:
  cg300_02_already_talked

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_03_stjepan.w2scene:
  cg300_03_already_talked

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_04_olivier.w2scene:
  cg300_04_olivier_talked_to

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_05_lambert.w2scene:
  cg300_05_lambert_talked_to

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_06_vimme_vivaldi.w2scene:
  cg300_06_vimme_vivaldi_talked_to

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_07_scojateal_trader.w2scene:
  cg300_07_scojateal_trader_talked_to

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_08_roche.w2scene:
  cg300_08_roche_talked_to
  cg300_lambert_override_triggered
  roche_dd_stop
  sq315_fdb_quest_complete

== quests/generic_quests/novigrad/quest_files/cg300_novigrad/scenes/cg300_09_serenity.w2scene:
  cg300_09_serenity_talked_to

== quests/generic_quests/novigrad/quest_files/ff301_georg/scenes/ff301_02_introduction.w2scene:
  ff301_bribe_delivered
  ff301_claytop_met

== quests/generic_quests/novigrad/quest_files/ff301_georg/scenes/ff301_04_result.w2scene:
  ff301_won
  ff302_won
  ff303_won

== quests/generic_quests/novigrad/quest_files/ff302_gypsy/scenes/ff302_02_prefight.w2scene:
  ff302_fight_met

== quests/generic_quests/novigrad/quest_files/ff302_gypsy/scenes/ff302_03_result.w2scene:
  ff301_won
  ff303_won

== quests/generic_quests/novigrad/quest_files/ff303_guardcaptain/scenes/ff303_02_introduction.w2scene:
  ff303_fight_met
  q310_completed

== quests/generic_quests/novigrad/quest_files/ff303_guardcaptain/scenes/ff303_03_result.w2scene:
  ff301_won
  ff302_won

== quests/generic_quests/novigrad/quest_files/ff304_tailor/scenes/ff304_02_introduction.w2scene:
  ff104_won
  ff204_won
  ff304_fight_met

== quests/generic_quests/novigrad/quest_files/ff304_tailor/scenes/ff304_03_result.w2scene:
  ff104_won
  ff204_won

== quests/generic_quests/novigrad/quest_files/mh301_gryphon/phases/mh301_reward_giver.w2phase:
  mh301_initial_talk
  mh301_job_taken

== quests/generic_quests/novigrad/quest_files/mh301_gryphon/scenes/mh301_02_merc.w2scene:
  mh301_completed
  mh301_initial_talk
  mh301_job_taken
  mh301_know_about_reward
  mh301_merc_speaker_met
  mh301_will_consider

== quests/generic_quests/novigrad/quest_files/mh301_gryphon/scenes/mh301_geralts_oneliners.w2scene:
  mh301_job_taken
  mh301_oneliners_blood

== quests/generic_quests/novigrad/quest_files/mh302_leshy/phases/mh302_quest_giver.w2phase:
  mh302_initial_talk

== quests/generic_quests/novigrad/quest_files/mh302_leshy/scenes/mh302_01_halfling.w2scene:
  mh302_initial_talk
  mh302_refused_once

== quests/generic_quests/novigrad/quest_files/mh302_leshy/scenes/mh302_02_witness.w2scene:
  mh302_02_witness_met

== quests/generic_quests/novigrad/quest_files/mh302_leshy/scenes/mh302_geralt_oneliners.w2scene:
  mh302_wrong_birds_switch

== quests/generic_quests/novigrad/quest_files/mh303_succubus/scenes/mh303_01_guard.w2scene:
  mh303_met_succi
  mh303_succubus_spared

== quests/generic_quests/novigrad/quest_files/mh303_succubus/scenes/mh303_02_medic.w2scene:
  mh303_02_medic_info_01
  mh303_02_medic_info_02
  mh303_02_medic_info_03

== quests/generic_quests/novigrad/quest_files/mh304_katakan/scenes/mh304_01_quest_giver.w2scene:
  mh304_01_about_victims
  mh304_01_about_witness
  mh304_01_refused_once

== quests/generic_quests/novigrad/quest_files/mh305_doppler/phases/mh305_quest_giver_spawning.w2phase:
  mh305_merchant_spawned

== quests/generic_quests/novigrad/quest_files/mh305_doppler/scenes/mh305_01_merchant.w2scene:
  mh305_01_appearance
  mh305_01_his_loot
  mh305_doppler_handled
  mh305_geralt_considers

== quests/generic_quests/novigrad/quest_files/mh305_doppler/scenes/mh305_04_doppler_final.w2scene:
  q303_completed
  q305_completed

== quests/generic_quests/novigrad/quest_files/mh306_dao/scenes/mh306_01_noble.w2scene:
  mh306_refused_once

== quests/generic_quests/novigrad/quest_files/mh307_minion/scenes/mh307_01_halflings.w2scene:
  mh307_job_taken
  mh307_need_to_go
  mh307_pawn_checked
  mh307_refuse
  mh307_tried_opening_door
  q302_rico_interrogated

== quests/generic_quests/novigrad/quest_files/mh307_minion/scenes/mh307_02_investigation.w2scene:
  mh307_job_given

== quests/generic_quests/novigrad/quest_files/mh308_noonwraith/scenes/mh308_01_farmer.w2scene:
  mh308_01_info_01
  mh308_01_info_02
  mh308_gimme_some_time
  mh308_initial_talk
  mh308_investigation_done

== quests/generic_quests/novigrad/quest_files/mh308_noonwraith/scenes/mh308_oneliners.w2scene:
  mh308_body_01_found
  mh308_body_04_found

== quests/generic_quests/skellige/cg200_skellige.w2phase:
  cg200_gremista_gwint_unlocked
  cg200_sjusta_active
  cg200_sjusta_defeated
  cg_mousesack_discovered
  cg_skellige_done
  dlc2_installed
  q210_lugos_dead
  q502_fdb_patrol_1_start

== quests/generic_quests/skellige/ff201_valgard.w2phase:
  ff201_fdb_active
  ff201_help
  ff201_lost
  ff201_won
  ff_skg_known

== quests/generic_quests/skellige/ff202_einar.w2phase:
  ff202_fdb_active
  ff202_lost
  ff202_won
  ff_skg_known
  q2038_fighting_gundar

== quests/generic_quests/skellige/ff203_grim.w2phase:
  ff203_fdb_active
  ff203_lost
  ff203_won
  ff_skg_known

== quests/generic_quests/skellige/ff204_olaf.w2phase:
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  ff104_won
  ff201_won
  ff202_won
  ff203_won
  ff204_fdb_bear_appears
  ff204_fdb_doors_open
  ff204_won
  ff304_won

== quests/generic_quests/skellige/ff205_troll.w2phase:
  ff205_fdb_hitchcock
  ff205_fdb_naked
  ff205_known
  ff205_met_troll
  ff_troll_beaten
  ff_won
  mq2024_arena_fighters_on
  mq2024_enable_fistfight

== quests/generic_quests/skellige/hr200_skg_horseraces.w2phase:
  hr200_known
  hr200_set
  hr200_started
  hr201_set
  hr201_won
  hr202_set
  hr202_won
  hr203_set
  hr203_won

== quests/generic_quests/skellige/hr201_ferlund.w2phase:
  hr200_started
  hr201_active
  hr201_missed checkpoint
  hr201_reward
  hr201_set
  hr201_start
  hr201_won
  hr201_won_temp

== quests/generic_quests/skellige/hr202_fejrlesdal.w2phase:
  hr200_started
  hr202_active
  hr202_reward
  hr202_set
  hr202_start
  hr202_won
  hr202_won_temp

== quests/generic_quests/skellige/hr203_hindarsfjall.w2phase:
  hr200_started
  hr203_active
  hr203_reward
  hr203_set
  hr203_start
  hr203_won
  hr203_won_temp

== quests/generic_quests/skellige/hr204_championship.w2phase:
  hr204_active
  hr204_completed
  hr204_start
  hr204_won

== quests/generic_quests/skellige/mh202_nekker_alpha.w2phase:
  mh202_ambush_site_done
  mh202_done
  mh202_initial_talk
  mh202_investigation_done
  mh202_job_from_elder
  mh202_job_taken
  mh202_nekker_alpha_spawned
  mh202_nekker_cave_killed
  mh202_quest_active
  mh_202_total

== quests/generic_quests/skellige/mh203_water_hag.w2phase:
  mh203_crabs_hinted
  mh203_done
  mh203_job_given
  mh203_job_taken
  mh203_lair_clue
  mh203_lair_reached_exploring
  mh203_odour_smelled
  mh203_underwater_hinted

== quests/generic_quests/skellige/mh206_fiend.w2phase:
  mh206_arena_done
  mh206_completed
  mh206_fiend_killed
  mh206_fiend_reached
  mh206_initial_talk
  mh206_job_taken
  mh206_lair_found
  mh206_monster_known
  mh206_son_found

== quests/generic_quests/skellige/mh207_wraiths.w2phase:
  actor_mh207_wraiths_was_killed
  mh207_boss_fight_stage_1
  mh207_done
  mh207_fog_removed
  mh207_house_scene
  mh207_initial_talk
  mh207_investigation_done
  mh207_job_taken
  mh207_letter_read
  mh207_lighthouse_lit
  mh207_mikkjal_found
  mh207_quest_kicked_off
  q201_afterparty_finished
  q201_sq209_lugos_invitation
  sq209_inn_empty

== quests/generic_quests/skellige/mh208_forktail.w2phase:
  actor_mh208_sheep_was_killed
  mh208_done
  mh208_forktail_down
  mh208_initial_talk
  mh208_investigation_done
  mh208_job_taken
  mh208_tracks_activated
  mh208_villagers_done
  mh208_witnesses_done

== quests/generic_quests/skellige/mh210_lamia.w2phase:
  actor_mh210_drowner_was_killed
  actor_mh210_lamia_was_killed
  mh210_done
  mh210_initial_talk
  mh210_investigation_done
  mh210_job_taken
  mh210_lamia_found
  mh210_npc_cleanup
  mh210_optional_ending
  mh210_village_done
  mh210_witness_done
  mh_210_total

== quests/generic_quests/skellige/quest_files/cg200_skellige/scenes/cg200_01_crach.w2scene:
  cg200_01_talked

== quests/generic_quests/skellige/quest_files/cg200_skellige/scenes/cg200_02_gremista.w2scene:
  cg200_02_gremista_talked_to
  q210_lugos_dead

== quests/generic_quests/skellige/quest_files/cg200_skellige/scenes/cg200_03_lugos_the_mad.w2scene:
  cg200_03_lugos_the_mad_talked_to

== quests/generic_quests/skellige/quest_files/cg200_skellige/scenes/cg200_05_mousesack.w2scene:
  cg200_05_mousesack_talked_to
  q210_lugos_dead

== quests/generic_quests/skellige/quest_files/cg200_skellige/scenes/cg200_06_sjusta.w2scene:
  cg200_06_sjusta_talked_to

== quests/generic_quests/skellige/quest_files/ff201_valgard/scenes/ff201_02_pretalk.w2scene:
  ff201_fight_met
  ff201_lost
  ff202_won
  ff203_won

== quests/generic_quests/skellige/quest_files/ff201_valgard/scenes/ff201_03_aftermath.w2scene:
  ff202_won
  ff203_won

== quests/generic_quests/skellige/quest_files/ff202_einar/scenes/ff202_02_prefight.w2scene:
  ff201_won
  ff202_nonmet
  ff203_won

== quests/generic_quests/skellige/quest_files/ff202_einar/scenes/ff202_03_aftermath.w2scene:
  ff201_won
  ff203_won

== quests/generic_quests/skellige/quest_files/ff203_grim/scenes/ff203_02_prefight.w2scene:
  ff201_won
  ff202_won
  ff203_fight_met
  q202_folan_lives
  q202_giant_killed
  q203_lets_start_u_met

== quests/generic_quests/skellige/quest_files/ff203_grim/scenes/ff203_03_aftermath.w2scene:
  ff201_won
  ff202_won

== quests/generic_quests/skellige/quest_files/ff204_olaf/scenes/ff204_02_prefight.w2scene:
  ff104_won
  ff304_won

== quests/generic_quests/skellige/quest_files/ff204_olaf/scenes/ff204_06_aftermath.w2scene:
  ff104_won
  ff204_won
  ff304_won

== quests/generic_quests/skellige/quest_files/ff205_troll/scenes/ff205_02_initial_talk.w2scene:
  ff205_fdb_arena_not_open
  ff205_know_the_enemy
  ff205_met_guy
  ff205_met_troll

== quests/generic_quests/skellige/quest_files/hr201_ferlund/scenes/hr200_chief_horsemaster.w2scene:
  hr200_known
  hr200_master_known
  hr200_will_consider

== quests/generic_quests/skellige/quest_files/hr201_ferlund/scenes/hr201_02_racemaster_race_start.w2scene:
  hr201_horsemaster_met

== quests/generic_quests/skellige/quest_files/hr201_ferlund/scenes/hr201_03_solveig.w2scene:
  hr201_won

== quests/generic_quests/skellige/quest_files/hr201_ferlund/scenes/hr201_04_vermund.w2scene:
  hr201_won

== quests/generic_quests/skellige/quest_files/hr201_ferlund/scenes/hr201_05_end.w2scene:
  hr201_won_temp
  hr202_won
  hr203_won

== quests/generic_quests/skellige/quest_files/hr202_fejrlesdal/scenes/hr202_03_hlif.w2scene:
  hr202_won

== quests/generic_quests/skellige/quest_files/hr202_fejrlesdal/scenes/hr202_04_snorri.w2scene:
  hr202_won

== quests/generic_quests/skellige/quest_files/hr202_fejrlesdal/scenes/hr202_05_end.w2scene:
  hr201_won
  hr202_won_temp
  hr203_won

== quests/generic_quests/skellige/quest_files/hr203_hindarsfjall/scenes/hr203_02_racemaster_race_start.w2scene:
  hr203_horsemaster_commented
  hr203_horsemaster_met

== quests/generic_quests/skellige/quest_files/hr203_hindarsfjall/scenes/hr203_05_end.w2scene:
  hr201_won
  hr202_won
  hr203_won_temp

== quests/generic_quests/skellige/quest_files/hr203_hindarsfjall/scenes/hr203_osvald.w2scene:
  hr203_won

== quests/generic_quests/skellige/quest_files/hr204_championship/scenes/hr204_05_end.w2scene:
  hr204_won

== quests/generic_quests/skellige/quest_files/hr204_championship/scenes/hr204_svan.w2scene:
  hr204_won

== quests/generic_quests/skellige/quest_files/mh202_nekker_warrior/phases/mh202_elder.w2phase:
  mh202_initial_talk
  mh202_quest_active

== quests/generic_quests/skellige/quest_files/mh202_nekker_warrior/scenes/mh202_01_elder.w2scene:
  mh202_01_elder_met
  mh202_job_taken
  mh202_refused_once

== quests/generic_quests/skellige/quest_files/mh202_nekker_warrior/scenes/mh202_02_warriors.w2scene:
  mh202_02_information_01
  mh202_02_information_02
  mh202_02_warriors_met

== quests/generic_quests/skellige/quest_files/mh202_nekker_warrior/scenes/mh202_04_geralt_to_himself.w2scene:
  fact_q303_pops_immunity

== quests/generic_quests/skellige/quest_files/mh203_water_hag/scenes/mh203_02_boatbuilder.w2scene:
  mh203_early_exit
  mh203_gimme_time
  mh203_job_taken

== quests/generic_quests/skellige/quest_files/mh203_water_hag/scenes/mh203_04_investigation.w2scene:
  mh203_armor_checked
  mh203_crabs_hint
  mh203_dead_animal_checked
  mh203_dead_man_checked

== quests/generic_quests/skellige/quest_files/mh203_water_hag/scenes/mh203_06_reward.w2scene:
  mh203_job_given
  mh203_job_taken

== quests/generic_quests/skellige/quest_files/mh206_fiend_ruins/scenes/mh206_01_about_missing_son.w2scene:
  mh206_01_return_to_dialog

== quests/generic_quests/skellige/quest_files/mh207_wraith/phases/mh207_expiationer_escort.w2phase:
  mh207_boss_fight_stage_1

== quests/generic_quests/skellige/quest_files/mh207_wraith/phases/mh207_mikkjal_scenes.w2phase:
  mh207_quest_kicked_off

== quests/generic_quests/skellige/quest_files/mh207_wraith/scenes/mh207_01_jorund.w2scene:
  mh207_01_talked_about_job
  mh207_cursed_area_visited
  mh207_job_taken

== quests/generic_quests/skellige/quest_files/mh207_wraith/scenes/mh207_02_lighthouse_keeper.w2scene:
  mh207_02_curse_cause
  mh207_02_wraith
  mh207_initial_talk
  mh207_letter_read
  mh207_lighthouse_keeper_done

== quests/generic_quests/skellige/quest_files/mh207_wraith/scenes/mh207_03_expationer_killed.w2scene:
  mh207_letter_read
  mh207_secret_revealed

== quests/generic_quests/skellige/quest_files/mh207_wraith/scenes/mh207_03b_gmpl_oneliner.w2scene:
  mh207_expelled

== quests/generic_quests/skellige/quest_files/mh207_wraith/scenes/mh207_04_jorund_reward.w2scene:
  mh207_expelled
  mh207_letter_read
  q206_party_started
  q210_on_quest

== quests/generic_quests/skellige/quest_files/mh208_forktail/phases/mq208_reward_giver.w2phase:
  mh208_initial_talk

== quests/generic_quests/skellige/quest_files/mh208_forktail/scenes/mh208_01_geralt_ask_witnesses.w2scene:
  mh208_witness_1
  mh208_witness_2

== quests/generic_quests/skellige/quest_files/mh208_forktail/scenes/mh208_02_reward_giver.w2scene:
  mh208_contract_offered
  mh208_initial_talk
  mh208_investigation_done
  mq208_second_met

== quests/generic_quests/skellige/quest_files/mh210_lamia/phases/mh210_quest_giver.w2phase:
  mh210_initial_talk
  mh210_job_taken

== quests/generic_quests/skellige/quest_files/mh210_lamia/phases/mh210_witness.w2phase:
  mh210_optional_ending_done
  mh210_witness_done

== quests/generic_quests/skellige/quest_files/mh210_lamia/scenes/mh210_02_quest_giver.w2scene:
  mh210_initial_talk
  mh210_kevan_met
  mh210_refused_once
  mh210_sister_story_part_01

== quests/generic_quests/skellige/quest_files/mh210_lamia/scenes/mh210_prefight.w2scene:
  mh210_witness_done

== quests/main_npcs/default_dialogues/avallach_default.w2scene:
  q210_hide_avallach_choices
  q210_on_quest
  q311_avallach_met
  q311_completed
  q311_geels_deal
  q403_completed

== quests/main_npcs/default_dialogues/baron_default.w2scene:
  q103_about_fiend
  q103_bring_them_back
  q103_daughter_found
  q103_daughter_visited
  q103_doll_given_to_tamara
  q103_shes_with_witches
  q103_white_bridge
  q103_wife_reported
  q105_wife_found

== quests/main_npcs/default_dialogues/becca_default.w2scene:
  cerys_queen
  q206_hjalmar_prosecutor
  q208_cerys_won

== quests/main_npcs/default_dialogues/cirilla_default.w2scene:
  q309_triss_lover
  q501_eredin_died
  q601_geralt_has_demon_mark
  sq202_yen_girlfriend

== quests/main_npcs/default_dialogues/crach_default.w2scene:
  help_cerys_with_him
  help_hjalmar_with_giant
  q202_hjalmar_saved
  q203_cerys_saved
  q206_berserkers_attacked
  q206_cerys_queen
  q206_complete
  q206_hjalmar_king
  q208_cerys_won
  q208_hjalmar_won
  q210_bran_negotiations_end
  q210_cerys_hjalmar_dead
  q402_ciri_found

== quests/main_npcs/default_dialogues/dandelion_default.w2scene:
  dandelion_poem
  dandelion_poem_heard
  q304_molly_info

== quests/main_npcs/default_dialogues/hjalmar_default.w2scene:
  q202_finished
  q206_hjalmar_king
  q208_hjalmar_won
  q311_completed

== quests/main_npcs/default_dialogues/mousesack_default.w2scene:
  q205_quest_end
  q206_cerys_queen
  q206_hjalmar_king
  q206_svanrige_king
  q210_bran_negotiations_end

== quests/main_npcs/default_dialogues/triss_default.w2scene:
  q210_quest_start
  q301_talked_about_rose
  q303_completed
  q303_spy_died
  q303_torture_all_the_way
  q303_triss_killed_menge
  q303_triss_tortured_spy
  q303_triss_was_tortured
  q309_triss_lover
  q310_triss_yennefer_payback
  q601_geralt_has_demon_mark
  sq202_yen_girlfriend

== quests/main_npcs/default_dialogues/uma_default.w2scene:
  default_uma_1
  default_uma_2

== quests/main_npcs/default_dialogues/vesemir_default.w2scene:
  q002_left_village
  q401_reached_kaer_morhen
  q403_council

== quests/main_npcs/default_dialogues/voorhis_default.w2scene:
  sq301_met_voorhis_party

== quests/main_npcs/default_dialogues/yennefer_default.w2scene:
  q309_triss_lover
  q310_triss_yennefer_payback
  q601_geralt_has_demon_mark
  sq202_yen_girlfriend
  yen_about_WH

== quests/main_npcs/voicesets/canaris_vset.w2scene:
  q501_canaris_sweared

== quests/main_npcs/voicesets/geralt_vset.w2scene:
  mh_geralt_generic_remarks_switch
  q309_triss_stayed
  q402_ciri_found
  q602_geralt_possessed
  q704_04_battlecry_01
  q704_04_battlecry_unlocked
  sq202_yen_girlfriend

== quests/minor_quests/design_tools/mq_markers_switch.w2phase:
  mq_markers

== quests/minor_quests/kaer_morhen/mq4001_trail.w2phase:
  enc3_ug_endriagas_01_unloaded

== quests/minor_quests/kaer_morhen/mq4002_anomaly.w2phase:
  enc1_bear_09_unloaded
  mg4002_conclude_garden
  mq4002_failed_puzzle
  mq4002_fdb_activate_book
  mq4002_fdb_rock_dispelled
  mq4002_stone_1_aarded
  mq4002_stone_2_aarded
  mq4002_stone_3_aarded

== quests/minor_quests/kaer_morhen/mq4003_lake.w2phase:
  enc3_bear_04_unloaded
  enc3_bear_05_unloaded
  enc3_drowner_02_unloaded
  mq4003_dead_drowner_10_checked
  mq4003_dead_drowner_11_checked
  mq4003_dead_drowner_12_checked
  mq4003_dead_drowner_1_checked
  mq4003_dead_drowner_2_checked
  mq4003_dead_drowner_3_checked
  mq4003_dead_drowner_4_checked
  mq4003_dead_drowner_5_checked
  mq4003_dead_drowner_6_checked
  mq4003_dead_drowner_7_checked
  mq4003_dead_drowner_8_checked
  mq4003_dead_drowner_9_checked
  mq4003_drowner_checked

== quests/minor_quests/kaer_morhen/mq4004_bastion.w2phase:
  enc1_endriaga_01_unloaded
  mq4004_didnt_have_lamp
  mq4004_use_lamp_played
  mq4006_fdb_ghost_scene
  q106_keira_about_tower
  q106_magic_oillamp_used

== quests/minor_quests/kaer_morhen/mq4005_sword.w2phase:
  mq4005_fdb_started
  q403_council

== quests/minor_quests/kaer_morhen/mq4006_armor.w2phase:
  enc1_ug_nekker_01_unloaded
  mq4005_dao_seen
  mq4006_illusion_stove_dispelled
  mq4006_stop_burning

== quests/minor_quests/kaer_morhen/quest_files/mq4001_trail/scenes/mq4001_01_investigating_cave.w2scene:
  mq4001_device_commented
  mq4001_mutagens_commented
  mq4001_table_commented

== quests/minor_quests/kaer_morhen/quest_files/mq4002_anomaly/scenes/mq4002_01_investigating_anomaly.w2scene:
  mq4002_stone_checked

== quests/minor_quests/kaer_morhen/quest_files/mq4003_lake/scenes/mq4003_01_investigating_lake.w2scene:
  mq4003_drowner_checked

== quests/minor_quests/kaer_morhen/quest_files/mq4003_lake/scenes/mq4003_02_lair.w2scene:
  mq4003_drowner_checked

== quests/minor_quests/no_mans_land/mq1001_wolves_and_dogs.w2phase:
  actor_mq1001_bandit_was_killed
  actor_mq1001_stray_dog_was_killed
  actor_mq1001_wolves_was_killed
  mq1001_done

== quests/minor_quests/no_mans_land/mq1002_seller_of_bracelets.w2phase:
  mq1002_artifact_1_already_bought
  mq1002_artifact_2_already_bought
  mq1002_cheese_activated
  mq1002_cheese_deactivated
  mq1002_dispel
  mq1002_igni_power_crystal_01_destroyed
  mq1002_igni_power_crystal_01_igni_hit
  mq1002_igni_power_crystal_02_destroyed
  mq1002_igni_power_crystal_02_igni_hit
  mq1002_lever_used
  mq1002_mansion_teleport_activated
  mq1002_mansion_teleport_used
  mq1002_middle_chamber_entered
  mq1002_quest_started
  mq1002_sword_found
  mq1002_talked_about_aeramas
  mq1002_teleport_found
  mq1002_teleported_outside
  mq1002_teleported_to_vault
  mq1002_unlocked
  q403_battle_ends
  q403_lambert_dead

== quests/minor_quests/no_mans_land/mq1003_trail_of_dead.w2phase:
  mq1003_cart_done
  mq1003_fdb_cart_owner_dead
  sq102_suspend_1003

== quests/minor_quests/no_mans_land/mq1005_battlefield_scavengers.w2phase:
  actor_mq1005_monster_was_killed
  actor_mq1005_scavengers_boss_was_killed
  actor_mq1005_scavengers_was_killed
  actor_mq1005_starting_monsters_was_killed
  disable_gr_poe_04_wild_dog_group2
  mq1005_encounter_disable
  mq1005_quest_completed
  mq1005_quest_giver_died
  mq1005_quest_ignored
  mq1005_quest_refused
  mq1023_fdb_helping

== quests/minor_quests/no_mans_land/mq1006_harassing_the_troll.w2phase:
  mq1006_completed

== quests/minor_quests/no_mans_land/mq1007_drunken_rabble.w2phase:
  q310_ciri_to_sturgeon

== quests/minor_quests/no_mans_land/mq1010_last_rite.w2phase:
  mq1010_grave_01_clue
  mq1010_job_taken
  mq1012_done
  q106_magic_oillamp_used

== quests/minor_quests/no_mans_land/mq1011_caravan_attack.w2phase:
  actor_mq1011_bandit_was_killed
  actor_mq1011_merchant_01_was_killed
  actor_mq1011_merchant_02_was_killed
  actor_mq1011_merchant_03_was_killed
  mq1011_chest_active

== quests/minor_quests/no_mans_land/mq1012_on_good_terms_with_gods.w2phase:
  WTF
  mq1012_chapel_01_community
  mq1012_chapel_01_fixed
  mq1012_chapel_02_community
  mq1012_chapel_02_fixed
  mq1012_chapel_03_fixed
  mq1012_chapel_06_community
  mq1012_chapel_06_fixed
  mq1012_chapels_fixed_total
  mq1012_done

== quests/minor_quests/no_mans_land/mq1013_the_pretender.w2phase:
  mh106_completed
  mq1013_clue_footprint
  mq1013_done
  mq1013_outed
  mq1013_pretender_found

== quests/minor_quests/no_mans_land/mq1014_looters.w2phase:
  actor_mq1014_enc01_looter_was_killed
  mq1014_e01_alerted
  mq1014_e01_second_approach
  mq1014_enc3_dlg_switch
  mq1014_enc_01_done
  mq1014_enc_02_done
  mq1014_enc_03_done
  mq1014_turn_off_failsafe

== quests/minor_quests/no_mans_land/mq1015_lynch.w2phase:
  sq101_looking_for_cart

== quests/minor_quests/no_mans_land/mq1019_a_matter_of_faith.w2phase:
  actor_mq1019_dealer_was_killed
  actor_mq1019_grave_01_monster_was_killed
  actor_mq1019_grave_02_monster_was_killed
  actor_mq1019_grave_03_monster_was_killed
  mq1019_dealer_truth
  mq1019_done
  mq1019_grave_01_done
  mq1019_grave_02_done
  mq1019_grave_03_done
  mq1019_graves_total
  mq1019_job_taken
  mq1019_ready_to_end

== quests/minor_quests/no_mans_land/mq1020_wild_horse.w2phase:
  actor_mq1020_scoiateal_02_was_killed
  actor_mq1020_scoiateal_03_was_killed
  actor_mq1020_scoiateal_speaker_was_killed
  mq1020_blood_stain_off
  mq1020_blood_stain_on
  mq1020_elves_killed
  mq1020_fdb_agreement_reached
  mq1020_fdb_agreement_reached1
  mq1020_fdb_horse_home
  mq1020_fdb_horse_taken

== quests/minor_quests/no_mans_land/mq1022_border_troll.w2phase:
  mq1022_fdb_merchant
  mq1022_fdb_quest_finished
  mq1022_fdb_quest_taken
  mq1022_fdb_troll_killed

== quests/minor_quests/no_mans_land/mq1023_fake_papers.w2phase:
  mq1005_quest_giver_died
  mq1005_quest_refused
  mq1023_fdb_helping
  mq1023_paid

== quests/minor_quests/no_mans_land/mq1026_warm_welcome.w2phase:
  actor_mq1026_e01_patrol_was_killed

== quests/minor_quests/no_mans_land/mq1028_courier.w2phase:
  mq1028_found_bottle
  mq1028_geralt_has_conduct
  mq1028_gerd_met
  mq1028_quest_started
  mq3036_fact_done
  mq3036_started

== quests/minor_quests/no_mans_land/mq1033_face_me_if_you_dare.w2phase:
  actor_mq1033_swordsman_was_killed
  actor_mq1033_thug_1_was_killed
  actor_mq1033_thug_2_was_killed
  q103_birtchling_sequence_on

== quests/minor_quests/no_mans_land/mq1035_karmic_justice.w2phase:
  actor_mq1035_merchant_was_killed
  mq1035_fdb_interacted

== quests/minor_quests/no_mans_land/mq1036_at_the_mercy_of_strangers.w2phase:
  actor_mq1036_drowner_01_was_killed
  actor_mq1036_drowner_02_was_killed
  mq1036_cursing_played

== quests/minor_quests/no_mans_land/mq1037_deadly_crossing.w2phase:
  mq1037_bandit_scene_failsafe
  mq1037_lower_bridge

== quests/minor_quests/no_mans_land/mq1038_mens_best_friend.w2phase:
  mq1038_cleared
  mq1038_clue_dead_dog

== quests/minor_quests/no_mans_land/mq1039_uninvited_guest.w2phase:
  mq1039_bodies_found
  mq1039_community_on
  mq1039_done
  mq1039_quest_failed
  mq1039_scene_open_barn

== quests/minor_quests/no_mans_land/mq1041_strangers_in_the_night.w2phase:
  actor_mq1041_redanian_was_killed
  actor_mq1041_soldier_was_killed
  mq1041_geralt_helps_soldier
  sq313_fdb_plan_given

== quests/minor_quests/no_mans_land/mq1043_highway_mens_cache.w2phase:
  mq1043_completed

== quests/minor_quests/no_mans_land/mq1045_damsel_in_distress.w2phase:
  lw_sb18_completed
  lw_sb3_completed
  mq1045_enc_02_footprints

== quests/minor_quests/no_mans_land/mq1046_burn_down_the_house.w2phase:
  mq1046_barrel_destroyed
  mq1046_fdb_completed
  mq1046_fdb_quest_started

== quests/minor_quests/no_mans_land/mq1050_written_in_the_stars.w2phase:
  mq1050_done
  mq1050_notice
  mq1050_started

== quests/minor_quests/no_mans_land/mq1051_monster_hunt_nilfgaaard1.w2phase:
  mq1051_fdb_find_wyvern
  mq1051_fdb_found_scout_camp
  mq1051_fdb_got_clue
  mq1051_fdb_talked_to_QM
  mq1051_found_musk
  mq1051_found_poison
  mq1051_job_taken
  mq1051_redanian_prisoners
  mq1051_saw_ghouls
  mq1051_started_investigation
  mq1051_took_notice

== quests/minor_quests/no_mans_land/mq1057_fugas.w2phase:
  actor_mq1057_fugas_was_killed
  mq1057_convinced
  mq1057_didnt_meddle
  mq1057_done
  mq1057_fugas_massacre
  mq1057_fugas_met
  mq1057_fugas_met_talk_via_altar
  mq1057_quest_path_selected
  mq1057_quest_taken
  q104_completed

== quests/minor_quests/no_mans_land/quest_files/mq1006_harassing_the_troll/scenes/mq1006_borys_final.w2scene:
  import_arjan_dead
  import_council_exists
  import_geralt_rescued_triss
  import_henselt_alive
  import_iorweth_path
  import_letho_alive
  import_radowid_has_anais
  import_saskia_alive
  import_sheala_alive

== quests/minor_quests/no_mans_land/quest_files/mq1011_caravan_attack/scenes/mq1011_01_merchant_thanks.w2scene:
  mq1011_REMOVED

== quests/minor_quests/no_mans_land/quest_files/mq1011_caravan_attack/scenes_pickups/mq1011_02_second_meeting.w2scene:
  mq1011_02_met_again

== quests/minor_quests/no_mans_land/quest_files/mq1012_on_good_terms_with_gods/phases/mq1012_chapel_repair.w2phase:
  WTF
  mq1012_chapel_01_fixed
  mq1012_chapel_02_fixed
  mq1012_chapel_06_fixed
  mq1012_chapels_fixed_total
  mq1012_shrine_fixing

== quests/minor_quests/no_mans_land/quest_files/mq1012_on_good_terms_with_gods/scenes/mq1012_geralt_repairs_chapel.w2scene:
  mq1012_repair_chapel_scene_switch

== quests/minor_quests/no_mans_land/quest_files/mq1014_looters/scenes/mq1014_looters_angry.w2scene:
  mq1014_enc3_dlg_switch

== quests/minor_quests/no_mans_land/quest_files/mq1015_lynch/scenes/mq1015_lynch_01_01_ringleader_first.w2scene:
  mq1015_talked_to_ringleader

== quests/minor_quests/no_mans_land/quest_files/mq1016_poultry_abduction/scenes/mq1016_02_old_lady.w2scene:
  mq1016_children_met
  mq1016_job_taken
  mq1016_old_lady_met

== quests/minor_quests/no_mans_land/quest_files/mq1016_poultry_abduction/scenes/mq1016_04_children.w2scene:
  mq1016_clue_mixed_tracks
  mq1016_clue_wolf_tracks
  mq1016_old_lady_met

== quests/minor_quests/no_mans_land/quest_files/mq1019_a_matter_of_faith/scenes/mq1019_priest.w2scene:
  mq1019_dealer_truth
  mq1019_job_taken
  mq1019_ready_to_end

== quests/minor_quests/no_mans_land/quest_files/mq1020_wild_horse/scenes/mq1020_02_about_the_horse.w2scene:
  mq1020_scoiatel_met

== quests/minor_quests/no_mans_land/quest_files/mq1020_wild_horse/scenes/mq1020_03_scoiatel.w2scene:
  mq1020_job_taken
  mq1020_knows_about_wounded

== quests/minor_quests/no_mans_land/quest_files/mq1020_wild_horse/scenes/mq1020_04_returning_horse.w2scene:
  mq1020_fdb_horse_home
  mq1020_no_horse

== quests/minor_quests/no_mans_land/quest_files/mq1022_border_troll/scenes/mq1022_02_troll.w2scene:
  mq1022_troll_backstory
  mq1022_troll_met

== quests/minor_quests/no_mans_land/quest_files/mq1023_fake_papers/scenes/mq1023_02_dealer_talk.w2scene:
  mq1005_quest_completed
  mq1005_quest_giver_died
  mq1005_quest_ignored
  mq1005_quest_refused
  mq1023_about_passage1
  mq1023_axii_used
  mq1023_discount_job
  mq1023_fake_default
  q103_blockades

== quests/minor_quests/no_mans_land/quest_files/mq1028_courier/scenes/mq1028_gerd_1st_time.w2scene:
  mq1028_gerd_met

== quests/minor_quests/no_mans_land/quest_files/mq1028_courier/scenes/mq1028_muggs_dialog_start.w2scene:
  mq1028_confronted
  mq1028_fake_fact
  mq1028_gerd_met
  mq1028_muggs_met
  mq1028_muggs_story
  mq1028_quest_accepted
  mq1028_quest_started

== quests/minor_quests/no_mans_land/quest_files/mq1033_face_me_if_you_dare/scenes/mq1033_swordsman_after_fight_dialogue.w2scene:
  mq1033_after_fight_switch
  mq1033_threat

== quests/minor_quests/no_mans_land/quest_files/mq1033_face_me_if_you_dare/scenes/mq1033_swordsman_intro_oneliner.w2scene:
  mq1033_intro_oneliner_switch

== quests/minor_quests/no_mans_land/quest_files/mq1036_at_the_mercy_of_strangers/scenes/mq1036_dialog_01.w2scene:
  mq1036_refused_once

== quests/minor_quests/no_mans_land/quest_files/mq1039_uninvited_guests/scenes/mq1039_dialog_01.w2scene:
  mq1039_met

== quests/minor_quests/no_mans_land/quest_files/mq1039_uninvited_guests/scenes/mq1039_end.w2scene:
  mq1039_bodies_found

== quests/minor_quests/no_mans_land/quest_files/mq1041_strangers_in_the_night/scenes/mq1041_02_scholar.w2scene:
  import_henselt_alive
  mq1041_02_alko

== quests/minor_quests/no_mans_land/quest_files/mq1041_strangers_in_the_night/scenes/mq1041_04_after_fight.w2scene:
  mq1041_geralt_helps_soldier

== quests/minor_quests/no_mans_land/quest_files/mq1050_written_in_the_stars/scenes/mq1050_scene.w2scene:
  mq1050_met_man
  mq1050_true_vision

== quests/minor_quests/no_mans_land/quest_files/mq1051_monster_hunt_nilfgaard1/phases/mq1051_complete.w2phase:
  mq1051_fact_completed_mh
  mq1051_fdb_complete_quest
  mq1051_fdb_complete_quest_no_gold
  mq1051_fdb_restart_officer_default
  mq1051_job_taken
  mq1051_redanian_prisoners

== quests/minor_quests/no_mans_land/quest_files/mq1051_monster_hunt_nilfgaard1/scenes/mq1051_1_nilfgaard_officer_quest.w2scene:
  mq1051_job_taken
  mq1051_quatermaster_meet

== quests/minor_quests/no_mans_land/quest_files/mq1051_monster_hunt_nilfgaard1/scenes/mq1051_3_bodies.w2scene:
  mq1051_redanian_prisoners

== quests/minor_quests/no_mans_land/quest_files/mq1051_monster_hunt_nilfgaard1/scenes/mq1051_5_complete_quest.w2scene:
  mq1051_job_taken
  mq1051_quatermaster_meet
  mq1051_redanian_prisoners

== quests/minor_quests/no_mans_land/quest_files/mq1051_monster_hunt_nilfgaard1/scenes/mq1051_nilfgaard_officer_default.w2scene:
  mq1051_done_hostile
  mq1051_done_neutral
  mq1051_officer_met

== quests/minor_quests/no_mans_land/quest_files/mq1055_nilfgaard_mom/phases/mq1055_quest_mid.w2phase:
  mq1055_fact_mother_informed

== quests/minor_quests/no_mans_land/quest_files/mq1055_nilfgaard_mom/phases/mq1055_quest_start.w2phase:
  mq1055_fact_mother_informed

== quests/minor_quests/no_mans_land/quest_files/mq1055_nilfgaard_mom/scenes/mq1055_2_nilfgaard_officer.w2scene:
  mq1051_done_neutral
  mq1051_fdb_complete_quest
  mq1055_never_mind

== quests/minor_quests/no_mans_land/quest_files/mq1057_fugas/scenes/mq1057_02_villagers.w2scene:
  actor_mq1057_fugas_was_killed
  mq1057_didnt_meddle
  mq1057_fugas_met
  mq1057_fugas_reasoning
  mq1057_quest_taken
  mq1057_villagers_met

== quests/minor_quests/no_mans_land/quest_files/mq1057_fugas/scenes/mq1057_03_altar.w2scene:
  mq1057_fugas_met

== quests/minor_quests/no_mans_land/quest_files/mq1057_fugas/scenes/mq1057_04_fugas.w2scene:
  mq1057_fugas_met
  mq1057_fugas_met_talk_via_altar
  mq1057_fugas_story
  mq1057_fugas_talked_to_once
  mq1057_quest_taken
  mq1057_villagers_met

== quests/minor_quests/novigrad/mq3001_never_trust_a_child.w2phase:
  mq3001_finished

== quests/minor_quests/novigrad/mq3002_hidden_messages.w2phase:
  mq3002_fdb_completed
  mq3002_first_stash_found

== quests/minor_quests/novigrad/mq3004_money_from_merchant.w2phase:
  mq3004_block_shop
  mq3004_fdb_quest_active
  mq3004_fdb_started_dialog
  mq3004_finished
  mq3004_merchant_saved
  q301_met_kob

== quests/minor_quests/novigrad/mq3005_bad_alley.w2phase:
  actor_mq3005_encounter_bandit_was_killed
  actor_mq3005_noble_was_killed
  mq3005_fdb_dialog_started
  mq3005_fdb_escort
  mq3005_fdb_noble_alive
  mq3005_fdb_player_left
  mq3005_finished

== quests/minor_quests/novigrad/mq3006_magic_stuff_merchants.w2phase:
  mq3006_fdb_delayed_dialogue
  mq3006_fdb_scent_clue_found
  mq3006_hook_triggered
  mq3006_second_meeting

== quests/minor_quests/novigrad/mq3007_racists_in_favela.w2phase:
  actor_mq3007_enc_01_racist_01_was_killed
  actor_mq3007_enc_01_racist_02_was_killed
  actor_mq3007_enc_01_racist_03_was_killed
  mq3007_enc_02_dialog_started
  mq3007_enc_02_done
  mq3007_fdb_racists_attacked

== quests/minor_quests/novigrad/mq3008_prostitute_in_distress.w2phase:
  actor_mq3008_enc_01_thugs_was_killed
  mq3008_enc_01_done

== quests/minor_quests/novigrad/mq3009_witch_hunter_raids.w2phase:
  mq3009_attacked
  q301_met_kob
  q309_completed
  q309_failed
  q402_escort_completed

== quests/minor_quests/novigrad/mq3012_jade_statuettes.w2phase:
  mq3012_both_statues
  mq3012_endgame
  mq3012_noble_bought
  mq3012_noble_done
  mq3012_noble_statuette
  mq3012_shut_down
  mq3012_soldier_done
  mq3012_soldier_statuette
  q109_keira_to_km
  q301_met_kob
  q309_completed
  q310_keira_done
  q310_philippa_rescued

== quests/minor_quests/novigrad/mq3016_wandering_bards.w2phase:
  mq3016_drunk_effect
  mq3016_not_so_much
  mq3016_stop_drunk

== quests/minor_quests/novigrad/mq3017_little_red_raiding_hood.w2phase:
  mq3017_facing_bandits
  mq3017_fact_dialogue_started
  mq3017_growl
  mq3017_helped_girl

== quests/minor_quests/novigrad/mq3019_herd_instincts.w2phase:
  actor_mq3019_enc_02_thugs_was_killed
  mh304_after_luring
  mq3019_disable_guard
  mq3019_escort

== quests/minor_quests/novigrad/mq3023_flame_of_hatred.w2phase:
  mq3023_crowd_anger
  mq3023_fdb_ambush
  mq3023_no_weapons

== quests/minor_quests/novigrad/mq3024_you_shall_not_pass.w2phase:
  mq3024_crossing_allowed
  mq3024_fdb_pontar_bridge_opened
  mq3024_novigrad_visited
  mq3024_quest_inside
  mq3024_quest_on
  mq3024_whitebridge_visited
  sq315_fdb_camp_unlocked

== quests/minor_quests/novigrad/mq3026_horse_racing.w2phase:
  mq3026_day_spawned
  mq3026_end_any_race
  mq3026_ended_night_race
  mq3026_give_200
  mq3026_give_500
  mq3026_night_spawned
  mq3026_player_cheated
  mq3026_race_met_sec
  mq3026_race_pause
  mq3026_race_unpause
  mq3026_refused_varese
  mq3026_spectators_enroute_r1
  mq3026_started_any_race
  mq3026_started_night_race
  mq3026_started_race
  mq3026_unlock_race_and_go
  mq3026_won_night_race
  mq3026_won_novi1
  mq3026_won_novi2
  mq3026_won_novi3
  mq3026_won_novi4
  q302_completed
  q308_left_dawn_estate
  q308_sent_to_dawn_estate
  sq301_ball_started
  sq301_race_may_return
  sq303_fdb_horse_race
  sq303_happened

== quests/minor_quests/novigrad/mq3027_my_manifest.w2phase:
  mq3027_my_manifest_known
  q603_mq3027_override

== quests/minor_quests/novigrad/mq3031_aging_romance.w2phase:
  mq2001_active
  mq3031_active
  mq3031_late_ambush
  mq3031_nidas_plan_known
  q201_landed_on_skellige

== quests/minor_quests/novigrad/mq3035_emhyr.w2phase:
  dijkstra_dd_start
  mq3035_fdb_contact_met
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_roche_talar_dead
  q501_naglfar_arrived
  roche_dd_start
  talar_dd_start

== quests/minor_quests/novigrad/mq3036_rosa_romance.w2phase:
  mq3026_inn_guards_despawn
  mq3026_rosa_on_bridge
  mq3036_bridge_done
  mq3036_debug_start
  mq3036_fact_done
  mq3036_found_prints
  mq3036_start
  mq3036_started
  q304_rosa_visited
  q310_started

== quests/minor_quests/novigrad/mq3037_sleeping_vampire.w2phase:
  mq3037_opened_once
  mq3037_sarcofagus_closed
  mq3037_sarcofagus_opened
  mq3037_saw_empty_tomb

== quests/minor_quests/novigrad/mq3038_wheel_of_fortune.w2phase:
  actor_mq3038_nekker_was_killed
  mq3038_cage_found
  mq3038_footprint_found

== quests/minor_quests/novigrad/mq3039_crows.w2phase:
  actor_mq3039_thug_01_was_killed
  actor_mq3039_thug_02_was_killed
  actor_mq3039_thug_03_was_killed

== quests/minor_quests/novigrad/mq3040_price_of_passage.w2phase:
  mh304_luring
  mq3040_dirb

== quests/minor_quests/novigrad/mq3041_showing_presence.w2phase:
  mh303_done
  mq3041_psycho_loop_check_done
  mq3041_quest_done
  mq3041_stage_present
  mq3041_yen_loop_check_done
  q308_left_dawn_estate
  q308_nath_guilty
  q308_nath_not_guilty
  q310_yen_novigrad

== quests/minor_quests/novigrad/quest_files/mq3006_magic_stuff_merchants/scenes/mq3006_00_hook.w2scene:
  mq3006_oneliner_long

== quests/minor_quests/novigrad/quest_files/mq3006_magic_stuff_merchants/scenes/mq3006_01_shady_merchant.w2scene:
  mq3006_merchant_met

== quests/minor_quests/novigrad/quest_files/mq3006_magic_stuff_merchants/scenes/mq3006_02_second_meeting.w2scene:
  mq3006_fdb_delayed_dialogue
  mq3006_fdb_talked_again

== quests/minor_quests/novigrad/quest_files/mq3012_jade_statuettes/scenes/mq3012_04_triss_remove_curse.w2scene:
  mq3012_noble_statuette
  mq3012_soldier_statuette
  mq3012_triss_about_statuettes

== quests/minor_quests/novigrad/quest_files/mq3012_jade_statuettes/scenes/mq3012_05_lifting_curse.w2scene:
  mq3012_both_statues
  mq3012_noble_statuette
  mq3012_soldier_statuette

== quests/minor_quests/novigrad/quest_files/mq3017_little_red_raiding_hood/scenes/mq3017_05_brigand_dialog_1.w2scene:
  mq3017_she_wolf

== quests/minor_quests/novigrad/quest_files/mq3024_you_shall_not_pass/scenes/mq3024_01_blockade_guard.w2scene:
  mq3024_01_talked_to

== quests/minor_quests/novigrad/quest_files/mq3024_you_shall_not_pass/scenes/mq3024_01_blockade_guard_novigrad.w2scene:
  mq3024_talked_to_nvg

== quests/minor_quests/novigrad/quest_files/mq3024_you_shall_not_pass/scenes/mq3024_01_blockade_guard_one_liners.w2scene:
  mq3024_01_switch

== quests/minor_quests/novigrad/quest_files/mq3024_you_shall_not_pass/scenes/mq3024_01_blockade_guard_oxenfurt.w2scene:
  mq3024_talked_to_oxenfurt

== quests/minor_quests/novigrad/quest_files/mq3026_horse_racing/scenes/mq3026_01a_secundant_novigrad_start.w2scene:
  mq3026_player_cheated
  mq3026_race_met_sec
  mq3026_won_novi1
  mq3026_won_novi2
  mq3026_won_novi3

== quests/minor_quests/novigrad/quest_files/mq3026_horse_racing/scenes/mq3026_03_cleaver.w2scene:
  mq3026_player_cheated
  mq3026_varese_bout_race
  mq3026_won_night_race

== quests/minor_quests/novigrad/quest_files/mq3026_horse_racing/scenes/mq3026_04_king_beggar.w2scene:
  mq3026_won_night_race

== quests/minor_quests/novigrad/quest_files/mq3026_horse_racing/scenes/mq3026_ingrid_about_race.w2scene:
  mq3026_started_race

== quests/minor_quests/novigrad/quest_files/mq3031_aging_romance/scenes/mq3031_02_nidas_nvg_talk.w2scene:
  mq3031_nidas_plan_known

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/phases/mq3035_meet&bait.w2phase:
  dijkstra_dd_start
  dijkstra_dd_stop
  mq3035_fdb_contact_met
  mq3035_fdb_open_door
  mq3035_fdb_take_weapons
  radovid_fdb_ship_novigrad
  roche_dd_start
  roche_dd_stop
  roche_eqp_mount
  roche_eqp_unmount
  talar_dd_start
  talar_dd_stop

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/phases/mq3035_novigrad_roche.w2phase:
  mq3035_fdb_fight_start
  mq3035_fdb_kill_squad
  mq3035_fdb_radovid_dead
  mq3035_fdb_radovid_retreat
  mq3035_fdb_roche_dead
  mq3035_fdb_side_path
  mq3035_fdb_talar_path
  mq3035_free_temeria
  mq3035_radovid_dead
  sq309_fdb_restart_roche_default
  sq312_ves_died

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/phases/mq3035_wrap_up.w2phase:
  dijkstra_dd_start
  mq3035_fdb_contact_met
  mq3035_fdb_dijkstra_dead
  mq3035_fdb_roche_talar_dead
  mq3035_free_temeria
  roche_dd_start
  talar_dd_start

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/scenes/mq3035_01_plan_meeting.w2scene:
  sq302_completed
  sq312_ves_died

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/scenes/mq3035_02_radovid_bait.w2scene:
  sq302_completed

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/scenes/mq3035_06_philppa_kills_radovid.w2scene:
  sq312_ves_died

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/scenes/mq3035_07_dijistra_on_stage.w2scene:
  sq312_ves_died

== quests/minor_quests/novigrad/quest_files/mq3035_emhyr/scenes/mq3035_08_wrap_up_scene.w2scene:
  sq312_ves_died

== quests/minor_quests/novigrad/quest_files/mq3037_sleeping_vampire/scenes/mq3037_01a_mysterious_sarc.w2scene:
  mq3037_opened_once
  mq3037_refused
  mq3037_saw_empty_tomb

== quests/minor_quests/novigrad/quest_files/mq3038_wheel_of_fortune/scenes/mq3038_04_final.w2scene:
  mq3038_cage_found
  mq3038_footprint_found

== quests/minor_quests/novigrad/quest_files/mq3040_price_of_passage/scenes/mq3040_01_hook.w2scene:
  mq3040_01_scene_switch

== quests/minor_quests/novigrad/quest_files/mq3040_price_of_passage/scenes/mq3040_02_encounter.w2scene:
  mq3040_dirb

== quests/minor_quests/novigrad/quest_files/mq3041_showing_presence/scenes/mq3041_03_rude_drunk.w2scene:
  q202_hjalmar_saved

== quests/minor_quests/prologue_village/mq0001_missing_brother.w2phase:
  actor_mq0001_ghoul_was_killed
  lw_ghouls_nest01_destroyed
  mq0001_abandoned
  mq0001_accepted
  mq0001_already_found_brother
  mq0001_approached_brother
  mq0001_bastiens_shield_found
  mq0001_been_in_shack
  mq0001_been_in_shack_alt
  mq0001_brother_following
  mq0001_brother_met
  mq0001_checking_corpse
  mq0001_completed
  mq0001_dog_barking
  mq0001_dog_got_scent
  mq0001_dog_runs_off
  mq0001_dog_smelling
  mq0001_dune_approaching_wait_spot
  mq0001_dune_knows_about_brother
  mq0001_dune_talked_to_dog
  mq0001_dune_talks_to_dog
  mq0001_fdb_battlefield_done
  mq0001_fdb_battlefield_started
  mq0001_geralt_strayed
  mq0001_hotfix_check
  mq0001_in_shack_seperate
  mq0001_nilfgaardian_abandoned
  mq0001_talked_to_brother
  q002_prologue_point_of_no_return
  tut_area_mappins_mq0001
  tut_call_horse
  tut_focus_mq0001_dog
  tut_follow_npc_mq0001
  tut_loot_remains
  tut_mq1_approach_field
  tut_return_to_vesemir
  tut_sheathe_silver_sword
  tut_short_todo_switch

== quests/minor_quests/prologue_village/mq0002_missing_goods.w2phase:
  actor_mq0002_insurgent_was_killed
  mq0002_found_arrow
  mq0002_found_corpse
  mq0002_found_suspicious_activity
  mq0002_merchant_ran
  mq0002_merchant_to_guards
  mq0002_reached_camp
  mq0002_ripped_off_merchant
  mq0002_stop_riding

== quests/minor_quests/prologue_village/mq0003_freshwater.w2phase:
  actor_mq0003_noonwraith_was_killed
  mq0003_accepted
  mq0003_accepted_quest
  mq0003_been_at_well
  mq0003_body_removed
  mq0003_bracelet_destroyed
  mq0003_bracelet_placed
  mq0003_cave_tunnel_found
  mq0003_check_the_well
  mq0003_complete
  mq0003_corpse_brought
  mq0003_corpse_ignited
  mq0003_farmers_daughter_dead
  mq0003_fdb_prepare_active
  mq0003_find_evidence
  mq0003_fire_green
  mq0003_found_skeleton
  mq0003_found_tracks_to_well
  mq0003_geralt_read_about_noonwraiths
  mq0003_got_find_bind_objective
  mq0003_gpdlg_already_have_diary
  mq0003_gpdlg_better_look_around
  mq0003_gpdlg_find_binding_object
  mq0003_gpdlg_on_girls_diary
  mq0003_gpdlg_on_wraith
  mq0003_its_a_noonwraith
  mq0003_journal_no_longer_necessary
  mq0003_left_cave
  mq0003_noonwraith_already_there
  mq0003_noonwraith_banished
  mq0003_noonwraith_hostile
  mq0003_noonwraith_summoned
  mq0003_read_diary
  mq0003_saw_noonwraith
  mq0003_seen_corpse_hanging
  mq0003_talked_to_farmer
  mq0003_womans_corpse_found
  q002_left_village
  tut_cat_potion
  tut_enter_meditation

== quests/minor_quests/prologue_village/mq0004_locked_shed.w2phase:
  mq0004_accepted_quest
  mq0004_breakable_door_destroyed
  mq0004_completed
  mq0004_fdb_shack_entered
  mq0004_lady_comments
  mq0004_met_woman
  mq0004_quest_accepted
  mq0004_talking_to_woman

== quests/minor_quests/prologue_village/mq0005_dwarven_blacksmith.w2phase:
  mq0004_player_has_axii_ability
  mq0005_arsonist_gets_up
  mq0005_axiid_arsonist
  mq0005_brought_arsonist
  mq0005_complete
  mq0005_stop_hypnosis
  mq0005_talking_to_dwarfsmith
  mq0005_track_bootprints
  mq0005_track_footprints
  mq0005_waterfront_activity_found
  prologue_smith_as_community
  prologue_smith_met
  q002_left_village
  q002_prologue_point_of_no_return

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/focus_tutorial.w2phase:
  tut_mq0001_focus

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/mq0001_dog_barking.w2phase:
  mq0001_dog_barking

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/mq0001_on_getting_brother.w2phase:
  mq0001_geralt_strayed

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/mq0001_show_layers.w2phase:
  mq0001_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/mq0001_wait_for_layers.w2phase:
  mq0001_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/phases/track_griffin_hunt.w2phase:
  q002_left_village
  q002_nilfgaardian_oficer_met

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/scenes/mq0001_01_talk_brother.w2scene:
  mq0001_brother_met
  mq0001_heard_story
  q001_looking_for_yennefer

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/scenes/mq0001_07_found_brother.w2scene:
  mq0001_brother_following
  mq0001_talked_to_brother

== quests/minor_quests/prologue_village/quest_files/mq0001_missing_brother/scenes/mq0001_09_found_brother_first.w2scene:
  mq0001_brother_met

== quests/minor_quests/prologue_village/quest_files/mq0002_missing_goods/phases/mq0002_show_layers.w2phase:
  mq0002_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0002_missing_goods/phases/mq0002_wait_for_layers.w2phase:
  mq0002_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0002_missing_goods/phases/quest_became_unavailable.w2phase:
  q501_naglfar_arrived

== quests/minor_quests/prologue_village/quest_files/mq0002_missing_goods/scenes/mq0002_02_talk_to_merchant.w2scene:
  mq0002_met_merchant

== quests/minor_quests/prologue_village/quest_files/mq0002_missing_goods/scenes/mq0002_03_return_to_merchant.w2scene:
  mq0002_found_arrow
  mq0002_found_corpse
  mq0002_found_suspicious_activity

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_accepted_quest.w2phase:
  mq0003_accepted_quest

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_geralt_gp_dlg_tickets.w2phase:
  mq0003_gp_dlg_playing

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_its_a_noonwraith.w2phase:
  mq0003_its_a_noonwraith

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_persistent_content.w2phase:
  mq0003_complete
  mq0003_hamlet_inhabited
  mq0003_noonwraith_banished

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_read_about_noonwraiths.w2phase:
  mq0003_geralt_read_about_noonwraiths

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_read_girls_diary.w2phase:
  mq0003_girls_diary

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_read_journal.w2phase:
  mq0003_geralt_read_about_noonwraiths
  mq0003_gpdlg_find_binding_object

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_show_layers.w2phase:
  mq0003_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/phases/mq0003_wait_for_layers.w2phase:
  mq0003_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/scenes/mq0003_01_farmers_story.w2scene:
  mq0003_accepted
  mq0003_ghost_described
  mq0003_noonwraith_banished

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/scenes/mq0003_02_geralt_examines_corpse.w2scene:
  mq0003_geralt_read_about_noonwraiths

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/scenes/mq0003_04_geralt_checks_bracelet.w2scene:
  mq0003_checked_bracelet
  mq0003_found_skeleton
  mq0003_geralt_read_about_noonwraiths

== quests/minor_quests/prologue_village/quest_files/mq0003_freshwater/scenes/mq0003_gp_geralt.w2scene:
  mq0003_got_too_close_to_well
  mq0003_its_a_noonwraith

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/phases/mq0004_persistent.w2phase:
  mq0004_all_clues_found
  mq0004_burnt_papers_found
  mq0004_clues_found
  mq0004_lady_comments
  mq0004_thalers_monocle_found
  q501_naglfar_arrived

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/phases/mq0004_show_layers.w2phase:
  mq0004_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/phases/mq0004_wait_for_layers.w2phase:
  mq0004_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/scenes/mq0004_00_gp_old_woman_on_geralt_in_house.w2scene:
  mq0004_items_found

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/scenes/mq0004_02_geralt_on_pan.w2scene:
  mq0004_accepted_quest

== quests/minor_quests/prologue_village/quest_files/mq0004_locked_shed/scenes/mq0004_03_frying_pan_to_woman.w2scene:
  mq0004_accepted_quest
  mq0004_assassin_corpse_found
  mq0004_burnt_papers_found

== quests/minor_quests/prologue_village/quest_files/mq0005_dwarfsmith/phases/mq0005_hide_layers.w2phase:
  prologue_smith_as_community

== quests/minor_quests/prologue_village/quest_files/mq0005_dwarfsmith/phases/mq0005_show_layers.w2phase:
  mq0005_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0005_dwarfsmith/phases/mq0005_wait_for_layers.w2phase:
  mq0005_layers_loaded

== quests/minor_quests/prologue_village/quest_files/mq0005_dwarfsmith/scenes/mq0005_01_dwarf_met.w2scene:
  mq0005_dwarf_met

== quests/minor_quests/skellige/mq2001_clan_renegades.w2phase:
  actor_mq2001_ard_skellig_camp_1_was_killed
  actor_mq2001_ard_skellig_camp_2_was_killed
  actor_mq2001_ard_skellig_camp_3_was_killed
  mq2001_01_job_taken
  mq2001_02_job_taken
  mq2001_active
  mq2001_fdb_journal_1a_read
  mq2001_fdb_journal_1b_read
  mq2001_fdb_started
  mq2001_kaer_trolde_done
  mq2001_kaer_trolde_part_active
  mq2001_monolith_camp_cleared

== quests/minor_quests/skellige/mq2002_pirate_scavengers.w2phase:
  actor_mq2002_pirates_was_killed
  mq2002_shipwreck_1_cargo_left
  mq2002_sword_found

== quests/minor_quests/skellige/mq2003_skellige_tombs.w2phase:
  mq2003_all_monster_dead

== quests/minor_quests/skellige/mq2006_key_to_the_chest.w2phase:
  mq2006_fdb_chest1_looted
  mq2006_fdb_chest2_looted
  mq2006_fdb_clue1_found
  mq2006_fdb_clue2_found

== quests/minor_quests/skellige/mq2009_water_hag.w2phase:
  actor_mq2009_water_hag_was_killed
  mq2009_fdb_quest_taken

== quests/minor_quests/skellige/mq2010_human_trap.w2phase:
  actor_mq2010_leszy_was_killed
  mq2010_done
  mq2010_leshy_appeared
  mq2010_leshy_killed
  mq2010_progress_level

== quests/minor_quests/skellige/mq2011_liar_and_a_thief.w2phase:
  mq2011_fdb_disable_hook

== quests/minor_quests/skellige/mq2012_bad_place_bad_time.w2phase:
  actor_mq2012_cyclops_was_killed
  kaer_trolde_castle_blacksmith_01_angry
  kaer_trolde_castle_blacksmith_01_off
  kaer_trolde_castle_blacksmith_01_on
  mq2012_fdb_letter_taken
  mq2012_tracks_found

== quests/minor_quests/skellige/mq2013_bounty_hunter.w2phase:
  actor_mq2013_bounty_hunter_was_killed
  actor_mq2013_wanted_brother_was_killed

== quests/minor_quests/skellige/mq2015_unfulfilled_hope.w2phase:
  actor_mq2015_pirates_was_killed
  actor_mq2015_warrior_was_killed
  disable_ard17_poe_sirens_group2
  mq2015_fdb_clues_found
  mq2015_kurisu_met
  mq2015_quest_active
  mq2015_ship_examined
  mq2015_sister_reward_given

== quests/minor_quests/skellige/mq2018_bandits.w2phase:
  mq2018_done

== quests/minor_quests/skellige/mq2019_lamenting_man.w2phase:
  mq2019_done
  mq2019_encounter_invalid

== quests/minor_quests/skellige/mq2020_flesh_for_cash_business.w2phase:
  mq2020_cage_open
  mq2020_done
  mq2020_front_approach_on
  mq2020_guards_front_triggered
  mq2020_guards_talked_to
  mq2020_pirates_aggro
  mq2020_pirates_hostile_path
  mq2020_pirates_peaceful_path
  mq2020_slave_chat_played
  mq2020_slave_master_reached
  mq2020_slaves_safe
  mq2020_turn_pirates_hostile
  sq106_hammond_knows

== quests/minor_quests/skellige/mq2021_sirens_call.w2phase:
  mq2021_fdb_complete

== quests/minor_quests/skellige/mq2022_stupid_side_of_courage.w2phase:
  mq2022_done

== quests/minor_quests/skellige/mq2024_curse_of_the_arena.w2phase:
  PLAYER_weapon_hit_by_mq2024_champion
  ff205_fdb_arena_not_open
  mq2024_after_fight_played
  mq2024_arena_fighters_on
  mq2024_arena_reopened
  mq2024_enable_fistfight
  mq2024_geralt_hit_count
  mq2024_ghost_vanquished
  mq2024_job_done
  mq2024_job_taken

== quests/minor_quests/skellige/mq2030_nithing.w2phase:
  mq2030_active
  mq2030_curse_lifted
  mq2030_curse_reversed
  mq2030_nithing
  mq2030_shop_interrupt
  mq2030_started

== quests/minor_quests/skellige/mq2034_fourth_tide.w2phase:
  mq2024_met_pirates
  mq2034_aft_pirates
  mq2034_away_pilgrim
  mq2034_pilgrim_away
  mq2034_shrine1
  mq2034_shrine2
  mq2034_shrine3
  mq2034_shrine4
  sq106_hammond_slayed

== quests/minor_quests/skellige/mq2037_dishonored.w2phase:
  mq2037_bros_complete
  mq2037_clue_footprints
  mq2037_clue_freya
  mq2037_clue_no_wounds
  mq2037_drakkar_chest_opened
  mq2037_footsteps
  mq2037_girl_complete
  mq2037_girl_found
  mq2037_mappin_off
  mq3027_foot_mappin1
  mq3027_foot_mappin2
  mq3027_foot_mappin3
  mq3027_foot_mappin4
  mq3027_foot_mappin5
  mq3027_foot_mappin6
  mq3027_foot_mappin7
  q106_magic_oillamp_used
  q2038_fighting_gundar

== quests/minor_quests/skellige/mq2038_shieldmaiden.w2phase:
  mq2038_maiden_off_arena
  q2038_fighting_gundar

== quests/minor_quests/skellige/mq2039_vow_of_silence.w2phase:
  mq2039_aft_comment
  mq2039_bees_angry
  mq2039_campfire
  mq2039_cauldrons
  mq2039_declined_offer
  mq2039_first_met
  mq2039_geralt_first
  mq2039_know_beehive
  mq2039_pissed
  mq2039_pissed_for_good
  mq2039_sitting_default
  mq2039_started

== quests/minor_quests/skellige/mq2040_the_trials.w2phase:
  sq210_quest_done

== quests/minor_quests/skellige/mq2041_trial_of_dexterity.w2phase:
  mq2040_fdb_gossip
  mq2041_trail_introduced

== quests/minor_quests/skellige/mq2043_trial_of_conviction.w2phase:
  mq2043_trial_succeeded

== quests/minor_quests/skellige/mq2045_chains.w2phase:
  mq2045_local_def
  mq2045_prisoner_freed
  mq2045_prop_signal
  mq2045_run_girl
  mq2045_seen_funeral
  mq2045_talk_to_sis

== quests/minor_quests/skellige/mq2048_msg_in_a_bottle.w2phase:
  mq2048_1st_coat_seen
  mq2048_2nd_coat_seen
  mq2048_done
  mq2048_finished_ursten
  mq2048_h_killed
  mq2048_local_def
  mq2048_met_hunter
  mq2048_obj_added
  mq2048_obj_added2
  mq2048_runrun_woman
  mq2048_seen_woman
  mq2048_spoke_ab_notes
  mq2048_start_novi

== quests/minor_quests/skellige/mq2049_atheist.w2phase:
  mq2049_books_collected
  mq2049_test_gamedef

== quests/minor_quests/skellige/mq2050_farting_trolls.w2phase:
  actor_mq2050_blogger_trolls_was_killed
  mq2050_fdb_farts_heard

== quests/minor_quests/skellige/mq2051_unfinished_business.w2phase:
  mq2051_done
  mq2051_retrofix_pro_simun
  mq2051_unlocked
  sq209_simuns_name_known

== quests/minor_quests/skellige/quest_files/mq2003_skellige_tombs/scenes/mq2003_women_01_ask_for_help.w2scene:
  mq2003_all_monster_dead
  mq2003_tomb_01_monsters_killed

== quests/minor_quests/skellige/quest_files/mq2013_bounty_hunter/scenes/mq2013_02_bounty_hunter_dialog.w2scene:
  actor_mq2013_wanted_brother_was_killed

== quests/minor_quests/skellige/quest_files/mq2015_unfulfilled_hope/scenes/mq2015_01_warrior_story.w2scene:
  mq2015_brother_met
  mq2015_kurisu_met
  mq2015_sister_name_known

== quests/minor_quests/skellige/quest_files/mq2015_unfulfilled_hope/scenes/mq2015_02_sister_story.w2scene:
  mq2015_brother_met
  mq2015_kurisu_met

== quests/minor_quests/skellige/quest_files/mq2017_for_fame_and_glory/scenes/mq2017_01_intro.w2scene:
  mq2017_01_already_talked_to

== quests/minor_quests/skellige/quest_files/mq2020_flesh_for_cash_business/scenes/mq2020_04_slave_about_hidden_loot.w2scene:
  mq2020_pirates_hostile_path

== quests/minor_quests/skellige/quest_files/mq2022_stupid_side_of_courage/scenes/mq2022_02_about_climbing.w2scene:
  mq2022_asked_what_happened
  mq2022_help
  mq2022_idiots_met
  mq2022_refused_once

== quests/minor_quests/skellige/quest_files/mq2024_curse_of_the_arena/scenes/mq2024_02_villagers.w2scene:
  mq2024_02_facts_known
  mq2024_02_villagers_met
  mq2024_arena_reopened
  mq2024_ghost_vanquished
  mq2024_job_done
  mq2024_job_taken
  mq2024_omitted_once

== quests/minor_quests/skellige/quest_files/mq2024_curse_of_the_arena/scenes/mq2024_04_ghost.w2scene:
  mq2024_ghost_met

== quests/minor_quests/skellige/quest_files/mq2030_nithing/scenes/mq2030_04_erlindr_talk.w2scene:
  mq2030_denied_help
  mq2030_nithing

== quests/minor_quests/skellige/quest_files/mq2034_fourth_tide/scenes/mq2034_01a_see_pirates.w2scene:
  mq2024_met_pirates
  sq106_hammond_slayed

== quests/minor_quests/skellige/quest_files/mq2034_fourth_tide/scenes/mq2034_01b_thanks.w2scene:
  mq2034_aft_pirates

== quests/minor_quests/skellige/quest_files/mq2037_dishonored/scenes/mq2037_01_clue_no_wounds.w2scene:
  mq2037_girl_found

== quests/minor_quests/skellige/quest_files/mq2037_dishonored/scenes/mq2037_01a_clue_freya.w2scene:
  mq2037_girl_found

== quests/minor_quests/skellige/quest_files/mq2037_dishonored/scenes/mq2037_03_talk_to_brother.w2scene:
  mq2037_drakkar_chest_opened

== quests/minor_quests/skellige/quest_files/mq2038_shieldmaiden/scenes/mq2038_02_shieldmaiden.w2scene:
  ff204_won
  mq2020_pirate_king_dead
  mq2038_gundar_beaten
  mq2038_shiledmaiden_met

== quests/minor_quests/skellige/quest_files/mq2038_shieldmaiden/scenes/mq2038_04_meetup.w2scene:
  release_jp

== quests/minor_quests/skellige/quest_files/mq2039_vow_of_silene/scenes/mq2039_01_questgiver.w2scene:
  mq2039_first_met
  mq2039_geralt_first

== quests/minor_quests/skellige/quest_files/mq2039_vow_of_silene/scenes/mq2039_02_silent_druid.w2scene:
  mq2039_mute_druid_met

== quests/minor_quests/skellige/quest_files/mq2041_trial_of_dexterity/scenes/mq2041_03b_trial_master_talk.w2scene:
  mq2040_path_1
  mq2040_path_2
  mq2040_spoke_to_women
  mq2040_trial_started

== quests/minor_quests/skellige/quest_files/mq2045_chains/scenes/mq2045_01_prisoner_interactive.w2scene:
  mq2045_prisoner_1st_met

== quests/minor_quests/skellige/quest_files/mq2045_chains/scenes/mq2045_03_lil_girl_talk.w2scene:
  mq2045_prisoner_freed

== quests/minor_quests/skellige/quest_files/mq2048_msg_in_a_bottle/scenes/mq2048_hunter_at_cave.w2scene:
  mq2048_met_hunter

== quests/minor_quests/skellige/quest_files/mq2048_msg_in_a_bottle/scenes/mq2048_hunter_talk.w2scene:
  mq2048_seen_woman

== quests/minor_quests/skellige/quest_files/mq2048_msg_in_a_bottle/scenes/mq2048_lady.w2scene:
  mq2048_spoke_ab_notes

== quests/minor_quests/skellige/quest_files/mq2049_atheist/scenes/mq2049_01_b_atheist_thx.w2scene:
  mq2049_atheist_firstmet
  mq2049_books_collected

== quests/minor_quests/skellige/quest_files/mq2051_unfinished_business/scenes/mq2051_02_ encounter.w2scene:
  mq2051_block_choice

== quests/part_1/part_1.w2phase:
  mousesack_dd_start
  q103_family_found
  q203_cataclysm_complete
  q302_fdb_chess_club_comm_off

== quests/part_1/part_1_npcs_spawn.w2phase:
  import_council_exists

== quests/part_1/part_1_sidequests.w2phase:
  hands_on_demo
  mq3001_finished
  mq3004_finished
  q001_seen_griffin_first_time
  q002_gave_swallow
  q002_helped_herbalist
  q002_inn_brawl_started
  q002_swallow_swallowed
  q002_talked_to_the_witch
  q002_village_ending_sequence_started
  q002_wounded_woman_left_bed
  q002_wounded_woman_quest_start
  q103_family_found
  q104_completed
  q106_morowa_released
  q201_landed_on_skellige
  q202_bring_hjalmar
  q205_quest_end
  q208_not_attended
  q305_completed
  q310_dijkstra_spared

== quests/part_1/q101_agent.w2phase:
  chapter1_reached_nml
  q002_started_fast_travel_to_nml
  q101_about_hendrik_hut
  q101_agent_body_looked
  q101_askd_kiling
  q101_asked_about_hendrik_hut_fact
  q101_attacked_everyone
  q101_axid_survivor
  q101_bad_combo
  q101_barkeep_dlg_start
  q101_baron_men_attacked
  q101_baron_mens_arrive
  q101_burn_josefx
  q101_candle_examined
  q101_ciri_met_witch
  q101_cryme_a_river
  q101_cs_seen
  q101_finished
  q101_fire_lit
  q101_good_combo
  q101_guards_know_bout_w
  q101_hen_body_found
  q101_innkeeper_default
  q101_killed_3_dogs
  q101_know_about_hendrik_bart
  q101_know_about_hendrik_hut
  q101_ledger_discov
  q101_ledger_looked
  q101_left_backward
  q101_left_frontal
  q101_left_the_tavern
  q101_local_def
  q101_przeciag
  q101_riddle_solved
  q101_rot_left
  q101_rot_right
  q101_spok_ab_hen_w_in
  q101_surviv_journo
  q101_talked_to_thugs
  q101_torch_off_1
  q101_torch_off_2
  q101_torch_off_3
  q101_torch_off_4
  q101_torch_off_5
  q101_trapdoor_used
  q101_u_stink

== quests/part_1/q102_baron.w2phase:
  q102_came_from_well
  q102_completed
  q102_noticed_old_man
  q102_offer_rejected
  q102_open_portcullis
  q102_play_music_baron_chambers
  q102_started
  q102_villagers_terrified
  start_om_q102

== quests/part_1/q103_daughter.w2phase:
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  baron_dd_start
  baron_dd_stop
  baron_eqp_mount
  baron_eqp_unmount
  ciri_first_tut_shown
  ff102_fdb_active
  goat_follow_start
  goat_follow_stop
  guslar_dd_start
  guslar_dd_stop
  margaret_dd_start
  margaret_dd_stop
  q103_activate_give_doll_scene
  q103_activate_wine_trace
  q103_baron_at_default
  q103_baron_carries_botch
  q103_baron_confession
  q103_baron_met
  q103_bell_already_used
  q103_bell_already_used_2
  q103_bell_already_used_3
  q103_bell_already_used_4
  q103_bell_used
  q103_birtchling_sequence_on
  q103_blood_ritual_ends
  q103_botch_tries_to_bite
  q103_brazzier_1_on
  q103_brazzier_1_start
  q103_brazzier_1_stop
  q103_brazzier_2_on
  q103_brazzier_2_start
  q103_brazzier_2_stop
  q103_brazzier_3_on
  q103_brazzier_3_start
  q103_brazzier_3_stop
  q103_brazzier_on
  q103_buried_botch
  q103_candleholder_important
  q103_candlesticks_seen
  q103_change_attitude
  q103_change_guslar_appearance
  q103_confrontation_music
  q103_crying_music
  q103_daughter_found
  q103_daughter_reported
  q103_daughter_visited
  q103_doll
  q103_doll_given
  q103_doll_given_daughter_reported
  q103_enable_ciris_room
  q103_enable_knocking
  q103_fdb_fisherman_released
  q103_fight_botch_main_yard
  q103_fight_botch_spot_1
  q103_fight_botch_spot_2
  q103_first_replacer_played
  q103_fisherman_stolen_from_ff102
  q103_found_eternal_shrine
  q103_geralt_goat_speaking
  q103_geralt_sent_to_guslar
  q103_guslar_after_ritual
  q103_guslar_divination
  q103_guslar_ritual_timelapse
  q103_guslar_saved
  q103_hungry_specters_comment
  q103_killed_botch
  q103_load_grave
  q103_lock_burning_stables
  q103_look_around_remove
  q103_lubberkin_timelapse
  q103_made_oil
  q103_margaret_in_cave
  q103_margaret_not_left_behind
  q103_margaret_to_cave
  q103_margaret_to_village
  q103_move_painting
  q103_nml_part1_ciri
  q103_oil_against_lycanthropes
  q103_oil_against_relics
  q103_open_gate
  q103_open_wardrobe
  q103_peregrination_starts
  q103_poroniec_music
  q103_prophecy_one_done
  q103_prophecy_one_started
  q103_prophecy_two_done
  q103_prophecy_two_started
  q103_refused_guslar
  q103_ritual_ends
  q103_save_brother
  q103_show_chalk_drawing
  q103_stable_door_opened_1
  q103_stable_door_opened_2
  q103_stable_door_opened_3
  q103_stable_door_opened_4
  q103_stable_door_opened_5
  q103_stable_fire_immune
  q103_stablemaster_saved
  q103_start_burning_stables
  q103_start_burning_stables_com_run
  q103_start_oneliners
  q103_start_ritual_effects
  q103_stop_baron_rutine
  q103_stop_burning
  q103_stop_oneliners
  q103_succeed_talk_to_baron
  q103_talked_to_goat
  q103_werewolf_combat
  q103_werewolf_confrontation
  q103_white_bridge
  q103_wife_reported
  q103_wife_room_active
  q103_wine_scent_checked
  q103_wine_scent_focused
  q105_wife_found
  tried_opening_stable
  tut_bestiary_q103
  tut_ciri_introduction

== quests/part_1/q104_mine.w2phase:
  actor_keira_was_knocked_unconscious
  canaris_eqp_mount
  canaris_eqp_unmount
  keira_part1_dd_stop
  q104_avallach_about_witches
  q104_bridge_teleport_used
  q104_closed_rift1
  q104_closed_rift2
  q104_closed_rift3
  q104_dao_awakes
  q104_default_immunity
  q104_destroy_door
  q104_dissable_pathfinding_security
  q104_duplicates_eliminated
  q104_elvish_port_treasure_trap_1
  q104_end_of_blizzard
  q104_eredin_seen
  q104_escaped_duplicates
  q104_golem_bossfight
  q104_help_with_lamp
  q104_keira_boss_talking
  q104_keira_enters_first_teleport
  q104_keira_fight_boss
  q104_keira_follows
  q104_keira_goes_to_mine
  q104_keira_oneliners_start
  q104_keira_oneliners_stop
  q104_keira_restore_light
  q104_keira_teleported_out
  q104_keira_unconscious
  q104_keira_unfollows
  q104_nithral_vset
  q104_office_dispelled
  q104_play_last_hologram
  q104_rat_nest1_destroyed
  q104_rat_nest2_destroyed
  q104_start_blizzard
  q104_stayed_with_keira
  q104_teleport4_pair_used
  q104_teleport4_used
  q104_teleport5_pair_used
  q104_teleport5_used
  q104_teleport_keira
  q104_teleported_after_keira
  q104_to_mine_now
  q104_treasure_trap_2
  q104_treasure_trap_3
  q104_tried_outrun_keira
  q104_turn_off_first_zirael
  q104_turn_off_second_zirael
  q104_turn_off_third_zirael
  q104_wall_appears
  q105_book_active

== quests/part_1/q105_witches.w2phase:
  baron_wife_dd_start
  baron_wife_dd_stop
  ciri_first_tut_shown
  dlg_baron_wife_met
  q105_anna_with_kid
  q105_book_active
  q105_ciri_replacer
  q105_ciri_some_time_after
  q105_ciri_witches
  q105_completed
  q105_contract
  q105_deactivate_soltis_dd
  q105_dspn_villagers_hill
  q105_enable_soltis_default
  q105_evil_heart_met
  q105_evil_spirit_done
  q105_found_kids
  q105_found_witch_totem
  q105_glossary_godlings
  q105_gran_contacted_witches
  q105_hidden_boy1
  q105_hidden_girl1
  q105_hidden_girl2
  q105_hidden_girl3
  q105_johnny_met
  q105_johnny_voice_back
  q105_journal_about_totem
  q105_journal_find_footprints
  q105_journal_follow_footprints
  q105_journal_follow_sweet_path
  q105_journal_totem_success
  q105_kids_gone
  q105_know_about_evil
  q105_know_where_ravens
  q105_playing_hide_seek
  q105_ritual_done
  q105_show_broom
  q105_soltis_problem_solved
  q105_soltis_told_witches
  q105_start_snowing
  q105_talked_to_soltis
  q105_tried_ask_ab_johnny
  q105_wife_found
  q105_will_help_children
  q105_with_johnny
  tut_ciri_introduction

== quests/part_1/q202_giant.w2phase:
  area_skellige
  gi_demo_def
  hjalmar_dd_start
  hjalmar_dd_stop
  hjalmar_waits_at_beach
  is_gi_demo
  local_definition_q202
  q202_8_dlg_start
  q202_about_hjalmar_jonas
  q202_about_hjalmar_navigator
  q202_about_hjalmar_survivor
  q202_ambush_seen
  q202_askd_bout_hjal_666
  q202_blockage_tun_cleared
  q202_bodyfact_1
  q202_bodyfact_2
  q202_bodyfact_3
  q202_bodyfact_4
  q202_bodyfact_5
  q202_bodyfact_6
  q202_bodyfact_7
  q202_bring_hjalmar
  q202_broken_boat_fixed
  q202_broken_investigated
  q202_camp_investigated
  q202_crach_asked_4_help
  q202_ded_nekkers_bam
  q202_dv_urskar_fdb
  q202_eight_reward_give
  q202_enable_default
  q202_finished
  q202_first_met_vigi
  q202_folan_boiled
  q202_folan_default_init
  q202_folan_fc_saves
  q202_folan_is_with_us
  q202_folan_lives
  q202_folan_party
  q202_found_way_around
  q202_geralt_went_for_giant
  q202_go_n_find_hjalmar
  q202_go_to_ard_hugtand_ft
  q202_got_anti_harpy_thing
  q202_hjal_pant_fb_act
  q202_hjalmar_intro_started
  q202_hjalmar_met_w_sirens
  q202_hjalmar_saved
  q202_hjalmar_sirens_dead
  q202_jonas_is_free
  q202_journal_add_about_clues
  q202_kill_em_all
  q202_killed_f_trolls
  q202_know_about_undwik_way
  q202_met_trolls_cave
  q202_octo_jorno_done
  q202_octo_name_unknown
  q202_octo_ship_explored
  q202_odgruzowanie_end
  q202_odgruzowanie_start
  q202_pantry_open_back
  q202_saw_broken_boat
  q202_seen_urskar
  q202_sirens_nest_visited
  q202_slady_folana
  q202_slady_vigiego
  q202_song_agree_hjal
  q202_takld_to_navi
  q202_vigi_alive
  q202_vigi_dead
  q202_vigi_default_init
  q202_vigi_saved
  q202_vigi_step_1_act
  q202_wakeup_item
  q203_cerys_saved
  q210_quest_start

== quests/part_1/q203_him.w2phase:
  becca_dd_start
  becca_dd_stop
  becca_eqp_unmount
  hjort_eqp_unmount
  q203_becca_go_outside
  q203_becca_no_comment_chasm
  q203_becca_no_comment_crib
  q203_becca_no_comment_mirror
  q203_becca_no_comment_oven
  q203_beccafound_journal_added
  q203_bergthora_met
  q203_cerys_called_us
  q203_cerys_first_15_dlg
  q203_cerys_saved
  q203_ciri_body_active
  q203_disable_all_torches
  q203_eiriks_met
  q203_examined_crib
  q203_examined_oven
  q203_finale_with_him
  q203_finish_him
  q203_finishing_him
  q203_found_becca
  q203_found_cerys_footprints
  q203_get_torches_from_hjort
  q203_getting_becca_out
  q203_him_begone
  q203_him_fight_phase
  q203_him_in_basement
  q203_him_killed
  q203_know_where_is_becca
  q203_objective_bergthora
  q203_objective_eirik
  q203_searching_house_w_becca
  q203_show_bugs_ciri
  q203_talked_to_villagers
  q203_talked_to_villagers2
  q203_torch1_burns
  q203_torch2_burns
  q203_torch3_burns
  q203_torch4_burns
  q203_trusted_becca_all
  q203_turnoff_env
  q203_udalryk_gouged_eye
  q203_udalryk_met
  q203_villager2_about_becca
  q203_warrior_unconcious
  q210_on_quest
  udalryk_dd_start
  udalryk_dd_stop
  udalryk_eqp_unmount

== quests/part_1/q205_frozen_coast.w2phase:
  q203_cataclysm_complete
  q204_teleport_to_birch_bay
  q205_quest_started

== quests/part_1/q301_dreamer.w2phase:
  dreamer_disable_voiceset
  menge_eqp_mount
  menge_eqp_unmount
  q105_glossary_godlings
  q301_aft_beggar_interrupt
  q301_after_transfer
  q301_burn_doppler
  q301_change_time_dream
  q301_completed
  q301_crematory_pass_to_kob
  q301_cs_thieves_robbing
  q301_dlg_w_thief1
  q301_dreamer_about_dandelion
  q301_dreamer_got_out
  q301_dreamer_nightmare_dlg
  q301_dspn_market_comm_cutscene
  q301_execution_comm_ended
  q301_execution_community
  q301_first_time_transfer
  q301_followed_thief2_to_crem
  q301_following_thieves
  q301_found_crib
  q301_found_oven
  q301_geralt_dreamer_dlg_active
  q301_give_witcher_weapon_back
  q301_go_back_to_kob
  q301_godling_sara_peacefully
  q301_haunted_house_free
  q301_hide_drawing_oven_dlg
  q301_incense_put
  q301_incense_put01
  q301_incense_put02
  q301_incense_put03
  q301_inside_trap
  q301_know_about_crematory
  q301_leave_weapons
  q301_memory
  q301_memory_all
  q301_met_kob
  q301_met_looters_triss
  q301_mus_rathouse_whunters
  q301_need_burdock
  q301_opened_hidden_sewer
  q301_playing_cs_transfer
  q301_priest_fish_market_dspn
  q301_private_talk_warehouse
  q301_quest_beggars_msquare
  q301_sara_busted
  q301_slam_haunted_door
  q301_something_haunts
  q301_spawn_kob_community
  q301_thief1_saw_us
  q301_thief2_going_trap_part1
  q301_thief2_going_trap_part2
  q301_thief2_going_trap_rest
  q301_thief2_lead_to_trap
  q301_thief2_saw_us
  q301_thief_ap_rob
  q301_thief_lead_to_trap
  q301_thief_to_pray
  q301_trap_thugs_sword
  q301_triss_11e_interaction
  q301_triss_ab_corine
  q301_triss_activates_rats
  q301_triss_geralt_dlg_rats_active
  q301_triss_starts_cast_rats
  q301_triss_takeoff_hood
  q301_triss_wear_hood
  q301_waking_up_dreamer
  triss_dd_start
  triss_dd_stop

== quests/part_1/q302_mafia.w2phase:
  NewGamePlus
  bathhouse_office_door_enabled
  cg300_dijskstra_default_exit_failsafe
  ciri_first_tut_shown
  dandelion_dd_start
  dandelion_dd_stop
  dijkstra_dd_start
  dijkstra_dd_stop
  dudu_dd_start
  dudu_dd_stop
  q302_activate_happen
  q302_alert_whoreson
  q302_bathhouse
  q302_big_four_met
  q302_casino_destroyed
  q302_combat_casino
  q302_combat_ring
  q302_completed
  q302_dijkstra_about_roche
  q302_enter_the_assasins
  q302_estate_opened
  q302_fdb_casino_peacefull
  q302_fdb_chess_club_comm_off
  q302_fdb_dead_prostitutes_found
  q302_fdb_ring_peacefull
  q302_fdb_spoke_with_radowid_chess_club
  q302_find_camp
  q302_found_rico_interrogation
  q302_look_for_key
  q302_open_bathouse_door
  q302_rico_interrogated
  q302_ring_destroyed
  q302_roche_leaving_respawned
  q302_show_radovids_chess
  q302_stop_calling
  q302_to_kill_or_not_to
  q302_used_locker1
  q302_used_locker2
  q302_used_locker3
  q302_used_locker4
  q302_used_locker5
  q302_whoreson
  q302_whoreson_found
  q302_whoreson_house_opened
  q302_whoreson_house_turn_off
  q302_whoreson_talked_about_ciri
  q302_whoreson_window_opened
  q302_ws_beaten
  q303_progress_q302
  roche_dd_start
  roche_dd_stop
  sq308_start
  willey_dd_stop

== quests/part_1/q303_treasure.w2phase:
  bathhouse_inner_doors_enabled
  bathhouse_vault_closed
  bathhouse_vault_open
  bathhouse_vault_skip
  dijkstra_dd_start
  dijkstra_dd_stop
  dijsktra_dd_start
  fact_pops_immunity
  hard_puzzles
  q303_abandoned_dijkstra
  q303_abandoned_shack_door_closed
  q303_abandoned_shack_door_opened
  q303_active
  q303_all_vault_clues_found
  q303_at_witch_hunters
  q303_bards_leave_shrine
  q303_baronx_door_enabled
  q303_bathhouse_open_for_public
  q303_bathhouse_vault_closed
  q303_bible_cache_found
  q303_bodies_found
  q303_bomb_piece_found
  q303_both_thugs_found
  q303_bottle_in_rack_01_position
  q303_bottle_in_rack_02_position
  q303_bottle_in_rack_03_position
  q303_bottle_taken_from_rack
  q303_clues_found
  q303_completed
  q303_cover_blown
  q303_dandelion_release_info_known
  q303_dijkstra_and_men_leave
  q303_dijkstras_noise
  q303_dijkstras_problem_known
  q303_drain_pool_04
  q303_drank_pops_antidote
  q303_dudus_puzzle_solved
  q303_examined_breach_area
  q303_fdb_bottle_placed
  q303_fdb_geralt_comments
  q303_fdb_left_outpost_fix
  q303_fdb_margrave_house_done
  q303_fire_escape_unlocked
  q303_found_dudus_message
  q303_found_dudus_wine_bottle
  q303_found_good_hiding_spot
  q303_geralt_kept_cool
  q303_geralt_left_dijkstra_down_in_vault
  q303_have_pops_antidote_recipe
  q303_margraves_secret_door_opens
  q303_massacre_started
  q303_menge_met
  q303_menges_corpse_appears
  q303_progress_q302
  q303_refused_cooperation
  q303_sewers_additional_clues_found
  q303_should_drink_mixture
  q303_spy_died
  q303_spy_mind_wiped
  q303_triss_about_sq301
  q303_triss_killed_menge
  q303_triss_on_helping_with_menge
  q303_triss_puts_hood_on
  q303_triss_unhooded
  q303_triss_was_tortured
  q303_valuable_found
  q303_valuable_gold_found
  q303_valuable_pearl_found
  q303_valuable_ring_found
  q303_valuable_s_emerald_ring_found
  q303_vault_investigation_complete
  q303_was_at_sewer_exit
  q303_went_into_vault_with_dijkstra
  q303_whole_pipe_found
  q303_witch_hunters_massacred
  triss_dd_start
  triss_dd_stop
  triss_follow_start
  triss_follow_stop

== quests/part_1/q304_dandelion.w2phase:
  elihal_dd_start
  elihal_dd_stop
  import_arjan_dead
  mq3026_rosa_on_bridge
  priscilla_dd_start
  q301_completed
  q304_about_elihal
  q304_about_marabella
  q304_about_molly
  q304_about_rosa
  q304_about_vespula
  q304_completed
  q304_cure_fencers
  q304_dandelion_diary_read
  q304_door
  q304_elihal_visited
  q304_entered_garden
  q304_geralt_lost_sparing
  q304_girls
  q304_hobos_wandered_off
  q304_kids_leave
  q304_killed_thugs
  q304_loundry_no_community
  q304_marabella_visited
  q304_pupil_7_gesture_1
  q304_pupil_7_gesture_2
  q304_rosa_visited
  q304_sneaked_in
  q304_sparing_clothes_off
  q304_sparing_clothes_on
  q304_start_concert
  q304_switch_off_gameplay_block
  q304_tavern_music
  q304_together_to_novigrad
  q304_var_attre_captain_dd_start
  q304_var_attre_captain_dd_stop
  q304_visited_girls
  q304_zoltan_intro
  tried_opening_var_attre_main_door
  voorhis_dd_start
  zoltan_dd_start
  zoltan_dd_stop
  zoltan_eqp_unmount

== quests/part_1/q305_blanka.w2phase:
  area_novigrad
  irina_dd_start
  irina_dd_stop
  play_is_comedy_q305
  priscilla_dd_start
  priscilla_dd_stop
  q302_completed
  q303_completed
  q303_know_treasure
  q304_completed
  q305_ambush_about_to_start
  q305_ambush_start
  q305_asked_dijkstra_for_help
  q305_audience_go_bravo
  q305_audience_go_bravo_loop
  q305_audience_start
  q305_audience_stop
  q305_ciri_into_dudu
  q305_completed
  q305_dijkstra4
  q305_dijkstra6
  q305_dudu_found
  q305_dudu_into_ciri
  q305_fact_irina_actress
  q305_fact_juggler_bonus
  q305_fight_docks
  q305_geralt_correct
  q305_go_down_to_fight
  q305_got_script
  q305_guards_fight_mob
  q305_guards_thugs_hired
  q305_irina_amused
  q305_irina_got_script
  q305_irinas_request_2
  q305_jugglers_met
  q305_jumped_over_fence
  q305_lost_in_docks
  q305_mounted_replacer_horse
  q305_picked_dandelion
  q305_play_over
  q305_play_starts
  q305_player_bought_ticket
  q305_poke_bravo
  q305_refused_to_beat_mob
  q305_silent_the_music
  q305_started
  q305_thugs_beaten
  q305_thugs_gone
  q305_thugs_pissed
  q305_thugs_spawned_docks
  q305_title2
  q305_to_help_puffins
  q305_victim_escape_hit
  q305_write_later
  q309_walking_with_triss
  zoltan_dd_stop

== quests/part_1/q401_konsylium.w2phase:
  PLAYER_dress
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  chapter1_completed
  dont_comment_ptqr
  eskel_dd_start
  eskel_dd_stop
  eskel_dissecting_ekima
  eskel_eqp_unmount
  eskel_follow_start
  eskel_follow_stop
  lambert_dd_start
  lambert_dd_stop
  lambert_eqp_unmount
  npc_exploration_is_broken
  potestaquisitorInUse
  potestaquisitorObjectFound
  q103_get_uma
  q401_amnesia_teleport
  q401_boys_got_drunk
  q401_charged_phylactery
  q401_completed
  q401_connection_established
  q401_connection_stopped
  q401_cooking_enabled
  q401_dimeritium_found
  q401_drunken_factor
  q401_eskel_brings_tools
  q401_eskel_found
  q401_eskel_won_race
  q401_eskels_foot_track_found
  q401_eskels_horse_track_found
  q401_eskels_prep_spot_ found
  q401_eskels_trace_found
  q401_everybody_returned
  q401_fdb_cave_found_eskel
  q401_fdb_drunk_party
  q401_fdb_eskel_goes
  q401_fdb_gate_open
  q401_forktail_blood_found
  q401_forktail_track_found
  q401_geralt_gets_dressed
  q401_geralt_won_race
  q401_gift_from_eskel
  q401_goat_hair_found
  q401_goat_survived
  q401_gotten_uma
  q401_gwint_lambert_bet_money
  q401_had_sex_with_yen
  q401_helped_eskel
  q401_helped_lambert
  q401_helping_eskel_last
  q401_helping_lambert_last
  q401_helping_yen_last
  q401_hunted_forktail_down
  q401_lambert_defeated_in_gwint
  q401_lambert_going_to_lake
  q401_lambert_removes_hat
  q401_lambert_walked_from_table
  q401_lambert_wears_hat
  q401_layers_km_loaded
  q401_layers_nvg_loaded
  q401_megascope_started
  q401_potion_1
  q401_potion_2
  q401_potion_3
  q401_potions_placed
  q401_puke_cleaned
  q401_push_benches_back
  q401_push_benches_in
  q401_reached_kaer_morhen
  q401_remove_weapons
  q401_sergeant_releases_uma
  q401_sex_with_yen_music_state
  q401_show_bottles_everywhere
  q401_sparks_end
  q401_started
  q401_started_race
  q401_uma_pukes
  q401_umas_curse_lifted
  q401_vesemir_cooks
  q401_vesemir_left_with_uma
  q401_vesemir_returns_from_dimeritium
  q401_vesemir_stops_examining_uma
  q401_vesemir_uma_from_mountains
  q401_vesemir_uma_to_mountains
  q401_yennefers_spell_on_uma_stop
  sq202_yen_girlfriend
  uma_dd_stop
  vesemir_dd_start
  yennefer_dd_start
  yennefer_dd_stop

== quests/part_1/quest_files/q101_agent/q101_agent_tavern_scenes.w2phase:
  q101_baron_mens_arrive
  q101_seeen_scenes

== quests/part_1/quest_files/q101_agent/q101_despawn_npcs.w2phase:
  q101_tavern_scenes_done

== quests/part_1/quest_files/q101_agent/scenes/q101_01a_inkeep_int.w2scene:
  q101_met_inkeep

== quests/part_1/quest_files/q101_agent/scenes/q101_02b_barkeep_talk.w2scene:
  q101_aggro_way

== quests/part_1/quest_files/q101_agent/scenes/q101_02c_couple_talk.w2scene:
  q101_couple_inn_met
  q101_finished

== quests/part_1/quest_files/q101_agent/scenes/q101_04b_talk_with_survivor.w2scene:
  q101_asked_about_hendrik_hut_fact
  q101_axid_survivor
  q101_first_telling
  q101_know_about_hendrik_hut
  q101_spoke_with_survivor
  q101_unlock_choice

== quests/part_1/quest_files/q101_agent/scenes/q101_06a_geralt_focus_comments.w2scene:
  q101_riddle_1st_time

== quests/part_1/quest_files/q101_agent/scenes/q101_06b_geralt_sits_with_notes.w2scene:
  q101_baron_note
  q101_ciri_note
  q101_ledger_1st_time
  q101_ledger_c1
  q101_ledger_c2
  q101_ledger_c3
  q101_ledger_c4
  q101_witch_note

== quests/part_1/quest_files/q102_baron/phases/close_portcullis.w2phase:
  chapter1_reached_nml

== quests/part_1/quest_files/q102_baron/phases/q102_chicken_test.w2phase:
  enable_chicken_test
  q102_layers_loaded

== quests/part_1/quest_files/q102_baron/phases/q102_force_walking_management.w2phase:
  q102_geralt_ran_off

== quests/part_1/quest_files/q102_baron/phases/q102_peaceful_check.w2phase:
  q101_baron_men_attacked

== quests/part_1/quest_files/q102_baron/phases/q102_persistent_interactions.w2phase:
  q102_horse_fixed_nml
  q102_horse_fixed_velen
  q102_started

== quests/part_1/quest_files/q102_baron/phases/q102_sergeant_leads.w2phase:
  q102_geralt_ran_off
  sergeant_met

== quests/part_1/quest_files/q102_baron/phases/q102_wait_for_layers.w2phase:
  q102_layers_loaded

== quests/part_1/quest_files/q102_baron/scenes/q102___04_baron_courtyard_meeting.w2scene:
  q101_baron_men_attacked

== quests/part_1/quest_files/q102_baron/scenes/q102___05_baron_in_his_chambers.w2scene:
  q102_heard
  q102_useful

== quests/part_1/quest_files/q102_baron/scenes/q102_p_02_second_gate_guards.w2scene:
  q101_talked_to_thugs
  q101_u_stink

== quests/part_1/quest_files/q102_baron/scenes/q102_p_03_sergeant_escorting_geralt.w2scene:
  q101_baron_men_attacked

== quests/part_1/quest_files/q102_baron/scenes/q102_v_05_old_man_offers_way_in.w2scene:
  q102_offer_rejected
  q102_old_man_met

== quests/part_1/quest_files/q103_daughter/phases/q103_ciris_room.w2phase:
  q103_checked_ciri_clothes
  q103_enable_ciris_room
  q103_margaret_about_toy
  q402_escort_completed

== quests/part_1/quest_files/q103_daughter/phases/q103_race.w2phase:
  baron_dd_start
  baron_dd_stop
  q103_activate_give_doll_scene
  q103_ciri_fireplace_timelapse
  q103_ciri_race_timelapse
  q103_race_started
  q103_white_bridge
  q104_completed
  q104_met_keira
  q105_wife_found

== quests/part_1/quest_files/q103_daughter/phases/q103_stablemaster_saved.w2phase:
  q103_daughter_found
  q103_killed_botch
  q103_stablemaster_saved

== quests/part_1/quest_files/q103_daughter/phases/tamara_in_wilkowyjce.w2phase:
  q103_daughter_visited
  q103_family_found
  q103_graden_met
  q103_white_bridge
  tamara_eqp_mount
  tamara_eqp_unmount

== quests/part_1/quest_files/q103_daughter/scenes/q103_02d_body.w2scene:
  q103_belly
  q103_leg
  q103_thorax

== quests/part_1/quest_files/q103_daughter/scenes/q103_02e_werewolf.w2scene:
  q103_belly
  q103_leg
  q103_made_oil
  q103_thorax

== quests/part_1/quest_files/q103_daughter/scenes/q103_06_baron_about_family.w2scene:
  q101_baron_men_attacked

== quests/part_1/quest_files/q103_daughter/scenes/q103_07d_while_examining_rooms.w2scene:
  q103_broken_candeholder_checked
  q103_candleholder_important

== quests/part_1/quest_files/q103_daughter/scenes/q103_08b_baron_about_wife.w2scene:
  q103_doll
  q103_eveidence_collected
  q103_look_around_remove
  q103_wine_scent_checked

== quests/part_1/quest_files/q103_daughter/scenes/q103_08e_confrontation.w2scene:
  q101_baron_men_attacked
  q103_anty_guslar_man_axiied
  q103_what_do_you_want

== quests/part_1/quest_files/q103_daughter/scenes/q103_08f_gameplay_geralt.w2scene:
  q103_bell_already_used

== quests/part_1/quest_files/q103_daughter/scenes/q103_09_guslar_about_daughter.w2scene:
  q103_baron_boxer
  q103_security
  q103_use_blood

== quests/part_1/quest_files/q103_daughter/scenes/q103_11b_baron_about_botch.w2scene:
  q101_baron_men_attacked
  q103_tell_ready

== quests/part_1/quest_files/q103_daughter/scenes/q103_11k_stablemaster.w2scene:
  q103_responded_to_stablemaster

== quests/part_1/quest_files/q103_daughter/scenes/q103_14a_botch_grows.w2scene:
  q103_fight_botch_main_yard
  q103_fight_botch_spot_1
  q103_fight_botch_spot_2

== quests/part_1/quest_files/q103_daughter/scenes/q103_14b_baron_screams.w2scene:
  q103_botch_tries_to_bite

== quests/part_1/quest_files/q103_daughter/scenes/q103_15b_about_next_move.w2scene:
  q103_fight_botch_main_yard
  q103_fight_botch_spot_1
  q103_fight_botch_spot_2

== quests/part_1/quest_files/q103_daughter/scenes/q103_15i_ritual_end.w2scene:
  q103_third_vision

== quests/part_1/quest_files/q103_daughter/scenes/q103_15l_geralt_examins_dead_horses.w2scene:
  q103_bones
  q103_horse_head
  q103_rib

== quests/part_1/quest_files/q103_daughter/scenes/q103_15n_talk_to_fisherman.w2scene:
  q103_buried_botch
  q103_fisherman_about_signs
  q103_leave_kid_alone
  q103_tell_me_kid
  q103_wheres_anna
  q105_wife_found

== quests/part_1/quest_files/q103_daughter/scenes/q103_19_talk_with_daughter.w2scene:
  q103_candlesticks_seen
  q103_desperate_father
  q103_father
  q103_tamara_about_anna
  q103_tamara_friends
  q103_told_about_mother
  q103_wheres_mother
  q103_whos_graden
  q105_wife_found
  q303_menge_met

== quests/part_1/quest_files/q103_daughter/scenes/q103_20a_sergeant_about_baron.w2scene:
  sergeant_met

== quests/part_1/quest_files/q103_daughter/scenes/q103_20b_baron_in_garden.w2scene:
  q103_buried_botch

== quests/part_1/quest_files/q103_daughter/scenes/q103_27_baron_final_talk.w2scene:
  q101_baron_men_attacked
  q103_blockades
  q205_quest_end
  q305_completed

== quests/part_1/quest_files/q104_mine/phases/q104_keira_introduction.w2phase:
  keira_part1_dd_stop
  q101_ciri_met_witch
  q104_activate_portal_bath
  q104_activate_skull
  q104_completed
  q104_found_cart
  q104_found_pond
  q104_found_stone
  q104_husband_to_witch
  q104_husband_told_about_witch
  q104_keira_goes_to_mine
  q104_keira_intro_test
  q104_looped_chat
  q104_met_keira
  q104_still_follow_gossip
  q104_talked_to_villager
  q104_to_mine_now
  q104_unblock_running
  q104_unblocked_running
  q104_visited_queue

== quests/part_1/quest_files/q104_mine/phases/q104_postmine.w2phase:
  keira_part1_dd_start
  q103_family_found
  q104_brazzier_puzzle_wrong
  q104_completed
  q104_elven_wizard
  q104_exit_dispelled
  q104_fact_hit
  q104_help_with_lamp
  q104_keira_follows
  q104_keira_oneliners_start
  q104_keira_oneliners_stop
  q104_keira_praises
  q104_keira_unfollows
  q104_knows_inscription
  q104_leave_with_keira

== quests/part_1/quest_files/q104_mine/phases/q104_searching_keira.w2phase:
  q101_ciri_met_witch
  q104_failed_to_hear
  q104_failed_to_hear_away
  q104_husband_to_witch
  q104_husband_told_about_witch
  q104_met_keira
  q104_saved_husband
  q104_veteran_seen
  q104_villager_can_go
  q104_visited_queue

== quests/part_1/quest_files/q104_mine/phases/q104_searching_keira_journal.w2phase:
  q104_found_cart
  q104_found_pond
  q104_found_stone
  q104_talked_to_villager

== quests/part_1/quest_files/q104_mine/scenes/q104_00a_gossip.w2scene:
  q104_asked_gossipers_about_witch

== quests/part_1/quest_files/q104_mine/scenes/q104_00b_lumberjack_start.w2scene:
  q104_looped_chat_played

== quests/part_1/quest_files/q104_mine/scenes/q104_00g2_husband_about_witch.w2scene:
  q104_husband_met

== quests/part_1/quest_files/q104_mine/scenes/q104_00g_woman_about_husband.w2scene:
  q104_sweeping_met

== quests/part_1/quest_files/q104_mine/scenes/q104_00h2_talk_to_veteran.w2scene:
  q104_veteran_met

== quests/part_1/quest_files/q104_mine/scenes/q104_01f_first_zirael.w2scene:
  q104_play_last_hologram
  q104_teleported_after_keira

== quests/part_1/quest_files/q104_mine/scenes/q104_04a_second_zirael.w2scene:
  q104_repeating_message_played

== quests/part_1/quest_files/q104_mine/scenes/q104_04a_siren_well.w2scene:
  q104_switch_trap_used

== quests/part_1/quest_files/q104_mine/scenes/q104_06b_fight_the_rift.w2scene:
  q104_blizzard_call_geralt

== quests/part_1/quest_files/q104_mine/scenes/q104_07e2_music_room.w2scene:
  q104_knows_inscription

== quests/part_1/quest_files/q104_mine/scenes/q104_07e_searching_workshop.w2scene:
  q104_about_witches
  q104_help_with_lamp

== quests/part_1/quest_files/q104_mine/scenes/q104_08_to_the_exit.w2scene:
  q104_exit_dispelled

== quests/part_1/quest_files/q105_witches/phases/q105_evil_spirit.w2phase:
  q105_2nd_phase_endriagas
  q105_attacked_spirit
  q105_betray_spirit
  q105_contract
  q105_cover_roots_heart
  q105_disable_exam_corpses
  q105_evil_heart_met
  q105_evil_spirit_destroyed
  q105_evil_spirit_done
  q105_evil_spirit_released
  q105_examined_villager_body
  q105_examined_wolf_victim1
  q105_examined_wolf_victim2
  q105_found_cave_entrance
  q105_found_child_victim
  q105_found_woman_victim
  q105_geralt_comment_active
  q105_heart_beating_clue
  q105_heart_phase_closed
  q105_help_spirit
  q105_journal_find_source
  q105_know_about_evil
  q105_looted_witch_bones
  q105_new_heart_killed
  q105_no_pact_spirit
  q105_open_2nd_entrance
  q105_ritual_done
  q105_save_on_horse
  q105_spawn_heart_endriagas
  q105_spn_counter_endriag
  q105_was_fighting_wolfs
  q105_who_are_you

== quests/part_1/quest_files/q105_witches/phases/q105_horse_path.w2phase:
  q105_evil_spirit_released

== quests/part_1/quest_files/q105_witches/scenes/q105_01a_gp_sweets_on_path.w2scene:
  q105_sweet_path_oneliners_count

== quests/part_1/quest_files/q105_witches/scenes/q105_02_vs_boy1.w2scene:
  q105_playing_hide_seek

== quests/part_1/quest_files/q105_witches/scenes/q105_02_vs_girl1.w2scene:
  q105_playing_hide_seek

== quests/part_1/quest_files/q105_witches/scenes/q105_02_vs_girl2.w2scene:
  q105_playing_hide_seek

== quests/part_1/quest_files/q105_witches/scenes/q105_02_vs_girl3.w2scene:
  q105_playing_hide_seek

== quests/part_1/quest_files/q105_witches/scenes/q105_02d_ask_kids_johnny.w2scene:
  q105_hideseek_next_time

== quests/part_1/quest_files/q105_witches/scenes/q105_09a_burrows_soltis_problem.w2scene:
  q105_evil_spirit_destroyed
  q105_evil_spirit_done
  q105_evil_spirit_released
  q105_talked_to_soltis

== quests/part_1/quest_files/q105_witches/scenes/q105_10c_examine_villager_body.w2scene:
  q105_asked_tree_innocent
  q105_contract
  q105_found_child_victim
  q105_found_woman_victim
  q105_know_about_evil
  q105_know_where_ravens
  q105_open_2nd_entrance
  q105_talk_spirit_about_children
  q105_villager_1
  q105_villager_2
  q105_villager_3
  q105_will_help_children

== quests/part_1/quest_files/q105_witches/scenes/q105_12_perform_ritual.w2scene:
  q105_cover_roots_heart
  q105_found_child_victim
  q105_found_woman_victim

== quests/part_1/quest_files/q105_witches/scenes/q105_13_ritual_done.w2scene:
  q105_will_help_children

== quests/part_1/quest_files/q105_witches/scenes/q105_14_cs105_geralt_meets_witch_sisters.w2scene:
  q103_fisherman_about_signs
  q105_evil_spirit_released
  q105_will_help_children

== quests/part_1/quest_files/q201_pirates/phases/mousesack_lab_guard.w2phase:
  mousesack_lab_guard_off
  mousesack_lab_guard_on

== quests/part_1/quest_files/q201_pirates/phases/q201_afterparty.w2phase:
  becca_dd_start
  crach_dd_start
  donar_dd_start
  holger_dd_start
  lady_bran_dd_start
  lugos_dd_start
  q201_afterparty_finished
  q201_lugos_beaten
  udalryk_dd_start

== quests/part_1/quest_files/q201_pirates/phases/q201_embark.w2phase:
  q201_departure
  q201_find_captain
  q201_no_money
  q201_ship_paid
  q201_wolverstone_met
  q201_wolverstone_ship_checked

== quests/part_1/quest_files/q201_pirates/phases/q201_skellige.w2phase:
  becca_dd_start
  becca_dd_stop
  crach_eqp_unmount
  dont_change_world
  hjort_eqp_unmount
  lady_bran_dd_stop
  mh203_start
  mousesack_lab_guard_off
  mousesack_lab_guard_on
  q201_animals_killed
  q201_arnvald_met
  q201_becca_on_top
  q201_burial_community_walks_off
  q201_burial_started
  q201_burial_totem_switch
  q201_close_kaer_trolde
  q201_community_for_cs
  q201_crach_met
  q201_deactivate_yen_chamber
  q201_feast_community
  q201_fistfight_steingrim
  q201_geralt_on_top
  q201_geralt_won_race
  q201_hallucinations_on
  q201_lady_bran_and_yen
  q201_lady_bran_met
  q201_landed_on_skellige
  q201_lugos_beaten
  q201_mead_placed
  q201_mousesack_lab_window_2_opened
  q201_mousesack_met
  q201_not_drink
  q201_open_gate
  q201_pick_mask
  q201_race_ended
  q201_race_started
  q201_steingrim_killed
  q201_storm_dress_up
  q201_stuffed_bear_examined
  q201_stuffed_wolf_examined
  q201_suit_equipped
  q201_suit_obtained
  q201_swordfight_steingrim
  q201_undress_geralt_sex
  q201_undress_geralt_sex_pants
  q201_walked_away
  q201_was_behind_tapestry
  q202_bring_hjalmar
  udalryk_eqp_unmount
  yen_follow_start
  yen_follow_stop
  yen_move_start
  yen_move_stop
  yennefer_dd_start
  yennefer_dd_stop

== quests/part_1/quest_files/q201_pirates/phases/yen_follower.w2phase:
  yen_follow_start
  yen_follow_stop

== quests/part_1/quest_files/q201_pirates/scenes/q201_00a_female_captain.w2scene:
  q201_female_captain

== quests/part_1/quest_files/q201_pirates/scenes/q201_00e_brave_captain.w2scene:
  q201_find_captain
  q201_no_money
  q201_ship_paid

== quests/part_1/quest_files/q201_pirates/scenes/q201_08_burial.w2scene:
  q101_ciri_met_witch
  q103_nml_part1_ciri
  q104_elven_wizard
  q105_ciri_witches
  q201_hut_mentioned
  q301_completed
  q302_completed
  q303_completed
  q305_completed

== quests/part_1/quest_files/q201_pirates/scenes/q201_20c_holger_and_donar_at_feast.w2scene:
  q201_drunk
  q201_not_drink

== quests/part_1/quest_files/q201_pirates/scenes/q201_20d_lugos_at_feast.w2scene:
  q201_drunk
  q201_not_drink

== quests/part_1/quest_files/q201_pirates/scenes/q201_20e_candidates_at_feast.w2scene:
  q201_geralt_won_race

== quests/part_1/quest_files/q201_pirates/scenes/q201_20f_end_race.w2scene:
  q201_geralt_won_race

== quests/part_1/quest_files/q201_pirates/scenes/q201_20h_udalryk_and_hjort_at_feast.w2scene:
  q201_drunk
  q201_not_drink

== quests/part_1/quest_files/q201_pirates/scenes/q201_21c_mousesack_lab.w2scene:
  q201_whole_chat

== quests/part_1/quest_files/q201_pirates/scenes/q201_21e_sculpture.w2scene:
  q201_look_around
  q201_mead

== quests/part_1/quest_files/q201_pirates/scenes/q201_21g_sex.w2scene:
  release_jp

== quests/part_1/quest_files/q201_pirates/scenes/q201_23_crach_about_ciri.w2scene:
  prologue_yen_pleased
  q201_bw_suit
  q201_fistfight
  q201_not_drink
  q202_crach_help_cerys
  q202_crach_help_hjalmar
  q202_finished

== quests/part_1/quest_files/q202_giant/phases/q202_events_after.w2phase:
  hjalmar_waits_at_beach
  q202_folan_lives
  q202_vigi_saved
  q210_quest_start

== quests/part_1/quest_files/q202_giant/scenes/q202_01_talk_with_navigator.w2scene:
  q202_know_about_undwik_way
  q202_navigator_met

== quests/part_1/quest_files/q202_giant/scenes/q202_05b_3_eight_dlg_interact_new.w2scene:
  q202_bring_hjalmar
  q202_eight_first_met
  q202_finished
  q202_giant_killed
  q202_heard_about_crew
  q202_met_crew
  q202_recognized_harald

== quests/part_1/quest_files/q202_giant/scenes/q202_05c_3_trolls_cooking_folan.w2scene:
  q202_first_riddle_correct
  q202_folan_boil_penalty

== quests/part_1/quest_files/q202_giant/scenes/q202_05c_5_geralt_talks_with_folan.w2scene:
  q201_cerys_introduced
  q202_bring_hjalmar
  q202_hjalmar_met_w_sirens
  q202_question_1
  q202_question_2
  q203_cerys_saved

== quests/part_1/quest_files/q202_giant/scenes/q202_05c_9_pantry_dlg.w2scene:
  q202_sirens_nest_visited

== quests/part_1/quest_files/q202_giant/scenes/q202_05c_9_pantry_dlg_w_folan.w2scene:
  q202_sirens_nest_visited

== quests/part_1/quest_files/q202_giant/scenes/q202_06a_intro_hjalmar_alone.w2scene:
  q202_bring_hjalmar
  q202_hjalmar_met

== quests/part_1/quest_files/q202_giant/scenes/q202_06b_intro_hjalmar_folan.w2scene:
  q202_told_folan_about_cerys

== quests/part_1/quest_files/q202_giant/scenes/q202_08_geralt_n_ragnar_talk_aft_killing.w2scene:
  q202_folan_lives
  q202_vigi_alive

== quests/part_1/quest_files/q202_giant/scenes/q202_09_at_the_beach_talk.w2scene:
  q202_bring_hjalmar
  q202_told_hjalmar_about_cerys
  q203_cerys_saved

== quests/part_1/quest_files/q202_giant/scenes/q202_focus_geralt_comments.w2scene:
  q202_first_click_done
  q202_folan_fc_4_hideyhole
  q202_folan_fc_5_blood
  q202_horn_knowledge
  q202_loose_single_arrows
  q202_single_arrows_conclusion
  q202_slady_folana

== quests/part_1/quest_files/q202_giant/scenes/q202_survivor_intrct_dlg.w2scene:
  q202_heard_about_crew
  q202_undvik_warrior_met

== quests/part_1/quest_files/q203_him/phases/q203_cataclysm.w2phase:
  ard17_foglings_encounter_off
  mousesack_dd_stop
  q203_cata_clear_weather
  q203_cataclysm_complete
  q203_druidcamp_disable
  q203_eyeofloki_active
  q203_eyeofloki_used
  q203_ghost_scene_bigbang_seen
  q203_ghost_seen_arrival
  q203_ghost_seen_ciri_out
  q203_ghost_seen_nithral_death
  q203_incantation_ended
  q203_lightning_start
  q203_start_cataclysm
  q203_yen_examines_teleport
  q203_yen_mouse_quarrel
  q203_yen_start_read_mind
  q204_teleport_to_birch_bay
  yennefer_dd_start
  yennefer_dd_stop
  yolar_dd_start
  yolar_dd_stop

== quests/part_1/quest_files/q203_him/scenes/q203_06a_check_avalach_portal_out.w2scene:
  q104_completed
  q203_piss_off_ms

== quests/part_1/quest_files/q203_him/scenes/q203_09_examine_elf_corpse.w2scene:
  q203_ciri_can_travel

== quests/part_1/quest_files/q203_him/scenes/q203_10_udalryk_tells_about_him.w2scene:
  q203_know_where_is_becca

== quests/part_1/quest_files/q203_him/scenes/q203_11b_villager_becca.w2scene:
  q203_talked_to_villagers
  q203_talked_to_villagers2

== quests/part_1/quest_files/q203_him/scenes/q203_11c_villager_becca.w2scene:
  q203_talked_to_villagers
  q203_villager2_about_becca

== quests/part_1/quest_files/q203_him/scenes/q203_13_eirik_about_becca.w2scene:
  eirik_angry
  q203_ask_for
  q203_talked_with_udalryk
  q203_udalryk_met
  q203_wheres_becca

== quests/part_1/quest_files/q203_him/scenes/q203_14a_finding_becca.w2scene:
  q203_sword
  q203_sword_plans

== quests/part_1/quest_files/q203_him/scenes/q203_15_about_the_sword.w2scene:
  q203 _what_happend

== quests/part_1/quest_files/q203_him/scenes/q203_17_sword_didnt_help.w2scene:
  q203_light
  q203_suffering
  q203_what
  q203_when

== quests/part_1/quest_files/q203_him/scenes/q203_18_plan_with_becca.w2scene:
  q203_cheating_way_dlg
  q203_hitch
  q203_witcher_way_dlg

== quests/part_1/quest_files/q203_him/scenes/q203_22_tell_udalryk_about_witcher_style.w2scene:
  is_house
  q203_get_torches_from_hjort

== quests/part_1/quest_files/q203_him/scenes/q203_23a_cs203_him_shows.w2scene:
  q203_him_begone
  q203_him_killed
  q203_slipper
  q203_trusted_becca_all

== quests/part_1/quest_files/q203_him/scenes/q203_25_lets_start_night.w2scene:
  q203_lets_start_u_met

== quests/part_1/quest_files/q205_frozen_coast/phases/q205_ciri_replacer.w2phase:
  q205_blend_env
  q205_ciri_com_off
  q205_ciri_drank
  q205_ciri_replacer_seq
  q205_ciri_swim
  q205_go_regen
  q205_start_the_chase_go
  q205_towel_on
  q205_wh_attacked_lofoten
  q205_wh_spawn_start

== quests/part_1/quest_files/q205_frozen_coast/phases/q205_events_after.w2phase:
  q103_nml_part1_ciri
  q205_quest_end
  q205_spoke_to_donar

== quests/part_1/quest_files/q205_frozen_coast/phases/q205_hindarsfjall_yen.w2phase:
  q205_completed
  q205_dead_env
  q205_dead_priestess
  q205_fall_env
  q205_monster_curse_lifted
  q205_quest_end
  q205_respawn_priestess
  q205_talked_about_herbarium
  q205_yen_at_tree
  q205_yen_is_w_us
  sq201_yen_cmt_done
  sq201_yen_cmt_started
  sq_priestess_met
  sq_priestess_met_sq201
  yennefer_dd_start
  yennefer_dd_stop

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_01_talk_with_freya_priestess.w2scene:
  q205_asked_morkvarg
  q205_monster_curse_lifted
  q205_monster_killed
  q205_unlock_priestess_exit
  q205_visited_herb
  sq_contract_accepted

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_01b_commoner_1.w2scene:
  q205_commoner1_met

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_01b_commoner_2.w2scene:
  q205_commoner2_met

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_03_under_the_tree.w2scene:
  q205_monster_curse_lifted

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_05_geralt_gmpl_dlgs.w2scene:
  q205_talked_about_herbarium

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_05b_geralt_shouts_for_yen.w2scene:
  q205_yen_at_tree

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_05c_yen_inter_dlg.w2scene:
  q205_monster_curse_lifted
  q205_werewolf_victim_seen

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_07_necro_ritual.w2scene:
  q205_geralt_whiny

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_08a_3a_sauna_gmpl_chats.w2scene:
  q205_towel_on

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_08a_3b_sauna_changing_clothes.w2scene:
  q205_towel_on

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_08a_3c_talk_at_sauna.w2scene:
  q205_towel_on

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_09_after_nekro_ritual.w2scene:
  q205_mean_to_corpse
  q205_question_yen
  q205_yen_you_ok

== quests/part_1/quest_files/q205_frozen_coast/scenes/q205_11c_yen_final_dialogue.w2scene:
  q103_completed
  q103_nml_part1_ciri
  q107_complete
  q205_all_hubs_completed
  q205_sumup_1
  q205_sumup_2
  q205_yen_hesitates
  q305_completed

== quests/part_1/quest_files/q301_dreamer/phases/q301_bonus_for_house.w2phase:
  q301_godling_sara_peacefully
  q301_haunted_house_free
  q302_completed

== quests/part_1/quest_files/q301_dreamer/phases/q301_scenes_in_kob_den.w2phase:
  q301_3boobs_knocked

== quests/part_1/quest_files/q301_dreamer/phases/q301_triss_house_search.w2phase:
  q301_found_triss_amulets
  q301_found_triss_clothes
  q301_found_triss_elixirs
  q301_found_triss_hairbrush

== quests/part_1/quest_files/q301_dreamer/scenes/q301_05a_ask_beggars3.w2scene:
  q301_come_again
  q301_met_beggar3

== quests/part_1/quest_files/q301_dreamer/scenes/q301_07a_gatekeeper.w2scene:
  q301_followed_thief2_to_crem
  q301_gatekeeper_paid
  q301_know_about_crematory
  q301_leave_weapons
  q301_met_gatekeeper

== quests/part_1/quest_files/q301_dreamer/scenes/q301_11a_rathouse_owner.w2scene:
  q301_buyer_paid
  q301_buyer_paid_all

== quests/part_1/quest_files/q301_dreamer/scenes/q301_11e_rathouse_triss_problem.w2scene:
  q301_buyer_paid
  q301_buyer_paid_all

== quests/part_1/quest_files/q301_dreamer/scenes/q301_12a_haunted_house_owner.w2scene:
  q301_owner

== quests/part_1/quest_files/q301_dreamer/scenes/q301_12aa_haunted_owner_questions.w2scene:
  q301_dreamer_got_out
  q301_godling_sara_peacefully
  q301_need_burdock
  q301_owner_started_asking
  q301_something_haunts

== quests/part_1/quest_files/q301_dreamer/scenes/q301_12f_should_find_crib.w2scene:
  q301_found_crib

== quests/part_1/quest_files/q301_dreamer/scenes/q301_12g_should_find_oven.w2scene:
  q301_found_oven

== quests/part_1/quest_files/q301_dreamer/scenes/q301_13_wakeup_dreamer.w2scene:
  q301_convinced_godling_sara

== quests/part_1/quest_files/q301_dreamer/scenes/q301_14_dreamer_dreams.w2scene:
  q301_ciri_fact
  q301_memory
  q301_memory_all

== quests/part_1/quest_files/q301_dreamer/scenes/q301_15_haunted_owner_bonus.w2scene:
  q302_completed

== quests/part_1/quest_files/q301_dreamer/scenes_pickups/q301_09bb_gatekeeper_givesback.w2scene:
  q301_leave_weapons

== quests/part_1/quest_files/q301_dreamer/scenes_pickups/q301_11bb_found_rat_spots.w2scene:
  q301_comment_found_rat_spot

== quests/part_1/quest_files/q302_mafia/phases/bouncers.w2phase:
  ring_door_enabled

== quests/part_1/quest_files/q302_mafia/phases/camp.w2phase:
  cg300_roche_default_exit_failsafe
  roche_dd_start
  roche_dd_stop

== quests/part_1/quest_files/q302_mafia/phases/casino.w2phase:
  Dealer_offended_behind_bar
  if false, then player hit somebody
  q302_alert_whoreson
  q302_bouncers_attacked_bef_cas_entered
  q302_bouncers_killed_aft_whors_found
  q302_casino_attacked_no_dwarves
  q302_casino_destroyed
  q302_casino_done_no_dwarves
  q302_casino_hit_switch_off
  q302_casino_hit_switch_on
  q302_casino_player_offended
  q302_cleaver_contract
  q302_cleaver_thugs_dead
  q302_combat_casino
  q302_dwarves_to_casino_go
  q302_fdb_card_game_won
  q302_fdb_casino_attacked_with_cleaver
  q302_fdb_casino_completed
  q302_fdb_casino_peacefull
  q302_find_camp
  q302_found_rico_interrogation
  q302_freed_rico
  q302_hit_anybody
  q302_offended_dealer_offer
  q302_opened_casino
  q302_rico_interrogated
  q302_whoreson
  q302_whoreson_found

== quests/part_1/quest_files/q302_mafia/phases/cleaver.w2phase:
  q302_aft_whoreson_shows_up
  q302_casino_attacked_no_dwarves
  q302_casino_destroyed
  q302_casino_done_no_dwarves
  q302_cleaver_contract
  q302_cleaver_thugs_dead
  q302_did_not_agree_varese_offer
  q302_fdb_casino_attacked_with_cleaver
  q302_fdb_cleaver_completed
  q302_fdb_ring_attacked_with_cleaver
  q302_reward_cleaver_full
  q302_reward_cleaver_half
  q302_ring_attacked_no_dwarves
  q302_ring_destroyed
  q302_ring_destroyed_only_stash
  q302_whoreson
  q302_whoreson_found
  varese_dd_start
  varese_dd_stop

== quests/part_1/quest_files/q302_mafia/phases/king_beggar_reward.w2phase:
  king_beggar_dd_start
  q302_freed_rico

== quests/part_1/quest_files/q302_mafia/phases/postmafia.w2phase:
  hms_door_l_enabled
  hms_door_r_enabled
  import_council_exists
  ojkm_gatekeeper_dd_start
  ojkm_gatekeeper_dd_stop
  q302_fdb_spoke_with_radowid_ship
  q302_post_mafia_completed
  radovid_dd_start
  radovid_dd_stop
  sq302_start

== quests/part_1/quest_files/q302_mafia/phases/q302_q303_common_journal_priscilla.w2phase:
  q302_completed
  q302_told_priscilla_aft_q302
  q303_completed
  q303_told_priscilla_aft_q303

== quests/part_1/quest_files/q302_mafia/phases/ring.w2phase:
  arena_door_enabled
  q302_aft_whoreson_shows_up
  q302_alert_whoreson
  q302_bouncer_aft_enter_ring
  q302_bouncer_bef_enter_ring
  q302_bouncer_killed_aft_whores_found
  q302_clear_ring
  q302_cleaver_contract
  q302_cleaver_thugs_dead
  q302_combat_ring
  q302_dwarves_to_ring_go
  q302_fdb_ring_attacked_with_cleaver
  q302_fdb_ring_completed
  q302_fdb_ring_peacefull
  q302_fdb_start_arena_cheer
  q302_fdb_stop_arena_cheer
  q302_find_camp
  q302_gate_closed_properly
  q302_gate_closed_properly_dogs
  q302_gate_closed_properly_first_op
  q302_marks
  q302_offended_ring_leader
  q302_player_in_ring
  q302_ring_attacked_no_dwarves
  q302_ring_bouncers_attacked
  q302_ring_destroyed
  q302_ring_destroyed_only_stash
  q302_spared_life
  q302_stone
  q302_whoreson
  q302_whoreson_found
  q302_zdenek_contract_used
  ring_door_enabled

== quests/part_1/quest_files/q302_mafia/phases/whoreson_house.w2phase:
  q302_chat_dwarves_finished
  q302_clue_fluff
  q302_clue_fluff1
  q302_clue_fluff2
  q302_clue_fluff3
  q302_clue_fluff4
  q302_clue_fluff5
  q302_clue_fluff6
  q302_whoreson
  q302_whoreson_found

== quests/part_1/quest_files/q302_mafia/scenes/q302_000_ortensjo.w2scene:
  import_iorweth_path
  q302_dijkstra_about_roche

== quests/part_1/quest_files/q302_mafia/scenes/q302_00_whoreson_house_raid.w2scene:
  q302_fdb_spoken_with_cleaver_thugs_hideout

== quests/part_1/quest_files/q302_mafia/scenes/q302_05_killed_assassins.w2scene:
  q303_bathhouse_found

== quests/part_1/quest_files/q302_mafia/scenes/q302_06_cleaver_offer.w2scene:
  q302_casino_destroyed
  q302_cleaver_introduced
  q302_didnt_agree
  q302_ring_destroyed
  q302_whoreson

== quests/part_1/quest_files/q302_mafia/scenes/q302_07a_cleaver_bandits_casino.w2scene:
  q302_casino_destroyed

== quests/part_1/quest_files/q302_mafia/scenes/q302_10_bouncers_ring.w2scene:
  q302_ring_bouncer_met

== quests/part_1/quest_files/q302_mafia/scenes/q302_11a_ring_fight.w2scene:
  q302_spared_life

== quests/part_1/quest_files/q302_mafia/scenes/q302_12_ring_leader.w2scene:
  q302_ring_leader_met

== quests/part_1/quest_files/q302_mafia/scenes/q302_14_bouncers_casino.w2scene:
  q302_14_axii
  q302_14_reason
  q302_casino_bouncer_met
  q302_warned

== quests/part_1/quest_files/q302_mafia/scenes/q302_16a_player_one.w2scene:
  q302_casino_player_1_met
  q302_won

== quests/part_1/quest_files/q302_mafia/scenes/q302_16b_player_two.w2scene:
  q302_casino_player_2_met
  q302_won

== quests/part_1/quest_files/q302_mafia/scenes/q302_16c_player_three.w2scene:
  q302_casino_player_3_met
  q302_won

== quests/part_1/quest_files/q302_mafia/scenes/q302_19_rico.w2scene:
  q302_combat_casino

== quests/part_1/quest_files/q302_mafia/scenes/q302_23_cleaver_reward.w2scene:
  q302_casino_destroyed
  q302_fdb_casino_attacked_with_cleaver
  q302_fdb_ring_attacked_with_cleaver
  q302_ring_destroyed

== quests/part_1/quest_files/q302_mafia/scenes/q302_31_whoreson_estate.w2scene:
  q302_combat_casino
  q302_combat_ring

== quests/part_1/quest_files/q302_mafia/scenes/q302_32_whoreson.w2scene:
  q302_alert_whoreson

== quests/part_1/quest_files/q302_mafia/scenes/q302_35_whoreson_ends.w2scene:
  q302_what_have_you_done

== quests/part_1/quest_files/q302_mafia/scenes/q302_39_radovid_about_favour.w2scene:
  import_council_exists

== quests/part_1/quest_files/q303_treasure/phases/drowner_encounter_disabling.w2phase:
  q303_dijkstra_thug_burned
  q303_thieving_thug_burned

== quests/part_1/quest_files/q303_treasure/phases/following/dijkstra_follower.w2phase:
  dijkstra_follow_start
  dijkstra_follow_stop

== quests/part_1/quest_files/q303_treasure/phases/following/triss_follower.w2phase:
  triss_follow_start
  triss_follow_stop

== quests/part_1/quest_files/q303_treasure/phases/hard_puzzles.w2phase:
  hard_puzzles

== quests/part_1/quest_files/q303_treasure/phases/q303_dijkstra_after_witch_hunters.w2phase:
  q303_fdb_left_outpost_fix
  q303_fire_starts

== quests/part_1/quest_files/q303_treasure/phases/q303_dijkstra_in_vip_room.w2phase:
  bathhouse_office_door_enabled
  dijkstra_dd_start

== quests/part_1/quest_files/q303_treasure/phases/q303_geralt_attacks_witch_hunters.w2phase:
  q303_attacked_prematurely
  q303_cover_blown
  q303_refused_cooperation

== quests/part_1/quest_files/q303_treasure/phases/q303_kill_witch_hunters.w2phase:
  actor_menge_was_killed
  q303_geralt_kept_cool
  q303_geralt_killed_menge
  q303_massacre_started
  q303_menge_met
  q303_witch_hunters_massacred
  triss_follow_start

== quests/part_1/quest_files/q303_treasure/phases/q303_show_layers.w2phase:
  q303_layers_loaded

== quests/part_1/quest_files/q303_treasure/phases/q303_triss_outside_outpost.w2phase:
  q303_dandelion_release_info_known
  q303_fdb_fire_alarm_triggers
  q303_fire_outside_01_burning
  q303_fire_outside_02_burning
  q303_fire_outside_03_burning
  q303_fire_outside_04_burning
  q303_triss_about_sq301
  q303_triss_fire_outside_01
  q303_triss_fire_outside_02
  q303_triss_fire_outside_03
  q303_triss_fire_outside_04
  triss_follow_stop

== quests/part_1/quest_files/q303_treasure/phases/q303_wait_for_layers.w2phase:
  q303_layers_loaded

== quests/part_1/quest_files/q303_treasure/phases/vip_bath_vault_mechanism.w2phase:
  bathhouse_vault_closed
  bathhouse_vault_open
  bathhouse_vault_skip

== quests/part_1/quest_files/q303_treasure/scenes/q303_01_06_cyclops_dijkstra_inside_vault.w2scene:
  bart_fact_1
  bart_fact_2
  q303_dijkstra_on_hole

== quests/part_1/quest_files/q303_treasure/scenes/q303_02_07b_geralt_on_choking.w2scene:
  q303_geralt_entered_pops_danger_zone

== quests/part_1/quest_files/q303_treasure/scenes/q303_03_01_01_investigation_recap_intro.w2scene:
  q303_dijkstra_thought_geralt_died
  q303_thieving_thug_found

== quests/part_1/quest_files/q303_treasure/scenes/q303_03_01_02_investigation_recap.w2scene:
  q303_recap_questions_1
  q303_recap_questions_2
  q303_sewers_additional_clues_found
  q303_thieving_thug_found
  q303_took_out_bomb
  q303_was_at_sewer_exit

== quests/part_1/quest_files/q303_treasure/scenes/q303_03_02_cyclops_interview.w2scene:
  q303_bart_met

== quests/part_1/quest_files/q303_treasure/scenes/q303_05_01_triss_at_rendez_vous.w2scene:
  q303_lost_triss_on_way_to_witch_hunters

== quests/part_1/quest_files/q303_treasure/scenes/q303_05_04_witch_hunters_gate_with_triss.w2scene:
  enable_dlg_shortcuts

== quests/part_1/quest_files/q303_treasure/scenes/q303_05_09_geralt_tricking_menge.w2scene:
  enable_dlg_shortcuts
  q303_know_treasure
  q303_triss_tortured

== quests/part_1/quest_files/q303_treasure/scenes/q303_05_10_menge_to_torture_chamber.w2scene:
  q205_completed
  q303_triss_final_question_1
  q303_triss_final_question_2
  q303_triss_final_question_3

== quests/part_1/quest_files/q303_treasure/scenes/q303_06_03_triss_after_killing_everyone.w2scene:
  q303_cover_blown
  q303_geralt_tried_axii
  q303_know_treasure
  q303_triss_tortured

== quests/part_1/quest_files/q303_treasure/scenes/q303_06_04_triss_over_menges_corpse.w2scene:
  q303_first_document
  q303_second_document

== quests/part_1/quest_files/q303_treasure/scenes/q303_06_05_triss_on_torching_place.w2scene:
  q303_triss_killed_menge

== quests/part_1/quest_files/q303_treasure/scenes/q303_07_03_dijkstra_about_treasure.w2scene:
  q303_geralt_lies_to_dijkstra
  q303_know_dandelion
  q303_know_treasure

== quests/part_1/quest_files/q303_treasure/scenes/q303_08_03_spy_abandoned_house.w2scene:
  q303_come_see_me_later
  q303_its_radovid
  q303_know_treasure
  q303_torture_all_the_way
  q303_wheres_dandelion

== quests/part_1/quest_files/q304_dandelion/phases/q304_dandelion_intro.w2phase:
  q301_completed

== quests/part_1/quest_files/q304_dandelion/phases/q304_molly.w2phase:
  import_arjan_dead
  q304_girls
  q304_luiza_met
  q304_race_set_weather
  q304_travel_together
  q304_voorhis_met
  voorhis_dd_stop

== quests/part_1/quest_files/q304_dandelion/phases/q304_postdandelion.w2phase:
  zoltan_eqp_mount

== quests/part_1/quest_files/q304_dandelion/phases/q304_race.w2phase:
  import_arjan_dead
  q304_end_race
  q304_failed_race
  q304_luiza_cantarella
  q304_luiza_nemrod
  q304_player_cantarella
  q304_player_nemrod
  q304_player_redania
  q304_player_zerrikania
  q304_race_started
  q304_race_stop_clapping
  q304_voorhis_cantarella
  q304_voorhis_nemrod
  q304_voorhis_zerrikania
  q403_race_geralt_won
  q403_race_luiza_won
  q403_race_voorhis_won

== quests/part_1/quest_files/q304_dandelion/scenes/q304_01c_about_dandelion.w2scene:
  q304_look_for_ciri
  q304_some_things

== quests/part_1/quest_files/q304_dandelion/scenes/q304_02_zoltan_about_women.w2scene:
  q002_var_attre_met
  q304_zoltan_about_woman_started

== quests/part_1/quest_files/q304_dandelion/scenes/q304_03b_edna_catches_geralt.w2scene:
  q304_cook
  q304_witcher

== quests/part_1/quest_files/q304_dandelion/scenes/q304_03d_geralt_personates_trainer.w2scene:
  q304_fencer
  q304_witcher

== quests/part_1/quest_files/q304_dandelion/scenes/q304_03h_dandelion.w2scene:
  q304_door

== quests/part_1/quest_files/q304_dandelion/scenes/q304_03i_about_nilfgaard.w2scene:
  q002_var_attre_met
  q304_about_bard
  q304_busy
  q304_deja_vu
  q304_geralt_lost_sparing
  q304_molly_info
  q304_vespula_info

== quests/part_1/quest_files/q304_dandelion/scenes/q304_04b_vespula_thanks.w2scene:
  q304_molly_info
  q304_my_name_is
  q304_overreacting
  q304_rosa_info
  q304_sorry_vespula
  q304_to_oxenfurt
  q304_vespula_about_artist

== quests/part_1/quest_files/q304_dandelion/scenes/q304_05a_luiza_and_voorhis.w2scene:
  import_arjan_dead

== quests/part_1/quest_files/q304_dandelion/scenes/q304_05b_race_arjan_alive.w2scene:
  import_arjan_dead
  q304_luiza_cantarella
  q304_luiza_nemrod
  q304_player_cantarella
  q304_player_redania
  q304_player_zerrikania

== quests/part_1/quest_files/q304_dandelion/scenes/q304_05b_race_arjan_dead.w2scene:
  import_arjan_dead
  q304_player_cantarella
  q304_player_nemrod
  q304_player_redania

== quests/part_1/quest_files/q304_dandelion/scenes/q304_05c_molly.w2scene:
  import_arjan_dead
  q304_about_blonde
  q304_rosa_info
  q304_vespula_info

== quests/part_1/quest_files/q304_dandelion/scenes/q304_07b_talk_to_marabella.w2scene:
  q304_interrupted_but_waited
  q304_marabella

== quests/part_1/quest_files/q304_dandelion/scenes/q304_07c_kids_after_classes.w2scene:
  q304_interrupted_classes

== quests/part_1/quest_files/q305_blanka/phases/q305_ambush.w2phase:
  dandelion_dd_stop
  priscilla_dd_stop
  q305_ambush_killed
  q305_ambush_start
  q305_asked_dijkstra_for_help
  q305_clue_dandelion_cloth
  q305_clue_dandelion_poem
  q305_clue_dandelion_signet
  q305_clue_kidn_horse
  q305_dandelion_free
  q305_dijkstra4
  q305_dijkstra6
  q305_gnomes_met
  q305_heard_chat_from_inside
  q305_heard_dand
  q305_horsetrail
  q305_horsetrail1
  q305_horsetrail10
  q305_horsetrail11
  q305_horsetrail11a
  q305_horsetrail12
  q305_horsetrail13
  q305_horsetrail14
  q305_horsetrail15
  q305_horsetrail16
  q305_horsetrail2
  q305_horsetrail3
  q305_horsetrail4
  q305_horsetrail5
  q305_horsetrail6
  q305_horsetrail7
  q305_horsetrail8
  q305_horsetrail8a
  q305_horsetrail9
  q305_horsetrail9a
  q305_met_midgets
  q305_midget_h_open
  q305_midget_h_unlocked
  q305_show_distant_carts
  q305_won_gwint

== quests/part_1/quest_files/q305_blanka/phases/q305_despawn_manin_npcs_after_end.w2phase:
  q305_completed
  zoltan_dd_start

== quests/part_1/quest_files/q305_blanka/phases/q305_jugglers.w2phase:
  q305_started

== quests/part_1/quest_files/q305_blanka/phases/q305_midgets_painting.w2phase:
  q305_completed
  q305_hang_portrait
  q305_received_portrait

== quests/part_1/quest_files/q305_blanka/phases/q305_replacer.w2phase:
  NewGamePlus
  q305_asked_dijkstra_for_help
  q305_block_for_replacer
  q305_ciri_reached_temple
  q305_killed_final_countdown
  q305_mounted_replacer_horse

== quests/part_1/quest_files/q305_blanka/phases/q305_theatre_square.w2phase:
  mq3035_fdb_contact_met
  q305_jumped_over_fence
  q305_started
  q305_write_later

== quests/part_1/quest_files/q305_blanka/scenes/q305_01_priscilla_about_dudu.w2scene:
  q305_write_later

== quests/part_1/quest_files/q305_blanka/scenes/q305_02_theatre_ticket_man.w2scene:
  q305_player_bought_ticket
  q305_ticket_man_met

== quests/part_1/quest_files/q305_blanka/scenes/q305_05e3_thugs_in_docks.w2scene:
  q305_lost_in_docks
  q305_talked_to_strongman

== quests/part_1/quest_files/q305_blanka/scenes/q305_06_hire_jugglers.w2scene:
  q305_jugglers_met
  q305_thugs_gone

== quests/part_1/quest_files/q305_blanka/scenes/q305_06_irina_given_script.w2scene:
  q305_fact_juggler_bonus
  q305_got_script
  q305_guards_thugs_hired
  q305_irina_1
  q305_irina_2
  q305_irina_3
  q305_irina_got_script
  q305_irinas_request_1
  q305_irinas_request_2
  q305_meet_irina
  q305_one_more_while
  q305_talking_script
  q305_told_bout_guards

== quests/part_1/quest_files/q305_blanka/scenes/q305_06a_thugs_in_park.w2scene:
  q305_jugglers_met
  q305_met_thugs

== quests/part_1/quest_files/q305_blanka/scenes/q305_06c_jugglers_hired.w2scene:
  play_is_comedy_q305
  q305_title2

== quests/part_1/quest_files/q305_blanka/scenes/q305_07a_play_starts.w2scene:
  play_is_comedy_q305
  q305_fact_irina_actress
  q305_picked_dandelion
  q305_title2

== quests/part_1/quest_files/q305_blanka/scenes/q305_08_the_play.w2scene:
  play_is_comedy_q305
  q303_picked_dandelion
  q305_fact_irina_actress
  q305_fact_juggler_bonus

== quests/part_1/quest_files/q305_blanka/scenes/q305_09a_dudu_irina_chat.w2scene:
  q305_no_fighting
  q305_small_fight

== quests/part_1/quest_files/q305_blanka/scenes/q305_09c_dudu_found.w2scene:
  q303_know_treasure
  q305_fact_juggler_bonus
  q305_geralt_correct
  q305_picked_dandelion

== quests/part_1/quest_files/q305_blanka/scenes/q305_09d_zoltan_ambush.w2scene:
  q305_ambush_killed
  q305_geralt_no_gwint
  q305_won_gwint

== quests/part_1/quest_files/q305_blanka/scenes/q305_11_dandelion_after_replacer.w2scene:
  q103_nml_part1_ciri
  q205_completed
  q302_whoreson_dead

== quests/part_1/quest_files/q401_konsylium/phases/eskel_follower.w2phase:
  eskel_follow_start
  eskel_follow_stop

== quests/part_1/quest_files/q401_konsylium/phases/lambert_follower.w2phase:
  lambert_follow_start
  lambert_follow_stop

== quests/part_1/quest_files/q401_konsylium/phases/lambert_horseback_follower.w2phase:
  lambert_horseback_follow_start
  lambert_horseback_follow_stop

== quests/part_1/quest_files/q401_konsylium/phases/potestaquisitor.w2phase:
  dont_comment_ptqr
  potestaquisitorInUse
  potestaquisitorLevel
  potestaquisitorObjectFound

== quests/part_1/quest_files/q401_konsylium/phases/q401_chicken_test.w2phase:
  enable_chicken_test
  past_nml

== quests/part_1/quest_files/q401_konsylium/phases/q401_finding_drunk_eskel.w2phase:
  eskel_dd_stop
  q401_boys_got_drunk
  q401_fdb_drunk_party
  q401_goat_survived
  q401_start_calling_eskel
  q401_stop_calling_eskel

== quests/part_1/quest_files/q401_konsylium/phases/q401_lambert_elements.w2phase:
  PLAYER_eqp_unmount
  actor_lake_harpy_was_killed
  actor_q401_cyclops_was_killed
  actor_q401_drowner_was_killed
  actor_q401_fogling_trap_01_was_killed
  actor_q401_fogling_trap_02_was_killed
  actor_q401_fogling_trap_03_was_killed
  actor_q401_fogling_trap_was_killed
  actor_q401_troll_was_killed
  actor_q401_waterhag_was_killed
  boats_are_broken
  debug_retrieve_weapons_immediately
  disable_km_04_bear_group_02
  lambert_dd_stop
  lambert_follow_start
  lambert_follow_stop
  lambert_horseback_follow_start
  lambert_horseback_follow_stop
  lambert_no_time
  npc_exploration_is_broken
  q401_boat_freed
  q401_boat_sound_clue_found
  q401_charged_phylactery_retrieved
  q401_crossed_lake
  q401_crossing_lake
  q401_cyclops_wakes_up
  q401_debris_smashed
  q401_enabled_shrine
  q401_fdb_boy_scream
  q401_fdb_debris_01_smashed
  q401_fdb_debris_02_smashed
  q401_fdb_debris_03_smashed
  q401_fdb_foglets_ambush
  q401_fdb_lambert_on_path
  q401_fdb_lambert_waiting_pier
  q401_fell_for_fogling_trap
  q401_foglings_appear
  q401_gear_left_with_trolls
  q401_geralt_in_boat
  q401_geralt_swam_to_cave
  q401_helped_eskel
  q401_hit_rock_throwing_trolls
  q401_lambert_going_to_lake
  q401_left_weapons_at_trolls
  q401_phylactery_placed
  q401_refused_to_give_swords
  q401_said_going_to_check_boy
  q401_talking_to_boy
  q401_troll_threw_rock_01
  q401_troll_throws_rock_01
  q401_trolls_aggroed
  q401_trolls_killed

== quests/part_1/quest_files/q401_konsylium/phases/q401_persistent.w2phase:
  actor_q401_cyclops_was_killed
  avallach_dd_start
  eskel_dd_start
  eskel_dd_stop
  eskel_dissecting_ekima
  eskel_eqp_mount
  lambert_dd_start
  lambert_eqp_mount
  q401_completed
  q401_cyclops_wakes_up
  q401_triss_earring_found
  vesemir_dd_start
  yennefer_dd_start

== quests/part_1/quest_files/q401_konsylium/phases/q401_return_weapons.w2phase:
  PLAYER_eqp_mount
  lambert_eqp_mount
  q401_gear_retrieved_from_trolls

== quests/part_1/quest_files/q401_konsylium/phases/q401_sail_sound_clue_search_enabled.w2phase:
  q401_sail_sound_clue_search_enabled

== quests/part_1/quest_files/q401_konsylium/phases/q401_show_layers_km.w2phase:
  q401_layers_km_loaded

== quests/part_1/quest_files/q401_konsylium/phases/q401_show_layers_nvg.w2phase:
  q401_layers_nvg_loaded

== quests/part_1/quest_files/q401_konsylium/phases/q401_show_layers_vz.w2phase:
  q401_layers_vz_loaded

== quests/part_1/quest_files/q401_konsylium/phases/q401_stable_eskel_horses.w2phase:
  q401_geralt_won_race

== quests/part_1/quest_files/q401_konsylium/phases/q401_wait_for_layers_km.w2phase:
  q401_layers_km_loaded

== quests/part_1/quest_files/q401_konsylium/phases/q401_wait_for_layers_nvg.w2phase:
  q401_layers_nvg_loaded

== quests/part_1/quest_files/q401_konsylium/phases/q401_wait_for_layers_vz.w2phase:
  q401_layers_vz_loaded

== quests/part_1/quest_files/q401_konsylium/phases/weapons_mount.w2phase:
  PLAYER_eqp_mount
  eskel_eqp_mount
  lambert_eqp_mount
  vesemir_eqp_mount

== quests/part_1/quest_files/q401_konsylium/phases/weapons_unmount.w2phase:
  PLAYER_eqp_unmount
  eskel_eqp_unmount
  lambert_eqp_unmount
  vesemir_eqp_unmount

== quests/part_1/quest_files/q401_konsylium/scenes/q401_01_01b_sergeant_about_uma.w2scene:
  q107_baron_hanged_himself

== quests/part_1/quest_files/q401_konsylium/scenes/q401_01_02_stablemaster_about_uma.w2scene:
  q401_sergeant_releases_uma

== quests/part_1/quest_files/q401_konsylium/scenes/q401_01_05_emhyr_morvran_yennefer_about_uma.w2scene:
  q401_rude_to_emhyr
  sq202_failed

== quests/part_1/quest_files/q401_konsylium/scenes/q401_03_02_yennefer_about_megascope.w2scene:
  q401_bed_explained
  q401_calm_geralt
  q401_helped_eskel
  q401_helped_lambert
  q401_yens_secrets
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_03_07_yennefer_uses_megascope.w2scene:
  q401_calling_whom
  q401_elf_travels
  q401_helping_yen_last
  q401_no_manners

== quests/part_1/quest_files/q401_konsylium/scenes/q401_04_03_eskel_on_forktail.w2scene:
  enable_dlg_shortcuts

== quests/part_1/quest_files/q401_konsylium/scenes/q401_04_05_eskel_on_forktail_fled.w2scene:
  q401_goat_survived

== quests/part_1/quest_files/q401_konsylium/scenes/q401_05_00_gmpl_dialogues.w2scene:
  q401_trolls_killed

== quests/part_1/quest_files/q401_konsylium/scenes/q401_05_12_cave_entrance.w2scene:
  q401_geralt_swam_to_cave

== quests/part_1/quest_files/q401_konsylium/scenes/q401_05_15_troll_negotiations.w2scene:
  q401_hit_rock_throwing_trolls

== quests/part_1/quest_files/q401_konsylium/scenes/q401_05_18_elemental_shrine_finish.w2scene:
  q401_trolls_killed

== quests/part_1/quest_files/q401_konsylium/scenes/q401_06_01_vesemir_leaves.w2scene:
  q401_eskel_got_spirit
  q401_helping_yen_last
  q401_yen_geralt_fight
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_06_02_reunion.w2scene:
  q401_eskel_section
  q401_had_sex_with_yen
  sq106_met_lambert

== quests/part_1/quest_files/q401_konsylium/scenes/q401_06_04_reunion_part_02.w2scene:
  enable_dlg_shortcuts
  q401_drunken_factor
  q401_had_sex_with_yen
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_06_06_sex_with_yennefer.w2scene:
  release_jp

== quests/part_1/quest_files/q401_konsylium/scenes/q401_06_08_found_drunk_eskel.w2scene:
  q401_goat_survived

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_01_trial_01_preparations.w2scene:
  q401_boys_got_drunk

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_02_trial_02_administering.w2scene:
  q401_after_first_potion
  q401_fdb_potion_one
  q401_fdb_potion_three
  q401_fdb_potion_two
  q401_lambert_walked_from_table
  q401_potion_1
  q401_potion_2
  q401_potion_3
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_03_trial_03_feeding_yennefer.w2scene:
  q401_cooking_enabled
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_03b_trial_03_cooking_food.w2scene:
  q401_went_for_ingredients

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_05_trial_05_keeping_yennefer_awake.w2scene:
  sq202_yen_girlfriend

== quests/part_1/quest_files/q401_konsylium/scenes/q401_07_06_avallach_after_trial.w2scene:
  q401_avallach_1
  q401_avallach_2
  q401_lets_have_sex

== quests/part_1/quest_files/q401_konsylium/scenes/q401_08_geralt_finds_triss_earring.w2scene:
  q401_triss_earring_spotted

== quests/part_1/quest_files/q401_konsylium/set_dependent_variables.w2scene:
  past_nml

== quests/part_2/q106_tower.w2phase:
  disable_lw_the_mire_02_drowner_group_1
  disable_lw_the_mire_02_drowner_group_1b
  disable_lw_the_mire_02_drowner_group_2b
  disable_lw_the_mire_02_drowner_group_3
  disable_lw_the_mire_02_drowner_group_3b
  keira_part1_dd_start
  keira_part1_dd_stop
  q104_agreed_to_visit_keira
  q106_anabelle_met
  q106_complete
  q106_curse_ended
  q106_didnt_trust_anabelle
  q106_enc_spawn_morowa_rats
  q106_examined_graham_altar
  q106_failed
  q106_fled_tower
  q106_fought_morowa
  q106_found_secret_lab
  q106_graham_kissed
  q106_graham_to_morowa
  q106_graham_wraith_fight
  q106_keira_about_tower
  q106_keira_lamp_off
  q106_keira_lamp_on
  q106_keira_suggest_examining_marks
  q106_keira_suggest_finding_lab
  q106_know_about_keira_boat
  q106_magic_oillamp_used
  q106_more_info_graham
  q106_morowa_released
  q106_secret_door_opened
  q106_seen_morowa_released
  q106_spn_pesta_dlg
  q106_start_ghost_dialog
  q106_try_to_get_out
  q106_turnoff_all_clues
  q106_villager_by_graham_house
  q106_we_met_morowa
  q402_escort_completed
  sq101_show_shipment

== quests/part_2/q107_swamps.w2phase:
  baron_dd_start
  baron_dd_stop
  graden_dd_start
  graden_dd_stop
  q105_evil_spirit_released
  q105_will_help_children
  q105_with_johnny
  q107_anna_burnt
  q107_anna_disenchanted
  q107_anna_is_crazy
  q107_anna_is_monster
  q107_baron_hanged_community
  q107_baron_hanged_himself
  q107_burrows_hanged
  q107_burrows_massacre
  q107_chat_bef_bies_ended
  q107_checked_the_basement
  q107_chose_feather_doll
  q107_chose_red_bead_doll
  q107_chose_wrong_doll
  q107_complete
  q107_door_to_cave
  q107_failed
  q107_found_johnny
  q107_graden_about_dolls
  q107_graden_going_to_basement
  q107_met_graden
  q107_saw_janek_footprints
  q402_escort_completed

== quests/part_2/q108_eve.w2phase:
  area_nml
  guslar_dd_start
  guslar_dd_stop
  q103_daughter_found
  q106_complete
  q106_curse_ended
  q106_failed
  q108_at_keira
  q108_body_burn_accepted
  q108_body_burn_complete
  q108_body_burned
  q108_complete
  q108_enable_saves
  q108_fact_denied_quest
  q108_guslar_helped_with_father
  q108_guslar_pissed
  q108_guslar_praying
  q108_prepare
  q108_quest_accepted
  q108_seen_guslars_father
  q108_spawn_wraiths
  q108_witch_hunter_killed

== quests/part_2/q109_wrapup.w2phase:
  keira_dd_start
  keira_part1_dd_stop
  q109_confronted_keira
  q109_keira_defeated
  q109_keira_to_km
  q109_keira_to_radovid
  q402_escort_completed

== quests/part_2/q206_berserkers.w2phase:
  arnvald_dd_stop
  becca_dd_start
  becca_dd_stop
  crach_dd_start
  crach_dd_stop
  crach_eqp_mount
  crach_eqp_unmount
  donar_dd_start
  halbjorn_dd_stop
  hjalmar_dd_start
  hjalmar_dd_stop
  hjalmar_eqp_mount
  hjalmar_eqp_unmount
  hjort_dd_start
  hjort_dd_stop
  holger_dd_start
  lady_bran_dd_start
  lugos_dd_stop
  lugos_the_mad_dd_start
  otrygg_dd_stop
  q201_steingrim_killed
  q203_cataclysm_complete
  q206_arits_alive
  q206_arnvald_alive
  q206_arnvald_exposed
  q206_available
  q206_berserkers_attacked
  q206_berserkers_noise
  q206_cellar_door_closed
  q206_cellar_door_enabled
  q206_cellar_door_open
  q206_cerys_queen
  q206_complete
  q206_completed
  q206_dialogs_active
  q206_dinner_in_progress
  q206_fight_init
  q206_fight_over
  q206_geralt_loses_sword
  q206_helping_cerys
  q206_helping_hjalmar
  q206_hjalmar_fist_fighting
  q206_hjalmar_goes_to_eat
  q206_hjalmar_king
  q206_hjalmar_knocked_out
  q206_hjalmar_prosecutor
  q206_hjalmars_challenge_active
  q206_islander_01_defeated
  q206_islander_02_defeated
  q206_islander_03_defeated
  q206_islander_3_defeated
  q206_islanders_defeated
  q206_lady_bran_convicted
  q206_msc_trial_over
  q206_no_for_investigation
  q206_party_started
  q206_taken_reward_from_crach
  q206_testing_in_progress
  q206_to_coronation_now
  q210_on_quest
  sanvrige_dd_stop
  udalryk_dd_start
  udalryk_dd_stop

== quests/part_2/q208_heroesmead.w2phase:
  cerys_dd_stop
  crach_dd_start
  hjalmar_dd_stop
  q203_cataclysm_complete
  q206_hjalmar_king
  q206_to_coronation_now
  q208_cerys_won
  q208_completed
  q208_hjalmar_won
  q208_not_attended
  q208_ppl_cheern_now
  q208_start_crowd_neutral
  q208_started
  q210_on_quest
  q402_invited_mousesack_to_km

== quests/part_2/q308_psycho.w2phase:
  dandelion_dd_start
  dandelion_default_init
  priscilla_dd_start
  priscilla_dd_stop
  q308_after_pat_murder
  q308_after_sewers
  q308_askd_for_open_doors
  q308_blanka_conclusion
  q308_brazier_found
  q308_carp_inv
  q308_catching_up_sewer
  q308_coroner_met_1st
  q308_dead_as_a_dodo
  q308_entered_warehouse
  q308_eustachy_spawned
  q308_eyes_noticed
  q308_formalin_found
  q308_furniture_noticed
  q308_get_rdy_vg
  q308_good_body_found
  q308_goto_nathanel
  q308_im_an_idiot
  q308_in_sewers_w_vg
  q308_left_dawn_estate
  q308_little_blood_found
  q308_met_eustachy
  q308_met_family_member
  q308_met_wendy
  q308_murderous_invite
  q308_nath_alive
  q308_nath_guilty
  q308_nath_killed
  q308_nath_not_guilty
  q308_nathanel_killed
  q308_nathanel_room_op
  q308_no_hax_4_qa
  q308_notice_drags
  q308_notice_statues
  q308_old_blood_court
  q308_open_spit_door
  q308_pris_footprint_found
  q308_prisc_inv
  q308_priscila_healed
  q308_psycho_completed
  q308_psycho_oo_brothel
  q308_psycho_start_666
  q308_sent_to_dawn_estate
  q308_shop_investigated
  q308_start_chase_music
  q308_trail_end_bl
  q308_tried_locked_doors
  q308_vampire_psycho_killed
  q308_vg_met_1st_time
  q308_warehouse_entered_fdb
  q308_workshop_opnd
  q309_walking_with_triss
  sq301_necklace_on
  vg_default_init

== quests/part_2/q309_casablanca.w2phase:
  dijkstra_dd_start
  dijkstra_dd_stop
  olivier_dd_start
  olivier_dd_stop
  q302_post_mafia_completed
  q308_eustachy_spawned
  q309_abandon_triss_rescue
  q309_aft_varese_thugs
  q309_after_first_guards
  q309_after_plan_kingfisher
  q309_after_rescue
  q309_ambush_end
  q309_ambush_start
  q309_ambush_started
  q309_block_encounter_hs20
  q309_chase_passed
  q309_completed
  q309_despawn_kingfisher
  q309_distance_to_triss
  q309_entered_rescue_saw_mages
  q309_fact_disabling_comm
  q309_failed
  q309_fight_fire_guards
  q309_fight_guards_king
  q309_fight_guards_resc
  q309_for_disabling_sq302
  q309_going_to_rescue
  q309_guards_finished_chat
  q309_hide_this_ship
  q309_keep_hood_on
  q309_left_aft_mages
  q309_left_bef_mages
  q309_mage_died
  q309_patrol_rescue_go
  q309_player_may_close_barrel
  q309_rats_killed
  q309_reached_dijkstra
  q309_reached_king_no_trbl
  q309_s_look_back
  q309_s_wh_enter
  q309_saw_olivier_dead
  q309_sewers_start
  q309_sorceress_died
  q309_started
  q309_talked_to_guards
  q309_to_rescue_no_trouble
  q309_too_far
  q309_too_far_on_way_to_rscue
  q309_too_far_to_triss_n_mages
  q309_triss_abandons_mages
  q309_triss_follows
  q309_triss_fought_guards
  q309_triss_lover
  q309_triss_move_to_sewers
  q309_triss_refused
  q309_triss_stayed
  q309_triss_unfollows
  q309_triss_w_mages_near_king
  q309_ungrtf_mage_to_triss
  q309_vampire_killed
  q309_walking_with_triss
  q402_escort_completed
  sq301_started
  triss_dd_start
  triss_dd_stop

== quests/part_2/q402_ciri.w2phase:
  ciri_eqp_unmount
  emhyr_dd_start
  emhyr_dd_stop
  hjalmar_dd_start
  mousesack_dd_start
  q109_keira_defeated
  q109_keira_to_km
  q109_keira_to_radovid
  q202_hjalmar_saved
  q203_cerys_saved
  q206_available
  q206_hjalmar_king
  q208_completed
  q208_crach_respawned_at_kt
  q208_despawning_q208_from_tree
  q208_hjalmar_back_to_kt_aft_q208
  q309_completed
  q309_failed
  q309_started
  q402_allies_gathered
  q402_cerys_refused_km
  q402_cerys_sent_hjalmar
  q402_ciri_dialogue_music
  q402_ciri_welcome_day
  q402_ciri_welcome_night
  q402_crach_will_teleport
  q402_dopey_found
  q402_dwarves_met
  q402_escort_chat1_triggered
  q402_escort_chat2_triggered
  q402_escort_combat1_triggered
  q402_escort_combat2_triggered
  q402_escort_completed
  q402_found_ciri
  q402_happy_found
  q402_harpies_ambient_off
  q402_hide_sword
  q402_invited_hjalmar_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q402_know_about_battle
  q402_narcolepsia_in_progress
  q402_novigrad_allies_gathered
  q402_skellige_allies_gathered
  q402_talked_to_emhyr
  q402_teleport_to_km_hour
  q402_tried_opening_doors
  roche_dd_start
  roche_dd_stop
  sq101_date_with_keira_was_failed
  sq312_fact_started
  sq312_fdb_ves_end
  sq312_ves_died
  sq315_fdb_roche_in_passiflora
  sq315_fdb_roche_left

== quests/part_2/quest_files/q106_tower/phases/q106_oillamp.w2phase:
  q106_anabelle_met
  q106_curse_ended
  q106_first_put_oillamp
  q106_found_new_victim
  q106_ghost_magnate
  q106_ghost_morowa_victim
  q106_ghost_preparation
  q106_ghost_rat_cages
  q106_ghost_running_start
  q106_ghost_seen_running
  q106_ghost_swim_loot
  q106_ghost_table_room
  q106_ghost_victim_pesta_show
  q106_ghost_victim_scream
  q106_magic_oillamp_used
  q106_start_ghost_dialog

== quests/part_2/quest_files/q106_tower/q106_graham_dies.w2phase:
  q106_failed
  q106_seen_morowa_released

== quests/part_2/quest_files/q106_tower/q106_tower_curse_effects.w2phase:
  q106_already_was_on_island
  q106_basement_door_open
  q106_brick_switch_clue
  q106_curse_ended
  q106_enable_hidden_button
  q106_examined_bottle_ppl
  q106_found_blood_clue
  q106_found_bodies_of_looters1
  q106_found_bodies_of_looters2
  q106_found_bodies_of_looters3
  q106_found_brown_marks
  q106_found_secret_lab
  q106_lab_door_marks
  q106_torch_switch1_clue
  q106_torch_switch2_clue
  q106_try_switch

== quests/part_2/quest_files/q106_tower/scenes/q106_01_keira_about_curse.w2scene:
  q106_already_was_on_island
  q106_know_about_keira_boat
  q106_rejected_quest_1st_time

== quests/part_2/quest_files/q106_tower/scenes/q106_06b_chat_villager.w2scene:
  q106_villager_by_graham_house

== quests/part_2/quest_files/q106_tower/scenes/q106_06d_graham_about_island.w2scene:
  graham_met
  q106_geralt_has_bones
  q106_graham_tells_ab_tower

== quests/part_2/quest_files/q106_tower/scenes/q106_14_keira_about_powerful_ghost.w2scene:
  q106_found_secret_lab

== quests/part_2/quest_files/q106_tower/scenes/q106_15_geralt_lights_oillamp.w2scene:
  q106_found_new_victim
  q106_more_info_graham

== quests/part_2/quest_files/q106_tower/scenes/q106_22_tell_keira_curse_lifted.w2scene:
  q106_morowa_released
  q106_seen_morowa_released

== quests/part_2/quest_files/q107_swamps/q107_baronsmen_attack.w2phase:
  q105_evil_spirit_released
  q105_will_help_children
  q107_baron_hanged
  q107_baron_scenes_played
  q107_failed
  q107_sergeant_busy
  q107_spawn_burrows_wraiths

== quests/part_2/quest_files/q107_swamps/scenes/q107_05_enter_witch_village.w2scene:
  q103_daughter_visited
  q105_will_help_children

== quests/part_2/quest_files/q107_swamps/scenes/q107_05a_graden_sees_us.w2scene:
  q103_daughter_visited

== quests/part_2/quest_files/q107_swamps/scenes/q107_09_found_janek.w2scene:
  q107_checked_the_basement
  q107_janeks_guilt

== quests/part_2/quest_files/q107_swamps/scenes/q107_10_tell_about_cellar.w2scene:
  q107_checked_the_basement

== quests/part_2/quest_files/q107_swamps/scenes/q107_12_we_see_carpet.w2scene:
  q107_chose_feather_doll
  q107_chose_red_bead_doll

== quests/part_2/quest_files/q107_swamps/scenes/q107_15a_anna_died_burnt.w2scene:
  q107_took_wrong_doll

== quests/part_2/quest_files/q107_swamps/scenes_pickup/q107_01a_tamara_oneliners.w2scene:
  q105_will_help_children

== quests/part_2/quest_files/q107_swamps/scenes_pickup/q107_07a_went_into_cellar.w2scene:
  q105_will_help_children

== quests/part_2/quest_files/q108_eve/scenes/q108_02_guslar_about_eve.w2scene:
  q108_dont_agree

== quests/part_2/quest_files/q108_eve/scenes/q108_04_guslar_explains_eve.w2scene:
  q108_prepare

== quests/part_2/quest_files/q109_wrapup/phases/q109_chicken_test.w2phase:
  enable_chicken_test
  q109_layers_loaded

== quests/part_2/quest_files/q109_wrapup/phases/q109_wait_for_layers.w2phase:
  q109_layers_loaded

== quests/part_2/quest_files/q109_wrapup/scenes/q109_05_keira_standoff_at_lab.w2scene:
  q402_know_about_battle
  sq101_keira_had_sex
  sq101_sex_with_keira

== quests/part_2/quest_files/q206_berserkers/phases/dinner_talks_counter.w2phase:
  q206_dialogs_active

== quests/part_2/quest_files/q206_berserkers/phases/discussing_corpses_identity.w2phase:
  q206_discussed_corpses_identity

== quests/part_2/quest_files/q206_berserkers/phases/following/becca_follower.w2phase:
  becca_follow_start
  becca_follow_stop

== quests/part_2/quest_files/q206_berserkers/phases/following/hjalmar_follower.w2phase:
  hjalmar_follow_start
  hjalmar_follow_stop

== quests/part_2/quest_files/q206_berserkers/phases/q206_berserkers_attack.w2phase:
  actor_q206_berserker_main_hall_01_was_killed
  actor_q206_berserker_main_hall_02_was_killed
  actor_q206_berserker_main_hall_03_was_killed
  actor_q206_berserker_was_killed
  becca_dd_start
  crach_dd_start
  crach_eqp_mount
  crach_eqp_unmount
  hjalmar_dd_start
  hjalmar_eqp_mount
  hjalmar_eqp_unmount
  q201_steingrim_killed
  q206_berserker_01_aggroed
  q206_berserker_02_aggroed
  q206_berserker_03_aggroed
  q206_berserkers_attack
  q206_berserkers_attacked
  q206_com_berserkers_attack
  q206_drogodar_dies
  q206_geralt_loses_sword
  q206_helping_cerys
  q206_helping_hjalmar
  q206_msc_geralt_made_choice
  q206_msc_halbjorn_dying
  q206_msc_jarls_demand_trial
  q206_no_for_investigation
  q206_svanrige_king

== quests/part_2/quest_files/q206_berserkers/phases/q206_cerys_path.w2phase:
  actor_q206_brans_sailor_was_killed
  arnvald_hit
  arnvald_horse_hit
  becca_dd_stop
  becca_follow_start
  becca_follow_stop
  crach_dd_start
  crach_dd_stop
  donar_dd_stop
  holger_dd_stop
  lugos_dd_stop
  q206_arnvald_alive
  q206_arnvald_chase_underway
  q206_arnvald_died
  q206_arnvald_exposed
  q206_arnvald_knocked_off_horse
  q206_arnvalds_chest_open
  q206_arnvalds_cloth_found
  q206_arnvalds_footprints_found
  q206_arnvalds_torch_flies
  q206_arnvalds_torch_hits
  q206_barrels_checked
  q206_berserker_corpse_01_found
  q206_berserker_corpse_02_found
  q206_berserker_corpse_03_found
  q206_berserker_examined
  q206_cellar_door_enabled
  q206_cellar_exit_door_free
  q206_crach_walking_around
  q206_csi_completed
  q206_hide_arnvalds_cache
  q206_stopped_talking_to_hjort
  q206_talking_to_hjort
  q206_wine_bottle_found
  q206_wine_rack_destroyed
  q402_know_about_battle
  udalryk_dd_stop

== quests/part_2/quest_files/q206_berserkers/phases/q206_chicken_test.w2phase:
  q206_enable_chicken_test
  q206_layers_loaded

== quests/part_2/quest_files/q206_berserkers/phases/q206_found_focus_smell.w2phase:
  q206_found_scent_trail

== quests/part_2/quest_files/q206_berserkers/phases/q206_hjalmar_path.w2phase:
  actor_q206_arits_was_killed
  actor_q206_cave_berserker_was_killed
  hjalmar_dd_stop
  hjalmar_follow_start
  hjalmar_follow_stop
  q206_bear_cave_found
  q206_found_scent_trail
  q206_geralt_met_hallgrim
  q206_hallgrim_killed
  q206_hallgrim_trapdoor_open
  q206_hear_chanting
  q206_hjalmar_prosecutor
  q206_islanders_seen_at_ritual
  q206_stop_chanting

== quests/part_2/quest_files/q206_berserkers/phases/q206_show_layers.w2phase:
  q206_active

== quests/part_2/quest_files/q206_berserkers/phases/q206_wait_for_layers.w2phase:
  q206_layers_loaded

== quests/part_2/quest_files/q206_berserkers/scenes/q206_02_04_gp_skald_sings_praise_to_hjalmar.w2scene:
  q202_geralt_in_song

== quests/part_2/quest_files/q206_berserkers/scenes/q206_03_04_islanders_challenge.w2scene:
  q206_hjalmars_challenge_active
  q206_islanders_defeated
  q206_islanders_fought
  q206_met_islanders

== quests/part_2/quest_files/q206_berserkers/scenes/q206_03_05a_islander_01_fought.w2scene:
  q206_hjalmars_challenge_active

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_b01_01_becca_on_investigating.w2scene:
  q206_fluff_question_cerys
  sq209_part_2_done

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_b01_03_geralt_investigates_berserker_corpse.w2scene:
  q206_bear_head_checked

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_b01_09_jarls_interview.w2scene:
  q206_jarls_first_met

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_b05b_03_gp_geralt_searches_arnvalds_room.w2scene:
  q206_arnvalds_left_shoe_found
  q206_arnvalds_right_shoe_found

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_b05b_04_becca_on_box.w2scene:
  q206_saw_all_bodies

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_h01_01_hjalmar_on_village.w2scene:
  q206_hjalmar_knocked_out

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_h01_02b_gp_geralt_on_clothes.w2scene:
  q206_corpse_01_found
  q206_corpse_02_found
  q206_corpse_03_found

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_h01_02k_hjalmar_on_dead_houses.w2scene:
  q206_hjalmar_about_vildkarls

== quests/part_2/quest_files/q206_berserkers/scenes/q206_05_h03_04a_geralt_on_arits_letter.w2scene:
  q206_geralt_expects_conspiracy

== quests/part_2/quest_files/q206_berserkers/scenes/q206_06_03a_trial_becca.w2scene:
  q206_arnvald_alive
  q206_arnvald_rescued
  q206_didnt_read_letter

== quests/part_2/quest_files/q206_berserkers/scenes/q206_06_04_crach_thanks_geralt.w2scene:
  q206_birna_killed

== quests/part_2/quest_files/q208_heroesmead/phases/q208_after_coronation_chats.w2phase:
  mousesack_dd_start
  mousesack_dd_stop
  q203_cataclysm_complete
  q208_completed
  q208_hjalmar_won
  q208_talking_stop_horn
  q402_cerys_refused_km
  q402_escort_completed
  q402_invited_hjalmar_to_km
  q402_invited_mousesack_to_km
  q402_know_about_battle
  udalryk_dd_stop

== quests/part_2/quest_files/q208_heroesmead/phases/q208_despawn_community_after_debate.w2phase:
  cerys_dd_start
  hjalmar_dd_start
  mousesack_dd_start
  q203_cataclysm_complete
  q208_completed
  q208_crach_respawned_at_kt
  q208_despawning_q208_from_tree
  q208_hjalmar_back_to_kt_aft_q208
  q208_hjalmar_won
  q208_not_attended
  q402_crach_will_teleport
  q402_invited_hjalmar_to_km
  q402_invited_mousesack_to_km
  udalryk_dd_start

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_00a_servant1.w2scene:
  q206_hjalmar_king

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_01a_comment_on_approaching2.w2scene:
  q206_hjalmar_king

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_03b_chorus_chanting.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04b_donar_oneliner.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04c_holger_oneliner.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04d_hjort_udalryk_chat.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04e_skelligeman_comment1.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04f_skelligewoman_comment2.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04g_random_skelligs_chat1.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04h_random_skelligs_chat2.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04j_skelligs_oneliner1.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04l_skelligeman_comment3.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04m_skelligewoman_comment4.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_04o_druid_vivat.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05_crach_after_ritual.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05a_priest_blessing.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05b_priestess_incantation.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05c_cerys_oneliner.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05d_hjalmar_oneliner.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05e_hjort_oneliner.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q208_heroesmead/scenes/q208_05f1_warrior_cheering_boss.w2scene:
  q208_hjalmar_won

== quests/part_2/quest_files/q308_psycho/scenes/q308_01b_vg_examines_priscilla.w2scene:
  q308_catching_up_sewer
  q308_geralt_later

== quests/part_2/quest_files/q308_psycho/scenes/q308_03a_autopsy.w2scene:
  q308_checked_genitals
  q308_checked_something
  q308_important_clue_1
  q308_important_clue_2
  q308_important_clue_3
  q308_syphilis_clue

== quests/part_2/quest_files/q308_psycho/scenes/q308_03b_coroner_walks_us_out.w2scene:
  q308_vongratz_accuses

== quests/part_2/quest_files/q308_psycho/scenes/q308_04a_wendy_talk.w2scene:
  q308_blanka_conclusion
  q308_brazier_found
  q308_pris_footprint_found
  q308_trail_end_bl
  q308_wendy_sequence

== quests/part_2/quest_files/q308_psycho/scenes/q308_04b_carpenters_brother_talk.w2scene:
  q308_askd_for_open_doors
  q308_courtyard_blood
  q308_int_started_goibur
  q308_no1_heard_nothing
  q308_notice_drags
  q308_notice_statues
  q308_shop_investigated

== quests/part_2/quest_files/q308_psycho/scenes/q308_04b_insights_carpenter.w2scene:
  q308_conclusion_show
  q308_talked_about_windows

== quests/part_2/quest_files/q308_psycho/scenes/q308_04c_eustachy_talk.w2scene:
  q308_spoke_to_eustachy
  q308_threatened_eustace

== quests/part_2/quest_files/q308_psycho/scenes/q308_05b_coroner_exam.w2scene:
  q308_know_about_letters
  q308_vongratz_accuses
  sq301_ingrid_party

== quests/part_2/quest_files/q308_psycho/scenes/q308_06a_ingrid_courtyard_talk.w2scene:
  sq301_ingrid_party

== quests/part_2/quest_files/q308_psycho/scenes/q308_07_nathanel_hypno_talk.w2scene:
  q308_found_brazier
  q308_found_formaldehyde

== quests/part_2/quest_files/q309_casablanca/phases/q309_all_mages_encounters_changing_state.w2phase:
  q309_started

== quests/part_2/quest_files/q309_casablanca/phases/q309_kingfisher_entrance_mechanism.w2phase:
  q309_hideout_open
  q309_player_may_close_barrel

== quests/part_2/quest_files/q309_casablanca/phases/q309_witch_hunters_control.w2phase:
  actor_q309_chase_man_brothel_dist_was_killed
  mq3035_fdb_contact_met
  mq3035_fdb_radovid_dead
  q302_completed
  q308_psycho_oo_brothel
  q308_psycho_start_666
  q309_ambush_end
  q309_ambush_start
  q309_bandit_follow
  q309_bandit_unfollow
  q309_chase_man_brothel_dist_weapon_hit
  q309_dead_key3_holder
  q309_fought_wh_wait_gate
  q309_found_with_bandits
  q309_guy_escapes
  q309_have_keys
  q309_helper_wounded_wh
  q309_keys_story_completed
  q309_letter_represions_started
  q309_met_raisa_temple
  q309_open_secret_house_wall
  q309_push_lady_wh
  q309_safe_opened
  q309_safe_unlocked
  q309_sygnal_stub
  q309_ungrtf_mage_to_triss
  q309_wh_control_block_comm
  q309_wh_story_completed
  q309_witcher_attacked_wh
  q309_wounded_represions_started
  q309_wounded_wh_blood
  q309_wounded_wh_mappin1
  q309_wounded_wh_mappin1a
  q309_wounded_wh_mappin2
  q309_wounded_wh_mappin3
  q309_wounded_wh_mappin4
  q309_wounded_wh_mappin5
  q309_wounded_wh_scent
  q310_keira_stick
  q310_started
  q402_escort_completed
  sq301_ball_started
  sq301_completed
  sq301_met_ungrt_mage
  sq303_active

== quests/part_2/quest_files/q309_casablanca/scenes/q309_00o2_wh_killing_beggars_dialoguse.w2scene:
  q309_met_wh_beggars

== quests/part_2/quest_files/q309_casablanca/scenes/q309_00p2_talk_to_thugs.w2scene:
  q309_bandit_wound_met

== quests/part_2/quest_files/q309_casablanca/scenes/q309_00s1_raisa_hires_witcher.w2scene:
  q309_met_raisa_temple

== quests/part_2/quest_files/q309_casablanca/scenes/q309_00u_ungrateful_mage_on_steak.w2scene:
  q309_completed
  q309_failed

== quests/part_2/quest_files/q309_casablanca/scenes/q309_01a_triss_about_mages.w2scene:
  q309_morality_talk
  q309_sq_detour_1
  q309_sq_detour_2

== quests/part_2/quest_files/q309_casablanca/scenes/q309_01c_triss_on_way_to_olivier.w2scene:
  sq301_mage_dead

== quests/part_2/quest_files/q309_casablanca/scenes/q309_02b_the_plan.w2scene:
  q309_going_to_rescue

== quests/part_2/quest_files/q309_casablanca/scenes/q309_05f_in_secret_library.w2scene:
  q309_triss_about_end

== quests/part_2/quest_files/q309_casablanca/scenes/q309_07_dijkstra_triss_left.w2scene:
  q309_asked_triss_to_stay
  q309_told_triss_you_love_her
  q309_triss_refused
  sq301_kissed_triss

== quests/part_2/quest_files/q309_casablanca/scenes/q309_08b_this_way_to_roof.w2scene:
  release_jp

== quests/part_2/quest_files/q309_casablanca/scenes/q309_11c_rescued_mages.w2scene:
  q309_sorceress_lives

== quests/part_2/quest_files/q402_ciri/scenes/q402_1_ally_cerys.w2scene:
  q206_completed
  q206_hjalmar_king
  q402_hjalmar_invited_to_q403

== quests/part_2/quest_files/q402_ciri/scenes/q402_1_ally_dijkstra.w2scene:
  q303_know_treasure

== quests/part_2/quest_files/q402_ciri/scenes/q402_1_ally_hjalmar.w2scene:
  q206_completed
  q208_completed
  q208_despawning_q208_from_tree

== quests/part_2/quest_files/q402_ciri/scenes/q402_1_ally_roche.w2scene:
  sq312_fdb_ves_end
  sq312_ves_died

== quests/part_2/quest_files/q402_ciri/scenes/q402_3_dwarves_about_bies.w2scene:
  q402_ferenc_mentioned
  q402_gaspard_mentioned
  q402_ivo_mentioned

== quests/part_2/quest_files/q402_ciri/scenes/q402_3a_dead_dwarf_found.w2scene:
  q402_dwarves_met

== quests/part_2/quest_files/q402_ciri/scenes/q402_3b_meet_dopey.w2scene:
  q402_dwarves_met

== quests/part_2/quest_files/q402_ciri/scenes/q402_3c_sleepy_found.w2scene:
  q402_dwarves_met
  q402_sleepy_met

== quests/part_2/quest_files/q402_ciri/scenes/q402_5_dwarves_after_bies.w2scene:
  q402_dopey_found
  q402_happy_found

== quests/part_2/quest_files/q402_ciri/scenes/q402_9_ciri_wake_up.w2scene:
  q402_help

== quests/part_2/quest_files/q403_battle/phases/q403_1st_replacer.w2phase:
  eskel_eqp_mount
  q109_keira_to_km
  q402_invited_zoltan_to_km
  q403_cinematic_ciri_1st_replacer
  q403_meteor_tutorial
  q403_temporary_immunity
  q403_turn_off_first_replacer_security
  vesemir_eqp_mount

== quests/part_2/quest_files/q403_battle/phases/q403_2nd_replacer.w2phase:
  q402_invited_letho_to_km
  q402_invited_roche_to_km
  q403_lambert_dead
  q403_turn_off_second_replacer_security

== quests/part_2/quest_files/q403_battle/phases/q403_bombs.w2phase:
  q403_final_battle_starts

== quests/part_2/quest_files/q403_battle/phases/q403_burial.w2phase:
  avallach_eqp_mount
  ciri_dd_start
  ciri_eqp_mount
  ciri_eqp_unmount
  eskel_dd_start
  eskel_eqp_mount
  eskel_eqp_unmount
  hjalmar_dd_start
  keira_part1_dd_start
  lambert_dd_start
  lambert_eqp_mount
  lambert_eqp_unmount
  letho_dd_start
  mousesack_dd_start
  q109_keira_to_km
  q202_folan_saved
  q202_vigi_saved
  q206_hjalmar_king
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_burial_later
  q403_burial_weather
  q403_completed
  q403_folan_died
  q403_lambert_dead
  q403_load_pyre_fires
  q403_vesemir_buried
  q403_vigi_died
  roche_dd_start
  triss_dd_start
  ves_dd_start
  yennefer_dd_start
  zoltan_dd_start

== quests/part_2/quest_files/q403_battle/phases/q403_burning_forest.w2phase:
  q402_invited_letho_to_km

== quests/part_2/quest_files/q403_battle/phases/q403_council.w2phase:
  PLAYER_eqp_mount
  ciri_eqp_mount
  eskel_eqp_mount
  eskel_eqp_unmount
  mousesack_eqp_mount
  q109_keira_to_km
  q202_folan_lives
  q202_vigi_saved
  q206_hjalmar_king
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_blend_wt_battle
  q403_ciri_last_talk
  q403_council
  q403_council_begins
  q403_council_decisions
  q403_council_later
  q403_elixirs
  q403_teleported_to_km
  q403_temporary_immunity
  zoltan_eqp_mount
  zoltan_eqp_unmount

== quests/part_2/quest_files/q403_battle/phases/q403_final_battle.w2phase:
  avallach_eqp_unmount
  q109_keira_to_km
  q202_folan_lives
  q202_vigi_saved
  q206_hjalmar_king
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_battle_ends
  q403_bubble_final_form
  q403_componions_comment
  q403_final_battle_starts
  q403_finale_stage_1
  q403_finale_stage_2
  q403_finale_stage_3
  q403_finale_stage_3b
  q403_finale_stage_4
  q403_fix_wall
  q403_hjalmar_cs
  q403_hjalmar_cs_done
  q403_lambert_dead
  q403_mousesack_opened_circle
  q403_rift_1a_closed
  q403_rift_1b_closed
  q403_rift_2a_closed
  q403_rift_2b_closed
  q403_rift_3a_closed
  q403_rift_3b_closed
  q403_rift_3c_closed

== quests/part_2/quest_files/q403_battle/phases/q403_first_square.w2phase:
  letho_follow_start
  letho_follow_stop
  q109_keira_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q403_close_gate
  q403_geralt_saved_lambert
  q403_keira_saved_lambert
  q403_lambert_dead
  q403_move_imlerith_division
  q403_retreat
  q403_vesemir_reached_low_yard

== quests/part_2/quest_files/q403_battle/phases/q403_forest.w2phase:
  eskel_eqp_unmount
  lambert_eqp_mount
  lambert_eqp_unmount
  letho_eqp_mount
  letho_eqp_unmount
  q109_keira_to_km
  q202_folan_lives
  q202_vigi_saved
  q206_hjalmar_king
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_arachas_attacked
  q403_arachas_lured
  q403_blend_out_invisibility
  q403_fix_wall
  q403_hunting_stop
  q403_lamber_done_about_triss
  q403_lambert_pitfall_traps
  q403_lambert_pitfall_traps_done
  q403_last_rift_forest_closed
  q403_made_traps
  q403_mordownia_activated
  q403_move_suicide_division
  q403_move_suicide_division_again
  q403_new_gear
  q403_rift_center_hunt_killed
  q403_rift_forest_1_closed
  q403_rift_forest_2_closed
  q403_rift_forest_3_closed
  q403_rift_forest_closed
  q403_rift_left_hunt_killed
  q403_rift_right_hunt_killed
  q403_rift_tutorial_bomb
  q403_rift_tutorial_bomb_seen
  q403_stop_suicide_division
  q403_talking_arachas
  q403_temporary_immunity
  vesemir_eqp_unmount
  witchers_follow_start
  witchers_follow_stop

== quests/part_2/quest_files/q403_battle/phases/q403_invalids_square.w2phase:
  q109_keira_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_canaris_intro
  q403_eskel_gate_checked
  q403_lambert_dead
  q403_rift_tutorial_sign

== quests/part_2/quest_files/q403_battle/phases/q403_supporters.w2phase:
  ciri_dd_stop
  eskel_dd_stop
  hjalmar_dd_stop
  keira_part1_dd_stop
  lambert_dd_stop
  letho_dd_stop
  mousesack_dd_stop
  mousesack_eqp_unmount
  q109_keira_to_km
  q202_folan_lives
  q202_vigi_saved
  q402_invited_hjalmar_to_km
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_council
  q403_teleported_to_km
  q403_tried_dispelling_illusion
  roche_dd_stop
  triss_dd_stop
  ves_dd_stop
  vesemir_dd_stop
  yennefer_dd_stop
  zoltan_dd_stop

== quests/part_2/quest_files/q403_battle/scenes/q403_01_teleport_to_kaer_morhen.w2scene:
  q309_triss_lover
  sq202_yen_girlfriend

== quests/part_2/quest_files/q403_battle/scenes/q403_05a_zoltan_oneliners.w2scene:
  q403_zoltan_craftsman_met

== quests/part_2/quest_files/q403_battle/scenes/q403_14_council.w2scene:
  q402_invited_letho_to_km
  q402_invited_mousesack_to_km
  q402_invited_roche_to_km
  q402_invited_zoltan_to_km
  q403_ciri_important
  q403_elixirs
  q403_lab_planned
  q403_lab_planned_again
  q403_new_gear
  q403_workshop_planned
  q403_workshop_planned_again
  sq106_killbill_completed

== quests/part_2/quest_files/q403_battle/scenes/q403_15c_battle_begins.w2scene:
  q402_invited_letho_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_16b_keira_saves_lambert.w2scene:
  q109_keira_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_16b_lambert_fighting.w2scene:
  q403_warn_about_ghouls

== quests/part_2/quest_files/q403_battle/scenes/q403_16m_pitfall_trap.w2scene:
  q402_invited_letho_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_18a_ciri_runs_on_walls.w2scene:
  q402_invited_zoltan_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_18c_triss_spell.w2scene:
  q402_invited_letho_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_21b_fire_up_napalm.w2scene:
  q402_invited_zoltan_to_km

== quests/part_2/quest_files/q403_battle/scenes/q403_26_dead_vesemir.w2scene:
  q403_lambert_dead

== quests/part_2/quest_files/q403_battle/scenes/q403_34e_eskel_after_battle.w2scene:
  q403_lambert_dead

== quests/part_2/quest_files/q403_battle/scenes/q403_34g_hjalmar_after_battle.w2scene:
  q206_hjalmar_king

== quests/part_2/quest_files/q403_battle/scenes/q403_34j_geralt_pays_honors.w2scene:
  q403_lambert_dead

== quests/part_3/q111_imlerith.w2phase:
  asdasdasda
  ciri_dd_start
  ciri_dd_stop
  ciri_wears_wolf_medallion
  q111_cifi_follower_stop
  q111_coin_acquired
  q111_fade_sounds
  q111_fdb_acorn_given
  q111_fugas_met_factdb
  q111_godlin_jony_met_alone
  q111_godlin_sarah_n_jony_met
  q111_hag_test_done
  q111_imlerith_dead
  q111_local_def
  q111_non_shall_pass
  q111_old_hag_tent
  q111_sabath_started
  q111_steady_said
  q111_weather_clear
  q301_godling_sara_peacefully

== quests/part_3/q210_precanaris.w2phase:
  avallach_dd_start
  ciri_dd_start
  ciri_dd_stop
  ciri_eqp_mount
  ciri_eqp_unmount
  crach_eqp_mount
  margarita_dd_start
  margarita_dd_stop
  mousesack_dd_start
  mousesack_dd_stop
  philippa_dd_start
  philippa_dd_stop
  q203_cerys_saved
  q206_completed
  q206_svanrige_king
  q208_hjalmar_king
  q208_svanrige_king
  q210_activate_lab_door
  q210_active_chat_boat
  q210_ava_golem_alive
  q210_blood_door_open
  q210_can_goto_emhyr
  q210_ciri_on_skjall
  q210_cs_ciri_destroy_lab
  q210_disable_comm_molo
  q210_emhyr_done
  q210_fil_marg_chat_deck
  q210_filippa_cut_hand
  q210_found_lover_brush
  q210_found_lover_food
  q210_found_lover_mirror
  q210_found_lover_perfume
  q210_going_with_ciri_to_morszczynka
  q210_hide_additional_ships
  q210_hide_avallach_choices
  q210_hide_whale
  q210_holmstein_community
  q210_knows_about_ruins
  q210_lab_done
  q210_lugos_comm_disable
  q210_lugos_dead
  q210_met_ava_lover
  q210_morszczynka_killed
  q210_mus_bran_nego_combat
  q210_mus_bran_nego_silent
  q210_mus_lugos_combat
  q210_mus_lugos_to_gmpl
  q210_negotiation_community
  q210_on_quest
  q210_open_rift_door
  q210_remind_eyvind_bonfire
  q210_riddle_mirror_setup_ok
  q210_ruins_and_lab_start
  q210_ruins_done
  q210_show_additional_ships
  q210_show_beams
  q210_show_whale
  q210_skjall_grave_visited
  q210_spn_pearlmonster
  q210_start_levitate_stairs
  q210_start_unhide_wall
  q210_stop_03_ciri_chat
  q210_svanrige_cool_bro
  q210_teleport_from_skjall
  q210_tried_open_rift_door
  q210_when_fring_triss_chat
  yennefer_dd_start
  yennefer_dd_stop

== quests/part_3/q310_pregeels_new.w2phase:
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  ciri_dd_start
  ciri_dd_stop
  ciri_eqp_mount
  ciri_eqp_unmount
  dijkstra_dd_start
  dijkstra_dd_stop
  hood_off
  hood_on
  import_council_exists
  import_geralt_has_tattoo
  import_sheala_alive
  margarita_dd_start
  margarita_dd_stop
  philippa_dd_start
  philippa_dd_stop
  q109_keira_to_radovid
  q301_geralt_catches_escapist_scene
  q302_whoreson_dead
  q309_completed
  q309_triss_stayed
  q310_axxiied_horses
  q310_beer
  q310_button_pressed
  q310_cell_unlocked
  q310_charmed_guards
  q310_chase_active
  q310_ciri_done
  q310_ciri_faced_lodge
  q310_ciri_for_lodge
  q310_ciri_gildorf
  q310_ciri_in_camp
  q310_ciri_in_dandelions
  q310_ciri_in_favella
  q310_ciri_intro_over
  q310_ciri_is_available
  q310_ciri_near_sturgeon
  q310_ciri_to_sturgeon
  q310_ciri_wait_for_lodge
  q310_ciri_ws_bits
  q310_ciri_ws_hq
  q310_ciri_ws_hq_inside
  q310_completed
  q310_dijkstra_philippa_talked
  q310_dijkstra_spared
  q310_dijkstras_other_leg
  q310_divination_done
  q310_divination_for_music
  q310_door_1_open
  q310_door_2_open
  q310_door_3_open
  q310_door_open
  q310_doors_unlocked
  q310_drunk_guard_alert
  q310_dwarf_pointing
  q310_elf_pointing
  q310_explode_wall
  q310_fdb_ciri_after_q311
  q310_fdb_escapist_on_ladder
  q310_fdb_geralt_sleeps
  q310_fdb_horse_guard_hostile
  q310_fdb_stable_unlocked
  q310_fireball
  q310_fireball_dijkstra
  q310_geralt_helped_ciri_talk
  q310_geralt_triss_door
  q310_get_body
  q310_get_keira
  q310_golem_summon
  q310_got_philippa
  q310_got_philippa_for_music
  q310_has_wine
  q310_horses_added
  q310_horses_stolen
  q310_intro_sequence
  q310_keira_done
  q310_keira_stick
  q310_killed_sheala
  q310_know_about_philippa
  q310_lodge
  q310_lodge_start
  q310_lodge_talk_done
  q310_margaritta_rescued
  q310_met_dudu_as_whoreson
  q310_met_living_whoreson
  q310_negative_lines
  q310_outside_prison
  q310_philippa_rescued
  q310_preparation_tracking_active
  q310_riot_guards
  q310_sewer_door_open
  q310_started
  q310_sturgeon_dilemma
  q310_to_jugglers_played
  q310_to_sturgeon_played
  q310_tried_door
  q310_triss_kiss
  q310_triss_kiss_done
  q310_triss_yennefer_payback
  q310_troll_charmed
  q310_visiting_whoreson
  q310_yen_about_rita
  q310_yen_initial
  q310_yen_item_given
  q310_yen_novigrad
  q310_zoltan_about_avallach
  q310_zoltan_done
  q311_ciri_after_q311
  q311_completed
  q311_fdb_end_dialog_start
  q311_started
  q601_geralt_has_demon_mark
  sq202_yen_girlfriend
  sq303_completed
  sq315_fdb_quest_complete
  triss_dd_start
  triss_dd_stop
  triss_follow_stop
  whoreson_eqp_unmount
  yennefer_dd_start
  yennefer_dd_stop
  zoltan_dd_start
  zoltan_dd_stop

== quests/part_3/q311_geels.w2phase:
  avallach_dd_stop
  q301_godling_sara_peacefully
  q310_ciri_gildorf
  q310_completed
  q310_zoltan_about_avallach
  q311_change_time
  q311_ciri_after_q311
  q311_completed
  q311_fdb_end_dialog_start
  q311_music_aft_cs1
  q311_started
  q311_talked_to_dreamer
  q311_to_house_now

== quests/part_3/q501_eredin.w2phase:
  avallach_dd_stop
  eredinFightPhase2
  eredinFightPhase3
  eredinTeleportedBackToShip
  hjalmar_dd_stop
  q203_cerys_saved
  q206_completed
  q501_can_local_def
  q501_crach_dies
  q501_eredin_died
  q501_eredin_starts
  q501_first_aval_talk
  q501_naglfar_arrived
  q501_start_romance_mus
  udalryk_dd_stop

== quests/part_3/q502_avallach.w2phase:
  avallach_dd_stop
  hit_squad_follow_stop
  q110_calmed_down_ciri
  q110_refused_reward
  q110_visited_emhyr
  q210_gave_lara_necklace
  q210_skjall_done
  q310_ciri_faced_lodge
  q502_ciri_appears_music
  q502_ciri_dead
  q502_ciri_strong
  q502_ciri_survives
  q502_ciri_weak
  q502_conjunction_effects_start
  q502_fdb_barriere_weakening
  q502_fdb_ciri_entered_tower
  q502_fdb_hide_frost_fx
  q502_fdb_kill_player_enable
  q502_fdb_open_tower_door
  q502_fdb_patrol_1_start
  q502_fdb_started
  q502_fdb_stop_barriere_weak
  q502_fdb_yen_notoced_horse
  q502_hide_barrier
  q502_show_barrier
  q502_yen_follow_completed
  q502_yen_follow_start
  q502_yen_follow_stop
  q502_yen_horse_follow_start
  q502_yen_horse_follow_stop
  triss_dd_start
  yennefer_dd_start
  yennefer_dd_stop

== quests/part_3/quest_files/q110_postbattle/phases/q110_departure.w2phase:
  q110_completed

== quests/part_3/quest_files/q110_postbattle/phases/q110_kaer_morhen.w2phase:
  PLAYER_dress
  PLAYER_undress
  ciri_eqp_mount
  ciri_eqp_unmount
  ciri_snowfight_teleport
  force_stance_normal
  q109_keira_to_km
  q110_calmed_down_ciri
  q110_cinematic_next_morning
  q110_ciri_avallach_on_powers
  q110_ciri_hit_by_snowball
  q110_didnt_visit_emhyr
  q110_disable_vizima_workers
  q110_game_over
  q110_geralt_hit_by_snowball
  q110_geralt_won
  q110_snowball_music_start
  q403_lambert_dead

== quests/part_3/quest_files/q110_postbattle/phases/q110_vizima.w2phase:
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  ciri_eqp_mount
  ciri_eqp_unmount
  q110_accepted_reward
  q110_refused_reward
  q110_visited_emhyr

== quests/part_3/quest_files/q110_postbattle/scenes/q110_03_02_at_kaer_morhen_horses.w2scene:
  q110_to_emperor

== quests/part_3/quest_files/q110_postbattle/scenes/q110_04_04_geralt_ciri_leave.w2scene:
  q110_geralt_accepted_pay

== quests/part_3/quest_files/q111_imlerith/phases/q111_witch_combat.w2phase:
  applied_patch1
  q111_3_witches_intro
  q111_3_witches_killed
  q111_hypno_fail
  q111_obj_ex_added
  witches_hypnotized
  witches_phase_finished
  witches_phase_reset

== quests/part_3/quest_files/q111_imlerith/scenes/q111_0_shore_dlg.w2scene:
  q107_baron_hanged_himself
  q107_complete

== quests/part_3/quest_files/q111_imlerith/scenes/q111_1a_wiseman_greet.w2scene:
  q111_old_man_met

== quests/part_3/quest_files/q111_imlerith/scenes/q111_1b_fire_scene_1.w2scene:
  q111_scene_1_a_played
  q111_scene_1_b_played

== quests/part_3/quest_files/q111_imlerith/scenes/q111_1b_fire_scene_2.w2scene:
  q111_scene_2_a_played
  q111_scene_2_b_played

== quests/part_3/quest_files/q111_imlerith/scenes/q111_1b_fire_scene_3.w2scene:
  q111_scene_3_a_played
  q111_scene_3_b_played

== quests/part_3/quest_files/q111_imlerith/scenes/q111_2a_old_hag_inter.w2scene:
  q111_old_hag_met

== quests/part_3/quest_files/q111_imlerith/scenes/q111_2b_godling_johny_flashback.w2scene:
  q301_godling_sara_peacefully

== quests/part_3/quest_files/q111_imlerith/scenes/q111_5_b_witches_cashet_dlg.w2scene:
  release_jp

== quests/part_3/quest_files/q210_precanaris/phases/q210_depart_novigrad.w2phase:
  avallach_dd_stop
  ciri_eqp_unmount
  q210_quest_start
  q310_completed
  q310_triss_yennefer_payback
  triss_dd_stop

== quests/part_3/quest_files/q210_precanaris/phases/q210_emhyr.w2phase:
  fringilla_dd_start
  q210_active_chat_boat
  q210_can_goto_emhyr
  q210_ciri_on_skjall
  q210_disable_comm_molo
  q210_emhyr_done
  q210_fdb_chat_1_fleet
  q210_fdb_chat_2_fleet
  q210_fdb_chat_3_fleet
  q210_fdb_chat_4_fleet
  q210_fdb_geralt_spotted_night
  q210_fdb_longer_reaction
  q210_lab_done
  q210_ruins_and_lab_start
  q210_ruins_done
  q210_when_fring_triss_chat

== quests/part_3/quest_files/q210_precanaris/phases/q210_morszczynka_meet.w2phase:
  q210_going_with_ciri_to_morszczynka
  q210_morszczynka_killed

== quests/part_3/quest_files/q210_precanaris/phases/q210_spike_room.w2phase:
  q210_used_spikes_switch

== quests/part_3/quest_files/q210_precanaris/phases/q210_vault_monsters.w2phase:
  q210_ava_golem_alive
  q210_going_with_ciri_to_morszczynka
  q210_golem_inactive
  q210_golem_inactive2

== quests/part_3/quest_files/q210_precanaris/scenes/q210_00_meeting_morszczynka_alone.w2scene:
  q210_met_morszczynka

== quests/part_3/quest_files/q210_precanaris/scenes/q210_02_go_to_crach.w2scene:
  q206_svanrige_king
  q210_stone_info
  q210_vigo_info

== quests/part_3/quest_files/q210_precanaris/scenes/q210_02a_crach_in_port.w2scene:
  q206_cerys_queen
  q208_not_attended

== quests/part_3/quest_files/q210_precanaris/scenes/q210_03e_mousesack_aft_lugos.w2scene:
  q206_cerys_queen
  q206_hjalmar_king

== quests/part_3/quest_files/q210_precanaris/scenes/q210_06b_visit_crach.w2scene:
  q210_cerys_hjalmar_dead

== quests/part_3/quest_files/q210_precanaris/scenes/q210_07b_eyvind_sings.w2scene:
  q210_remind_eyvind_bonfire

== quests/part_3/quest_files/q210_precanaris/scenes/q210_09_emhyr_boat.w2scene:
  q110_to_emperor

== quests/part_3/quest_files/q210_precanaris/scenes/q210_11d_are_you_pearldivers.w2scene:
  q210_said_about_monsters

== quests/part_3/quest_files/q210_precanaris/scenes/q210_13a_examine_distilery.w2scene:
  q311_avallach_lost

== quests/part_3/quest_files/q210_precanaris/scenes/q210_17f_examine_fresks.w2scene:
  q309_triss_lover

== quests/part_3/quest_files/q210_precanaris/scenes/q210_18a_ava_ab_lab.w2scene:
  q210_in_ava_we_trust
  q210_tell_ava_ab_lara
  q210_tell_ava_ab_lover

== quests/part_3/quest_files/q210_precanaris/scenes_pickups/q210_10_gerlt_fring_teleported.w2scene:
  q210_when_fring_triss_chat

== quests/part_3/quest_files/q310_pregeels/phases/q310_get_keira.w2phase:
  q310_attacking_keira_guards
  q310_keira_done
  q310_philippa_rescued
  triss_dd_stop

== quests/part_3/quest_files/q310_pregeels/phases/q310_grab_ciri.w2phase:
  q310_ciri_gildorf

== quests/part_3/quest_files/q310_pregeels/scenes/q310_02_sorceress_talk.w2scene:
  q109_keira_defeated
  q109_keira_to_km
  q109_keira_to_radovid
  q309_completed
  q309_triss_stayed
  q310_get_body
  q310_margaritta_rescued
  q310_meet_yen
  sq101_had_dinner_with_keira
  sq302_crystal_read

== quests/part_3/quest_files/q310_pregeels/scenes/q310_05_keira_retrieve_body.w2scene:
  q309_triss_stayed
  q310_philippa_rescued

== quests/part_3/quest_files/q310_pregeels/scenes/q310_06_triss_divination_talk.w2scene:
  q309_triss_stayed
  q309_witcher_in_kovir
  q310_opinion
  q310_teleport_to_fountain
  sq202_yen_girlfriend

== quests/part_3/quest_files/q310_pregeels/scenes/q310_13_philippa_beaten.w2scene:
  sq302_dijkstra_philippa_lovers
  sq315_fdb_quest_complete

== quests/part_3/quest_files/q310_pregeels/scenes/q310_14_triss_pickup.w2scene:
  q310_get_body
  q310_keira_done

== quests/part_3/quest_files/q310_pregeels/scenes/q310_15a_ciri_beginning.w2scene:
  q302_whoreson_dead
  q310_ciri_at_dandelions
  q310_ciri_in_city
  q310_ciri_motivation

== quests/part_3/quest_files/q310_pregeels/scenes/q310_16_ciri_gp.w2scene:
  q302_whoreson_dead

== quests/part_3/quest_files/q310_pregeels/scenes/q310_25_ciri_reunion_start.w2scene:
  q309_completed

== quests/part_3/quest_files/q310_pregeels/scenes/q310_27_ciri_an_end.w2scene:
  q110_refused_reward
  q110_visited_emhyr

== quests/part_3/quest_files/q310_pregeels/scenes/q310_28_yen_meetup.w2scene:
  q310_meet_triss
  q310_philippa_rescued
  q310_place
  q310_yen_praises

== quests/part_3/quest_files/q310_pregeels/scenes/q310_32_escapist_information.w2scene:
  q310_about_escape
  q310_about_guards
  q310_sewers

== quests/part_3/quest_files/q310_pregeels/scenes/q310_36_zoltan_beer.w2scene:
  q309_completed

== quests/part_3/quest_files/q310_pregeels/scenes/q310_38_at_the_well.w2scene:
  q310_asked_zoltan
  q310_beer
  q310_graden

== quests/part_3/quest_files/q310_pregeels/scenes/q310_41_zoltan_pickup.w2scene:
  q310_drunk_guard_alert

== quests/part_3/quest_files/q310_pregeels/scenes/q310_44_lodge_talk.w2scene:
  import_sheala_alive
  q109_keira_defeated
  q109_keira_to_radovid
  q311_completed

== quests/part_3/quest_files/q310_pregeels/scenes/q310_44_wait_for_lodge.w2scene:
  import_sheala_alive
  q109_keira_defeated
  q109_keira_to_radovid
  q309_triss_stayed
  q311_completed
  sq202_yen_girlfriend
  sq303_renovation_completed

== quests/part_3/quest_files/q310_pregeels/scenes/q310_47_dandelion_frees_geralt.w2scene:
  q311_completed

== quests/part_3/quest_files/q311_geels/phases/q311_after_q301_dreamer_godling_house.w2phase:
  q301_completed
  q301_godling_sara_peacefully
  q301_notice_postq301_taken

== quests/part_3/quest_files/q311_geels/q311_spiral_phase_proper.w2phase:
  q310_preparation_tracking_active
  q311_about_desert_fin
  q311_camp_hangar_lit
  q311_first_portal
  q311_moar_monsters
  q311_onleiner_enabled
  q311_open_desert_p

== quests/part_3/quest_files/q311_geels/scenes/q311_01_avallach_plan.w2scene:
  q311_geels_deal
  q311_really

== quests/part_3/quest_files/q311_geels/scenes/q311_02b_chat_before_house.w2scene:
  q301_godling_sara_peacefully

== quests/part_3/quest_files/q311_geels/scenes/q311_16_good_news_everybody.w2scene:
  q310_completed

== quests/part_3/quest_files/q501_eredin/phases/q501_caranthir_fight.w2phase:
  applied_patch1_3
  caranthir_phase1_end
  caranthir_phase2_end
  caranthir_phase2_gogo
  q501_canaris_died
  q501_canaris_fighting_geralt
  q501_my_loc_def

== quests/part_3/quest_files/q501_eredin/scenes/q501_01a_talk_at_beach.w2scene:
  q309_triss_stayed
  q501_avallach_forbids
  sq202_yen_girlfriend

== quests/part_3/quest_files/q502_avallach/scenes/q502_06c_yen_about_teleport.w2scene:
  q309_triss_lover
  q502_geralt_understands

== quests/part_3/quest_files/q502_avallach/scenes/q502_07_barrier.w2scene:
  q502_cold_goodbye

== quests/part_3/quest_files/q502_avallach/scenes/q502_08a_ciri_into_tower.w2scene:
  cs502_ciri_and_lodge_play
  cs502_demolition_play
  cs502_forbid_grave_play
  cs502_geralt_and_lodge_play
  cs502_lecture_play
  cs502_necklace_play
  cs502_no_money_play
  cs502_snowball_fight_play
  cs502_took_money_play
  cs502_visit_grave_play
  q110_calmed_down_ciri
  q110_refused_reward
  q110_visited_emhyr
  q210_gave_lara_necklace
  q210_lara_necklace_given
  q210_skjall_done
  q210_visit_skjall_grave
  q310_ciri_faced_lodge
  q502_bad_choice
  q502_ciri_change_mood
  q502_ciri_survives
  q502_good_choice

== quests/persistent_content.w2phase:
  PLAYER_dress
  PLAYER_eqp_mount
  PLAYER_eqp_unmount
  PLAYER_undress
  avallach_eqp_mount
  avallach_eqp_unmount
  barber_scene_off
  barber_scene_on
  baron_eqp_mount
  baron_eqp_unmount
  becca_eqp_mount
  becca_eqp_unmount
  canaris_eqp_mount
  canaris_eqp_unmount
  ciri_eqp_mount
  ciri_eqp_unmount
  ciri_wears_wolf_medallion
  crach_eqp_mount
  crach_eqp_unmount
  eskel_eqp_mount
  eskel_eqp_unmount
  ff_troll_beaten
  hjalmar_eqp_mount
  hjalmar_eqp_unmount
  hjort_eqp_mount
  hjort_eqp_unmount
  import_geralt_drank_mysterious_potion
  lambert_eqp_mount
  lambert_eqp_unmount
  letho_eqp_mount
  letho_eqp_unmount
  menge_eqp_mount
  menge_eqp_unmount
  mh102_bridge_down
  mh102_bridge_ready
  mh102_play_bridge_anim
  mousesack_eqp_mount
  mousesack_eqp_unmount
  mq1037_bandit_scene_failsafe
  mq1037_lower_bridge
  mq1037_lower_bridge_start
  q002_ciri_poster_seen
  q002_talked_to_yennefer
  q104_completed
  q203_cerys_saved
  q206_lady_bran_convicted
  q210_gave_lara_necklace
  q301_geralt_got_burdock
  q301_go_back_to_kob
  q301_talked_about_rose
  q302_whoreson_dead
  q302_whoreson_spared
  q303_completed
  q303_fire_spectators
  q303_fire_starts
  q309_completed
  q309_necklace_off
  q309_sex_with_triss
  q310_started
  q310_triss_yennefer_payback
  q401_gave_triss_earring
  q401_had_sex_with_yen
  q403_completed
  q403_horse_fixed
  q403_new_gear
  roche_eqp_mount
  roche_eqp_unmount
  sq102_letho_lost_medallion
  sq301_necklace_off
  sq301_necklace_on
  tamara_eqp_mount
  tamara_eqp_unmount
  triss_earrings_forbidden
  udalryk_eqp_mount
  udalryk_eqp_unmount
  ves_eqp_mount
  ves_eqp_unmount
  vesemir_eqp_mount
  vesemir_eqp_unmount
  whoreson_eqp_mount
  whoreson_eqp_unmount
  zoltan_eqp_mount
  zoltan_eqp_unmount

== quests/prologue/q001_beginning.w2phase:
  001_equip_swords
  NewGamePlus
  aimthrowed_q001_dummy_for_geralt
  ciri_dd_stop
  debug_tut_fast
  eskel_dd_start
  eskel_dd_stop
  lambert_dd_stop
  mq0001_dune_talked_to_dog
  mq0001_dune_talks_to_dog
  prologue_griffon_merchant_activate
  q001_after_door_cutscene
  q001_after_tavern_intro_cs
  q001_after_yenn_intro
  q001_ciri_intro_ended
  q001_dream_ciri_intro
  q001_ghouls_dead
  q001_ghouls_start_running
  q001_nightmare_ended
  q001_opened_bedroom_door_left
  q001_opened_bedroom_door_right
  q001_seen_griffin_first_time
  q001_teleport_horses_after_griff
  q001_vesemir_char_entry
  q001_vesemir_nightmare_talk
  q001_yenn_nightmare_talked
  q001_yennefer_info_given
  tut_aard_desc_done
  tut_aard_start
  tut_aard_success
  tut_aim_in_trigger
  tut_axii_desc_done
  tut_axii_start
  tut_axii_success
  tut_before_ghoul_fight
  tut_fight_start
  tut_griffin_presented
  tut_hardlocked
  tut_heavy_attack_vesemir
  tut_hit_dummy
  tut_igni_desc_done
  tut_igni_start
  tut_igni_success
  tut_killed_ghouls
  tut_light_attack_vesemir
  tut_minimap_spec_icons
  tut_petard_start
  tut_quen_desc_done
  tut_skipped_exploration
  tut_sleeping_ves_end
  tut_start_vesemir_dialog
  tut_started_fighting_lesson
  tut_woke_up
  tut_yrden_desc_done
  tut_yrden_start
  tut_yrden_success
  tutorial_counters_cnt
  tutorial_dodges_cnt
  tutorial_messages_enabled
  tutorial_parries_cnt
  tutorial_quen_cast
  tutorial_rolls_cnt
  vesemir_dd_start
  vesemir_dd_stop
  vesemir_eqp_mount
  vesemir_eqp_unmount
  yennefer_dd_stop

== quests/prologue/q002_emhyr.w2phase:
  GriffinDive
  LR_shaved
  NewGamePlus
  q001_fistfight_ended
  q002_chatting_nilfgaardians_on
  q002_corpse examined
  q002_dead_dogs_dialogue_started
  q002_found_nest_before_quest
  q002_geralt_boor
  q002_going_with_hunter
  q002_griffin_intro_start_music
  q002_griffin_sheep_show
  q002_griffin_vesemir_talked
  q002_herb_found
  q002_hunt_chase_hour
  q002_hunt_chase_text
  q002_hunter_leading_no_longer_fails
  q002_hunter_task_no_longer_fails
  q002_inn_bandits_dead
  q002_inn_brawl_started
  q002_killed_griffin
  q002_lashes_count
  q002_last_scene_nilf_music
  q002_last_scene_yen_music
  q002_left_village
  q002_met_emhyr
  q002_met_voorhis
  q002_seen_griffin_nest
  q002_spoke_to_nilf_commander
  q002_started_fast_travel_to_nml
  q002_started_following_nilf_trail
  q002_started_the_trap
  q002_talked_to_someone
  q002_talked_to_the_witch
  q002_talked_to_vesemir_about_trap
  q002_talked_to_yennefer
  q002_teleport_geralt_to_cs_p3
  q002_tower_for_shaving
  q002_vesemir_griffin_dialogue_started
  q002_village_ending_sequence_started
  q002_vizima_text_show
  q002_wh_chase_started
  q002_witch_init_scene_played
  q002_yenn_talk_about_ciri_ended
  q002_yenn_talk_about_ciri_started
  shaved
  shaved_right
  tut_fm_sound_clues
  tut_forced_preparation
  tut_ft_cutscene
  tut_griffon_combat_start
  tut_looking_for_myslav
  tut_q002_myslav_fm
  tut_show_objective_switching
  tutorial_focus_seen
  vesemir_dd_start
  vesemir_dd_stop
  yennefer_dd_start
  yennefer_dd_stop

== quests/prologue/quest_files/after_dream.w2phase:
  mq0001_bastiens_shield_found
  mq0001_dune_approaching_wait_spot
  mq0004_accepted_quest
  mq0004_breakable_door_destroyed
  tut_area_mappins_mq0001
  tut_before_ghoul_fight
  tut_bestiary_q103
  tut_call_horse
  tut_cat_potion
  tut_clue_interacted
  tut_crossbow_shot
  tut_dialog_started
  tut_disable_shop_tut
  tut_enter_meditation
  tut_fist_fight_started
  tut_fm_destr_prepared
  tut_focus_mq0001_dog
  tut_follow_npc_mq0001
  tut_forced_preparation
  tut_griffin_presented
  tut_griffon_combat_start
  tut_horse_stopping
  tut_killed_ghouls
  tut_minimap_spec_icons
  tut_mq0001_focus
  tut_q002_myslav_fm
  tut_return_to_vesemir
  tut_short_todo_switch
  tut_show_objective_switching
  tut_switched_objective
  tutorial_interaction_container
  tutorial_interaction_craftsman
  tutorial_interaction_examine
  tutorial_interaction_talk

== quests/prologue/quest_files/anywhere.w2phase:
  q002_corpse examined
  q002_spoke_to_nilf_commander
  q403_ciri_meteor_used
  q403_meteor_tutorial
  tut_ciri_blinking
  tut_ciri_charging
  tut_ciri_introduction
  tut_ciri_stamina
  tut_ciri_taunted
  tut_fm_sound_clues
  tut_focus_from_quests
  tut_ft_cutscene
  tut_got_char_dev_handler
  tut_guard_warning
  tut_in_dark_place
  tut_item_damaged
  tut_near_noticeboard
  tut_noticeboard_taken
  tut_received_schematic
  tut_stamina_sign
  tut_stash_fresh_playthrough
  tut_ui_prep_oils
  tut_used_oil_in_combat
  tut_used_potion
  tutorial_boat_damaged
  tutorial_interaction_boat
  tutorial_interaction_fast_travel
  tutorial_interaction_repair_armor
  tutorial_interaction_repair_sword
  tutorial_interaction_stash

== quests/prologue/quest_files/anywhere_after_dream.w2phase:
  DontShowRecipePinTut
  consumed_food_cnt
  q403_rift_tutorial_bomb
  q403_rift_tutorial_sign
  tut_alch_refill
  tut_arm_upg_start
  tut_boat_mounts
  tut_fm_destr_prepared
  tut_high_threat_monster
  tut_in_settlement
  tut_killed_ghouls
  tut_nest_blown
  tut_proper_sword_silver
  tut_proper_sword_steel
  tut_sheathe_silver_sword
  tut_show_silver_sword
  tut_stealing
  tut_uncovered_POI
  tut_wrong_sword_silver
  tut_wrong_sword_steel
  tutorial_container_close
  tutorial_container_open
  tutorial_interaction_campfire
  tutorial_interaction_container
  tutorial_interaction_mon_nest
  tutorial_messages_enabled
  yennefer_dd_start

== quests/prologue/quest_files/kaer_morhen.w2phase:
  NewGamePlus
  NewGamePlusForceTutorialsOn
  q001_opened_bedroom_door_left
  q001_opened_bedroom_door_right
  q001_unlocked_door
  tut_aard_start
  tut_aard_success
  tut_axii_start
  tut_axii_success
  tut_fight_slomo_ON
  tut_fight_start
  tut_fight_use_slomo
  tut_hardlocked
  tut_heavy_attack_vesemir
  tut_hit_dummy
  tut_igni_start
  tut_igni_success
  tut_light_attack_vesemir
  tut_petard_start
  tut_skipped_exploration
  tut_start_vesemir_dialog
  tut_yrden_start
  tut_yrden_success
  tutorial_camera_moved
  tutorial_counters_cnt
  tutorial_dodges_cnt
  tutorial_falling_damage
  tutorial_interaction_examine
  tutorial_parries_cnt
  tutorial_player_moved
  tutorial_quen_cast
  tutorial_rolls_cnt

== quests/prologue/quest_files/living_world/lw_prologue_bandits.w2phase:
  lw_fdb_prologue_bandits_cleared
  lw_prologue_bandit_camp_leader_killed

== quests/prologue/quest_files/living_world/lw_prologue_cementary.w2phase:
  lw_fdb_prologue_cementary_cleared

== quests/prologue/quest_files/living_world/lw_prologue_cemetary_wraith/lw_prologue_nightwraith.w2phase:
  left_prologue
  lw_fdb_prologue_cementary_cleared

== quests/prologue/quest_files/living_world/lw_prologue_lumbermill.w2phase:
  lw_lumbermill_ghouls_dead
  woodcutter_mill_liberated

== quests/prologue/quest_files/living_world/lw_prologue_noonwraith_settlement/lw_prologue_noonwraith_settlement.w2phase:
  mq0003_noonwraith_banished

== quests/prologue/quest_files/living_world/lw_prologue_placeofpower_ambush.w2phase:
  lw_prologue_place_of_power_fields_used

== quests/prologue/quest_files/living_world/lw_prologue_windmill.w2phase:
  lw_prologue_windmill_working
  lw_rope_burnt

== quests/prologue/quest_files/q001_beggining/phases/q001_thugs_attack_geralt.w2phase:
  prologue_griffon_merchant_activate
  q001_ff_getting_up_after_failure
  q001_fistfight_ended
  q001_fistfight_success
  q001_lost_fistfight_on_horse
  q001_thug_axieed
  tut_fist_fight_finished
  tut_fist_fight_started

== quests/prologue/quest_files/q001_beggining/scenes/q001_1_eskel_inside_km.w2scene:
  q001_talked_to_eskel
  q401_ekel_story_known
  q401_eskel_not_now

== quests/prologue/quest_files/q001_beggining/scenes/q001_2_ciri_intro.w2scene:
  NewGamePlus

== quests/prologue/quest_files/q001_beggining/scenes/q001_3_b_sparring_start.w2scene:
  NewGamePlus

== quests/prologue/quest_files/q001_beggining/scenes/q001_6_meet_griffin.w2scene:
  q001_didnt_want_money

== quests/prologue/quest_files/q001_beggining/scenes/q001_7a_tavern_intro.w2scene:
  q001_asked_about_griffin
  q001_didnt_want_money
  q001_inkeep_asked_first
  q002_inkeep_about_yen

== quests/prologue/quest_files/q001_beggining/scenes/q001_7b_peasants_about_yenn.w2scene:
  q001_first_met_rude_peasants

== quests/prologue/quest_files/q001_beggining/scenes/q001_7c_academic_about_yenn.w2scene:
  academic_about_yen
  q001_academic_bye
  q001_card_played
  q001_talked_about_stjepan
  q101_cards_explained

== quests/prologue/quest_files/q001_beggining/scenes/q001_7d_mephisto_about_yenn.w2scene:
  q001_fdb_mirror_hook

== quests/prologue/quest_files/q002_emhyr/phases/q002_finding_nest_before_quest.w2phase:
  q002_found_nest_before_quest
  q002_seen_griffin_nest
  q002_spoke_to_nilf_commander

== quests/prologue/quest_files/q002_emhyr/phases/q002_wounded_woman_followup.w2phase:
  q002_helped_herbalist
  q002_village_ending_sequence_started
  q002_wounded_woman_left_bed

== quests/prologue/quest_files/q002_emhyr/scenes/q002_01_nilfgaardians_about_griffin.w2scene:
  q002_griffon_1
  q002_griffon_2
  q002_nilfgaardian_oficer_met

== quests/prologue/quest_files/q002_emhyr/scenes/q002_02b_vesemir_about_griffin.w2scene:
  q002_corpse examined
  q002_discussed_gender
  q002_discussed_herb
  q002_herb_found
  q002_trap_can_start

== quests/prologue/quest_files/q002_emhyr/scenes/q002_02c__witch_about_herb.w2scene:
  q002_herbalist_context_dialogue_played
  q002_killed_griffin
  q002_suggested_helping
  q002_told_herbalist_griffin
  q002_wounded_woman_quest_start

== quests/prologue/quest_files/q002_emhyr/scenes/q002_03f_griffin_corpse_investigation.w2scene:
  q002_check_griffin

== quests/prologue/quest_files/q002_emhyr/scenes/q002_04a_start_the_trap.w2scene:
  q002_talked_at_trap

== quests/prologue/quest_files/q002_emhyr/scenes/q002_11_a_geralt_preperations.w2scene:
  import_iorweth_path
  simulate_import_ingame

== quests/prologue/quest_files/q002_emhyr/scenes/q002_12_aa_chamberlain_to_yenn.w2scene:
  q002_geralt_boor

== quests/prologue/quest_files/q002_emhyr/scenes/q002_12_ch_military.w2scene:
  q002_voorhis_talk

== quests/prologue/quest_files/q002_emhyr/scenes/q002_13_inteligence_officer.w2scene:
  import_henselt_alive
  q002_var_attre_met

== quests/prologue/quest_files/tutorial.w2phase:
  kill_base_tutorials
  q001_nightmare_ended
  q002_left_village
  tut_woke_up

== quests/prologue/quest_files/tutorial_new_ui.w2phase:
  BlockRedesignedUITutorials
  ep2_installed
  ep2_tracked_quest_hack
  new_game_started_in_1_20
  q001_nightmare_ended
  standalone_ep2
  tut_not_tracked_quest_updates

== quests/quest_npcs_default_dialogues.w2phase:
  avallach_dd_start
  avallach_dd_stop
  baron_dd_start
  baron_dd_stop
  baron_wife_dd_start
  baron_wife_dd_stop
  becca_dd_start
  becca_dd_stop
  ciri_dd_start
  ciri_dd_stop
  crach_dd_start
  crach_dd_stop
  dandelion_dd_start
  dandelion_dd_stop
  dijkstra_dd_start
  dijkstra_dd_stop
  donar_dd_start
  donar_dd_stop
  dudu_dd_start
  dudu_dd_stop
  emhyr_dd_start
  emhyr_dd_stop
  eskel_dd_start
  eskel_dd_stop
  fringilla_dd_start
  fringilla_dd_stop
  graden_dd_start
  graden_dd_stop
  guslar_dd_start
  guslar_dd_stop
  hattori_default_start
  hattori_default_stop
  hjalmar_dd_start
  hjalmar_dd_stop
  holger_dd_start
  holger_dd_stop
  import_council_exists
  irina_dd_start
  irina_dd_stop
  jorund_dd_start
  jorund_dd_stop
  keira_part1_dd_start
  keira_part1_dd_stop
  king_beggar_dd_start
  king_beggar_dd_stop
  lady_bran_dd_stop
  lady_bran_start
  lambert_dd_start
  lambert_dd_stop
  letho_dd_start
  letho_dd_stop
  lugos_the_mad_dd_start
  lugos_the_mad_dd_stop
  margaret_dd_start
  margaret_dd_stop
  margarita_dd_start
  margarita_dd_stop
  mousesack_dd_start
  mousesack_dd_stop
  mq0005_complete
  ojkm_gatekeeper_dd_start
  ojkm_gatekeeper_dd_stop
  philippa_dd_start
  philippa_dd_stop
  priscilla_dd_start
  priscilla_dd_stop
  prologue_smith_dd_start
  prologue_smith_dd_stop
  q001_card_from_academic_won
  q001_gwint_game_won
  q001_inn_patrons_questioned
  q001_nightmare_ended
  q001_yennefer_info_given
  q002_inn_bandits_dead
  q002_inn_brawl_started
  q002_left_village
  q002_talked_to_the_witch
  q002_talked_to_yennefer
  q002_var_attre_met
  q002_witch_dd_start
  q002_witch_dd_stop
  q104_completed
  q105_deactivate_soltis_dd
  q105_enable_soltis_default
  q105_soltis_problem_solved
  q106_complete
  q108_guslar_pissed
  radovid_dd_start
  radovid_dd_stop
  roche_dd_start
  roche_dd_stop
  sq102_letho_completed
  sq209_start_part_1
  sq209_unlocked
  sq304_sword_ready
  sq315_fdb_quest_complete
  talar_dd_start
  talar_dd_stop
  triss_dd_start
  triss_dd_stop
  udalryk_dd_start
  udalryk_dd_stop
  varese_dd_start
  varese_dd_stop
  ves_dd_start
  ves_dd_stop
  vesemir_dd_start
  vesemir_dd_stop
  vg_default_init
  von_gratz_dd_start
  von_gratz_dd_stop
  voorhis_dd_start
  voorhis_dd_stop
  yennefer_dd_start
  yennefer_dd_stop
  yolar_dd_start
  yolar_dd_stop
  zoltan_dd_start
  zoltan_dd_stop

== quests/secondary_npcs/default_dialogues/carduin_default.w2scene:
  carduin_met

== quests/secondary_npcs/default_dialogues/crossroads_barkeep_default.w2scene:
  q107_complete

== quests/secondary_npcs/default_dialogues/dijkstra_default.w2scene:
  about_hazard
  about_house
  about_ring
  dijkstra_dflt_filippa
  dijkstra_met
  q309_completed

== quests/secondary_npcs/default_dialogues/donar_an_hindar_default.w2scene:
  met_donar_hindar
  q205_ritual_finished
  sq201_chose_solution

== quests/secondary_npcs/default_dialogues/dudu_default.w2scene:
  dudu_default_nonmet
  q310_talked_with_dudu_whoreson

== quests/secondary_npcs/default_dialogues/eskel_default.w2scene:
  q401_eskel_got_spirit
  q401_geralt_promised_spirit

== quests/secondary_npcs/default_dialogues/fringilla_vigo_default.w2scene:
  sq306_completed

== quests/secondary_npcs/default_dialogues/hattori_default.w2scene:
  hattori_met
  quest_summary
  sq304_g_knows_about_h
  sq304_main_done
  sq304_sword_given
  sq304_sword_in_progress
  sq304_sword_ready

== quests/secondary_npcs/default_dialogues/irina_renarde_default.w2scene:
  q305_started

== quests/secondary_npcs/default_dialogues/jonas_mattsson_default.w2scene:
  q202_jonas_first_met

== quests/secondary_npcs/default_dialogues/jorund_default.w2scene:
  mh207_job_taken
  mh207_mentioned

== quests/secondary_npcs/default_dialogues/keira_metz_default.w2scene:
  q101_ciri_met_witch
  q104_completed
  q104_elf_name
  q104_help_with_lamp
  q104_keira_goes_to_mine
  q104_met_keira
  q106_know_about_dying_villagers
  q203_ciri_companion
  q403_keira_saved_lambert
  saw_rat_ghost

== quests/secondary_npcs/default_dialogues/lambert_default.w2scene:
  q401_completed
  q401_started
  q403_battle_ends
  q403_completed
  q403_teleported_to_km

== quests/secondary_npcs/default_dialogues/lugos_the_mad_default.w2scene:
  lugos_the_mad_met
  q206_complete
  q206_svanrige_king
  sq209_part_2_done

== quests/secondary_npcs/default_dialogues/margaret_default.w2scene:
  ciri_said
  margaret_met
  q103_margaret_about_toy

== quests/secondary_npcs/default_dialogues/margaritta_laux_antille_default.w2scene:
  import_council_exists
  margaritta_met

== quests/secondary_npcs/default_dialogues/master_alchemist_gremista_default.w2scene:
  cg200_gremista_gwint_unlocked

== quests/secondary_npcs/default_dialogues/nml_burrows_soltis_default.w2scene:
  nml_burrows_soltis_massacre_met
  nml_burrows_soltis_met
  q105_completed
  q105_contract
  q105_help_spirit
  q105_soltis_told_witches
  q107_burrows_massacre

== quests/secondary_npcs/default_dialogues/ojkm_gatekeeper_default.w2scene:
  sq302_crystal_for_radovid

== quests/secondary_npcs/default_dialogues/philippa_eilhart_default.w2scene:
  import_saskia_alive
  philippa_met

== quests/secondary_npcs/default_dialogues/priscilla_default.w2scene:
  q302_completed
  q302_whoreson_dead
  q303_completed
  q305_completed
  q305_started
  q308_priscila_healed

== quests/secondary_npcs/default_dialogues/prologue_smith_default.w2scene:
  mq0005_brought_arsonist
  mq0005_complete
  prologue_smith_met
  q002_left_village

== quests/secondary_npcs/default_dialogues/prologue_village_herbalist_default.w2scene:
  q002_swallow_swallowed
  q002_wounded_woman_left_bed

== quests/secondary_npcs/default_dialogues/udalryk_default.w2scene:
  q203_cerys_saved
  q206_cerys_queen
  q206_hjalmar_king
  q206_svanrige_king

== quests/secondary_npcs/default_dialogues/vimme_vivaldi_default.w2scene:
  vimme_vivladi_met
  vivaldi_loan_returned
  vivaldi_loan_taken

== quests/secondary_npcs/default_dialogues/von_gratz_default.w2scene:
  q308_all_explained
  q308_completed
  q308_coroner_accuses_vg
  q308_got_that_wrong
  q308_murderer_coroner
  q308_priscila_healed
  q308_seen_next_victim
  q601_shani_met

== quests/secondary_npcs/default_dialogues/zoltan_chivay_default.w2scene:
  q304_completed
  q401_completed
  q403_completed

== quests/secondary_npcs/voicesets/corine_tilly_vset.w2scene:
  dreamer_disable_voiceset

== quests/secondary_npcs/voicesets/godling_johnny_vset.w2scene:
  q105_johnny_voice_back

== quests/secondary_npcs/voicesets/lambert_vset.w2scene:
  no_time

== quests/secondary_npcs/voicesets/priscilla_vset.w2scene:
  q308_priscila_healed
  q308_psycho_start_666

== quests/sidequests/no_mans_land/quest_files/sq101_keira/scenes/sq101_03_keira_ench_horses.w2scene:
  sq101_change_clothes

== quests/sidequests/no_mans_land/quest_files/sq101_keira/scenes/sq101_04_keira_date.w2scene:
  sq101_initially_refused
  sq101_keira_race_first

== quests/sidequests/no_mans_land/quest_files/sq101_keira/scenes/sq101_06_sex_keira.w2scene:
  release_jp

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_chicken_test.w2phase:
  enable_chicken_test
  import_letho_alive
  sq102_layers_loaded
  sq102_letho_alive

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_disable_horse_riding.w2phase:
  sq102_disable_horse_riding

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_persistent_interactions.w2phase:
  sq102_barn_door_center_tried
  sq102_blocking_debris_destroyed
  sq102_dolores_completed
  sq102_dolores_gave_quest
  sq102_door_dolores_house_tried
  sq102_entered_farmstead
  sq102_humberts_corpse_found
  sq102_lockbox_contents_obtained
  sq102_lockbox_tried
  sq102_loose_plank_found
  sq102_weak_wall_found

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_refused_letho_help.w2phase:
  sq102_told_letho_not_helping

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_show_layers.w2phase:
  q002_met_emhyr

== quests/sidequests/no_mans_land/quest_files/sq102_letho/phases/sq102_wait_for_layers.w2phase:
  sq102_layers_loaded

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_00_gmpl_geralt_investigation.w2scene:
  sq102_barn_door_side_tried
  sq102_dolores_gave_quest

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_00_gmpl_geralt_letho.w2scene:
  sq102_go_find_ladder

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_01_02_dolores_on_farmstead.w2scene:
  sq102_entered_farmstead
  sq102_humberts_corpse_found
  sq102_letho_alive
  sq102_letho_met
  sq102_loose_plank_found
  sq102_wraiths_killed

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_01_06_dolores_on_brother.w2scene:
  sq102_humberts_corpse_found
  sq102_letho_met
  sq102_lockbox_contents_obtained
  sq102_wraiths_killed

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_01_07_dolores_back_on_farm.w2scene:
  sq102_dolores_visited_at_farm
  sq102_humberts_corpse_found
  sq102_lockbox_contents_obtained
  sq102_told_about_brother

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_02_05_geralt_meets_letho.w2scene:
  sq102_dolores_gave_quest
  sq102_traps_set_off

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_02b_doors_shut.w2scene:
  sq102_tripwire_clue_found

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_04_07_letho_revived.w2scene:
  sq102_let_headhunters_go

== quests/sidequests/no_mans_land/quest_files/sq102_letho/scenes/sq102_dolores_vset.w2scene:
  sq102_dolores_completed
  sq102_lockbox_contents_obtained

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_02_01_niellen_questions.w2scene:
  sq104_accept
  sq104_hanna_missing
  sq104_look_for_her
  sq104_niellen_met

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_04_margaret_intervenes.w2scene:
  sq104_lied

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_07_butcher.w2scene:
  sq104_butcher_met
  sq205_wife_asked

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_09_blacksmith.w2scene:
  sq104_bsmith_met
  sq104_protector_smith

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_15_epilog.w2scene:
  sq104_niellen_dead
  sq104_not_intervened

== quests/sidequests/no_mans_land/quest_files/sq104_werewolf/scenes/sq104_villager_gp_after.w2scene:
  sq104_niellen_dead
  sq104_not_intervened

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/phases/sq106_hammond.w2phase:
  mq2020_turn_pirates_hostile
  sq106_hammond_knows
  sq106_hammond_slayed
  sq106_local_game_dev_playin

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/scenes/sq106_00_dockmaster_guard_inter.w2scene:
  sq106_dockmaster_firstmet

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/scenes/sq106_00_geralt_focus_cmnts.w2scene:
  sq106_ekima_blood_seen
  sq106_ekima_hunt_started
  sq106_ekima_known
  sq106_ekima_knownabout

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/scenes/sq106_01_c_lambert_aft_fight.w2scene:
  chapter1_completed
  sq106_dockmaster_firstmet

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/scenes/sq106_04_lambert_after_vienne.w2scene:
  sq106_killed_hammond

== quests/sidequests/no_mans_land/quest_files/sq106_killbill/scenes/sq106_06_b_ask_about_hammond.w2scene:
  mq2020_pirates_aggro
  mq2020_turn_pirates_hostile

== quests/sidequests/no_mans_land/quest_files/sq108_master_blacksmith/phases/sq108_despawning_q103.w2phase:
  q103_baron_carries_botch
  q103_buried_botch
  q103_killed_botch
  sq108_completed
  sq108_fergus_met
  sq108_master_blacksmith_failed
  sq108_spawn_baronman

== quests/sidequests/no_mans_land/quest_files/sq108_master_blacksmith/phases/sq108_griffon_contract.w2phase:
  sq108_griffin_completed
  sq108_griffon_contract

== quests/sidequests/no_mans_land/quest_files/sq108_master_blacksmith/scenes/sq108_01_ask_about_master.w2scene:
  sq108_decide_to_trust
  sq108_heard_about_blacksmith_mappin

== quests/sidequests/no_mans_land/quest_files/sq108_master_blacksmith/scenes/sq108_10_armor_reward.w2scene:
  sq108_reward_armor_ready

== quests/sidequests/no_mans_land/sq101_keira.w2phase:
  PLAYER_eqp_unmount
  keira_part1_dd_start
  keira_part1_dd_stop
  q402_escort_completed
  sq101_change_time_stars
  sq101_completed
  sq101_date_with_keira_was_failed
  sq101_geralt_race_first
  sq101_had_dinner_with_keira
  sq101_keira_change_clothes
  sq101_keira_race_first
  sq101_keira_sex_clue01
  sq101_keira_sex_clue02
  sq101_keira_sex_clue03
  sq101_keira_sex_clue04
  sq101_looking_for_cart
  sq101_mount_keira
  sq101_no_sex_with_keira
  sq101_sex_with_keira
  sq101_start_date

== quests/sidequests/no_mans_land/sq102_letho.w2phase:
  actor_sq102_bandit_was_killed
  actor_sq102_farm_headhunter_was_killed
  actor_sq102_ludvik_was_killed
  actor_sq102_midcots_headhunter_was_killed
  actor_sq102_wraith_was_killed
  import_letho_alive
  q402_invited_letho_to_km
  sq102_accepted
  sq102_assassins_arrive_at_farm
  sq102_assassins_horses
  sq102_blacksmith_evicted
  sq102_camp_deserted
  sq102_completed
  sq102_corpses_frozen
  sq102_crossbow_trap_triggered
  sq102_didnt_help_letho
  sq102_dolores_completed
  sq102_dolores_gave_quest
  sq102_door_trap_triggered
  sq102_entered_farmstead
  sq102_explode_building
  sq102_gas_trap_triggered
  sq102_go_find_ladder
  sq102_helped_letho
  sq102_hide_community
  sq102_humberts_corpse_found
  sq102_killed_headhunters
  sq102_ladder_found
  sq102_let_headhunters_go
  sq102_letho_alive
  sq102_letho_completed
  sq102_letho_makes_noise
  sq102_letho_met
  sq102_lost_letho
  sq102_sound_source_found
  sq102_spike_trap_triggered
  sq102_suspend_1003
  sq102_told_letho_not_helping
  sq102_trap_disarmed
  sq102_traps_set_off
  sq102_tripwire_clue_found
  sq102_tripwire_disarmed
  sq102_viper_trap_triggered
  sq102_wolf_pit_found
  sq102_wraiths_killed

== quests/sidequests/no_mans_land/sq104_werewolf.w2phase:
  sq104_beast_identified
  sq104_fdb_done
  sq104_fdb_werewolf_played
  sq104_helped_margaret
  sq104_intervened
  sq104_investigating
  sq104_journal_read
  sq104_known
  sq104_lied
  sq104_margaret_interrupt
  sq104_niellen_dead
  sq104_not_intervened
  sq104_scream
  sq104_talk_no_more
  sq104_talked_bsmith
  sq104_talked_villagers
  sq104_wolves_scared
  sq1104_talked_villagers

== quests/sidequests/no_mans_land/sq106_killbill.w2phase:
  lambert_dd_start
  lambert_dd_stop
  q201_landed_on_skellige
  q401_gotten_uma
  sq106_ekima_known
  sq106_ekimma_contract_taken
  sq106_finished
  sq106_invest_narrowed
  sq106_killed_ekimma
  sq106_killed_vienne_fdb
  sq106_know_shack
  sq106_lambert_at_nowhere
  sq106_local_game_dev_playin
  sq106_met_lambert
  sq106_seen_homeless
  sq106_vien_fight_st
  sq106_vienne_ended
  sq106_vienne_started
  sq106_water_clu_act
  vesemir_dd_stop

== quests/sidequests/no_mans_land/sq108_master_blacksmith.w2phase:
  q102_completed
  q201_landed_on_skellige
  sq108_arrow_deflected
  sq108_completed
  sq108_decide_to_trust
  sq108_fasttravel
  sq108_fergus_met
  sq108_get_gland
  sq108_heard_about_blacksmith
  sq108_heard_about_blacksmith_mappin
  sq108_joana_met
  sq108_master_blacksmith_failed
  sq108_master_bsmith_helped
  sq108_spawn_baronman
  sq108_start_test

== quests/sidequests/novigrad/quest_files/sq301_triss/phases/sq301_dawn_estate.w2phase:
  dijkstra_dd_start
  dijkstra_dd_stop
  import_arjan_dead
  q301_game_master_talking
  sq301_after_romance_cs
  sq301_after_stables
  sq301_ball_started
  sq301_cards_won1
  sq301_cards_won2
  sq301_cards_won3
  sq301_completed
  sq301_complimented
  sq301_failed
  sq301_fireworks_started
  sq301_fist_fight
  sq301_gossip_start
  sq301_gossip_stop
  sq301_got_suit
  sq301_inquisition_defeated
  sq301_looking_for_albert
  sq301_met_luiza
  sq301_met_ungrt_mage
  sq301_met_voorhis_party
  sq301_necklace_on
  sq301_player_lost_fight
  sq301_scenes_stop
  sq301_start_fireworks
  sq301_suit_and_tie
  sq301_teleport
  sq301_to_the_maze
  sq301_triss_follows
  sq301_triss_in_stables
  sq301_triss_unfollows
  sq301_wear_1
  sq301_wear_2
  voorhis_dd_start
  voorhis_dd_stop

== quests/sidequests/novigrad/quest_files/sq301_triss/phases/sq301_events_after.w2phase:
  sq301_race_may_return
  voorhis_dd_start

== quests/sidequests/novigrad/quest_files/sq301_triss/phases/sq301_triss_landlords.w2phase:
  q301_triss_ab_corine
  q309_started

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_00a_triss_about_note.w2scene:
  q303_triss_tortured
  q308_left_dawn_estate
  sq301_talked_bout_mssg

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_01_triss_waits_here.w2scene:
  sq301_servant_found

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_02_servant_gives_inv.w2scene:
  q304_elihal_visited
  q308_patrycja_died

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_02a_triss_about_preparations.w2scene:
  q308_left_dawn_estate
  q308_sent_to_dawn_estate
  sq301_about_preps
  sq301_about_preps_sad
  sq301_complimented
  sq301_got_everything
  sq301_have_both_masks

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_03e3_after_bothering_man.w2scene:
  sq301_fist_fight

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_03e_man_bothering_triss.w2scene:
  sq301_fist_fight
  sq301_player_lost_fight

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_03j_card_game_master.w2scene:
  sq301_cards_won1
  sq301_cards_won2
  sq301_cards_won3
  sq301_met_game_master

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04_ingrid_vegelbud.w2scene:
  q308_ingrid_psycho

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04a_albert.w2scene:
  sq301_looking_for_albert

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04b_wrong_albert1.w2scene:
  sq301_looking_for_albert

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04c_wrong_albert2.w2scene:
  sq301_looking_for_albert

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04e_dijkstra_piggy.w2scene:
  sq301_met_dijkstra

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_04f_luiza.w2scene:
  import_arjan_dead

== quests/sidequests/novigrad/quest_files/sq301_triss/scenes/sq301_10_apology.w2scene:
  q302_post_mafia_completed
  sq301_kissed_triss

== quests/sidequests/novigrad/quest_files/sq302_philippa/scenes/sq302_04_geralt_oneliners.w2scene:
  q309_completed
  q309_triss_stayed
  q401_reached_kaer_morhen

== quests/sidequests/novigrad/quest_files/sq302_philippa/scenes/sq302_06_focus_investigation.w2scene:
  chapter1_completed
  q309_for_disabling_sq302
  q401_reached_kaer_morhen

== quests/sidequests/novigrad/quest_files/sq302_philippa/scenes/sq302_11a_yen_asks_for_crystal.w2scene:
  sq302_completed

== quests/sidequests/novigrad/quest_files/sq302_philippa/scenes/sq302_12_back_to_radovid.w2scene:
  sq302_dont_have_crystal
  sq302_sorceress_got_crystal
  sq302_witchhunters_took_crystal

== quests/sidequests/novigrad/quest_files/sq303_brothel/scenes/sq303_02_new_starting_dialog.w2scene:
  sq303_dand_met
  sq303_quest_taken

== quests/sidequests/novigrad/quest_files/sq303_brothel/scenes/sq303_07a_dandelion_wins_combat.w2scene:
  sq303_geralt_beaten_by_dandelion
  sq303_geralt_ran_away

== quests/sidequests/novigrad/quest_files/sq303_brothel/scenes/sq303_14_latrec.w2scene:
  sq303_creditors_met

== quests/sidequests/novigrad/quest_files/sq303_brothel/scenes/sq303_16_dandelion_celebrates.w2scene:
  sq303_boudoir
  sq303_fdb_poster_acquired
  sq303_girl_choose
  sq303_no_polly

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_02_hattori_about_quest.w2scene:
  q301_met_kob
  sq304_deal_intro_heard
  sq304_meeting_failed
  sq304_quest_taken
  sq304_workshop_intro

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_03_deal.w2scene:
  sq304_haggle2_ok

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_03_predeal.w2scene:
  sq304_met_in_docks_already

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_06_hattori_locked_inside.w2scene:
  sq304_hattori_panicked_met
  sq304_sukrus_heard

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_07_beer_merchant.w2scene:
  sq304_merchant_met

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_07_sukrus.w2scene:
  sq304_beer_calm_resolved
  sq304_beer_rough_resolved
  sq304_geralt_beat_sukrus
  sq304_sukrus_met
  sq304_sukrus_taken
  sq304_work_discussed

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_09_gp_wrhs_guard_and_merch.w2scene:
  sq304_beer_rough_resolved

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_09_hattori_about_warehouse.w2scene:
  sq304_intro_after_sukrus
  sq304_negot_success
  sq304_negot_success_gift
  sq304_offer_taken
  sq304_sword_heard

== quests/sidequests/novigrad/quest_files/sq304_armorsmith/scenes/sq304_09_wrhs_guard_out.w2scene:
  import_iorweth_path
  sq304_double_intro
  sq304_lied

== quests/sidequests/novigrad/quest_files/sq305_scoiatael/scenes/sq305_05_guard_captain_return.w2scene:
  sq305_vernossiel_killed

== quests/sidequests/novigrad/quest_files/sq306_maverick/phases/card_game_qualification.w2phase:
  GwentTournamentObjective1
  GwentTournamentObjective2
  GwentTournamentObjective3
  GwentTournamentObjective4
  GwentTournamentObjective4 <
  HasGwentTournamentDeck

== quests/sidequests/novigrad/quest_files/sq306_maverick/phases/sq306_chicken_test.w2phase:
  enable_chicken_test
  sq306_layers_loaded

== quests/sidequests/novigrad/quest_files/sq306_maverick/phases/sq306_wait_for_layers.w2phase:
  sq306_layers_loaded

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_01_02_register_with_scribe.w2scene:
  HasGwentTournamentDeck

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_03_03_playing_bernard.w2scene:
  sq306_gwint_games_shortcuts

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_03_04_sacha_on_private_talk.w2scene:
  sq306_defeated_bernard

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_04_02_sachas_private_talk.w2scene:
  sq306_defeated_bernard

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_04_04_tybalt_on_second_round.w2scene:
  sq306_defeated_bernard

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_04_05a_playing_sacha.w2scene:
  sq306_gwint_games_shortcuts

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_04_05a_playing_sacha_lost.w2scene:
  sq306_promised_sacha_help

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_05_02a_playing_finneas.w2scene:
  sq306_gwint_games_shortcuts

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_05_02a_playing_finneas_lost.w2scene:
  sq306_promised_sacha_help

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_05_04_playing_tybalt.w2scene:
  sq306_gwint_games_shortcuts

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_06_01_with_the_guards.w2scene:
  sq306_defeated_tybalt
  sq306_promised_sacha_help

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_07_03b_share_with_sacha.w2scene:
  sq306_defeated_sacha
  sq306_defeated_tybalt

== quests/sidequests/novigrad/quest_files/sq306_maverick/scenes/sq306_08_02_sex_with_sacha.w2scene:
  release_jp

== quests/sidequests/novigrad/quest_files/sq310_dangerous_game/scenes/sq310_01d_selma_final.w2scene:
  sq310_about_bottle

== quests/sidequests/novigrad/quest_files/sq310_dangerous_game/scenes/sq310_01e_selma_sumup.w2scene:
  q309_completed
  q309_triss_stayed
  sq310_helped_selma

== quests/sidequests/novigrad/quest_files/sq310_dangerous_game/scenes/sq310_06_sumup.w2scene:
  sq310_duke_killed

== quests/sidequests/novigrad/quest_files/sq310_dangerous_game/scenes/sq310_08i_zoltan_inj.w2scene:
  sq310_fdb_quest_not_taken
  sq310_get_ledger_book
  sq310_ravik_info
  sq310_selma_info

== quests/sidequests/novigrad/quest_files/sq310_dangerous_game/scenes/sq310_13b_dukes_demise.w2scene:
  sq310_duke_wounded

== quests/sidequests/novigrad/quest_files/sq312_ves/phases/sq312_camp.w2phase:
  fdb_disable_ves_default
  roche_dd_stop
  sq312_fact_started
  sq312_fdb_quest_accept

== quests/sidequests/novigrad/quest_files/sq312_ves/phases/sq312_kill.w2phase:
  roche_dd_stop
  sq312_bob_alive
  sq312_bob_dead
  sq312_fact_ves_alive
  sq312_fact_ves_no_weapon
  sq312_left_zone
  sq312_no_reward
  sq312_roche_angry
  sq312_ves_died
  sq315_fdb_quest_complete
  sq315_fdb_roche_in_passiflora
  sq315_fdb_roche_left

== quests/sidequests/novigrad/quest_files/sq312_ves/phases/sq312_quest.w2phase:
  q302_whoreson_found
  q402_escort_completed
  roche_dd_start
  sq312_fdb_quest_accept
  sq312_fdb_ves_end
  sq312_roche_angry
  sq312_ves_died

== quests/sidequests/novigrad/quest_files/sq315_talar/phases/sq315_introduction.w2phase:
  dijkstra_dd_stop
  roche_dd_stop
  sq315_fdb_passiflora_meeting
  sq315_fdb_quest_active
  sq315_fdb_roche_in_passiflora
  sq315_plan_revealed

== quests/sidequests/novigrad/quest_files/sq315_talar/phases/sq315_investigation.w2phase:
  dijkstra_dd_start
  mq3024_fdb_pontar_bridge_opened
  q402_know_about_battle
  roche_dd_start
  sq312_fact_started
  sq312_fdb_ves_end
  sq315_fdb_camp_unlocked
  sq315_fdb_lonely_troll_killed
  sq315_fdb_quest_complete
  sq315_fdb_roche_left
  sq315_fdb_talar_met
  sq315_fdb_troll_cave_hint
  sq315_fdb_troll_chat_objective
  sq315_fdb_trolls_found
  sq315_fdb_wagon_found

== quests/sidequests/novigrad/quest_files/sq315_talar/scenes/sq315_05a_loney_troll_dialog.w2scene:
  sq315_shoes
  sq315_troll_met

== quests/sidequests/novigrad/quest_files/sq315_talar/scenes/sq315_06_troll_and_talar.w2scene:
  sq315_lie_to_ogg

== quests/sidequests/novigrad/quest_files/sq315_talar/scenes/sq315_08_talar_escort.w2scene:
  sq315_fight_ogg

== quests/sidequests/novigrad/quest_files/sq315_talar/scenes/sq315_09_talar_final.w2scene:
  sq315_fight_ogg

== quests/sidequests/novigrad/sq301_triss.w2phase:
  q303_completed
  q303_triss_about_sq301
  q308_left_dawn_estate
  q308_sent_to_dawn_estate
  q402_escort_completed
  sq301_about_preps
  sq301_about_preps_sad
  sq301_add_mask_to_elihal
  sq301_ball_started
  sq301_complimented
  sq301_disable_comm_guards
  sq301_failed
  sq301_fully_dressed
  sq301_got_everything
  sq301_got_masks_before
  sq301_got_suit
  sq301_have_both_masks
  sq301_mask_in_shop_no_more
  sq301_necklace_off
  sq301_necklace_on
  sq301_proceed_to_market
  sq301_race_may_return
  sq301_servant_found
  sq301_started
  sq301_suit_and_tie
  sq301_triss_refused
  triss_dd_start
  triss_dd_stop

== quests/sidequests/novigrad/sq302_philippa.w2phase:
  chapter1_completed
  q309_for_disabling_sq302
  q309_started
  q401_completed
  q401_reached_kaer_morhen
  q402_escort_completed
  sq302_antiseptic_smelled
  sq302_completed
  sq302_crystal_for_radovid
  sq302_dijkstra_philippa_lovers
  sq302_dont_have_crystal
  sq302_fdb_teleport2
  sq302_feather_checked
  sq302_gen_taken
  sq302_philippa_in_megascope
  sq302_sorceress_got_crystal
  sq302_start
  sq302_visit_radovid
  sq302_witchhunter_about_philippa
  sq302_witchhunters_took_crystal
  triss_dd_start

== quests/sidequests/novigrad/sq303_brothel.w2phase:
  MeditationStarted
  dandelion_dd_start
  dandelion_dd_stop
  dandelion_poem
  dandelion_poem_heard
  import_geralt_has_tattoo
  q304_girls
  q402_escort_completed
  q601_geralt_has_demon_mark
  sq303_active
  sq303_boudoir
  sq303_completed
  sq303_dand_schola_gone
  sq303_fdb_cheap_brothel
  sq303_fdb_crew_appears
  sq303_fdb_geralt_hit
  sq303_fdb_horse_race
  sq303_fdb_latrec_chat_started
  sq303_fdb_latrecs_home_visited
  sq303_fdb_leaving_race
  sq303_fdb_music_starts
  sq303_fdb_polly_house
  sq303_fdb_polly_joins
  sq303_fdb_poster_acquired
  sq303_fdb_race_won
  sq303_fdb_start_dialog
  sq303_fdb_talked_to_latrec
  sq303_fights_over
  sq303_g_lost_to_crucian
  sq303_geralt_beaten_by_dandelion
  sq303_geralt_ran_away
  sq303_guards_disabled
  sq303_pollys_door_opened
  sq303_renovation_completed
  sq303_spawn_comms
  sq303_theatrical

== quests/sidequests/novigrad/sq304_master_blacksmith.w2phase:
  hattori_default_start
  hattori_default_stop
  q303_at_witch_hunters
  sq304_beer_aggro
  sq304_beer_barrels_destroyed
  sq304_beer_calm_resolved
  sq304_beer_calmdown
  sq304_beer_rough_resolved
  sq304_crate_examined
  sq304_dud_crate
  sq304_escape_wall_broken3
  sq304_fdb_bodyguard_reward_given
  sq304_fdb_sukrus_wait
  sq304_fight_interruped
  sq304_g_knows_about_h
  sq304_geralt_beat_sukrus
  sq304_guards_hired
  sq304_hattori_reopened
  sq304_main_done
  sq304_meeting_failed
  sq304_negot_success_gift
  sq304_negotiation_over
  sq304_offer_taken
  sq304_phase2_started
  sq304_quest_taken
  sq304_sukrus_in_place
  sq304_sword_given
  sq304_sword_in_progress
  sq304_turn_off_hooks
  sq304_warehouse_done

== quests/sidequests/novigrad/sq305_scoiatael.w2phase:
  sq305_active
  sq305_agree_to_help
  sq305_known
  sq305_letter_of_conduct
  sq305_mp_tracking
  sq305_vernossiel_betrayed
  sq305_vernossiel_killed

== quests/sidequests/novigrad/sq306_maverick.w2phase:
  HasGwentTournamentDeck
  actor_sq306_bernard_was_killed
  actor_sq306_bernards_man_was_killed
  cg_notice_sq306_maverick_discovered
  q301_burn_doppler
  sq306_candlelight_dinner
  sq306_completed
  sq306_defeated_bernard
  sq306_defeated_finneas
  sq306_defeated_sacha
  sq306_defeated_tybalt
  sq306_geralt_has_good_deck
  sq306_guards_entered
  sq306_had_sex_with_sacha
  sq306_hide_novigrad
  sq306_paid_scribe
  sq306_passiflora_cleared_for_game
  sq306_sacha_leaves_note
  sq306_sacha_strips
  sq306_sacha_won
  sq306_show_return_objectives
  sq306_start_quest

== quests/sidequests/novigrad/sq310_dangerous_game.w2phase:
  q310_started
  q310_zoltan_done
  q402_escort_completed
  q402_invited_zoltan_to_km
  q403_completed
  sq310_chase_begun
  sq310_closet_container_scratch_fm
  sq310_deal_starts
  sq310_duke_killed
  sq310_duke_wounded
  sq310_fdb_cards_taken
  sq310_fdb_quest_not_taken
  sq310_fdb_remove_key
  sq310_fdb_sewer_tp
  sq310_get_2_more_cards
  sq310_has_card_1
  sq310_has_card_2
  sq310_helped_selma
  sq310_hidden_wall_destroyed
  sq310_hook_completed
  sq310_knife_fm
  sq310_knife_r
  sq310_knocked_zeds_door
  sq310_quest_done
  sq310_quest_not_taken
  sq310_quest_taken
  sq310_sewer_wall_destroyed
  sq310_tel_to_deal
  sq310_zed_attic_door_opened
  zoltan_dd_start
  zoltan_dd_stop

== quests/sidequests/novigrad/sq315_talar.w2phase:
  q402_escort_completed
  sq315_plan_revealed

== quests/sidequests/skellige/quest_files/sq201_curse/scenes/sq201_00_priestess_interctive_dlg.w2scene:
  q205_monster_curse_lifted
  q205_quest_started
  sq201_reward_given
  sq201_scene_done_1
  sq201_werewolf_contract_taken
  sq_contract_accepted
  sq_priestess_did_it
  sq_priestess_met

== quests/sidequests/skellige/quest_files/sq201_curse/scenes/sq201_01_morkvarg_default.w2scene:
  q205_know_about_skjall
  q205_quest_end
  sq201_meat_to_ash
  sq201_morkvarg_firstmet
  sq201_morkvarg_hungry
  sq201_talked_to_morkvarg_help
  sq201_tordars_story

== quests/sidequests/skellige/quest_files/sq201_curse/scenes/sq201_04_tordar_at_larvik.w2scene:
  sq201_asked_about_anything
  sq201_tordar_firstmet

== quests/sidequests/skellige/quest_files/sq201_curse/scenes/sq201_geralt_gmpl_chats.w2scene:
  sq201_scene_done_2

== quests/sidequests/skellige/quest_files/sq202_yen/scenes/sq202_02_yen_about_djin.w2scene:
  q205_all_hubs_completed

== quests/sidequests/skellige/quest_files/sq202_yen/scenes/sq202_05c_crater.w2scene:
  sq202_cut_basket_checked
  sq202_cut_skeleton_checked

== quests/sidequests/skellige/quest_files/sq202_yen/scenes/sq202_11_kaer_trolde.w2scene:
  q205_all_hubs_completed
  q205_had_hub_briefing
  sq202_yen_girlfriend

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/phases/sq204_dealing_with_lessog.w2phase:
  204t1_destroyed
  204t2_destroyed
  204t3_destroyed
  sq204_all_totems_destroyed
  sq204_bandits_take_harald
  sq204_change_weather
  sq204_comm_hilde_gone
  sq204_community_switch_off
  sq204_completed
  sq204_defend_harald
  sq204_despawn_comm_guards
  sq204_elders_killed
  sq204_helped_leshy
  sq204_hilda_start_walking
  sq204_hilde_is_chosen
  sq204_hilde_killed
  sq204_leshy_fight_started
  sq204_sven_killed_harald

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/phases/sq204_helping_leshy.w2phase:
  sq204_change_weather
  sq204_get_hearts
  sq204_helped_leshy

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/phases/sq204_investigation.w2phase:
  mh205_leshy_victim_claws
  mh205_leshy_victim_suffocated
  mh205_tree_claw_marks
  sq204_leshy_footprints_found

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/phases/sq204_killing_leshy.w2phase:
  sq204_change_weather
  sq204_leshy_fight_started

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/scenes/sq204_01_villagers_about_spirit.w2scene:
  sq204_deal
  sq204_got_contract

== quests/sidequests/skellige/quest_files/sq204_forest_spirit/scenes/sq204_02g_tell_sven_its_hilde.w2scene:
  sq204_hilde_killed

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_00_pre_quest_succubus.w2scene:
  sq205_succubus_met

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_06_gremista_first_task.w2scene:
  sq205_accepted_quest
  sq205_already_asked
  sq205_think_it_thru

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_07_succubus_start.w2scene:
  sq205_succubus_met

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_08_succubus_confront.w2scene:
  sq205_found_succubus_victim
  sq205_succubus_met

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_12_druid_talk.w2scene:
  sq205_brb
  sq205_druid_friend_met
  sq205_ritual_failed

== quests/sidequests/skellige/quest_files/sq205_alchemist/scenes/sq205_20_succubus_gp.w2scene:
  sq205_succi_tracks

== quests/sidequests/skellige/quest_files/sq209_weregild/phases/sq209_barkeep_reactions.w2phase:
  arinbjorn_innkeeper_01_dialog_off
  arinbjorn_innkeeper_01_dialog_on
  sq209_barkeep_cheering
  sq209_barkeep_reset
  sq209_barkeep_scared

== quests/sidequests/skellige/quest_files/sq209_weregild/phases/sq209_shroom_effects.w2phase:
  sq209_camera_effect_on

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_09b_guards.w2scene:
  sq209_09b_guard_talked_to

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_09c_clever_inmate.w2scene:
  sq209_09c_how
  sq209_09c_talked_to

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_10_talk_with_lugos_the_mad.w2scene:
  lugos_the_mad_met
  q201_sq209_lugos_invitation
  sq209_part_2_done

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_12b_ship_chats.w2scene:
  sq209_12b_chat_manager

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_13_geralt_stoped_at_the_plank.w2scene:
  sq209_first_time
  sq209_part_1_done

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_14_lugos_jr.w2scene:
  sq209_14_already_talked
  sq209_14_get_ready
  sq209_part_1_done

== quests/sidequests/skellige/quest_files/sq209_weregild/scenes/sq209_18_final.w2scene:
  sq209_part_1_done
  sq209_payment

== quests/sidequests/skellige/quest_files/sq210_impossible_tower/scenes/sq210_01_fisherman_leader.w2scene:
  sq210_about_explorers
  sq210_fisherman_met
  sq210_hi_again
  sq210_quest_done
  sq210_quest_taken

== quests/sidequests/skellige/quest_files/sq210_impossible_tower/scenes/sq210_04_wizard_main.w2scene:
  sq210_about_explorers
  sq210_book_gog_found
  sq210_explorer_found
  sq210_golem_task_given
  sq210_golemancer_met
  sq210_quest_taken

== quests/sidequests/skellige/quest_files/sq210_impossible_tower/scenes/sq210_08_wizard_freed.w2scene:
  sq210_first_time_freed

== quests/sidequests/skellige/quest_files/sq210_impossible_tower/scenes/sq210_09_beach_final_scene.w2scene:
  sq210_explorer_found
  sq210_exploreres
  sq210_pay_up
  sq210_quest_taken

== quests/sidequests/skellige/quest_files/sq210_impossible_tower/scenes/sq210_09_wizard_final_scene.w2scene:
  sq210_quest_taken

== quests/sidequests/skellige/sq201_curse.w2phase:
  hr204_active
  q203_cataclysm_complete
  q205_about_cave_added
  q205_been_there
  q205_crack_seen_cave
  q205_first_use
  q205_floodgate_cmnt
  q205_floodgate_up
  q205_gate_1_up
  q205_gate_2_up
  q205_gate_3_up
  q205_know_about_missing_key
  q205_know_about_skjall
  q205_know_tordar
  q205_local_def
  q205_lvr_fdb_add
  q205_monster_curse_lifted
  q205_monster_killed
  q205_obj_added_gate
  q205_quest_end
  q205_quest_started
  q205_skjal_tracks_3
  q205_talked_about_herbarium
  q205_transmission_pos
  q205_visited_herb
  q205_well_seen_n_shit
  q205_werewolf_scratches2
  q205_werewolf_tracks_2
  q205_werewolf_victim_seen
  q205_yen_at_tree
  q205_yen_is_w_us
  q205_yen_said
  sq201_about_meat_w_yen
  sq201_agreed_w_mork
  sq201_agreed_wer
  sq201_break_timer
  sq201_chose_solution
  sq201_dead_4_ever
  sq201_journal_progressed
  sq201_lied_2_morkvarg
  sq201_loan_shark_got_rew
  sq201_loan_shark_waiting
  sq201_reward_given
  sq201_scene_done_1
  sq201_scene_done_2
  sq201_scene_done_3
  sq201_sent_to_pr
  sq201_started_calling
  sq201_started_talking
  sq201_told_tordar_he_lies
  sq201_tordar_firstmet
  sq201_tordars_story
  sq201_was_in_kapitularz
  sq201_were_scene_1
  sq201_were_scene_2
  sq201_were_scene_3
  sq201_werewolf_contract_taken
  sq201_wolf_defeated
  sq201_wolf_killed
  sq201_wolf_ressurected
  sq201_yen_cmt_done
  sq201_yen_cmt_started
  sq_contract_accepted
  sq_know_tordar
  sq_priestess_met_sq201

== quests/sidequests/skellige/sq202_yen.w2phase:
  q401_gotten_uma
  sq202_activate_sonar
  sq202_attack_conclusion
  sq202_clear_djinn_weather
  sq202_close_teleport
  sq202_djinn_weak_comment
  sq202_djinn_weather
  sq202_drakkar_conclusion
  sq202_end_seeing_through_eyes
  sq202_failed
  sq202_go_back_drakkar
  sq202_left_diving_area
  sq202_love_music
  sq202_pirate_chest_opened
  sq202_rise_wardrobe
  sq202_seeing_through_eyes
  sq202_shoes_checked
  sq202_start
  sq202_start_vommiting
  sq202_turn_off_security
  sq202_yen_broken_failsafe
  sq202_yen_clear_fx
  sq202_yen_confession
  sq202_yen_girlfriend
  sq202_yen_mounts_boat
  sq202_yen_started_riding
  yennefer_dd_start
  yennefer_dd_stop

== quests/sidequests/skellige/sq204_forest_spirit.w2phase:
  sq204_community_switch_off
  sq204_defend_harald
  sq204_got_contract

== quests/sidequests/skellige/sq205_alchemist.w2phase:
  gremista_dd_start
  gremista_dd_stop
  sq205_added_mash
  sq205_distilled
  sq205_druid_hunter_met
  sq205_dug_grave
  sq205_fdb_succubus_done
  sq205_found_body
  sq205_known
  sq205_met_hunter_once
  sq205_phase_2
  sq205_phase_3
  sq205_ready_to_brew
  sq205_ritual_complete
  sq205_ritual_failed
  sq205_sheep_despawn
  sq205_start_ritual
  sq205_success
  sq205_succi_tracks
  sq205_succubus_met

== quests/sidequests/skellige/sq209_weregild.w2phase:
  actor_sq209_southerner_son_01_was_killed
  actor_sq209_southerner_son_02_was_killed
  arinbjorn_inn_door_opened
  jorund_dd_start
  jorund_dd_stop
  lugos_cave_prison_enabled
  lugos_the_mad_dd_start
  lugos_the_mad_dd_stop
  mq2051_unlocked
  q201_afterparty_finished
  q206_party_started
  q210_on_quest
  sq209_14_get_ready
  sq209_barkeep_cheering
  sq209_barkeep_reset
  sq209_barkeep_scared
  sq209_bran_combat_setup
  sq209_brans_warriors_killed
  sq209_deal_with_simun
  sq209_eredin_vision_weapon_hit_by_PLAYER
  sq209_escape_options_unlocked
  sq209_geralt_draws_first
  sq209_inn_active
  sq209_jorulf_met
  sq209_jorund_intro_done
  sq209_part_1_done
  sq209_part_2_done
  sq209_part_2_started
  sq209_payment
  sq209_prison_fistfight
  sq209_remove_drakkar_wreck
  sq209_setup_fight_crowd
  sq209_sirens_killed
  sq209_start_part_1
  sq209_switch_lugos_effect

== quests/sidequests/skellige/sq210_impossible_tower.w2phase:
  actor_sq210_golem_was_killed
  sq210_book1_found
  sq210_book2_found
  sq210_book3_found
  sq210_book4_found
  sq210_book5_found
  sq210_entrance_used
  sq210_exit_used
  sq210_explorer_found
  sq210_fdb_fishermen_overheard
  sq210_fdb_found_gog
  sq210_fdb_villagers
  sq210_golem_attack
  sq210_golemancer_call_stfu
  sq210_quest_done
  sq210_quest_taken
  sq210_tower_door_opened

== quests/videos_scenes/ending_boards.w2phase:
  hjalmar_dd_start
  mq3035_free_temeria
  q110_visited_emhyr
  q502_ciri_dead
  q505_started
  udalryk_dd_start
  witcher3_game_finished

== quests/videos_scenes/ending_boards_scene.w2scene:
  mq3035_fdb_radovid_dead
  mq3035_free_temeria
  q110_visited_emhyr
  q206_hjalmar_king
  q206_svanrige_king
  q309_triss_lover
  q502_ciri_dead
  sq202_yen_girlfriend

== quests/witcher3_structure.w2phase:
  part1_skellige_start
  patch_1_12
  q002_met_emhyr
  q110_calmed_down_ciri
  q110_refused_reward
  q110_visited_emhyr
  q210_gave_lara_necklace
  q210_skjall_done
  q310_ciri_faced_lodge
  q502_ciri_dead
  q502_ciri_strong
  q502_ciri_survives
  q502_ciri_weak
  
addfact(q110_calmed_down_ciri)

addfact(q310_ciri_faced_lodge)

addfact(q210_skjall_done)

addfact(q110_calmed_down_ciri) - had a snowball fight with Ciri after The Battle of Kaer Morhen (good choice)
addfact(q110_visited_emhyr) - visited Emhyr with Ciri after The Battle of Kaer Morhen (required for empress ending)
addfact(q110_refused_reward) - did not accept the reward from Emhyr for bringing back Ciri (good choice)
addfact(q310_ciri_faced_lodge) - let Ciri talk to the Lodge alone (good choice)
addfact(q210_gave_lara_necklace) - did not let Ciri destroy Avallac'h's lab (bad choice)
addfact(q210_skjall_done) - went to Skjall's grave with Ciri (good choice)
addfact(q309_completed) - completed Now or Never
addfact(q309_triss_lover) - romanced Triss in Now or Never
addfact(q309_triss_stayed) - romanced Triss in Now or Never (you need to set both this and the above fact)
addfact(sq202_yen_girlfriend) - romanced Yennefer in The Last Wish
addfact(q206_completed) - ** helped Cerys or Hjalmar after the massacre in Kaer Trolde
addfact(q206_hjalmar_king) - ** Hjalmar is king of Skellige
addfact(q206_svanrige_king) - ** Svanrige is king of Skellige (remove both this and the above to make Cerys queen)
addfact(mq3035_fdb_radovid_dead) - assassinated Radovid in Reason of State
addfact(mq3035_free_temeria) - killed Dijkstra in Reason of State (add both this and the above = Nilfgaard wins, neither = Radovid wins)
addfact(mq3035_fdb_roche_talar_dead) - let Dijkstra win in Reason of State (add this and Radovid dead = Dijkstra wins)
addfact(q109_keira_to_radovid) - completed Keira's quest line and let her go to Radovid (and die)
addfact(q109_keira_to_km) - sent Keira to Kaer Morhen
addfact(q109_keira_defeated) - killed Keira
addfact(q301_godling_sara_peacefully) - let Sara the godling stay in the house
addfact(q302_whoreson_dead) - killed Whoreson Junior
addfact(sq312_fdb_ves_end) - helped Ves in the village
}

{NEW GAME PLUS COMMANDS

addcraft
addcraftingingre
adddrinks
addfood
addherbs
addmutagens
adddye
addrepairkits
addoils
addpotions
addbombs


addmutagenrecipes
addrecipesbombs
addrecipesoils
addrecipespotions
addrecipespotions2
addschematicsarmor
addschematicsbolts
addschematicsboots
addschematicscomponents
addschematicsgloves
addschematicspants
addschematicsupgrades

learnallschematics
}
