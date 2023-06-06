package com.dianping.shield.dynamic.model.extra;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.h;
import kotlin.text.a;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0080\b\u001a\u000f\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0080\b\u001a\u000f\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\rH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"COLOR_INVALID", "", "parseColor", "colorStr", "", "optColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$StringColor;", "optDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "optGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ColorUnionTypeKt {
    public static final int COLOR_INVALID = Integer.MAX_VALUE;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static final GradientDrawable optGradientDrawable(@NotNull ColorUnionType.GradientColorInfo gradientColorInfo) {
        Object[] objArr = {gradientColorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c831ba98a28c6ba347c845c6ac61f7ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c831ba98a28c6ba347c845c6ac61f7ad");
        }
        h.b(gradientColorInfo, "receiver$0");
        int parseColor = parseColor(gradientColorInfo.getStartColor());
        int parseColor2 = parseColor(gradientColorInfo.getEndColor());
        Integer orientation = gradientColorInfo.getOrientation();
        int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
        if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
            return new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    @Nullable
    public static final ColorDrawable optColorDrawable(@NotNull ColorUnionType.StringColor stringColor) {
        Object[] objArr = {stringColor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "211dbda641ddcbc38fb51a4795aec49a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "211dbda641ddcbc38fb51a4795aec49a");
        }
        h.b(stringColor, "receiver$0");
        return new ColorDrawable(parseColor(stringColor.getColor()));
    }

    @Nullable
    public static final Drawable optDrawable(@NotNull ColorUnionType colorUnionType) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {colorUnionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "887657d8de1ff18da18818413a8755c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "887657d8de1ff18da18818413a8755c5");
        }
        h.b(colorUnionType, "receiver$0");
        if (!(colorUnionType instanceof ColorUnionType.StringColor)) {
            if (colorUnionType instanceof ColorUnionType.GradientColorInfo) {
                ColorUnionType.GradientColorInfo gradientColorInfo = (ColorUnionType.GradientColorInfo) colorUnionType;
                int parseColor = parseColor(gradientColorInfo.getStartColor());
                int parseColor2 = parseColor(gradientColorInfo.getEndColor());
                Integer orientation = gradientColorInfo.getOrientation();
                int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
                if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
                } else {
                    gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(0);
                }
                return gradientDrawable;
            }
            throw new j();
        }
        return new ColorDrawable(parseColor(((ColorUnionType.StringColor) colorUnionType).getColor()));
    }

    public static final int parseColor(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dafbe12f39d0ba3124bdf6b9ffa02d56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dafbe12f39d0ba3124bdf6b9ffa02d56")).intValue();
        }
        h.b(str, "colorStr");
        String str2 = str;
        h.b(str2, "$this$trim");
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = a.a(str2.charAt(!z ? i : length));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (a) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str2.subSequence(i, length + 1).toString();
        if (obj.length() == 0) {
            return Integer.MAX_VALUE;
        }
        if (!g.b(obj, "#", false)) {
            obj = "#" + obj;
        }
        try {
            return Color.parseColor(obj);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
