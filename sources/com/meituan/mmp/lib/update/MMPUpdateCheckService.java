package com.meituan.mmp.lib.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.utils.aa;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.t;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MMPUpdateCheckService {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class UpdateInfoList {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bundles")
        public List<MMPAppProp> bundles;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "113d2541ba3c1614b9332df59029faa9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "113d2541ba3c1614b9332df59029faa9") : new Gson().toJson(this);
        }
    }

    public static void a(Context context, final MMPUpdateConfig mMPUpdateConfig, final f fVar) {
        com.sankuai.meituan.retrofit2.m mVar;
        Object[] objArr = {context, mMPUpdateConfig, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6eabf920e19eaad9172b6314f6fd65df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6eabf920e19eaad9172b6314f6fd65df");
            return;
        }
        ab.c("MMPUpdateCheck");
        String str = mMPUpdateConfig.b;
        String str2 = mMPUpdateConfig.e;
        Object[] objArr2 = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9854d76dba271fa29407e52839d8778b", RobustBitConfig.DEFAULT_VALUE)) {
            mVar = (com.sankuai.meituan.retrofit2.m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9854d76dba271fa29407e52839d8778b");
        } else {
            SharedPreferences defaultSharedPreferences = MMPEnvHelper.getDefaultSharedPreferences();
            String str3 = MMPEnvHelper.shouldCheckUpdateFromTestEnv() ? "http://ddapi.fe.test.sankuai.com" : "https://dd.meituan.com";
            if (defaultSharedPreferences.getBoolean("checkUpdateTestEnvironmentSW", false)) {
                str3 = "https://dd.sankuai.com/test";
            }
            String uri = Uri.parse(str3).buildUpon().appendEncodedPath((com.meituan.mmp.lib.config.b.b(str) && MMPEnvHelper.isDioBundleEnable()) ? "config/xcx/v3" : "config/xcx").appendQueryParameter("appVersion", String.valueOf(bd.a(MMPEnvHelper.getEnvInfo().getAppVersionName()))).appendQueryParameter("appVersionName", MMPEnvHelper.getEnvInfo().getAppVersionName()).appendQueryParameter("app", MMPEnvHelper.getEnvInfo().getAppName()).appendQueryParameter("platform", "Android").appendQueryParameter("uuid", MMPEnvHelper.getEnvInfo().getUUID()).appendQueryParameter("ci", "0").appendQueryParameter("channel", MMPEnvHelper.getEnvInfo().getChannel()).appendQueryParameter(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, str).build().toString();
            if (!TextUtils.isEmpty(str2) && t.e(str2) != null) {
                uri = str2;
            }
            com.meituan.mmp.lib.trace.b.b("MMPUpdateCheckService#createCall", uri);
            com.sankuai.meituan.retrofit2.m mVar2 = new com.sankuai.meituan.retrofit2.m(com.meituan.mmp.main.j.a(), aa.c.a(false));
            mVar2.b = new aj.a().b(uri).a();
            mVar = mVar2;
        }
        mVar.a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.meituan.mmp.lib.update.MMPUpdateCheckService.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a6611c2d92bc875e97dc41d36d856fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a6611c2d92bc875e97dc41d36d856fc");
                    return;
                }
                ab.d("MMPUpdateCheck");
                f.this.a("checkFailed", IPCInvoke.a(th));
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, final Response<ap> response) {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2cfebc3ad11ef7664a5ea925b55812a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2cfebc3ad11ef7664a5ea925b55812a");
                    return;
                }
                ab.d("MMPUpdateCheck");
                com.meituan.mmp.lib.trace.b.b("MMPUpdateCheckService", response.toString());
                if (!response.f()) {
                    f fVar2 = f.this;
                    fVar2.a("checkFailed", new Exception("[" + response.b() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + response.c()));
                } else if (response.e() == null) {
                    f.this.a("checkResponseEmpty", null);
                } else {
                    l.a().post(new Runnable() { // from class: com.meituan.mmp.lib.update.MMPUpdateCheckService.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateInfoList updateInfoList;
                            MMPAppProp mMPAppProp;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c7ef94c4e5e3cf365b0fac6d9e5f4811", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c7ef94c4e5e3cf365b0fac6d9e5f4811");
                                return;
                            }
                            try {
                                updateInfoList = (UpdateInfoList) g.a().b().fromJson((Reader) new InputStreamReader(((ap) response.e()).source()), (Class<Object>) UpdateInfoList.class);
                            } catch (Exception e) {
                                e.printStackTrace();
                                f.this.a("checkUpdateJsonParseFailed", e);
                                updateInfoList = null;
                            }
                            if (updateInfoList == null || updateInfoList.bundles == null || updateInfoList.bundles.isEmpty() || (mMPAppProp = updateInfoList.bundles.get(0)) == null || !TextUtils.equals(mMPAppProp.appid, mMPUpdateConfig.b)) {
                                f.this.a("noSuchApp", null);
                            } else {
                                f.this.a(mMPAppProp);
                            }
                        }
                    });
                }
            }
        });
    }
}
