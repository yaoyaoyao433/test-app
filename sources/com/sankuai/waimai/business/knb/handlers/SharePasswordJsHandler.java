package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.dianping.networklog.c;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titansmodel.apimodel.f;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.interfaces.d;
import com.sankuai.android.share.util.h;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SharePasswordJsHandler extends DelegatedJsHandler<f, g> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "mtVXvFTor/QHG1c+stozpeThiZsTnoyGiw9ERWFKLiro3yf227PVTwTFhFfI0BLrfgzbENu9HMNupQ23I1gqSQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b110fda199a91203d1f89252de3d13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b110fda199a91203d1f89252de3d13c");
        } else {
            sharePassword(args());
        }
    }

    private void sharePassword(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e5c07a483d8230467d5b5979a569500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e5c07a483d8230467d5b5979a569500");
            return;
        }
        c.a("waimai.sharePassword", 35, new String[]{"waimai.sharePassword"});
        if (fVar == null || getContext() == null) {
            c.a("param null or mContext null", 35, new String[]{"waimai.sharePassword"});
            return;
        }
        String str = fVar.g;
        String str2 = fVar.f;
        String str3 = fVar.d;
        String str4 = fVar.c;
        String str5 = fVar.o;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            c.a("title null or url null", 35, new String[]{"waimai.sharePassword"});
            failCallback(0, "参数错误");
            return;
        }
        h.a(getContext(), b.a.PASSWORD, new ShareBaseBean(str, str2, str3, str4, str5), new d() { // from class: com.sankuai.waimai.business.knb.handlers.SharePasswordJsHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.interfaces.d
            public final void a(b.a aVar, c.a aVar2, String str6) {
                Object[] objArr2 = {aVar, aVar2, str6};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32d5b376227752bf9e23b1eff8088b96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32d5b376227752bf9e23b1eff8088b96");
                    return;
                }
                com.dianping.networklog.c.a("status:" + aVar2 + ", password:" + str6, 35, new String[]{"waimai.sharePassword"});
                com.sankuai.waimai.foundation.utils.log.a.c("SharePassword", "status:" + aVar2 + ", password:" + str6, new Object[0]);
                if (aVar2 != c.a.COMPLETE) {
                    SharePasswordJsHandler.this.failCallback(0, "");
                    return;
                }
                a aVar3 = new a();
                aVar3.b = str6;
                SharePasswordJsHandler.this.successCallback(aVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failCallback(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4652b3379e225c0d0fc6c1772c7ebace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4652b3379e225c0d0fc6c1772c7ebace");
            return;
        }
        a aVar = new a();
        aVar.errorCode = i;
        aVar.errorMsg = str;
        failCallback(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends g {
        public static ChangeQuickRedirect a;
        public String b;

        @Override // com.dianping.titansmodel.g
        public final void writeToJSON(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020f8b6a768d64aaba1b98f384e50928", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020f8b6a768d64aaba1b98f384e50928");
                return;
            }
            super.writeToJSON(jSONObject);
            try {
                jSONObject.put("channel", -1);
                jSONObject.put("channelName", "Password");
                jSONObject.put("password", this.b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
