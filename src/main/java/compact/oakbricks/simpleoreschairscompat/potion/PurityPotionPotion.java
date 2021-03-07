
package compact.oakbricks.simpleoreschairscompat.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;

import compact.oakbricks.simpleoreschairscompat.SimpleoreschairscompatModElements;

@SimpleoreschairscompatModElements.ModElement.Tag
public class PurityPotionPotion extends SimpleoreschairscompatModElements.ModElement {
	@ObjectHolder("simpleoreschairscompat:purity_potion")
	public static final Effect potion = null;
	@ObjectHolder("simpleoreschairscompat:purity_potion")
	public static final Potion potionType = null;
	public PurityPotionPotion(SimpleoreschairscompatModElements instance) {
		super(instance, 11);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("purity_potion");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.BENEFICIAL, -13369345);
			setRegistryName("purity_potion");
			potionIcon = new ResourceLocation("simpleoreschairscompat:textures/purpi_ore_emerald_style.png");
		}

		@Override
		public String getName() {
			return "effect.purity_potion";
		}

		@Override
		public boolean isBeneficial() {
			return true;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
