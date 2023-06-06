package com.dianping.shield.framework;

import com.dianping.agentsdk.framework.j;
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
public final class ShieldLifeCycler$onDestroy$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldLifeCycler$onDestroy$1(ShieldLifeCycler shieldLifeCycler) {
        super(shieldLifeCycler);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "cellManager";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e484cea02409ac54ec8e5e98c9e2dd", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e484cea02409ac54ec8e5e98c9e2dd") : u.a(ShieldLifeCycler.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getCellManager()Lcom/dianping/agentsdk/framework/CellManagerInterface;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59611bd125509043c70b4be74a622546", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59611bd125509043c70b4be74a622546") : ((ShieldLifeCycler) this.receiver).getCellManager();
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53390c37a74b84527d5b098ae6b40114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53390c37a74b84527d5b098ae6b40114");
        } else {
            ((ShieldLifeCycler) this.receiver).setCellManager((j) obj);
        }
    }
}
