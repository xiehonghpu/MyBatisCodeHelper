package com.ccnode.codegenerator.pojo;

import com.ccnode.codegenerator.database.DatabaseComponenent;
import com.ccnode.codegenerator.myconfigurable.DataBaseConstants;

import java.util.Map;

/**
 * Created by bruce.ge on 2016/12/20.
 */
public class FieldToColumnRelation {
    private String resultMapId;

    private Map<String, String> filedToColumnMap;

    public String getResultMapId() {
        return resultMapId;
    }

    public void setResultMapId(String resultMapId) {
        this.resultMapId = resultMapId;
    }

    public Map<String, String> getFiledToColumnMap() {
        return filedToColumnMap;
    }

    public void setFiledToColumnMap(Map<String, String> filedToColumnMap) {
        this.filedToColumnMap = filedToColumnMap;
    }

    public String getPropColumn(String prop) {
        if (DatabaseComponenent.currentDatabase().equals(DataBaseConstants.MYSQL)) {
            return "`" + filedToColumnMap.get(prop.toLowerCase()) + "`";
        } else {
            return filedToColumnMap.get(prop.toLowerCase());
        }
    }
}
