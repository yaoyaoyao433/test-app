package com.sankuai.waimai.business.im.group.knb;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImBadCommentGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.knb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0742a {
        void a();

        void a(com.sankuai.waimai.business.im.group.model.a aVar, long j);
    }

    public static void a(long j, @NonNull InterfaceC0742a interfaceC0742a, @NonNull String str) {
        Object[] objArr = {new Long(j), interfaceC0742a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b60973df5f073f7b4a4d9a3424ce67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b60973df5f073f7b4a4d9a3424ce67");
        } else {
            b.a(((WmImBadCommentGroupService) b.a((Class<Object>) WmImBadCommentGroupService.class)).closeBadCommentGroupChatInfo(j, 1), a(j, interfaceC0742a), str);
        }
    }

    private static b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.a>> a(final long j, @NonNull final InterfaceC0742a interfaceC0742a) {
        Object[] objArr = {new Long(j), interfaceC0742a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95fab338b20182fef231a828a7f714ea", RobustBitConfig.DEFAULT_VALUE) ? (b.AbstractC1042b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95fab338b20182fef231a828a7f714ea") : new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.a>>() { // from class: com.sankuai.waimai.business.im.group.knb.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69cf62b243f72ca90083a31747607ee9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69cf62b243f72ca90083a31747607ee9");
                } else if (baseResponse == null || !baseResponse.isSuccess()) {
                    InterfaceC0742a.this.a();
                } else if (((com.sankuai.waimai.business.im.group.model.a) baseResponse.data).a == null || ((com.sankuai.waimai.business.im.group.model.a) baseResponse.data).a.isEmpty()) {
                    InterfaceC0742a.this.a();
                } else {
                    a.a(j);
                    Context context = com.meituan.android.singleton.b.a;
                    if (context != null) {
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "wm_im_comment_chat_replied_" + Long.toString(j));
                    }
                    InterfaceC0742a.this.a((com.sankuai.waimai.business.im.group.model.a) baseResponse.data, j);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e38e114e3cfd5504d521d807b64db233", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e38e114e3cfd5504d521d807b64db233");
                } else {
                    InterfaceC0742a.this.a();
                }
            }
        };
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adce9ac1795254d6a63f7989ba29886a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adce9ac1795254d6a63f7989ba29886a");
            return;
        }
        e.a a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(j);
        if (a2 != null) {
            a2.m = 2;
        }
    }
}
