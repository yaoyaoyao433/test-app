package com.meituan.msc.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.SoftAssertions;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final TypedValue b = new TypedValue();

    @TargetApi(21)
    public static Drawable a(Context context, ReadableMap readableMap) {
        int color;
        Drawable colorDrawable;
        RippleDrawable rippleDrawable;
        Drawable drawable;
        Object[] objArr = {context, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cefe7b752c4387e7d78990a73e5a950", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cefe7b752c4387e7d78990a73e5a950");
        }
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            SoftAssertions.assertNotNull(string2);
            int identifier = context.getResources().getIdentifier(string2, "attr", "android");
            if (identifier == 0) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be found in the resource list");
            } else if (!context.getTheme().resolveAttribute(identifier, b, true)) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be resolved into a drawable");
            } else {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "af96d44bc2430becff11b743fa43ed5e", RobustBitConfig.DEFAULT_VALUE)) {
                    drawable = (Drawable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "af96d44bc2430becff11b743fa43ed5e");
                } else if (Build.VERSION.SDK_INT >= 21) {
                    drawable = context.getResources().getDrawable(b.resourceId, context.getTheme());
                } else {
                    drawable = context.getResources().getDrawable(b.resourceId);
                }
                return a(readableMap, drawable);
            }
        } else if ("RippleAndroid".equals(string)) {
            Object[] objArr3 = {context, readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ee9dc1b3b9b0a4e1497d8a68db1ea9aa", RobustBitConfig.DEFAULT_VALUE)) {
                rippleDrawable = (RippleDrawable) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ee9dc1b3b9b0a4e1497d8a68db1ea9aa");
            } else if (Build.VERSION.SDK_INT < 21) {
                throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
            } else {
                Object[] objArr4 = {context, readableMap};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "123e145ae219b9a3361732c9e81d09ed", RobustBitConfig.DEFAULT_VALUE)) {
                    color = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "123e145ae219b9a3361732c9e81d09ed")).intValue();
                } else if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                    color = readableMap.getInt("color");
                } else if (context.getTheme().resolveAttribute(16843820, b, true)) {
                    color = context.getResources().getColor(b.resourceId);
                } else {
                    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
                Object[] objArr5 = {readableMap};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ed75cc70b5424e4a6c1e30d1cf8fb358", RobustBitConfig.DEFAULT_VALUE)) {
                    colorDrawable = (Drawable) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ed75cc70b5424e4a6c1e30d1cf8fb358");
                } else {
                    colorDrawable = (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : new ColorDrawable(-1);
                }
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, colorDrawable);
            }
            return a(readableMap, rippleDrawable);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
    }

    private static Drawable a(ReadableMap readableMap, Drawable drawable) {
        Object[] objArr = {readableMap, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc6033106d259623fbcfc466f372523b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc6033106d259623fbcfc466f372523b");
        }
        if (Build.VERSION.SDK_INT >= 23 && readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) s.a(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
