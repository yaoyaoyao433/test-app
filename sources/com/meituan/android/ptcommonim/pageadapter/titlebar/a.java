package com.meituan.android.ptcommonim.pageadapter.titlebar;

import com.meituan.android.ptcommonim.pageadapter.titlebar.bean.TitleBarBean;
import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements PTFrameMachContainer.b {
    public static ChangeQuickRedirect a;
    private final PTTitleBarAdapter b;
    private final TitleBarBean c;

    private a(PTTitleBarAdapter pTTitleBarAdapter, TitleBarBean titleBarBean) {
        this.b = pTTitleBarAdapter;
        this.c = titleBarBean;
    }

    public static PTFrameMachContainer.b a(PTTitleBarAdapter pTTitleBarAdapter, TitleBarBean titleBarBean) {
        Object[] objArr = {pTTitleBarAdapter, titleBarBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b94fc62e284a113b9dffd84a40c62028", RobustBitConfig.DEFAULT_VALUE) ? (PTFrameMachContainer.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b94fc62e284a113b9dffd84a40c62028") : new a(pTTitleBarAdapter, titleBarBean);
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83b6cd09c8959c7e2489166bdb26d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83b6cd09c8959c7e2489166bdb26d0a");
        } else {
            PTTitleBarAdapter.a(this.b, this.c);
        }
    }
}
