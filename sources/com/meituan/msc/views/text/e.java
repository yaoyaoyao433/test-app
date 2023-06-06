package com.meituan.msc.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Object[] objArr = {charSequence, layout, textPaint, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08fb09d294662c926e6fb7def35ce2e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08fb09d294662c926e6fb7def35ce2e5");
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double height = (rect.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds(Constants.GestureMoveEvent.KEY_X, 0, 1, new Rect());
        double height2 = (rect2.height() / 100.0f) / displayMetrics.density;
        for (int i = 0; i < layout.getLineCount(); i++) {
            layout.getLineBounds(i, new Rect());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(Constants.GestureMoveEvent.KEY_X, layout.getLineLeft(i) / displayMetrics.density);
            createMap.putDouble(Constants.GestureMoveEvent.KEY_Y, rect3.top / displayMetrics.density);
            createMap.putDouble("width", layout.getLineWidth(i) / displayMetrics.density);
            createMap.putDouble("height", rect3.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            createMap.putDouble("capHeight", height);
            createMap.putDouble("xHeight", height2);
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
