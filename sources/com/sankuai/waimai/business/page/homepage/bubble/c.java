package com.sankuai.waimai.business.page.homepage.bubble;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String c = "c";
    protected com.sankuai.waimai.business.page.homepage.bubble.a b;
    private Context d;
    private PopupWindow e;
    private View.OnLayoutChangeListener f;
    private ArrayList<a> g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public static /* synthetic */ View.OnLayoutChangeListener a(c cVar, View.OnLayoutChangeListener onLayoutChangeListener) {
        cVar.f = null;
        return null;
    }

    public static /* synthetic */ void b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "53ed306e698e53f8aa453b39fc43e496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "53ed306e698e53f8aa453b39fc43e496");
        } else if (cVar.g != null && cVar.g.size() > 0) {
            for (int size = cVar.g.size() - 1; size >= 0; size--) {
                a aVar = cVar.g.get(size);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public static c a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1afddd2c56af8cb9bb4f24c24496469f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1afddd2c56af8cb9bb4f24c24496469f") : new c(context);
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d74d010bbdc8cd89adfbe2bbf1f53c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d74d010bbdc8cd89adfbe2bbf1f53c");
            return;
        }
        this.d = context;
        this.e = new PopupWindow();
        this.e.setOutsideTouchable(true);
        this.e.setWidth(-2);
        this.e.setHeight(-2);
        this.e.setAnimationStyle(16973826);
        this.e.setOutsideTouchable(false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(0, 0);
        this.e.setBackgroundDrawable(gradientDrawable);
        this.e.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.bubble.c.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9418863dc456c2042a4e2a86b26afc73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9418863dc456c2042a4e2a86b26afc73");
                    return;
                }
                if (c.this.f != null) {
                    c.this.b.removeOnLayoutChangeListener(c.this.f);
                    c.a(c.this, (View.OnLayoutChangeListener) null);
                }
                c.b(c.this);
            }
        });
    }

    public final void a(int i, final View view, String str, boolean z) {
        com.sankuai.waimai.business.page.homepage.bubble.a aVar;
        Object[] objArr = {Integer.valueOf(i), view, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e7ccb9320b5861453ddbe89dd663bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e7ccb9320b5861453ddbe89dd663bf");
        } else if (this.e.isShowing()) {
        } else {
            this.f = new View.OnLayoutChangeListener() { // from class: com.sankuai.waimai.business.page.homepage.bubble.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Object[] objArr2 = {view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6274a5ec9e3827e8e85715c8db5196ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6274a5ec9e3827e8e85715c8db5196ef");
                    } else {
                        c.this.a(view);
                    }
                }
            };
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ef6b85cca45d91373d01f63aa0bb0ae", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.sankuai.waimai.business.page.homepage.bubble.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ef6b85cca45d91373d01f63aa0bb0ae");
            } else if (i == 1) {
                this.e.setTouchable(false);
                aVar = (ContentBubbleView) LayoutInflater.from(this.d).inflate(R.layout.bubble_view_content, (ViewGroup) null);
            } else {
                this.e.setTouchable(true);
                aVar = (DefaultBubbleView) LayoutInflater.from(this.d).inflate(R.layout.bubble_view_default, (ViewGroup) null);
            }
            this.b = aVar;
            a(str);
            this.b.addOnLayoutChangeListener(this.f);
            int[] iArr = new int[2];
            this.b.a(iArr, view);
            this.e.setContentView(this.b.getView());
            this.e.setWidth(this.b.getBubbleWidth());
            this.e.setHeight(this.b.getBubbledHeight());
            p.a(this.e, view, 0, iArr[0], iArr[1]);
            d();
            if (z) {
                this.b.b();
            }
        }
    }

    public final void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3c9992afc2c8c7468206564dc24c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3c9992afc2c8c7468206564dc24c73");
            return;
        }
        a(str);
        a(view);
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c854e0dbecaa340c0b914afb65b6743d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c854e0dbecaa340c0b914afb65b6743d");
        } else if (this.b != null) {
            this.b.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73dc0ffda56b3aa01642c7979360a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73dc0ffda56b3aa01642c7979360a41");
            return;
        }
        try {
            if (this.b != null) {
                int[] iArr = new int[2];
                this.b.a(iArr, view);
                this.e.update(iArr[0], iArr[1], this.b.getBubbleWidth(), this.b.getBubbledHeight());
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857b2499451720d0017ace88a74051b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857b2499451720d0017ace88a74051b4");
        } else {
            p.b(this.e);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d896a51ded105843110c93a0f3a1a04c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d896a51ded105843110c93a0f3a1a04c")).booleanValue() : this.e.isShowing();
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e3cb336b1d0c51d43fc9a542b07d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e3cb336b1d0c51d43fc9a542b07d7d")).intValue();
        }
        if (this.b != null) {
            return this.b.getBigBubbleMeasuredHeight();
        }
        return 0;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d7cbfa914575eafe809a33e3d0c18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d7cbfa914575eafe809a33e3d0c18b");
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        if (this.g.contains(aVar)) {
            return;
        }
        this.g.add(aVar);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b348cc12619fe729e17442fa118bdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b348cc12619fe729e17442fa118bdc");
        } else if (this.g != null && this.g.size() > 0) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                a aVar = this.g.get(size);
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fcb0e5b7aa83c8178faa4f4669b4e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fcb0e5b7aa83c8178faa4f4669b4e0b");
        } else if (this.e == null || this.e.getContentView() == null) {
        } else {
            this.e.getContentView().setVisibility(i);
        }
    }
}
