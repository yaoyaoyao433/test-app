package com.dianping.shield.dynamic.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.reflect.d;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicPreloadMananger$isInit$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DynamicPreloadMananger$isInit$1(DynamicPreloadMananger dynamicPreloadMananger) {
        super(dynamicPreloadMananger);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "dynamicPreloadInterface";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9d249a489653e620a1c6a8ac43637b7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9d249a489653e620a1c6a8ac43637b7") : u.a(DynamicPreloadMananger.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getDynamicPreloadInterface()Lcom/dianping/shield/dynamic/preload/DynamicPreloadInterface;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de6e7f3a7b12a655cafcb5e8e31f02ea", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de6e7f3a7b12a655cafcb5e8e31f02ea") : DynamicPreloadMananger.access$getDynamicPreloadInterface$p((DynamicPreloadMananger) this.receiver);
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61b5a4f95dc97cee79ab4d4550a5f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61b5a4f95dc97cee79ab4d4550a5f2d");
            return;
        }
        DynamicPreloadMananger dynamicPreloadMananger = (DynamicPreloadMananger) this.receiver;
        DynamicPreloadMananger.dynamicPreloadInterface = (DynamicPreloadInterface) obj;
    }
}
