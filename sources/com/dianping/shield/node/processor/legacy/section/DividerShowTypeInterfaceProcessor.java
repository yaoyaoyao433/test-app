package com.dianping.shield.node.processor.legacy.section;

import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.s;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/DividerShowTypeInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "()V", "handleSectionItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DividerShowTypeInterfaceProcessor extends SectionInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[s.a.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[s.a.TOP_END.ordinal()] = 1;
            $EnumSwitchMapping$0[s.a.ALL.ordinal()] = 2;
            $EnumSwitchMapping$0[s.a.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0[s.a.MIDDLE.ordinal()] = 4;
            $EnumSwitchMapping$0[s.a.NO_TOP.ordinal()] = 5;
            $EnumSwitchMapping$0[s.a.DEFAULT.ordinal()] = 6;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.section.SectionInterfaceProcessor
    public final boolean handleSectionItem(@NotNull af afVar, @NotNull SectionItem sectionItem, int i) {
        DividerStyle.ShowType showType;
        Object[] objArr = {afVar, sectionItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dcac93e7dd95395c03da0d9a70c4c62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dcac93e7dd95395c03da0d9a70c4c62")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(sectionItem, "sectionItem");
        if (afVar instanceof s) {
            s.a dividerShowType = ((s) afVar).dividerShowType(i);
            if (dividerShowType != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[dividerShowType.ordinal()]) {
                    case 1:
                        showType = DividerStyle.ShowType.TOP_BOTTOM;
                        break;
                    case 2:
                        showType = DividerStyle.ShowType.ALL;
                        break;
                    case 3:
                        showType = DividerStyle.ShowType.NONE;
                        break;
                    case 4:
                        showType = DividerStyle.ShowType.MIDDLE;
                        break;
                    case 5:
                        showType = DividerStyle.ShowType.NO_TOP;
                        break;
                    case 6:
                        showType = DividerStyle.ShowType.DEFAULT;
                        break;
                }
                sectionItem.dividerShowType = showType;
            }
            showType = DividerStyle.ShowType.DEFAULT;
            sectionItem.dividerShowType = showType;
        }
        return false;
    }
}
