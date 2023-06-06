package com.dianping.agentsdk.agent;

import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.b;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.dianping.dataservice.mapi.g;
import com.dianping.shield.agent.LightAgent;
import com.dianping.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HoloAgent extends LightAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected v bridge;
    private Map<e, d<e, f>> mapiRequestMap;

    public HoloAgent(Fragment fragment, v vVar, ab abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd5cd6228ed3ded7cd4ebe0ac6753d31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd5cd6228ed3ded7cd4ebe0ac6753d31");
            return;
        }
        this.mapiRequestMap = new HashMap();
        this.bridge = vVar;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0937a3f9667f33b0d0a9bb40138179a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0937a3f9667f33b0d0a9bb40138179a");
            return;
        }
        for (e eVar : this.mapiRequestMap.keySet()) {
            if (this.bridge.mapiService() != null) {
                this.bridge.mapiService().abort(eVar, this.mapiRequestMap.get(eVar), true);
            }
            String simpleName = getClass().getSimpleName();
            h.b(simpleName, "abort a request from the map with url: " + eVar.a());
        }
        super.onDestroy();
    }

    public e mapiGet(d<e, f> dVar, String str, c cVar) {
        Object[] objArr = {dVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07aa848112d6da4cf42cb8011d4168c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07aa848112d6da4cf42cb8011d4168c9");
        }
        e a = b.a(this.bridge.appendUrlParms(str), cVar);
        e findRequest = findRequest(this.mapiRequestMap.keySet(), a);
        if (findRequest != null && this.bridge.mapiService() != null) {
            this.bridge.mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            String simpleName = getClass().getSimpleName();
            h.b(simpleName, "abort an existed request with the same url: " + a.a());
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    public e mapiPost(d<e, f> dVar, String str, String... strArr) {
        Object[] objArr = {dVar, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1953d5af080185b64311a172a2d1483f", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1953d5af080185b64311a172a2d1483f");
        }
        e a = b.a(str, strArr);
        e findRequest = findRequest(this.mapiRequestMap.keySet(), a);
        if (findRequest != null && this.bridge.mapiService() != null) {
            this.bridge.mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            String simpleName = getClass().getSimpleName();
            h.b(simpleName, "abort an existed request with the same url: " + a.a());
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    private e findRequest(Set<e> set, e eVar) {
        Object[] objArr = {set, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa1fef7d8c7dd6426a3600363f08c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa1fef7d8c7dd6426a3600363f08c0a");
        }
        String a = eVar.a();
        if (a.lastIndexOf(CommonConstant.Symbol.QUESTION_MARK) >= 0) {
            a = a.substring(0, a.lastIndexOf(CommonConstant.Symbol.QUESTION_MARK));
        }
        if (a.length() == 0) {
            return null;
        }
        for (e eVar2 : set) {
            if (eVar2.a().startsWith(a)) {
                return eVar2;
            }
        }
        return null;
    }

    public String token() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf0ad0fa77200db6b9cd1f3ce5f1dc50", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf0ad0fa77200db6b9cd1f3ce5f1dc50") : this.bridge.getToken();
    }

    public boolean isLogined() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6d92a47a5f95aea9c2d58ee05e829fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6d92a47a5f95aea9c2d58ee05e829fd")).booleanValue() : this.bridge.isLogin();
    }

    public long cityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b6d763b41dbc6499f45075276d6b424", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b6d763b41dbc6499f45075276d6b424")).longValue() : this.bridge.cityid();
    }

    public double latitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32efe6facae9bab051440fdb9c983893", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32efe6facae9bab051440fdb9c983893")).doubleValue() : this.bridge.latitude();
    }

    public double longitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cae47e7c38ce09114b95ac5170255675", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cae47e7c38ce09114b95ac5170255675")).doubleValue() : this.bridge.longitude();
    }

    public g mapiService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e0a27f152b871bd12b1f64a952b4fd2", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e0a27f152b871bd12b1f64a952b4fd2") : this.bridge.mapiService();
    }

    public String fingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7621e872fe7c5647b294a93189b94248", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7621e872fe7c5647b294a93189b94248") : this.bridge.fingerPrint();
    }

    public v getBridge() {
        return this.bridge;
    }
}
