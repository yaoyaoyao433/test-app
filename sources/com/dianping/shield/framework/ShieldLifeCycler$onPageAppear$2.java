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
public final class ShieldLifeCycler$onPageAppear$2 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldLifeCycler$onPageAppear$2(ShieldLifeCycler shieldLifeCycler) {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ac7207695aa0bcdb45535845a5dc75d", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ac7207695aa0bcdb45535845a5dc75d") : u.a(ShieldLifeCycler.class);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e787ab480855d8aadf0abac290591397", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e787ab480855d8aadf0abac290591397") : ((ShieldLifeCycler) this.receiver).getHostFragment();
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bca52bedf76944d7da055e4ce27d085e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bca52bedf76944d7da055e4ce27d085e");
        } else {
            ((ShieldLifeCycler) this.receiver).setHostFragment((Fragment) obj);
        }
    }
}
