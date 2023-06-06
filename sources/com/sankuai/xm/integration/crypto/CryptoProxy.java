package com.sankuai.xm.integration.crypto;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.log.c;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CryptoProxy implements ICrypto {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    private boolean f;
    private byte[] g;
    private ICrypto h;
    private HashSet<String> i;
    private HashSet<String> j;
    private Runnable k;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final CryptoProxy a = new CryptoProxy();
    }

    public CryptoProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9a2b6dcb09b976714348790c5c8625", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9a2b6dcb09b976714348790c5c8625");
            return;
        }
        this.f = false;
        this.i = new HashSet<>();
        this.j = new HashSet<>();
    }

    public static /* synthetic */ Runnable a(CryptoProxy cryptoProxy, Runnable runnable) {
        cryptoProxy.k = null;
        return null;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4a96ca6d0c4996272c1a7037cf5748", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4a96ca6d0c4996272c1a7037cf5748");
        } else if (!this.f && this.h == null) {
            this.h = (ICrypto) m.a(ICrypto.class);
            if (this.h == null) {
                this.f = true;
            }
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de37f5a4605cf04064f33d72de7e3b21", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de37f5a4605cf04064f33d72de7e3b21")).booleanValue();
        }
        if (this.f) {
            return false;
        }
        d();
        return this.h != null;
    }

    @Override // com.sankuai.xm.integration.crypto.ICrypto
    public final synchronized void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431b218ce75c46308df049ca3cbd27e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431b218ce75c46308df049ca3cbd27e2");
            return;
        }
        this.g = bArr;
        d();
        if (this.h != null) {
            this.h.a(bArr);
        }
    }

    @Override // com.sankuai.xm.integration.crypto.ICrypto
    public final InputStream a(InputStream inputStream, int i) {
        Object[] objArr = {inputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a580b98b55745b0e96375b014e3bc09a", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a580b98b55745b0e96375b014e3bc09a");
        }
        d();
        return this.h != null ? this.h.a(inputStream, i) : inputStream;
    }

    @Override // com.sankuai.xm.integration.crypto.ICrypto
    public final OutputStream a(OutputStream outputStream, int i) {
        Object[] objArr = {outputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bfcc02ff61b14e73199e445f6dbbbec", 6917529027641081856L)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bfcc02ff61b14e73199e445f6dbbbec");
        }
        d();
        return this.h != null ? this.h.a(outputStream, i) : outputStream;
    }

    @Override // com.sankuai.xm.integration.crypto.ICrypto
    public final int a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faeae7b8ddb7decbe8c63623723daf1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faeae7b8ddb7decbe8c63623723daf1")).intValue();
        }
        d();
        if (this.h != null) {
            return this.h.a(str, str2, i);
        }
        return -1;
    }

    @Override // com.sankuai.xm.integration.crypto.ICrypto
    public final long a(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a1b998bd584f0b99f1a8378a11e46a", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a1b998bd584f0b99f1a8378a11e46a")).longValue();
        }
        d();
        if (this.h != null) {
            return this.h.a(obj, i);
        }
        return -1L;
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19aae8e924da3177cac357dbcfcd65fa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19aae8e924da3177cac357dbcfcd65fa");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = this.e + str.hashCode() + File.separator + k.n(str);
        k.g(str2);
        return str2;
    }

    public final synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d6895b1cc7690abf0cf3ff03f16fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d6895b1cc7690abf0cf3ff03f16fb4");
        } else if (str == null) {
        } else {
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            if (this.i.contains(str)) {
                return;
            }
            Iterator<String> it = this.i.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return;
                }
            }
            this.i.add(str);
        }
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321f1b500a652ca0415009d627962108", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321f1b500a652ca0415009d627962108")).booleanValue();
        }
        if (!a() || str == null || this.i.size() == 0) {
            return false;
        }
        synchronized (this) {
            Iterator<String> it = this.i.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4ce1b94f56b53bc53d5743f3c56837", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4ce1b94f56b53bc53d5743f3c56837")).booleanValue() : k.o(str) && (TextUtils.isEmpty(this.e) || !str.startsWith(this.e)) && c(str) && !str.endsWith(".temp");
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0581d646e7bb4881450988ac4f93e5f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0581d646e7bb4881450988ac4f93e5f4");
        } else if (a()) {
            if (this.k != null) {
                c.b("CryptoProxy", "checkCryptoPaths:: the checking task is already running.", new Object[0]);
                return;
            }
            this.k = new Runnable() { // from class: com.sankuai.xm.integration.crypto.CryptoProxy.1
                public static ChangeQuickRedirect a;
                private int c = 0;
                private int d = 0;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dd13143a5899703fc678a57c30204ba", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dd13143a5899703fc678a57c30204ba");
                        return;
                    }
                    UUID.randomUUID();
                    if (!CryptoProxy.this.i.isEmpty()) {
                        Iterator it = CryptoProxy.this.i.iterator();
                        while (it.hasNext()) {
                            a(new File((String) it.next()));
                        }
                    }
                    if (!CryptoProxy.this.j.isEmpty()) {
                        Iterator it2 = CryptoProxy.this.j.iterator();
                        while (it2.hasNext()) {
                            k.b(new File((String) it2.next()));
                        }
                    }
                    if (!TextUtils.isEmpty(CryptoProxy.this.e)) {
                        k.b(new File(CryptoProxy.this.e));
                    }
                    CryptoProxy.a(CryptoProxy.this, (Runnable) null);
                }

                private void a(File file) {
                    File[] listFiles;
                    Object[] objArr2 = {file};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e9067642eea6459fa9f1570258b099", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e9067642eea6459fa9f1570258b099");
                    } else if (file != null && file.isDirectory()) {
                        for (File file2 : file.listFiles()) {
                            if (file2.isDirectory()) {
                                a(file2);
                            } else if (file2.exists() && !CryptoProxy.this.d(file2.getAbsolutePath())) {
                                this.c++;
                                this.d = (int) (this.d + file2.length());
                                file2.delete();
                            }
                        }
                    }
                }
            };
            com.sankuai.xm.threadpool.scheduler.a.b().b(this.k);
        }
    }

    public static CryptoProxy c() {
        return a.a;
    }
}
