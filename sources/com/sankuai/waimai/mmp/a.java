package com.sankuai.waimai.mmp;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.meituan.mmp.main.b {
    public static ChangeQuickRedirect b;
    private static List<Float> c = Collections.singletonList(Float.valueOf(-1.0f));

    @Override // com.meituan.mmp.main.b
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453fdac920dbcbbdafad7385d1c87d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453fdac920dbcbbdafad7385d1c87d07");
        } else {
            a(map).a(str, c).a();
        }
    }

    @Override // com.meituan.mmp.main.b
    public final void a(String str, List<Float> list, Map<String, Object> map) {
        Object[] objArr = {str, list, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a70d1e35152a920950df3a11597dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a70d1e35152a920950df3a11597dd3");
        } else {
            a(map).a(str, list).a();
        }
    }

    private m a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42657f0b5d78a1c52ebd4b399e317203", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42657f0b5d78a1c52ebd4b399e317203");
        }
        m mVar = new m(c(), a(), b());
        a(mVar);
        a(mVar, map);
        return mVar;
    }

    private m a(m mVar, Map<String, Object> map) {
        Object[] objArr = {mVar, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1febd2f8e0cac89ccf75afd7b32dd89d", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1febd2f8e0cac89ccf75afd7b32dd89d");
        }
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    mVar.a(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return mVar;
    }

    private Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ec69f33c0bcdc7fa7a285567db218a", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ec69f33c0bcdc7fa7a285567db218a") : MMPEnvHelper.getEnvInfo().getApplicationContext();
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17b8a63df9584cabc5171c509c3723d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17b8a63df9584cabc5171c509c3723d") : MMPEnvHelper.getEnvInfo().getUUID();
    }

    private void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04929799e2ba2f09bf0edcc4c29d557d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04929799e2ba2f09bf0edcc4c29d557d");
            return;
        }
        mVar.a("platform", "android");
        mVar.a("osVersion", Build.VERSION.RELEASE);
        mVar.a("deviceManufactory", Build.MANUFACTURER);
        mVar.a("deviceType", Build.MODEL);
        mVar.a("cityName", d());
        mVar.a("networkTypeInfo", String.valueOf(NetWorkUtils.getNetworkType("com.sankuai.waimai.mmp", a())));
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85155fcda301a2e1ad354f8295d07a63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85155fcda301a2e1ad354f8295d07a63")).intValue();
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.j();
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a7b210e186867e609d745e32ea460d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a7b210e186867e609d745e32ea460d");
        }
        try {
            k cityController = MMPEnvHelper.getCityController();
            return cityController != null ? cityController.b() : "unknown";
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.c(a.class.getName(), e.getMessage(), e);
            return "unknown";
        }
    }
}
