package io.github.solclient.client.v1_8_9.mixins.platform.mc.util;

import org.jetbrains.annotations.*;
import org.spongepowered.asm.mixin.*;

import io.github.solclient.client.platform.mc.maths.Vec3d;
import io.github.solclient.client.platform.mc.util.*;
import lombok.experimental.UtilityClass;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.*;

@UtilityClass
@Mixin(MinecraftUtil.class)
public class MinecraftUtilImpl {

	@Overwrite(remap = false)
	public @NotNull OperatingSystem getOperatingSystem() {
		return (OperatingSystem) (Object) Util.getOperatingSystem();
	}

	@Overwrite(remap = false)
	public @Nullable Vec3d getCameraPos() {
		Entity entity = MinecraftClient.getInstance().getCameraEntity();

		if(entity != null) {
			return (Vec3d) Camera.getEntityPos(entity, 1);
		}

		return null;
	}

	@Overwrite(remap = false)
	public void copy(@Nullable String text) {
		Screen.setClipboard(text);
	}

	@Overwrite(remap = false)
	public @NotNull String getClipboardContent() {
		String result = Screen.getClipboard();

		// Documentation doesn't seem to guarantee that the string is not-null.
		if(result == null) {
			return "";
		}

		return result;
	}

	@Overwrite(remap = false)
	public boolean isAllowedInTextBox(char character) {
		return SharedConstants.isValidChar(character);
	}

	@Overwrite(remap = false)
	public @NotNull String filterTextBoxInput(@NotNull final String text) {
		return SharedConstants.stripInvalidChars(text);
	}

}
