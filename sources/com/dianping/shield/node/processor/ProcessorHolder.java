package com.dianping.shield.node.processor;

import android.content.Context;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.NodeExtension;
import com.dianping.shield.extensions.RowExtension;
import com.dianping.shield.extensions.SectionExtension;
import com.dianping.shield.extensions.loading.LoadingSectionProcessor;
import com.dianping.shield.extensions.loadingmore.LoadingMoreSectionProcessor;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionNodeProcessor;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.manager.ShieldSectionManager;
import com.dianping.shield.node.DividerThemePackage;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.processor.impl.cell.CellExtraInfosNodeProcessor;
import com.dianping.shield.node.processor.impl.cell.CellMoveStatusNodeProcessor;
import com.dianping.shield.node.processor.impl.cell.CellNodeExposeProcessor;
import com.dianping.shield.node.processor.impl.cell.CellNodeMappingProcessor;
import com.dianping.shield.node.processor.impl.cell.CellStatusMoreNodeProcessor;
import com.dianping.shield.node.processor.impl.cell.CellStatusNodeProcessor;
import com.dianping.shield.node.processor.impl.cell.NormalCellNodeProcessor;
import com.dianping.shield.node.processor.impl.displaynode.BaseDisplayNodeProcessor;
import com.dianping.shield.node.processor.impl.displaynode.ClickDisplayNodeProcessor;
import com.dianping.shield.node.processor.impl.displaynode.DisplayNodeExposeProcessor;
import com.dianping.shield.node.processor.impl.displaynode.DisplayNodeHotZoneProcessor;
import com.dianping.shield.node.processor.impl.displaynode.DisplayNodeRowAppearanceProcessor;
import com.dianping.shield.node.processor.impl.divider.FooterGapProcessor;
import com.dianping.shield.node.processor.impl.divider.HeaderGapProcessor;
import com.dianping.shield.node.processor.impl.divider.RowDividerProcessor;
import com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor;
import com.dianping.shield.node.processor.impl.margin.StaggeredGridMarginProcessor;
import com.dianping.shield.node.processor.impl.row.BaseRowNodeProcessor;
import com.dianping.shield.node.processor.impl.row.RowExtraInfosProcessor;
import com.dianping.shield.node.processor.impl.row.RowNodeHotZoneProcessor;
import com.dianping.shield.node.processor.impl.row.RowNodeMappingProcessor;
import com.dianping.shield.node.processor.impl.row.RowNodeMoveStatusProcessor;
import com.dianping.shield.node.processor.impl.row.RowSectionAppearanceProcessor;
import com.dianping.shield.node.processor.impl.section.ExtraSectionNodeProcessor;
import com.dianping.shield.node.processor.impl.section.LinkTypeSectionNodeProcessor;
import com.dianping.shield.node.processor.impl.section.NormalSectionNodeProcessor;
import com.dianping.shield.node.processor.impl.section.RangeSectionNodeProcessor;
import com.dianping.shield.node.processor.impl.section.SectionCellAppearanceProcessor;
import com.dianping.shield.node.processor.impl.section.SectionExtraInfosNodeProcessor;
import com.dianping.shield.node.processor.impl.section.SectionNodeMappingProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellExposeInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellMoveStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellStatusMoreInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.NormalCellInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.DividerInfoInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.DividerInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.FooterRowExposeProcessor;
import com.dianping.shield.node.processor.legacy.row.FooterSetBottomInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.FooterSetTopInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.HeaderRowExposeProcessor;
import com.dianping.shield.node.processor.legacy.row.HeaderSetBottomInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.HeaderSetTopInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.NormalRowInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.RowExposeProcessor;
import com.dianping.shield.node.processor.legacy.row.RowMoveStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.SetBottomInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.SetTopInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.section.DividerShowTypeInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.section.ExtraCellInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.section.LinkTypeIntefaceProcessor;
import com.dianping.shield.node.processor.legacy.section.NormalSectionInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.section.SectionDividerInfoInterfaceProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0002H\u0016J\n\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010R\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u00020OH\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u00020OH\u0016J\u0018\u0010T\u001a\u00020M2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0016J\u0018\u0010Y\u001a\u00020M2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0016J\u0018\u0010^\u001a\u00020M2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020MH\u0016J\b\u0010d\u001a\u00020MH\u0016R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b!\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b*\u0010\u000bR\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001b\u00104\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b5\u0010\u000bR\u001b\u00107\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b8\u0010\u000bR\u001b\u0010:\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b;\u0010\u000bR\u001b\u0010=\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\r\u001a\u0004\b>\u0010\u000bR\u001b\u0010@\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\bA\u0010\u000bR\u001a\u0010C\u001a\u00020DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001b\u0010I\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\r\u001a\u0004\bJ\u0010\u000b¨\u0006e"}, d2 = {"Lcom/dianping/shield/node/processor/ProcessorHolder;", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "Lcom/dianping/shield/node/processor/Processor;", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cellInterfaceProcessorChain", "Lcom/dianping/shield/node/processor/ProcessorChain;", "getCellInterfaceProcessorChain", "()Lcom/dianping/shield/node/processor/ProcessorChain;", "cellInterfaceProcessorChain$delegate", "Lkotlin/Lazy;", "cellProcessorChain", "getCellProcessorChain", "cellProcessorChain$delegate", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "getCreator", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setCreator", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "dividerProcessorChain", "getDividerProcessorChain", "dividerProcessorChain$delegate", "dividerThemePackage", "Lcom/dianping/shield/node/DividerThemePackage;", "getDividerThemePackage", "()Lcom/dianping/shield/node/DividerThemePackage;", "setDividerThemePackage", "(Lcom/dianping/shield/node/DividerThemePackage;)V", "footerInterfaceProcessorChain", "getFooterInterfaceProcessorChain", "footerInterfaceProcessorChain$delegate", "globalScreenVisibleExposeProxy", "Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "getGlobalScreenVisibleExposeProxy", "()Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;", "setGlobalScreenVisibleExposeProxy", "(Lcom/dianping/shield/node/adapter/status/IScreenVisibleExposeEdge;)V", "headerInterfaceProcessorChain", "getHeaderInterfaceProcessorChain", "headerInterfaceProcessorChain$delegate", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "getInfoHolder", "()Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "setInfoHolder", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;)V", "getMContext", "()Landroid/content/Context;", "nodeProcessorChain", "getNodeProcessorChain", "nodeProcessorChain$delegate", "rowInterfaceProcessorChain", "getRowInterfaceProcessorChain", "rowInterfaceProcessorChain$delegate", "rowProcessorChain", "getRowProcessorChain", "rowProcessorChain$delegate", "sectionInterfaceProcessorChain", "getSectionInterfaceProcessorChain", "sectionInterfaceProcessorChain$delegate", "sectionProcessorChain", "getSectionProcessorChain", "sectionProcessorChain$delegate", "shieldSectionManager", "Lcom/dianping/shield/manager/ShieldSectionManager;", "getShieldSectionManager", "()Lcom/dianping/shield/manager/ShieldSectionManager;", "setShieldSectionManager", "(Lcom/dianping/shield/manager/ShieldSectionManager;)V", "waterfallMarginProcessorChain", "getWaterfallMarginProcessorChain", "waterfallMarginProcessorChain$delegate", "addProcessor", "", "key", "", "processor", "getLoadingAndLoadingMoreCreator", "getProcessor", "initProcessor", "processShieldNode", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "processShieldRow", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "processShieldSection", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldPreload", "shieldRecycle", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ProcessorHolder extends AbstractProcessorHolder<Processor> implements ShieldProcessingUnit, ShieldPreloadInterface {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ProcessorHolder.class), "cellProcessorChain", "getCellProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "sectionProcessorChain", "getSectionProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "rowProcessorChain", "getRowProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "nodeProcessorChain", "getNodeProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "dividerProcessorChain", "getDividerProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "waterfallMarginProcessorChain", "getWaterfallMarginProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "cellInterfaceProcessorChain", "getCellInterfaceProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "sectionInterfaceProcessorChain", "getSectionInterfaceProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "rowInterfaceProcessorChain", "getRowInterfaceProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "headerInterfaceProcessorChain", "getHeaderInterfaceProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;")), u.a(new s(u.a(ProcessorHolder.class), "footerInterfaceProcessorChain", "getFooterInterfaceProcessorChain()Lcom/dianping/shield/node/processor/ProcessorChain;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d cellInterfaceProcessorChain$delegate;
    @NotNull
    private final d cellProcessorChain$delegate;
    @Nullable
    private LoadingAndLoadingMoreCreator creator;
    @NotNull
    private final d dividerProcessorChain$delegate;
    @NotNull
    private DividerThemePackage dividerThemePackage;
    @NotNull
    private final d footerInterfaceProcessorChain$delegate;
    @Nullable
    private IScreenVisibleExposeEdge globalScreenVisibleExposeProxy;
    @NotNull
    private final d headerInterfaceProcessorChain$delegate;
    @NotNull
    private ExposeMoveStatusEventInfoHolder infoHolder;
    @NotNull
    private final Context mContext;
    private final d nodeProcessorChain$delegate;
    @NotNull
    private final d rowInterfaceProcessorChain$delegate;
    private final d rowProcessorChain$delegate;
    @NotNull
    private final d sectionInterfaceProcessorChain$delegate;
    private final d sectionProcessorChain$delegate;
    @NotNull
    private ShieldSectionManager shieldSectionManager;
    @NotNull
    private final d waterfallMarginProcessorChain$delegate;

    private final ProcessorChain getNodeProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "000d19c062eb6c44941ebf08405b7db0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "000d19c062eb6c44941ebf08405b7db0") : this.nodeProcessorChain$delegate.a());
    }

    private final ProcessorChain getRowProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "487ed077686ba6148e3a8bacec694b09", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "487ed077686ba6148e3a8bacec694b09") : this.rowProcessorChain$delegate.a());
    }

    private final ProcessorChain getSectionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43697412e98edb246661d0f989f7414e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43697412e98edb246661d0f989f7414e") : this.sectionProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getCellInterfaceProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc6b5abaa40c7649f6b6d041f3032b67", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc6b5abaa40c7649f6b6d041f3032b67") : this.cellInterfaceProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getCellProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac69f6832266ff70e11ae18bc2580bf9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac69f6832266ff70e11ae18bc2580bf9") : this.cellProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getDividerProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b15ccde78958ed3f1e4c34e0531de365", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b15ccde78958ed3f1e4c34e0531de365") : this.dividerProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getFooterInterfaceProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9725720ca7c820fc438934e514074a87", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9725720ca7c820fc438934e514074a87") : this.footerInterfaceProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getHeaderInterfaceProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9958cd7b67681065c2674fb87fc9d274", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9958cd7b67681065c2674fb87fc9d274") : this.headerInterfaceProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getRowInterfaceProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fca9308e9fa41d310b5fe2a1717155e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fca9308e9fa41d310b5fe2a1717155e") : this.rowInterfaceProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getSectionInterfaceProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cfe621b084545772d48c839664a8c17", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cfe621b084545772d48c839664a8c17") : this.sectionInterfaceProcessorChain$delegate.a());
    }

    @NotNull
    public final ProcessorChain getWaterfallMarginProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ProcessorChain) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38af9b3606aab36088b34353af012060", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38af9b3606aab36088b34353af012060") : this.waterfallMarginProcessorChain$delegate.a());
    }

    public ProcessorHolder(@NotNull Context context) {
        h.b(context, "mContext");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a8f78f95f1f0e20d7412112bc5943c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a8f78f95f1f0e20d7412112bc5943c5");
            return;
        }
        this.mContext = context;
        this.shieldSectionManager = new ShieldSectionManager(this);
        this.dividerThemePackage = new DividerThemePackage(this.mContext);
        this.infoHolder = new ExposeMoveStatusEventInfoHolder();
        this.cellProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$cellProcessorChain$2(this));
        this.sectionProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$sectionProcessorChain$2(this));
        this.rowProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$rowProcessorChain$2(this));
        this.nodeProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$nodeProcessorChain$2(this));
        this.dividerProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$dividerProcessorChain$2(this));
        this.waterfallMarginProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$waterfallMarginProcessorChain$2(this));
        this.cellInterfaceProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$cellInterfaceProcessorChain$2(this));
        this.sectionInterfaceProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$sectionInterfaceProcessorChain$2(this));
        this.rowInterfaceProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$rowInterfaceProcessorChain$2(this));
        this.headerInterfaceProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$headerInterfaceProcessorChain$2(this));
        this.footerInterfaceProcessorChain$delegate = e.a(kotlin.i.NONE, new ProcessorHolder$footerInterfaceProcessorChain$2(this));
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final ShieldSectionManager getShieldSectionManager() {
        return this.shieldSectionManager;
    }

    public final void setShieldSectionManager(@NotNull ShieldSectionManager shieldSectionManager) {
        Object[] objArr = {shieldSectionManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdc9799762a39e8b45e5e8b3a045bdca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdc9799762a39e8b45e5e8b3a045bdca");
            return;
        }
        h.b(shieldSectionManager, "<set-?>");
        this.shieldSectionManager = shieldSectionManager;
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getCreator() {
        return this.creator;
    }

    public final void setCreator(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.creator = loadingAndLoadingMoreCreator;
    }

    @NotNull
    public final DividerThemePackage getDividerThemePackage() {
        return this.dividerThemePackage;
    }

    public final void setDividerThemePackage(@NotNull DividerThemePackage dividerThemePackage) {
        Object[] objArr = {dividerThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d39377f3ccd7a14efa04aebdecd584b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d39377f3ccd7a14efa04aebdecd584b");
            return;
        }
        h.b(dividerThemePackage, "<set-?>");
        this.dividerThemePackage = dividerThemePackage;
    }

    @NotNull
    public final ExposeMoveStatusEventInfoHolder getInfoHolder() {
        return this.infoHolder;
    }

    public final void setInfoHolder(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder) {
        Object[] objArr = {exposeMoveStatusEventInfoHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85a233feebbfed9050ea495482f3198e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85a233feebbfed9050ea495482f3198e");
            return;
        }
        h.b(exposeMoveStatusEventInfoHolder, "<set-?>");
        this.infoHolder = exposeMoveStatusEventInfoHolder;
    }

    @Nullable
    public final IScreenVisibleExposeEdge getGlobalScreenVisibleExposeProxy() {
        return this.globalScreenVisibleExposeProxy;
    }

    public final void setGlobalScreenVisibleExposeProxy(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.globalScreenVisibleExposeProxy = iScreenVisibleExposeEdge;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.processor.AbstractProcessorHolder
    @Nullable
    public final Processor initProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "766511d2ca17705182d421acfb9c10cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Processor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "766511d2ca17705182d421acfb9c10cb");
        }
        h.b(obj, "key");
        if (h.a(obj, RowDividerProcessor.class)) {
            return new RowDividerProcessor(this.dividerThemePackage);
        }
        if (h.a(obj, HeaderGapProcessor.class)) {
            return new HeaderGapProcessor(this.mContext, this.dividerThemePackage);
        }
        if (h.a(obj, FooterGapProcessor.class)) {
            return new FooterGapProcessor(this.mContext, this.dividerThemePackage);
        }
        if (h.a(obj, SectionDividerShowTypeProcessor.class)) {
            return new SectionDividerShowTypeProcessor();
        }
        if (h.a(obj, StaggeredGridMarginProcessor.class)) {
            return new StaggeredGridMarginProcessor();
        }
        if (h.a(obj, BaseDisplayNodeProcessor.class)) {
            return new BaseDisplayNodeProcessor();
        }
        if (h.a(obj, ClickDisplayNodeProcessor.class)) {
            return new ClickDisplayNodeProcessor();
        }
        if (h.a(obj, DisplayNodeHotZoneProcessor.class)) {
            return new DisplayNodeHotZoneProcessor();
        }
        if (h.a(obj, DisplayNodeRowAppearanceProcessor.class)) {
            return new DisplayNodeRowAppearanceProcessor();
        }
        if (h.a(obj, DisplayNodeExposeProcessor.class)) {
            return new DisplayNodeExposeProcessor(this.infoHolder);
        }
        if (h.a(obj, BaseRowNodeProcessor.class)) {
            return new BaseRowNodeProcessor();
        }
        if (h.a(obj, RowExtraInfosProcessor.class)) {
            return new RowExtraInfosProcessor();
        }
        if (h.a(obj, RowNodeHotZoneProcessor.class)) {
            return new RowNodeHotZoneProcessor();
        }
        if (h.a(obj, RowSectionAppearanceProcessor.class)) {
            return new RowSectionAppearanceProcessor();
        }
        if (h.a(obj, RowNodeMoveStatusProcessor.class)) {
            return new RowNodeMoveStatusProcessor();
        }
        if (h.a(obj, RowNodeMappingProcessor.class)) {
            return new RowNodeMappingProcessor();
        }
        if (h.a(obj, LinkTypeSectionNodeProcessor.class)) {
            return new LinkTypeSectionNodeProcessor();
        }
        if (h.a(obj, NormalSectionNodeProcessor.class)) {
            return new NormalSectionNodeProcessor();
        }
        if (h.a(obj, SectionExtraInfosNodeProcessor.class)) {
            return new SectionExtraInfosNodeProcessor();
        }
        if (h.a(obj, ExtraSectionNodeProcessor.class)) {
            return new ExtraSectionNodeProcessor();
        }
        if (h.a(obj, RangeSectionNodeProcessor.class)) {
            return new RangeSectionNodeProcessor();
        }
        if (h.a(obj, SectionCellAppearanceProcessor.class)) {
            return new SectionCellAppearanceProcessor();
        }
        if (h.a(obj, SectionNodeMappingProcessor.class)) {
            return new SectionNodeMappingProcessor();
        }
        if (h.a(obj, CellExtraInfosNodeProcessor.class)) {
            return new CellExtraInfosNodeProcessor();
        }
        if (h.a(obj, CellStatusMoreNodeProcessor.class)) {
            return new CellStatusMoreNodeProcessor();
        }
        if (h.a(obj, CellStatusNodeProcessor.class)) {
            return new CellStatusNodeProcessor();
        }
        if (h.a(obj, NormalCellNodeProcessor.class)) {
            return new NormalCellNodeProcessor();
        }
        if (h.a(obj, CellNodeExposeProcessor.class)) {
            return new CellNodeExposeProcessor(this.infoHolder);
        }
        if (h.a(obj, CellMoveStatusNodeProcessor.class)) {
            return new CellMoveStatusNodeProcessor();
        }
        if (h.a(obj, CellNodeMappingProcessor.class)) {
            return new CellNodeMappingProcessor();
        }
        if (h.a(obj, DividerInfoInterfaceProcessor.class)) {
            return new DividerInfoInterfaceProcessor();
        }
        if (h.a(obj, DividerInterfaceProcessor.class)) {
            return new DividerInterfaceProcessor();
        }
        if (h.a(obj, NormalRowInterfaceProcessor.class)) {
            return new NormalRowInterfaceProcessor();
        }
        if (h.a(obj, RowExposeProcessor.class)) {
            return new RowExposeProcessor();
        }
        if (h.a(obj, HeaderRowExposeProcessor.class)) {
            return new HeaderRowExposeProcessor();
        }
        if (h.a(obj, FooterRowExposeProcessor.class)) {
            return new FooterRowExposeProcessor();
        }
        if (h.a(obj, SetTopInterfaceProcessor.class)) {
            return new SetTopInterfaceProcessor();
        }
        if (h.a(obj, SetBottomInterfaceProcessor.class)) {
            return new SetBottomInterfaceProcessor();
        }
        if (h.a(obj, HeaderSetTopInterfaceProcessor.class)) {
            return new HeaderSetTopInterfaceProcessor();
        }
        if (h.a(obj, HeaderSetBottomInterfaceProcessor.class)) {
            return new HeaderSetBottomInterfaceProcessor();
        }
        if (h.a(obj, FooterSetTopInterfaceProcessor.class)) {
            return new FooterSetTopInterfaceProcessor();
        }
        if (h.a(obj, FooterSetBottomInterfaceProcessor.class)) {
            return new FooterSetBottomInterfaceProcessor();
        }
        if (h.a(obj, RowMoveStatusInterfaceProcessor.class)) {
            return new RowMoveStatusInterfaceProcessor();
        }
        if (h.a(obj, DividerShowTypeInterfaceProcessor.class)) {
            return new DividerShowTypeInterfaceProcessor();
        }
        if (h.a(obj, ExtraCellInterfaceProcessor.class)) {
            return new ExtraCellInterfaceProcessor(this);
        }
        if (h.a(obj, LinkTypeIntefaceProcessor.class)) {
            return new LinkTypeIntefaceProcessor(this.mContext);
        }
        if (h.a(obj, NormalSectionInterfaceProcessor.class)) {
            return new NormalSectionInterfaceProcessor(this);
        }
        if (h.a(obj, SectionDividerInfoInterfaceProcessor.class)) {
            return new SectionDividerInfoInterfaceProcessor();
        }
        if (h.a(obj, CellStatusInterfaceProcessor.class)) {
            return new CellStatusInterfaceProcessor();
        }
        if (h.a(obj, CellStatusMoreInterfaceProcessor.class)) {
            return new CellStatusMoreInterfaceProcessor();
        }
        if (h.a(obj, NormalCellInterfaceProcessor.class)) {
            return new NormalCellInterfaceProcessor(this);
        }
        if (h.a(obj, CellExposeInterfaceProcessor.class)) {
            return new CellExposeInterfaceProcessor();
        }
        if (h.a(obj, CellMoveStatusInterfaceProcessor.class)) {
            return new CellMoveStatusInterfaceProcessor();
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.processor.AbstractProcessorHolder
    @Nullable
    public final Processor getProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad7d6bdb712944eb62406023e6bc8a87", RobustBitConfig.DEFAULT_VALUE)) {
            return (Processor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad7d6bdb712944eb62406023e6bc8a87");
        }
        h.b(obj, "key");
        Processor processor = (Processor) super.getProcessor(obj);
        if (processor instanceof ShieldProcessor) {
            ShieldProcessor shieldProcessor = (ShieldProcessor) processor;
            shieldProcessor.setProcessingUnit(this);
            shieldProcessor.setContext(this.mContext);
            shieldProcessor.setGlobalScreenVisibleExposeProxy(this.globalScreenVisibleExposeProxy);
            processor.nextProcessor = null;
        }
        if (processor instanceof CellInterfaceProcessor) {
            ((CellInterfaceProcessor) processor).setProcessingUnit(this);
        }
        return processor;
    }

    @Override // com.dianping.shield.node.processor.AbstractProcessorHolder
    public final void addProcessor(@NotNull Object obj, @NotNull Processor processor) {
        Object[] objArr = {obj, processor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b915f5483ac0c7d9fbcfb021631ade23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b915f5483ac0c7d9fbcfb021631ade23");
            return;
        }
        h.b(obj, "key");
        h.b(processor, "processor");
        super.addProcessor(obj, (Object) processor);
        if (processor instanceof ShieldProcessor) {
            ShieldProcessor shieldProcessor = (ShieldProcessor) processor;
            shieldProcessor.setProcessingUnit(this);
            shieldProcessor.setContext(this.mContext);
            shieldProcessor.setGlobalScreenVisibleExposeProxy(this.globalScreenVisibleExposeProxy);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.node.processor.ShieldProcessingUnit
    public final void processShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c6ae8f29957fba14a857b22623fe74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c6ae8f29957fba14a857b22623fe74d");
            return;
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        SectionExtension sectionExtension = ExtensionsRegistry.INSTANCE.getSectionExtension(sectionItem.getClass());
        if (sectionExtension != null) {
            ProcessorChain addProcessor = new ProcessorChain(this).addProcessor(SectionExtraInfosNodeProcessor.class);
            addProcessor.addProcessor(sectionExtension);
            addProcessor.addProcessor(LinkTypeSectionNodeProcessor.class).addProcessor(ExtraSectionNodeProcessor.class).addProcessor(RangeSectionNodeProcessor.class).addProcessor(SectionCellAppearanceProcessor.class).addProcessor(SectionNodeMappingProcessor.class).startProcessor(sectionItem, shieldSection);
            return;
        }
        getSectionProcessorChain().startProcessor(sectionItem, shieldSection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.node.processor.ShieldProcessingUnit
    public final void processShieldRow(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7071bf39b3554fd11e570b0034166963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7071bf39b3554fd11e570b0034166963");
            return;
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        RowExtension rowExtension = ExtensionsRegistry.INSTANCE.getRowExtension(rowItem.getClass());
        if (rowExtension != null) {
            ProcessorChain addProcessor = new ProcessorChain(this).addProcessor(RowExtraInfosProcessor.class);
            addProcessor.addProcessor(rowExtension);
            addProcessor.addProcessor(RowNodeHotZoneProcessor.class).addProcessor(RowSectionAppearanceProcessor.class).addProcessor(RowNodeMoveStatusProcessor.class).addProcessor(RowNodeMappingProcessor.class).startProcessor(rowItem, shieldRow);
            return;
        }
        getRowProcessorChain().startProcessor(rowItem, shieldRow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.node.processor.ShieldProcessingUnit
    public final void processShieldNode(@NotNull ViewItem viewItem, @NotNull ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {viewItem, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4388540b66440edf5e9c78671d02d9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4388540b66440edf5e9c78671d02d9e1");
            return;
        }
        h.b(viewItem, "viewItem");
        h.b(shieldDisplayNode, "dNode");
        shieldDisplayNode.pHolder = this;
        NodeExtension nodeExtension = ExtensionsRegistry.INSTANCE.getNodeExtension(viewItem.getClass());
        if (nodeExtension != null) {
            ProcessorChain addProcessor = new ProcessorChain(this).addProcessor(BaseDisplayNodeProcessor.class);
            addProcessor.addProcessor(nodeExtension);
            addProcessor.addProcessor(ClickDisplayNodeProcessor.class).startProcessor(viewItem, shieldDisplayNode);
            return;
        }
        getNodeProcessorChain().startProcessor(viewItem, shieldDisplayNode);
    }

    @Override // com.dianping.shield.node.processor.ShieldProcessingUnit
    @Nullable
    public final LoadingAndLoadingMoreCreator getLoadingAndLoadingMoreCreator() {
        return this.creator;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc80381419888114337462d4a34ce496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc80381419888114337462d4a34ce496");
            return;
        }
        addProcessor(RowDividerProcessor.class, (Processor) new RowDividerProcessor(this.dividerThemePackage));
        addProcessor(HeaderGapProcessor.class, (Processor) new HeaderGapProcessor(this.mContext, this.dividerThemePackage));
        addProcessor(FooterGapProcessor.class, (Processor) new FooterGapProcessor(this.mContext, this.dividerThemePackage));
        addProcessor(SectionDividerShowTypeProcessor.class, (Processor) new SectionDividerShowTypeProcessor());
        addProcessor(BaseDisplayNodeProcessor.class, (Processor) new BaseDisplayNodeProcessor());
        addProcessor(ClickDisplayNodeProcessor.class, (Processor) new ClickDisplayNodeProcessor());
        addProcessor(DisplayNodeHotZoneProcessor.class, (Processor) new DisplayNodeHotZoneProcessor());
        addProcessor(DisplayNodeRowAppearanceProcessor.class, (Processor) new DisplayNodeRowAppearanceProcessor());
        addProcessor(DisplayNodeExposeProcessor.class, (Processor) new DisplayNodeExposeProcessor(this.infoHolder));
        addProcessor(BaseRowNodeProcessor.class, (Processor) new BaseRowNodeProcessor());
        addProcessor(RowExtraInfosProcessor.class, (Processor) new RowExtraInfosProcessor());
        addProcessor(RowNodeHotZoneProcessor.class, (Processor) new RowNodeHotZoneProcessor());
        addProcessor(RowSectionAppearanceProcessor.class, (Processor) new RowSectionAppearanceProcessor());
        addProcessor(RowNodeMoveStatusProcessor.class, (Processor) new RowNodeMoveStatusProcessor());
        addProcessor(RowNodeMappingProcessor.class, (Processor) new RowNodeMappingProcessor());
        addProcessor(LinkTypeSectionNodeProcessor.class, (Processor) new LinkTypeSectionNodeProcessor());
        addProcessor(NormalSectionNodeProcessor.class, (Processor) new NormalSectionNodeProcessor());
        addProcessor(SectionExtraInfosNodeProcessor.class, (Processor) new SectionExtraInfosNodeProcessor());
        addProcessor(ExtraSectionNodeProcessor.class, (Processor) new ExtraSectionNodeProcessor());
        addProcessor(RangeSectionNodeProcessor.class, (Processor) new RangeSectionNodeProcessor());
        addProcessor(SectionCellAppearanceProcessor.class, (Processor) new SectionCellAppearanceProcessor());
        addProcessor(SectionNodeMappingProcessor.class, (Processor) new SectionNodeMappingProcessor());
        addProcessor(CellExtraInfosNodeProcessor.class, (Processor) new CellExtraInfosNodeProcessor());
        addProcessor(CellStatusMoreNodeProcessor.class, (Processor) new CellStatusMoreNodeProcessor());
        addProcessor(CellStatusNodeProcessor.class, (Processor) new CellStatusNodeProcessor());
        addProcessor(NormalCellNodeProcessor.class, (Processor) new NormalCellNodeProcessor());
        addProcessor(CellNodeExposeProcessor.class, (Processor) new CellNodeExposeProcessor(this.infoHolder));
        addProcessor(CellMoveStatusNodeProcessor.class, (Processor) new CellMoveStatusNodeProcessor());
        addProcessor(CellNodeMappingProcessor.class, (Processor) new CellNodeMappingProcessor());
        addProcessor(DividerInfoInterfaceProcessor.class, (Processor) new DividerInfoInterfaceProcessor());
        addProcessor(DividerInterfaceProcessor.class, (Processor) new DividerInterfaceProcessor());
        addProcessor(NormalRowInterfaceProcessor.class, (Processor) new NormalRowInterfaceProcessor());
        addProcessor(RowExposeProcessor.class, (Processor) new RowExposeProcessor());
        addProcessor(HeaderRowExposeProcessor.class, (Processor) new HeaderRowExposeProcessor());
        addProcessor(FooterRowExposeProcessor.class, (Processor) new FooterRowExposeProcessor());
        addProcessor(SetTopInterfaceProcessor.class, (Processor) new SetTopInterfaceProcessor());
        addProcessor(SetBottomInterfaceProcessor.class, (Processor) new SetBottomInterfaceProcessor());
        addProcessor(HeaderSetTopInterfaceProcessor.class, (Processor) new HeaderSetTopInterfaceProcessor());
        addProcessor(HeaderSetBottomInterfaceProcessor.class, (Processor) new HeaderSetBottomInterfaceProcessor());
        addProcessor(FooterSetTopInterfaceProcessor.class, (Processor) new FooterSetTopInterfaceProcessor());
        addProcessor(FooterSetBottomInterfaceProcessor.class, (Processor) new FooterSetBottomInterfaceProcessor());
        addProcessor(RowMoveStatusInterfaceProcessor.class, (Processor) new RowMoveStatusInterfaceProcessor());
        addProcessor(DividerShowTypeInterfaceProcessor.class, (Processor) new DividerShowTypeInterfaceProcessor());
        addProcessor(ExtraCellInterfaceProcessor.class, (Processor) new ExtraCellInterfaceProcessor(this));
        addProcessor(LinkTypeIntefaceProcessor.class, (Processor) new LinkTypeIntefaceProcessor(this.mContext));
        addProcessor(NormalSectionInterfaceProcessor.class, (Processor) new NormalSectionInterfaceProcessor(this));
        addProcessor(SectionDividerInfoInterfaceProcessor.class, (Processor) new SectionDividerInfoInterfaceProcessor());
        addProcessor(CellStatusInterfaceProcessor.class, (Processor) new CellStatusInterfaceProcessor());
        addProcessor(CellStatusMoreInterfaceProcessor.class, (Processor) new CellStatusMoreInterfaceProcessor());
        addProcessor(NormalCellInterfaceProcessor.class, (Processor) new NormalCellInterfaceProcessor(this));
        addProcessor(CellExposeInterfaceProcessor.class, (Processor) new CellExposeInterfaceProcessor());
        addProcessor(CellMoveStatusInterfaceProcessor.class, (Processor) new CellMoveStatusInterfaceProcessor());
        addProcessor(LoadingSectionProcessor.class, (Processor) new LoadingSectionProcessor());
        addProcessor(LoadingMoreSectionProcessor.class, (Processor) new LoadingMoreSectionProcessor());
        addProcessor(StaggeredGridSectionNodeProcessor.class, (Processor) new StaggeredGridSectionNodeProcessor());
        getCellProcessorChain();
        getSectionProcessorChain();
        getRowProcessorChain();
        getNodeProcessorChain();
        getDividerProcessorChain();
        getCellInterfaceProcessorChain();
        getSectionInterfaceProcessorChain();
        getRowInterfaceProcessorChain();
        getHeaderInterfaceProcessorChain();
        getFooterInterfaceProcessorChain();
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f0ed2c510565189362b3aed02cfc3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f0ed2c510565189362b3aed02cfc3b9");
            return;
        }
        this.shieldSectionManager.shieldRecycle();
        this.infoHolder.shieldRecycle();
        this.dividerThemePackage.reset();
        this.creator = null;
    }
}
