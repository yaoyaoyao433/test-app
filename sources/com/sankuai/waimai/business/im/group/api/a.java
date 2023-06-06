package com.sankuai.waimai.business.im.group.api;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0736a {
        void a();

        void a(e.a aVar, TransferActivity transferActivity, Uri uri);

        void a(String str);
    }

    public static void a(final TransferActivity transferActivity, final Uri uri, String str, @NonNull final InterfaceC0736a interfaceC0736a, String str2) {
        Object[] objArr = {transferActivity, uri, str, interfaceC0736a, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f98eb7fc0ea3efea5b38433620d10aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f98eb7fc0ea3efea5b38433620d10aba");
            return;
        }
        final Dialog a2 = d.a((Activity) transferActivity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(str), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.api.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "178c59bd18a2537e08a04cd825adf86b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "178c59bd18a2537e08a04cd825adf86b");
                    return;
                }
                d.a(a2);
                if (baseResponse == null || baseResponse.code != 0) {
                    if (baseResponse == null) {
                        InterfaceC0736a.this.a("response is null");
                    } else {
                        InterfaceC0736a interfaceC0736a2 = InterfaceC0736a.this;
                        interfaceC0736a2.a("response code is " + baseResponse.code);
                    }
                    if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a((Activity) transferActivity, baseResponse.msg);
                    } else {
                        ae.a((Activity) transferActivity, (int) R.string.wm_im_error_response);
                    }
                    InterfaceC0736a.this.a();
                    return;
                }
                e eVar = (e) baseResponse.data;
                if (eVar == null || eVar.a == null || eVar.a.isEmpty() || eVar.a.get(0) == null) {
                    InterfaceC0736a.this.a("response data not has GroupSessionInfo");
                    if (!TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a((Activity) transferActivity, baseResponse.msg);
                    } else {
                        ae.a((Activity) transferActivity, (int) R.string.wm_im_error_response);
                    }
                    InterfaceC0736a.this.a();
                    return;
                }
                com.sankuai.waimai.business.im.group.cache.b.a().a(eVar.b);
                e.a aVar = eVar.a.get(0);
                com.sankuai.waimai.business.im.group.cache.b.a().a(aVar.b, aVar);
                InterfaceC0736a.this.a(aVar, transferActivity, uri);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bdc7d217c635bc3a5b709cc72e5fc27", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bdc7d217c635bc3a5b709cc72e5fc27");
                    return;
                }
                InterfaceC0736a.this.a("request error");
                ae.a((Activity) transferActivity, (int) R.string.wm_im_net_error_retry_later);
                d.a(a2);
                InterfaceC0736a.this.a();
            }
        }, str2);
    }
}
