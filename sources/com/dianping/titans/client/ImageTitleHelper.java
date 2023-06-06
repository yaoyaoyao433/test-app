package com.dianping.titans.client;

import android.content.Context;
import com.dianping.titans.ui.ITitleContentV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ImageTitleHelper {
    public static final int ERR_ADJUST_BITMAP = 4;
    public static final int ERR_ILLEGAL_URL = 2;
    public static final int ERR_IMG_OBTAIN = -400;
    public static final int ERR_INTERNAL = -1;
    public static final int ERR_NO_HOST = 1;
    public static final int ERR_SUCCEED = 0;
    public static final int ERR_TITLE_STATE = 3;
    private static final String TAG = "knb_img_title_helper";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ISetTitleListener {
        void onErr(ITitleContentV2 iTitleContentV2, String str, int i);
    }

    public static String getErrMsg(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7804bcf5efad30797097056f89ad0379", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7804bcf5efad30797097056f89ad0379");
        }
        if (i != -400) {
            switch (i) {
                case -1:
                    return "internal error";
                case 0:
                    return "success";
                case 1:
                    return "no host";
                case 2:
                    return "illegal url";
                case 3:
                    return "no title bar/content";
                case 4:
                    return "adjust bitmap error";
                default:
                    return "unknown";
            }
        }
        return "get image failed";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class OnlineTask implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<ITitleContentV2> mContent;
        private final Context mContext;
        private final WeakReference<ISetTitleListener> mListener;
        private final String mUrl;

        public OnlineTask(ITitleContentV2 iTitleContentV2, ISetTitleListener iSetTitleListener, String str, Context context) {
            Object[] objArr = {iTitleContentV2, iSetTitleListener, str, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91c4a80f016824f0506c261ddca8aec1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91c4a80f016824f0506c261ddca8aec1");
                return;
            }
            this.mUrl = str;
            this.mContent = new WeakReference<>(iTitleContentV2);
            this.mListener = new WeakReference<>(iSetTitleListener);
            this.mContext = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
            r7.onErr(null, r11.mUrl, 3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.titans.client.ImageTitleHelper.OnlineTask.changeQuickRedirect
                java.lang.String r10 = "fcd7702f6ab3500f36050be1b4032b31"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L18
                com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                return
            L18:
                java.lang.ref.WeakReference<com.dianping.titans.client.ImageTitleHelper$ISetTitleListener> r1 = r11.mListener     // Catch: java.lang.Exception -> L80
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L80
                r7 = r1
                com.dianping.titans.client.ImageTitleHelper$ISetTitleListener r7 = (com.dianping.titans.client.ImageTitleHelper.ISetTitleListener) r7     // Catch: java.lang.Exception -> L80
                r1 = 1
                if (r7 == 0) goto L26
                r6 = 1
                goto L27
            L26:
                r6 = 0
            L27:
                java.lang.String r0 = r11.mUrl     // Catch: java.lang.Exception -> L80
                r2 = 5000(0x1388, float:7.006E-42)
                android.graphics.Bitmap r0 = com.dianping.titans.utils.ViewUtils.downloadBitmap(r0, r2)     // Catch: java.lang.Exception -> L80
                java.lang.ref.WeakReference<com.dianping.titans.ui.ITitleContentV2> r2 = r11.mContent     // Catch: java.lang.Exception -> L80
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L80
                r8 = r2
                com.dianping.titans.ui.ITitleContentV2 r8 = (com.dianping.titans.ui.ITitleContentV2) r8     // Catch: java.lang.Exception -> L80
                if (r0 != 0) goto L44
                if (r6 == 0) goto L43
                java.lang.String r0 = r11.mUrl     // Catch: java.lang.Exception -> L80
                r1 = -400(0xfffffffffffffe70, float:NaN)
                r7.onErr(r8, r0, r1)     // Catch: java.lang.Exception -> L80
            L43:
                return
            L44:
                if (r8 == 0) goto L76
                boolean r2 = r8.isDetachedFromWindow()     // Catch: java.lang.Exception -> L80
                if (r2 == 0) goto L4d
                goto L76
            L4d:
                com.dianping.titans.ui.ITitleContentV2$IImageTitleInterceptor r2 = r8.getImageTitleInterceptor()     // Catch: java.lang.Exception -> L80
                if (r2 == 0) goto L59
                java.lang.String r3 = r11.mUrl     // Catch: java.lang.Exception -> L80
                android.graphics.Bitmap r0 = r2.onTitleImgDownloaded(r3, r0)     // Catch: java.lang.Exception -> L80
            L59:
                if (r0 != 0) goto L64
                if (r6 == 0) goto L63
                java.lang.String r0 = r11.mUrl     // Catch: java.lang.Exception -> L80
                r1 = 4
                r7.onErr(r8, r0, r1)     // Catch: java.lang.Exception -> L80
            L63:
                return
            L64:
                android.content.Context r2 = r11.mContext     // Catch: java.lang.Exception -> L80
                android.graphics.Bitmap r5 = com.dianping.titans.utils.ViewUtils.createBitmap(r2, r0, r1)     // Catch: java.lang.Exception -> L80
                com.dianping.titans.client.ImageTitleHelper$OnlineTask$1 r0 = new com.dianping.titans.client.ImageTitleHelper$OnlineTask$1     // Catch: java.lang.Exception -> L80
                r2 = r0
                r3 = r11
                r4 = r8
                r2.<init>()     // Catch: java.lang.Exception -> L80
                r8.runOnUiThread(r0)     // Catch: java.lang.Exception -> L80
                return
            L76:
                if (r6 == 0) goto L7f
                r0 = 0
                java.lang.String r1 = r11.mUrl     // Catch: java.lang.Exception -> L80
                r2 = 3
                r7.onErr(r0, r1, r2)     // Catch: java.lang.Exception -> L80
            L7f:
                return
            L80:
                java.lang.ref.WeakReference<com.dianping.titans.client.ImageTitleHelper$ISetTitleListener> r0 = r11.mListener
                java.lang.Object r0 = r0.get()
                com.dianping.titans.client.ImageTitleHelper$ISetTitleListener r0 = (com.dianping.titans.client.ImageTitleHelper.ISetTitleListener) r0
                if (r0 == 0) goto L99
                java.lang.ref.WeakReference<com.dianping.titans.ui.ITitleContentV2> r1 = r11.mContent
                java.lang.Object r1 = r1.get()
                com.dianping.titans.ui.ITitleContentV2 r1 = (com.dianping.titans.ui.ITitleContentV2) r1
                java.lang.String r2 = r11.mUrl
                r3 = -1
                r0.onErr(r1, r2, r3)
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.client.ImageTitleHelper.OnlineTask.run():void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        r21.onErr(r19, r20, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setImgTitle(android.content.Context r18, com.dianping.titans.ui.ITitleContentV2 r19, java.lang.String r20, com.dianping.titans.client.ImageTitleHelper.ISetTitleListener r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12 = 0
            r4[r12] = r0
            r13 = 1
            r4[r13] = r1
            r14 = 2
            r4[r14] = r2
            r15 = 3
            r4[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.titans.client.ImageTitleHelper.changeQuickRedirect
            java.lang.String r11 = "28c2eeb1fcd2864578c9bdb8edbc767b"
            r6 = 0
            r8 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r4
            r7 = r10
            r9 = r11
            r15 = r10
            r12 = r11
            r10 = r16
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L30
            com.meituan.robust.PatchProxy.accessDispatch(r4, r6, r15, r13, r12)
            return
        L30:
            if (r3 == 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch: java.lang.Exception -> L7c
            if (r5 == 0) goto L41
            if (r4 == 0) goto L40
            r3.onErr(r1, r2, r14)     // Catch: java.lang.Exception -> L7c
        L40:
            return
        L41:
            if (r1 == 0) goto L75
            boolean r5 = r19.isDetachedFromWindow()     // Catch: java.lang.Exception -> L7c
            if (r5 == 0) goto L4a
            goto L75
        L4a:
            com.dianping.titans.ui.ITitleContentV2$IImageTitleInterceptor r5 = r19.getImageTitleInterceptor()     // Catch: java.lang.Exception -> L7c
            if (r5 == 0) goto L54
            android.graphics.Bitmap r6 = r5.onDownloadTitleImg(r2)     // Catch: java.lang.Exception -> L7c
        L54:
            if (r6 == 0) goto L64
            android.graphics.Bitmap r0 = com.dianping.titans.utils.ViewUtils.createBitmap(r0, r6, r13)     // Catch: java.lang.Exception -> L7c
            r1.setTitleImage(r0)     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L63
            r0 = 0
            r3.onErr(r1, r2, r0)     // Catch: java.lang.Exception -> L7c
        L63:
            return
        L64:
            com.dianping.titans.client.ImageTitleHelper$OnlineTask r5 = new com.dianping.titans.client.ImageTitleHelper$OnlineTask     // Catch: java.lang.Exception -> L7c
            android.content.Context r0 = r18.getApplicationContext()     // Catch: java.lang.Exception -> L7c
            r5.<init>(r1, r3, r2, r0)     // Catch: java.lang.Exception -> L7c
            com.sankuai.meituan.android.knb.KNBRuntime r0 = com.sankuai.meituan.android.knb.KNBRuntime.getRuntime()     // Catch: java.lang.Exception -> L7c
            r0.executeOnThreadPool(r5)     // Catch: java.lang.Exception -> L7c
            return
        L75:
            if (r4 == 0) goto L7b
            r0 = 3
            r3.onErr(r1, r2, r0)     // Catch: java.lang.Exception -> L7c
        L7b:
            return
        L7c:
            if (r4 == 0) goto L83
            r0 = -1
            r3.onErr(r1, r2, r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.client.ImageTitleHelper.setImgTitle(android.content.Context, com.dianping.titans.ui.ITitleContentV2, java.lang.String, com.dianping.titans.client.ImageTitleHelper$ISetTitleListener):void");
    }
}
