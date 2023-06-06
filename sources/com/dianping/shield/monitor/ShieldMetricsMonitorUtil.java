package com.dianping.shield.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMetricsMonitorUtil;", "", "()V", "hashData", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/monitor/ShieldMetricsData;", "Lkotlin/collections/HashMap;", KNBConfig.CONFIG_CLEAR_CACHE, "", "uniqueCode", "generateData", "getData", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldMetricsMonitorUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ShieldMetricsMonitorUtil INSTANCE = new ShieldMetricsMonitorUtil();
    private static final HashMap<String, ShieldMetricsData> hashData = new HashMap<>();

    @NotNull
    public final ShieldMetricsData generateData(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff08eb45e6bb9d79afae581e4f0b7e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff08eb45e6bb9d79afae581e4f0b7e4");
        }
        h.b(str, "uniqueCode");
        ShieldMetricsData shieldMetricsData = hashData.get(str);
        if (shieldMetricsData == null) {
            ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
            hashData.put(str, obtain);
            return obtain;
        }
        return shieldMetricsData;
    }

    @Nullable
    public final ShieldMetricsData getData(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c40eefd14e529003eb7ab30ea3efb7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c40eefd14e529003eb7ab30ea3efb7b");
        }
        h.b(str, "uniqueCode");
        return hashData.get(str);
    }

    public final void clear(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037da84e16a1f484c692e98e20de142a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037da84e16a1f484c692e98e20de142a");
            return;
        }
        h.b(str, "uniqueCode");
        hashData.remove(str);
    }
}
