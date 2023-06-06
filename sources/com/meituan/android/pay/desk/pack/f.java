package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final ImageView c;
    private final Fragment d;
    private final HashMap e;
    private final String f;

    private f(e eVar, ImageView imageView, Fragment fragment, HashMap hashMap, String str) {
        this.b = eVar;
        this.c = imageView;
        this.d = fragment;
        this.e = hashMap;
        this.f = str;
    }

    public static View.OnClickListener a(e eVar, ImageView imageView, Fragment fragment, HashMap hashMap, String str) {
        Object[] objArr = {eVar, imageView, fragment, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90ef5052976d859c5ff94b52f6089de6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90ef5052976d859c5ff94b52f6089de6") : new f(eVar, imageView, fragment, hashMap, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81af80ff3903d1383e9895885dd2d26f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81af80ff3903d1383e9895885dd2d26f");
            return;
        }
        e eVar = this.b;
        ImageView imageView = this.c;
        Fragment fragment = this.d;
        HashMap hashMap = this.e;
        String str = this.f;
        Object[] objArr2 = {eVar, imageView, fragment, hashMap, str, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "853c5091b95ff140e993f96f887ce66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "853c5091b95ff140e993f96f887ce66b");
            return;
        }
        imageView.setVisibility(8);
        eVar.a(fragment, eVar.b);
        if (eVar.c != null) {
            eVar.c.a(view);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_6vedy2lc_mc", (Map<String, Object>) null);
        com.meituan.android.pay.common.analyse.b.a("c_PJmoK", "b_pay_645s8qvn_mc", "点击美支切卡页入口", hashMap, ae.a.CLICK, str);
    }
}
