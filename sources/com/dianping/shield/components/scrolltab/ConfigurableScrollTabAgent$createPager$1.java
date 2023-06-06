package com.dianping.shield.components.scrolltab;

import android.view.ViewGroup;
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
public final class ConfigurableScrollTabAgent$createPager$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ConfigurableScrollTabAgent$createPager$1(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        super(configurableScrollTabAgent);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "pagerContainer";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "106047773f1ca9f2cb55fbab871a10c6", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "106047773f1ca9f2cb55fbab871a10c6") : u.a(ConfigurableScrollTabAgent.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getPagerContainer()Landroid/view/ViewGroup;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84466b7b467c5b985a442a0b76da5dd4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84466b7b467c5b985a442a0b76da5dd4") : ConfigurableScrollTabAgent.access$getPagerContainer$p((ConfigurableScrollTabAgent) this.receiver);
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6edf6f69287783e4d76b60d3421daa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6edf6f69287783e4d76b60d3421daa0b");
        } else {
            ((ConfigurableScrollTabAgent) this.receiver).pagerContainer = (ViewGroup) obj;
        }
    }
}
