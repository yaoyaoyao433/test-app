package com.sankuai.waimai.platform.capacity.network.rxsupport;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
import rx.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static <T> d.c<BaseResponse<T>, T> a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c881dec4db93fae88b6ad6d02274196e", RobustBitConfig.DEFAULT_VALUE) ? (d.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c881dec4db93fae88b6ad6d02274196e") : a(context, rx.schedulers.a.e(), rx.android.schedulers.a.a());
    }

    private static <T> d.c<BaseResponse<T>, T> a(final Context context, final g gVar, final g gVar2) {
        Object[] objArr = {context, gVar, gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4103d0ed85453ae13169d7a6cd76e993", RobustBitConfig.DEFAULT_VALUE) ? (d.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4103d0ed85453ae13169d7a6cd76e993") : new d.c<BaseResponse<T>, T>() { // from class: com.sankuai.waimai.platform.capacity.network.rxsupport.c.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Object call(Object obj) {
                d dVar = (d) obj;
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6b49cb1c5eea8484c7c96927f8ecb1f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6b49cb1c5eea8484c7c96927f8ecb1f") : dVar.c(new rx.functions.g<BaseResponse<T>, d<T>>() { // from class: com.sankuai.waimai.platform.capacity.network.rxsupport.c.1.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ Object call(Object obj2) {
                        BaseResponse baseResponse = (BaseResponse) obj2;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3f74ad906c93e2fb6c64173313b083c", RobustBitConfig.DEFAULT_VALUE)) {
                            return (d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3f74ad906c93e2fb6c64173313b083c");
                        }
                        if (baseResponse.isSuccess() || baseResponse.isForbiddenLimited()) {
                            final Object obj3 = baseResponse.data;
                            Object[] objArr4 = {obj3};
                            ChangeQuickRedirect changeQuickRedirect4 = c.a;
                            return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3b64a3b79145ccc78385fc040ef1d788", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3b64a3b79145ccc78385fc040ef1d788") : d.a((d.a) new d.a<T>() { // from class: com.sankuai.waimai.platform.capacity.network.rxsupport.c.2
                                public static ChangeQuickRedirect a;

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // rx.functions.b
                                public final /* synthetic */ void call(Object obj4) {
                                    j jVar = (j) obj4;
                                    Object[] objArr5 = {jVar};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4e0e0ed9a025c9a047fb647580071fea", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4e0e0ed9a025c9a047fb647580071fea");
                                        return;
                                    }
                                    try {
                                        jVar.onNext(obj3);
                                        jVar.onCompleted();
                                    } catch (Exception e) {
                                        jVar.onError(e);
                                    }
                                }
                            });
                        }
                        throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse.code, com.sankuai.waimai.platform.capacity.network.errorhanding.a.a(context, baseResponse));
                    }
                }).b(gVar).a(gVar2);
            }
        };
    }
}
