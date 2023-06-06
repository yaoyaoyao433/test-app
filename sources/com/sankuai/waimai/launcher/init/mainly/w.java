package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.dianping.sdk.pike.h;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class w extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PikeInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f39ad35f7efde26f4ebd7f9d2bde09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f39ad35f7efde26f4ebd7f9d2bde09b");
            return;
        }
        com.dianping.sdk.pike.h.a(application, 11, new h.a() { // from class: com.sankuai.waimai.launcher.init.mainly.w.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sdk.pike.h.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c775ef75cff78ab8e1c188c431e10c4d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c775ef75cff78ab8e1c188c431e10c4d") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
            }
        });
        com.meituan.met.mercury.load.core.g.a(application, new com.meituan.met.mercury.load.core.l() { // from class: com.sankuai.waimai.launcher.init.mainly.w.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.met.mercury.load.core.l
            public final int getMobileAppId() {
                return 11;
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUuid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e339e7babd5155f2b7993959704700a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e339e7babd5155f2b7993959704700a") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ba68aeaf4bcef1386ee355c48220519", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ba68aeaf4bcef1386ee355c48220519") : com.sankuai.waimai.platform.b.A().B();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "158465248b5ca20638161e58b937acbd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "158465248b5ca20638161e58b937acbd") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final com.meituan.met.mercury.load.core.j getPushImpl() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5eedd1d205f2fafb68cf4cceca977c5b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.met.mercury.load.core.j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5eedd1d205f2fafb68cf4cceca977c5b") : com.meituan.met.mercury.push.a.b("waimai");
            }
        });
    }
}
