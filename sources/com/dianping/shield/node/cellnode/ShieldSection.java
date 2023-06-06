package com.dianping.shield.node.cellnode;

import android.graphics.drawable.Drawable;
import com.dianping.agentsdk.framework.g;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.expose.EntrySetHolder;
import com.dianping.shield.expose.RangeAppearStateManager;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.cellnode.RangeDispatcher;
import com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.properties.a;
import kotlin.properties.b;
import kotlin.properties.c;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010Z\u001a\u00020[H\u0016J\u0018\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020_H\u0002J\u0006\u0010`\u001a\u00020\nJ \u0010a\u001a\u00020[2\b\u0010b\u001a\u0004\u0018\u00010c2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000eH\u0002J\u0016\u0010f\u001a\u00020[2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000eH\u0002J\u0013\u0010h\u001a\u00020\u001d2\b\u0010i\u001a\u0004\u0018\u00010jH\u0096\u0002J\u0012\u0010k\u001a\u0004\u0018\u00010\u00032\u0006\u0010]\u001a\u00020\nH\u0016J\b\u0010l\u001a\u00020\nH\u0016J\b\u0010m\u001a\u00020\nH\u0016J\b\u0010n\u001a\u00020\nH\u0016J\u0010\u0010o\u001a\u0004\u0018\u00010_2\u0006\u0010]\u001a\u00020\nJ\u0017\u0010p\u001a\u0004\u0018\u00010\u00032\u0006\u0010]\u001a\u00020\nH\u0000¢\u0006\u0002\bqJ\b\u0010r\u001a\u00020\nH\u0016J\u0010\u0010s\u001a\u00020[2\u0006\u0010t\u001a\u00020\nH\u0002J\u0016\u0010u\u001a\u00020[2\u0006\u0010v\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nJ\u0016\u0010x\u001a\u00020[2\u0006\u0010v\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nJ\u0016\u0010y\u001a\u00020[2\u0006\u0010v\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nJ&\u0010z\u001a\u00020[2\b\u0010b\u001a\u0004\u0018\u00010c2\u0012\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020eH\u0016J\u001c\u0010{\u001a\u00020[2\u0012\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020eH\u0016J\u0010\u0010|\u001a\u00020[2\u0006\u0010}\u001a\u00020,H\u0016J\u0018\u0010~\u001a\u00020[2\u0006\u0010t\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nH\u0002J\u0018\u0010\u007f\u001a\u00020[2\u0006\u0010t\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nH\u0002J\u0011\u0010\u0080\u0001\u001a\u00020[2\u0006\u0010}\u001a\u00020,H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR2\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000e\u0018\u00010\rj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000e\u0018\u0001`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u0012\u0010'\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u0010(\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000)\u0018\u00010\rj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000)\u0018\u0001`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0\rj\b\u0012\u0004\u0012\u00020,`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030/8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R2\u00106\u001a\"\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0003\u0018\u000107j\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0003\u0018\u0001`98\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0012\u0010@\u001a\u00020A8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020HX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010O\u001a\u00020N2\u0006\u0010M\u001a\u00020N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010V\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010Y8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "Lcom/dianping/shield/expose/EntrySetHolder;", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "()V", "adjustedNextType", "Lcom/dianping/agentsdk/framework/LinkType$Next;", "adjustedPreviousType", "Lcom/dianping/agentsdk/framework/LinkType$Previous;", "alineTopOffset", "", "Ljava/lang/Integer;", "attachStatusChangeListenerList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/AttachStatusChangeListener;", "Lkotlin/collections/ArrayList;", DMKeys.KEY_BACKGROUND_VIEW_INFO, "Lcom/dianping/agentsdk/framework/BackgroundViewInfo;", "cellParent", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "deleteAnimationType", "Lcom/dianping/shield/node/adapter/animator/AnimationType;", "getDeleteAnimationType", "()Lcom/dianping/shield/node/adapter/animator/AnimationType;", "setDeleteAnimationType", "(Lcom/dianping/shield/node/adapter/animator/AnimationType;)V", "dividerStyle", "Lcom/dianping/shield/node/useritem/DividerStyle;", "enableLayoutAnimation", "", "getEnableLayoutAnimation", "()Z", "setEnableLayoutAnimation", "(Z)V", "hasFooterCell", "hasHeaderCell", "insertAnimationType", "getInsertAnimationType", "setInsertAnimationType", "isLazyLoad", "moveStatusEventListenerList", "Lcom/dianping/shield/node/cellnode/MoveStatusEventListener;", "nextLinkType", "objectListObservers", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "previousLinkType", "rangeAppearStateManager", "Lcom/dianping/shield/expose/RangeAppearStateManager;", "rangeDispatcher", "Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "getRangeDispatcher", "()Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "rangeDispatcher$delegate", "Lkotlin/Lazy;", "rowMap", "Ljava/util/HashMap;", "Lcom/dianping/shield/node/useritem/RowItem;", "Lkotlin/collections/HashMap;", "rowProvider", "Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;", "getRowProvider", "()Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;", "setRowProvider", "(Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;)V", "sectionDividerShowType", "Lcom/dianping/shield/node/useritem/DividerStyle$ShowType;", "sectionFooterDrawable", "Landroid/graphics/drawable/Drawable;", "sectionFooterHeight", "sectionHeaderDrawable", "sectionHeaderHeight", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "getSectionItem", "()Lcom/dianping/shield/node/useritem/SectionItem;", "setSectionItem", "(Lcom/dianping/shield/node/useritem/SectionItem;)V", "<set-?>", "Lcom/dianping/shield/node/PositionType;", "sectionPositionType", "getSectionPositionType", "()Lcom/dianping/shield/node/PositionType;", "setSectionPositionType", "(Lcom/dianping/shield/node/PositionType;)V", "sectionPositionType$delegate", "Lkotlin/properties/ReadWriteProperty;", "sectionTitle", "", "shieldRows", "Lcom/dianping/shield/utils/RangeRemoveableArrayList;", KNBConfig.CONFIG_CLEAR_CACHE, "", "computeNodePositionType", "position", "node", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "currentSectionIndex", "dispatchAppearanceEvent", "appearanceEvent", "Lcom/dianping/shield/node/cellnode/AppearanceEvent;", "dispatchData", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "dispatchAttachStatusChanged", "data", "equals", "other", "", "getEntry", "getEntryCount", "getOldRange", "getRange", "getShieldDisplayNode", "getShieldRow", "getShieldRow$shieldCore_release", "hashCode", "markNodePathOutDate", "rowStartPosition", "notifyRowInsert", "startPosition", "count", "notifyRowRemove", "notifyRowUpdate", "onAppearanceEvent", "onAttachStateChanged", "registerObserver", "observer", "resetInsertNeighborNode", "resetRemovetNeighborNode", "unregisterObserver", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldSection implements EntrySetHolder<ShieldRow>, RangeHolder {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ShieldSection.class), "rangeDispatcher", "getRangeDispatcher()Lcom/dianping/shield/node/cellnode/RangeDispatcher;")), u.a(new m(u.a(ShieldSection.class), "sectionPositionType", "getSectionPositionType()Lcom/dianping/shield/node/PositionType;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public z.a adjustedNextType;
    @JvmField
    @Nullable
    public z.b adjustedPreviousType;
    @JvmField
    @Nullable
    public Integer alineTopOffset;
    @JvmField
    @Nullable
    public ArrayList<AttachStatusChangeListener<ShieldSection>> attachStatusChangeListenerList;
    @JvmField
    @Nullable
    public g backgroundViewInfo;
    @JvmField
    @Nullable
    public ShieldViewCell cellParent;
    @Nullable
    private AnimationType deleteAnimationType;
    @JvmField
    @Nullable
    public DividerStyle dividerStyle;
    private boolean enableLayoutAnimation;
    @JvmField
    public boolean hasFooterCell;
    @JvmField
    public boolean hasHeaderCell;
    @Nullable
    private AnimationType insertAnimationType;
    @JvmField
    public boolean isLazyLoad;
    @JvmField
    @Nullable
    public ArrayList<MoveStatusEventListener<ShieldSection>> moveStatusEventListenerList;
    @JvmField
    @Nullable
    public z.a nextLinkType;
    private final ArrayList<RangeChangeObserver> objectListObservers;
    @JvmField
    @Nullable
    public z.b previousLinkType;
    @JvmField
    @NotNull
    public RangeAppearStateManager<ShieldRow> rangeAppearStateManager;
    @NotNull
    private final d rangeDispatcher$delegate;
    @JvmField
    @Nullable
    public HashMap<RowItem, ShieldRow> rowMap;
    @Nullable
    private LazyLoadShieldRowProvider rowProvider;
    @JvmField
    @NotNull
    public DividerStyle.ShowType sectionDividerShowType;
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
    @NotNull
    public SectionItem sectionItem;
    @NotNull
    private final c sectionPositionType$delegate;
    @JvmField
    @Nullable
    public String sectionTitle;
    @JvmField
    @Nullable
    public RangeRemoveableArrayList<ShieldRow> shieldRows;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PositionType.FIRST.ordinal()] = 1;
            $EnumSwitchMapping$0[PositionType.MIDDLE.ordinal()] = 2;
            $EnumSwitchMapping$0[PositionType.LAST.ordinal()] = 3;
            $EnumSwitchMapping$0[PositionType.SINGLE.ordinal()] = 4;
            int[] iArr2 = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[AppearanceEvent.FULLY_APPEAR.ordinal()] = 1;
            $EnumSwitchMapping$1[AppearanceEvent.PARTLY_APPEAR.ordinal()] = 2;
            $EnumSwitchMapping$1[AppearanceEvent.FULLY_DISAPPEAR.ordinal()] = 3;
            $EnumSwitchMapping$1[AppearanceEvent.PARTLY_DISAPPEAR.ordinal()] = 4;
        }
    }

    @NotNull
    public final RangeDispatcher getRangeDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (RangeDispatcher) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "997fd046c958be27c76a42fcbb265e50", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "997fd046c958be27c76a42fcbb265e50") : this.rangeDispatcher$delegate.a());
    }

    @NotNull
    public final PositionType getSectionPositionType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PositionType) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190a14771a6e228a3a6e3ab0f205c2ca", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190a14771a6e228a3a6e3ab0f205c2ca") : this.sectionPositionType$delegate.getValue(this, $$delegatedProperties[1]));
    }

    public final void setSectionPositionType(@NotNull PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8a6db297d075838ed20f09361f51242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8a6db297d075838ed20f09361f51242");
            return;
        }
        h.b(positionType, "<set-?>");
        this.sectionPositionType$delegate.setValue(this, $$delegatedProperties[1], positionType);
    }

    public ShieldSection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995836e13547d5dacf9a1ed90ec125d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995836e13547d5dacf9a1ed90ec125d5");
            return;
        }
        this.objectListObservers = new ArrayList<>();
        this.sectionHeaderHeight = 10;
        this.sectionFooterHeight = 10;
        this.sectionDividerShowType = DividerStyle.ShowType.ALL;
        this.alineTopOffset = -1;
        this.rangeDispatcher$delegate = e.a(kotlin.i.NONE, ShieldSection$rangeDispatcher$2.INSTANCE);
        a aVar = a.a;
        final PositionType positionType = PositionType.UNKNOWN;
        this.sectionPositionType$delegate = new b<PositionType>(positionType) { // from class: com.dianping.shield.node.cellnode.ShieldSection$$special$$inlined$observable$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // kotlin.properties.b
            public final void afterChange(@NotNull i<?> iVar, PositionType positionType2, PositionType positionType3) {
                Object[] objArr2 = {iVar, positionType2, positionType3};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "683424f8dd8eb36acf7955787118963b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "683424f8dd8eb36acf7955787118963b");
                    return;
                }
                h.b(iVar, "property");
                PositionType positionType4 = positionType3;
                PositionType positionType5 = positionType2;
                if (positionType4 == positionType5 || this.getRange() <= 0) {
                    return;
                }
                if ((positionType5 == PositionType.FIRST && positionType4 == PositionType.MIDDLE) || ((positionType5 == PositionType.MIDDLE && positionType4 == PositionType.FIRST) || ((positionType5 == PositionType.LAST && positionType4 == PositionType.SINGLE) || (positionType5 == PositionType.SINGLE && positionType4 == PositionType.LAST)))) {
                    this.getShieldDisplayNode(0);
                } else if ((positionType5 == PositionType.FIRST && positionType4 == PositionType.SINGLE) || ((positionType5 == PositionType.MIDDLE && positionType4 == PositionType.LAST) || ((positionType5 == PositionType.LAST && positionType4 == PositionType.MIDDLE) || (positionType5 == PositionType.SINGLE && positionType4 == PositionType.FIRST)))) {
                    this.getShieldDisplayNode(this.getRange() - 1);
                }
            }
        };
        this.rangeAppearStateManager = new RangeAppearStateManager<>(this);
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public void registerObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d130e4ccbee7a3c07a5d0a0502522727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d130e4ccbee7a3c07a5d0a0502522727");
            return;
        }
        h.b(rangeChangeObserver, "observer");
        this.objectListObservers.add(rangeChangeObserver);
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public void unregisterObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1672c83c3f499d45d6361b4f2f87a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1672c83c3f499d45d6361b4f2f87a54");
            return;
        }
        h.b(rangeChangeObserver, "observer");
        this.objectListObservers.remove(rangeChangeObserver);
    }

    public final int currentSectionIndex() {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "199ae92b750e79eb38581aac235f61ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "199ae92b750e79eb38581aac235f61ec")).intValue();
        }
        ShieldViewCell shieldViewCell = this.cellParent;
        if (shieldViewCell == null || (rangeRemoveableArrayList = shieldViewCell.shieldSections) == null) {
            return -1;
        }
        return rangeRemoveableArrayList.indexOf(this);
    }

    @NotNull
    public final SectionItem getSectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98c36ba3c4d38d5103619d85bcf5900e", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98c36ba3c4d38d5103619d85bcf5900e");
        }
        SectionItem sectionItem = this.sectionItem;
        if (sectionItem == null) {
            h.a("sectionItem");
        }
        return sectionItem;
    }

    public final void setSectionItem(@NotNull SectionItem sectionItem) {
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31ff46358e2f07d98e517116acc8e88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31ff46358e2f07d98e517116acc8e88a");
            return;
        }
        h.b(sectionItem, "<set-?>");
        this.sectionItem = sectionItem;
    }

    @Nullable
    public final LazyLoadShieldRowProvider getRowProvider() {
        return this.rowProvider;
    }

    public final void setRowProvider(@Nullable LazyLoadShieldRowProvider lazyLoadShieldRowProvider) {
        this.rowProvider = lazyLoadShieldRowProvider;
    }

    public boolean getEnableLayoutAnimation() {
        return this.enableLayoutAnimation;
    }

    public void setEnableLayoutAnimation(boolean z) {
        this.enableLayoutAnimation = z;
    }

    @Nullable
    public AnimationType getInsertAnimationType() {
        return this.insertAnimationType;
    }

    public void setInsertAnimationType(@Nullable AnimationType animationType) {
        this.insertAnimationType = animationType;
    }

    @Nullable
    public AnimationType getDeleteAnimationType() {
        return this.deleteAnimationType;
    }

    public void setDeleteAnimationType(@Nullable AnimationType animationType) {
        this.deleteAnimationType = animationType;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c592c8aaba4126b6c06527a1894c1a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c592c8aaba4126b6c06527a1894c1a1");
            return;
        }
        this.cellParent = null;
        this.hasHeaderCell = false;
        this.hasFooterCell = false;
        this.isLazyLoad = false;
        this.rowProvider = null;
        getRangeDispatcher().setBackupRange(getRangeDispatcher().getTotalRange());
        this.shieldRows = null;
        this.sectionTitle = null;
        this.previousLinkType = null;
        this.nextLinkType = null;
        this.adjustedPreviousType = null;
        this.adjustedNextType = null;
        this.sectionHeaderHeight = 10;
        this.sectionHeaderDrawable = null;
        this.sectionFooterHeight = 10;
        this.sectionFooterDrawable = null;
        this.sectionDividerShowType = DividerStyle.ShowType.ALL;
        this.dividerStyle = null;
        this.backgroundViewInfo = null;
        this.alineTopOffset = -1;
        setEnableLayoutAnimation(false);
        setInsertAnimationType(null);
        setDeleteAnimationType(null);
        ArrayList<AttachStatusChangeListener<ShieldSection>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<MoveStatusEventListener<ShieldSection>> arrayList2 = this.moveStatusEventListenerList;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public int getRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2ccb2dc75e176d63683ec6f7a01666f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2ccb2dc75e176d63683ec6f7a01666f")).intValue() : getRangeDispatcher().getTotalRange();
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public int getOldRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424a67ea16ccc8e62315cfe90c2fc4bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424a67ea16ccc8e62315cfe90c2fc4bf")).intValue() : getRangeDispatcher().getBackupRange();
    }

    @Nullable
    public final ShieldDisplayNode getShieldDisplayNode(int i) {
        ShieldRow shieldRow;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbc15e593b7ec387fc72124fa627d6e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbc15e593b7ec387fc72124fa627d6e8");
        }
        ShieldDisplayNode shieldDisplayNode = null;
        if ((this.hasHeaderCell && i == 0) || (this.hasFooterCell && i == getRange() - 1)) {
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
            if (rangeRemoveableArrayList != null && (shieldRow = rangeRemoveableArrayList.get(i)) != null) {
                shieldDisplayNode = shieldRow.getDisplayNodeAtPosition(0);
            }
        } else {
            RangeDispatcher.RangeInfo innerPosition = getRangeDispatcher().getInnerPosition(i);
            ShieldRow shieldRow$shieldCore_release = getShieldRow$shieldCore_release(innerPosition != null ? innerPosition.index : 0);
            if (shieldRow$shieldCore_release != null) {
                shieldDisplayNode = shieldRow$shieldCore_release.getDisplayNodeAtPosition(innerPosition != null ? innerPosition.innerIndex : 0);
            }
        }
        if (shieldDisplayNode != null) {
            computeNodePositionType(i, shieldDisplayNode);
        }
        return shieldDisplayNode;
    }

    @Nullable
    public final ShieldRow getShieldRow$shieldCore_release(int i) {
        ShieldRow shieldRow;
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList == null || (shieldRow = (ShieldRow) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList, i)) == null) {
            int i2 = this.hasHeaderCell ? i - 1 : i;
            LazyLoadShieldRowProvider lazyLoadShieldRowProvider = this.rowProvider;
            shieldRow = lazyLoadShieldRowProvider != null ? lazyLoadShieldRowProvider.getShieldRow(i2, this) : null;
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = this.shieldRows;
            if (rangeRemoveableArrayList2 != null) {
                rangeRemoveableArrayList2.set(i, shieldRow);
            }
        }
        return shieldRow;
    }

    private final void computeNodePositionType(int i, ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {Integer.valueOf(i), shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0daa6ab4a2bf1cc69c6af5331ca82da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0daa6ab4a2bf1cc69c6af5331ca82da6");
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[getSectionPositionType().ordinal()]) {
            case 1:
                if (i == 0) {
                    shieldDisplayNode.setPositionType(PositionType.FIRST);
                    return;
                } else {
                    shieldDisplayNode.setPositionType(PositionType.MIDDLE);
                    return;
                }
            case 2:
                shieldDisplayNode.setPositionType(PositionType.MIDDLE);
                return;
            case 3:
                if (i == getRange() - 1) {
                    shieldDisplayNode.setPositionType(PositionType.LAST);
                    return;
                } else {
                    shieldDisplayNode.setPositionType(PositionType.MIDDLE);
                    return;
                }
            case 4:
                if (i == 0) {
                    shieldDisplayNode.setPositionType(getRange() == 1 ? PositionType.SINGLE : PositionType.FIRST);
                    return;
                }
                int range = getRange() - 1;
                if (i > 0 && range > i) {
                    shieldDisplayNode.setPositionType(PositionType.MIDDLE);
                    return;
                } else if (i == getRange() - 1) {
                    if (getRange() == 1) {
                        shieldDisplayNode.setPositionType(PositionType.SINGLE);
                        return;
                    } else {
                        shieldDisplayNode.setPositionType(PositionType.LAST);
                        return;
                    }
                } else {
                    return;
                }
            default:
                shieldDisplayNode.setPositionType(PositionType.UNKNOWN);
                return;
        }
    }

    public final void notifyRowInsert(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2af4546006e4bc94e94754d448d91588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2af4546006e4bc94e94754d448d91588");
            return;
        }
        ArrayList arrayList = new ArrayList();
        currentSectionIndex();
        int i3 = i + i2;
        int i4 = 0;
        for (int i5 = i; i5 < i3; i5++) {
            RowRangeHolder rowRangeHolder = new RowRangeHolder(0, 1, null);
            LazyLoadShieldRowProvider lazyLoadShieldRowProvider = this.rowProvider;
            rowRangeHolder.dNodeCount = lazyLoadShieldRowProvider != null ? lazyLoadShieldRowProvider.getRowNodeCount(i5, this) : 0;
            i4 += rowRangeHolder.dNodeCount;
            arrayList.add(rowRangeHolder);
        }
        if (this.hasHeaderCell) {
            i++;
        }
        getRangeDispatcher().addAll(i, arrayList);
        int startPosition = getRangeDispatcher().getStartPosition(i);
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList != null) {
            rangeRemoveableArrayList.addAll(i, kotlin.collections.b.a(new ShieldRow[i2]));
        }
        resetInsertNeighborNode(i, i2);
        markNodePathOutDate(i);
        for (RangeChangeObserver rangeChangeObserver : this.objectListObservers) {
            rangeChangeObserver.onItemRangeInserted(this, startPosition, i4);
        }
    }

    public final void notifyRowRemove(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7104f09fa2e7d825270d1640b41df349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7104f09fa2e7d825270d1640b41df349");
            return;
        }
        if (this.hasHeaderCell) {
            i++;
        }
        int i4 = i + i2;
        for (int i5 = i; i5 < i4; i5++) {
            i3 += ((RangeHolder) getRangeDispatcher().get(i5)).getRange();
        }
        int startPosition = getRangeDispatcher().getStartPosition(i);
        getRangeDispatcher().removeRange(i, i4);
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList != null) {
            rangeRemoveableArrayList.removeRange(i, i4);
        }
        resetRemovetNeighborNode(i, i2);
        markNodePathOutDate(i);
        for (RangeChangeObserver rangeChangeObserver : this.objectListObservers) {
            rangeChangeObserver.onItemRangeRemoved(this, startPosition, i3);
        }
    }

    public final void notifyRowUpdate(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c2e1e5e2a1c06a1d392f343e9abb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c2e1e5e2a1c06a1d392f343e9abb96");
            return;
        }
        if (this.hasHeaderCell) {
            i++;
        }
        int i4 = i2 + i;
        for (int i5 = i; i5 < i4; i5++) {
            i3 += ((RangeHolder) getRangeDispatcher().get(i5)).getRange();
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
            if (rangeRemoveableArrayList != null) {
                rangeRemoveableArrayList.set(i5, null);
            }
        }
        int startPosition = getRangeDispatcher().getStartPosition(i);
        for (RangeChangeObserver rangeChangeObserver : this.objectListObservers) {
            rangeChangeObserver.onItemRangeChanged(this, startPosition, i3);
        }
    }

    private final void resetInsertNeighborNode(int i, int i2) {
        ShieldRow shieldRow;
        ArrayList<ShieldDisplayNode> arrayList;
        ShieldDisplayNode shieldDisplayNode;
        ShieldRow shieldRow2;
        ArrayList<ShieldDisplayNode> arrayList2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ec3942db14c9931e3167b5f97aaa36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ec3942db14c9931e3167b5f97aaa36");
            return;
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList != null && (shieldRow2 = (ShieldRow) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList, i - 1)) != null && (arrayList2 = shieldRow2.shieldDisplayNodes) != null) {
            ArrayList<ShieldDisplayNode> arrayList3 = arrayList2;
            ArrayList<ShieldDisplayNode> arrayList4 = shieldRow2.shieldDisplayNodes;
            ShieldDisplayNode shieldDisplayNode2 = (ShieldDisplayNode) kotlin.collections.h.a((List<? extends Object>) arrayList3, arrayList4 != null ? kotlin.collections.h.a((List) arrayList4) : -1);
            if (shieldDisplayNode2 != null) {
                shieldDisplayNode2.isUpdate = false;
            }
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = this.shieldRows;
        if (rangeRemoveableArrayList2 == null || (shieldRow = (ShieldRow) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList2, i + i2)) == null || (arrayList = shieldRow.shieldDisplayNodes) == null || (shieldDisplayNode = (ShieldDisplayNode) kotlin.collections.h.a((List<? extends Object>) arrayList, 0)) == null) {
            return;
        }
        shieldDisplayNode.isUpdate = false;
    }

    private final void resetRemovetNeighborNode(int i, int i2) {
        ShieldRow shieldRow;
        ArrayList<ShieldDisplayNode> arrayList;
        ShieldDisplayNode shieldDisplayNode;
        ShieldRow shieldRow2;
        ArrayList<ShieldDisplayNode> arrayList2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d81c53332be6a8a01d23bf1dcc659fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d81c53332be6a8a01d23bf1dcc659fe");
            return;
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList != null && (shieldRow2 = (ShieldRow) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList, i - 1)) != null && (arrayList2 = shieldRow2.shieldDisplayNodes) != null) {
            ArrayList<ShieldDisplayNode> arrayList3 = arrayList2;
            ArrayList<ShieldDisplayNode> arrayList4 = shieldRow2.shieldDisplayNodes;
            ShieldDisplayNode shieldDisplayNode2 = (ShieldDisplayNode) kotlin.collections.h.a((List<? extends Object>) arrayList3, arrayList4 != null ? kotlin.collections.h.a((List) arrayList4) : -1);
            if (shieldDisplayNode2 != null) {
                shieldDisplayNode2.isUpdate = false;
            }
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = this.shieldRows;
        if (rangeRemoveableArrayList2 == null || (shieldRow = (ShieldRow) kotlin.collections.h.a((List<? extends Object>) rangeRemoveableArrayList2, i)) == null || (arrayList = shieldRow.shieldDisplayNodes) == null || (shieldDisplayNode = (ShieldDisplayNode) kotlin.collections.h.a((List<? extends Object>) arrayList, 0)) == null) {
            return;
        }
        shieldDisplayNode.isUpdate = false;
    }

    private final void markNodePathOutDate(int i) {
        ArrayList<ShieldDisplayNode> arrayList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cff047e18b72255e93ab2e6323729120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cff047e18b72255e93ab2e6323729120");
            return;
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        int a = rangeRemoveableArrayList != null ? kotlin.collections.h.a((List) rangeRemoveableArrayList) : -1;
        if (i > a) {
            return;
        }
        while (true) {
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = this.shieldRows;
            ShieldRow shieldRow = rangeRemoveableArrayList2 != null ? rangeRemoveableArrayList2.get(i) : null;
            if (shieldRow != null) {
                shieldRow.setPath(null);
            }
            if (shieldRow != null && (arrayList = shieldRow.shieldDisplayNodes) != null) {
                for (ShieldDisplayNode shieldDisplayNode : arrayList) {
                    if (shieldDisplayNode != null) {
                        shieldDisplayNode.setPath(null);
                    }
                }
            }
            if (i == a) {
                return;
            }
            i++;
        }
    }

    private final void dispatchAttachStatusChanged(AppearanceDispatchData<ShieldSection> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d725885eed38825972d47fc660cde4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d725885eed38825972d47fc660cde4");
            return;
        }
        ArrayList<AttachStatusChangeListener<ShieldSection>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((AttachStatusChangeListener) it.next()).onAttachStatusChanged(appearanceDispatchData);
            }
        }
    }

    private final void dispatchAppearanceEvent(AppearanceEvent appearanceEvent, AppearanceDispatchData<ShieldSection> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "000556eb2768d9550189db4c29cf4dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "000556eb2768d9550189db4c29cf4dfe");
            return;
        }
        ArrayList<MoveStatusEventListener<ShieldSection>> arrayList = this.moveStatusEventListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                MoveStatusEventListener moveStatusEventListener = (MoveStatusEventListener) it.next();
                if (appearanceEvent != null) {
                    switch (WhenMappings.$EnumSwitchMapping$1[appearanceEvent.ordinal()]) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f98f09b6e3b5b6a5d1b1c8a8d69247da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f98f09b6e3b5b6a5d1b1c8a8d69247da")).intValue();
        }
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = this.shieldRows;
        if (rangeRemoveableArrayList != null) {
            return rangeRemoveableArrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.expose.EntrySetHolder
    @Nullable
    public ShieldRow getEntry(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79e8430f25586a14ed21238b9ad1398c", RobustBitConfig.DEFAULT_VALUE) ? (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79e8430f25586a14ed21238b9ad1398c") : getShieldRow$shieldCore_release(i);
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public void onAttachStateChanged(@NotNull AppearanceDispatchData<EntrySetHolder<ShieldRow>> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5cff3b8fd85b7eb64151ec5555762ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5cff3b8fd85b7eb64151ec5555762ac");
            return;
        }
        h.b(appearanceDispatchData, "data");
        dispatchAttachStatusChanged(appearanceDispatchData);
    }

    @Override // com.dianping.shield.expose.EntrySetHolder
    public void onAppearanceEvent(@Nullable AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<EntrySetHolder<ShieldRow>> appearanceDispatchData) {
        Object[] objArr = {appearanceEvent, appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6805bed0142b554e0896413068bf8b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6805bed0142b554e0896413068bf8b5d");
            return;
        }
        h.b(appearanceDispatchData, "data");
        dispatchAppearanceEvent(appearanceEvent, appearanceDispatchData);
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e43d16b54fc47c4b365b8525abb813f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e43d16b54fc47c4b365b8525abb813f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldSection");
        }
        SectionItem sectionItem = this.sectionItem;
        if (sectionItem == null) {
            h.a("sectionItem");
        }
        SectionItem sectionItem2 = ((ShieldSection) obj).sectionItem;
        if (sectionItem2 == null) {
            h.a("sectionItem");
        }
        return !(h.a(sectionItem, sectionItem2) ^ true);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5816a51db311ce1e8772ebfb6ca564a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5816a51db311ce1e8772ebfb6ca564a6")).intValue();
        }
        SectionItem sectionItem = this.sectionItem;
        if (sectionItem == null) {
            h.a("sectionItem");
        }
        return sectionItem.hashCode();
    }
}
