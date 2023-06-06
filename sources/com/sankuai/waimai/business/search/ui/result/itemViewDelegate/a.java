package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CardTitle;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, C0868a> {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef1e2c801116cc76326ebfd8027c195", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0868a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef1e2c801116cc76326ebfd8027c195");
        }
        com.sankuai.waimai.business.search.ui.result.cardlist.a aVar = new com.sankuai.waimai.business.search.ui.result.cardlist.a(this.b);
        return new C0868a(aVar.a(viewGroup), aVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(Object obj, @NonNull RecyclerView.s sVar, int i) {
        Serializable serializable = (Serializable) obj;
        C0868a c0868a = (C0868a) sVar;
        Object[] objArr = {serializable, c0868a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ce67b3d785981ca6192bec2caf156e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ce67b3d785981ca6192bec2caf156e");
        } else {
            c0868a.a.a(i, (CardTitle) serializable);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof CardTitle;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d07800736c3b624269d5b9fac73582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d07800736c3b624269d5b9fac73582");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.itemViewDelegate.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0868a extends RecyclerView.s {
        public final com.sankuai.waimai.business.search.ui.result.cardlist.a a;

        public C0868a(View view, com.sankuai.waimai.business.search.ui.result.cardlist.a aVar) {
            super(view);
            this.a = aVar;
        }
    }
}
