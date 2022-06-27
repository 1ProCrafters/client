package io.github.solclient.abstraction.mc.text;

import java.io.InputStream;

import org.jetbrains.annotations.NotNull;

public interface Font {

	static @NotNull Font createTrueType(@NotNull InputStream in) {
		throw new UnsupportedOperationException();
	}

	int render(@NotNull String text, int x, int y, int rgb);

	int render(@NotNull String text, int x, int y, int rgb, boolean shadow);

	int renderWithShadow(@NotNull String text, int x, int y, int rgb);

	int render(@NotNull Text text, int x, int y, int rgb);

	int render(@NotNull Text text, int x, int y, int rgb, boolean shadow);

	int renderWithShadow(@NotNull Text text, int x, int y, int rgb);

	int getWidth(char c);

	int getWidth(@NotNull String text);

	int getWidth(@NotNull Text text);

	int getHeight();

}
