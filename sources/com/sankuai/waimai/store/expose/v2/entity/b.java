package com.sankuai.waimai.store.expose.v2.entity;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect d;
    private WeakReference<View> a;
    private Map<String, Object> b;
    private String c;
    public String e;
    public String f;
    public String g;
    private String h;

    public String a() {
        return null;
    }

    public b(String str, @NonNull View view) {
        this(str, view, (String) null);
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f8342085583c4eaf227e72d3a4d30f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f8342085583c4eaf227e72d3a4d30f");
        }
    }

    public b(String str, @NonNull View view, String str2) {
        this("", str, null, view, str2);
        String[] c;
        Object[] objArr = {str, view, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2abb19aff1f7ec09f85b58384139c081", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2abb19aff1f7ec09f85b58384139c081");
            return;
        }
        Object[] objArr2 = {str, view};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2be24de4d7f76868b578e4001ca284be", RobustBitConfig.DEFAULT_VALUE)) {
            c = (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2be24de4d7f76868b578e4001ca284be");
        } else if (TextUtils.isEmpty(str)) {
            c = new String[]{"", ""};
        } else {
            c = com.sankuai.waimai.store.manager.judas.b.c(view.getContext(), str);
        }
        this.c = (String) com.sankuai.shangou.stone.util.a.a(c, 0);
        this.h = (String) com.sankuai.shangou.stone.util.a.a(c, 1);
    }

    @Deprecated
    public b(String str, String str2, @NonNull View view) {
        this(str, str2, view, (String) null);
        Object[] objArr = {str, str2, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5a7e353e3c0ea8cbf699715de1cfa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5a7e353e3c0ea8cbf699715de1cfa9");
        }
    }

    @Deprecated
    public b(String str, String str2, @NonNull View view, String str3) {
        this(str, str2, null, view, str3);
        Object[] objArr = {str, str2, view, str3};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7272982420ee113db0ee5519fa557c9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7272982420ee113db0ee5519fa557c9a");
        }
    }

    public b(String str, String str2, String str3, @NonNull View view) {
        this(str, str2, str3, view, null);
        Object[] objArr = {str, str2, str3, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb4fbf15d62cbc71d782abfb4e2a225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb4fbf15d62cbc71d782abfb4e2a225");
        }
    }

    public b(String str, String str2, String str3, @NonNull View view, String str4) {
        Object[] objArr = {str, str2, str3, view, str4};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c9e8a86af8a3ccd34babc40fe7baa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c9e8a86af8a3ccd34babc40fe7baa9");
            return;
        }
        this.c = str;
        this.f = str2;
        this.h = str3;
        this.a = new WeakReference<>(view);
        this.e = str4;
    }

    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d58ddec2a253537a41207446378d08", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d58ddec2a253537a41207446378d08") : this.a.get();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d394eba01fc8878a8df5facd1f8330", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d394eba01fc8878a8df5facd1f8330");
        }
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        if (this.a.get() == null) {
            return null;
        }
        return String.valueOf(this.a.get().hashCode());
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8f6f9094a1a4fc2cfcb98e793a6dba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8f6f9094a1a4fc2cfcb98e793a6dba")).booleanValue();
        }
        if (this.a.get() == null || !b()) {
            return false;
        }
        a(this.b);
        return true;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadaddc9be7aaef05e0ad65035b7da9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadaddc9be7aaef05e0ad65035b7da9d")).booleanValue();
        }
        if (this.a.get() == null || !b() || t.a(this.g)) {
            return false;
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.c, this.h, this.g).a(this.b).a();
        return true;
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5e4fbab5c2931f7e1cfb6549cf3b1cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5e4fbab5c2931f7e1cfb6549cf3b1cb")).booleanValue() : (this.b == null || TextUtils.isEmpty(this.f)) ? false : true;
    }

    public void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7a4666741bbe39378d2897c419f070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7a4666741bbe39378d2897c419f070");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.c, this.h, this.f).a(map).a();
        }
    }

    public final b a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ec210ad566cc6d1b5dedf0ee17c00b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ec210ad566cc6d1b5dedf0ee17c00b");
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, obj);
        return this;
    }

    public final b b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908a83db660dc6c83a3c502eaad94e6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908a83db660dc6c83a3c502eaad94e6a");
        }
        if (map == null) {
            return this;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.putAll(map);
        return this;
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca3530d13b698abd12de55597f4d8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca3530d13b698abd12de55597f4d8cc");
        } else if (this.b != null) {
            this.b.clear();
        }
    }
}
