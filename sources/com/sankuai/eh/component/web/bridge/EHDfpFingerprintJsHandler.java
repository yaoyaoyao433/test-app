package com.sankuai.eh.component.web.bridge;

import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPDataCallBack;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.service.utils.thread.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHDfpFingerprintJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "247c446b68c17f06b48ee8294a90cb15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "247c446b68c17f06b48ee8294a90cb15");
        } else if (jsBean().argsJson.optBoolean(NetLogConstants.Details.CACHED)) {
            com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.web.bridge.a.a;
            a2.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "6b7f858076ed9f7c5896060adfb018fe", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "6b7f858076ed9f7c5896060adfb018fe") : new com.sankuai.eh.component.web.bridge.a(this));
        } else {
            MTGuard.deviceFingerprintData(new a(), new DFPDataCallBack() { // from class: com.sankuai.eh.component.web.bridge.EHDfpFingerprintJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.dfingerprint.DFPDataCallBack
                public final void onSuccess(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "97c5529fc42df805e9fc618aa3b4a4f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "97c5529fc42df805e9fc618aa3b4a4f1");
                    } else if (!TextUtils.isEmpty(str)) {
                        EHDfpFingerprintJsHandler.this.jsCallback(EHDfpFingerprintJsHandler.this.buildFPData(str));
                    } else {
                        EHDfpFingerprintJsHandler.this.jsCallbackError(30100, "dfp return null...");
                    }
                }

                @Override // com.meituan.android.common.dfingerprint.DFPDataCallBack
                public final void onFailed(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e635c52a8d2d9b7f473e24151fd47068", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e635c52a8d2d9b7f473e24151fd47068");
                        return;
                    }
                    EHDfpFingerprintJsHandler eHDfpFingerprintJsHandler = EHDfpFingerprintJsHandler.this;
                    eHDfpFingerprintJsHandler.jsCallbackError(30100, "dfp failed - " + str);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$innerExec$4(EHDfpFingerprintJsHandler eHDfpFingerprintJsHandler) {
        Object[] objArr = {eHDfpFingerprintJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e924efc2b035f86d0acf1dca59497b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e924efc2b035f86d0acf1dca59497b56");
            return;
        }
        String deviceFingerprintData = MTGuard.deviceFingerprintData(new a());
        if (!TextUtils.isEmpty(deviceFingerprintData)) {
            eHDfpFingerprintJsHandler.jsCallback(eHDfpFingerprintJsHandler.buildFPData(deviceFingerprintData));
        } else {
            eHDfpFingerprintJsHandler.jsCallbackError(30100, "dfp return null...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject buildFPData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6c2c2420af1f5557140bafc157c471e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6c2c2420af1f5557140bafc157c471e");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FingerprintManager.TAG, str);
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements DFPInfoProvider {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String business() {
            return "DP";
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String dpid() {
            return "DP";
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String getChannel() {
            return null;
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String getMagicNumber() {
            return null;
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String getPushToken() {
            return null;
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String optional() {
            return null;
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String source() {
            return "DP";
        }

        public a() {
        }

        @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
        public final String getUUID() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6430fa0462ce7f75a88efc1526e43e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6430fa0462ce7f75a88efc1526e43e8") : f.e();
        }
    }
}
