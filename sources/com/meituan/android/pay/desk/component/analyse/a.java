package com.meituan.android.pay.desk.component.analyse;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.payment.utils.b;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.cat.CatCustomInfo;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    public static String a(Context context, c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d980a3e4e218fdfc203897632a26d9d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d980a3e4e218fdfc203897632a26d9d9");
        }
        if (context instanceof FragmentActivity) {
            Fragment findFragmentById = ((FragmentActivity) context).getSupportFragmentManager().findFragmentById(R.id.content);
            return ((cVar instanceof CashDesk) && (findFragmentById instanceof PayBaseFragment)) ? ((PayBaseFragment) findFragmentById).d() : "";
        }
        return "";
    }

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56f5a717ff9d8ea2110d6460827e9d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56f5a717ff9d8ea2110d6460827e9d7d");
        }
        String b2 = b.b(activity, "pay_type");
        String b3 = b.b(activity, "combine_type");
        if (TextUtils.isEmpty(b3)) {
            if (TextUtils.isEmpty(b2)) {
                b2 = "";
            }
            return b2;
        }
        return b3;
    }

    public static JsonObject a(List<? extends Label> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        JsonObject jsonObject = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9b21f50d6ea9def3d3ef5862c8128a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9b21f50d6ea9def3d3ef5862c8128a6");
        }
        if (!i.a((Collection) list)) {
            jsonObject = new JsonObject();
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2) != null) {
                    jsonObject.addProperty("activity_id", list.get(i2).getLabelId());
                    jsonObject.addProperty("activity_tip", list.get(i2).getContent());
                    jsonObject.addProperty("activity_type", Integer.valueOf(list.get(i2).getType()));
                    jsonObject.addProperty("position", Integer.valueOf(i));
                }
            }
        }
        return jsonObject;
    }

    public static void a(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4831b0b1f8cbc45ca98d56f97fd19303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4831b0b1f8cbc45ca98d56f97fd19303");
        } else {
            com.meituan.android.pay.common.analyse.b.a("b_pay_sipftpkx_mv", new a.c().a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).a("pay_type", a(activity)).a("verify_type", Integer.valueOf(i)).b, str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "134fb3815a75cef45a8fd2ea625924c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "134fb3815a75cef45a8fd2ea625924c0");
            return;
        }
        CatCustomInfo catCustomInfo = new CatCustomInfo();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(1.0f));
        HashMap hashMap = new HashMap();
        hashMap.put("mtpay_scene", str2);
        catCustomInfo.setCustomCommandTagDic(hashMap);
        catCustomInfo.setCustomCommand(str);
        catCustomInfo.setCustomCommandDurationArray(arrayList);
        com.meituan.android.paybase.common.analyse.cat.a.b(catCustomInfo);
    }

    public static HashMap<String, Object> b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "127af9f067fd4f986c0c160b310de7f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "127af9f067fd4f986c0c160b310de7f9");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("cc_pay_type", a(activity));
        hashMap.put("cc_verify_type", 1);
        return hashMap;
    }

    public static HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7216a2b934c95bee60f98c48f22f4461", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7216a2b934c95bee60f98c48f22f4461") : new a.c().a("userid", com.meituan.android.paybase.config.a.d().i()).a("orderid", com.meituan.android.paybase.common.analyse.b.b).b;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c41c48c39502c649b162f73d4e112ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c41c48c39502c649b162f73d4e112ba5");
        } else if (b) {
            a("paybiz_cashdesk_show", com.meituan.android.pay.common.analyse.a.b);
            b = false;
        }
    }

    public static void c() {
        b = true;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5601a906778e2778dc85a23a7e918060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5601a906778e2778dc85a23a7e918060");
            return;
        }
        com.meituan.android.pay.common.analyse.b.a("c_pay_uk88e8gh", "b_pay_hybrid_mt_pay_succ_sc", (Map<String, Object>) null, str);
        com.meituan.android.pay.common.analyse.b.a("hybrid_mt_pay_succ", (Map<String, Object>) null, (List<Float>) null, str);
    }

    public static void b(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46f3d33648bf87951bc98b22012f86fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46f3d33648bf87951bc98b22012f86fb");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("verify_type", Integer.valueOf(i)).a("pay_type", b.b(activity, "pay_type")).a("mtpay_scene", "1").b;
        com.meituan.android.pay.common.analyse.b.b("b_pay_standard_cashier_mt_pay_verify_sc", hashMap, str);
        com.meituan.android.pay.common.analyse.b.a("standard_cashier_mt_pay_verify", hashMap, (List<Float>) null, str);
    }

    public static void c(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a2e7a857c2043426b6b13330444cb55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a2e7a857c2043426b6b13330444cb55");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("verify_type", Integer.valueOf(i)).a("pay_type", b.b(activity, "pay_type")).a("mtpay_scene", "1").b;
        com.meituan.android.pay.common.analyse.b.b("b_pay_standard_cashier_mt_pay_verify_succ_sc", hashMap, str);
        com.meituan.android.pay.common.analyse.b.a("standard_cashier_mt_pay_verify_succ", hashMap, (List<Float>) null, str);
    }

    public static void d(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3be504b2101dd73d175e5cb587f1edff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3be504b2101dd73d175e5cb587f1edff");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("verify_type", Integer.valueOf(i)).a("pay_type", b.b(activity, "pay_type")).a("mtpay_scene", "1").b;
        com.meituan.android.pay.common.analyse.b.b("b_pay_standard_cashier_mt_pay_verify_fail_sc", hashMap, str);
        com.meituan.android.pay.common.analyse.b.a("b_pay_standard_cashier_mt_pay_verify_fail_sc", hashMap, (List<Float>) null, str);
    }
}
