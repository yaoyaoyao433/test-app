package com.dianping.shield.node.adapter;

import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/util/SparseArray;", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldViewHolder$childViewMap$2 extends i implements a<SparseArray<View>> {
    public static final ShieldViewHolder$childViewMap$2 INSTANCE = new ShieldViewHolder$childViewMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldViewHolder$childViewMap$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final SparseArray<View> invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32355beffe231969033bc658c468537d", RobustBitConfig.DEFAULT_VALUE) ? (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32355beffe231969033bc658c468537d") : new SparseArray<>();
    }
}
