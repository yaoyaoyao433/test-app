package com.dianping.shield.node.processor.impl.displaynode;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"Lcom/dianping/shield/node/processor/impl/displaynode/FloatViewDisplayNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeProcessor;", "()V", "getFrameLayoutParamsByInfo", "Landroid/widget/FrameLayout$LayoutParams;", "viewItem", "Lcom/dianping/shield/node/useritem/FloatViewItem;", "handleViewItem", "", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release", "handler", "Landroid/os/Handler;"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class FloatViewDisplayNodeProcessor extends DisplayNodeProcessor {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new q(u.a(FloatViewDisplayNodeProcessor.class), "handler", "<v#0>"))};
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        if (r5 == null) goto L42;
     */
    @Override // com.dianping.shield.node.processor.impl.displaynode.DisplayNodeProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleViewItem(@org.jetbrains.annotations.NotNull com.dianping.shield.node.useritem.ViewItem r12, @org.jetbrains.annotations.NotNull com.dianping.shield.node.cellnode.ShieldDisplayNode r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.processor.impl.displaynode.FloatViewDisplayNodeProcessor.handleViewItem(com.dianping.shield.node.useritem.ViewItem, com.dianping.shield.node.cellnode.ShieldDisplayNode):boolean");
    }

    private final FrameLayout.LayoutParams getFrameLayoutParamsByInfo(FloatViewItem floatViewItem) {
        Object[] objArr = {floatViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f322b9f736070d09f172b85d2f70ccf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f322b9f736070d09f172b85d2f70ccf4");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = floatViewItem.layoutParams;
        if (marginLayoutParams != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
            layoutParams.leftMargin = marginLayoutParams.leftMargin;
            layoutParams.rightMargin = marginLayoutParams.rightMargin;
            layoutParams.topMargin = marginLayoutParams.topMargin;
            layoutParams.bottomMargin = marginLayoutParams.bottomMargin;
            layoutParams.gravity = floatViewItem.gravity;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = floatViewItem.gravity;
        return layoutParams2;
    }
}
