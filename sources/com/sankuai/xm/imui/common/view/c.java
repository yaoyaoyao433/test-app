package com.sankuai.xm.imui.common.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    private Map<String, Object> d;
    private int e;
    private float f;
    private String g;

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fb5947b8ef95a95535ba1da90c11ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fb5947b8ef95a95535ba1da90c11ec");
            return;
        }
        this.d = new HashMap();
        this.e = -16777216;
        this.c = 0;
        this.g = "... ";
        this.b = str;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227fbc94fd47d37e9344d8b2ad186f85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227fbc94fd47d37e9344d8b2ad186f85");
            return;
        }
        canvas.save();
        paint.setColor(this.e);
        if (this.c > 0 && this.c < this.f) {
            int breakText = paint.breakText(this.b, 0, this.b.length(), true, this.c - paint.measureText(this.g), null);
            canvas.drawText(this.b.substring(0, breakText) + this.g, f, i4, paint);
        } else {
            canvas.drawText(this.b, f, i4, paint);
        }
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2de0977e532b74f29a05486a875540", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2de0977e532b74f29a05486a875540")).intValue();
        }
        if (fontMetricsInt != null) {
            Rect rect = new Rect();
            paint.getTextBounds(this.b, 0, this.b.length(), rect);
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int height = rect.height() / 2;
            int i3 = (fontMetricsInt2.bottom - fontMetricsInt2.top) / 4;
            int i4 = height - i3;
            int i5 = -(height + i3);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i4;
            fontMetricsInt.descent = i4;
        }
        this.f = paint.measureText(this.b);
        if (this.c > 0 && this.c < this.f) {
            return this.c;
        }
        return (int) this.f;
    }

    public final <T> T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a162c66976eb08e13c0eac46c728b6", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a162c66976eb08e13c0eac46c728b6") : (T) this.d.get(str);
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38350f6a06749531849c66226bef6dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38350f6a06749531849c66226bef6dc");
        } else {
            this.d.put(str, obj);
        }
    }
}
