package com.dianping.oppopush;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.n;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements ICallBackResultService {
    public static ChangeQuickRedirect a;
    private final Context b;

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public final void onSetPushTime(int i, String str) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public final void onUnRegister(int i) {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaa340634aef839320f68e62ec3f791", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaa340634aef839320f68e62ec3f791");
        } else {
            this.b = context.getApplicationContext();
        }
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public final void onRegister(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc86c30a144cacf83a1e95230eb884f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc86c30a144cacf83a1e95230eb884f7");
        } else if (i == 0) {
            a("Oppo", " REGISTER SUCCESS");
            if (TextUtils.isEmpty(str)) {
                a("Oppo ", "regId is null, return");
                return;
            }
            a("Oppo ", "regId is " + str);
            n.a(this.b, 8, str);
        } else {
            a("注册失败", "code=" + i + ",msg=" + str);
        }
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public final void onGetPushStatus(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9984a1dface30a1a7116e17a48336348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9984a1dface30a1a7116e17a48336348");
        } else if (i == 0 && i2 == 0) {
            a("Push状态正常", "code=" + i + ",status=" + i2);
        } else {
            a("Push状态错误", "code=" + i + ",status=" + i2);
        }
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public final void onGetNotificationStatus(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fb7d54a0c46dd22e1aaec283211251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fb7d54a0c46dd22e1aaec283211251");
        } else if (i == 0 && i2 == 0) {
            a("通知状态正常", "code=" + i + ",status=" + i2);
        } else {
            a("通知状态错误", "code=" + i + ",status=" + i2);
        }
    }

    private void a(@Nullable String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3502ee9b50cc59dff23458fc4636d193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3502ee9b50cc59dff23458fc4636d193");
            return;
        }
        b.a(str + StringUtil.SPACE + str2);
    }
}
