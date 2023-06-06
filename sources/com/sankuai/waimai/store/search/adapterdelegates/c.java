package com.sankuai.waimai.store.search.adapterdelegates;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public b b;
    public b c;
    public SearchShareData d;
    private final SparseArrayCompat<b> e;
    private LayoutInflater f;
    private com.sankuai.waimai.store.search.ui.result.adapterDelegate.a g;
    private b h;

    public c(Context context, @NonNull com.sankuai.waimai.store.search.ui.result.adapterDelegate.a aVar, @NonNull b bVar) {
        Object[] objArr = {context, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d200a3cddaf368afe3e68d7576dccf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d200a3cddaf368afe3e68d7576dccf5");
            return;
        }
        this.e = new SparseArrayCompat<>();
        this.f = LayoutInflater.from(context);
        this.g = aVar;
        this.h = bVar;
        this.d = SearchShareData.a(context);
    }

    public final void a(SparseArrayCompat<b> sparseArrayCompat) {
        Object[] objArr = {sparseArrayCompat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "440bf5291c0f30a4bd43e2dfd6520a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "440bf5291c0f30a4bd43e2dfd6520a59");
        } else if (sparseArrayCompat != null && sparseArrayCompat.size() != 0) {
            int size = sparseArrayCompat.size();
            for (int i = 0; i < size; i++) {
                this.e.put(this.e.size(), sparseArrayCompat.get(i));
            }
        }
    }

    public final int a(@NonNull OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace2693b55d27c78b3db94401a3298da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace2693b55d27c78b3db94401a3298da")).intValue();
        }
        if (oasisModule.data == null) {
            return -1;
        }
        if (oasisModule.templateType == 1) {
            return this.d.bf == 1 ? (this.c == null || !this.c.a(oasisModule.data)) ? -2 : -4 : (this.b == null || !this.b.a(oasisModule.data)) ? -2 : -3;
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.isEmpty(oasisModule.nativeTemplateId) && this.e.valueAt(i).a(oasisModule.nativeTemplateId)) {
                return this.e.keyAt(i);
            }
        }
        com.sankuai.waimai.store.base.log.a.a("Global search, did not find adapter delegate, template info : type = " + oasisModule.templateType + ", native id = " + oasisModule.nativeTemplateId + ", mach id = " + oasisModule.machTemplateId);
        return -1;
    }

    public final RecyclerView.s a(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d79b53f11c994e61c1448b789cb943", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d79b53f11c994e61c1448b789cb943") : a(i).a(this.f, viewGroup, i);
    }

    @NonNull
    public b a(int i) {
        b bVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b145e941059290f8b5185277a237639a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b145e941059290f8b5185277a237639a");
        }
        switch (i) {
            case -6:
            case -5:
            case -3:
                bVar = this.b;
                break;
            case -4:
                bVar = this.c;
                break;
            case -2:
                bVar = this.g;
                break;
            case -1:
                bVar = this.h;
                break;
            default:
                bVar = this.e.get(i);
                break;
        }
        return bVar == null ? this.h : bVar;
    }
}
