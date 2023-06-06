package com.meituan.passport.utils;

import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class SpannableHelper {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class NoUnderlineSpan extends URLSpan {
        public static ChangeQuickRedirect a;

        public NoUnderlineSpan(String str) {
            super(str);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ca9dab5c3fe7775cd76c3b857449a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ca9dab5c3fe7775cd76c3b857449a0");
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90973f82116b25830c7f8d0280d4cc6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90973f82116b25830c7f8d0280d4cc6e");
            } else if (textPaint != null) {
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static void a(TextView textView) {
        URLSpan[] uRLSpanArr;
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9ce2826bf9a7f728bc92832d592517e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9ce2826bf9a7f728bc92832d592517e");
        } else if (textView.getText() instanceof Spannable) {
            for (URLSpan uRLSpan : (URLSpan[]) ((Spannable) textView.getText()).getSpans(0, textView.getText().length() - 1, URLSpan.class)) {
                ((Spannable) textView.getText()).setSpan(new NoUnderlineSpan(uRLSpan.getURL()), ((Spannable) textView.getText()).getSpanStart(uRLSpan), ((Spannable) textView.getText()).getSpanEnd(uRLSpan), 33);
            }
        }
    }
}
