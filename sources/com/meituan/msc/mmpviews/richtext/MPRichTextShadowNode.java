package com.meituan.msc.mmpviews.richtext;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextPaint;
import com.meituan.android.msc.yoga.l;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.text.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPRichTextShadowNode extends ReactShadowNodeImpl implements l {
    public static ChangeQuickRedirect a;
    private static final TextPaint h = new TextPaint(1);
    protected n b;
    protected int c;
    @SuppressLint({"InlinedApi"})
    protected int d;
    @SuppressLint({"InlinedApi"})
    protected int e;
    @SuppressLint({"InlinedApi"})
    protected int f;
    protected boolean g;
    private Spanned i;

    public MPRichTextShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3bfd2b88d34285e8e8b3b14d5ae3b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3bfd2b88d34285e8e8b3b14d5ae3b6");
            return;
        }
        this.b = new n();
        this.c = 0;
        this.d = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.e = 0;
        int i2 = Build.VERSION.SDK_INT;
        this.f = 0;
        this.g = true;
        a((l) this);
    }

    @ReactProp(name = "nodes")
    public void setNodes(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41439a1a1c0d109920ad6026755a1419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41439a1a1c0d109920ad6026755a1419");
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.i = Html.fromHtml(str, 256);
        } else {
            this.i = Html.fromHtml(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    @Override // com.meituan.android.msc.yoga.l
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.meituan.android.msc.yoga.o r22, float r23, com.meituan.android.msc.yoga.m r24, float r25, com.meituan.android.msc.yoga.m r26) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.richtext.MPRichTextShadowNode.a(com.meituan.android.msc.yoga.o, float, com.meituan.android.msc.yoga.m, float, com.meituan.android.msc.yoga.m):long");
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void a(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43fdf14d1c23bd2fe391551a02a2212b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43fdf14d1c23bd2fe391551a02a2212b");
            return;
        }
        super.a(uIViewOperationQueue);
        uIViewOperationQueue.a(this.R, this.i);
    }
}
