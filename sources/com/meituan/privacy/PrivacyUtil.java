package com.meituan.privacy;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PrivacyUtil {
    public static ChangeQuickRedirect a;
    static volatile a b;
    public static volatile String c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface PrivacyFrom {
        public static final int FROM_HTTP_CLIENT = 3;
        public static final int FROM_OKHTTP2 = 1;
        public static final int FROM_OKHTTP3 = 0;
        public static final int FROM_SHARK = 2;
        public static final int FROM_URL_CONNECTION = 4;
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface PrivacyResult {
        public static final int USE_BLACK = 2;
        public static final int USE_FILTERED_URL = 1;
        public static final int USE_ORIGIN_URL = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        @SerializedName("switch")
        public boolean a;
        @SerializedName("okhttp2Switch")
        public boolean b;
        @SerializedName("okhttp3Switch")
        public boolean c;
        @SerializedName("sharkSwitch")
        public boolean d;
        @SerializedName("httpClientSwitch")
        public boolean e;
        @SerializedName("urlConnectionSwitch")
        public boolean f;
        @SerializedName("mtFilterWhiteList")
        public List<String> g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        @PrivacyResult
        public int a;
        public String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public static boolean a() {
        return b != null && b.a;
    }

    public static <T> boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57c406609fe4c07d2d3c21a1a4287f34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57c406609fe4c07d2d3c21a1a4287f34")).booleanValue();
        }
        if (b == null || t == null) {
            return false;
        }
        List<String> list = b.g;
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (t.toString().contains(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static b a(@PrivacyFrom int i, URL url) {
        Object[] objArr = {Integer.valueOf(i), url};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccc40397cb3d3a8c7e6309580a8fcd2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccc40397cb3d3a8c7e6309580a8fcd2c");
        }
        return a(i, url != null ? url.toString() : null);
    }

    public static b a(@PrivacyFrom int i, String str) {
        int i2 = 2;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98a1e48fb3f50f3d94ff54b34d964ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98a1e48fb3f50f3d94ff54b34d964ee1");
        }
        if (TextUtils.isEmpty(str) || b == null || ((i == 0 && !b.c) || ((i == 1 && !b.b) || ((i == 2 && !b.d) || ((i == 3 && !b.e) || (i == 4 && !b.f)))))) {
            return new b(0, str);
        }
        c.a b2 = Privacy.createNetFilter().b(str);
        switch (b2.a()) {
            case -3:
            case -1:
                str = b2.e();
                i2 = 1;
                break;
            case -2:
                str = null;
                break;
            default:
                i2 = 0;
                break;
        }
        return new b(i2, str);
    }
}
