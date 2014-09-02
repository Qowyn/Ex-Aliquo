package exaliquo.bridges.Metallurgy;

import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.items.AliquoItemOre;
import net.minecraft.item.Item;

public class MItemRegistry
{
    public static Item adamantineOreItem;
    public static Item alduoriteOreItem;
    public static Item astralsilverOreItem;
    public static Item atlarusOreItem;
    public static Item carmotOreItem;
    public static Item ceruclaseOreItem;
    public static Item deepironOreItem;
    public static Item eximiteOreItem;
    public static Item ignatiusOreItem;
    public static Item infuscoliumOreItem;
    public static Item kalendriteOreItem;
    public static Item lemuriteOreItem;
    public static Item manganeseOreItem;
    public static Item meutoiteOreItem;
    public static Item midasiumOreItem;
    public static Item mithrilOreItem;
    public static Item orichalcumOreItem;
    public static Item oureclaseOreItem;
    public static Item prometheumOreItem;
    public static Item rubraciumOreItem;
    public static Item sanguiniteOreItem;
    public static Item shadowironOreItem;
    public static Item vulcaniteOreItem;
    public static Item vyroxeresOreItem;
    public static Item zincOreItem;

    public static void registerOreItems()
    {
        adamantineOreItem = new AliquoItemOre().setUnlocalizedName("Adamantine");
        GameRegistry.registerItem(adamantineOreItem, "ExAliquo.OreAdamantineItem");
        alduoriteOreItem = new AliquoItemOre().setUnlocalizedName("Alduorite");
        GameRegistry.registerItem(alduoriteOreItem, "ExAliquo.OreAlduoriteItem");
        astralsilverOreItem = new AliquoItemOre().setUnlocalizedName("AstralSilver");
        GameRegistry.registerItem(astralsilverOreItem, "ExAliquo.OreAstralSilverItem");
        atlarusOreItem = new AliquoItemOre().setUnlocalizedName("Atlarus");
        GameRegistry.registerItem(atlarusOreItem, "ExAliquo.OreAtlarusItem");
        carmotOreItem = new AliquoItemOre().setUnlocalizedName("Carmot");
        GameRegistry.registerItem(carmotOreItem, "ExAliquo.CarmotOreItem");
        ceruclaseOreItem = new AliquoItemOre().setUnlocalizedName("Ceruclase");
        GameRegistry.registerItem(ceruclaseOreItem, "ExAliquo.CeruclaseOreItem");
        deepironOreItem = new AliquoItemOre().setUnlocalizedName("DeepIron");
        GameRegistry.registerItem(deepironOreItem, "ExAliquo.DeepIronOreItem");
        eximiteOreItem = new AliquoItemOre().setUnlocalizedName("Eximite");
        GameRegistry.registerItem(eximiteOreItem, "ExAliquo.EximiteOreItem");
        ignatiusOreItem = new AliquoItemOre().setUnlocalizedName("Ignatius");
        GameRegistry.registerItem(ignatiusOreItem, "ExAliquo.IgnatiusOreItem");
        infuscoliumOreItem = new AliquoItemOre().setUnlocalizedName("Infuscolium");
        GameRegistry.registerItem(infuscoliumOreItem, "ExAliquo.InfuscoliumOreItem");
        kalendriteOreItem = new AliquoItemOre().setUnlocalizedName("Kalendrite");
        GameRegistry.registerItem(kalendriteOreItem, "ExAliquo.KalendriteOreItem");
        lemuriteOreItem = new AliquoItemOre().setUnlocalizedName("Lemurite");
        GameRegistry.registerItem(lemuriteOreItem, "ExAliquo.LemuriteOreItem");
        manganeseOreItem = new AliquoItemOre().setUnlocalizedName("Manganese");
        GameRegistry.registerItem(manganeseOreItem, "Exaliquo.ManganeseOreItem");
        meutoiteOreItem = new AliquoItemOre().setUnlocalizedName("Meuroite");
        GameRegistry.registerItem(meutoiteOreItem, "ExAliquo.MeuroiteOreItem");
        midasiumOreItem = new AliquoItemOre().setUnlocalizedName("Midasium");
        GameRegistry.registerItem(midasiumOreItem, "ExAliquo.MidasiumOreItem");
        mithrilOreItem = new AliquoItemOre().setUnlocalizedName("Mithril");
        GameRegistry.registerItem(mithrilOreItem, "ExAliquo.MithrilOreItem");
        orichalcumOreItem = new AliquoItemOre().setUnlocalizedName("Orichalcum");
        GameRegistry.registerItem(orichalcumOreItem, "ExAliquo.OrichalcumOreItem");
        oureclaseOreItem = new AliquoItemOre().setUnlocalizedName("Oureclase");
        GameRegistry.registerItem(oureclaseOreItem, "ExAliquo.OureclaseOreItem");
        prometheumOreItem = new AliquoItemOre().setUnlocalizedName("Prometheum");
        GameRegistry.registerItem(prometheumOreItem, "ExAliquo.PromethiumOreItem");
        rubraciumOreItem = new AliquoItemOre().setUnlocalizedName("Rubracium");
        GameRegistry.registerItem(rubraciumOreItem, "ExAliquo.RubraciumOreItem");
        sanguiniteOreItem = new AliquoItemOre().setUnlocalizedName("Sanguinite");
        GameRegistry.registerItem(sanguiniteOreItem, "ExAliquo.SanguinuteOreItem");
        shadowironOreItem = new AliquoItemOre().setUnlocalizedName("ShadowIron");
        GameRegistry.registerItem(shadowironOreItem, "ExAliquo.ShadowIronOreItem");
        vulcaniteOreItem = new AliquoItemOre().setUnlocalizedName("Vulcanite");
        GameRegistry.registerItem(vulcaniteOreItem, "ExAliquo.VulcaniteOreItem");
        vyroxeresOreItem = new AliquoItemOre().setUnlocalizedName("Vyroxeres");
        GameRegistry.registerItem(vyroxeresOreItem, "ExAliquo.VyroxeresOreItem");
        zincOreItem = new AliquoItemOre().setUnlocalizedName("Zinc");
        GameRegistry.registerItem(zincOreItem, "ExAliquo.ZincOreItem");
    }
}
