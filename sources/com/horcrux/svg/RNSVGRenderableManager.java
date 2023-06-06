package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.f;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.statistics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNSVGRenderableManager extends ReactContextBaseJavaModule {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNSVGRenderableManager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        float f = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_X)) * f, ((float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y)) * f}) != -1;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d = renderableViewByTag.mScale;
            int i2 = (int) (readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) * d);
            int i3 = (int) (readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) * d);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i2, i3);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getTotalLength(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return 0.0f;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0f;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float f = (float) readableMap.getDouble("length");
            float f2 = renderableViewByTag.mScale;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max(0.0f, Math.min(f, pathMeasure.getLength())), fArr, fArr2);
            double atan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(Constants.GestureMoveEvent.KEY_X, fArr[0] / f2);
            createMap.putDouble(Constants.GestureMoveEvent.KEY_Y, fArr[1] / f2);
            createMap.putDouble(LinearGradientManager.PROP_ANGLE, atan2);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(int i, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z = readableMap.getBoolean("fill");
        boolean z2 = readableMap.getBoolean("stroke");
        boolean z3 = readableMap.getBoolean("markers");
        boolean z4 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z2 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z3 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z4 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(Constants.GestureMoveEvent.KEY_X, rectF.left / f);
            createMap.putDouble(Constants.GestureMoveEvent.KEY_Y, rectF.top / f);
            createMap.putDouble("width", rectF.width() / f);
            createMap.putDouble("height", rectF.height() / f);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        matrix.preConcat(renderableViewByTag.getSvgView().mInvViewBoxMatrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble(c.a, fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f);
        createMap.putDouble("f", fArr[5] / f);
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(int i) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.mCTM.getValues(fArr);
        float f = renderableViewByTag.mScale;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble(c.a, fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f);
        createMap.putDouble("f", fArr[5] / f);
        return createMap;
    }

    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, f.a);
            char[] cArr = new char[4096];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 4096);
                if (read != -1) {
                    sb.append(cArr, 0, read);
                } else {
                    promise.resolve(sb.toString());
                    try {
                        openRawResource.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject(e);
        }
    }
}
