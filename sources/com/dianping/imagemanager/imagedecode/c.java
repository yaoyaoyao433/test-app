package com.dianping.imagemanager.imagedecode;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.dianping.imagemanager.utils.i;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c extends a {
    public static ChangeQuickRedirect b;
    public String f;
    public Uri g;
    public t h;

    public c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3e66787d3008957018f03dee4a41e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3e66787d3008957018f03dee4a41e7");
            return;
        }
        this.f = str;
        this.g = this.f != null ? Uri.parse(this.f) : null;
        this.d = 3;
        this.h = Privacy.createContentResolver(com.dianping.imagemanager.base.b.a().e, str2);
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720c646d17f6c236dd1c8ea7ca157639", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720c646d17f6c236dd1c8ea7ca157639")).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            this.e = ConnectionResult.NETWORK_ERROR;
            return false;
        } else if (this.g == null) {
            this.e = ConnectionResult.RESOLUTION_REQUIRED;
            return false;
        } else if (this.h == null) {
            this.e = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            return false;
        } else {
            return true;
        }
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final i.a b() {
        InputStream b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b7e2bac0d21967d5a97aae93370489", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b7e2bac0d21967d5a97aae93370489");
        }
        InputStream inputStream = null;
        i.a aVar = i.a.UNKNOWN;
        try {
            try {
                b2 = this.h.b(this.g);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            i.a a = i.a(b2);
            if (b2 != null) {
                try {
                    b2.close();
                    return a;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return a;
                }
            }
            return a;
        } catch (Exception e3) {
            e = e3;
            inputStream = b2;
            e.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            inputStream = b2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.ParcelFileDescriptor] */
    @Override // com.dianping.imagemanager.imagedecode.a
    public final BitmapFactory.Options c() {
        ParcelFileDescriptor a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348740fe563eb7dad125122284ffd307", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348740fe563eb7dad125122284ffd307");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ParcelFileDescriptor e = null;
        e = 0;
        e = 0;
        e = 0;
        try {
            try {
                try {
                    a = this.h.a(this.g, r.o);
                    if (a != null) {
                        try {
                            BitmapFactory.decodeFileDescriptor(a.getFileDescriptor(), null, options);
                        } catch (Exception e2) {
                            e = e2;
                            e = a;
                            this.e = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
                            e.printStackTrace();
                            if (e != 0) {
                                e.close();
                                e = e;
                            }
                            return options;
                        } catch (Throwable th) {
                            th = th;
                            e = a;
                            if (e != null) {
                                try {
                                    e.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                }
            } catch (Exception e5) {
                e = e5;
            }
            if (a != null) {
                a.close();
            }
            return options;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final int d() {
        InputStream b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb0bafc4d7e3964ae2040f705ab1dfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb0bafc4d7e3964ae2040f705ab1dfd")).intValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            try {
                ParcelFileDescriptor a = this.h.a(this.g, r.o);
                if (a != null) {
                    return a(a.getFileDescriptor());
                }
                return 0;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return 0;
            }
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    b2 = this.h.b(this.g);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return 0;
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (b2 == null) {
                if (b2 != null) {
                    b2.close();
                    return 0;
                }
                return 0;
            }
            try {
                int a2 = a(b2);
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return a2;
            } catch (Exception e5) {
                e = e5;
                inputStream = b2;
                e.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                    return 0;
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                inputStream = b2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.dianping.imagemanager.imagedecode.a
    public byte[] a(boolean z) {
        Throwable th;
        InputStream inputStream;
        ?? r0 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        ?? isSupport = PatchProxy.isSupport(r0, this, changeQuickRedirect, false, "9ba57a277f9d36b9a4a1b11460cc9d3c", RobustBitConfig.DEFAULT_VALUE);
        if (isSupport != 0) {
            return (byte[]) PatchProxy.accessDispatch(r0, this, changeQuickRedirect, false, "9ba57a277f9d36b9a4a1b11460cc9d3c");
        }
        try {
            try {
                r0 = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
            r0 = 0;
            inputStream = null;
        } catch (Throwable th3) {
            isSupport = 0;
            th = th3;
            r0 = 0;
        }
        try {
            inputStream = this.h.b(this.g);
            try {
                byte[] bArr = new byte[100];
                while (true) {
                    int read = inputStream.read(bArr, 0, 100);
                    if (read <= 0) {
                        break;
                    }
                    r0.write(bArr, 0, read);
                }
                byte[] byteArray = r0.toByteArray();
                try {
                    r0.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return byteArray;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                this.e = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return null;
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        } catch (Exception e7) {
            e = e7;
            inputStream = null;
        } catch (Throwable th4) {
            isSupport = 0;
            th = th4;
            if (r0 != 0) {
                try {
                    r0.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            if (isSupport != 0) {
                try {
                    isSupport.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // com.dianping.imagemanager.imagedecode.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(android.graphics.BitmapFactory.Options r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.imagemanager.imagedecode.c.b
            java.lang.String r10 = "e42d945835084abec68ec605e867100c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            return r12
        L1e:
            r0 = 0
            com.meituan.android.privacy.interfaces.t r1 = r11.h     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            android.net.Uri r2 = r11.g     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r1 == 0) goto L37
            java.io.FileDescriptor r2 = r1.getFileDescriptor()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L53
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFileDescriptor(r2, r0, r12)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L53
            r0 = r12
            goto L37
        L35:
            r12 = move-exception
            goto L46
        L37:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L3d
            goto L52
        L3d:
            r12 = move-exception
            r12.printStackTrace()
            goto L52
        L42:
            r12 = move-exception
            goto L55
        L44:
            r12 = move-exception
            r1 = r0
        L46:
            r2 = 9002(0x232a, float:1.2614E-41)
            r11.e = r2     // Catch: java.lang.Throwable -> L53
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L3d
        L52:
            return r0
        L53:
            r12 = move-exception
            r0 = r1
        L55:
            if (r0 == 0) goto L5f
            r0.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r0.printStackTrace()
        L5f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.imagedecode.c.a(android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
