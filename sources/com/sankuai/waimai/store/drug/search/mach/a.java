package com.sankuai.waimai.store.drug.search.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.CommonMachData;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<Serializable, C1168a> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.search.ui.result.b b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        return false;
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1168a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        View inflate;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c76d70d1257668749d7086e460bfda8", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1168a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c76d70d1257668749d7086e460bfda8");
        }
        b bVar = new b(this.k, this.b);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e9799f9b2275a71e6ec3a0f35897e947", RobustBitConfig.DEFAULT_VALUE)) {
            inflate = (View) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e9799f9b2275a71e6ec3a0f35897e947");
        } else {
            inflate = LayoutInflater.from(bVar.b).inflate(R.layout.wm_drug_search_layout_common_drug_mach_block, viewGroup, false);
            bVar.c = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
            bVar.d = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        }
        return new C1168a(inflate, bVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull C1168a c1168a) {
        C1168a c1168a2 = c1168a;
        Object[] objArr = {c1168a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c24bd5601cd4d74e870e1e919e5809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c24bd5601cd4d74e870e1e919e5809");
            return;
        }
        super.a((a) c1168a2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = C1168a.a;
        if (PatchProxy.isSupport(objArr2, c1168a2, changeQuickRedirect2, false, "4ae40756a8aeb73fdf642d32194c8edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1168a2, changeQuickRedirect2, false, "4ae40756a8aeb73fdf642d32194c8edd");
            return;
        }
        b bVar = c1168a2.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4a76ef7ee92b212e595d22dfedd879a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4a76ef7ee92b212e595d22dfedd879a0");
        } else if (bVar.e.t != null) {
            bVar.e.t.b(bVar.f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
        if (r2.equals("drug-search-product-recommend") != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.NonNull java.io.Serializable r24, @android.support.annotation.NonNull com.sankuai.waimai.store.drug.search.mach.a.C1168a r25, int r26) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.search.mach.a.a(java.lang.Object, android.support.v7.widget.RecyclerView$s, int):void");
    }

    public a(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6128de5757db40a29cbb9ca7475c68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6128de5757db40a29cbb9ca7475c68");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(Serializable serializable) {
        return (serializable instanceof CommonMachData) && ((CommonMachData) serializable).mItem != null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.search.mach.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1168a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public b b;

        public C1168a(View view, b bVar) {
            super(view);
            Object[] objArr = {view, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210920b16f18b7afc213a326c2181cca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210920b16f18b7afc213a326c2181cca");
            } else {
                this.b = bVar;
            }
        }
    }
}
