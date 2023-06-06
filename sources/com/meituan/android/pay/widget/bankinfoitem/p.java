package com.meituan.android.pay.widget.bankinfoitem;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {
    public static ChangeQuickRedirect a;
    private final TextView b;

    private p(TextView textView) {
        this.b = textView;
    }

    public static Runnable a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fa5e04baf7d67827b649a1180ff767e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fa5e04baf7d67827b649a1180ff767e") : new p(textView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb33fbb02c52e59abcc779b883d486a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb33fbb02c52e59abcc779b883d486a6");
        } else {
            j.a(this.b);
        }
    }
}
