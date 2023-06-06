package com.meituan.mtwebkit.internal.update.tasks;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.mtwebkit.internal.update.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DDVersionInfoTask extends com.meituan.mtwebkit.internal.task.a<VersionInfo> {
    public static ChangeQuickRedirect a;
    @Depend
    private k b;
    @Depend
    private j k;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface UpdateInfoService {
        @GET("appupdate/legacy/appstatus")
        Call<VersionInfo.VersionInfoWrapper> getVersionInfo(@QueryMap Map<String, String> map);
    }

    @Override // com.meituan.mtwebkit.internal.task.a
    public final void a(final com.meituan.mtwebkit.internal.task.b<VersionInfo> bVar) throws com.meituan.mtwebkit.internal.task.c, IOException, PackageManager.NameNotFoundException {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ee468ac4cfb7abf5ac35edc69800d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ee468ac4cfb7abf5ac35edc69800d9");
            return;
        }
        Application a2 = com.meituan.mtwebkit.internal.a.a();
        HashMap hashMap = new HashMap();
        hashMap.put("type", "android");
        hashMap.put("uuid", GetUUID.getInstance().getUUID(a2));
        hashMap.put("name", com.meituan.mtwebkit.internal.a.b() ? "mtwebview64" : "mtwebview");
        PackageInfo c = this.k.c();
        hashMap.put("version", String.valueOf(a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionCode));
        hashMap.put("localPackageVersion", String.valueOf(c != null ? c.versionCode : 0));
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        hashMap.put("sdkVersion", String.valueOf(a("0.1.29")));
        hashMap.put("apilevel", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("supportedABIs", Build.SUPPORTED_ABIS == null ? "" : TextUtils.join(CommonConstant.Symbol.COMMA, Build.SUPPORTED_ABIS));
        if (c != null) {
            File b = com.meituan.mtwebkit.internal.g.b(c.versionCode);
            if (b.exists() && b.canRead()) {
                hashMap.put("md5", com.meituan.mtwebkit.internal.c.b(b));
            }
        }
        hashMap.put("diffVersion", "2");
        hashMap.put("userid", String.valueOf(com.meituan.android.singleton.k.a().getUserId()));
        hashMap.put("ci", String.valueOf(com.meituan.mtwebkit.internal.reporter.c.a()));
        ((UpdateInfoService) this.b.c().a(UpdateInfoService.class)).getVersionInfo(hashMap).a(new com.sankuai.meituan.retrofit2.f<VersionInfo.VersionInfoWrapper>() { // from class: com.meituan.mtwebkit.internal.update.tasks.DDVersionInfoTask.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<VersionInfo.VersionInfoWrapper> call, Response<VersionInfo.VersionInfoWrapper> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14e91bad9679f37f177f713cc2e96c92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14e91bad9679f37f177f713cc2e96c92");
                } else if (response != null && response.e() != null && response.e().versioninfo != null) {
                    VersionInfo versionInfo = response.e().versioninfo;
                    com.meituan.mtwebkit.internal.e.c("DDVersionInfoTask", "request dd get VersionInfo, VersionCode = " + versionInfo.currentVersion);
                    bVar.a((com.meituan.mtwebkit.internal.task.b) versionInfo);
                } else {
                    com.meituan.mtwebkit.internal.e.c("DDVersionInfoTask", "request dd get empty VersionInfo");
                    bVar.a((com.meituan.mtwebkit.internal.task.b) null);
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<VersionInfo.VersionInfoWrapper> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "749bac54413e2f4f620e59c11dd8ec52", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "749bac54413e2f4f620e59c11dd8ec52");
                    return;
                }
                com.meituan.mtwebkit.internal.e.b("DDVersionInfoTask", "request dd get exception ", th);
                bVar.a(th);
            }
        });
    }

    public static long a(String str) {
        char[] charArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c61a65758c5061b2a80e41fe8b087ca7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c61a65758c5061b2a80e41fe8b087ca7")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        int i2 = 0;
        for (char c : str.toCharArray()) {
            if (i > 4) {
                return -1L;
            }
            if (c == '.') {
                i++;
                j = (j * 1000) + i2;
                i2 = 0;
            } else if (c < '0' || c > '9' || (i2 = ((i2 * 10) + c) - 48) > 999) {
                return -1L;
            }
        }
        while (i <= 4) {
            j = (j * 1000) + i2;
            i++;
            i2 = 0;
        }
        return j;
    }
}
