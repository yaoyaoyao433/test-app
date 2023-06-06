package com.meituan.msc.mmpviews.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.at;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.widget.FrameLayout;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.utils.b;
import com.meituan.msc.views.text.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ReflectUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPLeafTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private static final FrameLayout.LayoutParams b = new FrameLayout.LayoutParams(0, 0);
    private final int c;
    private a d;
    private SpannableStringBuilder e;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public MPLeafTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a0da105ee9586f6f8d2a9ac8eee973", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a0da105ee9586f6f8d2a9ac8eee973");
            return;
        }
        this.e = null;
        this.c = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (Build.VERSION.SDK_INT <= 23) {
            setTextColor(ContextCompat.getColor(context, 17170441));
        }
        setEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Map<String, Object> map;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54bcc3838ca21775b2e92b2588e4bdf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54bcc3838ca21775b2e92b2588e4bdf8");
            return;
        }
        System.nanoTime();
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            Context context = getContext();
            if (context instanceof ThemedReactContext) {
                a aVar = this.d;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "69589faad2a6c902b3500c5ea7068688", RobustBitConfig.DEFAULT_VALUE)) {
                    map = (Map) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "69589faad2a6c902b3500c5ea7068688");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("text", aVar.b);
                    hashMap.put("color", Integer.valueOf(aVar.c));
                    hashMap.put("backgroundColor", Integer.valueOf(aVar.d));
                    hashMap.put("isBackgroundColorSet", Boolean.valueOf(aVar.e));
                    hashMap.put("effectiveLineHeight", Float.valueOf(aVar.f));
                    hashMap.put("effectiveLetterSpacing", Float.valueOf(aVar.g));
                    hashMap.put("effectiveFontSize", Integer.valueOf(aVar.h));
                    hashMap.put("isFontStyleSet", Boolean.valueOf(aVar.i));
                    hashMap.put("isFontWeightSet", Boolean.valueOf(aVar.j));
                    hashMap.put("isFontFamilySet", Boolean.valueOf(aVar.k));
                    hashMap.put("fontStyle", Integer.valueOf(aVar.l));
                    hashMap.put(FontWeight.LOWER_CASE_NAME, Integer.valueOf(aVar.m));
                    hashMap.put("fontFamily", aVar.n);
                    hashMap.put("isUnderlineTextDecorationSet", Boolean.valueOf(aVar.o));
                    hashMap.put("isLineThroughTextDecorationSet", Boolean.valueOf(aVar.p));
                    hashMap.put("textShadowOffsetDx", Float.valueOf(aVar.q));
                    hashMap.put("textShadowOffsetDy", Float.valueOf(aVar.r));
                    hashMap.put("textShadowOffsetRadius", Float.valueOf(aVar.s));
                    hashMap.put("textShadowColor", Integer.valueOf(aVar.t));
                    hashMap.put("gravityHorizontal", Integer.valueOf(aVar.u));
                    hashMap.put("breakStrategy", Integer.valueOf(aVar.v));
                    hashMap.put("justificationMode", Integer.valueOf(aVar.w));
                    hashMap.put("shouldNotifyOnTextLayout", Boolean.valueOf(aVar.x));
                    hashMap.put(NumberOfLines.LOWER_CASE_NAME, Integer.valueOf(aVar.y));
                    hashMap.put("effectiveEllipsizeLocation", aVar.z);
                    map = hashMap;
                }
                map.put("exMsg", Log.getStackTraceString(th));
                map.put("exStack", Log.getStackTraceString(th));
                ((ThemedReactContext) context).getRuntimeDelegate().recordInPage("msc.render.text.layout.error", map, true);
            }
            throw new com.meituan.msc.common.a("msc render leaf text view measure error", th);
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7929c3975ae2877c0a5d17fbe74c0ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7929c3975ae2877c0a5d17fbe74c0ad2");
            return;
        }
        System.nanoTime();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0446aa6b9fc16ee8f467ea64a35a722f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0446aa6b9fc16ee8f467ea64a35a722f");
            return;
        }
        System.nanoTime();
        super.onDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        IRuntimeDelegate runtimeDelegate;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e902e913c079b75f96b39b4a6494c8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e902e913c079b75f96b39b4a6494c8d1");
            return;
        }
        Context context = getContext();
        if (!(context instanceof ThemedReactContext) || (runtimeDelegate = ((ThemedReactContext) context).getRuntimeDelegate()) == null || runtimeDelegate.isRollback("isRollbackFixOnPreDrawException")) {
            return;
        }
        ReflectUtils.setValue(this, "mPreDrawRegistered", Boolean.valueOf(z));
    }

    public void setupTextInfo(a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d46e46fbcbc2407cefe2f162cc5fb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d46e46fbcbc2407cefe2f162cc5fb9");
            return;
        }
        if (getLayoutParams() == null) {
            setLayoutParams(b);
        }
        if (b.a(this.d, aVar)) {
            return;
        }
        this.d = aVar;
        float f = aVar.f;
        if (!Float.isNaN(f) && f > 0.0f) {
            if (this.e == null) {
                this.e = new SpannableStringBuilder();
            }
            this.e.clear();
            this.e.clearSpans();
            this.e.append(aVar.b);
            this.e.setSpan(new com.meituan.msc.views.text.b(f), 0, this.e.length(), 17);
            setText(this.e);
        } else {
            setText(aVar.b);
        }
        if (aVar.y > 0) {
            if (aVar.y == 1) {
                setSingleLine(true);
            }
            setMaxLines(aVar.y);
        }
        setEllipsize(aVar.z);
        setTextColor(aVar.c);
        if (aVar.e) {
            setBackgroundColor(aVar.d);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = aVar.g;
            if (!Float.isNaN(f2)) {
                setLetterSpacing(f2);
            }
        }
        setTextSize(0, aVar.h);
        if (aVar.i || aVar.j || aVar.k) {
            setTypeface(k.a(getTypeface(), aVar.l, aVar.m, aVar.n, getContext().getAssets()));
        }
        if (aVar.o) {
            getPaint().setUnderlineText(true);
        }
        if (aVar.p) {
            setPaintFlags(getPaintFlags() | 16);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "44dcc60434960112b91bc87abdd40308", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "44dcc60434960112b91bc87abdd40308")).booleanValue();
        } else if ((aVar.q == 0.0f && aVar.r == 0.0f && aVar.s == 0.0f) || Color.alpha(aVar.t) == 0) {
            z = false;
        }
        if (z) {
            setShadowLayer(aVar.s, aVar.q, aVar.r, aVar.t);
        }
        setGravityHorizontal(aVar.u);
        if (Build.VERSION.SDK_INT >= 23) {
            setBreakStrategy(aVar.v);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setJustificationMode(aVar.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactContext getReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed56d894bce9b96ec3b0448bcc6b6fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed56d894bce9b96ec3b0448bcc6b6fe");
        }
        Context context = getContext();
        return context instanceof at ? (ReactContext) ((at) context).getBaseContext() : (ReactContext) context;
    }

    public void setGravityHorizontal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66e523e5890561804c4c7c76bb8751f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66e523e5890561804c4c7c76bb8751f");
            return;
        }
        if (i == 0) {
            i = this.c;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }
}
