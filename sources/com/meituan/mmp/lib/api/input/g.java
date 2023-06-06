package com.meituan.mmp.lib.api.input;

import android.app.Activity;
import android.graphics.Rect;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends PopupWindow {
    public static ChangeQuickRedirect a;
    public Activity b;
    public f c;
    public View d;
    public int e;
    private int f;
    private int g;
    private int h;
    private long i;
    private View j;
    private ViewTreeObserver.OnGlobalLayoutListener k;
    private int l;

    /* JADX WARN: Removed duplicated region for block: B:50:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(com.meituan.mmp.lib.api.input.g r15) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.input.g.b(com.meituan.mmp.lib.api.input.g):void");
    }

    public g(final Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5212b17950f214936e335f47199b4ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5212b17950f214936e335f47199b4ec7");
            return;
        }
        this.e = 0;
        this.b = activity;
        this.j = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.appbrand_popupwindow, (ViewGroup) null, false);
        setContentView(this.j);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.d = activity.findViewById(16908290);
        setWidth(0);
        setHeight(-1);
        this.k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.mmp.lib.api.input.g.1
            public static ChangeQuickRedirect a;
            public int b = 0;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76e6fab1b7fc3c70473ef7b853a06501", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76e6fab1b7fc3c70473ef7b853a06501");
                } else if (g.this.j == null || activity == null) {
                } else {
                    Rect rect = new Rect();
                    g.this.j.getWindowVisibleDisplayFrame(rect);
                    if (rect.height() - this.b > 200 || this.b - rect.height() > 200) {
                        this.b = rect.height();
                        g.b(g.this);
                    }
                }
            }
        };
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(this.k);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98246148e42182d8b6d9a99348e1662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98246148e42182d8b6d9a99348e1662");
            return;
        }
        this.j.getViewTreeObserver().removeOnGlobalLayoutListener(this.k);
        this.c = null;
        this.b = null;
        try {
            p.b(this);
        } catch (Throwable unused) {
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34804674f4f4c64b920fd513307af973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34804674f4f4c64b920fd513307af973");
        } else if (this.c != null) {
            this.c.a(i, i2);
        }
    }
}
