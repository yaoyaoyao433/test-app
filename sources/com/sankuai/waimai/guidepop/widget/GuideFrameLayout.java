package com.sankuai.waimai.guidepop.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GuideFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    public int b;
    private double c;
    private boolean d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void b();

        void c();
    }

    public GuideFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f78e2fb7ce727001b2167949f5f0363", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f78e2fb7ce727001b2167949f5f0363");
            return;
        }
        this.c = 0.1d;
        this.d = false;
        this.b = -1291845632;
    }

    public GuideFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2807fbf044f4369f54f1e1a8266680", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2807fbf044f4369f54f1e1a8266680");
            return;
        }
        this.c = 0.1d;
        this.d = false;
        this.b = -1291845632;
    }

    public GuideFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731b76e6c4bdd5c215cbc4dd34bd96e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731b76e6c4bdd5c215cbc4dd34bd96e8");
            return;
        }
        this.c = 0.1d;
        this.d = false;
        this.b = -1291845632;
    }

    public GuideFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d00c31a4b6ea457b6a94253276e6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d00c31a4b6ea457b6a94253276e6d8");
            return;
        }
        this.c = 0.1d;
        this.d = false;
        this.b = -1291845632;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131 A[RETURN] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.guidepop.widget.GuideFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCustomOnClickListener(@Nullable a aVar) {
        this.e = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d628977bf0fb7c4f7406f4c384b7f63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d628977bf0fb7c4f7406f4c384b7f63")).booleanValue();
        }
        if (!this.d) {
            if (this.e != null && motionEvent.getAction() == 0) {
                this.e.c();
            }
            return true;
        }
        if (this.e != null && motionEvent.getAction() == 0) {
            this.e.b();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5d6c3d19af7572db9c1301a8ec0e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5d6c3d19af7572db9c1301a8ec0e0f");
            return;
        }
        super.setBackgroundColor(i);
        this.b = i;
    }

    public void setAlphaThreshold(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203f7fcffcb74d0b2ef4fdebc68ab7b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203f7fcffcb74d0b2ef4fdebc68ab7b2");
        } else {
            this.c = d;
        }
    }
}
