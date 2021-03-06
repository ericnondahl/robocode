/**
 * Copyright (c) 2001-2014 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 */
package net.sf.robocode.ui;


import java.awt.*;

import net.sf.robocode.settings.ISettingsManager;
import net.sf.robocode.ui.gfx.RenderImage;


/**
 * @author Pavel Savara (original)
 */
public interface IImageManager {
	void initialize();

	Image getGroundTileImage(int index);

	RenderImage getExplosionRenderImage(int which, int frame);

	RenderImage getExplosionDebriseRenderImage();

	RenderImage getColoredBodyRenderImage(Integer color);

	RenderImage getColoredGunRenderImage(Integer color);

	RenderImage getColoredRadarRenderImage(Integer color);
	
	int getGroundTileWidth();
	
	int getGroundTileHeight();
	
	int getGroundTileCount();
	
	Color getTextColor();
	
	Color getBattleBorderColor();
	
	Font getSmallFont(double scale);
	
	Color getBulletColor(ISettingsManager settings, Color bulletColor);
	
	double getBulletScaler();
	
	float getScanAlpha();
}
