package com.dianping.shield.runtime;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.dianping.monitor.impl.a;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.m;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.config.DefaultConfigPropertyProviderSingleton;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldSpeedData;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.r;
import kotlin.reflect.i;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 (2\u00020\u0001:\u0002()B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0004J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/dianping/shield/runtime/ShieldDefaultRuntime;", "Lcom/dianping/shield/runtime/ShieldRuntimeInterface;", "context", "Landroid/content/Context;", "appId", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "random", "Ljava/util/Random;", "sampleBound", "sampleRate", "shieldMonitorService", "Lcom/dianping/shield/runtime/ShieldDefaultRuntime$ShieldMonitorService;", "getShieldMonitorService", "()Lcom/dianping/shield/runtime/ShieldDefaultRuntime$ShieldMonitorService;", "shieldMonitorService$delegate", "Lkotlin/Lazy;", "unionId", "", "getUnionId", "()Ljava/lang/String;", "unionId$delegate", "checkMonitorKeySample", "", "data", "Lcom/dianping/shield/monitor/ShieldMetricsData;", "needReport", PackageLoadReporter.Source.PREFETCH, "", "intent", "Landroid/content/Intent;", Constants.TRAFFIC_URI, "Landroid/net/Uri;", "sendByMetricsData", "sendBySpeedData", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "sendSpeedDataByCat", "switchMonitorConfigure", "Companion", "ShieldMonitorService", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldDefaultRuntime implements ShieldRuntimeInterface {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(ShieldDefaultRuntime.class), "unionId", "getUnionId()Ljava/lang/String;")), u.a(new s(u.a(ShieldDefaultRuntime.class), "shieldMonitorService", "getShieldMonitorService()Lcom/dianping/shield/runtime/ShieldDefaultRuntime$ShieldMonitorService;"))};
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SAMPLE_BOUND = 1000;
    private static final int DEFAULT_SAMPLE_RATE = 10;
    private static final String SYSTEM = "android";
    private static final String TAG = "ShieldDefaultRuntime";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int appId;
    @NotNull
    private final Context context;
    private final Random random;
    private int sampleBound;
    private int sampleRate;
    private final d shieldMonitorService$delegate;
    private final d unionId$delegate;

    private final ShieldMonitorService getShieldMonitorService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldMonitorService) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad364ff0e9fc6316252fa260da1e3cec", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad364ff0e9fc6316252fa260da1e3cec") : this.shieldMonitorService$delegate.a());
    }

    private final String getUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (String) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85064d8a4d5f22f61af5dc4dc73e327b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85064d8a4d5f22f61af5dc4dc73e327b") : this.unionId$delegate.a());
    }

    public ShieldDefaultRuntime(@NotNull Context context, int i) {
        h.b(context, "context");
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4de52888cd431dc9614e82353828f135", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4de52888cd431dc9614e82353828f135");
            return;
        }
        this.context = context;
        this.appId = i;
        this.sampleRate = 10;
        this.sampleBound = 1000;
        this.random = new Random();
        this.unionId$delegate = e.a(kotlin.i.NONE, new ShieldDefaultRuntime$unionId$2(this));
        this.shieldMonitorService$delegate = e.a(kotlin.i.NONE, new ShieldDefaultRuntime$shieldMonitorService$2(this));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/dianping/shield/runtime/ShieldDefaultRuntime$ShieldMonitorService;", "Lcom/dianping/monitor/impl/BaseMonitorService;", "context", "Landroid/content/Context;", "appId", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getUnionid", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class ShieldMonitorService extends a {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShieldMonitorService(@NotNull Context context, int i) {
            super(context, i);
            h.b(context, "context");
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1f4c13a9ef9598de6f1141a926c62c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1f4c13a9ef9598de6f1141a926c62c1");
            } else {
                this.context = context;
            }
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public final void setContext(@NotNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25528db112804291e7407d99d608ae27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25528db112804291e7407d99d608ae27");
                return;
            }
            h.b(context, "<set-?>");
            this.context = context;
        }

        @Override // com.dianping.monitor.impl.a
        @NotNull
        public final String getUnionid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccfa81eb009d3df5b5e108464d1cc6f1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccfa81eb009d3df5b5e108464d1cc6f1");
            }
            OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.context);
            oneIdHandler.init();
            h.a((Object) oneIdHandler, "handler");
            String localOneId = oneIdHandler.getLocalOneId();
            return localOneId == null ? "" : localOneId;
        }
    }

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void sendByMetricsData(@NotNull ShieldMetricsData shieldMetricsData) {
        Object[] objArr = {shieldMetricsData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0261a13fa2bbdb2f87cbc07a0721022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0261a13fa2bbdb2f87cbc07a0721022");
            return;
        }
        h.b(shieldMetricsData, "data");
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.i(TAG, "MetricsValue : " + shieldMetricsData.getMetricsValues(), new Object[0]);
            ShieldLogger shieldLogger2 = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger2.i(TAG, "MetricsTags : " + shieldMetricsData.getMetricsTags(), new Object[0]);
            ShieldLogger shieldLogger3 = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger3.i(TAG, "MetricsExtra : " + shieldMetricsData.getExtraInfo(), new Object[0]);
        }
        if (checkMonitorKeySample(shieldMetricsData) || needReport()) {
            m mVar = new m(this.appId, this.context, getUnionId());
            mVar.a("appId", String.valueOf(this.appId));
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.dianping.monitor.h.b(this.context));
            mVar.a("platform", SYSTEM);
            mVar.a("system_version", com.dianping.monitor.h.b());
            mVar.a("build", ShieldEnvironment.INSTANCE.isDebug() ? "Debug" : "Release");
            String extraInfo = shieldMetricsData.getExtraInfo();
            if (extraInfo != null) {
                mVar.a(extraInfo);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<Float>> entry : shieldMetricsData.getMetricsValues().entrySet()) {
                l a = mVar.a(entry.getKey(), entry.getValue());
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry2 : shieldMetricsData.getMetricsTags().entrySet()) {
                l a2 = mVar.a(entry2.getKey(), entry2.getValue());
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            mVar.a();
        }
    }

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void sendBySpeedData(@NotNull ShieldSpeedData shieldSpeedData) {
        Object[] objArr = {shieldSpeedData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b1f678cf0681e4f5d5a6769e13ae44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b1f678cf0681e4f5d5a6769e13ae44");
            return;
        }
        h.b(shieldSpeedData, "data");
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.i(TAG, "SpeedPage : " + shieldSpeedData.getPage(), new Object[0]);
            ShieldLogger shieldLogger2 = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger2.i(TAG, "SpeedStartTime : " + shieldSpeedData.getStartTime(), new Object[0]);
            ShieldLogger shieldLogger3 = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger3.i(TAG, "SpeedEvents : " + shieldSpeedData.getStepEvents(), new Object[0]);
        }
        if (needReport()) {
            sendSpeedDataByCat(shieldSpeedData);
        }
    }

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void switchMonitorConfigure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4939248555b31a8c001c55a88319d624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4939248555b31a8c001c55a88319d624");
            return;
        }
        String configProperty = DefaultConfigPropertyProviderSingleton.INSTANCE.getConfigProperty("MonitorSample");
        if (configProperty != null) {
            List<String> a = g.a((CharSequence) configProperty, new String[]{"/"}, false, 0);
            if (a.size() == 2) {
                int parseInt = Integer.parseInt(a.get(0));
                int parseInt2 = Integer.parseInt(a.get(1));
                this.sampleRate = parseInt * 10;
                this.sampleBound = parseInt2 * 10;
            }
        }
    }

    @Override // com.dianping.shield.runtime.ShieldMapiPrefetchInterface
    public void prefetch(@NotNull Context context, @NotNull Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8bd81f8d5b385265520aa944dee4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8bd81f8d5b385265520aa944dee4c4");
            return;
        }
        h.b(context, "context");
        h.b(uri, Constants.TRAFFIC_URI);
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.i(TAG, "prefetch : " + uri, new Object[0]);
    }

    @Override // com.dianping.shield.runtime.ShieldMapiPrefetchInterface
    public void prefetch(@NotNull Context context, @NotNull Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b8726fa73cb60dbc17efd40e537cea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b8726fa73cb60dbc17efd40e537cea6");
            return;
        }
        h.b(context, "context");
        h.b(intent, "intent");
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.i(TAG, "prefetch : " + intent, new Object[0]);
    }

    private final void sendSpeedDataByCat(ShieldSpeedData shieldSpeedData) {
        Object[] objArr = {shieldSpeedData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf0af93ac9b4e7f51f9886146ccd6487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf0af93ac9b4e7f51f9886146ccd6487");
            return;
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            shieldSpeedData.setPage(shieldSpeedData.getPage() + "_debug");
        }
        getShieldMonitorService().startEvent(shieldSpeedData.getPage(), shieldSpeedData.getStartTime());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Long> entry : shieldSpeedData.getStepEvents().entrySet()) {
            getShieldMonitorService().addEvent(shieldSpeedData.getPage(), entry.getKey().intValue(), entry.getValue().longValue());
            arrayList.add(r.a);
        }
        getShieldMonitorService().sendEvent(shieldSpeedData.getPage());
        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger.i(TAG, "ShieldMTMonitor-Speed " + shieldSpeedData, new Object[0]);
    }

    public final boolean needReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abdf04c1adb6aabf70103b77b9d6ed88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abdf04c1adb6aabf70103b77b9d6ed88")).booleanValue();
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            return true;
        }
        return this.sampleRate > 0 && this.sampleBound > 0 && this.random.nextInt(this.sampleBound) < this.sampleRate;
    }

    private final boolean checkMonitorKeySample(ShieldMetricsData shieldMetricsData) {
        boolean z = true;
        Object[] objArr = {shieldMetricsData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "583912bfc667a354c2302b1577040d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "583912bfc667a354c2302b1577040d8b")).booleanValue();
        }
        HashMap<String, List<Float>> metricsValues = shieldMetricsData.getMetricsValues();
        if (metricsValues != null && !metricsValues.isEmpty()) {
            z = false;
        }
        if (z) {
            return false;
        }
        return shieldMetricsData.getMetricsValues().keySet().contains(ShieldMonitorKey.MFControllerLoad);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dianping/shield/runtime/ShieldDefaultRuntime$Companion;", "", "()V", "DEFAULT_SAMPLE_BOUND", "", "DEFAULT_SAMPLE_RATE", "SYSTEM", "", "TAG", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }
}
