package com.sankuai.waimai.bussiness.order.base.params;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CautionInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Activity b;
    public ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> c;
    public long d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String j;
    public long k;
    public String l;
    public String m;
    public List<String> n;
    public List<String> o;
    public List<CautionInfo> p;
    public List<String> q;
    public final String r;

    private a(Activity activity, ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList, long j, String str, String str2, String str3, int i, int i2, long j2, String str4, String str5, List<String> list, List<String> list2, List<CautionInfo> list3, List<String> list4, String str6, String str7) {
        Object[] objArr = {activity, arrayList, new Long(j), str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2), str4, str5, list, list2, list3, list4, str6, str7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf2f8007b4ba86433077a1ebb615324b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf2f8007b4ba86433077a1ebb615324b");
            return;
        }
        this.e = "";
        this.b = activity;
        this.c = arrayList;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.k = j2;
        this.l = str4;
        this.m = str5;
        this.n = list;
        this.p = list3;
        this.o = list2;
        this.q = list4;
        this.j = str6;
        this.r = str7;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.base.params.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0886a {
        public static ChangeQuickRedirect a;
        public Activity b;
        public ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> c;
        public String d;
        public String e;
        public String f;
        public int g;
        public int h;
        public String i;
        public String j;
        public List<String> k;
        public List<String> l;
        public List<CautionInfo> m;
        public List<String> n;
        public String o;
        public String p;
        private long q;
        private long r;

        public C0886a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0efbd749fed6a18c218ee6d2815a21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0efbd749fed6a18c218ee6d2815a21");
            } else {
                this.d = "";
            }
        }

        public final C0886a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230dede970eab9ac273489eb70d8d609", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0886a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230dede970eab9ac273489eb70d8d609");
            }
            this.q = j;
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2e369ae8e84b83950b3a6e867dbf4a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2e369ae8e84b83950b3a6e867dbf4a") : new a(this.b, this.c, this.q, this.d, this.e, this.f, this.g, this.h, this.r, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }
    }
}
