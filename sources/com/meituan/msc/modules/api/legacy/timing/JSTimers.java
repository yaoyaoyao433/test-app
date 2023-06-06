package com.meituan.msc.modules.api.legacy.timing;

import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
