package com.dianping.shield.framework;

import android.support.v4.app.Fragment;
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
public final class ShieldLifeCycler$onPageDisappear$2 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldLifeCycler$onPageDisappear$2(ShieldLifeCycler shieldLifeCycler) {
        super(shieldLifeCycler);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "hostFragment";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc9ac58c966baa9acc87667712672e67", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc9ac58c966baa9acc87667712672e67") : u.a(ShieldLifeCycler.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getHostFragment()Landroid/support/v4/app/Fragment;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08417194175ae3ecd0d13f33b8d097a6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08417194175ae3ecd0d13f33b8d097a6") : ((ShieldLifeCycler) this.receiver).getHostFragment();
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e55371715e4bae268c9edb9d3a0ca04c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e55371715e4bae268c9edb9d3a0ca04c");
        } else {
            ((ShieldLifeCycler) this.receiver).setHostFragment((Fragment) obj);
        }
    }
}
