package com.dianping.widget.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaViewPager extends ViewPager implements com.dianping.judas.interfaces.c, com.dianping.judas.interfaces.d {
    public static ChangeQuickRedirect a;
    public d b;
    private a c;
    private boolean d;
    private String e;
    private com.dianping.judas.b f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface a {
    }

    public static /* synthetic */ boolean a(NovaViewPager novaViewPager, boolean z) {
        novaViewPager.d = true;
        return true;
    }

    public NovaViewPager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29cd4597919237ac3a10e4aa0d357eac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29cd4597919237ac3a10e4aa0d357eac");
            return;
        }
        this.d = false;
        this.b = new d();
        this.f = new com.dianping.judas.b(this, this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff07c513141c601521a3caadaa60ae39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff07c513141c601521a3caadaa60ae39");
        } else {
            addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.dianping.widget.view.NovaViewPager.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    Object[] objArr3 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3cf75c790f2d058abff5dc57bdde9c5a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3cf75c790f2d058abff5dc57bdde9c5a");
                    } else if (NovaViewPager.this.d) {
                    } else {
                        NovaViewPager.a(NovaViewPager.this, true);
                        if (NovaViewPager.this.c != null) {
                            a unused = NovaViewPager.this.c;
                        }
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd0da86fec3fbccd24d24ef5b5b3f8e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd0da86fec3fbccd24d24ef5b5b3f8e6");
                    } else if (NovaViewPager.this.c != null) {
                        a unused = NovaViewPager.this.c;
                    }
                }
            });
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c2d94cdde651e810523b65bb1636dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c2d94cdde651e810523b65bb1636dd");
            return;
        }
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof a) {
            this.c = (a) pagerAdapter;
        }
        if (pagerAdapter instanceof NovaPagerAdapter) {
            ((NovaPagerAdapter) pagerAdapter).b = this.e;
        }
    }

    @Override // com.dianping.judas.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.dianping.judas.expose.c cVar;
        View view;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2824851898cfecb91afd0fb8e7511811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2824851898cfecb91afd0fb8e7511811");
            return;
        }
        PagerAdapter adapter = getAdapter();
        if (!(adapter instanceof NovaPagerAdapter) || (cVar = ((NovaPagerAdapter) adapter).c) == null) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.judas.expose.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "65e1ec668d7ccc413c1699facc12a858", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "65e1ec668d7ccc413c1699facc12a858");
        } else {
            view = cVar.b != null ? cVar.b.get() : null;
        }
        if (view != null) {
            com.dianping.widget.view.a.a().a(this.e, view, cVar.c);
        }
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2f1cb092aeefd88c5c26551266c724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2f1cb092aeefd88c5c26551266c724");
        } else {
            this.f.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff47252b44ba1a68703ea9823aece57", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff47252b44ba1a68703ea9823aece57") : this.f.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54fc49c0f7a3443990251d5f75318f9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54fc49c0f7a3443990251d5f75318f9") : this.f.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d037bd6610bb3b49a266f72de3028db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d037bd6610bb3b49a266f72de3028db1");
        } else {
            this.f.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd9551ea7610b1b6361a57ca4a7c1e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd9551ea7610b1b6361a57ca4a7c1e2") : this.f.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db1631baf89489a3ca46ba62f88de7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db1631baf89489a3ca46ba62f88de7e");
        } else {
            this.f.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcac824040249a6f79bd8922a1c11cf5", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcac824040249a6f79bd8922a1c11cf5") : this.f.b(aVar);
    }

    public void setExposeBlockId(String str) {
        this.e = str;
    }
}
