package com.dianping.live.live.floatBridge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dianping.live.live.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MMPFloatBroadCastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55fc35282b2b34e7c688224f035ae1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55fc35282b2b34e7c688224f035ae1e3");
            return;
        }
        FloatViewBridgeImpl.b = f.a(intent, "floatViewStatus", false);
        String str = i.b;
        i.a(str, "receive mmp-float-view-status-action floatViewStatus:" + FloatViewBridgeImpl.b);
    }
}
