package com.sankuai.titans.debug.adapter.plugin;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansDebugPluginConfig {
    boolean bitmapMonitorEnable();

    List<JsInjectEntity> getDebugInjectList();

    String getProxyUrl();

    String getUUID();
}
