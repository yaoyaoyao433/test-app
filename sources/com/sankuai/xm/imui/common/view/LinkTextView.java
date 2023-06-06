package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.l;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LinkTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private a c;
    private b d;
    private c e;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        boolean a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c {
        boolean a(Object obj);
    }

    public LinkTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8572dac119cb0847acd76f15b20a5cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8572dac119cb0847acd76f15b20a5cc");
        }
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0463950b4b8592b447589fa309aedc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0463950b4b8592b447589fa309aedc");
        }
    }

    public LinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2d17467263ee17b6dfad3f296e1763", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2d17467263ee17b6dfad3f296e1763");
            return;
        }
        this.d = null;
        this.e = null;
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean a2;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e7e05c6d541cfba52fabfd13e72b69", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e7e05c6d541cfba52fabfd13e72b69")).booleanValue();
        }
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Layout layout = getLayout();
                if (layout == null) {
                    return true;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - getTotalPaddingTop()) + getScrollY()), (x - getTotalPaddingLeft()) + getScrollX());
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    if (offsetForHorizontal < spanStart || offsetForHorizontal >= spanEnd) {
                        return false;
                    }
                    if (action != 1) {
                        if (action == 0) {
                            this.b = false;
                            setPressed(true);
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a71c41bf67970fdb162fef3dac417e3d", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a71c41bf67970fdb162fef3dac417e3d");
                            } else {
                                if (this.c == null) {
                                    this.c = new a();
                                }
                                postDelayed(this.c, ViewConfiguration.getLongPressTimeout());
                            }
                            Selection.setSelection(spannable, spanStart, spanEnd);
                            return true;
                        }
                        return true;
                    } else if (!this.b) {
                        a();
                        String url = clickableSpanArr[0] instanceof URLSpan ? ((URLSpan) clickableSpanArr[0]).getURL() : null;
                        if (TextUtils.isEmpty(url)) {
                            return true;
                        }
                        Object[] objArr3 = {url};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "006fa712a5df109b0354ecfef5f76452", 6917529027641081856L)) {
                            a2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "006fa712a5df109b0354ecfef5f76452")).booleanValue();
                        } else {
                            a2 = this.d != null ? this.d.a(url) : false;
                        }
                        if (!a2) {
                            try {
                                clickableSpanArr[0].onClick(this);
                            } catch (Exception e) {
                                com.sankuai.xm.monitor.statistics.a.a("imui", "LinkTextView::onTouchEvent", e);
                                d.a(e);
                            }
                        }
                        Selection.removeSelection(spannable);
                        return true;
                    } else {
                        a();
                        Selection.removeSelection(spannable);
                        setPressed(false);
                        return true;
                    }
                }
            } else if (action == 3) {
                Selection.removeSelection(spannable);
            }
        }
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4378ca893b4ef95a91c123b694e648", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4378ca893b4ef95a91c123b694e648");
            return;
        }
        super.onMeasure(i, i2);
        int a2 = l.a((TextView) this);
        if (a2 > 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - a2);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9126903d44008558953dcb023ffa6838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9126903d44008558953dcb023ffa6838");
        } else if (this.c != null) {
            removeCallbacks(this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private g c;

        private a() {
            Object[] objArr = {LinkTextView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85294ad33e565ce60e667e6373df5f45", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85294ad33e565ce60e667e6373df5f45");
            } else {
                this.c = j.a();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84be356556c38a1c26be1e99c419ef2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84be356556c38a1c26be1e99c419ef2d");
                return;
            }
            try {
                j.a(this.c);
                if (LinkTextView.this.isPressed()) {
                    LinkTextView.this.b = true;
                    if (LinkTextView.this.performLongClick()) {
                        LinkTextView.this.b = true;
                        if (LinkTextView.this.d != null) {
                            if ((LinkTextView.this.getParent() instanceof ViewGroup) && (viewGroup = (ViewGroup) LinkTextView.this.getParent()) != null) {
                                viewGroup.setPressed(true);
                            }
                            Selection.removeSelection((Spannable) LinkTextView.this.getText());
                            LinkTextView.this.setPressed(false);
                            if (LinkTextView.this.e != null) {
                                LinkTextView.this.e.a(LinkTextView.this.getTag());
                            }
                        }
                    } else {
                        LinkTextView.this.b = false;
                    }
                } else {
                    LinkTextView.this.b = false;
                }
                j.c(this.c);
            } catch (Throwable th) {
                j.a(this.c, th);
                throw th;
            }
        }
    }

    public void setOnLinkClickListener(b bVar) {
        this.d = bVar;
    }

    public void setOnLongLinkClickListener(c cVar) {
        this.e = cVar;
    }
}
