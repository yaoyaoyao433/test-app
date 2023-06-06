package com.dianping.base.push.pushservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.dp.DPPushService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PushStartService extends Service {
    public static ChangeQuickRedirect a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31dc8016bcb964b92dbf3d084fc8b55f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31dc8016bcb964b92dbf3d084fc8b55f");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c1fa9540e2621c16225b5b2e5d836f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c1fa9540e2621c16225b5b2e5d836f");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        c.b("PushStartService", "PushStartService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        Object[] objArr = {intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003c80648256769b9a3813ec74a89011", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003c80648256769b9a3813ec74a89011")).intValue();
        }
        StringBuilder sb = new StringBuilder("PushStartService onStartCommand with intent(");
        if (intent == null) {
            str = StringUtil.NULL;
        } else {
            str = intent.toString() + "), source(" + com.sankuai.waimai.platform.utils.f.a(intent, "source") + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        sb.append(str);
        c.b("PushStartService", sb.toString());
        if (intent == null) {
            intent = new Intent();
            intent.setAction("com.dianping.action.PUSH_START");
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "source");
        if (TextUtils.isEmpty(a2)) {
            str2 = "PushStartService";
        } else {
            str2 = a2 + "_PushStartService";
        }
        if ("com.dianping.action.PUSH_START".equals(intent.getAction()) || "com.dianping.action.PUSH_START_SERVICE".equals(intent.getAction())) {
            f.a(this, str2);
        } else if ("com.dianping.action.PUSH_STOP".equals(intent.getAction())) {
            f.c(this);
        } else if ("com.dianping.action.PUSH_RECONNECT".equals(intent.getAction())) {
            DPPushService.b(this, str2);
        } else {
            "com.dianping.action.KEEP_ALIVE".equals(intent.getAction());
        }
        return 2;
    }
}
