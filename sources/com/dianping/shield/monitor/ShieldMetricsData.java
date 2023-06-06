package com.dianping.shield.monitor;

import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.runtime.ShieldRuntimeInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007J\u0006\u0010\u001c\u001a\u00020\u0000J\u001c\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0004J$\u0010 \u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010!\u001a\u00020\u0004J\u001c\u0010\"\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fRB\u0010\u0010\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nj\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMetricsData;", "", "()V", "extraInfo", "", "getExtraInfo", "()Ljava/lang/String;", "setExtraInfo", "(Ljava/lang/String;)V", "metricsTags", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMetricsTags", "()Ljava/util/HashMap;", "setMetricsTags", "(Ljava/util/HashMap;)V", "metricsValues", "", "", "getMetricsValues", "setMetricsValues", "next", "addExtra", "extra", "addTag", "key", "value", "addValues", "cumulativeValue", "newKey", "keys", "getCumulativeValue", "plusValue", "dependKey", "plusValues", "recycle", "", "send", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldMetricsData {
    public static final int MAX_POOL_SIZE = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private static ShieldMetricsData sPool;
    private static int sPoolSize;
    @Nullable
    private String extraInfo;
    @NotNull
    private HashMap<String, String> metricsTags;
    @NotNull
    private HashMap<String, List<Float>> metricsValues;
    private ShieldMetricsData next;
    public static final Companion Companion = new Companion(null);
    private static final Object sPoolSync = new Object();

    @JvmStatic
    @NotNull
    public static final ShieldMetricsData obtain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c578ef90fc0a711ede9ae4221558dec", RobustBitConfig.DEFAULT_VALUE) ? (ShieldMetricsData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c578ef90fc0a711ede9ae4221558dec") : Companion.obtain();
    }

    public ShieldMetricsData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af917cf5448602343c1ff0f566e46b18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af917cf5448602343c1ff0f566e46b18");
            return;
        }
        this.metricsTags = new HashMap<>();
        this.metricsValues = new HashMap<>();
    }

    @NotNull
    public final HashMap<String, String> getMetricsTags() {
        return this.metricsTags;
    }

    public final void setMetricsTags(@NotNull HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e90a4b8435c8d96d5f48f7297e2de15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e90a4b8435c8d96d5f48f7297e2de15b");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.metricsTags = hashMap;
    }

    @NotNull
    public final HashMap<String, List<Float>> getMetricsValues() {
        return this.metricsValues;
    }

    public final void setMetricsValues(@NotNull HashMap<String, List<Float>> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ace10bf15cb4d6f8bf7ab732fd5f5307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ace10bf15cb4d6f8bf7ab732fd5f5307");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.metricsValues = hashMap;
    }

    @Nullable
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final void setExtraInfo(@Nullable String str) {
        this.extraInfo = str;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMetricsData$Companion;", "", "()V", "MAX_POOL_SIZE", "", "sPool", "Lcom/dianping/shield/monitor/ShieldMetricsData;", "getSPool", "()Lcom/dianping/shield/monitor/ShieldMetricsData;", "setSPool", "(Lcom/dianping/shield/monitor/ShieldMetricsData;)V", "sPoolSize", "getSPoolSize", "()I", "setSPoolSize", "(I)V", "sPoolSync", "sPoolSync$annotations", "obtain", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        private static /* synthetic */ void sPoolSync$annotations() {
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Nullable
        public final ShieldMetricsData getSPool() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef8a037e67425acca9629dccdf952ade", RobustBitConfig.DEFAULT_VALUE) ? (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef8a037e67425acca9629dccdf952ade") : ShieldMetricsData.sPool;
        }

        public final void setSPool(@Nullable ShieldMetricsData shieldMetricsData) {
            Object[] objArr = {shieldMetricsData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "559359c12cb31103985f2a74fc67580c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "559359c12cb31103985f2a74fc67580c");
            } else {
                ShieldMetricsData.sPool = shieldMetricsData;
            }
        }

        public final int getSPoolSize() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fc034315d701c21944926a41f3fbd1f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fc034315d701c21944926a41f3fbd1f")).intValue() : ShieldMetricsData.sPoolSize;
        }

        public final void setSPoolSize(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442d0be8175ac3ffa03086cd3d22668f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442d0be8175ac3ffa03086cd3d22668f");
            } else {
                ShieldMetricsData.sPoolSize = i;
            }
        }

        @JvmStatic
        @NotNull
        public final ShieldMetricsData obtain() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41cf7ad5bc154c3726b09cc8224baf60", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41cf7ad5bc154c3726b09cc8224baf60");
            }
            synchronized (ShieldMetricsData.sPoolSync) {
                ShieldMetricsData sPool = ShieldMetricsData.Companion.getSPool();
                if (sPool != null) {
                    ShieldMetricsData.Companion.setSPool(sPool.next);
                    sPool.next = null;
                    Companion companion = ShieldMetricsData.Companion;
                    companion.setSPoolSize(companion.getSPoolSize() - 1);
                    return sPool;
                }
                return new ShieldMetricsData();
            }
        }
    }

    @NotNull
    public final ShieldMetricsData addTag(@NotNull String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "768e9bf227b9031a72014d966b8939d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "768e9bf227b9031a72014d966b8939d7");
        }
        h.b(str, "key");
        if (str2 != null) {
            this.metricsTags.put(str, str2);
        }
        return this;
    }

    @Deprecated(level = a.WARNING, message = "Use plusValues instead.", replaceWith = @ReplaceWith(expression = "plusValues(key, value)", imports = {"plusValues"}))
    @NotNull
    public final ShieldMetricsData addValues(@NotNull String str, @NotNull List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "378fcb2a9d027dee0955179672dd27ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "378fcb2a9d027dee0955179672dd27ad");
        }
        h.b(str, "key");
        h.b(list, "value");
        this.metricsValues.put(str, list);
        return this;
    }

    @NotNull
    public final ShieldMetricsData plusValues(@NotNull String str, @NotNull List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea53f7b634b5ebcc6cc75aaf61ffb2f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea53f7b634b5ebcc6cc75aaf61ffb2f8");
        }
        h.b(str, "key");
        h.b(list, "value");
        List<Float> list2 = this.metricsValues.get(str);
        if (list2 != null) {
            h.a((Object) list2, AdvanceSetting.NETWORK_TYPE);
            this.metricsValues.put(str, kotlin.collections.h.b(list2, list));
        } else {
            this.metricsValues.put(str, list);
        }
        return this;
    }

    @NotNull
    public final ShieldMetricsData plusValue(@NotNull String str, @NotNull List<Float> list, @NotNull String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fb532aed57d1f5768d28c08d933b9b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fb532aed57d1f5768d28c08d933b9b7");
        }
        h.b(str, "key");
        h.b(list, "value");
        h.b(str2, "dependKey");
        if (this.metricsValues.get(str2) == null || plusValues(str, list) == null) {
            plusValues(str + "_In_" + str2, list);
        }
        return this;
    }

    @NotNull
    public final ShieldMetricsData addExtra(@Nullable String str) {
        this.extraInfo = str;
        return this;
    }

    @NotNull
    public final ShieldMetricsData cumulativeValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "320a7b6d916d97a3bc3baeef2820162c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "320a7b6d916d97a3bc3baeef2820162c");
        }
        for (Map.Entry<String, List<Float>> entry : this.metricsValues.entrySet()) {
            this.metricsValues.put(entry.getKey(), kotlin.collections.h.a(Float.valueOf(kotlin.collections.h.e((Iterable<Float>) entry.getValue()))));
        }
        return this;
    }

    public final float getCumulativeValue(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b75e05365d0c4e329606dde9778e73b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b75e05365d0c4e329606dde9778e73b")).floatValue();
        }
        h.b(str, "key");
        List<Float> list = this.metricsValues.get(str);
        if (list != null) {
            h.a((Object) list, AdvanceSetting.NETWORK_TYPE);
            return kotlin.collections.h.e((Iterable<Float>) list);
        }
        return 0.0f;
    }

    @NotNull
    public final ShieldMetricsData cumulativeValue(@NotNull String str, @NotNull List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ad2d4877e5e037333b5c5d065cef85", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldMetricsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ad2d4877e5e037333b5c5d065cef85");
        }
        h.b(str, "newKey");
        h.b(list, "keys");
        float f = 0.0f;
        for (String str2 : list) {
            List<Float> list2 = this.metricsValues.get(str2);
            if (list2 != null) {
                h.a((Object) list2, "values");
                f += kotlin.collections.h.e((Iterable<Float>) list2);
            }
        }
        this.metricsValues.put(str, kotlin.collections.h.a(Float.valueOf(f)));
        return this;
    }

    public final void send() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52b19cb623f4111afe66d4c57328ee62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52b19cb623f4111afe66d4c57328ee62");
            return;
        }
        ShieldRuntimeInterface shieldRuntimeImpl = ShieldEnvironment.INSTANCE.getShieldRuntimeImpl();
        if (shieldRuntimeImpl != null) {
            shieldRuntimeImpl.sendByMetricsData(this);
        }
        recycle();
    }

    public final void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee42a879553322db6aaa0d875b6705a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee42a879553322db6aaa0d875b6705a4");
            return;
        }
        this.metricsTags.clear();
        this.metricsValues.clear();
        this.extraInfo = "";
        synchronized (sPoolSync) {
            if (sPoolSize < 10) {
                this.next = sPool;
                sPool = this;
                sPoolSize++;
            }
            r rVar = r.a;
        }
    }
}
