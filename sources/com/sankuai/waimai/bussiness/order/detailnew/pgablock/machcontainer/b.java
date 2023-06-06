package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final ViewGroup b;
    private final View c;

    private b(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    public static Runnable a(ViewGroup viewGroup, View view) {
        Object[] objArr = {viewGroup, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14421fb9b3e8064afd37fabc5996f6fd", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14421fb9b3e8064afd37fabc5996f6fd") : new b(viewGroup, view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3fd343a245e297048f1515aa53c7256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3fd343a245e297048f1515aa53c7256");
            return;
        }
        ViewGroup viewGroup = this.b;
        View view = this.c;
        Object[] objArr2 = {viewGroup, view};
        ChangeQuickRedirect changeQuickRedirect2 = a.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a5c96e61b47900f926e91d10d7ed1952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a5c96e61b47900f926e91d10d7ed1952");
            return;
        }
        try {
            viewGroup.removeView(view);
        } catch (Exception unused) {
        }
    }
}
