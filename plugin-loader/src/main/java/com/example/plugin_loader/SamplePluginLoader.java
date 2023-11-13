package com.example.plugin_loader;

/**
 * Author: hank.liu
 * Date: 2023/11/13
 * Copyright: www.xgimi.com Inc. All rights reserved.
 * Desc:
 */
import android.content.Context;

import com.tencent.shadow.core.loader.ShadowPluginLoader;
import com.tencent.shadow.core.loader.managers.ComponentManager;
public class SamplePluginLoader extends ShadowPluginLoader {

    private final static String TAG = "shadow";

    private ComponentManager componentManager;

    public SamplePluginLoader(Context hostAppContext) {
        super(hostAppContext);
        componentManager = new SampleComponentManager(hostAppContext);
    }

    @Override
    public ComponentManager getComponentManager() {
        return componentManager;
    }
}
