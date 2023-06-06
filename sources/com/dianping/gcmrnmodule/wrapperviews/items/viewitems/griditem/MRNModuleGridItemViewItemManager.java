package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.griditem;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleReusableViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c;
import com.dianping.shield.dynamic.model.view.GridItemInfo;
import com.dianping.shield.dynamic.model.view.GridItemViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleGridItemViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/griditem/MRNModuleGridItemViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleReusableViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/GridItemViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/griditem/MRNModuleGridItemViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setGridItemInfo", "", Constants.EventType.VIEW, "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", DMKeys.KEY_GRID_ITEM_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleGridItemViewItemManager extends MRNModuleReusableViewItemManager<GridItemViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleGridItemViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleReusableViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleReusableViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.griditem.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da5de19212563a3b2fd3b178096f19aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.griditem.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da5de19212563a3b2fd3b178096f19aa");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.griditem.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_GRID_ITEM_INFO)
    public final void setGridItemInfo(@NotNull c<GridItemViewInfo> cVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8caba2e6a0130993704c4e7729b2cb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8caba2e6a0130993704c4e7729b2cb97");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        GridItemViewInfo gridItemViewInfo = (GridItemViewInfo) cVar.getInfo();
        GridItemInfo gridItemInfo = null;
        if (readableMap != null) {
            Object[] objArr2 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.base.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "11f048a0517dcc7244306837017d0b9d", RobustBitConfig.DEFAULT_VALUE)) {
                gridItemInfo = (GridItemInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "11f048a0517dcc7244306837017d0b9d");
            } else {
                h.b(readableMap, "$this$toGirdItemInfo");
                GridItemInfo gridItemInfo2 = new GridItemInfo();
                if (readableMap.hasKey(DMKeys.KEY_GRID_ROW_START) && !readableMap.isNull(DMKeys.KEY_GRID_ROW_START)) {
                    gridItemInfo2.setRowStart(Integer.valueOf(readableMap.getInt(DMKeys.KEY_GRID_ROW_START)));
                }
                if (readableMap.hasKey(DMKeys.KEY_GRID_COLUMN_START) && !readableMap.isNull(DMKeys.KEY_GRID_COLUMN_START)) {
                    gridItemInfo2.setColStart(Integer.valueOf(readableMap.getInt(DMKeys.KEY_GRID_COLUMN_START)));
                }
                if (readableMap.hasKey(DMKeys.KEY_GRID_ROW_SPAN) && !readableMap.isNull(DMKeys.KEY_GRID_ROW_SPAN)) {
                    gridItemInfo2.setRowSpan(Integer.valueOf(readableMap.getInt(DMKeys.KEY_GRID_ROW_SPAN)));
                }
                if (readableMap.hasKey(DMKeys.KEY_GRID_COLUMN_SPAN) && !readableMap.isNull(DMKeys.KEY_GRID_COLUMN_SPAN)) {
                    gridItemInfo2.setColSpan(Integer.valueOf(readableMap.getInt(DMKeys.KEY_GRID_COLUMN_SPAN)));
                }
                if (readableMap.hasKey(DMKeys.KEY_GRID_AREA_TAG)) {
                    gridItemInfo2.setGridAreaTag(readableMap.getString(DMKeys.KEY_GRID_AREA_TAG));
                }
                if (readableMap.hasKey(DMKeys.KEY_MARGIN_INFO)) {
                    ReadableMap map = readableMap.getMap(DMKeys.KEY_MARGIN_INFO);
                    gridItemInfo2.setMarginInfo(map != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(map) : null);
                }
                gridItemInfo = gridItemInfo2;
            }
        }
        gridItemViewInfo.setGridItemInfo(gridItemInfo);
        b.a().a(cVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/griditem/MRNModuleGridItemViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
