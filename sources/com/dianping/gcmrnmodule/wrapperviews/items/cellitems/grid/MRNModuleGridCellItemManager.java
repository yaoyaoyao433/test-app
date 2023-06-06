package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager;
import com.dianping.shield.dynamic.model.cell.GridCellInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleGridCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001a\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0007J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0013¨\u0006'"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/grid/MRNModuleGridCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/grid/MRNModuleGridCellItemWrapperView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setColCount", "", Constants.EventType.VIEW, DMKeys.KEY_COLCOUNT, "", "setGridAreas", DMKeys.KEY_GRID_AREAS, "Lcom/facebook/react/bridge/ReadableArray;", "setGridCellHeight", "gridCellHeight", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/grid/MRNModuleGridCellItemWrapperView;Ljava/lang/Integer;)V", "setGridColWidths", DMKeys.KEY_GRID_COLUMN_WIDTHS, "setGridRowHeights", DMKeys.KEY_GRID_ROW_HEIGHTS, "setGridSelectionStyle", DMKeys.KEY_GRID_SELECTION_STYLE, "setGridSeparatorLineColor", DMKeys.KEY_GRID_SEPARATOR_LINE_COLOR, "setGridSeparatorLineStyle", DMKeys.KEY_GRID_SEPARATOR_LINE_STYLE, "setReuseIdentifier", DMKeys.KEY_REUSE_IDENTIFIER, "setRowCount", DMKeys.KEY_ROWCOUNT, "setXGap", DMKeys.KEY_XGAP, "setYGap", DMKeys.KEY_YGAP, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleGridCellItemManager extends MRNModuleCellItemManager<com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleGridCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8d290d82d1de93014c2c66f508a3391", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8d290d82d1de93014c2c66f508a3391");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_COLCOUNT)
    public final void setColCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7d80168bc4b159f364761e9835ee071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7d80168bc4b159f364761e9835ee071");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setColCount(i);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ROWCOUNT)
    public final void setRowCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c12db2919e9c1c319e50b6c3a2d2a1fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c12db2919e9c1c319e50b6c3a2d2a1fc");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setRowCount(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "gridHeight")
    public final void setGridCellHeight(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bde95299d57a851b14a941b44825482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bde95299d57a851b14a941b44825482");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setGridHeight(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b9ba76e31dcda61e8ef999975be7326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b9ba76e31dcda61e8ef999975be7326");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setXGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_YGAP)
    public final void setYGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a36455a401a0be38afbb414b9492ec54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a36455a401a0be38afbb414b9492ec54");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setYGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_SELECTION_STYLE)
    public final void setGridSelectionStyle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37cffe9368966bb75324f24fbd410ac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37cffe9368966bb75324f24fbd410ac4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setGridSelectionStyle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_SEPARATOR_LINE_STYLE)
    public final void setGridSeparatorLineStyle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be09198d12675de5f040c057202c582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be09198d12675de5f040c057202c582");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setGridSeparatorLineStyle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_SEPARATOR_LINE_COLOR)
    public final void setGridSeparatorLineColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2477eebb5ea07d0a705a69d59436e530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2477eebb5ea07d0a705a69d59436e530");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setGridSeparatorLineColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_ROW_HEIGHTS)
    public final void setGridRowHeights(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c91e1332fc20db870e842c2a4cc5d9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c91e1332fc20db870e842c2a4cc5d9b");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                String string = readableArray.getString(i);
                if (string == null) {
                    string = "";
                }
                arrayList.add(string);
            }
            ((GridCellInfo) aVar.getInfo()).setGridRowHeights(arrayList);
        } else {
            ((GridCellInfo) aVar.getInfo()).setGridRowHeights(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_COLUMN_WIDTHS)
    public final void setGridColWidths(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef716bade2eebdf3c1d9da528581bc6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef716bade2eebdf3c1d9da528581bc6f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                String string = readableArray.getString(i);
                if (string == null) {
                    string = "";
                }
                arrayList.add(string);
            }
            ((GridCellInfo) aVar.getInfo()).setGridColWidths(arrayList);
        } else {
            ((GridCellInfo) aVar.getInfo()).setGridColWidths(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRID_AREAS)
    public final void setGridAreas(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f837a34ec7a1a901fbecfc19398b09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f837a34ec7a1a901fbecfc19398b09e");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (readableArray != null) {
            ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ReadableArray array = readableArray.getArray(i);
                if (array != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int size2 = array.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String string = array.getString(i2);
                        if (string == null) {
                            string = "";
                        }
                        arrayList2.add(string);
                    }
                    arrayList.add(arrayList2);
                }
            }
            ((GridCellInfo) aVar.getInfo()).setGridAreas(arrayList);
        } else {
            ((GridCellInfo) aVar.getInfo()).setGridAreas(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_REUSE_IDENTIFIER)
    public final void setReuseIdentifier(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "222eef7b2cafef31787404f7cf05ce94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "222eef7b2cafef31787404f7cf05ce94");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridCellInfo) aVar.getInfo()).setReuseIdentifier(str);
        b.a().a(aVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/grid/MRNModuleGridCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
