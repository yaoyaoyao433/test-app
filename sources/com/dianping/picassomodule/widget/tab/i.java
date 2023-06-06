package com.dianping.picassomodule.widget.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends com.dianping.picassomodule.widget.tab.a<String> {
    public static ChangeQuickRedirect c;
    Context d;
    int e;
    int f;
    int g;
    boolean h;
    int i;
    int j;
    int k;
    int l;
    String m;
    String n;
    int o;
    int p;
    List<a> q;
    List<a> r;

    @Override // com.dianping.picassomodule.widget.tab.f
    public final View a(int i) {
        final a aVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94475ce619c9978d3b32c8cb0253543f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94475ce619c9978d3b32c8cb0253543f");
        }
        if (this.r.size() > 0) {
            aVar = this.r.remove(0);
        } else {
            a aVar2 = new a();
            LinearLayout linearLayout = new LinearLayout(this.d);
            TextView textView = new TextView(this.d);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setGravity(17);
            linearLayout.addView(textView);
            aVar2.a = textView;
            aVar2.b = linearLayout;
            aVar = aVar2;
        }
        aVar.b.setGravity(17);
        aVar.b.setLayoutParams(new LinearLayout.LayoutParams(this.p, this.o));
        aVar.a.setText((CharSequence) this.b.get(i));
        a(aVar.a, false);
        this.q.add(aVar);
        aVar.c = i;
        aVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassomodule.widget.tab.i.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "310de59a25662643f04ff9cc25ff17c8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "310de59a25662643f04ff9cc25ff17c8");
                } else {
                    i.this.a(aVar.c, g.USER_CLICK);
                }
            }
        });
        return aVar.b;
    }

    private void a(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d94316371008ee55e9a86ba2bdfdbe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d94316371008ee55e9a86ba2bdfdbe0");
            return;
        }
        textView.setTextColor(a(this.m, this.n));
        textView.setTextSize(2, z ? this.j : this.i);
        textView.setTypeface(Typeface.DEFAULT, z ? this.l : this.k);
    }

    @Override // com.dianping.picassomodule.widget.tab.f
    public final void a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fdf5c3f955932e658d829d182fd0dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fdf5c3f955932e658d829d182fd0dce");
        } else if (i < 0 || i >= this.q.size()) {
            throw new IllegalArgumentException("index out of range");
        } else {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                TextView textView = this.q.get(i2).a;
                if (i2 == i) {
                    this.q.get(i2).b.setSelected(true);
                    a(textView, true);
                } else {
                    this.q.get(i2).b.setSelected(false);
                    a(textView, false);
                }
            }
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc76e2ca640a268470954bb52c9eff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc76e2ca640a268470954bb52c9eff7");
            return;
        }
        if (i == 0) {
            i = 14;
        }
        for (a aVar : this.q) {
            aVar.a.setTextSize(i);
        }
    }

    private static ColorStateList a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77ee6eff2bb938225c19bdb1456cd31e", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77ee6eff2bb938225c19bdb1456cd31e") : new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[0]}, new int[]{com.dianping.picassomodule.utils.b.a(str2), com.dianping.picassomodule.utils.b.a(str2), com.dianping.picassomodule.utils.b.a(str)});
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        public TextView a;
        public LinearLayout b;
        public int c;

        private a() {
        }
    }

    public i(Context context, h hVar) {
        super(hVar.e);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec54c2fa35e70f747bb9e1d180f073a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec54c2fa35e70f747bb9e1d180f073a");
            return;
        }
        this.h = true;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.d = context;
    }
}
