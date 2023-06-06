package com.meituan.msc.modules.service;

import com.meituan.msc.jse.bridge.JSFunctionCaller;
import com.meituan.msc.jse.bridge.queue.MessageQueueThreadSpec;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationSpec;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.service.f
    public final String a() {
        return "main_thread_";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String b() {
        return "msc_event_perf_list_engine_status_changed";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String c() {
        return "init_main_thread_js_engine";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String d() {
        return "native_main_thread_js_engine_init_begin";
    }

    @Override // com.meituan.msc.modules.service.f
    public final String e() {
        return "native_main_thread_js_engine_init_end";
    }

    @Override // com.meituan.msc.modules.service.f
    public final ReactQueueConfigurationSpec f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60106c05205d64c7391e76f36d89bf81", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfigurationSpec) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60106c05205d64c7391e76f36d89bf81") : new ReactQueueConfigurationSpec.Builder().setNativeModulesQueueThreadSpec(MessageQueueThreadSpec.mainThreadSpec()).setJSQueueThreadSpec(MessageQueueThreadSpec.mainThreadSpec()).build();
    }

    @Override // com.meituan.msc.modules.service.f
    public final JSFunctionCaller g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854fd415267848ce50c8fa9d46af4195", RobustBitConfig.DEFAULT_VALUE) ? (JSFunctionCaller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854fd415267848ce50c8fa9d46af4195") : new JSFunctionCaller() { // from class: com.meituan.msc.modules.service.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.JSFunctionCaller
            public final void callFunction(final String str, final String str2, final JSONArray jSONArray) {
                Object[] objArr2 = {str, str2, jSONArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e345354815fcd629b7169ae2c4447b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e345354815fcd629b7169ae2c4447b8");
                } else {
                    h.this.getJSInstance().runOnJSQueueThreadSafe(new Runnable() { // from class: com.meituan.msc.modules.service.h.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06a226e3d28a8ae63ac198214fa35fdf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06a226e3d28a8ae63ac198214fa35fdf");
                            } else {
                                h.this.getJSInstance().executeJSFunction(str, str2, jSONArray.toString());
                            }
                        }
                    });
                }
            }
        };
    }
}
