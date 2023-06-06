package com.dianping.shield.manager;

import android.support.v7.util.c;
import com.dianping.shield.manager.ShieldSectionManager$onAttachStatusChangeListener$2;
import com.dianping.shield.manager.ShieldSectionManager$onMoveStatusEventChangeListener$2;
import com.dianping.shield.node.adapter.ListObserver;
import com.dianping.shield.node.adapter.NodeList;
import com.dianping.shield.node.adapter.NodeListDiffCallback;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.cellnode.RangeChangeObserver;
import com.dianping.shield.node.cellnode.RangeDispatcher;
import com.dianping.shield.node.cellnode.RangeHolder;
import com.dianping.shield.node.cellnode.SectionPositionTypeAdjuster;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f*\u0002\u0017\u001d\u0018\u00002\u00020\u00012\u00020\u0002:\u0002CDB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010.\u001a\u00020/H\u0016J$\u00100\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b010\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b01`\u0012H\u0016J\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204J\u001e\u00105\u001a\u0002062\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u0002040\u0010j\b\u0012\u0004\u0012\u000204`\u0012J\b\u00108\u001a\u000206H\u0002J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u0011H\u0016J\u000e\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u000eJ\u0010\u0010=\u001a\u0002062\b\u0010>\u001a\u0004\u0018\u00010*J\b\u0010?\u001a\u000206H\u0016J\b\u0010@\u001a\u000206H\u0016J\b\u0010A\u001a\u00020/H\u0016J\u0010\u0010B\u001a\u0002062\u0006\u0010:\u001a\u00020\u0011H\u0016R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0010j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00060,R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/dianping/shield/manager/ShieldSectionManager;", "Lcom/dianping/shield/node/adapter/NodeList;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "holder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "(Lcom/dianping/shield/node/processor/ProcessorHolder;)V", "displayNodeList", "Lcom/dianping/shield/utils/RangeRemoveableArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "getDisplayNodeList", "()Lcom/dianping/shield/utils/RangeRemoveableArrayList;", "setDisplayNodeList", "(Lcom/dianping/shield/utils/RangeRemoveableArrayList;)V", "hasWaterfallSection", "", "listObservables", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/ListObserver;", "Lkotlin/collections/ArrayList;", "newAnimationDisplayNodeList", "nodeListDiffCallback", "Lcom/dianping/shield/node/adapter/NodeListDiffCallback;", "onAttachStatusChangeListener", "com/dianping/shield/manager/ShieldSectionManager$onAttachStatusChangeListener$2$1", "getOnAttachStatusChangeListener", "()Lcom/dianping/shield/manager/ShieldSectionManager$onAttachStatusChangeListener$2$1;", "onAttachStatusChangeListener$delegate", "Lkotlin/Lazy;", "onMoveStatusEventChangeListener", "com/dianping/shield/manager/ShieldSectionManager$onMoveStatusEventChangeListener$2$1", "getOnMoveStatusEventChangeListener", "()Lcom/dianping/shield/manager/ShieldSectionManager$onMoveStatusEventChangeListener$2$1;", "onMoveStatusEventChangeListener$delegate", "sectionPositionTypeAdjustor", "Lcom/dianping/shield/node/cellnode/SectionPositionTypeAdjuster;", "sectionRangeDispatcher", "Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "getSectionRangeDispatcher", "()Lcom/dianping/shield/node/cellnode/RangeDispatcher;", "setSectionRangeDispatcher", "(Lcom/dianping/shield/node/cellnode/RangeDispatcher;)V", "shieldLayoutManager", "Lcom/dianping/shield/sectionrecycler/ShieldLayoutManagerInterface;", "totalRangeObserver", "Lcom/dianping/shield/manager/ShieldSectionManager$TotalRangeObserver;", "getDisplayElement", "position", "", "getEventDispatcherList", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "getSectionStartPosition", "section", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "initAllSections", "", "sections", "onItemRangeReplacedWithAnimation", "registerObserver", "observer", "setHasWaterfallSection", "hasWaterfall", "setLayoutManager", "layoutManager", "shieldPreload", "shieldRecycle", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "unregisterObserver", "NodeListUpdateCallback", "TotalRangeObserver", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSectionManager implements NodeList, ShieldPreloadInterface {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ShieldSectionManager.class), "onAttachStatusChangeListener", "getOnAttachStatusChangeListener()Lcom/dianping/shield/manager/ShieldSectionManager$onAttachStatusChangeListener$2$1;")), u.a(new s(u.a(ShieldSectionManager.class), "onMoveStatusEventChangeListener", "getOnMoveStatusEventChangeListener()Lcom/dianping/shield/manager/ShieldSectionManager$onMoveStatusEventChangeListener$2$1;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private RangeRemoveableArrayList<ShieldDisplayNode> displayNodeList;
    private boolean hasWaterfallSection;
    private final ProcessorHolder holder;
    private ArrayList<ListObserver> listObservables;
    private final ArrayList<ShieldDisplayNode> newAnimationDisplayNodeList;
    private final NodeListDiffCallback nodeListDiffCallback;
    private final d onAttachStatusChangeListener$delegate;
    private final d onMoveStatusEventChangeListener$delegate;
    private final SectionPositionTypeAdjuster sectionPositionTypeAdjustor;
    @NotNull
    private RangeDispatcher sectionRangeDispatcher;
    private ShieldLayoutManagerInterface shieldLayoutManager;
    private final TotalRangeObserver totalRangeObserver;

    private final ShieldSectionManager$onAttachStatusChangeListener$2.AnonymousClass1 getOnAttachStatusChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldSectionManager$onAttachStatusChangeListener$2.AnonymousClass1) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "825c4b627979434125e373fd0782f771", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "825c4b627979434125e373fd0782f771") : this.onAttachStatusChangeListener$delegate.a());
    }

    private final ShieldSectionManager$onMoveStatusEventChangeListener$2.AnonymousClass1 getOnMoveStatusEventChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldSectionManager$onMoveStatusEventChangeListener$2.AnonymousClass1) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8513cb1a519be9714f07ffe0ff2162b1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8513cb1a519be9714f07ffe0ff2162b1") : this.onMoveStatusEventChangeListener$delegate.a());
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
    }

    public ShieldSectionManager(@NotNull ProcessorHolder processorHolder) {
        h.b(processorHolder, "holder");
        Object[] objArr = {processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b988a30351e7a8a7e5276c305184669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b988a30351e7a8a7e5276c305184669");
            return;
        }
        this.holder = processorHolder;
        this.sectionPositionTypeAdjustor = new SectionPositionTypeAdjuster();
        this.sectionRangeDispatcher = new RangeDispatcher(kotlin.collections.h.c(this.sectionPositionTypeAdjustor));
        this.displayNodeList = new RangeRemoveableArrayList<>();
        this.listObservables = new ArrayList<>();
        this.totalRangeObserver = new TotalRangeObserver();
        this.onAttachStatusChangeListener$delegate = e.a(kotlin.i.NONE, ShieldSectionManager$onAttachStatusChangeListener$2.INSTANCE);
        this.onMoveStatusEventChangeListener$delegate = e.a(kotlin.i.NONE, ShieldSectionManager$onMoveStatusEventChangeListener$2.INSTANCE);
        this.nodeListDiffCallback = new NodeListDiffCallback();
        this.newAnimationDisplayNodeList = new ArrayList<>();
    }

    @NotNull
    public final RangeDispatcher getSectionRangeDispatcher() {
        return this.sectionRangeDispatcher;
    }

    public final void setSectionRangeDispatcher(@NotNull RangeDispatcher rangeDispatcher) {
        Object[] objArr = {rangeDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0bd803c26b48fe5884eaa32c65c9fb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0bd803c26b48fe5884eaa32c65c9fb9");
            return;
        }
        h.b(rangeDispatcher, "<set-?>");
        this.sectionRangeDispatcher = rangeDispatcher;
    }

    @NotNull
    public final RangeRemoveableArrayList<ShieldDisplayNode> getDisplayNodeList() {
        return this.displayNodeList;
    }

    public final void setDisplayNodeList(@NotNull RangeRemoveableArrayList<ShieldDisplayNode> rangeRemoveableArrayList) {
        Object[] objArr = {rangeRemoveableArrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de0c71649bffdb332ede593f95852528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de0c71649bffdb332ede593f95852528");
            return;
        }
        h.b(rangeRemoveableArrayList, "<set-?>");
        this.displayNodeList = rangeRemoveableArrayList;
    }

    public final void setHasWaterfallSection(boolean z) {
        this.hasWaterfallSection = z;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementList
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e583b96ca64c25524af49956fc355c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e583b96ca64c25524af49956fc355c")).intValue() : this.sectionRangeDispatcher.getTotalRange();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.adapter.status.ElementList
    @Nullable
    public final ShieldDisplayNode getDisplayElement(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e1876403128dde11b1499d38bb7d973", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e1876403128dde11b1499d38bb7d973");
        }
        ShieldDisplayNode shieldDisplayNode = i < this.displayNodeList.size() ? this.displayNodeList.get(i) : null;
        if (shieldDisplayNode == null || !shieldDisplayNode.isUpdate) {
            RangeDispatcher.RangeInfo innerPosition = this.sectionRangeDispatcher.getInnerPosition(i);
            RangeHolder rangeHolder = innerPosition != null ? innerPosition.obj : null;
            if (!(rangeHolder instanceof ShieldSection)) {
                rangeHolder = null;
            }
            ShieldSection shieldSection = (ShieldSection) rangeHolder;
            ShieldDisplayNode shieldDisplayNode2 = shieldSection != null ? shieldSection.getShieldDisplayNode(innerPosition != null ? innerPosition.innerIndex : 0) : null;
            if (this.displayNodeList.size() != size()) {
                this.displayNodeList = new RangeRemoveableArrayList<>(b.a(new ShieldDisplayNode[size()]));
            }
            this.displayNodeList.set(i, shieldDisplayNode2);
            return shieldDisplayNode2;
        }
        return shieldDisplayNode;
    }

    public final int getSectionStartPosition(@NotNull ShieldSection shieldSection) {
        Object[] objArr = {shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1492dc17088c14249dde7851bde2ec5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1492dc17088c14249dde7851bde2ec5c")).intValue();
        }
        h.b(shieldSection, "section");
        return this.sectionRangeDispatcher.getStartPosition(shieldSection);
    }

    public final void initAllSections(@NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c2e1aa51a0be595e96f449b2caa682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c2e1aa51a0be595e96f449b2caa682");
            return;
        }
        h.b(arrayList, "sections");
        this.sectionRangeDispatcher.unregisterObserver(this.totalRangeObserver);
        this.sectionRangeDispatcher.clear();
        this.sectionRangeDispatcher.addAll(arrayList);
        this.sectionRangeDispatcher.registerObserver(this.totalRangeObserver);
        this.displayNodeList = new RangeRemoveableArrayList<>(b.a(new ShieldDisplayNode[size()]));
        for (ListObserver listObserver : this.listObservables) {
            listObserver.onChanged();
        }
    }

    @Override // com.dianping.shield.node.adapter.NodeList
    public final void registerObserver(@NotNull ListObserver listObserver) {
        Object[] objArr = {listObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaef86c8f9e0040bc7eec340a4df138b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaef86c8f9e0040bc7eec340a4df138b");
            return;
        }
        h.b(listObserver, "observer");
        this.listObservables.add(listObserver);
    }

    @Override // com.dianping.shield.node.adapter.NodeList
    public final void unregisterObserver(@NotNull ListObserver listObserver) {
        Object[] objArr = {listObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d7a16521171e6b9009bd5f52a701d11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d7a16521171e6b9009bd5f52a701d11");
            return;
        }
        h.b(listObserver, "observer");
        this.listObservables.remove(listObserver);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementList
    @NotNull
    public final ArrayList<ElementStatusEventListener<ShieldDisplayNode>> getEventDispatcherList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2c1c58ccb77eb956fc2abffdb566ee8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2c1c58ccb77eb956fc2abffdb566ee8");
        }
        ArrayList<ElementStatusEventListener<ShieldDisplayNode>> arrayList = new ArrayList<>();
        arrayList.add(getOnAttachStatusChangeListener());
        arrayList.add(getOnMoveStatusEventChangeListener());
        return arrayList;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b35178373618f139e9edf14f9a1cf08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b35178373618f139e9edf14f9a1cf08f");
            return;
        }
        this.sectionRangeDispatcher = new RangeDispatcher(kotlin.collections.h.c(this.sectionPositionTypeAdjustor));
        this.displayNodeList.clear();
        this.listObservables.clear();
        this.shieldLayoutManager = null;
        this.newAnimationDisplayNodeList.clear();
    }

    public final void setLayoutManager(@Nullable ShieldLayoutManagerInterface shieldLayoutManagerInterface) {
        this.shieldLayoutManager = shieldLayoutManagerInterface;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/manager/ShieldSectionManager$NodeListUpdateCallback;", "Landroid/support/v7/util/ListUpdateCallback;", "listObservables", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/ListObserver;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class NodeListUpdateCallback implements c {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ArrayList<ListObserver> listObservables;

        public NodeListUpdateCallback(@NotNull ArrayList<ListObserver> arrayList) {
            h.b(arrayList, "listObservables");
            Object[] objArr = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06002afc4ae08b0dba7636b57d1dceba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06002afc4ae08b0dba7636b57d1dceba");
            } else {
                this.listObservables = arrayList;
            }
        }

        @Override // android.support.v7.util.c
        public final void onInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "943f6a788a58649ed1601a7006237dcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "943f6a788a58649ed1601a7006237dcb");
                return;
            }
            for (ListObserver listObserver : this.listObservables) {
                listObserver.onItemRangeInserted(i, i2);
            }
        }

        @Override // android.support.v7.util.c
        public final void onRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a1eddde7a930ca5811738c6fbfab62a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a1eddde7a930ca5811738c6fbfab62a");
                return;
            }
            for (ListObserver listObserver : this.listObservables) {
                listObserver.onItemRangeRemoved(i, i2);
            }
        }

        @Override // android.support.v7.util.c
        public final void onMoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a01be36299ee79c831e7d121fe29d790", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a01be36299ee79c831e7d121fe29d790");
                return;
            }
            for (ListObserver listObserver : this.listObservables) {
                listObserver.onItemRangeMoved(i, i2);
            }
        }

        @Override // android.support.v7.util.c
        public final void onChanged(int i, int i2, @Nullable Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3583e11c26d19e8bcb796f4a6938c672", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3583e11c26d19e8bcb796f4a6938c672");
                return;
            }
            for (ListObserver listObserver : this.listObservables) {
                listObserver.onItemRangeChanged(i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemRangeReplacedWithAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce7b20acdb9f382cf9c3d9359643bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce7b20acdb9f382cf9c3d9359643bb7");
            return;
        }
        this.newAnimationDisplayNodeList.clear();
        int size = this.displayNodeList.size();
        int totalRange = this.sectionRangeDispatcher.getTotalRange();
        if (totalRange > size) {
            this.newAnimationDisplayNodeList.addAll(this.displayNodeList);
            this.newAnimationDisplayNodeList.addAll(size, b.a(new ShieldDisplayNode[totalRange - size]));
        } else {
            this.newAnimationDisplayNodeList.addAll(this.displayNodeList.subList(0, totalRange));
        }
        for (int i = 0; i < totalRange; i++) {
            RangeDispatcher.RangeInfo innerPosition = this.sectionRangeDispatcher.getInnerPosition(i);
            ShieldDisplayNode shieldDisplayNode = null;
            RangeHolder rangeHolder = innerPosition != null ? innerPosition.obj : null;
            if (!(rangeHolder instanceof ShieldSection)) {
                rangeHolder = null;
            }
            ShieldSection shieldSection = (ShieldSection) rangeHolder;
            int i2 = innerPosition != null ? innerPosition.innerIndex : 0;
            if (shieldSection != null) {
                shieldDisplayNode = shieldSection.getShieldDisplayNode(i2);
            }
            this.newAnimationDisplayNodeList.set(i, shieldDisplayNode);
        }
        this.nodeListDiffCallback.setNodeList(this.displayNodeList, this.newAnimationDisplayNodeList);
        android.support.v7.util.b.a(this.nodeListDiffCallback, false).a(new NodeListUpdateCallback(this.listObservables));
        this.displayNodeList.clear();
        this.displayNodeList.addAll(b.a(new ShieldDisplayNode[totalRange]));
        Collections.copy(this.displayNodeList, this.newAnimationDisplayNodeList);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/manager/ShieldSectionManager$TotalRangeObserver;", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "(Lcom/dianping/shield/manager/ShieldSectionManager;)V", "onChanged", "", "sender", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "onItemRangeChanged", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "onItemRangeReplaced", "newItemCount", "oldItemCount", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class TotalRangeObserver implements RangeChangeObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeMoved(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c565bfbccd33367bbd302076141fb6a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c565bfbccd33367bbd302076141fb6a1");
            } else {
                h.b(rangeHolder, "sender");
            }
        }

        public TotalRangeObserver() {
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeReplaced(@NotNull RangeHolder rangeHolder, int i, int i2, int i3) {
            boolean z;
            boolean z2;
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a7130597aedf767009cd8941fca2067", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a7130597aedf767009cd8941fca2067");
                return;
            }
            h.b(rangeHolder, "sender");
            if (rangeHolder instanceof RangeDispatcher) {
                RangeDispatcher rangeDispatcher = (RangeDispatcher) rangeHolder;
                int size = rangeDispatcher.size();
                for (int i4 = 0; i4 < size; i4++) {
                    RangeHolder rangeHolder2 = (RangeHolder) rangeDispatcher.get(i4);
                    if ((rangeHolder2 instanceof ShieldSection) && ((ShieldSection) rangeHolder2).getEnableLayoutAnimation()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                ShieldSectionManager.this.onItemRangeReplacedWithAnimation();
                return;
            }
            ShieldSectionManager.this.getDisplayNodeList().removeRange(i, i + i3);
            ShieldSectionManager.this.getDisplayNodeList().addAll(i, b.a(new ShieldDisplayNode[i2]));
            if (i2 < i3 || !ShieldSectionManager.this.hasWaterfallSection) {
                z2 = true;
            } else {
                ShieldLayoutManagerInterface shieldLayoutManagerInterface = ShieldSectionManager.this.shieldLayoutManager;
                int findFirstVisibleItemPosition = shieldLayoutManagerInterface != null ? shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) : -1;
                if (findFirstVisibleItemPosition >= 0) {
                    for (ListObserver listObserver : ShieldSectionManager.this.listObservables) {
                        listObserver.onItemRangeChanged(findFirstVisibleItemPosition, i2 - findFirstVisibleItemPosition);
                    }
                    z2 = false;
                } else {
                    z2 = true;
                }
                ShieldSectionManager.this.setHasWaterfallSection(false);
            }
            if (z2) {
                for (ListObserver listObserver2 : ShieldSectionManager.this.listObservables) {
                    listObserver2.onChanged();
                }
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onChanged(@NotNull RangeHolder rangeHolder) {
            Object[] objArr = {rangeHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d35ebfcaba99ed5024f048c201b69e72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d35ebfcaba99ed5024f048c201b69e72");
                return;
            }
            h.b(rangeHolder, "sender");
            ShieldSectionManager.this.setDisplayNodeList(new RangeRemoveableArrayList<>(b.a(new ShieldDisplayNode[ShieldSectionManager.this.size()])));
            for (ListObserver listObserver : ShieldSectionManager.this.listObservables) {
                listObserver.onChanged();
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeChanged(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9deb1be7c639007d21be22e4a74ae520", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9deb1be7c639007d21be22e4a74ae520");
                return;
            }
            h.b(rangeHolder, "sender");
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                ShieldSectionManager.this.getDisplayNodeList().set(i4, null);
            }
            for (ListObserver listObserver : ShieldSectionManager.this.listObservables) {
                listObserver.onItemRangeChanged(i, i2);
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeInserted(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27bf6371ca4ca2a5fef8ce525cd2e7d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27bf6371ca4ca2a5fef8ce525cd2e7d8");
                return;
            }
            h.b(rangeHolder, "sender");
            ShieldSectionManager.this.getDisplayNodeList().addAll(i, b.a(new ShieldDisplayNode[i2]));
            for (ListObserver listObserver : ShieldSectionManager.this.listObservables) {
                listObserver.onItemRangeInserted(i, i2);
            }
        }

        @Override // com.dianping.shield.node.cellnode.RangeChangeObserver
        public final void onItemRangeRemoved(@NotNull RangeHolder rangeHolder, int i, int i2) {
            Object[] objArr = {rangeHolder, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1bbda48d2228b8c581865f5ad59d93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1bbda48d2228b8c581865f5ad59d93");
                return;
            }
            h.b(rangeHolder, "sender");
            ShieldSectionManager.this.getDisplayNodeList().removeRange(i, i + i2);
            for (ListObserver listObserver : ShieldSectionManager.this.listObservables) {
                listObserver.onItemRangeRemoved(i, i2);
            }
        }
    }
}
