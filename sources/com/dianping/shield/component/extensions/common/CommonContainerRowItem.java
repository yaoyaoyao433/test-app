package com.dianping.shield.component.extensions.common;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.AttachStatusManager;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.ElementList;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020/H\u0016J2\u00100\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u001cj\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301`\u001e2\u0006\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0012\u00105\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u00107\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010\u00162\b\u00103\u001a\u0004\u0018\u000104R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001d0\u001cj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001d`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001c\u0010+\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u00068"}, d2 = {"Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "Lcom/dianping/shield/node/useritem/RowItem;", "()V", "attachStatusManager", "Lcom/dianping/shield/node/adapter/AttachStatusManager;", "Lcom/dianping/shield/node/useritem/ViewItem;", "getAttachStatusManager", "()Lcom/dianping/shield/node/adapter/AttachStatusManager;", "setAttachStatusManager", "(Lcom/dianping/shield/node/adapter/AttachStatusManager;)V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundViewItem", "getBackgroundViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setBackgroundViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "containerView", "Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "getContainerView", "()Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "setContainerView", "(Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;)V", "dispatchers", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "Lkotlin/collections/ArrayList;", DMKeys.KEY_GRADIENT_BACKGROUND_COLOR, "Landroid/graphics/drawable/GradientDrawable;", "getGradientBackgroundColor", "()Landroid/graphics/drawable/GradientDrawable;", "setGradientBackgroundColor", "(Landroid/graphics/drawable/GradientDrawable;)V", "lastUsedViewItem", "getLastUsedViewItem", "setLastUsedViewItem", "maskViewItem", "getMaskViewItem", "setMaskViewItem", DMKeys.KEY_VIEW_TYPE, "getViewType", "setViewType", KNBConfig.CONFIG_CLEAR_CACHE, "", "getViewLocationProcessors", "Lcom/dianping/shield/node/adapter/ViewLocationChangeProcessor;", "container", "screenVisibleExposeEdge", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "setComponentView", "componentView", "updateInnerProcessor", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CommonContainerRowItem extends RowItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private AttachStatusManager<ViewItem> attachStatusManager;
    @Nullable
    private String backgroundColor;
    @Nullable
    private ViewItem backgroundViewItem;
    @Nullable
    private IElementContainerExpose containerView;
    private ArrayList<ElementStatusEventListener<ViewItem>> dispatchers;
    @Nullable
    private GradientDrawable gradientBackgroundColor;
    @Nullable
    private ViewItem lastUsedViewItem;
    @Nullable
    private ViewItem maskViewItem;
    @Nullable
    private String viewType;

    public CommonContainerRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc2ae4897d4e2fae71f1d7413d1c83da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc2ae4897d4e2fae71f1d7413d1c83da");
            return;
        }
        this.dispatchers = new ArrayList<>();
        this.dispatchers.add(new ElementStatusEventListener<ViewItem>() { // from class: com.dianping.shield.component.extensions.common.CommonContainerRowItem$$special$$inlined$apply$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.adapter.status.ElementStatusEventListener
            public final void onElementStatusChanged(@NotNull AppearanceDispatchData<ViewItem> appearanceDispatchData) {
                Object[] objArr2 = {appearanceDispatchData};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e556154507747c02bf4834d1d8ec9deb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e556154507747c02bf4834d1d8ec9deb");
                    return;
                }
                h.b(appearanceDispatchData, "data");
                ViewItem viewItem = appearanceDispatchData.element;
                ViewItem lastUsedViewItem = CommonContainerRowItem.this.getLastUsedViewItem();
                Object obj = lastUsedViewItem != null ? lastUsedViewItem.data : null;
                if (!(obj instanceof CommonContainerNodeData)) {
                    obj = null;
                }
                CommonContainerNodeData commonContainerNodeData = (CommonContainerNodeData) obj;
                viewItem.onViewItemAppearance(appearanceDispatchData, commonContainerNodeData != null ? commonContainerNodeData.getShieldRow() : null);
                ViewItem viewItem2 = appearanceDispatchData.element;
                ViewItem lastUsedViewItem2 = CommonContainerRowItem.this.getLastUsedViewItem();
                Object obj2 = lastUsedViewItem2 != null ? lastUsedViewItem2.data : null;
                if (!(obj2 instanceof CommonContainerNodeData)) {
                    obj2 = null;
                }
                CommonContainerNodeData commonContainerNodeData2 = (CommonContainerNodeData) obj2;
                viewItem2.onViewItemExpose(appearanceDispatchData, commonContainerNodeData2 != null ? commonContainerNodeData2.getShieldRow() : null);
            }
        });
    }

    @Nullable
    public final String getViewType() {
        return this.viewType;
    }

    public final void setViewType(@Nullable String str) {
        this.viewType = str;
    }

    @Nullable
    public final AttachStatusManager<ViewItem> getAttachStatusManager() {
        return this.attachStatusManager;
    }

    public final void setAttachStatusManager(@Nullable AttachStatusManager<ViewItem> attachStatusManager) {
        this.attachStatusManager = attachStatusManager;
    }

    @Nullable
    public final ViewItem getLastUsedViewItem() {
        return this.lastUsedViewItem;
    }

    public final void setLastUsedViewItem(@Nullable ViewItem viewItem) {
        this.lastUsedViewItem = viewItem;
    }

    @Nullable
    public final IElementContainerExpose getContainerView() {
        return this.containerView;
    }

    public final void setContainerView(@Nullable IElementContainerExpose iElementContainerExpose) {
        this.containerView = iElementContainerExpose;
    }

    @Nullable
    public final ViewItem getMaskViewItem() {
        return this.maskViewItem;
    }

    public final void setMaskViewItem(@Nullable ViewItem viewItem) {
        this.maskViewItem = viewItem;
    }

    @Nullable
    public final ViewItem getBackgroundViewItem() {
        return this.backgroundViewItem;
    }

    public final void setBackgroundViewItem(@Nullable ViewItem viewItem) {
        this.backgroundViewItem = viewItem;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final GradientDrawable getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    public final void setGradientBackgroundColor(@Nullable GradientDrawable gradientDrawable) {
        this.gradientBackgroundColor = gradientDrawable;
    }

    private final ArrayList<ViewLocationChangeProcessor<?>> getViewLocationProcessors(final IElementContainerExpose iElementContainerExpose, IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        Object[] objArr = {iElementContainerExpose, iScreenVisibleExposeEdge};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d29e95d29131f9bddc29863c5cdd7ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d29e95d29131f9bddc29863c5cdd7ed");
        }
        if (this.attachStatusManager == null) {
            this.attachStatusManager = new AttachStatusManager<>(new ViewLocationRectInterface() { // from class: com.dianping.shield.component.extensions.common.CommonContainerRowItem$getViewLocationProcessors$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.adapter.status.ViewLocationRectInterface
                @NotNull
                public final Rect getActualRect() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d68ad5e1f02be771ae1546c82fb07e4b", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d68ad5e1f02be771ae1546c82fb07e4b") : IElementContainerExpose.this.getContainerEdgeRect();
                }
            });
        }
        AttachStatusManager<ViewItem> attachStatusManager = this.attachStatusManager;
        if (attachStatusManager != null) {
            attachStatusManager.setElementList(new ElementList<ViewItem>() { // from class: com.dianping.shield.component.extensions.common.CommonContainerRowItem$getViewLocationProcessors$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.adapter.status.ElementList
                public final int size() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "31bcb807d3504af8d26f29a31716e89c", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "31bcb807d3504af8d26f29a31716e89c")).intValue();
                    }
                    ArrayList<ViewItem> arrayList = CommonContainerRowItem.this.viewItems;
                    if (arrayList != null) {
                        return arrayList.size();
                    }
                    return 0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.dianping.shield.node.adapter.status.ElementList
                @NotNull
                public final ViewItem getDisplayElement(int i) {
                    ViewItem viewItem;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4bd5c1a156fdd21c7db71ab6ffb251a6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ViewItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4bd5c1a156fdd21c7db71ab6ffb251a6");
                    }
                    ArrayList<ViewItem> arrayList = CommonContainerRowItem.this.viewItems;
                    return (arrayList == null || (viewItem = arrayList.get(i)) == null) ? new ViewItem() : viewItem;
                }

                @Override // com.dianping.shield.node.adapter.status.ElementList
                @NotNull
                public final ArrayList<ElementStatusEventListener<ViewItem>> getEventDispatcherList() {
                    ArrayList<ElementStatusEventListener<ViewItem>> arrayList;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba4e2130e6f4953885e60984d08aba44", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba4e2130e6f4953885e60984d08aba44");
                    }
                    arrayList = CommonContainerRowItem.this.dispatchers;
                    return arrayList;
                }
            });
        }
        AttachStatusManager<ViewItem> attachStatusManager2 = this.attachStatusManager;
        if (attachStatusManager2 != null) {
            attachStatusManager2.setScreenVisibleExposeEdge(iScreenVisibleExposeEdge);
        }
        ArrayList<ViewLocationChangeProcessor<?>> arrayList = new ArrayList<>();
        AttachStatusManager<ViewItem> attachStatusManager3 = this.attachStatusManager;
        if (attachStatusManager3 != null) {
            arrayList.add(attachStatusManager3);
        }
        return arrayList;
    }

    public void setComponentView(@Nullable IElementContainerExpose iElementContainerExpose) {
        this.containerView = iElementContainerExpose;
    }

    public final void updateInnerProcessor(@Nullable IElementContainerExpose iElementContainerExpose, @Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        Object[] objArr = {iElementContainerExpose, iScreenVisibleExposeEdge};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08cfba85b746a05f1188c0abc9f61699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08cfba85b746a05f1188c0abc9f61699");
            return;
        }
        setComponentView(iElementContainerExpose);
        IElementContainerExpose iElementContainerExpose2 = this.containerView;
        if (iElementContainerExpose2 != null) {
            iElementContainerExpose2.setViewLocationProcessors(getViewLocationProcessors(iElementContainerExpose2, iScreenVisibleExposeEdge));
        }
    }

    @Override // com.dianping.shield.node.useritem.RowItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df0a86f197566d72685ba9d2fb3efb85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df0a86f197566d72685ba9d2fb3efb85");
            return;
        }
        super.clear();
        this.maskViewItem = null;
        this.backgroundViewItem = null;
        this.viewType = null;
    }
}
