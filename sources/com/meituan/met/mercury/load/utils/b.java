package com.meituan.met.mercury.load.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    Set<String> c;
    Map<String, Object> d;
    Throwable e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ee036d04eed2d21fe46a59cd34afa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ee036d04eed2d21fe46a59cd34afa5");
            return;
        }
        this.c = new HashSet();
        this.d = new HashMap();
    }

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53acaa2a263158baf37529b25bafc6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53acaa2a263158baf37529b25bafc6c");
            return;
        }
        this.c = new HashSet();
        this.d = new HashMap();
        this.b = str;
    }

    public final b a(Throwable th) {
        if (com.meituan.met.mercury.load.core.c.e) {
            this.e = th;
            return this;
        }
        return this;
    }

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79f6c16f1006c61618bad0b98859289", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79f6c16f1006c61618bad0b98859289");
        }
        if (com.meituan.met.mercury.load.core.c.e) {
            if (TextUtils.isEmpty(str)) {
                str = "empty";
            }
            this.d.put("exceptionMsg", str);
            return this;
        }
        return this;
    }

    public final b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8848742ca9d7e19f1565923d11dde35", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8848742ca9d7e19f1565923d11dde35");
        }
        if (com.meituan.met.mercury.load.core.c.e) {
            this.c.add(str);
            return this;
        }
        return this;
    }

    public final b a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a987fca0f0025fd20d482fd8ea13ba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a987fca0f0025fd20d482fd8ea13ba3");
        }
        if (com.meituan.met.mercury.load.core.c.e) {
            this.d.put(str, obj != null ? obj.toString() : "value is empty");
            return this;
        }
        return this;
    }

    public final b a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46d467e4ec9b4b4c80a2996da305974", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46d467e4ec9b4b4c80a2996da305974");
        }
        if (com.meituan.met.mercury.load.core.c.e) {
            HashMap hashMap = new HashMap();
            if (map != null && map.size() > 0) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        hashMap.put(str, obj.toString());
                    } else {
                        hashMap.put(str, "extras value is empty");
                    }
                }
            }
            if (hashMap.size() > 0) {
                this.d.putAll(hashMap);
            } else {
                this.d.put("putExtras", "extras value is empty");
            }
            return this;
        }
        return this;
    }
}
