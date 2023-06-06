package com.meituan.android.yoda.data;

import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";

    public static com.meituan.android.yoda.data.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5393c9fe2194048db07dfdb13ea4d2b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.yoda.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5393c9fe2194048db07dfdb13ea4d2b1");
        }
        a a2 = a.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a6954e988135fafb7e7c09dd71d53757", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.yoda.data.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a6954e988135fafb7e7c09dd71d53757") : a2.c.get(str);
    }

    public static com.meituan.android.yoda.data.a a(@NonNull String str, @NonNull com.meituan.android.yoda.data.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f526cc8dc76dd5d92c46d5c2acd37e21", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.yoda.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f526cc8dc76dd5d92c46d5c2acd37e21");
        }
        a a2 = a.a();
        Object[] objArr2 = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9347e846b32d34424ac5fbf954095378", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.yoda.data.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9347e846b32d34424ac5fbf954095378");
        }
        Object obj = aVar.c.data.get("riskLevel");
        aVar.f = c.a(obj != null ? obj.toString() : null);
        a2.a(aVar);
        aVar.e = 0;
        a2.c.put(str, aVar);
        return aVar;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41b5f2ae4794942ab24cc9aed19d4606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41b5f2ae4794942ab24cc9aed19d4606");
            return;
        }
        a a2 = a.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b489d337812dde2837c555a44397e4ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b489d337812dde2837c555a44397e4ef");
            return;
        }
        com.meituan.android.yoda.data.a remove = a2.c.remove(str);
        String str2 = b;
        StringBuilder sb = new StringBuilder("remove ");
        sb.append(str);
        sb.append(" success ? ");
        sb.append(remove != null);
        com.meituan.android.yoda.monitor.log.a.a(str2, sb.toString(), false);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9201f57ba2f920495d1347a77a6bd52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9201f57ba2f920495d1347a77a6bd52");
            return;
        }
        a a2 = a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "61e815c3b61ea3d6b236abaf3b20434e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "61e815c3b61ea3d6b236abaf3b20434e");
        } else {
            a2.c.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public static a b = new a();
        ArrayMap<String, com.meituan.android.yoda.data.a> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1616ce57301086d40d25bc0ca35d479", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1616ce57301086d40d25bc0ca35d479");
            } else {
                this.c = new ArrayMap<String, com.meituan.android.yoda.data.a>(4) { // from class: com.meituan.android.yoda.data.Global$SharedData$1
                    public static ChangeQuickRedirect a;

                    {
                        super(4);
                    }

                    @Override // android.support.v4.util.SimpleArrayMap, java.util.Map
                    public /* synthetic */ Object put(Object obj, Object obj2) {
                        String str = (String) obj;
                        a aVar = (a) obj2;
                        Object[] objArr2 = {str, aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eb1b1f159ab302e17ba3adfbbc54d36", RobustBitConfig.DEFAULT_VALUE)) {
                            return (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eb1b1f159ab302e17ba3adfbbc54d36");
                        }
                        if (TextUtils.isEmpty(str) || aVar == null || aVar.c == null) {
                            return null;
                        }
                        return (a) super.put(str, aVar);
                    }
                };
            }
        }

        public static a a() {
            return b;
        }

        void a(com.meituan.android.yoda.data.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699a52a680220247f73ee3b04787b4e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699a52a680220247f73ee3b04787b4e6");
                return;
            }
            Map<String, Object> map = aVar.c.data;
            JSONObject jSONObject = new JSONObject(map);
            if (map.containsKey("riskLevelInfo")) {
                try {
                    aVar.f.b(jSONObject.getString("riskLevelInfo"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc06d6055bb6bf42860b471879f1816", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc06d6055bb6bf42860b471879f1816");
        }
        return "Global{globalMap=" + a.a().c + "}\n" + super.toString();
    }
}
