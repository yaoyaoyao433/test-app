package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.ExtraCellTopInterface;
import com.dianping.shield.feature.ExtraCellTopParamsInterface;
import com.dianping.shield.feature.OnTopViewLayoutChangeListenerInterface;
import com.dianping.shield.feature.SetTopInterface;
import com.dianping.shield.feature.SetTopParamsInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends n<SetTopInterface> {
    public static ChangeQuickRedirect a;
    protected ExtraCellTopInterface b;
    protected OnTopViewLayoutChangeListenerInterface c;
    private b.a d;
    private b.a e;
    private b.a f;
    private b.a g;
    private b.a h;
    private b.a i;

    public l(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, SetTopInterface setTopInterface) {
        super(context, cVar, setTopInterface);
        Object[] objArr = {context, cVar, setTopInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00b890b72c54b03ac69d89fc55523cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00b890b72c54b03ac69d89fc55523cf");
        }
    }

    public final void a(ExtraCellTopInterface extraCellTopInterface) {
        this.b = extraCellTopInterface;
    }

    public final void a(OnTopViewLayoutChangeListenerInterface onTopViewLayoutChangeListenerInterface) {
        this.c = onTopViewLayoutChangeListenerInterface;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c6211d4ea058127a8f48e3cb1607a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c6211d4ea058127a8f48e3cb1607a9");
            return;
        }
        CellType cellType = getCellType(i, i2);
        int innerType = getInnerType(getItemViewType(i, i2));
        if (cellType == CellType.HEADER) {
            if (this.b != null && this.b.isHeaderTopView(innerType) && aVar == this.f && (this.b instanceof ExtraCellTopParamsInterface) && ((ExtraCellTopParamsInterface) this.b).getHeaderSetTopParams(innerType) != null) {
                this.b.getSetHeaderTopFunctionInterface().updateSetTopParams(this.g.itemView, ((ExtraCellTopParamsInterface) this.b).getHeaderSetTopParams(innerType));
                super.onBindViewHolder(this.g, i, i2);
                return;
            }
        } else if (cellType == CellType.FOOTER) {
            if (this.b != null && this.b.isFooterTopView(innerType) && aVar == this.h && (this.b instanceof ExtraCellTopParamsInterface) && ((ExtraCellTopParamsInterface) this.b).getFooterSetTopParams(innerType) != null) {
                this.b.getSetFooterTopFunctionInterface().updateSetTopParams(this.i.itemView, ((ExtraCellTopParamsInterface) this.b).getFooterSetTopParams(innerType));
                super.onBindViewHolder(this.i, i, i2);
                return;
            }
        } else if (((SetTopInterface) this.extraInterface).isTopView(innerType) && aVar == this.d && (this.extraInterface instanceof SetTopParamsInterface) && ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface() != null) {
            ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface().updateSetTopParams(this.e.itemView, ((SetTopParamsInterface) this.extraInterface).getSetTopParams(innerType));
            super.onBindViewHolder(this.e, i, i2);
            return;
        }
        super.onBindViewHolder(aVar, i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        b.a onCreateViewHolder;
        com.dianping.agentsdk.pagecontainer.i setTopParams;
        View topView;
        View topView2;
        View topView3;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55e2d763a878045475d12f440777fcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55e2d763a878045475d12f440777fcd");
        }
        if (this.extraInterface != 0 && ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface() != null) {
            int innerType = getInnerType(i);
            CellType cellType = getCellType(i);
            if (cellType == CellType.HEADER && this.b != null && this.b.isHeaderTopView(innerType)) {
                b.a onCreateViewHolder2 = super.onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder2 != null && onCreateViewHolder2.itemView != null) {
                    setTopParams = this.b instanceof ExtraCellTopParamsInterface ? ((ExtraCellTopParamsInterface) this.b).getHeaderSetTopParams(innerType) : null;
                    if ((this.b.getSetHeaderTopFunctionInterface() instanceof com.dianping.agentsdk.pagecontainer.g) && ((com.dianping.agentsdk.pagecontainer.g) this.b.getSetHeaderTopFunctionInterface()).needMultiStickTop()) {
                        topView3 = ((com.dianping.agentsdk.pagecontainer.g) this.b.getSetHeaderTopFunctionInterface()).setMultiTopView(this.b, innerType, onCreateViewHolder2.itemView, setTopParams);
                    } else {
                        topView3 = this.b.getSetHeaderTopFunctionInterface().setTopView(onCreateViewHolder2.itemView, setTopParams);
                    }
                    if (this.c != null) {
                        com.dianping.agentsdk.pagecontainer.j setTopViewListenerInterface = this.c.getSetTopViewListenerInterface();
                        com.dianping.agentsdk.pagecontainer.c onTopViewLayoutChangeListener = this.c.getOnTopViewLayoutChangeListener(cellType, i);
                        if (setTopViewListenerInterface != null && onTopViewLayoutChangeListener != null) {
                            setTopViewListenerInterface.setOnTopViewLayoutChangeListener(onTopViewLayoutChangeListener);
                        }
                    }
                    if (topView3 != null) {
                        this.f = new b.a(topView3);
                        this.g = onCreateViewHolder2;
                        return this.f;
                    }
                }
            } else if (cellType == CellType.FOOTER && this.b != null && this.b.isFooterTopView(innerType)) {
                b.a onCreateViewHolder3 = super.onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder3 != null && onCreateViewHolder3.itemView != null) {
                    setTopParams = this.b instanceof ExtraCellTopParamsInterface ? ((ExtraCellTopParamsInterface) this.b).getFooterSetTopParams(innerType) : null;
                    if ((this.b.getSetFooterTopFunctionInterface() instanceof com.dianping.agentsdk.pagecontainer.g) && ((com.dianping.agentsdk.pagecontainer.g) this.b.getSetFooterTopFunctionInterface()).needMultiStickTop()) {
                        topView2 = ((com.dianping.agentsdk.pagecontainer.g) this.b.getSetFooterTopFunctionInterface()).setMultiTopView(this.b, innerType, onCreateViewHolder3.itemView, setTopParams);
                    } else {
                        topView2 = this.b.getSetFooterTopFunctionInterface().setTopView(onCreateViewHolder3.itemView, setTopParams);
                    }
                    if (this.c != null) {
                        com.dianping.agentsdk.pagecontainer.j setTopViewListenerInterface2 = this.c.getSetTopViewListenerInterface();
                        com.dianping.agentsdk.pagecontainer.c onTopViewLayoutChangeListener2 = this.c.getOnTopViewLayoutChangeListener(cellType, i);
                        if (setTopViewListenerInterface2 != null && onTopViewLayoutChangeListener2 != null) {
                            setTopViewListenerInterface2.setOnTopViewLayoutChangeListener(onTopViewLayoutChangeListener2);
                        }
                    }
                    if (topView2 != null) {
                        this.h = new b.a(topView2);
                        this.i = onCreateViewHolder3;
                        return this.h;
                    }
                }
            } else if (cellType == CellType.NORMAL && this.extraInterface != 0 && ((SetTopInterface) this.extraInterface).isTopView(innerType) && (onCreateViewHolder = super.onCreateViewHolder(viewGroup, i)) != null && onCreateViewHolder.itemView != null) {
                setTopParams = this.extraInterface instanceof SetTopParamsInterface ? ((SetTopParamsInterface) this.extraInterface).getSetTopParams(innerType) : null;
                if ((((SetTopInterface) this.extraInterface).getSetTopFunctionInterface() instanceof com.dianping.agentsdk.pagecontainer.g) && ((com.dianping.agentsdk.pagecontainer.g) ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface()).needMultiStickTop()) {
                    topView = ((com.dianping.agentsdk.pagecontainer.g) ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface()).setMultiTopView((SetTopInterface) this.extraInterface, innerType, onCreateViewHolder.itemView, setTopParams);
                } else {
                    topView = ((SetTopInterface) this.extraInterface).getSetTopFunctionInterface().setTopView(onCreateViewHolder.itemView, setTopParams);
                }
                if (this.c != null) {
                    com.dianping.agentsdk.pagecontainer.j setTopViewListenerInterface3 = this.c.getSetTopViewListenerInterface();
                    com.dianping.agentsdk.pagecontainer.c onTopViewLayoutChangeListener3 = this.c.getOnTopViewLayoutChangeListener(cellType, i);
                    if (setTopViewListenerInterface3 != null && onTopViewLayoutChangeListener3 != null) {
                        setTopViewListenerInterface3.setOnTopViewLayoutChangeListener(onTopViewLayoutChangeListener3);
                    }
                }
                if (topView != null) {
                    this.d = new b.a(topView);
                    this.e = onCreateViewHolder;
                    return this.d;
                }
            }
        }
        return super.onCreateViewHolder(viewGroup, i);
    }
}
