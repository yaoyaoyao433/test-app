package com.dianping.shield.dynamic.diff.module;

import android.content.Context;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.l;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.agent.node.DynamicDiffKt;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.diff.view.HoverViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.PopViewInfoDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.paintingcallback.LoadingEmptyMessagePaintCallback;
import com.dianping.shield.dynamic.items.sectionitems.grid.DynamicGridSectionItem;
import com.dianping.shield.dynamic.items.sectionitems.normal.DynamicSectionItem;
import com.dianping.shield.dynamic.items.sectionitems.waterfall.DynamicWaterfallSectionItem;
import com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.module.BaseModuleInfo;
import com.dianping.shield.dynamic.model.section.GridSectionInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.section.WaterfallSectionInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.dynamic.utils.LinkTypeUtil;
import com.dianping.shield.dynamic.widget.DMDialog;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\u0019J\u0017\u00109\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010:\u001a\u000207H\u0002J\u0017\u0010;\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\u0019J\r\u0010<\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020?H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0>2\u0006\u0010@\u001a\u00020\u000bH\u0002J%\u0010B\u001a\b\u0012\u0004\u0012\u0002HC0>\"\b\b\u0002\u0010C*\u00020D2\u0006\u0010E\u001a\u0002HCH\u0002¢\u0006\u0002\u0010FJI\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00012\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0002\u0010PJ5\u0010Q\u001a\u0002072\u0006\u0010H\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00012\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`LH\u0002¢\u0006\u0002\u0010RJ]\u0010S\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010T2\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`L2\u001a\u0010U\u001a\u0016\u0012\u0004\u0012\u000203\u0012\f\u0012\n\u0012\u0004\u0012\u00020T\u0018\u00010>0V2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0002\u0010WJ5\u0010X\u001a\u0002072\u0006\u0010H\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00012\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`LH\u0002¢\u0006\u0002\u0010RJ5\u0010Y\u001a\u0002072\u0006\u0010H\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00012\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`LH\u0002¢\u0006\u0002\u0010RJ\b\u0010Z\u001a\u000207H\u0002J\u0012\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u000203H\u0016J\u0018\u0010^\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010_\u001a\u000203H\u0002J\u0018\u0010`\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010>2\u0006\u0010_\u001a\u000203H\u0002J\b\u0010a\u001a\u000207H\u0016J\u0015\u0010b\u001a\u0002072\u0006\u0010c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010dR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0015\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\bR\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b)\u0010#R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R*\u00101\u001a\u001e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402j\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204`5X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/dianping/shield/dynamic/diff/module/BaseModuleInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "V", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computingPopViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/PopViewInfo;", "defaultFailedViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getDefaultFailedViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "defaultFailedViewItem$delegate", "Lkotlin/Lazy;", "defaultLoadingMoreFailedViewItem", "getDefaultLoadingMoreFailedViewItem", "defaultLoadingMoreFailedViewItem$delegate", "dynamicModuleItem", "getDynamicModuleItem", "()Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "setDynamicModuleItem", "(Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;)V", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "dynamicPaintingListener", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "getDynamicPaintingListener", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "dynamicPaintingListener$delegate", "failedViewClickCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "getFailedViewClickCallback", "()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "failedViewClickCallback$delegate", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "setHostChassis", "loadingMoreFailedViewClickCallback", "getLoadingMoreFailedViewClickCallback", "loadingMoreFailedViewClickCallback$delegate", "loadingMoreViewPaintingListener", "Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "getLoadingMoreViewPaintingListener", "()Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "loadingMoreViewPaintingListener$delegate", "popViewItem", "sectionIdMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/node/useritem/SectionItem;", "Lkotlin/collections/HashMap;", "bindHoverViewItem", "", "computingItem", "bindItems", "bindPopViewItem", "bindSectionItems", "createComputingItem", "createHoverViewItem", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", DMKeys.KEY_VIEW_INFO, "createPopViewItem", "createSectionItem", "R", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "sectionInfo", "(Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;)Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffHoverViewItem", "(Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;Ljava/util/ArrayList;)V", "diffLoadingView", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "mappingFunc", "Lkotlin/Function1;", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "diffPopView", "diffSection", "dismissDialog", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "mappingHoverFuc", "id", "mappingPopFuc", "resetProps", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class BaseModuleInfoDiff<T extends BaseModuleInfo, V extends ShieldSectionCellItem> extends DynamicBaseDiff<T, V> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(BaseModuleInfoDiff.class), "failedViewClickCallback", "getFailedViewClickCallback()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;")), u.a(new s(u.a(BaseModuleInfoDiff.class), "loadingMoreFailedViewClickCallback", "getLoadingMoreFailedViewClickCallback()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;")), u.a(new s(u.a(BaseModuleInfoDiff.class), "loadingMoreViewPaintingListener", "getLoadingMoreViewPaintingListener()Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;")), u.a(new s(u.a(BaseModuleInfoDiff.class), "dynamicPaintingListener", "getDynamicPaintingListener()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;")), u.a(new s(u.a(BaseModuleInfoDiff.class), "defaultFailedViewItem", "getDefaultFailedViewItem()Lcom/dianping/shield/node/useritem/ViewItem;")), u.a(new s(u.a(BaseModuleInfoDiff.class), "defaultLoadingMoreFailedViewItem", "getDefaultLoadingMoreFailedViewItem()Lcom/dianping/shield/node/useritem/ViewItem;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private DynamicViewItem<PopViewInfo> computingPopViewItem;
    private final d defaultFailedViewItem$delegate;
    private final d defaultLoadingMoreFailedViewItem$delegate;
    @NotNull
    public V dynamicModuleItem;
    private final d dynamicPaintingListener$delegate;
    private final d failedViewClickCallback$delegate;
    @NotNull
    private DynamicChassisInterface hostChassis;
    private final d loadingMoreFailedViewClickCallback$delegate;
    private final d loadingMoreViewPaintingListener$delegate;
    private DynamicViewItem<PopViewInfo> popViewItem;
    private HashMap<String, SectionItem> sectionIdMap;

    private final ViewItem getDefaultFailedViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ViewItem) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4f8c62adf58f479f87232b5fbcfbba4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4f8c62adf58f479f87232b5fbcfbba4") : this.defaultFailedViewItem$delegate.a());
    }

    private final ViewItem getDefaultLoadingMoreFailedViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ViewItem) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "518b848896ac1ecc7f0abbd6e3cd2008", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "518b848896ac1ecc7f0abbd6e3cd2008") : this.defaultLoadingMoreFailedViewItem$delegate.a());
    }

    private final DynamicPaitingInterface getDynamicPaintingListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicPaitingInterface) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2c24ba1ca8523192d5616f618df642f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2c24ba1ca8523192d5616f618df642f") : this.dynamicPaintingListener$delegate.a());
    }

    private final ViewClickCallbackWithData getFailedViewClickCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ViewClickCallbackWithData) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9eab005bf7a56c3d4ed3fe8b2a676c2", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9eab005bf7a56c3d4ed3fe8b2a676c2") : this.failedViewClickCallback$delegate.a());
    }

    private final ViewClickCallbackWithData getLoadingMoreFailedViewClickCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ViewClickCallbackWithData) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a37751078c0c227a3fdb12e66e55ae1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a37751078c0c227a3fdb12e66e55ae1") : this.loadingMoreFailedViewClickCallback$delegate.a());
    }

    private final LoadingMoreViewPaintingListener getLoadingMoreViewPaintingListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LoadingMoreViewPaintingListener) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86561a3bc83d5dc2f06cd8b84a5b5ea", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86561a3bc83d5dc2f06cd8b84a5b5ea") : this.loadingMoreViewPaintingListener$delegate.a());
    }

    private final DynamicDiff<PopViewInfo> mappingPopFuc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d4576897a1a8b3ac6f9ce1d892a7856", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d4576897a1a8b3ac6f9ce1d892a7856");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((BaseModuleInfoDiff<T, V>) ((ShieldSectionCellItem) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseModuleInfoDiff<T, V>) ((BaseModuleInfo) diffableInfo), (BaseModuleInfo) ((ShieldSectionCellItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    public final void setHostChassis(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bf0f31d41a3086734dbffdf70b89567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bf0f31d41a3086734dbffdf70b89567");
            return;
        }
        h.b(dynamicChassisInterface, "<set-?>");
        this.hostChassis = dynamicChassisInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseModuleInfoDiff<T, V>) ((BaseModuleInfo) diffableInfo));
    }

    public BaseModuleInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77f374718ad264862974141fd0212daa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77f374718ad264862974141fd0212daa");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.sectionIdMap = new HashMap<>();
        this.failedViewClickCallback$delegate = e.a(kotlin.i.NONE, new BaseModuleInfoDiff$failedViewClickCallback$2(this));
        this.loadingMoreFailedViewClickCallback$delegate = e.a(kotlin.i.NONE, new BaseModuleInfoDiff$loadingMoreFailedViewClickCallback$2(this));
        this.loadingMoreViewPaintingListener$delegate = e.a(kotlin.i.NONE, new BaseModuleInfoDiff$loadingMoreViewPaintingListener$2(this));
        this.dynamicPaintingListener$delegate = e.a(kotlin.i.NONE, new BaseModuleInfoDiff$dynamicPaintingListener$2(this));
        this.defaultFailedViewItem$delegate = e.a(kotlin.i.NONE, BaseModuleInfoDiff$defaultFailedViewItem$2.INSTANCE);
        this.defaultLoadingMoreFailedViewItem$delegate = e.a(kotlin.i.NONE, BaseModuleInfoDiff$defaultLoadingMoreFailedViewItem$2.INSTANCE);
    }

    @NotNull
    public final V getDynamicModuleItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c9d7a2e5cacaf60d64438d1d3cec343", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c9d7a2e5cacaf60d64438d1d3cec343");
        }
        V v = this.dynamicModuleItem;
        if (v == null) {
            h.a("dynamicModuleItem");
        }
        return v;
    }

    public final void setDynamicModuleItem(@NotNull V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "994fe05d868726438e114a71ca06a5f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "994fe05d868726438e114a71ca06a5f2");
            return;
        }
        h.b(v, "<set-?>");
        this.dynamicModuleItem = v;
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public V createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "469724c86858d02ad75ad2de7cc573b7", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "469724c86858d02ad75ad2de7cc573b7") : (V) new ShieldSectionCellItem();
    }

    public void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "671b496109ef8df7bf579c7b99d7a306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "671b496109ef8df7bf579c7b99d7a306");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        diffSection(t, v, arrayList);
        diffHoverViewItem(t, v, arrayList);
        diffPopView(t, v, arrayList);
        int b = aq.b(this.hostChassis.getHostContext(), DMViewUtils.getPageContainerWidth(this.hostChassis));
        v.loadingViewItem = diffLoadingView(t.getLoadingView(), arrayList, new BaseModuleInfoDiff$diffChildren$1(this), Integer.valueOf(b));
        v.failedViewItem = diffLoadingView(t.getLoadingFailView(), arrayList, new BaseModuleInfoDiff$diffChildren$2(this), Integer.valueOf(b));
        v.loadingMoreViewItem = diffLoadingView(t.getLoadingMoreView(), arrayList, new BaseModuleInfoDiff$diffChildren$3(this), Integer.valueOf(b));
        v.loadingMoreFailedViewItem = diffLoadingView(t.getLoadingMoreFailView(), arrayList, new BaseModuleInfoDiff$diffChildren$4(this), Integer.valueOf(b));
        v.emptyViewItem = diffLoadingView(t.getEmptyView(), arrayList, new BaseModuleInfoDiff$diffChildren$5(this), Integer.valueOf(b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r14 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<com.dianping.shield.dynamic.model.view.ViewInfo> diffLoadingView(com.dianping.shield.dynamic.model.view.ViewInfo r12, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r13, kotlin.jvm.functions.b<? super java.lang.String, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ViewInfo>> r14, java.lang.Integer r15) {
        /*
            r11 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            r1 = 3
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.changeQuickRedirect
            java.lang.String r10 = "af07144a26f70c8eb840bd6f1a968e9e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r12 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r12
            return r12
        L27:
            r0 = 0
            if (r12 == 0) goto L7f
            com.dianping.shield.dynamic.model.DiffableInfo r12 = (com.dianping.shield.dynamic.model.DiffableInfo) r12
            java.lang.String r1 = r12.getIdentifier()
            if (r1 == 0) goto L57
            java.lang.Object r14 = r14.invoke(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
            if (r14 != 0) goto L55
            if (r12 == 0) goto L4d
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = new com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            com.dianping.shield.dynamic.diff.view.ViewInfoDiff r1 = new com.dianping.shield.dynamic.diff.view.ViewInfoDiff
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r2 = r11.hostChassis
            r1.<init>(r2)
            com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff r1 = (com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff) r1
            r14.<init>(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
            goto L55
        L4d:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L55:
            if (r14 != 0) goto L69
        L57:
            if (r12 == 0) goto L77
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = new com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            com.dianping.shield.dynamic.diff.view.ViewInfoDiff r1 = new com.dianping.shield.dynamic.diff.view.ViewInfoDiff
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r2 = r11.hostChassis
            r1.<init>(r2)
            com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff r1 = (com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff) r1
            r14.<init>(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
        L69:
            if (r12 == 0) goto L6f
            r14.diff(r12, r13, r15, r0)
            goto L80
        L6f:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L77:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L7f:
            r14 = r0
        L80:
            boolean r12 = r14 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r12 != 0) goto L85
            r14 = r0
        L85:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.diffLoadingView(com.dianping.shield.dynamic.model.view.ViewInfo, java.util.ArrayList, kotlin.jvm.functions.b, java.lang.Integer):com.dianping.shield.dynamic.items.viewitems.DynamicViewItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.dianping.shield.dynamic.agent.node.DynamicDiff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffPopView(T r11, V r12, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r13) {
        /*
            r10 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r1 = 1
            r0[r1] = r12
            r12 = 2
            r0[r12] = r13
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.changeQuickRedirect
            java.lang.String r9 = "823e502d38eac7684baee85c5a304ef0"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r10
            r3 = r12
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r12, r8, r9)
            return
        L21:
            com.dianping.shield.dynamic.model.view.PopViewInfo r11 = r11.getPopView()
            r12 = 0
            if (r11 == 0) goto L6f
            com.dianping.shield.dynamic.model.DiffableInfo r11 = (com.dianping.shield.dynamic.model.DiffableInfo) r11
            java.lang.String r0 = r11.getIdentifier()
            if (r0 == 0) goto L4d
            r1 = r10
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r1 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r1
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = r1.mappingPopFuc(r0)
            if (r0 != 0) goto L4b
            if (r11 == 0) goto L43
            r0 = r11
            com.dianping.shield.dynamic.model.view.PopViewInfo r0 = (com.dianping.shield.dynamic.model.view.PopViewInfo) r0
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = r1.createPopViewItem(r0)
            goto L4b
        L43:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        L4b:
            if (r0 != 0) goto L59
        L4d:
            if (r11 == 0) goto L67
            r0 = r11
            com.dianping.shield.dynamic.model.view.PopViewInfo r0 = (com.dianping.shield.dynamic.model.view.PopViewInfo) r0
            r1 = r10
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r1 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r1
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = r1.createPopViewItem(r0)
        L59:
            if (r11 == 0) goto L5f
            r0.diff(r11, r13, r12, r12)
            goto L70
        L5f:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        L67:
            kotlin.o r11 = new kotlin.o
            java.lang.String r12 = "null cannot be cast to non-null type T"
            r11.<init>(r12)
            throw r11
        L6f:
            r0 = r12
        L70:
            boolean r11 = r0 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r11 != 0) goto L75
            goto L76
        L75:
            r12 = r0
        L76:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r12 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r12
            r10.computingPopViewItem = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.diffPopView(com.dianping.shield.dynamic.model.module.BaseModuleInfo, com.dianping.shield.node.useritem.ShieldSectionCellItem, java.util.ArrayList):void");
    }

    private final DynamicDiff<PopViewInfo> createPopViewItem(PopViewInfo popViewInfo) {
        Object[] objArr = {popViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5751412e05f9e42e1d06ac3a20ed54d", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5751412e05f9e42e1d06ac3a20ed54d") : new DynamicViewItem(new PopViewInfoDiff(this.hostChassis));
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e52ed6c5e93b64d84d32715b2d47f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e52ed6c5e93b64d84d32715b2d47f7");
            return;
        }
        V v = this.dynamicModuleItem;
        if (v == null) {
            h.a("dynamicModuleItem");
        }
        ArrayList<SectionItem> arrayList = v.sectionItems;
        if (arrayList != null) {
            arrayList.clear();
        }
        v.shouldShow = true;
        v.loadingStatus = l.b.UNKNOWN;
        v.loadingViewItem = null;
        v.failedViewItem = null;
        v.emptyViewItem = null;
        v.loadingMoreStatus = l.a.UNKNOWN;
        v.loadingMoreViewItem = null;
        v.loadingMoreFailedViewItem = null;
        v.loadingMoreViewPaintingListener = null;
        v.floatViewItem = null;
        v.sectionHeaderGapHeight = -1;
        v.sectionHeaderGapDrawable = null;
        v.sectionFooterGapHeight = -1;
        v.sectionFooterGapDrawable = null;
        v.previousLinkType = null;
        v.nextLinkType = null;
        v.exposeInfo = null;
        v.moveStatusCallback = null;
        v.needScrollToTop = false;
        v.emptyMessage = null;
        v.hideLoadingMoreBackGround = false;
        v.hideLoadingMoreFailBackGroud = false;
        v.exposeComputeMode = null;
    }

    public void bindItems(@Nullable V v) {
        ViewItem viewItem;
        ViewItem viewItem2;
        ViewItem viewItem3;
        ViewItem viewItem4;
        ViewItem viewItem5;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db00f85050f195802ec7fb5a2e00f862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db00f85050f195802ec7fb5a2e00f862");
            return;
        }
        bindSectionItems(v);
        bindHoverViewItem(v);
        bindPopViewItem();
        if (v != null && (viewItem5 = v.loadingViewItem) != null) {
            V v2 = this.dynamicModuleItem;
            if (v2 == null) {
                h.a("dynamicModuleItem");
            }
            v2.loadingViewItem = viewItem5;
            V v3 = this.dynamicModuleItem;
            if (v3 == null) {
                h.a("dynamicModuleItem");
            }
            if (v3.loadingViewItem instanceof DynamicDiff) {
                V v4 = this.dynamicModuleItem;
                if (v4 == null) {
                    h.a("dynamicModuleItem");
                }
                ViewItem viewItem6 = v4.loadingViewItem;
                if (viewItem6 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) viewItem6).onComputingComplete();
            }
            v.loadingViewItem = null;
        }
        if (v != null && (viewItem4 = v.failedViewItem) != null) {
            V v5 = this.dynamicModuleItem;
            if (v5 == null) {
                h.a("dynamicModuleItem");
            }
            v5.failedViewItem = viewItem4;
            V v6 = this.dynamicModuleItem;
            if (v6 == null) {
                h.a("dynamicModuleItem");
            }
            if (v6.failedViewItem instanceof DynamicDiff) {
                V v7 = this.dynamicModuleItem;
                if (v7 == null) {
                    h.a("dynamicModuleItem");
                }
                ViewItem viewItem7 = v7.failedViewItem;
                if (viewItem7 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) viewItem7).onComputingComplete();
            }
            v.failedViewItem = null;
        } else {
            V v8 = this.dynamicModuleItem;
            if (v8 == null) {
                h.a("dynamicModuleItem");
            }
            v8.failedViewItem = getDefaultFailedViewItem();
        }
        V v9 = this.dynamicModuleItem;
        if (v9 == null) {
            h.a("dynamicModuleItem");
        }
        v9.failedViewItem.clickCallback = getFailedViewClickCallback();
        if (v != null && (viewItem3 = v.loadingMoreViewItem) != null) {
            V v10 = this.dynamicModuleItem;
            if (v10 == null) {
                h.a("dynamicModuleItem");
            }
            v10.loadingMoreViewItem = viewItem3;
            V v11 = this.dynamicModuleItem;
            if (v11 == null) {
                h.a("dynamicModuleItem");
            }
            if (v11.loadingMoreViewItem instanceof DynamicDiff) {
                V v12 = this.dynamicModuleItem;
                if (v12 == null) {
                    h.a("dynamicModuleItem");
                }
                ViewItem viewItem8 = v12.loadingMoreViewItem;
                if (viewItem8 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) viewItem8).onComputingComplete();
            }
            V v13 = this.dynamicModuleItem;
            if (v13 == null) {
                h.a("dynamicModuleItem");
            }
            ViewItem viewItem9 = v13.loadingMoreViewItem;
            if (!(viewItem9 instanceof DynamicViewItem)) {
                viewItem9 = null;
            }
            DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem9;
            if (dynamicViewItem != null) {
                dynamicViewItem.setDynamicPaintingListener(getDynamicPaintingListener());
            }
            v.loadingMoreViewItem = null;
        }
        V v14 = this.dynamicModuleItem;
        if (v14 == null) {
            h.a("dynamicModuleItem");
        }
        v14.loadingMoreViewPaintingListener = getLoadingMoreViewPaintingListener();
        if (v != null && (viewItem2 = v.loadingMoreFailedViewItem) != null) {
            V v15 = this.dynamicModuleItem;
            if (v15 == null) {
                h.a("dynamicModuleItem");
            }
            v15.loadingMoreFailedViewItem = viewItem2;
            V v16 = this.dynamicModuleItem;
            if (v16 == null) {
                h.a("dynamicModuleItem");
            }
            if (v16.loadingMoreFailedViewItem instanceof DynamicDiff) {
                V v17 = this.dynamicModuleItem;
                if (v17 == null) {
                    h.a("dynamicModuleItem");
                }
                ViewItem viewItem10 = v17.loadingMoreFailedViewItem;
                if (viewItem10 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) viewItem10).onComputingComplete();
            }
            V v18 = this.dynamicModuleItem;
            if (v18 == null) {
                h.a("dynamicModuleItem");
            }
            ViewItem viewItem11 = v18.loadingMoreFailedViewItem;
            if (!(viewItem11 instanceof DynamicViewItem)) {
                viewItem11 = null;
            }
            DynamicViewItem dynamicViewItem2 = (DynamicViewItem) viewItem11;
            if (dynamicViewItem2 != null) {
                dynamicViewItem2.setDynamicPaintingListener(getDynamicPaintingListener());
            }
            v.loadingMoreFailedViewItem = null;
        } else {
            V v19 = this.dynamicModuleItem;
            if (v19 == null) {
                h.a("dynamicModuleItem");
            }
            v19.loadingMoreFailedViewItem = getDefaultLoadingMoreFailedViewItem();
        }
        V v20 = this.dynamicModuleItem;
        if (v20 == null) {
            h.a("dynamicModuleItem");
        }
        v20.loadingMoreFailedViewItem.clickCallback = getLoadingMoreFailedViewClickCallback();
        if (v == null || (viewItem = v.emptyViewItem) == null) {
            return;
        }
        V v21 = this.dynamicModuleItem;
        if (v21 == null) {
            h.a("dynamicModuleItem");
        }
        v21.emptyViewItem = viewItem;
        V v22 = this.dynamicModuleItem;
        if (v22 == null) {
            h.a("dynamicModuleItem");
        }
        if (v22.emptyViewItem instanceof DynamicDiff) {
            V v23 = this.dynamicModuleItem;
            if (v23 == null) {
                h.a("dynamicModuleItem");
            }
            ViewItem viewItem12 = v23.emptyViewItem;
            if (viewItem12 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
            }
            ((DynamicDiff) viewItem12).onComputingComplete();
        }
        v.emptyViewItem = null;
    }

    private final void bindSectionItems(V v) {
        ArrayList<SectionItem> arrayList;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2aef14b818f21b0012459c0c3346e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2aef14b818f21b0012459c0c3346e7d");
            return;
        }
        this.sectionIdMap.clear();
        if (v == null || (arrayList = v.sectionItems) == null) {
            return;
        }
        for (SectionItem sectionItem : arrayList) {
            if (sectionItem instanceof DynamicDiff) {
                DynamicDiff dynamicDiff = (DynamicDiff) sectionItem;
                dynamicDiff.onComputingComplete();
                String id = dynamicDiff.getId();
                if (id != null) {
                    this.sectionIdMap.put(id, sectionItem);
                }
                V v2 = this.dynamicModuleItem;
                if (v2 == null) {
                    h.a("dynamicModuleItem");
                }
                v2.addSectionItem(sectionItem);
            }
        }
    }

    private final void bindHoverViewItem(V v) {
        FloatViewItem floatViewItem;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "318b05c6f535433019811509760d28be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "318b05c6f535433019811509760d28be");
        } else if (v == null || (floatViewItem = v.floatViewItem) == null) {
        } else {
            V v2 = this.dynamicModuleItem;
            if (v2 == null) {
                h.a("dynamicModuleItem");
            }
            v2.floatViewItem = floatViewItem;
            V v3 = this.dynamicModuleItem;
            if (v3 == null) {
                h.a("dynamicModuleItem");
            }
            if (v3.floatViewItem instanceof DynamicDiff) {
                V v4 = this.dynamicModuleItem;
                if (v4 == null) {
                    h.a("dynamicModuleItem");
                }
                FloatViewItem floatViewItem2 = v4.floatViewItem;
                if (floatViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                ((DynamicDiff) floatViewItem2).onComputingComplete();
            }
            v.floatViewItem = null;
        }
    }

    private final void bindPopViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426a87d75c7fbbdfe92d5b10bf161b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426a87d75c7fbbdfe92d5b10bf161b08");
            return;
        }
        DynamicViewItem<PopViewInfo> dynamicViewItem = this.computingPopViewItem;
        if (dynamicViewItem != null) {
            this.popViewItem = dynamicViewItem;
            if (this.popViewItem instanceof DynamicDiff) {
                DynamicViewItem<PopViewInfo> dynamicViewItem2 = this.popViewItem;
                if (dynamicViewItem2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<*>");
                }
                dynamicViewItem2.onComputingComplete();
            }
            this.computingPopViewItem = null;
            return;
        }
        dismissDialog();
    }

    private final void dismissDialog() {
        DMDialog dMDialog;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d7f61fad162ab5413c37ced65eb7a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d7f61fad162ab5413c37ced65eb7a99");
            return;
        }
        DynamicChassisInterface dynamicChassisInterface = this.hostChassis;
        if (!(dynamicChassisInterface instanceof DynamicAgent)) {
            dynamicChassisInterface = null;
        }
        DynamicAgent dynamicAgent = (DynamicAgent) dynamicChassisInterface;
        if (dynamicAgent == null || (dMDialog = dynamicAgent.dmDialog) == null || !dMDialog.isShowing()) {
            return;
        }
        dMDialog.dismiss();
    }

    public void updateProps(@NotNull final T t) {
        String emptyMessage;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9af7a8525e728bc70c9548ad212767a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9af7a8525e728bc70c9548ad212767a5");
            return;
        }
        h.b(t, "info");
        l.b bVar = l.b.UNKNOWN;
        Integer loadingStatus = t.getLoadingStatus();
        if (loadingStatus != null) {
            bVar = DMUtils.changeLoadingStatus(loadingStatus.intValue());
            h.a((Object) bVar, "DMUtils.changeLoadingStatus(it)");
        }
        Boolean isEmpty = t.isEmpty();
        if (isEmpty != null && isEmpty.booleanValue()) {
            bVar = l.b.EMPTY;
        }
        V v = this.dynamicModuleItem;
        if (v == null) {
            h.a("dynamicModuleItem");
        }
        v.loadingStatus = bVar;
        V v2 = this.dynamicModuleItem;
        if (v2 == null) {
            h.a("dynamicModuleItem");
        }
        if (v2.loadingStatus == l.b.EMPTY) {
            V v3 = this.dynamicModuleItem;
            if (v3 == null) {
                h.a("dynamicModuleItem");
            }
            if (v3.emptyViewItem == null && (emptyMessage = t.getEmptyMessage()) != null) {
                V v4 = this.dynamicModuleItem;
                if (v4 == null) {
                    h.a("dynamicModuleItem");
                }
                v4.emptyViewItem = ViewItem.simpleViewItem(new LoadingEmptyMessagePaintCallback(emptyMessage));
            }
        }
        Integer loadingMoreStatus = t.getLoadingMoreStatus();
        if (loadingMoreStatus != null) {
            int intValue = loadingMoreStatus.intValue();
            V v5 = this.dynamicModuleItem;
            if (v5 == null) {
                h.a("dynamicModuleItem");
            }
            v5.loadingMoreStatus = DMUtils.changeLoadingMoreStatus(intValue);
        }
        V v6 = this.dynamicModuleItem;
        if (v6 == null) {
            h.a("dynamicModuleItem");
        }
        Boolean isLoadingMoreCellHideBackground = t.isLoadingMoreCellHideBackground();
        v6.hideLoadingMoreBackGround = isLoadingMoreCellHideBackground != null ? isLoadingMoreCellHideBackground.booleanValue() : false;
        V v7 = this.dynamicModuleItem;
        if (v7 == null) {
            h.a("dynamicModuleItem");
        }
        Boolean isLoadingMoreFailCellHideBackground = t.isLoadingMoreFailCellHideBackground();
        v7.hideLoadingMoreFailBackGroud = isLoadingMoreFailCellHideBackground != null ? isLoadingMoreFailCellHideBackground.booleanValue() : false;
        Integer sectionHeaderHeight = t.getSectionHeaderHeight();
        if (sectionHeaderHeight != null) {
            int intValue2 = sectionHeaderHeight.intValue();
            V v8 = this.dynamicModuleItem;
            if (v8 == null) {
                h.a("dynamicModuleItem");
            }
            v8.sectionHeaderGapHeight = intValue2;
        }
        Integer sectionFooterHeight = t.getSectionFooterHeight();
        if (sectionFooterHeight != null) {
            int intValue3 = sectionFooterHeight.intValue();
            V v9 = this.dynamicModuleItem;
            if (v9 == null) {
                h.a("dynamicModuleItem");
            }
            v9.sectionFooterGapHeight = intValue3;
        }
        V v10 = this.dynamicModuleItem;
        if (v10 == null) {
            h.a("dynamicModuleItem");
        }
        v10.sectionHeaderGapDrawable = DMUtils.getHeaderFooterBackgroundColor(t.getSectionHeaderBackgroundColor());
        V v11 = this.dynamicModuleItem;
        if (v11 == null) {
            h.a("dynamicModuleItem");
        }
        v11.sectionFooterGapDrawable = DMUtils.getHeaderFooterBackgroundColor(t.getSectionFooterBackgroundColor());
        Integer linkType = t.getLinkType();
        if (linkType != null) {
            int intValue4 = linkType.intValue();
            V v12 = this.dynamicModuleItem;
            if (v12 == null) {
                h.a("dynamicModuleItem");
            }
            v12.nextLinkType = LinkTypeUtil.INSTANCE.getNextLinkType(intValue4);
            V v13 = this.dynamicModuleItem;
            if (v13 == null) {
                h.a("dynamicModuleItem");
            }
            v13.previousLinkType = LinkTypeUtil.INSTANCE.getPreviousLinkType(intValue4);
        } else {
            V v14 = this.dynamicModuleItem;
            if (v14 == null) {
                h.a("dynamicModuleItem");
            }
            v14.nextLinkType = LinkTypeUtil.INSTANCE.getNextLinkType(3);
            V v15 = this.dynamicModuleItem;
            if (v15 == null) {
                h.a("dynamicModuleItem");
            }
            v15.previousLinkType = LinkTypeUtil.INSTANCE.getPreviousLinkType(3);
        }
        if (t.getViewMgeInfo() != null) {
            V v16 = this.dynamicModuleItem;
            if (v16 == null) {
                h.a("dynamicModuleItem");
            }
            ExposeInfo exposeInfo = new ExposeInfo();
            exposeInfo.maxExposeCount = 1;
            exposeInfo.agentExposeCallback = new ExposeCallback() { // from class: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff$updateProps$$inlined$apply$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ExposeCallback
                public final void onExpose(@Nullable Object obj, int i, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {obj, Integer.valueOf(i), nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c7f441ec4ad04625d6ec3f56155bf5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c7f441ec4ad04625d6ec3f56155bf5e");
                        return;
                    }
                    MGEInfo viewMgeInfo = t.getViewMgeInfo();
                    if (viewMgeInfo != null) {
                        Context hostContext = BaseModuleInfoDiff.this.getHostChassis().getHostContext();
                        if (viewMgeInfo != null) {
                            Statistics.getChannel(viewMgeInfo.getCategory()).writeModelView(AppUtil.generatePageInfoKey(hostContext), viewMgeInfo.getBid(), viewMgeInfo.getLabs(), viewMgeInfo.getCid());
                        }
                    }
                }
            };
            v16.addExposeInfo(exposeInfo);
        }
        Integer autoExposeViewType = t.getAutoExposeViewType();
        if (autoExposeViewType != null) {
            int intValue5 = autoExposeViewType.intValue();
            V v17 = this.dynamicModuleItem;
            if (v17 == null) {
                h.a("dynamicModuleItem");
            }
            v17.exposeComputeMode = f.b.a(intValue5);
        }
    }

    private final <R extends SectionInfo.BaseSectionInfo> DynamicDiff<R> createSectionItem(R r) {
        Object[] objArr = {r};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25c556961397b5740efaa4f1cbe9acd", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25c556961397b5740efaa4f1cbe9acd") : r instanceof WaterfallSectionInfo ? new DynamicWaterfallSectionItem(this.hostChassis, null, 2, null) : r instanceof GridSectionInfo ? new DynamicGridSectionItem(this.hostChassis, null, 2, null) : new DynamicSectionItem(this.hostChassis, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r1 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffSection(T r12, V r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.changeQuickRedirect
            java.lang.String r10 = "bb04e55ac418a0eb81540997b19fc896"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            java.util.ArrayList r12 = r12.getChildren()
            if (r12 == 0) goto L95
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L2d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r12.next()
            com.dianping.shield.dynamic.model.section.SectionInfo r0 = (com.dianping.shield.dynamic.model.section.SectionInfo) r0
            com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
            java.lang.String r1 = r0.getIdentifier()
            r2 = 0
            if (r1 == 0) goto L68
            java.util.HashMap<java.lang.String, com.dianping.shield.node.useritem.SectionItem> r3 = r11.sectionIdMap
            java.lang.Object r1 = r3.get(r1)
            boolean r3 = r1 instanceof com.dianping.shield.dynamic.agent.node.DynamicDiff
            if (r3 != 0) goto L4d
            r1 = r2
        L4d:
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r1
            if (r1 != 0) goto L66
            if (r0 == 0) goto L5e
            r1 = r0
            com.dianping.shield.dynamic.model.section.SectionInfo$BaseSectionInfo r1 = (com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo) r1
            r3 = r11
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r3 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r3
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r3.createSectionItem(r1)
            goto L66
        L5e:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L66:
            if (r1 != 0) goto L74
        L68:
            if (r0 == 0) goto L8c
            r1 = r0
            com.dianping.shield.dynamic.model.section.SectionInfo$BaseSectionInfo r1 = (com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo) r1
            r3 = r11
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r3 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r3
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r3.createSectionItem(r1)
        L74:
            if (r0 == 0) goto L84
            r1.diff(r0, r14, r2, r2)
            boolean r0 = r1 instanceof com.dianping.shield.node.useritem.SectionItem
            if (r0 != 0) goto L7e
            r1 = r2
        L7e:
            com.dianping.shield.node.useritem.SectionItem r1 = (com.dianping.shield.node.useritem.SectionItem) r1
            r13.addSectionItem(r1)
            goto L2d
        L84:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L8c:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L94:
            return
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.diffSection(com.dianping.shield.dynamic.model.module.BaseModuleInfo, com.dianping.shield.node.useritem.ShieldSectionCellItem, java.util.ArrayList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.dianping.shield.dynamic.agent.node.DynamicDiff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffHoverViewItem(T r12, V r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.changeQuickRedirect
            java.lang.String r10 = "ba39263cdddc63144bb6003c3c1317fd"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            com.dianping.shield.dynamic.model.view.HoverViewInfo r12 = r12.getHoverView()
            r0 = 0
            if (r12 == 0) goto L6f
            com.dianping.shield.dynamic.model.DiffableInfo r12 = (com.dianping.shield.dynamic.model.DiffableInfo) r12
            java.lang.String r1 = r12.getIdentifier()
            if (r1 == 0) goto L4d
            r2 = r11
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r2 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.mappingHoverFuc(r1)
            if (r1 != 0) goto L4b
            if (r12 == 0) goto L43
            r1 = r12
            com.dianping.shield.dynamic.model.view.HoverViewInfo r1 = (com.dianping.shield.dynamic.model.view.HoverViewInfo) r1
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.createHoverViewItem(r1)
            goto L4b
        L43:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L4b:
            if (r1 != 0) goto L59
        L4d:
            if (r12 == 0) goto L67
            r1 = r12
            com.dianping.shield.dynamic.model.view.HoverViewInfo r1 = (com.dianping.shield.dynamic.model.view.HoverViewInfo) r1
            r2 = r11
            com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff r2 = (com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.createHoverViewItem(r1)
        L59:
            if (r12 == 0) goto L5f
            r1.diff(r12, r14, r0, r0)
            goto L70
        L5f:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L67:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L6f:
            r1 = r0
        L70:
            boolean r12 = r1 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem
            if (r12 != 0) goto L75
            goto L76
        L75:
            r0 = r1
        L76:
            com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem r0 = (com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem) r0
            com.dianping.shield.node.useritem.FloatViewItem r0 = (com.dianping.shield.node.useritem.FloatViewItem) r0
            r13.floatViewItem = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff.diffHoverViewItem(com.dianping.shield.dynamic.model.module.BaseModuleInfo, com.dianping.shield.node.useritem.ShieldSectionCellItem, java.util.ArrayList):void");
    }

    private final DynamicDiff<HoverViewInfo> mappingHoverFuc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beed22a306b0d1c9b71a9d5b14054575", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beed22a306b0d1c9b71a9d5b14054575");
        }
        V v = this.dynamicModuleItem;
        if (v == null) {
            h.a("dynamicModuleItem");
        }
        FloatViewItem floatViewItem = v.floatViewItem;
        if (!(floatViewItem instanceof DynamicFloatViewItem)) {
            floatViewItem = null;
        }
        DynamicFloatViewItem dynamicFloatViewItem = (DynamicFloatViewItem) floatViewItem;
        if (dynamicFloatViewItem == null || !h.a((Object) dynamicFloatViewItem.getId(), (Object) str)) {
            return null;
        }
        V v2 = this.dynamicModuleItem;
        if (v2 == null) {
            h.a("dynamicModuleItem");
        }
        FloatViewItem floatViewItem2 = v2.floatViewItem;
        if (floatViewItem2 != null) {
            return (DynamicDiff) floatViewItem2;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.HoverViewInfo>");
    }

    private final DynamicDiff<HoverViewInfo> createHoverViewItem(HoverViewInfo hoverViewInfo) {
        Object[] objArr = {hoverViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f65b4c85682215f95aff874ce911f67", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f65b4c85682215f95aff874ce911f67") : new DynamicFloatViewItem(new HoverViewInfoDiff(this.hostChassis));
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f3572a13424f605b9b3570bbd6698ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f3572a13424f605b9b3570bbd6698ac");
        }
        h.b(str, "identifier");
        ArrayList arrayList = new ArrayList();
        V v = this.dynamicModuleItem;
        if (v == null) {
            h.a("dynamicModuleItem");
        }
        ArrayList<SectionItem> arrayList2 = v.sectionItems;
        if (arrayList2 != null) {
            for (SectionItem sectionItem : arrayList2) {
                if (sectionItem instanceof DynamicViewItemsHolderInterface) {
                    arrayList.add(sectionItem);
                }
            }
        }
        V v2 = this.dynamicModuleItem;
        if (v2 == null) {
            h.a("dynamicModuleItem");
        }
        FloatViewItem floatViewItem = v2.floatViewItem;
        if (!(floatViewItem instanceof DynamicViewItemsHolderInterface)) {
            floatViewItem = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) floatViewItem;
        if (dynamicViewItemsHolderInterface != null) {
            arrayList.add(dynamicViewItemsHolderInterface);
        }
        DynamicViewItem<PopViewInfo> dynamicViewItem = this.popViewItem;
        if (!(dynamicViewItem instanceof DynamicViewItemsHolderInterface)) {
            dynamicViewItem = null;
        }
        DynamicViewItem<PopViewInfo> dynamicViewItem2 = dynamicViewItem;
        if (dynamicViewItem2 != null) {
            arrayList.add(dynamicViewItem2);
        }
        V v3 = this.dynamicModuleItem;
        if (v3 == null) {
            h.a("dynamicModuleItem");
        }
        ViewItem viewItem = v3.loadingViewItem;
        if (!(viewItem instanceof DynamicViewItemsHolderInterface)) {
            viewItem = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface2 = (DynamicViewItemsHolderInterface) viewItem;
        if (dynamicViewItemsHolderInterface2 != null) {
            arrayList.add(dynamicViewItemsHolderInterface2);
        }
        V v4 = this.dynamicModuleItem;
        if (v4 == null) {
            h.a("dynamicModuleItem");
        }
        ViewItem viewItem2 = v4.failedViewItem;
        if (!(viewItem2 instanceof DynamicViewItemsHolderInterface)) {
            viewItem2 = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface3 = (DynamicViewItemsHolderInterface) viewItem2;
        if (dynamicViewItemsHolderInterface3 != null) {
            arrayList.add(dynamicViewItemsHolderInterface3);
        }
        V v5 = this.dynamicModuleItem;
        if (v5 == null) {
            h.a("dynamicModuleItem");
        }
        ViewItem viewItem3 = v5.loadingMoreFailedViewItem;
        if (!(viewItem3 instanceof DynamicViewItemsHolderInterface)) {
            viewItem3 = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface4 = (DynamicViewItemsHolderInterface) viewItem3;
        if (dynamicViewItemsHolderInterface4 != null) {
            arrayList.add(dynamicViewItemsHolderInterface4);
        }
        V v6 = this.dynamicModuleItem;
        if (v6 == null) {
            h.a("dynamicModuleItem");
        }
        ViewItem viewItem4 = v6.loadingMoreViewItem;
        if (!(viewItem4 instanceof DynamicViewItemsHolderInterface)) {
            viewItem4 = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface5 = (DynamicViewItemsHolderInterface) viewItem4;
        if (dynamicViewItemsHolderInterface5 != null) {
            arrayList.add(dynamicViewItemsHolderInterface5);
        }
        V v7 = this.dynamicModuleItem;
        if (v7 == null) {
            h.a("dynamicModuleItem");
        }
        ViewItem viewItem5 = v7.emptyViewItem;
        if (!(viewItem5 instanceof DynamicViewItemsHolderInterface)) {
            viewItem5 = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface6 = (DynamicViewItemsHolderInterface) viewItem5;
        if (dynamicViewItemsHolderInterface6 != null) {
            arrayList.add(dynamicViewItemsHolderInterface6);
        }
        return DynamicDiffKt.findDynamicViewItem(arrayList, str);
    }
}
