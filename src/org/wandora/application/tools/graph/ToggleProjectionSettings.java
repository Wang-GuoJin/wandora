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
 * 
 * ToggleProjectionSettings.java
 *
 * Created on 16. heinäkuuta 2007, 13:34
 *
 */

package org.wandora.application.tools.graph;

import org.wandora.application.*;
import org.wandora.application.contexts.*;
import org.wandora.application.gui.topicpanels.graphpanel.*;


/**
 *
 * @author akivela
 */
public class ToggleProjectionSettings extends AbstractGraphTool implements WandoraTool {
    


    
    /** Creates a new instance of ToggleProjectionSettings */
    public ToggleProjectionSettings(TopicMapGraphPanel gp) {
        super(gp);
        this.setContext(new GraphNodeContext());
    }
    
    
    @Override
    public String getName(){
        return "Toggle projection settings";
    }
    
    
    @Override
    public void executeSynchronized(Wandora admin, Context context) {
        TopicMapGraphPanel graphPanel = this.solveGraphPanel(admin, context);
        if(graphPanel != null) {
            try {
                graphPanel.getProjection().useNextProjectionSettings();
            }
            catch(Exception e) {
                System.out.println("Exception occurred in toggle projection settings.");
                singleLog(e);
            }
        }
    }    
}
