package hw8;

// The Unicalc starter DB

import java.util.*;

class QuantityDB {
    static Map<String,Quantity> getDB()
    {
        List<String> emp = Collections.<String>emptyList();
        Map<String,Quantity> db = new HashMap<String,Quantity>();
        db.put("A", new Quantity(1.0, Arrays.asList("ampere"), Collections.<String>emptyList()));
        db.put("amp", new Quantity(1.0, Arrays.asList("ampere"), Collections.<String>emptyList()));
        db.put("amu", new Quantity(1.0, Arrays.asList("atomic_mass_unit"), Collections.<String>emptyList()));
        db.put("atomic_mass_unit", new Quantity(1.0, Arrays.asList("dalton"), Collections.<String>emptyList()));
        db.put("AU", new Quantity(1.0, Arrays.asList("astronomical_unit"), Collections.<String>emptyList()));
        db.put("bbl", new Quantity(1.0, Arrays.asList("barrel"), Collections.<String>emptyList()));
        db.put("C", new Quantity(1.0, Arrays.asList("coulomb"), Collections.<String>emptyList()));
        db.put("c", new Quantity(1.0, Arrays.asList("speed_of_light"), Collections.<String>emptyList()));
        db.put("cal", new Quantity(1.0, Arrays.asList("calorie"), Collections.<String>emptyList()));
        db.put("cd", new Quantity(1.0, Arrays.asList("candela"), Collections.<String>emptyList()));
        db.put("cm", new Quantity(1.0, Arrays.asList("centimeter"), Collections.<String>emptyList()));
        db.put("ev", new Quantity(1.0, Arrays.asList("electron_volt"), Collections.<String>emptyList()));
        db.put("feet", new Quantity(1.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("fl_oz", new Quantity(1.0, Arrays.asList("fluid_ounce"), Collections.<String>emptyList()));
        db.put("ft", new Quantity(1.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("F", new Quantity(1.0, Arrays.asList("farad"), Collections.<String>emptyList()));
        db.put("gev", new Quantity(1.0e9, Arrays.asList("ev"), Collections.<String>emptyList()));
        db.put("g", new Quantity(1.0, Arrays.asList("gram"), Collections.<String>emptyList()));
        db.put("G", new Quantity(1.0, Arrays.asList("gravitational_constant"), Collections.<String>emptyList()));
        db.put("h", new Quantity(1.0, Arrays.asList("Planck_constant"), Collections.<String>emptyList()));
        db.put("hp", new Quantity(1.0, Arrays.asList("horsepower"), Collections.<String>emptyList()));
        db.put("hr", new Quantity(1.0, Arrays.asList("hour"), Collections.<String>emptyList()));
        db.put("H", new Quantity(1.0, Arrays.asList("henry"), Collections.<String>emptyList()));
        db.put("Hz", new Quantity(1.0, Arrays.asList("hertz"), Collections.<String>emptyList()));
        db.put("hertz", new Quantity(1.0, Collections.<String>emptyList(), Arrays.asList("second")));
        db.put("in", new Quantity(1.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("inches", new Quantity(1.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("J", new Quantity(1.0, Arrays.asList("joule"), Collections.<String>emptyList()));
        db.put("kilogram", new Quantity(1.0, Arrays.asList("kg"), Collections.<String>emptyList()));
        db.put("kilometer", new Quantity(1000.0, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("kilowatt", new Quantity(1000.0, Arrays.asList("watt"), Collections.<String>emptyList()));
        db.put("km", new Quantity(1.0, Arrays.asList("kilometer"), Collections.<String>emptyList()));
        db.put("kph", new Quantity(1.0, Arrays.asList("kilometer"), Arrays.asList("hour")));
        db.put("kwh", new Quantity(1.0, Arrays.asList("hour", "kilowatt"), Collections.<String>emptyList()));
        db.put("l", new Quantity(1.0, Arrays.asList("liter"), Collections.<String>emptyList()));
        db.put("lb", new Quantity(1.0, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("litre", new Quantity(1.0, Arrays.asList("liter"), Collections.<String>emptyList()));
        db.put("lm", new Quantity(1.0, Arrays.asList("lumen"), Collections.<String>emptyList()));
        db.put("lx", new Quantity(1.0, Arrays.asList("lux"), Collections.<String>emptyList()));
        db.put("m", new Quantity(1.0, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("megohm", new Quantity(1000000.0, Arrays.asList("ohm"), Collections.<String>emptyList()));
        db.put("metre", new Quantity(1.0, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("mev", new Quantity(1000000.0, Arrays.asList("electron_volt"), Collections.<String>emptyList()));
        db.put("mho", new Quantity(1.0, Arrays.asList("siemens"), Collections.<String>emptyList()));
        db.put("microhm", new Quantity(1.0e-6, Arrays.asList("ohm"), Collections.<String>emptyList()));
        db.put("millimeter", new Quantity(1.0e-3, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("millisecond", new Quantity(1.0e-3, Arrays.asList("second"), Collections.<String>emptyList()));
        db.put("min", new Quantity(1.0, Arrays.asList("minute"), Collections.<String>emptyList()));
        db.put("mol", new Quantity(1.0, Arrays.asList("mole"), Collections.<String>emptyList()));
        db.put("mm", new Quantity(1.0, Arrays.asList("millimeter"), Collections.<String>emptyList()));
        db.put("mph", new Quantity(1.0, Arrays.asList("mile"), Arrays.asList("hour")));
        db.put("ms", new Quantity(1.0, Arrays.asList("millisecond"), Collections.<String>emptyList()));
        db.put("N", new Quantity(1.0, Arrays.asList("newton"), Collections.<String>emptyList()));
        db.put("qt", new Quantity(1.0, Arrays.asList("quart"), Collections.<String>emptyList()));
        db.put("pc", new Quantity(1.0, Arrays.asList("parsec"), Collections.<String>emptyList()));
        db.put("pi", new Quantity(3.14159265358979323846, Collections.<String>emptyList(), Collections.<String>emptyList()));
        db.put("psi", new Quantity(1.0, Arrays.asList("pound_force"), Arrays.asList("inch", "inch")));
        db.put("pt", new Quantity(1.0, Arrays.asList("pint"), Collections.<String>emptyList()));
        db.put("rpm", new Quantity(1.0, Arrays.asList("revolution"), Arrays.asList("minute")));
        db.put("S", new Quantity(1.0, Arrays.asList("siemens"), Collections.<String>emptyList()));
        db.put("s", new Quantity(1.0, Arrays.asList("second"), Collections.<String>emptyList()));
        db.put("sec", new Quantity(1.0, Arrays.asList("second"), Collections.<String>emptyList()));
        db.put("tbsp", new Quantity(1.0, Arrays.asList("tablespoon"), Collections.<String>emptyList()));
        db.put("tsp", new Quantity(1.0, Arrays.asList("teaspoon"), Collections.<String>emptyList()));
        db.put("T", new Quantity(1.0, Arrays.asList("tesla"), Collections.<String>emptyList()));
        db.put("us", new Quantity(1.0, Arrays.asList("microsecond"), Collections.<String>emptyList()));
        db.put("V", new Quantity(1.0, Arrays.asList("volt"), Collections.<String>emptyList()));
        db.put("W", new Quantity(1.0, Arrays.asList("watt"), Collections.<String>emptyList()));
        db.put("Wb", new Quantity(1.0, Arrays.asList("weber"), Collections.<String>emptyList()));
        db.put("yd", new Quantity(1.0, Arrays.asList("yard"), Collections.<String>emptyList()));
        db.put("yr", new Quantity(1.0, Arrays.asList("year"), Collections.<String>emptyList()));
        db.put("acre", new Quantity(43560.0, Arrays.asList("foot", "foot"), Collections.<String>emptyList()));
        db.put("apoth_dram", new Quantity(60.0, Arrays.asList("grain"), Collections.<String>emptyList()));
        db.put("apoth_ounce", new Quantity(480.0, Arrays.asList("grain"), Collections.<String>emptyList()));
        db.put("apoth_pound", new Quantity(5760.0, Arrays.asList("grain"), Collections.<String>emptyList()));
        db.put("are", new Quantity(100.0, Arrays.asList("meter", "meter"), Collections.<String>emptyList()));
        db.put("angstrom", new Quantity(0.0000000001, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("astronomical_unit", new Quantity(149600000000.0, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("atmosphere", new Quantity(1013250.0, Arrays.asList("pascal"), Collections.<String>emptyList()));
        db.put("bar", new Quantity(100000.0, Arrays.asList("pascal"), Collections.<String>emptyList()));
        db.put("barn", new Quantity(1.0e-28, Arrays.asList("meter", "meter"), Collections.<String>emptyList()));
        db.put("barrel", new Quantity(31.5, Arrays.asList("gallon"), Collections.<String>emptyList()));
        db.put("baryl", new Quantity(1.0, Arrays.asList("dyne"), Arrays.asList("centimeter", "centimeter")));
        db.put("baud", new Quantity(1.0, Arrays.asList("bit"), Arrays.asList("second")));
        db.put("bolt", new Quantity(40.0, Arrays.asList("yard"), Collections.<String>emptyList()));
        db.put("british_gallon", new Quantity(1.20095, Arrays.asList("gallon"), Collections.<String>emptyList()));
        db.put("btu", new Quantity(1055.06, Arrays.asList("joule"), Collections.<String>emptyList()));
        db.put("bucket", new Quantity(18180.0, Arrays.asList("centimeter", "centimeter", "centimeter"), Collections.<String>emptyList()));
        db.put("bushel", new Quantity(4.0, Arrays.asList("peck"), Collections.<String>emptyList()));
        db.put("byte", new Quantity(8.0, Arrays.asList("bit"), Collections.<String>emptyList()));
        db.put("cable", new Quantity(720.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("carat", new Quantity(200.0, Arrays.asList("milligram"), Collections.<String>emptyList()));
        db.put("caliber", new Quantity(0.001, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("calorie", new Quantity(4.1868, Arrays.asList("joule"), Collections.<String>emptyList()));
        db.put("candle", new Quantity(1.0, Arrays.asList("candela"), Collections.<String>emptyList()));
        db.put("centare", new Quantity(0.01, Arrays.asList("are"), Collections.<String>emptyList()));
        db.put("centimeter", new Quantity(0.01, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("century", new Quantity(10.0, Arrays.asList("decade"), Collections.<String>emptyList()));
        db.put("chain", new Quantity(66.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("chronon", new Quantity(1.0e-24, Arrays.asList("second"), Collections.<String>emptyList()));
        db.put("coulomb", new Quantity(1.0, Arrays.asList("ampere", "second"), Collections.<String>emptyList()));
        db.put("cup", new Quantity(0.5, Arrays.asList("pint"), Collections.<String>emptyList()));
        db.put("curie", new Quantity(3.7037e10, Arrays.asList("becquerel"), Collections.<String>emptyList()));
        db.put("dalton", new Quantity(1.6605654e-24, Arrays.asList("gram"), Collections.<String>emptyList()));
        db.put("daraf", new Quantity(1.0, Collections.<String>emptyList(), Arrays.asList("farad")));
        db.put("day", new Quantity(24.0, Arrays.asList("hour"), Collections.<String>emptyList()));
        db.put("decade", new Quantity(10.0, Arrays.asList("year"), Collections.<String>emptyList()));
        db.put("degree", new Quantity(0.005555555555555556, Arrays.asList("pi", "radian"), Collections.<String>emptyList()));
        db.put("dozen", new Quantity(12.0, Collections.<String>emptyList(), Collections.<String>emptyList()));
        db.put("dram", new Quantity(0.00390625, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("dry_barrel", new Quantity(105.0, Arrays.asList("dry_quart"), Collections.<String>emptyList()));
        db.put("dry_pint", new Quantity(0.5, Arrays.asList("dry_quart"), Collections.<String>emptyList()));
        db.put("dry_quart", new Quantity(67.2, Arrays.asList("inch", "inch", "inch"), Collections.<String>emptyList()));
        db.put("dyne", new Quantity(0.00001, Arrays.asList("newton"), Collections.<String>emptyList()));
        db.put("electron_volt", new Quantity(1.60218925e-20, Arrays.asList("joule"), Collections.<String>emptyList()));
        db.put("ell", new Quantity(45.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("em", new Quantity(0.167, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("en", new Quantity(0.5, Arrays.asList("em"), Collections.<String>emptyList()));
        db.put("erg", new Quantity(0.000001, Arrays.asList("joule"), Collections.<String>emptyList()));
        db.put("faraday", new Quantity(96490.0, Arrays.asList("coulomb"), Collections.<String>emptyList()));
        db.put("farad", new Quantity(1.0, Arrays.asList("coulomb"), Arrays.asList("volt")));
        db.put("fathom", new Quantity(6.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("fermi", new Quantity(1.0e-15, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("fluid_dram", new Quantity(0.125, Arrays.asList("fluid_ounce"), Collections.<String>emptyList()));
        db.put("fluid_ounce", new Quantity(0.125, Arrays.asList("cup"), Collections.<String>emptyList()));
        db.put("flux_unit", new Quantity(1.0e-26, Arrays.asList("second", "watt"), Arrays.asList("meter", "meter")));
        db.put("foot", new Quantity(12.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("fortnight", new Quantity(2.0, Arrays.asList("week"), Collections.<String>emptyList()));
        db.put("free_acceleration", new Quantity(9.80665, Arrays.asList("meter"), Arrays.asList("second", "second")));
        db.put("furlong", new Quantity(40.0, Arrays.asList("rod"), Collections.<String>emptyList()));
        db.put("gallon", new Quantity(231.0, Arrays.asList("inch", "inch", "inch"), Collections.<String>emptyList()));
        db.put("gauss", new Quantity(0.0001, Arrays.asList("tesla"), Collections.<String>emptyList()));
        db.put("gilbert", new Quantity(1.0, Arrays.asList("ampere", "turn"), Collections.<String>emptyList()));
        db.put("gill", new Quantity(0.25, Arrays.asList("pint"), Collections.<String>emptyList()));
        db.put("grain", new Quantity(0.000142857, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("gram", new Quantity(0.001, Arrays.asList("kg"), Collections.<String>emptyList()));
        db.put("grav", new Quantity(1.0, Arrays.asList("free_acceleration"), Collections.<String>emptyList()));
        db.put("gravitational_constant", new Quantity(6.67259e-11, Arrays.asList("meter", "meter", "newton"), Arrays.asList("kg", "kg")));
        db.put("gross", new Quantity(12.0, Arrays.asList("dozen"), Collections.<String>emptyList()));
        db.put("hectare", new Quantity(100.0, Arrays.asList("acre"), Collections.<String>emptyList()));
        db.put("henry", new Quantity(1.0, Collections.<String>emptyList(), Arrays.asList("ampere")));
        db.put("hand", new Quantity(4.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("hogshead", new Quantity(63.0, Arrays.asList("gallon"), Collections.<String>emptyList()));
        db.put("horsepower", new Quantity(550.0, Arrays.asList("foot", "pound_force"), Arrays.asList("second")));
        db.put("hour", new Quantity(60.0, Arrays.asList("minute"), Collections.<String>emptyList()));
        db.put("inch", new Quantity(0.0254, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("joule", new Quantity(1.0, Arrays.asList("kg", "meter", "meter"), Arrays.asList("second", "second")));
        db.put("kilogram_force", new Quantity(1.0, Arrays.asList("free_acceleration", "kg"), Collections.<String>emptyList()));
        db.put("knot", new Quantity(1.0, Arrays.asList("nautical_mile"), Arrays.asList("hour")));
        db.put("lambert", new Quantity(3.142, Arrays.asList("candela"), Arrays.asList("centimeter", "centimeter")));
        db.put("league", new Quantity(3.0, Arrays.asList("mile"), Collections.<String>emptyList()));
        db.put("light_year", new Quantity(9.46073e15, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("link", new Quantity(7.92, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("liter", new Quantity(1000.0, Arrays.asList("centimeter", "centimeter", "centimeter"), Collections.<String>emptyList()));
        db.put("long_ton", new Quantity(2240.0, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("lumen", new Quantity(1.0, Arrays.asList("candela", "steradian"), Collections.<String>emptyList()));
        db.put("lux", new Quantity(1.0, Arrays.asList("lumen"), Arrays.asList("meter", "meter")));
        db.put("maxwell", new Quantity(0.00000001, Arrays.asList("weber"), Collections.<String>emptyList()));
        db.put("metric_ton", new Quantity(1000.0, Arrays.asList("kg"), Collections.<String>emptyList()));
        db.put("micron", new Quantity(0.000001, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("mil", new Quantity(0.001, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("mile", new Quantity(8.0, Arrays.asList("furlong"), Collections.<String>emptyList()));
        db.put("millenium", new Quantity(10.0, Arrays.asList("century"), Collections.<String>emptyList()));
        db.put("minute", new Quantity(60.0, Arrays.asList("second"), Collections.<String>emptyList()));
        db.put("mole", new Quantity(6.02253e23, Collections.<String>emptyList(), Collections.<String>emptyList()));
        db.put("nautical_mile", new Quantity(1.15078, Arrays.asList("mile"), Collections.<String>emptyList()));
        db.put("newton", new Quantity(1.0, Arrays.asList("joule"), Arrays.asList("meter")));
        db.put("ohm", new Quantity(1.0, Arrays.asList("volt"), Arrays.asList("ampere")));
        db.put("oil_barrel", new Quantity(42.0, Arrays.asList("gallon"), Collections.<String>emptyList()));
        db.put("ounce", new Quantity(0.0625, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("parsec", new Quantity(3.085678e16, Arrays.asList("meter"), Collections.<String>emptyList()));
        db.put("pascal", new Quantity(1.0, Arrays.asList("newton"), Arrays.asList("meter", "meter")));
        db.put("Planck_constant", new Quantity(6.626076e-34, Arrays.asList("joule", "second"), Collections.<String>emptyList()));
        db.put("peck", new Quantity(8.0, Arrays.asList("dry_quart"), Collections.<String>emptyList()));
        db.put("pennyweight", new Quantity(24.0, Arrays.asList("grain"), Collections.<String>emptyList()));
        db.put("pica", new Quantity(12.0, Arrays.asList("point"), Collections.<String>emptyList()));
        db.put("pint", new Quantity(0.5, Arrays.asList("quart"), Collections.<String>emptyList()));
        db.put("point", new Quantity(0.013837, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("poise", new Quantity(0.1, Arrays.asList("pascal"), Arrays.asList("second")));
        db.put("pound", new Quantity(0.45359237, Arrays.asList("kg"), Collections.<String>emptyList()));
        db.put("pound_force", new Quantity(1.0, Arrays.asList("free_acceleration", "pound"), Collections.<String>emptyList()));
        db.put("poundal", new Quantity(1.0, Arrays.asList("foot", "pound"), Arrays.asList("second", "second")));
        db.put("quadrant", new Quantity(90.0, Arrays.asList("degree"), Collections.<String>emptyList()));
        db.put("quart", new Quantity(0.25, Arrays.asList("gallon"), Collections.<String>emptyList()));
        db.put("revolution", new Quantity(4.0, Arrays.asList("quadrant"), Collections.<String>emptyList()));
        db.put("reyn", new Quantity(68947.6, Arrays.asList("poise"), Collections.<String>emptyList()));
        db.put("rod", new Quantity(16.5, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("rood", new Quantity(0.25, Arrays.asList("acre"), Collections.<String>emptyList()));
        db.put("rope", new Quantity(20.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("scruple", new Quantity(20.0, Arrays.asList("grain"), Collections.<String>emptyList()));
        db.put("section", new Quantity(1.0, Arrays.asList("mile", "mile"), Collections.<String>emptyList()));
        db.put("siemens", new Quantity(1.0, Arrays.asList("ampere"), Arrays.asList("volt")));
        db.put("skein", new Quantity(360.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("slug", new Quantity(32.1740, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("span", new Quantity(9.0, Arrays.asList("inch"), Collections.<String>emptyList()));
        db.put("speed_of_light", new Quantity(299792458.0, Arrays.asList("meter"), Arrays.asList("second")));
        db.put("stadion", new Quantity(622.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("stadium", new Quantity(202.0, Arrays.asList("yard"), Collections.<String>emptyList()));
        db.put("stokes", new Quantity(0.0001, Arrays.asList("meter", "meter"), Arrays.asList("second")));
        db.put("survey_mile", new Quantity(320.0, Arrays.asList("rod"), Collections.<String>emptyList()));
        db.put("tablespoon", new Quantity(0.5, Arrays.asList("fluid_ounce"), Collections.<String>emptyList()));
        db.put("teaspoon", new Quantity(0.33333333333333, Arrays.asList("tablespoon"), Collections.<String>emptyList()));
        db.put("tesla", new Quantity(1.0, Arrays.asList("weber"), Arrays.asList("meter", "meter")));
        db.put("therm", new Quantity(1.0e5, Arrays.asList("btu"), Collections.<String>emptyList()));
        db.put("ton", new Quantity(2000.0, Arrays.asList("pound"), Collections.<String>emptyList()));
        db.put("torr", new Quantity(0.001315789473684210526, Arrays.asList("atmosphere"), Collections.<String>emptyList()));
        db.put("township", new Quantity(36.0, Arrays.asList("section"), Collections.<String>emptyList()));
        db.put("troy_ounce", new Quantity(20.0, Arrays.asList("pennyweight"), Collections.<String>emptyList()));
        db.put("troy_pound", new Quantity(12.0, Arrays.asList("troy_ounce"), Collections.<String>emptyList()));
        db.put("volt", new Quantity(1.0, Arrays.asList("joule"), Arrays.asList("coulomb")));
        db.put("watt", new Quantity(1.0, Arrays.asList("joule"), Arrays.asList("second")));
        db.put("weber", new Quantity(1.0, Arrays.asList("volt"), Arrays.asList("second")));
        db.put("week", new Quantity(7.0, Arrays.asList("day"), Collections.<String>emptyList()));
        db.put("yard", new Quantity(3.0, Arrays.asList("foot"), Collections.<String>emptyList()));
        db.put("year", new Quantity(365.25, Arrays.asList("day"), Collections.<String>emptyList()));
        
        return db;
    }
}
