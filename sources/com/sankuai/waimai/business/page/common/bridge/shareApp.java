package com.sankuai.waimai.business.page.common.bridge;

import android.app.Activity;
import android.content.Intent;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.activity.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class shareApp extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "SEQLnvV/MO/6f+KMhCcqsLCZqGuzMrlRI8BXSJUq81lDQpjW00SVZ7THa1ONcmdyBy7vGqqAatU+VNX2vInL6g==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c7334f5ed6ac7f0983245e8996c94eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c7334f5ed6ac7f0983245e8996c94eb");
            return;
        }
        Activity c = a.a().c();
        if (c != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", "小伙伴们有福啦！用“美团外卖”，美食送到家，经济实惠又方便。快来试试呀~ http://waimai.meituan.com/getapp/1012");
            c.startActivity(Intent.createChooser(intent, "选择分享"));
        }
    }
}
