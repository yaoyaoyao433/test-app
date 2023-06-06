package com.dianping.shield.dynamic.env;

import com.dianping.shield.dynamic.agent.refresh.DynamicRefreshDelegate;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001f\"\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u0004\u0018\u00010\fJ\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u001bJ\u0014\u0010%\u001a\u00020\u001b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0'J\u0006\u0010(\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010/J%\u00100\u001a\u00020\u001b2\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001f\"\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u00102R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "Lcom/dianping/shield/dynamic/env/DynamicAgentHostReloadCallback;", "mHostCreator", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;", "executor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;)V", "getExecutor", "()Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "setExecutor", "(Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;)V", "host", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "hostReloadCallback", "getHostReloadCallback", "()Lcom/dianping/shield/dynamic/env/DynamicAgentHostReloadCallback;", "setHostReloadCallback", "(Lcom/dianping/shield/dynamic/env/DynamicAgentHostReloadCallback;)V", "isChassisActive", "", "getMHostCreator", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;", "setMHostCreator", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;)V", "refreshDelegate", "Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;", "callMethod", "", "method", "", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getHost", "onCreate", "onDestroy", "onMonitorPaintingEnd", "errorSet", "", "onMonitorPaintingStart", "onPause", "onResume", "refreshEnd", "identifier", "", "refreshHost", "Lrx/Observable;", "reloadHost", "args", "([Ljava/lang/Object;)V", "HostCreator", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicExecEnvironment implements DynamicAgentHostReloadCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private DynamicExecutorInterface executor;
    private DynamicHostInterface host;
    @Nullable
    private DynamicAgentHostReloadCallback hostReloadCallback;
    private boolean isChassisActive;
    @NotNull
    private HostCreator mHostCreator;
    private DynamicRefreshDelegate refreshDelegate;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;", "", "create", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "data", "", "([Ljava/lang/Object;)Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface HostCreator {
        @NotNull
        DynamicHostInterface create(@NotNull Object... objArr);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "identifier", "", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.dianping.shield.dynamic.env.DynamicExecEnvironment$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements b<Integer, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num.intValue()));
        }

        public final boolean invoke(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12cc7959abc457b64510a649873ec91b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12cc7959abc457b64510a649873ec91b")).booleanValue();
            }
            DynamicHostInterface dynamicHostInterface = DynamicExecEnvironment.this.host;
            if (dynamicHostInterface != null) {
                return dynamicHostInterface.onRefresh(Integer.valueOf(i));
            }
            return false;
        }
    }

    public DynamicExecEnvironment(@NotNull HostCreator hostCreator, @NotNull DynamicExecutorInterface dynamicExecutorInterface) {
        h.b(hostCreator, "mHostCreator");
        h.b(dynamicExecutorInterface, "executor");
        Object[] objArr = {hostCreator, dynamicExecutorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8cf77ab4fdcbdb86593e7395a1be223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8cf77ab4fdcbdb86593e7395a1be223");
            return;
        }
        this.mHostCreator = hostCreator;
        this.executor = dynamicExecutorInterface;
        this.refreshDelegate = new DynamicRefreshDelegate(new AnonymousClass1());
    }

    @NotNull
    public final DynamicExecutorInterface getExecutor() {
        return this.executor;
    }

    @NotNull
    public final HostCreator getMHostCreator() {
        return this.mHostCreator;
    }

    public final void setExecutor(@NotNull DynamicExecutorInterface dynamicExecutorInterface) {
        Object[] objArr = {dynamicExecutorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23df08b8cd94be8f4f3f0109d00d4ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23df08b8cd94be8f4f3f0109d00d4ba4");
            return;
        }
        h.b(dynamicExecutorInterface, "<set-?>");
        this.executor = dynamicExecutorInterface;
    }

    public final void setMHostCreator(@NotNull HostCreator hostCreator) {
        Object[] objArr = {hostCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91399f77e8adaa393d3f85c5cadd51db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91399f77e8adaa393d3f85c5cadd51db");
            return;
        }
        h.b(hostCreator, "<set-?>");
        this.mHostCreator = hostCreator;
    }

    @Nullable
    public final DynamicAgentHostReloadCallback getHostReloadCallback() {
        return this.hostReloadCallback;
    }

    public final void setHostReloadCallback(@Nullable DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback) {
        this.hostReloadCallback = dynamicAgentHostReloadCallback;
    }

    @Override // com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback
    public final void reloadHost(@NotNull Object... objArr) {
        DynamicHostInterface dynamicHostInterface;
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b50fb91d9b030fb2ac215bbbca9c6086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b50fb91d9b030fb2ac215bbbca9c6086");
            return;
        }
        h.b(objArr, "args");
        DynamicHostInterface dynamicHostInterface2 = this.host;
        if (dynamicHostInterface2 != null) {
            dynamicHostInterface2.onDestroy();
        }
        DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback = this.hostReloadCallback;
        if (dynamicAgentHostReloadCallback != null) {
            dynamicAgentHostReloadCallback.reloadHost(Arrays.copyOf(objArr, objArr.length));
        }
        this.host = this.mHostCreator.create(Arrays.copyOf(objArr, objArr.length));
        DynamicHostInterface dynamicHostInterface3 = this.host;
        if (dynamicHostInterface3 != null) {
            dynamicHostInterface3.onLoad();
        }
        if (!this.isChassisActive || (dynamicHostInterface = this.host) == null) {
            return;
        }
        dynamicHostInterface.onChassisAppear();
    }

    public final void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ac35f75ed77e488d5ff6adb0d486540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ac35f75ed77e488d5ff6adb0d486540");
            return;
        }
        this.executor.setReloadHostCallback(this);
        this.executor.onChassisCreate();
        this.executor.initScript();
    }

    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86c5f888d3979d331c369b3d3c06af2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86c5f888d3979d331c369b3d3c06af2b");
            return;
        }
        this.isChassisActive = true;
        this.executor.onChassisResume();
        DynamicHostInterface dynamicHostInterface = this.host;
        if (dynamicHostInterface != null) {
            dynamicHostInterface.onChassisAppear();
        }
    }

    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b85f1bc4316647ba6fbbb526e28c0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b85f1bc4316647ba6fbbb526e28c0d4");
            return;
        }
        this.isChassisActive = false;
        DynamicHostInterface dynamicHostInterface = this.host;
        if (dynamicHostInterface != null) {
            dynamicHostInterface.onChassisDisappear();
        }
        this.executor.onChassisPause();
    }

    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97dfeb340d2d636cd9017a8c556a74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97dfeb340d2d636cd9017a8c556a74f");
            return;
        }
        this.executor.onChassisDestory();
        DynamicRefreshDelegate dynamicRefreshDelegate = this.refreshDelegate;
        if (dynamicRefreshDelegate != null) {
            dynamicRefreshDelegate.onDestroy();
        }
        DynamicHostInterface dynamicHostInterface = this.host;
        if (dynamicHostInterface != null) {
            dynamicHostInterface.onDestroy();
        }
        this.host = null;
    }

    public final void onMonitorPaintingStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1a8f7eac5eeb70c2cdd7037858e3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1a8f7eac5eeb70c2cdd7037858e3fe");
        } else {
            this.executor.onMonitorPaintingStart();
        }
    }

    public final void onMonitorPaintingEnd(@NotNull Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0659e785689315a75fd15e0167cbf194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0659e785689315a75fd15e0167cbf194");
            return;
        }
        h.b(set, "errorSet");
        this.executor.onMonitorPaintingEnd(set);
    }

    @Nullable
    public final d<Object> refreshHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9692dbb1c89a219391caf7236676aebd", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9692dbb1c89a219391caf7236676aebd");
        }
        if (this.host != null) {
            DynamicRefreshDelegate dynamicRefreshDelegate = this.refreshDelegate;
            if (dynamicRefreshDelegate != null) {
                return dynamicRefreshDelegate.onRefresh();
            }
            return null;
        }
        this.executor.refreshScript();
        return null;
    }

    public final void refreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80ecae6bbe3c40dc775c6a170ad3176b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80ecae6bbe3c40dc775c6a170ad3176b");
            return;
        }
        DynamicRefreshDelegate dynamicRefreshDelegate = this.refreshDelegate;
        if (dynamicRefreshDelegate != null) {
            dynamicRefreshDelegate.onRefreshEnd(i);
        }
    }

    public final void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92854c059fad174810073e6076b87e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92854c059fad174810073e6076b87e23");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicHostInterface dynamicHostInterface = this.host;
        if (dynamicHostInterface != null) {
            dynamicHostInterface.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Nullable
    public final DynamicHostInterface getHost() {
        return this.host;
    }
}
