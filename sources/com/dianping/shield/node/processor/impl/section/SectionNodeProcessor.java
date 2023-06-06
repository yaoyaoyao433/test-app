package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH$¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "()V", "handleData", "", "obj", "", "", "([Ljava/lang/Object;)Z", "handleShieldSection", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class SectionNodeProcessor extends ShieldProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection);

    @Override // com.dianping.shield.node.processor.Processor
    public boolean handleData(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dd3f6dff83482aacc12bd3e407c2dd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dd3f6dff83482aacc12bd3e407c2dd2")).booleanValue();
        }
        h.b(objArr, "obj");
        if (objArr.length == 2 && (objArr[0] instanceof SectionItem) && (objArr[1] instanceof ShieldSection)) {
            Object obj = objArr[0];
            if (obj != null) {
                SectionItem sectionItem = (SectionItem) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    return handleShieldSection(sectionItem, (ShieldSection) obj2);
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldSection");
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.SectionItem");
        }
        return false;
    }
}
