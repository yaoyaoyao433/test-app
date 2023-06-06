package com.dianping.shield.node.processor.legacy.section;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.node.processor.Processor;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "Lcom/dianping/shield/node/processor/Processor;", "()V", "handleData", "", "obj", "", "", "([Ljava/lang/Object;)Z", "handleSectionItem", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class SectionInterfaceProcessor extends Processor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract boolean handleSectionItem(@NotNull af afVar, @NotNull SectionItem sectionItem, int i);

    @Override // com.dianping.shield.node.processor.Processor
    public boolean handleData(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b45ce02a756646452a954978493b78da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b45ce02a756646452a954978493b78da")).booleanValue();
        }
        h.b(objArr, "obj");
        if (objArr.length == 3 && (objArr[0] instanceof af) && (objArr[1] instanceof SectionItem) && (objArr[2] instanceof Integer)) {
            Object obj = objArr[0];
            if (obj != null) {
                af afVar = (af) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    SectionItem sectionItem = (SectionItem) obj2;
                    Object obj3 = objArr[2];
                    if (obj3 != null) {
                        return handleSectionItem(afVar, sectionItem, ((Integer) obj3).intValue());
                    }
                    throw new o("null cannot be cast to non-null type kotlin.Int");
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.SectionItem");
            }
            throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.SectionCellInterface");
        }
        return false;
    }
}
