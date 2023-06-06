package com.sankuai.waimai.foundation.core.service.order;

import android.app.Activity;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    public Activity b;
    public long c;
    public String d;
    public boolean e;
    public TextView f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public String n;
    public String o;
    public List<WmOrderedFood> p;
    private a.EnumC0947a q;

    private d(Activity activity, long j, String str, boolean z, TextView textView, String str2, String str3, String str4, int i, a.EnumC0947a enumC0947a, int i2, boolean z2, int i3, String str5, String str6, List<WmOrderedFood> list) {
        Object[] objArr = {activity, new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), textView, str2, str3, str4, Integer.valueOf(i), enumC0947a, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str5, str6, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e688dbff0f6d56f0790fb420d6bd2cef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e688dbff0f6d56f0790fb420d6bd2cef");
            return;
        }
        this.b = activity;
        this.c = j;
        this.d = str;
        this.e = z;
        this.f = textView;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.q = enumC0947a;
        this.l = z2;
        this.k = i2;
        this.m = i3;
        this.n = str5;
        this.o = str6;
        this.p = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Activity b;
        public String c;
        public boolean d;
        public TextView e;
        public String f;
        public String g;
        public int h;
        public int i;
        public boolean j;
        public int k;
        public String l;
        public String m;
        public List<WmOrderedFood> n;
        private long o;
        private String p;
        private a.EnumC0947a q;

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a94162503596ae694f2e791d0471a7a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a94162503596ae694f2e791d0471a7a");
            }
            this.o = j;
            return this;
        }

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d77f1e4266d8dc849525959274ae69c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d77f1e4266d8dc849525959274ae69c") : new d(this.b, this.o, this.c, this.d, this.e, this.f, this.p, this.g, this.h, this.q, 0, this.j, this.k, this.l, this.m, this.n);
        }

        public final d b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36d475b47203ed617b81b4edef5f886", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36d475b47203ed617b81b4edef5f886") : new d(this.b, this.o, this.c, this.d, this.e, this.f, this.p, this.g, this.h, this.q, this.i, this.j, this.k, this.l, this.m, this.n);
        }
    }
}
