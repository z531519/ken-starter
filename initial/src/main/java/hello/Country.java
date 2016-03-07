/*	$ Header: $
 *
 *	Copyright 2016 NCS Pearson, Inc. All rights reserved.
 */

package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ken De Leon
 * @version $Revision: #1 $ submitted $DateTime: 2013/08/29 10:34:55 $ by $Author: vdeleke $
 */
@Entity
public class Country {
    @Id
    String code;
    String name;
    String language;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
