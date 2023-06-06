package com.meituan.passport.changeuser;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.passport.j;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DeleteUserJSHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "GFS3Nk4rdJHJurfKqxnYu8K/+p2SGNuFF9se1NjLyQzIFqd/1joO1lk+rfe6uMD1csMBsJssQ7n8kU8cozYrsw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9845a5126fb7f551016062477bed2c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9845a5126fb7f551016062477bed2c23");
            return;
        }
        long optLong = (jsBean() == null || jsBean().argsJson == null) ? -1L : jsBean().argsJson.optLong(DeviceInfo.USER_ID, -1L);
        n.a("DeleteUserJSHandler.exec", "userId is: ", String.valueOf(optLong));
        boolean a = optLong != -1 ? j.a().a(optLong) : false;
        n.a("DeleteUserJSHandler.exec", "deleted is: ", String.valueOf(a));
        if (a) {
            jsCallback();
        } else {
            jsCallbackError(new KNBJsErrorInfo(-1, ""));
        }
    }
}
