package com.dianping.shield.node.processor.legacy.row;

import android.graphics.Rect;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.sectionrecycler.divider.a;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/DividerInfoInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DividerInfoInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[r.a.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[r.a.AUTO.ordinal()] = 1;
            $EnumSwitchMapping$0[r.a.NONE.ordinal()] = 2;
            $EnumSwitchMapping$0[r.a.TOP.ordinal()] = 3;
            $EnumSwitchMapping$0[r.a.MIDDLE.ordinal()] = 4;
            $EnumSwitchMapping$0[r.a.BOTTOM.ordinal()] = 5;
            $EnumSwitchMapping$0[r.a.SINGLE.ordinal()] = 6;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull af afVar, @NotNull RowItem rowItem, int i, int i2) {
        r a;
        DividerStyle.StyleType styleType;
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c1c9bc1c84284d99301bd9666dd636", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c1c9bc1c84284d99301bd9666dd636")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (afVar instanceof a) {
            switch (i2) {
                case -2:
                    a = ((a) afVar).a(CellType.FOOTER, i, i2);
                    break;
                case -1:
                    a = ((a) afVar).a(CellType.HEADER, i, 0);
                    break;
                default:
                    a = ((a) afVar).a(CellType.NORMAL, i, i2);
                    break;
            }
            if (a != null) {
                if (rowItem.dividerStyle == null) {
                    rowItem.dividerStyle = new DividerStyle();
                    kotlin.r rVar = kotlin.r.a;
                }
                DividerStyle dividerStyle = rowItem.dividerStyle;
                r.a a2 = a.a();
                if (a2 != null) {
                    switch (WhenMappings.$EnumSwitchMapping$0[a2.ordinal()]) {
                        case 1:
                            styleType = DividerStyle.StyleType.AUTO;
                            break;
                        case 2:
                            styleType = DividerStyle.StyleType.NONE;
                            break;
                        case 3:
                            styleType = DividerStyle.StyleType.TOP;
                            break;
                        case 4:
                            styleType = DividerStyle.StyleType.MIDDLE;
                            break;
                        case 5:
                            styleType = DividerStyle.StyleType.BOTTOM;
                            break;
                        case 6:
                            styleType = DividerStyle.StyleType.SINGLE;
                            break;
                    }
                    dividerStyle.styleType = styleType;
                    if (a.b() < 0 || a.c() >= 0) {
                        rowItem.dividerStyle.middleStyleLineOffset = new Rect(a.b(), 0, a.c(), 0);
                    }
                    rowItem.dividerStyle.topStyleLineDrawable = a.d();
                    rowItem.dividerStyle.middleStyleLineDrawable = a.e();
                    rowItem.dividerStyle.bottomStyleLineDrawable = a.f();
                }
                styleType = DividerStyle.StyleType.AUTO;
                dividerStyle.styleType = styleType;
                if (a.b() < 0) {
                }
                rowItem.dividerStyle.middleStyleLineOffset = new Rect(a.b(), 0, a.c(), 0);
                rowItem.dividerStyle.topStyleLineDrawable = a.d();
                rowItem.dividerStyle.middleStyleLineDrawable = a.e();
                rowItem.dividerStyle.bottomStyleLineDrawable = a.f();
            }
        }
        return false;
    }
}
