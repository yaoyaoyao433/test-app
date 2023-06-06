package com.dianping.shield.dynamic.items.paintingcallback;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "dynamicPaitingInterface", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "needSetMargin", "", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;Z)V", "getDynamicPaitingInterface", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "setDynamicPaitingInterface", "(Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;)V", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "setHostChassis", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "getNeedSetMargin", "()Z", "setNeedSetMargin", "(Z)V", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class DynamicViewPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private DynamicPaitingInterface dynamicPaitingInterface;
    @NotNull
    private DynamicChassisInterface hostChassis;
    private boolean needSetMargin;

    public DynamicViewPaintingCallback(@NotNull DynamicChassisInterface dynamicChassisInterface, @Nullable DynamicPaitingInterface dynamicPaitingInterface, boolean z) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface, dynamicPaitingInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6988bac29d0fdbc15da6e3652ce79a00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6988bac29d0fdbc15da6e3652ce79a00");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.dynamicPaitingInterface = dynamicPaitingInterface;
        this.needSetMargin = z;
    }

    public /* synthetic */ DynamicViewPaintingCallback(DynamicChassisInterface dynamicChassisInterface, DynamicPaitingInterface dynamicPaitingInterface, boolean z, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? null : dynamicPaitingInterface, (i & 4) != 0 ? true : z);
    }

    @Nullable
    public final DynamicPaitingInterface getDynamicPaitingInterface() {
        return this.dynamicPaitingInterface;
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    public final boolean getNeedSetMargin() {
        return this.needSetMargin;
    }

    public final void setDynamicPaitingInterface(@Nullable DynamicPaitingInterface dynamicPaitingInterface) {
        this.dynamicPaitingInterface = dynamicPaitingInterface;
    }

    public final void setHostChassis(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40ef3d40aafdaa8c4c670b0a5e64430b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40ef3d40aafdaa8c4c670b0a5e64430b");
            return;
        }
        h.b(dynamicChassisInterface, "<set-?>");
        this.hostChassis = dynamicChassisInterface;
    }

    public final void setNeedSetMargin(boolean z) {
        this.needSetMargin = z;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "043432c10c722fec1a16a6efc139588e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "043432c10c722fec1a16a6efc139588e");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        View view = shieldViewHolder.itemView;
        if (!(view instanceof DynamicWrapperView)) {
            view = null;
        }
        DynamicWrapperView dynamicWrapperView = (DynamicWrapperView) view;
        if (dynamicWrapperView != null) {
            if (obj instanceof DynamicModuleViewItemData) {
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                dynamicWrapperView.paintInput(this.hostChassis, dynamicModuleViewItemData);
                if (this.needSetMargin) {
                    dynamicWrapperView.setMarginByViewInfo(this.hostChassis, dynamicModuleViewItemData.newViewInfo);
                }
            } else if (obj instanceof DynamicTabData) {
                if (shieldViewHolder.itemView.isSelected()) {
                    dynamicWrapperView.paintInput(this.hostChassis, ((DynamicTabData) obj).selectData);
                } else {
                    dynamicWrapperView.paintInput(this.hostChassis, ((DynamicTabData) obj).normalData);
                }
            }
            if (!dynamicWrapperView.getClipChildren()) {
                if (dynamicWrapperView.getParent() instanceof ViewGroup) {
                    ViewParent parent = dynamicWrapperView.getParent();
                    if (parent == null) {
                        throw new o("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    ((ViewGroup) parent).setClipChildren(false);
                    ViewParent parent2 = dynamicWrapperView.getParent();
                    if (parent2 == null) {
                        throw new o("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    ((ViewGroup) parent2).setClipToPadding(false);
                } else if (shieldViewHolder instanceof DynamicViewHolder) {
                    DynamicViewHolder dynamicViewHolder = (DynamicViewHolder) shieldViewHolder;
                    ViewGroup parentView = dynamicViewHolder.getParentView();
                    if (parentView != null) {
                        parentView.setClipChildren(false);
                    }
                    ViewGroup parentView2 = dynamicViewHolder.getParentView();
                    if (parentView2 != null) {
                        parentView2.setClipToPadding(false);
                    }
                }
            }
            DynamicPaitingInterface dynamicPaitingInterface = this.dynamicPaitingInterface;
            if (dynamicPaitingInterface != null) {
                dynamicPaitingInterface.onPaintingInputComplete(shieldViewHolder, obj, nodePath);
            }
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7f15a54bc91dc4fdd23449a43f77e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7f15a54bc91dc4fdd23449a43f77e5f");
        }
        h.b(context, "context");
        DynamicViewHolder dynamicViewHolder = new DynamicViewHolder(new DynamicWrapperView(context));
        dynamicViewHolder.setParentView(viewGroup);
        return dynamicViewHolder;
    }
}
