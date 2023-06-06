package com.sankuai.ehcore.module.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final TitansXWebView b;

    private e(TitansXWebView titansXWebView) {
        this.b = titansXWebView;
    }

    public static a.InterfaceC0552a a(TitansXWebView titansXWebView) {
        Object[] objArr = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e54dd90420dd63f238812ec761747f4", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e54dd90420dd63f238812ec761747f4") : new e(titansXWebView);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb0be4207bf99945be5771597ca9a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb0be4207bf99945be5771597ca9a11");
            return;
        }
        TitansXWebView titansXWebView = this.b;
        Object[] objArr2 = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fe61ad76a9152e49aac08a70bc2a0884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fe61ad76a9152e49aac08a70bc2a0884");
        } else if (titansXWebView != null) {
            titansXWebView.destroy();
        }
    }
}
