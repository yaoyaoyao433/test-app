package com.sankuai.waimai.platform.machpro.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Keep;
import com.dianping.codelog.b;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.machpro.base.MachMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MPBitmapTransform implements BitmapTransformation {
    private static final int MAX_BITMAP_SIZE = 104857600;
    public static final int PAINT_FLAGS = 6;
    public static ChangeQuickRedirect changeQuickRedirect;
    private MachMap clipRect;
    private boolean hasBlurRadius;
    private boolean hasClipRect;
    private final WeakReference<a.InterfaceC1022a> mListener;
    private float[] mRoundRadii;
    private String mScaleType;
    private int mViewHeight;
    private int mViewWidth;
    private String url;

    public MPBitmapTransform(String str, int i, int i2, WeakReference<a.InterfaceC1022a> weakReference) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), weakReference};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc66f770ec13b5368c678bc3ca79ff86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc66f770ec13b5368c678bc3ca79ff86");
            return;
        }
        this.mRoundRadii = new float[8];
        this.mScaleType = str;
        this.mViewHeight = i2;
        this.mViewWidth = i;
        this.mListener = weakReference;
    }

    public void setRoundRadii(float[] fArr) {
        this.mRoundRadii = fArr;
    }

    public void setHasClipRect(boolean z) {
        this.hasClipRect = z;
    }

    public void setHasBlurRadius(boolean z) {
        this.hasBlurRadius = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7 A[Catch: Exception -> 0x01ae, TryCatch #0 {Exception -> 0x01ae, blocks: (B:8:0x002f, B:10:0x0038, B:12:0x003c, B:14:0x004e, B:16:0x0088, B:18:0x0090, B:23:0x0099, B:25:0x00a7, B:27:0x00b8, B:33:0x00c4, B:35:0x00ce, B:37:0x011a, B:39:0x011f, B:41:0x0123, B:43:0x012b), top: B:49:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: Exception -> 0x01ae, TryCatch #0 {Exception -> 0x01ae, blocks: (B:8:0x002f, B:10:0x0038, B:12:0x003c, B:14:0x004e, B:16:0x0088, B:18:0x0090, B:23:0x0099, B:25:0x00a7, B:27:0x00b8, B:33:0x00c4, B:35:0x00ce, B:37:0x011a, B:39:0x011f, B:41:0x0123, B:43:0x012b), top: B:49:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:8:0x002f, B:10:0x0038, B:12:0x003c, B:14:0x004e, B:16:0x0088, B:18:0x0090, B:23:0x0099, B:25:0x00a7, B:27:0x00b8, B:33:0x00c4, B:35:0x00ce, B:37:0x011a, B:39:0x011f, B:41:0x0123, B:43:0x012b), top: B:49:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap transform(android.graphics.Bitmap r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.bitmap.MPBitmapTransform.transform(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    private void log(Bitmap bitmap, Exception exc) {
        Object[] objArr = {bitmap, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3e857a0e3384e365223129ff0d2a759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3e857a0e3384e365223129ff0d2a759");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("height", Integer.valueOf(this.mViewHeight));
        hashMap.put("width", Integer.valueOf(this.mViewWidth));
        hashMap.put("ScaleType", this.mScaleType);
        hashMap.put("srcHeight", Integer.valueOf(bitmap.getHeight()));
        hashMap.put("srcWidth", Integer.valueOf(bitmap.getWidth()));
        hashMap.put("url", this.url);
        hashMap.put(LogMonitor.EXCEPTION_TAG, exc.getMessage() + " | " + exc.getClass().getName());
        b.b(com.sankuai.waimai.machpro.instance.a.class, "MPImage transform exception", hashMap.toString());
    }

    private Bitmap scaleBitmap(Bitmap bitmap) {
        float f;
        float f2;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a51a03391a1134fd8598fb322e09b44", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a51a03391a1134fd8598fb322e09b44");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = null;
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if ("aspectFit".equals(this.mScaleType) || "contain".equals(this.mScaleType)) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), new RectF(0.0f, 0.0f, this.mViewWidth, this.mViewHeight), Matrix.ScaleToFit.CENTER);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if (DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(this.mScaleType) || "aspectFill".equals(this.mScaleType)) {
            if (this.mViewHeight * width > this.mViewWidth * height) {
                f = this.mViewHeight / height;
                f2 = (this.mViewWidth - (width * f)) * 0.5f;
            } else {
                f = this.mViewWidth / width;
                f3 = (this.mViewHeight - (height * f)) * 0.5f;
                f2 = 0.0f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate(Math.round(f2), Math.round(f3));
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if (DynamicTitleParser.PARSER_KEY_STRETCH.equals(this.mScaleType) || "scaleToFill".equals(this.mScaleType)) {
            matrix.setScale(this.mViewWidth / width, this.mViewHeight / height);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if ("aspectLeft".equals(this.mScaleType)) {
            float f4 = this.mViewHeight / height;
            matrix.setScale(f4, f4);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if ("aspectRight".equals(this.mScaleType)) {
            float f5 = this.mViewHeight / height;
            matrix.setScale(f5, f5);
            matrix.postTranslate(Math.round(this.mViewWidth - (width * f5)), 0.0f);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if ("widthFix".equals(this.mScaleType)) {
            float f6 = this.mViewWidth / width;
            this.mViewHeight = Math.round(height * f6);
            matrix.setScale(f6, f6);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        } else if ("heightFix".equals(this.mScaleType)) {
            float f7 = this.mViewHeight / height;
            this.mViewWidth = Math.round(width * f7);
            matrix.setScale(f7, f7);
            bitmap2 = createBitmapWithMatrix(bitmap, matrix);
        }
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    private Bitmap createBitmapWithMatrix(Bitmap bitmap, Matrix matrix) {
        Object[] objArr = {bitmap, matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2856993f260c8531ea727384acd2cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2856993f260c8531ea727384acd2cd9");
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.mViewWidth, this.mViewHeight, getSafeConfig(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
        return createBitmap;
    }

    private boolean hasRound() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52c701676ff6820734755848d7006f7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52c701676ff6820734755848d7006f7d")).booleanValue();
        }
        for (float f : this.mRoundRadii) {
            if (f > 0.0f) {
                return true;
            }
        }
        return false;
    }

    private static Bitmap.Config getSafeConfig(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae1c76248a0fc76137e4407f1cd5ccc4", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap.Config) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae1c76248a0fc76137e4407f1cd5ccc4") : bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_4444;
    }
}
