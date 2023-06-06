package com.sankuai.waimai.touchmatrix.rebuild.biz;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.rebuild.utils.c;
import com.sankuai.waimai.touchmatrix.rebuild.utils.e;
import com.sankuai.waimai.touchmatrix.utils.g;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public static List<String> c = new CopyOnWriteArrayList();
    private static String d;

    public static String a(Activity activity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Uri data;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6336c7b3cf95a8fc1178ef3836a180ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6336c7b3cf95a8fc1178ef3836a180ad");
        }
        String str7 = "";
        try {
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b1c83befe66b1a24cf87bafe91558a5f", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b1c83befe66b1a24cf87bafe91558a5f");
            } else {
                str = "";
                if (activity instanceof b) {
                    str = ((b) activity).a();
                    c.a("BizManager , ITMatrixBizProvider 接口 获取 biz ： " + str, new Object[0]);
                }
            }
            str2 = str;
        } catch (Exception e) {
            c.d("BizManager getPageBiz exception： " + e.getMessage(), new Object[0]);
        }
        if (TextUtils.isEmpty(str2)) {
            Object[] objArr3 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2f40df11f24c73a3b510af833c824d30", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2f40df11f24c73a3b510af833c824d30");
            } else {
                str3 = "";
                if (c.contains(activity != null ? activity.getComponentName().getClassName() : "")) {
                    str3 = d;
                    c.a("BizManager , 第三方页面 获取 biz ： " + str3, new Object[0]);
                }
            }
            String str8 = str3;
            if (TextUtils.isEmpty(str8)) {
                Object[] objArr4 = {activity};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "965b196f2fe6d58e8cc2a79feb9d7e8f", RobustBitConfig.DEFAULT_VALUE)) {
                    str4 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "965b196f2fe6d58e8cc2a79feb9d7e8f");
                } else {
                    str4 = "";
                    if (activity instanceof BaseActivity) {
                        str4 = "waimai";
                        c.a("BizManager , 外卖 闪购, 获取 biz ： waimai", new Object[0]);
                    }
                }
                String str9 = str4;
                if (TextUtils.isEmpty(str9)) {
                    Object[] objArr5 = {activity};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "c1bd238c3c8f44cb62efb5ef1ffc2bd6", RobustBitConfig.DEFAULT_VALUE)) {
                        str5 = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "c1bd238c3c8f44cb62efb5ef1ffc2bd6");
                    } else {
                        str5 = "";
                        if (activity instanceof MRNBaseActivity) {
                            String b2 = ((MRNBaseActivity) activity).k().p().b();
                            str5 = b((TextUtils.equals(b2, "sgc") || TextUtils.equals(b2, "supermarket")) ? "waimai" : "waimai");
                            c.a("BizManager , MRN  获取 biz ： " + str5, new Object[0]);
                        }
                    }
                    String str10 = str5;
                    if (TextUtils.isEmpty(str10)) {
                        Object[] objArr6 = {activity};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1e5e280059ddca6b72d61b6ad1b43a3a", RobustBitConfig.DEFAULT_VALUE)) {
                            str6 = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1e5e280059ddca6b72d61b6ad1b43a3a");
                        } else {
                            str6 = "";
                            if (TextUtils.equals("com.meituan.mmp.lib.HeraActivity", activity.getClass().getName()) && (data = activity.getIntent().getData()) != null) {
                                String queryParameter = data.getQueryParameter("appId");
                                c.a("BizManager , handleMMPBiz 获取AppId ： " + queryParameter, new Object[0]);
                                str6 = c(queryParameter);
                                c.a("BizManager , handleMMPBiz 获取Biz ： " + str6, new Object[0]);
                            }
                        }
                        String str11 = str6;
                        if (TextUtils.isEmpty(str11)) {
                            Object[] objArr7 = {activity};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "598f345bdd9eadeed20b7605763db2f0", RobustBitConfig.DEFAULT_VALUE)) {
                                str7 = (String) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "598f345bdd9eadeed20b7605763db2f0");
                            } else {
                                String str12 = "";
                                if (activity instanceof com.sankuai.waimai.foundation.core.base.activity.c) {
                                    Map<String, String> Z_ = ((com.sankuai.waimai.foundation.core.base.activity.c) activity).Z_();
                                    if (Z_ != null && !Z_.isEmpty()) {
                                        String str13 = Z_.get("page_id");
                                        str12 = d(str13);
                                        c.a("BizManager , IIdentifierProvider 获取biz , PageId 转 biz ： " + str12 + " pageId: " + str13, new Object[0]);
                                    }
                                } else {
                                    String b3 = com.sankuai.waimai.touchmatrix.utils.c.a().b();
                                    str12 = d(b3);
                                    c.a("BizManager , PageStackManager 获取Biz ,pageId 获取 biz ： " + str12 + " pageId: " + b3, new Object[0]);
                                }
                                str7 = str12;
                            }
                            return !TextUtils.isEmpty(str7) ? str7 : str7;
                        }
                        return str11;
                    }
                    return str10;
                }
                return str9;
            }
            return str8;
        }
        return str2;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f94426aff0af4fb4fee8e2a5d02dcd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f94426aff0af4fb4fee8e2a5d02dcd7d");
            return;
        }
        c.b("BizManager 更新 sCurBiz： " + str, new Object[0]);
        d = str;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8725348f84436d8382c87b8ff8ad7122", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8725348f84436d8382c87b8ff8ad7122");
        }
        c.b("BizManager getCurBiz()： " + d, new Object[0]);
        return d;
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29db28d39abe72908f4fbe02c69aea9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29db28d39abe72908f4fbe02c69aea9a");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ConcurrentHashMap<String, a.C1348a> concurrentHashMap = com.sankuai.waimai.touchmatrix.a.a().b;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return str;
        }
        for (Map.Entry<String, a.C1348a> entry : concurrentHashMap.entrySet()) {
            if (entry != null && TextUtils.equals(entry.getValue().h, str)) {
                return entry.getKey();
            }
        }
        return str;
    }

    private static String c(String str) {
        ConcurrentHashMap<String, a.C1348a> concurrentHashMap;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "275dafc9d40ee08cca132a3622e71d96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "275dafc9d40ee08cca132a3622e71d96");
        }
        if (g.a(str) || (concurrentHashMap = com.sankuai.waimai.touchmatrix.a.a().b) == null || concurrentHashMap.isEmpty()) {
            return "";
        }
        for (Map.Entry<String, a.C1348a> entry : concurrentHashMap.entrySet()) {
            if (entry != null && TextUtils.equals(entry.getValue().i, str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    private static String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1b671a46b7b05fd5599d0a03e4fd182", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1b671a46b7b05fd5599d0a03e4fd182") : TextUtils.isEmpty(str) ? "" : b.get(str);
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90aca0de283a33c775d5f74d35e328f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90aca0de283a33c775d5f74d35e328f5");
        } else if (TextUtils.isEmpty(str) || hashMap == null || hashMap.isEmpty()) {
            c.d("BizManager 添加 Biz  pageId 关系map 失败  ，  biz: " + str, new Object[0]);
        } else {
            for (String str2 : hashMap.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    c.c("BizManager 添加 Biz  pageId 关系  pageId: " + str2 + "  BIZ: " + str, new Object[0]);
                    b.put(str2, str);
                }
            }
        }
    }

    public static void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "864ac3823256dfb65fc2aa9dbf200395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "864ac3823256dfb65fc2aa9dbf200395");
        } else if (g.a(list)) {
        } else {
            c.addAll(list);
        }
    }

    public static boolean a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4662773e42e730b05c17a61c65239143", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4662773e42e730b05c17a61c65239143")).booleanValue();
        }
        if (aVar == null || aVar.k == null || TextUtils.isEmpty(aVar.k.bizId)) {
            return false;
        }
        String a2 = a(com.sankuai.waimai.touchmatrix.rebuild.message.a.c(aVar));
        if (!g.a(a2)) {
            c.e("业务biz校验, 获取当前页面biz有效,更新sCurBiz:" + a2, new Object[0]);
            d = a2;
        }
        c.e("业务biz校验, 消息Biz: %s , 页面Biz: %s", aVar.k.bizId, d);
        boolean equals = TextUtils.equals(d, aVar.k.bizId);
        if (!equals) {
            final HashMap hashMap = new HashMap();
            hashMap.put("msg_id", aVar.c);
            hashMap.put("msg_biz", aVar.k.bizId);
            hashMap.put("page_biz", d);
            try {
                e.b().execute(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.biz.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77738941e8e53c23d9cd7042952d824a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77738941e8e53c23d9cd7042952d824a");
                        } else {
                            j.a().a(RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY, "wmtm_msg_biz_mismatching", "触达消息中的biz与当前业务线不匹配时不符合展示条件", hashMap);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
        return equals;
    }
}
