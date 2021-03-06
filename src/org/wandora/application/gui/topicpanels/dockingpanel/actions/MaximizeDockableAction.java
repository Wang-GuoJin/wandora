/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2016 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.wandora.application.gui.topicpanels.dockingpanel.actions;

import bibliothek.gui.Dockable;
import bibliothek.gui.dock.action.actions.SimpleButtonAction;
import bibliothek.gui.dock.station.split.SplitFullScreenAction;
import org.wandora.application.gui.UIBox;
import org.wandora.application.gui.topicpanels.DockingFramePanel;

/**
 *
 * @author akivela
 */


public class MaximizeDockableAction extends SimpleButtonAction {
    private DockingFramePanel dockingFramePanel = null;
    
    
    
    
    public MaximizeDockableAction(DockingFramePanel dfp) {
        super(false);
        this.dockingFramePanel = dfp;
        this.setIcon( UIBox.getIcon("gui/icons/maximize_dockable.png") );
    }
    

    @Override
    public String getText(Dockable dckbl) {
        return "Maximize dockable";
    }

    @Override
    public String getTooltipText(Dockable dckbl) {
        return "Maximize (and normalize) dockable";
    }

    @Override
    public void action(Dockable dockable) {
        System.out.println("ACTION MaximizeDockableAction TRIGGERED");
        try {
            dockingFramePanel.maximizeDockable(dockable);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
