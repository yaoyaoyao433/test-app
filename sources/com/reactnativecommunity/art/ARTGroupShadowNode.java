package com.reactnativecommunity.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ARTGroupShadowNode extends ARTVirtualNode {
    @Nullable
    protected RectF a;

    @Override // com.reactnativecommunity.art.ARTVirtualNode, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "clipping")
    public void setClipping(@Nullable ReadableArray readableArray) {
        float[] a = b.a(readableArray);
        if (a != null) {
            if (a.length == 4) {
                this.a = new RectF(a[0], a[1], a[0] + a[2], a[1] + a[3]);
                markUpdated();
                return;
            }
            throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
        }
    }

    @Override // com.reactnativecommunity.art.ARTVirtualNode
    public final void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.b;
        if (f2 > 0.01f) {
            a(canvas);
            if (this.a != null) {
                canvas.clipRect(this.a.left * this.h, this.a.top * this.h, this.a.right * this.h, this.a.bottom * this.h, Region.Op.REPLACE);
            }
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.a(canvas, paint, f2);
                aRTVirtualNode.markUpdateSeen();
            }
            canvas.restore();
        }
    }
}
