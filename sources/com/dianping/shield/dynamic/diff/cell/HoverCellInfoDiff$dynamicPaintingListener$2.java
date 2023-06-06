package com.dianping.shield.dynamic.diff.cell;

import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/cell/HoverCellInfoDiff$dynamicPaintingListener$2$1", "invoke", "()Lcom/dianping/shield/dynamic/diff/cell/HoverCellInfoDiff$dynamicPaintingListener$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverCellInfoDiff$dynamicPaintingListener$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HoverCellInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverCellInfoDiff$dynamicPaintingListener$2(HoverCellInfoDiff hoverCellInfoDiff) {
        super(0);
        this.this$0 = hoverCellInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff$dynamicPaintingListener$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8ee4d87b040a0ef0c5243c95e5e569e", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8ee4d87b040a0ef0c5243c95e5e569e") : new DynamicPaitingInterface() { // from class: com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff$dynamicPaintingListener$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface
            public final void onPaintingInputComplete(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
                Object[] objArr2 = {shieldViewHolder, obj, nodePath};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cad84762504fb9d701043e981b8c3094", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cad84762504fb9d701043e981b8c3094");
                    return;
                }
                h.b(shieldViewHolder, "viewHolder");
                HoverCellScrollEventDetector hoverCellScrollEventDetector = HoverCellInfoDiff$dynamicPaintingListener$2.this.this$0.getHoverCellScrollEventDetector();
                if (hoverCellScrollEventDetector != null) {
                    hoverCellScrollEventDetector.setPath(nodePath);
                }
            }
        };
    }
}
