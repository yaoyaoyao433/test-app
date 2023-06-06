package com.dianping.shield.component.extensions.common;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.RowItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\"\u0010\u001a\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J0\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J0\u0010\u001e\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/dianping/shield/component/extensions/common/ContainerRowBgMaskPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/component/extensions/common/ViewHolderWithBgMaskView;", "originPaintingCallback", "(Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;)V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "container", "Landroid/view/ViewGroup;", Constants.EventType.VIEW, "Lcom/dianping/shield/node/useritem/ViewItem;", "context", "Landroid/content/Context;", "createViewHolder", "parent", DMKeys.KEY_VIEW_TYPE, "", "handleBackgroundColor", "Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "handleBgMaskViewItem", "setBgView", "holder", "viewItem", "setMaskView", "Lcom/dianping/shield/component/extensions/common/CommonBgMaskFrameLayout;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContainerRowBgMaskPaintingCallback implements ViewPaintingCallback<ViewHolderWithBgMaskView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ViewPaintingCallback<?> originPaintingCallback;

    public ContainerRowBgMaskPaintingCallback(@NotNull ViewPaintingCallback<?> viewPaintingCallback) {
        h.b(viewPaintingCallback, "originPaintingCallback");
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8b6a3f8cdc3704daf0cbbb9c6fb5a31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8b6a3f8cdc3704daf0cbbb9c6fb5a31");
        } else {
            this.originPaintingCallback = viewPaintingCallback;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.dianping.shield.node.adapter.ShieldViewHolder] */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public final ViewHolderWithBgMaskView createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f5521844e7220db2ee185d2d230defb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewHolderWithBgMaskView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f5521844e7220db2ee185d2d230defb");
        }
        h.b(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        ?? createViewHolder = this.originPaintingCallback.createViewHolder(context, viewGroup, str);
        return new ViewHolderWithBgMaskView(frameLayout, createViewHolder, new CommonBgMaskFrameLayout(context, createViewHolder.itemView, frameLayout));
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ViewHolderWithBgMaskView viewHolderWithBgMaskView, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {viewHolderWithBgMaskView, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122a4b517a6bbfb38016e86471d4a66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122a4b517a6bbfb38016e86471d4a66f");
            return;
        }
        h.b(viewHolderWithBgMaskView, "viewHolder");
        if (obj instanceof CommonContainerNodeData) {
            CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) obj;
            handleBgMaskViewItem(commonContainerNodeData, viewHolderWithBgMaskView, nodePath);
            handleBackgroundColor(commonContainerNodeData, viewHolderWithBgMaskView);
            this.originPaintingCallback.bindViewHolder(viewHolderWithBgMaskView.containerViewHolder, obj, nodePath);
            CommonContainerRow shieldRow = commonContainerNodeData.getShieldRow();
            RowItem rowItem = shieldRow != null ? shieldRow.getRowItem() : null;
            if (!(rowItem instanceof CommonContainerRowItem)) {
                rowItem = null;
            }
            CommonContainerRowItem commonContainerRowItem = (CommonContainerRowItem) rowItem;
            if (commonContainerRowItem != null) {
                View view = viewHolderWithBgMaskView.containerViewHolder.itemView;
                if (!(view instanceof IElementContainerExpose)) {
                    view = null;
                }
                IElementContainerExpose iElementContainerExpose = (IElementContainerExpose) view;
                CommonContainerRow shieldRow2 = commonContainerNodeData.getShieldRow();
                commonContainerRowItem.updateInnerProcessor(iElementContainerExpose, shieldRow2 != null ? shieldRow2.getGlobalScreenVisibleExposeProxy() : null);
            }
        }
    }

    private final void handleBackgroundColor(CommonContainerNodeData commonContainerNodeData, ViewHolderWithBgMaskView viewHolderWithBgMaskView) {
        ViewGroup viewGroup;
        Object[] objArr = {commonContainerNodeData, viewHolderWithBgMaskView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "292d2f03dc30f1fb62067c67b476ea73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "292d2f03dc30f1fb62067c67b476ea73");
            return;
        }
        GradientDrawable gradientColorInfo = commonContainerNodeData.getGradientColorInfo();
        CommonContainerNodeData commonRowData = viewHolderWithBgMaskView.getCommonRowData();
        if (h.a(gradientColorInfo, commonRowData != null ? commonRowData.getGradientColorInfo() : null)) {
            String backgroundColor = commonContainerNodeData.getBackgroundColor();
            CommonContainerNodeData commonRowData2 = viewHolderWithBgMaskView.getCommonRowData();
            if (h.a((Object) backgroundColor, (Object) (commonRowData2 != null ? commonRowData2.getBackgroundColor() : null))) {
                return;
            }
        }
        GradientDrawable gradientColorInfo2 = commonContainerNodeData.getGradientColorInfo();
        if (gradientColorInfo2 == null) {
            String backgroundColor2 = commonContainerNodeData.getBackgroundColor();
            if (backgroundColor2 == null || (viewGroup = viewHolderWithBgMaskView.bgContainer) == null) {
                return;
            }
            viewGroup.setBackgroundColor(ComponentExtensionUtil.Companion.parseColor(backgroundColor2));
            return;
        }
        ViewGroup viewGroup2 = viewHolderWithBgMaskView.bgContainer;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(gradientColorInfo2);
        }
    }

    private final void handleBgMaskViewItem(CommonContainerNodeData commonContainerNodeData, ViewHolderWithBgMaskView viewHolderWithBgMaskView, NodePath nodePath) {
        Object[] objArr = {commonContainerNodeData, viewHolderWithBgMaskView, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c63029d006e1a722240f112183fee67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c63029d006e1a722240f112183fee67");
            return;
        }
        if (viewHolderWithBgMaskView.getBgViewItemHolder() == null) {
            ViewGroup viewGroup = viewHolderWithBgMaskView.bgContainer;
            if (viewGroup != null) {
                viewHolderWithBgMaskView.setBgViewItem(commonContainerNodeData.getBgViewItem());
                viewHolderWithBgMaskView.setBgViewItemHolder(createHolder(viewGroup, viewHolderWithBgMaskView.getBgViewItem(), commonContainerNodeData.getContext()));
            }
            setBgView(viewHolderWithBgMaskView.getBgViewItemHolder(), viewHolderWithBgMaskView.bgContainer, viewHolderWithBgMaskView.getBgViewItem(), nodePath);
        }
        if (viewHolderWithBgMaskView.getMaskViewItemHolder() == null) {
            CommonBgMaskFrameLayout commonBgMaskFrameLayout = viewHolderWithBgMaskView.wrapView;
            viewHolderWithBgMaskView.setMaskViewItem(commonContainerNodeData.getMaskViewItem());
            viewHolderWithBgMaskView.setMaskViewItemHolder(createHolder(commonBgMaskFrameLayout, viewHolderWithBgMaskView.getMaskViewItem(), commonContainerNodeData.getContext()));
        }
        setMaskView(viewHolderWithBgMaskView.getMaskViewItemHolder(), viewHolderWithBgMaskView.wrapView, viewHolderWithBgMaskView.getMaskViewItem(), nodePath);
    }

    private final void setBgView(ShieldViewHolder shieldViewHolder, ViewGroup viewGroup, ViewItem viewItem, NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, viewGroup, viewItem, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a00a0ff4768c88093d95419e9b40b007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a00a0ff4768c88093d95419e9b40b007");
        } else if (viewGroup == null || viewItem == null) {
        } else {
            viewGroup.removeAllViews();
            if (shieldViewHolder != null) {
                ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                if (viewPaintingCallback != null) {
                    viewPaintingCallback.bindViewHolder(shieldViewHolder, viewItem.data, nodePath);
                }
                ViewParent parent = shieldViewHolder.itemView.getParent();
                if (parent != null) {
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(shieldViewHolder.itemView);
                    }
                }
                viewGroup.addView(shieldViewHolder.itemView);
            }
        }
    }

    private final void setMaskView(ShieldViewHolder shieldViewHolder, CommonBgMaskFrameLayout commonBgMaskFrameLayout, ViewItem viewItem, NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, commonBgMaskFrameLayout, viewItem, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "097462dd9b31c6fb547c69e5a3ca69f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "097462dd9b31c6fb547c69e5a3ca69f9");
        } else if (commonBgMaskFrameLayout == null || viewItem == null) {
        } else {
            commonBgMaskFrameLayout.removeMaskView();
            if (shieldViewHolder != null) {
                ViewPaintingCallback viewPaintingCallback = viewItem.viewPaintingCallback;
                if (viewPaintingCallback != null) {
                    viewPaintingCallback.bindViewHolder(shieldViewHolder, viewItem.data, nodePath);
                }
                ViewParent parent = shieldViewHolder.itemView.getParent();
                if (parent != null) {
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup != null) {
                        viewGroup.removeView(shieldViewHolder.itemView);
                    }
                }
                commonBgMaskFrameLayout.setMaskView(shieldViewHolder.itemView);
            }
        }
    }

    private final ShieldViewHolder createHolder(ViewGroup viewGroup, ViewItem viewItem, Context context) {
        ViewPaintingCallback viewPaintingCallback;
        Object[] objArr = {viewGroup, viewItem, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b42222d165ed391d270103a47b5238a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b42222d165ed391d270103a47b5238a");
        }
        if (context == null || viewItem == null || (viewPaintingCallback = viewItem.viewPaintingCallback) == null) {
            return null;
        }
        return viewPaintingCallback.createViewHolder(context, viewGroup, null);
    }
}
