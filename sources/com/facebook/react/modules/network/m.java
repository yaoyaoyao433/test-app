package com.facebook.react.modules.network;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements a {
    @Nullable
    private CookieJar a = null;

    @Override // com.facebook.react.modules.network.a
    public final void a(CookieJar cookieJar) {
        this.a = cookieJar;
    }

    @Override // com.facebook.react.modules.network.a
    public final void a() {
        this.a = null;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (this.a != null) {
            this.a.saveFromResponse(httpUrl, list);
        }
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (this.a != null) {
            List<Cookie> loadForRequest = this.a.loadForRequest(httpUrl);
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : loadForRequest) {
                try {
                    new Headers.Builder().add(cookie.name(), cookie.value());
                    arrayList.add(cookie);
                } catch (IllegalArgumentException unused) {
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}
