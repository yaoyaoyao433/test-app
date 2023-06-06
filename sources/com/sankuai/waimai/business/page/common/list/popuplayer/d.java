package com.sankuai.waimai.business.page.common.list.popuplayer;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.model.b;
import com.sankuai.waimai.business.page.common.net.request.DislikeApi;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    String b;
    c c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, long j, b.a aVar, final boolean z, final Context context, final com.sankuai.waimai.business.page.common.list.model.b bVar, b bVar2) {
        Object[] objArr = {str, new Long(j), aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), context, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d447c11ed7631ff648b2e829234794be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d447c11ed7631ff648b2e829234794be");
            return;
        }
        if (bVar2 != null) {
            bVar2.a(str, j, aVar);
        }
        if (aVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.a);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((DislikeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) DislikeApi.class)).dislike(j, sb.toString(), str), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.d.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Object[] objArr2 = {(BaseResponse) obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "495b7d695fb16df565c6f2ac02bbea53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "495b7d695fb16df565c6f2ac02bbea53");
                } else if (!z || bVar == null || bVar.a == null) {
                } else {
                    ae.a(context, bVar.a);
                }
            }
        }, this.b);
    }
}
