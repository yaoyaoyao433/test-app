package com.sankuai.waimai.landing;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public EnumC0984a e;
    public int f;
    public long g;
    public long h;
    public boolean i;
    public String j;

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a6c462bdc5e533846684cc13311873", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a6c462bdc5e533846684cc13311873")).booleanValue();
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return TextUtils.equals(aVar.b, this.b) && TextUtils.equals(aVar.c, this.c);
        }
        return false;
    }

    public final EnumC0984a a() {
        if (this.e != null) {
            return this.e;
        }
        return EnumC0984a.UNKNOWN;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd031102b281c2e499b6fe9de5b7a51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd031102b281c2e499b6fe9de5b7a51");
        } else {
            this.g = j;
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ec8e7436abf69f71ef77fbd158eccc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ec8e7436abf69f71ef77fbd158eccc") : TextUtils.isEmpty(this.j) ? "no_path" : this.j;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1c7172bed148b767abe20e35c58c4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1c7172bed148b767abe20e35c58c4b");
        }
        return "LandingData{slot='" + this.b + "', channel='" + this.c + "', apiName='" + this.d + "', pageType=" + this.e + ", errorCode=" + this.f + ", clickTime=" + this.g + ", elapsedTime=" + this.h + ", rejectOther=" + this.i + '}';
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5862ed01a3911f3888211ed3cc4248b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5862ed01a3911f3888211ed3cc4248b")).booleanValue() : (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) ? false : true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.landing.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0984a {
        H5,
        MRN,
        MMP,
        Native,
        UNKNOWN;
        
        public static ChangeQuickRedirect a;

        EnumC0984a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a301f0ffcbc94c8c1493d5b22d1e6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a301f0ffcbc94c8c1493d5b22d1e6c");
            }
        }

        public static EnumC0984a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2e3fabea79bd3afc0bbda690c9906be", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0984a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2e3fabea79bd3afc0bbda690c9906be") : (EnumC0984a) Enum.valueOf(EnumC0984a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0984a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6d140f8dc8d4db6f170a01c4464a4be", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0984a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6d140f8dc8d4db6f170a01c4464a4be") : (EnumC0984a[]) values().clone();
        }
    }
}
