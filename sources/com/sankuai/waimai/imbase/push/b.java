package com.sankuai.waimai.imbase.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.waimai.imbase.utils.g;
import com.sankuai.waimai.imbase.window.a;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static int b;
    private static WeakReference<c> c;
    private static WeakReference<a> d;

    public static void a(int i) {
        b = i;
    }

    public static int a() {
        return b;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f935d682194546e3696c5d1ec8d5f417", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f935d682194546e3696c5d1ec8d5f417")).booleanValue() : com.sankuai.waimai.foundation.utils.activity.a.a().b() != null;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "518716f412abf881a6d1811de3f06a99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "518716f412abf881a6d1811de3f06a99")).booleanValue();
        }
        Activity b2 = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        return b2 != null && TextUtils.equals(b2.getClass().getName(), "com.sankuai.waimai.business.page.homepage.MainActivity");
    }

    public static void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6ffd3dc20f5fbdca93c4e2cbd3d7858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6ffd3dc20f5fbdca93c4e2cbd3d7858");
        } else {
            com.sankuai.waimai.imbase.c.a(iMMessage);
        }
    }

    public static long a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ca928873773c2d5f935825aa3d3c31f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ca928873773c2d5f935825aa3d3c31f")).longValue();
        }
        if (context == null) {
            return 0L;
        }
        return q.a(context, "waimai_imbase", 1).b("waimai_imbase_last_outpush", 0L);
    }

    public static void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14ae146684f528e5aa5ecc18c087c12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14ae146684f528e5aa5ecc18c087c12b");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_imbase", 1).a("waimai_imbase_last_outpush", j);
        }
    }

    public static long b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fa51dbac8d3525ee1a71671d9c79769", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fa51dbac8d3525ee1a71671d9c79769")).longValue();
        }
        if (context == null) {
            return 0L;
        }
        return q.a(context, "waimai_imbase", 1).b("waimai_imbase_latest_messge", 0L);
    }

    public static void b(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b7eca1e6de3f045736d2a45907a12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b7eca1e6de3f045736d2a45907a12b");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_imbase", 1).a("waimai_imbase_latest_messge", j);
        }
    }

    public static void a(Context context, @DrawableRes int i, String str, @Nullable String str2, String str3, final Intent intent, JSONObject jSONObject) {
        c cVar;
        char c2;
        final String str4;
        final long j;
        Object[] objArr = {context, Integer.valueOf((int) R.drawable.wm_common_good_img_default), str, str2, str3, intent, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10eba5a35302b9a9236020361c5a0f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10eba5a35302b9a9236020361c5a0f9b");
            return;
        }
        final Activity b2 = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        if (b2 != null) {
            Object[] objArr2 = {b2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b85cf48e449804755701f7fe84b520f6", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b85cf48e449804755701f7fe84b520f6");
            } else if (c != null) {
                cVar = c.get();
                if (cVar == null || !cVar.b()) {
                    cVar = new c(b2);
                    c = new WeakReference<>(cVar);
                }
            } else {
                cVar = new c(b2);
                c = new WeakReference<>(cVar);
            }
            c a2 = cVar.a(TextUtils.isEmpty(str2) ? context.getString(R.string.wm_imbase_app_name) : str2);
            Object[] objArr3 = {str3};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1ef180f6e43ab52b98718306e4500814", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = 0;
                a2 = (c) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1ef180f6e43ab52b98718306e4500814");
            } else {
                c2 = 0;
                a2.b.setText(str3);
            }
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr4 = new Object[1];
            objArr4[c2] = new Long(currentTimeMillis);
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "7af03a5e2b603b250c9ffca67c94cd63", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (c) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "7af03a5e2b603b250c9ffca67c94cd63");
            } else {
                a2.c.setText(c.a(currentTimeMillis));
            }
            a2.a(4000).c();
            if (jSONObject != null) {
                str4 = jSONObject.optString("category", "");
                j = g.a(jSONObject.optString("messageId", ""));
            } else {
                str4 = "";
                j = 0;
            }
            com.sankuai.waimai.imbase.log.judas.a.b("b_2fewqhua").a("messageId", j).a("category", str4).a("type", 0).a();
            cVar.g = new a.b() { // from class: com.sankuai.waimai.imbase.push.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.window.a.b
                public final void a(com.sankuai.waimai.imbase.window.a aVar) {
                    Object[] objArr5 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cf959aaec26ff86f12adc1bad3e6564d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cf959aaec26ff86f12adc1bad3e6564d");
                        return;
                    }
                    b2.startActivity(intent);
                    aVar.e();
                    com.sankuai.waimai.imbase.log.judas.a.a("b_cvqfb6g1").a("messageId", j).a("category", str4).a("type", 0).a("tsp_push_msg_id", com.sankuai.waimai.foundation.router.a.a(intent, "tsp_push_msg_id", "")).a(DataConstants.PUSH_ID, com.sankuai.waimai.foundation.router.a.a(intent, DataConstants.PUSH_ID, "")).a();
                    com.sankuai.waimai.imbase.b.d().a(j, str4);
                }
            };
        }
    }

    public static void a(@DrawableRes int i, String str, String str2, String str3, long j, final Uri uri, final a.c cVar) {
        a aVar;
        String format;
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, new Long(j), uri, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1994995e76c6aaa8d1ead00b683da31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1994995e76c6aaa8d1ead00b683da31f");
            return;
        }
        final Activity b2 = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        if (b2 == null || !com.sankuai.waimai.imbase.b.d().b(b2)) {
            return;
        }
        Object[] objArr2 = {b2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "be1760329a93d8a9ce1054dc9a8465b4", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "be1760329a93d8a9ce1054dc9a8465b4");
        } else if (d != null) {
            aVar = d.get();
            if (aVar == null || !aVar.b()) {
                aVar = new a(b2);
                d = new WeakReference<>(aVar);
            }
        } else {
            aVar = new a(b2);
            d = new WeakReference<>(aVar);
        }
        a a2 = aVar.b(str2).a(str, i).a(str3);
        Object[] objArr3 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "000b6cdff150a143afc12ebb48925ece", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "000b6cdff150a143afc12ebb48925ece");
        } else {
            TextView textView = a2.b;
            Object[] objArr4 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "97317e30af633363c50d2b3e1912d920", RobustBitConfig.DEFAULT_VALUE)) {
                format = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "97317e30af633363c50d2b3e1912d920");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (j >= currentTimeMillis - LocationStrategy.LOCATION_TIMEOUT) {
                    format = "刚刚";
                } else {
                    Date date = new Date(currentTimeMillis);
                    Date date2 = new Date(j);
                    if (a.a(date, date2)) {
                        Object[] objArr5 = {date2};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        format = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7ca031baee6c09161c40e2b27231529a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7ca031baee6c09161c40e2b27231529a") : new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.CHINA).format(date2);
                    } else {
                        Object[] objArr6 = {date2};
                        ChangeQuickRedirect changeQuickRedirect6 = a.a;
                        format = PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "71da8b4b5f607b34a3a604c4e7e7d363", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "71da8b4b5f607b34a3a604c4e7e7d363") : new SimpleDateFormat("MM月dd日 HH:mm", Locale.CHINA).format(date2);
                    }
                }
            }
            textView.setText(format);
        }
        a2.a(4000).c();
        if (cVar != null) {
            cVar.a();
        }
        aVar.g = new a.b() { // from class: com.sankuai.waimai.imbase.push.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.window.a.b
            public final void a(com.sankuai.waimai.imbase.window.a aVar2) {
                Object[] objArr7 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b5868f3e6f3cd9339552dc0a0477ea2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b5868f3e6f3cd9339552dc0a0477ea2b");
                    return;
                }
                if (a.c.this != null) {
                    a.c.this.b();
                }
                com.sankuai.waimai.router.a.a(b2, uri.toString());
                aVar2.e();
            }
        };
    }

    public static void a(Context context, @NonNull Uri uri, @NonNull String str, int i) {
        Object[] objArr = {context, uri, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c61dd050f5babf83b0f21a4742030dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c61dd050f5babf83b0f21a4742030dd0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("im_type", Integer.valueOf(i));
        a(context, uri, str, hashMap);
    }

    public static void a(Context context, @NonNull Uri uri, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {context, uri, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dde995c1e23818a46ff7c056b147e4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dde995c1e23818a46ff7c056b147e4b1");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        com.sankuai.waimai.imbase.b.d().a(context, "", str, uri.toString(), 6, jSONObject);
    }
}
