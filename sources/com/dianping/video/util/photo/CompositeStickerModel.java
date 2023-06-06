package com.dianping.video.util.photo;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class CompositeStickerModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Bitmap stickerBitmap;
    public double stickerLeftMargin;
    public float stickerRotation;
    public double stickerSizeRatioHeight;
    public double stickerSizeRatioWidth;
    public double stickerTopMargin;

    public CompositeStickerModel(Bitmap bitmap, double d, double d2, float f, double d3, double d4) {
        Object[] objArr = {bitmap, Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6433e470a7405c395a5bc842a5b8b59c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6433e470a7405c395a5bc842a5b8b59c");
            return;
        }
        this.stickerBitmap = bitmap;
        this.stickerSizeRatioWidth = d;
        this.stickerSizeRatioHeight = d2;
        this.stickerRotation = f;
        this.stickerLeftMargin = d3;
        this.stickerTopMargin = d4;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a40b4273f6eb584488d6bd7ab0b9521", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a40b4273f6eb584488d6bd7ab0b9521");
        }
        return "CompositeStickerModel{stickerBitmap=" + this.stickerBitmap + ", stickerSizeRatioWidth=" + this.stickerSizeRatioWidth + ", stickerSizeRatioHeight=" + this.stickerSizeRatioHeight + ", stickerRotation=" + this.stickerRotation + ", stickerLeftMargin=" + this.stickerLeftMargin + ", stickerTopMargin=" + this.stickerTopMargin + '}';
    }
}
