package net.sf.robocode.ui;

import java.awt.*;

import net.sf.robocode.settings.ISettingsManager;
import net.sf.robocode.ui.gfx.RenderImage;

public class ImageManagerWrapper implements IImageManager {

	private IImageManager manager;
	
	public ImageManagerWrapper(ISettingsManager properties) {
		
		if(properties.getOptionsRenderingUseClassicGraphics()) {
			this.manager = new ImageManager(properties);
		}
		else {
			this.manager = new ImageManagerUpdate(properties);
		}
	}
	
	@Override
	public void initialize() {
		manager.initialize();
	}

	@Override
	public Image getGroundTileImage(int index) {
		return manager.getGroundTileImage(index);
	}

	@Override
	public RenderImage getExplosionRenderImage(int which, int frame) {
		return manager.getExplosionRenderImage(which, frame);
	}

	@Override
	public RenderImage getExplosionDebriseRenderImage() {
		return manager.getExplosionDebriseRenderImage();
	}

	@Override
	public RenderImage getColoredBodyRenderImage(Integer color) {
		return manager.getColoredBodyRenderImage(color);
	}

	@Override
	public RenderImage getColoredGunRenderImage(Integer color) {
		return manager.getColoredGunRenderImage(color);
	}

	@Override
	public RenderImage getColoredRadarRenderImage(Integer color) {
		return manager.getColoredRadarRenderImage(color);
	}

	@Override
	public int getGroundTileWidth() {
		return manager.getGroundTileWidth();
	}

	@Override
	public int getGroundTileHeight() {
		return manager.getGroundTileHeight();
	}

	@Override
	public int getGroundTileCount() {
		return manager.getGroundTileCount();
	}

	@Override
	public Color getTextColor() {
		return manager.getTextColor();
	}

	@Override
	public Color getBattleBorderColor() {
		return manager.getBattleBorderColor();
	}

	@Override
	public Font getSmallFont(double scale) {
		return manager.getSmallFont(scale);
	}

	@Override
	public Color getBulletColor(ISettingsManager settings, Color bulletColor) {
		return manager.getBulletColor(settings, bulletColor);
	}

	@Override
	public double getBulletScaler() {
		return manager.getBulletScaler();
	}

	@Override
	public float getScanAlpha() {
		return manager.getScanAlpha();
	}

}
