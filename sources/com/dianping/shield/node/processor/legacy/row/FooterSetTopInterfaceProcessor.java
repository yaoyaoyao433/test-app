package com.dianping.shield.node.processor.legacy.row;

import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ai;
import com.dianping.agentsdk.pagecontainer.i;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.ExtraCellTopInterface;
import com.dianping.shield.feature.ExtraCellTopParamsInterface;
import com.dianping.shield.feature.TopPositionInterface;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.TopInfoHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/FooterSetTopInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class FooterSetTopInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull af afVar, @NotNull RowItem rowItem, int i, int i2) {
        i footerSetTopParams;
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba0ec7217546a08204daa0b74e26df94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba0ec7217546a08204daa0b74e26df94")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (afVar instanceof ai) {
            if (afVar instanceof TopPositionInterface) {
                TopPositionInterface.TopPositionInfo topPositionInfo = ((TopPositionInterface) afVar).getTopPositionInfo(CellType.FOOTER, i, i2);
                if (topPositionInfo != null) {
                    rowItem.topInfo = TopInfoHelper.Companion.createTopInfo(topPositionInfo);
                }
            } else if (afVar instanceof ExtraCellTopParamsInterface) {
                int footerViewType = ((ai) afVar).getFooterViewType(i);
                ExtraCellTopParamsInterface extraCellTopParamsInterface = (ExtraCellTopParamsInterface) afVar;
                if (extraCellTopParamsInterface.isHeaderTopView(footerViewType)) {
                    rowItem.topInfo = TopInfoHelper.Companion.createTopInfo();
                    TopInfo topInfo = rowItem.topInfo;
                    if (topInfo != null && (footerSetTopParams = extraCellTopParamsInterface.getFooterSetTopParams(footerViewType)) != null) {
                        topInfo.offset = footerSetTopParams.a;
                    }
                }
            } else if ((afVar instanceof ExtraCellTopInterface) && ((ExtraCellTopInterface) afVar).isFooterTopView(((ai) afVar).getFooterViewType(i))) {
                rowItem.topInfo = TopInfoHelper.Companion.createTopInfo();
            }
        }
        return false;
    }
}
