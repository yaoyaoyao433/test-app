package com.sankuai.waimai.platform.settings.init;

import android.app.Application;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.domain.manager.user.a;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PersonalRecommendInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "PersonalRecommendInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69fb7eea8df76af50db743c92f132891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69fb7eea8df76af50db743c92f132891");
            return;
        }
        if (a.i().a()) {
            com.sankuai.waimai.platform.settings.net.a.a();
            if (TextUtils.isEmpty(StorageUtil.getSharedValue(b.a, "waimai_personal_account_info"))) {
                com.sankuai.waimai.platform.settings.net.a.b();
            }
        }
        a.i().a(new com.sankuai.waimai.foundation.core.service.user.b() { // from class: com.sankuai.waimai.platform.settings.init.PersonalRecommendInit.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
            }

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a7e354bef3fceff8deb8050d1e2baaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a7e354bef3fceff8deb8050d1e2baaf");
                } else if (aVar == b.a.LOGIN) {
                    com.sankuai.waimai.platform.settings.net.a.a();
                    com.sankuai.waimai.platform.settings.net.a.b();
                }
            }
        });
        saveDeviceInfo(application);
    }

    private void saveDeviceInfo(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "715582d2789e07ac29dddbcfc79a323e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "715582d2789e07ac29dddbcfc79a323e");
        } else if (application == null) {
        } else {
            String str = application.getResources().getDisplayMetrics().heightPixels + Constants.GestureMoveEvent.KEY_X + application.getResources().getDisplayMetrics().widthPixels;
            String displayName = getLocale().getDisplayName();
            String displayName2 = TimeZone.getDefault().getDisplayName();
            String d = com.sankuai.waimai.platform.b.A().d();
            String country = getLocale().getCountry();
            JSONObject jSONObject = new JSONObject();
            String str2 = com.sankuai.waimai.platform.settings.constant.a.a.containsKey(d) ? com.sankuai.waimai.platform.settings.constant.a.a.get(d) : "其它";
            try {
                jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, str);
                jSONObject.put("language", displayName);
                jSONObject.put("timeZone", displayName2);
                jSONObject.put("channel", str2);
                jSONObject.put("region", country);
                StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_device_info", jSONObject.toString(), 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private Locale getLocale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febc08efffda3da17cbaca5f532b17a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Locale) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febc08efffda3da17cbaca5f532b17a8");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleList.getDefault().get(0);
        }
        return Locale.getDefault();
    }
}
