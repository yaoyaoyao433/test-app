package com.meituan.android.legwork.mrn.view.outlineText;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.t;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.e;
import com.facebook.react.views.text.i;
import com.facebook.react.views.text.j;
import com.facebook.react.views.text.p;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.b;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes2.dex */
public class ReactOutLineTextShadowNode extends ReactBaseTextShadowNode {
    public static ChangeQuickRedirect a;
    private static final TextPaint b = new TextPaint(1);
    private String c;
    @Nullable
    private Spannable d;
    private boolean e;
    private final YogaMeasureFunction f;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isVirtualAnchor() {
        return false;
    }

    public static /* synthetic */ Layout a(ReactOutLineTextShadowNode reactOutLineTextShadowNode, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, reactOutLineTextShadowNode, changeQuickRedirect, false, "ed07166ecd544bfcec0fd26aab15c402", RobustBitConfig.DEFAULT_VALUE)) {
            return (Layout) PatchProxy.accessDispatch(objArr, reactOutLineTextShadowNode, changeQuickRedirect, false, "ed07166ecd544bfcec0fd26aab15c402");
        }
        TextView textView = new TextView(reactOutLineTextShadowNode.getThemedContext().getApplicationContext());
        if (reactOutLineTextShadowNode.d == null) {
            return null;
        }
        textView.setWidth(i);
        textView.setText(reactOutLineTextShadowNode.d);
        textView.measure(0, 0);
        return textView.getLayout();
    }

    public static /* synthetic */ int m(ReactOutLineTextShadowNode reactOutLineTextShadowNode) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, reactOutLineTextShadowNode, changeQuickRedirect, false, "6fbcd010c28ea3478bd68c6222565e81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, reactOutLineTextShadowNode, changeQuickRedirect, false, "6fbcd010c28ea3478bd68c6222565e81")).intValue();
        }
        TextView textView = new TextView(reactOutLineTextShadowNode.getThemedContext().getApplicationContext());
        if (reactOutLineTextShadowNode.d != null) {
            textView.setText(reactOutLineTextShadowNode.d);
            textView.measure(0, 0);
            if (textView.getLayout() != null) {
                return textView.getLayout().getWidth();
            }
            return -1;
        }
        return -1;
    }

    public ReactOutLineTextShadowNode() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc94a95fed2d75959c6865a12e2224fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc94a95fed2d75959c6865a12e2224fe");
        }
    }

    public ReactOutLineTextShadowNode(@Nullable j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69adaee3b231fae069b8f03d180211c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69adaee3b231fae069b8f03d180211c");
            return;
        }
        this.f = new YogaMeasureFunction() { // from class: com.meituan.android.legwork.mrn.view.outlineText.ReactOutLineTextShadowNode.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.yoga.YogaMeasureFunction
            public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                Layout build;
                int i = 0;
                Object[] objArr2 = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3db57c0e8db89242191d3f15d678f7ca", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3db57c0e8db89242191d3f15d678f7ca")).longValue();
                }
                TextPaint textPaint = ReactOutLineTextShadowNode.b;
                textPaint.setTextSize(ReactOutLineTextShadowNode.this.mTextAttributes.a());
                Spanned spanned = (Spanned) a.a(ReactOutLineTextShadowNode.this.d, "Spannable element has not been prepared in onBeforeLayout");
                BoringLayout.Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
                float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
                boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                int b2 = ReactOutLineTextShadowNode.this.b();
                if (b2 == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (b2 == 3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else if (b2 == 5) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                if (isBoring == null && (z || (!b.a(desiredWidth) && desiredWidth <= f))) {
                    int ceil = (int) Math.ceil(desiredWidth);
                    if (Build.VERSION.SDK_INT >= 23) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactOutLineTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactOutLineTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(ReactOutLineTextShadowNode.this.mHyphenationFrequency);
                        if (Build.VERSION.SDK_INT >= 26) {
                            hyphenationFrequency.setJustificationMode(ReactOutLineTextShadowNode.this.mJustificationMode);
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th) {
                                com.facebook.common.logging.a.c("[ReactTextShadowNode@measure]", null, th);
                            }
                        }
                        build = hyphenationFrequency.build();
                    } else {
                        build = new StaticLayout(spanned, textPaint, ceil, alignment, 1.0f, 0.0f, ReactOutLineTextShadowNode.this.mIncludeFontPadding);
                    }
                } else if (isBoring != null && (z || isBoring.width <= f)) {
                    build = BoringLayout.make(spanned, textPaint, isBoring.width, alignment, 1.0f, 0.0f, isBoring, ReactOutLineTextShadowNode.this.mIncludeFontPadding);
                } else {
                    if (Build.VERSION.SDK_INT < 23) {
                        build = new StaticLayout(spanned, textPaint, (int) f, alignment, 1.0f, 0.0f, ReactOutLineTextShadowNode.this.mIncludeFontPadding);
                    } else {
                        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactOutLineTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactOutLineTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1);
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th2) {
                                com.facebook.common.logging.a.d("[ReactTextShadowNode@measure]", null, th2);
                            }
                        }
                        build = hyphenationFrequency2.build();
                    }
                    Layout a2 = ReactOutLineTextShadowNode.a(ReactOutLineTextShadowNode.this, build.getWidth());
                    if (a2 != null && build.getHeight() < a2.getHeight()) {
                        build = a2;
                    }
                    i = build.getHeight();
                }
                int width = build.getWidth();
                if (i == 0) {
                    i = build.getHeight();
                    int m = ReactOutLineTextShadowNode.m(ReactOutLineTextShadowNode.this);
                    if (m > width) {
                        width = m;
                    }
                }
                if (ReactOutLineTextShadowNode.this.e) {
                    WritableArray a3 = e.a(spanned, build, ReactOutLineTextShadowNode.b, ReactOutLineTextShadowNode.this.getThemedContext());
                    WritableMap createMap = Arguments.createMap();
                    createMap.putArray("lines", a3);
                    ((RCTEventEmitter) ReactOutLineTextShadowNode.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(ReactOutLineTextShadowNode.this.getReactTag(), "topTextLayout", createMap);
                }
                if (ReactOutLineTextShadowNode.this.mNumberOfLines != -1 && ReactOutLineTextShadowNode.this.mNumberOfLines < build.getLineCount()) {
                    return c.a(width, build.getLineBottom(ReactOutLineTextShadowNode.this.mNumberOfLines - 1));
                }
                return c.a(width, i);
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "015e87da30da08c967eaf2bd5268a704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "015e87da30da08c967eaf2bd5268a704");
        } else if (isVirtual()) {
        } else {
            setMeasureFunction(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23aebc8aa5daac935a373284f52b92de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23aebc8aa5daac935a373284f52b92de")).intValue();
        }
        int i = this.mTextAlign;
        if (getLayoutDirection() == YogaDirection.RTL) {
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

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onBeforeLayout(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187d40fcbaef7c29831042c9a2821f60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187d40fcbaef7c29831042c9a2821f60");
            return;
        }
        this.d = spannedFromShadowNode(this, this.c, true, tVar);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public void markUpdated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c889a4051ae2e909cea798610eeae0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c889a4051ae2e909cea798610eeae0a");
            return;
        }
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3afb24cd6a192228babd7407952e3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3afb24cd6a192228babd7407952e3c1");
            return;
        }
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.d != null) {
            uIViewOperationQueue.a(getReactTag(), new i(this.d, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), b(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.e = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public Iterable<? extends af> calculateLayoutOnChildren() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb91d77489af217d52079e8e10a01b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Iterable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb91d77489af217d52079e8e10a01b1e");
        }
        if (this.mInlineViews == null || this.mInlineViews.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) a.a(this.d, "Spannable element has not been prepared in onBeforeLayout");
        p[] pVarArr = (p[]) spanned.getSpans(0, spanned.length(), p.class);
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (p pVar : pVarArr) {
            af afVar = this.mInlineViews.get(Integer.valueOf(pVar.a()));
            afVar.calculateLayout();
            arrayList.add(afVar);
        }
        return arrayList;
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98899b2d6423158f6ceae0dfe4b46c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98899b2d6423158f6ceae0dfe4b46c0e");
            return;
        }
        this.c = str;
        markUpdated();
    }
}
