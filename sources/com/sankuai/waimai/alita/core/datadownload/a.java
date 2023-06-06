package com.sankuai.waimai.alita.core.datadownload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.net.AlitaResponse;
import com.sankuai.waimai.alita.core.datadownload.net.AlitaDataDownloadApi;
import com.sankuai.waimai.alita.core.datadownload.net.b;
import com.sankuai.waimai.alita.core.feature.e;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.alita.core.base.a {
    public static ChangeQuickRedirect c;
    public AlitaTriggerDataDownloadCallback d;
    private boolean e;

    public a(@NonNull String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784fd4ae163b5b303a550e726a42f9fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784fd4ae163b5b303a550e726a42f9fd");
            return;
        }
        this.d = null;
        this.e = false;
    }

    public final void a(int i) {
        String str;
        Map<String, String> hashMap;
        String str2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feec3815b803d9df0469ee01e4db683d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feec3815b803d9df0469ee01e4db683d");
            return;
        }
        if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
            if (this.d == null) {
                str2 = " == null";
            } else {
                str2 = this.d == AlitaTriggerDataDownloadCallback.c ? " == DEFAULT_CALLBACK" : " != null";
            }
            com.sankuai.waimai.alita.core.utils.c.a("AlitaDataDownloadManager.triggerDownload(): bizName = " + this.b + ", triggerType = " + i + ", mTriggerCallback " + str2);
        }
        if (this.d != null) {
            c a = this.d.a(i);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hit", Boolean.valueOf(a != null && a.b));
            com.sankuai.waimai.alita.core.utils.c.a("alita_data_download", this.b, PayLabelConstants.TYPE_TRIGGER, (HashMap<String, Object>) hashMap2);
            if (a == null || !a.b || this.e) {
                return;
            }
            this.e = true;
            String str3 = a.c;
            final d dVar = a.d;
            com.sankuai.waimai.alita.core.datadownload.net.b a2 = com.sankuai.waimai.alita.core.datadownload.net.b.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.datadownload.net.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b0bb8227d7f657efb187ed33827761df", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b0bb8227d7f657efb187ed33827761df");
            } else {
                str = (com.sankuai.waimai.alita.platform.debug.a.a().d() ? "http://waimai-openapi.apigw.st.sankuai.com/" : "https://alita.waimai.meituan.com/") + "api/edgedata/v1/feature/fetch";
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("url", str);
            com.sankuai.waimai.alita.core.utils.c.a("alita_data_download", this.b, "start", (HashMap<String, Object>) hashMap3);
            final com.sankuai.waimai.alita.core.datadownload.net.b a3 = com.sankuai.waimai.alita.core.datadownload.net.b.a();
            String str4 = this.b;
            final b.a aVar = new b.a() { // from class: com.sankuai.waimai.alita.core.datadownload.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.datadownload.net.b.a
                public final void a(@NonNull com.sankuai.waimai.alita.core.datadownload.net.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "739a9562d7d7acd674b4454c373f9e47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "739a9562d7d7acd674b4454c373f9e47");
                        return;
                    }
                    a.this.e = false;
                    if (dVar != null) {
                        dVar.a(aVar2);
                        com.sankuai.waimai.alita.core.utils.c.a("alita_data_download", AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, "success", (HashMap<String, Object>) null);
                    }
                    com.sankuai.waimai.alita.core.feature.b a4 = com.sankuai.waimai.alita.core.feature.c.a().a(a.this.b);
                    if (a4 != null) {
                        if (aVar2.c != null) {
                            Iterator<e> it = aVar2.c.iterator();
                            while (it.hasNext()) {
                                a4.a(it.next());
                            }
                            return;
                        }
                        return;
                    }
                    a(new Exception("feature manager not found"));
                }

                @Override // com.sankuai.waimai.alita.core.datadownload.net.b.a
                public final void a(@Nullable Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b844c5da369d1c8b4c898412eef8f7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b844c5da369d1c8b4c898412eef8f7d");
                        return;
                    }
                    a.this.e = false;
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("value", th != null ? th.getMessage() : "");
                    com.sankuai.waimai.alita.core.utils.c.a("alita_data_download", AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, "fail", (HashMap<String, Object>) hashMap4);
                }
            };
            Object[] objArr3 = {str4, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.datadownload.net.b.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "c2d2f916d9f4d73354c4a99ae446524e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "c2d2f916d9f4d73354c4a99ae446524e");
                return;
            }
            AlitaDataDownloadApi alitaDataDownloadApi = (AlitaDataDownloadApi) a3.b.a(AlitaDataDownloadApi.class);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.datadownload.net.c.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3e4b955eb2eafa8759bedea77c901f14", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3e4b955eb2eafa8759bedea77c901f14");
            } else {
                hashMap = new HashMap<>();
                hashMap.put("alita_app_name", com.sankuai.waimai.alita.platform.init.c.a().a());
                hashMap.put("alita_app_version", com.sankuai.waimai.alita.platform.init.c.a().c());
                hashMap.put("alita_sdk_version", com.sankuai.waimai.alita.core.common.a.a);
                hashMap.put("alita_device_type", com.sankuai.waimai.alita.platform.init.c.b);
                hashMap.put("alita_os_name", "android");
                hashMap.put("alita_os_version", com.sankuai.waimai.alita.platform.init.c.a().k());
                hashMap.put("alita_uuid", com.sankuai.waimai.alita.platform.init.c.a().f());
                hashMap.put("alita_dpid", com.sankuai.waimai.alita.platform.init.c.a().g());
                hashMap.put("alita_union_id", com.sankuai.waimai.alita.platform.init.c.a().h());
            }
            rx.d.a(new j<AlitaResponse<com.sankuai.waimai.alita.core.datadownload.net.a>>() { // from class: com.sankuai.waimai.alita.core.datadownload.net.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    AlitaResponse alitaResponse = (AlitaResponse) obj;
                    Object[] objArr5 = {alitaResponse};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fe77ee96a2dd66af76f4440555be45aa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fe77ee96a2dd66af76f4440555be45aa");
                        return;
                    }
                    int i2 = alitaResponse.code;
                    if (i2 == 0) {
                        if (alitaResponse.data != 0) {
                            if (aVar != null) {
                                aVar.a((com.sankuai.waimai.alita.core.datadownload.net.a) alitaResponse.data);
                                return;
                            }
                            return;
                        }
                        onError(new Exception("response data is null"));
                        return;
                    }
                    onError(new Exception("business state exception, code = " + i2));
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr5 = {th};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aa50667a1a0536b003937b8561e5affc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aa50667a1a0536b003937b8561e5affc");
                    } else if (aVar != null) {
                        aVar.a(th);
                    }
                }
            }, alitaDataDownloadApi.downloadFile(str4, str3, hashMap).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }
}
