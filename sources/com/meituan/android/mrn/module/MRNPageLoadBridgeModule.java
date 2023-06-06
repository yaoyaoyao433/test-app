package com.meituan.android.mrn.module;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.config.horn.g;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.monitor.c;
import com.meituan.android.mrn.utils.FsRenderTimeBean;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = MRNPageLoadBridgeModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNPageLoadBridgeModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNPageLoadBridgeModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNPageLoadBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "964c024170722ac8a0d26da7bf4a9ac3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "964c024170722ac8a0d26da7bf4a9ac3");
        }
    }

    @ReactMethod
    public void customEventTracking() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fd2ccb1b8c7e7748ab40921d82e1fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fd2ccb1b8c7e7748ab40921d82e1fe1");
            return;
        }
        k currentMRNInstance = getCurrentMRNInstance();
        if (currentMRNInstance == null || currentMRNInstance.r == null || currentMRNInstance.r.c == null) {
            return;
        }
        c cVar = currentMRNInstance.r.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "ab6f1f3f3ddf07f8953d4cbaec82944b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "ab6f1f3f3ddf07f8953d4cbaec82944b");
            return;
        }
        cVar.b.customTime = System.currentTimeMillis();
        if (cVar.d != null) {
            cVar.d.recordStep("custom");
        }
    }

    @ReactMethod
    public void addCustomEvent(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be08893dd52ec6778b55566834b8039b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be08893dd52ec6778b55566834b8039b");
            return;
        }
        k currentMRNInstance = getCurrentMRNInstance();
        if (currentMRNInstance == null || currentMRNInstance.r == null || currentMRNInstance.r.c == null) {
            return;
        }
        c cVar = currentMRNInstance.r.c;
        long j = (long) d;
        Object[] objArr2 = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "4aba56dc17c6acace9fbf46a0d313392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "4aba56dc17c6acace9fbf46a0d313392");
        } else if (TextUtils.isEmpty(str) || cVar.b == null) {
        } else {
            Map<String, Long> map = cVar.b.customEvents;
            map.put(FsRenderTimeBean.CUSTOM_TAG_PREFIX + str, Long.valueOf(j));
        }
    }

    @ReactMethod
    public void addCustomTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b99f9fcbf52514558dd72fc42aec568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b99f9fcbf52514558dd72fc42aec568");
            return;
        }
        k currentMRNInstance = getCurrentMRNInstance();
        if (currentMRNInstance == null || currentMRNInstance.r == null || currentMRNInstance.r.c == null) {
            return;
        }
        c cVar = currentMRNInstance.r.c;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "d87c89731732d5f29412a7120cb3c6b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "d87c89731732d5f29412a7120cb3c6b5");
            return;
        }
        g gVar = g.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        if (!(PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect4, false, "ef225aff034ac4af907742da15c6739b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect4, false, "ef225aff034ac4af907742da15c6739b")).booleanValue() : ((Boolean) t.b.a("enableAddCustomTag")).booleanValue()) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || cVar.b == null) {
            return;
        }
        Map<String, String> map = cVar.b.customTags;
        map.put(FsRenderTimeBean.CUSTOM_TAG_PREFIX + str, str2);
    }

    @ReactMethod
    public void onFirstScreenRenderSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2bd1dc6a4deb84968377985f2e1174d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2bd1dc6a4deb84968377985f2e1174d");
            return;
        }
        final k currentMRNInstance = getCurrentMRNInstance();
        if (currentMRNInstance == null || currentMRNInstance.r == null || currentMRNInstance.r.c == null || Float.compare((float) currentMRNInstance.r.c.b.fsRenderTime, 0.0f) != 0) {
            return;
        }
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.MRNPageLoadBridgeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7ddf1c4bf61ad8bf03f3272cc8c9d18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7ddf1c4bf61ad8bf03f3272cc8c9d18");
                } else {
                    currentMRNInstance.r.c.a();
                }
            }
        });
    }

    private k getCurrentMRNInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2970543a20fd08f3a25dff7a98ab2cc", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2970543a20fd08f3a25dff7a98ab2cc") : r.a(getReactApplicationContext());
    }
}
