package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    private static final TypedValue a = new TypedValue();

    @TargetApi(21)
    public static Drawable a(Context context, ReadableMap readableMap) {
        int color;
        Drawable drawable;
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            SoftAssertions.assertNotNull(string2);
            int identifier = context.getResources().getIdentifier(string2, "attr", "android");
            if (identifier == 0) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be found in the resource list");
            } else if (!context.getTheme().resolveAttribute(identifier, a, true)) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be resolved into a drawable");
            } else {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = context.getResources().getDrawable(a.resourceId, context.getTheme());
                } else {
                    drawable = context.getResources().getDrawable(a.resourceId);
                }
                return a(readableMap, drawable);
            }
        } else if (!"RippleAndroid".equals(string)) {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        } else if (Build.VERSION.SDK_INT < 21) {
            throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
        } else {
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                color = readableMap.getInt("color");
            } else if (context.getTheme().resolveAttribute(16843820, a, true)) {
                color = context.getResources().getColor(a.resourceId);
            } else {
                throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
            }
            return a(readableMap, new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : new ColorDrawable(-1)));
        }
    }

    private static Drawable a(ReadableMap readableMap, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) w.a((float) readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
