package com.dianping.shield.node.processor.legacy.row;

import android.graphics.Rect;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.am;
import com.dianping.agentsdk.framework.s;
import com.dianping.agentsdk.framework.t;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/DividerInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DividerInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull af afVar, @NotNull RowItem rowItem, int i, int i2) {
        int i3;
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fdc13aee5ec4edcbd21815bf136f042", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fdc13aee5ec4edcbd21815bf136f042")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (rowItem.dividerStyle == null) {
            rowItem.dividerStyle = new DividerStyle();
            r rVar = r.a;
        }
        if (afVar instanceof am) {
            am amVar = (am) afVar;
            rowItem.dividerStyle.cellTopLineDrawable = amVar.a(i, i2);
            int b = amVar.b(i, i2);
            int c = amVar.c(i, i2);
            if (b >= 0 || c >= 0) {
                rowItem.dividerStyle.cellTopLineOffset = new Rect(b, 0, c, 0);
            }
        }
        int i4 = -1;
        if (afVar instanceof s) {
            s sVar = (s) afVar;
            rowItem.showCellTopDivider = sVar.showDivider(i, i2);
            rowItem.showCellBottomDivider = sVar.showDivider(i, i2);
            i3 = sVar.dividerOffset(i, i2);
            rowItem.dividerStyle.cellBottomLineDrawable = sVar.getDivider(i, i2);
        } else {
            i3 = -1;
        }
        if (afVar instanceof t) {
            t tVar = (t) afVar;
            int a = tVar.a(i, i2);
            if (a >= 0) {
                i3 = a;
            }
            i4 = tVar.b(i, i2);
        }
        if (i3 >= 0 || i4 >= 0) {
            rowItem.dividerStyle.cellBottomLineOffset = new Rect(i3, 0, i4, 0);
        }
        return false;
    }
}
