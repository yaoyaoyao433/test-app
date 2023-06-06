package com.dianping.shield.node.cellnode;

import com.dianping.agentsdk.framework.f;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.expose.EntrySetHolder;
import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.node.adapter.hotzone.HotZone;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadDisplayNodeProvider;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010d\u001a\u00020eH\u0016J\u0006\u0010f\u001a\u00020_J \u0010g\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010i2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000kH\u0002J\u0016\u0010l\u001a\u00020e2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00000kH\u0002J\u0013\u0010n\u001a\u0002032\b\u0010o\u001a\u0004\u0018\u00010pH\u0096\u0002J\u0010\u0010q\u001a\u0004\u0018\u00010\u00022\u0006\u0010r\u001a\u00020_J\u0012\u0010s\u001a\u0004\u0018\u00010\u00022\u0006\u0010r\u001a\u00020_H\u0016J\b\u0010t\u001a\u00020_H\u0016J\b\u0010u\u001a\u00020vH\u0016J\b\u0010w\u001a\u00020_H\u0016J&\u0010x\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010i2\u0012\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010kH\u0016J\u001c\u0010y\u001a\u00020e2\u0012\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010kH\u0016R2\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R:\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020#\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010.\u001a\u0016\u0012\u0004\u0012\u00020/\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020/\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00104\"\u0004\b5\u00106R2\u00107\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000008\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000008\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u0004\u0018\u00010B8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020H8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010I\u001a\u00020JX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010O\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R*\u0010Q\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010T\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010U\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010^\u001a\u00020_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006z"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldRow;", "Lcom/dianping/shield/expose/EntrySetHolder;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "()V", "attachStatusChangeListenerList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/AttachStatusChangeListener;", "Lkotlin/collections/ArrayList;", "bottomInfo", "Lcom/dianping/shield/node/useritem/BottomInfo;", "getBottomInfo", "()Lcom/dianping/shield/node/useritem/BottomInfo;", "setBottomInfo", "(Lcom/dianping/shield/node/useritem/BottomInfo;)V", "cardConfigInfo", "Lcom/dianping/shield/node/cellnode/CardConfigInfo;", "cellType", "Lcom/dianping/shield/entity/CellType;", "dNodeMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/collections/HashMap;", "getDNodeMap", "()Ljava/util/HashMap;", "setDNodeMap", "(Ljava/util/HashMap;)V", "dividerStyle", "Lcom/dianping/shield/node/useritem/DividerStyle;", "exposeComputeMode", "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "getExposeComputeMode", "()Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "setExposeComputeMode", "(Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;)V", "exposeInfoArr", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "getExposeInfoArr", "()Ljava/util/ArrayList;", "setExposeInfoArr", "(Ljava/util/ArrayList;)V", "globalScreenVisibleExposeProxy", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "getGlobalScreenVisibleExposeProxy", "()Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "setGlobalScreenVisibleExposeProxy", "(Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;)V", "hotZoneArray", "Lcom/dianping/shield/node/adapter/hotzone/HotZone;", "getHotZoneArray", "setHotZoneArray", "isLazyLoad", "", "()Z", "setLazyLoad", "(Z)V", "moveStatusEventListenerList", "Lcom/dianping/shield/node/cellnode/MoveStatusEventListener;", "moveStatusInfo", "Lcom/dianping/shield/node/useritem/MoveStatusInfo;", "nodeProvider", "Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadDisplayNodeProvider;", "getNodeProvider", "()Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadDisplayNodeProvider;", "setNodeProvider", "(Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadDisplayNodeProvider;)V", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "getPath", "()Lcom/dianping/shield/node/cellnode/NodePath;", "setPath", "(Lcom/dianping/shield/node/cellnode/NodePath;)V", "rangeAppearStateManager", "Lcom/dianping/shield/expose/RangeAppearStateManager;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "getRowItem", "()Lcom/dianping/shield/node/useritem/RowItem;", "setRowItem", "(Lcom/dianping/shield/node/useritem/RowItem;)V", "sectionParent", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldDisplayNodes", "shieldFloatViewNode", "Lcom/dianping/shield/node/cellnode/ShieldFloatViewDisplayNode;", "showCellBottomLineDivider", "showCellTopLineDivider", "topInfo", "Lcom/dianping/shield/node/useritem/TopInfo;", "getTopInfo", "()Lcom/dianping/shield/node/useritem/TopInfo;", "setTopInfo", "(Lcom/dianping/shield/node/useritem/TopInfo;)V", "typePrefix", "", "viewCount", "", "getViewCount", "()I", "setViewCount", "(I)V", KNBConfig.CONFIG_CLEAR_CACHE, "", "currentRowIndex", "dispatchAppearanceEvent", "appearanceEvent", "Lcom/dianping/shield/node/cellnode/AppearanceEvent;", "appearanceDispatchData", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "dispatchAttachStatusChanged", "data", "equals", "other", "", "getDisplayNodeAtPosition", "position", "getEntry", "getEntryCount", "getIndexPath", "Lcom/dianping/shield/entity/IndexPath;", "hashCode", "onAppearanceEvent", "onAttachStateChanged", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldRow implements EntrySetHolder<ShieldDisplayNode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ArrayList<AttachStatusChangeListener<ShieldRow>> attachStatusChangeListenerList;
    @Nullable
    private BottomInfo bottomInfo;
    @JvmField
    @Nullable
    public CardConfigInfo cardConfigInfo;
    @JvmField
    @NotNull
    public CellType cellType;
    @Nullable
    private HashMap<ViewItem, ShieldDisplayNode> dNodeMap;
    @JvmField
    @Nullable
    public DividerStyle dividerStyle;
    @Nullable
    private f.a exposeComputeMode;
    @Nullable
    private ArrayList<ExposeInfo> exposeInfoArr;
    @Nullable
    private IScreenVisibleExposeEdge globalScreenVisibleExposeProxy;
    @Nullable
    private ArrayList<HotZone> hotZoneArray;
    private boolean isLazyLoad;
    @JvmField
    @Nullable
    public ArrayList<MoveStatusEventListener<ShieldRow>> moveStatusEventListenerList;
    @JvmField
    @Nullable
    public MoveStatusInfo moveStatusInfo;
    @Nullable
    private LazyLoadDisplayNodeProvider nodeProvider;
    @Nullable
    private NodePath path;
    @JvmField
    @NotNull
    public RangeAppearStateManager<ShieldDisplayNode> rangeAppearStateManager;
    @NotNull
    public RowItem rowItem;
    @JvmField
    @Nullable
    public ShieldSection sectionParent;
    @JvmField
    @Nullable
    public ArrayList<ShieldDisplayNode> shieldDisplayNodes;
    @JvmField
    @Nullable
    public ShieldFloatViewDisplayNode shieldFloatViewNode;
    @JvmField
    public boolean showCellBottomLineDivider;
    @JvmField
    public boolean showCellTopLineDivider;
    @Nullable
    private TopInfo topInfo;
    @JvmField
    @Nullable
    public String typePrefix;
    private int viewCount;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AppearanceEvent.FULLY_APPEAR.ordinal()] = 1;
            $EnumSwitchMapping$0[AppearanceEvent.PARTLY_APPEAR.ordinal()] = 2;
            $EnumSwitchMapping$0[AppearanceEvent.FULLY_DISAPPEAR.ordinal()] = 3;
            $EnumSwitchMapping$0[AppearanceEvent.PARTLY_DISAPPEAR.ordinal()] = 4;
        }
    }

    public ShieldRow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3373c8360b86c8dd72de2578957b248b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3373c8360b86c8dd72de2578957b248b");
            return;
        }
        this.showCellTopLineDivider = true;
        this.showCellBottomLineDivider = true;
        this.cellType = CellType.NORMAL;
        this.viewCount = 1;
        this.rangeAppearStateManager = new RangeAppearStateManager<>(this);
    }

    @NotNull
    public final RowItem getRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3160700c6c96b84b9708aef8a1347bac", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3160700c6c96b84b9708aef8a1347bac");
        }
        RowItem rowItem = this.rowItem;
        if (rowItem == null) {
            h.a("rowItem");
        }
        return rowItem;
    }

    public final void setRowItem(@NotNull RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febb23cd855d1236c6d879be69cc9435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febb23cd855d1236c6d879be69cc9435");
            return;
        }
        h.b(rowItem, "<set-?>");
        this.rowItem = rowItem;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final void setViewCount(int i) {
        this.viewCount = i;
    }

    public final boolean isLazyLoad() {
        return this.isLazyLoad;
    }

    public final void setLazyLoad(boolean z) {
        this.isLazyLoad = z;
    }

    @Nullable
    public final LazyLoadDisplayNodeProvider getNodeProvider() {
        return this.nodeProvider;
    }

    public final void setNodeProvider(@Nullable LazyLoadDisplayNodeProvider lazyLoadDisplayNodeProvider) {
        this.nodeProvider = lazyLoadDisplayNodeProvider;
    }

    @Nullable
    public final TopInfo getTopInfo() {
        return this.topInfo;
    }

    public final void setTopInfo(@Nullable TopInfo topInfo) {
        this.topInfo = topInfo;
    }

    @Nullable
    public final BottomInfo getBottomInfo() {
        return this.bottomInfo;
    }

    public final void setBottomInfo(@Nullable BottomInfo bottomInfo) {
        this.bottomInfo = bottomInfo;
    }

    @Nullable
    public final f.a getExposeComputeMode() {
        return this.exposeComputeMode;
    }

    public final void setExposeComputeMode(@Nullable f.a aVar) {
        this.exposeComputeMode = aVar;
    }

    @Nullable
    public final IScreenVisibleExposeEdge getGlobalScreenVisibleExposeProxy() {
        return this.globalScreenVisibleExposeProxy;
    }

    public final void setGlobalScreenVisibleExposeProxy(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.globalScreenVisibleExposeProxy = iScreenVisibleExposeEdge;
    }

    public final int currentRowIndex() {
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c148cc1a8a6abed8c6819bf47593ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c148cc1a8a6abed8c6819bf47593ca")).intValue();
        }
        if (this.cellType == CellType.HEADER) {
            return -1;
        }
        if (this.cellType == CellType.FOOTER) {
            return -2;
        }
        ShieldSection shieldSection = this.sectionParent;
        int indexOf = (shieldSection == null || (rangeRemoveableArrayList = shieldSection.shieldRows) == null) ? -3 : rangeRemoveableArrayList.indexOf(this);
        ShieldSection shieldSection2 = this.sectionParent;
        return (shieldSection2 == null || !shieldSection2.hasHeaderCell) ? indexOf : indexOf - 1;
    }

    @Nullable
    public final ArrayList<HotZone> getHotZoneArray() {
        return this.hotZoneArray;
    }

    public final void setHotZoneArray(@Nullable ArrayList<HotZone> arrayList) {
        this.hotZoneArray = arrayList;
    }

    @Nullable
    public final ArrayList<ExposeInfo> getExposeInfoArr() {
        return this.exposeInfoArr;
    }

    public final void setExposeInfoArr(@Nullable ArrayList<ExposeInfo> arrayList) {
        this.exposeInfoArr = arrayList;
    }

    @Nullable
    public final HashMap<ViewItem, ShieldDisplayNode> getDNodeMap() {
        return this.dNodeMap;
    }

    public final void setDNodeMap(@Nullable HashMap<ViewItem, ShieldDisplayNode> hashMap) {
        this.dNodeMap = hashMap;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33b946d8b84a911790a49e06044c06a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33b946d8b84a911790a49e06044c06a9");
            return;
        }
        this.sectionParent = null;
        this.shieldDisplayNodes = null;
        this.showCellTopLineDivider = true;
        this.showCellBottomLineDivider = true;
        this.dividerStyle = null;
        this.cardConfigInfo = null;
        this.cellType = CellType.NORMAL;
        this.typePrefix = null;
        this.viewCount = 1;
        this.isLazyLoad = false;
        this.nodeProvider = null;
        this.topInfo = null;
        this.bottomInfo = null;
        this.moveStatusInfo = null;
        this.exposeInfoArr = null;
        ArrayList<MoveStatusEventListener<ShieldRow>> arrayList = this.moveStatusEventListenerList;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<AttachStatusChangeListener<ShieldRow>> arrayList2 = this.attachStatusChangeListenerList;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.exposeComputeMode = null;
        this.path = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r12 < (r0 != null ? r0.size() : -1)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.shield.node.cellnode.ShieldDisplayNode getDisplayNodeAtPosition(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.node.cellnode.ShieldRow.changeQuickRedirect
            java.lang.String r10 = "03e009b0abc97308ddeb1322e66e2280"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.dianping.shield.node.cellnode.ShieldDisplayNode r12 = (com.dianping.shield.node.cellnode.ShieldDisplayNode) r12
            return r12
        L22:
            boolean r0 = r11.isLazyLoad
            r1 = 0
            if (r0 == 0) goto L36
            java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldDisplayNode> r0 = r11.shieldDisplayNodes
            if (r0 == 0) goto L30
            int r0 = r0.size()
            goto L31
        L30:
            r0 = -1
        L31:
            if (r12 >= r0) goto L34
            goto L36
        L34:
            r0 = r1
            goto L40
        L36:
            java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldDisplayNode> r0 = r11.shieldDisplayNodes
            if (r0 == 0) goto L34
            java.lang.Object r0 = r0.get(r12)
            com.dianping.shield.node.cellnode.ShieldDisplayNode r0 = (com.dianping.shield.node.cellnode.ShieldDisplayNode) r0
        L40:
            if (r0 != 0) goto L54
            com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadDisplayNodeProvider r0 = r11.nodeProvider
            if (r0 == 0) goto L4a
            com.dianping.shield.node.cellnode.ShieldDisplayNode r1 = r0.getShieldDisplayNodeAtPosition(r12, r11)
        L4a:
            r0 = r1
            if (r0 == 0) goto L54
            java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldDisplayNode> r1 = r11.shieldDisplayNodes
            if (r1 == 0) goto L54
            r1.set(r12, r0)
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.cellnode.ShieldRow.getDisplayNodeAtPosition(int):com.dianping.shield.node.cellnode.ShieldDisplayNode");
    }

    private final void dispatchAttachStatusChanged(AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cd36dfaf9e7e66280b265198ca4b5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cd36dfaf9e7e66280b265198ca4b5e4");
            return;
        }
        ArrayList<AttachStatusChangeListener<ShieldRow>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((AttachStatusChangeListener) it.next()).onAttachStatusChanged(appearanceDispatchData);
            }
        }
    }

    private final void dispatchAppearanceEvent(AppearanceEvent appearanceEvent, AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c005e069e063615f1a5bde943c55a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c005e069e063615f1a5bde943c55a5");
            return;
        }
        ArrayList<MoveStatusEventListener<ShieldRow>> arrayList = this.moveStatusEventListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                MoveStatusEventListener moveStatusEventListener = (MoveStatusEventListener) it.next();
                if (appearanceEvent != null) {
                    switch (WhenMappings.$EnumSwitchMapping$0[appearanceEvent.ordinal()]) {
                        case 1:
                        case 2:
                            moveStatusEventListener.onAppeared(appearanceEvent, appearanceDispatchData);
                            continue;
                        case 3:
                        case 4:
                            moveStatusEventListener.onDisappeared(appearanceEvent, appearanceDispatchData);
                            continue;
                    }
                }
            }
        }
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public int getEntryCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb497e5bb82e6cf2f5fcd452a714ad64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb497e5bb82e6cf2f5fcd452a714ad64")).intValue();
        }
        ArrayList<ShieldDisplayNode> arrayList = this.shieldDisplayNodes;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.expose.EntrySetHolder
    @Nullable
    public ShieldDisplayNode getEntry(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f6226077474414fc0d69257bfd0c9b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f6226077474414fc0d69257bfd0c9b6");
        }
        ArrayList<ShieldDisplayNode> arrayList = this.shieldDisplayNodes;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        return null;
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public void onAttachStateChanged(@NotNull AppearanceDispatchData<EntrySetHolder<ShieldDisplayNode>> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f804e4305c6bf2d496616c920ef1e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f804e4305c6bf2d496616c920ef1e6a");
            return;
        }
        h.b(appearanceDispatchData, "data");
        dispatchAttachStatusChanged(appearanceDispatchData);
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public void onAppearanceEvent(@Nullable AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<EntrySetHolder<ShieldDisplayNode>> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aae18a99e8e2a0a0ef28f87c54aacfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aae18a99e8e2a0a0ef28f87c54aacfac");
            return;
        }
        h.b(appearanceDispatchData, "data");
        dispatchAppearanceEvent(appearanceEvent, appearanceDispatchData);
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8790fe72438927302dc78cfa695baffa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8790fe72438927302dc78cfa695baffa")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldRow");
        }
        RowItem rowItem = this.rowItem;
        if (rowItem == null) {
            h.a("rowItem");
        }
        RowItem rowItem2 = ((ShieldRow) obj).rowItem;
        if (rowItem2 == null) {
            h.a("rowItem");
        }
        return !(h.a(rowItem, rowItem2) ^ true);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4e275ac8e161952c25430c02efd98f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4e275ac8e161952c25430c02efd98f")).intValue();
        }
        RowItem rowItem = this.rowItem;
        if (rowItem == null) {
            h.a("rowItem");
        }
        return rowItem.hashCode();
    }

    public final void setPath(@Nullable NodePath nodePath) {
        this.path = nodePath;
    }

    @Nullable
    public final NodePath getPath() {
        ShieldViewCell shieldViewCell;
        ShieldViewCell shieldViewCell2;
        ShieldCellGroup shieldCellGroup;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70de27f552818686275460e0b06f734c", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodePath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70de27f552818686275460e0b06f734c");
        }
        if (this.path == null) {
            NodePath nodePath = new NodePath();
            ShieldSection shieldSection = this.sectionParent;
            nodePath.group = (shieldSection == null || (shieldViewCell2 = shieldSection.cellParent) == null || (shieldCellGroup = shieldViewCell2.groupParent) == null) ? -1 : shieldCellGroup.groupIndex;
            ShieldSection shieldSection2 = this.sectionParent;
            nodePath.cell = (shieldSection2 == null || (shieldViewCell = shieldSection2.cellParent) == null) ? -1 : shieldViewCell.viewCellIndex;
            ShieldSection shieldSection3 = this.sectionParent;
            nodePath.section = shieldSection3 != null ? shieldSection3.currentSectionIndex() : -1;
            nodePath.row = currentRowIndex();
            nodePath.cellType = this.cellType;
            this.path = nodePath;
            r rVar = r.a;
        }
        NodePath nodePath2 = this.path;
        if (nodePath2 != null) {
            nodePath2.indexPath = getIndexPath();
        }
        return this.path;
    }

    @NotNull
    public IndexPath getIndexPath() {
        SectionItem sectionItem;
        Integer num;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fc4a789673ef4bc40bbd66cad029804", RobustBitConfig.DEFAULT_VALUE)) {
            return (IndexPath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fc4a789673ef4bc40bbd66cad029804");
        }
        IndexPath indexPath = new IndexPath();
        ShieldSection shieldSection = this.sectionParent;
        indexPath.section = (shieldSection == null || (sectionItem = shieldSection.getSectionItem()) == null || (num = sectionItem.sectionIndex) == null) ? -1 : num.intValue();
        RowItem rowItem = this.rowItem;
        if (rowItem == null) {
            h.a("rowItem");
        }
        Integer num2 = rowItem.rowIndex;
        indexPath.row = num2 != null ? num2.intValue() : -3;
        return indexPath;
    }
}
