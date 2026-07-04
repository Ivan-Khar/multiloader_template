package one.theaq.template.data;

//? if fabric {

import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

@Entrypoint("fabric-datagen")
public final class TemplateDataGen implements DataGeneratorEntrypoint {
	
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	
	}
}
//?} else {
/*
import one.theaq.template.Template;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Template.MOD_ID)
public final class TemplateDataGen {

	@SubscribeEvent
	public static void gatherServerData(GatherDataEvent.Server event) {
	
	}

	@SubscribeEvent
	public static void gatherClientData(GatherDataEvent.Client event) {

	}
}

*///?}