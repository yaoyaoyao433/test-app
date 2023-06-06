package com.meituan.android.hybridcashier.hook;

import android.app.Activity;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.hybridcashier.config.bean.HybridCashierGlobalConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.pool.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.hybridcashier.hook.a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.hybridcashier.hook.a
    public final void a(Activity activity, String str) {
        boolean z;
        HybridCashierSetting a2;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56247711839a96ec1bdf6d8756a0b537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56247711839a96ec1bdf6d8756a0b537");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eeca2bdad3998ee756948cbd6dac136", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (HybridCashierSetting) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eeca2bdad3998ee756948cbd6dac136");
        } else {
            HybridCashierConfig b = com.meituan.android.hybridcashier.config.horn.c.b(str);
            Object[] objArr3 = {b, str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18c331d2257fdb11f8a78150e63171ab", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18c331d2257fdb11f8a78150e63171ab")).booleanValue();
            } else {
                z = b != null && b.isNSREnabled(str) && !com.meituan.android.neohybrid.neo.nsr.b.a(b.getCashierUrlForNSR()) && b.isOfflinePkgCheckAvailable(false);
            }
            a2 = z ? com.meituan.android.hybridcashier.config.a.a(b) : null;
        }
        if (a(a2, false)) {
            return;
        }
        HybridCashierConfig c = com.meituan.android.hybridcashier.config.horn.c.c(str);
        Object[] objArr4 = {c};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41b8a07662bed5edfe38ae00f9242050", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41b8a07662bed5edfe38ae00f9242050")).booleanValue();
        } else if (c == null || !c.isPreloadEnabled()) {
        } else {
            String preloadUrl = c.getPreloadUrl();
            long preloadDelay = c.getPreloadDelay();
            NeoConfig neoConfig = new NeoConfig("hybrid_cashier");
            if (TextUtils.isEmpty(preloadUrl)) {
                com.meituan.android.neohybrid.neo.pool.c.a(c.b.a(c.EnumC0308c.NORMAL, neoConfig, preloadDelay));
                return;
            }
            neoConfig.setUrl(preloadUrl);
            com.meituan.android.neohybrid.neo.pool.c.a(c.b.a(c.EnumC0308c.PRELOAD, neoConfig, preloadDelay));
        }
    }

    public final boolean a(HybridCashierSetting hybridCashierSetting, boolean z) {
        Object[] objArr = {hybridCashierSetting, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831c03e71bcfc6dbc67023df465a02f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831c03e71bcfc6dbc67023df465a02f2")).booleanValue();
        }
        if (hybridCashierSetting == null || !hybridCashierSetting.isNSREnabled()) {
            return false;
        }
        String builder = hybridCashierSetting.genCashierUrlForNSR().toString();
        if (TextUtils.isEmpty(builder) || com.meituan.android.neohybrid.neo.nsr.b.a(builder)) {
            return false;
        }
        final NeoConfig neoConfig = new NeoConfig("hybrid_cashier");
        neoConfig.setNeoBridge(hybridCashierSetting.enableNeoBridge());
        neoConfig.setNeoPresetBundle(hybridCashierSetting.enablePresetBundle());
        neoConfig.setNeoRequestBridge(hybridCashierSetting.ennableNeoRequestBridgeBridge());
        neoConfig.setNeoPrerenderBridge(hybridCashierSetting.enableNeoPrerenderBridge());
        neoConfig.setNeoOffline(hybridCashierSetting.isCheckOfflinePackageEnable());
        neoConfig.setNeoIndexParams(true);
        neoConfig.setUrl(builder);
        neoConfig.nsfConfig().setNsfSaved(((HybridCashierGlobalConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridCashierGlobalConfig.class)).isEnableNsfSaved());
        final long nsrDelay = hybridCashierSetting.getNsrDelay();
        if (z && Build.VERSION.SDK_INT >= 23) {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.android.hybridcashier.hook.d.1
                public static ChangeQuickRedirect a;

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02e5a5ac67a53499a43a8e71a26d7191", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02e5a5ac67a53499a43a8e71a26d7191")).booleanValue();
                    }
                    if (!com.meituan.android.neohybrid.neo.nsr.b.a(neoConfig.getUrl())) {
                        com.meituan.android.neohybrid.neo.nsr.b.a(neoConfig, nsrDelay, true);
                    }
                    return false;
                }
            });
        } else {
            com.meituan.android.neohybrid.neo.nsr.b.a(neoConfig, nsrDelay, false);
        }
        return true;
    }

    public final void a(HybridCashierSetting hybridCashierSetting) {
        Object[] objArr = {hybridCashierSetting};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4190c9363c099535a5e21ae2f8907e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4190c9363c099535a5e21ae2f8907e68");
        } else if (hybridCashierSetting.isNSRKeepEnabled() && !com.meituan.android.neohybrid.neo.nsr.b.a(hybridCashierSetting.genCashierUrlForNSR().toString()) && hybridCashierSetting.isOfflinePkgCheckAvailable()) {
            a(hybridCashierSetting, hybridCashierSetting.isNSRAllPagesEnabled());
        }
    }

    public d() {
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "637f17b5d12c43acfe5438b9d405ba00", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "637f17b5d12c43acfe5438b9d405ba00") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final d a = new d();
    }
}
