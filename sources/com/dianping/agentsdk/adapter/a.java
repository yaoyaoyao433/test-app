package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.ah;
import com.dianping.agentsdk.framework.ai;
import com.dianping.agentsdk.framework.aj;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.entity.CellType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends n<ai> {
    public static ChangeQuickRedirect a;
    protected aj b;
    protected ah c;
    protected com.dianping.agentsdk.sectionrecycler.divider.a d;

    public a(@NonNull Context context, com.dianping.agentsdk.sectionrecycler.section.c cVar, ai aiVar) {
        super(context, cVar, aiVar);
        Object[] objArr = {context, cVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96a70759f03fc17fddb6bce34752cbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96a70759f03fc17fddb6bce34752cbb");
        }
    }

    public final void a(aj ajVar) {
        this.b = ajVar;
    }

    public final void a(ah ahVar) {
        this.c = ahVar;
    }

    public final void a(com.dianping.agentsdk.sectionrecycler.divider.a aVar) {
        this.d = aVar;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d2fe99a8a11ea09bdaf6cb42dc6748", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d2fe99a8a11ea09bdaf6cb42dc6748")).intValue();
        }
        if (this.extraInterface != 0) {
            r9 = ((ai) this.extraInterface).hasHeaderForSection(i) ? 1 : 0;
            if (((ai) this.extraInterface).hasFooterForSection(i)) {
                r9++;
            }
        }
        return super.getRowCount(i) + r9;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final int getItemViewType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72b8a3a5cd15f1d2d5e8f67e2715fb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72b8a3a5cd15f1d2d5e8f67e2715fb5")).intValue();
        }
        if (this.extraInterface != 0) {
            if (i2 == 0 && ((ai) this.extraInterface).hasHeaderForSection(i)) {
                return ((ai) this.extraInterface).getHeaderViewType(i);
            }
            if (i2 == getRowCount(i) - 1 && ((ai) this.extraInterface).hasFooterForSection(i)) {
                return ((ai) this.extraInterface).getFooterViewType(i) + ((ai) this.extraInterface).getHeaderViewTypeCount();
            }
            return super.getItemViewType(i, i2 - (((ai) this.extraInterface).hasHeaderForSection(i) ? 1 : 0)) + ((ai) this.extraInterface).getHeaderViewTypeCount() + ((ai) this.extraInterface).getFooterViewTypeCount();
        }
        return super.getItemViewType(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final int getInnerType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77a563f7fa9712c037b749aaf88f710", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77a563f7fa9712c037b749aaf88f710")).intValue();
        }
        if (this.extraInterface != 0) {
            if (i < ((ai) this.extraInterface).getHeaderViewTypeCount()) {
                return i;
            }
            if (i < ((ai) this.extraInterface).getHeaderViewTypeCount() + ((ai) this.extraInterface).getFooterViewTypeCount()) {
                return i - ((ai) this.extraInterface).getHeaderViewTypeCount();
            }
            return super.getInnerType(i - (((ai) this.extraInterface).getHeaderViewTypeCount() + ((ai) this.extraInterface).getFooterViewTypeCount()));
        }
        return super.getInnerType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29d1e8c5f1034bbbe8f0a166a8302f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29d1e8c5f1034bbbe8f0a166a8302f1");
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0 && (this.extraInterface instanceof aj)) {
            CellType cellType = getCellType(i, i2);
            if (cellType == CellType.HEADER) {
                return ((aj) this.extraInterface).a(((Integer) innerPosition.first).intValue());
            }
            if (cellType == CellType.FOOTER) {
                return ((aj) this.extraInterface).c(((Integer) innerPosition.first).intValue());
            }
        }
        return super.getTopDivider(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48dc672d23fc2ac23026c0c783f9873e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48dc672d23fc2ac23026c0c783f9873e");
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0) {
            CellType cellType = getCellType(i, i2);
            if ((this.extraInterface instanceof aj) && (cellType == CellType.HEADER || cellType == CellType.FOOTER)) {
                return ((aj) this.extraInterface).b(((Integer) innerPosition.first).intValue());
            }
            if (cellType == CellType.HEADER || cellType == CellType.FOOTER) {
                return null;
            }
            return super.getBottomDivider(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
        return null;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2efc3d43422e74b10af276da25000e04", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2efc3d43422e74b10af276da25000e04");
        }
        if (this.extraInterface != 0) {
            if (!((ai) this.extraInterface).hasHeaderForSection(i)) {
                i3 = i2;
            } else if (i2 == 0) {
                return CellType.HEADER;
            } else {
                i3 = i2 - 1;
            }
            if (((ai) this.extraInterface).hasFooterForSection(i) && i2 == getRowCount(i) - 1) {
                return CellType.FOOTER;
            }
            i2 = i3;
        }
        return super.getCellType(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final CellType getCellType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a2408ea7f3317028ac5691c25db168", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a2408ea7f3317028ac5691c25db168");
        }
        if (i < ((ai) this.extraInterface).getHeaderViewTypeCount()) {
            return CellType.HEADER;
        }
        if (i < ((ai) this.extraInterface).getHeaderViewTypeCount() + ((ai) this.extraInterface).getFooterViewTypeCount()) {
            return CellType.FOOTER;
        }
        return super.getCellType((i - ((ai) this.extraInterface).getHeaderViewTypeCount()) - ((ai) this.extraInterface).getFooterViewTypeCount());
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final Pair<Integer, Integer> getInnerPosition(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe1ff17b94685f79a36de4b2a1adb8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe1ff17b94685f79a36de4b2a1adb8a");
        }
        if (this.extraInterface != 0) {
            if (!((ai) this.extraInterface).hasHeaderForSection(i)) {
                i3 = i2;
            } else if (i2 == 0) {
                return new Pair<>(Integer.valueOf(i), -1);
            } else {
                i3 = i2 - 1;
            }
            if (((ai) this.extraInterface).hasFooterForSection(i) && i2 == getRowCount(i) - 1) {
                return new Pair<>(Integer.valueOf(i), -2);
            }
            i2 = i3;
        }
        return super.getInnerPosition(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96527e4418136b2d7d422fa9d54ad7bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96527e4418136b2d7d422fa9d54ad7bb")).booleanValue();
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0) {
            CellType cellType = getCellType(i, i2);
            if (cellType == CellType.HEADER) {
                return ((ai) this.extraInterface).hasTopDividerForHeader(((Integer) innerPosition.first).intValue());
            }
            if (cellType == CellType.FOOTER) {
                return true;
            }
        }
        return super.showTopDivider(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6c75c9c194da92f19f206312d37026", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6c75c9c194da92f19f206312d37026")).booleanValue();
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0) {
            CellType cellType = getCellType(i, i2);
            if (cellType == CellType.HEADER) {
                return ((ai) this.extraInterface).hasBottomDividerForHeader(((Integer) innerPosition.first).intValue());
            }
            if (cellType == CellType.FOOTER) {
                return ((ai) this.extraInterface).hasBottomDividerForFooter(((Integer) innerPosition.first).intValue());
            }
        }
        return super.showBottomDivider(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect bottomDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69a8e41c412ecb9928a020074caf7b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69a8e41c412ecb9928a020074caf7b7");
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        CellType cellType = getCellType(i, i2);
        if (cellType == CellType.HEADER) {
            if (this.c != null) {
                Rect rect = new Rect();
                rect.left = this.c.c(i);
                rect.right = this.c.d(i);
                return rect;
            } else if (this.extraInterface != 0) {
                Rect rect2 = new Rect();
                int headerDividerOffset = (int) ((ai) this.extraInterface).getHeaderDividerOffset(i);
                if (headerDividerOffset < 0) {
                    return null;
                }
                rect2.left = headerDividerOffset;
                return rect2;
            } else {
                return null;
            }
        } else if (cellType == CellType.FOOTER) {
            if (this.c != null) {
                Rect rect3 = new Rect();
                rect3.left = this.c.g(i);
                rect3.right = this.c.h(i);
                return rect3;
            } else if (this.extraInterface != 0) {
                Rect rect4 = new Rect();
                int footerDividerOffset = (int) ((ai) this.extraInterface).getFooterDividerOffset(i);
                if (footerDividerOffset < 0) {
                    return null;
                }
                rect4.left = footerDividerOffset;
                return rect4;
            } else {
                return null;
            }
        } else {
            return super.bottomDividerOffset(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect topDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815273b77485b16fc817f855ad14fbe2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815273b77485b16fc817f855ad14fbe2");
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        CellType cellType = getCellType(i, i2);
        if (cellType == CellType.HEADER) {
            if (this.c != null) {
                Rect rect = new Rect();
                rect.left = this.c.a(i);
                rect.right = this.c.b(i);
                return rect;
            }
            return null;
        } else if (cellType == CellType.FOOTER) {
            if (this.c != null) {
                Rect rect2 = new Rect();
                rect2.left = this.c.e(i);
                rect2.right = this.c.f(i);
                return rect2;
            }
            return null;
        } else {
            return super.topDividerOffset(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final long getItemId(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada2217b584f583d008d420d57d69d30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada2217b584f583d008d420d57d69d30")).longValue();
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0) {
            CellType cellType = getCellType(i, i2);
            if (cellType == CellType.HEADER) {
                return i * 2;
            }
            if (cellType == CellType.FOOTER) {
                return (i * 2) + 1;
            }
        }
        return super.getItemId(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue()) + (getSectionCount() * 2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9618ec6001d5eb58eb6d017ae53654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9618ec6001d5eb58eb6d017ae53654");
            return;
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface != 0) {
            CellType cellType = getCellType(i, i2);
            if (cellType == CellType.HEADER) {
                ((ai) this.extraInterface).updateHeaderView(aVar.itemView, ((Integer) innerPosition.first).intValue(), (ViewGroup) aVar.itemView.getParent());
                return;
            } else if (cellType == CellType.FOOTER) {
                ((ai) this.extraInterface).updateFooterView(aVar.itemView, ((Integer) innerPosition.first).intValue(), (ViewGroup) aVar.itemView.getParent());
                return;
            }
        }
        super.onBindViewHolder(aVar, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
    }

    @Override // com.dianping.agentsdk.adapter.n, android.support.v7.widget.RecyclerView.a
    public final b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2cee5c23ebf81aabc1e8f9c4305e5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2cee5c23ebf81aabc1e8f9c4305e5c3");
        }
        if (this.extraInterface != 0) {
            if (i >= 0 && i < ((ai) this.extraInterface).getHeaderViewTypeCount()) {
                return new b.a(((ai) this.extraInterface).onCreateHeaderView(viewGroup, i));
            }
            if (i >= ((ai) this.extraInterface).getHeaderViewTypeCount() && i < ((ai) this.extraInterface).getHeaderViewTypeCount() + ((ai) this.extraInterface).getFooterViewTypeCount()) {
                return new b.a(((ai) this.extraInterface).onCreateFooterView(viewGroup, i - ((ai) this.extraInterface).getHeaderViewTypeCount()));
            }
            return super.onCreateViewHolder(viewGroup, (i - ((ai) this.extraInterface).getHeaderViewTypeCount()) - ((ai) this.extraInterface).getFooterViewTypeCount());
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasBottomDividerVerticalOffset(int i, int i2) {
        CellType cellType;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81686be060b552aa84abcf24514f180", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81686be060b552aa84abcf24514f180")).booleanValue();
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface == 0 || !((cellType = getCellType(i, i2)) == CellType.HEADER || cellType == CellType.FOOTER)) {
            return super.hasBottomDividerVerticalOffset(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
        return false;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasTopDividerVerticalOffset(int i, int i2) {
        CellType cellType;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748ade22bd9e510ee6fa753f8f43980e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748ade22bd9e510ee6fa753f8f43980e")).booleanValue();
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.extraInterface == 0 || !((cellType = getCellType(i, i2)) == CellType.HEADER || cellType == CellType.FOOTER)) {
            return super.hasTopDividerVerticalOffset(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
        return false;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.a
    public final r getDividerInfo(int i, int i2) {
        CellType cellType;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d299ff6b29d5c2d8bbdd023efd998c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d299ff6b29d5c2d8bbdd023efd998c8");
        }
        Pair<Integer, Integer> innerPosition = getInnerPosition(i, i2);
        if (this.d != null && ((cellType = getCellType(i, i2)) == CellType.HEADER || cellType == CellType.FOOTER)) {
            return this.d.a(cellType, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
        }
        return super.getDividerInfo(((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
    }
}
