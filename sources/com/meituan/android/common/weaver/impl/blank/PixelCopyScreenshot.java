package com.meituan.android.common.weaver.impl.blank;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.WorkerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.weaver.impl.blank.Screenshot;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
@RequiresApi(api = 26)
/* loaded from: classes2.dex */
public class PixelCopyScreenshot implements Screenshot {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Handler mBgHandler;
    private final AtomicBoolean mDestroyed;
    private final AutoLooper mLooper;
    private int scale;

    public PixelCopyScreenshot(@NonNull AutoLooper autoLooper) {
        Object[] objArr = {autoLooper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "891a410f504ffb188fa85fa3bf566bcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "891a410f504ffb188fa85fa3bf566bcc");
            return;
        }
        this.scale = 10;
        this.mDestroyed = new AtomicBoolean(false);
        this.mLooper = autoLooper;
        this.mBgHandler = new Handler(autoLooper.acquireLooper());
    }

    @NonNull
    public List<SurfaceView> findAllSurfaceView(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b027fbbb577e51d7ad6b4f3f79d71882", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b027fbbb577e51d7ad6b4f3f79d71882");
        }
        if (view instanceof ViewGroup) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add((ViewGroup) view);
            while (true) {
                ViewGroup viewGroup = (ViewGroup) linkedList2.poll();
                if (viewGroup == null) {
                    break;
                }
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof SurfaceView) {
                        linkedList.add((SurfaceView) childAt);
                    } else if (childAt instanceof ViewGroup) {
                        linkedList2.add((ViewGroup) childAt);
                    }
                }
            }
            return linkedList.isEmpty() ? Collections.emptyList() : linkedList;
        }
        return Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    @Override // com.meituan.android.common.weaver.impl.blank.Screenshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void screenShot(@android.support.annotation.NonNull android.view.Window r19, @android.support.annotation.NonNull android.view.View r20, @android.support.annotation.NonNull com.meituan.android.common.weaver.impl.blank.Screenshot.ScreenshotDoneListener r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.weaver.impl.blank.PixelCopyScreenshot.screenShot(android.view.Window, android.view.View, com.meituan.android.common.weaver.impl.blank.Screenshot$ScreenshotDoneListener):void");
    }

    @Override // com.meituan.android.common.weaver.impl.blank.Screenshot
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b9886c0e7dcfbd4de5f1b796d8f41aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b9886c0e7dcfbd4de5f1b796d8f41aa");
        } else if (this.mDestroyed.compareAndSet(false, true)) {
            this.mLooper.releaseLooper();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ScreenshotResult implements PixelCopy.OnPixelCopyFinishedListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Bitmap mBaseBitmap;
        private final Screenshot.ScreenshotDoneListener mListener;
        private final AtomicInteger mScreenshotNum;
        private final List<Screenshot.SubBitmap> mSubBitmaps;
        private boolean success;

        public ScreenshotResult(int i, @NonNull Screenshot.ScreenshotDoneListener screenshotDoneListener) {
            Object[] objArr = {Integer.valueOf(i), screenshotDoneListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "790be2029f11cbcb77d0e07c9bbb8ee2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "790be2029f11cbcb77d0e07c9bbb8ee2");
                return;
            }
            this.success = true;
            this.mScreenshotNum = new AtomicInteger(i + 1);
            if (i == 0) {
                this.mSubBitmaps = Collections.emptyList();
            } else {
                this.mSubBitmaps = new LinkedList();
            }
            this.mListener = screenshotDoneListener;
        }

        public void addBitmap(int i, int i2, Bitmap bitmap) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88203f017076f2aea93050e2b19dafec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88203f017076f2aea93050e2b19dafec");
            } else {
                this.mSubBitmaps.add(new Screenshot.SubBitmap(i, i2, bitmap));
            }
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        @WorkerThread
        public void onPixelCopyFinished(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbcf0005d617907e4fc908914782b0f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbcf0005d617907e4fc908914782b0f2");
                return;
            }
            if (i != 0) {
                this.success = false;
            }
            if (this.mScreenshotNum.decrementAndGet() != 0) {
                return;
            }
            if (this.success) {
                this.mListener.onScreenshotDone(0, Screenshots.merge(this.mBaseBitmap, this.mSubBitmaps));
            } else {
                this.mListener.onScreenshotDone(-10, null);
            }
        }
    }
}
