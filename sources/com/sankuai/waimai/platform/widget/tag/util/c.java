package com.sankuai.waimai.platform.widget.tag.util;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Constructor<StaticLayout> b;

    static {
        try {
            b = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
        } catch (Throwable unused) {
            b = null;
        }
    }

    @NonNull
    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5) {
        Object[] objArr = {charSequence, 0, Integer.valueOf(i2), textPaint, Integer.valueOf(i3), alignment, Float.valueOf(1.0f), Float.valueOf(f2), (byte) 0, truncateAt, Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72e23fcfc24e08a0e98d70b76e6d8ab0", RobustBitConfig.DEFAULT_VALUE)) {
            return (StaticLayout) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72e23fcfc24e08a0e98d70b76e6d8ab0");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f2, 1.0f).setIncludePad(false).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).build();
        }
        if (b != null) {
            try {
                return b.newInstance(charSequence, 0, Integer.valueOf(i2), textPaint, Integer.valueOf(i3), alignment, TextDirectionHeuristics.FIRSTSTRONG_LTR, Float.valueOf(1.0f), Float.valueOf(f2), Boolean.FALSE, truncateAt, Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (Exception unused) {
                return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, 1.0f, f2, false, truncateAt, i4);
            }
        }
        return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, 1.0f, f2, false, truncateAt, i4);
    }
}
