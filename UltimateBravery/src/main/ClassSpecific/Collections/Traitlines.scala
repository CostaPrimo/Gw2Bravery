package UltimateBravery.src.main.ClassSpecific.Collections

class Traitlines {

  private val TOP = "Top"
  private val MIDDLE = "Middle"
  private val BOTTOM = "Bottom"

  private val traitRow: List[String] = List(
    "Top",
    "Middle",
    "Bottom"
  )

  private val guardianTraitsV2: List[Traitline] = List(
    new Traitline(42,
      List(new Trait(TOP, 563), new Trait(MIDDLE,634), new Trait(BOTTOM, 1925)),
      List(new Trait(TOP, 628), new Trait(MIDDLE, 653), new Trait(BOTTOM, 1556)),
      List(new Trait(TOP, 635), new Trait(MIDDLE, 637), new Trait(BOTTOM, 2017))),
    new Traitline(16,
      List(new Trait(TOP, 577), new Trait(MIDDLE, 566), new Trait(BOTTOM, 574)),
      List(new Trait(TOP, 578), new Trait(MIDDLE, 567), new Trait(BOTTOM, 565)),
      List(new Trait(TOP, 1686), new Trait(MIDDLE, 579), new Trait(BOTTOM, 1683))),
    new Traitline(13,
      List(new Trait(TOP, 588), new Trait(MIDDLE, 581), new Trait(BOTTOM, 633)),
      List(new Trait(TOP, 580), new Trait(MIDDLE, 584), new Trait(BOTTOM, 1684)),
      List(new Trait(TOP, 585), new Trait(MIDDLE, 586), new Trait(BOTTOM, 589))),
    new Traitline(49,
      List(new Trait(TOP, 1899), new Trait(MIDDLE, 559), new Trait(BOTTOM, 654)),
      List(new Trait(TOP, 557), new Trait(MIDDLE, 549), new Trait(BOTTOM, 562)),
      List(new Trait(TOP, 553), new Trait(MIDDLE, 558), new Trait(BOTTOM, 1682))),
    new Traitline(46,
      List(new Trait(TOP, 624), new Trait(MIDDLE, 625), new Trait(BOTTOM, 617)),
      List(new Trait(TOP, 603), new Trait(MIDDLE, 610), new Trait(BOTTOM, 587)),
      List(new Trait(TOP, 622), new Trait(MIDDLE, 554), new Trait(BOTTOM, 612)))
  )

  private val dragonhunterTraits: Traitline =
    new Traitline(27,
      List(new Trait(TOP, 1898), new Trait(MIDDLE, 1983), new Trait(BOTTOM, 1911)),
      List(new Trait(TOP, 2037), new Trait(MIDDLE, 1835), new Trait(BOTTOM, 1943)),
      List(new Trait(TOP, 1908), new Trait(MIDDLE, 1963), new Trait(BOTTOM, 1955)))
  private val firebrandTraits: Traitline =
    new Traitline(62,
      List(new Trait(TOP, 2075), new Trait(MIDDLE, 2101), new Trait(BOTTOM, 2086)),
      List(new Trait(TOP, 2063), new Trait(MIDDLE, 2076), new Trait(BOTTOM, 2116)),
      List(new Trait(TOP, 2105), new Trait(MIDDLE, 2179), new Trait(BOTTOM, 2159)))
  private val willbenderTraits: Traitline =
    new Traitline(65,
      List(new Trait(TOP, 2191), new Trait(MIDDLE, 2190), new Trait(BOTTOM, 2187)),
      List(new Trait(TOP, 2197), new Trait(MIDDLE, 2210), new Trait(BOTTOM, 2199)),
      List(new Trait(TOP, 2195), new Trait(MIDDLE, 2201), new Trait(BOTTOM, 2198)))
  private val luminaryTraits: Traitline =
    new Traitline(81,
      List(new Trait(TOP, 2410), new Trait(MIDDLE, 2417), new Trait(BOTTOM, 2329)),
      List(new Trait(TOP, 2330), new Trait(MIDDLE, 2401), new Trait(BOTTOM, 2419)),
      List(new Trait(TOP, 2368), new Trait(MIDDLE, 2328), new Trait(BOTTOM, 2388)))

  private val revenantTraitsV2: List[Traitline] = List(
    new Traitline(3,
      List(new Trait(TOP, 1732), new Trait(MIDDLE, 1761), new Trait(BOTTOM, 1784)),
      List(new Trait(TOP, 1774), new Trait(MIDDLE, 1760), new Trait(BOTTOM, 1781)),
      List(new Trait(TOP, 1749), new Trait(MIDDLE, 1791), new Trait(BOTTOM, 1719))),
    new Traitline(12,
      List( new Trait(TOP, 1823), new Trait(MIDDLE, 1824), new Trait(BOTTOM, 1822)),
      List(new Trait(TOP, 1819), new Trait(MIDDLE, 1817), new Trait(BOTTOM, 1818)),
      List(new Trait(TOP, 1815), new Trait(MIDDLE, 1825), new Trait(BOTTOM, 1820))),
    new Traitline(9,
      List(new Trait(TOP, 1811), new Trait(MIDDLE, 1728), new Trait(BOTTOM, 1810)),
      List(new Trait(TOP, 1766), new Trait(MIDDLE, 1782), new Trait(BOTTOM, 1740)),
      List(new Trait(TOP, 1779), new Trait(MIDDLE, 1770), new Trait(BOTTOM, 1790))),
    new Traitline(14,
      List(new Trait(TOP, 1793), new Trait(MIDDLE, 1789), new Trait(BOTTOM, 1741)),
      List(new Trait(TOP, 1727), new Trait(MIDDLE, 1726), new Trait(BOTTOM, 1714)),
      List(new Trait(TOP, 1795), new Trait(MIDDLE, 1720), new Trait(BOTTOM, 1721))),
    new Traitline(15,
      List(new Trait(TOP, 1776), new Trait(MIDDLE, 1767), new Trait(BOTTOM, 1755)),
      List(new Trait(TOP, 1786), new Trait(MIDDLE, 1765), new Trait(BOTTOM, 1802)),
      List(new Trait(TOP, 1715), new Trait(MIDDLE, 1800), new Trait(BOTTOM, 1754)))
  )

  private val heraldTraits: Traitline =
    new Traitline(52,
      List(new Trait(TOP, 1813), new Trait(MIDDLE, 1806), new Trait(BOTTOM, 1716)),
      List(new Trait(TOP, 1738), new Trait(MIDDLE, 1743), new Trait(BOTTOM, 1730)),
      List(new Trait(TOP, 1746), new Trait(MIDDLE, 1772), new Trait(BOTTOM, 1803)))
  private val renegadeTraits: Traitline =
    new Traitline(63,
      List(new Trait(TOP, 2166), new Trait(MIDDLE, 2079), new Trait(BOTTOM, 2120)),
      List(new Trait(TOP, 2133), new Trait(MIDDLE, 2092), new Trait(BOTTOM, 2108)),
      List(new Trait(TOP, 2094), new Trait(MIDDLE, 2100), new Trait(BOTTOM, 2182)))
  private val vindicatorTraits: Traitline =
    new Traitline(69,
      List(new Trait(TOP, 2258), new Trait(MIDDLE, 2248), new Trait(BOTTOM, 2228)),
      List(new Trait(TOP, 2259), new Trait(MIDDLE, 2243), new Trait(BOTTOM, 2255)),
      List(new Trait(TOP, 2257), new Trait(MIDDLE, 2232), new Trait(BOTTOM, 2238)))
  private val conduitTraits: Traitline =
    new Traitline(79,
      List(new Trait(TOP, 2390), new Trait(MIDDLE, 2355), new Trait(BOTTOM, 2407)),
      List(new Trait(TOP, 2411), new Trait(MIDDLE, 2358), new Trait(BOTTOM, 2416)),
      List(new Trait(TOP, 2429), new Trait(MIDDLE, 2379), new Trait(BOTTOM, 2352)))

  private val warriorTraitsV2: List[Traitline] = List(
    new Traitline(4,
      List(new Trait(TOP, 1447), new Trait(MIDDLE, 1451), new Trait(BOTTOM, 1444)),
      List(new Trait(TOP, 2000), new Trait(MIDDLE, 1338), new Trait(BOTTOM, 1449)),
      List(new Trait(TOP, 1437), new Trait(MIDDLE, 1454), new Trait(BOTTOM, 1440))),
    new Traitline(11,
      List(new Trait(TOP, 1469), new Trait(MIDDLE, 1474), new Trait(BOTTOM, 1471)),
      List(new Trait(TOP, 1486), new Trait(MIDDLE, 1479), new Trait(BOTTOM, 1482)),
      List(new Trait(TOP, 1667), new Trait(MIDDLE, 1470), new Trait(BOTTOM, 1711))),
    new Traitline(22,
      List(new Trait(TOP, 1376), new Trait(MIDDLE, 1488), new Trait(BOTTOM, 1372)),
      List(new Trait(TOP, 1368), new Trait(MIDDLE, 1379), new Trait(BOTTOM, 1367)),
      List(new Trait(TOP, 1375), new Trait(MIDDLE, 1649), new Trait(BOTTOM, 1708))),
    new Traitline(36,
      List(new Trait(TOP, 1455), new Trait(MIDDLE, 1344), new Trait(BOTTOM, 1334)),
      List(new Trait(TOP, 1315), new Trait(MIDDLE, 1316), new Trait(BOTTOM, 1333)),
      List(new Trait(TOP, 1336), new Trait(MIDDLE, 1346), new Trait(BOTTOM, 1707))),
    new Traitline(51,
      List(new Trait(TOP, 1329), new Trait(MIDDLE, 1413), new Trait(BOTTOM, 1381)),
      List(new Trait(TOP, 1484), new Trait(MIDDLE, 1489), new Trait(BOTTOM, 1709)),
      List(new Trait(TOP, 1369), new Trait(MIDDLE, 1317), new Trait(BOTTOM, 1657)))
  )

  private val berserkerTraits: Traitline =
    new Traitline(18,
      List(new Trait(TOP, 2049), new Trait(MIDDLE, 2039), new Trait(BOTTOM, 1977)),
      List(new Trait(TOP, 2011), new Trait(MIDDLE, 2042), new Trait(BOTTOM, 2002)),
      List(new Trait(TOP, 1928), new Trait(MIDDLE, 2038), new Trait(BOTTOM, 2307)))
  private val spellbreakerTraits: Traitline =
    new Traitline(61,
      List(new Trait(TOP, 2107), new Trait(MIDDLE, 2153), new Trait(BOTTOM, 2140)),
      List(new Trait(TOP, 2126), new Trait(MIDDLE, 2097), new Trait(BOTTOM, 2095)),
      List(new Trait(TOP, 2163), new Trait(MIDDLE, 2168), new Trait(BOTTOM, 2060)))
  private val bladeswornTraits: Traitline =
    new Traitline(68,
      List(new Trait(TOP, 2237), new Trait(MIDDLE, 2260), new Trait(BOTTOM, 2225)),
      List(new Trait(TOP, 2253), new Trait(MIDDLE, 2302), new Trait(BOTTOM, 2303)),
      List(new Trait(TOP, 2261), new Trait(MIDDLE, 2239), new Trait(BOTTOM, 2245)))
  private val paragonTraits: Traitline =
    new Traitline(74,
      List(new Trait(TOP, 2345), new Trait(MIDDLE, 2433), new Trait(BOTTOM, 2357)),
      List(new Trait(TOP, 2385), new Trait(MIDDLE, 2426), new Trait(BOTTOM, 2399)),
      List(new Trait(TOP, 2369), new Trait(MIDDLE, 2375), new Trait(BOTTOM, 2428)))

  private val engineerTraitsV2: List[Traitline] = List(
    new Traitline(6,
      List(new Trait(TOP, 514), new Trait(MIDDLE, 525), new Trait(BOTTOM, 1882)),
      List(new Trait(TOP, 482), new Trait(MIDDLE, 1892), new Trait(BOTTOM, 1944)),
      List(new Trait(TOP, 1541), new Trait(MIDDLE, 505), new Trait(BOTTOM, 1947))),
    new Traitline(21,
      List(new Trait(TOP, 532), new Trait(MIDDLE, 1997), new Trait(BOTTOM, 531)),
      List(new Trait(TOP, 512), new Trait(MIDDLE, 1946), new Trait(BOTTOM, 1832)),
      List(new Trait(TOP, 1856), new Trait(MIDDLE, 523), new Trait(BOTTOM, 1679))),
    new Traitline(29,
      List(new Trait(TOP, 396), new Trait(MIDDLE, 509), new Trait(BOTTOM, 521)),
      List(new Trait(TOP, 520), new Trait(MIDDLE, 469), new Trait(BOTTOM, 470)),
      List(new Trait(TOP, 473), new Trait(MIDDLE, 1871), new Trait(BOTTOM, 1854))),
    new Traitline(38,
      List(new Trait(TOP, 1878), new Trait(MIDDLE, 1930), new Trait(BOTTOM, 1914)),
      List(new Trait(TOP, 1984), new Trait(MIDDLE, 2006), new Trait(BOTTOM, 1923)),
      List(new Trait(TOP, 510), new Trait(MIDDLE, 526), new Trait(BOTTOM, 433))),
    new Traitline(47,
      List(new Trait(TOP, 394), new Trait(MIDDLE, 1901), new Trait(BOTTOM, 507)),
      List(new Trait(TOP, 1678), new Trait(MIDDLE, 1834), new Trait(BOTTOM, 445)),
      List(new Trait(TOP, 472), new Trait(MIDDLE, 1680), new Trait(BOTTOM, 1916)))
  )

  private val scrapperTraits: Traitline =
    new Traitline(43,
      List(new Trait(TOP, 1917), new Trait(MIDDLE, 1971), new Trait(BOTTOM, 1867)),
      List(new Trait(TOP, 1954), new Trait(MIDDLE, 1999), new Trait(BOTTOM, 1860)),
      List(new Trait(TOP, 1981), new Trait(MIDDLE, 2052), new Trait(BOTTOM, 1849)))
  private val holosmithTraits: Traitline =
    new Traitline(57,
      List(new Trait(TOP, 2114), new Trait(MIDDLE, 2157), new Trait(BOTTOM, 2106)),
      List(new Trait(TOP, 2103), new Trait(MIDDLE, 2152), new Trait(BOTTOM, 2091)),
      List(new Trait(TOP, 2066), new Trait(MIDDLE, 2137), new Trait(BOTTOM, 2064)))
  private val mechanistTraits: Traitline =
    new Traitline(70,
      List(new Trait(TOP, 2282), new Trait(MIDDLE, 2296), new Trait(BOTTOM, 2279)),
      List(new Trait(TOP, 2270), new Trait(MIDDLE, 2276), new Trait(BOTTOM, 2294)),
      List(new Trait(TOP, 2292), new Trait(MIDDLE, 2281), new Trait(BOTTOM, 2298)))
  private val amalgamTraits: Traitline =
    new Traitline(75,
      List(new Trait(TOP, 2366), new Trait(MIDDLE, 2395), new Trait(BOTTOM, 2434)),
      List(new Trait(TOP, 2383), new Trait(MIDDLE, 2420), new Trait(BOTTOM, 2349)),
      List(new Trait(TOP, 2406), new Trait(MIDDLE, 2387), new Trait(BOTTOM, 2334)))

  private val rangerTraitsV2: List[Traitline] = List(
    new Traitline(8,
      List(new Trait(TOP, 1021), new Trait(MIDDLE, 1014), new Trait(BOTTOM, 986)),
      List(new Trait(TOP, 1001), new Trait(MIDDLE, 1000), new Trait(BOTTOM, 1070)),
      List(new Trait(TOP, 996), new Trait(MIDDLE, 1015), new Trait(BOTTOM, 1698))),
    new Traitline(25,
      List(new Trait(TOP, 1062), new Trait(MIDDLE, 978), new Trait(BOTTOM, 1060)),
      List(new Trait(TOP, 1054), new Trait(MIDDLE, 965), new Trait(BOTTOM, 964)),
      List(new Trait(TOP, 1038), new Trait(MIDDLE, 1988), new Trait(BOTTOM, 1697))),
    new Traitline(30,
      List(new Trait(TOP, 1069), new Trait(MIDDLE, 1067), new Trait(BOTTOM, 1075)),
      List(new Trait(TOP, 1016), new Trait(MIDDLE, 1700), new Trait(BOTTOM, 1846)),
      List(new Trait(TOP, 1064), new Trait(MIDDLE, 1912), new Trait(BOTTOM, 1888))),
    new Traitline(32,
      List(new Trait(TOP, 1861), new Trait(MIDDLE, 1072), new Trait(BOTTOM, 1606)),
      List(new Trait(TOP, 975), new Trait(MIDDLE, 1047), new Trait(BOTTOM, 970)),
      List(new Trait(TOP, 1945), new Trait(MIDDLE, 968), new Trait(BOTTOM, 1066))),
    new Traitline(33,
      List(new Trait(TOP, 1098), new Trait(MIDDLE, 1086), new Trait(BOTTOM, 1099)),
      List(new Trait(TOP, 1101), new Trait(MIDDLE, 2032), new Trait(BOTTOM, 1100)),
      List(new Trait(TOP, 1094), new Trait(MIDDLE, 1699), new Trait(BOTTOM, 1701)))
  )

  private val druidTraits: Traitline =
    new Traitline(5,
      List(new Trait(TOP, 1868), new Trait(MIDDLE, 2016), new Trait(BOTTOM, 1935)),
      List(new Trait(TOP, 2053), new Trait(MIDDLE, 2001), new Trait(BOTTOM, 2056)),
      List(new Trait(TOP, 2057), new Trait(MIDDLE, 2058), new Trait(BOTTOM, 2055)))
  private val soulbeastTraits: Traitline =
    new Traitline(55,
      List(new Trait(TOP, 2134), new Trait(MIDDLE, 2071), new Trait(BOTTOM, 2072)),
      List(new Trait(TOP, 2119), new Trait(MIDDLE, 2085), new Trait(BOTTOM, 2161)),
      List(new Trait(TOP, 2155), new Trait(MIDDLE, 2128), new Trait(BOTTOM, 2143)))
  private val untamedTraits: Traitline =
    new Traitline(72,
      List(new Trait(TOP, 2297), new Trait(MIDDLE, 2277), new Trait(BOTTOM, 2301)),
      List(new Trait(TOP, 2263), new Trait(MIDDLE, 2287), new Trait(BOTTOM, 2278)),
      List(new Trait(TOP, 2271), new Trait(MIDDLE, 2283), new Trait(BOTTOM, 2274)))
  private val galeshotTraits: Traitline =
    new Traitline(78,
      List(new Trait(TOP, 2402), new Trait(MIDDLE, 2370), new Trait(BOTTOM, 2360)),
      List(new Trait(TOP, 2408), new Trait(MIDDLE, 2413), new Trait(BOTTOM, 2396)),
      List(new Trait(TOP, 2425), new Trait(MIDDLE, 2336), new Trait(BOTTOM, 2372)))

  private val thiefTraitsV2: List[Traitline] = List(
    new Traitline(20,
      List(new Trait(TOP, 1160), new Trait(MIDDLE, 1293), new Trait(BOTTOM, 1284)),
      List(new Trait(TOP, 1297), new Trait(MIDDLE, 1130), new Trait(BOTTOM, 1300)),
      List(new Trait(TOP, 1134), new Trait(MIDDLE, 1135), new Trait(BOTTOM, 1162))),
    new Traitline(28,
      List(new Trait(TOP, 1245), new Trait(MIDDLE, 1276), new Trait(BOTTOM, 1164)),
      List(new Trait(TOP, 1169), new Trait(MIDDLE, 1292), new Trait(BOTTOM, 1704)),
      List(new Trait(TOP, 1291), new Trait(MIDDLE, 1167), new Trait(BOTTOM, 1269))),
    new Traitline(35,
      List(new Trait(TOP, 1209), new Trait(MIDDLE, 1267), new Trait(BOTTOM, 1268)),
      List(new Trait(TOP, 1170), new Trait(MIDDLE, 1272), new Trait(BOTTOM, 1299)),
      List(new Trait(TOP, 1904), new Trait(MIDDLE, 1215), new Trait(BOTTOM, 1702))),
    new Traitline(44,
      List(new Trait(TOP, 1159), new Trait(MIDDLE, 1252), new Trait(BOTTOM, 1163)),
      List(new Trait(TOP, 1277), new Trait(MIDDLE, 1286), new Trait(BOTTOM, 1190)),
      List(new Trait(TOP, 1187), new Trait(MIDDLE, 1158), new Trait(BOTTOM, 1706))),
    new Traitline(54,
      List(new Trait(TOP, 1112), new Trait(MIDDLE, 1289), new Trait(BOTTOM, 1237)),
      List(new Trait(TOP, 1241), new Trait(MIDDLE, 1192), new Trait(BOTTOM, 1290)),
      List(new Trait(TOP, 1238), new Trait(MIDDLE, 1295), new Trait(BOTTOM, 1703)))
  )

  private val daredevilTraits: Traitline =
    new Traitline(7,
      List(new Trait(TOP, 1933), new Trait(MIDDLE, 2023), new Trait(BOTTOM, 1949)),
      List(new Trait(TOP, 1884), new Trait(MIDDLE, 1893), new Trait(BOTTOM, 1975)),
      List(new Trait(TOP, 1833), new Trait(MIDDLE, 1964), new Trait(BOTTOM, 2047)))
  private val deadeyeTraits: Traitline =
    new Traitline(58,
      List(new Trait(TOP, 2145), new Trait(MIDDLE, 2173), new Trait(BOTTOM, 2136)),
      List(new Trait(TOP, 2118), new Trait(MIDDLE, 2078), new Trait(BOTTOM, 2160)),
      List(new Trait(TOP, 2111), new Trait(MIDDLE, 2093), new Trait(BOTTOM, 2146)))
  private val specterTraits: Traitline =
    new Traitline(71,
      List(new Trait(TOP, 2284), new Trait(MIDDLE, 2299), new Trait(BOTTOM, 2275)),
      List(new Trait(TOP, 2290), new Trait(MIDDLE, 2288), new Trait(BOTTOM, 2285)),
      List(new Trait(TOP, 2264), new Trait(MIDDLE, 2300), new Trait(BOTTOM, 2289)))
  private val antiquaryTraits: Traitline =
    new Traitline(77,
      List(new Trait(TOP, 2423), new Trait(MIDDLE, 2365), new Trait(BOTTOM, 2346)),
      List(new Trait(TOP, 2400), new Trait(MIDDLE, 2431), new Trait(BOTTOM, 2350)),
      List(new Trait(TOP, 2409), new Trait(MIDDLE, 2393), new Trait(BOTTOM, 2348)))

  private val elementalistTraitsV2: List[Traitline] = List(
    new Traitline(17,
      List(new Trait(TOP, 348), new Trait(MIDDLE, 363), new Trait(BOTTOM, 360)),
      List(new Trait(TOP, 364), new Trait(MIDDLE, 358), new Trait(BOTTOM, 349)),
      List(new Trait(TOP, 362), new Trait(MIDDLE, 361), new Trait(BOTTOM, 2028))),
    new Traitline(26,
      List(new Trait(TOP, 282), new Trait(MIDDLE, 1507), new Trait(BOTTOM, 289)),
      List(new Trait(TOP, 275), new Trait(MIDDLE, 281), new Trait(BOTTOM, 277)),
      List(new Trait(TOP, 1508), new Trait(MIDDLE, 287), new Trait(BOTTOM, 1674))),
    new Traitline(31,
      List(new Trait(TOP, 296), new Trait(MIDDLE, 328), new Trait(BOTTOM, 335)),
      List(new Trait(TOP, 325), new Trait(MIDDLE, 340), new Trait(BOTTOM, 334)),
      List(new Trait(TOP, 1510), new Trait(MIDDLE, 294), new Trait(BOTTOM, 1675))),
    new Traitline(37,
      List(new Trait(TOP, 253), new Trait(MIDDLE, 266), new Trait(BOTTOM, 1487)),
      List(new Trait(TOP, 265), new Trait(MIDDLE, 1673), new Trait(BOTTOM, 257)),
      List(new Trait(TOP, 238), new Trait(MIDDLE, 263), new Trait(BOTTOM, 1511))),
    new Traitline(41,
      List(new Trait(TOP, 227), new Trait(MIDDLE, 224), new Trait(BOTTOM, 232)),
      List(new Trait(TOP, 229), new Trait(MIDDLE, 214), new Trait(BOTTOM, 1502)),
      List(new Trait(TOP, 226), new Trait(MIDDLE, 1503), new Trait(BOTTOM, 1672)))
  )

  private val tempestTraits: Traitline =
    new Traitline(48,
      List(new Trait(TOP, 1952), new Trait(MIDDLE, 1962), new Trait(BOTTOM, 1886)),
      List(new Trait(TOP, 1891), new Trait(MIDDLE, 1902), new Trait(BOTTOM, 2015)),
      List(new Trait(TOP, 1839), new Trait(MIDDLE, 2033), new Trait(BOTTOM, 1986)))
  private val weaverTraits: Traitline =
    new Traitline(56,
      List(new Trait(TOP, 2177), new Trait(MIDDLE, 2165), new Trait(BOTTOM, 2115)),
      List(new Trait(TOP, 2180), new Trait(MIDDLE, 2061), new Trait(BOTTOM, 2170)),
      List(new Trait(TOP, 2131), new Trait(MIDDLE, 2090), new Trait(BOTTOM, 2138)))
  private val catalystTraits: Traitline =
    new Traitline(67,
      List(new Trait(TOP, 2230), new Trait(MIDDLE, 2252), new Trait(BOTTOM, 2224)),
      List(new Trait(TOP, 2247), new Trait(MIDDLE, 2249), new Trait(BOTTOM, 2234)),
      List(new Trait(TOP, 2233), new Trait(MIDDLE, 2241), new Trait(BOTTOM, 2251)))
  private val evokerTraits: Traitline =
    new Traitline(80,
      List(new Trait(TOP, 2391), new Trait(MIDDLE, 2415), new Trait(BOTTOM, 2354)),
      List(new Trait(TOP, 2342), new Trait(MIDDLE, 2380), new Trait(BOTTOM, 2438)),
      List(new Trait(TOP, 2335), new Trait(MIDDLE, 2436), new Trait(BOTTOM, 2437)))

  private val necromancerTraitsV2: List[Traitline] = List(
    new Traitline(2,
      List(new Trait(TOP, 820), new Trait(MIDDLE, 857), new Trait(BOTTOM, 1922)),
      List(new Trait(TOP, 858), new Trait(MIDDLE, 860), new Trait(BOTTOM, 855)),
      List(new Trait(TOP, 842), new Trait(MIDDLE, 1940), new Trait(BOTTOM, 1694))),
    new Traitline(19,
      List(new Trait(TOP, 780), new Trait(MIDDLE, 788), new Trait(BOTTOM, 1876)),
      List(new Trait(TOP, 789), new Trait(MIDDLE, 799), new Trait(BOTTOM, 1844)),
      List(new Trait(TOP, 782), new Trait(MIDDLE, 1692), new Trait(BOTTOM, 778))),
    new Traitline(39,
      List(new Trait(TOP, 1883), new Trait(MIDDLE, 2013), new Trait(BOTTOM, 815)),
      List(new Trait(TOP, 816), new Trait(MIDDLE, 1693), new Trait(BOTTOM, 812)),
      List(new Trait(TOP, 813), new Trait(MIDDLE, 1696), new Trait(BOTTOM, 801))),
    new Traitline(50,
      List(new Trait(TOP, 875), new Trait(MIDDLE, 898), new Trait(BOTTOM, 888)),
      List(new Trait(TOP, 894), new Trait(MIDDLE, 861), new Trait(BOTTOM, 892)),
      List(new Trait(TOP, 889), new Trait(MIDDLE, 893), new Trait(BOTTOM, 905))),
    new Traitline(53,
      List(new Trait(TOP, 914), new Trait(MIDDLE, 916), new Trait(BOTTOM, 1863)),
      List(new Trait(TOP, 899), new Trait(MIDDLE, 829), new Trait(BOTTOM, 909)),
      List(new Trait(TOP, 919), new Trait(MIDDLE, 853), new Trait(BOTTOM, 903)))
  )

  private val reaperTraits: Traitline =
    new Traitline(34,
      List(new Trait(TOP, 1974), new Trait(MIDDLE, 2020), new Trait(BOTTOM, 2026)),
      List(new Trait(TOP, 1969), new Trait(MIDDLE, 2008), new Trait(BOTTOM, 2031)),
      List(new Trait(TOP, 1932), new Trait(MIDDLE, 1919), new Trait(BOTTOM, 2021)))
  private val scourgeTraits: Traitline =
    new Traitline(60,
      List(new Trait(TOP, 2167), new Trait(MIDDLE, 2074), new Trait(BOTTOM, 2102)),
      List(new Trait(TOP, 2059), new Trait(MIDDLE, 2067), new Trait(BOTTOM, 2123)),
      List(new Trait(TOP, 2112), new Trait(MIDDLE, 2164), new Trait(BOTTOM, 2080)))
  private val harbingerTraits: Traitline =
    new Traitline(64,
      List(new Trait(TOP, 2188), new Trait(MIDDLE, 2219), new Trait(BOTTOM, 2185)),
      List(new Trait(TOP, 2192), new Trait(MIDDLE, 2220), new Trait(BOTTOM, 2209)),
      List(new Trait(TOP, 2218), new Trait(MIDDLE, 2194), new Trait(BOTTOM, 2203)))
  private val ritualistTraits: Traitline =
    new Traitline(76,
      List(new Trait(TOP, 2327), new Trait(MIDDLE, 2378), new Trait(BOTTOM, 2339)),
      List(new Trait(TOP, 2384), new Trait(MIDDLE, 2405), new Trait(BOTTOM, 2421)),
      List(new Trait(TOP, 2376), new Trait(MIDDLE, 2333), new Trait(BOTTOM, 2392)))

  private val mesmerTraitsV2: List[Traitline] = List(
    new Traitline(1,
      List(new Trait(TOP, 701), new Trait(MIDDLE, 705), new Trait(BOTTOM, 700)),
      List(new Trait(TOP, 1889), new Trait(MIDDLE, 1960), new Trait(BOTTOM, 708)),
      List(new Trait(TOP, 692), new Trait(MIDDLE, 1950), new Trait(BOTTOM, 704))),
    new Traitline(10,
      List(new Trait(TOP, 686), new Trait(MIDDLE, 682), new Trait(BOTTOM, 687)),
      List(new Trait(TOP, 693), new Trait(MIDDLE, 713), new Trait(BOTTOM, 712)),
      List(new Trait(TOP, 681), new Trait(MIDDLE, 680), new Trait(BOTTOM, 1688))),
    new Traitline(23,
      List(new Trait(TOP, 756), new Trait(MIDDLE, 738), new Trait(BOTTOM, 744)),
      List(new Trait(TOP, 751), new Trait(MIDDLE, 740), new Trait(BOTTOM, 1980)),
      List(new Trait(TOP, 2005), new Trait(MIDDLE, 1866), new Trait(BOTTOM, 752))),
    new Traitline(24,
      List(new Trait(TOP, 721), new Trait(MIDDLE, 1869), new Trait(BOTTOM, 691)),
      List(new Trait(TOP, 722), new Trait(MIDDLE, 729), new Trait(BOTTOM, 1690)),
      List(new Trait(TOP, 733), new Trait(MIDDLE, 2035), new Trait(BOTTOM, 753))),
    new Traitline(45,
      List(new Trait(TOP, 670), new Trait(MIDDLE, 675), new Trait(BOTTOM, 677)),
      List(new Trait(TOP, 673), new Trait(MIDDLE, 668), new Trait(BOTTOM, 669)),
      List(new Trait(TOP, 671), new Trait(MIDDLE, 674), new Trait(BOTTOM, 1687)))
  )

  private val chronomancerTraits: Traitline =
    new Traitline(40,
      List(new Trait(TOP, 1838), new Trait(MIDDLE, 1995), new Trait(BOTTOM, 1987)),
      List(new Trait(TOP, 2009), new Trait(MIDDLE, 1913), new Trait(BOTTOM, 1978)),
      List(new Trait(TOP, 1942), new Trait(MIDDLE, 2022), new Trait(BOTTOM, 1890)))
  private val mirageTraits: Traitline =
    new Traitline(59,
      List(new Trait(TOP, 2141), new Trait(MIDDLE, 2082), new Trait(BOTTOM, 2110)),
      List(new Trait(TOP, 2178), new Trait(MIDDLE, 2174), new Trait(BOTTOM, 2098)),
      List(new Trait(TOP, 2070), new Trait(MIDDLE, 2113), new Trait(BOTTOM, 2169)))
  private val virtuosoTraits: Traitline =
    new Traitline(66,
      List(new Trait(TOP, 2212), new Trait(MIDDLE, 2208), new Trait(BOTTOM, 2202)),
      List(new Trait(TOP, 2215), new Trait(MIDDLE, 2205), new Trait(BOTTOM, 2207)),
      List(new Trait(TOP, 2211), new Trait(MIDDLE, 2206), new Trait(BOTTOM, 2223)))
  private val troubadourTraits: Traitline =
    new Traitline(73,
      List(new Trait(TOP, 2427), new Trait(MIDDLE, 2326), new Trait(BOTTOM, 2432)),
      List(new Trait(TOP, 2343), new Trait(MIDDLE, 2367), new Trait(BOTTOM, 2422)),
      List(new Trait(TOP, 2353), new Trait(MIDDLE, 2414), new Trait(BOTTOM, 2441)))

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
    val classes = new Classes
    val roll = Math.round(Math.random() * 4).toInt
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
    val roll = Math.round(Math.random() * (traitRow.size - 1)).toInt
    traitRow(roll)
  }

  def eliteUltimateBravery(classRoll: String): (Int, List[(String, Int)]) = {
    val classes = new Classes
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
      case _ => (0, List())
    }
  }

  def newUltimateBravery(baseClass: String): (Int, List[(String, Int)]) = {
    val classes = new Classes
    val roll = Math.round(Math.random() * 4).toInt
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
      case _ => (0, List())
    }
  }

  def randomizeTraitline(traitlines: List[Traitline], roll: Int): (Int, List[(String, Int)]) = {
    val traitline: Traitline = traitlines(roll)

    var traits: List[(String,Int)] = List()

    for (i <- 0 to 2) {
      val traitRoll = Math.round(Math.random() * 2).toInt
      i match {
        case 0 => traits = traitline.getColumn1Traits(traitRoll) :: traits
        case 1 => traits = traitline.getColumn2Traits(traitRoll) :: traits
        case 2 => traits = traitline.getColumn3Traits(traitRoll) :: traits
        case _ => traits = ("error", 0) :: traits
      }
    }
    (traitline.getId, traits)
  }
}
