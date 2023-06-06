package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class PathView extends RenderableView {
    private Path mPath;

    public PathView(ReactContext reactContext) {
        super(reactContext);
        PathParser.mScale = this.mScale;
        this.mPath = new Path();
    }

    @ReactProp(name = "d")
    public void setD(String str) {
        this.mPath = PathParser.parse(str);
        this.elements = PathParser.elements;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.mPath;
    }
}
