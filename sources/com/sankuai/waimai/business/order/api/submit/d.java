package com.sankuai.waimai.business.order.api.submit;

import android.app.Activity;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    public transient Activity b;
    public transient com.sankuai.waimai.platform.domain.core.response.a c;
    public long d;
    public String e;
    public boolean f;
    public transient TextView g;
    public String h;
    public String i;
    public String j;
    public int k;
    public transient a.EnumC0947a l;
    public int m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public List<Map<String, Object>> u;
    public String v;
    public String w;
    public List<WmOrderedFood> x;

    public d() {
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9527dfdec17319b4c5eea7c43690f6da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9527dfdec17319b4c5eea7c43690f6da");
        }
        return "SubmitOrderParams{poiId=" + this.d + "poiIdStr=" + this.e + ", isSelfDelivery=" + this.f + ", txtSubmit=" + this.g + ", tag='" + this.h + "', poiName='" + this.i + "', pageFrom='" + this.j + "', requestCode=" + this.k + ", loginFrom=" + this.l + ", businessTypeFromRestaurant=" + this.m + ", isFromMTOtherChannel=" + this.n + ", sourceType=" + this.o + ", allowanceAllianceScenes='" + this.q + "', goodsCouponViewId='" + this.s + "', cartRecommendCouponInfo='" + this.t + "', couponViewId='" + this.w + "', commonParam='" + this.v + "'}";
    }

    public d(Activity activity, com.sankuai.waimai.platform.domain.core.response.a aVar, long j, String str, boolean z, TextView textView, String str2, String str3, String str4, int i, a.EnumC0947a enumC0947a, int i2, boolean z2, int i3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Map<String, Object>> list, List<WmOrderedFood> list2) {
        Object[] objArr = {activity, aVar, new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), textView, str2, str3, str4, Integer.valueOf(i), enumC0947a, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str5, str6, str7, str8, str9, str10, str11, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c57473caa488535fa79e6eed593f110", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c57473caa488535fa79e6eed593f110");
            return;
        }
        this.b = activity;
        this.c = aVar;
        this.d = j;
        this.e = str;
        this.f = z;
        this.g = textView;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i;
        this.l = enumC0947a;
        this.n = z2;
        this.m = i2;
        this.o = i3;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = str9;
        this.w = str10;
        this.v = str11;
        this.u = list;
        this.x = list2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Activity b;
        public com.sankuai.waimai.platform.domain.core.response.a c;
        public String d;
        public boolean e;
        public TextView f;
        public String g;
        public String h;
        public int i;
        public a.EnumC0947a j;
        public int k;
        public boolean l;
        public int m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;
        public List<Map<String, Object>> u;
        public List<WmOrderedFood> v;
        private long w;
        private String x;

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f10365ad9155d48e003cce7f2939ec8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f10365ad9155d48e003cce7f2939ec8");
            }
            this.w = j;
            return this;
        }

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f280d6fa32936178a952c45fca42723", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f280d6fa32936178a952c45fca42723") : new d(this.b, this.c, this.w, this.d, this.e, this.f, this.g, this.x, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
        }
    }
}
