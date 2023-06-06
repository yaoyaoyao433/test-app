package com.dianping.shield.dynamic.items.vc;

import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006 "}, d2 = {"Lcom/dianping/shield/dynamic/items/vc/ModulesVCItem;", "", "()V", "bgViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "getBgViewItem", "()Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "setBgViewItem", "(Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;)V", "dragRefreshViewItem", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "getDragRefreshViewItem", "setDragRefreshViewItem", "loadingFailViewItem", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getLoadingFailViewItem", "setLoadingFailViewItem", "loadingViewItem", "getLoadingViewItem", "setLoadingViewItem", "maskViewItem", "getMaskViewItem", "setMaskViewItem", "pageBgViewItem", "getPageBgViewItem", "setPageBgViewItem", "pageMaskViewItem", "getPageMaskViewItem", "setPageMaskViewItem", KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ModulesVCItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private DynamicViewItem<ExtraViewInfo> bgViewItem;
    @Nullable
    private DynamicViewItem<DragRefreshViewInfo> dragRefreshViewItem;
    @Nullable
    private DynamicViewItem<ViewInfo> loadingFailViewItem;
    @Nullable
    private DynamicViewItem<ViewInfo> loadingViewItem;
    @Nullable
    private DynamicViewItem<ExtraViewInfo> maskViewItem;
    @Nullable
    private DynamicViewItem<ExtraViewInfo> pageBgViewItem;
    @Nullable
    private DynamicViewItem<ExtraViewInfo> pageMaskViewItem;

    @Nullable
    public final DynamicViewItem<ExtraViewInfo> getPageBgViewItem() {
        return this.pageBgViewItem;
    }

    public final void setPageBgViewItem(@Nullable DynamicViewItem<ExtraViewInfo> dynamicViewItem) {
        this.pageBgViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<ExtraViewInfo> getPageMaskViewItem() {
        return this.pageMaskViewItem;
    }

    public final void setPageMaskViewItem(@Nullable DynamicViewItem<ExtraViewInfo> dynamicViewItem) {
        this.pageMaskViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<ExtraViewInfo> getBgViewItem() {
        return this.bgViewItem;
    }

    public final void setBgViewItem(@Nullable DynamicViewItem<ExtraViewInfo> dynamicViewItem) {
        this.bgViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<ExtraViewInfo> getMaskViewItem() {
        return this.maskViewItem;
    }

    public final void setMaskViewItem(@Nullable DynamicViewItem<ExtraViewInfo> dynamicViewItem) {
        this.maskViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<ViewInfo> getLoadingViewItem() {
        return this.loadingViewItem;
    }

    public final void setLoadingViewItem(@Nullable DynamicViewItem<ViewInfo> dynamicViewItem) {
        this.loadingViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<ViewInfo> getLoadingFailViewItem() {
        return this.loadingFailViewItem;
    }

    public final void setLoadingFailViewItem(@Nullable DynamicViewItem<ViewInfo> dynamicViewItem) {
        this.loadingFailViewItem = dynamicViewItem;
    }

    @Nullable
    public final DynamicViewItem<DragRefreshViewInfo> getDragRefreshViewItem() {
        return this.dragRefreshViewItem;
    }

    public final void setDragRefreshViewItem(@Nullable DynamicViewItem<DragRefreshViewInfo> dynamicViewItem) {
        this.dragRefreshViewItem = dynamicViewItem;
    }

    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c0a479070f83b6666dde491776a54c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c0a479070f83b6666dde491776a54c0");
            return;
        }
        this.pageBgViewItem = null;
        this.pageMaskViewItem = null;
        this.bgViewItem = null;
        this.maskViewItem = null;
        this.loadingViewItem = null;
        this.loadingFailViewItem = null;
        this.dragRefreshViewItem = null;
    }
}
