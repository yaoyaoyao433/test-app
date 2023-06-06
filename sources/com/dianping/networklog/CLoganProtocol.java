package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class CLoganProtocol implements e {
    public static ChangeQuickRedirect a;
    private static boolean b;
    private boolean c;
    private boolean d;
    private i e;
    private Set<Integer> f;

    /* loaded from: classes.dex */
    public static class a {
        public static final CLoganProtocol a = new CLoganProtocol();
    }

    static {
        try {
            System.loadLibrary("logan");
            b = true;
        } catch (Throwable th) {
            th.printStackTrace();
            b = false;
        }
    }

    public CLoganProtocol() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b76aa552ef5458c682758a6a3fe1423", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b76aa552ef5458c682758a6a3fe1423");
        } else {
            this.f = Collections.synchronizedSet(new HashSet());
        }
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5abc82069691c656df36b0066058198f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5abc82069691c656df36b0066058198f");
        } else if (i < 0) {
            if ("clogan_write".endsWith(str) && i != -4060) {
                if (this.f.contains(Integer.valueOf(i))) {
                    return;
                }
                this.f.add(Integer.valueOf(i));
            }
            if (this.e != null) {
                this.e.a(str, i);
            }
        }
    }

    public static boolean a() {
        return b;
    }

    public static CLoganProtocol b() {
        return a.a;
    }

    private native long clogan_currentLength();

    private native void clogan_debug(boolean z);

    private native void clogan_flush();

    private native int clogan_flushCache(String str, String str2);

    private native String clogan_getUplaodKey();

    private native int clogan_init(String str, String str2, int i, String str3, int i2);

    private native int clogan_open(String str);

    private native void clogan_setMaxFileLen(long j);

    private native void clogan_setUseEncryptOld(int i);

    private native int clogan_write(int i, String str, long j, long j2, String str2, long j3, int i2, String str3);

    @Override // com.dianping.networklog.e
    public final int a(String str, String str2) {
        if (this.d && b) {
            try {
                return clogan_flushCache(str, str2);
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return -5;
    }

    @Override // com.dianping.networklog.e
    public final void a(int i, String str, long j, long j2, String str2, long j3, boolean z, String str3) {
        if (this.d && b) {
            try {
                int clogan_write = clogan_write(i, str, j, j2, str2, j3, z ? 1 : 0, str3);
                if (clogan_write != -4010 || c.e) {
                    a("clogan_write", clogan_write);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                a("clogan_write", -4060);
            }
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(long j) {
        if (this.d && b) {
            try {
                clogan_setMaxFileLen(j);
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(i iVar) {
        this.e = iVar;
    }

    @Override // com.dianping.networklog.e
    public final void a(String str) {
        if (this.c && b) {
            try {
                int clogan_open = clogan_open(str);
                this.d = true;
                a("clogan_open", clogan_open);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                a("clogan_open", -2070);
            }
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(String str, String str2, int i, String str3, int i2) {
        String str4;
        int i3;
        if (this.c) {
            return;
        }
        if (b) {
            try {
                int clogan_init = clogan_init(str, str2, i, str3, i2);
                this.c = true;
                a("clogan_init", clogan_init);
                return;
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                str4 = "clogan_init";
                i3 = -1060;
            }
        } else {
            str4 = "logan_loadso";
            i3 = -5020;
        }
        a(str4, i3);
    }

    @Override // com.dianping.networklog.e
    public final void a(boolean z) {
        if (this.c && b) {
            try {
                clogan_debug(z);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.dianping.networklog.e
    public final String c() {
        if (b) {
            try {
                return clogan_getUplaodKey();
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                a("logan_getUploadKey", -6020);
                return "";
            }
        }
        return "";
    }

    @Override // com.dianping.networklog.e
    public final void d() {
        if (this.d && b) {
            try {
                clogan_flush();
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.dianping.networklog.e
    public final long e() {
        if (this.d && b) {
            try {
                return clogan_currentLength();
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return -5L;
    }
}
