package com.dianping.shield.node.processor.legacy.section;

import android.graphics.Rect;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ai;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.ExtraCellMoveStatusInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.callback.legacy.LegacyFooterPaintingCallback;
import com.dianping.shield.node.cellnode.callback.legacy.LegacyHeaderPaintingCallback;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/ExtraCellInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "processorHolder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "(Lcom/dianping/shield/node/processor/ProcessorHolder;)V", "handleSectionItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtraCellInterfaceProcessor extends SectionInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ProcessorHolder processorHolder;

    public ExtraCellInterfaceProcessor(@NotNull ProcessorHolder processorHolder) {
        h.b(processorHolder, "processorHolder");
        Object[] objArr = {processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8508373d1222563a95f1e338bb578b18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8508373d1222563a95f1e338bb578b18");
        } else {
            this.processorHolder = processorHolder;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.section.SectionInterfaceProcessor
    public final boolean handleSectionItem(@NotNull final af afVar, @NotNull SectionItem sectionItem, final int i) {
        Object[] objArr = {afVar, sectionItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d3333006dfd0747222674b02c7533e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d3333006dfd0747222674b02c7533e")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(sectionItem, "sectionItem");
        if (afVar instanceof ai) {
            ai aiVar = (ai) afVar;
            if (aiVar.hasHeaderForSection(i)) {
                RowItem rowItem = new RowItem(NodeCreator.Companion.geneLegacyRowId(afVar, i, CellType.HEADER));
                rowItem.viewItems = new ArrayList<>();
                ArrayList<ViewItem> arrayList = rowItem.viewItems;
                ViewItem viewItem = new ViewItem(NodeCreator.Companion.geneLegacyViewId(afVar, i, CellType.HEADER));
                viewItem.viewType = "headercell*" + aiVar.getHeaderViewType(i);
                viewItem.viewPaintingCallback = new LegacyHeaderPaintingCallback(aiVar);
                arrayList.add(viewItem);
                rowItem.showCellTopDivider = aiVar.hasTopDividerForHeader(i);
                rowItem.showCellBottomDivider = aiVar.hasBottomDividerForHeader(i);
                if (rowItem.dividerStyle == null) {
                    rowItem.dividerStyle = new DividerStyle();
                    r rVar = r.a;
                }
                float headerDividerOffset = aiVar.getHeaderDividerOffset(i);
                if (headerDividerOffset >= 0.0f) {
                    rowItem.dividerStyle.cellBottomLineOffset = new Rect((int) headerDividerOffset, 0, 0, 0);
                }
                this.processorHolder.getHeaderInterfaceProcessorChain().startProcessor(afVar, rowItem, Integer.valueOf(i), -1);
                sectionItem.headerRowItem = rowItem;
                if (afVar instanceof ExtraCellMoveStatusInterface) {
                    RowItem rowItem2 = sectionItem.headerRowItem;
                    MoveStatusInfo moveStatusInfo = sectionItem.headerRowItem.moveStatusInfo;
                    if (moveStatusInfo == null) {
                        moveStatusInfo = new MoveStatusInfo();
                    }
                    rowItem2.moveStatusInfo = moveStatusInfo;
                    sectionItem.headerRowItem.moveStatusInfo.moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.node.processor.legacy.section.ExtraCellInterfaceProcessor$handleSectionItem$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                        public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                            CellType cellType;
                            Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e189ebc0e94dd487ee1d63762b4c494", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e189ebc0e94dd487ee1d63762b4c494");
                                return;
                            }
                            h.b(exposeScope, Constants.PARAM_SCOPE);
                            h.b(scrollDirection, "direction");
                            ExtraCellMoveStatusInterface extraCellMoveStatusInterface = (ExtraCellMoveStatusInterface) af.this;
                            int i2 = nodePath != null ? nodePath.section : i;
                            if (nodePath == null || (cellType = nodePath.cellType) == null) {
                                cellType = CellType.HEADER;
                            }
                            extraCellMoveStatusInterface.onAppear(exposeScope, scrollDirection, i2, cellType);
                        }

                        @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                        public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                            CellType cellType;
                            Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c03de14f13ecdf60933a9bb3f58b0833", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c03de14f13ecdf60933a9bb3f58b0833");
                                return;
                            }
                            h.b(exposeScope, Constants.PARAM_SCOPE);
                            h.b(scrollDirection, "direction");
                            ExtraCellMoveStatusInterface extraCellMoveStatusInterface = (ExtraCellMoveStatusInterface) af.this;
                            int i2 = nodePath != null ? nodePath.section : i;
                            if (nodePath == null || (cellType = nodePath.cellType) == null) {
                                cellType = CellType.HEADER;
                            }
                            extraCellMoveStatusInterface.onDisappear(exposeScope, scrollDirection, i2, cellType);
                        }
                    };
                }
            }
            if (aiVar.hasFooterForSection(i)) {
                RowItem rowItem3 = new RowItem(NodeCreator.Companion.geneLegacyRowId(afVar, i, CellType.FOOTER));
                rowItem3.viewItems = new ArrayList<>();
                ArrayList<ViewItem> arrayList2 = rowItem3.viewItems;
                ViewItem viewItem2 = new ViewItem(NodeCreator.Companion.geneLegacyViewId(afVar, i, CellType.FOOTER));
                viewItem2.viewType = "footercell*" + aiVar.getFooterViewType(i);
                viewItem2.viewPaintingCallback = new LegacyFooterPaintingCallback(aiVar);
                arrayList2.add(viewItem2);
                rowItem3.showCellBottomDivider = aiVar.hasBottomDividerForFooter(i);
                if (rowItem3.dividerStyle == null) {
                    rowItem3.dividerStyle = new DividerStyle();
                    r rVar2 = r.a;
                }
                float footerDividerOffset = aiVar.getFooterDividerOffset(i);
                if (footerDividerOffset >= 0.0f) {
                    rowItem3.dividerStyle.bottomStyleLineOffset = new Rect((int) footerDividerOffset, 0, 0, 0);
                }
                this.processorHolder.getFooterInterfaceProcessorChain().startProcessor(afVar, rowItem3, Integer.valueOf(i), -2);
                sectionItem.footerRowItem = rowItem3;
                if (afVar instanceof ExtraCellMoveStatusInterface) {
                    RowItem rowItem4 = sectionItem.footerRowItem;
                    MoveStatusInfo moveStatusInfo2 = sectionItem.footerRowItem.moveStatusInfo;
                    if (moveStatusInfo2 == null) {
                        moveStatusInfo2 = new MoveStatusInfo();
                    }
                    rowItem4.moveStatusInfo = moveStatusInfo2;
                    sectionItem.footerRowItem.moveStatusInfo.moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.node.processor.legacy.section.ExtraCellInterfaceProcessor$handleSectionItem$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                        public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                            CellType cellType;
                            Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "02030edb15cee3f2272a40c53f389d20", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "02030edb15cee3f2272a40c53f389d20");
                                return;
                            }
                            h.b(exposeScope, Constants.PARAM_SCOPE);
                            h.b(scrollDirection, "direction");
                            ExtraCellMoveStatusInterface extraCellMoveStatusInterface = (ExtraCellMoveStatusInterface) af.this;
                            int i2 = nodePath != null ? nodePath.section : i;
                            if (nodePath == null || (cellType = nodePath.cellType) == null) {
                                cellType = CellType.FOOTER;
                            }
                            extraCellMoveStatusInterface.onAppear(exposeScope, scrollDirection, i2, cellType);
                        }

                        @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                        public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                            CellType cellType;
                            Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8600bfe566ba84ae2f6054131ae3e395", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8600bfe566ba84ae2f6054131ae3e395");
                                return;
                            }
                            h.b(exposeScope, Constants.PARAM_SCOPE);
                            h.b(scrollDirection, "direction");
                            ExtraCellMoveStatusInterface extraCellMoveStatusInterface = (ExtraCellMoveStatusInterface) af.this;
                            int i2 = nodePath != null ? nodePath.section : i;
                            if (nodePath == null || (cellType = nodePath.cellType) == null) {
                                cellType = CellType.FOOTER;
                            }
                            extraCellMoveStatusInterface.onDisappear(exposeScope, scrollDirection, i2, cellType);
                        }
                    };
                }
            }
        }
        return false;
    }
}
