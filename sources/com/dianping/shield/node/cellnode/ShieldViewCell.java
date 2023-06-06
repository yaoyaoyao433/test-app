package com.dianping.shield.node.cellnode;

import android.graphics.drawable.Drawable;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.expose.EntrySetHolder;
import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldGAType;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.dianping.shield.utils.ShieldUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.JvmField;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010A\u001a\u00020BJ \u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000GH\u0002J\u0016\u0010H\u001a\u00020B2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000GH\u0002J\u0013\u0010J\u001a\u00020(2\b\u0010K\u001a\u0004\u0018\u00010LH\u0096\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u000203H\u0016J\b\u0010O\u001a\u000203H\u0016J\u0012\u0010P\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u000203H\u0002J\u0006\u0010Q\u001a\u000203J\b\u0010R\u001a\u000203H\u0016J\u000e\u0010S\u001a\u0002032\u0006\u0010T\u001a\u00020\u0002J\u0006\u0010U\u001a\u00020(J&\u0010V\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010E2\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010GH\u0016J\u001c\u0010W\u001a\u00020B2\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010GH\u0016R2\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018j\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u0010$\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000%\u0018\u00010\u0005j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000%\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u00101\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000203\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u00109\u001a\"\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018j\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010>8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "Lcom/dianping/shield/expose/EntrySetHolder;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "()V", "attachStatusChangeListenerList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/AttachStatusChangeListener;", "Lkotlin/collections/ArrayList;", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "getCellItem", "()Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "setCellItem", "(Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;)V", "defaultExposeInfo", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "getDefaultExposeInfo$shieldCore_release", "()Lcom/dianping/shield/node/useritem/ExposeInfo;", "exposeComputeMode", "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "exposeInfo", "groupParent", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "immediateNodeMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "Lkotlin/collections/HashMap;", "key", "", DMKeys.KEY_LOADING_MORE_STATUS, "Lcom/dianping/agentsdk/framework/CellStatus$LoadingMoreStatus;", "loadingStatus", "Lcom/dianping/agentsdk/framework/CellStatus$LoadingStatus;", "moveStatusCallback", "Lcom/dianping/shield/node/itemcallbacks/MoveStatusCallback;", "moveStatusEventListenerList", "Lcom/dianping/shield/node/cellnode/MoveStatusEventListener;", "name", "needScrollToTop", "", "nextLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Next;", "owner", "Lcom/dianping/agentsdk/framework/AgentInterface;", "previousLinkType", "Lcom/dianping/agentsdk/framework/LinkType$Previous;", "rangeAppearStateManager", "Lcom/dianping/shield/expose/RangeAppearStateManager;", "recyclerViewTypeSizeMap", "", "", "sectionFooterDrawable", "Landroid/graphics/drawable/Drawable;", "sectionFooterHeight", "sectionHeaderDrawable", "sectionHeaderHeight", "sectionMap", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldFloatViewNode", "Lcom/dianping/shield/node/cellnode/ShieldFloatViewDisplayNode;", "shieldSections", "Lcom/dianping/shield/utils/RangeRemoveableArrayList;", "shouldShow", "viewCellIndex", KNBConfig.CONFIG_CLEAR_CACHE, "", "dispatchAppearanceEvent", "appearanceEvent", "Lcom/dianping/shield/node/cellnode/AppearanceEvent;", "dispatchData", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "dispatchAttachStatusChanged", "data", "equals", "other", "", "getEntry", "position", "getEntryCount", "getShieldSection", "getViewCellTotalRange", "hashCode", "indexOfShieldSection", "shieldSection", DMKeys.KEY_IS_EMPTY, "onAppearanceEvent", "onAttachStateChanged", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldViewCell implements EntrySetHolder<ShieldSection> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ArrayList<AttachStatusChangeListener<ShieldViewCell>> attachStatusChangeListenerList;
    @NotNull
    public ShieldSectionCellItem cellItem;
    @NotNull
    private final ExposeInfo defaultExposeInfo;
    @JvmField
    @Nullable
    public f.a exposeComputeMode;
    @JvmField
    @Nullable
    public ExposeInfo exposeInfo;
    @JvmField
    @Nullable
    public ShieldCellGroup groupParent;
    @JvmField
    @Nullable
    public HashMap<ViewItem, ShieldDisplayNode> immediateNodeMap;
    @JvmField
    @Nullable
    public String key;
    @JvmField
    @Nullable
    public l.a loadingMoreStatus;
    @JvmField
    @Nullable
    public l.b loadingStatus;
    @JvmField
    @Nullable
    public MoveStatusCallback moveStatusCallback;
    @JvmField
    @Nullable
    public ArrayList<MoveStatusEventListener<ShieldViewCell>> moveStatusEventListenerList;
    @JvmField
    @Nullable
    public String name;
    @JvmField
    public boolean needScrollToTop;
    @JvmField
    @Nullable
    public z.a nextLinkType;
    @JvmField
    @Nullable
    public AgentInterface owner;
    @JvmField
    @Nullable
    public z.b previousLinkType;
    @JvmField
    @NotNull
    public RangeAppearStateManager<ShieldSection> rangeAppearStateManager;
    @JvmField
    @Nullable
    public Map<String, Integer> recyclerViewTypeSizeMap;
    @JvmField
    @Nullable
    public Drawable sectionFooterDrawable;
    @JvmField
    public int sectionFooterHeight;
    @JvmField
    @Nullable
    public Drawable sectionHeaderDrawable;
    @JvmField
    public int sectionHeaderHeight;
    @JvmField
    @Nullable
    public HashMap<SectionItem, ShieldSection> sectionMap;
    @JvmField
    @Nullable
    public ShieldFloatViewDisplayNode shieldFloatViewNode;
    @JvmField
    @Nullable
    public RangeRemoveableArrayList<ShieldSection> shieldSections;
    @JvmField
    public boolean shouldShow;
    @JvmField
    public int viewCellIndex;

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

    public ShieldViewCell() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a40a4701cbfeb3aa57d68b3db08a522", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a40a4701cbfeb3aa57d68b3db08a522");
            return;
        }
        this.shouldShow = true;
        this.sectionHeaderHeight = -1;
        this.sectionFooterHeight = -1;
        ExposeInfo exposeInfo = new ExposeInfo();
        exposeInfo.setIdentifier$shieldCore_release(1);
        exposeInfo.maxExposeCount = 1;
        exposeInfo.exposeScope = ExposeScope.PX;
        exposeInfo.agentExposeCallback = new ExposeCallback() { // from class: com.dianping.shield.node.cellnode.ShieldViewCell$$special$$inlined$apply$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ExposeCallback
            public final void onExpose(@Nullable Object obj, int i, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                ShieldGAInfo shieldGAInfo;
                ShieldGAType type;
                Object[] objArr2 = {obj, Integer.valueOf(i), nodePath, viewExtraInfo};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d150114b5d5b0b0faa21d49dd2fee327", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d150114b5d5b0b0faa21d49dd2fee327");
                    return;
                }
                String formatBusiness = ShieldMonitorUtil.Companion.formatBusiness(ShieldUtils.getHostKey(ShieldViewCell.this.owner));
                String formatModuleKey = ShieldMonitorUtil.Companion.formatModuleKey(ShieldViewCell.this.key);
                ShieldMetricsData addTag = ShieldMetricsData.Companion.obtain().addValues(ShieldMonitorKey.MFModuleView, h.a(Float.valueOf(1.0f))).addTag(ShieldMonitorKey.TAG_BUSINESS, formatBusiness);
                AgentInterface agentInterface = ShieldViewCell.this.owner;
                String str = null;
                if (!(agentInterface instanceof ShieldGAInterface)) {
                    agentInterface = null;
                }
                ShieldGAInterface shieldGAInterface = (ShieldGAInterface) agentInterface;
                if (shieldGAInterface != null && (shieldGAInfo = shieldGAInterface.getShieldGAInfo()) != null && (type = shieldGAInfo.getType()) != null) {
                    str = type.getType();
                }
                addTag.addTag("type", str).addTag(ShieldMonitorKey.TAG_MODULE_KEY, formatModuleKey).send();
            }
        };
        this.defaultExposeInfo = exposeInfo;
        this.rangeAppearStateManager = new RangeAppearStateManager<>(this);
    }

    @NotNull
    public final ShieldSectionCellItem getCellItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "020542dcdf383b3d3534ca1b6e98c441", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "020542dcdf383b3d3534ca1b6e98c441");
        }
        ShieldSectionCellItem shieldSectionCellItem = this.cellItem;
        if (shieldSectionCellItem == null) {
            kotlin.jvm.internal.h.a("cellItem");
        }
        return shieldSectionCellItem;
    }

    public final void setCellItem(@NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "058c922b3f27fd6ce36fb0936cd4f35d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "058c922b3f27fd6ce36fb0936cd4f35d");
            return;
        }
        kotlin.jvm.internal.h.b(shieldSectionCellItem, "<set-?>");
        this.cellItem = shieldSectionCellItem;
    }

    @NotNull
    public final ExposeInfo getDefaultExposeInfo$shieldCore_release() {
        return this.defaultExposeInfo;
    }

    private final ShieldSection getShieldSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c13a88fc24b8e37bc81abd65e41cd2f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c13a88fc24b8e37bc81abd65e41cd2f3");
        }
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = this.shieldSections;
        if (rangeRemoveableArrayList != null) {
            return rangeRemoveableArrayList.get(i);
        }
        return null;
    }

    public final int indexOfShieldSection(@NotNull ShieldSection shieldSection) {
        Object[] objArr = {shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc9f9812b3e33f81f2535df9bb1a46ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc9f9812b3e33f81f2535df9bb1a46ce")).intValue();
        }
        kotlin.jvm.internal.h.b(shieldSection, "shieldSection");
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = this.shieldSections;
        if (rangeRemoveableArrayList != null) {
            return rangeRemoveableArrayList.indexOf(shieldSection);
        }
        return -1;
    }

    private final void dispatchAttachStatusChanged(AppearanceDispatchData<ShieldViewCell> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6256adcf3402f535dbd5d0bddf142619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6256adcf3402f535dbd5d0bddf142619");
            return;
        }
        ArrayList<AttachStatusChangeListener<ShieldViewCell>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((AttachStatusChangeListener) it.next()).onAttachStatusChanged(appearanceDispatchData);
            }
        }
    }

    private final void dispatchAppearanceEvent(AppearanceEvent appearanceEvent, AppearanceDispatchData<ShieldViewCell> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0d882c1da25fe1912dc239808e27444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0d882c1da25fe1912dc239808e27444");
            return;
        }
        ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList = this.moveStatusEventListenerList;
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
    public final int getEntryCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb57acc478272295ba635014cb8046f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb57acc478272295ba635014cb8046f7")).intValue();
        }
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = this.shieldSections;
        if (rangeRemoveableArrayList != null) {
            return rangeRemoveableArrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.expose.EntrySetHolder
    @Nullable
    public final ShieldSection getEntry(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42ad73976aeb63f0e04c650bbaffd6ba", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42ad73976aeb63f0e04c650bbaffd6ba") : getShieldSection(i);
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public final void onAttachStateChanged(@NotNull AppearanceDispatchData<EntrySetHolder<ShieldSection>> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14bf53a4c07e0c8ec781326aa0efda9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14bf53a4c07e0c8ec781326aa0efda9b");
            return;
        }
        kotlin.jvm.internal.h.b(appearanceDispatchData, "data");
        dispatchAttachStatusChanged(appearanceDispatchData);
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public final void onAppearanceEvent(@Nullable AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<EntrySetHolder<ShieldSection>> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7803c1ed352cbdca07caa931916c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7803c1ed352cbdca07caa931916c93");
            return;
        }
        kotlin.jvm.internal.h.b(appearanceDispatchData, "data");
        dispatchAppearanceEvent(appearanceEvent, appearanceDispatchData);
    }

    public final int getViewCellTotalRange() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c23e3d2cf97a7457dc4c56c0ecf74bfe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c23e3d2cf97a7457dc4c56c0ecf74bfe")).intValue();
        }
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = this.shieldSections;
        if (rangeRemoveableArrayList != null) {
            for (ShieldSection shieldSection : rangeRemoveableArrayList) {
                i += shieldSection.getRange();
            }
            return i;
        }
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08d71fa4e98b92c4bd6f03c199743c0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08d71fa4e98b92c4bd6f03c199743c0f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldViewCell");
        }
        ShieldSectionCellItem shieldSectionCellItem = this.cellItem;
        if (shieldSectionCellItem == null) {
            kotlin.jvm.internal.h.a("cellItem");
        }
        ShieldSectionCellItem shieldSectionCellItem2 = ((ShieldViewCell) obj).cellItem;
        if (shieldSectionCellItem2 == null) {
            kotlin.jvm.internal.h.a("cellItem");
        }
        return !(kotlin.jvm.internal.h.a(shieldSectionCellItem, shieldSectionCellItem2) ^ true);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "809b5ee130246146cbe75104b23b09ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "809b5ee130246146cbe75104b23b09ae")).intValue();
        }
        ShieldSectionCellItem shieldSectionCellItem = this.cellItem;
        if (shieldSectionCellItem == null) {
            kotlin.jvm.internal.h.a("cellItem");
        }
        return shieldSectionCellItem.hashCode();
    }

    public final boolean isEmpty() {
        return this.cellItem == null;
    }

    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c5b15d13505cb5afb5220494e136ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c5b15d13505cb5afb5220494e136ffd");
            return;
        }
        this.owner = null;
        this.key = null;
        this.name = null;
        this.groupParent = null;
        this.viewCellIndex = 0;
        this.shouldShow = true;
        this.shieldSections = null;
        this.sectionHeaderHeight = -1;
        this.sectionHeaderDrawable = null;
        this.sectionFooterHeight = -1;
        this.sectionFooterDrawable = null;
        this.loadingStatus = null;
        this.loadingMoreStatus = null;
        this.previousLinkType = null;
        this.nextLinkType = null;
        this.exposeInfo = null;
        this.moveStatusCallback = null;
        this.needScrollToTop = false;
        this.recyclerViewTypeSizeMap = null;
        this.shieldFloatViewNode = null;
        ArrayList<AttachStatusChangeListener<ShieldViewCell>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList2 = this.moveStatusEventListenerList;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.exposeComputeMode = null;
    }
}
