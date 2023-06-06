package com.dianping.shield.manager.feature;

import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "cellIndex", "", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TopNodeCollector$onAdapterNotify$3 extends i implements c<Integer, ShieldViewCell, r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TopNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNodeCollector$onAdapterNotify$3(TopNodeCollector topNodeCollector) {
        super(2);
        this.this$0 = topNodeCollector;
    }

    @Override // kotlin.jvm.functions.c
    public final /* synthetic */ r invoke(Integer num, ShieldViewCell shieldViewCell) {
        invoke(num.intValue(), shieldViewCell);
        return r.a;
    }

    public final void invoke(int i, @NotNull ShieldViewCell shieldViewCell) {
        HashSet hashSet;
        Object[] objArr = {Integer.valueOf(i), shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81c311150cba00195b449f0bf6d4e0fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81c311150cba00195b449f0bf6d4e0fe");
            return;
        }
        h.b(shieldViewCell, "shieldViewCell");
        ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = shieldViewCell.shieldFloatViewNode;
        if ((shieldFloatViewDisplayNode != null ? shieldFloatViewDisplayNode.viewPaintingCallback : null) != null) {
            hashSet = this.this$0.floatNodeHashSet;
            hashSet.add(shieldViewCell.shieldFloatViewNode);
        }
    }
}
