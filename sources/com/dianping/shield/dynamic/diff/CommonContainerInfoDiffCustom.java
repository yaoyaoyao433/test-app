package com.dianping.shield.dynamic.diff;

import android.graphics.drawable.GradientDrawable;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff;
import com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u0014\"\b\b\u0002\u0010\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0017\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\u001bJk\u0010\u001e\u001a\u00020\u0019\"\b\b\u0002\u0010\u0015*\u00020\u00162\u0006\u0010\u001f\u001a\u0002H\u00152\u0006\u0010\u001a\u001a\u00020\u00042\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00140%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010)Jk\u0010*\u001a\u00020\u0019\"\b\b\u0002\u0010\u0015*\u00020\u00162\u0006\u0010+\u001a\u0002H\u00152\u0006\u0010\u001a\u001a\u00020\u00042\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00140%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010)J\u0083\u0001\u0010,\u001a\u00020\u0019\"\b\b\u0002\u0010\u0015*\u00020-2\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u0002H\u0015\u0018\u00010!j\n\u0012\u0004\u0012\u0002H\u0015\u0018\u0001`#2\u0006\u0010\u001a\u001a\u00020\u00042\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00140%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010/J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\fH\u0016J \u00103\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u000104\"\b\b\u0002\u0010\u0015*\u00020-2\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0002H\u0002J%\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00028\u00002\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<¢\u0006\u0002\u0010=J\u0015\u0010>\u001a\u00020\u00192\u0006\u00108\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010?R7\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006@"}, d2 = {"Lcom/dianping/shield/dynamic/diff/CommonContainerInfoDiffCustom;", "T", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "V", "Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;", "Lcom/dianping/shield/dynamic/diff/cell/BaseCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/extra/ExposeInfoDiffProxy;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "mapOnScreen", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getMapOnScreen", "()Ljava/util/HashMap;", "mapOnScreen$delegate", "Lkotlin/Lazy;", "bgMaskMappingFun", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "R", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "id", "bindBgMaskViewItems", "", "computingItem", "(Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;)V", "bindItems", "bindViewItems", "diffBgViewItem", "backgroudView", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "createFunc", "Lkotlin/Function1;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffMaskViewItem", "maskView", "diffViewInfos", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "children", "(Ljava/util/ArrayList;Lcom/dianping/shield/component/extensions/common/CommonContainerRowItem;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "mappingViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "updateContainerRowProps", "cellInfo", "updateExposeProps", "info", "exposeInfo", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "data", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;)V", "updateProps", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CommonContainerInfoDiffCustom<T extends CellInfo.BaseCellInfo, V extends CommonContainerRowItem> extends BaseCellInfoDiff<T, V> implements ExposeInfoDiffProxy {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(CommonContainerInfoDiffCustom.class), "mapOnScreen", "getMapOnScreen()Ljava/util/HashMap;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d mapOnScreen$delegate;

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @NotNull
    public HashMap<String, Long> getMapOnScreen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (HashMap) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfd2ee1dd38bb7014fda9f6f95c1ba0f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfd2ee1dd38bb7014fda9f6f95c1ba0f") : this.mapOnScreen$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public /* bridge */ /* synthetic */ void bindItems(RowItem rowItem) {
        bindItems((CommonContainerInfoDiffCustom<T, V>) ((CommonContainerRowItem) rowItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((CommonContainerInfoDiffCustom<T, V>) ((CommonContainerRowItem) obj));
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public ExposeInfo processExposeInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable MidasInfo midasInfo, @Nullable MGEInfo mGEInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f9aa0cac13b9137edb9fd7156cea3d", RobustBitConfig.DEFAULT_VALUE) ? (ExposeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f9aa0cac13b9137edb9fd7156cea3d") : ExposeInfoDiffProxy.DefaultImpls.processExposeInfo(this, exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public MoveStatusInfo processMoveStatusInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "550eb1189a61eb1454f83091a8e6c87b", RobustBitConfig.DEFAULT_VALUE) ? (MoveStatusInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "550eb1189a61eb1454f83091a8e6c87b") : ExposeInfoDiffProxy.DefaultImpls.processMoveStatusInfo(this, exposeInfo, dynamicModuleViewItemData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((CommonContainerInfoDiffCustom<T, V>) ((CellInfo.BaseCellInfo) diffableInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContainerInfoDiffCustom(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d5b41d54d00570a912046f9c6c2762d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d5b41d54d00570a912046f9c6c2762d");
        } else {
            this.mapOnScreen$delegate = e.a(kotlin.i.NONE, CommonContainerInfoDiffCustom$mapOnScreen$2.INSTANCE);
        }
    }

    public static /* synthetic */ void diffViewInfos$default(CommonContainerInfoDiffCustom commonContainerInfoDiffCustom, ArrayList arrayList, CommonContainerRowItem commonContainerRowItem, ArrayList arrayList2, b bVar, Integer num, Integer num2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: diffViewInfos");
        }
        commonContainerInfoDiffCustom.diffViewInfos(arrayList, commonContainerRowItem, arrayList2, bVar, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? 0 : num2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R extends com.dianping.shield.dynamic.model.view.BaseViewInfo> void diffViewInfos(@org.jetbrains.annotations.Nullable java.util.ArrayList<R> r18, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.CommonContainerRowItem r19, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super R, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<R>> r21, @org.jetbrains.annotations.Nullable java.lang.Integer r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r0 = 6
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r14 = 0
            r13[r14] = r18
            r0 = 1
            r13[r0] = r8
            r0 = 2
            r13[r0] = r9
            r0 = 3
            r13[r0] = r10
            r0 = 4
            r13[r0] = r11
            r0 = 5
            r13[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r5 = com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.changeQuickRedirect
            java.lang.String r6 = "7290759509334c851e82482b2d98d528"
            r3 = 0
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r13
            r1 = r17
            r2 = r5
            r4 = r6
            r14 = r5
            r11 = r6
            r5 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3b
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r7, r14, r0, r11)
            return
        L3b:
            java.lang.String r0 = "computingItem"
            kotlin.jvm.internal.h.b(r8, r0)
            java.lang.String r0 = "diffResult"
            kotlin.jvm.internal.h.b(r9, r0)
            java.lang.String r0 = "createFunc"
            kotlin.jvm.internal.h.b(r10, r0)
            if (r18 == 0) goto Lb1
            r0 = r18
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            com.dianping.shield.dynamic.model.view.BaseViewInfo r1 = (com.dianping.shield.dynamic.model.view.BaseViewInfo) r1
            com.dianping.shield.dynamic.model.DiffableInfo r1 = (com.dianping.shield.dynamic.model.DiffableInfo) r1
            java.lang.String r2 = r1.getIdentifier()
            if (r2 == 0) goto L86
            r3 = r7
            com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom r3 = (com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom) r3
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = r3.mappingViewItem(r2)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
            if (r2 != 0) goto L84
            if (r1 == 0) goto L7c
            java.lang.Object r2 = r10.invoke(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
            goto L84
        L7c:
            kotlin.o r0 = new kotlin.o
            java.lang.String r1 = "null cannot be cast to non-null type T"
            r0.<init>(r1)
            throw r0
        L84:
            if (r2 != 0) goto L8e
        L86:
            if (r1 == 0) goto La8
            java.lang.Object r2 = r10.invoke(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
        L8e:
            if (r1 == 0) goto La0
            r3 = r22
            r2.diff(r1, r9, r3, r12)
            boolean r1 = r2 instanceof com.dianping.shield.node.useritem.ViewItem
            if (r1 != 0) goto L9a
            r2 = 0
        L9a:
            com.dianping.shield.node.useritem.ViewItem r2 = (com.dianping.shield.node.useritem.ViewItem) r2
            r8.addViewItem(r2)
            goto L54
        La0:
            kotlin.o r0 = new kotlin.o
            java.lang.String r1 = "null cannot be cast to non-null type T"
            r0.<init>(r1)
            throw r0
        La8:
            kotlin.o r0 = new kotlin.o
            java.lang.String r1 = "null cannot be cast to non-null type T"
            r0.<init>(r1)
            throw r0
        Lb0:
            return
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.diffViewInfos(java.util.ArrayList, com.dianping.shield.component.extensions.common.CommonContainerRowItem, java.util.ArrayList, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R extends com.dianping.shield.dynamic.model.view.ExtraViewInfo> void diffBgViewItem(@org.jetbrains.annotations.NotNull R r19, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.CommonContainerRowItem r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super R, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<R>> r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r0 = 6
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r15 = 0
            r14[r15] = r8
            r0 = 1
            r14[r0] = r9
            r0 = 2
            r14[r0] = r10
            r0 = 3
            r14[r0] = r11
            r0 = 4
            r14[r0] = r12
            r0 = 5
            r14[r0] = r13
            com.meituan.robust.ChangeQuickRedirect r5 = com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.changeQuickRedirect
            java.lang.String r6 = "98647bf93a4332f09ffa1d022700e472"
            r3 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r14
            r1 = r18
            r2 = r5
            r4 = r6
            r15 = r5
            r12 = r6
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3e
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r7, r15, r0, r12)
            return
        L3e:
            java.lang.String r0 = "backgroudView"
            kotlin.jvm.internal.h.b(r8, r0)
            java.lang.String r0 = "computingItem"
            kotlin.jvm.internal.h.b(r9, r0)
            java.lang.String r0 = "diffResult"
            kotlin.jvm.internal.h.b(r10, r0)
            java.lang.String r0 = "createFunc"
            kotlin.jvm.internal.h.b(r11, r0)
            r0 = r8
            com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
            java.lang.String r1 = r0.getIdentifier()
            if (r1 == 0) goto L6c
            r2 = r7
            com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom r2 = (com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.bgMaskMappingFun(r1)
            if (r1 != 0) goto L6a
            java.lang.Object r1 = r11.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r1
        L6a:
            if (r1 != 0) goto L72
        L6c:
            java.lang.Object r1 = r11.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r1
        L72:
            r2 = r1
            r1 = r23
            r2.diff(r0, r10, r1, r13)
            boolean r0 = r2 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r0 != 0) goto L7d
            r2 = 0
        L7d:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r2
            if (r2 == 0) goto L8c
            com.dianping.shield.dynamic.utils.DMConstant$VCViewComputeStep r0 = com.dianping.shield.dynamic.utils.DMConstant.VCViewComputeStep.Second
            r2.setComputingStep(r0)
            com.dianping.shield.node.useritem.ViewItem r2 = (com.dianping.shield.node.useritem.ViewItem) r2
            r9.setBackgroundViewItem(r2)
            return
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.diffBgViewItem(com.dianping.shield.dynamic.model.view.ExtraViewInfo, com.dianping.shield.component.extensions.common.CommonContainerRowItem, java.util.ArrayList, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R extends com.dianping.shield.dynamic.model.view.ExtraViewInfo> void diffMaskViewItem(@org.jetbrains.annotations.NotNull R r19, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.common.CommonContainerRowItem r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super R, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<R>> r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23, @org.jetbrains.annotations.Nullable java.lang.Integer r24) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r0 = 6
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r15 = 0
            r14[r15] = r8
            r0 = 1
            r14[r0] = r9
            r0 = 2
            r14[r0] = r10
            r0 = 3
            r14[r0] = r11
            r0 = 4
            r14[r0] = r12
            r0 = 5
            r14[r0] = r13
            com.meituan.robust.ChangeQuickRedirect r5 = com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.changeQuickRedirect
            java.lang.String r6 = "3f858b1f76bb6ca44f00b7841489995b"
            r3 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r14
            r1 = r18
            r2 = r5
            r4 = r6
            r15 = r5
            r12 = r6
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3e
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r7, r15, r0, r12)
            return
        L3e:
            java.lang.String r0 = "maskView"
            kotlin.jvm.internal.h.b(r8, r0)
            java.lang.String r0 = "computingItem"
            kotlin.jvm.internal.h.b(r9, r0)
            java.lang.String r0 = "diffResult"
            kotlin.jvm.internal.h.b(r10, r0)
            java.lang.String r0 = "createFunc"
            kotlin.jvm.internal.h.b(r11, r0)
            r0 = r8
            com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
            java.lang.String r1 = r0.getIdentifier()
            if (r1 == 0) goto L6c
            r2 = r7
            com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom r2 = (com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.bgMaskMappingFun(r1)
            if (r1 != 0) goto L6a
            java.lang.Object r1 = r11.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r1
        L6a:
            if (r1 != 0) goto L72
        L6c:
            java.lang.Object r1 = r11.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r1
        L72:
            r2 = r1
            r1 = r23
            r2.diff(r0, r10, r1, r13)
            boolean r0 = r2 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r0 != 0) goto L7d
            r2 = 0
        L7d:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r2
            if (r2 == 0) goto L8c
            com.dianping.shield.dynamic.utils.DMConstant$VCViewComputeStep r0 = com.dianping.shield.dynamic.utils.DMConstant.VCViewComputeStep.Second
            r2.setComputingStep(r0)
            com.dianping.shield.node.useritem.ViewItem r2 = (com.dianping.shield.node.useritem.ViewItem) r2
            r9.setMaskViewItem(r2)
            return
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom.diffMaskViewItem(com.dianping.shield.dynamic.model.view.ExtraViewInfo, com.dianping.shield.component.extensions.common.CommonContainerRowItem, java.util.ArrayList, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):void");
    }

    public void bindItems(@Nullable V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe3efbe515adb64b569b57ea82bd46bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe3efbe515adb64b569b57ea82bd46bc");
            return;
        }
        super.bindItems((CommonContainerInfoDiffCustom<T, V>) v);
        bindViewItems(v);
        bindBgMaskViewItems(v);
    }

    private final void bindBgMaskViewItems(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb97445dfaf5e24cd5e99eb62bb83bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb97445dfaf5e24cd5e99eb62bb83bb8");
        } else if (v != null) {
            ViewItem backgroundViewItem = v.getBackgroundViewItem();
            if (!(backgroundViewItem instanceof DynamicViewItem)) {
                backgroundViewItem = null;
            }
            DynamicViewItem dynamicViewItem = (DynamicViewItem) backgroundViewItem;
            if (dynamicViewItem != null) {
                dynamicViewItem.onComputingComplete();
                ((CommonContainerRowItem) getDynamicRowItem()).setBackgroundViewItem(dynamicViewItem);
            }
            ViewItem maskViewItem = v.getMaskViewItem();
            if (!(maskViewItem instanceof DynamicViewItem)) {
                maskViewItem = null;
            }
            DynamicViewItem dynamicViewItem2 = (DynamicViewItem) maskViewItem;
            if (dynamicViewItem2 != null) {
                dynamicViewItem2.onComputingComplete();
                ((CommonContainerRowItem) getDynamicRowItem()).setMaskViewItem(dynamicViewItem2);
            }
        }
    }

    private final void bindViewItems(V v) {
        int i = 0;
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26e0e7b35763316f581726b39bd453fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26e0e7b35763316f581726b39bd453fd");
        } else if (v != null) {
            getViewIdMap().clear();
            ArrayList<ViewItem> arrayList = v.viewItems;
            if (arrayList != null) {
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    ViewItem viewItem = (ViewItem) obj;
                    if (viewItem instanceof DynamicDiff) {
                        DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
                        dynamicDiff.onComputingComplete();
                        String id = dynamicDiff.getId();
                        if (id != null) {
                            getViewIdMap().put(id, viewItem);
                        }
                    }
                    Object obj2 = viewItem.data;
                    if (!(obj2 instanceof DynamicModuleViewItemData)) {
                        obj2 = null;
                    }
                    DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj2;
                    if (dynamicModuleViewItemData != null) {
                        dynamicModuleViewItemData.index = i;
                    }
                    ((CommonContainerRowItem) getDynamicRowItem()).addViewItem(viewItem);
                    i = i2;
                }
            }
        }
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4a246c619cdb3da0f6ddeab38d9f2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4a246c619cdb3da0f6ddeab38d9f2b");
        }
        h.b(str, "identifier");
        ViewItem viewItem = getViewIdMap().get(str);
        if (!(viewItem instanceof IDynamicModuleViewItem)) {
            viewItem = null;
        }
        IDynamicModuleViewItem iDynamicModuleViewItem = (IDynamicModuleViewItem) viewItem;
        if (iDynamicModuleViewItem == null) {
            Object dynamicRowItem = getDynamicRowItem();
            if (!(dynamicRowItem instanceof CommonContainerRowItem)) {
                dynamicRowItem = null;
            }
            CommonContainerRowItem commonContainerRowItem = (CommonContainerRowItem) dynamicRowItem;
            ViewItem backgroundViewItem = commonContainerRowItem != null ? commonContainerRowItem.getBackgroundViewItem() : null;
            if (!(backgroundViewItem instanceof DynamicViewItemsHolderInterface)) {
                backgroundViewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) backgroundViewItem;
            iDynamicModuleViewItem = dynamicViewItemsHolderInterface != null ? dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str) : null;
        }
        if (iDynamicModuleViewItem == null) {
            Object dynamicRowItem2 = getDynamicRowItem();
            if (!(dynamicRowItem2 instanceof CommonContainerRowItem)) {
                dynamicRowItem2 = null;
            }
            CommonContainerRowItem commonContainerRowItem2 = (CommonContainerRowItem) dynamicRowItem2;
            ViewItem maskViewItem = commonContainerRowItem2 != null ? commonContainerRowItem2.getMaskViewItem() : null;
            if (!(maskViewItem instanceof DynamicViewItemsHolderInterface)) {
                maskViewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface2 = (DynamicViewItemsHolderInterface) maskViewItem;
            if (dynamicViewItemsHolderInterface2 != null) {
                return dynamicViewItemsHolderInterface2.findPicassoViewItemByIdentifier(str);
            }
            return null;
        }
        return iDynamicModuleViewItem;
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "737e7fbef4485cd57255293cde529514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "737e7fbef4485cd57255293cde529514");
            return;
        }
        h.b(t, "info");
        super.updateProps((CommonContainerInfoDiffCustom<T, V>) t);
        updateContainerRowProps(t);
    }

    public final void updateExposeProps(@NotNull T t, @NotNull com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {t, exposeInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c76c9fa37e2c06916b26e2a1b5585fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c76c9fa37e2c06916b26e2a1b5585fff");
            return;
        }
        h.b(t, "info");
        h.b(exposeInfo, "exposeInfo");
        ExposeInfo processExposeInfo = processExposeInfo(exposeInfo, t.getMidasInfo(), t.getViewMgeInfo(), dynamicModuleViewItemData);
        if (processExposeInfo != null) {
            ((CommonContainerRowItem) getDynamicRowItem()).addExposeInfo(processExposeInfo);
        }
        ((CommonContainerRowItem) getDynamicRowItem()).moveStatusInfo = processMoveStatusInfo(exposeInfo, dynamicModuleViewItemData);
    }

    private final void updateContainerRowProps(CellInfo.BaseCellInfo baseCellInfo) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {baseCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "792b7e984ccee30b9d72d2307742a40b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "792b7e984ccee30b9d72d2307742a40b");
            return;
        }
        CommonContainerRowItem commonContainerRowItem = (CommonContainerRowItem) getDynamicRowItem();
        String backgroundColor = baseCellInfo.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = "#FFFFFFFF";
        }
        commonContainerRowItem.setBackgroundColor(backgroundColor);
        CommonContainerRowItem commonContainerRowItem2 = (CommonContainerRowItem) getDynamicRowItem();
        ColorUnionType.GradientColorInfo gradientBackgroundColor = baseCellInfo.getGradientBackgroundColor();
        if (gradientBackgroundColor != null) {
            int parseColor = ColorUnionTypeKt.parseColor(gradientBackgroundColor.getStartColor());
            int parseColor2 = ColorUnionTypeKt.parseColor(gradientBackgroundColor.getEndColor());
            Integer orientation = gradientBackgroundColor.getOrientation();
            int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
            if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(0);
            }
        } else {
            gradientDrawable = null;
        }
        commonContainerRowItem2.setGradientBackgroundColor(gradientDrawable);
    }

    @Nullable
    public final <R extends BaseViewInfo> DynamicViewItem<R> mappingViewItem(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5a770368e6fceae32aac1ded6e92d8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5a770368e6fceae32aac1ded6e92d8c");
        }
        h.b(str, "id");
        ViewItem viewItem = getViewIdMap().get(str);
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        return (DynamicViewItem) viewItem;
    }

    private final <R extends ExtraViewInfo> DynamicDiff<R> bgMaskMappingFun(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011460e12880182485f0fca77f08996e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011460e12880182485f0fca77f08996e");
        }
        Object dynamicRowItem = getDynamicRowItem();
        if (!(dynamicRowItem instanceof CommonContainerRowItem)) {
            dynamicRowItem = null;
        }
        CommonContainerRowItem commonContainerRowItem = (CommonContainerRowItem) dynamicRowItem;
        ViewItem backgroundViewItem = commonContainerRowItem != null ? commonContainerRowItem.getBackgroundViewItem() : null;
        if (!(backgroundViewItem instanceof DynamicDiff)) {
            backgroundViewItem = null;
        }
        DynamicDiff dynamicDiff = (DynamicDiff) backgroundViewItem;
        if (h.a((Object) str, (Object) (dynamicDiff != null ? dynamicDiff.getId() : null))) {
            Object dynamicRowItem2 = getDynamicRowItem();
            if (!(dynamicRowItem2 instanceof CommonContainerRowItem)) {
                dynamicRowItem2 = null;
            }
            CommonContainerRowItem commonContainerRowItem2 = (CommonContainerRowItem) dynamicRowItem2;
            ViewItem backgroundViewItem2 = commonContainerRowItem2 != null ? commonContainerRowItem2.getBackgroundViewItem() : null;
            if (!(backgroundViewItem2 instanceof DynamicDiff)) {
                backgroundViewItem2 = null;
            }
            return (DynamicDiff) backgroundViewItem2;
        }
        Object dynamicRowItem3 = getDynamicRowItem();
        if (!(dynamicRowItem3 instanceof CommonContainerRowItem)) {
            dynamicRowItem3 = null;
        }
        CommonContainerRowItem commonContainerRowItem3 = (CommonContainerRowItem) dynamicRowItem3;
        ViewItem maskViewItem = commonContainerRowItem3 != null ? commonContainerRowItem3.getMaskViewItem() : null;
        if (!(maskViewItem instanceof DynamicDiff)) {
            maskViewItem = null;
        }
        DynamicDiff dynamicDiff2 = (DynamicDiff) maskViewItem;
        if (h.a((Object) str, (Object) (dynamicDiff2 != null ? dynamicDiff2.getId() : null))) {
            Object dynamicRowItem4 = getDynamicRowItem();
            if (!(dynamicRowItem4 instanceof CommonContainerRowItem)) {
                dynamicRowItem4 = null;
            }
            CommonContainerRowItem commonContainerRowItem4 = (CommonContainerRowItem) dynamicRowItem4;
            ViewItem maskViewItem2 = commonContainerRowItem4 != null ? commonContainerRowItem4.getMaskViewItem() : null;
            if (!(maskViewItem2 instanceof DynamicDiff)) {
                maskViewItem2 = null;
            }
            return (DynamicDiff) maskViewItem2;
        }
        return null;
    }
}
