package UltimateBravery.src.main.ClassSpecific.Collections

import UltimateBravery.src.main.ClassSpecific.Objects.{Gw2Trait, Traitline}

class Traitlines {

  private val classes: Classes = new Classes()

  private val TOP = "Top"
  private val MIDDLE = "Middle"
  private val BOTTOM = "Bottom"

  private val traitRow: List[String] = List(
    "Top",
    "Middle",
    "Bottom"
  )

  private val guardianTraitsV2: List[Traitline] = List(
    new Traitline("Zeal", 42,
      List(new Gw2Trait(TOP, 563), new Gw2Trait(MIDDLE,634), new Gw2Trait(BOTTOM, 1925)),
      List(new Gw2Trait(TOP, 628), new Gw2Trait(MIDDLE, 653), new Gw2Trait(BOTTOM, 1556)),
      List(new Gw2Trait(TOP, 635), new Gw2Trait(MIDDLE, 637), new Gw2Trait(BOTTOM, 2017))),
    new Traitline("Radiance", 16,
      List(new Gw2Trait(TOP, 577), new Gw2Trait(MIDDLE, 566), new Gw2Trait(BOTTOM, 574)),
      List(new Gw2Trait(TOP, 578), new Gw2Trait(MIDDLE, 567), new Gw2Trait(BOTTOM, 565)),
      List(new Gw2Trait(TOP, 1686), new Gw2Trait(MIDDLE, 579), new Gw2Trait(BOTTOM, 1683))),
    new Traitline("Valor", 13,
      List(new Gw2Trait(TOP, 588), new Gw2Trait(MIDDLE, 581), new Gw2Trait(BOTTOM, 633)),
      List(new Gw2Trait(TOP, 580), new Gw2Trait(MIDDLE, 584), new Gw2Trait(BOTTOM, 1684)),
      List(new Gw2Trait(TOP, 585), new Gw2Trait(MIDDLE, 586), new Gw2Trait(BOTTOM, 589))),
    new Traitline("Honor", 49,
      List(new Gw2Trait(TOP, 1899), new Gw2Trait(MIDDLE, 559), new Gw2Trait(BOTTOM, 654)),
      List(new Gw2Trait(TOP, 557), new Gw2Trait(MIDDLE, 549), new Gw2Trait(BOTTOM, 562)),
      List(new Gw2Trait(TOP, 553), new Gw2Trait(MIDDLE, 558), new Gw2Trait(BOTTOM, 1682))),
    new Traitline("Virtues", 46,
      List(new Gw2Trait(TOP, 624), new Gw2Trait(MIDDLE, 625), new Gw2Trait(BOTTOM, 617)),
      List(new Gw2Trait(TOP, 603), new Gw2Trait(MIDDLE, 610), new Gw2Trait(BOTTOM, 587)),
      List(new Gw2Trait(TOP, 622), new Gw2Trait(MIDDLE, 554), new Gw2Trait(BOTTOM, 612)))
  )

  private val dragonhunterTraits: Traitline =
    new Traitline(classes.DRAGONHUNTER, 27,
      List(new Gw2Trait(TOP, 1898), new Gw2Trait(MIDDLE, 1983), new Gw2Trait(BOTTOM, 1911)),
      List(new Gw2Trait(TOP, 2037), new Gw2Trait(MIDDLE, 1835), new Gw2Trait(BOTTOM, 1943)),
      List(new Gw2Trait(TOP, 1908), new Gw2Trait(MIDDLE, 1963), new Gw2Trait(BOTTOM, 1955)))
  private val firebrandTraits: Traitline =
    new Traitline(classes.FIREBRAND, 62,
      List(new Gw2Trait(TOP, 2075), new Gw2Trait(MIDDLE, 2101), new Gw2Trait(BOTTOM, 2086)),
      List(new Gw2Trait(TOP, 2063), new Gw2Trait(MIDDLE, 2076), new Gw2Trait(BOTTOM, 2116)),
      List(new Gw2Trait(TOP, 2105), new Gw2Trait(MIDDLE, 2179), new Gw2Trait(BOTTOM, 2159)))
  private val willbenderTraits: Traitline =
    new Traitline(classes.WILLBENDER, 65,
      List(new Gw2Trait(TOP, 2191), new Gw2Trait(MIDDLE, 2190), new Gw2Trait(BOTTOM, 2187)),
      List(new Gw2Trait(TOP, 2197), new Gw2Trait(MIDDLE, 2210), new Gw2Trait(BOTTOM, 2199)),
      List(new Gw2Trait(TOP, 2195), new Gw2Trait(MIDDLE, 2201), new Gw2Trait(BOTTOM, 2198)))
  private val luminaryTraits: Traitline =
    new Traitline(classes.LUMINARY, 81,
      List(new Gw2Trait(TOP, 2410), new Gw2Trait(MIDDLE, 2417), new Gw2Trait(BOTTOM, 2329)),
      List(new Gw2Trait(TOP, 2330), new Gw2Trait(MIDDLE, 2401), new Gw2Trait(BOTTOM, 2419)),
      List(new Gw2Trait(TOP, 2368), new Gw2Trait(MIDDLE, 2328), new Gw2Trait(BOTTOM, 2388)))

  private val revenantTraitsV2: List[Traitline] = List(
    new Traitline("Invocation", 3,
      List(new Gw2Trait(TOP, 1732), new Gw2Trait(MIDDLE, 1761), new Gw2Trait(BOTTOM, 1784)),
      List(new Gw2Trait(TOP, 1774), new Gw2Trait(MIDDLE, 1760), new Gw2Trait(BOTTOM, 1781)),
      List(new Gw2Trait(TOP, 1749), new Gw2Trait(MIDDLE, 1791), new Gw2Trait(BOTTOM, 1719))),
    new Traitline("Salvation", 12,
      List( new Gw2Trait(TOP, 1823), new Gw2Trait(MIDDLE, 1824), new Gw2Trait(BOTTOM, 1822)),
      List(new Gw2Trait(TOP, 1819), new Gw2Trait(MIDDLE, 1817), new Gw2Trait(BOTTOM, 1818)),
      List(new Gw2Trait(TOP, 1815), new Gw2Trait(MIDDLE, 1825), new Gw2Trait(BOTTOM, 1820))),
    new Traitline("Retribution", 9,
      List(new Gw2Trait(TOP, 1811), new Gw2Trait(MIDDLE, 1728), new Gw2Trait(BOTTOM, 1810)),
      List(new Gw2Trait(TOP, 1766), new Gw2Trait(MIDDLE, 1782), new Gw2Trait(BOTTOM, 1740)),
      List(new Gw2Trait(TOP, 1779), new Gw2Trait(MIDDLE, 1770), new Gw2Trait(BOTTOM, 1790))),
    new Traitline("Corruption", 14,
      List(new Gw2Trait(TOP, 1793), new Gw2Trait(MIDDLE, 1789), new Gw2Trait(BOTTOM, 1741)),
      List(new Gw2Trait(TOP, 1727), new Gw2Trait(MIDDLE, 1726), new Gw2Trait(BOTTOM, 1714)),
      List(new Gw2Trait(TOP, 1795), new Gw2Trait(MIDDLE, 1720), new Gw2Trait(BOTTOM, 1721))),
    new Traitline("Devastation", 15,
      List(new Gw2Trait(TOP, 1776), new Gw2Trait(MIDDLE, 1767), new Gw2Trait(BOTTOM, 1755)),
      List(new Gw2Trait(TOP, 1786), new Gw2Trait(MIDDLE, 1765), new Gw2Trait(BOTTOM, 1802)),
      List(new Gw2Trait(TOP, 1715), new Gw2Trait(MIDDLE, 1800), new Gw2Trait(BOTTOM, 1754)))
  )

  private val heraldTraits: Traitline =
    new Traitline(classes.HERALD, 52,
      List(new Gw2Trait(TOP, 1813), new Gw2Trait(MIDDLE, 1806), new Gw2Trait(BOTTOM, 1716)),
      List(new Gw2Trait(TOP, 1738), new Gw2Trait(MIDDLE, 1743), new Gw2Trait(BOTTOM, 1730)),
      List(new Gw2Trait(TOP, 1746), new Gw2Trait(MIDDLE, 1772), new Gw2Trait(BOTTOM, 1803)))
  private val renegadeTraits: Traitline =
    new Traitline(classes.RENEGADE, 63,
      List(new Gw2Trait(TOP, 2166), new Gw2Trait(MIDDLE, 2079), new Gw2Trait(BOTTOM, 2120)),
      List(new Gw2Trait(TOP, 2133), new Gw2Trait(MIDDLE, 2092), new Gw2Trait(BOTTOM, 2108)),
      List(new Gw2Trait(TOP, 2094), new Gw2Trait(MIDDLE, 2100), new Gw2Trait(BOTTOM, 2182)))
  private val vindicatorTraits: Traitline =
    new Traitline(classes.VINDICATOR, 69,
      List(new Gw2Trait(TOP, 2258), new Gw2Trait(MIDDLE, 2248), new Gw2Trait(BOTTOM, 2228)),
      List(new Gw2Trait(TOP, 2259), new Gw2Trait(MIDDLE, 2243), new Gw2Trait(BOTTOM, 2255)),
      List(new Gw2Trait(TOP, 2257), new Gw2Trait(MIDDLE, 2232), new Gw2Trait(BOTTOM, 2238)))
  private val conduitTraits: Traitline =
    new Traitline(classes.CONDUIT, 79,
      List(new Gw2Trait(TOP, 2390), new Gw2Trait(MIDDLE, 2355), new Gw2Trait(BOTTOM, 2407)),
      List(new Gw2Trait(TOP, 2411), new Gw2Trait(MIDDLE, 2358), new Gw2Trait(BOTTOM, 2416)),
      List(new Gw2Trait(TOP, 2429), new Gw2Trait(MIDDLE, 2379), new Gw2Trait(BOTTOM, 2352)))

  private val warriorTraitsV2: List[Traitline] = List(
    new Traitline("Strength", 4,
      List(new Gw2Trait(TOP, 1447), new Gw2Trait(MIDDLE, 1451), new Gw2Trait(BOTTOM, 1444)),
      List(new Gw2Trait(TOP, 2000), new Gw2Trait(MIDDLE, 1338), new Gw2Trait(BOTTOM, 1449)),
      List(new Gw2Trait(TOP, 1437), new Gw2Trait(MIDDLE, 1454), new Gw2Trait(BOTTOM, 1440))),
    new Traitline("Tactics", 11,
      List(new Gw2Trait(TOP, 1469), new Gw2Trait(MIDDLE, 1474), new Gw2Trait(BOTTOM, 1471)),
      List(new Gw2Trait(TOP, 1486), new Gw2Trait(MIDDLE, 1479), new Gw2Trait(BOTTOM, 1482)),
      List(new Gw2Trait(TOP, 1667), new Gw2Trait(MIDDLE, 1470), new Gw2Trait(BOTTOM, 1711))),
    new Traitline("Defense", 22,
      List(new Gw2Trait(TOP, 1376), new Gw2Trait(MIDDLE, 1488), new Gw2Trait(BOTTOM, 1372)),
      List(new Gw2Trait(TOP, 1368), new Gw2Trait(MIDDLE, 1379), new Gw2Trait(BOTTOM, 1367)),
      List(new Gw2Trait(TOP, 1375), new Gw2Trait(MIDDLE, 1649), new Gw2Trait(BOTTOM, 1708))),
    new Traitline("Arms", 36,
      List(new Gw2Trait(TOP, 1455), new Gw2Trait(MIDDLE, 1344), new Gw2Trait(BOTTOM, 1334)),
      List(new Gw2Trait(TOP, 1315), new Gw2Trait(MIDDLE, 1316), new Gw2Trait(BOTTOM, 1333)),
      List(new Gw2Trait(TOP, 1336), new Gw2Trait(MIDDLE, 1346), new Gw2Trait(BOTTOM, 1707))),
    new Traitline("Discipline", 51,
      List(new Gw2Trait(TOP, 1329), new Gw2Trait(MIDDLE, 1413), new Gw2Trait(BOTTOM, 1381)),
      List(new Gw2Trait(TOP, 1484), new Gw2Trait(MIDDLE, 1489), new Gw2Trait(BOTTOM, 1709)),
      List(new Gw2Trait(TOP, 1369), new Gw2Trait(MIDDLE, 1317), new Gw2Trait(BOTTOM, 1657)))
  )

  private val berserkerTraits: Traitline =
    new Traitline(classes.BERSERKER, 18,
      List(new Gw2Trait(TOP, 2049), new Gw2Trait(MIDDLE, 2039), new Gw2Trait(BOTTOM, 1977)),
      List(new Gw2Trait(TOP, 2011), new Gw2Trait(MIDDLE, 2042), new Gw2Trait(BOTTOM, 2002)),
      List(new Gw2Trait(TOP, 1928), new Gw2Trait(MIDDLE, 2038), new Gw2Trait(BOTTOM, 2307)))
  private val spellbreakerTraits: Traitline =
    new Traitline(classes.SPELLBREAKER, 61,
      List(new Gw2Trait(TOP, 2107), new Gw2Trait(MIDDLE, 2153), new Gw2Trait(BOTTOM, 2140)),
      List(new Gw2Trait(TOP, 2126), new Gw2Trait(MIDDLE, 2097), new Gw2Trait(BOTTOM, 2095)),
      List(new Gw2Trait(TOP, 2163), new Gw2Trait(MIDDLE, 2168), new Gw2Trait(BOTTOM, 2060)))
  private val bladeswornTraits: Traitline =
    new Traitline(classes.BLADESWORN, 68,
      List(new Gw2Trait(TOP, 2237), new Gw2Trait(MIDDLE, 2260), new Gw2Trait(BOTTOM, 2225)),
      List(new Gw2Trait(TOP, 2253), new Gw2Trait(MIDDLE, 2302), new Gw2Trait(BOTTOM, 2303)),
      List(new Gw2Trait(TOP, 2261), new Gw2Trait(MIDDLE, 2239), new Gw2Trait(BOTTOM, 2245)))
  private val paragonTraits: Traitline =
    new Traitline(classes.PARAGON, 74,
      List(new Gw2Trait(TOP, 2345), new Gw2Trait(MIDDLE, 2433), new Gw2Trait(BOTTOM, 2357)),
      List(new Gw2Trait(TOP, 2385), new Gw2Trait(MIDDLE, 2426), new Gw2Trait(BOTTOM, 2399)),
      List(new Gw2Trait(TOP, 2369), new Gw2Trait(MIDDLE, 2375), new Gw2Trait(BOTTOM, 2428)))

  private val engineerTraitsV2: List[Traitline] = List(
    new Traitline("Explosives", 6,
      List(new Gw2Trait(TOP, 514), new Gw2Trait(MIDDLE, 525), new Gw2Trait(BOTTOM, 1882)),
      List(new Gw2Trait(TOP, 482), new Gw2Trait(MIDDLE, 1892), new Gw2Trait(BOTTOM, 1944)),
      List(new Gw2Trait(TOP, 1541), new Gw2Trait(MIDDLE, 505), new Gw2Trait(BOTTOM, 1947))),
    new Traitline("Tools", 21,
      List(new Gw2Trait(TOP, 532), new Gw2Trait(MIDDLE, 1997), new Gw2Trait(BOTTOM, 531)),
      List(new Gw2Trait(TOP, 512), new Gw2Trait(MIDDLE, 1946), new Gw2Trait(BOTTOM, 1832)),
      List(new Gw2Trait(TOP, 1856), new Gw2Trait(MIDDLE, 523), new Gw2Trait(BOTTOM, 1679))),
    new Traitline("Alchemy", 29,
      List(new Gw2Trait(TOP, 396), new Gw2Trait(MIDDLE, 509), new Gw2Trait(BOTTOM, 521)),
      List(new Gw2Trait(TOP, 520), new Gw2Trait(MIDDLE, 469), new Gw2Trait(BOTTOM, 470)),
      List(new Gw2Trait(TOP, 473), new Gw2Trait(MIDDLE, 1871), new Gw2Trait(BOTTOM, 1854))),
    new Traitline("Firearms", 38,
      List(new Gw2Trait(TOP, 1878), new Gw2Trait(MIDDLE, 1930), new Gw2Trait(BOTTOM, 1914)),
      List(new Gw2Trait(TOP, 1984), new Gw2Trait(MIDDLE, 2006), new Gw2Trait(BOTTOM, 1923)),
      List(new Gw2Trait(TOP, 510), new Gw2Trait(MIDDLE, 526), new Gw2Trait(BOTTOM, 433))),
    new Traitline("Inventions", 47,
      List(new Gw2Trait(TOP, 394), new Gw2Trait(MIDDLE, 1901), new Gw2Trait(BOTTOM, 507)),
      List(new Gw2Trait(TOP, 1678), new Gw2Trait(MIDDLE, 1834), new Gw2Trait(BOTTOM, 445)),
      List(new Gw2Trait(TOP, 472), new Gw2Trait(MIDDLE, 1680), new Gw2Trait(BOTTOM, 1916)))
  )

  private val scrapperTraits: Traitline =
    new Traitline(classes.SCRAPPER, 43,
      List(new Gw2Trait(TOP, 1917), new Gw2Trait(MIDDLE, 1971), new Gw2Trait(BOTTOM, 1867)),
      List(new Gw2Trait(TOP, 1954), new Gw2Trait(MIDDLE, 1999), new Gw2Trait(BOTTOM, 1860)),
      List(new Gw2Trait(TOP, 1981), new Gw2Trait(MIDDLE, 2052), new Gw2Trait(BOTTOM, 1849)))
  private val holosmithTraits: Traitline =
    new Traitline(classes.HOLOSMITH, 57,
      List(new Gw2Trait(TOP, 2114), new Gw2Trait(MIDDLE, 2157), new Gw2Trait(BOTTOM, 2106)),
      List(new Gw2Trait(TOP, 2103), new Gw2Trait(MIDDLE, 2152), new Gw2Trait(BOTTOM, 2091)),
      List(new Gw2Trait(TOP, 2066), new Gw2Trait(MIDDLE, 2137), new Gw2Trait(BOTTOM, 2064)))
  private val mechanistTraits: Traitline =
    new Traitline(classes.MECHANIST, 70,
      List(new Gw2Trait(TOP, 2282), new Gw2Trait(MIDDLE, 2296), new Gw2Trait(BOTTOM, 2279)),
      List(new Gw2Trait(TOP, 2270), new Gw2Trait(MIDDLE, 2276), new Gw2Trait(BOTTOM, 2294)),
      List(new Gw2Trait(TOP, 2292), new Gw2Trait(MIDDLE, 2281), new Gw2Trait(BOTTOM, 2298)))
  private val amalgamTraits: Traitline =
    new Traitline(classes.AMALGAM, 75,
      List(new Gw2Trait(TOP, 2366), new Gw2Trait(MIDDLE, 2395), new Gw2Trait(BOTTOM, 2434)),
      List(new Gw2Trait(TOP, 2383), new Gw2Trait(MIDDLE, 2420), new Gw2Trait(BOTTOM, 2349)),
      List(new Gw2Trait(TOP, 2406), new Gw2Trait(MIDDLE, 2387), new Gw2Trait(BOTTOM, 2334)))

  private val rangerTraitsV2: List[Traitline] = List(
    new Traitline("Marksmanship", 8,
      List(new Gw2Trait(TOP, 1021), new Gw2Trait(MIDDLE, 1014), new Gw2Trait(BOTTOM, 986)),
      List(new Gw2Trait(TOP, 1001), new Gw2Trait(MIDDLE, 1000), new Gw2Trait(BOTTOM, 1070)),
      List(new Gw2Trait(TOP, 996), new Gw2Trait(MIDDLE, 1015), new Gw2Trait(BOTTOM, 1698))),
    new Traitline("Nature Magic", 25,
      List(new Gw2Trait(TOP, 1062), new Gw2Trait(MIDDLE, 978), new Gw2Trait(BOTTOM, 1060)),
      List(new Gw2Trait(TOP, 1054), new Gw2Trait(MIDDLE, 965), new Gw2Trait(BOTTOM, 964)),
      List(new Gw2Trait(TOP, 1038), new Gw2Trait(MIDDLE, 1988), new Gw2Trait(BOTTOM, 1697))),
    new Traitline("Skirmishing", 30,
      List(new Gw2Trait(TOP, 1069), new Gw2Trait(MIDDLE, 1067), new Gw2Trait(BOTTOM, 1075)),
      List(new Gw2Trait(TOP, 1016), new Gw2Trait(MIDDLE, 1700), new Gw2Trait(BOTTOM, 1846)),
      List(new Gw2Trait(TOP, 1064), new Gw2Trait(MIDDLE, 1912), new Gw2Trait(BOTTOM, 1888))),
    new Traitline("Beastmastery", 32,
      List(new Gw2Trait(TOP, 1861), new Gw2Trait(MIDDLE, 1072), new Gw2Trait(BOTTOM, 1606)),
      List(new Gw2Trait(TOP, 975), new Gw2Trait(MIDDLE, 1047), new Gw2Trait(BOTTOM, 970)),
      List(new Gw2Trait(TOP, 1945), new Gw2Trait(MIDDLE, 968), new Gw2Trait(BOTTOM, 1066))),
    new Traitline("Wilderness Survival", 33,
      List(new Gw2Trait(TOP, 1098), new Gw2Trait(MIDDLE, 1086), new Gw2Trait(BOTTOM, 1099)),
      List(new Gw2Trait(TOP, 1101), new Gw2Trait(MIDDLE, 2032), new Gw2Trait(BOTTOM, 1100)),
      List(new Gw2Trait(TOP, 1094), new Gw2Trait(MIDDLE, 1699), new Gw2Trait(BOTTOM, 1701)))
  )

  private val druidTraits: Traitline =
    new Traitline(classes.DRUID, 5,
      List(new Gw2Trait(TOP, 1868), new Gw2Trait(MIDDLE, 2016), new Gw2Trait(BOTTOM, 1935)),
      List(new Gw2Trait(TOP, 2053), new Gw2Trait(MIDDLE, 2001), new Gw2Trait(BOTTOM, 2056)),
      List(new Gw2Trait(TOP, 2057), new Gw2Trait(MIDDLE, 2058), new Gw2Trait(BOTTOM, 2055)))
  private val soulbeastTraits: Traitline =
    new Traitline(classes.SOULBEAST, 55,
      List(new Gw2Trait(TOP, 2134), new Gw2Trait(MIDDLE, 2071), new Gw2Trait(BOTTOM, 2072)),
      List(new Gw2Trait(TOP, 2119), new Gw2Trait(MIDDLE, 2085), new Gw2Trait(BOTTOM, 2161)),
      List(new Gw2Trait(TOP, 2155), new Gw2Trait(MIDDLE, 2128), new Gw2Trait(BOTTOM, 2143)))
  private val untamedTraits: Traitline =
    new Traitline(classes.UNTAMED, 72,
      List(new Gw2Trait(TOP, 2297), new Gw2Trait(MIDDLE, 2277), new Gw2Trait(BOTTOM, 2301)),
      List(new Gw2Trait(TOP, 2263), new Gw2Trait(MIDDLE, 2287), new Gw2Trait(BOTTOM, 2278)),
      List(new Gw2Trait(TOP, 2271), new Gw2Trait(MIDDLE, 2283), new Gw2Trait(BOTTOM, 2274)))
  private val galeshotTraits: Traitline =
    new Traitline(classes.GALESHOT, 78,
      List(new Gw2Trait(TOP, 2402), new Gw2Trait(MIDDLE, 2370), new Gw2Trait(BOTTOM, 2360)),
      List(new Gw2Trait(TOP, 2408), new Gw2Trait(MIDDLE, 2413), new Gw2Trait(BOTTOM, 2396)),
      List(new Gw2Trait(TOP, 2425), new Gw2Trait(MIDDLE, 2336), new Gw2Trait(BOTTOM, 2372)))

  private val thiefTraitsV2: List[Traitline] = List(
    new Traitline("Shadow Arts", 20,
      List(new Gw2Trait(TOP, 1160), new Gw2Trait(MIDDLE, 1293), new Gw2Trait(BOTTOM, 1284)),
      List(new Gw2Trait(TOP, 1297), new Gw2Trait(MIDDLE, 1130), new Gw2Trait(BOTTOM, 1300)),
      List(new Gw2Trait(TOP, 1134), new Gw2Trait(MIDDLE, 1135), new Gw2Trait(BOTTOM, 1162))),
    new Traitline("Deadly Arts", 28,
      List(new Gw2Trait(TOP, 1245), new Gw2Trait(MIDDLE, 1276), new Gw2Trait(BOTTOM, 1164)),
      List(new Gw2Trait(TOP, 1169), new Gw2Trait(MIDDLE, 1292), new Gw2Trait(BOTTOM, 1704)),
      List(new Gw2Trait(TOP, 1291), new Gw2Trait(MIDDLE, 1167), new Gw2Trait(BOTTOM, 1269))),
    new Traitline("Critical Strikes", 35,
      List(new Gw2Trait(TOP, 1209), new Gw2Trait(MIDDLE, 1267), new Gw2Trait(BOTTOM, 1268)),
      List(new Gw2Trait(TOP, 1170), new Gw2Trait(MIDDLE, 1272), new Gw2Trait(BOTTOM, 1299)),
      List(new Gw2Trait(TOP, 1904), new Gw2Trait(MIDDLE, 1215), new Gw2Trait(BOTTOM, 1702))),
    new Traitline("Trickery", 44,
      List(new Gw2Trait(TOP, 1159), new Gw2Trait(MIDDLE, 1252), new Gw2Trait(BOTTOM, 1163)),
      List(new Gw2Trait(TOP, 1277), new Gw2Trait(MIDDLE, 1286), new Gw2Trait(BOTTOM, 1190)),
      List(new Gw2Trait(TOP, 1187), new Gw2Trait(MIDDLE, 1158), new Gw2Trait(BOTTOM, 1706))),
    new Traitline("Acrobatics", 54,
      List(new Gw2Trait(TOP, 1112), new Gw2Trait(MIDDLE, 1289), new Gw2Trait(BOTTOM, 1237)),
      List(new Gw2Trait(TOP, 1241), new Gw2Trait(MIDDLE, 1192), new Gw2Trait(BOTTOM, 1290)),
      List(new Gw2Trait(TOP, 1238), new Gw2Trait(MIDDLE, 1295), new Gw2Trait(BOTTOM, 1703)))
  )

  private val daredevilTraits: Traitline =
    new Traitline(classes.DAREDEVIL, 7,
      List(new Gw2Trait(TOP, 1933), new Gw2Trait(MIDDLE, 2023), new Gw2Trait(BOTTOM, 1949)),
      List(new Gw2Trait(TOP, 1884), new Gw2Trait(MIDDLE, 1893), new Gw2Trait(BOTTOM, 1975)),
      List(new Gw2Trait(TOP, 1833), new Gw2Trait(MIDDLE, 1964), new Gw2Trait(BOTTOM, 2047)))
  private val deadeyeTraits: Traitline =
    new Traitline(classes.DEADEYE, 58,
      List(new Gw2Trait(TOP, 2145), new Gw2Trait(MIDDLE, 2173), new Gw2Trait(BOTTOM, 2136)),
      List(new Gw2Trait(TOP, 2118), new Gw2Trait(MIDDLE, 2078), new Gw2Trait(BOTTOM, 2160)),
      List(new Gw2Trait(TOP, 2111), new Gw2Trait(MIDDLE, 2093), new Gw2Trait(BOTTOM, 2146)))
  private val specterTraits: Traitline =
    new Traitline(classes.SPECTER, 71,
      List(new Gw2Trait(TOP, 2284), new Gw2Trait(MIDDLE, 2299), new Gw2Trait(BOTTOM, 2275)),
      List(new Gw2Trait(TOP, 2290), new Gw2Trait(MIDDLE, 2288), new Gw2Trait(BOTTOM, 2285)),
      List(new Gw2Trait(TOP, 2264), new Gw2Trait(MIDDLE, 2300), new Gw2Trait(BOTTOM, 2289)))
  private val antiquaryTraits: Traitline =
    new Traitline(classes.ANTIQUARY, 77,
      List(new Gw2Trait(TOP, 2423), new Gw2Trait(MIDDLE, 2365), new Gw2Trait(BOTTOM, 2346)),
      List(new Gw2Trait(TOP, 2400), new Gw2Trait(MIDDLE, 2431), new Gw2Trait(BOTTOM, 2350)),
      List(new Gw2Trait(TOP, 2409), new Gw2Trait(MIDDLE, 2393), new Gw2Trait(BOTTOM, 2348)))

  private val elementalistTraitsV2: List[Traitline] = List(
    new Traitline("Water", 17,
      List(new Gw2Trait(TOP, 348), new Gw2Trait(MIDDLE, 363), new Gw2Trait(BOTTOM, 360)),
      List(new Gw2Trait(TOP, 364), new Gw2Trait(MIDDLE, 358), new Gw2Trait(BOTTOM, 349)),
      List(new Gw2Trait(TOP, 362), new Gw2Trait(MIDDLE, 361), new Gw2Trait(BOTTOM, 2028))),
    new Traitline("Earth", 26,
      List(new Gw2Trait(TOP, 282), new Gw2Trait(MIDDLE, 1507), new Gw2Trait(BOTTOM, 289)),
      List(new Gw2Trait(TOP, 275), new Gw2Trait(MIDDLE, 281), new Gw2Trait(BOTTOM, 277)),
      List(new Gw2Trait(TOP, 1508), new Gw2Trait(MIDDLE, 287), new Gw2Trait(BOTTOM, 1674))),
    new Traitline("Fire", 31,
      List(new Gw2Trait(TOP, 296), new Gw2Trait(MIDDLE, 328), new Gw2Trait(BOTTOM, 335)),
      List(new Gw2Trait(TOP, 325), new Gw2Trait(MIDDLE, 340), new Gw2Trait(BOTTOM, 334)),
      List(new Gw2Trait(TOP, 1510), new Gw2Trait(MIDDLE, 294), new Gw2Trait(BOTTOM, 1675))),
    new Traitline("Arcane", 37,
      List(new Gw2Trait(TOP, 253), new Gw2Trait(MIDDLE, 266), new Gw2Trait(BOTTOM, 1487)),
      List(new Gw2Trait(TOP, 265), new Gw2Trait(MIDDLE, 1673), new Gw2Trait(BOTTOM, 257)),
      List(new Gw2Trait(TOP, 238), new Gw2Trait(MIDDLE, 263), new Gw2Trait(BOTTOM, 1511))),
    new Traitline("Air", 41,
      List(new Gw2Trait(TOP, 227), new Gw2Trait(MIDDLE, 224), new Gw2Trait(BOTTOM, 232)),
      List(new Gw2Trait(TOP, 229), new Gw2Trait(MIDDLE, 214), new Gw2Trait(BOTTOM, 1502)),
      List(new Gw2Trait(TOP, 226), new Gw2Trait(MIDDLE, 1503), new Gw2Trait(BOTTOM, 1672)))
  )

  private val tempestTraits: Traitline =
    new Traitline(classes.TEMPEST, 48,
      List(new Gw2Trait(TOP, 1952), new Gw2Trait(MIDDLE, 1962), new Gw2Trait(BOTTOM, 1886)),
      List(new Gw2Trait(TOP, 1891), new Gw2Trait(MIDDLE, 1902), new Gw2Trait(BOTTOM, 2015)),
      List(new Gw2Trait(TOP, 1839), new Gw2Trait(MIDDLE, 2033), new Gw2Trait(BOTTOM, 1986)))
  private val weaverTraits: Traitline =
    new Traitline(classes.WEAVER, 56,
      List(new Gw2Trait(TOP, 2177), new Gw2Trait(MIDDLE, 2165), new Gw2Trait(BOTTOM, 2115)),
      List(new Gw2Trait(TOP, 2180), new Gw2Trait(MIDDLE, 2061), new Gw2Trait(BOTTOM, 2170)),
      List(new Gw2Trait(TOP, 2131), new Gw2Trait(MIDDLE, 2090), new Gw2Trait(BOTTOM, 2138)))
  private val catalystTraits: Traitline =
    new Traitline(classes.CATALYST, 67,
      List(new Gw2Trait(TOP, 2230), new Gw2Trait(MIDDLE, 2252), new Gw2Trait(BOTTOM, 2224)),
      List(new Gw2Trait(TOP, 2247), new Gw2Trait(MIDDLE, 2249), new Gw2Trait(BOTTOM, 2234)),
      List(new Gw2Trait(TOP, 2233), new Gw2Trait(MIDDLE, 2241), new Gw2Trait(BOTTOM, 2251)))
  private val evokerTraits: Traitline =
    new Traitline(classes.EVOKER, 80,
      List(new Gw2Trait(TOP, 2391), new Gw2Trait(MIDDLE, 2415), new Gw2Trait(BOTTOM, 2354)),
      List(new Gw2Trait(TOP, 2342), new Gw2Trait(MIDDLE, 2380), new Gw2Trait(BOTTOM, 2438)),
      List(new Gw2Trait(TOP, 2335), new Gw2Trait(MIDDLE, 2436), new Gw2Trait(BOTTOM, 2437)))

  private val necromancerTraitsV2: List[Traitline] = List(
    new Traitline("Death Magic", 2,
      List(new Gw2Trait(TOP, 820), new Gw2Trait(MIDDLE, 857), new Gw2Trait(BOTTOM, 1922)),
      List(new Gw2Trait(TOP, 858), new Gw2Trait(MIDDLE, 860), new Gw2Trait(BOTTOM, 855)),
      List(new Gw2Trait(TOP, 842), new Gw2Trait(MIDDLE, 1940), new Gw2Trait(BOTTOM, 1694))),
    new Traitline("Blood Magic", 19,
      List(new Gw2Trait(TOP, 780), new Gw2Trait(MIDDLE, 788), new Gw2Trait(BOTTOM, 1876)),
      List(new Gw2Trait(TOP, 789), new Gw2Trait(MIDDLE, 799), new Gw2Trait(BOTTOM, 1844)),
      List(new Gw2Trait(TOP, 782), new Gw2Trait(MIDDLE, 1692), new Gw2Trait(BOTTOM, 778))),
    new Traitline("Curses", 39,
      List(new Gw2Trait(TOP, 1883), new Gw2Trait(MIDDLE, 2013), new Gw2Trait(BOTTOM, 815)),
      List(new Gw2Trait(TOP, 816), new Gw2Trait(MIDDLE, 1693), new Gw2Trait(BOTTOM, 812)),
      List(new Gw2Trait(TOP, 813), new Gw2Trait(MIDDLE, 1696), new Gw2Trait(BOTTOM, 801))),
    new Traitline("Soul Reaping", 50,
      List(new Gw2Trait(TOP, 875), new Gw2Trait(MIDDLE, 898), new Gw2Trait(BOTTOM, 888)),
      List(new Gw2Trait(TOP, 894), new Gw2Trait(MIDDLE, 861), new Gw2Trait(BOTTOM, 892)),
      List(new Gw2Trait(TOP, 889), new Gw2Trait(MIDDLE, 893), new Gw2Trait(BOTTOM, 905))),
    new Traitline("Spite", 53,
      List(new Gw2Trait(TOP, 914), new Gw2Trait(MIDDLE, 916), new Gw2Trait(BOTTOM, 1863)),
      List(new Gw2Trait(TOP, 899), new Gw2Trait(MIDDLE, 829), new Gw2Trait(BOTTOM, 909)),
      List(new Gw2Trait(TOP, 919), new Gw2Trait(MIDDLE, 853), new Gw2Trait(BOTTOM, 903)))
  )

  private val reaperTraits: Traitline =
    new Traitline(classes.REAPER, 34,
      List(new Gw2Trait(TOP, 1974), new Gw2Trait(MIDDLE, 2020), new Gw2Trait(BOTTOM, 2026)),
      List(new Gw2Trait(TOP, 1969), new Gw2Trait(MIDDLE, 2008), new Gw2Trait(BOTTOM, 2031)),
      List(new Gw2Trait(TOP, 1932), new Gw2Trait(MIDDLE, 1919), new Gw2Trait(BOTTOM, 2021)))
  private val scourgeTraits: Traitline =
    new Traitline(classes.SCOURGE, 60,
      List(new Gw2Trait(TOP, 2167), new Gw2Trait(MIDDLE, 2074), new Gw2Trait(BOTTOM, 2102)),
      List(new Gw2Trait(TOP, 2059), new Gw2Trait(MIDDLE, 2067), new Gw2Trait(BOTTOM, 2123)),
      List(new Gw2Trait(TOP, 2112), new Gw2Trait(MIDDLE, 2164), new Gw2Trait(BOTTOM, 2080)))
  private val harbingerTraits: Traitline =
    new Traitline(classes.HARBINGER, 64,
      List(new Gw2Trait(TOP, 2188), new Gw2Trait(MIDDLE, 2219), new Gw2Trait(BOTTOM, 2185)),
      List(new Gw2Trait(TOP, 2192), new Gw2Trait(MIDDLE, 2220), new Gw2Trait(BOTTOM, 2209)),
      List(new Gw2Trait(TOP, 2218), new Gw2Trait(MIDDLE, 2194), new Gw2Trait(BOTTOM, 2203)))
  private val ritualistTraits: Traitline =
    new Traitline(classes.RITUALIST, 76,
      List(new Gw2Trait(TOP, 2327), new Gw2Trait(MIDDLE, 2378), new Gw2Trait(BOTTOM, 2339)),
      List(new Gw2Trait(TOP, 2384), new Gw2Trait(MIDDLE, 2405), new Gw2Trait(BOTTOM, 2421)),
      List(new Gw2Trait(TOP, 2376), new Gw2Trait(MIDDLE, 2333), new Gw2Trait(BOTTOM, 2392)))

  private val mesmerTraitsV2: List[Traitline] = List(
    new Traitline("Dueling", 1,
      List(new Gw2Trait(TOP, 701), new Gw2Trait(MIDDLE, 705), new Gw2Trait(BOTTOM, 700)),
      List(new Gw2Trait(TOP, 1889), new Gw2Trait(MIDDLE, 1960), new Gw2Trait(BOTTOM, 708)),
      List(new Gw2Trait(TOP, 692), new Gw2Trait(MIDDLE, 1950), new Gw2Trait(BOTTOM, 704))),
    new Traitline("Domination", 10,
      List(new Gw2Trait(TOP, 686), new Gw2Trait(MIDDLE, 682), new Gw2Trait(BOTTOM, 687)),
      List(new Gw2Trait(TOP, 693), new Gw2Trait(MIDDLE, 713), new Gw2Trait(BOTTOM, 712)),
      List(new Gw2Trait(TOP, 681), new Gw2Trait(MIDDLE, 680), new Gw2Trait(BOTTOM, 1688))),
    new Traitline("Inspiration", 23,
      List(new Gw2Trait(TOP, 756), new Gw2Trait(MIDDLE, 738), new Gw2Trait(BOTTOM, 744)),
      List(new Gw2Trait(TOP, 751), new Gw2Trait(MIDDLE, 740), new Gw2Trait(BOTTOM, 1980)),
      List(new Gw2Trait(TOP, 2005), new Gw2Trait(MIDDLE, 1866), new Gw2Trait(BOTTOM, 752))),
    new Traitline("Illusions", 24,
      List(new Gw2Trait(TOP, 721), new Gw2Trait(MIDDLE, 1869), new Gw2Trait(BOTTOM, 691)),
      List(new Gw2Trait(TOP, 722), new Gw2Trait(MIDDLE, 729), new Gw2Trait(BOTTOM, 1690)),
      List(new Gw2Trait(TOP, 733), new Gw2Trait(MIDDLE, 2035), new Gw2Trait(BOTTOM, 753))),
    new Traitline("Chaos", 45,
      List(new Gw2Trait(TOP, 670), new Gw2Trait(MIDDLE, 675), new Gw2Trait(BOTTOM, 677)),
      List(new Gw2Trait(TOP, 673), new Gw2Trait(MIDDLE, 668), new Gw2Trait(BOTTOM, 669)),
      List(new Gw2Trait(TOP, 671), new Gw2Trait(MIDDLE, 674), new Gw2Trait(BOTTOM, 1687)))
  )

  private val chronomancerTraits: Traitline =
    new Traitline(classes.CHRONOMANCER, 40,
      List(new Gw2Trait(TOP, 1838), new Gw2Trait(MIDDLE, 1995), new Gw2Trait(BOTTOM, 1987)),
      List(new Gw2Trait(TOP, 2009), new Gw2Trait(MIDDLE, 1913), new Gw2Trait(BOTTOM, 1978)),
      List(new Gw2Trait(TOP, 1942), new Gw2Trait(MIDDLE, 2022), new Gw2Trait(BOTTOM, 1890)))
  private val mirageTraits: Traitline =
    new Traitline(classes.MIRAGE, 59,
      List(new Gw2Trait(TOP, 2141), new Gw2Trait(MIDDLE, 2082), new Gw2Trait(BOTTOM, 2110)),
      List(new Gw2Trait(TOP, 2178), new Gw2Trait(MIDDLE, 2174), new Gw2Trait(BOTTOM, 2098)),
      List(new Gw2Trait(TOP, 2070), new Gw2Trait(MIDDLE, 2113), new Gw2Trait(BOTTOM, 2169)))
  private val virtuosoTraits: Traitline =
    new Traitline(classes.VIRTUOSO, 66,
      List(new Gw2Trait(TOP, 2212), new Gw2Trait(MIDDLE, 2208), new Gw2Trait(BOTTOM, 2202)),
      List(new Gw2Trait(TOP, 2215), new Gw2Trait(MIDDLE, 2205), new Gw2Trait(BOTTOM, 2207)),
      List(new Gw2Trait(TOP, 2211), new Gw2Trait(MIDDLE, 2206), new Gw2Trait(BOTTOM, 2223)))
  private val troubadourTraits: Traitline =
    new Traitline(classes.TROUBADOUR, 73,
      List(new Gw2Trait(TOP, 2427), new Gw2Trait(MIDDLE, 2326), new Gw2Trait(BOTTOM, 2432)),
      List(new Gw2Trait(TOP, 2343), new Gw2Trait(MIDDLE, 2367), new Gw2Trait(BOTTOM, 2422)),
      List(new Gw2Trait(TOP, 2353), new Gw2Trait(MIDDLE, 2414), new Gw2Trait(BOTTOM, 2441)))

  private val guardianTraits: List[String] = List(
    "Zeal",
    "Radiance",
    "Valor",
    "Honor",
    "Virtues"
  )

  private val revenantTraits: List[String] = List(
    "Corruption",
    "Retribution",
    "Salvation",
    "Invocation",
    "Devastation",
  )

  private val warriorTraits: List[String] = List(
    "Strength",
    "Arms",
    "Defense",
    "Tactics",
    "Discipline"
  )

  private val engineerTraits: List[String] = List(
    "Explosives",
    "Firearms",
    "Inventions",
    "Alchemy",
    "Tools"
  )

  private val rangerTraits: List[String] = List(
    "Marksmanship",
    "Skirmishing",
    "Wilderness Survival",
    "Nature Magic",
    "Beastmastery"
  )

  private val thiefTraits: List[String] = List(
    "Deadly Arts",
    "Critical Strikes",
    "Shadows Arts",
    "Acrobatics",
    "Trickery"
  )

  private val elementalistTraits: List[String] = List(
    "Fire",
    "Water",
    "Earth",
    "Air",
    "Arcane"
  )

  private val mesmerTraits: List[String] = List(
    "Dueling",
    "Inspiration",
    "Illusions",
    "Chaos",
    "Domination"
  )

  private val necromancerTraits: List[String] = List(
    "Spite",
    "Curses",
    "Death Magic",
    "Blood Magic",
    "Soul Reaping"
  )

  def ultimateBravery(baseClass: String): String ={
    val roll = rollRandomIndex(5)
    baseClass match {
      case classes.GUARDIAN => guardianTraits(roll)
      case classes.WARRIOR => warriorTraits(roll)
      case classes.REVENANT => revenantTraits(roll)
      case classes.ENGINEER => engineerTraits(roll)
      case classes.RANGER => rangerTraits(roll)
      case classes.THIEF => thiefTraits(roll)
      case classes.ELEMENTALIST => elementalistTraits(roll)
      case classes.MESMER => mesmerTraits(roll)
      case classes.NECROMANCER => necromancerTraits(roll)
      case _ => "Error"
    }
  }

  def rollTraitRow: String = {
    val roll = rollRandomIndex(traitRow.size)
    traitRow(roll)
  }

  def eliteUltimateBravery(classRoll: String): Traitline = {
    classRoll match {
      case classes.DRAGONHUNTER => randomizeTraitline(List(dragonhunterTraits), 0)
      case classes.FIREBRAND => randomizeTraitline(List(firebrandTraits), 0)
      case classes.WILLBENDER => randomizeTraitline(List(willbenderTraits), 0)
      case classes.LUMINARY => randomizeTraitline(List(luminaryTraits), 0)
      case classes.HERALD => randomizeTraitline(List(heraldTraits), 0)
      case classes.RENEGADE => randomizeTraitline(List(renegadeTraits), 0)
      case classes.VINDICATOR => randomizeTraitline(List(vindicatorTraits), 0)
      case classes.CONDUIT => randomizeTraitline(List(conduitTraits), 0)
      case classes.BERSERKER => randomizeTraitline(List(berserkerTraits), 0)
      case classes.SPELLBREAKER => randomizeTraitline(List(spellbreakerTraits), 0)
      case classes.BLADESWORN => randomizeTraitline(List(bladeswornTraits), 0)
      case classes.PARAGON => randomizeTraitline(List(paragonTraits), 0)
      case classes.DRUID => randomizeTraitline(List(druidTraits), 0)
      case classes.SOULBEAST => randomizeTraitline(List(soulbeastTraits), 0)
      case classes.UNTAMED => randomizeTraitline(List(untamedTraits), 0)
      case classes.GALESHOT => randomizeTraitline(List(galeshotTraits), 0)
      case classes.DAREDEVIL => randomizeTraitline(List(daredevilTraits), 0)
      case classes.DEADEYE => randomizeTraitline(List(deadeyeTraits), 0)
      case classes.SPECTER => randomizeTraitline(List(specterTraits), 0)
      case classes.ANTIQUARY => randomizeTraitline(List(antiquaryTraits), 0)
      case classes.SCRAPPER => randomizeTraitline(List(scrapperTraits), 0)
      case classes.HOLOSMITH => randomizeTraitline(List(holosmithTraits), 0)
      case classes.MECHANIST => randomizeTraitline(List(mechanistTraits), 0)
      case classes.AMALGAM => randomizeTraitline(List(amalgamTraits), 0)
      case classes.CHRONOMANCER => randomizeTraitline(List(chronomancerTraits), 0)
      case classes.MIRAGE => randomizeTraitline(List(mirageTraits), 0)
      case classes.VIRTUOSO => randomizeTraitline(List(virtuosoTraits), 0)
      case classes.TROUBADOUR => randomizeTraitline(List(troubadourTraits), 0)
      case classes.REAPER => randomizeTraitline(List(reaperTraits), 0)
      case classes.SCOURGE => randomizeTraitline(List(scourgeTraits), 0)
      case classes.HARBINGER => randomizeTraitline(List(harbingerTraits), 0)
      case classes.RITUALIST => randomizeTraitline(List(ritualistTraits), 0)
      case classes.TEMPEST => randomizeTraitline(List(tempestTraits), 0)
      case classes.WEAVER => randomizeTraitline(List(weaverTraits), 0)
      case classes.CATALYST => randomizeTraitline(List(catalystTraits), 0)
      case classes.EVOKER => randomizeTraitline(List(evokerTraits), 0)
      case _ => new Traitline("Error", 0, List(), List(), List())
    }
  }

  def newUltimateBravery(baseClass: String): Traitline = {
    val roll = rollRandomIndex(5)
    baseClass match {
      case classes.GUARDIAN => randomizeTraitline(guardianTraitsV2, roll)
      case classes.WARRIOR => randomizeTraitline(warriorTraitsV2, roll)
      case classes.REVENANT => randomizeTraitline(revenantTraitsV2, roll)
      case classes.ENGINEER => randomizeTraitline(engineerTraitsV2, roll)
      case classes.RANGER => randomizeTraitline(rangerTraitsV2, roll)
      case classes.THIEF => randomizeTraitline(thiefTraitsV2, roll)
      case classes.ELEMENTALIST => randomizeTraitline(elementalistTraitsV2, roll)
      case classes.MESMER => randomizeTraitline(mesmerTraitsV2, roll)
      case classes.NECROMANCER => randomizeTraitline(necromancerTraitsV2, roll)
      case _ => new Traitline("Error", 0, List(), List(), List())
    }
  }

  private def randomizeTraitline(traitlines: List[Traitline], roll: Int): Traitline = {
    val traitline: Traitline = traitlines(roll)

    val adeptRoll = rollRandomIndex(traitline.getAdeptTraits.size)
    val masterRoll = rollRandomIndex(traitline.getMasterTraits.size)
    val grandmasterRoll = rollRandomIndex(traitline.getGrandmasterTraits.size)

    new Traitline(traitline.getName, traitline.getId,
      List(traitline.getAdeptTraits(adeptRoll)),
      List(traitline.getMasterTraits(masterRoll)),
      List(traitline.getGrandmasterTraits(grandmasterRoll))
    )
  }

  private def rollRandomIndex(indices: Int): Int = {
    Math.round(Math.random() * (indices-1)).toInt
  }
}
