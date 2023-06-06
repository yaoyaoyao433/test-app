package com.meituan.android.neohybrid.base;

import android.text.TextUtils;
import com.meituan.android.neohybrid.base.param.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private static final Map<Object, a> e = new WeakHashMap();
    public String b;
    private volatile String f;
    private final Set<String> g;
    private final Map<String, Integer> h;
    private final Map<String, Long> i;

    private static a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4541bcce8f05451ab39cc1ee703d0757", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4541bcce8f05451ab39cc1ee703d0757") : new a();
    }

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb66d9a94bf9318351ae32fee1abaf20", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb66d9a94bf9318351ae32fee1abaf20");
        }
        if (obj == null) {
            return d();
        }
        a aVar = e.get(obj);
        if (aVar == null) {
            a d = d();
            e.put(obj, d);
            return d;
        }
        return aVar;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9344a131030153b0c190047a3c8e011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9344a131030153b0c190047a3c8e011");
            return;
        }
        this.g = new HashSet();
        this.h = new HashMap();
        this.i = new LinkedHashMap();
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f91db9936b28f3513041dfd51ba899", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f91db9936b28f3513041dfd51ba899");
        }
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = com.meituan.android.paybase.utils.b.c();
                }
            }
        }
        return this.f;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8fa81d448f3d05fabd483361167b8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8fa81d448f3d05fabd483361167b8b")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.g.contains(str);
        if (!contains) {
            this.g.add(str);
        }
        return !contains;
    }

    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80482f0d96b49137937ac09e3b6eb83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80482f0d96b49137937ac09e3b6eb83")).intValue();
        }
        Integer num = this.h.get(str);
        if (num == null) {
            num = 0;
        }
        this.h.put(str, Integer.valueOf(num.intValue() + 1));
        return num.intValue();
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a008f2e274dcc1593bd5864d418e4075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a008f2e274dcc1593bd5864d418e4075");
        } else {
            a(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void a(String str, Long l) {
        Object[] objArr = {str, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "771ae5b60ac0d8df0980db13892829d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "771ae5b60ac0d8df0980db13892829d9");
        } else if (this.i.containsKey(str)) {
        } else {
            this.i.put(str, l);
        }
    }

    public final long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a89a2b286aef219797744dd4c216ebf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a89a2b286aef219797744dd4c216ebf")).longValue();
        }
        Long l = this.i.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e97aa80a3480e6f0ea4641e388d82b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e97aa80a3480e6f0ea4641e388d82b4");
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : this.i.values()) {
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(l);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
