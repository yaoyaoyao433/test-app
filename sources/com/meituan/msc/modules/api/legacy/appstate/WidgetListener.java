package com.meituan.msc.modules.api.legacy.appstate;

import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LogMethodInvokeModule;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface WidgetListener extends JavaScriptModule, LogMethodInvokeModule {
    void onWidgetDataChange(String str, int i);

    void onWidgetEnterBackground(String str, int i);

    void onWidgetEnterForeground(String str, int i);

    void onWidgetSizeChanged(String str, int i);
}
