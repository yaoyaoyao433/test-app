package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class DefsView extends DefinitionView {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.DefinitionView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
    }

    public DefsView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
