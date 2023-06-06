package com.sankuai.waimai.business.page.home.preload.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends i {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private k c;
    private k d;

    public static /* synthetic */ k a(c cVar, k kVar) {
        cVar.c = null;
        return null;
    }

    public static /* synthetic */ k b(c cVar, k kVar) {
        cVar.d = null;
        return null;
    }

    public c() {
        super("HomeMarketTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7609dbf3b0922548999cb1436b3e4a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7609dbf3b0922548999cb1436b3e4a5");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca391967a4afc2f83604597f39d37928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca391967a4afc2f83604597f39d37928");
        } else if (com.sankuai.waimai.platform.accessibility.a.a().b()) {
            com.sankuai.waimai.foundation.utils.log.a.b("Market__TASK", "request Market Api  无障碍模式不请求", new Object[0]);
            PreloadDataModel.get().setHomeHeaderFloatResponse(null);
            PreloadDataModel.get().setHomeSideBarResponse(null);
        } else {
            c();
            if (b) {
                return;
            }
            e();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "270393fbda38300f595b26154b194be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "270393fbda38300f595b26154b194be5");
        } else {
            this.c = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).requestHeaderFloatData(), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.home.model.e>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94f3a56d4dac26a894defe44bbb5b0c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94f3a56d4dac26a894defe44bbb5b0c1");
                        return;
                    }
                    c.a(c.this, null);
                    if (baseResponse != null && baseResponse.data != 0 && baseResponse.isSuccess()) {
                        PreloadDataModel.get().setHomeHeaderFloatResponse((com.sankuai.waimai.business.page.home.model.e) baseResponse.data);
                    } else {
                        PreloadDataModel.get().setHomeHeaderFloatResponse(null);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72983fbb9f414d4c8e47c9f2c9b38f50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72983fbb9f414d4c8e47c9f2c9b38f50");
                        return;
                    }
                    PreloadDataModel.get().setHomeHeaderFloatResponse(null);
                    c.a(c.this, null);
                }
            }, null);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23c62a867640eea3779b692d1d2c334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23c62a867640eea3779b692d1d2c334");
        } else {
            this.d = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).requestSideBarData(), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.home.model.e>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.c.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd642e59f3e90a476a9703be341d1b6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd642e59f3e90a476a9703be341d1b6c");
                        return;
                    }
                    c.b(c.this, null);
                    if (baseResponse != null && baseResponse.data != 0 && baseResponse.isSuccess()) {
                        PreloadDataModel.get().setHomeSideBarResponse((com.sankuai.waimai.business.page.home.model.e) baseResponse.data);
                    } else {
                        PreloadDataModel.get().setHomeSideBarResponse(null);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3077fea0df520c73e9f18f2daf20a9d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3077fea0df520c73e9f18f2daf20a9d");
                        return;
                    }
                    PreloadDataModel.get().setHomeSideBarResponse(null);
                    c.b(c.this, null);
                }
            }, null);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4be627c50486eaf463690f7c66f6d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4be627c50486eaf463690f7c66f6d9f");
            return;
        }
        super.cancel();
        if (this.c != null) {
            this.c.unsubscribe();
            this.c = null;
        }
        if (this.d != null) {
            this.d.unsubscribe();
            this.d = null;
        }
    }
}
