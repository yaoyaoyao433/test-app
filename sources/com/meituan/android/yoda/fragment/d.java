package com.meituan.android.yoda.fragment;

import android.support.v7.widget.CardView;
import com.meituan.android.yoda.fragment.ConfirmListFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final ConfirmListFragment.a b;
    private final ArrayList c;
    private final CardView d;

    private d(ConfirmListFragment.a aVar, ArrayList arrayList, CardView cardView) {
        this.b = aVar;
        this.c = arrayList;
        this.d = cardView;
    }

    public static Runnable a(ConfirmListFragment.a aVar, ArrayList arrayList, CardView cardView) {
        Object[] objArr = {aVar, arrayList, cardView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0136ceaa2d6b3aa048e41e9f1190f36", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0136ceaa2d6b3aa048e41e9f1190f36") : new d(aVar, arrayList, cardView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a863cbc636a6cdaa41cc9d497d163e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a863cbc636a6cdaa41cc9d497d163e");
        } else {
            ConfirmListFragment.a.a(this.b, this.c, this.d);
        }
    }
}
