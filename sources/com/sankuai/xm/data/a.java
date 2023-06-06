package com.sankuai.xm.data;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.processor.c;
import com.sankuai.xm.data.b;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.file.transfer.d;
import com.sankuai.xm.network.httpurlconnection.e;
import com.sankuai.xm.network.httpurlconnection.g;
import com.sankuai.xm.network.setting.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements c, d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.file.transfer.d
    public final void onError(TransferContext transferContext, int i, String str) {
    }

    @Override // com.sankuai.xm.file.transfer.d
    public final void onProgress(TransferContext transferContext, double d, double d2) {
    }

    @Override // com.sankuai.xm.coredata.processor.c
    public final boolean a(DataMessage dataMessage, boolean z) {
        boolean z2 = false;
        Object[] objArr = {dataMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b22da8f1b5959bafbb64ff9be257b0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b22da8f1b5959bafbb64ff9be257b0")).booleanValue();
        }
        if (dataMessage == null || dataMessage.getType() != 113) {
            return false;
        }
        if (dataMessage.getData() == null && !com.sankuai.xm.d.d().bQ_()) {
            com.sankuai.xm.d.d().b(dataMessage);
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(dataMessage.getData(), 2)));
            int optInt = jSONObject.optInt("insType");
            if (optInt == 2) {
                int optInt2 = jSONObject.optInt("level", -1);
                int optInt3 = jSONObject.optInt("expireIn", -1);
                int optInt4 = jSONObject.optInt("insId");
                Object[] objArr2 = {Integer.valueOf(optInt4), Integer.valueOf(optInt2), Integer.valueOf(optInt3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0714a16ff87cbfea4187b484db79c102", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0714a16ff87cbfea4187b484db79c102");
                } else {
                    if (optInt3 < 0) {
                        optInt3 = 0;
                    }
                    com.sankuai.xm.log.c.a(optInt2);
                    com.sankuai.xm.threadpool.scheduler.a.b().a(21, new Runnable() { // from class: com.sankuai.xm.data.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "742362cab3b682e1f9b7c038b2bd0946", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "742362cab3b682e1f9b7c038b2bd0946");
                            } else {
                                com.sankuai.xm.log.c.a(3);
                            }
                        }
                    }, optInt3 * 1000);
                    Object[] objArr3 = {Integer.valueOf(optInt4), Integer.valueOf(optInt2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0ff52c87ef912931b5a647ad58296f3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0ff52c87ef912931b5a647ad58296f3");
                    } else {
                        String a2 = a("/clientInst/v1/api/callback/logSettingResult");
                        b.a aVar = new b.a();
                        aVar.a = optInt4;
                        aVar.f = 2;
                        aVar.c = "";
                        aVar.b = 0;
                        aVar.d = optInt2;
                        b bVar = new b(a2, null);
                        bVar.a(aVar);
                        bVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                        g.a().a((e) bVar, 0L);
                    }
                }
            } else {
                if (optInt == 4) {
                    a(jSONObject, jSONObject.optInt("insId"));
                }
                if (z2 && !com.sankuai.xm.d.d().bQ_()) {
                    com.sankuai.xm.d.d().b(dataMessage);
                }
                return z2;
            }
            z2 = true;
            if (z2) {
                com.sankuai.xm.d.d().b(dataMessage);
            }
            return z2;
        } catch (JSONException e) {
            com.sankuai.xm.log.c.d("DataMsgController", e.getMessage(), new Object[0]);
            return false;
        }
    }

    private void a(JSONObject jSONObject, int i) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3100c716dddf1ef9eb41df33de316792", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3100c716dddf1ef9eb41df33de316792");
        } else if (jSONObject.optInt("getType") == 2 && (optJSONArray = jSONObject.optJSONArray("constrait")) != null) {
            if (!com.sankuai.xm.log.c.b()) {
                a.C1381a.a.c.a(this);
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject.optInt("type") == 2) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("timeRange");
                    if (optJSONObject2 != null) {
                        optJSONObject2.optLong("beginStamp");
                        optJSONObject2.optLong("endStamp", Long.MAX_VALUE);
                    }
                    com.sankuai.xm.log.c.a(com.sankuai.xm.login.a.a().k() + CommonConstant.Symbol.UNDERLINE + com.sankuai.xm.login.a.a().e());
                }
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public final void onStateChanged(TransferContext transferContext, int i) {
        Object[] objArr = {transferContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa670edc756b592a6ba8df4dbe75474", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa670edc756b592a6ba8df4dbe75474");
        } else if (transferContext.getTaskType() == 9 && transferContext.getOwnerId() != 2147483647L && transferContext.getOwnerId() != 2147483646 && i == 7) {
            int ownerId = (int) transferContext.getOwnerId();
            String url = transferContext.getFileInfo().getUrl();
            Object[] objArr2 = {Integer.valueOf(ownerId), 0, "Success", url};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95bc8b2fe5ede933ce6f0500a80fa8eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95bc8b2fe5ede933ce6f0500a80fa8eb");
                return;
            }
            String a2 = a("/xs/file/v1");
            b.a aVar = new b.a();
            aVar.a = ownerId;
            aVar.f = 4;
            aVar.c = "Success";
            aVar.b = 0;
            aVar.e = url;
            b bVar = new b(a2, null);
            bVar.a(aVar);
            bVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
            g.a().a((e) bVar, 0L);
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4f419123be29605e6e237918732362", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4f419123be29605e6e237918732362");
        }
        return f.a().b().a(false) + str;
    }
}
