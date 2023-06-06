package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.kit.share.ShareConstant;
import com.sankuai.waimai.launcher.model.AppInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class u extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PayInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42049c9d9ef4588c259624d9ee6a216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42049c9d9ef4588c259624d9ee6a216");
            return;
        }
        com.meituan.android.paycommon.lib.config.a.a(application, new com.meituan.android.paycommon.lib.config.e() { // from class: com.sankuai.waimai.launcher.init.mainly.u.1
            public static ChangeQuickRedirect b;

            @Override // com.meituan.android.paycommon.lib.config.e
            public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
                Object[] objArr2 = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a1c1f75e5ba7b536b98f21e061eff8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a1c1f75e5ba7b536b98f21e061eff8f");
                } else {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(j, str, i, i2, i3, i4, i5, i6);
                }
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3e773710044bcc061b2cfa4a6162efb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3e773710044bcc061b2cfa4a6162efb") : com.sankuai.waimai.kit.a.a().b() ? "waimaiinternaltest" : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "438a4b9486d369dae81f3d3b676eb45e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "438a4b9486d369dae81f3d3b676eb45e") : com.sankuai.waimai.platform.b.A().o();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbde9d8525342f726b2b41d9694563eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbde9d8525342f726b2b41d9694563eb") : com.sankuai.waimai.platform.b.A().h();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final MtLocation f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e32d74e0f2c4336c409e62b58fbe77a4", RobustBitConfig.DEFAULT_VALUE) ? (MtLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e32d74e0f2c4336c409e62b58fbe77a4") : com.meituan.android.privacy.locate.f.a().a("com.sankuai.waimai:launcher");
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d06f5928170529390b0c45fe2e1a5440", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d06f5928170529390b0c45fe2e1a5440") : String.valueOf(AppInfo.getCityID());
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9093c2814a9eb5560761673695376431", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9093c2814a9eb5560761673695376431") : com.sankuai.waimai.platform.b.A().b();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String j() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4bdb183f8de41d59354a366dafb418b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4bdb183f8de41d59354a366dafb418b") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39fbec236569b63d17d84c6c8a06c8d4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39fbec236569b63d17d84c6c8a06c8d4") : com.sankuai.waimai.platform.b.A().r();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String l() {
                return com.sankuai.meituan.takeoutnew.a.d;
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final int m() {
                return com.sankuai.meituan.takeoutnew.a.c;
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93b80a9e3da157a72c1c01d8eed758c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93b80a9e3da157a72c1c01d8eed758c1") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String n() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57abff7b27342c46e77f6b37493ea053", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57abff7b27342c46e77f6b37493ea053");
                }
                com.sankuai.waimai.platform.b.A();
                return com.sankuai.waimai.platform.b.H();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String o() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "380fc0fa4dbcd9dd060d4e3149dd5b30", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "380fc0fa4dbcd9dd060d4e3149dd5b30");
                }
                if (com.sankuai.waimai.platform.b.A().l) {
                    return com.sankuai.waimai.platform.b.A().F();
                }
                return com.sankuai.waimai.kit.fingerPrint.a.a().b.fingerprint();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String q() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ff9a9e8ba28787220029847a549e4cd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ff9a9e8ba28787220029847a549e4cd") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String p() {
                return ShareConstant.a;
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final String a() {
                String str;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b618ed3ab7762f7c696bdbb80934c2ba", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b618ed3ab7762f7c696bdbb80934c2ba");
                }
                if (com.sankuai.waimai.platform.net.c.a().b()) {
                    return super.a();
                }
                com.sankuai.waimai.platform.net.c a2 = com.sankuai.waimai.platform.net.c.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "13ae633e71bacd18623e473bb7837629", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "13ae633e71bacd18623e473bb7837629");
                }
                str = a2.m.f;
                return str;
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final Map<e.a, Integer> b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4f866ed45c21056c97ab58d2ce11948", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4f866ed45c21056c97ab58d2ce11948") : new HashMap();
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final com.meituan.android.paybase.imageloader.a r() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "749bff4817f52750176e5519f6e1453c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.imageloader.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "749bff4817f52750176e5519f6e1453c") : new com.meituan.android.payimage.mtpicasso.b(this.a);
            }

            @Override // com.meituan.android.paycommon.lib.config.e
            public final com.meituan.android.paybase.login.a s() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da804b841035955be6fe2c80eaf0fa8f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.login.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da804b841035955be6fe2c80eaf0fa8f") : new com.meituan.android.paypassport.a();
            }
        });
        com.meituan.android.paycommon.lib.config.a.a(com.meituan.android.singleton.b.a.getApplicationContext());
    }
}
