package com.meituan.android.mrn.module;

import android.text.TextUtils;
import com.facebook.common.logging.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.config.horn.l;
import com.meituan.android.mrn.config.n;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.monitor.g;
import com.meituan.android.mrn.utils.c;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
@ReactModule(name = MRNRaptorMetricsModule.MODULENAME)
/* loaded from: classes2.dex */
public class MRNRaptorMetricsModule extends ReactContextBaseJavaModule {
    public static final String ERROR_CODE = "JSON_CONVERT_ERROR";
    public static final String MODULENAME = "MRNRaptorMetricsModule";
    private static final String TAG = MRNTimeModule.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULENAME;
    }

    public MRNRaptorMetricsModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97c16438d478b602d8b4039e1e2f389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97c16438d478b602d8b4039e1e2f389");
        }
    }

    @ReactMethod
    public void report(String str, ReadableMap readableMap, ReadableArray readableArray, String str2) {
        Object[] objArr = {str, readableMap, readableArray, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2fa97fae0d5fe72fcf20936d849baf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2fa97fae0d5fe72fcf20936d849baf7");
        } else if (str == null || readableArray == null) {
            throw new IllegalArgumentException("kMRNRaptorMetricsModule.report error,key and values should not be null");
        } else {
            try {
                g a = g.a();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readableArray.size(); i++) {
                    arrayList.add(Float.valueOf(String.valueOf(readableArray.getDouble(i))));
                }
                if (readableMap != null) {
                    Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
                    while (entryIterator.hasNext()) {
                        Map.Entry<String, Object> next = entryIterator.next();
                        String key = next.getKey();
                        Object value = next.getValue();
                        if (!TextUtils.isEmpty(key) && value != null && !"env".equals(key) && !AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION.equals(key) && !"platform".equals(key) && !"mrn_version".equals(key)) {
                            String valueOf = String.valueOf(value);
                            if (!TextUtils.isEmpty(valueOf)) {
                                if (CommonConstant.Symbol.DOLLAR.equals(valueOf)) {
                                    k a2 = r.a(getReactApplicationContext());
                                    if (a2 != null) {
                                        char c = 65535;
                                        int hashCode = key.hashCode();
                                        if (hashCode != -245169112) {
                                            if (hashCode != 424120363) {
                                                if (hashCode != 536105499) {
                                                    if (hashCode == 1370139789 && key.equals("component_name")) {
                                                        c = 3;
                                                    }
                                                } else if (key.equals("bundle_version")) {
                                                    c = 1;
                                                }
                                            } else if (key.equals("fetch_bridge_type")) {
                                                c = 2;
                                            }
                                        } else if (key.equals("bundle_name")) {
                                            c = 0;
                                        }
                                        switch (c) {
                                            case 0:
                                                valueOf = a2.k;
                                                break;
                                            case 1:
                                                if (a2.i == null) {
                                                    valueOf = "0";
                                                    break;
                                                } else {
                                                    valueOf = a2.i.f;
                                                    break;
                                                }
                                            case 2:
                                                valueOf = String.valueOf(a2.d);
                                                break;
                                            case 3:
                                                valueOf = a2.l;
                                                break;
                                        }
                                    }
                                }
                                a.a(key, valueOf);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    a.d = str2;
                }
                Object[] objArr2 = {str, arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "7bddb1cd22b5185edf7e026d751ad846", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "7bddb1cd22b5185edf7e026d751ad846");
                } else if (l.b.a(str)) {
                    n a3 = n.a();
                    if (a3.c() && a3.a(a.c.get("bundle_name")) && "MRNMRT".equals(str)) {
                        a.a(g.b, "指标名: %s, 值: %s, 维度: %s, Extra: %s", "MRNLMRT", arrayList, com.meituan.android.mrn.utils.g.a((Object) a.c), a.d);
                        a.c().a("MRNLMRT", arrayList).a(a.b()).a();
                    }
                    a.c().a(str, arrayList).a(a.b()).a();
                }
            } catch (Exception e) {
                c.a("[MRNRaptorMetricsModule@report]", "error: " + e.getMessage());
            }
        }
    }
}
