package com.sankuai.waimai.business.im.group.knb;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.knb.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CloseBadCommentGroupJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ebe26660658cfdf09f06b4107a412f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ebe26660658cfdf09f06b4107a412f4");
            return;
        }
        JsBean jsBean = jsBean();
        if (jsBean == null || jsBean.argsJson == null) {
            onCloseBadCommentGroupChatFail();
        } else {
            a.a(jsBean.argsJson.optLong("chatID"), new a.InterfaceC0742a() { // from class: com.sankuai.waimai.business.im.group.knb.CloseBadCommentGroupJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.group.knb.a.InterfaceC0742a
                public final void a(com.sankuai.waimai.business.im.group.model.a aVar, long j) {
                    Object[] objArr2 = {aVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4359121859baa7a44ba1483faf035d8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4359121859baa7a44ba1483faf035d8d");
                    } else {
                        CloseBadCommentGroupJsHandler.this.onCloseBadCommentGroupChatSuccess(aVar.a, j);
                    }
                }

                @Override // com.sankuai.waimai.business.im.group.knb.a.InterfaceC0742a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7ce89b8934c3efbf951be9676429a3ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7ce89b8934c3efbf951be9676429a3ad");
                    } else {
                        CloseBadCommentGroupJsHandler.this.onCloseBadCommentGroupChatFail();
                    }
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCloseBadCommentGroupChatSuccess(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15d6865a4e4b5c1b27f91b9944c7fc89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15d6865a4e4b5c1b27f91b9944c7fc89");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("imMsg", str);
        } catch (JSONException unused) {
        } finally {
            jsCallback(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCloseBadCommentGroupChatFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e53a38812e2dbd85942058480f8805f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e53a38812e2dbd85942058480f8805f");
        } else {
            jsCallback(new JSONObject());
        }
    }
}
