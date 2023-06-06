package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends b {
    public static ChangeQuickRedirect d;
    protected long e;
    protected int f;
    protected long h;
    protected boolean i;
    private final Bundle j;

    public abstract void a(Activity activity);

    public abstract void b(Activity activity);

    public abstract String c(Activity activity);

    public e(Activity activity, long j, int i, long j2, boolean z, boolean z2, Bundle bundle) {
        super(activity, z);
        Object[] objArr = {activity, new Long(j), Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf3255cbbb35fbfc100e4a9eb5e7a4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf3255cbbb35fbfc100e4a9eb5e7a4e");
            return;
        }
        this.e = j;
        this.f = i;
        this.h = j2;
        this.i = z2;
        this.j = bundle;
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df327db597b23037cce2cad0a15b57a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df327db597b23037cce2cad0a15b57a");
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
        final Dialog a = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getRiderImInfo(this.e, this.i ? 0L : this.h), new b.AbstractC1042b<BaseResponse<RiderImInfo>>() { // from class: com.sankuai.waimai.business.im.prepare.e.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c13ac23c1ad40d8c17f24f7037c7a1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c13ac23c1ad40d8c17f24f7037c7a1f");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a);
                if (activity == null || activity.isFinishing()) {
                    e.this.a("Activity is finishing after request");
                } else if (baseResponse == null || baseResponse.code != 0) {
                    if (baseResponse == null) {
                        e.this.a("response is null");
                    } else {
                        e eVar = e.this;
                        eVar.a("response code is " + baseResponse.code);
                    }
                    if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a(activity, baseResponse.msg);
                    } else {
                        ae.a(activity, (int) R.string.wm_im_error_response);
                    }
                    e.this.b(e.this.f, activity);
                } else {
                    RiderImInfo riderImInfo = (RiderImInfo) baseResponse.data;
                    if (riderImInfo != null) {
                        e.this.a(activity, riderImInfo, e.this.e, e.this.f, "", e.this.c, riderImInfo.showEmotion);
                        return;
                    }
                    e.this.a("response data is null");
                    if (!TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a(activity, baseResponse.msg);
                    } else {
                        ae.a(activity, (int) R.string.wm_im_error_response);
                    }
                    e.this.b(e.this.f, activity);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b18a86decb763622312e4dc523ce23f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b18a86decb763622312e4dc523ce23f7");
                    return;
                }
                e.this.a("request error");
                ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
                com.sankuai.waimai.platform.widget.dialog.a.b(a);
                e.this.b(activity);
            }
        }, c(activity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d6  */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.app.Activity r28, com.sankuai.waimai.business.im.model.RiderImInfo r29, long r30, int r32, java.lang.String r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.prepare.e.a(android.app.Activity, com.sankuai.waimai.business.im.model.RiderImInfo, long, int, java.lang.String, boolean, int):void");
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5119928e58d05c91b949d4f1460a57b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5119928e58d05c91b949d4f1460a57b8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(this.e));
        hashMap.put("from", String.valueOf(this.f));
        hashMap.put("oldRiderDxId", String.valueOf(this.h));
        hashMap.put("isFromChatPage", String.valueOf(this.i));
        com.sankuai.waimai.business.im.common.log.b.a("rider_enter", String.valueOf(this.f), str, hashMap);
    }
}
