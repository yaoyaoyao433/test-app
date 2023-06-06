package com.sankuai.eh.plugins.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final TitansXWebView b;

    public d(TitansXWebView titansXWebView) {
        this.b = titansXWebView;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957ea3014c26d77cf4af033be0ba5b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957ea3014c26d77cf4af033be0ba5b84");
            return;
        }
        TitansXWebView titansXWebView = this.b;
        Object[] objArr2 = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3bdc2857c6aa7bd45707ec0529cc9943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3bdc2857c6aa7bd45707ec0529cc9943");
        } else if (titansXWebView != null) {
            titansXWebView.destroy();
        }
    }
}
