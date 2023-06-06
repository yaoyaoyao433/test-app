package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import com.meituan.msi.api.extension.sgc.im.IMessage;
import com.meituan.msi.api.extension.sgc.im.UnreadCountResponse;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.number.d;
import com.sankuai.waimai.store.msi.listener.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMessage extends IMessage {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.im.IMessage
    public final void a(MsiCustomContext msiCustomContext, final j<UnreadCountResponse> jVar) {
        Object[] objArr = {msiCustomContext, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4f78c8558298929a0f5e055f42e7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4f78c8558298929a0f5e055f42e7db");
        } else if (a.a(msiCustomContext)) {
        } else {
            com.sankuai.waimai.store.msi.listener.a.a((Context) msiCustomContext.getActivity()).a(msiCustomContext.getActivity(), new a.c() { // from class: com.sankuai.waimai.store.msi.apis.SGIMessage.1
                public static ChangeQuickRedirect a;
                public com.sankuai.waimai.store.im.number.a b = new com.sankuai.waimai.store.im.number.a() { // from class: com.sankuai.waimai.store.msi.apis.SGIMessage.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.im.number.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b240760a033d38fece2f5a647da1d30", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b240760a033d38fece2f5a647da1d30");
                            return;
                        }
                        UnreadCountResponse unreadCountResponse = new UnreadCountResponse();
                        unreadCountResponse.business_type = 1;
                        unreadCountResponse.im_chat_unRead_message_count = i;
                        jVar.a(unreadCountResponse);
                    }
                };

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void a(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed036a7e93aa31974c62bebeca46f5cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed036a7e93aa31974c62bebeca46f5cc");
                    } else {
                        d.a().a(this.b);
                    }
                }

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void b(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "618cfac020fea94aff485c6b4b2c47f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "618cfac020fea94aff485c6b4b2c47f8");
                    } else {
                        d.a().b(this.b);
                    }
                }
            });
        }
    }
}
