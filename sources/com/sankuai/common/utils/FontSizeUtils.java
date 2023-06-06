package com.sankuai.common.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FontSizeUtils {
    private static final float MULTIPLE_EXTRA_LARGE = 1.2f;
    private static final float MULTIPLE_LARGER = 1.1f;
    private static final float MULTIPLE_MEDIUM = 1.0f;
    private static final float MULTIPLE_SMALL = 0.9f;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void setTextSize(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8a8c015fbf308693e37053fa4ff2ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8a8c015fbf308693e37053fa4ff2ad7");
        } else if (i == i2) {
        } else {
            float textSizeMultiple = getTextSizeMultiple(i);
            float textSizeMultiple2 = getTextSizeMultiple(i2);
            if (view instanceof TextView) {
                setTextSize((TextView) view, textSizeMultiple, textSizeMultiple2);
            } else if (view instanceof ViewGroup) {
                setTextSize((ViewGroup) view, textSizeMultiple, textSizeMultiple2);
            }
        }
    }

    public static void setTextSize(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b14cbd4fd7785a8768b85a7aeb8d052c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b14cbd4fd7785a8768b85a7aeb8d052c");
        } else {
            setTextSize(view, i, FontSize.MEDIUME.index);
        }
    }

    public static float getTextSizeMultiple(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f81aff7592f46651d4b912ae289f1b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f81aff7592f46651d4b912ae289f1b9a")).floatValue();
        }
        if (i == FontSize.SMALL.getIndex()) {
            return MULTIPLE_SMALL;
        }
        if (i == FontSize.LARGE.getIndex()) {
            return MULTIPLE_LARGER;
        }
        if (i == FontSize.EXTRA_LARGE.getIndex()) {
            return MULTIPLE_EXTRA_LARGE;
        }
        return 1.0f;
    }

    private static void setTextSize(TextView textView, float f, float f2) {
        Object[] objArr = {textView, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00bc7114bad5212bc6bbc657288c0b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00bc7114bad5212bc6bbc657288c0b4f");
        } else {
            textView.setTextSize(0, (textView.getTextSize() * f) / f2);
        }
    }

    private static void setTextSize(ViewGroup viewGroup, float f, float f2) {
        Object[] objArr = {viewGroup, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03706e80153bf310ee7f798f5f1af17e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03706e80153bf310ee7f798f5f1af17e");
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                setTextSize((TextView) childAt, f, f2);
            } else if (childAt instanceof ViewGroup) {
                setTextSize((ViewGroup) childAt, f, f2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum FontSize {
        SMALL(0),
        MEDIUME(1),
        LARGE(2),
        EXTRA_LARGE(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int index;

        public static FontSize valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc506129525811bc976be66eccd1fe33", RobustBitConfig.DEFAULT_VALUE) ? (FontSize) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc506129525811bc976be66eccd1fe33") : (FontSize) Enum.valueOf(FontSize.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FontSize[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c07d281d203b23dbcfbda7743625da70", RobustBitConfig.DEFAULT_VALUE) ? (FontSize[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c07d281d203b23dbcfbda7743625da70") : (FontSize[]) values().clone();
        }

        FontSize(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec4ff3909da07864058156f76c9c7fc1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec4ff3909da07864058156f76c9c7fc1");
            } else {
                this.index = i;
            }
        }

        public final int getIndex() {
            return this.index;
        }
    }
}
