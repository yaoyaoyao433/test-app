package com.meituan.android.customerservice.callbase.state;

import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bc2fa77ee6e67a3073a0abb72b4358e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bc2fa77ee6e67a3073a0abb72b4358e")).intValue();
        }
        return ((i2 == 101 || i2 == 302) ? 60 : i2 != 304 ? i2 != 401 ? 10 : 30 : 15) * 1000;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.callbase.state.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0238a {
        public int a;

        public C0238a(int i) {
            this.a = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class p extends C0238a {
        public short b;
        public String c;
        public String d;
        public byte e;

        public p() {
            super(202);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends C0238a {
        public short b;
        public String c;
        public String d;
        public String e;

        public b() {
            super(TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class m extends C0238a {
        public ArrayList<com.meituan.android.customerservice.callbase.base.f> b;
        public HashSet<com.meituan.android.customerservice.callbase.base.f> c;
        public int d;
        public HashSet<com.meituan.android.customerservice.callbase.base.f> e;
        public long f;
        public String g;
        public String h;
        public long i;
        public byte j;
        public byte k;
        public String l;
        public String m;
        public String n;
        public HashMap<String, String> o;
        public long p;

        public m() {
            super(301);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class o extends C0238a {
        public byte b;

        public o() {
            super(303);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class f extends C0238a {
        public String b;
        public String c;
        public String d;
        public byte e;
        public long f;
        public String g;
        public short h;
        public short i;
        public String j;
        public HashMap<String, String> k;

        public f() {
            super(401);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d extends C0238a {
        public MeetingStatusItems[] b;
        public long c;
        public String d;
        public String e;
        public HashMap<String, String> f;

        public d() {
            super(403);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends C0238a {
        public short b;
        public String c;
        public String d;
        public String e;

        public e() {
            super(404);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class l extends C0238a {
        public String b;
        public String c;

        public l() {
            super(103);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class i extends C0238a {
        public MeetingStatusItems[] b;
        public String c;
        public long d;
        public byte e;
        public byte f;
        public String g;
        public String h;
        public String i;
        public String j;
        public short k;
        public long l;
        public HashMap<String, String> m;

        public i() {
            super(102);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class k extends C0238a {
        public String b;
        public String c;
        public String d;
        public String e;

        public k() {
            super(107);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class g extends C0238a {
        public short b;
        public String c;
        public String d;
        public String e;
        public HashSet<com.meituan.android.customerservice.callbase.base.f> f;

        public g() {
            super(402);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class j extends C0238a {
        public short b;
        public String c;
        public String d;
        public String e;
        public String f;
        public long g;
        public String h;

        public j() {
            super(104);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends C0238a {
        public String b;
        public String c;
        public String d;

        public c() {
            super(105);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class h extends C0238a {
        public String b;
        public String c;
        public String d;
        public short e;

        public h() {
            super(106);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class n extends C0238a {
        public short b;
        public String c;
        public Boolean d;

        public n() {
            super(1004);
        }
    }
}
