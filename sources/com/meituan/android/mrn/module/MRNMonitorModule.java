package com.meituan.android.mrn.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.mrn.container.b;
import com.meituan.android.mrn.container.g;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.monitor.d;
import com.meituan.android.mrn.monitor.h;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "MRNMonitorModule")
/* loaded from: classes2.dex */
public class MRNMonitorModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNMonitorModule";
    private static final String TAG = "MRNMonitorModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinkedList<String> mComponentStack;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNMonitorModule";
    }

    public MRNMonitorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "799c85fb378fb50b689ce7f2d83746fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "799c85fb378fb50b689ce7f2d83746fa");
        } else {
            this.mComponentStack = new LinkedList<>();
        }
    }

    @ReactMethod
    public void startMonitorFps(String str) {
        h s;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cea1bd3668eaa099dc5842ff8e8eb68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cea1bd3668eaa099dc5842ff8e8eb68");
            return;
        }
        this.mComponentStack.add(0, str);
        try {
            k currentMRNInstance = getCurrentMRNInstance();
            if (getCurrentActivity() != null) {
                e eVar = null;
                if (getCurrentActivity() instanceof d) {
                    h a = ((d) getCurrentActivity()).a();
                    if (a != null) {
                        if (currentMRNInstance != null) {
                            eVar = currentMRNInstance.i;
                        }
                        a.a(eVar, str);
                    }
                } else if (!(getCurrentActivity() instanceof MRNBaseActivity) || (s = ((MRNBaseActivity) getCurrentActivity()).e.s()) == null) {
                } else {
                    if (currentMRNInstance != null) {
                        eVar = currentMRNInstance.i;
                    }
                    s.a(eVar, str);
                }
            }
        } catch (Throwable th) {
            System.out.print(th);
        }
    }

    public void endMonitorFps(String str) {
        h hVar;
        String peekFirst;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6485b68efbed34a69892740e0baf0d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6485b68efbed34a69892740e0baf0d99");
            return;
        }
        this.mComponentStack.remove(str);
        try {
            k currentMRNInstance = getCurrentMRNInstance();
            if (getCurrentActivity() != null) {
                e eVar = null;
                if (getCurrentActivity() instanceof d) {
                    hVar = ((d) getCurrentActivity()).a();
                    if (hVar != null) {
                        hVar.b(currentMRNInstance == null ? null : currentMRNInstance.i, str);
                    }
                } else if (getCurrentActivity() instanceof MRNBaseActivity) {
                    hVar = ((MRNBaseActivity) getCurrentActivity()).e.s();
                    if (hVar != null) {
                        hVar.b(currentMRNInstance == null ? null : currentMRNInstance.i, str);
                    }
                } else {
                    hVar = null;
                }
                if (hVar == null || (peekFirst = this.mComponentStack.peekFirst()) == null) {
                    return;
                }
                if (currentMRNInstance != null) {
                    eVar = currentMRNInstance.i;
                }
                hVar.a(eVar, peekFirst);
            }
        } catch (Throwable th) {
            System.out.print(th);
        }
    }

    private k getCurrentMRNInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d0cd9238b04baa4f4cf9f16ed21336", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d0cd9238b04baa4f4cf9f16ed21336") : r.a(getReactApplicationContext());
    }

    @ReactMethod
    public void addFSPCustomTags(ReadableMap readableMap) {
        k currentMRNInstance;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "459cd119790b1376dd00734544595b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "459cd119790b1376dd00734544595b39");
        } else if (readableMap != null && (currentMRNInstance = getCurrentMRNInstance()) != null) {
            for (b bVar : currentMRNInstance.b()) {
                g gVar = null;
                if (!(bVar instanceof MRNBaseActivity)) {
                    if (bVar instanceof MRNBaseFragment) {
                        gVar = ((MRNBaseFragment) bVar).f;
                    }
                } else {
                    gVar = ((MRNBaseActivity) bVar).e;
                }
                if (gVar != null) {
                    com.meituan.android.mrn.monitor.fsp.b bVar2 = gVar.n;
                    Map<String, Object> a = com.meituan.android.mrn.utils.g.a(readableMap);
                    Object[] objArr2 = {a};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.monitor.fsp.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect3, false, "78507695c655d21acd321634379c36ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect3, false, "78507695c655d21acd321634379c36ec");
                    } else if (a != null) {
                        for (Map.Entry<String, Object> entry : a.entrySet()) {
                            if (entry.getKey() != null && entry.getValue() != null) {
                                Map<String, Object> map = bVar2.o;
                                map.put("3rd_" + entry.getKey(), entry.getValue());
                            }
                        }
                    }
                }
            }
        }
    }
}
