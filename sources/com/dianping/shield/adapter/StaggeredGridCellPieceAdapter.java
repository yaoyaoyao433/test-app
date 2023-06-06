package com.dianping.shield.adapter;

import android.content.Context;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.adapter.n;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.StaggeredGridCellInfoInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/adapter/StaggeredGridCellPieceAdapter;", "Lcom/dianping/agentsdk/adapter/WrapperPieceAdapter;", "Lcom/dianping/shield/feature/StaggeredGridCellInfoInterface;", "context", "Landroid/content/Context;", "pieceAdapter", "Lcom/dianping/agentsdk/sectionrecycler/section/PieceAdapter;", "extraInterface", "(Landroid/content/Context;Lcom/dianping/agentsdk/sectionrecycler/section/PieceAdapter;Lcom/dianping/shield/feature/StaggeredGridCellInfoInterface;)V", "staggerGridLayoutManager", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "getStaggerGridLayoutManager", "()Landroid/support/v7/widget/StaggeredGridLayoutManager;", "setStaggerGridLayoutManager", "(Landroid/support/v7/widget/StaggeredGridLayoutManager;)V", "getNextLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Next;", "section", "", "getPreviousLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Previous;", "onBindViewHolder", "", "holder", "Lcom/dianping/agentsdk/sectionrecycler/section/MergeSectionDividerAdapter$BasicHolder;", "row", "showBottomDivider", "", "showTopDivider", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridCellPieceAdapter extends n<StaggeredGridCellInfoInterface> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private StaggeredGridLayoutManager staggerGridLayoutManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredGridCellPieceAdapter(@NotNull Context context, @NotNull c cVar, @Nullable StaggeredGridCellInfoInterface staggeredGridCellInfoInterface) {
        super(context, cVar, staggeredGridCellInfoInterface);
        h.b(context, "context");
        h.b(cVar, "pieceAdapter");
        Object[] objArr = {context, cVar, staggeredGridCellInfoInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3663c703af1e7041ce69daf54f2af8cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3663c703af1e7041ce69daf54f2af8cd");
        }
    }

    @Nullable
    public final StaggeredGridLayoutManager getStaggerGridLayoutManager() {
        return this.staggerGridLayoutManager;
    }

    public final void setStaggerGridLayoutManager(@Nullable StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.staggerGridLayoutManager = staggeredGridLayoutManager;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final void onBindViewHolder(@Nullable b.a aVar, int i, int i2) {
        View view;
        View view2;
        View view3;
        View view4;
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8fc84bbfb1313bdf492e175fd4b2e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8fc84bbfb1313bdf492e175fd4b2e05");
            return;
        }
        super.onBindViewHolder(aVar, i, i2);
        ViewGroup.LayoutParams layoutParams = null;
        if (this.extraInterface != 0 && (getCellType(i, i2) == CellType.LOADING_MORE || (getCellType(i, i2) == CellType.NORMAL && isInnerSection(i) && ((StaggeredGridCellInfoInterface) this.extraInterface).spanCount(i) > 1))) {
            if (aVar != null && (view4 = aVar.itemView) != null) {
                layoutParams = view4.getLayoutParams();
            }
            StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(layoutParams);
            bVar.a(false);
            if (aVar == null || (view3 = aVar.itemView) == null) {
                return;
            }
            view3.setLayoutParams(bVar);
            return;
        }
        if (aVar != null && (view2 = aVar.itemView) != null) {
            layoutParams = view2.getLayoutParams();
        }
        StaggeredGridLayoutManager.b bVar2 = new StaggeredGridLayoutManager.b(layoutParams);
        bVar2.a(true);
        if (aVar == null || (view = aVar.itemView) == null) {
            return;
        }
        view.setLayoutParams(bVar2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    @Nullable
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52725922cf56f799e01cadc220107f81", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52725922cf56f799e01cadc220107f81");
        }
        if (this.extraInterface != 0 && isInnerSection(i) && ((StaggeredGridCellInfoInterface) this.extraInterface).spanCount(i) > 1) {
            return z.b.LINK_TO_PREVIOUS;
        }
        return super.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    @Nullable
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7c2d462205717249dba3cd4268fe01", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7c2d462205717249dba3cd4268fe01");
        }
        if (this.extraInterface != 0 && isInnerSection(i) && ((StaggeredGridCellInfoInterface) this.extraInterface).spanCount(i) > 1) {
            return z.a.LINK_TO_NEXT;
        }
        return super.getNextLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebc0fc9d595da89f89ee1fef2e9b7a15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebc0fc9d595da89f89ee1fef2e9b7a15")).booleanValue();
        }
        if (this.extraInterface == 0 || !isInnerSection(i) || ((StaggeredGridCellInfoInterface) this.extraInterface).spanCount(i) <= 1) {
            return super.showTopDivider(i, i2);
        }
        return false;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d53615e6e6b3702c197678f0cf2cff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d53615e6e6b3702c197678f0cf2cff")).booleanValue();
        }
        if (this.extraInterface == 0 || !isInnerSection(i) || ((StaggeredGridCellInfoInterface) this.extraInterface).spanCount(i) <= 1) {
            return super.showBottomDivider(i, i2);
        }
        return false;
    }
}
