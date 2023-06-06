package com.sankuai.waimai.platform.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.singleton.b;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.provider.AccountEventProvider;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AccountEventReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i = 2;
        char c = 1;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041416f6fe01e8c72f221d6006b46477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041416f6fe01e8c72f221d6006b46477");
            return;
        }
        a.b("gxb", "catch broadcast KNB.Channel.Account.AccountCancelSuccess", new Object[0]);
        String a2 = a(f.a(intent, "data"));
        for (AccountEventProvider accountEventProvider : com.sankuai.waimai.router.a.a(AccountEventProvider.class)) {
            if (accountEventProvider != null) {
                try {
                    accountEventProvider.logOff();
                } catch (Exception e) {
                    a.b(e);
                }
            }
        }
        for (Map.Entry<String, com.meituan.android.cipstorage.f> entry : q.a(context, false, false).entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.startsWith("mmp_") && ((key.contains("87dffc23944d") || key.contains("a8720b841a3d4b1d")) && key.contains(a2))) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = context;
                objArr2[c] = key;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a33dccc9eaee398005c4c4bb6e94bdc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a33dccc9eaee398005c4c4bb6e94bdc");
                } else {
                    a.b("gxb", "mmp.clearStorage:" + key, new Object[0]);
                    MMPEnvHelper.getSharedPreferences(context, key).edit().clear().apply();
                    File file = new File(b.a.getApplicationInfo().dataDir + "/shared_prefs/" + key + ".xml");
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
            i = 2;
            c = 1;
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff8d0f4126e08b4f20db49dfaea922a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff8d0f4126e08b4f20db49dfaea922a");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(DeviceInfo.USER_ID);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
