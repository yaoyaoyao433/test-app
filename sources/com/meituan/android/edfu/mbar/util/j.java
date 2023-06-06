package com.meituan.android.edfu.mbar.util;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.edfu.mbar.netservice.b;
import com.meituan.android.edfu.mbar.netservice.bean.BaseResult;
import com.meituan.android.edfu.mbar.netservice.bean.CodeResult;
import com.meituan.android.edfu.mbar.netservice.bean.ImageScanRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.IOUtils;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static long c = 0;
    private static long d = 0;
    private static float e = 0.0f;
    private static int f = -1;
    private static boolean g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
        if (com.meituan.android.edfu.mbar.util.j.e > 200.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
        if (com.meituan.android.edfu.mbar.util.j.e > 600.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
        if (com.meituan.android.edfu.mbar.util.j.e > 30.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.meituan.android.edfu.mbar.camera.decode.f r20, boolean r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.mbar.util.j.a(com.meituan.android.edfu.mbar.camera.decode.f, boolean, boolean, int):boolean");
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cf24c1ca7aaef030eb1062debca854e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cf24c1ca7aaef030eb1062debca854e")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(String str) {
        char c2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2f272cd48655df1e5a6a28faf291d19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2f272cd48655df1e5a6a28faf291d19")).intValue();
        }
        int hashCode = str.hashCode();
        if (hashCode == -993060056) {
            if (str.equals("pdf417")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == -951532658) {
            if (str.equals("qrcode")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode != -333584256) {
            if (hashCode == 3209 && str.equals(Constants.Environment.KEY_DM)) {
                c2 = 3;
            }
            c2 = 65535;
        } else {
            if (str.equals("barcode")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 64;
            case 2:
                return 57;
            case 3:
                return 3;
            default:
                return -1;
        }
    }

    public static String a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2df7047407c465868cc5324802d8a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2df7047407c465868cc5324802d8a18");
        }
        if (i == 57 && !str.isEmpty() && str.length() > 2 && str.charAt(0) == 'C' && str.charAt(1) == 'O') {
            return "J" + str.substring(2);
        }
        return str;
    }

    public static void a(long j) {
        d = j;
    }

    public static boolean a() {
        return g;
    }

    public static void a(boolean z) {
        g = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(9:26|27|9|(1:11)(1:25)|(1:15)|16|17|(1:21)|22)|8|9|(0)(0)|(2:13|15)|16|17|(2:19|21)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(byte[] r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.edfu.mbar.util.j.a
            java.lang.String r11 = "237517ece0a2fd6a578f3feafcb4f144"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            byte[] r12 = (byte[]) r12
            return r12
        L1e:
            int r0 = r12.length
            if (r0 == 0) goto L27
            int r0 = r12.length     // Catch: java.lang.Exception -> L27
            android.graphics.Bitmap r12 = com.sankuai.waimai.launcher.util.image.a.a(r12, r9, r0)     // Catch: java.lang.Exception -> L27
            goto L28
        L27:
            r12 = r2
        L28:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r0 = 1119092736(0x42b40000, float:90.0)
            r8.postRotate(r0)
            if (r12 == 0) goto L45
            r4 = 0
            r5 = 0
            int r6 = r12.getWidth()
            int r7 = r12.getHeight()
            r9 = 1
            r3 = r12
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            goto L46
        L45:
            r0 = r2
        L46:
            if (r0 == 0) goto L51
            boolean r1 = r12.isRecycled()
            if (r1 != 0) goto L51
            r12.recycle()
        L51:
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L62
            r12.<init>()     // Catch: java.lang.Exception -> L62
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L62
            r3 = 90
            r0.compress(r1, r3, r12)     // Catch: java.lang.Exception -> L62
            byte[] r12 = r12.toByteArray()     // Catch: java.lang.Exception -> L62
            goto L63
        L62:
            r12 = r2
        L63:
            if (r0 == 0) goto L6e
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L6e
            r0.recycle()
        L6e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.mbar.util.j.a(byte[]):byte[]");
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b4956e45b322669fc6c30c83b93fc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b4956e45b322669fc6c30c83b93fc85");
            return;
        }
        c = 0L;
        d = 0L;
        e = 0.0f;
        f = -1;
        g = false;
    }

    public static void a(final com.meituan.android.edfu.mbar.netservice.c cVar, com.meituan.android.edfu.edfucamera.argorithm.e eVar, b.a aVar) {
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] a2;
        final int i;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        String str;
        Object[] objArr2 = {cVar, eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ffb4d12e0673f1b4d4140bc9763358f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ffb4d12e0673f1b4d4140bc9763358f");
            return;
        }
        g = true;
        d = System.currentTimeMillis();
        try {
            if (eVar != null) {
                try {
                    if (eVar.i == 1) {
                        YuvImage yuvImage = new YuvImage(eVar.f, 17, eVar.b, eVar.c, null);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            yuvImage.compressToJpeg(new Rect(0, 0, eVar.b, eVar.c), 80, byteArrayOutputStream2);
                            a2 = a(byteArrayOutputStream2.toByteArray());
                            i = f;
                            objArr = new Object[]{0, Integer.valueOf(i), a2, aVar};
                            changeQuickRedirect = com.meituan.android.edfu.mbar.netservice.c.a;
                            z = false;
                        } catch (Throwable unused) {
                            z = false;
                        }
                        try {
                            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bb02328f20b4a500c04ed4487f4e9900", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bb02328f20b4a500c04ed4487f4e9900");
                            } else {
                                final WeakReference weakReference = new WeakReference(aVar);
                                try {
                                    str = Base64.encodeToString(a2, 2);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    str = null;
                                } catch (Throwable th) {
                                    th = th;
                                    IOUtils.close(byteArrayOutputStream2);
                                    throw th;
                                }
                                ImageScanRequest imageScanRequest = new ImageScanRequest();
                                ImageScanRequest.Image image = new ImageScanRequest.Image();
                                image.setContent(str);
                                imageScanRequest.setImage(image);
                                imageScanRequest.setProjectId("10");
                                imageScanRequest.setGroupId("edfucardscanner");
                                imageScanRequest.setClientId("");
                                imageScanRequest.setChannel(new StringBuilder("0").toString());
                                ImageScanRequest.Extra extra = new ImageScanRequest.Extra();
                                extra.setBusinessID("arscan");
                                imageScanRequest.setExtra(new GsonBuilder().create().toJson(extra));
                                String uuid = GetUUID.getInstance().getUUID(cVar.b.get());
                                String valueOf = String.valueOf(System.currentTimeMillis());
                                if (!TextUtils.isEmpty(uuid)) {
                                    valueOf = uuid + valueOf;
                                }
                                imageScanRequest.setTraceId(valueOf);
                                if (!cVar.d) {
                                    com.meituan.android.edfu.mbar.netservice.e a3 = com.meituan.android.edfu.mbar.netservice.e.a();
                                    Object[] objArr3 = {imageScanRequest};
                                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mbar.netservice.e.a;
                                    cVar.c = (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "4bd726c7b38eb0d14c16e37cedcbe135", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "4bd726c7b38eb0d14c16e37cedcbe135") : a3.b.scanCodeImage(imageScanRequest).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())).a(new rx.e<BaseResult<CodeResult>>() { // from class: com.meituan.android.edfu.mbar.netservice.c.1
                                        public static ChangeQuickRedirect a;

                                        @Override // rx.e
                                        public final void onCompleted() {
                                        }

                                        @Override // rx.e
                                        public final /* synthetic */ void onNext(BaseResult<CodeResult> baseResult) {
                                            BaseResult<CodeResult> baseResult2 = baseResult;
                                            Object[] objArr4 = {baseResult2};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0cc9f177fd2987b54921c3390da3752d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0cc9f177fd2987b54921c3390da3752d");
                                                return;
                                            }
                                            String unused2 = c.e;
                                            new StringBuilder(" 服务返回结果：").append(baseResult2.getCode() + " : " + baseResult2.getMessage());
                                            if (baseResult2.getCode() == 0 && baseResult2.getResult() != null && !CollectionUtils.isEmpty(baseResult2.getResult().getCodeReaderCards().getResult().getRes()) && !baseResult2.getResult().getCodeReaderCards().getResult().getRes().get(0).getDecodeRes().equals("")) {
                                                if (weakReference.get() != null) {
                                                    ((b.a) weakReference.get()).a(baseResult2);
                                                }
                                            } else if (weakReference.get() != null) {
                                                ((b.a) weakReference.get()).a(baseResult2.getCode(), baseResult2.getMessage(), i);
                                            }
                                        }

                                        @Override // rx.e
                                        public final void onError(Throwable th2) {
                                            Object[] objArr4 = {th2};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a44894afa3fcc2d6063e69f387c7b46a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a44894afa3fcc2d6063e69f387c7b46a");
                                            } else if (weakReference.get() != null) {
                                                weakReference.get();
                                                th2.getMessage();
                                            }
                                        }
                                    });
                                }
                            }
                            byteArrayOutputStream = byteArrayOutputStream2;
                            g = z;
                            IOUtils.close(byteArrayOutputStream);
                            return;
                        } catch (Throwable unused2) {
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                g = z;
                                IOUtils.close(byteArrayOutputStream);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                IOUtils.close(byteArrayOutputStream2);
                                throw th;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                    z = false;
                    byteArrayOutputStream = null;
                }
            }
            g = z;
            IOUtils.close(byteArrayOutputStream);
            return;
        } catch (Throwable unused4) {
            g = z;
            IOUtils.close(byteArrayOutputStream);
            return;
        }
        z = false;
        byteArrayOutputStream = null;
    }
}
