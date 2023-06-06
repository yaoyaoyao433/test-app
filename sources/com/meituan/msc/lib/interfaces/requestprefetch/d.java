package com.meituan.msc.lib.interfaces.requestprefetch;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final String b;
    public final String c;
    public final Map<String, String> d;
    public final JsonElement e;

    public d(String str, String str2, Map<String, String> map, JsonElement jsonElement) {
        Object[] objArr = {str, str2, map, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d8c1ab553e82dd7f73f2bab44cf018", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d8c1ab553e82dd7f73f2bab44cf018");
        } else if (str == null) {
            throw new NullPointerException("URL must not be null.");
        } else {
            if (str2 == null) {
                throw new NullPointerException("Method must not be null.");
            }
            this.b = str;
            this.c = str2;
            this.d = map != null ? Collections.unmodifiableMap(map) : null;
            this.e = jsonElement;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public JsonElement d;
        public final Map<String, String> e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421083c6099e375c5da45fb329f8eae6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421083c6099e375c5da45fb329f8eae6");
                return;
            }
            this.c = "GET";
            this.e = new LinkedHashMap();
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c4b59588ceaf86477ecc3e6c1c3b30", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c4b59588ceaf86477ecc3e6c1c3b30");
            }
            this.e.put(str, str2);
            return this;
        }
    }
}
