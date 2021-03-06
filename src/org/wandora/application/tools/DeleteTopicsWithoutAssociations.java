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
 * 
 * DeleteTopicsWithoutAssociations.java
 *
 * Created on 9. huhtikuuta 2006, 21:42
 *
 */

package org.wandora.application.tools;




import org.wandora.topicmap.*;
import org.wandora.application.*;


/**
 *
 * @author akivela
 */
public class DeleteTopicsWithoutAssociations extends DeleteTopics implements WandoraTool {

            
            
    
    public DeleteTopicsWithoutAssociations() {
    }
    

    @Override
    public String getName() {
        return "Delete topic(s) without associations";
    }

    @Override
    public String getDescription() {
        return "Delete context topics without associations.";
    }


    @Override
    public boolean shouldDelete(Topic topic) {
        try {
            if(topic != null && !topic.isRemoved()) {
                if(topic.getAssociations().isEmpty()) {
                    if(confirm) {
                        return confirmDelete(topic);
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        catch(Exception e) {
            log(e);
        }
        return false;
    }
    
}
