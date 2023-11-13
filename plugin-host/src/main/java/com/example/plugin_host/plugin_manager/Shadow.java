package com.example.plugin_host.plugin_manager;


import com.tencent.shadow.dynamic.host.DynamicPluginManager;
import com.tencent.shadow.dynamic.host.PluginManager;

import java.io.File;
/**
 * Author: hank.liu
 * Date: 2023/11/12
 * Copyright: www.xgimi.com Inc. All rights reserved.
 * Desc:
 */
public class Shadow {
    public static PluginManager getPluginManager(File apk){
        final FixedPathPmUpdater fixedPathPmUpdater = new FixedPathPmUpdater(apk);
        File tempPm = fixedPathPmUpdater.getLatest();
        if (tempPm != null) {
            return new DynamicPluginManager(fixedPathPmUpdater);
        }
        return null;
    }
}
