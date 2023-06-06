package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/useritem/FloatViewItem;", "T", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "V", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverViewInfoDiff$floatViewItem$2 extends i implements a<FloatViewItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HoverViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverViewInfoDiff$floatViewItem$2(HoverViewInfoDiff hoverViewInfoDiff) {
        super(0);
        this.this$0 = hoverViewInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final FloatViewItem invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b738d44717b207bf7471a3164bbfff0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (FloatViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b738d44717b207bf7471a3164bbfff0a");
        }
        ViewItem viewItem = this.this$0.getViewItem();
        if (viewItem != null) {
            return (FloatViewItem) viewItem;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.FloatViewItem");
    }
}
