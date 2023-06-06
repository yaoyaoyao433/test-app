package com.meituan.android.common.aidata.jsengine.modules;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IJSNativeModule {
    Map<String, IJSNativeMethod> getAllMethods();

    void invoke(String str, String str2, String str3, String str4, IJSNativeModuleCallback iJSNativeModuleCallback);

    String name();
}
