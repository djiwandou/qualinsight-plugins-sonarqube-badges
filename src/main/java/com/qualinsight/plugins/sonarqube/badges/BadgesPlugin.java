/*
 * qualinsight-plugins-sonarqube-badges
 * Copyright (c) 2015-2016, QualInsight
 * http://www.qualinsight.com/
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program. If not, you can retrieve a copy
 * from <http://www.gnu.org/licenses/>.
 */
package com.qualinsight.plugins.sonarqube.badges;

import org.sonar.api.Plugin;
import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
import com.qualinsight.plugins.sonarqube.badges.ws.BadgesWebService;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageMinimizer;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeRequestHandler;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeRequestHandler;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeRequestHandler;

/**
 * Core BadgesPlugin class. It declares all extensions used by the plugin.
 *
 * @author Michel Pawlak
 */
public final class BadgesPlugin implements Plugin {

    @Override
    public void define(final Context context) {
        context.addExtension(FontProviderLocator.class);
        context.addExtension(SVGImageMinimizer.class);
        context.addExtension(SVGImageGenerator.class);
        context.addExtension(QualityGateBadgeRequestHandler.class);
        context.addExtension(QualityGateBadgeGenerator.class);
        context.addExtension(QualityGateBadgeAction.class);
        context.addExtension(MeasureBadgeRequestHandler.class);
        context.addExtension(MeasureBadgeGenerator.class);
        context.addExtension(MeasureBadgeAction.class);
        context.addExtension(CeActivityBadgeRequestHandler.class);
        context.addExtension(CeActivityBadgeGenerator.class);
        context.addExtension(CeActivityBadgeAction.class);
        context.addExtension(BadgesWebService.class);
        context.addExtensions(BadgesPluginProperties.properties());
    }
}
