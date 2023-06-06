package com.sankuai.titans.widget.media.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class TouchImageView extends ImageView {
    private static final String DEBUG = "DEBUG";
    private static final float SUPER_MAX_MULTIPLIER = 1.25f;
    private static final float SUPER_MIN_MULTIPLIER = 0.75f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private ZoomVariables delayedZoomVariables;
    private GestureDetector.OnDoubleTapListener doubleTapListener;
    private Fling fling;
    private boolean imageRenderedAtLeastOnce;
    private float[] m;
    private GestureDetector mGestureDetector;
    private ScaleGestureDetector mScaleDetector;
    private ImageView.ScaleType mScaleType;
    private float matchViewHeight;
    private float matchViewWidth;
    private Matrix matrix;
    private float maxScale;
    private float minScale;
    private float normalizedScale;
    private boolean onDrawReady;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    private State state;
    private float superMaxScale;
    private float superMinScale;
    private OnTouchImageViewListener touchImageViewListener;
    private View.OnTouchListener userTouchListener;
    private int viewHeight;
    private int viewWidth;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnTouchImageViewListener {
        void onMove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFixDragTrans(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    private float getFixTrans(float f, float f2, float f3) {
        float f4;
        float f5;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1bc6fca51b95209a42894ef435a4919", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1bc6fca51b95209a42894ef435a4919")).floatValue();
        }
        if (f3 <= f2) {
            f5 = f2 - f3;
            f4 = 0.0f;
        } else {
            f4 = f2 - f3;
            f5 = 0.0f;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum State {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        State() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cbd4cc07d9adac6c6f4de1d138f2bff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cbd4cc07d9adac6c6f4de1d138f2bff");
            }
        }

        public static State valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76b500ead817fcb430c0823df827e470", RobustBitConfig.DEFAULT_VALUE) ? (State) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76b500ead817fcb430c0823df827e470") : (State) Enum.valueOf(State.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0905a2e90faf5dc912090bdac1782eb7", RobustBitConfig.DEFAULT_VALUE) ? (State[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0905a2e90faf5dc912090bdac1782eb7") : (State[]) values().clone();
        }
    }

    public TouchImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8f7616dd35ac59d7938bd3a1a4af7ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8f7616dd35ac59d7938bd3a1a4af7ca");
            return;
        }
        this.doubleTapListener = null;
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "031ed02643961ab921f2fe880bd8532e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "031ed02643961ab921f2fe880bd8532e");
            return;
        }
        this.doubleTapListener = null;
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5906cab4af088d4cdfdc0dc7a31575a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5906cab4af088d4cdfdc0dc7a31575a");
            return;
        }
        this.doubleTapListener = null;
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    private void sharedConstructing(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95cf147a745d0ab28d1141913c5c09d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95cf147a745d0ab28d1141913c5c09d4");
            return;
        }
        super.setClickable(true);
        this.context = context;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener(this, null));
        this.mGestureDetector = new GestureDetector(context, new GestureListener(this, null));
        this.matrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.m = new float[9];
        this.normalizedScale = 1.0f;
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = this.minScale * SUPER_MIN_MULTIPLIER;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(State.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener(this, null));
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    public void setOnTouchImageViewListener(OnTouchImageViewListener onTouchImageViewListener) {
        this.touchImageViewListener = onTouchImageViewListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.doubleTapListener = onDoubleTapListener;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a938a5fc7274e94ea05379b54710a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a938a5fc7274e94ea05379b54710a46");
            return;
        }
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2606420e31dc3c48eaf5168b53bd88f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2606420e31dc3c48eaf5168b53bd88f9");
            return;
        }
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "470757984e4fb7e9c6fb3e095abac516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "470757984e4fb7e9c6fb3e095abac516");
            return;
        }
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbd64ba2b7a7449e4302cdbdc3b2f6f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbd64ba2b7a7449e4302cdbdc3b2f6f1");
            return;
        }
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb77c20e296769db39a729c4e956ef39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb77c20e296769db39a729c4e956ef39");
        } else if (scaleType == ImageView.ScaleType.FIT_START || scaleType == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else {
            if (scaleType == ImageView.ScaleType.MATRIX) {
                super.setScaleType(ImageView.ScaleType.MATRIX);
                return;
            }
            this.mScaleType = scaleType;
            if (this.onDrawReady) {
                setZoom(this);
            }
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public boolean isZoomed() {
        return this.normalizedScale != 1.0f;
    }

    public RectF getZoomedRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "632ae57f8c30a294fd9a5ced61cae0b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "632ae57f8c30a294fd9a5ced61cae0b3");
        }
        if (this.mScaleType == ImageView.ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(0.0f, 0.0f, true);
        PointF transformCoordTouchToBitmap2 = transformCoordTouchToBitmap(this.viewWidth, this.viewHeight, true);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        return new RectF(transformCoordTouchToBitmap.x / intrinsicWidth, transformCoordTouchToBitmap.y / intrinsicHeight, transformCoordTouchToBitmap2.x / intrinsicWidth, transformCoordTouchToBitmap2.y / intrinsicHeight);
    }

    private void savePreviousImageValues() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6241daa3b266c45f669b2dfad28d0aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6241daa3b266c45f669b2dfad28d0aa");
        } else if (this.matrix == null || this.viewHeight == 0 || this.viewWidth == 0) {
        } else {
            this.matrix.getValues(this.m);
            this.prevMatrix.setValues(this.m);
            this.prevMatchViewHeight = this.matchViewHeight;
            this.prevMatchViewWidth = this.matchViewWidth;
            this.prevViewHeight = this.viewHeight;
            this.prevViewWidth = this.viewWidth;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e635c9608448bf69c2543c0f87aab2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e635c9608448bf69c2543c0f87aab2");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.normalizedScale);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt(DMKeys.KEY_VIEW_WIDTH, this.viewWidth);
        bundle.putInt(DMKeys.KEY_VIEW_HEIGHT, this.viewHeight);
        this.matrix.getValues(this.m);
        bundle.putFloatArray("matrix", this.m);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1c90767510fd6adbb6ff189da11bdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1c90767510fd6adbb6ff189da11bdf");
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.normalizedScale = bundle.getFloat("saveScale");
            this.m = bundle.getFloatArray("matrix");
            this.prevMatrix.setValues(this.m);
            this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
            this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
            this.prevViewHeight = bundle.getInt(DMKeys.KEY_VIEW_HEIGHT);
            this.prevViewWidth = bundle.getInt(DMKeys.KEY_VIEW_WIDTH);
            this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75dfb68898d155b2a4c7801e841514fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75dfb68898d155b2a4c7801e841514fc");
            return;
        }
        try {
            this.onDrawReady = true;
            this.imageRenderedAtLeastOnce = true;
            if (this.delayedZoomVariables != null) {
                setZoom(this.delayedZoomVariables.scale, this.delayedZoomVariables.focusX, this.delayedZoomVariables.focusY, this.delayedZoomVariables.scaleType);
                this.delayedZoomVariables = null;
            }
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.e("TouchImageView", "onDraw " + th.getMessage());
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6674404becd0260226831f8bfd4a3de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6674404becd0260226831f8bfd4a3de0");
            return;
        }
        super.onConfigurationChanged(configuration);
        savePreviousImageValues();
    }

    public float getMaxZoom() {
        return this.maxScale;
    }

    public void setMaxZoom(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ec27872ad5d95159a2f816c5f33336b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ec27872ad5d95159a2f816c5f33336b");
            return;
        }
        this.maxScale = f;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
    }

    public float getMinZoom() {
        return this.minScale;
    }

    public float getCurrentZoom() {
        return this.normalizedScale;
    }

    public void setMinZoom(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "394ee3d30d3a10082691164faaf8d7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "394ee3d30d3a10082691164faaf8d7c5");
            return;
        }
        this.minScale = f;
        this.superMinScale = this.minScale * SUPER_MIN_MULTIPLIER;
    }

    public void resetZoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b1723d5f21e9d79c332dfc08feab33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b1723d5f21e9d79c332dfc08feab33");
            return;
        }
        this.normalizedScale = 1.0f;
        fitImageToView();
    }

    public void setZoom(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41793cead64e57737c55925b8c2afc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41793cead64e57737c55925b8c2afc12");
        } else {
            setZoom(f, 0.5f, 0.5f);
        }
    }

    public void setZoom(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8164cc4a5e212c19a9490a61a4bad66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8164cc4a5e212c19a9490a61a4bad66");
        } else {
            setZoom(f, f2, f3, this.mScaleType);
        }
    }

    public void setZoom(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3744e9b2985f2befe3f866e3ba71c2a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3744e9b2985f2befe3f866e3ba71c2a3");
        } else if (!this.onDrawReady) {
            this.delayedZoomVariables = new ZoomVariables(f, f2, f3, scaleType);
        } else {
            if (scaleType != this.mScaleType) {
                setScaleType(scaleType);
            }
            resetZoom();
            scaleImage(f, this.viewWidth / 2, this.viewHeight / 2, true);
            this.matrix.getValues(this.m);
            this.m[2] = -((getImageWidth() * f2) - (this.viewWidth * 0.5f));
            this.m[5] = -((getImageHeight() * f3) - (this.viewHeight * 0.5f));
            this.matrix.setValues(this.m);
            fixTrans();
            setImageMatrix(this.matrix);
        }
    }

    public void setZoom(TouchImageView touchImageView) {
        Object[] objArr = {touchImageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42017c9cb3463e3d56d30f0ffc772f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42017c9cb3463e3d56d30f0ffc772f40");
            return;
        }
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }

    public PointF getScrollPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fd8c43164aa17f7019b9d0d08723125", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fd8c43164aa17f7019b9d0d08723125");
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(this.viewWidth / 2, this.viewHeight / 2, true);
        transformCoordTouchToBitmap.x /= intrinsicWidth;
        transformCoordTouchToBitmap.y /= intrinsicHeight;
        return transformCoordTouchToBitmap;
    }

    public void setScrollPosition(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "176122dbb891c49416d843d9c3e46f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "176122dbb891c49416d843d9c3e46f4b");
        } else {
            setZoom(this.normalizedScale, f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixTrans() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efe5c811fc478961785b8400ef92d709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efe5c811fc478961785b8400ef92d709");
            return;
        }
        this.matrix.getValues(this.m);
        float f = this.m[2];
        float f2 = this.m[5];
        float fixTrans = getFixTrans(f, this.viewWidth, getImageWidth());
        float fixTrans2 = getFixTrans(f2, this.viewHeight, getImageHeight());
        if (fixTrans == 0.0f && fixTrans2 == 0.0f) {
            return;
        }
        this.matrix.postTranslate(fixTrans, fixTrans2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixScaleTrans() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb5804d8abf11a5c5d692b62b192737c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb5804d8abf11a5c5d692b62b192737c");
            return;
        }
        fixTrans();
        this.matrix.getValues(this.m);
        if (getImageWidth() < this.viewWidth) {
            this.m[2] = (this.viewWidth - getImageWidth()) / 2.0f;
        }
        if (getImageHeight() < this.viewHeight) {
            this.m[5] = (this.viewHeight - getImageHeight()) / 2.0f;
        }
        this.matrix.setValues(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getImageWidth() {
        return this.matchViewWidth * this.normalizedScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getImageHeight() {
        return this.matchViewHeight * this.normalizedScale;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01126b8d857380692ed9a33678b6a9fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01126b8d857380692ed9a33678b6a9fd");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.viewWidth = setViewSize(mode, size, intrinsicWidth);
        this.viewHeight = setViewSize(mode2, size2, intrinsicHeight);
        setMeasuredDimension(this.viewWidth, this.viewHeight);
        fitImageToView();
    }

    private void fitImageToView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79956a16f9f39ca9eb6d075ae153be4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79956a16f9f39ca9eb6d075ae153be4a");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || this.matrix == null || this.prevMatrix == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f = intrinsicWidth;
        float f2 = this.viewWidth / f;
        float f3 = intrinsicHeight;
        float f4 = this.viewHeight / f3;
        switch (AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()]) {
            case 1:
                f2 = 1.0f;
                f4 = 1.0f;
                break;
            case 2:
                f2 = Math.max(f2, f4);
                f4 = f2;
                break;
            case 3:
                f2 = Math.min(1.0f, Math.min(f2, f4));
                f4 = f2;
            case 4:
                f2 = Math.min(f2, f4);
                f4 = f2;
                break;
            case 5:
                break;
            default:
                throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        }
        float f5 = this.viewWidth - (f2 * f);
        float f6 = this.viewHeight - (f4 * f3);
        this.matchViewWidth = this.viewWidth - f5;
        this.matchViewHeight = this.viewHeight - f6;
        if (!isZoomed() && !this.imageRenderedAtLeastOnce) {
            this.matrix.setScale(f2, f4);
            this.matrix.postTranslate(f5 / 2.0f, f6 / 2.0f);
            this.normalizedScale = 1.0f;
        } else {
            if (this.prevMatchViewWidth == 0.0f || this.prevMatchViewHeight == 0.0f) {
                savePreviousImageValues();
            }
            this.prevMatrix.getValues(this.m);
            this.m[0] = (this.matchViewWidth / f) * this.normalizedScale;
            this.m[4] = (this.matchViewHeight / f3) * this.normalizedScale;
            float f7 = this.m[2];
            float f8 = this.m[5];
            translateMatrixAfterRotate(2, f7, this.prevMatchViewWidth * this.normalizedScale, getImageWidth(), this.prevViewWidth, this.viewWidth, intrinsicWidth);
            translateMatrixAfterRotate(5, f8, this.prevMatchViewHeight * this.normalizedScale, getImageHeight(), this.prevViewHeight, this.viewHeight, intrinsicHeight);
            this.matrix.setValues(this.m);
        }
        fixTrans();
        setImageMatrix(this.matrix);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.titans.widget.media.widget.TouchImageView$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = new int[ImageView.ScaleType.values().length];
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private int setViewSize(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0496366f9f9a9411db0059928594c67c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0496366f9f9a9411db0059928594c67c")).intValue();
        }
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    private void translateMatrixAfterRotate(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e708cba6c0afd0806a41455478612a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e708cba6c0afd0806a41455478612a07");
            return;
        }
        float f4 = i3;
        if (f3 < f4) {
            this.m[i] = (f4 - (i4 * this.m[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.m[i] = -((f3 - f4) * 0.5f);
        } else {
            this.m[i] = -((((Math.abs(f) + (i2 * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        this.state = state;
    }

    public boolean canScrollHorizontallyFroyo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b04148990191a9f9d9f38a0b751a5d26", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b04148990191a9f9d9f38a0b751a5d26")).booleanValue() : canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1185c297974195f32427f8c3a62aa97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1185c297974195f32427f8c3a62aa97")).booleanValue();
        }
        this.matrix.getValues(this.m);
        float f = this.m[2];
        if (getImageWidth() < this.viewWidth) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.viewWidth)) + 1.0f < getImageWidth() || i <= 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public GestureListener() {
            Object[] objArr = {TouchImageView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d14b4f12814bab2b7351b15a0292672", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d14b4f12814bab2b7351b15a0292672");
            }
        }

        public /* synthetic */ GestureListener(TouchImageView touchImageView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc925c0709cdbbb6a02d9669c33a326", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc925c0709cdbbb6a02d9669c33a326")).booleanValue();
            }
            if (TouchImageView.this.doubleTapListener != null) {
                return TouchImageView.this.doubleTapListener.onSingleTapConfirmed(motionEvent);
            }
            return TouchImageView.this.performClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "920d4dafaf93a7153e2c6e8bee763e18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "920d4dafaf93a7153e2c6e8bee763e18");
            } else {
                TouchImageView.this.performLongClick();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "359d6c9da09f03fc4c68fb97c589f4b3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "359d6c9da09f03fc4c68fb97c589f4b3")).booleanValue();
            }
            if (TouchImageView.this.fling != null) {
                TouchImageView.this.fling.cancelFling();
            }
            TouchImageView.this.fling = new Fling((int) f, (int) f2);
            TouchImageView.this.compatPostOnAnimation(TouchImageView.this.fling);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aa8010321feea30d8753057e15ebbca", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aa8010321feea30d8753057e15ebbca")).booleanValue();
            }
            boolean onDoubleTap = TouchImageView.this.doubleTapListener != null ? TouchImageView.this.doubleTapListener.onDoubleTap(motionEvent) : false;
            if (TouchImageView.this.state == State.NONE) {
                float f = TouchImageView.this.normalizedScale == TouchImageView.this.minScale ? TouchImageView.this.maxScale : TouchImageView.this.minScale;
                if (TouchImageView.this.isAttachedToWindow()) {
                    TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(f, motionEvent.getX(), motionEvent.getY(), false));
                    return true;
                }
                return onDoubleTap;
            }
            return onDoubleTap;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dfc9df6d92d8daad4359204e1e14e63", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dfc9df6d92d8daad4359204e1e14e63")).booleanValue();
            }
            if (TouchImageView.this.doubleTapListener != null) {
                return TouchImageView.this.doubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class PrivateOnTouchListener implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private PointF last;

        public PrivateOnTouchListener() {
            Object[] objArr = {TouchImageView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cab53a6433e85d607492903c58750d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cab53a6433e85d607492903c58750d5");
            } else {
                this.last = new PointF();
            }
        }

        public /* synthetic */ PrivateOnTouchListener(TouchImageView touchImageView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "badfe8a39be132a3cc9150888112e2bf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "badfe8a39be132a3cc9150888112e2bf")).booleanValue();
            }
            TouchImageView.this.mScaleDetector.onTouchEvent(motionEvent);
            TouchImageView.this.mGestureDetector.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (TouchImageView.this.state == State.NONE || TouchImageView.this.state == State.DRAG || TouchImageView.this.state == State.FLING) {
                int action = motionEvent.getAction();
                if (action != 6) {
                    switch (action) {
                        case 0:
                            this.last.set(pointF);
                            if (TouchImageView.this.fling != null) {
                                TouchImageView.this.fling.cancelFling();
                            }
                            TouchImageView.this.setState(State.DRAG);
                            break;
                        case 2:
                            if (TouchImageView.this.state == State.DRAG) {
                                TouchImageView.this.matrix.postTranslate(TouchImageView.this.getFixDragTrans(pointF.x - this.last.x, TouchImageView.this.viewWidth, TouchImageView.this.getImageWidth()), TouchImageView.this.getFixDragTrans(pointF.y - this.last.y, TouchImageView.this.viewHeight, TouchImageView.this.getImageHeight()));
                                TouchImageView.this.fixTrans();
                                this.last.set(pointF.x, pointF.y);
                                break;
                            }
                            break;
                    }
                }
                TouchImageView.this.setState(State.NONE);
            }
            TouchImageView.this.setImageMatrix(TouchImageView.this.matrix);
            if (TouchImageView.this.userTouchListener != null) {
                TouchImageView.this.userTouchListener.onTouch(view, motionEvent);
            }
            if (TouchImageView.this.touchImageViewListener != null) {
                TouchImageView.this.touchImageViewListener.onMove();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ScaleListener() {
            Object[] objArr = {TouchImageView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f53d281c6fc9ff633caadb2ff71381", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f53d281c6fc9ff633caadb2ff71381");
            }
        }

        public /* synthetic */ ScaleListener(TouchImageView touchImageView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            Object[] objArr = {scaleGestureDetector};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eb69161fa6a5df7b6e8d29958bbd9f3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eb69161fa6a5df7b6e8d29958bbd9f3")).booleanValue();
            }
            TouchImageView.this.setState(State.ZOOM);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Object[] objArr = {scaleGestureDetector};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c147d0a41316cc8e81f48e2acf51aeac", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c147d0a41316cc8e81f48e2acf51aeac")).booleanValue();
            }
            TouchImageView.this.scaleImage(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (TouchImageView.this.touchImageViewListener != null) {
                TouchImageView.this.touchImageViewListener.onMove();
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            float f;
            float f2;
            boolean z = true;
            Object[] objArr = {scaleGestureDetector};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28dfbfed159fd90c45dd07484a0029ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28dfbfed159fd90c45dd07484a0029ed");
                return;
            }
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(State.NONE);
            float unused = TouchImageView.this.normalizedScale;
            if (TouchImageView.this.normalizedScale > TouchImageView.this.maxScale) {
                f2 = TouchImageView.this.maxScale;
            } else if (TouchImageView.this.normalizedScale < TouchImageView.this.minScale) {
                f2 = TouchImageView.this.minScale;
            } else {
                z = false;
                f = 0.0f;
                if (z || TouchImageView.this.isAttachedToWindow()) {
                }
                TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(f, TouchImageView.this.viewWidth / 2, TouchImageView.this.viewHeight / 2, true));
                return;
            }
            f = f2;
            if (z) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scaleImage(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        double d2;
        Object[] objArr = {Double.valueOf(d), Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7501aeebd81dc1a33b44bbe3a1b7c2c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7501aeebd81dc1a33b44bbe3a1b7c2c0");
            return;
        }
        if (z) {
            f3 = this.superMinScale;
            f4 = this.superMaxScale;
        } else {
            f3 = this.minScale;
            f4 = this.maxScale;
        }
        float f5 = this.normalizedScale;
        this.normalizedScale = (float) (this.normalizedScale * d);
        if (this.normalizedScale > f4) {
            this.normalizedScale = f4;
            d2 = f4 / f5;
        } else if (this.normalizedScale < f3) {
            this.normalizedScale = f3;
            d2 = f3 / f5;
        } else {
            d2 = d;
        }
        float f6 = (float) d2;
        this.matrix.postScale(f6, f6, f, f2);
        fixScaleTrans();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class DoubleTapZoom implements Runnable {
        private static final float ZOOM_TIME = 500.0f;
        public static ChangeQuickRedirect changeQuickRedirect;
        private float bitmapX;
        private float bitmapY;
        private PointF endTouch;
        private AccelerateDecelerateInterpolator interpolator;
        private long startTime;
        private PointF startTouch;
        private float startZoom;
        private boolean stretchImageToSuper;
        private float targetZoom;

        public DoubleTapZoom(float f, float f2, float f3, boolean z) {
            Object[] objArr = {TouchImageView.this, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59fa91610ece3c5875e494a56346ef54", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59fa91610ece3c5875e494a56346ef54");
                return;
            }
            this.interpolator = new AccelerateDecelerateInterpolator();
            TouchImageView.this.setState(State.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = TouchImageView.this.normalizedScale;
            this.targetZoom = f;
            this.stretchImageToSuper = z;
            PointF transformCoordTouchToBitmap = TouchImageView.this.transformCoordTouchToBitmap(f2, f3, false);
            this.bitmapX = transformCoordTouchToBitmap.x;
            this.bitmapY = transformCoordTouchToBitmap.y;
            this.startTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            this.endTouch = new PointF(TouchImageView.this.viewWidth / 2, TouchImageView.this.viewHeight / 2);
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a30f27c7dfd9626bd8968382126fdf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a30f27c7dfd9626bd8968382126fdf6");
            } else if (TouchImageView.this.isAttachedToWindow()) {
                float interpolate = interpolate();
                TouchImageView.this.scaleImage(calculateDeltaScale(interpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
                translateImageToCenterTouchPosition(interpolate);
                TouchImageView.this.fixScaleTrans();
                TouchImageView.this.setImageMatrix(TouchImageView.this.matrix);
                if (TouchImageView.this.touchImageViewListener != null) {
                    TouchImageView.this.touchImageViewListener.onMove();
                }
                if (interpolate < 1.0f) {
                    TouchImageView.this.compatPostOnAnimation(this);
                } else {
                    TouchImageView.this.setState(State.NONE);
                }
            }
        }

        private void translateImageToCenterTouchPosition(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990dacd5332305df8ed5f1000c93c969", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990dacd5332305df8ed5f1000c93c969");
                return;
            }
            float f2 = this.startTouch.x + ((this.endTouch.x - this.startTouch.x) * f);
            float f3 = this.startTouch.y + (f * (this.endTouch.y - this.startTouch.y));
            PointF transformCoordBitmapToTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            TouchImageView.this.matrix.postTranslate(f2 - transformCoordBitmapToTouch.x, f3 - transformCoordBitmapToTouch.y);
        }

        private float interpolate() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "481d9b5985f50339ec79b9e4cb8f3fa1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "481d9b5985f50339ec79b9e4cb8f3fa1")).floatValue();
            }
            return this.interpolator.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.startTime)) / ZOOM_TIME));
        }

        private double calculateDeltaScale(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8722ce20695f64edba1c8c3c4993a05", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8722ce20695f64edba1c8c3c4993a05")).doubleValue() : (this.startZoom + (f * (this.targetZoom - this.startZoom))) / TouchImageView.this.normalizedScale;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF transformCoordTouchToBitmap(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22f75f9b26395c885a5087464b220c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22f75f9b26395c885a5087464b220c96");
        }
        this.matrix.getValues(this.m);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float f3 = this.m[2];
        float f4 = this.m[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF transformCoordBitmapToTouch(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e48ad34cca6038016711fdbd6dd951", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e48ad34cca6038016711fdbd6dd951");
        }
        this.matrix.getValues(this.m);
        return new PointF(this.m[2] + (getImageWidth() * (f / getDrawable().getIntrinsicWidth())), this.m[5] + (getImageHeight() * (f2 / getDrawable().getIntrinsicHeight())));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class Fling implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int currX;
        public int currY;
        public CompatScroller scroller;

        public Fling(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            Object[] objArr = {TouchImageView.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d3ba376cb7896409aa97ab2a2ad678e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d3ba376cb7896409aa97ab2a2ad678e");
                return;
            }
            TouchImageView.this.setState(State.FLING);
            this.scroller = new CompatScroller(TouchImageView.this.context);
            TouchImageView.this.matrix.getValues(TouchImageView.this.m);
            int i7 = (int) TouchImageView.this.m[2];
            int i8 = (int) TouchImageView.this.m[5];
            if (TouchImageView.this.getImageWidth() > TouchImageView.this.viewWidth) {
                i3 = TouchImageView.this.viewWidth - ((int) TouchImageView.this.getImageWidth());
                i4 = 0;
            } else {
                i3 = i7;
                i4 = i3;
            }
            if (TouchImageView.this.getImageHeight() > TouchImageView.this.viewHeight) {
                i5 = TouchImageView.this.viewHeight - ((int) TouchImageView.this.getImageHeight());
                i6 = 0;
            } else {
                i5 = i8;
                i6 = i5;
            }
            this.scroller.fling(i7, i8, i, i2, i3, i4, i5, i6);
            this.currX = i7;
            this.currY = i8;
        }

        public void cancelFling() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd6291ce6f2113473dcf076ade3bb913", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd6291ce6f2113473dcf076ade3bb913");
            } else if (this.scroller != null) {
                TouchImageView.this.setState(State.NONE);
                this.scroller.forceFinished(true);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bcc867bb085f0bf744d5a7108311ea2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bcc867bb085f0bf744d5a7108311ea2");
                return;
            }
            if (TouchImageView.this.touchImageViewListener != null) {
                TouchImageView.this.touchImageViewListener.onMove();
            }
            if (this.scroller.isFinished()) {
                this.scroller = null;
            } else if (this.scroller.computeScrollOffset()) {
                int currX = this.scroller.getCurrX();
                int currY = this.scroller.getCurrY();
                int i = currX - this.currX;
                int i2 = currY - this.currY;
                this.currX = currX;
                this.currY = currY;
                TouchImageView.this.matrix.postTranslate(i, i2);
                TouchImageView.this.fixTrans();
                TouchImageView.this.setImageMatrix(TouchImageView.this.matrix);
                TouchImageView.this.compatPostOnAnimation(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class CompatScroller {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isPreGingerbread;
        public OverScroller overScroller;
        public Scroller scroller;

        public CompatScroller(Context context) {
            Object[] objArr = {TouchImageView.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd3146eda5f16dd6bebe7d4a15c95fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd3146eda5f16dd6bebe7d4a15c95fd");
                return;
            }
            this.isPreGingerbread = false;
            this.overScroller = new OverScroller(context);
        }

        public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6ff9e5d1dff8dc303a0216c2f2afe02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6ff9e5d1dff8dc303a0216c2f2afe02");
            } else if (this.isPreGingerbread) {
                this.scroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
            } else {
                this.overScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
            }
        }

        public void forceFinished(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5938f89b434a16d1a92e51cf0430b27d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5938f89b434a16d1a92e51cf0430b27d");
            } else if (this.isPreGingerbread) {
                this.scroller.forceFinished(z);
            } else {
                this.overScroller.forceFinished(z);
            }
        }

        public boolean isFinished() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d71b2e209eb241f6592fda073959b00", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d71b2e209eb241f6592fda073959b00")).booleanValue();
            }
            if (this.isPreGingerbread) {
                return this.scroller.isFinished();
            }
            return this.overScroller.isFinished();
        }

        public boolean computeScrollOffset() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "555043ea1783c910f1de3d65e4061323", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "555043ea1783c910f1de3d65e4061323")).booleanValue();
            }
            if (this.isPreGingerbread) {
                return this.scroller.computeScrollOffset();
            }
            this.overScroller.computeScrollOffset();
            return this.overScroller.computeScrollOffset();
        }

        public int getCurrX() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f48b5cb0ff5355f4f6ef7f6f58e614bc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f48b5cb0ff5355f4f6ef7f6f58e614bc")).intValue();
            }
            if (this.isPreGingerbread) {
                return this.scroller.getCurrX();
            }
            return this.overScroller.getCurrX();
        }

        public int getCurrY() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51c1d824b705ceecaebc58491383876c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51c1d824b705ceecaebc58491383876c")).intValue();
            }
            if (this.isPreGingerbread) {
                return this.scroller.getCurrY();
            }
            return this.overScroller.getCurrY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void compatPostOnAnimation(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8908c4f3c556620b527d9118cb138dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8908c4f3c556620b527d9118cb138dad");
        } else {
            postOnAnimation(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class ZoomVariables {
        public static ChangeQuickRedirect changeQuickRedirect;
        public float focusX;
        public float focusY;
        public float scale;
        public ImageView.ScaleType scaleType;

        public ZoomVariables(float f, float f2, float f3, ImageView.ScaleType scaleType) {
            this.scale = f;
            this.focusX = f2;
            this.focusY = f3;
            this.scaleType = scaleType;
        }
    }
}
