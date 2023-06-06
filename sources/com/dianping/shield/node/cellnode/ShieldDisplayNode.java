package com.dianping.shield.node.cellnode;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.adapter.DisplayNodeContainer;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.adapter.hotzone.HotZone;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewLongClickCallbackWithData;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.itemcallbacks.ViewRecycledCallback;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.ShieldObjectsUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.properties.a;
import kotlin.properties.b;
import kotlin.properties.c;
import kotlin.r;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 p2\u00020\u0001:\u0001pB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020\u001e2\b\u0010V\u001a\u0004\u0018\u00010\u0001J\u001a\u0010W\u001a\u0004\u0018\u00010G2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010X\u001a\u0004\u0018\u00010YJ\u0006\u0010Z\u001a\u00020\u0013J\u001a\u0010[\u001a\u00020\u001e2\b\u0010\\\u001a\u0004\u0018\u00010\u00002\b\u0010]\u001a\u0004\u0018\u00010\u0000J\u0013\u0010[\u001a\u00020\u001e2\b\u0010^\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010_\u001a\u00020`J\b\u0010a\u001a\u0004\u0018\u00010?J\b\u0010b\u001a\u00020\u0013H\u0016J\u0006\u0010c\u001a\u00020\u001eJ\u0014\u0010d\u001a\u00020T2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000fJ\u0014\u0010g\u001a\u00020T2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000fJ\u0006\u0010h\u001a\u00020TJ\u0016\u0010i\u001a\u00020T2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mJ\u0010\u0010n\u001a\u00020\u001e2\b\u0010V\u001a\u0004\u0018\u00010\u0001J\u0006\u0010o\u001a\u00020TR&\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\b\u0018\u00010\u0004j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\b\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R2\u0010#\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000$\u0018\u00010\u0004j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000$\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u0004\u0018\u00010(8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00106\u001a\u0004\u0018\u0001078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010@\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010A\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010B\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010C\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010D\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010E\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010F\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020IX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010Q8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "", "()V", "attachDetachInterfaceArrayList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ViewAttachDetachInterface;", "Lkotlin/collections/ArrayList;", "attachStatusChangeListenerList", "Lcom/dianping/shield/node/cellnode/AttachStatusChangeListener;", "cardInfo", "Lcom/dianping/shield/node/cellnode/CardConfigInfo;", "clickCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "containerView", "Lcom/dianping/shield/node/adapter/DisplayNodeContainer;", "context", "Landroid/content/Context;", "data", "dataHash", "", "Ljava/lang/Integer;", "dividerInfo", "Lcom/dianping/shield/node/cellnode/DividerConfigInfo;", "hotZoneList", "Lcom/dianping/shield/node/adapter/hotzone/HotZone;", "innerBottomInfo", "Lcom/dianping/shield/node/cellnode/InnerBottomInfo;", "innerTopInfo", "Lcom/dianping/shield/node/cellnode/InnerTopInfo;", "isStaggeredGridFirstRow", "", "isStaggeredGridLastRow", "isUpdate", "longClickCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewLongClickCallbackWithData;", "moveStatusEventListenerList", "Lcom/dianping/shield/node/cellnode/MoveStatusEventListener;", "pHolder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "getPath", "()Lcom/dianping/shield/node/cellnode/NodePath;", "setPath", "(Lcom/dianping/shield/node/cellnode/NodePath;)V", "<set-?>", "Lcom/dianping/shield/node/PositionType;", "positionType", "getPositionType", "()Lcom/dianping/shield/node/PositionType;", "setPositionType", "(Lcom/dianping/shield/node/PositionType;)V", "positionType$delegate", "Lkotlin/properties/ReadWriteProperty;", "reuseInfo", "Lcom/dianping/shield/node/cellnode/ReuseInfo;", "getReuseInfo", "()Lcom/dianping/shield/node/cellnode/ReuseInfo;", "setReuseInfo", "(Lcom/dianping/shield/node/cellnode/ReuseInfo;)V", "rowParent", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "stableid", "", "staggeredGridBottomMargin", "staggeredGridLeftMargin", "staggeredGridRightMargin", "staggeredGridTopMargin", "staggeredGridXGap", "staggeredGridYGap", "viewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "viewPaintingCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "viewRecycledCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewRecycledCallback;", DMKeys.KEY_VIEW_TYPE, KNBConfig.CONFIG_CLEAR_CACHE, "", "contentsEquals", "o", "createNodeView", "parent", "Landroid/view/ViewGroup;", "currentNodeIndex", "equals", "o1", "o2", "other", "getIndexPath", "Lcom/dianping/shield/entity/IndexPath;", "getViewTypeWithTopInfo", "hashCode", "isUnique", "onAttachStatusChange", "dispatchData", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "onMoveStatusEventChange", "onNodeRecycled", "onPrefetchStatusChanged", "attachStatus", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "same", "updateNodeView", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldDisplayNode {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new m(u.a(ShieldDisplayNode.class), "positionType", "getPositionType()Lcom/dianping/shield/node/PositionType;"))};
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ArrayList<ViewAttachDetachInterface> attachDetachInterfaceArrayList;
    @JvmField
    @Nullable
    public ArrayList<AttachStatusChangeListener<ShieldDisplayNode>> attachStatusChangeListenerList;
    @JvmField
    @Nullable
    public CardConfigInfo cardInfo;
    @JvmField
    @Nullable
    public ViewClickCallbackWithData clickCallback;
    @JvmField
    @Nullable
    public DisplayNodeContainer containerView;
    @JvmField
    @Nullable
    public Context context;
    @JvmField
    @Nullable
    public Object data;
    @JvmField
    @Nullable
    public Integer dataHash;
    @JvmField
    @Nullable
    public DividerConfigInfo dividerInfo;
    @JvmField
    @Nullable
    public ArrayList<HotZone> hotZoneList;
    @JvmField
    @Nullable
    public InnerBottomInfo innerBottomInfo;
    @JvmField
    @Nullable
    public InnerTopInfo innerTopInfo;
    @JvmField
    public boolean isStaggeredGridFirstRow;
    @JvmField
    public boolean isStaggeredGridLastRow;
    @JvmField
    public boolean isUpdate;
    @JvmField
    @Nullable
    public ViewLongClickCallbackWithData longClickCallback;
    @JvmField
    @Nullable
    public ArrayList<MoveStatusEventListener<ShieldDisplayNode>> moveStatusEventListenerList;
    @JvmField
    @Nullable
    public ProcessorHolder pHolder;
    @Nullable
    private NodePath path;
    @NotNull
    private final c positionType$delegate;
    @Nullable
    private ReuseInfo reuseInfo;
    @JvmField
    @Nullable
    public ShieldRow rowParent;
    @JvmField
    @Nullable
    public String stableid;
    @JvmField
    @Nullable
    public Integer staggeredGridBottomMargin;
    @JvmField
    @Nullable
    public Integer staggeredGridLeftMargin;
    @JvmField
    @Nullable
    public Integer staggeredGridRightMargin;
    @JvmField
    @Nullable
    public Integer staggeredGridTopMargin;
    @JvmField
    @Nullable
    public Integer staggeredGridXGap;
    @JvmField
    @Nullable
    public Integer staggeredGridYGap;
    @JvmField
    @Nullable
    public ShieldViewHolder viewHolder;
    @NotNull
    public ViewItem viewItem;
    @JvmField
    @Nullable
    public ViewPaintingCallback<?> viewPaintingCallback;
    @JvmField
    @Nullable
    public ViewRecycledCallback<?> viewRecycledCallback;
    @JvmField
    @Nullable
    public String viewType;

    @JvmStatic
    public static final boolean contentsEquals(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
        Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "731bac7fadc4439f22d61ae6502c18a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "731bac7fadc4439f22d61ae6502c18a9")).booleanValue() : Companion.contentsEquals(shieldDisplayNode, shieldDisplayNode2);
    }

    @JvmStatic
    public static final boolean dataEquals(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
        Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6611d696501a17876224ad8aa06f7f14", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6611d696501a17876224ad8aa06f7f14")).booleanValue() : Companion.dataEquals(shieldDisplayNode, shieldDisplayNode2);
    }

    @JvmStatic
    public static final boolean same(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
        Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a89d81ce516ca8e0705f4ddef739f1e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a89d81ce516ca8e0705f4ddef739f1e")).booleanValue() : Companion.same(shieldDisplayNode, shieldDisplayNode2);
    }

    @NotNull
    public final PositionType getPositionType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PositionType) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1304855d716e59a0f371a4d4543ada7e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1304855d716e59a0f371a4d4543ada7e") : this.positionType$delegate.getValue(this, $$delegatedProperties[0]));
    }

    public final void setPositionType(@NotNull PositionType positionType) {
        Object[] objArr = {positionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91f78e43a83a3de36f35e4f604567de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91f78e43a83a3de36f35e4f604567de5");
            return;
        }
        h.b(positionType, "<set-?>");
        this.positionType$delegate.setValue(this, $$delegatedProperties[0], positionType);
    }

    public ShieldDisplayNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "958d51b2559dc912f4d61a3d273caf3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "958d51b2559dc912f4d61a3d273caf3e");
            return;
        }
        a aVar = a.a;
        final PositionType positionType = PositionType.UNKNOWN;
        this.positionType$delegate = new b<PositionType>(positionType) { // from class: com.dianping.shield.node.cellnode.ShieldDisplayNode$$special$$inlined$observable$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // kotlin.properties.b
            public final void afterChange(@NotNull i<?> iVar, PositionType positionType2, PositionType positionType3) {
                ProcessorHolder processorHolder;
                Object[] objArr2 = {iVar, positionType2, positionType3};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc94b02f62e93a3c98ea845ddf1b920a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc94b02f62e93a3c98ea845ddf1b920a");
                    return;
                }
                h.b(iVar, "property");
                if (positionType3 == positionType2 || (processorHolder = this.pHolder) == null) {
                    return;
                }
                NodeCreator.Companion.repackDisplayNodeWithPositionType(this, processorHolder);
                this.isUpdate = true;
            }
        };
    }

    public final void setReuseInfo(@Nullable ReuseInfo reuseInfo) {
        this.reuseInfo = reuseInfo;
    }

    @Nullable
    public final ReuseInfo getReuseInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "304fcb24b1529c68df22de1ad3258d64", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReuseInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "304fcb24b1529c68df22de1ad3258d64");
        }
        ReuseInfo reuseInfo = this.reuseInfo;
        if (reuseInfo == null || reuseInfo == null) {
            reuseInfo = new ReuseInfo();
        }
        reuseInfo.rowParent = this.rowParent;
        reuseInfo.context = this.context;
        reuseInfo.viewType = this.viewType;
        reuseInfo.stableid = this.stableid;
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        reuseInfo.viewItem = viewItem;
        reuseInfo.viewPaintingCallback = this.viewPaintingCallback;
        this.reuseInfo = reuseInfo;
        return this.reuseInfo;
    }

    @NotNull
    public final ViewItem getViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2333754917891a4eb93d5a12a10820f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2333754917891a4eb93d5a12a10820f8");
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        return viewItem;
    }

    public final void setViewItem(@NotNull ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dca28140f3bb71c61001ac7adfa6bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dca28140f3bb71c61001ac7adfa6bc2");
            return;
        }
        h.b(viewItem, "<set-?>");
        this.viewItem = viewItem;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60482aedde392bfa436750631cc8b6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60482aedde392bfa436750631cc8b6de");
            return;
        }
        this.rowParent = null;
        this.viewType = null;
        this.stableid = null;
        this.data = null;
        this.dataHash = null;
        this.staggeredGridXGap = null;
        this.staggeredGridYGap = null;
        this.staggeredGridLeftMargin = null;
        this.staggeredGridRightMargin = null;
        this.staggeredGridTopMargin = null;
        this.isStaggeredGridFirstRow = false;
        this.isStaggeredGridLastRow = false;
        this.context = null;
        this.viewPaintingCallback = null;
        this.viewRecycledCallback = null;
        this.clickCallback = null;
        this.longClickCallback = null;
        this.dividerInfo = null;
        this.cardInfo = null;
        setPositionType(PositionType.UNKNOWN);
        this.innerTopInfo = null;
        this.innerBottomInfo = null;
        this.reuseInfo = null;
        this.path = null;
        this.containerView = null;
        this.viewHolder = null;
        this.pHolder = null;
    }

    public final int currentNodeIndex() {
        ArrayList<ShieldDisplayNode> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9edc9f9c8cb1f554306359f9661f3020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9edc9f9c8cb1f554306359f9661f3020")).intValue();
        }
        ShieldRow shieldRow = this.rowParent;
        if (shieldRow == null || (arrayList = shieldRow.shieldDisplayNodes) == null) {
            return -1;
        }
        return arrayList.indexOf(this);
    }

    public final void setPath(@Nullable NodePath nodePath) {
        this.path = nodePath;
    }

    @Nullable
    public final NodePath getPath() {
        NodePath path;
        NodePath path2;
        NodePath path3;
        NodePath path4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fa47b2af63f34a20ccaaeda1d2c69f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodePath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fa47b2af63f34a20ccaaeda1d2c69f0");
        }
        if (this.path == null) {
            NodePath nodePath = new NodePath();
            ShieldRow shieldRow = this.rowParent;
            int i = -1;
            nodePath.group = (shieldRow == null || (path4 = shieldRow.getPath()) == null) ? -1 : path4.group;
            ShieldRow shieldRow2 = this.rowParent;
            nodePath.cell = (shieldRow2 == null || (path3 = shieldRow2.getPath()) == null) ? -1 : path3.cell;
            ShieldRow shieldRow3 = this.rowParent;
            if (shieldRow3 != null && (path2 = shieldRow3.getPath()) != null) {
                i = path2.section;
            }
            nodePath.section = i;
            ShieldRow shieldRow4 = this.rowParent;
            nodePath.row = (shieldRow4 == null || (path = shieldRow4.getPath()) == null) ? -3 : path.row;
            nodePath.node = currentNodeIndex();
            ShieldRow shieldRow5 = this.rowParent;
            nodePath.cellType = shieldRow5 != null ? shieldRow5.cellType : null;
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
    public final IndexPath getIndexPath() {
        RowItem rowItem;
        Integer num;
        ShieldSection shieldSection;
        SectionItem sectionItem;
        Integer num2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e23ae3fe3e6e89147c85533d032542", RobustBitConfig.DEFAULT_VALUE)) {
            return (IndexPath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e23ae3fe3e6e89147c85533d032542");
        }
        IndexPath indexPath = new IndexPath();
        ShieldRow shieldRow = this.rowParent;
        indexPath.section = (shieldRow == null || (shieldSection = shieldRow.sectionParent) == null || (sectionItem = shieldSection.getSectionItem()) == null || (num2 = sectionItem.sectionIndex) == null) ? -1 : num2.intValue();
        ShieldRow shieldRow2 = this.rowParent;
        indexPath.row = (shieldRow2 == null || (rowItem = shieldRow2.getRowItem()) == null || (num = rowItem.rowIndex) == null) ? -3 : num.intValue();
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        Integer num3 = viewItem.viewIndex;
        indexPath.index = num3 != null ? num3.intValue() : -3;
        return indexPath;
    }

    public final boolean isUnique() {
        return (this.innerTopInfo == null && this.innerBottomInfo == null) ? false : true;
    }

    @Nullable
    public final String getViewTypeWithTopInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67f325481db6309fbb51c35bf4a445f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67f325481db6309fbb51c35bf4a445f7");
        }
        if (isUnique()) {
            return null;
        }
        return this.viewType;
    }

    public final boolean equals(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
        Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7985c7a0d4fe41293aa155cc228dbd3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7985c7a0d4fe41293aa155cc228dbd3c")).booleanValue() : shieldDisplayNode == shieldDisplayNode2 || !(shieldDisplayNode == null || shieldDisplayNode2 == null || !h.a(shieldDisplayNode, shieldDisplayNode2));
    }

    public final boolean same(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c99c80e946477edf3841533f2ab8905d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c99c80e946477edf3841533f2ab8905d")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || (!h.a(getClass(), obj.getClass()))) {
            return false;
        }
        ShieldDisplayNode shieldDisplayNode = (ShieldDisplayNode) obj;
        return ShieldObjectsUtils.equals(this.stableid, shieldDisplayNode.stableid) || (this.viewType != null && ShieldObjectsUtils.equals(this.viewType, shieldDisplayNode.viewType) && ShieldObjectsUtils.equals(this.viewPaintingCallback, shieldDisplayNode.viewPaintingCallback));
    }

    public final boolean contentsEquals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abc83f6513b2d671583afc7ee43e6e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abc83f6513b2d671583afc7ee43e6e0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || (!h.a(getClass(), obj.getClass()))) {
            return false;
        }
        ShieldDisplayNode shieldDisplayNode = (ShieldDisplayNode) obj;
        return this.viewType != null && ShieldObjectsUtils.equals(this.viewType, shieldDisplayNode.viewType) && ShieldObjectsUtils.equals(this.viewPaintingCallback, shieldDisplayNode.viewPaintingCallback) && ShieldObjectsUtils.equals(this.stableid, shieldDisplayNode.stableid) && this.data != null && ShieldObjectsUtils.equals(this.data, shieldDisplayNode.data) && ShieldObjectsUtils.equals(this.dividerInfo, shieldDisplayNode.dividerInfo) && ShieldObjectsUtils.equals(this.cardInfo, shieldDisplayNode.cardInfo) && ShieldObjectsUtils.equals(this.innerTopInfo, shieldDisplayNode.innerTopInfo) && h.a(getPath(), shieldDisplayNode.getPath());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldDisplayNode$Companion;", "", "()V", "contentsEquals", "", "o1", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "o2", "dataEquals", "same", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        public final boolean same(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
            Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75ec88e943cd491b0d0e3c61d29c5ba8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75ec88e943cd491b0d0e3c61d29c5ba8")).booleanValue() : shieldDisplayNode == shieldDisplayNode2 || !(shieldDisplayNode == null || shieldDisplayNode2 == null || !shieldDisplayNode.same(shieldDisplayNode2));
        }

        @JvmStatic
        public final boolean contentsEquals(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
            Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c683c8f9472288cd92b04659ee70f46d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c683c8f9472288cd92b04659ee70f46d")).booleanValue() : shieldDisplayNode == shieldDisplayNode2 || !(shieldDisplayNode == null || shieldDisplayNode2 == null || !shieldDisplayNode.contentsEquals(shieldDisplayNode2));
        }

        @JvmStatic
        public final boolean dataEquals(@Nullable ShieldDisplayNode shieldDisplayNode, @Nullable ShieldDisplayNode shieldDisplayNode2) {
            Object obj;
            Object[] objArr = {shieldDisplayNode, shieldDisplayNode2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e083871d91d1a7c76f2828ae462ee44", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e083871d91d1a7c76f2828ae462ee44")).booleanValue();
            }
            if (shieldDisplayNode != null && shieldDisplayNode.equals(shieldDisplayNode2) && (obj = shieldDisplayNode.data) != null) {
                if (obj.equals(shieldDisplayNode2 != null ? shieldDisplayNode2.data : null)) {
                    if (h.a(shieldDisplayNode.dataHash, shieldDisplayNode2 != null ? shieldDisplayNode2.dataHash : null)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ShieldViewHolder createNodeView(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        View view;
        View view2;
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c234d500ac9263d32aabb9d6da2ba12", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c234d500ac9263d32aabb9d6da2ba12");
        }
        h.b(context, "context");
        ViewPaintingCallback<?> viewPaintingCallback = this.viewPaintingCallback;
        this.viewHolder = viewPaintingCallback != null ? viewPaintingCallback.createViewHolder(context, viewGroup, this.viewType) : null;
        DisplayNodeContainer displayNodeContainer = new DisplayNodeContainer(context);
        ShieldViewHolder shieldViewHolder = this.viewHolder;
        if (((shieldViewHolder == null || (view2 = shieldViewHolder.itemView) == null) ? null : view2.getParent()) instanceof ViewGroup) {
            ShieldViewHolder shieldViewHolder2 = this.viewHolder;
            ViewParent parent = (shieldViewHolder2 == null || (view = shieldViewHolder2.itemView) == null) ? null : view.getParent();
            if (parent == null) {
                throw new o("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            ShieldViewHolder shieldViewHolder3 = this.viewHolder;
            viewGroup2.removeView(shieldViewHolder3 != null ? shieldViewHolder3.itemView : null);
        }
        displayNodeContainer.setViewHolder(this.viewHolder);
        displayNodeContainer.setNode(this);
        this.containerView = displayNodeContainer;
        return this.viewHolder;
    }

    public final void updateNodeView() {
        ViewPaintingCallback<?> viewPaintingCallback;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86ea48a6903c6c94d9870cf73653a5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86ea48a6903c6c94d9870cf73653a5c8");
            return;
        }
        ShieldViewHolder shieldViewHolder = this.viewHolder;
        if (shieldViewHolder == null || (viewPaintingCallback = this.viewPaintingCallback) == null) {
            return;
        }
        viewPaintingCallback.bindViewHolder(shieldViewHolder, this, getPath());
    }

    public final void onNodeRecycled() {
        ShieldViewHolder shieldViewHolder;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "448d896dcf7bf25b19537e227fae68e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "448d896dcf7bf25b19537e227fae68e3");
            return;
        }
        ViewRecycledCallback<?> viewRecycledCallback = this.viewRecycledCallback;
        if (viewRecycledCallback == null || (shieldViewHolder = this.viewHolder) == null) {
            return;
        }
        viewRecycledCallback.onViewRecycled(shieldViewHolder, getPath());
    }

    public final void onMoveStatusEventChange(@NotNull AppearanceDispatchData<ShieldDisplayNode> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d92212ef105b943fcad5eb11ca6fda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d92212ef105b943fcad5eb11ca6fda2");
            return;
        }
        h.b(appearanceDispatchData, "dispatchData");
        ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList = this.moveStatusEventListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                MoveStatusEventListener moveStatusEventListener = (MoveStatusEventListener) it.next();
                AppearanceEvent[] parseFromAttachStatus = AppearanceEvent.parseFromAttachStatus(appearanceDispatchData.oldStatus, appearanceDispatchData.newStatus);
                if (parseFromAttachStatus != null) {
                    for (AppearanceEvent appearanceEvent : parseFromAttachStatus) {
                        if (appearanceEvent == AppearanceEvent.PARTLY_APPEAR || appearanceEvent == AppearanceEvent.FULLY_APPEAR) {
                            moveStatusEventListener.onAppeared(appearanceEvent, appearanceDispatchData);
                        } else {
                            moveStatusEventListener.onDisappeared(appearanceEvent, appearanceDispatchData);
                        }
                    }
                }
            }
        }
    }

    public final void onAttachStatusChange(@NotNull AppearanceDispatchData<ShieldDisplayNode> appearanceDispatchData) {
        Object[] objArr = {appearanceDispatchData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b899b89b799667a199ec6595a68339d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b899b89b799667a199ec6595a68339d0");
            return;
        }
        h.b(appearanceDispatchData, "dispatchData");
        ArrayList<AttachStatusChangeListener<ShieldDisplayNode>> arrayList = this.attachStatusChangeListenerList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((AttachStatusChangeListener) it.next()).onAttachStatusChanged(appearanceDispatchData);
            }
        }
    }

    public final void onPrefetchStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection) {
        Object[] objArr = {attachStatus, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed423001fc5ac685c2b6a7e5550311f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed423001fc5ac685c2b6a7e5550311f");
            return;
        }
        h.b(attachStatus, "attachStatus");
        h.b(scrollDirection, "direction");
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        ViewStatusWithPrefetchListener viewStatusWithPrefetchListener = viewItem.viewStatusWithPrefetchListener;
        if (viewStatusWithPrefetchListener != null) {
            viewStatusWithPrefetchListener.onStatusChanged(attachStatus, scrollDirection, this.data);
        }
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f23b5c2a37c5643a80a30b13e737a158", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f23b5c2a37c5643a80a30b13e737a158")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldDisplayNode");
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        ViewItem viewItem2 = ((ShieldDisplayNode) obj).viewItem;
        if (viewItem2 == null) {
            h.a("viewItem");
        }
        return !(h.a(viewItem, viewItem2) ^ true);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a591b036543a91b80d31a1264d99ddaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a591b036543a91b80d31a1264d99ddaa")).intValue();
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem == null) {
            h.a("viewItem");
        }
        return viewItem.hashCode();
    }
}
