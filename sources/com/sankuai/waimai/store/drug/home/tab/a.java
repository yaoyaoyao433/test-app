package com.sankuai.waimai.store.drug.home.tab;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements e<g> {
    public static ChangeQuickRedirect a;
    @NonNull
    protected SCBaseActivity b;
    protected ViewGroup c;
    protected g d;
    @Nullable
    protected com.sankuai.waimai.store.drug.widgets.lottie.a e;
    protected int f;

    @NonNull
    public abstract ViewGroup a();

    public a(@NonNull SCBaseActivity sCBaseActivity, @NonNull g gVar, com.sankuai.waimai.store.drug.widgets.lottie.a aVar) {
        Object[] objArr = {sCBaseActivity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ea6a70e1e7d2bcb54a15a76c8962a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ea6a70e1e7d2bcb54a15a76c8962a8");
            return;
        }
        this.b = sCBaseActivity;
        this.d = gVar;
        this.c = a();
        this.e = aVar;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    @NonNull
    public final ViewGroup b() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.drug.home.tab.e
    public final void a(int i) {
        this.f = i;
    }
}
