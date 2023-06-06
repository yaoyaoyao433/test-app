package com.dianping.shield.component.extensions.scroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.picassomodule.widget.scroll.b;
import com.dianping.picassomodule.widget.scroll.pager.c;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.component.extensions.common.ShieldCommonViewHolder;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/RecyclerPagerPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/component/extensions/common/ShieldCommonViewHolder;", "()V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RecyclerPagerPaintingCallback implements ViewPaintingCallback<ShieldCommonViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ShieldCommonViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3ef551e9a478c780773ec7f36ebb615", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldCommonViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3ef551e9a478c780773ec7f36ebb615");
        }
        h.b(context, "context");
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ShieldCommonViewHolder(scrollView);
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldCommonViewHolder shieldCommonViewHolder, @Nullable Object obj, @Nullable final NodePath nodePath) {
        Object[] objArr = {shieldCommonViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84da2edaacbdecfedf6d6b9b4fcfe75e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84da2edaacbdecfedf6d6b9b4fcfe75e");
            return;
        }
        h.b(shieldCommonViewHolder, "viewHolder");
        View view = shieldCommonViewHolder.itemView;
        if (!(view instanceof ScrollView)) {
            view = null;
        }
        ScrollView scrollView = (ScrollView) view;
        boolean z = obj instanceof CommonContainerNodeData;
        CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) (!z ? null : obj);
        CommonContainerRow shieldRow = commonContainerNodeData != null ? commonContainerNodeData.getShieldRow() : null;
        final ScrollRow scrollRow = shieldRow instanceof ScrollRow ? shieldRow : null;
        if (scrollView == null || !z || ((CommonContainerNodeData) obj).getContext() == null || scrollRow == null || scrollRow.viewItems.size() <= 0) {
            return;
        }
        scrollView.setClipToPadding(false);
        scrollView.setClipChildren(false);
        scrollView.a(scrollRow.scrollMode, scrollRow.isGallery, scrollRow.isLoop, scrollRow.isVertical);
        scrollView.a(scrollRow.rowCount, scrollRow.colCount);
        scrollView.b(scrollRow.extraMarginLeft, scrollRow.extraMarginTop, scrollRow.extraMarginRight, scrollRow.extraMarginBottom);
        scrollView.b(scrollRow.marginLeft, scrollRow.marginRight);
        scrollView.a(scrollRow.marginLeft, scrollRow.marginRight, scrollRow.marginTop, scrollRow.marginBottom);
        scrollView.c(scrollRow.xGap, scrollRow.yGap);
        scrollView.setGalleryGap(scrollRow.galleryGap);
        scrollView.setAttachTriggerDistance(scrollRow.attachTriggerDistance);
        scrollView.setScrollRow(scrollRow);
        scrollView.setSelectedIndex(scrollRow.pageIndex);
        scrollView.setScrollEnable(scrollRow.scrollEnabled);
        scrollView.setScrollEventDispatcher(scrollRow.scrollEventDispatcherProvider);
        scrollView.setOnDidInterceptTouchListener(scrollRow.onDidInterceptTouchListener);
        scrollView.a(scrollRow.autoHeight, scrollRow.heightList);
        scrollView.setOnItemClickListener(new b() { // from class: com.dianping.shield.component.extensions.scroll.RecyclerPagerPaintingCallback$bindViewHolder$$inlined$with$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picassomodule.widget.scroll.b
            public final void onItemClick(View view2, int i) {
                Object[] objArr2 = {view2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1c567b2fd1c7f092e31d2646f7b9c674", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1c567b2fd1c7f092e31d2646f7b9c674");
                    return;
                }
                ViewClickCallbackWithData viewClickCallbackWithData = ScrollRow.this.viewItems.get(i).clickCallback;
                if (viewClickCallbackWithData != null) {
                    h.a((Object) view2, Constants.EventType.VIEW);
                    viewClickCallbackWithData.onViewClicked(view2, ScrollRow.this.viewItems.get(i).data, nodePath);
                }
            }
        });
        scrollView.setOnPageSelectedListener(new com.dianping.picassomodule.widget.scroll.pager.b() { // from class: com.dianping.shield.component.extensions.scroll.RecyclerPagerPaintingCallback$bindViewHolder$$inlined$with$lambda$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picassomodule.widget.scroll.pager.b
            public final void onPageSelected(int i, @NotNull c cVar) {
                Object[] objArr2 = {Integer.valueOf(i), cVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a26684aefac4bbece79672a9f76b3cfa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a26684aefac4bbece79672a9f76b3cfa");
                    return;
                }
                h.b(cVar, "reason");
                ScrollRow.this.pageIndex = i;
                com.dianping.picassomodule.widget.scroll.pager.b bVar = ScrollRow.this.onPageSelectedListener;
                if (bVar != null) {
                    bVar.onPageSelected(i, cVar);
                }
            }
        });
        scrollView.setAttachedStatusChangedListener(new ScrollView.c() { // from class: com.dianping.shield.component.extensions.scroll.RecyclerPagerPaintingCallback$bindViewHolder$$inlined$with$lambda$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picassomodule.widget.scroll.ScrollView.c
            public final void attachedStatusChanged(boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c94cb661ea66bfdbc112e668b5fb54c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c94cb661ea66bfdbc112e668b5fb54c6");
                    return;
                }
                ScrollView.c cVar = ScrollRow.this.attachedStatusChangedListener;
                if (cVar != null) {
                    cVar.attachedStatusChanged(z2);
                }
                AttachStatus attachStatus = z2 ? AttachStatus.DETACHED : AttachStatus.FULLY_ATTACHED;
                AttachStatus attachStatus2 = z2 ? AttachStatus.FULLY_ATTACHED : AttachStatus.DETACHED;
                ViewItem viewItem = ScrollRow.this.normalAttachView;
                if (viewItem != null) {
                    viewItem.onViewItemExpose(new AppearanceDispatchData<>(ScrollRow.this.viewItems.size() - 1, ScrollRow.this.normalAttachView, attachStatus, attachStatus2, ScrollDirection.STATIC, null), ScrollRow.this);
                }
            }
        });
        scrollView.setOnFooterActionListener(scrollRow.onFooterActionListener);
        if (scrollRow.autoLoopInterval > 0) {
            scrollView.a(true, scrollRow.autoLoopInterval);
        }
    }
}
