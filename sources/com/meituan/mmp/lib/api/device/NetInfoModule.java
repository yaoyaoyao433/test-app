package com.meituan.mmp.lib.api.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.utils.am;
import com.meituan.mmp.lib.utils.e;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetInfoModule extends ServiceApi {
    public static ChangeQuickRedirect a = null;
    private static final String h = "NetInfoModule";
    private final ConnectivityBroadcastReceiver i;
    private boolean j;
    private String l;

    public NetInfoModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d5d05d44bcf048e48852238c80e001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d5d05d44bcf048e48852238c80e001");
            return;
        }
        this.i = new ConnectivityBroadcastReceiver();
        this.j = false;
        this.l = "none";
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85eed0ce399551e762fd4ea6b758a598", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85eed0ce399551e762fd4ea6b758a598") : new String[]{"getNetworkType"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f78174b04d475e2ef61256b88742ee7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f78174b04d475e2ef61256b88742ee7");
        }
        if (TextUtils.equals(str, "getNetworkType") && MMPEnvHelper.getContext().getApplicationInfo().targetSdkVersion > 28) {
            return new String[]{PermissionGuard.PERMISSION_PHONE_READ};
        }
        return super.a(str, jSONObject);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f901aa35e65d11f773b496e8418838c5", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f901aa35e65d11f773b496e8418838c5") : new String[]{"getNetworkType", "onNetworkStatusChange"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        String str2;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60e71ed335c8c667705c373fe5a37f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60e71ed335c8c667705c373fe5a37f3");
        } else if ("getNetworkType".equals(str)) {
            Object[] objArr2 = {iApiCallback, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a475726a591dbe93771564a2b6bba116", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a475726a591dbe93771564a2b6bba116");
                return;
            }
            if (!this.j || "none".equals(this.l)) {
                a(AbsApi.getToken(jSONObject));
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("networkType", this.l);
                if (!MMPEnvHelper.getEnvInfo().isProdEnv()) {
                    Context context = getContext();
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = am.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "45fcfb75ee7ae6c548b34467682257db", RobustBitConfig.DEFAULT_VALUE)) {
                        str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "45fcfb75ee7ae6c548b34467682257db");
                    } else {
                        String lowerCase = com.sankuai.meituan.switchtestenv.a.a(context).toLowerCase();
                        if (lowerCase.contains("beta")) {
                            str2 = "Beta";
                        } else if (lowerCase.contains("stage")) {
                            str2 = "Stage";
                        } else if (lowerCase.contains("test")) {
                            str2 = "Test";
                        } else {
                            str2 = lowerCase.contains(GetAppInfoJsHandler.PACKAGE_TYPE_DEV) ? "Dev" : "Prod";
                        }
                    }
                    jSONObject2.put("networkEnv", str2);
                }
                Logger logger = MMPEnvHelper.getLogger();
                logger.i(h, "getNetworkType networkType:" + this.l);
                iApiCallback.onSuccess(jSONObject2);
            } catch (JSONException unused) {
                com.meituan.mmp.lib.trace.b.d(h, "getNetworkType assemble result exception!");
                iApiCallback.onFail();
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e258fde12d6617789d3d459255164858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e258fde12d6617789d3d459255164858");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f157555b37478af1df4364040ba8f030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f157555b37478af1df4364040ba8f030");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.i, intentFilter);
        this.i.b = true;
        MMPEnvHelper.getLogger().i(h, "registerReceiver success.");
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfcf618e9183b941addeee0b0f769dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfcf618e9183b941addeee0b0f769dd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93ef3d8243a2203451b4a1fa1a84799b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93ef3d8243a2203451b4a1fa1a84799b");
        } else if (this.i.b) {
            e.a(getContext(), this.i);
            this.i.b = false;
            MMPEnvHelper.getLogger().i(h, "unregisterReceiver success.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0044f33cbaaedbfb232c4b8ea99dce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0044f33cbaaedbfb232c4b8ea99dce1");
            return;
        }
        Context context = getContext();
        String a2 = am.a(context, str);
        Logger logger = MMPEnvHelper.getLogger();
        logger.i(h, "networkType logic done. currentConnectivity:" + a2);
        Logger logger2 = MMPEnvHelper.getLogger();
        logger2.i(h, "networkType logic done. mConnectivity:" + this.l);
        boolean a3 = am.a(context);
        Logger logger3 = MMPEnvHelper.getLogger();
        logger3.i(h, "networkConnect logic done. currentConnectState:" + a3);
        Logger logger4 = MMPEnvHelper.getLogger();
        logger4.i(h, "networkConnect logic done. mIsConnected:" + this.j);
        if (this.j != a3) {
            this.j = a3;
            z = true;
        } else {
            z = false;
        }
        if (!a2.equalsIgnoreCase(this.l)) {
            this.l = a2;
            z = true;
        }
        if (z) {
            Logger logger5 = MMPEnvHelper.getLogger();
            logger5.i(h, "begin to update. mIsConnected:" + this.j + ",mConnectivity:" + this.l);
            j();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a645b3502803dc12b725d39f2d0df2ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a645b3502803dc12b725d39f2d0df2ed");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isConnected", this.j);
            jSONObject.put("networkType", this.l);
        } catch (JSONException unused) {
            com.meituan.mmp.lib.trace.b.d(h, "networkType parse params exception!");
        }
        a("onNetworkStatusChange", jSONObject.toString(), 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        boolean b;

        private ConnectivityBroadcastReceiver() {
            Object[] objArr = {NetInfoModule.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8a45fc3c4e38b82aa3d046a750a08d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8a45fc3c4e38b82aa3d046a750a08d");
            } else {
                this.b = false;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502b8a893c593070f88064fb010d7bb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502b8a893c593070f88064fb010d7bb5");
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetInfoModule.this.a("pt-3f0617762cf8a2b7");
            }
        }
    }
}
