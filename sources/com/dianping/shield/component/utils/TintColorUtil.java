package com.dianping.shield.component.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TintColorUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void setTintColor(ImageView imageView, @ColorInt int i) {
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4da0e584786fd14df06b43048f03151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4da0e584786fd14df06b43048f03151");
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setTintColor(ImageView imageView, @ColorInt int i, PorterDuff.Mode mode) {
        Object[] objArr = {imageView, Integer.valueOf(i), mode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53e1b8822b99b9ffca0fb256d0bd837c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53e1b8822b99b9ffca0fb256d0bd837c");
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
        }
    }

    public static void setTintColor(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d05ed7906260b717e2f7030a4e79b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d05ed7906260b717e2f7030a4e79b20");
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setTintColor(ImageView imageView, Context context, @ColorRes int i) {
        Object[] objArr = {imageView, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7cde44612931f88d66d9101319e4027b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7cde44612931f88d66d9101319e4027b");
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, i), PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setTintColor(Drawable drawable, @ColorInt int i) {
        Object[] objArr = {drawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2cc7507ffd98ae70598408a0b07b9d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2cc7507ffd98ae70598408a0b07b9d5d");
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setTintColor(Drawable drawable, @ColorInt int i, PorterDuff.Mode mode) {
        Object[] objArr = {drawable, Integer.valueOf(i), mode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6b55df06ad3f5a828cd345e3fef945b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6b55df06ad3f5a828cd345e3fef945b");
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        }
    }

    public static void setTintColor(Drawable drawable, String str) {
        Object[] objArr = {drawable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96b37f5c36abca3f4054a258ecd63b0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96b37f5c36abca3f4054a258ecd63b0f");
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setTintColor(Drawable drawable, Context context, @ColorRes int i) {
        Object[] objArr = {drawable, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "181f7f72db2e972c7d7a779af4a601ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "181f7f72db2e972c7d7a779af4a601ae");
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, i), PorterDuff.Mode.SRC_IN));
        }
    }
}
