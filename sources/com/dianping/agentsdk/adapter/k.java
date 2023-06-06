package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.ExtraCellBottomInterface;
import com.dianping.shield.feature.SetBottomInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends n<SetBottomInterface> {
    public static ChangeQuickRedirect a;
    protected b.a b;
    protected b.a c;
    protected b.a d;
    protected b.a e;
    protected b.a f;
    protected b.a g;
    protected ExtraCellBottomInterface h;
    protected ViewGroup i;

    public k(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, SetBottomInterface setBottomInterface) {
        super(context, cVar, setBottomInterface);
        Object[] objArr = {context, cVar, setBottomInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76c44a1346902f10b89b763d5345cb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76c44a1346902f10b89b763d5345cb8");
        }
    }

    public final void a(ExtraCellBottomInterface extraCellBottomInterface) {
        this.h = extraCellBottomInterface;
    }

    public final void a(ViewGroup viewGroup) {
        this.i = viewGroup;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d926bd21c0262cf919987577fa331aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d926bd21c0262cf919987577fa331aa");
            return;
        }
        CellType cellType = getCellType(i, i2);
        int innerType = getInnerType(getItemViewType(i, i2));
        if (cellType == CellType.HEADER && this.h != null && this.h.isHeaderBottomView(innerType) && aVar == this.d) {
            super.onBindViewHolder(this.e, i, i2);
        } else if (cellType == CellType.FOOTER && this.h != null && this.h.isFooterBottomView(innerType) && aVar == this.f) {
            super.onBindViewHolder(this.g, i, i2);
        } else if (this.extraInterface != 0 && ((SetBottomInterface) this.extraInterface).isBottomView(innerType) && aVar == this.b) {
            super.onBindViewHolder(this.c, i, i2);
        } else {
            super.onBindViewHolder(aVar, i, i2);
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5140dedde78d85445507629e4506b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5140dedde78d85445507629e4506b8");
        }
        CellType cellType = getCellType(i);
        int innerType = getInnerType(i);
        if (cellType == CellType.HEADER && this.h != null && this.h.isHeaderBottomView(innerType) && this.h.getHeaderSetBottomFunctionInterface() != null) {
            if (this.d == null) {
                onAdapterChanged();
            }
            if (this.d != null) {
                if (this.d.itemView != null && (this.d.itemView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.d.itemView.getParent()).removeView(this.d.itemView);
                }
                return this.d;
            }
        } else if (cellType == CellType.FOOTER && this.h != null && this.h.isFooterBottomView(innerType) && this.h.getFooterSetBottomFunctionInterface() != null) {
            if (this.f == null) {
                onAdapterChanged();
            }
            if (this.f != null) {
                if (this.f.itemView != null && (this.f.itemView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f.itemView.getParent()).removeView(this.f.itemView);
                }
                return this.f;
            }
        } else if (this.extraInterface != 0 && ((SetBottomInterface) this.extraInterface).getSetBottomFunctionInterface() != null && ((SetBottomInterface) this.extraInterface).isBottomView(innerType)) {
            if (this.b == null) {
                onAdapterChanged();
            }
            if (this.b != null) {
                if (this.b.itemView != null && (this.b.itemView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.b.itemView.getParent()).removeView(this.b.itemView);
                }
                return this.b;
            }
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final void onAdapterChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdc212cb039ba6fbcbfc8039f1bb407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdc212cb039ba6fbcbfc8039f1bb407");
            return;
        }
        super.onAdapterChanged();
        int sectionCount = getSectionCount();
        for (int i = 0; i < sectionCount; i++) {
            int rowCount = getRowCount(i);
            for (int i2 = 0; i2 < rowCount; i2++) {
                int itemViewType = getItemViewType(i, i2);
                CellType cellType = getCellType(itemViewType);
                int innerType = getInnerType(itemViewType);
                if (cellType == CellType.HEADER && this.h != null && this.h.isHeaderBottomView(innerType) && this.h.getHeaderSetBottomFunctionInterface() != null) {
                    b.a onCreateViewHolder = super.onCreateViewHolder(this.i, itemViewType);
                    if (onCreateViewHolder != null && onCreateViewHolder.itemView != null && this.h.getHeaderSetBottomFunctionInterface().setBottomView(onCreateViewHolder.itemView)) {
                        this.d = new b.a(new View(getContext()));
                        this.e = onCreateViewHolder;
                    }
                    super.onBindViewHolder(onCreateViewHolder, i, i2);
                } else if (cellType == CellType.FOOTER && this.h != null && this.h.isFooterBottomView(innerType) && this.h.getFooterSetBottomFunctionInterface() != null) {
                    b.a onCreateViewHolder2 = super.onCreateViewHolder(this.i, itemViewType);
                    if (onCreateViewHolder2 != null && onCreateViewHolder2.itemView != null && this.h.getFooterSetBottomFunctionInterface().setBottomView(onCreateViewHolder2.itemView)) {
                        this.f = new b.a(new View(getContext()));
                        this.g = onCreateViewHolder2;
                    }
                    super.onBindViewHolder(onCreateViewHolder2, i, i2);
                } else if (this.extraInterface != 0 && ((SetBottomInterface) this.extraInterface).getSetBottomFunctionInterface() != null && ((SetBottomInterface) this.extraInterface).isBottomView(innerType)) {
                    b.a onCreateViewHolder3 = super.onCreateViewHolder(this.i, itemViewType);
                    if (onCreateViewHolder3 != null && onCreateViewHolder3.itemView != null && ((SetBottomInterface) this.extraInterface).getSetBottomFunctionInterface().setBottomView(onCreateViewHolder3.itemView)) {
                        this.b = new b.a(new View(getContext()));
                        this.c = onCreateViewHolder3;
                    }
                    super.onBindViewHolder(onCreateViewHolder3, i, i2);
                }
            }
        }
    }
}
