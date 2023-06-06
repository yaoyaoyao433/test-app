package com.tencent.mapsdk.engine.jni;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.annotation.Keep;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.launcher.util.aop.b;
import com.tencent.map.lib.JNIInterfaceCallback;
import com.tencent.map.lib.models.MapTileID;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.mapsdk.engine.jni.models.TextBitmapInfo;
import com.tencent.mapsdk.internal.bq;
import com.tencent.mapsdk.internal.hb;
import com.tencent.mapsdk.internal.ki;
import com.tencent.mapsdk.internal.kj;
import com.tencent.mapsdk.internal.kn;
import com.tencent.mapsdk.internal.ld;
import com.tencent.mapsdk.internal.mj;
import com.tencent.mapsdk.internal.nu;
import com.tencent.mapsdk.internal.ny;
import com.tencent.mapsdk.internal.nz;
import com.tencent.mapsdk.internal.od;
import com.tencent.mapsdk.internal.oe;
import com.tencent.mapsdk.internal.of;
import com.tencent.mapsdk.internal.og;
import com.tencent.mapsdk.internal.oh;
import com.tencent.mapsdk.internal.oi;
import com.tencent.mapsdk.internal.w;
import java.util.Hashtable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class JNICallback implements JNIInterfaceCallback {
    private static final int CB_TYPE_CAL_TEXT_SIZE = 2;
    private static final int CB_TYPE_CANCEL_DOWNLOAD = 10;
    private static final int CB_TYPE_DOWNLOAD = 3;
    private static final int CB_TYPE_DRAW_TEXT = 1;
    private static final int CB_TYPE_INDOOR_BUILDING_CHANGED = 8;
    private static final int CB_TYPE_LOAD_RES = 4;
    private static final int CB_TYPE_NOTIFY_SET_CENTER_AND_SCALE_ANIM_FINISHED = 9;
    private static final int CB_TYPE_REPORT_ENGINE_CRASH_INFO = 7;
    private static final int CB_TYPE_UPDATE_MAP_PARAM = 6;
    private static final int CB_TYPE_WRITE_FILE = 5;
    private static final int IMG_TYPE_SAT = 1;
    private ny mCancelDownloadCallback;
    private oe mCbkGetGLContext;
    private nz mDownloadCallback;
    private bq mEngineCrashInfoRecorder;
    private od mIndoorBuildingChangeCallback;
    private og mMapAnimCallback;
    private of mMapCameraChangeCallback;
    private oh mMapLoadFinishedCallback;
    private oi mMapParamChangeCallback;
    private nu mRender;
    private w mResources;
    private Hashtable<Long, Paint> mTextPaints = new Hashtable<>();
    private Hashtable<Long, PointF> mTextSizeBuffers = new Hashtable<>();
    private Bitmap textCanvas;

    public JNICallback(nu nuVar, w wVar, nz nzVar, ny nyVar, oh ohVar, od odVar, og ogVar, bq bqVar, oi oiVar, of ofVar) {
        this.mRender = nuVar;
        this.mResources = wVar;
        this.mDownloadCallback = nzVar;
        this.mCancelDownloadCallback = nyVar;
        this.mMapLoadFinishedCallback = ohVar;
        this.mMapParamChangeCallback = oiVar;
        this.mIndoorBuildingChangeCallback = odVar;
        this.mMapCameraChangeCallback = ofVar;
        this.mMapAnimCallback = ogVar;
        this.mEngineCrashInfoRecorder = bqVar;
    }

    public void destory() {
        if (this.mTextPaints != null) {
            this.mTextPaints.clear();
            this.mTextPaints = null;
        }
        if (this.mTextSizeBuffers != null) {
            this.mTextSizeBuffers.clear();
            this.mTextSizeBuffers = null;
        }
        this.mResources = null;
        this.mDownloadCallback = null;
        this.mCancelDownloadCallback = null;
        this.mMapParamChangeCallback = null;
        this.mIndoorBuildingChangeCallback = null;
        this.mMapCameraChangeCallback = null;
        this.mRender = null;
    }

    public void setMapCallbackGetGLContext(oe oeVar) {
        this.mCbkGetGLContext = oeVar;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public Object callback(int i, int i2, String str, byte[] bArr, Object obj) {
        JNIEvent jNIEvent = new JNIEvent();
        jNIEvent.id = i2;
        jNIEvent.name = str;
        jNIEvent.data = bArr;
        jNIEvent.extra = obj;
        return callback(i, jNIEvent);
    }

    public Object callback(int i, JNIEvent jNIEvent) {
        switch (i) {
            case 1:
                return drawText(jNIEvent.id, jNIEvent.name, jNIEvent.data);
            case 2:
                return calTextSize(jNIEvent.name, jNIEvent.id);
            case 3:
                if (!hb.a(jNIEvent.name)) {
                    ld ldVar = new ld();
                    ldVar.a = jNIEvent.id;
                    if (jNIEvent.extra instanceof MapTileID) {
                        MapTileID mapTileID = (MapTileID) jNIEvent.extra;
                        ldVar.b = mapTileID.getDataSource().getValue();
                        ldVar.c = mapTileID.getPriority().getValue();
                    }
                    ldVar.d = jNIEvent.extra;
                    download(jNIEvent.name, ldVar);
                    break;
                }
                break;
            case 4:
                IconImageInfo loadImage = loadImage(jNIEvent.id, jNIEvent.data);
                if (jNIEvent.data != null) {
                    new String(jNIEvent.data);
                    return loadImage;
                }
                return loadImage;
            case 5:
                kj.b(ki.f, "CB_TYPE_WRITE_FILE:" + jNIEvent.name);
                writeFile(jNIEvent.name, jNIEvent.data);
                break;
            case 6:
                if (this.mMapParamChangeCallback != null) {
                    this.mMapParamChangeCallback.g();
                    break;
                }
                break;
            case 7:
                if (this.mEngineCrashInfoRecorder != null) {
                    this.mEngineCrashInfoRecorder.a(jNIEvent.name);
                    break;
                }
                break;
            case 8:
                if (this.mIndoorBuildingChangeCallback != null) {
                    this.mIndoorBuildingChangeCallback.c();
                    break;
                }
                break;
            case 9:
                if (this.mMapAnimCallback != null) {
                    this.mMapAnimCallback.a(jNIEvent.id > 0);
                    break;
                }
                break;
            case 10:
                kn.a("CB_TYPE_CANCEL_DOWNLOAD", jNIEvent);
                if (!hb.a(jNIEvent.name)) {
                    ld ldVar2 = new ld();
                    ldVar2.a = jNIEvent.id;
                    if (jNIEvent.extra instanceof MapTileID) {
                        MapTileID mapTileID2 = (MapTileID) jNIEvent.extra;
                        ldVar2.b = mapTileID2.getDataSource().getValue();
                        ldVar2.c = mapTileID2.getPriority().getValue();
                    }
                    ldVar2.d = jNIEvent.extra;
                    cancelDownload(jNIEvent.name, ldVar2);
                    break;
                }
                break;
        }
        return null;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapLoaded() {
        if (this.mMapLoadFinishedCallback != null) {
            this.mMapLoadFinishedCallback.m_();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChanged() {
        if (this.mMapCameraChangeCallback != null) {
            this.mMapCameraChangeCallback.h();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChangeStopped() {
        if (this.mMapCameraChangeCallback != null) {
            this.mMapCameraChangeCallback.i();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public int callbackGetGLContext() {
        if (this.mCbkGetGLContext != null) {
            return this.mCbkGetGLContext.getEGLContextHash();
        }
        return 0;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public boolean onJniCallbackRenderMapFrame(int i) {
        if (this.mRender != null) {
            return this.mRender.b(i);
        }
        return false;
    }

    private Paint getTextPaint() {
        if (this.mTextPaints == null) {
            return null;
        }
        return this.mTextPaints.get(Long.valueOf(Thread.currentThread().getId()));
    }

    private void cacheTextPaint(Paint paint) {
        if (this.mTextPaints != null) {
            this.mTextPaints.put(Long.valueOf(Thread.currentThread().getId()), paint);
        }
    }

    private PointF getTextSize() {
        if (this.mTextSizeBuffers == null) {
            return null;
        }
        return this.mTextSizeBuffers.get(Long.valueOf(Thread.currentThread().getId()));
    }

    private void cacheTextSize(PointF pointF) {
        if (this.mTextSizeBuffers != null) {
            this.mTextSizeBuffers.put(Long.valueOf(Thread.currentThread().getId()), pointF);
        }
    }

    private Paint initTextPaint(int i) {
        Paint textPaint = getTextPaint();
        if (textPaint == null) {
            textPaint = new mj(this.mResources.a);
            textPaint.setTypeface(Typeface.DEFAULT);
            textPaint.setAntiAlias(true);
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setLinearText(true);
            cacheTextPaint(textPaint);
        }
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(i);
        return textPaint;
    }

    private Bitmap drawText(int i, String str, byte[] bArr) {
        TextBitmapInfo textBitmapInfo = new TextBitmapInfo();
        textBitmapInfo.fill(bArr);
        if (textBitmapInfo.width == 0 || textBitmapInfo.height == 0) {
            return null;
        }
        if (this.textCanvas == null) {
            this.textCanvas = Bitmap.createBitmap(400, 400, Bitmap.Config.ALPHA_8);
        }
        if (this.textCanvas == null) {
            return null;
        }
        Paint initTextPaint = initTextPaint(i);
        this.textCanvas.eraseColor(0);
        initTextPaint.setFakeBoldText(textBitmapInfo.bold);
        new Canvas(this.textCanvas).drawText(str, 200.0f, 200.0f - ((initTextPaint.descent() + initTextPaint.ascent()) / 2.0f), initTextPaint);
        return this.textCanvas;
    }

    private PointF calTextSize(String str, int i) {
        float measureText = initTextPaint(i).measureText(str) + 1.0f;
        int i2 = i + 2;
        PointF textSize = getTextSize();
        if (textSize == null) {
            textSize = new PointF();
            cacheTextSize(textSize);
        }
        textSize.x = measureText;
        textSize.y = i2;
        return textSize;
    }

    private IconImageInfo loadImage(int i, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            String str = new String(bArr);
            if (i == 1) {
                w wVar = this.mResources;
                IconImageInfo iconImageInfo = new IconImageInfo();
                iconImageInfo.scale = wVar.c;
                iconImageInfo.anchorPointX1 = 0.5f;
                iconImageInfo.anchorPointY1 = 0.5f;
                iconImageInfo.bitmap = wVar.a(str, Bitmap.Config.RGB_565);
                return iconImageInfo;
            }
            return this.mResources.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void download(String str, ld ldVar) {
        if (this.mDownloadCallback != null) {
            kj.a("Engine callback download:" + str + CommonConstant.Symbol.COLON + ldVar);
            this.mDownloadCallback.b(str, ldVar);
        }
    }

    private void cancelDownload(String str, ld ldVar) {
        if (this.mCancelDownloadCallback != null) {
            kj.a("Engine callback cancel download:".concat(String.valueOf(str)));
            this.mCancelDownloadCallback.a(str, ldVar);
        }
    }

    private void writeFile(String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        b.a(new a(str, bArr), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends AsyncTask<Void, Void, Void> {
        private String a;
        private byte[] b;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return a();
        }

        a(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Void a() {
            /*
                r5 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.a
                r1.append(r2)
                java.lang.String r2 = ".tmp"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r1 = 0
                boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L50
                if (r2 != 0) goto L22
                com.tencent.mapsdk.internal.kc.a(r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L50
            L22:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L50
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45 java.io.FileNotFoundException -> L50
                byte[] r3 = r5.b     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39 java.io.FileNotFoundException -> L3e
                r2.write(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39 java.io.FileNotFoundException -> L3e
                r3 = 1
                r2.close()     // Catch: java.io.IOException -> L31
                goto L60
            L31:
                r2 = move-exception
                r2.printStackTrace()
                goto L60
            L36:
                r0 = move-exception
                r1 = r2
                goto L6f
            L39:
                r3 = move-exception
                r4 = r3
                r3 = r2
                r2 = r4
                goto L47
            L3e:
                r3 = move-exception
                r4 = r3
                r3 = r2
                r2 = r4
                goto L52
            L43:
                r0 = move-exception
                goto L6f
            L45:
                r2 = move-exception
                r3 = r1
            L47:
                r2.printStackTrace()     // Catch: java.lang.Throwable -> L6d
                if (r3 == 0) goto L5f
                r3.close()     // Catch: java.io.IOException -> L5b
                goto L5f
            L50:
                r2 = move-exception
                r3 = r1
            L52:
                r2.printStackTrace()     // Catch: java.lang.Throwable -> L6d
                if (r3 == 0) goto L5f
                r3.close()     // Catch: java.io.IOException -> L5b
                goto L5f
            L5b:
                r2 = move-exception
                r2.printStackTrace()
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L6c
                java.io.File r2 = new java.io.File
                java.lang.String r3 = r5.a
                r2.<init>(r3)
                r0.renameTo(r2)
            L6c:
                return r1
            L6d:
                r0 = move-exception
                r1 = r3
            L6f:
                if (r1 == 0) goto L79
                r1.close()     // Catch: java.io.IOException -> L75
                goto L79
            L75:
                r1 = move-exception
                r1.printStackTrace()
            L79:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.engine.jni.JNICallback.a.a():java.lang.Void");
        }
    }
}
