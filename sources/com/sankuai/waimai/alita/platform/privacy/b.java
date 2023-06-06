package com.sankuai.waimai.alita.platform.privacy;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a9291de5ae1eda8a7275425cfbe4b56", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a9291de5ae1eda8a7275425cfbe4b56") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final b a = new b();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d9daac361870480132d93fd6063403", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d9daac361870480132d93fd6063403");
        }
        String d = d();
        if (TextUtils.isEmpty(d)) {
            return "2";
        }
        try {
            return new JSONObject(d).optBoolean("contentSwitch") ? "0" : "1";
        } catch (JSONException e) {
            e.printStackTrace();
            return "2";
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b9e300de9656ae2c3aab0d8b38d08e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b9e300de9656ae2c3aab0d8b38d08e");
        }
        String d = d();
        if (TextUtils.isEmpty(d)) {
            return "2";
        }
        try {
            return new JSONObject(d).optBoolean("adSwitch") ? "0" : "1";
        } catch (JSONException e) {
            e.printStackTrace();
            return "2";
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e54df2727205188bf52a189d0ddc85c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e54df2727205188bf52a189d0ddc85c") : q.a(com.meituan.android.singleton.b.a, "mtplatform_group").b("mtPtLawSettings", "");
    }
}
