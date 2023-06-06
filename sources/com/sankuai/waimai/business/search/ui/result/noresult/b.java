package com.sankuai.waimai.business.search.ui.result.noresult;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.d;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    @NonNull
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7786361f7a31c4a6559c58fcce52ef5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7786361f7a31c4a6559c58fcce52ef5f");
        }
        c cVar = new c(this.b);
        return new a(cVar.a(viewGroup), cVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(@NonNull Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6643c3108c11747f40c4900e1007f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6643c3108c11747f40c4900e1007f3");
        } else {
            aVar.a.b(i, (d) serializable);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof d;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d22872b8098955a0fa2e94aa50ef6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d22872b8098955a0fa2e94aa50ef6b4");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public c a;

        public a(View view, c cVar) {
            super(view);
            this.a = cVar;
        }
    }
}
