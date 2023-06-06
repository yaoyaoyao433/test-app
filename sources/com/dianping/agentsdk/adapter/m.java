package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.feature.SetZoomInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends n<SetZoomInterface> {
    public static ChangeQuickRedirect a;

    public m(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, SetZoomInterface setZoomInterface) {
        super(context, cVar, setZoomInterface);
        Object[] objArr = {context, cVar, setZoomInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a7707e8260abe1fcc8bba133d27a76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a7707e8260abe1fcc8bba133d27a76");
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d13019638486fdc06730e2d60d3581", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d13019638486fdc06730e2d60d3581");
        }
        b.a onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (this.extraInterface != 0 && ((SetZoomInterface) this.extraInterface).getSetZoomFunctionInterface() != null && ((SetZoomInterface) this.extraInterface).isZoomView(getInnerType(i)) && onCreateViewHolder != null && onCreateViewHolder.itemView != null) {
            ((SetZoomInterface) this.extraInterface).getSetZoomFunctionInterface().setZoomView(onCreateViewHolder.itemView);
        }
        return onCreateViewHolder;
    }
}
