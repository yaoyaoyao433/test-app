package com.dianping.shield.node.processor.legacy.cell;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.node.processor.Processor;
import com.dianping.shield.node.processor.ShieldProcessingUnit;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ%\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e\"\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "Lcom/dianping/shield/node/processor/Processor;", "()V", "processingUnit", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "getProcessingUnit", "()Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "setProcessingUnit", "(Lcom/dianping/shield/node/processor/ShieldProcessingUnit;)V", "getLoadingAndLoadingMoreCreator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "handleData", "", "obj", "", "", "([Ljava/lang/Object;)Z", "handleSectionCellInterface", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CellInterfaceProcessor extends Processor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public ShieldProcessingUnit processingUnit;

    public abstract boolean handleSectionCellInterface(@NotNull af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem);

    @NotNull
    public final ShieldProcessingUnit getProcessingUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a479d63a11f2732402592b3886e0403", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessingUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a479d63a11f2732402592b3886e0403");
        }
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        return shieldProcessingUnit;
    }

    public final void setProcessingUnit(@NotNull ShieldProcessingUnit shieldProcessingUnit) {
        Object[] objArr = {shieldProcessingUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9537930acde9aa020532b168728c9e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9537930acde9aa020532b168728c9e68");
            return;
        }
        h.b(shieldProcessingUnit, "<set-?>");
        this.processingUnit = shieldProcessingUnit;
    }

    @Override // com.dianping.shield.node.processor.Processor
    public boolean handleData(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4da5455f447b71625815c6bb5490bc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4da5455f447b71625815c6bb5490bc6")).booleanValue();
        }
        h.b(objArr, "obj");
        if (objArr.length == 2 && (objArr[0] instanceof af) && (objArr[1] instanceof ShieldSectionCellItem)) {
            Object obj = objArr[0];
            if (obj != null) {
                af afVar = (af) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    return handleSectionCellInterface(afVar, (ShieldSectionCellItem) obj2);
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.ShieldSectionCellItem");
            }
            throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.SectionCellInterface");
        }
        return false;
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getLoadingAndLoadingMoreCreator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eef3c6d73afd97fa0507dcfed4bd871", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadingAndLoadingMoreCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eef3c6d73afd97fa0507dcfed4bd871");
        }
        ShieldProcessingUnit shieldProcessingUnit = this.processingUnit;
        if (shieldProcessingUnit == null) {
            h.a("processingUnit");
        }
        return shieldProcessingUnit.getLoadingAndLoadingMoreCreator();
    }
}
