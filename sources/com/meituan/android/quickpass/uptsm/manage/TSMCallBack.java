package com.meituan.android.quickpass.uptsm.manage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.android.quickpass.uptsm.common.utils.g;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.constant.a;
import com.meituan.android.quickpass.uptsm.manage.b;
import com.meituan.android.quickpass.uptsm.web.AddCardToPayJsHandler;
import com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.speech.vadsdk.processor.VadError;
import com.tencent.liteav.audio.TXEAudioDef;
import com.unionpay.tsmservice.ITsmCallback;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.result.AddCardResult;
import com.unionpay.tsmservice.result.EncryptDataResult;
import com.unionpay.tsmservice.result.GetSeIdResult;
import com.unionpay.tsmservice.result.VendorPayStatusResult;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TSMCallBack extends ITsmCallback.Stub {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long currentTimeMillis;
    private int mCallBackId;

    public TSMCallBack(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8550b5a3d3d5d7590fd6088b4210c488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8550b5a3d3d5d7590fd6088b4210c488");
        } else {
            this.mCallBackId = i;
        }
    }

    @Override // com.unionpay.tsmservice.ITsmCallback
    public void onResult(Bundle bundle) throws RemoteException {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9de629af3673ac60f5eeb899308a4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9de629af3673ac60f5eeb899308a4e3");
            return;
        }
        h.b("TSMCallBack.onResult:\t" + this.mCallBackId);
        switch (this.mCallBackId) {
            case 1:
                initTsm();
                return;
            case 2:
                getPayStatus(bundle);
                return;
            case 3:
                getSEID(bundle);
                return;
            case 4:
                encryptData(bundle);
                return;
            case 5:
                addCardToPay(bundle);
                return;
            default:
                return;
        }
    }

    @Override // com.unionpay.tsmservice.ITsmCallback
    public void onError(String str, String str2) throws RemoteException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "702360935953c3925216ad82192d01db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "702360935953c3925216ad82192d01db");
            return;
        }
        h.b("TSMCallBack onError:\terrorCode:" + str + "\terrorDesc:" + str2 + " mCallBackId ： " + this.mCallBackId);
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str);
        hashMap.put("errorDesc", str2);
        hashMap.put("CallBackID", Integer.valueOf(this.mCallBackId));
        com.meituan.android.quickpass.uptsm.common.utils.b.a("TSM失败回调", hashMap);
        switch (this.mCallBackId) {
            case 1:
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_kepqzgpa", "c_5ifn958x", VadError.INIT_FAILED_MESSAGE, str, str2);
                cat(a.C0360a.d, a.b.g, str);
                g.a(IsSupportTSMJsHandler.get(), -101, str, str2);
                return;
            case 2:
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_cke01ppo", "c_5ifn958x", "获取pay状态失败", str, str2);
                cat(a.C0360a.f, a.b.k, str);
                g.a(IsSupportTSMJsHandler.get(), TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str, str2);
                return;
            case 3:
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_zcvm2n1i", "c_5ifn958x", "获取SE失败", str, str2);
                cat(a.C0360a.e, a.b.i, str);
                g.a(IsSupportTSMJsHandler.get(), -101, str, str2);
                return;
            case 4:
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_1d8194g3", "c_5ifn958x", "加密数据失败", str, str2);
                cat(a.C0360a.g, a.b.a, str);
                g.a(AddCardToPayJsHandler.get(), -102, str, str2);
                return;
            case 5:
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_7744le6l", "c_5ifn958x", "绑卡失败", str, str2);
                cat(a.C0360a.h, a.b.c, str);
                g.a(AddCardToPayJsHandler.get(), -102, str, str2);
                return;
            default:
                return;
        }
    }

    private void cat(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dde5f5b99428fa69e8d58e38e4dffd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dde5f5b99428fa69e8d58e38e4dffd9");
            return;
        }
        try {
            i = Integer.valueOf(str2).intValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        d.a(str, i);
    }

    private void initTsm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4362927a919e84705c4e013be063d3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4362927a919e84705c4e013be063d3c1");
            return;
        }
        h.b("初始化成功");
        com.meituan.android.quickpass.uptsm.common.utils.b.b("初始化成功");
        d.a(a.b.g, a.C0360a.a);
        int b = b.a.a().b();
        if (b != 0) {
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_zcvm2n1i", "c_5ifn958x", "获取SEID同步返回失败", b);
            IsSupportTSMJsHandler isSupportTSMJsHandler = IsSupportTSMJsHandler.get();
            g.a(isSupportTSMJsHandler, 3, b, "获取SEID失败(" + b + CommonConstant.Symbol.BRACKET_RIGHT, null);
        }
    }

    private void getSEID(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "942fdacb308ee85af3bb397a79627f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "942fdacb308ee85af3bb397a79627f14");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.b.b("获取SEID成功");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_zcvm2n1i", "c_5ifn958x", Boolean.TRUE);
        h.b("获取SEID结果");
        d.a(a.b.i, a.C0360a.a);
        GetSeIdResult getSeIdResult = (GetSeIdResult) bundle.get("result");
        StringBuilder sb = new StringBuilder("SEID:\t");
        sb.append(getSeIdResult != null ? getSeIdResult.getSeId() : null);
        h.b(sb.toString());
        g.a(IsSupportTSMJsHandler.get(), 3, 0, getSeIdResult != null ? getSeIdResult.getSeId() : null, null);
    }

    private void getPayStatus(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dd63c46dff53ce1395491f94086b173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dd63c46dff53ce1395491f94086b173");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_cke01ppo", "c_5ifn958x", Boolean.TRUE);
        h.b("获取手机pay状态结果");
        d.a(a.b.k, a.C0360a.a);
        VendorPayStatusResult vendorPayStatusResult = (VendorPayStatusResult) bundle.get("result");
        Bundle vendorPayStatusResult2 = vendorPayStatusResult != null ? vendorPayStatusResult.getVendorPayStatusResult() : null;
        z = (vendorPayStatusResult2 == null || !vendorPayStatusResult2.getBoolean(Constant.KEY_MAX_CARD_NUM_REACHED)) ? false : false;
        int i = vendorPayStatusResult2 != null ? vendorPayStatusResult2.getInt("cardNumber") : 0;
        h.b("result maxCardNumReached:" + z);
        h.b("result cardNumber:" + i);
        HashMap hashMap = new HashMap();
        hashMap.put(Constant.KEY_MAX_CARD_NUM_REACHED, Boolean.valueOf(z));
        hashMap.put("cardNum", Integer.valueOf(i));
        com.meituan.android.quickpass.uptsm.common.utils.b.b("获取手机pay状态成功", hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("maxCardReached", z);
            jSONObject.put("cardNum", i);
        } catch (JSONException e) {
            h.b(Log.getStackTraceString(e));
        }
        g.a(IsSupportTSMJsHandler.get(), 2, 0, null, jSONObject);
    }

    private void encryptData(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23e212a52a0a5bbf4b32aa6796e2b2c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23e212a52a0a5bbf4b32aa6796e2b2c8");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_ypkew9qw", "c_5ifn958x", Boolean.TRUE);
        d.a(a.b.a, a.C0360a.a);
        h.b("加密数据结果");
        com.meituan.android.quickpass.uptsm.common.utils.b.b("加密数据成功");
        EncryptDataResult encryptDataResult = (EncryptDataResult) bundle.get("result");
        List<String> encryptData = encryptDataResult != null ? encryptDataResult.getEncryptData() : null;
        int size = encryptData != null ? encryptData.size() : 0;
        for (int i = 0; i < size; i++) {
            h.a(i + ",encryptData:" + encryptData.get(i));
        }
        String str = encryptData != null ? encryptData.get(0) : null;
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_su61lsd6", "c_5ifn958x", (Object) null);
        this.currentTimeMillis = System.currentTimeMillis();
        int b = b.a.a().b("48179100", str);
        d.a(a.b.c, b);
        if (b != 0) {
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_7744le6l", "c_5ifn958x", "绑卡同步返回失败", b);
            AddCardToPayJsHandler addCardToPayJsHandler = AddCardToPayJsHandler.get();
            g.a(addCardToPayJsHandler, 5, b, "添加失败(" + b + CommonConstant.Symbol.BRACKET_RIGHT, null);
        }
    }

    private void addCardToPay(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d36320a9b0f7f212e45be2bc26675667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d36320a9b0f7f212e45be2bc26675667");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.b.a("添加到手机pay成功");
        d.a(a.b.c, a.C0360a.a);
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_7744le6l", "c_5ifn958x", System.currentTimeMillis() - this.currentTimeMillis);
        h.b("添加卡片到pay结果");
        AddCardResult addCardResult = (AddCardResult) bundle.get("result");
        Bundle bankCardInfo = addCardResult != null ? addCardResult.getBankCardInfo() : null;
        StringBuilder sb = new StringBuilder("result addCardResult:");
        sb.append(bankCardInfo != null ? bankCardInfo.getString("appAid") : null);
        sb.append(StringUtil.SPACE);
        sb.append(bankCardInfo != null ? bankCardInfo.getString("cardStatus") : null);
        sb.append(StringUtil.SPACE);
        sb.append(bankCardInfo != null ? bankCardInfo.getString("cardType") : null);
        sb.append(StringUtil.SPACE);
        sb.append(bankCardInfo != null ? bankCardInfo.getString("deviceType") : null);
        sb.append(StringUtil.SPACE);
        sb.append(bankCardInfo != null ? bankCardInfo.getString("dpan") : null);
        sb.append(StringUtil.SPACE);
        sb.append(bankCardInfo != null ? bankCardInfo.getString("fpan") : null);
        h.b(sb.toString());
        g.a(AddCardToPayJsHandler.get(), 5, 0, "添加成功", null);
    }
}
