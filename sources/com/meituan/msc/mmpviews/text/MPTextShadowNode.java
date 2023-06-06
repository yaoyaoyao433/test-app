package com.meituan.msc.mmpviews.text;

import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.meituan.android.msc.yoga.g;
import com.meituan.android.msc.yoga.l;
import com.meituan.android.msc.yoga.m;
import com.meituan.android.msc.yoga.o;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ag;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.n;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.precreate.c;
import com.meituan.msc.views.text.e;
import com.meituan.msc.views.text.i;
import com.meituan.msc.views.text.j;
import com.meituan.msc.views.text.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes3.dex */
public class MPTextShadowNode extends MPBaseTextShadowNode {
    public static ChangeQuickRedirect F;
    public static int L;
    public static int M;
    protected boolean G;
    protected n H;
    @Nullable
    private a ab;
    @Nullable
    private Spannable ac;
    private boolean ad;
    private String ae;
    private final l af;
    private static final TextPaint aa = new TextPaint(1);
    public static boolean I = true;
    public static long J = 0;
    public static long K = 0;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final boolean d() {
        return true;
    }

    @ReactProp(name = "wordBreak")
    public void setWordBreak(String str) {
    }

    public static /* synthetic */ long a(MPTextShadowNode mPTextShadowNode, float f, m mVar) {
        int measuredHeight;
        ReactContext reactContext;
        Object[] objArr = {Float.valueOf(f), mVar};
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, mPTextShadowNode, changeQuickRedirect, false, "b212580b645d2965cb35266debdc63f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, mPTextShadowNode, changeQuickRedirect, false, "b212580b645d2965cb35266debdc63f3")).longValue();
        }
        if (mPTextShadowNode.ab == null) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        ThemedReactContext t = mPTextShadowNode.t();
        MPLeafTextView tryGetMPLeafTextView = t.getRuntimeDelegate().tryGetMPLeafTextView(t);
        c.p++;
        c.G += System.nanoTime() - nanoTime;
        mPTextShadowNode.ab.A = tryGetMPLeafTextView;
        tryGetMPLeafTextView.setId(mPTextShadowNode.R);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mVar == m.UNDEFINED || (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 ? 0 : (int) f, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        tryGetMPLeafTextView.setupTextInfo(mPTextShadowNode.ab);
        J += System.nanoTime() - nanoTime;
        a aVar = mPTextShadowNode.ab;
        Object[] objArr2 = {Integer.valueOf(makeMeasureSpec), Integer.valueOf(makeMeasureSpec2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = MPLeafTextView.a;
        if (PatchProxy.isSupport(objArr2, tryGetMPLeafTextView, changeQuickRedirect2, false, "426c97e8ba98fee3885c9c917fed754c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, tryGetMPLeafTextView, changeQuickRedirect2, false, "426c97e8ba98fee3885c9c917fed754c")).longValue();
        }
        tryGetMPLeafTextView.a(true);
        tryGetMPLeafTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        tryGetMPLeafTextView.a(false);
        if (aVar.x && (reactContext = tryGetMPLeafTextView.getReactContext()) != null) {
            WritableArray a = e.a(aVar.b, tryGetMPLeafTextView.getLayout(), tryGetMPLeafTextView.getPaint(), reactContext);
            WritableMap createMap = Arguments.createMap();
            createMap.putArray("lines", a);
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(reactContext.getRuntimeDelegate().getPageId(), tryGetMPLeafTextView.getId(), "topTextLayout", createMap);
        }
        int measuredWidth = tryGetMPLeafTextView.getMeasuredWidth();
        int i = aVar.y;
        if (i != -1 && i < tryGetMPLeafTextView.getLayout().getLineCount()) {
            measuredHeight = tryGetMPLeafTextView.getLayout().getLineBottom(i - 1);
        } else {
            measuredHeight = tryGetMPLeafTextView.getMeasuredHeight();
        }
        return com.meituan.android.msc.yoga.n.a(measuredWidth, measuredHeight);
    }

    public static /* synthetic */ a a(MPTextShadowNode mPTextShadowNode, a aVar) {
        mPTextShadowNode.ab = null;
        return null;
    }

    public static /* synthetic */ String a(MPTextShadowNode mPTextShadowNode, String str) {
        mPTextShadowNode.ae = null;
        return null;
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fcf667d1d1be3e3cb0640eb6c3445b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fcf667d1d1be3e3cb0640eb6c3445b7");
            return;
        }
        J = 0L;
        com.meituan.msc.uimanager.list.c.C = 0;
        K = 0L;
        L = 0;
        M = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(float r23, com.meituan.android.msc.yoga.m r24) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.text.MPTextShadowNode.a(float, com.meituan.android.msc.yoga.m):long");
    }

    public MPTextShadowNode() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25da676abca332cc12abec2e239cd91e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25da676abca332cc12abec2e239cd91e");
        }
    }

    private MPTextShadowNode(@Nullable j jVar) {
        super(null);
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9498223260bf7caba9d284326de53f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9498223260bf7caba9d284326de53f1");
            return;
        }
        this.af = new l() { // from class: com.meituan.msc.mmpviews.text.MPTextShadowNode.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.msc.yoga.l
            public final long a(o oVar, float f, m mVar, float f2, m mVar2) {
                long a2;
                Object[] objArr2 = {oVar, Float.valueOf(f), mVar, Float.valueOf(f2), mVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "983f9e3b66f961804449810231382796", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "983f9e3b66f961804449810231382796")).longValue();
                }
                long nanoTime = System.nanoTime();
                if (MPTextShadowNode.this.G && MPTextShadowNode.I) {
                    try {
                        a2 = MPTextShadowNode.a(MPTextShadowNode.this, f, mVar);
                    } catch (Exception unused) {
                        MPTextShadowNode.this.G = false;
                        MPTextShadowNode.a(MPTextShadowNode.this, (String) null);
                        MPTextShadowNode.a(MPTextShadowNode.this, (a) null);
                        MPTextShadowNode.this.ac = MPBaseTextShadowNode.a((MPBaseTextShadowNode) MPTextShadowNode.this, (String) null, true, MPTextShadowNode.this.H);
                    }
                    MPTextShadowNode.K += System.nanoTime() - nanoTime;
                    return a2;
                }
                a2 = MPTextShadowNode.this.a(f, mVar);
                MPTextShadowNode.K += System.nanoTime() - nanoTime;
                return a2;
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = F;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51f629cea5b51b2c14e49dff26783e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51f629cea5b51b2c14e49dff26783e6a");
        } else if (b()) {
        } else {
            a(this.af);
        }
    }

    private int U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d92135d0e189fb80a50b3f50cb7f01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d92135d0e189fb80a50b3f50cb7f01")).intValue();
        }
        int i = this.j;
        if (S() == g.RTL) {
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msc.uimanager.n r21) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.text.MPTextShadowNode.a(com.meituan.msc.uimanager.n):void");
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5780ad57d1d30d3aced9a49e1ad1cb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5780ad57d1d30d3aced9a49e1ad1cb72");
            return;
        }
        super.e();
        super.R();
    }

    @Override // com.meituan.msc.mmpviews.shell.MPLayoutShadowNode, com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void a(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83e1826730884e8917bfd70f1013396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83e1826730884e8917bfd70f1013396");
            return;
        }
        super.a(uIViewOperationQueue);
        uIViewOperationQueue.a(this.R, new i(this.ab, this.ac, -1, this.D, k(4), k(1), k(5), k(3), U(), this.k, this.m));
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.ad = z;
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final List<aa> a(ag agVar) {
        Object[] objArr = {agVar};
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bef1b9473f6b1899da4e078b3151310", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bef1b9473f6b1899da4e078b3151310");
        }
        if (this.E == null || this.E.isEmpty()) {
            return new ArrayList();
        }
        Spanned spanned = (Spanned) com.facebook.infer.annotation.a.a(this.ac, "Spannable element has not been prepared in onBeforeLayout");
        p[] pVarArr = (p[]) spanned.getSpans(0, spanned.length(), p.class);
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (p pVar : pVarArr) {
            aa aaVar = this.E.get(Integer.valueOf(pVar.b));
            aaVar.v();
            arrayList.add(aaVar);
        }
        return arrayList;
    }

    @Override // com.meituan.msc.mmpviews.text.MPBaseTextShadowNode
    public void setLetterSpacing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = F;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86772579761aad0440f4b98ee04db7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86772579761aad0440f4b98ee04db7e");
        } else {
            super.setLetterSpacing(s.c(f));
        }
    }
}
