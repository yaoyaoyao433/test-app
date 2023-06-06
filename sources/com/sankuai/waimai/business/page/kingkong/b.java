package com.sankuai.waimai.business.page.kingkong;

import android.support.constraint.R;
import android.util.LongSparseArray;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum b {
    FOOD(new long[]{910}, new long[]{910}, com.meituan.android.singleton.b.a.getString(R.string.wm_page_king_kong_food_title)),
    SELF_DELIVERY(new long[]{101712}, new long[]{224186}, com.meituan.android.singleton.b.a.getString(R.string.wm_page_king_kong_self_delivery_title)),
    TIAN_DIAN_YIN_PIN(com.sankuai.waimai.business.page.common.second.a.c, null, null),
    AFTERNOON_TEE(com.sankuai.waimai.business.page.common.second.a.d, null, null),
    WAN_CAN_YOU_XUAN(com.sankuai.waimai.business.page.common.second.a.e, null, null),
    HAN_BAO_PI_SA(new long[]{100062}, null, null),
    JIA_CHANG_CAI(com.sankuai.waimai.business.page.common.second.a.f, null, null),
    BAO_ZI_ZHOU_PU(com.sankuai.waimai.business.page.common.second.a.g, null, null),
    MEITUAN_DELIVERY(new long[]{960}, null, null);
    
    public static ChangeQuickRedirect a;
    private static LongSparseArray<b> k = new LongSparseArray<>();
    private static Map<Pair<Long, String>, b> l = new HashMap();
    private long[] m;
    private long[] n;
    private String o;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c8552005f45eea4095f8c9599367016", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c8552005f45eea4095f8c9599367016") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f3622490dfa3fabaa5e3701db5d8405", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f3622490dfa3fabaa5e3701db5d8405") : (b[]) values().clone();
    }

    static {
        b[] valuesCustom;
        for (b bVar : valuesCustom()) {
            for (long j : bVar.m) {
                k.put(j, bVar);
            }
            for (long j2 : bVar.n) {
                l.put(Pair.create(Long.valueOf(j2), bVar.o), bVar);
            }
        }
    }

    b(long[] jArr, long[] jArr2, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), jArr, jArr2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139dda7f7fdcbc1f4b0c14832928b6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139dda7f7fdcbc1f4b0c14832928b6b4");
            return;
        }
        this.m = jArr == null ? new long[0] : jArr;
        this.n = jArr2 == null ? new long[0] : jArr;
        this.o = str;
    }

    public static b a(KingkongInfo kingkongInfo) {
        Object[] objArr = {kingkongInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c280661c071b1d8235475ab7ec2f5e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c280661c071b1d8235475ab7ec2f5e0");
        }
        b bVar = k.get(kingkongInfo.b);
        return bVar == null ? l.get(Pair.create(Long.valueOf(kingkongInfo.b), kingkongInfo.c)) : bVar;
    }
}
