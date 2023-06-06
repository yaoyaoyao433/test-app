package com.sankuai.waimai.business.search.common.util;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class NoxSp {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<NoxSpKey> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_nox_common");

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    enum NoxSpKey {
        SEARCH_COUPON_CARD_POPUP_DATE,
        SEARCH_FEEDBACK_TIPS_DATE,
        SEARCH_FEEDBACK_SURVEY_IDS,
        SEARCH_FEEDBACK_QUESTION_DATE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static NoxSpKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1028e1faf97b39d5216d3510f95cfb8d", RobustBitConfig.DEFAULT_VALUE) ? (NoxSpKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1028e1faf97b39d5216d3510f95cfb8d") : (NoxSpKey) Enum.valueOf(NoxSpKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static NoxSpKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "046a20e62f6419d36ce8366c443b3b19", RobustBitConfig.DEFAULT_VALUE) ? (NoxSpKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "046a20e62f6419d36ce8366c443b3b19") : (NoxSpKey[]) values().clone();
        }

        NoxSpKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d33be2663bb238f19398438f6a3db449", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d33be2663bb238f19398438f6a3db449");
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59b411ab4351017a4e119c8a8c2fecfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59b411ab4351017a4e119c8a8c2fecfe");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_TIPS_DATE, str);
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5641322763232a207d75ef7d98877330", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5641322763232a207d75ef7d98877330") : b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_TIPS_DATE, "");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb6ab8d52b396f9636ced7da30006533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb6ab8d52b396f9636ced7da30006533");
            return;
        }
        Set<String> b2 = b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, (Set<String>) null);
        if (b2 == null) {
            b2 = new HashSet<>();
        }
        b2.add(str);
        b.a((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, b2);
    }

    public static Set<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "239914cc7504563e16e7d5595567a195", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "239914cc7504563e16e7d5595567a195") : b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, (Set<String>) null);
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1875c687e687db8e74cea3ceba4707a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1875c687e687db8e74cea3ceba4707a7");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_QUESTION_DATE, j);
        }
    }

    @Nullable
    public static long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd539948ddae2cf831585e99189c1526", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd539948ddae2cf831585e99189c1526")).longValue() : b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_QUESTION_DATE, 0L);
    }
}
