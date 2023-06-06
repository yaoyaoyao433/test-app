package com.sankuai.xm.im.message.history;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends e {
    public static ChangeQuickRedirect b;

    public c(String str, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str, null);
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a4897de81984c3fc13193fa41b8ab4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a4897de81984c3fc13193fa41b8ab4");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    @Override // com.sankuai.xm.im.message.history.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.xm.im.message.history.e.a r13) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.history.c.a(com.sankuai.xm.im.message.history.e$a):void");
    }

    @Override // com.sankuai.xm.im.message.history.e
    public final boolean a(IMMessage iMMessage) {
        JSONObject F;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8283113137ce8162f4ced01634ef0e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8283113137ce8162f4ced01634ef0e")).booleanValue();
        }
        if (iMMessage != null) {
            try {
                if (this.d == null || (F = F()) == null) {
                    return false;
                }
                if (F.optLong("id", 0L) == iMMessage.getMsgId()) {
                    com.sankuai.xm.im.utils.a.d("HistoryNormalMsgRequest::fillContinueRequestParam duplicate request", new Object[0]);
                    return false;
                }
                F.put("id", iMMessage.getMsgId());
                a(F);
                return true;
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "HistoryNormalMsgRequest::fillContinueRequestParam", new Object[0]);
                return false;
            }
        }
        return false;
    }
}
