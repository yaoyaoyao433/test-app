package com.meituan.phoenix.data;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fca8701fe71bdf496060bca6864e6604", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fca8701fe71bdf496060bca6864e6604");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b = a().b(str, (String) null);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            return (d) new Gson().fromJson(b, (Class<Object>) d.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c96d8ee5f737f3294df05a40b492d6ad", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c96d8ee5f737f3294df05a40b492d6ad") : q.a(com.meituan.phoenix.b.c, "phoenix_store_key", 1);
    }
}
