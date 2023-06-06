package com.meituan.android.quickpass.uptsm.web;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.ai.speech.sdk.knb.JsErrorCode;
import com.meituan.android.quickpass.uptsm.common.retrofit.RetrofitService;
import com.meituan.android.quickpass.uptsm.common.utils.a;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.common.utils.i;
import com.meituan.android.quickpass.uptsm.common.utils.j;
import com.meituan.android.quickpass.uptsm.constant.a;
import com.meituan.android.quickpass.uptsm.manage.a;
import com.meituan.android.quickpass.uptsm.manage.b;
import com.meituan.android.quickpass.uptsm.model.TsmUpdateInfo;
import com.meituan.android.quickpass.uptsm.test.bean.TsmDevConfig;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.v;
import com.tencent.mapsdk.internal.y;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IsSupportTSMJsHandler extends TSMBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IsSupportTSMJsHandler reference;
    private Dialog installDialog;
    private ProgressDialog loadingDialog;
    private TsmComponentAddedReceiver mTsmAddedReceiver;
    private TsmUpdateInfo mTsmUpdateInfo;

    public static IsSupportTSMJsHandler get() {
        return reference;
    }

    public IsSupportTSMJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4712d5cecf2ef2cd17088d6f367755fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4712d5cecf2ef2cd17088d6f367755fc");
            return;
        }
        h.b("IsSupportTSMJsHandler instance:" + this);
        reference = this;
    }

    @Override // com.meituan.android.quickpass.uptsm.web.TSMBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eb8cf112d72f55fc8e54ca43c01dfd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eb8cf112d72f55fc8e54ca43c01dfd2");
            return;
        }
        super.exec();
        JSONObject jSONObject = jsBean().argsJson;
        h.b("IsSupportTSMJsHandler收到:\t" + jSONObject.toString());
        b a = b.a.a();
        int optInt = jSONObject.optInt("method");
        switch (optInt) {
            case 1:
                a.a("b_o2el93st", "c_5ifn958x", Boolean.TRUE);
                preTsmUpdateDetect();
                return;
            case 2:
                a.a("b_ui36sola", "c_5ifn958x", (Object) null);
                int a2 = a.a();
                if (a2 != 0) {
                    a.a("b_cke01ppo", "c_5ifn958x", "获取pay状态同步返回失败", a2);
                    if (a2 == -8) {
                        jsCallBackError(a2, "获取钱包状态失败,请在钱包中更新银联组件");
                        return;
                    }
                    jsCallBackError(a2, "获取钱包状态失败(" + a2 + CommonConstant.Symbol.BRACKET_RIGHT);
                    return;
                }
                return;
            default:
                switch (optInt) {
                    case 7:
                        com.meituan.android.quickpass.uptsm.common.utils.b.b("检查NFC状态");
                        if (checkNFCStatus(jSONObject.optBoolean("needEnableNFC", true), jSONObject.optBoolean("dialogCancelable", true), jSONObject.optBoolean("needShowNegative", false), jSONObject.optString("negativeText"))) {
                            jsCallBack(7, 0, "NFC状态正常", null);
                            return;
                        }
                        return;
                    case 8:
                        try {
                            String optString = jSONObject.optString("action");
                            String optString2 = jSONObject.optString("jumperUri");
                            String optString3 = jSONObject.optString("package");
                            String optString4 = jSONObject.optString("clazz");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString)) {
                                intent.setAction(optString);
                            } else {
                                intent.setAction("android.intent.action.VIEW");
                            }
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
                                intent.setComponent(new ComponentName(optString3, optString4));
                            }
                            intent.setFlags(y.a);
                            jsHost().getActivity().startActivity(intent);
                            jsCallBack(8, 0, null, null);
                            return;
                        } catch (Throwable th) {
                            h.b(Log.getStackTraceString(th));
                            jsCallBackError(-100, "");
                            return;
                        }
                    case 9:
                        createHuaweiSSD(jSONObject.optBoolean("needCache", false));
                        return;
                    case 10:
                        jsCallBack(10, 0, j.a(jsHost().getContext(), "com.huawei.wallet"), null);
                        return;
                    case 11:
                        jsCallBack(11, 0, null, j.a());
                        return;
                    case 12:
                        d.a(a.b.n, 4000);
                        final long currentTimeMillis = System.currentTimeMillis();
                        a.C0361a.a().a(jsHost().getActivity().getApplicationContext(), new a.d() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.quickpass.uptsm.manage.a.d
                            public final void a(int i) {
                                Object[] objArr2 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9432efba2bce245c39b2234d3c580c1d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9432efba2bce245c39b2234d3c580c1d");
                                    return;
                                }
                                com.meituan.android.quickpass.uptsm.common.utils.b.b("通过华为接口拉起银联进程结果：" + i);
                                h.a("prepareProcessSync.result:" + i);
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                if (i != 0) {
                                    switch (i) {
                                        case -10005:
                                        case -10004:
                                            d.a(a.b.m, i, currentTimeMillis2);
                                            break;
                                        default:
                                            d.a(a.b.m, a.C0360a.n + i, currentTimeMillis2);
                                            break;
                                    }
                                } else {
                                    d.a(a.b.m, a.C0360a.a, currentTimeMillis2);
                                }
                                if (i == 0) {
                                    IsSupportTSMJsHandler.this.jsCallBack(12, 0, null, null);
                                    return;
                                }
                                IsSupportTSMJsHandler isSupportTSMJsHandler = IsSupportTSMJsHandler.this;
                                isSupportTSMJsHandler.jsCallBackError(i, "拉起进程失败(" + i + CommonConstant.Symbol.BRACKET_RIGHT);
                            }
                        });
                        return;
                    default:
                        jsCallBackError(-1000, "native未实现对应方法:" + jSONObject.optInt("method"));
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initUpTsm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af7adaa9899d83b1876839c2305e8416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af7adaa9899d83b1876839c2305e8416");
            return;
        }
        try {
            int a = b.a.a().a(jsHost().getContext().getApplicationContext());
            h.a("initUpTsm result : " + a);
            if (a != 0) {
                h.a("initUpTsm failed result : " + a);
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_kepqzgpa", "c_5ifn958x", "初始化同步返回失败", a);
                jsCallBackError(a, "初始化失败(" + a + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (Exception e) {
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_vhl35q95", "c_5ifn958x", "初始化抛出异常", 0);
            jsCallBackError(0, "初始化异常(0" + CommonConstant.Symbol.BRACKET_RIGHT);
            StringBuilder sb = new StringBuilder("initUpTsm failed result : ");
            sb.append(e.getMessage());
            h.b(sb.toString());
        }
    }

    private void preTsmUpdateDetect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb225f0e53d399a279b4eee8997436c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb225f0e53d399a279b4eee8997436c1");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.b.b("preTsmUpdateDetect");
        if (this.mTsmUpdateInfo != null) {
            h.a("pre tsm is inited");
            verifyNeedUpdate(this.mTsmUpdateInfo, true);
            return;
        }
        String a = i.a(jsHost().getContext(), "tsm_update_info", (String) null);
        String a2 = i.a(jsHost().getContext(), "tsm_version", (String) null);
        h.a("cache tsm info : " + a);
        h.a("cache tsm version : " + a2);
        if (TextUtils.equals(a2, getTsmComponentVersion())) {
            TsmUpdateInfo a3 = j.a(a);
            if (a3 != null && a3.getData() != null) {
                h.a("cache check success");
                getTsmUpdateInfo(false);
                this.mTsmUpdateInfo = a3;
                verifyNeedUpdate(a3, true);
                return;
            }
            getTsmUpdateInfo(true);
            return;
        }
        getTsmUpdateInfo(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getTsmUpdateInfo(final boolean z) {
        com.sankuai.meituan.retrofit2.callfactory.okhttp.a a;
        ar a2;
        RetrofitService retrofitService;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fa8ce242ba7f75656604bd0ee76247b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fa8ce242ba7f75656604bd0ee76247b");
            return;
        }
        if (z) {
            showLoadingDialog();
        }
        h.a("start get tsm info need verify : " + z);
        final long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.quickpass.uptsm.common.retrofit.a a3 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a();
        Context context = jsHost().getContext();
        rx.j<TsmUpdateInfo> jVar = new rx.j<TsmUpdateInfo>() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                TsmUpdateInfo tsmUpdateInfo = (TsmUpdateInfo) obj;
                Object[] objArr2 = {tsmUpdateInfo};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f43820b9182a5fcae065b1fa3efb6a2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f43820b9182a5fcae065b1fa3efb6a2b");
                    return;
                }
                IsSupportTSMJsHandler.this.cacheTsmUpdateInfo(tsmUpdateInfo);
                if (z) {
                    IsSupportTSMJsHandler.this.dismissLoadingDialog();
                    IsSupportTSMJsHandler.this.mTsmUpdateInfo = tsmUpdateInfo;
                    IsSupportTSMJsHandler.this.verifyNeedUpdate(tsmUpdateInfo, true);
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd1c7b51ca8bc40a35dc29356933e3e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd1c7b51ca8bc40a35dc29356933e3e8");
                    return;
                }
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_9rtiqbn2", "c_ogr68a1g", System.currentTimeMillis() - currentTimeMillis);
                IsSupportTSMJsHandler.this.dismissLoadingDialog();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dca5175924185eadb75913748ed2ca17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dca5175924185eadb75913748ed2ca17");
                    return;
                }
                h.a("get tsm info error");
                h.b(Log.getStackTraceString(th));
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_1imvz37p", "c_ogr68a1g", Boolean.TRUE);
                if (z) {
                    IsSupportTSMJsHandler.this.dismissLoadingDialog();
                    IsSupportTSMJsHandler.this.initUpTsm();
                }
            }
        };
        Object[] objArr2 = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect3, false, "14d5a3edcf566c8d0ade67411222b313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect3, false, "14d5a3edcf566c8d0ade67411222b313");
            return;
        }
        if (a3.b == null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "53c27b04e62cb24a9aca39ac7375fa3b", RobustBitConfig.DEFAULT_VALUE)) {
                retrofitService = (RetrofitService) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "53c27b04e62cb24a9aca39ac7375fa3b");
            } else {
                Interceptor[] interceptorArr = {new com.meituan.android.quickpass.uptsm.common.retrofit.Interceptor.b()};
                Object[] objArr4 = {"https://quickpass.meituan.com", interceptorArr};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect5, false, "9ff35e3f3ac7f4c22bc908c5c088e6c0", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (ar) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect5, false, "9ff35e3f3ac7f4c22bc908c5c088e6c0");
                } else {
                    ar.a aVar = new ar.a();
                    aVar.a("https://quickpass.meituan.com");
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a;
                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect6, false, "2a7a19f06ad9cf67a6a2f547f4f4e107", RobustBitConfig.DEFAULT_VALUE)) {
                        a = (com.sankuai.meituan.retrofit2.callfactory.okhttp.a) PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect6, false, "2a7a19f06ad9cf67a6a2f547f4f4e107");
                    } else {
                        v vVar = new v();
                        OkHttp2Wrapper.addInterceptorToClient(vVar);
                        v a4 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
                        a4.b(60L, TimeUnit.SECONDS);
                        a4.g.add(new com.meituan.android.quickpass.uptsm.common.retrofit.Interceptor.a());
                        a = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a4);
                    }
                    aVar.a(a);
                    aVar.a(com.sankuai.meituan.retrofit2.converter.gson.a.a());
                    aVar.a(f.a());
                    aVar.a(Arrays.asList(interceptorArr));
                    a2 = aVar.a();
                }
                retrofitService = (RetrofitService) a2.a(RetrofitService.class);
            }
            a3.b = retrofitService;
        }
        HashMap hashMap = new HashMap();
        String str = "https://quickpass.meituan.com/api/mapi/tsm/isUpdate";
        if (TsmDevConfig.getInstance().isDevOn()) {
            hashMap.put("walletVersion", TsmDevConfig.getInstance().getWalletVersion());
            hashMap.put("tsmVersion", TsmDevConfig.getInstance().getTsmVersion());
            str = TsmDevConfig.getInstance().getTsmUrl();
        } else {
            hashMap.put("walletVersion", j.a(context, "com.huawei.wallet"));
            hashMap.put("tsmVersion", j.a(context, "com.unionpay.tsmservice"));
        }
        rx.d<TsmUpdateInfo> tsmUpdateInfo = a3.b.getTsmUpdateInfo(str, hashMap);
        Object[] objArr6 = {tsmUpdateInfo, jVar};
        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.quickpass.uptsm.common.retrofit.a.a;
        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect7, false, "5e04ca783bdcd7b08fc6d7dc24e75cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect7, false, "5e04ca783bdcd7b08fc6d7dc24e75cc6");
        } else {
            rx.d.a(jVar, tsmUpdateInfo.b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    private void createHuaweiSSD(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2670056d66562d55832dbb3b3324da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2670056d66562d55832dbb3b3324da6");
            return;
        }
        h.a("Huawei SSD Start Create");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_0xmmkf3w", "c_ogr68a1g", Boolean.TRUE);
        com.meituan.android.quickpass.uptsm.common.utils.b.b("创建安全域");
        d.a(a.b.f, 4000);
        final long currentTimeMillis = System.currentTimeMillis();
        a.C0361a.a().a(jsHost().getContext().getApplicationContext(), z, new a.c() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.quickpass.uptsm.manage.a.c
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67b27465b6c7d9485cde09b12a222428", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67b27465b6c7d9485cde09b12a222428");
                } else {
                    IsSupportTSMJsHandler.this.createSSDFinish(i, System.currentTimeMillis() - currentTimeMillis);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSSDFinish(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "807451909d09d79b324835cd13108701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "807451909d09d79b324835cd13108701");
        } else if (i == 0) {
            com.meituan.android.quickpass.uptsm.common.utils.b.a("创建安全域成功");
            d.a(a.b.e, a.C0360a.a, j);
            huaweiSSDCreateSuccess();
        } else if (i == 5) {
            com.meituan.android.quickpass.uptsm.common.utils.b.a("创建安全域通道被占用");
            d.a(a.b.e, a.C0360a.b, j);
            huaweiSSDChannelUsed();
        } else {
            d.a(a.b.e, a.C0360a.c, j);
            HashMap hashMap = new HashMap();
            hashMap.put("status", Integer.valueOf(i));
            com.meituan.android.quickpass.uptsm.common.utils.b.a("创建安全域异常", hashMap);
            huaweiSSDCreateFail(i);
        }
    }

    private void huaweiSSDCreateSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9e521d648d5af9e4dc4bd903797ab4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9e521d648d5af9e4dc4bd903797ab4d");
            return;
        }
        h.a("Huawei SSD Create Success : 9");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_1mioxoq1", "c_ogr68a1g", Boolean.TRUE);
        jsCallBack(9, 0, null, null);
    }

    private void huaweiSSDChannelUsed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cad54d057de55d96b4839a239b528cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cad54d057de55d96b4839a239b528cf");
            return;
        }
        h.a("Huawei SSD Channel is Used : -109");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_08d9h1mt", "c_ogr68a1g", "安全域通道被占用，请稍后重试", -109);
        jsCallBackError(-109, "安全域通道被占用，请稍后重试(-109)");
    }

    private void huaweiSSDCreateFail(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06962b7d969ae1a171bc0979ec9abc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06962b7d969ae1a171bc0979ec9abc53");
            return;
        }
        h.a("Huawei SSD Create fail : " + i);
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_cac92azc", "c_ogr68a1g", "安全域创建失败", i);
        String valueOf = String.valueOf(i);
        jsCallBackError(JsErrorCode.AUDIO_RECORD_STOP_FAILED, valueOf, "安全域创建失败(" + i + CommonConstant.Symbol.BRACKET_RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cacheTsmUpdateInfo(TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad29232db4ff6845d6caae53eb291ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad29232db4ff6845d6caae53eb291ccc");
            return;
        }
        h.a("cache tsm info");
        if (tsmUpdateInfo == null || tsmUpdateInfo.getData() == null) {
            return;
        }
        i.b(jsHost().getContext(), "tsm_update_info", j.a(tsmUpdateInfo));
        i.b(jsHost().getContext(), "tsm_version", getTsmComponentVersion());
    }

    private String getTsmComponentVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e1928a20dbe0eed79a0c28b8975da7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e1928a20dbe0eed79a0c28b8975da7") : j.a(jsHost().getContext(), "com.unionpay.tsmservice");
    }

    private boolean checkNFCStatus(boolean z, boolean z2, boolean z3, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b43e8f1dede12d713814b344b53fcbe8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b43e8f1dede12d713814b344b53fcbe8")).booleanValue();
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(jsHost().getContext());
        if (defaultAdapter == null) {
            h.b("检测不到NFC");
            com.meituan.android.quickpass.uptsm.common.utils.b.b("检测不到NFC");
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_xhpg8ppc", "c_ogr68a1g", Boolean.TRUE);
            jsCallBackError(JsErrorCode.AUDIO_RECORD_START_FAILED, "检测不到NFC");
            return false;
        } else if (defaultAdapter.isEnabled()) {
            return true;
        } else {
            h.b("请先打开NFC");
            com.meituan.android.quickpass.uptsm.common.utils.b.a("请先打开NFC");
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_9mbfibsg", "c_ogr68a1g", Boolean.TRUE);
            jsCallBackError(-106, "请先打开NFC");
            if (z && !isActivityFinishing()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
                builder.setMessage("为了正常开通美团闪付，请先在系统设置中开启NFC功能");
                builder.setCancelable(z2);
                builder.setPositiveButton("去开启", new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.6
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "665e29bc120fbc7263d27d2712ff0e7a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "665e29bc120fbc7263d27d2712ff0e7a");
                            return;
                        }
                        com.meituan.android.quickpass.uptsm.common.utils.b.a("去开启NFC");
                        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_xu0royhx", "c_ogr68a1g", (Object) null);
                        Intent intent = new Intent();
                        intent.setAction("android.settings.NFC_SETTINGS");
                        intent.setFlags(y.a);
                        IsSupportTSMJsHandler.this.jsHost().getActivity().startActivity(intent);
                        dialogInterface.dismiss();
                    }
                });
                if (z3 && !TextUtils.isEmpty(str)) {
                    builder.setNegativeButton(str, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.7
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b3c035a40fc0b7474a351599a565ffc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b3c035a40fc0b7474a351599a565ffc");
                                return;
                            }
                            com.meituan.android.quickpass.uptsm.common.utils.b.a("取消NFC设置");
                            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_mjjjmsaf", "c_ogr68a1g", (Object) null);
                            IsSupportTSMJsHandler.this.jsCallBackError(-111, "用户取消NFC设置");
                        }
                    });
                }
                builder.create().show();
            }
            return false;
        }
    }

    private boolean isDeviceSupport(TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b475e3cb6a2138da4c108131f422da5d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b475e3cb6a2138da4c108131f422da5d")).booleanValue() : (tsmUpdateInfo == null || tsmUpdateInfo.getData() == null || !tsmUpdateInfo.getData().isDeviceSupport()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyNeedUpdate(TsmUpdateInfo tsmUpdateInfo, boolean z) {
        Object[] objArr = {tsmUpdateInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5486b6487e6645198ba6d033368eac84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5486b6487e6645198ba6d033368eac84");
        } else if (isDeviceSupport(tsmUpdateInfo)) {
            if (z && tsmUpdateInfo.getData().isUpdate()) {
                com.meituan.android.quickpass.uptsm.common.utils.b.b("需要升级TSM组件");
                h.a("show tsm update dialog");
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_dwxsalli", "c_ogr68a1g", Boolean.TRUE);
                showTsmDialog(tsmUpdateInfo);
                return;
            }
            initUpTsm();
        } else {
            com.meituan.android.quickpass.uptsm.common.utils.b.b("机型不支持");
            deviceNotSupport();
        }
    }

    private void deviceNotSupport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d3229a3b07c296761ac039c543d739f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d3229a3b07c296761ac039c543d739f");
            return;
        }
        h.a("Device not support : 110");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_n31qfb5o", "c_ogr68a1g", "当前设备不支持", 110);
        jsCallBackError(110, "当前设备不支持(110)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2a8ec804aae51c588ad67250156cf69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2a8ec804aae51c588ad67250156cf69")).booleanValue() : jsHost().getActivity() == null || jsHost().getActivity().isFinishing();
    }

    private void showLoadingDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "924e4cfa6425634b21540b65a938be90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "924e4cfa6425634b21540b65a938be90");
        } else if (isActivityFinishing()) {
        } else {
            if (this.loadingDialog == null || !this.loadingDialog.isShowing()) {
                this.loadingDialog = ProgressDialog.show(jsHost().getActivity(), null, jsHost().getContext().getString(R.string.quickpass_uptsm_update_loading));
            }
        }
    }

    private void showDownloadingDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add4572fdaa4ad5af5070cb96014fbb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add4572fdaa4ad5af5070cb96014fbb7");
        } else if (isActivityFinishing()) {
        } else {
            if (this.loadingDialog == null || !this.loadingDialog.isShowing()) {
                this.loadingDialog = new ProgressDialog(jsHost().getActivity());
                this.loadingDialog.setProgressStyle(1);
                this.loadingDialog.setTitle(R.string.quickpass_uptsm_update_downloading);
                this.loadingDialog.setMax(100);
                this.loadingDialog.show();
            }
        }
    }

    private void showTsmDialog(final TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26503ffa1c32ac7d0c552918d3d966c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26503ffa1c32ac7d0c552918d3d966c8");
        } else if (isActivityFinishing()) {
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
            builder.setCancelable(false);
            builder.setMessage(R.string.quickpass_uptsm_update_message);
            builder.setPositiveButton(R.string.quickpass_uptsm_update_upgrade, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.8
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95c91faf178f16cdf37799ec6cf3868d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95c91faf178f16cdf37799ec6cf3868d");
                        return;
                    }
                    com.meituan.android.quickpass.uptsm.common.utils.b.b("下载TSM组件");
                    com.meituan.android.quickpass.uptsm.common.utils.a.a("b_ey62elrw", "c_ogr68a1g", (Object) null);
                    IsSupportTSMJsHandler.this.downloadTsmComponent(tsmUpdateInfo);
                }
            });
            builder.setNegativeButton(R.string.quickpass_uptsm_update_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.9
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "333f00954aba6610b2a5c0ff5bde54ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "333f00954aba6610b2a5c0ff5bde54ae");
                        return;
                    }
                    com.meituan.android.quickpass.uptsm.common.utils.b.b("取消下载TSM组件");
                    com.meituan.android.quickpass.uptsm.common.utils.a.a("b_ecjmln6w", "c_ogr68a1g", (Object) null);
                    IsSupportTSMJsHandler.this.jsCallBackError(-106, "银联可信服务组件更新失败(-106)");
                }
            });
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRetryTsmDialog(final TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f0e0ffe425946c20a7ed312a7c2dbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f0e0ffe425946c20a7ed312a7c2dbd9");
        } else if (isActivityFinishing()) {
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
            builder.setCancelable(false);
            builder.setMessage(R.string.quickpass_uptsm_update_fail);
            builder.setPositiveButton(R.string.quickpass_uptsm_update_retry, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.10
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8ddf338715b2038ff5f03152f395c87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8ddf338715b2038ff5f03152f395c87");
                        return;
                    }
                    String a2 = i.a(IsSupportTSMJsHandler.this.jsHost().getContext(), "tsm_update_info", (String) null);
                    h.a("Retry Download tsm apk, current url : " + tsmUpdateInfo.getData().getApkUrl());
                    h.a("Retry Download tsm apk, cache info : " + a2);
                    TsmUpdateInfo a3 = j.a(a2);
                    if (a3 != null && a3.getData() != null && !TextUtils.isEmpty(a3.getData().getApkUrl()) && !TextUtils.equals(a3.getData().getApkUrl(), tsmUpdateInfo.getData().getApkUrl())) {
                        tsmUpdateInfo.getData().setApkUrl(a3.getData().getApkUrl());
                        h.a("Retry Download tsm apk, updated url : " + tsmUpdateInfo.getData().getApkUrl());
                    }
                    IsSupportTSMJsHandler.this.downloadTsmComponent(tsmUpdateInfo);
                }
            });
            builder.setNegativeButton(R.string.quickpass_uptsm_update_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.11
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2efd2349d87f075cd9656fc5269b0615", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2efd2349d87f075cd9656fc5269b0615");
                    } else {
                        IsSupportTSMJsHandler.this.jsCallBackError(JsErrorCode.AUDIO_RECORD_START_FAILED, "银联可信服务组件更新失败(-107)");
                    }
                }
            });
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInstallDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09c2fbd509bc8829378a43c763d5d4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09c2fbd509bc8829378a43c763d5d4ca");
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbe8076b40c3e91fbec4ef1095927241", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbe8076b40c3e91fbec4ef1095927241");
                    } else if (IsSupportTSMJsHandler.this.isActivityFinishing()) {
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(IsSupportTSMJsHandler.this.jsHost().getActivity());
                        builder.setCancelable(false);
                        builder.setMessage(R.string.quickpass_uptsm_update_go_on);
                        builder.setPositiveButton(R.string.quickpass_uptsm_update_sure, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e7aa3b3f5987779d896d50a1700670f1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e7aa3b3f5987779d896d50a1700670f1");
                                    return;
                                }
                                IsSupportTSMJsHandler.this.unregisterTsmAddedReceiver();
                                IsSupportTSMJsHandler.this.getTsmUpdateInfo(true);
                            }
                        });
                        builder.setNegativeButton(R.string.quickpass_uptsm_update_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.2.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "98f72bb7a4927f754373a684f2f08df1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "98f72bb7a4927f754373a684f2f08df1");
                                    return;
                                }
                                IsSupportTSMJsHandler.this.unregisterTsmAddedReceiver();
                                IsSupportTSMJsHandler.this.verifyNeedUpdate(IsSupportTSMJsHandler.this.mTsmUpdateInfo, false);
                            }
                        });
                        IsSupportTSMJsHandler.this.installDialog = builder.create();
                        IsSupportTSMJsHandler.this.installDialog.show();
                    }
                }
            }, 800L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLoadingDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a474b7f257a101bb1ae7c745cb6c5018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a474b7f257a101bb1ae7c745cb6c5018");
            return;
        }
        try {
            if (this.loadingDialog != null) {
                this.loadingDialog.dismiss();
                this.loadingDialog = null;
            }
        } catch (Exception e) {
            h.b(Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissInstallDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d84f03a15f9ca1f580e0b4888c04e136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d84f03a15f9ca1f580e0b4888c04e136");
            return;
        }
        try {
            if (this.installDialog != null) {
                this.installDialog.dismiss();
                this.installDialog = null;
            }
        } catch (Exception e) {
            h.b(Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadTsmComponent(final TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feb372576b419b66c5e40a72e1da0856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feb372576b419b66c5e40a72e1da0856");
            return;
        }
        showDownloadingDialog();
        final long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.quickpass.uptsm.common.download.b.a(jsHost().getContext(), tsmUpdateInfo.getData().getApkUrl(), new com.meituan.android.quickpass.uptsm.common.download.a() { // from class: com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.quickpass.uptsm.common.download.a
            public final void a(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33b45badc47fae06e551a32c68b8d679", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33b45badc47fae06e551a32c68b8d679");
                    return;
                }
                h.a("进度：" + j);
                if (IsSupportTSMJsHandler.this.loadingDialog != null) {
                    IsSupportTSMJsHandler.this.loadingDialog.setProgress((int) j);
                }
            }

            @Override // com.meituan.android.quickpass.uptsm.common.download.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f0cf8fa631affdfb9202987acd5bde8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f0cf8fa631affdfb9202987acd5bde8");
                    return;
                }
                IsSupportTSMJsHandler.this.dismissLoadingDialog();
                h.b("下载完成，目录为：" + str);
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_r6t384yu", "c_ogr68a1g", System.currentTimeMillis() - currentTimeMillis);
                Context context = IsSupportTSMJsHandler.this.jsHost().getContext();
                Object[] objArr3 = {context, str};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.quickpass.uptsm.common.utils.f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "bf2b69b2417c9120f6507135b926e10c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "bf2b69b2417c9120f6507135b926e10c");
                } else {
                    Intent intent = new Intent();
                    intent.setFlags(y.a);
                    intent.setAction("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setFlags(1);
                        intent.setDataAndType(FileProvider.getUriForFile(context, context.getPackageName() + ".quickpass.uptsm.provider.UPTSMFileProvider", new File(str)), "application/vnd.android.package-archive");
                    } else {
                        intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
                    }
                    context.startActivity(intent);
                }
                IsSupportTSMJsHandler.this.showInstallDialog();
                IsSupportTSMJsHandler.this.registerTsmAddedReceiver();
            }

            @Override // com.meituan.android.quickpass.uptsm.common.download.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d0e536166c98a4783ea2143fa2bd2b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d0e536166c98a4783ea2143fa2bd2b4");
                    return;
                }
                IsSupportTSMJsHandler.this.dismissLoadingDialog();
                h.b("下载失败");
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_ndfcb7e9", "c_ogr68a1g", (Object) null);
                IsSupportTSMJsHandler.this.showRetryTsmDialog(tsmUpdateInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerTsmAddedReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffc077e052bcea71de394e6649b93de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffc077e052bcea71de394e6649b93de9");
            return;
        }
        this.mTsmAddedReceiver = new TsmComponentAddedReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        jsHost().getContext().registerReceiver(this.mTsmAddedReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterTsmAddedReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cf212efb5b228255b76504dcb5a8f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cf212efb5b228255b76504dcb5a8f64");
            return;
        }
        try {
            if (this.mTsmAddedReceiver != null) {
                jsHost().getContext().unregisterReceiver(this.mTsmAddedReceiver);
            }
        } catch (Exception e) {
            h.b(Log.getStackTraceString(e));
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fc8585504231f711dca858988989cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fc8585504231f711dca858988989cc1");
            return;
        }
        super.onDestroy();
        reference = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class TsmComponentAddedReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private TsmComponentAddedReceiver() {
            Object[] objArr = {IsSupportTSMJsHandler.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aee643fbda511127f3909d7c7c8c565", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aee643fbda511127f3909d7c7c8c565");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d9ce17ecd1789f1bd262f3ce81493d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d9ce17ecd1789f1bd262f3ce81493d");
                return;
            }
            h.b("TsmComponentAddedReceiver onReceive");
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED") && "com.unionpay.tsmservice".equals(intent.getData().getSchemeSpecificPart())) {
                com.meituan.android.quickpass.uptsm.common.utils.b.b("TSM组件安装完成");
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_xp1eqvrd", "c_ogr68a1g", (Object) null);
                IsSupportTSMJsHandler.this.dismissInstallDialog();
                IsSupportTSMJsHandler.this.initUpTsm();
                IsSupportTSMJsHandler.this.unregisterTsmAddedReceiver();
            }
        }
    }
}
