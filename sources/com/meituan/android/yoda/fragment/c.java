package com.meituan.android.yoda.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import com.meituan.android.yoda.fragment.ConfirmListFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ConfirmListFragment.a b;
    private final CardView c;
    private final ArrayList d;

    private c(ConfirmListFragment.a aVar, CardView cardView, ArrayList arrayList) {
        this.b = aVar;
        this.c = cardView;
        this.d = arrayList;
    }

    public static View.OnClickListener a(ConfirmListFragment.a aVar, CardView cardView, ArrayList arrayList) {
        Object[] objArr = {aVar, cardView, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3a59dfb952e79195fd77d4c53ff19a5", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3a59dfb952e79195fd77d4c53ff19a5") : new c(aVar, cardView, arrayList);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6319abf0ea141ae0ce859e0b459c036d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6319abf0ea141ae0ce859e0b459c036d");
            return;
        }
        ConfirmListFragment.a aVar = this.b;
        CardView cardView = this.c;
        ArrayList arrayList = this.d;
        Object[] objArr2 = {aVar, cardView, arrayList, view};
        ChangeQuickRedirect changeQuickRedirect2 = ConfirmListFragment.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ec0f4be26651324a5554df9e7fefba77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ec0f4be26651324a5554df9e7fefba77");
            return;
        }
        cardView.setClickable(false);
        ConfirmListFragment.this.a(d.a(aVar, arrayList, cardView), 200L);
    }
}
