package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "T", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "V", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseViewInfoDiff$viewPaintingCallback$2 extends i implements a<DynamicViewPaintingCallback> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewInfoDiff$viewPaintingCallback$2(BaseViewInfoDiff baseViewInfoDiff) {
        super(0);
        this.this$0 = baseViewInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final DynamicViewPaintingCallback invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8e2fda7985a8ff8c302c4d8484533ed", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewPaintingCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8e2fda7985a8ff8c302c4d8484533ed") : new DynamicViewPaintingCallback(this.this$0.getHostChassis(), this.this$0, false, 4, null);
    }
}
