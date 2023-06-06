package com.sankuai.waimai.launcher.config;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import java.util.Collections;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WaimaiLauncherSP {
    public static ChangeQuickRedirect a;
    private static final e<LauncherSPKeys> b = new e<>("waimai_android_shell");
    private static Boolean c;

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab5e0a04f534f237ca416a6683e00cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab5e0a04f534f237ca416a6683e00cf3");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_ENABLE, z);
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebce607cd4b1c6a9b896f1dcb7d962c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebce607cd4b1c6a9b896f1dcb7d962c1")).booleanValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_ENABLE, true);
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdd2b140a67b9751746e65c31bdcccf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdd2b140a67b9751746e65c31bdcccf8");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_OK_HTTP, z);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ed80f53c716b22fafcec91934eaa3dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ed80f53c716b22fafcec91934eaa3dd")).booleanValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_OK_HTTP, false);
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "def88b8f9cf6fe5cdda809f664417dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "def88b8f9cf6fe5cdda809f664417dbb");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_GLIDE, i);
        }
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06bcc42d7d39223a91ff53362b9f638d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06bcc42d7d39223a91ff53362b9f638d")).intValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_GLIDE, 0);
    }

    public static void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb67d7d59536a6c46eb08a09b393b636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb67d7d59536a6c46eb08a09b393b636");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_ASYNC_TASK, z);
        }
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84962072c679352cd377346c214b898c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84962072c679352cd377346c214b898c")).booleanValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_ASYNC_TASK, true);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d57c34701c0b36ad202e7020f1e74024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d57c34701c0b36ad202e7020f1e74024");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_RX_COMPUTATION, i);
        }
    }

    public static int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ea681dc0c0d51210094376be3959f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ea681dc0c0d51210094376be3959f9")).intValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_RX_COMPUTATION, 0);
    }

    public static void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "005af26a587740c6b1240f6a14891667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "005af26a587740c6b1240f6a14891667");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_EXCLUDE, set);
        }
    }

    @NonNull
    public static Set<String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00c77c69b3c5337ae1cc1046fb5a579f", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00c77c69b3c5337ae1cc1046fb5a579f") : b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_EXCLUDE, Collections.emptySet());
    }

    public static int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9647329c665f2ad3b7769e6fe2b3f644", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9647329c665f2ad3b7769e6fe2b3f644")).intValue();
        }
        int b2 = b.b((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_POOL_SIZE_FACTOR, 0);
        if (b2 > 0) {
            return b2;
        }
        return 5;
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c37ef79dc97ec46a654f56b68908704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c37ef79dc97ec46a654f56b68908704");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.JARVIS_POOL_SIZE_FACTOR, i);
        }
    }

    public static void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3540651d00b9d09f4619fe99ef81321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3540651d00b9d09f4619fe99ef81321");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.ASYNC_INIT_DELAY, i);
        }
    }

    public static int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eca0b21059e4778f5de244ee0de985ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eca0b21059e4778f5de244ee0de985ef")).intValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.ASYNC_INIT_DELAY, 5000);
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec3434b37d60bc6c62be3d2dcc54f0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec3434b37d60bc6c62be3d2dcc54f0e")).booleanValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.DISABLE_CRASH_WITH_LOGAN, false);
    }

    public static void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0397f45d76526f15170afed55d9a57db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0397f45d76526f15170afed55d9a57db");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.DISABLE_CRASH_WITH_LOGAN, z);
        }
    }

    public static void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3887c1a567f3a6d71e03b6203642feb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3887c1a567f3a6d71e03b6203642feb1");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.LOGIN_WITH_IMEI_SWITCH, z);
        }
    }

    public static void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "134d22f2abf1161ff21fed0d4c68a6d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "134d22f2abf1161ff21fed0d4c68a6d3");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.LOGIN_PRIVACY_TIPS_SWITCH, z);
        }
    }

    public static void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50b810b00c90c35da5d3a3e53cc18b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50b810b00c90c35da5d3a3e53cc18b2e");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.WM_MRN_LAUNCH_DELAY, i);
        }
    }

    public static int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf9b28c384e2df4417d486bd73aa97b0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf9b28c384e2df4417d486bd73aa97b0")).intValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.WM_MRN_LAUNCH_DELAY, 5000);
    }

    public static void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48c4fe2e3b2529fcdeaa77bc303524a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48c4fe2e3b2529fcdeaa77bc303524a5");
        } else {
            b.a((e<LauncherSPKeys>) LauncherSPKeys.PICASSO_IMAGE_RESIZE, z);
        }
    }

    public static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c8ecd0445a989dce04d7bc2af505e1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c8ecd0445a989dce04d7bc2af505e1c")).booleanValue() : b.b((e<LauncherSPKeys>) LauncherSPKeys.PICASSO_IMAGE_RESIZE, false);
    }

    public static void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0efee6551a0deb2c10d919caa610584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0efee6551a0deb2c10d919caa610584");
            return;
        }
        c = Boolean.valueOf(z);
        b.a((e<LauncherSPKeys>) LauncherSPKeys.MRN_IMAGE_RESIZE, z);
    }

    public static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23b33dc398ec4ed4e97d84b0964f47ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23b33dc398ec4ed4e97d84b0964f47ea")).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(b.b((e<LauncherSPKeys>) LauncherSPKeys.MRN_IMAGE_RESIZE, true));
        }
        return !c.booleanValue();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public enum LauncherSPKeys {
        JARVIS_ENABLE,
        JARVIS_POOL_SIZE_FACTOR,
        JARVIS_OK_HTTP,
        JARVIS_GLIDE,
        JARVIS_ASYNC_TASK,
        JARVIS_RX_COMPUTATION,
        JARVIS_EXCLUDE,
        ASYNC_INIT_DELAY,
        DISABLE_CRASH_WITH_LOGAN,
        LOGIN_WITH_IMEI_SWITCH,
        LOGIN_PRIVACY_TIPS_SWITCH,
        MTGUARD_INIT_SIUA,
        WM_MRN_LAUNCH_DELAY,
        PICASSO_IMAGE_RESIZE,
        MRN_IMAGE_RESIZE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static LauncherSPKeys valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b4dcd309a2674cf41b1bf9b77e47a57", RobustBitConfig.DEFAULT_VALUE) ? (LauncherSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b4dcd309a2674cf41b1bf9b77e47a57") : (LauncherSPKeys) Enum.valueOf(LauncherSPKeys.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LauncherSPKeys[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68f13afa9e5f8cc33f65ccf290acb731", RobustBitConfig.DEFAULT_VALUE) ? (LauncherSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68f13afa9e5f8cc33f65ccf290acb731") : (LauncherSPKeys[]) values().clone();
        }

        LauncherSPKeys() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43f8f69e345447454f8866ab99030a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43f8f69e345447454f8866ab99030a4");
            }
        }
    }
}
