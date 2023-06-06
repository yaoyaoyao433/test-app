package com.sankuai.waimai.business.page.common.util;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.preload.b;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import java.util.Calendar;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PageSP {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<PageSPKey> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_page_common");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum PageSPKey {
        REUNION_ACTION_MORE_FIRST_TIP,
        POI_LIST_FRAGMENT_TAB_INDEX_SELECTED,
        FIRST_STARTUP_APP_VERSION,
        BOOT_LOCATE_IN_BACKGROUND,
        AM_PRE_CACHE_LOCATION,
        NOON_PRE_CACHE_LOCATION,
        PM_PRE_CACHE_LOCATION,
        NIGHT_PRE_CACHE_LOCATION,
        WEEKEND_PRE_CACHE_LOCATION,
        BOOT_LOCATE_STATUS,
        BOOT_RCMD_CACHE_VALID_TIME,
        HOME_FUTURE_THEME_STYLE,
        JUMP_TO_CHANGE_LOCATION_WHEN_FAILED,
        KINGKONG_POI_LIST_MACH_LOAD_TIMEOUT_BASE,
        KINGKONG_POI_LIST_MACH_LOAD_TIMEOUT_MULTIPLE,
        KINGKONG_HEADER_PLATINUM_MACH_LOAD_TIMEOUT,
        WM_LOCATION_TIMEOUT_DIALOG_SWITCH,
        WM_LOCATION_TIMEOUT_DIALOG_TIMEOUT,
        WM_CHANNEL_FORCE_UPDATE_HORN_CONFIG,
        WM_CHANNEL_FORCE_UPDATE_GUIDE_CLICK_INFO,
        MTBOOST_DEXOPT_STATUS,
        LAUNCH_REPORT_DEVICES,
        LBS_REPORT_TIME_INTERVAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static PageSPKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84a066a44c04d08b08f0970b0d1acc75", RobustBitConfig.DEFAULT_VALUE) ? (PageSPKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84a066a44c04d08b08f0970b0d1acc75") : (PageSPKey) Enum.valueOf(PageSPKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PageSPKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69591513eeedb08c402b5afb3c0a79af", RobustBitConfig.DEFAULT_VALUE) ? (PageSPKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69591513eeedb08c402b5afb3c0a79af") : (PageSPKey[]) values().clone();
        }

        PageSPKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "854a39aaef147c8d57e541e9a616d16b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "854a39aaef147c8d57e541e9a616d16b");
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2db0a812c3ee8ad6b72f2ddbe4a8c51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2db0a812c3ee8ad6b72f2ddbe4a8c51")).booleanValue() : b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.JUMP_TO_CHANGE_LOCATION_WHEN_FAILED, false);
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1074e833896902fa5bf43870faecd231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1074e833896902fa5bf43870faecd231");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.JUMP_TO_CHANGE_LOCATION_WHEN_FAILED, z);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c4c00e845f1254cfacedba28fd68e62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c4c00e845f1254cfacedba28fd68e62")).booleanValue() : !TextUtils.equals(com.sankuai.waimai.platform.b.A().i(), b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.FIRST_STARTUP_APP_VERSION, ""));
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acfaf5685441dc2c5f38149923fb5103", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acfaf5685441dc2c5f38149923fb5103")).booleanValue() : !TextUtils.isEmpty(b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.FIRST_STARTUP_APP_VERSION, ""));
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72429cc089980f149db16d8886b11b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72429cc089980f149db16d8886b11b10");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.FIRST_STARTUP_APP_VERSION, com.sankuai.waimai.platform.b.A().i());
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca6c07fd5669f1123a004fafc7d33c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca6c07fd5669f1123a004fafc7d33c42");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.BOOT_LOCATE_STATUS, str);
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eae30cf058dd9d40f38132fc268f265d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eae30cf058dd9d40f38132fc268f265d");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.BOOT_RCMD_CACHE_VALID_TIME, i);
        }
    }

    public static int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc8b33a919f3ad3a1042584bf51ec1f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc8b33a919f3ad3a1042584bf51ec1f2")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.BOOT_RCMD_CACHE_VALID_TIME, 30000);
    }

    public static void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a0c3740fbcfdf862d7fb3e00f9c2d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a0c3740fbcfdf862d7fb3e00f9c2d05");
        } else if (wMLocation == null) {
        } else {
            double longitude = wMLocation.getLongitude();
            double latitude = wMLocation.getLatitude();
            if (longitude == 0.0d || latitude == 0.0d) {
                return;
            }
            com.sankuai.waimai.foundation.utils.e<PageSPKey> eVar = b;
            PageSPKey j = j();
            eVar.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) j, longitude + CommonConstant.Symbol.UNDERLINE + latitude + "_0");
        }
    }

    public static WMLocation f() {
        WMLocation wMLocation;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbef680ae20dec2f342488599f139b35", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbef680ae20dec2f342488599f139b35");
        }
        String[] a2 = a(j());
        if (a2 == null || a2.length < 2) {
            return null;
        }
        try {
            double doubleValue = Double.valueOf(a2[0]).doubleValue();
            double doubleValue2 = Double.valueOf(a2[1]).doubleValue();
            wMLocation = new WMLocation("ColdStartCache");
            try {
                wMLocation.setLongitude(doubleValue);
                wMLocation.setLatitude(doubleValue2);
            } catch (NumberFormatException e) {
                e = e;
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return wMLocation;
            }
        } catch (NumberFormatException e2) {
            e = e2;
            wMLocation = null;
        }
        return wMLocation;
    }

    private static String[] a(PageSPKey pageSPKey) {
        Object[] objArr = {pageSPKey};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5110e4c07bb272a3cc03c68bd8f8fe51", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5110e4c07bb272a3cc03c68bd8f8fe51");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) pageSPKey, (String) null);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return b2.split(CommonConstant.Symbol.UNDERLINE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.sankuai.waimai.foundation.location.v2.WMLocation r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.common.util.PageSP.a
            java.lang.String r11 = "9cb8c16affa8e49a67f26463141fe745"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            if (r12 != 0) goto L1f
            return
        L1f:
            double r1 = r12.getLongitude()
            double r3 = r12.getLatitude()
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 != 0) goto L32
            goto L99
        L32:
            com.sankuai.waimai.business.page.common.util.PageSP$PageSPKey r12 = j()
            java.lang.String[] r5 = a(r12)
            if (r5 == 0) goto L98
            int r6 = r5.length
            r7 = 2
            if (r6 >= r7) goto L41
            goto L98
        L41:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            r8 = r5[r9]
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L97
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r8 = r5[r0]
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L97
            int r6 = r5.length
            r8 = 3
            if (r6 < r8) goto L6c
            r5 = r5[r7]     // Catch: java.lang.NumberFormatException -> L68
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L68
            int r5 = r5.intValue()     // Catch: java.lang.NumberFormatException -> L68
            goto L6d
        L68:
            r5 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r5)
        L6c:
            r5 = 0
        L6d:
            int r5 = r5 + r0
            if (r5 <= r8) goto L76
            com.sankuai.waimai.foundation.utils.e<com.sankuai.waimai.business.page.common.util.PageSP$PageSPKey> r0 = com.sankuai.waimai.business.page.common.util.PageSP.b
            r0.b(r12)
            return
        L76:
            com.sankuai.waimai.foundation.utils.e<com.sankuai.waimai.business.page.common.util.PageSP$PageSPKey> r0 = com.sankuai.waimai.business.page.common.util.PageSP.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = "_"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = "_"
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r0.a(r12, r1)
        L97:
            return
        L98:
            return
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.util.PageSP.b(com.sankuai.waimai.foundation.location.v2.WMLocation):void");
    }

    private static PageSPKey j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb8658f25e716945441c2432cd64bbb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PageSPKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb8658f25e716945441c2432cd64bbb7");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(7);
        if (i == 1 || i == 7) {
            return PageSPKey.WEEKEND_PRE_CACHE_LOCATION;
        }
        int i2 = calendar.get(11);
        if (i2 < 5 || i2 > 9) {
            if (i2 < 10 || i2 > 15) {
                if (i2 >= 16 && i2 <= 19) {
                    return PageSPKey.PM_PRE_CACHE_LOCATION;
                }
                return PageSPKey.NIGHT_PRE_CACHE_LOCATION;
            }
            return PageSPKey.NOON_PRE_CACHE_LOCATION;
        }
        return PageSPKey.AM_PRE_CACHE_LOCATION;
    }

    public static void a(@Nonnull b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b43ed591d0f6a8cb18ddce27e5354a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b43ed591d0f6a8cb18ddce27e5354a4");
            return;
        }
        b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.WM_LOCATION_TIMEOUT_DIALOG_SWITCH, aVar.a);
        b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.WM_LOCATION_TIMEOUT_DIALOG_TIMEOUT, aVar.b);
    }

    public static b.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b3a60fb2607c77470cd46000422790f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b3a60fb2607c77470cd46000422790f");
        }
        b.a aVar = new b.a();
        aVar.a = b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.WM_LOCATION_TIMEOUT_DIALOG_SWITCH, false);
        aVar.b = b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.WM_LOCATION_TIMEOUT_DIALOG_TIMEOUT, (long) MetricsAnrManager.ANR_THRESHOLD);
        return aVar;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78657ffecc9a4f71ae799f755c38d063", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78657ffecc9a4f71ae799f755c38d063")).booleanValue() : b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.MTBOOST_DEXOPT_STATUS, false);
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "155d54393378e005df030a4c94eae2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "155d54393378e005df030a4c94eae2b7");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.MTBOOST_DEXOPT_STATUS, z);
        }
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51c31c9713e28c8d713fffab336f51df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51c31c9713e28c8d713fffab336f51df")).booleanValue() : b.b((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.LAUNCH_REPORT_DEVICES, false);
    }

    public static void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef684f09f956355b511949611d24d0fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef684f09f956355b511949611d24d0fc");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<PageSPKey>) PageSPKey.LAUNCH_REPORT_DEVICES, z);
        }
    }
}
