package com.dianping.shield.components.scrolltab;

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
public final class ConfigurableScrollTabAgent$OuterOnScrollListener$onScrollStateChanged$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ConfigurableScrollTabAgent$OuterOnScrollListener$onScrollStateChanged$1(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        super(configurableScrollTabAgent);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "flingHelper";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de73dc34cc1585bcae9140ac05cc4087", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de73dc34cc1585bcae9140ac05cc4087") : u.a(ConfigurableScrollTabAgent.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getFlingHelper()Lcom/dianping/shield/components/scrolltab/FlingHelper;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88e9c63832dc5b0d77f1fb953233ecb0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88e9c63832dc5b0d77f1fb953233ecb0") : ConfigurableScrollTabAgent.access$getFlingHelper$p((ConfigurableScrollTabAgent) this.receiver);
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10e48e07110b767f790825cb5d9a97c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10e48e07110b767f790825cb5d9a97c0");
        } else {
            ((ConfigurableScrollTabAgent) this.receiver).flingHelper = (FlingHelper) obj;
        }
    }
}
