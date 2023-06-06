package com.sankuai.waimai.ugc.creator.manager;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.j;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.waimai.ugc.creator.utils.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c31fb2bc44578e1c4f9689d103805ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c31fb2bc44578e1c4f9689d103805ebb");
            return;
        }
        try {
            if (!i.b()) {
                j a2 = new j.a().a(false).a(new com.sankuai.meituan.mtlive.core.f() { // from class: com.sankuai.waimai.ugc.creator.manager.f.1
                    @Override // com.sankuai.meituan.mtlive.core.f
                    public final String a() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.mtlive.core.f
                    public final String b() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.mtlive.core.f
                    public final int c() {
                        return 0;
                    }

                    @Override // com.sankuai.meituan.mtlive.core.f
                    public final String d() {
                        return "";
                    }
                }).a();
                k.a().b(new com.sankuai.meituan.mtlive.core.e() { // from class: com.sankuai.waimai.ugc.creator.manager.f.2
                    @Override // com.sankuai.meituan.mtlive.core.e
                    public final String a() {
                        return "https://license.vod2.myqcloud.com/license/v1/9d1f394126844f838f1b6604dfe0e646/TXUgcSDK.licence";
                    }

                    @Override // com.sankuai.meituan.mtlive.core.e
                    public final String b() {
                        return "35ebdd06da80c4d98ee2b0aa6df4444a";
                    }
                });
                k.a().a(context, a2);
                i.a(true);
            }
            a(bVar);
        } catch (Exception unused) {
            bVar.b();
        }
    }

    private static void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "640bbbe49c43802ffb2f82b8b7c64dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "640bbbe49c43802ffb2f82b8b7c64dd7");
        } else {
            com.sankuai.meituan.mtlive.ugc.library.b.a(33019, new k.a() { // from class: com.sankuai.waimai.ugc.creator.manager.f.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialSucceed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90a41e1189d64388e28012d71c3c2450", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90a41e1189d64388e28012d71c3c2450");
                        return;
                    }
                    n.a("checkMTLiveEngineState->onMTLiveInitialSucceed");
                    if (b.this != null) {
                        b.this.a();
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d1781c7d36146390e4ae29e89ca48a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d1781c7d36146390e4ae29e89ca48a6");
                        return;
                    }
                    n.a("checkMTLiveEngineState->onMTLiveInitialFailed");
                    if (b.this != null) {
                        b.this.b();
                    }
                }
            });
        }
    }
}
