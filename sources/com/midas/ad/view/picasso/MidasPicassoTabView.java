package com.midas.ad.view.picasso;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.dianping.util.j;
import com.midas.ad.view.a;
import com.midas.ad.view.b;
import com.midas.ad.view.picasso.MidasPicassoListView;
import java.util.ArrayList;
import java.util.List;
import rx.subjects.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MidasPicassoTabView extends LinearLayout implements a {
    public a a;
    public String b;
    private b c;
    private Context d;
    private List<String> e;
    private boolean f;
    private int g;
    private e h;
    private int i;
    private int j;
    private a k;
    private MidasPicassoListView.b l;
    private String m;

    private void getRenderViewLocation() {
    }

    public View getView() {
        return this;
    }

    public void setmEventBus(e eVar) {
        this.h = eVar;
    }

    private int getExposedViewLocation() {
        int a;
        if (this.c != null && (a = this.c.a()) >= 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.g = j.b(getContext(), iArr[1] + a);
        }
        return this.g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.g = j.b(getContext(), iArr[1]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.h != null) {
            this.h.onNext(new com.midas.ad.feedback.event.a("destory"));
        }
        super.onDetachedFromWindow();
    }

    public MidasPicassoTabView(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f = true;
        this.i = 0;
        this.j = 0;
        this.b = "";
        this.l = new MidasPicassoListView.b() { // from class: com.midas.ad.view.picasso.MidasPicassoTabView.1
        };
        this.m = "";
        a(context);
    }

    public MidasPicassoTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList();
        this.f = true;
        this.i = 0;
        this.j = 0;
        this.b = "";
        this.l = new MidasPicassoListView.b() { // from class: com.midas.ad.view.picasso.MidasPicassoTabView.1
        };
        this.m = "";
        a(context);
    }

    private void a(Context context) {
        this.d = context;
        setOrientation(1);
        setBackgroundColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        for (int i = 20; i > 0 && parent != null; i--) {
            if (parent instanceof ViewPager) {
                ((ViewPager) parent).addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.midas.ad.view.picasso.MidasPicassoTabView.2
                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrollStateChanged(int i2) {
                    }

                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i2, float f, int i3) {
                    }

                    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageSelected(int i2) {
                        MidasPicassoTabView.this.postDelayed(new Runnable() { // from class: com.midas.ad.view.picasso.MidasPicassoTabView.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MidasPicassoTabView.this.a();
                            }
                        }, 800L);
                    }
                });
                return;
            }
            parent = parent.getParent();
        }
    }

    @Override // com.midas.ad.view.a
    public final boolean a() {
        if (ViewCompat.isAttachedToWindow(this)) {
            if (this.a != null) {
                this.a.a();
            }
            if (this.k != null) {
                this.k.a();
                return false;
            }
            return false;
        }
        return true;
    }
}
