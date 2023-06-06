package com.sankuai.waimai.platform.capacity.permission;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final boolean b;
    private static q c;

    static {
        b = Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23;
        c = null;
    }

    private static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9493f5d164664d6b18b475323a0d426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9493f5d164664d6b18b475323a0d426");
        } else if (c == null) {
            c = q.a(com.meituan.android.singleton.b.a, "wm_platform_status", 1);
        }
    }

    public static void a(String str, int i) {
        Boolean bool;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Boolean bool2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3328e8698e8c63726d9b7e62e9d8884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3328e8698e8c63726d9b7e62e9d8884");
        } else if (b) {
            c();
            if ("Locate.once".equals(str)) {
                if (i > 0) {
                    bool = Boolean.TRUE;
                } else {
                    bool = i == -10 ? Boolean.FALSE : null;
                }
                if (bool != null) {
                    c.a("wm_permission_ret_locate", bool.booleanValue(), u.f);
                }
            }
            if (PermissionGuard.PERMISSION_PHONE_READ.equals(str)) {
                if (i > 0) {
                    bool2 = Boolean.TRUE;
                } else if (i == -10) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2 != null) {
                    c.a("wm_permission_ret_phone", true, u.f);
                }
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0c3d939474529d39f3580ee2b088dec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0c3d939474529d39f3580ee2b088dec")).booleanValue();
        }
        if (!b) {
            e createPermissionGuard = Privacy.createPermissionGuard();
            return createPermissionGuard != null && createPermissionGuard.a(com.meituan.android.singleton.b.a, PermissionGuard.PERMISSION_PHONE_READ, "default") > 0;
        }
        c();
        return c.b("wm_permission_ret_phone", false, u.f);
    }

    public static boolean b() {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b21054e42bfb5895ccfb3e214ee62f10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b21054e42bfb5895ccfb3e214ee62f10")).booleanValue();
        }
        if (b) {
            c();
            return c.b("wm_permission_ret_locate", false, u.f);
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context, "default"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32da1d74d6c70dfe25df7d66b2dca6cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32da1d74d6c70dfe25df7d66b2dca6cb")).booleanValue();
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            if (TextUtils.isEmpty("default")) {
                a2 = createPermissionGuard.a(context, "Locate.once", "default");
            } else {
                a2 = createPermissionGuard.a(context, "Locate.once", "default");
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }
}
