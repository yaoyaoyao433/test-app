package com.dianping.shield.bridge;

import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.b;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.dianping.portal.feature.h;
import com.dianping.shield.env.ShieldEnvironment;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J2\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00072\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016JC\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00072\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0019\"\u00020\u0014¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RR\u0010\u0005\u001aF\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\t0\b0\u0006j\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\t0\b`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/bridge/MapiRequestRecycler;", "", "bridge", "Lcom/dianping/portal/feature/ServiceProviderInterface;", "(Lcom/dianping/portal/feature/ServiceProviderInterface;)V", "mapiRequestMap", "Ljava/util/HashMap;", "Lcom/dianping/dataservice/mapi/MApiRequest;", "Lcom/dianping/dataservice/RequestHandler;", "Lcom/dianping/dataservice/mapi/MApiResponse;", "Lkotlin/collections/HashMap;", "destoryRequest", "", "findRequest", "set", "", HiAnalyticsConstant.Direction.REQUEST, "mapiGet", "handler", "url", "", "defaultCacheType", "Lcom/dianping/dataservice/mapi/CacheType;", "mapiPost", "forms", "", "(Lcom/dianping/dataservice/RequestHandler;Ljava/lang/String;[Ljava/lang/String;)Lcom/dianping/dataservice/mapi/MApiRequest;", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class MapiRequestRecycler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final h bridge;
    private final HashMap<e<?>, d<e<?>, f>> mapiRequestMap;

    public MapiRequestRecycler(@NotNull h hVar) {
        kotlin.jvm.internal.h.b(hVar, "bridge");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "565948c0181082485847be1712e7a590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "565948c0181082485847be1712e7a590");
            return;
        }
        this.bridge = hVar;
        this.mapiRequestMap = new HashMap<>();
    }

    public final void destoryRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92afa35793f1953ea61779eada88a70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92afa35793f1953ea61779eada88a70c");
            return;
        }
        for (e<?> eVar : this.mapiRequestMap.keySet()) {
            this.bridge.mapiService().abort(eVar, this.mapiRequestMap.get(eVar), true);
            if (ShieldEnvironment.INSTANCE.isDebug()) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                String simpleName = getClass().getSimpleName();
                shieldLogger.i(simpleName, "abort a request from the map with url: " + eVar.a(), new Object[0]);
            }
        }
    }

    @NotNull
    public final e<?> mapiGet(@NotNull d<e<?>, f> dVar, @NotNull String str, @NotNull c cVar) {
        Object[] objArr = {dVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27052274bc4116d92d7d8a3d18c6d873", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27052274bc4116d92d7d8a3d18c6d873");
        }
        kotlin.jvm.internal.h.b(dVar, "handler");
        kotlin.jvm.internal.h.b(str, "url");
        kotlin.jvm.internal.h.b(cVar, "defaultCacheType");
        e<?> a = b.a(this.bridge.appendUrlParms(str), cVar);
        Set<e<?>> keySet = this.mapiRequestMap.keySet();
        kotlin.jvm.internal.h.a((Object) keySet, "mapiRequestMap.keys");
        kotlin.jvm.internal.h.a((Object) a, HiAnalyticsConstant.Direction.REQUEST);
        e<?> findRequest = findRequest(keySet, a);
        if (findRequest != null) {
            this.bridge.mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            if (ShieldEnvironment.INSTANCE.isDebug()) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                String simpleName = getClass().getSimpleName();
                shieldLogger.i(simpleName, "abort an existed request with the same url: " + a.a(), new Object[0]);
            }
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    @NotNull
    public final e<?> mapiPost(@NotNull d<e<?>, f> dVar, @NotNull String str, @NotNull String... strArr) {
        Object[] objArr = {dVar, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bdb62184fc606e9fb5b34552bb40566", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bdb62184fc606e9fb5b34552bb40566");
        }
        kotlin.jvm.internal.h.b(dVar, "handler");
        kotlin.jvm.internal.h.b(str, "url");
        kotlin.jvm.internal.h.b(strArr, "forms");
        e<?> a = b.a(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        Set<e<?>> keySet = this.mapiRequestMap.keySet();
        kotlin.jvm.internal.h.a((Object) keySet, "mapiRequestMap.keys");
        kotlin.jvm.internal.h.a((Object) a, HiAnalyticsConstant.Direction.REQUEST);
        e<?> findRequest = findRequest(keySet, a);
        if (findRequest != null) {
            this.bridge.mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            if (ShieldEnvironment.INSTANCE.isDebug()) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                String simpleName = getClass().getSimpleName();
                shieldLogger.i(simpleName, "abort an existed request with the same url: " + a.a(), new Object[0]);
            }
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    private final e<?> findRequest(Set<? extends e<?>> set, e<?> eVar) {
        Object[] objArr = {set, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1078dd08ce842c2e8057936800eae33", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1078dd08ce842c2e8057936800eae33");
        }
        String a = eVar.a();
        kotlin.jvm.internal.h.a((Object) a, "req.url()");
        kotlin.jvm.internal.h.b(a, "$this$substringBefore");
        kotlin.jvm.internal.h.b(CommonConstant.Symbol.QUESTION_MARK, "delimiter");
        kotlin.jvm.internal.h.b(a, "missingDelimiterValue");
        int a2 = g.a((CharSequence) a, CommonConstant.Symbol.QUESTION_MARK, 0, false, 6, (Object) null);
        if (a2 != -1) {
            a = a.substring(0, a2);
            kotlin.jvm.internal.h.a((Object) a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Object obj = null;
        if (a.length() == 0) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String a3 = ((e) next).a();
            kotlin.jvm.internal.h.a((Object) a3, "it.url()");
            if (g.b(a3, a, false)) {
                obj = next;
                break;
            }
        }
        return (e) obj;
    }
}
