package com.meituan.msc.modules.api.legacy.appstate;

import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LogMethodInvokeModule;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface AppListener extends JavaScriptModule, LogMethodInvokeModule {
    void onAppEnterBackground(String str, int i);

    void onAppEnterForeground(String str, int i);

    void onAppRoute(String str, int i);

    void onFocusChange(boolean z, int i);

    void onMemoryWarning(int i);

    void onNativeAppEnterBackground();

    void onNativeAppEnterForeground();

    void onPerformanceDataChange(String str);
}
