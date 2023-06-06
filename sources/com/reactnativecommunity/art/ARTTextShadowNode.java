package com.reactnativecommunity.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.android.recce.props.gens.FontWeight;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ARTTextShadowNode extends ARTShapeShadowNode {
    @Nullable
    private ReadableMap i;
    private int j = 0;

    @ReactProp(name = JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME)
    public void setFrame(@Nullable ReadableMap readableMap) {
        this.i = readableMap;
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.j = i;
    }

    @Override // com.reactnativecommunity.art.ARTShapeShadowNode, com.reactnativecommunity.art.ARTVirtualNode
    public final void a(Canvas canvas, Paint paint, float f) {
        ReadableArray array;
        if (this.i == null) {
            return;
        }
        float f2 = f * this.b;
        if (f2 > 0.01f && this.i.hasKey("lines") && (array = this.i.getArray("lines")) != null && array.size() != 0) {
            a(canvas);
            String[] strArr = new String[array.size()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = array.getString(i);
            }
            String join = TextUtils.join("\n", strArr);
            if (a(paint, f2)) {
                a(paint);
                if (this.a == null) {
                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(join, this.a, 0.0f, 0.0f, paint);
                }
            }
            if (b(paint, f2)) {
                a(paint);
                if (this.a == null) {
                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(join, this.a, 0.0f, 0.0f, paint);
                }
            }
            if (this.d > 0.0f) {
                paint.setShadowLayer(this.e, this.f, this.g, this.c);
            }
            canvas.restore();
            markUpdateSeen();
        }
    }

    private void a(Paint paint) {
        ReadableMap map;
        switch (this.j) {
            case 0:
                paint.setTextAlign(Paint.Align.LEFT);
                break;
            case 1:
                paint.setTextAlign(Paint.Align.RIGHT);
                break;
            case 2:
                paint.setTextAlign(Paint.Align.CENTER);
                break;
        }
        if (this.i == null || !this.i.hasKey("font") || (map = this.i.getMap("font")) == null) {
            return;
        }
        paint.setTextSize((map.hasKey("fontSize") ? (float) map.getDouble("fontSize") : 12.0f) * this.h);
        int i = 1;
        boolean z = map.hasKey(FontWeight.LOWER_CASE_NAME) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(map.getString(FontWeight.LOWER_CASE_NAME));
        boolean z2 = map.hasKey("fontStyle") && DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(map.getString("fontStyle"));
        if (z && z2) {
            i = 3;
        } else if (!z) {
            i = z2 ? 2 : 0;
        }
        paint.setTypeface(Typeface.create(map.getString("fontFamily"), i));
    }
}
