package com.sankuai.xm.base.util;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.StringRes;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    public static void a(Context context, @StringRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9b794049ba56e22eae4453f0322b80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9b794049ba56e22eae4453f0322b80");
        } else {
            a(context, i, -1);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce3e3eb286d5a7703c369287a8aef5c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce3e3eb286d5a7703c369287a8aef5c3");
        } else {
            a(context, str, -1);
        }
    }

    public static void a(Context context, @StringRes int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57b67aef5146131c18fcf8fe275afd64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57b67aef5146131c18fcf8fe275afd64");
        } else if (context == null) {
        } else {
            a(context, context.getResources().getString(i), i2);
        }
    }

    private static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bd2186739ab70275dbf97dba710a6c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bd2186739ab70275dbf97dba710a6c7");
        } else {
            a(context, str, i, 17);
        }
    }

    public static void a(Context context, String str, int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3cb60d5ef6f5b5a08c73cf942f13ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3cb60d5ef6f5b5a08c73cf942f13ef");
        } else {
            a(context, str, i, i2, null);
        }
    }

    public static void a(final Context context, final String str, final int i, final int i2, final View view) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4a8877defe673bc26690d20373fc9ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4a8877defe673bc26690d20373fc9ef");
        } else if (context == null) {
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(new Runnable() { // from class: com.sankuai.xm.base.util.ad.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ac4714ea3e6985d93864af4ba99d10c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ac4714ea3e6985d93864af4ba99d10c");
                        } else {
                            ad.b(context, str, i, i2, view);
                        }
                    }
                });
            } else {
                b(context, str, i, i2, view);
            }
        }
    }

    static void b(Context context, String str, int i, int i2, View view) {
        int i3;
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56d8790546bfd626fbaa6cf3712fdb08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56d8790546bfd626fbaa6cf3712fdb08");
            return;
        }
        Activity a2 = ActivityUtils.a(context);
        if (a2 == null) {
            a2 = com.sankuai.xm.base.lifecycle.d.d().b();
        }
        if (!ActivityUtils.a(a2) || ac.a(str)) {
            return;
        }
        if (i == -10000) {
            i3 = str.length() > 10 ? 0 : -1;
        } else {
            i3 = i;
        }
        com.sankuai.meituan.android.ui.widget.a e = com.sankuai.meituan.android.ui.widget.a.a(a2, str, i3).e(i2);
        if (view != null) {
            e.a(view);
        }
        e.a();
    }
}
