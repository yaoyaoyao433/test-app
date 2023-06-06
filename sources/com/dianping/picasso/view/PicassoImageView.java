package com.dianping.picasso.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.dianping.imagemanager.DPImageView;
import com.dianping.imagemanager.image.cache.c;
import com.dianping.imagemanager.utils.downloadphoto.a;
import com.dianping.imagemanager.utils.downloadphoto.d;
import com.dianping.picasso.PicassoCanvasClipper;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.params.ImageViewParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoImageView extends DPImageView implements PicassoCanvasClipper.Clippable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float blurRadius;
    private PicassoCanvasClipper clipper;
    private ImageDownloadListener downloadListener;
    private boolean failedRetry;
    private Rect mEdgeInsetRect;
    private float mScale;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ImageDownloadListener {
        void onDownloadFail();

        void onDownloadSuccess(float f, float f2);
    }

    public PicassoImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1616e854269118c95a4da85a41f3f20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1616e854269118c95a4da85a41f3f20");
            return;
        }
        this.mEdgeInsetRect = new Rect();
        this.mScale = 3.0f;
        this.blurRadius = 0.0f;
    }

    public PicassoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70c666e830ac7cece3bf1b0c5f5aeccf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70c666e830ac7cece3bf1b0c5f5aeccf");
            return;
        }
        this.mEdgeInsetRect = new Rect();
        this.mScale = 3.0f;
        this.blurRadius = 0.0f;
    }

    public PicassoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e871d9e16f38bf27142fa7b185c6e8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e871d9e16f38bf27142fa7b185c6e8b");
            return;
        }
        this.mEdgeInsetRect = new Rect();
        this.mScale = 3.0f;
        this.blurRadius = 0.0f;
    }

    @Override // com.dianping.imagemanager.DPImageView
    public void onDownloadSucceed(a aVar, d dVar) {
        Bitmap bitmap;
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b3fe09a45ed60ae935fc2baf2efe39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b3fe09a45ed60ae935fc2baf2efe39");
            return;
        }
        setPlaceholderScaleType(ImageView.ScaleType.CENTER_CROP);
        a aVar2 = this.request;
        super.onDownloadSucceed(aVar, dVar);
        if (this.downloadListener != null) {
            int i = dVar.b;
            if (aVar == aVar2 && (i == 0 || i == -1)) {
                File a = c.a(aVar.f(), aVar.i());
                if (a != null && a.exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.sankuai.waimai.launcher.util.image.a.a(a.getAbsolutePath(), options);
                    this.downloadListener.onDownloadSuccess(PicassoUtils.px2dp(getContext(), options.outWidth), PicassoUtils.px2dp(getContext(), options.outHeight));
                } else {
                    this.downloadListener.onDownloadSuccess(dVar.d, dVar.e);
                }
            }
        }
        if (PicassoUtils.isRectValid(this.mEdgeInsetRect) && aVar == aVar2 && dVar.b == 0 && (bitmap = (Bitmap) dVar.a()) != null) {
            setImageDrawable(ImageViewParams.getNinePathPathDrawable(getContext(), bitmap, this.mScale, this.mEdgeInsetRect));
        }
    }

    @Override // com.dianping.imagemanager.DPImageView
    public void onDownloadFailed(a aVar, d dVar) {
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1306d960593bfd12b78823efc0bcdd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1306d960593bfd12b78823efc0bcdd1");
            return;
        }
        if (this.failedRetry) {
            setPlaceholderScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        super.onDownloadFailed(aVar, dVar);
        if (this.downloadListener != null) {
            this.downloadListener.onDownloadFail();
        }
    }

    public void setEdgeInset(Rect rect) {
        this.mEdgeInsetRect = rect;
    }

    public void setImageScale(float f) {
        if (f > 0.0f) {
            this.mScale = f;
        }
    }

    @Override // com.dianping.imagemanager.DPImageView
    public DPImageView setNeedReload(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "131d16e63bfa1cb261c3b5a8369743db", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "131d16e63bfa1cb261c3b5a8369743db");
        }
        this.failedRetry = z;
        return super.setNeedReload(z);
    }

    @Override // com.dianping.imagemanager.DPImageView
    public void forceRetry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30fd27e78cee9ffb4b6997b6b2f8232f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30fd27e78cee9ffb4b6997b6b2f8232f");
            return;
        }
        isTargetSizeValid();
        super.forceRetry();
    }

    @Override // com.dianping.imagemanager.DPImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f03b8111b7a72e054db35087492d96c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f03b8111b7a72e054db35087492d96c");
        } else if (this.clipper != null) {
            this.clipper.drawShadow(canvas, this);
            canvas.save();
            this.clipper.clip(canvas, this);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // com.dianping.picasso.PicassoCanvasClipper.Clippable
    @NonNull
    public PicassoCanvasClipper getClipper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "271fa57f4e90a8bdcd460f37b4743f1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoCanvasClipper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "271fa57f4e90a8bdcd460f37b4743f1b");
        }
        if (this.clipper == null) {
            this.clipper = new com.dianping.a();
        }
        return this.clipper;
    }

    public void setImageDownloadListener(ImageDownloadListener imageDownloadListener) {
        Object[] objArr = {imageDownloadListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba8cad36b452c365b2844810b1709659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba8cad36b452c365b2844810b1709659");
            return;
        }
        this.downloadListener = imageDownloadListener;
        setOnAnimatedImageStateChangeListener(new com.dianping.imagemanager.animated.c() { // from class: com.dianping.picasso.view.PicassoImageView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.imagemanager.animated.c
            public void OnAnimationEnd() {
            }

            @Override // com.dianping.imagemanager.animated.c
            public void OnAnimationStart() {
            }

            @Override // com.dianping.imagemanager.animated.c
            public void OnPrepared(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c790bee91790c9e3a5a714914ee3ba30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c790bee91790c9e3a5a714914ee3ba30");
                } else {
                    PicassoImageView.this.downloadListener.onDownloadSuccess(PicassoUtils.px2dp(PicassoImageView.this.getContext(), i), PicassoUtils.px2dp(PicassoImageView.this.getContext(), i2));
                }
            }
        });
    }
}
