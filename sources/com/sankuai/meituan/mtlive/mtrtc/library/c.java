package com.sankuai.meituan.mtlive.mtrtc.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public int a;
        public int b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtlive.mtrtc.library.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0611c {
        public String a;
        public int b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        public String a;
        public int b;
        public float c;
        public float d;
        public int e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class f {
        public String a;
        public int b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public String d;
        public int e;
        public int f;
        public String g;
        public String h;
        public String i;
        public String j;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3f8f677dcf4f5a81e05c705c06aa08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3f8f677dcf4f5a81e05c705c06aa08");
                return;
            }
            this.b = 0;
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f = 20;
            this.i = "";
            this.j = "";
        }

        public b(int i, String str, String str2, int i2, String str3, String str4) {
            Object[] objArr = {Integer.valueOf(i), str, str2, Integer.valueOf(i2), str3, str4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e4da7cf3168f60a407110c05a65004", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e4da7cf3168f60a407110c05a65004");
                return;
            }
            this.b = 0;
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f = 20;
            this.i = "";
            this.j = "";
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = i2;
            this.i = str3;
            this.j = str4;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746a682a7aada12f9308c70599366a57", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746a682a7aada12f9308c70599366a57");
            }
            return "MTRTCParams{sdkAppId=" + this.b + ", userId='" + this.c + "', userSig='" + this.d + "', roomId=" + this.e + ", role=" + this.f + ", streamId='" + this.g + "', userDefineRecordId='" + this.h + "', privateMapKey='" + this.i + "', businessInfo='" + this.j + "'}";
        }
    }
}
