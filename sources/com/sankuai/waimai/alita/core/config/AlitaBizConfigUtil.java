package com.sankuai.waimai.alita.core.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.config.a;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaBizConfigUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SwitchType {
        public static final int CLOSE_AUTORUN = 3;
        public static final int CLOSE_DATA_DOWNLOAD = 4;
        public static final int CLOSE_JS_CALCULATE = 2;
        public static final int CLOSE_MODEL_PREDICT = 1;
        public static final int ENABLE_LOG = 5;
        public static final int ENABLE_SQL_COMPATIBLE = 6;
    }

    public static boolean a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9f6885c8e3c480d88ff62bc898c9f51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9f6885c8e3c480d88ff62bc898c9f51")).booleanValue() : b(i, AlitaBundleUtil.a(str));
    }

    public static boolean b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdb4dd26333033cdec7fbde2308946ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdb4dd26333033cdec7fbde2308946ed")).booleanValue() : c(i, str) | a(i);
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7f76d1fc03bb9958bd105e7a2f06591", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7f76d1fc03bb9958bd105e7a2f06591")).booleanValue() : c(i, AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
    }

    private static boolean c(int i, String str) {
        a.C0699a c0699a;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10b08edfaf87404fc2020b83d6eafe8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10b08edfaf87404fc2020b83d6eafe8e")).booleanValue();
        }
        try {
            c0699a = ((AlitaBizConfigManager) Objects.requireNonNull(c.a().a(str))).e.f;
        } catch (Exception unused) {
            c0699a = null;
        }
        Object[] objArr2 = {Integer.valueOf(i), c0699a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d457661f8d9fb2aab7327d1c6b5b144c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d457661f8d9fb2aab7327d1c6b5b144c")).booleanValue();
        }
        if (c0699a != null) {
            switch (i) {
                case 1:
                    return c0699a.b.c();
                case 2:
                    return c0699a.c.c();
                case 3:
                    return c0699a.d.c();
                case 4:
                    return c0699a.e.c();
                case 5:
                    return c0699a.f.c();
                case 6:
                    return c0699a.g.c();
                default:
                    return false;
            }
        }
        return false;
    }
}
