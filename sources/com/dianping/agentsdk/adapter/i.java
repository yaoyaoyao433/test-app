package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends com.dianping.agentsdk.sectionrecycler.section.c {
    public static ChangeQuickRedirect a;
    public af b;

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final /* synthetic */ void onBindViewHolder(RecyclerView.s sVar, int i, int i2) {
        b.a aVar = (b.a) sVar;
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b8871fd86aba1f22f6cf3b2f9df84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b8871fd86aba1f22f6cf3b2f9df84d");
        } else {
            this.b.updateView(aVar.itemView, i, i2, (ViewGroup) aVar.itemView.getParent());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6762db06f2bfbbb194107723b19606d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6762db06f2bfbbb194107723b19606d3");
        }
        View onCreateView = this.b.onCreateView(viewGroup, i);
        if (onCreateView != null && onCreateView.getLayoutParams() == null) {
            onCreateView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        return new b.a(onCreateView);
    }

    public i(@NonNull Context context, af afVar) {
        super(context);
        Object[] objArr = {context, afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a67beee850cbbe598ec0d372144cb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a67beee850cbbe598ec0d372144cb9");
        } else {
            this.b = afVar;
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da0449e8fafcf27bb29d7a706c714e9f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da0449e8fafcf27bb29d7a706c714e9f")).intValue() : this.b != null ? this.b.getSectionCount() : super.getSectionCount();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61689e635f9b4f8d43f8e36887a637cd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61689e635f9b4f8d43f8e36887a637cd")).intValue() : this.b != null ? this.b.getRowCount(i) : super.getRowCount(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final int getItemViewType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410c86c16531c60df0ef6e0990e0e6ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410c86c16531c60df0ef6e0990e0e6ab")).intValue();
        }
        if (this.b != null) {
            return this.b.getViewType(i, i2);
        }
        return super.getItemViewType(i, i2);
    }
}
