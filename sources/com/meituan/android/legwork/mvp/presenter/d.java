package com.meituan.android.legwork.mvp.presenter;

import android.content.BroadcastReceiver;
import com.meituan.android.legwork.bean.UserHintBean;
import com.meituan.android.legwork.mvp.contract.c;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.meituan.android.legwork.mvp.base.a<c.a> {
    public static ChangeQuickRedirect c;
    public com.meituan.android.legwork.mvp.model.c d;
    public BroadcastReceiver e;
    public BroadcastReceiver f;
    int g;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d61de3088e0fc5a49cc2479705dfbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d61de3088e0fc5a49cc2479705dfbe");
        } else {
            this.d = new com.meituan.android.legwork.mvp.model.c();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40d27fb896aca489ecb01b03b4e7bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40d27fb896aca489ecb01b03b4e7bfc");
            return;
        }
        com.meituan.android.legwork.mvp.model.c cVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.mvp.model.c.a;
        a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<UserHintBean>() { // from class: com.meituan.android.legwork.mvp.presenter.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i, String str) {
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(UserHintBean userHintBean) {
                UserHintBean userHintBean2 = userHintBean;
                Object[] objArr3 = {userHintBean2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "abe0a01c8c4e54106a301afe52cd080b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "abe0a01c8c4e54106a301afe52cd080b");
                } else if (d.this.c()) {
                    d.this.b().a(userHintBean2);
                }
            }
        }, (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6def537c796333c0c058c079ec105c52", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6def537c796333c0c058c079ec105c52") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).userHints()).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
    }
}
