package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.support.annotation.NonNull;
import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.kit.a;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class x extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PlatformInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a376962258c3ace871423d6181aedf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a376962258c3ace871423d6181aedf");
            return;
        }
        com.sankuai.waimai.platform.b.A().a(application);
        com.sankuai.waimai.platform.b.A().k = com.sankuai.meituan.takeoutnew.a.h;
        com.sankuai.waimai.kit.a a2 = com.sankuai.waimai.kit.a.a();
        boolean z = com.sankuai.meituan.takeoutnew.a.f;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.kit.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "181e9abef1e35f88ae2421574495fe22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "181e9abef1e35f88ae2421574495fe22");
        } else {
            a.C0981a.a.b = z;
        }
        com.sankuai.waimai.kit.a.a().c = com.sankuai.waimai.platform.b.A().d();
        if (com.sankuai.meituan.takeoutnew.a.f) {
            com.dianping.monitor.impl.c.a(true);
        }
        DovePageMonitor.a(application);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b07e21cb837669f3ccce68ed1d045722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b07e21cb837669f3ccce68ed1d045722");
        } else {
            com.sankuai.waimai.kit.fingerPrint.a.a(new com.sankuai.waimai.kit.fingerPrint.b() { // from class: com.sankuai.waimai.launcher.init.mainly.x.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.fingerPrint.b
                public final FingerprintInfoProvider a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d083614d1cedebd936959d7dfc60406e", RobustBitConfig.DEFAULT_VALUE) ? (FingerprintInfoProvider) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d083614d1cedebd936959d7dfc60406e") : new com.sankuai.waimai.launcher.provider.fingerprint.a();
                }
            });
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "371682b66dc15207ffadbdefe5bb1003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "371682b66dc15207ffadbdefe5bb1003");
        } else {
            com.sankuai.waimai.kit.login.user.c.a();
            com.sankuai.waimai.kit.login.user.c.a(new com.sankuai.waimai.kit.login.user.a() { // from class: com.sankuai.waimai.launcher.init.mainly.x.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.login.user.a
                public final void a(boolean z2) {
                    Object[] objArr5 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "38a4124711ad851a2d62d4ff82d78819", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "38a4124711ad851a2d62d4ff82d78819");
                    } else {
                        com.dianping.mainboard.a.b().a(z2);
                    }
                }
            });
        }
        com.sankuai.waimai.foundation.utils.activity.a a3 = com.sankuai.waimai.foundation.utils.activity.a.a();
        Object[] objArr5 = {application};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.foundation.utils.activity.a.a;
        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "c514e046b07f0ac117bc65ddf97a0618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "c514e046b07f0ac117bc65ddf97a0618");
        } else if (application != null) {
            application.registerActivityLifecycleCallbacks(a3.b);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "6e0cdc95fda511bcfa08b60a18543faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "6e0cdc95fda511bcfa08b60a18543faa");
        } else {
            Long valueOf = Long.valueOf((long) DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION);
            com.sankuai.waimai.platform.capacity.permission.c.a().a("Locate.once", valueOf);
            com.sankuai.waimai.platform.capacity.permission.c.a().a(PermissionGuard.PERMISSION_PHONE_READ, valueOf);
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.launcher.provider.pltform.a.a;
        com.sankuai.waimai.foundation.core.base.activity.b.a(PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "a3b4b4f989d0c52bd67a7164c1985a83", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.base.activity.a) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "a3b4b4f989d0c52bd67a7164c1985a83") : new com.sankuai.waimai.launcher.provider.pltform.a());
        com.sankuai.waimai.foundation.core.base.fragment.b.a(new com.sankuai.waimai.foundation.core.base.fragment.a() { // from class: com.sankuai.waimai.launcher.init.mainly.x.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.base.fragment.a
            public final void a(BaseFragment baseFragment) {
                Object[] objArr8 = {baseFragment};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2b204591f2e0f87c5b40d27ba16928f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2b204591f2e0f87c5b40d27ba16928f7");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(baseFragment.q());
                }
            }

            @Override // com.sankuai.waimai.foundation.core.base.fragment.a
            public final void a(BaseFragment baseFragment, boolean z2) {
                Object[] objArr8 = {baseFragment, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ae41337ac99465919ab15414732f8638", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ae41337ac99465919ab15414732f8638");
                } else {
                    AppInfo.onFragmentVisibilityChanged(baseFragment.getClass(), z2);
                }
            }

            @Override // com.sankuai.waimai.foundation.core.base.fragment.a
            public final void a(BaseFragment baseFragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
                Object[] objArr8 = {baseFragment, Integer.valueOf(i), strArr, iArr};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "08be8b40ba043198b0bb33cb9d10714d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "08be8b40ba043198b0bb33cb9d10714d");
                } else if (com.sankuai.waimai.foundation.core.a.b()) {
                    try {
                        throw new IllegalArgumentException("需要替换隐私SDK接口");
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.b(e);
                    }
                }
            }
        });
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3913d932a08fa74dd968686bf1011f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3913d932a08fa74dd968686bf1011f29");
        } else if (j == -1) {
        } else {
            com.sankuai.waimai.platform.capacity.permission.c.a().a("Locate.once", Long.valueOf(j));
            com.sankuai.waimai.platform.capacity.permission.c.a().a(PermissionGuard.PERMISSION_PHONE_READ, Long.valueOf(j));
        }
    }
}
