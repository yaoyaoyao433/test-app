package com.meituan.msc.modules.service;

import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationSpec;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.service.f
    public final String a() {
        return "";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String b() {
        return "msc_event_engine_status_changed";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String c() {
        return "init_js_engine";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String d() {
        return "native_js_engine_init_begin";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String e() {
        return "native_js_engine_init_end";
    }

    @Override // com.meituan.msc.modules.service.f
    public final ReactQueueConfigurationSpec f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9dd1bf2920d96b462afb6a3fd5ad31c", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfigurationSpec) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9dd1bf2920d96b462afb6a3fd5ad31c") : ReactQueueConfigurationSpec.createDefault();
    }
}
