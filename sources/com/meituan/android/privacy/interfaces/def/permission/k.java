package com.meituan.android.privacy.interfaces.def.permission;

import android.content.Context;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static boolean a(Context context, String[] strArr, int[] iArr, PermissionGuard permissionGuard) {
        Object[] objArr = {context, strArr, iArr, permissionGuard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fcd53f700f19288b49d973ef420e99b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fcd53f700f19288b49d973ef420e99b")).booleanValue();
        }
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            String str = strArr[i];
            ?? r7 = i2 == 0 ? 1 : 0;
            Object[] objArr2 = {context, str, Byte.valueOf((byte) r7)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a1f22839a14fc73205bd3281f9e5aa25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a1f22839a14fc73205bd3281f9e5aa25");
            } else if (Sys.d) {
                c.a(context).c.a(str, (boolean) r7);
            }
            if (i2 != 0) {
                return false;
            }
            permissionGuard.hasSysPermissions.add(strArr[i]);
        }
        return true;
    }
}
