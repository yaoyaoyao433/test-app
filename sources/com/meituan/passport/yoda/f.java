package com.meituan.passport.yoda;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a.C0517a b;

    private f(a.C0517a c0517a) {
        this.b = c0517a;
    }

    public static View.OnClickListener a(a.C0517a c0517a) {
        Object[] objArr = {c0517a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67256f8e9a7e4a7dafa5506c7eb8ebe1", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67256f8e9a7e4a7dafa5506c7eb8ebe1") : new f(c0517a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c5c987f811e8e40ec946921ac2ecad", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c5c987f811e8e40ec946921ac2ecad");
            return;
        }
        a.C0517a c0517a = this.b;
        Object[] objArr2 = {c0517a, view};
        ChangeQuickRedirect changeQuickRedirect2 = a.C0517a.e;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "83d272f30092dc5a1b51df35fe7a7e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "83d272f30092dc5a1b51df35fe7a7e88");
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:10107888"));
        intent.setFlags(y.a);
        FragmentActivity fragmentActivity = c0517a.c.get();
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            return;
        }
        fragmentActivity.startActivity(intent);
    }
}
