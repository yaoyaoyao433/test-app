package com.sankuai.xm.integration.knb.publish;

import android.text.TextUtils;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private final Map<JsHost, Set<c>> b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final k a = new k();
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c907e1c1e0eaba16f1f22eefea95fb80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c907e1c1e0eaba16f1f22eefea95fb80");
        } else {
            this.b = new HashMap();
        }
    }

    public final synchronized boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0072d4dbac1d3791acd5ab9536f4212", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0072d4dbac1d3791acd5ab9536f4212")).booleanValue();
        } else if (cVar == null) {
            return false;
        } else {
            Set<c> set = this.b.get(cVar.e);
            if (com.sankuai.xm.base.util.b.a(set)) {
                return false;
            }
            return set.contains(cVar);
        }
    }

    public final synchronized void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0b750aa9e6d9692470b152ab5feddb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0b750aa9e6d9692470b152ab5feddb");
        } else if (cVar == null) {
        } else {
            Set<c> set = this.b.get(cVar.e);
            if (set == null) {
                set = new HashSet<>();
                this.b.put(cVar.e, set);
            }
            set.add(cVar);
        }
    }

    public final synchronized Set<c> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b24fc0a4c57d891428516c37b19e8ea", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b24fc0a4c57d891428516c37b19e8ea");
        }
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return hashSet;
        }
        for (Map.Entry<JsHost, Set<c>> entry : this.b.entrySet()) {
            Set<c> value = entry.getValue();
            if (!com.sankuai.xm.base.util.b.a(value)) {
                for (c cVar : value) {
                    if (cVar != null && TextUtils.equals(str, cVar.c)) {
                        hashSet.add(cVar);
                    }
                }
            }
        }
        return hashSet;
    }

    public final synchronized c a(String str, short s, String str2) {
        Object[] objArr = {str, Short.valueOf(s), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc9433eee3e966992fc732cd497e3d2a", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc9433eee3e966992fc732cd497e3d2a");
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            for (Map.Entry<JsHost, Set<c>> entry : this.b.entrySet()) {
                Set<c> value = entry.getValue();
                if (!com.sankuai.xm.base.util.b.a(value)) {
                    for (c cVar : value) {
                        if (cVar != null && TextUtils.equals(str, cVar.c) && (cVar.d == s || cVar.d == -1)) {
                            if (TextUtils.equals(str2, cVar.f)) {
                                return cVar;
                            }
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    public final synchronized void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ee11b07337674dd91c6f9d540132ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ee11b07337674dd91c6f9d540132ed");
        } else if (cVar == null) {
        } else {
            Set<c> set = this.b.get(cVar.e);
            if (set != null) {
                set.remove(cVar);
            }
            if (com.sankuai.xm.base.util.b.a(set)) {
                this.b.remove(cVar.e);
            }
        }
    }

    public final synchronized void a(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e5069009a64b0c42da7d3eff4caac8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e5069009a64b0c42da7d3eff4caac8");
        } else if (jsHost == null) {
        } else {
            Set<c> set = this.b.get(jsHost);
            if (set != null) {
                set.clear();
            }
            this.b.remove(jsHost);
        }
    }
}
