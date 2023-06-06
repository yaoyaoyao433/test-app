package com.meituan.android.paybase.common.analyse.cat;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.codelog.b;
import com.dianping.monitor.impl.m;
import com.meituan.android.paybase.utils.h;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36982f92011287a8d4ddd216b54249ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36982f92011287a8d4ddd216b54249ab");
        } else {
            com.meituan.android.paybase.config.a.d().a(0L, str, 0, 0, i, 0, 0, 0, null);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "990df85427815969d4d10378d082c932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "990df85427815969d4d10378d082c932");
        } else {
            b.b(a.class, str, str2);
        }
    }

    @Deprecated
    public static void a(CatCustomInfo catCustomInfo) {
        Object[] objArr = {catCustomInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "997c2a0819c66e048029babc82fe21e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "997c2a0819c66e048029babc82fe21e3");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(catCustomInfo.getCustomCommand()) && catCustomInfo.getCustomCommandDurationArray() != null) {
            hashMap.put(catCustomInfo.getCustomCommand(), catCustomInfo.getCustomCommandDurationArray());
        }
        if (!i.a(catCustomInfo.getCustomCommandTagDic())) {
            hashMap2.putAll(catCustomInfo.getCustomCommandTagDic());
        }
        hashMap2.put("app", com.meituan.android.paybase.config.a.d().k());
        hashMap2.put("appversion", com.meituan.android.paybase.config.a.d().l());
        hashMap2.put("platform", "Android");
        hashMap2.put("osversion", com.meituan.android.paybase.config.a.d().e());
        a(26, hashMap, hashMap2);
    }

    @Deprecated
    public static void b(CatCustomInfo catCustomInfo) {
        Object[] objArr = {catCustomInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e6f765a5951307068c3d61c51c3b97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e6f765a5951307068c3d61c51c3b97e");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(catCustomInfo.getCustomCommand()) && catCustomInfo.getCustomCommandDurationArray() != null) {
            hashMap.put(catCustomInfo.getCustomCommand(), catCustomInfo.getCustomCommandDurationArray());
        }
        if (!i.a(catCustomInfo.getCustomCommandTagDic())) {
            hashMap2.putAll(catCustomInfo.getCustomCommandTagDic());
        }
        hashMap2.put("app_name", com.meituan.android.paybase.config.a.d().k());
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.paybase.config.a.d().l());
        hashMap2.put("nb_platform", com.meituan.android.paybase.config.a.d().d());
        hashMap2.put("os_version", com.meituan.android.paybase.config.a.d().e());
        hashMap2.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        a(26, hashMap, hashMap2);
    }

    private static void a(int i, Map<String, List<Float>> map, Map<String, String> map2) {
        Object[] objArr = {26, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e453817c88262cff90086790f18cc17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e453817c88262cff90086790f18cc17");
            return;
        }
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        if (a2 != null) {
            m mVar = new m(26, a2);
            if (!i.a(map)) {
                for (Map.Entry<String, List<Float>> entry : map.entrySet()) {
                    if (!i.a((Collection) entry.getValue())) {
                        mVar.a(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (!i.a(map2)) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    mVar.a(entry2.getKey(), entry2.getValue());
                }
            }
            mVar.a();
        }
    }

    public static void a(String str, Map<String, Object> map, List<Float> list, String str2) {
        Object[] objArr = {str, map, list, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30fa00b8ebb0402b2f4fdff45a637a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30fa00b8ebb0402b2f4fdff45a637a1d");
        } else if (!TextUtils.isEmpty(str)) {
            if (list == null) {
                list = Collections.singletonList(Float.valueOf(1.0f));
            }
            Map<String, Object> d = x.d(str2);
            if (!i.a(map)) {
                d.putAll(map);
            }
            Context a2 = com.meituan.android.paybase.config.a.d().a();
            if (a2 != null) {
                m mVar = new m(26, a2);
                mVar.a(str, list);
                for (Map.Entry<String, Object> entry : d.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        mVar.a(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                mVar.a();
                h.a(str, map);
            }
        }
    }
}
