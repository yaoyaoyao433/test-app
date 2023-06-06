package com.sankuai.waimai.business.page.home.helper;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.NavigationBarThemeBean;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba83d7ec97357d284e1e906a798458b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba83d7ec97357d284e1e906a798458b");
            return;
        }
        this.b = false;
        this.c = false;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e92d746af0b334e904c5be64d11f4132", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e92d746af0b334e904c5be64d11f4132") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final b a = new b();
    }

    public final NavigationBarThemeBean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2c07ec9e29fbd0102adfa0d5fde345", RobustBitConfig.DEFAULT_VALUE)) {
            return (NavigationBarThemeBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2c07ec9e29fbd0102adfa0d5fde345");
        }
        NavigationBarThemeBean navigationBarThemeBean = null;
        try {
            String optString = new JSONObject(str).optString("home_rcmd_style");
            if (!TextUtils.isEmpty(optString)) {
                navigationBarThemeBean = (NavigationBarThemeBean) new Gson().fromJson(optString, new TypeToken<NavigationBarThemeBean>() { // from class: com.sankuai.waimai.business.page.home.helper.b.1
                }.getType());
            }
        } catch (Exception e) {
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b("navigation_theme_fault").c(e.getMessage()).b());
        }
        return navigationBarThemeBean != null ? navigationBarThemeBean : new NavigationBarThemeBean();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb9ce0865d302e37d6ec36d72612622", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb9ce0865d302e37d6ec36d72612622")).booleanValue() : b(10);
    }

    private boolean b(int i) {
        Object[] objArr = {10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f1bb9ccf0f80fdc2e0ed53c36f3769", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f1bb9ccf0f80fdc2e0ed53c36f3769")).booleanValue();
        }
        try {
            return com.sankuai.waimai.alita.core.base.util.d.b(1000) < 10;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df1af5b355b626256bb51cff25f77b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df1af5b355b626256bb51cff25f77b0");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("alita_data_type", "custom");
            hashMap.put("alita_data_sub_type", "rerank");
            hashMap.put("type", String.valueOf(i));
            com.sankuai.waimai.alita.core.dataupload.b.a(hashMap);
        } catch (Exception unused) {
        }
    }
}
