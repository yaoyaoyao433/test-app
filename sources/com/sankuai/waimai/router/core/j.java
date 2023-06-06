package com.sankuai.waimai.router.core;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j {
    public static ChangeQuickRedirect b;
    private String a;
    @NonNull
    public final Context c;
    @NonNull
    public Uri d;
    @NonNull
    public final HashMap<String, Object> e;

    public j(@NonNull Context context, String str) {
        this(context, b(str), new HashMap());
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00af8e72162b80949f28a42d824f3e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00af8e72162b80949f28a42d824f3e4");
        }
    }

    public j(@NonNull Context context, Uri uri) {
        this(context, uri, new HashMap());
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf398275e797e3ea8e767589faf1ada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf398275e797e3ea8e767589faf1ada");
        }
    }

    public j(@NonNull Context context, String str, HashMap<String, Object> hashMap) {
        this(context, b(str), hashMap);
        Object[] objArr = {context, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8262c02af0ee7bcb7aaccc46cd9d48dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8262c02af0ee7bcb7aaccc46cd9d48dd");
        }
    }

    public j(@NonNull Context context, Uri uri, HashMap<String, Object> hashMap) {
        Object[] objArr = {context, uri, hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e70f199d60781cce3e71343105b60c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e70f199d60781cce3e71343105b60c");
            return;
        }
        this.a = null;
        this.c = context;
        this.d = uri == null ? Uri.EMPTY : uri;
        this.e = hashMap == null ? new HashMap<>() : hashMap;
    }

    private static Uri b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d95791bfdd6b062bd44ba4a6bdec66b2", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d95791bfdd6b062bd44ba4a6bdec66b2") : TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    public j b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff57ceb2ea95be69f0b17c8a752f3577", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff57ceb2ea95be69f0b17c8a752f3577");
        }
        a("com.sankuai.waimai.router.core.CompleteListener", (String) eVar);
        return this;
    }

    public j b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56002ca112879dc5b196085937eb1b28", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56002ca112879dc5b196085937eb1b28");
        }
        a("com.sankuai.waimai.router.core.result", (String) Integer.valueOf(i));
        return this;
    }

    public j a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0069e4c6b2b3c92af020626c7b945db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0069e4c6b2b3c92af020626c7b945db7");
        }
        a("com.sankuai.waimai.router.core.error.msg", str);
        return this;
    }

    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114238755bfdb2a606c039d7bff4b1f4", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114238755bfdb2a606c039d7bff4b1f4") : (e) a(e.class, "com.sankuai.waimai.router.core.CompleteListener");
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd6876cf6b811cb1343e79984ff17fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd6876cf6b811cb1343e79984ff17fe") : b("com.sankuai.waimai.router.core.error.msg", "");
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbae1f4631d66e3637d4d1de0f5f2c7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbae1f4631d66e3637d4d1de0f5f2c7f");
        }
        if (this.a == null) {
            this.a = com.sankuai.waimai.router.utils.f.a(this.d);
        }
        return this.a;
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48bef2efdc44ffec0eba0f9ccb2adaa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48bef2efdc44ffec0eba0f9ccb2adaa")).booleanValue() : Uri.EMPTY.equals(this.d);
    }

    @NonNull
    public final Context e() {
        return this.c;
    }

    @NonNull
    public final Uri f() {
        return this.d;
    }

    public final void a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bcf1881362659894634a7aeb1a7481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bcf1881362659894634a7aeb1a7481");
        } else if (uri != null && !Uri.EMPTY.equals(uri)) {
            this.d = uri;
            this.a = null;
        } else {
            d.d("UriRequest.setUri不应该传入空值", new Object[0]);
        }
    }

    public final <T> j a(@NonNull String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083e24d1c1c34c22bf8f0e82786e183d", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083e24d1c1c34c22bf8f0e82786e183d");
        }
        if (t != null) {
            this.e.put(str, t);
        }
        return this;
    }

    public final synchronized <T> j b(@NonNull String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f3c76be1479148c1ae1d322cee755a", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f3c76be1479148c1ae1d322cee755a");
        }
        if (t != null && !this.e.containsKey(str)) {
            this.e.put(str, t);
        }
        return this;
    }

    public final int b(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c35c2dc6cbd6d0afba381f9743e56c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c35c2dc6cbd6d0afba381f9743e56c")).intValue() : ((Integer) a(Integer.class, str, Integer.valueOf(i))).intValue();
    }

    public final boolean b(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d33ef20710e8de77fab0f01b240d7de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d33ef20710e8de77fab0f01b240d7de")).booleanValue() : ((Boolean) a(Boolean.class, str, Boolean.valueOf(z))).booleanValue();
    }

    public final String b(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a678bd89bb4a7f41bef41543451487", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a678bd89bb4a7f41bef41543451487") : (String) a(String.class, str, str2);
    }

    public final <T> T a(@NonNull Class<T> cls, @NonNull String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8166181ef0229c9bf528a79bc4d4b406", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8166181ef0229c9bf528a79bc4d4b406") : (T) a(cls, str, null);
    }

    public final <T> T a(@NonNull Class<T> cls, @NonNull String str, T t) {
        Object[] objArr = {cls, str, t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e36cc92136d1ba7f702dd2b4e4930c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e36cc92136d1ba7f702dd2b4e4930c7");
        }
        Object obj = this.e.get(str);
        if (obj != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                d.b(e);
            }
        }
        return t;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d047138b4b72b6a2ebc74c212a2880b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d047138b4b72b6a2ebc74c212a2880b");
        } else {
            com.sankuai.waimai.router.a.a(this);
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85aa9dc9cca099f404b56a001e1e96c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85aa9dc9cca099f404b56a001e1e96c") : this.d.toString();
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb4d096cee8490c407377c1a7a5b5c72", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb4d096cee8490c407377c1a7a5b5c72");
        }
        StringBuilder sb = new StringBuilder(this.d.toString());
        sb.append(", fields = {");
        boolean z = true;
        for (Map.Entry<String, Object> entry : this.e.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(" = ");
            sb.append(entry.getValue());
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }
}
