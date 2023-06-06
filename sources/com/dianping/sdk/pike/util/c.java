package com.dianping.sdk.pike.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    public static void a(String str, String str2, long j, int i, int i2, String str3) {
        Object[] objArr = {str, str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60598fcfa2bec429cf9ad6730ad1ef24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60598fcfa2bec429cf9ad6730ad1ef24");
        } else if (b) {
            try {
                a a2 = a.a();
                Object[] objArr2 = {str, str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str3};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "303873960c31a30f7fa1d893268e5091", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "303873960c31a30f7fa1d893268e5091");
                } else {
                    a2.c.invoke(a2.b, str, str2, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str3);
                }
            } catch (Throwable th) {
                b = false;
                th.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static volatile a d;
        Object b;
        Method c;

        public static /* synthetic */ a a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
            return b();
        }

        public a() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e62e935a0a2fcf939f9c852e0a0df8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e62e935a0a2fcf939f9c852e0a0df8e");
                return;
            }
            Class<?> cls = Class.forName("com.sankuai.network.debug.PikeHistoryMsgManager");
            this.b = cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            this.c = cls.getMethod("appendHistoryMsg", String.class, String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class);
        }

        private static a b() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc322496a0fa3efe1fdfd3751e5e6481", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc322496a0fa3efe1fdfd3751e5e6481");
            }
            if (d == null) {
                synchronized (a.class) {
                    if (d == null) {
                        d = new a();
                    }
                }
            }
            return d;
        }
    }
}
