package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class m {
    public static ChangeQuickRedirect a;
    public static a c;
    private static volatile m d;
    public int b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        String a();
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38cccd2ee387eb99978593404f02cb61", 6917529027641081856L)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38cccd2ee387eb99978593404f02cb61");
        }
        if (d == null) {
            synchronized (m.class) {
                if (d == null) {
                    d = new m();
                }
            }
        }
        return d;
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fbf3e1d00f3e0ec70d696219d9e482", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fbf3e1d00f3e0ec70d696219d9e482");
        }
        String replace = UUID.randomUUID().toString().replace(CommonConstant.Symbol.MINUS, "");
        return replace.length() > 6 ? replace.substring(0, 6) : replace;
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5028307cce3a6543aec20d1c32818e5f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5028307cce3a6543aec20d1c32818e5f") : c == null ? "" : c.a();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b19bff398a35061b83c23900ccc9048", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b19bff398a35061b83c23900ccc9048");
        }
        return this.b + 1 + d() + c() + System.currentTimeMillis() + c();
    }
}
