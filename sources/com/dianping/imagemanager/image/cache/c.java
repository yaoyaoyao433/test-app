package com.dianping.imagemanager.image.cache;

import android.content.Context;
import com.dianping.imagemanager.image.cache.b;
import com.dianping.imagemanager.image.cache.disklrucache.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static com.dianping.imagemanager.image.cache.a[] b = {com.dianping.imagemanager.image.cache.a.DEFAULT, com.dianping.imagemanager.image.cache.a.ICON, com.dianping.imagemanager.image.cache.a.HOMEPAGE};
    public static com.dianping.imagemanager.image.cache.disklrucache.c[] c;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d69cf790a120a40bc1bcbd234e36611e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d69cf790a120a40bc1bcbd234e36611e");
            return;
        }
        c = new com.dianping.imagemanager.image.cache.disklrucache.c[b.length];
        for (int i = 0; i < b.length; i++) {
            com.dianping.imagemanager.image.cache.a aVar = b[i];
            c[i] = new com.dianping.imagemanager.image.cache.disklrucache.c(context, "networkimage/" + aVar.toString().toLowerCase(), aVar.f);
        }
    }

    public static File a(com.dianping.imagemanager.image.cache.a aVar, String str) {
        com.dianping.imagemanager.image.cache.disklrucache.c[] cVarArr;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a19b3f4c5c47555011c2eb92810c790", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a19b3f4c5c47555011c2eb92810c790");
        }
        if (aVar == null) {
            aVar = com.dianping.imagemanager.image.cache.a.DEFAULT;
        }
        com.dianping.imagemanager.image.cache.disklrucache.c cVar = c[aVar.ordinal()];
        File a2 = cVar.a(str);
        if (a2 == null) {
            for (com.dianping.imagemanager.image.cache.disklrucache.c cVar2 : c) {
                if (cVar2 != cVar && (a2 = cVar2.a(str)) != null) {
                    return a2;
                }
            }
        }
        return a2;
    }

    public static synchronized String a(byte[] bArr, com.dianping.imagemanager.image.cache.a aVar, String str) {
        com.dianping.imagemanager.image.cache.disklrucache.a aVar2;
        b.a aVar3;
        synchronized (c.class) {
            Object[] objArr = {bArr, aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66342ce4493f0df32205e7b0139cb618", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66342ce4493f0df32205e7b0139cb618");
            }
            com.dianping.imagemanager.image.cache.a aVar4 = aVar == null ? com.dianping.imagemanager.image.cache.a.DEFAULT : aVar;
            com.dianping.imagemanager.image.cache.disklrucache.c cVar = c[aVar4.ordinal()];
            a aVar5 = new a(bArr);
            Object[] objArr2 = {str, aVar5};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.imagemanager.image.cache.disklrucache.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d9b1a46f2df28c4c6a03dfe14ca48ba0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d9b1a46f2df28c4c6a03dfe14ca48ba0");
            } else {
                cVar.b.a(str);
                try {
                    com.dianping.imagemanager.image.cache.disklrucache.b a2 = cVar.a();
                    if (a2 != null) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.image.cache.disklrucache.b.a;
                        aVar3 = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "cf879a843b4f5e705c8dc76059629639", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "cf879a843b4f5e705c8dc76059629639") : a2.a(str, -1L);
                    } else {
                        aVar3 = null;
                    }
                    if (aVar3 != null) {
                        try {
                            if (aVar5.a(aVar3.a(0))) {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
                                if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "a66a6c449e287da32d8e86ff9a2078e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "a66a6c449e287da32d8e86ff9a2078e6");
                                } else {
                                    com.dianping.imagemanager.image.cache.disklrucache.b.a(com.dianping.imagemanager.image.cache.disklrucache.b.this, aVar3, true);
                                    aVar3.d = true;
                                }
                            } else {
                                com.dianping.imagemanager.utils.a.a(com.dianping.imagemanager.image.cache.disklrucache.c.class, "writer.write failed!");
                            }
                            aVar3.b();
                        } catch (Throwable th) {
                            aVar3.b();
                            throw th;
                        }
                    } else {
                        com.dianping.imagemanager.utils.a.b(com.dianping.imagemanager.image.cache.disklrucache.c.class, "editor == null!");
                    }
                    aVar2 = cVar.b;
                } catch (IOException unused) {
                    com.dianping.imagemanager.utils.a.b(com.dianping.imagemanager.image.cache.disklrucache.c.class, "Unable to put to disk cache!");
                    aVar2 = cVar.b;
                }
                aVar2.b(str);
            }
            File a3 = c[aVar4.ordinal()].a(str);
            if (a3 != null) {
                return a3.getAbsolutePath();
            }
            com.dianping.imagemanager.utils.a.a(c.class, "put data to disk cache failed!");
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements b.a {
        public static ChangeQuickRedirect a;
        public byte[] b;

        public a(byte[] bArr) {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c583496c7dff4ef881853cbc3abb640", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c583496c7dff4ef881853cbc3abb640");
            } else {
                this.b = bArr;
            }
        }

        @Override // com.dianping.imagemanager.image.cache.b.a
        public final boolean a(File file) {
            FileOutputStream fileOutputStream;
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df55851a6bd45cd8e99184372d0ab80d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df55851a6bd45cd8e99184372d0ab80d")).booleanValue();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(this.b);
                fileOutputStream.flush();
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                com.dianping.imagemanager.utils.a.a(c.class, "write byte array to file error!");
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }
}
