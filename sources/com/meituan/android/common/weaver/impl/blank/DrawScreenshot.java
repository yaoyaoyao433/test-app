package com.meituan.android.common.weaver.impl.blank;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.android.common.weaver.impl.blank.Screenshot;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DrawScreenshot implements Screenshot {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Executor sExecutor = c.a("weaver-blank");
    private int scale;

    @Override // com.meituan.android.common.weaver.impl.blank.Screenshot
    public void destroy() {
    }

    public DrawScreenshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4587c64ccdd06f5f19caca663048aa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4587c64ccdd06f5f19caca663048aa7");
        } else {
            this.scale = 10;
        }
    }

    @NonNull
    private Pair<List<SurfaceView>, List<TextureView>> findAllSurfaceAndTextureView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b29be5b098d37f14a20133952673cd44", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b29be5b098d37f14a20133952673cd44");
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (view instanceof ViewGroup) {
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add((ViewGroup) view);
            while (true) {
                ViewGroup viewGroup = (ViewGroup) linkedList3.poll();
                if (viewGroup == null) {
                    break;
                }
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof SurfaceView) {
                        linkedList.add((SurfaceView) childAt);
                    } else if (childAt instanceof TextureView) {
                        linkedList2.add((TextureView) childAt);
                    } else if (childAt instanceof ViewGroup) {
                        linkedList3.add((ViewGroup) childAt);
                    }
                }
            }
        }
        return new Pair<>(linkedList, linkedList2);
    }

    @Override // com.meituan.android.common.weaver.impl.blank.Screenshot
    public void screenShot(@NonNull Window window, @NonNull View view, @NonNull final Screenshot.ScreenshotDoneListener screenshotDoneListener) {
        final List list;
        Object[] objArr = {window, view, screenshotDoneListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f34b25c198b7cd1806c1bd19d88f4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f34b25c198b7cd1806c1bd19d88f4b0");
            return;
        }
        Pair<List<SurfaceView>, List<TextureView>> findAllSurfaceAndTextureView = findAllSurfaceAndTextureView(view);
        if (findAllSurfaceAndTextureView.first.size() > 0) {
            b.a(sExecutor, new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.DrawScreenshot.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ecbd1a007cbeb598b95b08e9a150f267", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ecbd1a007cbeb598b95b08e9a150f267");
                    } else {
                        screenshotDoneListener.onScreenshotDone(-15, null);
                    }
                }
            });
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        final Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth() / this.scale, view.getMeasuredHeight() / this.scale, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / this.scale, 1.0f / this.scale);
        view.draw(canvas);
        if (findAllSurfaceAndTextureView.second.isEmpty()) {
            list = Collections.emptyList();
        } else {
            LinkedList linkedList = new LinkedList();
            int[] iArr2 = new int[2];
            for (TextureView textureView : findAllSurfaceAndTextureView.second) {
                textureView.getLocationOnScreen(iArr2);
                Bitmap bitmap = textureView.getBitmap(textureView.getMeasuredWidth() / this.scale, textureView.getMeasuredHeight() / this.scale);
                if (bitmap != null) {
                    linkedList.add(new Screenshot.SubBitmap((iArr2[0] - iArr[0]) / this.scale, (iArr2[1] - iArr[1]) / this.scale, bitmap));
                }
            }
            list = linkedList;
        }
        b.a(sExecutor, new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.DrawScreenshot.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77e3fcbb48b9e477fd7d12ba03d118b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77e3fcbb48b9e477fd7d12ba03d118b7");
                    return;
                }
                screenshotDoneListener.onScreenshotDone(0, Screenshots.merge(createBitmap, list));
            }
        });
    }
}
