package com.lsmri.welding.mbg.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Cui Yicheng
 * @date 2020-10-13
 */
public class RenameJavaClientPlugin extends PluginAdapter {

    private Pattern pattern;
    private String replaceString;


    @Override
    public boolean validate(List<String> warnings) {
        String searchString = properties.getProperty("searchString");
        pattern = Pattern.compile(searchString);
        replaceString = properties.getProperty("replaceString");
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        String type = introspectedTable.getMyBatis3JavaMapperType();
        Matcher matcher = pattern.matcher(type);
        type = matcher.replaceAll(replaceString);
        introspectedTable.setMyBatis3JavaMapperType(type);
    }
}
