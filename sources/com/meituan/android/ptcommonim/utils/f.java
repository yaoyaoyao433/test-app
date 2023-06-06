package com.meituan.android.ptcommonim.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.PTSessionFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Context context, @NonNull List<String> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9cd7128bc101a3d3ae26d3bd067dda4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9cd7128bc101a3d3ae26d3bd067dda4");
            return;
        }
        Map<String, Object> a2 = a(context);
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        a2.put("buttonNameList", sb);
        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_2v2sy456_mv", a2, "c_group_hjkzttqg");
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f47776d0fba1fbf6e038c74ebedd1e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f47776d0fba1fbf6e038c74ebedd1e9f");
            return;
        }
        Map<String, Object> a2 = a(context);
        a2.put("buttonNameList", z ? "表情,加号" : "语音,表情,加号");
        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_d8rr9nud_mv", a2, "c_group_hjkzttqg");
    }

    public static void a(Context context, @NonNull String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "678accea8bf32e4515258e527f94a7d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "678accea8bf32e4515258e527f94a7d3");
            return;
        }
        Map<String, Object> a2 = a(context);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb.append(strArr[0]);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        a2.put("buttonNameList", sb);
        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_z0omtkio_mv", a2, "c_group_hjkzttqg");
    }

    public static void a(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70d75992a9f9bf1cb7b7d002f45e48f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70d75992a9f9bf1cb7b7d002f45e48f8");
            return;
        }
        Map<String, Object> a2 = a(context);
        a2.put("button_name", str);
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_d8rr9nud_mc", a2, "c_group_hjkzttqg");
    }

    public static void a(Context context, CharSequence charSequence) {
        Object[] objArr = {context, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0395dbf4675c97d04597bd9afb0e0139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0395dbf4675c97d04597bd9afb0e0139");
            return;
        }
        Map<String, Object> a2 = a(context);
        a2.put("button_name", charSequence);
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_fp6mu65y_mc", a2, "c_group_hjkzttqg");
    }

    public static void a(Context context, String str, String str2, Map map) {
        Object[] objArr = {context, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b81fbad7a3242060669e2909c18fbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b81fbad7a3242060669e2909c18fbd2");
            return;
        }
        Map<String, Object> a2 = a(context);
        if (map != null) {
            a2.putAll(map);
        }
        Statistics.getChannel("group").writeModelView("pt_common_im_page", str, a2, str2);
    }

    public static void a(Context context, String str, String str2, Map map, Map map2) {
        Object[] objArr = {context, str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eba3fe1698719c765fa24f72447d21c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eba3fe1698719c765fa24f72447d21c1");
            return;
        }
        Map<String, Object> a2 = a(context);
        HashMap hashMap = new HashMap();
        hashMap.putAll(a2);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            map2.putAll(a2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("c_group_hjkzttqg", map2);
            Statistics.getChannel("group").updateTag("group", hashMap2);
        }
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", str, hashMap, str2);
    }

    public static void a(String str, String str2, Map map, Map map2) {
        Object[] objArr = {str, str2, map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4df92bba337a5f8aa6edd8770f086e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4df92bba337a5f8aa6edd8770f086e5b");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(hashMap);
        if (map != null && !map.isEmpty()) {
            hashMap2.putAll(map);
        }
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", str, hashMap2, str2);
    }

    public static void b(String str, String str2, Map map, Map map2) {
        Object[] objArr = {str, str2, map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aad61c574b0371d918a5867841dc32ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aad61c574b0371d918a5867841dc32ae");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(hashMap);
        if (map != null && !map.isEmpty()) {
            hashMap2.putAll(map);
        }
        Statistics.getChannel("group").writeModelView("pt_common_im_page", str, hashMap2, str2);
    }

    @NonNull
    public static Map<String, Object> a(Context context) {
        com.meituan.android.ptcommonim.model.b h;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        Map<String, Object> map = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3a6783524c0d8b02d5f7bf142862c62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3a6783524c0d8b02d5f7bf142862c62");
        }
        if (context != null) {
            SessionFragment a2 = com.sankuai.xm.imui.session.b.a(context);
            if ((a2 instanceof PTSessionFragment) && (h = ((PTSessionFragment) a2).h()) != null) {
                map = h.b();
            }
        }
        return map == null ? new HashMap() : map;
    }
}
