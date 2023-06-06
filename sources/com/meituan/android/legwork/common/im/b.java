package com.meituan.android.legwork.common.im;

import android.text.TextUtils;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c90aa03ede3d9d15b8ca110cfc7cbf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c90aa03ede3d9d15b8ca110cfc7cbf2");
            return;
        }
        final a aVar = this.b;
        com.meituan.android.legwork.common.bus.event.c cVar = (com.meituan.android.legwork.common.bus.event.c) obj;
        Object[] objArr2 = {aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f924ba1c8f05aa9343c43939081f2f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f924ba1c8f05aa9343c43939081f2f7");
        } else if (aVar.b == null || !TextUtils.equals(aVar.b.orderId, cVar.a)) {
        } else {
            int i = cVar.b;
            if (i != -1) {
                switch (i) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "80f0458f598ee3d44a1497feacfb80cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "80f0458f598ee3d44a1497feacfb80cd");
            } else {
                aVar.a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<IMInitializeData>() { // from class: com.meituan.android.legwork.common.im.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final void a(boolean z, int i2, String str) {
                    }

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final /* synthetic */ void a(IMInitializeData iMInitializeData) {
                        IMInitializeData iMInitializeData2 = iMInitializeData;
                        Object[] objArr4 = {iMInitializeData2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26ee3d0ae50ada4d3d38a7841897812f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26ee3d0ae50ada4d3d38a7841897812f");
                        } else if (iMInitializeData2 == null || !iMInitializeData2.showTips || TextUtils.isEmpty(iMInitializeData2.tips) || aVar.d == null) {
                        } else {
                            aVar.d.a(false, iMInitializeData2.tips);
                        }
                    }
                }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getInitializeData(aVar.b.orderId).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
            }
        }
    }
}
