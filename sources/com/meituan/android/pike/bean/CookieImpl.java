package com.meituan.android.pike.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CookieImpl implements CookieJar {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashMap<String, List<Cookie>> cookieStore;

    public CookieImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "803bcbfa68099d95b1755b9432ef5359", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "803bcbfa68099d95b1755b9432ef5359");
        } else {
            this.cookieStore = new HashMap<>();
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        Object[] objArr = {httpUrl, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce90723cce4c526ff7b815b7eb9f9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce90723cce4c526ff7b815b7eb9f9d2");
        } else {
            this.cookieStore.put(httpUrl.host(), list);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        Object[] objArr = {httpUrl};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "713d665f62ebbf658b10bf485141fa5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "713d665f62ebbf658b10bf485141fa5a");
        }
        List<Cookie> list = this.cookieStore.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }
}
