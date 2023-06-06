package com.meituan.android.cashier.oneclick.hybrid;

import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static String b;
    private static OneClickHornConfig c;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df54c2d583622f9daf7b403c96e6a23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df54c2d583622f9daf7b403c96e6a23e");
            return;
        }
        if (ah.a(com.meituan.android.paybase.config.a.d().a())) {
            Horn.debug(com.meituan.android.paybase.config.a.d().a(), "pay_one_click_modal", true);
        }
        Horn.register("pay_one_click_modal", b.a(), com.meituan.android.neohybrid.neo.report.a.c("hybrid_user_id", com.meituan.android.paycommon.lib.config.a.a().i()).a("pay_sdk_version", com.meituan.android.paybase.config.a.d().q()).b);
    }

    public static /* synthetic */ void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e38d9bdea4d850ed84b56a373afa4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e38d9bdea4d850ed84b56a373afa4d0");
        } else if (!z || TextUtils.equals(b, str)) {
            if (c == null || TextUtils.isEmpty(c.getWasaiDialogPath())) {
                return;
            }
            g.a(c.getWasaiDialogPath().trim(), c.getWasaiDialogDefaultVersion(), c.isCheckMd5());
        } else {
            synchronized (a.class) {
                try {
                    OneClickHornConfig oneClickHornConfig = (OneClickHornConfig) n.a().fromJson(str, (Class<Object>) OneClickHornConfig.class);
                    c = oneClickHornConfig;
                    if (oneClickHornConfig != null && !TextUtils.isEmpty(c.getWasaiDialogPath())) {
                        g.a(c.getWasaiDialogPath().trim(), c.getWasaiDialogDefaultVersion(), c.isCheckMd5());
                    }
                } catch (Exception unused) {
                }
            }
            b = str;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38bdd83f74b79e5ca42a00e49387e57e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38bdd83f74b79e5ca42a00e49387e57e")).booleanValue() : d() > 0;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6217553408aca07a238b55d919cfcc55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6217553408aca07a238b55d919cfcc55")).booleanValue() : e() > 0;
    }

    public static long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f448d1e1a7b764650600ad1ab51c76b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f448d1e1a7b764650600ad1ab51c76b")).longValue();
        }
        if (c != null) {
            return c.getLoadingDuration();
        }
        return 0L;
    }

    public static long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e239b8c2918cf89fbea893a42576c5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e239b8c2918cf89fbea893a42576c5f")).longValue();
        }
        if (c != null) {
            return c.getWebUnavailableTimeout();
        }
        return 0L;
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f92553736a2dbb3f1c13590733e5beb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f92553736a2dbb3f1c13590733e5beb") : c != null ? c.getHybridDialogPath() : "";
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a77d7f19f7795185f5fb2b0fccdcf240", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a77d7f19f7795185f5fb2b0fccdcf240")).booleanValue() : c != null && c.isDowngradeByHybridToOldFlow();
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eda221886f7770b06278bc68c9018bda", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eda221886f7770b06278bc68c9018bda")).booleanValue() : c != null && c.isUseWasai();
    }

    public static String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab0f0c61bec8cea99b17394c9eb3badb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab0f0c61bec8cea99b17394c9eb3badb") : c != null ? c.getWasaiDialogPath() : "";
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91ee3a6c44e33dc704a6d44c47923e6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91ee3a6c44e33dc704a6d44c47923e6b") : c != null ? c.getWasaiDialogDefaultVersion() : "";
    }

    public static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b9751b4b7e0e0cbaea3385615970464", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b9751b4b7e0e0cbaea3385615970464")).booleanValue() : c != null && c.isDowngradeWasaiToHybrid();
    }

    public static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a78fd1badc6525aa28a85b7b9278896f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a78fd1badc6525aa28a85b7b9278896f")).booleanValue() : c != null && c.isDowngradeWasaiToHybridWhenDddOrSoError();
    }

    public static boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11978e3d382957f0f04faaf2e44650c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11978e3d382957f0f04faaf2e44650c2")).booleanValue() : c != null && c.isCheckMd5();
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ea78f3348f0120365e5a0babf511e3d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ea78f3348f0120365e5a0babf511e3d")).booleanValue() : c != null && c.isCaptureWhenAppBack2home();
    }

    public static int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "348493f25277fb7cf84cbea1f8362f34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "348493f25277fb7cf84cbea1f8362f34")).intValue();
        }
        if (c == null) {
            return 0;
        }
        return c.getBase64SplitLength();
    }

    public static int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87dd218f91ae5d586c86cb766dea24b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87dd218f91ae5d586c86cb766dea24b1")).intValue();
        }
        if (c == null) {
            return 0;
        }
        return c.getSnapshotScaleSize();
    }

    public static boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a34f279a66cb50e5e018b3c30e9fad6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a34f279a66cb50e5e018b3c30e9fad6")).booleanValue() : c != null && c.isCheckWebviewWasmSupport();
    }
}
