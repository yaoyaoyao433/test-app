package com.dianping.shield.dynamic.diff;

import com.dianping.agentsdk.framework.ab;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJI\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/dianping/shield/dynamic/diff/BaseScrollableRowInfoDiffCustom;", "T", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "V", "Lcom/dianping/shield/component/extensions/common/BaseScrollableRowItem;", "Lcom/dianping/shield/dynamic/diff/CommonContainerInfoDiffCustom;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "diffChildren", "", "newInfo", "computingItem", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;Lcom/dianping/shield/component/extensions/common/BaseScrollableRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseScrollableRowInfoDiffCustom<T extends CellInfo.BaseCellInfo, V extends BaseScrollableRowItem> extends CommonContainerInfoDiffCustom<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseScrollableRowInfoDiffCustom<T, V>) ((CellInfo.BaseCellInfo) diffableInfo), (CellInfo.BaseCellInfo) ((BaseScrollableRowItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public /* bridge */ /* synthetic */ void diffChildren(CellInfo.BaseCellInfo baseCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseScrollableRowInfoDiffCustom<T, V>) baseCellInfo, (CellInfo.BaseCellInfo) ((BaseScrollableRowItem) rowItem), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseScrollableRowInfoDiffCustom<T, V>) ((CellInfo.BaseCellInfo) diffableInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseScrollableRowInfoDiffCustom(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52a56278059ea991a3e7cfa15ff1f6c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52a56278059ea991a3e7cfa15ff1f6c1");
        }
    }

    public void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "352b83503a92b26cc260868502fa9310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "352b83503a92b26cc260868502fa9310");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((BaseScrollableRowInfoDiffCustom<T, V>) t, (T) v, arrayList, (Integer) 0, (Integer) 0);
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public void updateProps(@NotNull T t) {
        Integer bottomMargin;
        Integer topMargin;
        int i = 0;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89ade1ba2eff70d10ad6a779a9cd59f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89ade1ba2eff70d10ad6a779a9cd59f2");
            return;
        }
        h.b(t, "info");
        super.updateProps((BaseScrollableRowInfoDiffCustom<T, V>) t);
        BaseScrollableRowItem baseScrollableRowItem = (BaseScrollableRowItem) getDynamicRowItem();
        MarginInfo contentMarginInfo = getContentMarginInfo();
        baseScrollableRowItem.extraMarginTop = (contentMarginInfo == null || (topMargin = contentMarginInfo.getTopMargin()) == null) ? 0 : topMargin.intValue();
        BaseScrollableRowItem baseScrollableRowItem2 = (BaseScrollableRowItem) getDynamicRowItem();
        MarginInfo contentMarginInfo2 = getContentMarginInfo();
        if (contentMarginInfo2 != null && (bottomMargin = contentMarginInfo2.getBottomMargin()) != null) {
            i = bottomMargin.intValue();
        }
        baseScrollableRowItem2.extraMarginBottom = i;
        ((BaseScrollableRowItem) getDynamicRowItem()).extraMarginLeft = getLeftContentMargin();
        ((BaseScrollableRowItem) getDynamicRowItem()).extraMarginRight = getRightContentMargin();
        BaseScrollableRowItem baseScrollableRowItem3 = (BaseScrollableRowItem) getDynamicRowItem();
        ab<?> pageContainer = getHostChassis().getPageContainer();
        if (!(pageContainer instanceof CommonPageContainer)) {
            pageContainer = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
        baseScrollableRowItem3.onDidInterceptTouchListener = commonPageContainer != null ? commonPageContainer.getDidInterceptListener() : null;
    }
}
