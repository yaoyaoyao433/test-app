package com.dianping.shield.manager.util;

import com.dianping.agentsdk.framework.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u0007J.\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\rH\u0007¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/manager/util/AgentManagerUtils;", "", "()V", "combineArguments", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "agentInfo", "Lcom/dianping/agentsdk/framework/AgentInfo;", "parentArguments", "sortedMap", "", "", "map", "AgentInfoExtra", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AgentManagerUtils {
    public static final AgentManagerUtils INSTANCE = new AgentManagerUtils();
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @NotNull
    public static final List<Map<String, b>> sortedMap(@NotNull Map<String, ? extends b> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db77c8d690c56ccee4f37870263c2b84", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db77c8d690c56ccee4f37870263c2b84");
        }
        h.b(map, "map");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends b> entry : map.entrySet()) {
            arrayList.add(new AgentInfoExtra(entry.getKey(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Integer valueOf = Integer.valueOf(((AgentInfoExtra) obj).getAgentInfo().f);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        SortedMap a = v.a(linkedHashMap);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : a.entrySet()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object value = entry2.getValue();
            h.a(value, "it.value");
            for (AgentInfoExtra agentInfoExtra : (Iterable) value) {
                linkedHashMap2.put(agentInfoExtra.getHostName(), agentInfoExtra.getAgentInfo());
            }
            arrayList2.add(linkedHashMap2);
        }
        return arrayList2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/manager/util/AgentManagerUtils$AgentInfoExtra;", "", "hostName", "", "agentInfo", "Lcom/dianping/agentsdk/framework/AgentInfo;", "(Ljava/lang/String;Lcom/dianping/agentsdk/framework/AgentInfo;)V", "getAgentInfo", "()Lcom/dianping/agentsdk/framework/AgentInfo;", "getHostName", "()Ljava/lang/String;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class AgentInfoExtra {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final b agentInfo;
        @NotNull
        private final String hostName;

        public AgentInfoExtra(@NotNull String str, @NotNull b bVar) {
            h.b(str, "hostName");
            h.b(bVar, "agentInfo");
            Object[] objArr = {str, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e080b3b984ab702cc30d71eeb43fd1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e080b3b984ab702cc30d71eeb43fd1e");
                return;
            }
            this.hostName = str;
            this.agentInfo = bVar;
        }

        @NotNull
        public final b getAgentInfo() {
            return this.agentInfo;
        }

        @NotNull
        public final String getHostName() {
            return this.hostName;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r0 == null) goto L22;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.io.Serializable> combineArguments(@org.jetbrains.annotations.Nullable com.dianping.agentsdk.framework.b r11, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, java.io.Serializable> r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.manager.util.AgentManagerUtils.changeQuickRedirect
            java.lang.String r10 = "1f3ffc85e6e858aae5038dd9f36387ad"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.util.HashMap r11 = (java.util.HashMap) r11
            return r11
        L21:
            if (r12 == 0) goto L5c
            if (r11 == 0) goto L5b
            java.util.HashMap<java.lang.String, java.io.Serializable> r0 = r11.g
            if (r0 == 0) goto L5b
            r1 = r12
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r0.containsKey(r4)
            if (r4 != 0) goto L34
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r4.put(r5, r3)
            goto L34
        L59:
            if (r0 != 0) goto L5c
        L5b:
            return r12
        L5c:
            if (r11 == 0) goto L61
            java.util.HashMap<java.lang.String, java.io.Serializable> r11 = r11.g
            return r11
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.util.AgentManagerUtils.combineArguments(com.dianping.agentsdk.framework.b, java.util.HashMap):java.util.HashMap");
    }
}
