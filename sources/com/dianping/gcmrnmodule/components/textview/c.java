package com.dianping.gcmrnmodule.components.textview;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.widget.TextViewCompat;
import android.text.TextUtils;
import com.dianping.richtext.BaseRichTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static int b = 1;
    private static int c = 100;
    private static int d = 1;

    public static void a(BaseRichTextView baseRichTextView, a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr = {baseRichTextView, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74bc40a576e0c8dc6da255fa55edfdf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74bc40a576e0c8dc6da255fa55edfdf8");
        } else if (aVar == null) {
        } else {
            baseRichTextView.setText(aVar.b);
            if (aVar.w && aVar.x > 0.0f && aVar.y > 0.0f && aVar.m == 1 && !aVar.A) {
                TextViewCompat.setAutoSizeTextTypeWithDefaults(baseRichTextView, 1);
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(baseRichTextView, b, c, d, 2);
            } else {
                TextViewCompat.setAutoSizeTextTypeWithDefaults(baseRichTextView, 0);
            }
            baseRichTextView.setTextSize(1, aVar.d);
            baseRichTextView.setTextColor(aVar.f);
            baseRichTextView.setShadowLayer(aVar.u, aVar.s, aVar.t, aVar.g);
            if (aVar.B == 0 && aVar.F == 0 && aVar.D == 0 && aVar.C == 0 && aVar.E == 0) {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            } else if (aVar.F == 0 && aVar.D == 0 && aVar.C == 0 && aVar.E == 0) {
                i = aVar.B;
                i2 = i;
                i3 = i2;
                i4 = i3;
            } else {
                i = aVar.F;
                i2 = aVar.D;
                i3 = aVar.C;
                i4 = aVar.E;
            }
            baseRichTextView.setPadding(i, i3, i2, i4);
            baseRichTextView.getPaint().setStrikeThruText(aVar.q);
            baseRichTextView.getPaint().setUnderlineText(aVar.p);
            baseRichTextView.setGravity(aVar.j);
            baseRichTextView.setEllipsize(aVar.z.a);
            if (Build.VERSION.SDK_INT >= 23 && aVar.z.b != -1) {
                baseRichTextView.setBreakStrategy(aVar.z.b);
            }
            baseRichTextView.getPaint().setTypeface(aVar.i);
            if (Build.VERSION.SDK_INT >= 23) {
                baseRichTextView.setOriginalLineSpacing(aVar.o, 1.0f);
            }
            if (aVar.m <= 1) {
                baseRichTextView.setSingleLine(true);
                baseRichTextView.setHorizontallyScrolling(false);
            } else {
                baseRichTextView.setSingleLine(false);
                baseRichTextView.setMaxLines(aVar.m);
            }
            if (aVar.c != null) {
                baseRichTextView.setSpannableString(aVar.c);
            }
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e417d219387c755b8a784b6b48bae45a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e417d219387c755b8a784b6b48bae45a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Color.parseColor(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "627b1fc9784d0e3d09821fdcae75d645", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "627b1fc9784d0e3d09821fdcae75d645")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((context.getResources().getDisplayMetrics().density * f) + (f > 0.0f ? 0.5f : -0.5f));
    }
}
