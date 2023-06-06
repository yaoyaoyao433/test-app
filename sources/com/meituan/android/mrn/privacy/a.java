package com.meituan.android.mrn.privacy;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return i > 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r12.equals("android.permission.WRITE_CALENDAR") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.privacy.a.a(java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "842cc3e2b4adf5a93fc46957d96a4f11", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "842cc3e2b4adf5a93fc46957d96a4f11")).booleanValue() : str != null && str.contains("android.permission");
    }

    public static void a(@NonNull Activity activity, final String str, String str2, final d dVar) {
        Object[] objArr = {activity, str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8ba1aa7ead777b912d3c6c5a3ab6e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8ba1aa7ead777b912d3c6c5a3ab6e82");
        } else if (b(str)) {
            Privacy.createPermissionGuard().a(activity, a(str), str2, new d() { // from class: com.meituan.android.mrn.privacy.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bddb710555b6ce64ef9fdff48e42baf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bddb710555b6ce64ef9fdff48e42baf");
                    } else if (d.this != null) {
                        d.this.onResult(str, i);
                    }
                }
            });
        } else {
            Privacy.createPermissionGuard().a(activity, str, str2, dVar);
        }
    }

    public static int a(@NonNull Context context, @NonNull String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7be27ac2963557ded080b54f92f09c14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7be27ac2963557ded080b54f92f09c14")).intValue();
        }
        if (b(str)) {
            return Privacy.createPermissionGuard().a(context, a(str), str2);
        }
        return Privacy.createPermissionGuard().a(context, str, str2);
    }

    public static boolean b(@NonNull Context context, @NonNull String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcbd7d606703ab40e1c083e835302c98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcbd7d606703ab40e1c083e835302c98")).booleanValue() : a(context, str, str2) > 0;
    }

    public static String a(@NonNull Context context, @NonNull String str, String str2, String str3, String str4) {
        Object[] objArr = {context, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2715554a9fd8c85797f834913e237f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2715554a9fd8c85797f834913e237f3");
        }
        int a2 = a(context, str, str2);
        if (a2 == -7) {
            com.facebook.common.logging.a.d("[MRNPermissionChecker@shouldShowRequestPermissionRationale]", "permission: " + str + StringUtil.SPACE + str3 + ",code: " + a2);
            return str3;
        }
        com.facebook.common.logging.a.d("[MRNPermissionChecker@shouldShowRequestPermissionRationale]", "permission: " + str + StringUtil.SPACE + str4 + ",code: " + a2);
        return str4;
    }
}
