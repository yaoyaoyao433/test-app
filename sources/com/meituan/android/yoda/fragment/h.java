package com.meituan.android.yoda.fragment;

import android.view.View;
import com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ThirdPartyVerifyFragment.c b;
    private final int c;

    private h(ThirdPartyVerifyFragment.c cVar, int i) {
        this.b = cVar;
        this.c = i;
    }

    public static View.OnClickListener a(ThirdPartyVerifyFragment.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bba37c1399ea7c85f0fdde8b13b864b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bba37c1399ea7c85f0fdde8b13b864b") : new h(cVar, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf7b55b174f8130de99a8c5274b53e7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf7b55b174f8130de99a8c5274b53e7");
            return;
        }
        ThirdPartyVerifyFragment.c cVar = this.b;
        int i = this.c;
        Object[] objArr2 = {cVar, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect2 = ThirdPartyVerifyFragment.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fa834862c43729836488dfa863e2b9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fa834862c43729836488dfa863e2b9e4");
            return;
        }
        new StringBuilder("onItemClicked  ").append(i);
        if (cVar.c != null) {
            cVar.c.a(cVar.b.get(i));
            try {
                ThirdPartyVerifyFragment.d(ThirdPartyVerifyFragment.this, cVar.b.get(i).thirdType);
            } catch (Exception unused) {
            }
        }
    }
}
