package com.sankuai.xm.im.message.history;

import android.support.annotation.NonNull;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.session.SessionId;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends com.sankuai.xm.base.d {
    public static ChangeQuickRedirect c;
    protected a d;
    protected String e;
    protected List<IMMessage> f;

    public e(String str, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str, dVar);
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909fcdecf6c628458d8c942627b4f3b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909fcdecf6c628458d8c942627b4f3b9");
        }
    }

    public void a(a aVar) throws JSONException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f22d5e37b96b6ebae079e5169f4e51a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f22d5e37b96b6ebae079e5169f4e51a");
            return;
        }
        this.d = aVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lm", aVar.d);
        jSONObject.put("u", IMClient.a().k());
        jSONObject.put("ai", IMClient.a().g());
        jSONObject.put("od", 0);
        if (aVar.c.e == 3) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("u", aVar.c.b);
            if (aVar.c.c == 0) {
                jSONObject2.put(MessageStatisticsEntry.PARAM_CHANNEL, (int) aVar.c.g);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("ps", jSONArray);
            } else {
                jSONObject.put("pa", aVar.c.b);
                jSONObject.put("pu", aVar.c.c);
                jSONObject.put(MessageStatisticsEntry.PARAM_CHANNEL, aVar.c.g);
            }
            jSONObject.put("svid", TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE);
        } else {
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("b", aVar.c.b);
            jSONObject3.put(MessageStatisticsEntry.PARAM_CHANNEL, (int) aVar.c.g);
            if (aVar.c.e == 2) {
                jSONObject3.put(g.n, 1);
                jSONObject3.put("ai", (int) IMClient.a().g());
            } else {
                jSONObject3.put(g.n, 0);
                jSONObject3.put("ai", (int) aVar.c.d);
            }
            jSONArray2.put(jSONObject3);
            jSONObject.put("bs", jSONArray2);
            jSONObject.put("svid", 401);
        }
        if (aVar.j != null) {
            Iterator<String> it = aVar.j.keySet().iterator();
            if (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, aVar.j.get(next));
                this.e = next;
            }
        }
        a(jSONObject, aVar);
        a(jSONObject);
    }

    public boolean a(IMMessage iMMessage) {
        JSONObject F;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e20da7a6e3b147f507e822739eb386c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e20da7a6e3b147f507e822739eb386c")).booleanValue();
        }
        if (iMMessage != null) {
            try {
                if (this.d == null || (F = F()) == null || !ac.a(this.e, "id")) {
                    return false;
                }
                if (F.optLong(this.e, 0L) == iMMessage.getMsgId()) {
                    com.sankuai.xm.im.utils.a.d("HistoryRequest::fillContinueRequestParam duplicate request", new Object[0]);
                    return false;
                }
                F.put(this.e, iMMessage.getMsgId());
                a(F);
                return true;
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "HistoryRequest::fillContinueRequestParam", new Object[0]);
                return false;
            }
        }
        return false;
    }

    public final a d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final Object f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670f61b045195d04313c8372b7f999c9", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670f61b045195d04313c8372b7f999c9");
        }
        if (this.d.j == null) {
            return null;
        }
        return this.d.j.get(this.e);
    }

    public final void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28105dc05081ed615d6fd7954a40e6fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28105dc05081ed615d6fd7954a40e6fb");
            return;
        }
        synchronized (this) {
            if (com.sankuai.xm.base.util.b.a(this.f)) {
                this.f = new ArrayList();
            }
            this.f.addAll(list);
            com.sankuai.xm.im.utils.c.a((List<? extends Message>) this.f, true);
        }
    }

    public final List<IMMessage> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed4275521ce9b245a35dde2dbd94c07", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed4275521ce9b245a35dde2dbd94c07");
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (com.sankuai.xm.base.util.b.a(this.f)) {
                return arrayList;
            }
            arrayList.addAll(this.f);
            return arrayList;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public SessionId c;
        public int d;
        public long e;
        public long f;
        public short g;
        public int h;
        public String i;
        public HashMap<String, Object> j;
        HashMap<String, Object> k;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d603a43a2ea0a366d81a4fe75a076fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d603a43a2ea0a366d81a4fe75a076fc");
                return;
            }
            this.g = (short) 1;
            this.h = 0;
        }

        public final void a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d93589bbc98a436f65cc185f032505", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d93589bbc98a436f65cc185f032505");
                return;
            }
            this.j = new HashMap<>();
            this.j.put(str, obj);
            this.i = str;
        }

        public final void b(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1b4fa4c104e86c1989cf980a26f916", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1b4fa4c104e86c1989cf980a26f916");
                return;
            }
            if (this.k == null) {
                this.k = new HashMap<>();
            }
            this.k.put(str, obj);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50add5065bfdf12dbff0ea47aa8a349", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50add5065bfdf12dbff0ea47aa8a349");
            }
            return "Param{url='" + this.b + "', sessionId=" + this.c + ", limit=" + this.d + ", jts=" + this.e + ", msgID=" + this.f + ", priority=" + ((int) this.g) + ", queryType='" + this.i + "', extend=" + this.j + ", extraParams=" + this.k + '}';
        }
    }

    public final void a(@NonNull JSONObject jSONObject, a aVar) throws JSONException {
        Object[] objArr = {jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc1592841b7ab1315afa4c058684034a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc1592841b7ab1315afa4c058684034a");
        } else if (aVar == null || aVar.k == null || aVar.k.size() <= 0) {
        } else {
            JSONObject jSONObject2 = new JSONObject(aVar.k);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }

    public long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c655197f32ada3635ce022be6121b2", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c655197f32ada3635ce022be6121b2")).longValue();
        }
        try {
            if (ac.a(this.e, "id")) {
                return ((Long) this.d.j.get(this.e)).longValue();
            }
            return 0L;
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e, "HistoryRequest::fillContinueRequestParam", new Object[0]);
            return 0L;
        }
    }
}
