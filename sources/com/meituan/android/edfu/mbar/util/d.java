package com.meituan.android.edfu.mbar.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static Context b = null;
    private static String c = "d";
    private static volatile a d;
    private static Executor e = com.sankuai.android.jarvis.c.b(com.meituan.android.edfu.mbar.util.b.a(d.class.getSimpleName()));
    private static long f;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
    }

    public static /* synthetic */ a a(a aVar) {
        d = null;
        return null;
    }

    public static void a(String str, b bVar, Context context) {
        Object[] objArr = {str, bVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02acaeeeec687c64174c5c63c7e91154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02acaeeeec687c64174c5c63c7e91154");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            g.c(context);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "688113dc0d95d3b819e55aa97847e398", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "688113dc0d95d3b819e55aa97847e398");
            } else {
                if (d != null && !d.isCancelled()) {
                    d.cancel(true);
                }
                d = null;
            }
            a aVar = new a(bVar, null);
            d = aVar;
            com.sankuai.waimai.launcher.util.aop.b.a(aVar, e, str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a extends AsyncTask<Object, Void, l> {
        public static ChangeQuickRedirect a;
        private b b;
        private c c;

        @Override // android.os.AsyncTask
        public final void onCancelled() {
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(l lVar) {
            l lVar2 = lVar;
            Object[] objArr = {lVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67d97e75f66795ba6aafff40b2cd118", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67d97e75f66795ba6aafff40b2cd118");
                return;
            }
            super.onPostExecute(lVar2);
            d.a(null);
            if (this.b != null) {
                if (lVar2 != null) {
                    this.b.a(lVar2.f);
                } else {
                    this.b.a("");
                }
            }
            if (lVar2 == null || TextUtils.isEmpty(lVar2.f)) {
                return;
            }
            m.a().a("mbar_album_result", (float) (System.currentTimeMillis() - d.f));
        }

        public a(b bVar, c cVar) {
            Object[] objArr = {bVar, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca282031fbb73e3953b8e50c050fc081", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca282031fbb73e3953b8e50c050fc081");
                return;
            }
            this.b = bVar;
            this.c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public l doInBackground(Object... objArr) {
            String a2;
            float[] b;
            String a3;
            float[] b2;
            boolean z = false;
            Object[] objArr2 = {objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "c76315b67875069aec65b07cba6f6fc7", RobustBitConfig.DEFAULT_VALUE)) {
                return (l) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "c76315b67875069aec65b07cba6f6fc7");
            }
            if (objArr.length != 1) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    String str = (String) objArr[0];
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.sankuai.waimai.launcher.util.image.a.a(str, options);
                    options.inSampleSize = d.a(options, 500, 500);
                    options.inJustDecodeBounds = false;
                    Bitmap a4 = com.sankuai.waimai.launcher.util.image.a.a(str, options);
                    new StringBuilder(" BitmapFactory time:").append(System.currentTimeMillis() - currentTimeMillis);
                    if (a4 == null) {
                        return null;
                    }
                    com.meituan.android.edfu.edfucamera.argorithm.e eVar = new com.meituan.android.edfu.edfucamera.argorithm.e();
                    try {
                        try {
                            ByteBuffer allocate = ByteBuffer.allocate(a4.getByteCount());
                            a4.copyPixelsToBuffer(allocate);
                            eVar.f = allocate.array();
                            eVar.b = a4.getWidth();
                            eVar.c = a4.getHeight();
                            eVar.d = a4.getWidth() * 4;
                            eVar.e = 0;
                            eVar.i = 0;
                            if (eVar.f.length < eVar.b * eVar.c * 3) {
                                return null;
                            }
                            try {
                                if (!a4.isRecycled()) {
                                    a4.recycle();
                                }
                            } catch (Exception unused) {
                            }
                            if (!m.t) {
                                com.meituan.android.edfu.mbar.camera.decode.impl.e a5 = com.meituan.android.edfu.mbar.camera.decode.impl.e.a(d.b);
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.mbar.camera.decode.impl.e.a;
                                if (PatchProxy.isSupport(objArr3, a5, changeQuickRedirect2, false, "14011b548b360ac2685655c5c47a52ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, a5, changeQuickRedirect2, false, "14011b548b360ac2685655c5c47a52ca")).booleanValue();
                                } else if (a5.c != null) {
                                    z = a5.c.d();
                                }
                            } else {
                                com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a a6 = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a();
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a;
                                if (PatchProxy.isSupport(objArr4, a6, changeQuickRedirect3, false, "6ce9a64c87addcc5687c36b156fb30f4", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, a6, changeQuickRedirect3, false, "6ce9a64c87addcc5687c36b156fb30f4")).booleanValue();
                                } else if (a6.b != null && a6.b.b == 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                if (!m.t) {
                                    a3 = com.meituan.android.edfu.mbar.camera.decode.impl.e.a(d.b).a(eVar);
                                } else {
                                    a3 = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a().a(eVar);
                                }
                                l lVar = new l(a3, com.meituan.android.edfu.mbar.util.a.QR_CODE);
                                if (!m.t) {
                                    b2 = com.meituan.android.edfu.mbar.camera.decode.impl.e.a(d.b).a();
                                } else {
                                    b2 = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a().b();
                                }
                                if (b2 != null && b2.length > 5) {
                                    int i = (int) b2[6];
                                    String unused2 = d.c;
                                    new StringBuilder(" format value is:").append(i);
                                    lVar.g = i;
                                }
                                return lVar;
                            }
                            if (!m.t) {
                                a2 = com.meituan.android.edfu.mbar.camera.decode.impl.e.a(d.b).a(eVar);
                            } else {
                                a2 = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a().a(eVar);
                            }
                            l lVar2 = new l(a2, com.meituan.android.edfu.mbar.util.a.QR_CODE);
                            if (!m.t) {
                                b = com.meituan.android.edfu.mbar.camera.decode.impl.e.a(d.b).a();
                            } else {
                                b = com.meituan.android.edfu.mbar.camera.decode.impl.newdecode.a.a().b();
                            }
                            if (b != null && b.length > 5) {
                                int i2 = (int) b[6];
                                String unused3 = d.c;
                                new StringBuilder(" format value is:").append(i2);
                                lVar2.g = i2;
                            }
                            return lVar2;
                        } catch (Throwable unused4) {
                            return null;
                        }
                    } catch (OutOfMemoryError unused5) {
                        System.gc();
                        System.runFinalization();
                        return null;
                    } catch (Throwable unused6) {
                        return null;
                    }
                } catch (Throwable unused7) {
                    return null;
                }
            } catch (OutOfMemoryError unused8) {
                System.gc();
                System.runFinalization();
                return null;
            } catch (Throwable unused9) {
                return null;
            }
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {options, 500, 500};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc8814c82fb9f1fb622104df8b382956", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc8814c82fb9f1fb622104df8b382956")).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > 500 || i5 > 500) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > 500 && i7 / i3 > 500) {
                i3 *= 2;
            }
        }
        return i3;
    }
}
