package com.meituan.android.ptcommonim.custombus;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final IMMessage c;

    private b(a aVar, IMMessage iMMessage) {
        this.b = aVar;
        this.c = iMMessage;
    }

    public static Runnable a(a aVar, IMMessage iMMessage) {
        Object[] objArr = {aVar, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb892a164244ee9177a404cf1fb58c46", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb892a164244ee9177a404cf1fb58c46") : new b(aVar, iMMessage);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edbcdaddd701460e69dcf909a24a7c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edbcdaddd701460e69dcf909a24a7c18");
            return;
        }
        a aVar = this.b;
        IMMessage iMMessage = this.c;
        Object[] objArr2 = {aVar, iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cdbbe4390081177f2f5417297b019b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cdbbe4390081177f2f5417297b019b9c");
        } else {
            aVar.b.b(iMMessage.getMsgUuid());
        }
    }
}
