package com.dianping.shield.preload;

import android.app.Application;
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
public final class ShieldPreloadManager$isInit$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldPreloadManager$isInit$1(ShieldPreloadManager shieldPreloadManager) {
        super(shieldPreloadManager);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "application";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daf8d66860d54c12a4693ed25c0c32ec", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daf8d66860d54c12a4693ed25c0c32ec") : u.a(ShieldPreloadManager.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getApplication()Landroid/app/Application;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b36ec7c6449c8c322142a0c489cd6d6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b36ec7c6449c8c322142a0c489cd6d6") : ShieldPreloadManager.access$getApplication$p((ShieldPreloadManager) this.receiver);
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9268a0394795fbe69cb7fae62d86954a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9268a0394795fbe69cb7fae62d86954a");
            return;
        }
        ShieldPreloadManager shieldPreloadManager = (ShieldPreloadManager) this.receiver;
        ShieldPreloadManager.application = (Application) obj;
    }
}
