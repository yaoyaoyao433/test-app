package com.sankuai.waimai.store.search.util;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Context context, String str, String str2, boolean z, int i, int i2) {
        Object[] objArr = {context, str, str2, (byte) 0, Integer.valueOf(i), 12};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ff5162c1a2ca80f016c4a8e8c1c1870", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ff5162c1a2ca80f016c4a8e8c1c1870")).intValue();
        }
        if (context == null) {
            return -1;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(h.a(context, 12.0f));
        try {
            textPaint.setTypeface(Typeface.create(str2, 0));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        StaticLayout staticLayout = new StaticLayout(str, textPaint, h.a(context, i), Layout.Alignment.ALIGN_NORMAL, 1.0f, h.a(context, 6.0f), false);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        staticLayout.getLineCount();
        textPaint.getFontMetrics();
        return Math.min(i, h.b(context, rect.width()));
    }
}
