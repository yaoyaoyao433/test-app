package com.sankuai.waimai.irmo.mach.vap;

import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    a b;
    private final File c;
    private q d;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924567c2652422f018cb8855d62b6cf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924567c2652422f018cb8855d62b6cf6");
            return;
        }
        this.c = q.b(com.meituan.android.singleton.b.a, "waimai", "mach/vap_video");
        if (!this.c.exists()) {
            this.c.mkdirs();
        }
        this.d = q.a(com.meituan.android.singleton.b.a, "wm-vap", 1);
        this.b = new a(this.c, a(str));
        this.b.d = this.d;
    }

    public final boolean a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd10f6e36303b38f9fb0ccaceecba34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd10f6e36303b38f9fb0ccaceecba34")).booleanValue();
        }
        if (this.d.a(this.b.c)) {
            a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9c3c447c0efd3d5b15360c9748a9a332", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9c3c447c0efd3d5b15360c9748a9a332")).booleanValue();
            } else {
                z = new File(aVar.b, aVar.d.b(aVar.c, "")).exists();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final File b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609859382a802a1cb7691ca4668bc09e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609859382a802a1cb7691ca4668bc09e");
        }
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7217b423464442899fa7b7b836dbc4e7", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7217b423464442899fa7b7b836dbc4e7") : new File(aVar.b, aVar.d.b(aVar.c, "data.mp4"));
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2bc24588be12d2a40be78465f940b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2bc24588be12d2a40be78465f940b3");
        }
        try {
            return okio.f.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final File b;
        final String c;
        q d;

        public a(File file, String str) {
            Object[] objArr = {file, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee12f421248d4dd7c35ad0e2ff7e6880", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee12f421248d4dd7c35ad0e2ff7e6880");
                return;
            }
            this.c = str;
            this.b = new File(file, str);
        }

        public final boolean a(InputStream inputStream) {
            Object[] objArr = {inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf400ae06bb716d17dd84bdf24eb769", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf400ae06bb716d17dd84bdf24eb769")).booleanValue();
            }
            if (inputStream == null) {
                return false;
            }
            try {
                if (!this.b.exists()) {
                    this.b.mkdirs();
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.b, "data.mp4"));
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                this.d.a(this.c, "data.mp4");
                                fileOutputStream.close();
                                bufferedInputStream.close();
                                return true;
                            }
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    return false;
                }
            } catch (Exception unused2) {
                return false;
            }
        }
    }
}
