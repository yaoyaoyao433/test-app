package com.meituan.msc.mmpviews.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.x;
import com.meituan.msc.views.text.h;
import com.meituan.msc.views.text.i;
import com.meituan.msc.views.text.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPInlineBlockTextView extends AppCompatTextView implements com.meituan.msc.mmpviews.shell.a, x {
    public static ChangeQuickRedirect a;
    private static final ViewGroup.LayoutParams b = new ViewGroup.LayoutParams(0, 0);
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private TextUtils.TruncateAt h;
    private boolean i;
    private int j;
    private boolean k;
    private final e l;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setSpace(Dynamic dynamic) {
    }

    public MPInlineBlockTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e69ad06c3bc57bf847ea73a2733eff1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e69ad06c3bc57bf847ea73a2733eff1");
            return;
        }
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = TextUtils.TruncateAt.END;
        this.i = false;
        this.j = 0;
        this.l = new e(this);
        this.d = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        this.e = getGravity() & 112;
        if (Build.VERSION.SDK_INT <= 23) {
            setTextColor(ContextCompat.getColor(context, 17170441));
        }
    }

    private static WritableMap a(int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "236738d7eeacbb7115a2de2bae71a795", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "236738d7eeacbb7115a2de2bae71a795");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b860bbd5503bc99adb9e44dd2d5446", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b860bbd5503bc99adb9e44dd2d5446");
        }
        Context context = getContext();
        return context instanceof at ? (ReactContext) ((at) context).getBaseContext() : (ReactContext) context;
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c22a2fe171b09a07a2648878c0fb44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c22a2fe171b09a07a2648878c0fb44");
        } else if (getText() instanceof Spannable) {
            a(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.text.MPInlineBlockTextView.a(int, int, int, int):void");
    }

    @Override // com.meituan.msc.uimanager.x
    public final int a(float f, float f2) {
        int i;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186cf8b053e1c162d4caef79ac1995be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186cf8b053e1c162d4caef79ac1995be")).intValue();
        }
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
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
                g.a("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
                return id;
            }
        }
        return id;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416450d3735a02d213a956c9a198d93c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416450d3735a02d213a956c9a198d93c")).booleanValue();
        }
        if (this.c && (getText() instanceof Spanned)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25b9d8482053eba0812099498d781b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25b9d8482053eba0812099498d781b8");
            return;
        }
        if (this.c && (getText() instanceof Spanned)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e24f7d12aeed014f44001e35accd09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e24f7d12aeed014f44001e35accd09f");
            return;
        }
        super.onDetachedFromWindow();
        if (this.c && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5141ea731119ddbd12f2cb0b234092b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5141ea731119ddbd12f2cb0b234092b1");
            return;
        }
        super.onStartTemporaryDetach();
        if (this.c && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbcf5cb9dd5f1fd72b16b8387e8fa962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbcf5cb9dd5f1fd72b16b8387e8fa962");
            return;
        }
        super.onAttachedToWindow();
        if (this.c && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8272266ef39d757d55a94397a2bfa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8272266ef39d757d55a94397a2bfa9");
            return;
        }
        super.onFinishTemporaryDetach();
        if (this.c && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            spanned.getSpans(0, spanned.length(), o.class);
        }
    }

    public void setGravityHorizontal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cbb227e71bd8fda8c61df39ac9fff3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cbb227e71bd8fda8c61df39ac9fff3e");
            return;
        }
        if (i == 0) {
            i = this.d;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public void setGravityVertical(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b5677de027512e6fd7cb77751152a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b5677de027512e6fd7cb77751152a7");
            return;
        }
        if (i == 0) {
            i = this.e;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.k = z;
    }

    public void setLinkifyMask(int i) {
        this.j = i;
    }

    @Override // com.meituan.msc.mmpviews.shell.a
    public e getDelegate() {
        return this.l;
    }

    public void setTextUpdate(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33cd7888d1250f3579529c07a76c87e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33cd7888d1250f3579529c07a76c87e9");
            return;
        }
        this.c = iVar.d;
        Spannable spannable = iVar.c;
        if (this.j > 0) {
            Linkify.addLinks(spannable, this.j);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i = iVar.i;
        if (this.f != i) {
            this.f = i;
        }
        setGravityHorizontal(this.f);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != iVar.j) {
            setBreakStrategy(iVar.j);
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.k) {
            setJustificationMode(iVar.k);
        }
        setText(spannable);
    }
}
