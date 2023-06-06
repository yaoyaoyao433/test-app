package com.dianping.picasso;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picasso.model.params.PicassoModelParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoCanvasClipper {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Path mCornerPath;
    protected PicassoModelParams mParams;
    private Bitmap shadowBitmap;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Clippable {
        @NonNull
        PicassoCanvasClipper getClipper();
    }

    public void setViewParam(View view, PicassoModelParams picassoModelParams) {
        Object[] objArr = {view, picassoModelParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bfbecf956ab8101645364b099a4d586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bfbecf956ab8101645364b099a4d586");
            return;
        }
        this.mParams = picassoModelParams;
        setCornerPath();
        if (this.shadowBitmap != null) {
            if (!this.shadowBitmap.isRecycled()) {
                this.shadowBitmap.recycle();
            }
            this.shadowBitmap = null;
        }
        if (picassoModelParams.sdOpacity > 0.0f) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(picassoModelParams.sdColor);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha((int) (picassoModelParams.sdOpacity * 255.0f));
            paint.setShadowLayer(picassoModelParams.sdRadius, picassoModelParams.sdOffsetX, picassoModelParams.sdOffsetY, picassoModelParams.sdColor);
            RectF rectF = new RectF(picassoModelParams.offset, picassoModelParams.offset, picassoModelParams.width + picassoModelParams.offset, picassoModelParams.height + picassoModelParams.offset);
            this.shadowBitmap = Bitmap.createBitmap(picassoModelParams.width + (picassoModelParams.offset * 2), picassoModelParams.height + (picassoModelParams.offset * 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.shadowBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (picassoModelParams.cornerRadii != null) {
                canvas.save();
                Path path = new Path();
                float[] fArr = new float[picassoModelParams.cornerRadii.length];
                for (int i = 0; i < fArr.length; i++) {
                    if (picassoModelParams.cornerRadii[i] > 0.0f) {
                        fArr[i] = picassoModelParams.cornerRadii[i] + (picassoModelParams.borderWidth / 2);
                    }
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawRoundRect(rectF, this.mParams.cornerRadius + (picassoModelParams.borderWidth / 2), this.mParams.cornerRadius + (picassoModelParams.borderWidth / 2), paint);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
                canvas.drawRect(rectF, paint);
                canvas.restore();
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).setClipChildren(false);
            }
        }
    }

    public void setCornerPath() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8459ea31635c0cd9d4dc9976a8e41315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8459ea31635c0cd9d4dc9976a8e41315");
            return;
        }
        float f = this.mParams.borderWidth;
        RectF rectF = new RectF(f, f, this.mParams.width - i, this.mParams.height - i);
        if (this.mParams.cornerRadii != null) {
            this.mCornerPath = new Path();
            this.mCornerPath.addRoundRect(rectF, this.mParams.cornerRadii, Path.Direction.CW);
            this.mCornerPath.close();
        } else if (this.mParams.borderWidth > 0) {
            this.mCornerPath = new Path();
            this.mCornerPath.addRect(rectF, Path.Direction.CW);
            this.mCornerPath.close();
        } else {
            this.mCornerPath = null;
        }
    }

    public void drawShadow(Canvas canvas, View view) {
        Object[] objArr = {canvas, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac4f389f658e75f03431d7f7dd3cc687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac4f389f658e75f03431d7f7dd3cc687");
        } else if (this.shadowBitmap != null) {
            try {
                canvas.drawBitmap(this.shadowBitmap, -this.mParams.offset, -this.mParams.offset, (Paint) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void clip(Canvas canvas, View view) {
        Object[] objArr = {canvas, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "834a0e0be49a101b8bf53188918109bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "834a0e0be49a101b8bf53188918109bc");
        } else if (this.mCornerPath != null) {
            canvas.clipPath(this.mCornerPath);
        }
    }
}
