package com.meituan.android.common.aidata.jsengine.modules.core;

import com.meituan.android.common.aidata.jsengine.modules.AbstractNativeModule;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CoreNativeModule extends AbstractNativeModule {
    private static final String MODULE_NAME = "module";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeModule
    public String name() {
        return "module";
    }
}
