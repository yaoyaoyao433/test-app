package com.dianping.shield.node.processor.impl.divider;

import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.useritem.DividerStyle;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/processor/impl/divider/SectionDividerShowTypeProcessor;", "Lcom/dianping/shield/node/processor/impl/divider/DividerInfoProcessor;", "()V", "handleDividerInfo", "", "data", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionDividerShowTypeProcessor extends DividerInfoProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PositionType.FIRST.ordinal()] = 1;
            $EnumSwitchMapping$0[PositionType.SINGLE.ordinal()] = 2;
            int[] iArr2 = new int[DividerStyle.ShowType.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DividerStyle.ShowType.MIDDLE.ordinal()] = 1;
            $EnumSwitchMapping$1[DividerStyle.ShowType.NO_TOP.ordinal()] = 2;
            $EnumSwitchMapping$1[DividerStyle.ShowType.NONE.ordinal()] = 3;
            int[] iArr3 = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[PositionType.LAST.ordinal()] = 1;
            $EnumSwitchMapping$2[PositionType.SINGLE.ordinal()] = 2;
            int[] iArr4 = new int[PositionType.valuesCustom().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[PositionType.FIRST.ordinal()] = 1;
            $EnumSwitchMapping$3[PositionType.MIDDLE.ordinal()] = 2;
            int[] iArr5 = new int[DividerStyle.ShowType.valuesCustom().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[DividerStyle.ShowType.MIDDLE.ordinal()] = 1;
            $EnumSwitchMapping$4[DividerStyle.ShowType.NO_BOTTOM.ordinal()] = 2;
            $EnumSwitchMapping$4[DividerStyle.ShowType.TOP_BOTTOM.ordinal()] = 3;
            $EnumSwitchMapping$4[DividerStyle.ShowType.NONE.ordinal()] = 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r3.showCellTopLineDivider == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r3.showCellTopLineDivider == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        if (r13.showCellBottomLineDivider == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
        if (r13.showCellBottomLineDivider == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
        if (r13.showCellBottomLineDivider == true) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[FALL_THROUGH] */
    @Override // com.dianping.shield.node.processor.impl.divider.DividerInfoProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleDividerInfo(@org.jetbrains.annotations.NotNull com.dianping.shield.node.cellnode.ShieldDisplayNode r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.changeQuickRedirect
            java.lang.String r11 = "c9679f079ddd5ba9953a3cfcb61d3879"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            java.lang.String r1 = "data"
            kotlin.jvm.internal.h.b(r13, r1)
            com.dianping.shield.node.cellnode.ShieldRow r1 = r13.rowParent
            r2 = 0
            if (r1 == 0) goto L6c
            com.dianping.shield.node.cellnode.ShieldRow r3 = r13.rowParent
            if (r3 == 0) goto L37
            com.dianping.shield.node.cellnode.ShieldSection r3 = r3.sectionParent
            if (r3 == 0) goto L37
            com.dianping.shield.node.useritem.DividerStyle$ShowType r3 = r3.sectionDividerShowType
            goto L38
        L37:
            r3 = r2
        L38:
            if (r3 != 0) goto L3b
            goto L61
        L3b:
            int[] r4 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.WhenMappings.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L49;
                case 2: goto L49;
                case 3: goto L47;
                default: goto L46;
            }
        L46:
            goto L61
        L47:
            r3 = 0
            goto L6a
        L49:
            com.dianping.shield.node.PositionType r3 = r13.getPositionType()
            int[] r4 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L47;
                case 2: goto L47;
                default: goto L58;
            }
        L58:
            com.dianping.shield.node.cellnode.ShieldRow r3 = r13.rowParent
            if (r3 == 0) goto L47
            boolean r3 = r3.showCellTopLineDivider
            if (r3 != r0) goto L47
            goto L69
        L61:
            com.dianping.shield.node.cellnode.ShieldRow r3 = r13.rowParent
            if (r3 == 0) goto L47
            boolean r3 = r3.showCellTopLineDivider
            if (r3 != r0) goto L47
        L69:
            r3 = 1
        L6a:
            r1.showCellTopLineDivider = r3
        L6c:
            com.dianping.shield.node.cellnode.ShieldRow r1 = r13.rowParent
            if (r1 == 0) goto Lc5
            com.dianping.shield.node.cellnode.ShieldRow r3 = r13.rowParent
            if (r3 == 0) goto L7a
            com.dianping.shield.node.cellnode.ShieldSection r3 = r3.sectionParent
            if (r3 == 0) goto L7a
            com.dianping.shield.node.useritem.DividerStyle$ShowType r2 = r3.sectionDividerShowType
        L7a:
            if (r2 != 0) goto L7d
            goto Lbb
        L7d:
            int[] r3 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.WhenMappings.$EnumSwitchMapping$4
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto La3;
                case 2: goto La3;
                case 3: goto L8b;
                case 4: goto L89;
                default: goto L88;
            }
        L88:
            goto Lbb
        L89:
            r0 = 0
            goto Lc3
        L8b:
            com.dianping.shield.node.PositionType r2 = r13.getPositionType()
            int[] r3 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.WhenMappings.$EnumSwitchMapping$3
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L89;
                case 2: goto L89;
                default: goto L9a;
            }
        L9a:
            com.dianping.shield.node.cellnode.ShieldRow r13 = r13.rowParent
            if (r13 == 0) goto L89
            boolean r13 = r13.showCellBottomLineDivider
            if (r13 != r0) goto L89
            goto Lc3
        La3:
            com.dianping.shield.node.PositionType r2 = r13.getPositionType()
            int[] r3 = com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.WhenMappings.$EnumSwitchMapping$2
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L89;
                case 2: goto L89;
                default: goto Lb2;
            }
        Lb2:
            com.dianping.shield.node.cellnode.ShieldRow r13 = r13.rowParent
            if (r13 == 0) goto L89
            boolean r13 = r13.showCellBottomLineDivider
            if (r13 != r0) goto L89
            goto Lc3
        Lbb:
            com.dianping.shield.node.cellnode.ShieldRow r13 = r13.rowParent
            if (r13 == 0) goto L89
            boolean r13 = r13.showCellBottomLineDivider
            if (r13 != r0) goto L89
        Lc3:
            r1.showCellBottomLineDivider = r0
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.processor.impl.divider.SectionDividerShowTypeProcessor.handleDividerInfo(com.dianping.shield.node.cellnode.ShieldDisplayNode):boolean");
    }
}
