package com.sankuai.xm.coredata.offline;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.sankuai.xm.b;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.net.c;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.network.httpurlconnection.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    com.sankuai.xm.coredata.processor.a b;

    public a(com.sankuai.xm.coredata.processor.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef0e4a21181c6429ee0fc7f1bcc848b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef0e4a21181c6429ee0fc7f1bcc848b");
        } else {
            this.b = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.coredata.offline.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1379a extends d {
        public static ChangeQuickRedirect a;
        private com.sankuai.xm.base.d c;
        private long d;
        private List<DataMessage> e;

        public C1379a(com.sankuai.xm.base.d dVar) {
            Object[] objArr = {a.this, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79caf8fe8078b9eb0ac84e8727a69d3d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79caf8fe8078b9eb0ac84e8727a69d3d");
                return;
            }
            this.c = dVar;
            this.e = new ArrayList();
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e3e927a4fd545d1faf579c12990dd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e3e927a4fd545d1faf579c12990dd4");
                return;
            }
            super.a();
            int intValue = this.c.c("lm") == null ? 200 : ((Integer) this.c.c("lm")).intValue();
            int intValue2 = this.c.c("os") == null ? 0 : ((Integer) this.c.c("os")).intValue();
            Object[] objArr2 = {Integer.valueOf(intValue2), Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37faa6766ba0151e40a10ebf284b2ebb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37faa6766ba0151e40a10ebf284b2ebb");
            } else {
                b.a("DataOfflineController::offlineStartEvent offset:" + intValue2 + " limit:" + intValue, new Object[0]);
            }
            this.d = System.currentTimeMillis();
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce9820e9d0cdec378c23a5f27e2ac2a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce9820e9d0cdec378c23a5f27e2ac2a");
                return;
            }
            c a2 = new c(jSONObject).a("data");
            JSONArray f = a2.f(APKStructure.Res_Type);
            if (f == null || f.length() == 0) {
                Object[] objArr2 = new Object[0];
                Object[] objArr3 = {"DataOfflineController::OfflineJsonCallback, Res = 0", objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "a860187406aaba14836b607ba9b79e9a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "a860187406aaba14836b607ba9b79e9a");
                } else {
                    com.sankuai.xm.log.a.a().c("imcoredata", "DataOfflineController::OfflineJsonCallback, Res = 0", objArr2);
                }
                a(0, 0, this.d);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f.length(); i++) {
                byte[] a3 = m.a().a(f.getString(i));
                if (a3 != null && a3.length != 0) {
                    com.sankuai.xm.base.proto.a aVar = new com.sankuai.xm.base.proto.a();
                    aVar.a(a3);
                    byte[][] bArr = aVar.b;
                    if (bArr != null) {
                        a(bArr, arrayList);
                    }
                }
            }
            int c = a2.c("next");
            a(c, arrayList.size(), this.d);
            this.e.addAll(arrayList);
            Object[] objArr4 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "4ea3a5f09e9f31e306a08b884301557b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "4ea3a5f09e9f31e306a08b884301557b");
            } else if (!com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                a.this.b.a((List<DataMessage>) arrayList, true);
            }
            if (c > 0) {
                String str = "DataOfflineController::PullOffLineMsgTask.run, next > 0, next=" + c;
                Object[] objArr5 = new Object[0];
                Object[] objArr6 = {str, objArr5};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect4, true, "5785261e9a20517e5b92860c26fb0ded", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect4, true, "5785261e9a20517e5b92860c26fb0ded");
                } else {
                    com.sankuai.xm.log.a.a().a("imcoredata", str, objArr5);
                }
                this.c.a("os", Integer.valueOf(c));
                this.c.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                m.f().b(this.c);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db405a9bb0607f267e513498c9456d70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db405a9bb0607f267e513498c9456d70");
                return;
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec845dcab864e49bc71e03e0c230c819", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec845dcab864e49bc71e03e0c230c819");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("reason", Integer.valueOf(i));
            m.d().a("dataofer", hashMap);
        }

        private void a(byte[][] bArr, List<DataMessage> list) {
            Object[] objArr = {bArr, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882e05179bc77adce705a0f946fd4518", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882e05179bc77adce705a0f946fd4518");
                return;
            }
            for (byte[] bArr2 : bArr) {
                if (bArr2 == null || bArr2.length == 0) {
                    b.b("DataOfflineController::parseOfflineMessages => some thing wrong in server", new Object[0]);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr2);
                    wrap.getInt();
                    int i = wrap.getInt();
                    wrap.getShort();
                    if (i == 72155137) {
                        com.sankuai.xm.base.proto.data.d dVar = new com.sankuai.xm.base.proto.data.d();
                        dVar.a(bArr2);
                        list.add(com.sankuai.xm.coredata.util.a.a(dVar));
                    }
                }
            }
        }

        private void a(int i, int i2, long j) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d2ede23a2b06cdad4fdd13cf24d699", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d2ede23a2b06cdad4fdd13cf24d699");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(i2));
            hashMap.put("next", Integer.valueOf(i));
            hashMap.put("time", Long.valueOf(System.currentTimeMillis() - j));
            if (i <= 0) {
                hashMap.put("total", Integer.valueOf(com.sankuai.xm.base.util.b.b(this.e)));
            }
            m.d().a("dataofss", hashMap);
        }
    }
}
