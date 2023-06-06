package com.sankuai.waimai.business.page.home.preload;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static C0790b b;
    public static String c;
    private static a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public boolean a;
        public long b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.preload.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0790b {
        public boolean a = false;
        public double b = 2.0d;
        public int c = 100;
        public boolean d = true;
        public int e = 0;
        public int f = 0;
    }

    @NonNull
    public static C0790b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a2d0ac6a4eb804e00f5802d27e2baff", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0790b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a2d0ac6a4eb804e00f5802d27e2baff");
        }
        if (b == null) {
            String b2 = q.a(com.meituan.android.singleton.b.a, "waimai").b("wm_prelocation_params", "");
            b = new C0790b();
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject optJSONObject = new JSONObject(b2).optJSONObject("wm_prelocation_params");
                    if (optJSONObject != null) {
                        b.a = optJSONObject.optBoolean("prelocation_switch", false);
                        b.b = optJSONObject.optDouble("prelocation_overtime_threshold", 2.0d);
                        b.c = optJSONObject.optInt("prelocation_offset_accuracy", 100);
                        b.d = optJSONObject.optBoolean("prelocation_only_cache_address_location", true);
                        b.e = optJSONObject.optInt("prelocation_base_location_count", 0);
                        b.f = optJSONObject.optInt("prelocation_longtime_location_count", 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return b;
    }

    @NonNull
    public static a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eb55b94f1cc93ea0aa364e3eb4e44c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eb55b94f1cc93ea0aa364e3eb4e44c2");
        }
        if (d == null) {
            d = PageSP.g();
        }
        return d;
    }
}
