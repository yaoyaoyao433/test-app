package com.meituan.android.paybase.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.paybase.moduleinterface.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ae {
    public static ChangeQuickRedirect a = null;
    public static final String b = "c_pay_k446ypme";

    public static void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fece64ede898a511b8c617446e8fe869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fece64ede898a511b8c617446e8fe869");
        } else {
            x.a(str, hashMap);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942de42121176de30e0c4d26822d307d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942de42121176de30e0c4d26822d307d");
        } else {
            x.a(str);
        }
    }

    @Deprecated
    public static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "446de29f7172b161e9db4eacb522a6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "446de29f7172b161e9db4eacb522a6d8");
        } else {
            a(str, map, "", str2);
        }
    }

    @Deprecated
    public static void a(String str, Map<String, Object> map, String str2, String str3) {
        Object[] objArr = {str, map, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a287fc8ca07376e79d9239049cbd1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a287fc8ca07376e79d9239049cbd1ee");
        } else {
            a().writeSystemCheck(null, str, a(str3, map), str2);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, @NonNull String str3, String str4, boolean z) {
        Object[] objArr = {null, str2, map, str3, str4, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f32b7ad6545839ce1a9b660b5ade806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f32b7ad6545839ce1a9b660b5ade806");
            return;
        }
        a().writeSystemCheck(null, str2, a(str4, map), str3 == null ? b : str3);
        h.a(a.EnumC0334a.SC, str3, str2, map);
    }

    @Deprecated
    public static void a(String str, String str2, String str3, Map<String, Object> map, a aVar, int i, String str4) {
        Object[] objArr = {str, str2, str3, map, aVar, Integer.valueOf(i), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10921def77a7e9f02da33200867a51df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10921def77a7e9f02da33200867a51df");
            return;
        }
        HashMap<String, Object> b2 = b(str4, map);
        if (aVar == a.VIEW) {
            a().writeModelView((String) null, str2, b2, str);
        } else if (aVar == a.CLICK) {
            a().writeModelClick((String) null, str2, b2, str);
        } else {
            EventInfo a2 = a(str2, str3, b2);
            a2.index = String.valueOf(i);
            a2.val_cid = str;
            if (aVar == a.SLIDE) {
                a2.event_type = Constants.EventType.SLIDE;
            }
            a().writeEvent((String) null, a2);
        }
    }

    public static void a(String str, @NonNull String str2, String str3, String str4, Map<String, Object> map, a aVar, int i, String str5, boolean z) {
        HashMap<String, Object> b2;
        String str6 = str2;
        Object[] objArr = {str, str6, str3, str4, map, aVar, Integer.valueOf(i), str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eac54705ff7562c3a0448beba4208ccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eac54705ff7562c3a0448beba4208ccb");
            return;
        }
        if (z) {
            b2 = a(str5, map);
        } else {
            b2 = b(str5, map);
        }
        if (aVar == a.VIEW) {
            a().writeModelView(str, str3, b2, str6 == null ? b : str6);
            h.a(a.EnumC0334a.MV, str6, str3, map);
        } else if (aVar == a.CLICK) {
            a().writeModelClick(str, str3, b2, str6 == null ? b : str6);
            h.a(a.EnumC0334a.MC, str6, str3, map);
        } else if (aVar == a.EDIT) {
            Channel a2 = a();
            if (str6 == null) {
                str6 = b;
            }
            a2.writeModelEdit(str, str3, b2, str6);
        } else {
            EventInfo a3 = a(str3, str4, b2);
            a3.index = String.valueOf(i);
            if (str6 == null) {
                str6 = b;
            }
            a3.val_cid = str6;
            if (aVar == a.SLIDE) {
                a3.event_type = Constants.EventType.SLIDE;
            }
            a().writeEvent(str, a3);
        }
    }

    public static void a(@NonNull String str, String str2, String str3, Map<String, Object> map, a aVar, int i, String str4, boolean z) {
        Object[] objArr = {str, str2, str3, map, aVar, Integer.valueOf(i), str4, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7688dd4f4f317198e78adda78175939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7688dd4f4f317198e78adda78175939");
        } else {
            a(null, str, str2, str3, map, aVar, i, str4, true);
        }
    }

    public static Channel a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35cd968e2392ed689152ec7139dcb642", RobustBitConfig.DEFAULT_VALUE) ? (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35cd968e2392ed689152ec7139dcb642") : Statistics.getChannel(Constants.EventType.PAY);
    }

    private static EventInfo a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58b1bb0a4ae31a31e4eb68d8a50bf183", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58b1bb0a4ae31a31e4eb68d8a50bf183");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        if (!TextUtils.isEmpty(str)) {
            eventInfo.val_bid = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            eventInfo.val_act = str2;
        }
        if (map != null && map.size() > 0) {
            eventInfo.val_lab = map;
        }
        return eventInfo;
    }

    public static HashMap<String, Object> a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d9ff9ee703a9959e08cc03cddf7bbf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d9ff9ee703a9959e08cc03cddf7bbf1");
        }
        HashMap<String, Object> hashMap = (HashMap) x.b(str);
        if (!i.a(map)) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    private static HashMap<String, Object> b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d81598e3465236fa5de7df6d64efb16", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d81598e3465236fa5de7df6d64efb16");
        }
        HashMap<String, Object> hashMap = (HashMap) x.c(str);
        if (!i.a(map)) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static void a(String str, Map<String, Object> map, List<Float> list) {
        Object[] objArr = {str, map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e3cbc0d18c33012298978383c5d0732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e3cbc0d18c33012298978383c5d0732");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, "com.meituan.android.paybase.utils.StatisticsUtils");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        VIEW,
        CLICK,
        EDIT,
        SLIDE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100a5202f7df57e981a7572e4e212259", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100a5202f7df57e981a7572e4e212259");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f08571896ec84e86506ff2a44886701", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f08571896ec84e86506ff2a44886701") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03fa7a50a3f78130f5e2cf6fbe260cdd", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03fa7a50a3f78130f5e2cf6fbe260cdd") : (a[]) values().clone();
        }
    }
}
