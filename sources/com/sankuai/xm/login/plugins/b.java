package com.sankuai.xm.login.plugins;

import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.sankuai.xm.base.d;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.login.manager.b;
import com.sankuai.xm.login.manager.c;
import com.sankuai.xm.network.setting.f;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cafd16fce7886c27918ea42328e4bba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cafd16fce7886c27918ea42328e4bba");
        } else if (cVar.a() == 0) {
            a();
            long j = cVar.b;
            String str = cVar.e;
            Object[] objArr2 = {new Long(j), str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3a1f47b76638d95a040907df66f9db9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3a1f47b76638d95a040907df66f9db9");
            } else if (!com.sankuai.xm.login.a.a().d() || com.sankuai.xm.login.a.a().d == 1) {
                final String str2 = "ALTOKEN_EXTEND_TIME_" + j + CommonConstant.Symbol.UNDERLINE + f.a().b().e();
                long j2 = m.b().getLong(str2, 0L);
                if (!ac.a(str) && System.currentTimeMillis() - j2 < 86400000) {
                    a(str);
                    return;
                }
                d dVar = new d(f.a().b().a(false) + "/account/api/v3/login/extend", new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.login.plugins.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(int i, String str3) {
                    }

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(JSONObject jSONObject) throws Exception {
                        Object[] objArr3 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b303211edbb1cb5fdc63f982dadd8124", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b303211edbb1cb5fdc63f982dadd8124");
                            return;
                        }
                        com.sankuai.xm.base.util.net.c a2 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
                        if (a2 == null) {
                            return;
                        }
                        String b = a2.b("alToken");
                        if (!ac.a(b) && !b.equals(com.sankuai.xm.login.a.a().f())) {
                            com.sankuai.xm.login.a.a().a(b);
                            b.this.a(b);
                        }
                        m.b().a(str2, System.currentTimeMillis());
                    }
                });
                dVar.b("al", str);
                dVar.b("ck", com.sankuai.xm.login.a.a().i());
                dVar.l = 1;
                m.f().b(dVar);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605465ac11b2fe53815d82311eab22ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605465ac11b2fe53815d82311eab22ad");
            return;
        }
        m.a();
        if (com.sankuai.xm.login.a.a().b == 0) {
            com.sankuai.xm.login.d.c("TokenPlugin::updateAppToken:uid = 0", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("u", Long.valueOf(com.sankuai.xm.login.a.a().b));
        hashMap.put("ai", Short.valueOf(com.sankuai.xm.login.a.a().d));
        hashMap.put("pa", m.a().d());
        if (!ac.a(com.sankuai.xm.login.a.a().c)) {
            hashMap.put(Constants.Environment.KEY_DM, "Android");
            hashMap.put("tk", com.sankuai.xm.login.a.a().c);
        }
        hashMap.put("xd", com.sankuai.xm.login.a.a().k());
        hashMap.put(TimeDisplaySetting.TIME_DISPLAY, com.sankuai.xm.login.a.a().j());
        String a2 = f.a().b().a(false);
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(ac.a(com.sankuai.xm.login.a.a().c) ? "/token/api/v1/del" : "/token/api/v1/set");
        String sb2 = sb.toString();
        com.sankuai.xm.network.httpurlconnection.retry.b bVar = new com.sankuai.xm.network.httpurlconnection.retry.b(new long[]{1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, PayTask.j});
        d dVar = new d(sb2, hashMap, new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.login.plugins.b.1
            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(int i, String str) {
            }

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(JSONObject jSONObject) {
            }
        });
        dVar.a(bVar);
        dVar.l = 1;
        m.f().b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e4356d29c684a16bd3041ce700b097", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e4356d29c684a16bd3041ce700b097");
        } else {
            ((l) m.a(l.class)).b(b.InterfaceC1409b.class).a(new b.a<b.InterfaceC1409b>() { // from class: com.sankuai.xm.login.plugins.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(b.InterfaceC1409b interfaceC1409b) {
                    b.InterfaceC1409b interfaceC1409b2 = interfaceC1409b;
                    Object[] objArr2 = {interfaceC1409b2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc1018a6c0c53926ef3abd0a48867129", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc1018a6c0c53926ef3abd0a48867129")).booleanValue();
                    }
                    if (interfaceC1409b2 != null) {
                        interfaceC1409b2.a(str);
                    }
                    return false;
                }
            });
        }
    }
}
