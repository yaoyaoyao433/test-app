package com.meituan.android.mrn.engine;

import android.content.Context;
import android.os.Bundle;
import com.meituan.android.mrn.engine.w;
import com.meituan.android.mrn.update.MRNPreDownload;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;

    public static void a(Context context, final String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "983bc6f43c4bd0b0f48040424ace43f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "983bc6f43c4bd0b0f48040424ace43f4");
        } else if (context == null || strArr.length == 0) {
        } else {
            c(context, strArr);
            com.meituan.android.mrn.utils.p.a("[MRNManger@warmUpByTag]", new Object[0]);
            z.a(context);
            MRNBundleManager.createInstance(context).executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.engine.u.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "651960ba838deadc3319c22afc7c473c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "651960ba838deadc3319c22afc7c473c");
                    } else {
                        com.meituan.android.mrn.update.k.a().a(new ArrayList<>(Arrays.asList(strArr)));
                    }
                }
            });
        }
    }

    public static void b(Context context, final String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed1e3455c06f18eae193d87610326313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed1e3455c06f18eae193d87610326313");
        } else if (strArr.length == 0) {
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNManger@warmUpByTag] 2", new Object[0]);
            z.a(context);
            MRNBundleManager.createInstance(context).executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.engine.u.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea972b7b7a13ef9cf34f31059b79b179", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea972b7b7a13ef9cf34f31059b79b179");
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
                    List<String> a2 = MRNPreDownload.a();
                    if (a2 != null) {
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (a2.contains(next)) {
                                arrayList.remove(next);
                            }
                        }
                    }
                    com.meituan.android.mrn.update.k.a().a(arrayList, false);
                }
            });
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f833858ee602b5818b48986eab1181a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f833858ee602b5818b48986eab1181a");
        } else {
            a(context, str, null, null);
        }
    }

    public static void a(final Context context, final String str, List<com.facebook.react.i> list, w.a aVar) {
        Object[] objArr = {context, str, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f34a4933842682cc62ce9f4d62987216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f34a4933842682cc62ce9f4d62987216");
        } else if (context == null) {
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNManger@preLoadJsBundle]", str);
            z.a(context);
            MRNBundleManager.createInstance(context).executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.engine.u.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1249927109537bc5282b2013400f7289", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1249927109537bc5282b2013400f7289");
                    } else {
                        w.a(context.getApplicationContext(), str, r3, (String) null, (Bundle) null, r4);
                    }
                }
            });
        }
    }

    private static synchronized void c(Context context, String... strArr) {
        boolean z;
        synchronized (u.class) {
            Object[] objArr = {context, strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e081ab9f58f414f098f1763c91ffd7c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e081ab9f58f414f098f1763c91ffd7c7");
                return;
            }
            com.facebook.common.logging.a.b("initMSC", "init");
            if (b) {
                return;
            }
            if (context != null && strArr != null && com.meituan.android.mrn.config.horn.m.b.a()) {
                com.meituan.android.mrn.config.horn.m mVar = com.meituan.android.mrn.config.horn.m.b;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.m.a;
                List list = PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "dd56df9786a479ebf9cddefe1cb1c9f3", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "dd56df9786a479ebf9cddefe1cb1c9f3") : (List) com.meituan.android.mrn.config.t.b.a("msc_init");
                if (list != null && list.size() != 0) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        } else if (list.contains(strArr[i])) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        try {
                            try {
                                try {
                                    try {
                                        Class<?> cls = Class.forName("com.meituan.msc.MSCMeituanHelper");
                                        cls.getMethod("init", Context.class).invoke(cls.newInstance(), context);
                                        com.facebook.common.logging.a.b("initMSC", "msc init success");
                                        b = true;
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                    }
                                } catch (NoSuchMethodException e2) {
                                    e2.printStackTrace();
                                }
                            } catch (InvocationTargetException e3) {
                                e3.printStackTrace();
                            }
                        } catch (ClassNotFoundException e4) {
                            e4.printStackTrace();
                        } catch (InstantiationException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
