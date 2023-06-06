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
public final class ConfigurableScrollTabAgent$InnerOnScrollListener$onScrollStateChanged$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ConfigurableScrollTabAgent$InnerOnScrollListener$onScrollStateChanged$1(ConfigurableScrollTabAgent configurableScrollTabAgent) {
        super(configurableScrollTabAgent);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "innerFlingHelper";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e081294e4c36fe0b77e230592efdeee1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e081294e4c36fe0b77e230592efdeee1") : u.a(ConfigurableScrollTabAgent.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getInnerFlingHelper()Lcom/dianping/shield/components/scrolltab/FlingHelper;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9510147b25990193afce034777f5e3e0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9510147b25990193afce034777f5e3e0") : ConfigurableScrollTabAgent.access$getInnerFlingHelper$p((ConfigurableScrollTabAgent) this.receiver);
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d56578ccc2d3f1ee740012ca8e557ec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d56578ccc2d3f1ee740012ca8e557ec1");
        } else {
            ((ConfigurableScrollTabAgent) this.receiver).innerFlingHelper = (FlingHelper) obj;
        }
    }
}
