package com.sankuai.waimai.alita.core.featuredatareport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "AlitaFeatureDataReportInfo";
    String c;
    String d;
    String e;
    String f;
    List<Map<String, Object>> g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        String e;
        List<Map<String, Object>> f;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69f2ca7c2cf5cb683da76c849e9aa2e9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69f2ca7c2cf5cb683da76c849e9aa2e9") : new a();
    }

    public final String toString() {
        String message;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775a9cff69907db44cdef5d9c6b472e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775a9cff69907db44cdef5d9c6b472e5");
        }
        try {
            message = new JSONArray((Collection) this.g).toString();
        } catch (Exception e) {
            message = e.getMessage();
        }
        return "{bundleId=\"" + this.c + "\", bundleVersion=\"" + this.d + "\", sqlName=\"" + this.e + "\", sqlContent=\"" + this.f + "\", dataResult=" + message + '}';
    }
}
