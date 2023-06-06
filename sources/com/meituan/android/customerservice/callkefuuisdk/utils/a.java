package com.meituan.android.customerservice.callkefuuisdk.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.customerservice.callkefuuisdk.e;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.android.customerservice.kit.utils.i;
import com.meituan.android.pike.bean.PikeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6eab995f2b28d9846c22f2b3c68616e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6eab995f2b28d9846c22f2b3c68616e5");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            i.a aVar = new i.a();
            aVar.d = i;
            aVar.a(activity);
            a(activity, aVar);
        }
    }

    private static void a(Activity activity, i.a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc918a17eef21432368a6e239430c6c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc918a17eef21432368a6e239430c6c2");
            return;
        }
        Application application = activity.getApplication();
        TypedArray typedArray = e.a(application).f;
        if (typedArray == null) {
            aVar.b(activity);
            return;
        }
        aVar.g = new int[]{c.a(application, typedArray.getDimension(19, 0.0f)), c.a(application, typedArray.getDimension(20, 0.0f)), c.a(application, typedArray.getDimension(21, 0.0f)), c.a(application, typedArray.getDimension(22, 0.0f))};
        aVar.b(activity);
    }

    public static Map<String, Object> a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe5458e212b5984b5f1246f0318e9323", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe5458e212b5984b5f1246f0318e9323");
        }
        if (context == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        com.meituan.android.customerservice.callbase.base.c h = d.j().h();
        hashMap.put("uid", h != null ? h.e() : "-1");
        hashMap.put(Message.SID, d.j().g().c());
        hashMap.put("net", Integer.valueOf(PikeUtil.getNetworkState(context)));
        hashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(h != null ? h.c() : (short) 0));
        hashMap.put("loginstatus", Integer.valueOf(d.j().i()));
        return hashMap;
    }
}
