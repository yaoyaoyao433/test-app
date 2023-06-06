package com.sankuai.waimai.alita.core.jsexecutor.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.alita.core.jsexecutor.modules.AlitaIntentionNativeModules;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.l
    public final String a() {
        return "Core";
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7058ab3efbeb9f071a434c8796c1e64b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7058ab3efbeb9f071a434c8796c1e64b");
            return;
        }
        a("finishCallBack", new h());
        a("networkRequest", new NetworkRequestMethod());
        a("alitaNetworkRequest", new d());
        a("getFeaturesWithBiz", new i());
        a("sqlQuery", new q());
        a("updateFeatures", new v());
        a("removeTable", new o());
        a("replaceFeatureTable", new p());
        a("predictModel", new n());
        a("dataUpStream", new f());
        a("destroy", new g());
        a("getRuleList", new j());
        a("setRuleList", new u());
        a("sendAlitaEvent", new s());
        a("sendAlitaEventAfterDelay", new r());
        a("sendAlitaLog", new t());
        a("getIntentions", new AlitaIntentionNativeModules.AlitaGetIntentionsNativeMethod());
        a("updateIntention", new AlitaIntentionNativeModules.b());
        a("removeIntention", new AlitaIntentionNativeModules.a());
        a("addBundlesAutoRunning", new c());
    }
}
