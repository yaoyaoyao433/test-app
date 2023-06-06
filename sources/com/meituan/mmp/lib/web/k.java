package com.meituan.mmp.lib.web;

import android.content.Context;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.engine.x;
import com.meituan.mmp.lib.page.view.n;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.web.c
    public final com.meituan.mmp.lib.page.view.b a(Context context, com.meituan.mmp.lib.config.a aVar, r rVar) {
        Object[] objArr = {context, aVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21210384c7fa0cb47a38da97d80493a9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21210384c7fa0cb47a38da97d80493a9") : new n(context, aVar, rVar);
    }

    @Override // com.meituan.mmp.lib.web.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4b3d67f25043cbc726d8fafd42fc61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4b3d67f25043cbc726d8fafd42fc61");
        } else {
            x.a();
        }
    }

    @Override // com.meituan.mmp.lib.web.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4b43c4a5c5d7c5e0c1f9589e1a2ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4b43c4a5c5d7c5e0c1f9589e1a2ab9");
        } else {
            x.b();
        }
    }

    @Override // com.meituan.mmp.lib.web.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54abcd02811406f9669466763fd6b809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54abcd02811406f9669466763fd6b809");
        } else {
            WebView.setDataDirectorySuffix(str);
        }
    }

    @Override // com.meituan.mmp.lib.web.c
    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1677cdae6e11df099b0db3aa4668eac9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1677cdae6e11df099b0db3aa4668eac9") : String.valueOf(QbSdk.getTbsVersion(MMPEnvHelper.getContext()));
    }
}
