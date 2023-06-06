package com.sankuai.waimai.business.page.home.preload.task;

import android.arch.lifecycle.l;
import android.support.annotation.Nullable;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.gray.HomeGrayModel;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.List;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends i {
    public static ChangeQuickRedirect a;
    k b;

    public b() {
        super("HomeGrayTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ec5db2c04d0b8ad1df5d7ecf7ccee3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ec5db2c04d0b8ad1df5d7ecf7ccee3");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2972ac7e88ba3554c491194383313cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2972ac7e88ba3554c491194383313cd8");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.preload.task.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b4b79a0c337e8d0396200aa5a6c27f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b4b79a0c337e8d0396200aa5a6c27f2");
                        return;
                    }
                    final b bVar = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "eac6e3089a8a66edb590f84a7f928dd3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "eac6e3089a8a66edb590f84a7f928dd3");
                    } else {
                        PreloadDataModel.get().getAddress().a(new l<WmAddress>() { // from class: com.sankuai.waimai.business.page.home.preload.task.b.2
                            public static ChangeQuickRedirect a;

                            @Override // android.arch.lifecycle.l
                            public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                                Object[] objArr4 = {wmAddress};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "786c7f3c2d5d27d20793ca119797e9ec", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "786c7f3c2d5d27d20793ca119797e9ec");
                                    return;
                                }
                                Pair<Long, Long> c = b.this.c();
                                HomeGrayManager.a().d = false;
                                b.this.b = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).requestHomeGray(((Long) c.first).longValue(), ((Long) c.second).longValue()), new b.AbstractC1042b<BaseResponse<HomeGrayModel>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.b.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                    }

                                    @Override // rx.e
                                    public final /* synthetic */ void onNext(Object obj) {
                                        BaseResponse baseResponse = (BaseResponse) obj;
                                        Object[] objArr5 = {baseResponse};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad45739554a0cd07cbe81e894e19568e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad45739554a0cd07cbe81e894e19568e");
                                        } else if (baseResponse == null || baseResponse.code != 0 || baseResponse.data == 0) {
                                            HomeGrayManager.a().a(false, true);
                                        } else if (CollectionUtils.isEmpty(((HomeGrayModel) baseResponse.data).positions) || ((HomeGrayModel) baseResponse.data).positions.get(0) == null) {
                                            HomeGrayManager.a().a(false, true);
                                        } else if (CollectionUtils.isEmpty(((HomeGrayModel) baseResponse.data).positions.get(0).resources) || ((HomeGrayModel) baseResponse.data).positions.get(0).resources.get(0) == null || ((HomeGrayModel) baseResponse.data).positions.get(0).resources.get(0).config == null) {
                                            HomeGrayManager.a().a(false, true);
                                        } else {
                                            HomeGrayManager.a().a(((HomeGrayModel) baseResponse.data).positions.get(0).resources.get(0).config, true);
                                        }
                                    }
                                }, null);
                            }
                        });
                    }
                }
            });
        }
    }

    Pair<Long, Long> c() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631fd5c9be04cc65b6343da5684b7c95", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631fd5c9be04cc65b6343da5684b7c95");
        }
        List<MtBackCityInfo> u = com.sankuai.waimai.foundation.location.v2.h.u();
        long j2 = 0;
        if (u != null) {
            if (!u.isEmpty()) {
                j = 0;
                for (MtBackCityInfo mtBackCityInfo : u) {
                    try {
                        if (mtBackCityInfo.level == 2) {
                            j2 = Long.parseLong(mtBackCityInfo.id);
                        } else if (mtBackCityInfo.level == 3) {
                            j = Long.parseLong(mtBackCityInfo.id);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        j = 0;
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fcad880e6ff8f07ab8c099fbf3e2d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fcad880e6ff8f07ab8c099fbf3e2d7");
            return;
        }
        super.cancel();
        if (this.b != null) {
            this.b.unsubscribe();
            this.b = null;
        }
    }
}
