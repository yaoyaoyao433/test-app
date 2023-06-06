package com.sankuai.waimai.business.im.group.utils;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.api.WmImCommonService;
import com.sankuai.waimai.business.im.common.model.d;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull final g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a55b7704c88244ea033ad2fc3bf966b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a55b7704c88244ea033ad2fc3bf966b");
            return;
        }
        Uri uri = jVar.d;
        final String queryParameter = uri.getQueryParameter("poiId");
        final String queryParameter2 = uri.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
        String queryParameter3 = uri.getQueryParameter(Constants.EventConstants.KEY_ORDER_ID);
        final Activity activity = (Activity) jVar.c;
        Object[] objArr2 = {activity, queryParameter, queryParameter2, queryParameter3, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9740eb25b9e5e0bba4feaea54ff9d2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9740eb25b9e5e0bba4feaea54ff9d2b");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImCommonService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImCommonService.class)).getUserGroupChatInfo(r.a(queryParameter, 0L), queryParameter2, r.a(queryParameter3, 0L), 7), new b.AbstractC1042b<BaseResponse<d>>() { // from class: com.sankuai.waimai.business.im.group.utils.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f433a7174829bb1f758caa678cea12a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f433a7174829bb1f758caa678cea12a");
                    } else if (activity.isFinishing()) {
                    } else {
                        if (baseResponse == null) {
                            ae.a(activity, (int) R.string.takeout_loading_fail_try_afterwhile);
                            return;
                        }
                        if (baseResponse.data != 0) {
                            JudasManualManager.a("b_waimai_pnnt3l6m_mc").a("poi_id", com.sankuai.waimai.business.im.utils.a.a(queryParameter, queryParameter2)).a("group_id", ((d) baseResponse.data).b).a();
                        }
                        if (baseResponse.data != 0 && ((d) baseResponse.data).a != null && ((d) baseResponse.data).a.length() > 0) {
                            com.sankuai.waimai.foundation.router.a.a(activity, ((d) baseResponse.data).a);
                            if (gVar != null) {
                                gVar.a(200);
                                return;
                            }
                            return;
                        }
                        ae.a(activity, baseResponse.msg);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a9a6b659969acc7a1175c430b03bbad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a9a6b659969acc7a1175c430b03bbad");
                    } else if (activity.isFinishing()) {
                    } else {
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(activity, (Throwable) null);
                        if (gVar != null) {
                            gVar.a(200);
                        }
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        }
    }
}
