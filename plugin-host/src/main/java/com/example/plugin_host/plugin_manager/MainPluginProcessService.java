package com.example.plugin_host.plugin_manager;

/**
 * Author: hank.liu
 * Date: 2023/11/12
 * Copyright: www.xgimi.com Inc. All rights reserved.
 * Desc:
 */
import com.tencent.shadow.dynamic.host.PluginProcessService;

/**
 * 一个PluginProcessService（简称PPS）代表一个插件进程。插件进程由PPS启动触发启动。
 * 新建PPS子类允许一个宿主中有多个互不影响的插件进程。
 */
public class MainPluginProcessService extends PluginProcessService {
}
