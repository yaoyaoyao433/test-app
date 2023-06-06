package com.dianping.shield.dynamic.diff.cell;

import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$tabClickCallback$2$1", "invoke", "()Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$tabClickCallback$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabCellInfoDiff$tabClickCallback$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TabCellInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabCellInfoDiff$tabClickCallback$2(TabCellInfoDiff tabCellInfoDiff) {
        super(0);
        this.this$0 = tabCellInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$tabClickCallback$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3a3bcb7da6152545e126b04b0861f6f", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3a3bcb7da6152545e126b04b0861f6f") : new OnTabClickCallback() { // from class: com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$tabClickCallback$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.diff.extra.OnTabClickCallback
            public final void tabClick(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
                Object[] objArr2 = {obj, nodePath, gVar, iArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62230ef1328ed7c1f096af3d7316aaf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62230ef1328ed7c1f096af3d7316aaf3");
                    return;
                }
                h.b(gVar, "reason");
                if (gVar == g.USER_CLICK) {
                    TabCellInfoDiff.disableAutoScroll = true;
                    TabCellInfoDiff.hasScrollToFirst = true;
                }
                TabCellInfoDiff$tabClickCallback$2.this.this$0.tabSelectCallback(obj, nodePath, gVar, iArr);
            }
        };
    }
}
