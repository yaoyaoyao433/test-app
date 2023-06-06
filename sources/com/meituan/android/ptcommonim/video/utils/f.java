package com.meituan.android.ptcommonim.video.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.j;
import com.sankuai.meituan.mtlive.core.k;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9dc9bd3d6b6f0bd685a2de4902e5ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9dc9bd3d6b6f0bd685a2de4902e5ac1");
            return;
        }
        try {
            j a2 = new j.a().a();
            k.a().b(new com.sankuai.meituan.mtlive.core.e() { // from class: com.meituan.android.ptcommonim.video.utils.f.1
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
            a((k.a) null);
        } catch (Exception unused) {
        }
    }

    public static void a(final k.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dc472706b6505a3ba853ffcc3298c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dc472706b6505a3ba853ffcc3298c23");
        } else if (!com.sankuai.meituan.mtlive.ugc.library.b.a(453197)) {
            com.sankuai.meituan.mtlive.ugc.library.b.a(453197, new k.a() { // from class: com.meituan.android.ptcommonim.video.utils.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialSucceed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84d123ae93bb835b6969df129319ca76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84d123ae93bb835b6969df129319ca76");
                    } else if (k.a.this != null) {
                        k.a.this.onInitialSucceed();
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f87f8ec25e6371e737e89a6ca2b0e391", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f87f8ec25e6371e737e89a6ca2b0e391");
                    } else if (k.a.this != null) {
                        k.a.this.onInitialFailed();
                    }
                }
            });
        } else if (aVar != null) {
            aVar.onInitialSucceed();
        }
    }
}
