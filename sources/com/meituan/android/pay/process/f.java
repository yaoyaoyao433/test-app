package com.meituan.android.pay.process;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.MeituanPayConstants;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static volatile f d;
    private static final WeakHashMap<Activity, f> e = new WeakHashMap<>();
    private static final LinkedHashMap<String, f> f = new LinkedHashMap<>();
    private static volatile Boolean g = null;
    public c b;
    public e c;

    private static boolean a(Bundle bundle) {
        return bundle != null;
    }

    private static synchronized boolean c() {
        synchronized (f.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9a35ef4c3b8c3f4cf12cfb020aa4333", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9a35ef4c3b8c3f4cf12cfb020aa4333")).booleanValue();
            }
            if (g == null) {
                com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                if (cVar != null) {
                    g = Boolean.valueOf(cVar.m);
                } else {
                    g = Boolean.TRUE;
                }
            }
            return g.booleanValue();
        }
    }

    public static void a(String str, PayActivity payActivity) {
        Object[] objArr = {str, payActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "027ba46c8d05f38524eb30695ae9501d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "027ba46c8d05f38524eb30695ae9501d");
        } else {
            f.put(str, e.get(payActivity));
        }
    }

    public static void b(String str, PayActivity payActivity) {
        Object[] objArr = {str, payActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f67f4ee0a00efc89a77679f3503faa1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f67f4ee0a00efc89a77679f3503faa1e");
        } else if (f.get(str) != null) {
            e.put(payActivity, f.remove(str));
        }
    }

    public static synchronized f a(Activity activity) {
        synchronized (f.class) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3319b84534d76464b38c7bbc822e957d", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3319b84534d76464b38c7bbc822e957d");
            } else if (c()) {
                Activity activity2 = com.meituan.android.pay.common.util.a.a().b(activity).get();
                if (activity2 != null) {
                    f fVar = e.get(activity2);
                    if (fVar != null) {
                        return fVar;
                    }
                    f fVar2 = new f();
                    e.put(activity2, fVar2);
                    d = fVar2;
                    return fVar2;
                }
                if (f.size() != 0) {
                    if (activity instanceof PayBaseActivity) {
                        String p = ((PayBaseActivity) activity).p();
                        if (f.get(p) == null) {
                            if (d != null) {
                                return d;
                            }
                            f.put(p, new f());
                        }
                        return f.get(p);
                    }
                    Iterator<Map.Entry<String, f>> it = f.entrySet().iterator();
                    Map.Entry<String, f> entry = null;
                    while (it.hasNext()) {
                        entry = it.next();
                    }
                    if (entry != null) {
                        return entry.getValue();
                    }
                }
                com.meituan.android.pay.common.analyse.b.a("mtprocessroute_getInstance_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                if (d == null) {
                    d = new f();
                }
                return d;
            } else {
                if (d == null) {
                    d = new f();
                }
                return d;
            }
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public static void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "402d1e4c332e007430e7cadd3c96d0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "402d1e4c332e007430e7cadd3c96d0fb");
        } else if (fragmentActivity == null || fragmentActivity.getIntent() == null) {
        } else {
            Intent intent = fragmentActivity.getIntent();
            Uri data = intent.getData();
            com.meituan.android.pay.common.payment.utils.b.d(fragmentActivity);
            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, (String) null);
            if (data != null) {
                if (!TextUtils.isEmpty(data.getQueryParameter("url"))) {
                    com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "tradeno", data.getQueryParameter("tradeno"));
                    a(fragmentActivity, data.getQueryParameter("url"));
                } else if (!TextUtils.isEmpty(data.getQueryParameter(RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER))) {
                    String queryParameter = data.getQueryParameter(RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
                    Object[] objArr2 = {fragmentActivity, queryParameter};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5827ca28278ed80d2693f51ff9305772", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5827ca28278ed80d2693f51ff9305772");
                        return;
                    }
                    try {
                        com.meituan.android.pay.common.analyse.b.b(ak.a(fragmentActivity));
                        g.a(fragmentActivity, new JSONObject(queryParameter), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
                    } catch (Exception e2) {
                        com.meituan.android.paybase.common.analyse.a.a(e2, "PayActivity_JSONException", (Map<String, Object>) null);
                    }
                } else {
                    Object[] objArr3 = {fragmentActivity, data};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7483fb789c567088eae6c308cba6de0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7483fb789c567088eae6c308cba6de0f");
                    } else {
                        com.meituan.android.pay.common.analyse.a.b = "2";
                        if (!TextUtils.isEmpty(data.getQueryParameter("trans_id")) && !TextUtils.isEmpty(data.getQueryParameter("pay_token"))) {
                            String queryParameter2 = data.getQueryParameter("trans_id");
                            com.meituan.android.paybase.common.analyse.b.b = queryParameter2;
                            com.meituan.android.paybase.common.utils.b.a(true);
                            if (!TextUtils.isEmpty(data.getQueryParameter("nb_source"))) {
                                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, data.getQueryParameter("nb_source"));
                            } else {
                                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, MeituanPayConstants.NB_SOURCE_HELLOPAY);
                            }
                            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "cashier_type", "hello");
                            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, com.meituan.android.pay.utils.j.a(data));
                            if (TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url"))) {
                                com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "launch_url", "/qdbdisplay/cashdesk");
                            }
                            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, "current_url", "/qdbdisplay/cashdesk");
                            com.meituan.android.pay.common.analyse.b.b(ak.a(fragmentActivity));
                            com.meituan.android.pay.common.analyse.b.a("standard_cashier_mt_pay_start", ak.a(fragmentActivity));
                            com.meituan.android.pay.common.analyse.b.b("standard_cashier_mt_pay", "b_pay_standard_cashier_mt_pay_start_sc", new a.c().a("cashier_type", "hello").a("nb_container", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "nb_container")).a("qdb_no", queryParameter2).b, ak.a(fragmentActivity));
                            b(fragmentActivity);
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_b9104ita_mv", new a.c().a("trans_id", queryParameter2).a(KnbConstants.PARAMS_SCENE, "支付组件").a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b);
                            com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_DISPATCH_WALLETPAY, 200);
                            PayActivity.a("/qdbdisplay/cashdesk");
                        } else {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", new a.c().a("message", "transId或payToken为空").b);
                            com.meituan.android.paybase.common.analyse.cat.a.a("startMtPayError", "transId或payToken为空_uri_" + data);
                            com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_DISPATCH_WALLETPAY, (int) MeituanPayCatConstants.CODE_TRANS_ID_PAY_TOKEN_NULL);
                        }
                    }
                    com.meituan.android.pay.common.analyse.b.b("b_pay_xkue7609_sc", new a.c().a(Constants.TRAFFIC_URI, data).b, ak.a(fragmentActivity));
                }
            } else if (intent.getExtras() != null && !TextUtils.isEmpty(intent.getExtras().getString("orderInfo"))) {
                a(fragmentActivity, intent.getExtras().getString("orderInfo"));
                com.meituan.android.pay.common.analyse.b.b("b_pay_xkue7609_sc", new a.c().a("extra", intent.getExtras()).b, ak.a(fragmentActivity));
            } else {
                com.meituan.android.pay.common.analyse.b.b(ak.a(fragmentActivity));
                com.meituan.android.paybase.common.analyse.cat.a.a("startMtPayError", "getIntent或者getIntent.getExtras为空");
                com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", new a.c().a("message", "直连url调起异常,intent为空").a(LogMonitor.EXCEPTION_TAG, "uri为null").a("intent", intent).b);
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_DISPATCH_WALLETPAY, (int) MeituanPayCatConstants.CODE_URI_NULL);
            }
        }
    }

    private static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3142fe95cb49544661dbed13ecf09edc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3142fe95cb49544661dbed13ecf09edc")).booleanValue();
        }
        int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "pay_result", -1);
        return a2 > 0 && a2 <= 6;
    }

    private static boolean a(Intent intent, Bundle bundle) {
        Object[] objArr = {intent, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01d4145b40eca76cfe4cc2195c06f4cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01d4145b40eca76cfe4cc2195c06f4cd")).booleanValue() : bundle == null && (b(intent) || c(intent) || d(intent));
    }

    private static boolean b(Intent intent) {
        Uri data;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd3db61ef0386f99a5ce6efc0a1ca44c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd3db61ef0386f99a5ce6efc0a1ca44c")).booleanValue() : (intent == null || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQueryParameter("url"))) ? false : true;
    }

    private static boolean c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a053327b17a5d96d703af59d10668dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a053327b17a5d96d703af59d10668dd")).booleanValue() : (intent == null || intent.getExtras() == null || TextUtils.isEmpty(intent.getExtras().getString("orderInfo"))) ? false : true;
    }

    private static boolean d(Intent intent) {
        Uri data;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a3da46f63158e849e0c702d516b1df8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a3da46f63158e849e0c702d516b1df8")).booleanValue() : (intent == null || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQueryParameter("trans_id")) || TextUtils.isEmpty(data.getQueryParameter("pay_token"))) ? false : true;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a501f4a2ef3901b67b4c1c3c3e94c441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a501f4a2ef3901b67b4c1c3c3e94c441");
        } else {
            f.remove(str);
        }
    }

    public final void a(Bundle bundle, Intent intent, String str) {
        String str2;
        Object[] objArr = {bundle, intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb798f3cf6875203d52a59f4f88b30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb798f3cf6875203d52a59f4f88b30b");
        } else if (this.c == null) {
        } else {
            if (a(intent)) {
                this.c.c(intent);
                str2 = "isPayResultIntent";
            } else if (a(intent, bundle)) {
                this.c.a(intent);
                str2 = "isStartMtPayIntent";
                String str3 = "default";
                if (b(intent)) {
                    str3 = "isUrlStart";
                } else if (c(intent)) {
                    str3 = "isOrderInfoStart";
                } else if (d(intent)) {
                    str3 = "isTransIdStart";
                }
                com.meituan.android.pay.common.analyse.b.b("b_pay_mwjd4tgh_sc", new a.c().a("startScene", str3).b, str);
            } else if (a(bundle)) {
                this.c.a(bundle);
                str2 = "isRestoreIntent";
            } else {
                this.c.b(intent);
                str2 = "closeIntent";
                com.meituan.android.pay.common.analyse.b.b("b_pay_mwjd4tgh_sc", new a.c().a(KnbConstants.PARAMS_SCENE, "loadIntent_closeIntent").b, str);
            }
            com.meituan.android.pay.common.analyse.b.b("b_pay_ohlp297r_sc", new a.c().a("loadIntent", str2).b, str);
        }
    }

    public static void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "263796a214fd6b1137552c9d07a198fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "263796a214fd6b1137552c9d07a198fd");
            return;
        }
        c a2 = g.a(fragmentActivity);
        a((Activity) fragmentActivity).a(a2);
        a2.a(fragmentActivity, bundle);
    }

    public static void a(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5325281a2bc833109e5ce714ecf3f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5325281a2bc833109e5ce714ecf3f2c");
            return;
        }
        c a2 = g.a(fragmentActivity);
        a((Activity) fragmentActivity).a(a2);
        if (obj == null) {
            a2.b();
        } else {
            a2.a(fragmentActivity, obj);
        }
    }

    public static void b(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baa64d0ca4bb7b92e2943d05e7114dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baa64d0ca4bb7b92e2943d05e7114dac");
            return;
        }
        com.meituan.android.pay.process.hybrid.b bVar = new com.meituan.android.pay.process.hybrid.b(fragmentActivity, g.e(fragmentActivity));
        a((Activity) fragmentActivity).a(bVar);
        bVar.a(fragmentActivity, obj);
    }

    public final void c(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17340438c670472f19ca8d9177c56c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17340438c670472f19ca8d9177c56c76");
        } else if (this.b != null) {
            this.b.a(fragmentActivity, obj);
        } else {
            c a2 = g.a(fragmentActivity);
            a((Activity) fragmentActivity).a(a2);
            a2.a(fragmentActivity, obj);
        }
    }

    private static void a(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2437a4f7087273109a00bc9af604c9eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2437a4f7087273109a00bc9af604c9eb");
            return;
        }
        try {
            HashMap<String, String> a2 = com.meituan.android.pay.utils.j.a(new String(com.meituan.android.paybase.utils.c.a(str)));
            com.meituan.android.pay.utils.e.a(a2);
            com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, a2);
            c(fragmentActivity);
            if (com.meituan.android.pay.common.payment.utils.b.c(fragmentActivity).containsKey("trans_id")) {
                com.meituan.android.paybase.common.analyse.b.b = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "trans_id");
            }
            com.meituan.android.pay.common.analyse.b.b(ak.a(fragmentActivity));
            com.meituan.android.pay.analyse.a.a(fragmentActivity, str);
            b((Activity) fragmentActivity);
            com.meituan.android.pay.analyse.a.b(fragmentActivity);
            b(com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "quickpay_type"));
            com.meituan.android.pay.analyse.a.c(fragmentActivity);
            b(fragmentActivity);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_b9104ita_mv", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(KnbConstants.PARAMS_SCENE, com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "nb_container")).a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b);
            com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_DISPATCH_WALLETPAY, 200);
            PayActivity.a(com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url"));
        } catch (Exception e2) {
            d();
            a.c a3 = new a.c().a("message", "直连url调起异常,base64解析错误");
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", a3.a(LogMonitor.EXCEPTION_TAG, "base64_" + str + "_exception_" + e2.toString()).b);
            com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_DISPATCH_WALLETPAY, (int) MeituanPayCatConstants.CODE_URL_BASE64_ERROR);
            com.meituan.android.paybase.common.analyse.cat.a.a("startMtPayError", "调起直连异常_url_" + str + "_exception_" + e2.toString());
            if (fragmentActivity != null) {
                fragmentActivity.finish();
            }
        }
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca2b4c02d679b0e3cc49fdd465633797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca2b4c02d679b0e3cc49fdd465633797");
        } else {
            com.meituan.android.paybase.common.utils.b.a(MeituanPayConstants.NB_SOURCE_HELLOPAY.equals(str));
        }
    }

    private static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67c3f028c9d06888c3eb44473afe8b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67c3f028c9d06888c3eb44473afe8b3a");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat");
        if (TextUtils.isEmpty(b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(b);
            if (jSONObject.has("oneclickpay_errmsg")) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "oneclickpay_errmsg", jSONObject.getString("oneclickpay_errmsg"));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayActivity_JSONException", new a.c().a("one_click_error_message", b).b);
        }
    }

    private static void b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f60f99d0b3dabde6b80fb8d89dc22a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f60f99d0b3dabde6b80fb8d89dc22a66");
            return;
        }
        a((Activity) fragmentActivity).a(g.a(fragmentActivity));
        a((Activity) fragmentActivity).a();
        com.meituan.android.paybase.common.analyse.a.a("b_pay_0tv9vx6w_mc", new a.c().a("launchUrl", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url")).a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b);
    }

    private static void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62472d9bc05377e9114833638aed5c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62472d9bc05377e9114833638aed5c3b");
        } else {
            com.meituan.android.pay.common.analyse.a.b = TextUtils.equals("/qdbsign/sign", com.meituan.android.pay.common.payment.utils.b.b(activity, "launch_url")) ? "5" : "1";
        }
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b71f7249b1c6ec3bc2595b469a4714d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b71f7249b1c6ec3bc2595b469a4714d");
            return;
        }
        if (!TextUtils.equals(this.b != null ? this.b.d() : "", cVar.d()) && this.b != null) {
            this.b.c();
        }
        this.b = cVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f007acd9c8c430d30015a7934aef8309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f007acd9c8c430d30015a7934aef8309");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa5667709696235625ceade1cd540a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa5667709696235625ceade1cd540a64");
            return;
        }
        com.meituan.android.paybase.metrics.a.a().a("tti_verify_password_pay_view");
        com.meituan.android.paybase.metrics.a.a().a("tti_card_bin_view");
        com.meituan.android.paybase.metrics.a.a().a("tti_card_ocr_view");
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f79fd7231b820d1f67dce8797ca215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f79fd7231b820d1f67dce8797ca215");
            return;
        }
        if (this.b != null) {
            this.b.c();
            this.b = null;
        }
        d = null;
        com.meituan.android.pay.analyse.a.a();
        g.a();
        com.meituan.android.pay.common.analyse.a.a();
        d();
    }
}
