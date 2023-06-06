package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d extends b {
    public static ChangeQuickRedirect d;
    protected int e;
    protected long f;
    protected long h;
    protected String i;
    protected long j;
    protected int k;
    protected Bundle l;
    protected final HashSet<String> m;
    Dialog n;

    public abstract void a(Activity activity);

    public abstract String b(Activity activity);

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.business.im.prepare.d r32, android.app.Activity r33, com.sankuai.waimai.business.im.model.PoiImInfo r34, long r35, long r37, java.lang.String r39, boolean r40, int r41) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.prepare.d.a(com.sankuai.waimai.business.im.prepare.d, android.app.Activity, com.sankuai.waimai.business.im.model.PoiImInfo, long, long, java.lang.String, boolean, int):void");
    }

    public d(Activity activity, int i, long j, long j2, String str, long j3, HashSet<String> hashSet, int i2, boolean z, Bundle bundle) {
        super(activity, z);
        Object[] objArr = {activity, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), hashSet, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77135d8e0b32a6a3a259b50dedbe3c5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77135d8e0b32a6a3a259b50dedbe3c5b");
            return;
        }
        this.m = new HashSet<>();
        this.e = i;
        this.f = j;
        this.h = j2;
        this.i = str;
        this.j = j3;
        this.k = i2;
        this.l = bundle;
        if (hashSet != null) {
            this.m.addAll(hashSet);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void b() {
        int i;
        long j;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6576855bc04155ad63302c93af27927e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6576855bc04155ad63302c93af27927e");
            return;
        }
        final Activity activity = this.b != null ? this.b.get() : null;
        if (activity == null || activity.isFinishing()) {
            a("Activity is finishing before request");
            return;
        }
        if (!com.sankuai.waimai.imbase.manager.b.a().e()) {
            com.sankuai.waimai.imbase.manager.b.a().a(activity);
        }
        if (this.l != null) {
            i = this.l.getInt("ref", 0);
            i2 = this.l.getInt("sg_cancel_loading", 0);
        } else {
            i = 0;
        }
        if (i == 100) {
            this.e = 8;
        }
        if (i2 == 0) {
            this.n = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.m.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((Object) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(CommonConstant.Symbol.COMMA);
            }
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
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getPoiImInfo(this.e, this.f, this.h, this.i, this.j, sb.toString(), i, j2, j), new b.AbstractC1042b<BaseResponse<PoiImInfo>>() { // from class: com.sankuai.waimai.business.im.prepare.d.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr2 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a729f8bcbf1762a87fbe671a4d15aa6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a729f8bcbf1762a87fbe671a4d15aa6c");
                            return;
                        }
                        com.sankuai.waimai.platform.widget.dialog.a.b(d.this.n);
                        if (activity == null || activity.isFinishing()) {
                            d.this.a("Activity is finishing after request");
                        } else if (baseResponse == null || baseResponse.code != 0) {
                            if (baseResponse == null) {
                                d.this.a("response is null");
                            } else {
                                d dVar = d.this;
                                dVar.a("response code is " + baseResponse.code);
                            }
                            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                                ae.a(activity.getApplicationContext(), baseResponse.msg);
                            } else {
                                ae.a(activity, (int) R.string.wm_im_error_response);
                            }
                            d.this.b(d.this.k, activity);
                        } else {
                            PoiImInfo poiImInfo = (PoiImInfo) baseResponse.data;
                            if (poiImInfo == null) {
                                d.this.a("response data is null");
                                if (!TextUtils.isEmpty(baseResponse.msg)) {
                                    ae.a(activity.getApplicationContext(), baseResponse.msg);
                                } else {
                                    ae.a(activity, (int) R.string.wm_im_error_response);
                                }
                                d.this.b(d.this.k, activity);
                                return;
                            }
                            if (d.this.e != 3) {
                                d.this.f = poiImInfo.lastOrderId;
                            }
                            if (aa.a(d.this.i)) {
                                d.this.i = poiImInfo.poiIdStr;
                            }
                            d.a(d.this, activity, poiImInfo, d.this.f, d.this.h, d.this.i, d.this.c, poiImInfo.showEmotion);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d0479dda65714e6fbdcf222c5e40848", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d0479dda65714e6fbdcf222c5e40848");
                            return;
                        }
                        d.this.a("request error");
                        ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
                        com.sankuai.waimai.platform.widget.dialog.a.b(d.this.n);
                        d.this.a(d.this.k, activity);
                    }
                }, b(activity));
            }
        }
        j = 0;
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getPoiImInfo(this.e, this.f, this.h, this.i, this.j, sb.toString(), i, j2, j), new b.AbstractC1042b<BaseResponse<PoiImInfo>>() { // from class: com.sankuai.waimai.business.im.prepare.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a729f8bcbf1762a87fbe671a4d15aa6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a729f8bcbf1762a87fbe671a4d15aa6c");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(d.this.n);
                if (activity == null || activity.isFinishing()) {
                    d.this.a("Activity is finishing after request");
                } else if (baseResponse == null || baseResponse.code != 0) {
                    if (baseResponse == null) {
                        d.this.a("response is null");
                    } else {
                        d dVar = d.this;
                        dVar.a("response code is " + baseResponse.code);
                    }
                    if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a(activity.getApplicationContext(), baseResponse.msg);
                    } else {
                        ae.a(activity, (int) R.string.wm_im_error_response);
                    }
                    d.this.b(d.this.k, activity);
                } else {
                    PoiImInfo poiImInfo = (PoiImInfo) baseResponse.data;
                    if (poiImInfo == null) {
                        d.this.a("response data is null");
                        if (!TextUtils.isEmpty(baseResponse.msg)) {
                            ae.a(activity.getApplicationContext(), baseResponse.msg);
                        } else {
                            ae.a(activity, (int) R.string.wm_im_error_response);
                        }
                        d.this.b(d.this.k, activity);
                        return;
                    }
                    if (d.this.e != 3) {
                        d.this.f = poiImInfo.lastOrderId;
                    }
                    if (aa.a(d.this.i)) {
                        d.this.i = poiImInfo.poiIdStr;
                    }
                    d.a(d.this, activity, poiImInfo, d.this.f, d.this.h, d.this.i, d.this.c, poiImInfo.showEmotion);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d0479dda65714e6fbdcf222c5e40848", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d0479dda65714e6fbdcf222c5e40848");
                    return;
                }
                d.this.a("request error");
                ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
                com.sankuai.waimai.platform.widget.dialog.a.b(d.this.n);
                d.this.a(d.this.k, activity);
            }
        }, b(activity));
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2162d17601c7bc25547a8dbc13c3ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2162d17601c7bc25547a8dbc13c3ff8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", String.valueOf(this.e));
        hashMap.put(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(this.f));
        hashMap.put("poiId", String.valueOf(this.h));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.i);
        hashMap.put("spuId", String.valueOf(this.j));
        hashMap.put("from", String.valueOf(this.k));
        com.sankuai.waimai.business.im.common.log.b.a("poi_enter", String.valueOf(this.e), str, hashMap);
    }
}
