package com.dianping.shield.dynamic.diff.cell;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.View;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.normal.NormalCellActionInfo;
import com.dianping.shield.component.extensions.normal.NormalConstant;
import com.dianping.shield.component.extensions.normal.NormalRowItem;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.widgets.container.IPageContainerFunc;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom;
import com.dianping.shield.dynamic.diff.NormalViewInfoDiffCustom;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.NormalCellInfo;
import com.dianping.shield.dynamic.model.extra.ActionsConfigurationInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.ContextualAction;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002JI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00032\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u0002H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/NormalCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/CommonContainerInfoDiffCustom;", "Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;", "Lcom/dianping/shield/component/extensions/normal/NormalRowItem;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "actionScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "createComputingItem", "createViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", DMKeys.KEY_VIEW_INFO, "diffChildren", "", "newInfo", "computingItem", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;Lcom/dianping/shield/component/extensions/normal/NormalRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "generateActionCallBackJson", "Lorg/json/JSONObject;", "contextualActionId", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "getActionsConfigurationInfo", "actionsConfigurationInfo", "Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;", "getArrowLeftMargin", "getArrowRightMargin", "getIconBitmap", "Landroid/graphics/Bitmap;", "iconBase64", "", "getNormalSuggestWidth", "getRowViewItem", "resetProps", "updateProps", "info", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalCellInfoDiff extends CommonContainerInfoDiffCustom<NormalCellInfo, NormalRowItem> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_ARROW_LEFT_MARGIN = 7;
    private static final String DEFAULT_MT_COLOR = "#FF06C1AE";
    private static final int ROW_ARROW_WIDTH = 7;
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecyclerView.k actionScrollListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76b3abb134b38a34fb1134554391e8dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76b3abb134b38a34fb1134554391e8dc");
        }
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((NormalCellInfo) diffableInfo, (NormalRowItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(CellInfo.BaseCellInfo baseCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((NormalCellInfo) baseCellInfo, (NormalRowItem) rowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/NormalCellInfoDiff$Companion;", "", "()V", "DEFAULT_ARROW_LEFT_MARGIN", "", "DEFAULT_MT_COLOR", "", "ROW_ARROW_WIDTH", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final NormalRowItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "515b0a4fca84cf93418308ed647956ce", RobustBitConfig.DEFAULT_VALUE) ? (NormalRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "515b0a4fca84cf93418308ed647956ce") : new NormalRowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
        if (r14 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void diffChildren(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.NormalCellInfo r10, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.normal.NormalRowItem r11, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r12, @org.jetbrains.annotations.Nullable java.lang.Integer r13, @org.jetbrains.annotations.Nullable java.lang.Integer r14) {
        /*
            r9 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            r1 = 1
            r0[r1] = r11
            r1 = 2
            r0[r1] = r12
            r1 = 3
            r0[r1] = r13
            r13 = 4
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff.changeQuickRedirect
            java.lang.String r14 = "e7af066658c74e6e3ede75da0e1e0643"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r9
            r3 = r13
            r5 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r13, r8, r14)
            return
        L27:
            java.lang.String r13 = "newInfo"
            kotlin.jvm.internal.h.b(r10, r13)
            java.lang.String r13 = "computingItem"
            kotlin.jvm.internal.h.b(r11, r13)
            java.lang.String r13 = "diffResult"
            kotlin.jvm.internal.h.b(r12, r13)
            r1 = r10
            com.dianping.shield.dynamic.model.cell.CellInfo$BaseCellInfo r1 = (com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo) r1
            r2 = r11
            com.dianping.shield.node.useritem.RowItem r2 = (com.dianping.shield.node.useritem.RowItem) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r0 = r9
            r3 = r12
            super.diffChildren(r1, r2, r3, r4, r5)
            r13 = r10
            com.dianping.shield.dynamic.model.DiffableInfo r13 = (com.dianping.shield.dynamic.model.DiffableInfo) r13
            int r10 = r9.getNormalSuggestWidth(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r14 = r13.getIdentifier()
            r0 = 0
            if (r14 == 0) goto L7c
            java.util.HashMap r1 = r9.getViewIdMap()
            java.lang.Object r14 = r1.get(r14)
            boolean r1 = r14 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r1 != 0) goto L68
            r14 = r0
        L68:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r14
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
            if (r14 != 0) goto L7a
            r14 = r13
            com.dianping.shield.dynamic.model.cell.NormalCellInfo r14 = (com.dianping.shield.dynamic.model.cell.NormalCellInfo) r14
            r1 = r9
            com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff r1 = (com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff) r1
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = r1.createViewItem(r14)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
        L7a:
            if (r14 != 0) goto L88
        L7c:
            r14 = r13
            com.dianping.shield.dynamic.model.cell.NormalCellInfo r14 = (com.dianping.shield.dynamic.model.cell.NormalCellInfo) r14
            r1 = r9
            com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff r1 = (com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff) r1
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r14 = r1.createViewItem(r14)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r14 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r14
        L88:
            r14.diff(r13, r12, r10, r0)
            if (r14 == 0) goto L93
            com.dianping.shield.node.useritem.ViewItem r14 = (com.dianping.shield.node.useritem.ViewItem) r14
            r11.addViewItem(r14)
            return
        L93:
            kotlin.o r10 = new kotlin.o
            java.lang.String r11 = "null cannot be cast to non-null type com.dianping.shield.node.useritem.ViewItem"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff.diffChildren(com.dianping.shield.dynamic.model.cell.NormalCellInfo, com.dianping.shield.component.extensions.normal.NormalRowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187 A[ORIG_RETURN, RETURN] */
    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateProps(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.NormalCellInfo r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff.updateProps(com.dianping.shield.dynamic.model.cell.NormalCellInfo):void");
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47914bcd6d31333714d0f58cf9f72421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47914bcd6d31333714d0f58cf9f72421");
            return;
        }
        super.resetProps();
        DynamicChassisInterface hostChassis = getHostChassis();
        if (!(hostChassis instanceof DynamicAgent)) {
            hostChassis = null;
        }
        DynamicAgent dynamicAgent = (DynamicAgent) hostChassis;
        ab<?> pageContainer = dynamicAgent != null ? dynamicAgent.getPageContainer() : null;
        if (!(pageContainer instanceof IPageContainerFunc)) {
            pageContainer = null;
        }
        IPageContainerFunc iPageContainerFunc = (IPageContainerFunc) pageContainer;
        if (iPageContainerFunc != null) {
            iPageContainerFunc.removeScrollListener(this.actionScrollListener);
        }
    }

    private final void getActionsConfigurationInfo(ActionsConfigurationInfo actionsConfigurationInfo) {
        Object[] objArr = {actionsConfigurationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72da4ef82216ee2822f8911b3e6840f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72da4ef82216ee2822f8911b3e6840f1");
        } else if (actionsConfigurationInfo != null) {
            for (final ContextualAction contextualAction : actionsConfigurationInfo.getActions()) {
                final NormalCellActionInfo normalCellActionInfo = new NormalCellActionInfo();
                normalCellActionInfo.setTitle(contextualAction.getTitle());
                String backgroundColor = contextualAction.getBackgroundColor();
                if (backgroundColor == null) {
                    backgroundColor = "#CCCCCC";
                }
                normalCellActionInfo.setBackgroundColor(ColorUnionTypeKt.parseColor(backgroundColor));
                String imageBase64 = contextualAction.getImageBase64();
                if (imageBase64 != null) {
                    normalCellActionInfo.setImageBitmap(getIconBitmap(imageBase64));
                }
                normalCellActionInfo.setActionCallBack(new ViewClickCallbackWithData() { // from class: com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff$getActionsConfigurationInfo$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
                    public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
                        JSONObject generateActionCallBackJson;
                        Object[] objArr2 = {view, obj, nodePath};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e2322cc7379d6482329cf59d17a8a634", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e2322cc7379d6482329cf59d17a8a634");
                            return;
                        }
                        h.b(view, Constants.EventType.VIEW);
                        String onAction = ContextualAction.this.getOnAction();
                        if (!(onAction == null || onAction.length() == 0) && (obj instanceof DynamicModuleViewItemData) && (this.getHostChassis() instanceof ICommonHost)) {
                            DynamicChassisInterface hostChassis = this.getHostChassis();
                            if (hostChassis == null) {
                                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.protocols.ICommonHost");
                            }
                            ICommonHost iCommonHost = (ICommonHost) hostChassis;
                            String onAction2 = ContextualAction.this.getOnAction();
                            if (onAction2 == null) {
                                h.a();
                            }
                            Object[] objArr3 = new Object[1];
                            NormalCellInfoDiff normalCellInfoDiff = this;
                            Integer contextualActionId = ContextualAction.this.getContextualActionId();
                            generateActionCallBackJson = normalCellInfoDiff.generateActionCallBackJson(contextualActionId != null ? contextualActionId.intValue() : -1, nodePath);
                            objArr3[0] = generateActionCallBackJson;
                            iCommonHost.callMethod(onAction2, objArr3);
                        }
                        if (NormalConstant.ContextActionStyle.Destructive != normalCellActionInfo.getStyle() || nodePath == null) {
                            return;
                        }
                        DynamicChassisInterface hostChassis2 = this.getHostChassis();
                        if (!(hostChassis2 instanceof HoloAgent)) {
                            hostChassis2 = null;
                        }
                        HoloAgent holoAgent = (HoloAgent) hostChassis2;
                        if (holoAgent != null) {
                            holoAgent.updateAgentCell(ap.REMOVE_ROW, nodePath.section, nodePath.row, 1);
                        }
                    }
                });
                NormalConstant.ContextActionStyle[] valuesCustom = NormalConstant.ContextActionStyle.valuesCustom();
                Integer style = contextualAction.getStyle();
                normalCellActionInfo.setStyle(valuesCustom[style != null ? style.intValue() : 0]);
                ArrayList<NormalCellActionInfo> arrayList = ((NormalRowItem) getDynamicRowItem()).actionInfoList;
                if (arrayList != null) {
                    arrayList.add(normalCellActionInfo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject generateActionCallBackJson(int i, NodePath nodePath) {
        IndexPath indexPath;
        int i2;
        IndexPath indexPath2;
        IndexPath indexPath3;
        Object[] objArr = {Integer.valueOf(i), nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "294ee60d57d5b718053979937c4708fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "294ee60d57d5b718053979937c4708fd");
        }
        JSONObject jSONObject = new JSONObject();
        int i3 = -1;
        if (nodePath != null) {
            try {
                indexPath = nodePath.indexPath;
            } catch (JSONException unused) {
            }
            if (indexPath != null) {
                i2 = indexPath.index;
                jSONObject.put("index", i2);
                jSONObject.put("row", (nodePath != null || (indexPath3 = nodePath.indexPath) == null) ? -1 : indexPath3.row);
                if (nodePath != null && (indexPath2 = nodePath.indexPath) != null) {
                    i3 = indexPath2.section;
                }
                jSONObject.put("section", i3);
                jSONObject.put("contextualActionId", i);
                return jSONObject;
            }
        }
        i2 = -1;
        jSONObject.put("index", i2);
        jSONObject.put("row", (nodePath != null || (indexPath3 = nodePath.indexPath) == null) ? -1 : indexPath3.row);
        if (nodePath != null) {
            i3 = indexPath2.section;
        }
        jSONObject.put("section", i3);
        jSONObject.put("contextualActionId", i);
        return jSONObject;
    }

    private final Bitmap getIconBitmap(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "323ad120f17cf4f84b4d6890debe1fc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "323ad120f17cf4f84b4d6890debe1fc1");
        }
        Matcher matcher = Pattern.compile("data:image/(\\S+?);base64,(\\S+)").matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String str2 = group;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            String str3 = group2;
            if (str3 != null && str3.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                byte[] decode = Base64.decode(group2, 0);
                return a.a(decode, 0, decode.length);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private final DynamicViewItem<NormalCellInfo> createViewItem(NormalCellInfo normalCellInfo) {
        Object[] objArr = {normalCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67e968a5d2e48c49c88434387b830269", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67e968a5d2e48c49c88434387b830269") : new DynamicViewItem<>(new NormalViewInfoDiffCustom(getHostChassis()));
    }

    private final DynamicViewItem<?> getRowViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9014eea053339cba78dc90f96121e79", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9014eea053339cba78dc90f96121e79");
        }
        ArrayList<ViewItem> arrayList = ((NormalRowItem) getDynamicRowItem()).viewItems;
        if (arrayList == null || arrayList.size() <= 0 || !(arrayList.get(0) instanceof DynamicViewItem)) {
            return null;
        }
        ViewItem viewItem = arrayList.get(0);
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        return (DynamicViewItem) viewItem;
    }

    private final int getNormalSuggestWidth(NormalCellInfo normalCellInfo) {
        Object[] objArr = {normalCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66e0f3d580d3e9faad3e7e7884b89aa7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66e0f3d580d3e9faad3e7e7884b89aa7")).intValue();
        }
        int leftMargin = getLeftMargin() + getArrowRightMargin(normalCellInfo);
        Boolean showArrow = normalCellInfo.getShowArrow();
        if (showArrow != null && showArrow.booleanValue()) {
            leftMargin += getArrowLeftMargin() + 7;
        }
        return aq.b(getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(getHostChassis())) - leftMargin;
    }

    private final int getArrowRightMargin(NormalCellInfo normalCellInfo) {
        Object[] objArr = {normalCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9067fbcd909f47923718da118ddcf2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9067fbcd909f47923718da118ddcf2e")).intValue();
        }
        if (h.a(normalCellInfo.getShowArrow(), Boolean.TRUE)) {
            return PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getRightMargin();
        }
        return getRightMargin();
    }

    private final int getArrowLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723561810050c0fe9cc2bcdffcc7726b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723561810050c0fe9cc2bcdffcc7726b")).intValue();
        }
        int rightMargin = getRightMargin();
        if (rightMargin == 0) {
            return 7;
        }
        return rightMargin;
    }
}
