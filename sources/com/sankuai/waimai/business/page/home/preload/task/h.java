package com.sankuai.waimai.business.page.home.preload.task;

import android.text.TextUtils;
import android.util.Size;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.widget.twolevel.report.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends i {
    public static ChangeQuickRedirect a;
    k b;

    public static /* synthetic */ void a(h hVar, HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "58a28d2a0c0648dab755215a0195e69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "58a28d2a0c0648dab755215a0195e69b");
        } else if (homeSecondFloorResponse.isResourceReady()) {
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "bgPic 和 effectPic  缓存完成更新数据" + homeSecondFloorResponse, new Object[0]);
            PreloadDataModel.get().setHomeSecondFloorResponse(homeSecondFloorResponse);
        }
    }

    public h() {
        super("SecondFloorTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3bc7513d3f5ce7cf5bc6bb2d03ce3b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3bc7513d3f5ce7cf5bc6bb2d03ce3b1");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d574aefe51eff602c24ee5bb81f468be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d574aefe51eff602c24ee5bb81f468be");
        } else {
            c();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda2d18698f188cf9da44e9bade88e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda2d18698f188cf9da44e9bade88e74");
            return;
        }
        super.cancel();
        if (this.b != null) {
            this.b.unsubscribe();
            this.b = null;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15bc9d036046437b81960a7ec07d62d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15bc9d036046437b81960a7ec07d62d9");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "request Second Api " + this, new Object[0]);
        if (com.sankuai.waimai.platform.accessibility.a.a().b()) {
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "request Second Api  无障碍模式不请求", new Object[0]);
            PreloadDataModel.get().setHomeSecondFloorResponse(null);
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", "start", new Object[0]);
        this.b = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).requestSecondFloorData(), new b.AbstractC1042b<BaseResponse<HomeSecondFloorResponse>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
            public final void onCompleted() {
            }

            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b
            public final /* synthetic */ BaseResponse<HomeSecondFloorResponse> a(BaseResponse<HomeSecondFloorResponse> baseResponse) {
                BaseResponse<HomeSecondFloorResponse> baseResponse2 = baseResponse;
                Object[] objArr2 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9c1d3290dcebc1f1aed5d08ad79331e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (BaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9c1d3290dcebc1f1aed5d08ad79331e");
                }
                if (baseResponse2 != null && baseResponse2.data != null && baseResponse2.isSuccess()) {
                    baseResponse2.data.homeSecondFloorData = (HomeSecondFloorResponse.HomeSecondFloorData) new Gson().fromJson(baseResponse2.data.originData, (Class<Object>) HomeSecondFloorResponse.HomeSecondFloorData.class);
                }
                return (BaseResponse) super.a(baseResponse2);
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "893ad41882bedfe0a4c73baaede0a406", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "893ad41882bedfe0a4c73baaede0a406");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "request Second Api  done", new Object[0]);
                h.this.b = null;
                if (baseResponse != null && baseResponse.data != 0 && baseResponse.isSuccess()) {
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", "net ready", new Object[0]);
                    final h hVar = h.this;
                    final HomeSecondFloorResponse homeSecondFloorResponse = (HomeSecondFloorResponse) baseResponse.data;
                    Object[] objArr3 = {homeSecondFloorResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "2e182b3faa8ace84c422bbac9ded7621", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "2e182b3faa8ace84c422bbac9ded7621");
                        return;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.resource == null || homeSecondFloorResponse.homeSecondFloorData.resource.view == null || homeSecondFloorResponse.homeSecondFloorData.resource.view.isDataValidate()) {
                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", " data Invalid , set data == null", new Object[0]);
                        PreloadDataModel.get().setHomeSecondFloorResponse(null);
                        return;
                    }
                    final a.C0793a c0793a = new a.C0793a();
                    c0793a.a = 2;
                    c0793a.b = 2;
                    PreloadDataModel.get().setSecondRecourceState(c0793a);
                    RequestCreator b = Picasso.g(com.meituan.android.singleton.b.a).d(homeSecondFloorResponse.homeSecondFloorData.resource.view.getCdnBgPic()).b();
                    b.k = DiskCacheStrategy.SOURCE;
                    RequestCreator a2 = b.a(Picasso.Priority.HIGH);
                    a2.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.preload.task.h.2
                        public static ChangeQuickRedirect a;

                        @Override // com.squareup.picasso.RequestListener
                        public final boolean a(Exception exc, Object obj2, boolean z) {
                            Object[] objArr4 = {exc, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "467b09fccaef592af9efa84a89f51f72", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "467b09fccaef592af9efa84a89f51f72")).booleanValue();
                            }
                            homeSecondFloorResponse.bgPicSize = null;
                            PreloadDataModel.get().setHomeSecondFloorResponse(null);
                            c0793a.a = 1;
                            PreloadDataModel.get().setSecondRecourceState(c0793a);
                            return false;
                        }

                        @Override // com.squareup.picasso.RequestListener
                        public final boolean a(Object obj2, Object obj3, boolean z, boolean z2) {
                            Object[] objArr4 = {obj2, obj3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2de53156b301f261d88a2df89d7bac00", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2de53156b301f261d88a2df89d7bac00")).booleanValue();
                            }
                            if (obj2 instanceof PicassoDrawable) {
                                PicassoDrawable picassoDrawable = (PicassoDrawable) obj2;
                                int intrinsicWidth = picassoDrawable.getIntrinsicWidth();
                                int intrinsicHeight = picassoDrawable.getIntrinsicHeight();
                                if (picassoDrawable.getIntrinsicWidth() > 0 && picassoDrawable.getIntrinsicHeight() > 0) {
                                    homeSecondFloorResponse.bgPicSize = new Size(intrinsicWidth, intrinsicHeight);
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", "bg ready  " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "bgPic 缓存成功 , width: " + intrinsicWidth + "  height: " + intrinsicHeight, new Object[0]);
                                    c0793a.a = 0;
                                    PreloadDataModel.get().setSecondRecourceState(c0793a);
                                    h.a(h.this, homeSecondFloorResponse);
                                }
                            }
                            return false;
                        }
                    };
                    a2.k();
                    if (homeSecondFloorResponse.shouldDisplayEffectPic()) {
                        RequestCreator b2 = Picasso.g(com.meituan.android.singleton.b.a).d(homeSecondFloorResponse.homeSecondFloorData.resource.view.getCdnEffectPic()).b();
                        b2.k = DiskCacheStrategy.SOURCE;
                        RequestCreator a3 = b2.a(Picasso.Priority.HIGH);
                        a3.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.preload.task.h.3
                            public static ChangeQuickRedirect a;

                            @Override // com.squareup.picasso.RequestListener
                            public final boolean a(Exception exc, Object obj2, boolean z) {
                                Object[] objArr4 = {exc, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b800d5a78acfb7fab68ad73f44e6994a", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b800d5a78acfb7fab68ad73f44e6994a")).booleanValue();
                                }
                                homeSecondFloorResponse.effectPicSize = null;
                                PreloadDataModel.get().setHomeSecondFloorResponse(null);
                                c0793a.b = 1;
                                PreloadDataModel.get().setSecondRecourceState(c0793a);
                                return false;
                            }

                            @Override // com.squareup.picasso.RequestListener
                            public final boolean a(Object obj2, Object obj3, boolean z, boolean z2) {
                                Object[] objArr4 = {obj2, obj3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "064ff6224116efced0993aa06df64acc", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "064ff6224116efced0993aa06df64acc")).booleanValue();
                                }
                                if (obj2 instanceof PicassoDrawable) {
                                    PicassoDrawable picassoDrawable = (PicassoDrawable) obj2;
                                    int intrinsicWidth = picassoDrawable.getIntrinsicWidth();
                                    int intrinsicHeight = picassoDrawable.getIntrinsicHeight();
                                    if (picassoDrawable.getIntrinsicWidth() > 0 && picassoDrawable.getIntrinsicHeight() > 0) {
                                        homeSecondFloorResponse.effectPicSize = new Size(intrinsicWidth, intrinsicHeight);
                                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", "effect ready  " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "effectPic 缓存成功 , width: " + intrinsicWidth + "  height: " + intrinsicHeight, new Object[0]);
                                        c0793a.b = 0;
                                        PreloadDataModel.get().setSecondRecourceState(c0793a);
                                        h.a(h.this, homeSecondFloorResponse);
                                    }
                                }
                                return false;
                            }
                        };
                        a3.k();
                    }
                    String cdnGuidePic = homeSecondFloorResponse.homeSecondFloorData.resource.view.getCdnGuidePic();
                    if (!TextUtils.isEmpty(cdnGuidePic)) {
                        RequestCreator b3 = Picasso.g(com.meituan.android.singleton.b.a).d(cdnGuidePic).b();
                        b3.k = DiskCacheStrategy.SOURCE;
                        RequestCreator a4 = b3.a(Picasso.Priority.HIGH);
                        a4.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.preload.task.h.4
                            public static ChangeQuickRedirect a;

                            @Override // com.squareup.picasso.RequestListener
                            public final boolean a(Exception exc, Object obj2, boolean z) {
                                homeSecondFloorResponse.guidePicSize = null;
                                return false;
                            }

                            @Override // com.squareup.picasso.RequestListener
                            public final boolean a(Object obj2, Object obj3, boolean z, boolean z2) {
                                Object[] objArr4 = {obj2, obj3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2e6288a513e722f11c13bc28cf119218", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2e6288a513e722f11c13bc28cf119218")).booleanValue();
                                }
                                if (obj2 instanceof PicassoDrawable) {
                                    PicassoDrawable picassoDrawable = (PicassoDrawable) obj2;
                                    int intrinsicWidth = picassoDrawable.getIntrinsicWidth();
                                    int intrinsicHeight = picassoDrawable.getIntrinsicHeight();
                                    if (picassoDrawable.getIntrinsicWidth() > 0 && picassoDrawable.getIntrinsicHeight() > 0) {
                                        homeSecondFloorResponse.guidePicSize = new Size(intrinsicWidth, intrinsicHeight);
                                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "guidePic 缓存成功 , width: " + intrinsicWidth + "  height: " + intrinsicHeight, new Object[0]);
                                    }
                                }
                                return false;
                            }
                        };
                        a4.k();
                    }
                    com.sankuai.waimai.business.page.home.ugc.a.a(homeSecondFloorResponse);
                    return;
                }
                PreloadDataModel.get().setIsSecondFloorApiError(Boolean.TRUE);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff8086369a1e7fefa528254b80433cc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff8086369a1e7fefa528254b80433cc1");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "request Second Api  Error", new Object[0]);
                PreloadDataModel.get().setIsSecondFloorApiError(Boolean.TRUE);
                h.this.b = null;
            }
        }, null);
    }
}
