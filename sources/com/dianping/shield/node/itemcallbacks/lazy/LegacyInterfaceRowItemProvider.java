package com.dianping.shield.node.itemcallbacks.lazy;

import com.dianping.agentsdk.framework.ae;
import com.dianping.agentsdk.framework.af;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.LayoutType;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/lazy/LegacyInterfaceRowItemProvider;", "Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadRowItemProvider;", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "processorHolder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "(Lcom/dianping/agentsdk/framework/SectionCellInterface;Lcom/dianping/shield/node/processor/ProcessorHolder;)V", "getRowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "getRowLayoutType", "Lcom/dianping/shield/node/useritem/LayoutType;", "getRowViewCount", "isPreLoad", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class LegacyInterfaceRowItemProvider implements LazyLoadRowItemProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ProcessorHolder processorHolder;
    private final af sci;

    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
    public int getRowViewCount(int i, int i2) {
        return 1;
    }

    public LegacyInterfaceRowItemProvider(@NotNull af afVar, @NotNull ProcessorHolder processorHolder) {
        h.b(afVar, "sci");
        h.b(processorHolder, "processorHolder");
        Object[] objArr = {afVar, processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63ae10a20dfc764136c75bb374e65f25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63ae10a20dfc764136c75bb374e65f25");
            return;
        }
        this.sci = afVar;
        this.processorHolder = processorHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isPreLoad(int r13, int r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.node.itemcallbacks.lazy.LegacyInterfaceRowItemProvider.changeQuickRedirect
            java.lang.String r11 = "b956ede176b152bc0d2b3c6f9472375a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2d
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L2d:
            com.dianping.agentsdk.framework.af r0 = r12.sci
            boolean r1 = r0 instanceof com.dianping.shield.feature.TopPositionInterface
            if (r1 == 0) goto L43
            com.dianping.agentsdk.framework.af r0 = r12.sci
            com.dianping.shield.feature.TopPositionInterface r0 = (com.dianping.shield.feature.TopPositionInterface) r0
            com.dianping.shield.entity.CellType r1 = com.dianping.shield.entity.CellType.NORMAL
            com.dianping.shield.feature.TopPositionInterface$TopPositionInfo r0 = r0.getTopPositionInfo(r1, r13, r14)
            if (r0 == 0) goto L41
            r0 = 1
            goto L68
        L41:
            r0 = 0
            goto L68
        L43:
            boolean r1 = r0 instanceof com.dianping.shield.feature.SetTopParamsInterface
            if (r1 == 0) goto L56
            com.dianping.agentsdk.framework.af r0 = r12.sci
            int r0 = r0.getViewType(r13, r14)
            com.dianping.agentsdk.framework.af r1 = r12.sci
            com.dianping.shield.feature.SetTopParamsInterface r1 = (com.dianping.shield.feature.SetTopParamsInterface) r1
            boolean r0 = r1.isTopView(r0)
            goto L68
        L56:
            boolean r0 = r0 instanceof com.dianping.shield.feature.SetTopInterface
            if (r0 == 0) goto L41
            com.dianping.agentsdk.framework.af r0 = r12.sci
            int r0 = r0.getViewType(r13, r14)
            com.dianping.agentsdk.framework.af r1 = r12.sci
            com.dianping.shield.feature.SetTopInterface r1 = (com.dianping.shield.feature.SetTopInterface) r1
            boolean r0 = r1.isTopView(r0)
        L68:
            if (r0 != 0) goto L96
            com.dianping.agentsdk.framework.af r0 = r12.sci
            boolean r1 = r0 instanceof com.dianping.shield.feature.BottomPositionInterface
            if (r1 == 0) goto L80
            com.dianping.agentsdk.framework.af r0 = r12.sci
            com.dianping.shield.feature.BottomPositionInterface r0 = (com.dianping.shield.feature.BottomPositionInterface) r0
            com.dianping.shield.entity.CellType r1 = com.dianping.shield.entity.CellType.NORMAL
            com.dianping.shield.feature.BottomPositionInterface$BottomPositionInfo r13 = r0.getBottomPositionInfo(r1, r13, r14)
            if (r13 == 0) goto L7e
            r13 = 1
            goto L92
        L7e:
            r13 = 0
            goto L92
        L80:
            boolean r0 = r0 instanceof com.dianping.shield.feature.SetBottomInterface
            if (r0 == 0) goto L7e
            com.dianping.agentsdk.framework.af r0 = r12.sci
            int r13 = r0.getViewType(r13, r14)
            com.dianping.agentsdk.framework.af r14 = r12.sci
            com.dianping.shield.feature.SetBottomInterface r14 = (com.dianping.shield.feature.SetBottomInterface) r14
            boolean r13 = r14.isBottomView(r13)
        L92:
            if (r13 == 0) goto L95
            goto L96
        L95:
            return r8
        L96:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.itemcallbacks.lazy.LegacyInterfaceRowItemProvider.isPreLoad(int, int):boolean");
    }

    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
    @NotNull
    public LayoutType getRowLayoutType(int i, int i2) {
        return LayoutType.LINEAR_FULL_FILL;
    }

    @Override // com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider
    @NotNull
    public RowItem getRowItem(int i, int i2) {
        String geneLegacyRowId;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92cda844133374fb260571ff13fd7820", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92cda844133374fb260571ff13fd7820");
        }
        Object a = this.sci instanceof ae ? ((ae) this.sci).a(i, i2) : null;
        if (a == null || (geneLegacyRowId = NodeCreator.Companion.geneLegacyRowIdWithData(this.sci, i, i2, a)) == null) {
            geneLegacyRowId = NodeCreator.Companion.geneLegacyRowId(this.sci, i, i2);
        }
        RowItem rowItem = new RowItem(geneLegacyRowId);
        this.processorHolder.getRowInterfaceProcessorChain().startProcessor(this.sci, rowItem, Integer.valueOf(i), Integer.valueOf(i2));
        return rowItem;
    }
}
