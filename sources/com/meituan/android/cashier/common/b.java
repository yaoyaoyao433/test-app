package com.meituan.android.cashier.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    Map<String, List<CashierScopeBean>> b;
    private final HornCallback d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242fe342476509fc37d33115174dd682", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242fe342476509fc37d33115174dd682");
        } else {
            this.d = c.a(this);
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b172f5cd78a15081576655226acf54", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b172f5cd78a15081576655226acf54");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void a(b bVar, boolean z, String str) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e91f29288c99385fe8c0f8b91425b6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e91f29288c99385fe8c0f8b91425b6a8");
        } else if (z) {
            try {
                if (TextUtils.isEmpty(str) || new JSONObject(str).length() == 0) {
                    return;
                }
                synchronized (b.class) {
                    bVar.b = (Map) com.meituan.android.paybase.utils.n.a().fromJson(str, new TypeToken<Map<String, List<CashierScopeBean>>>() { // from class: com.meituan.android.cashier.common.b.1
                    }.getType());
                }
            } catch (Exception e) {
                com.meituan.android.paybase.utils.v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CashierArrangeHornService_callback").a("message", e.getMessage()).b);
            }
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91164913ecd6aa23bc71549655862c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91164913ecd6aa23bc71549655862c6");
            return;
        }
        if (ah.a(context)) {
            Horn.debug(context, "cashier_arrange", true ^ com.meituan.android.paybase.downgrading.a.b());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app", com.meituan.android.paybase.config.a.d().k());
        hashMap.put("appVersion", com.meituan.android.paybase.config.a.d().l());
        hashMap.put("channel", com.meituan.android.paybase.config.a.d().c());
        hashMap.put("city", com.meituan.android.paybase.config.a.d().g());
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        hashMap.put(AppUtil.CacheKey.DEVICEID, com.meituan.android.paybase.config.a.d().j());
        hashMap.put("uuid", com.meituan.android.paybase.config.a.d().j());
        hashMap.put("osVersion", com.meituan.android.paybase.config.a.d().e());
        hashMap.put("platform", com.meituan.android.paybase.config.a.d().d());
        hashMap.put("os", com.meituan.android.paybase.config.a.d().d());
        hashMap.put("net_status", com.meituan.android.common.statistics.utils.AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
        hashMap.put("hybrid_net_type", com.meituan.android.common.statistics.utils.AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
        hashMap.put("user_id", com.meituan.android.paybase.config.a.d().i());
        hashMap.put("hybrid_user_id", com.meituan.android.paybase.config.a.d().i());
        hashMap.put("pay_sdk_version", "10.1.0");
        hashMap.put("packageName", com.meituan.android.paybase.config.a.d().a().getPackageName());
        hashMap.put("device_type", Build.MODEL);
        hashMap.put("app_display_type", r.c());
        Horn.register("cashier_arrange", this.d, hashMap);
    }
}
