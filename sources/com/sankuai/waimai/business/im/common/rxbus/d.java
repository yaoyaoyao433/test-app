package com.sankuai.waimai.business.im.common.rxbus;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final HashMap<Integer, Integer> b;
    private static final HashMap<Integer, String> c;
    private static final HashMap<Integer, Integer> d;

    static {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(Integer.valueOf(c.b), 112);
        b.put(Integer.valueOf(c.c), 114);
        b.put(Integer.valueOf(c.a), 116);
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        c = hashMap2;
        hashMap2.put(Integer.valueOf(c.b), "b_waimai_ttdn141h_mc");
        c.put(Integer.valueOf(c.c), "b_waimai_jhlfbq5r_mc");
        c.put(Integer.valueOf(c.a), "b_waimai_l020kwq3_mc");
        HashMap<Integer, Integer> hashMap3 = new HashMap<>();
        d = hashMap3;
        hashMap3.put(112, 1);
        d.put(114, 2);
        d.put(116, 3);
        d.put(117, 1);
        d.put(118, 3);
    }

    public static void a(Activity activity, Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c5d87a17f08cfb357a4e0ce188a48be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c5d87a17f08cfb357a4e0ce188a48be");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, a(activity, "imAddressLocation", "imSendAddress", map), new Bundle(), 118);
        }
    }

    public static void b(Activity activity, Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e04f66421f2e2a2e40367e90d6199f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e04f66421f2e2a2e40367e90d6199f89");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, a(activity, "imAddressModify", "imChangeAddress", map), new Bundle(), 117);
        }
    }

    public static String a(Context context, String str, String str2, Map<String, Object> map) {
        HashMap hashMap;
        Object[] objArr = {context, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2299e3dfbb11d0745940b8829c889609", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2299e3dfbb11d0745940b8829c889609");
        }
        String str3 = com.sankuai.waimai.foundation.core.a.d() ? com.sankuai.waimai.foundation.router.interfaces.b.c : "imeituan://www.meituan.com";
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.im.common.a.a;
        Map<String, String> b2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4d7259ea9ac4b0eec439c1359e00a3d7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4d7259ea9ac4b0eec439c1359e00a3d7") : e.b();
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.common.a.a;
        Map<String, String> g = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "715285e76c10e1b4da4b545ae58ed523", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "715285e76c10e1b4da4b545ae58ed523") : com.sankuai.waimai.platform.net.c.a().g();
        Map<String, String> b3 = com.sankuai.waimai.router.set_id.b.a().b();
        if (b2 != null) {
            b2.putAll(g);
            b2.putAll(b3);
            hashMap = b2;
        } else {
            hashMap = new HashMap();
        }
        JSONObject a2 = com.sankuai.waimai.imbase.utils.a.a(map);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, a2);
            return com.sankuai.waimai.addrsdk.manager.a.a().a(str, "", str3, "", hashMap, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[Catch: Exception -> 0x0243, LOOP:0: B:61:0x01b3->B:63:0x01b9, LOOP_END, TryCatch #1 {Exception -> 0x0243, blocks: (B:28:0x0087, B:29:0x008d, B:30:0x0090, B:31:0x0095, B:33:0x009b, B:35:0x009f, B:37:0x00fd, B:41:0x0120, B:43:0x0133, B:45:0x0137, B:47:0x0159, B:50:0x0161, B:52:0x0168, B:55:0x018e, B:57:0x0195, B:59:0x019b, B:60:0x019e, B:61:0x01b3, B:63:0x01b9, B:65:0x01c7, B:67:0x01cb, B:69:0x01da, B:70:0x01ee, B:72:0x01f4, B:73:0x01fe, B:75:0x020c, B:76:0x0210, B:80:0x0233, B:53:0x0178, B:54:0x0183, B:39:0x010a, B:40:0x0116), top: B:90:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7 A[Catch: Exception -> 0x0243, TryCatch #1 {Exception -> 0x0243, blocks: (B:28:0x0087, B:29:0x008d, B:30:0x0090, B:31:0x0095, B:33:0x009b, B:35:0x009f, B:37:0x00fd, B:41:0x0120, B:43:0x0133, B:45:0x0137, B:47:0x0159, B:50:0x0161, B:52:0x0168, B:55:0x018e, B:57:0x0195, B:59:0x019b, B:60:0x019e, B:61:0x01b3, B:63:0x01b9, B:65:0x01c7, B:67:0x01cb, B:69:0x01da, B:70:0x01ee, B:72:0x01f4, B:73:0x01fe, B:75:0x020c, B:76:0x0210, B:80:0x0233, B:53:0x0178, B:54:0x0183, B:39:0x010a, B:40:0x0116), top: B:90:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb A[Catch: Exception -> 0x0243, TryCatch #1 {Exception -> 0x0243, blocks: (B:28:0x0087, B:29:0x008d, B:30:0x0090, B:31:0x0095, B:33:0x009b, B:35:0x009f, B:37:0x00fd, B:41:0x0120, B:43:0x0133, B:45:0x0137, B:47:0x0159, B:50:0x0161, B:52:0x0168, B:55:0x018e, B:57:0x0195, B:59:0x019b, B:60:0x019e, B:61:0x01b3, B:63:0x01b9, B:65:0x01c7, B:67:0x01cb, B:69:0x01da, B:70:0x01ee, B:72:0x01f4, B:73:0x01fe, B:75:0x020c, B:76:0x0210, B:80:0x0233, B:53:0x0178, B:54:0x0183, B:39:0x010a, B:40:0x0116), top: B:90:0x0087 }] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.app.Activity r19, int r20, int r21, android.content.Intent r22, java.lang.String r23, int r24, final com.sankuai.xm.im.f<com.sankuai.xm.im.message.bean.IMMessage> r25) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.common.rxbus.d.a(android.app.Activity, int, int, android.content.Intent, java.lang.String, int, com.sankuai.xm.im.f):void");
    }
}
