package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "T", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "V", "Lcom/dianping/shield/node/useritem/FloatViewItem;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverViewInfoDiff$viewPaintingCallback$2 extends i implements a<DynamicViewPaintingCallback> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DynamicChassisInterface $hostChassis;
    public final /* synthetic */ HoverViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverViewInfoDiff$viewPaintingCallback$2(HoverViewInfoDiff hoverViewInfoDiff, DynamicChassisInterface dynamicChassisInterface) {
        super(0);
        this.this$0 = hoverViewInfoDiff;
        this.$hostChassis = dynamicChassisInterface;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final DynamicViewPaintingCallback invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febb256147175a09e5416402c27aa1f4", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewPaintingCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febb256147175a09e5416402c27aa1f4") : new DynamicViewPaintingCallback(this.$hostChassis, this.this$0, false);
    }
}
