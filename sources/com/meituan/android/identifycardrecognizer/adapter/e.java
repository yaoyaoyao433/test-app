package com.meituan.android.identifycardrecognizer.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;
    private final int c;
    private final String d;

    private e(b bVar, int i, String str) {
        this.b = bVar;
        this.c = i;
        this.d = str;
    }

    public static View.OnClickListener a(b bVar, int i, String str) {
        Object[] objArr = {bVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e30f4d5f71ad8d80587d6ded1e8730d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e30f4d5f71ad8d80587d6ded1e8730d") : new e(bVar, i, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc6f216a38185a3fcc2f1861cc03e6a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc6f216a38185a3fcc2f1861cc03e6a");
            return;
        }
        b bVar = this.b;
        int i = this.c;
        String str = this.d;
        Object[] objArr2 = {bVar, Integer.valueOf(i), str, view};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "05cdffad8c58fa2074b729561fb23621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "05cdffad8c58fa2074b729561fb23621");
        } else if (bVar.f != null) {
            bVar.f.a(i, str);
        }
    }
}
