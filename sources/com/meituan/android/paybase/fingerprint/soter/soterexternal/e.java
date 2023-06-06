package com.meituan.android.paybase.fingerprint.soter.soterexternal;

import android.content.Context;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return (i & 32) == 32;
    }

    public static boolean b(int i) {
        return (i & 64) == 64;
    }

    private static boolean d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad2a6f12a1bd957bedb2553b4680ce95", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad2a6f12a1bd957bedb2553b4680ce95")).booleanValue() : context != null && af.a(context, "jinrong_sdk_data_set").b(str, true);
    }

    private static void e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a193ec47e51003357e8668804edf083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a193ec47e51003357e8668804edf083");
        } else if (context != null) {
            af.a(context, "jinrong_sdk_data_set").b(str);
        }
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3425cd6b15242644b14f355898ac05e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3425cd6b15242644b14f355898ac05e0")).booleanValue() : context != null && af.a(context, "jinrong_sdk_data_set").b(com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b, true);
    }

    private static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be1f9a951a8341c40028a12ba4805a50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be1f9a951a8341c40028a12ba4805a50");
        } else if (context != null) {
            af.a(context, "jinrong_sdk_data_set").b(com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b);
        }
    }

    public static boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "878a61b0a74f5db66ca2b245d233f503", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "878a61b0a74f5db66ca2b245d233f503")).booleanValue() : a(i) || b(i);
    }

    public static int a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "418323e74c53ed7fd7b4428885b1f7d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "418323e74c53ed7fd7b4428885b1f7d9")).intValue();
        }
        if (context == null || !com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a()) {
            return 0;
        }
        b(context, str);
        String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(str);
        if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.d()) {
            return (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b(a2) && com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b(a2, true)) ? 0 : 1;
        }
        com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
        return 2;
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f73f5ad8f61a9e8aee77158ecfafad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f73f5ad8f61a9e8aee77158ecfafad1");
        } else if (context == null) {
        } else {
            String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(str);
            if (!a(context)) {
                com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.c();
            }
            if (!d(context, a2)) {
                com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
            }
            c(context, str);
        }
    }

    @MTPaySuppressFBWarnings({"SF_SWITCH_FALLTHROUGH"})
    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d4955633ffa556421bda3cfa7d09e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d4955633ffa556421bda3cfa7d09e39");
        } else if (context == null) {
        } else {
            String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(str);
            if (i == 4) {
                com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
            } else {
                switch (i) {
                    case 1:
                    case 2:
                        break;
                    default:
                        com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.c();
                        com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
                        return;
                }
            }
            com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.c();
        }
    }

    public static void c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cda85ebf30782a0094b06a82b7f41e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cda85ebf30782a0094b06a82b7f41e97");
            return;
        }
        e(context, com.meituan.android.paybase.fingerprint.soter.b.a().a(str));
        b(context);
    }
}
