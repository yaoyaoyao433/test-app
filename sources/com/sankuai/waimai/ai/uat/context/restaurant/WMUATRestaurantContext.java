package com.sankuai.waimai.ai.uat.context.restaurant;

import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.ai.uat.context.home.a;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WMUATRestaurantContext extends com.sankuai.waimai.ai.uat.context.a {
    public static ChangeQuickRedirect f;
    public String g;
    public List<String> h;
    public boolean i;
    public List<String> j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public List<Long> p;
    public List<String> q;
    public List<String> r;
    public boolean s;
    public int t;
    public String u;
    public int v;
    public Map<Integer, Map<String, Float>> w;
    public boolean x;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PoiCommentType {
        public static final int COMMENT_TYPE_ADD_COMMENT = 4;
        public static final int COMMENT_TYPE_ALL = 0;
        public static final int COMMENT_TYPE_BAD = 3;
        public static final int COMMENT_TYPE_DIANPING = 21;
        public static final int COMMENT_TYPE_FRIEND = 6;
        public static final int COMMENT_TYPE_GOOD = 1;
        public static final int COMMENT_TYPE_HAS_IMG = 5;
        public static final int COMMENT_TYPE_MINE = 7;
        public static final int COMMENT_TYPE_NEUTRAL = 2;
        public static final int COMMENT_TYPE_NONE = -1;
        public static final int COMMENT_TYPE_TAG_ALL = 22;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public float b;
    }

    public WMUATRestaurantContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2508a8a8a05bd2842cde16e8395962", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2508a8a8a05bd2842cde16e8395962");
            return;
        }
        this.h = new ArrayList();
        this.j = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = false;
        this.v = 0;
        this.w = new HashMap();
        this.x = false;
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfd15bc7b264d9bdfab5d7cc59fd601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfd15bc7b264d9bdfab5d7cc59fd601");
        } else if (obj instanceof Poi) {
            this.g = ((Poi) obj).getPoiIDStr();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c6780db49bf55450827368eac0ddfab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c6780db49bf55450827368eac0ddfab");
            } else if (this.b - a.C0685a.a().d < PayTask.j) {
                String str = a.C0685a.a().c;
                if (TextUtils.isEmpty(this.g) || !this.g.equals(str)) {
                    return;
                }
                this.u = a.C0685a.a().b;
            }
        }
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final a.EnumC0684a a() {
        return a.EnumC0684a.WMUATContextRestaurant;
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(String str, Object obj) {
        char c = 2;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64fdb33bb0bf9e3c31ea537d4f014244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64fdb33bb0bf9e3c31ea537d4f014244");
            return;
        }
        try {
            switch (str.hashCode()) {
                case -1993807951:
                    if (str.equals("spu_ids")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1816024757:
                    if (str.equals("CONNECT_SHOP_KEY")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1683779041:
                    if (str.equals("BUY_COUPON_KEY")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1560321146:
                    if (str.equals("TAB_SELECT_KEY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1377969571:
                    if (str.equals("CATEGORY_SELECT_KEY")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -616217526:
                    if (str.equals("DISCOUNT_DETAIL_EXPAND_KEY")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -513354376:
                    if (str.equals("GOODS_ADD_KEY")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -162537649:
                    if (str.equals("GET_COUPON_KEY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 360282554:
                    if (str.equals("COMMENT_TYPE_KEY")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1160898791:
                    if (str.equals("GOODS_ITEM_EXPOSE_KEY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1313667306:
                    if (str.equals("SHOP_COLLECT_CLICK_KEY")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1357243890:
                    if (str.equals("COMMENT_DETAIL_EXPOSE_KEY")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1582277904:
                    if (str.equals("RICHNESS_DEGREE_UPDATE_KEY")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1664791586:
                    if (str.equals("EXCHANGE_RED_PACKED_KEY")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1667021087:
                    if (str.equals("GOODS_CLICK_KEY")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = f;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b21aa9c88f7aa3f8f126ddcb3d76b30d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b21aa9c88f7aa3f8f126ddcb3d76b30d");
                        return;
                    } else if (obj instanceof List) {
                        this.h.clear();
                        List list = (List) obj;
                        int i = 0;
                        for (int i2 = 0; i2 < list.size() && i < 20; i2++) {
                            if (list.get(i2) instanceof String) {
                                this.h.add((String) list.get(i2));
                                i++;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                case 1:
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = f;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f10fda122ad2e5cfbcbc82c3042585e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f10fda122ad2e5cfbcbc82c3042585e");
                        return;
                    } else if (obj instanceof Integer) {
                        switch (((Integer) obj).intValue()) {
                            case 0:
                                return;
                            case 1:
                                this.k = true;
                                return;
                            case 2:
                                this.l = true;
                                return;
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
                case 2:
                    Object[] objArr4 = {obj};
                    ChangeQuickRedirect changeQuickRedirect4 = f;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8b8b52ba314a1a036f8a05cb35b3c34d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8b8b52ba314a1a036f8a05cb35b3c34d");
                        return;
                    } else if (obj instanceof String) {
                        this.j.add((String) obj);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    Object[] objArr5 = {obj};
                    ChangeQuickRedirect changeQuickRedirect5 = f;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "def4d8e48b7107fbb40ffc0cdb118d8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "def4d8e48b7107fbb40ffc0cdb118d8d");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.i = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                case 4:
                    Object[] objArr6 = {obj};
                    ChangeQuickRedirect changeQuickRedirect6 = f;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "137fe3b2454f36338c5a0f006fc8c7e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "137fe3b2454f36338c5a0f006fc8c7e3");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.m = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                case 5:
                    Object[] objArr7 = {obj};
                    ChangeQuickRedirect changeQuickRedirect7 = f;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1a1198479114eb997a5c62a104cd719b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1a1198479114eb997a5c62a104cd719b");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.n = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                case 6:
                    Object[] objArr8 = {obj};
                    ChangeQuickRedirect changeQuickRedirect8 = f;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2fe384c9855d5a72f011cafb59998d0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2fe384c9855d5a72f011cafb59998d0d");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.o = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                case 7:
                    Object[] objArr9 = {obj};
                    ChangeQuickRedirect changeQuickRedirect9 = f;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "bf6af02402c7e51d7f1a6907b87dac4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "bf6af02402c7e51d7f1a6907b87dac4b");
                        return;
                    } else if (obj instanceof Long) {
                        this.p.add(Long.valueOf(((Long) obj).longValue()));
                        return;
                    } else {
                        return;
                    }
                case '\b':
                    Object[] objArr10 = {obj};
                    ChangeQuickRedirect changeQuickRedirect10 = f;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "5034587b0654b107686b0d9096c43706", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "5034587b0654b107686b0d9096c43706");
                        return;
                    } else if (obj instanceof Long) {
                        List<String> list2 = this.q;
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        list2.add(sb.toString());
                        return;
                    } else {
                        return;
                    }
                case '\t':
                    Object[] objArr11 = {obj};
                    ChangeQuickRedirect changeQuickRedirect11 = f;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "59ebd9bc5f7ed276df5b707d7ab54630", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "59ebd9bc5f7ed276df5b707d7ab54630");
                        return;
                    } else if (obj instanceof Long) {
                        List<String> list3 = this.r;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj);
                        list3.add(sb2.toString());
                        return;
                    } else {
                        return;
                    }
                case '\n':
                    Object[] objArr12 = {obj};
                    ChangeQuickRedirect changeQuickRedirect12 = f;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "f8a32f9251b8e2388428dcb2b7829abb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "f8a32f9251b8e2388428dcb2b7829abb");
                        return;
                    } else if (obj instanceof Integer) {
                        this.v = ((Integer) obj).intValue();
                        return;
                    } else {
                        return;
                    }
                case 11:
                    Object[] objArr13 = {obj};
                    ChangeQuickRedirect changeQuickRedirect13 = f;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "ecc09c0b31a6b3f9ff03864014cad8f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "ecc09c0b31a6b3f9ff03864014cad8f3");
                        return;
                    } else if (obj instanceof a) {
                        a aVar = (a) obj;
                        Map<String, Float> map = this.w.get(Integer.valueOf(this.v));
                        if (map == null) {
                            map = new HashMap<>();
                            this.w.put(Integer.valueOf(this.v), map);
                        }
                        map.put(aVar.a, Float.valueOf(aVar.b));
                        return;
                    } else {
                        return;
                    }
                case '\f':
                    Object[] objArr14 = {obj};
                    ChangeQuickRedirect changeQuickRedirect14 = f;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "9e8cbc3dd0d599cb92cb1843dc15523d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "9e8cbc3dd0d599cb92cb1843dc15523d");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.s = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                case '\r':
                    Object[] objArr15 = {obj};
                    ChangeQuickRedirect changeQuickRedirect15 = f;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "81a61c5b0c3afd0c5a89e98b904a5da5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "81a61c5b0c3afd0c5a89e98b904a5da5");
                        return;
                    } else if (obj instanceof Integer) {
                        this.t = ((Integer) obj).intValue();
                        return;
                    } else {
                        return;
                    }
                case 14:
                    Object[] objArr16 = {obj};
                    ChangeQuickRedirect changeQuickRedirect16 = f;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "38624a436f5e4ccb4e6b64a768ddbfaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "38624a436f5e4ccb4e6b64a768ddbfaf");
                        return;
                    } else if (obj instanceof Boolean) {
                        this.x = ((Boolean) obj).booleanValue();
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception unused) {
        }
    }
}
