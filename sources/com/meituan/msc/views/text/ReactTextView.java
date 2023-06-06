package com.meituan.msc.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.at;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.ViewGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactTextView extends AppCompatTextView implements x {
    public static ChangeQuickRedirect a;
    private static final ViewGroup.LayoutParams f = new ViewGroup.LayoutParams(0, 0);
    int b;
    TextUtils.TruncateAt c;
    boolean d;
    com.meituan.msc.views.view.e e;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private Spannable m;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public ReactTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af8841b7ed0ec528fb8becf3dbbb408", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af8841b7ed0ec528fb8becf3dbbb408");
            return;
        }
        this.j = 0;
        this.b = Integer.MAX_VALUE;
        this.c = TextUtils.TruncateAt.END;
        this.d = false;
        this.k = 0;
        this.e = new com.meituan.msc.views.view.e(this);
        this.h = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        this.i = getGravity() & 112;
        if (Build.VERSION.SDK_INT <= 23) {
            setTextColor(ContextCompat.getColor(context, 17170441));
        }
    }

    private static WritableMap a(int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1ce5ef1797a39fd68a6aac8fd335f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1ce5ef1797a39fd68a6aac8fd335f4f");
        }
        WritableMap createMap = Arguments.createMap();
        if (i == 8) {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "gone");
            createMap.putInt("index", i2);
        } else if (i == 0) {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "visible");
            createMap.putInt("index", i2);
            createMap.putDouble("left", s.c(i3));
            createMap.putDouble("top", s.c(i4));
            createMap.putDouble("right", s.c(i5));
            createMap.putDouble("bottom", s.c(i6));
        } else {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "unknown");
            createMap.putInt("index", i2);
        }
        return createMap;
    }

    private ReactContext getReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5adcd540b5494adc1afdf1fef54506", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5adcd540b5494adc1afdf1fef54506");
        }
        Context context = getContext();
        return context instanceof at ? (ReactContext) ((at) context).getBaseContext() : (ReactContext) context;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f A[SYNTHETIC] */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.text.ReactTextView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // com.meituan.msc.uimanager.x
    public final int a(float f2, float f3) {
        int i;
        Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513786b2473c6849f80ef24820d31884", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513786b2473c6849f80ef24820d31884")).intValue();
        }
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f2;
        int i3 = (int) f3;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                h[] hVarArr = (h[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, h.class);
                if (hVarArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < hVarArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(hVarArr[i4]);
                        int spanEnd = spanned.getSpanEnd(hVarArr[i4]);
                        if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = hVarArr[i4].b;
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                com.meituan.msc.modules.reporter.g.a("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
                return id;
            }
        }
        return id;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d122be527b681ee0a9fa10e93a0a36e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d122be527b681ee0a9fa10e93a0a36e")).booleanValue();
        }
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                if (oVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16e1a3207560fb8e3705c9785055bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16e1a3207560fb8e3705c9785055bea");
            return;
        }
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                if (oVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d390e5bb205d2124b373c317d5a25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d390e5bb205d2124b373c317d5a25d");
            return;
        }
        super.onDetachedFromWindow();
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f10cb89619a5f4851177f8df7feabb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f10cb89619a5f4851177f8df7feabb4");
            return;
        }
        super.onStartTemporaryDetach();
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9530da8a521ffa490fdd18eb681fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9530da8a521ffa490fdd18eb681fa9");
            return;
        }
        super.onAttachedToWindow();
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff13a207b68e32b26c5a98f95897f263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff13a207b68e32b26c5a98f95897f263");
            return;
        }
        super.onFinishTemporaryDetach();
        if (this.g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    public void setGravityHorizontal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2737458350ce6f737d042089b5dd7066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2737458350ce6f737d042089b5dd7066");
            return;
        }
        if (i == 0) {
            i = this.h;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public void setGravityVertical(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f60bddf7e64f90c583640ac39a66d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f60bddf7e64f90c583640ac39a66d3");
            return;
        }
        if (i == 0) {
            i = this.i;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setNumberOfLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aba952d3cce343dbc14712f53bf48fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aba952d3cce343dbc14712f53bf48fe");
            return;
        }
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.b = i;
        setSingleLine(this.b == 1);
        setMaxLines(this.b);
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.d = z;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.c = truncateAt;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.l = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a86e8b2bd36aa5a2ab9f1c24d057c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a86e8b2bd36aa5a2ab9f1c24d057c61");
        } else {
            this.e.a(i);
        }
    }

    public void setBorderRadius(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c881d448e94096348ba17ce248e599e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c881d448e94096348ba17ce248e599e8");
        } else {
            this.e.a(f2);
        }
    }

    public void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25cc241bad946b0adbb390bfa73f9207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25cc241bad946b0adbb390bfa73f9207");
        } else {
            this.e.a(str);
        }
    }

    public void setSpanned(Spannable spannable) {
        this.m = spannable;
    }

    public Spannable getSpanned() {
        return this.m;
    }

    public void setLinkifyMask(int i) {
        this.k = i;
    }

    public void setText(i iVar) {
        int i;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938cf72da38d3e604252fd8dab9276c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938cf72da38d3e604252fd8dab9276c1");
            return;
        }
        this.g = iVar.d;
        if (getLayoutParams() == null) {
            setLayoutParams(f);
        }
        Spannable spannable = iVar.c;
        if (this.k > 0) {
            Linkify.addLinks(spannable, this.k);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannable);
        float f2 = iVar.e;
        float f3 = iVar.f;
        float f4 = iVar.g;
        float f5 = iVar.h;
        if (f2 != -1.0f && f5 != -1.0f && f4 != -1.0f && i != 0) {
            setPadding((int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4), (int) Math.floor(f5));
        }
        int i2 = iVar.i;
        if (this.j != i2) {
            this.j = i2;
        }
        setGravityHorizontal(this.j);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != iVar.j) {
            setBreakStrategy(iVar.j);
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.k) {
            setJustificationMode(iVar.k);
        }
        requestLayout();
    }
}
