package com.meituan.android.edfu.mvex.detectors;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.monitor.h;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.edfu.mvex.interfaces.a;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.BaseResult;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.ImageBody;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.ImageRetrievalRequest;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.MedicineRetrievalResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.HashMap;
import java.util.Map;
import rx.e;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements com.meituan.android.edfu.mvex.interfaces.a {
    public static ChangeQuickRedirect a = null;
    private static String b = "d";
    private a.InterfaceC0253a c;
    private Context d;
    private k e;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea26984e8d65b7d2a731f196774add55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea26984e8d65b7d2a731f196774add55");
        } else {
            this.d = context;
        }
    }

    @Override // com.meituan.android.edfu.mvex.interfaces.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916576855eeda81d16b77b6ab041ad28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916576855eeda81d16b77b6ab041ad28");
        } else if (this.e == null || this.e.isUnsubscribed()) {
        } else {
            this.e.unsubscribe();
        }
    }

    @Override // com.meituan.android.edfu.mvex.interfaces.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8379cff84b158d5814f9e426ac32c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8379cff84b158d5814f9e426ac32c8");
            return;
        }
        if (this.e != null && !this.e.isUnsubscribed()) {
            this.e.unsubscribe();
        }
        if (this.c != null) {
            this.c = null;
        }
    }

    @Override // com.meituan.android.edfu.mvex.interfaces.a
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441f9b2a5a15f151b51275192ed9bd75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441f9b2a5a15f151b51275192ed9bd75");
            return;
        }
        ImageBody imageBody = new ImageBody();
        try {
            imageBody.setContent(Base64.encodeToString(bArr, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        imageBody.setUrl("");
        ImageRetrievalRequest imageRetrievalRequest = new ImageRetrievalRequest();
        imageRetrievalRequest.setProjectId("1");
        String uuid = GetUUID.getInstance().getUUID(this.d);
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (!TextUtils.isEmpty(uuid)) {
            valueOf = uuid + valueOf;
        }
        imageRetrievalRequest.setTraceId(valueOf);
        imageRetrievalRequest.setImage(imageBody);
        final long currentTimeMillis = System.currentTimeMillis();
        this.e = com.meituan.android.edfu.mvex.netservice.d.a(imageRetrievalRequest).a(new e<BaseResult<MedicineRetrievalResult>>() { // from class: com.meituan.android.edfu.mvex.detectors.d.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v7, types: [T, com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.MedicineRetrievalResult] */
            @Override // rx.e
            public final /* synthetic */ void onNext(BaseResult<MedicineRetrievalResult> baseResult) {
                BaseResult<MedicineRetrievalResult> baseResult2 = baseResult;
                Object[] objArr2 = {baseResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07222fdda313d834c18bb051a035eb27", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07222fdda313d834c18bb051a035eb27");
                    return;
                }
                String unused = d.b;
                new StringBuilder(" 服务返回结果：").append(baseResult2.getCode() + " : " + baseResult2.getMessage());
                if (baseResult2.getCode() != 0) {
                    if (d.this.c != null) {
                        d.this.c.a(baseResult2.getCode(), baseResult2.getMessage());
                        return;
                    }
                    return;
                }
                MedicineRetrievalResult result = baseResult2.getResult();
                com.meituan.android.edfu.mvex.netservice.c cVar = new com.meituan.android.edfu.mvex.netservice.c();
                cVar.a = 1;
                if (result == 0) {
                    if (d.this.c != null) {
                        d.this.c.a(baseResult2.getCode(), baseResult2.getMessage());
                    }
                } else if ((result.getShangPinMing() == null || result.getShangPinMing().length <= 0) && (result.getTongYongMing() == null || result.getTongYongMing().length <= 0)) {
                    if (d.this.c != null) {
                        d.this.c.a(baseResult2.getCode(), baseResult2.getMessage());
                    }
                } else if (d.this.c != null) {
                    cVar.b = result;
                    d.this.c.a(cVar);
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Map<String, String> map;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b102f9c41cb2c9e47f31caec47d7a31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b102f9c41cb2c9e47f31caec47d7a31");
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                com.meituan.android.edfu.mvex.utils.e a2 = com.meituan.android.edfu.mvex.utils.e.a();
                float f = (float) currentTimeMillis2;
                Object[] objArr3 = {"mvex_search_medicine", Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mvex.utils.e.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "bda5b03559328db25f96b79d4e3af50a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "bda5b03559328db25f96b79d4e3af50a");
                } else if (a2.d != null) {
                    try {
                        m mVar = new m(a2.b, a2.d);
                        HashMap hashMap = new HashMap();
                        hashMap.put("mvex_search_medicine", Float.valueOf(f));
                        a2.a(mVar, hashMap);
                        HashMap hashMap2 = new HashMap();
                        Context context = a2.d;
                        Object[] objArr4 = {context};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.edfu.mvex.utils.e.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "664b3cfdc214423eb537263bc8470f25", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "664b3cfdc214423eb537263bc8470f25");
                        } else if (com.meituan.android.edfu.mvex.utils.e.c != null) {
                            map = com.meituan.android.edfu.mvex.utils.e.c;
                        } else {
                            HashMap hashMap3 = new HashMap();
                            com.meituan.android.edfu.mvex.utils.e.c = hashMap3;
                            hashMap3.put("APP_VERSION", h.b(context));
                            com.meituan.android.edfu.mvex.utils.e.c.put("PLATFORM", "Android");
                            map = com.meituan.android.edfu.mvex.utils.e.c;
                        }
                        hashMap2.putAll(map);
                        a2.b(mVar, hashMap2);
                        mVar.a();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("identifyTime", Long.valueOf(currentTimeMillis2));
                Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(d.this), "b_group_lm7fxm8c_mc", hashMap4, "c_group_rtj4cvhh");
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71314051a48aa01ba87df742fa0ced6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71314051a48aa01ba87df742fa0ced6a");
                } else if (d.this.c != null) {
                    d.this.c.a(th.getMessage());
                }
            }
        });
    }

    @Override // com.meituan.android.edfu.mvex.interfaces.a
    public final void a(a.InterfaceC0253a interfaceC0253a) {
        this.c = interfaceC0253a;
    }
}
