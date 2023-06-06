package com.meituan.android.wallet;

import android.content.Context;
import android.support.annotation.NonNull;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.views.RecceViewManagerProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3c25bcd0b8769e1a6f01c2bc3525f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3c25bcd0b8769e1a6f01c2bc3525f5");
            return;
        }
        com.meituan.android.recce.a.a(context);
        com.meituan.android.recce.a.a(com.meituan.android.paybase.config.a.d().j());
        com.meituan.android.recce.a.a(new c());
        com.meituan.android.recce.a.a(new a(context));
        com.meituan.android.recce.a.a(new b());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.meituan.android.recce.bridge.b {
        public static ChangeQuickRedirect a;
        private static Map<String, Class<? extends RecceCustomApi>> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6aa81e5f01fbe11b4905ae1a838a40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6aa81e5f01fbe11b4905ae1a838a40");
            } else if (b == null) {
                b = new HashMap();
                Map<String, String> map = com.sankuai.meituan.serviceloader.b.b().get(RecceCustomApi.class.getName());
                if (map == null || map.isEmpty()) {
                    return;
                }
                ClassLoader classLoader = context.getClassLoader();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        Class<?> loadClass = classLoader.loadClass(entry.getValue());
                        if (loadClass != null) {
                            b.put(entry.getKey(), loadClass);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.meituan.android.recce.bridge.b
        public final Map<String, Class<? extends RecceCustomApi>> a() {
            return b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements RecceViewManagerProvider {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.recce.views.RecceViewManagerProvider
        public final List<ViewManager> getViewManagers(com.meituan.android.recce.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558092a643852472d23cbab68dfa0c31", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558092a643852472d23cbab68dfa0c31") : com.sankuai.meituan.serviceloader.b.a(ViewManager.class, (String) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements com.meituan.android.recce.reporter.b {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.recce.reporter.b
        public final void a(Object obj, String str, HashMap<String, Object> hashMap, List<Float> list) {
            Object[] objArr = {obj, str, hashMap, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4b9642e9515238cefad8899cdb0a04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4b9642e9515238cefad8899cdb0a04");
            } else if (obj instanceof com.meituan.android.neohybrid.v2.core.a) {
                com.meituan.android.neohybrid.v2.neo.report.a.a((com.meituan.android.neohybrid.v2.core.a) obj, str, hashMap, list);
            } else {
                com.meituan.android.neohybrid.v2.neo.report.a.a((com.meituan.android.neohybrid.v2.core.a) null, str, hashMap, list);
            }
        }

        @Override // com.meituan.android.recce.reporter.b
        public final void a(Object obj, String str, String str2, HashMap<String, Object> hashMap) {
            Object[] objArr = {obj, str, str2, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b99798273bb4251f563c3f9253ac55", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b99798273bb4251f563c3f9253ac55");
            } else if (obj instanceof com.meituan.android.neohybrid.v2.core.a) {
                com.meituan.android.neohybrid.v2.neo.report.a.a((com.meituan.android.neohybrid.v2.core.a) obj, str2, str, hashMap);
            } else {
                com.meituan.android.neohybrid.v2.neo.report.a.a((com.meituan.android.neohybrid.v2.core.a) null, str2, str, hashMap);
            }
        }
    }
}
