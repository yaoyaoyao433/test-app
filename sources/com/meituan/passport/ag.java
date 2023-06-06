package com.meituan.passport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ag extends LinkMovementMethod {
    public static ChangeQuickRedirect a;
    private static ag c;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Uri build;
        Object[] objArr = {textView, spannable, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8468d4e381e218b66d7cb8c950acae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8468d4e381e218b66d7cb8c950acae")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (clickableSpanArr[0] instanceof URLSpan) {
                        String url = ((URLSpan) clickableSpanArr[0]).getURL();
                        Object[] objArr2 = {url};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39e9ee24620aa6b444fb84abebd52b46", RobustBitConfig.DEFAULT_VALUE)) {
                            build = (Uri) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39e9ee24620aa6b444fb84abebd52b46");
                        } else {
                            Uri.Builder buildUpon = Uri.parse(com.meituan.passport.plugins.q.a().i().a()).buildUpon();
                            if (url.startsWith("http") || url.startsWith("https")) {
                                build = buildUpon.appendQueryParameter("url", Uri.decode(url)).build();
                            } else {
                                String[] split = url.split("url=", 2);
                                if (split != null && split.length > 1) {
                                    build = buildUpon.appendQueryParameter("url", Uri.decode(split[1])).build();
                                } else {
                                    build = buildUpon.build();
                                }
                            }
                        }
                        Context context = textView.getContext();
                        if (context != null) {
                            Intent intent = new Intent("android.intent.action.VIEW", build);
                            intent.setPackage(context.getPackageName());
                            intent.putExtra("com.android.browser.application_id", context.getPackageName());
                            try {
                                context.startActivity(intent);
                            } catch (Exception unused) {
                                new StringBuilder("startActivity exception, ").append(intent.toString());
                            }
                        }
                    } else {
                        clickableSpanArr[0].onClick(textView);
                    }
                    a aVar = this.b;
                } else if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public static ag a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec3c0c6de998822c9d7d44315bf5b37d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ag) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec3c0c6de998822c9d7d44315bf5b37d");
        }
        if (c == null) {
            c = new ag();
        }
        return c;
    }
}
