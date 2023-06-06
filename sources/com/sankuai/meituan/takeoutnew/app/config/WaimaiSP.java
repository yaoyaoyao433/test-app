package com.sankuai.meituan.takeoutnew.app.config;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.xm.im.cache.bean.DBSession;
import java.util.Collections;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WaimaiSP {
    public static ChangeQuickRedirect a;
    private static final e<WaimaiSPKeys> b = new e<>("waimai_android_shell");
    private static Boolean c = null;

    @NonNull
    public static Set<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89070f83445abbe5878b25074fba13f1", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89070f83445abbe5878b25074fba13f1") : b.b((e<WaimaiSPKeys>) WaimaiSPKeys.FDM_PAGE_NAMES, Collections.emptySet());
    }

    public static void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "517de839bbe5fb4d3c6015c90ea0381f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "517de839bbe5fb4d3c6015c90ea0381f");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.FDM_PAGE_NAMES, set);
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aada98a29a6d581c1a8b0da6c5204c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aada98a29a6d581c1a8b0da6c5204c0");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.DELIVER_LOCATION_DIRECTLY, z);
        }
    }

    public static void b(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "800898d04cfeec7f93cd44a252e02a51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "800898d04cfeec7f93cd44a252e02a51");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.BOOT_API_MONITOR_CMDS, set);
        }
    }

    public static Set<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03394fd281e632d739397e6e7df2ba7d", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03394fd281e632d739397e6e7df2ba7d") : b.b((e<WaimaiSPKeys>) WaimaiSPKeys.BOOT_API_MONITOR_CMDS, Collections.emptySet());
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e166b18c9f8afb41115c3bad0ed958ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e166b18c9f8afb41115c3bad0ed958ed");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.PKG_MGR_INSTALL_APPS_CACHE, str);
        }
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "087abd872190cd3b154d66391d0b57c9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "087abd872190cd3b154d66391d0b57c9") : b.b((e<WaimaiSPKeys>) WaimaiSPKeys.PKG_MGR_INSTALL_APPS_CACHE, DBSession.TABLE_NAME);
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2a9b780c34e5d25bbcdf4c69122c849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2a9b780c34e5d25bbcdf4c69122c849");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.BABEL_UPLOAD_DELAY, i);
        }
    }

    public static int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a261509c6c2e93f91ad53ae6bdcae190", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a261509c6c2e93f91ad53ae6bdcae190")).intValue() : b.b((e<WaimaiSPKeys>) WaimaiSPKeys.BABEL_UPLOAD_DELAY, 4000);
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "decef6260e5d67be11d0940456d92e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "decef6260e5d67be11d0940456d92e09");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.GD_EXTERNAL_JUMP_SWITCH, z);
        }
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37bfd4eea1efca0a69133c807b22c753", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37bfd4eea1efca0a69133c807b22c753")).booleanValue() : b.b((e<WaimaiSPKeys>) WaimaiSPKeys.GD_EXTERNAL_JUMP_SWITCH, true);
    }

    public static void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc5b316535c7485385726a96b490aa6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc5b316535c7485385726a96b490aa6f");
        } else {
            b.a((e<WaimaiSPKeys>) WaimaiSPKeys.ENABLE_DEEPLINK_BOOST, z);
        }
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b97a6cd2ab44dbd4e85c309babc796df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b97a6cd2ab44dbd4e85c309babc796df")).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(b.b((e<WaimaiSPKeys>) WaimaiSPKeys.ENABLE_DEEPLINK_BOOST, true));
        }
        return c.booleanValue();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum WaimaiSPKeys {
        FDM_PAGE_NAMES,
        DELIVER_LOCATION_DIRECTLY,
        DISABLE_CRASH_WITH_LOGAN,
        BOOT_API_MONITOR_CMDS,
        PKG_MGR_INSTALL_APPS_CACHE,
        DFP_APP_CACHE_SIZE_CACHE,
        BABEL_UPLOAD_DELAY,
        GD_EXTERNAL_JUMP_SWITCH,
        ENABLE_DEEPLINK_BOOST;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static WaimaiSPKeys valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9871da519c3b1a853e562e811ac129f", RobustBitConfig.DEFAULT_VALUE) ? (WaimaiSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9871da519c3b1a853e562e811ac129f") : (WaimaiSPKeys) Enum.valueOf(WaimaiSPKeys.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WaimaiSPKeys[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bfaa10dc78365ec786531b100818fefe", RobustBitConfig.DEFAULT_VALUE) ? (WaimaiSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bfaa10dc78365ec786531b100818fefe") : (WaimaiSPKeys[]) values().clone();
        }

        WaimaiSPKeys() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87364c576ec9dba1f0277d12e2565eab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87364c576ec9dba1f0277d12e2565eab");
            }
        }
    }
}
