package com.dianping.shield.component.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import java.lang.ref.SoftReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationsContainer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int FPS;
    private boolean isRecycle;
    private Context mContext;
    private int resId;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnAnimationStoppedListener {
        void AnimationStopped();
    }

    public AnimationsContainer(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26736cc7dc175d9b888e1afdb5adddb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26736cc7dc175d9b888e1afdb5adddb6");
            return;
        }
        this.FPS = 58;
        this.mContext = context;
        setResId(i, i2);
    }

    public void isRecycle(boolean z) {
        this.isRecycle = z;
    }

    public void setResId(int i, int i2) {
        this.resId = i;
        this.FPS = i2;
    }

    private int[] getData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d33db361423e88c7f76d022d81e217a", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d33db361423e88c7f76d022d81e217a");
        }
        TypedArray obtainTypedArray = this.mContext.getResources().obtainTypedArray(i);
        int length = obtainTypedArray.length();
        int[] iArr = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = obtainTypedArray.getResourceId(i2, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    public FramesSequenceAnimation createProgressDialogAnim(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92368e245e44cf3b9fbc6691c2e72928", RobustBitConfig.DEFAULT_VALUE) ? (FramesSequenceAnimation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92368e245e44cf3b9fbc6691c2e72928") : new FramesSequenceAnimation(imageView, getData(this.resId), this.FPS);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class FramesSequenceAnimation {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Bitmap mBitmap;
        private BitmapFactory.Options mBitmapOptions;
        private int mDelayMillis;
        private int[] mFrames;
        private Handler mHandler;
        private int mIndex;
        private boolean mIsRunning;
        private OnAnimationStoppedListener mOnAnimationStoppedListener;
        private boolean mShouldRun;
        private SoftReference<ImageView> mSoftReferenceImageView;
        private Runnable runnable;

        public FramesSequenceAnimation(ImageView imageView, int[] iArr, int i) {
            Object[] objArr = {AnimationsContainer.this, imageView, iArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a9bd7c95f676af966b33feca0e4625c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a9bd7c95f676af966b33feca0e4625c");
                return;
            }
            this.mHandler = new Handler();
            this.mFrames = iArr;
            this.mIndex = -1;
            this.mSoftReferenceImageView = new SoftReference<>(imageView);
            this.mShouldRun = false;
            this.mIsRunning = false;
            this.mDelayMillis = 1000 / i;
            imageView.setImageResource(this.mFrames[0]);
            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            this.mBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            this.mBitmapOptions = new BitmapFactory.Options();
            this.mBitmapOptions.inBitmap = this.mBitmap;
            this.mBitmapOptions.inMutable = true;
            this.mBitmapOptions.inSampleSize = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getNext() {
            this.mIndex++;
            if (this.mIndex >= this.mFrames.length) {
                this.mIndex = 0;
            }
            return this.mFrames[this.mIndex];
        }

        public synchronized void start() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8cdd0ad99c47f8a0cbfef8b59266f65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8cdd0ad99c47f8a0cbfef8b59266f65");
                return;
            }
            this.mShouldRun = true;
            if (this.mIsRunning) {
                return;
            }
            this.runnable = new Runnable() { // from class: com.dianping.shield.component.utils.AnimationsContainer.FramesSequenceAnimation.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmap;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "822d75bbebd023cd0d44a420d48140f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "822d75bbebd023cd0d44a420d48140f5");
                        return;
                    }
                    ImageView imageView = (ImageView) FramesSequenceAnimation.this.mSoftReferenceImageView.get();
                    if (!FramesSequenceAnimation.this.mShouldRun || imageView == null || (!AnimationsContainer.this.isRecycle && FramesSequenceAnimation.this.mIndex == FramesSequenceAnimation.this.mFrames.length - 1)) {
                        FramesSequenceAnimation.this.mIsRunning = false;
                        FramesSequenceAnimation.this.mIndex = -1;
                        if (FramesSequenceAnimation.this.mOnAnimationStoppedListener != null) {
                            FramesSequenceAnimation.this.mOnAnimationStoppedListener.AnimationStopped();
                            return;
                        }
                        return;
                    }
                    FramesSequenceAnimation.this.mIsRunning = true;
                    FramesSequenceAnimation.this.mHandler.postDelayed(this, FramesSequenceAnimation.this.mDelayMillis);
                    if (imageView.isShown()) {
                        int next = FramesSequenceAnimation.this.getNext();
                        if (FramesSequenceAnimation.this.mBitmap != null) {
                            try {
                                bitmap = a.a(imageView.getResources(), next, FramesSequenceAnimation.this.mBitmapOptions);
                            } catch (Exception e) {
                                e.printStackTrace();
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                imageView.setImageBitmap(bitmap);
                                return;
                            }
                            imageView.setImageResource(next);
                            FramesSequenceAnimation.this.mBitmap.recycle();
                            FramesSequenceAnimation.this.mBitmap = null;
                            return;
                        }
                        imageView.setImageResource(next);
                    }
                }
            };
            this.mHandler.post(this.runnable);
        }

        public synchronized void stop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63ee21ab7e5fece1895ed9fa3045e9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63ee21ab7e5fece1895ed9fa3045e9c");
                return;
            }
            this.mShouldRun = false;
            this.mIsRunning = false;
            this.mIndex = -1;
            if (this.mHandler != null && this.runnable != null) {
                this.mHandler.removeCallbacks(this.runnable);
                this.runnable = null;
            }
        }

        public void setOnAnimStopListener(OnAnimationStoppedListener onAnimationStoppedListener) {
            this.mOnAnimationStoppedListener = onAnimationStoppedListener;
        }
    }
}
