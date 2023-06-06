package com.meituan.passport.pojo.request;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect d;
    public List<KeyValue> e;
    public List<KeyValue> f;
    public List<KeyValue> g;

    public void a(Map<String, Object> map) {
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public final com.meituan.passport.clickaction.d<String> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0233eeef857edb7d9831f704fe6f6b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.clickaction.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0233eeef857edb7d9831f704fe6f6b9");
        }
        if (this.e != null) {
            for (KeyValue keyValue : this.e) {
                if (TextUtils.equals(str, keyValue.key)) {
                    return keyValue.value;
                }
            }
            return null;
        }
        return null;
    }

    public final void a(String str, com.meituan.passport.clickaction.d<String> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b9e86328f8112a2722a6e9aaa3e247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b9e86328f8112a2722a6e9aaa3e247");
        } else if (TextUtils.isEmpty(str) || dVar == null) {
        } else {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(new KeyValue(str, dVar));
        }
    }

    public final void b(String str, com.meituan.passport.clickaction.d<String> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3281cadba8123efa79d9cc9beed33a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3281cadba8123efa79d9cc9beed33a0");
        } else if (TextUtils.isEmpty(str) || dVar == null) {
        } else {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(new KeyValue(str, dVar));
        }
    }

    public final Map<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9148618f92686f8608c2bac2b4c565c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9148618f92686f8608c2bac2b4c565c0");
        }
        if (a()) {
            HashMap hashMap = new HashMap();
            if (this.g != null) {
                for (KeyValue keyValue : this.g) {
                    a(hashMap, keyValue.key, keyValue.value.b());
                }
            }
            a(hashMap);
            return hashMap;
        }
        return null;
    }

    public final com.meituan.passport.clickaction.d<String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9366b709dd819dcb5847411102bb4620", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.clickaction.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9366b709dd819dcb5847411102bb4620");
        }
        Map<String, Object> c = c();
        Object obj = (c == null || c.isEmpty()) ? null : c.get(str);
        if (obj instanceof String) {
            return com.meituan.passport.clickaction.d.a((String) obj);
        }
        return null;
    }

    public final void a(Map<String, Object> map, String str, Object obj) {
        Object[] objArr = {map, str, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df939681a60406e4bd12a5838ad46877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df939681a60406e4bd12a5838ad46877");
        } else if (map == null || obj == null) {
        } else {
            map.put(str, obj);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5800bb9161ddff15b4bbe9960781d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5800bb9161ddff15b4bbe9960781d1");
            return;
        }
        if (this.e != null) {
            for (KeyValue keyValue : this.e) {
                keyValue.value.a();
            }
        }
        if (this.f != null) {
            for (KeyValue keyValue2 : this.f) {
                keyValue2.value.a();
            }
        }
        if (this.g != null) {
            for (KeyValue keyValue3 : this.g) {
                keyValue3.value.a();
            }
        }
        b();
    }
}
