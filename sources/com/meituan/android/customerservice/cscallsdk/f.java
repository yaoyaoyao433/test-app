package com.meituan.android.customerservice.cscallsdk;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public long b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends a {
        public Set<d> c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends a {
        public Set<e> c;
    }

    void a(b bVar);

    void a(c cVar);

    void b(b bVar);

    void b(c cVar);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public short c;
        public short d;
        public byte e;
        private int f;

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb20c204a86794284f71413fbf84d855", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb20c204a86794284f71413fbf84d855")).booleanValue();
            }
            if (obj == null) {
                return false;
            }
            d dVar = (d) obj;
            return TextUtils.equals(this.b, dVar.b) && this.c == dVar.c;
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41eeb7d8d6a1c85b64ede6a472b0dd4f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41eeb7d8d6a1c85b64ede6a472b0dd4f")).intValue();
            }
            if (this.d == 3 || this.d == 2) {
                int i = this.f;
                int length = this.b.length();
                if (i == 0 && length > 0) {
                    for (int i2 = 0; i2 < length; i2++) {
                        i = (i * 31) + this.b.charAt(i2);
                    }
                    this.f = i;
                }
                return i;
            }
            return ((this.c + 527) * 31) + ((int) (Long.valueOf(this.b).longValue() ^ (Long.valueOf(this.b).longValue() >>> 32)));
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8268d61e4b32face3a3bb5d1004ccfd", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8268d61e4b32face3a3bb5d1004ccfd");
            }
            return "Member : " + this.b + " mType: " + ((int) this.d) + " role: " + ((int) this.e) + " appId: " + ((int) this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends d {
        public static ChangeQuickRedirect f;
        public byte g;

        @Override // com.meituan.android.customerservice.cscallsdk.f.d
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302ef4649588ec2e91ae8a20ff79666a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302ef4649588ec2e91ae8a20ff79666a");
            }
            return super.toString() + " status: " + ((int) this.g);
        }
    }
}
