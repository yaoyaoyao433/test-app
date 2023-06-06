package com.meituan.android.paymentchannel;

import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.android.paymentchannel.payers.WechatPayer;
import com.meituan.android.paymentchannel.payers.d;
import com.meituan.android.paymentchannel.payers.e;
import com.meituan.android.paymentchannel.payers.f;
import com.meituan.android.paymentchannel.payers.g;
import com.meituan.android.paymentchannel.payers.h;
import com.meituan.android.paymentchannel.payers.i;
import com.meituan.android.paymentchannel.payers.j;
import com.meituan.android.paymentchannel.payers.k;
import com.meituan.android.paymentchannel.payers.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Map<String, Payer> b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("credit", new g());
        b.put("alipaywap", new com.meituan.android.paymentchannel.payers.a());
        b.put("alipaysimple", new com.meituan.android.paymentchannel.payers.b());
        b.put("wxpay", new WechatPayer());
        b.put("quickbank", new i());
        b.put("biztpay", new k());
        b.put("wxnppay", new l());
        b.put("valuecard", new d());
        b.put("privilegepay", new j());
        b.put("creditpay", new e());
        b.put("dcep", new f());
        b.put("meituanpay_component", new h());
        a("unionflashpay", b("unionflashpay"));
        a("upmppay", b("upmppay"));
        a("upsepay", b("upsepay"));
    }

    public static Payer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6c18bcac6f72db24a62f2e29b1630c4", RobustBitConfig.DEFAULT_VALUE) ? (Payer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6c18bcac6f72db24a62f2e29b1630c4") : b.get(str);
    }

    private static Payer b(String str) {
        List list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8410a6cd21c5a442fc2433c0d43945f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Payer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8410a6cd21c5a442fc2433c0d43945f");
        }
        ArrayList arrayList = new ArrayList();
        try {
            list = com.sankuai.meituan.serviceloader.b.a(Payer.class, str);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "getPayerByServiceLoader", (Map<String, Object>) null);
            list = arrayList;
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            return null;
        }
        return (Payer) list.get(0);
    }

    private static Map<String, Payer> a(String str, Payer payer) {
        Object[] objArr = {str, payer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3aee13b331033d65c45d9854b1aeda69", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3aee13b331033d65c45d9854b1aeda69");
        }
        if (payer != null) {
            b.put(str, payer);
        }
        return b;
    }
}
