package com.sankuai.xm.im.message.history;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.sankuai.xm.base.proto.protobase.f;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends com.sankuai.xm.network.httpurlconnection.d {
    public static ChangeQuickRedirect a;
    private e b;
    private int c;

    public void a(int i, int i2, List<IMMessage> list) {
    }

    public a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f40727df954ff029c907a1654f32678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f40727df954ff029c907a1654f32678");
            return;
        }
        this.b = eVar;
        this.c = i;
    }

    @Override // com.sankuai.xm.network.httpurlconnection.c
    public final void a() {
        long[] jArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3e34f55f65af57b73cb027dbeb77c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3e34f55f65af57b73cb027dbeb77c8");
            return;
        }
        super.a();
        if (this.b != null) {
            e eVar = this.b;
            Object[] objArr2 = {eVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52d2d2e72d3b20cf7209df87bd6812c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52d2d2e72d3b20cf7209df87bd6812c9");
            } else if (TextUtils.isEmpty(eVar.e()) || !"st-msgidB".equals(eVar.e()) || (jArr = (long[]) eVar.f()) == null || jArr.length < 2) {
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(jArr[1]);
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("uid", Long.valueOf(com.sankuai.xm.login.a.a().e()));
                hashMap.put("msg", eVar.d().toString());
                hashMap.put("seqId", eVar.y());
                if (eVar.d().c.e == 2) {
                    com.sankuai.xm.monitor.c.a("gphsst", hashMap);
                    com.sankuai.xm.monitor.c.a("gphsss", sb2);
                } else if (MessageUtils.isIMPeerService(eVar.d().c.e)) {
                    com.sankuai.xm.monitor.c.a("imhsst", hashMap);
                    com.sankuai.xm.monitor.c.a("imhsss", sb2);
                } else {
                    com.sankuai.xm.monitor.c.a("pbhsst", hashMap);
                    com.sankuai.xm.monitor.c.a("pbhsss", sb2);
                }
            }
        }
    }

    @Override // com.sankuai.xm.network.httpurlconnection.d
    public final void a(JSONObject jSONObject) throws Exception {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb465cdc9c632da064b348fa4e0ef9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb465cdc9c632da064b348fa4e0ef9f");
            return;
        }
        com.sankuai.xm.base.util.net.c cVar = new com.sankuai.xm.base.util.net.c(jSONObject);
        JSONArray f = cVar.f("chats");
        Object[] objArr2 = {f};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a73d221b9a896f25277ba213beedb1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a73d221b9a896f25277ba213beedb1a");
        } else if (f != null && f.length() > 0 && (optJSONObject = f.optJSONObject(0)) != null) {
            SessionId sessionId = this.b.d.c;
            long optLong = optJSONObject.optLong("chatTs", 0L);
            if (optLong < 0) {
                com.sankuai.xm.im.utils.a.c("HistoryCallback::parseChats: request for chatTs: no valid chatTs", new Object[0]);
            } else {
                long a2 = IMClient.a().j().a(sessionId);
                com.sankuai.xm.im.utils.a.b("HistoryCallback::onSuccess: request for chatTs: %s, local chat ts: %s.", Long.valueOf(optLong), Long.valueOf(a2));
                if (optLong > a2) {
                    IMClient.a().j().a(com.sankuai.xm.base.util.b.a(sessionId), optLong);
                }
            }
        }
        com.sankuai.xm.base.util.net.c a3 = cVar.a("data");
        JSONArray f2 = a3.f(APKStructure.Res_Type);
        int c = a3.c("next");
        if (f2 == null || f2.length() == 0) {
            a(0, -1, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f2.length(); i++) {
            byte[] decode = Base64.decode(f2.getString(i), 0);
            com.sankuai.xm.base.proto.a aVar = new com.sankuai.xm.base.proto.a();
            aVar.a(decode);
            byte[][] a4 = aVar.a();
            if (a4 != null) {
                a(a4, arrayList);
            }
        }
        a(0, c, arrayList);
    }

    @Override // com.sankuai.xm.network.httpurlconnection.d
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8521a6e8c75cef4d22e7af056d2c1a79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8521a6e8c75cef4d22e7af056d2c1a79");
        } else {
            a(i, -1, null);
        }
    }

    private void a(byte[][] bArr, List<IMMessage> list) {
        Object[] objArr = {bArr, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ebfccb8f51cfcfb255ef8ba70f1dff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ebfccb8f51cfcfb255ef8ba70f1dff8");
            return;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null || bArr2.length == 0) {
                com.sankuai.xm.im.utils.a.d("PullHistoryMsgBaseTask.parseHistoryMessages, get empty packet", new Object[0]);
            } else {
                int d = f.d(bArr2);
                IMMessage msgProtoToIMMessage = MessageUtils.msgProtoToIMMessage(bArr2, d);
                if (msgProtoToIMMessage == null) {
                    msgProtoToIMMessage = MessageUtils.cancelProtoToIMMessage(bArr2, d);
                }
                if (msgProtoToIMMessage != null) {
                    list.add(msgProtoToIMMessage);
                }
            }
        }
    }
}
