package com.sankuai.waimai.store.search.ui.result.mach;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SearchMachQaSp {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<NoxSpKey> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_nox_common");

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    enum NoxSpKey {
        SEARCH_COUPON_CARD_POPUP_DATE,
        SEARCH_FEEDBACK_TIPS_DATE,
        SEARCH_FEEDBACK_SURVEY_IDS,
        SEARCH_FEEDBACK_QUESTION_DATE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static NoxSpKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c89dbf55b5b907435b352e986c69afdb", RobustBitConfig.DEFAULT_VALUE) ? (NoxSpKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c89dbf55b5b907435b352e986c69afdb") : (NoxSpKey) Enum.valueOf(NoxSpKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static NoxSpKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a5b4386748a41ca14f4d36199eba099", RobustBitConfig.DEFAULT_VALUE) ? (NoxSpKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a5b4386748a41ca14f4d36199eba099") : (NoxSpKey[]) values().clone();
        }

        NoxSpKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf68a7045ac4adacbe3083e99a2e0d97", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf68a7045ac4adacbe3083e99a2e0d97");
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39a44800d7e1569894c381de3cda2ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39a44800d7e1569894c381de3cda2ed3");
            return;
        }
        Set<String> b2 = b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, (Set<String>) null);
        if (b2 == null) {
            b2 = new HashSet<>();
        }
        b2.add(str);
        b.a((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, b2);
    }

    public static Set<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33438b75037f9a4fa7c2ec2f23b84595", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33438b75037f9a4fa7c2ec2f23b84595") : b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_SURVEY_IDS, (Set<String>) null);
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8abafb0dbc365b501052de3c46a6e9d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8abafb0dbc365b501052de3c46a6e9d8");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_QUESTION_DATE, j);
        }
    }

    @Nullable
    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c384cfbe81f38de75412b886388762cc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c384cfbe81f38de75412b886388762cc")).longValue() : b.b((com.sankuai.waimai.foundation.utils.e<NoxSpKey>) NoxSpKey.SEARCH_FEEDBACK_QUESTION_DATE, 0L);
    }
}
