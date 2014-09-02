package exaliquo.bridges.Metallurgy;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.blocks.AliquoOre;
import exaliquo.items.blocks.ItemBlockOre;

public class MBlockRegistry
{
    public static Block adamantineOreBlock;
    public static Block alduoriteOreBlock;
    public static Block astralsilverOreBlock;
    public static Block atlarusOreBlock;
    public static Block carmotOreBlock;
    public static Block ceruclaseOreBlock;
    public static Block deepironOreBlock;
    public static Block eximiteOreBlock;
    public static Block ignatiusOreBlock;
    public static Block infuscoliumOreBlock;
    public static Block kalendriteOreBlock;
    public static Block lemuriteOreBlock;
    public static Block manganeseOreBlock;
    public static Block meutoiteOreBlock;
    public static Block midasiumOreBlock;
    public static Block mithrilOreBlock;
    public static Block orichalcumOreBlock;
    public static Block oureclaseOreBlock;
    public static Block prometheumOreBlock;
    public static Block rubraciumOreBlock;
    public static Block sanguiniteOreBlock;
    public static Block shadowironOreBlock;
    public static Block vulcaniteOreBlock;
    public static Block vyroxeresOreBlock;
    public static Block zincOreBlock;
    
    public static void registerOreBlocks() 
    {
        adamantineOreBlock = new AliquoOre().setBlockName("Adamantine");
        GameRegistry.registerBlock(adamantineOreBlock, ItemBlockOre.class, "ExAliquo.AdamantineOreBlock");
        alduoriteOreBlock = new AliquoOre().setBlockName("Alduorite");
        GameRegistry.registerBlock(alduoriteOreBlock, ItemBlockOre.class, "ExAliquo.AlduoriteOreBlock");
        astralsilverOreBlock = new AliquoOre().setBlockName("AstralSilver");
        GameRegistry.registerBlock(astralsilverOreBlock, ItemBlockOre.class, "ExAliquo.AstralSilverOreBlock");
        atlarusOreBlock = new AliquoOre().setBlockName("Atlarus");
        GameRegistry.registerBlock(atlarusOreBlock, ItemBlockOre.class, "ExAliquo.AtlarusOreBlock");
        carmotOreBlock = new AliquoOre().setBlockName("Carmot");
        GameRegistry.registerBlock(carmotOreBlock, ItemBlockOre.class, "ExAliquo.CarmotOreBlock");
        ceruclaseOreBlock = new AliquoOre().setBlockName("Ceruclase");
        GameRegistry.registerBlock(ceruclaseOreBlock, ItemBlockOre.class, "ExAliquo.CeruclaseOreBlock");
        deepironOreBlock = new AliquoOre().setBlockName("DeepIron");
        GameRegistry.registerBlock(deepironOreBlock, ItemBlockOre.class, "ExAliquo.DeepIronOreBlock");
        eximiteOreBlock = new AliquoOre().setBlockName("Eximite");
        GameRegistry.registerBlock(eximiteOreBlock, ItemBlockOre.class, "ExAliquo.EximiteOreBlock");
        ignatiusOreBlock = new AliquoOre().setBlockName("Ignatius");
        GameRegistry.registerBlock(ignatiusOreBlock, ItemBlockOre.class, "ExAliquo.IgnatiusOreBlock");
        infuscoliumOreBlock = new AliquoOre().setBlockName("Infuscolium");
        GameRegistry.registerBlock(infuscoliumOreBlock, ItemBlockOre.class, "ExAliquo.InfuscoliumOreBlock");
        kalendriteOreBlock = new AliquoOre().setBlockName("Kalendrite");
        GameRegistry.registerBlock(kalendriteOreBlock, ItemBlockOre.class, "ExAliquo.KalendriteOreBlock");
        lemuriteOreBlock = new AliquoOre().setBlockName("Lemurite");
        GameRegistry.registerBlock(lemuriteOreBlock, ItemBlockOre.class, "ExAliquo.LemuriteOreBlock");
        manganeseOreBlock = new AliquoOre().setBlockName("Manganese");
        GameRegistry.registerBlock(manganeseOreBlock, ItemBlockOre.class, "Exaliquo.ManganeseOreBlock");
        meutoiteOreBlock = new AliquoOre().setBlockName("Meutoite");
        GameRegistry.registerBlock(meutoiteOreBlock, ItemBlockOre.class, "ExAliquo.MeuroiteOreBlock");
        midasiumOreBlock = new AliquoOre().setBlockName("Midasium");
        GameRegistry.registerBlock(midasiumOreBlock, ItemBlockOre.class, "ExAliquo.MidasiumOreBlock");
        mithrilOreBlock = new AliquoOre().setBlockName("Mithril");
        GameRegistry.registerBlock(mithrilOreBlock, ItemBlockOre.class, "ExAliquo.MithrilOreBlock");
        orichalcumOreBlock = new AliquoOre().setBlockName("Orichalcum");
        GameRegistry.registerBlock(orichalcumOreBlock, ItemBlockOre.class, "ExAliquo.OrichalcumOreBlock");
        oureclaseOreBlock = new AliquoOre().setBlockName("Oureclase");
        GameRegistry.registerBlock(oureclaseOreBlock, ItemBlockOre.class, "ExAliquo.OureclaseOreBlock");
        prometheumOreBlock = new AliquoOre().setBlockName("Prometheum");
        GameRegistry.registerBlock(prometheumOreBlock, ItemBlockOre.class, "ExAliquo.PromethiumOreBlock");
        rubraciumOreBlock = new AliquoOre().setBlockName("Rubracium");
        GameRegistry.registerBlock(rubraciumOreBlock, ItemBlockOre.class, "ExAliquo.RubraciumOreBlock");
        sanguiniteOreBlock = new AliquoOre().setBlockName("Sanguinite");
        GameRegistry.registerBlock(sanguiniteOreBlock, ItemBlockOre.class, "ExAliquo.SanguinuteOreBlock");
        shadowironOreBlock = new AliquoOre().setBlockName("ShadowIron");
        GameRegistry.registerBlock(shadowironOreBlock, ItemBlockOre.class, "ExAliquo.ShadowIronOreBlock");
        vulcaniteOreBlock = new AliquoOre().setBlockName("Vulcanite");
        GameRegistry.registerBlock(vulcaniteOreBlock, ItemBlockOre.class, "ExAliquo.VulcaniteOreBlock");
        vyroxeresOreBlock = new AliquoOre().setBlockName("Vyroxeres");
        GameRegistry.registerBlock(vyroxeresOreBlock, ItemBlockOre.class, "ExAliquo.VyroxeresOreBlock");
        zincOreBlock = new AliquoOre().setBlockName("Zinc");
        GameRegistry.registerBlock(zincOreBlock, ItemBlockOre.class, "ExAliquo.ZincOreBlock");
    }
}
