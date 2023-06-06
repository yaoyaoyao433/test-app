package com.meituan.android.mrn.util;

import android.content.Context;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.android.mrn.horn.f;
import com.meituan.android.mrn.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0293a {
        void a();

        void a(String str);
    }

    public static <T extends NativeModule> void a(T t, Context context, String str, InterfaceC0293a interfaceC0293a) {
        Object[] objArr = {t, context, str, interfaceC0293a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f771e7381cc72337b7d95b41582dd46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f771e7381cc72337b7d95b41582dd46f");
        } else if (!f.a().d()) {
            interfaceC0293a.a();
        } else if (!(context instanceof ReactApplicationContext)) {
            com.facebook.common.logging.a.d("[BridgePermissionUtil@handlePermission]", "context is not ReactApplicationContext: " + context);
        } else {
            String a2 = ak.a(t, str);
            if (f.a().e()) {
                a(a2, context, interfaceC0293a, 1);
            }
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) context;
            if (f.a().a(a2, reactApplicationContext)) {
                interfaceC0293a.a();
                f.a().a(a2, reactApplicationContext, true, 0);
                return;
            }
            a(a2, context, interfaceC0293a, 2);
        }
    }

    private static void a(String str, Context context, InterfaceC0293a interfaceC0293a, int i) {
        Object[] objArr = {str, context, interfaceC0293a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67f9db446200f234cb8f25d803469c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67f9db446200f234cb8f25d803469c8a");
            return;
        }
        String str2 = "bridge " + str + " not in white list, permission denied!";
        com.facebook.common.logging.a.d("[BridgePermissionUtil@handlePermission]", str2);
        f.a().a(str, (ReactApplicationContext) context, false, i);
        interfaceC0293a.a(str2);
    }
}
