package com.meituan.msc.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ag;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes3.dex */
public class RNTextShadowNode extends RNBaseTextShadowNode {
    public static ChangeQuickRedirect B;
    private static final TextPaint D = new TextPaint(1);
    @Nullable
    private Spannable E;
    private boolean F;
    private final com.meituan.android.msc.yoga.l G;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final boolean d() {
        return true;
    }

    public static /* synthetic */ Layout a(RNTextShadowNode rNTextShadowNode, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, rNTextShadowNode, changeQuickRedirect, false, "0fb20ce8a74ca6c3311e84abe33121a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Layout) PatchProxy.accessDispatch(objArr, rNTextShadowNode, changeQuickRedirect, false, "0fb20ce8a74ca6c3311e84abe33121a3");
        }
        TextView textView = new TextView(rNTextShadowNode.t().getApplicationContext());
        if (rNTextShadowNode.E == null) {
            return null;
        }
        textView.setWidth(i);
        textView.setText(rNTextShadowNode.E);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
        return textView.getLayout();
    }

    public static /* synthetic */ int c(RNTextShadowNode rNTextShadowNode) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, rNTextShadowNode, changeQuickRedirect, false, "f4f5f373ce63ecd26042ec01294f3641", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, rNTextShadowNode, changeQuickRedirect, false, "f4f5f373ce63ecd26042ec01294f3641")).intValue();
        }
        TextView textView = new TextView(rNTextShadowNode.t().getApplicationContext());
        if (rNTextShadowNode.E != null) {
            textView.setText(rNTextShadowNode.E);
            textView.measure(0, 0);
            if (textView.getLayout() != null) {
                return textView.getLayout().getWidth();
            }
            return -1;
        }
        return -1;
    }

    public RNTextShadowNode() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5d08a9fe6f78b4f329075715b2b3f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5d08a9fe6f78b4f329075715b2b3f0");
        }
    }

    private RNTextShadowNode(@Nullable j jVar) {
        super(null);
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fac9f7993ca6ea25f6b16f51cf71dbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fac9f7993ca6ea25f6b16f51cf71dbc");
            return;
        }
        this.G = new com.meituan.android.msc.yoga.l() { // from class: com.meituan.msc.views.text.RNTextShadowNode.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.msc.yoga.l
            public final long a(com.meituan.android.msc.yoga.o oVar, float f, com.meituan.android.msc.yoga.m mVar, float f2, com.meituan.android.msc.yoga.m mVar2) {
                Layout build;
                int i = 0;
                Object[] objArr2 = {oVar, Float.valueOf(f), mVar, Float.valueOf(f2), mVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d769b4a062f341e01fe0dbd851c6ab9b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d769b4a062f341e01fe0dbd851c6ab9b")).longValue();
                }
                TextPaint textPaint = RNTextShadowNode.D;
                textPaint.setTextSize(RNTextShadowNode.this.c.a());
                Spanned spanned = (Spanned) com.facebook.infer.annotation.a.a(RNTextShadowNode.this.E, "Spannable element has not been prepared in onBeforeLayout");
                BoringLayout.Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
                float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
                boolean z = mVar == com.meituan.android.msc.yoga.m.UNDEFINED || f < 0.0f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                int U = RNTextShadowNode.this.U();
                if (U == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (U == 3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else if (U == 5) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                if (isBoring == null && (z || (!com.meituan.android.msc.yoga.f.a(desiredWidth) && desiredWidth <= f))) {
                    int ceil = (int) Math.ceil(desiredWidth);
                    if (Build.VERSION.SDK_INT < 23) {
                        build = new StaticLayout(spanned, textPaint, ceil, alignment, 1.0f, 0.0f, RNTextShadowNode.this.s);
                    } else {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(RNTextShadowNode.this.s).setBreakStrategy(RNTextShadowNode.this.j).setHyphenationFrequency(RNTextShadowNode.this.k);
                        if (Build.VERSION.SDK_INT >= 26) {
                            hyphenationFrequency.setJustificationMode(RNTextShadowNode.this.l);
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th) {
                                com.meituan.msc.modules.reporter.g.a("[ReactTextShadowNode@measure]", null, th);
                            }
                        }
                        build = hyphenationFrequency.build();
                    }
                } else if (isBoring != null && (z || isBoring.width <= f)) {
                    build = BoringLayout.make(spanned, textPaint, isBoring.width, alignment, 1.0f, 0.0f, isBoring, RNTextShadowNode.this.s);
                } else {
                    if (Build.VERSION.SDK_INT < 23) {
                        build = new StaticLayout(spanned, textPaint, (int) f, alignment, 1.0f, 0.0f, RNTextShadowNode.this.s);
                    } else {
                        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(RNTextShadowNode.this.s).setBreakStrategy(RNTextShadowNode.this.j).setHyphenationFrequency(1);
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th2) {
                                com.meituan.msc.modules.reporter.g.b("[ReactTextShadowNode@measure]", null, th2);
                            }
                        }
                        build = hyphenationFrequency2.build();
                    }
                    Layout a2 = RNTextShadowNode.a(RNTextShadowNode.this, build.getWidth());
                    if (a2 != null && build.getHeight() < a2.getHeight()) {
                        build = a2;
                    }
                    i = build.getHeight();
                }
                int width = build.getWidth();
                if (i == 0) {
                    i = build.getHeight();
                    int c = RNTextShadowNode.c(RNTextShadowNode.this);
                    if (c > width) {
                        width = c;
                    }
                }
                if (RNTextShadowNode.this.F) {
                    WritableArray a3 = e.a(spanned, build, RNTextShadowNode.D, RNTextShadowNode.this.t());
                    WritableMap createMap = Arguments.createMap();
                    createMap.putArray("lines", a3);
                    ((RCTEventEmitter) RNTextShadowNode.this.t().getJSModule(RCTEventEmitter.class)).receiveEvent(RNTextShadowNode.this.t().getRuntimeDelegate().getPageId(), RNTextShadowNode.this.R, "topTextLayout", createMap);
                }
                if (RNTextShadowNode.this.h != -1 && RNTextShadowNode.this.h < build.getLineCount()) {
                    return com.meituan.android.msc.yoga.n.a(width, build.getLineBottom(RNTextShadowNode.this.h - 1));
                }
                return com.meituan.android.msc.yoga.n.a(width, i);
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = B;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2b8761bd252f8dcf24eea17c5e6c7e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2b8761bd252f8dcf24eea17c5e6c7e3");
        } else if (b()) {
        } else {
            a(this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8c5849e1acca8760392f0d6b6529a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8c5849e1acca8760392f0d6b6529a4")).intValue();
        }
        int i = this.i;
        if (S() == com.meituan.android.msc.yoga.g.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i == 3) {
                return 5;
            }
            return i;
        }
        return i;
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final void a(com.meituan.msc.uimanager.n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f67f47f849d43c650529a0bcfeac62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f67f47f849d43c650529a0bcfeac62");
            return;
        }
        this.E = a((RNBaseTextShadowNode) this, (String) null, true, nVar);
        e();
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1733102a40fcd29dfba3d43c123fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1733102a40fcd29dfba3d43c123fce");
            return;
        }
        super.e();
        super.R();
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void a(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a48de4cb6a3f3ffe85d6f3e4614f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a48de4cb6a3f3ffe85d6f3e4614f25");
            return;
        }
        super.a(uIViewOperationQueue);
        if (this.E != null) {
            uIViewOperationQueue.a(this.R, new i(null, this.E, -1, this.z, k(4), k(1), k(5), k(3), U(), this.j, this.l));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.F = z;
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final List<aa> a(ag agVar) {
        Object[] objArr = {agVar};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9364a42ca6d0aa99a8bc91e8da78af8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9364a42ca6d0aa99a8bc91e8da78af8");
        }
        if (this.A == null || this.A.isEmpty()) {
            return new ArrayList();
        }
        Spanned spanned = (Spanned) com.facebook.infer.annotation.a.a(this.E, "Spannable element has not been prepared in onBeforeLayout");
        p[] pVarArr = (p[]) spanned.getSpans(0, spanned.length(), p.class);
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (p pVar : pVarArr) {
            aa aaVar = this.A.get(Integer.valueOf(pVar.b));
            aaVar.v();
            arrayList.add(aaVar);
        }
        return arrayList;
    }
}
