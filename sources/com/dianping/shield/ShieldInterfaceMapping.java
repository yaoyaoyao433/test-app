package com.dianping.shield;

import com.dianping.eunomia.c;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.monitor.ShieldSpeedData;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u000eR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/ShieldInterfaceMapping;", "", "()V", "agentMap", "Ljava/util/LinkedHashMap;", "Lcom/dianping/shield/AgentRegisterKey;", "Lcom/dianping/shield/framework/ShieldConfigInfo;", "getAgentMap", "()Ljava/util/LinkedHashMap;", "defaultMappingListObj", "shieldMappingInterfaces", "Ljava/util/ArrayList;", "Lcom/dianping/shield/ShieldMappingInterface;", "addShieldConfigInfo", "", "key", "shieldConfigInfo", "addShieldMapping", "shieldMappingInterface", "getAgentInner", "item", "Lcom/dianping/eunomia/ModuleConfigItem;", "loadDefaultMapping", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldInterfaceMapping {
    public static final ShieldInterfaceMapping INSTANCE;
    @NotNull
    private static final LinkedHashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Object defaultMappingListObj;
    private static final ArrayList<ShieldMappingInterface> shieldMappingInterfaces;

    static {
        ShieldInterfaceMapping shieldInterfaceMapping = new ShieldInterfaceMapping();
        INSTANCE = shieldInterfaceMapping;
        agentMap = new LinkedHashMap<>();
        shieldMappingInterfaces = new ArrayList<>();
        try {
            ShieldSpeedData startEvent = ShieldSpeedData.Companion.obtain("javaClass").startEvent();
            List<ShieldMappingInterface> a = b.a(ShieldMappingInterface.class, null, new Object[0]);
            h.a((Object) a, "ServiceLoader.load(Shiel…erface::class.java, null)");
            for (ShieldMappingInterface shieldMappingInterface : a) {
                shieldMappingInterfaces.add(shieldMappingInterface);
            }
            if (shieldMappingInterfaces.isEmpty()) {
                shieldInterfaceMapping.loadDefaultMapping();
            }
            startEvent.addEvent(ShieldSpeedStep.SHIELD_STEP_FIRST.getStep()).send();
        } catch (Throwable unused) {
            ShieldLogger.codeLogError$default(ShieldEnvironment.INSTANCE.getShieldLogger(), ShieldInterfaceMapping.class, "Agent Mapping ServiceLoader has a exception", null, 4, null);
            shieldInterfaceMapping.loadDefaultMapping();
        }
    }

    @NotNull
    public final LinkedHashMap<AgentRegisterKey, ShieldConfigInfo> getAgentMap() {
        return agentMap;
    }

    public final void loadDefaultMapping() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72e49bc1ef4ec5d3f63025fb0ec36de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72e49bc1ef4ec5d3f63025fb0ec36de");
            return;
        }
        try {
            defaultMappingListObj = Class.forName("com.dianping.agentmapping.DefaultAgentMappingList").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final ShieldConfigInfo getAgentInner(@NotNull AgentRegisterKey agentRegisterKey, @Nullable c cVar) {
        Object[] objArr = {agentRegisterKey, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a093c6a49d8689d6338a7426793daef", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a093c6a49d8689d6338a7426793daef");
        }
        h.b(agentRegisterKey, "key");
        if (agentRegisterKey.extraKey != null) {
            ShieldConfigInfo shieldConfigInfo = agentMap.get(agentRegisterKey);
            if (shieldConfigInfo != null) {
                Object clone = shieldConfigInfo.clone();
                if (clone != null) {
                    return (ShieldConfigInfo) clone;
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.framework.ShieldConfigInfo");
            }
            ShieldConfigInfo shieldConfigInfo2 = agentMap.get(new AgentRegisterKey(agentRegisterKey.key, null, agentRegisterKey.namespace));
            if (shieldConfigInfo2 != null) {
                Object clone2 = shieldConfigInfo2.clone();
                if (clone2 != null) {
                    return (ShieldConfigInfo) clone2;
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.framework.ShieldConfigInfo");
            }
            return null;
        }
        ShieldConfigInfo shieldConfigInfo3 = agentMap.get(agentRegisterKey);
        if (shieldConfigInfo3 != null) {
            Object clone3 = shieldConfigInfo3.clone();
            if (clone3 != null) {
                return (ShieldConfigInfo) clone3;
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.framework.ShieldConfigInfo");
        }
        return shieldConfigInfo3;
    }

    public final void addShieldMapping(@NotNull ShieldMappingInterface shieldMappingInterface) {
        Object[] objArr = {shieldMappingInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d352ca1711794485ca4dfc02966235b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d352ca1711794485ca4dfc02966235b7");
            return;
        }
        h.b(shieldMappingInterface, "shieldMappingInterface");
        shieldMappingInterfaces.add(shieldMappingInterface);
    }

    public final void addShieldConfigInfo(@NotNull AgentRegisterKey agentRegisterKey, @NotNull ShieldConfigInfo shieldConfigInfo) {
        Object[] objArr = {agentRegisterKey, shieldConfigInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917ef7754c7765fadadda40d4b2989c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917ef7754c7765fadadda40d4b2989c9");
            return;
        }
        h.b(agentRegisterKey, "key");
        h.b(shieldConfigInfo, "shieldConfigInfo");
        agentMap.put(agentRegisterKey, shieldConfigInfo);
    }
}
