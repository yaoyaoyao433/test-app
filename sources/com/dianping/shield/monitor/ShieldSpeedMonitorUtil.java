package com.dianping.shield.monitor;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/monitor/ShieldSpeedMonitorUtil;", "", "()V", "dataHash", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "Lkotlin/collections/HashMap;", "addEvent", "", "page", Constants.SPEED_METER_STEP, "", "responseTime", "", KNBConfig.CONFIG_CLEAR_CACHE, "replacePage", "oriPage", "newPage", "sendEvent", "startEvent", "startTime", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSpeedMonitorUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ShieldSpeedMonitorUtil INSTANCE = new ShieldSpeedMonitorUtil();
    private static final HashMap<String, ShieldSpeedData> dataHash = new HashMap<>();

    public final void startEvent(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b09536d34c2ecd90ea16a7687315f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b09536d34c2ecd90ea16a7687315f1");
            return;
        }
        h.b(str, "page");
        if (g.a((CharSequence) str)) {
            return;
        }
        startEvent(str, System.currentTimeMillis());
    }

    public final void startEvent(@NotNull String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a9816b2013da94cfa8fca19e6fed401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a9816b2013da94cfa8fca19e6fed401");
            return;
        }
        h.b(str, "page");
        if (g.a((CharSequence) str)) {
            return;
        }
        dataHash.put(str, ShieldSpeedData.Companion.obtain(str).startEvent(j));
    }

    public final void addEvent(@NotNull String str, int i) {
        ShieldSpeedData shieldSpeedData;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ebc72ec630803be370c2b98ef35d7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ebc72ec630803be370c2b98ef35d7aa");
            return;
        }
        h.b(str, "page");
        if (g.a((CharSequence) str) || (shieldSpeedData = dataHash.get(str)) == null) {
            return;
        }
        shieldSpeedData.addEvent(i);
    }

    public final void addEvent(@NotNull String str, int i, long j) {
        ShieldSpeedData shieldSpeedData;
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63faac3c27517e6879b9f5e1263aef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63faac3c27517e6879b9f5e1263aef5");
            return;
        }
        h.b(str, "page");
        if (g.a((CharSequence) str) || (shieldSpeedData = dataHash.get(str)) == null) {
            return;
        }
        shieldSpeedData.addEvent(i, j);
    }

    public final void sendEvent(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19feb982add0cd9901006b8e24ad9316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19feb982add0cd9901006b8e24ad9316");
            return;
        }
        h.b(str, "page");
        if (g.a((CharSequence) str)) {
            return;
        }
        ShieldSpeedData shieldSpeedData = dataHash.get(str);
        if (shieldSpeedData != null) {
            shieldSpeedData.send();
        }
        clear(str);
    }

    public final void replacePage(@NotNull String str, @NotNull String str2) {
        ShieldSpeedData remove;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400acbab8699cb3077416931d476374c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400acbab8699cb3077416931d476374c");
            return;
        }
        h.b(str, "oriPage");
        h.b(str2, "newPage");
        if (g.a((CharSequence) str) || g.a((CharSequence) str2) || (remove = dataHash.remove(str)) == null) {
            return;
        }
        remove.setPage(str2);
        h.a((Object) remove, AdvanceSetting.NETWORK_TYPE);
        dataHash.put(str2, remove);
    }

    private final void clear(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca7cb963b4282080eeb7c20f679cc504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca7cb963b4282080eeb7c20f679cc504");
        } else {
            dataHash.remove(str);
        }
    }
}
