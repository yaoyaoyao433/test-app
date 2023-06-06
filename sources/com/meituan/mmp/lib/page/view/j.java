package com.meituan.mmp.lib.page.view;

import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends LinearLayout {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private a c;
    private View d;
    private int e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, String str2, String str3);

        void b(String str);

        boolean f();
    }

    public j(Context context, com.meituan.mmp.lib.config.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec7a243fc7e6d3b9df4535e30f7c53d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec7a243fc7e6d3b9df4535e30f7c53d");
        } else {
            a(context, aVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf80e29d3c93c84879c3bfb8b5752ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf80e29d3c93c84879c3bfb8b5752ef");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.b != null) {
            int childCount = this.b.getChildCount();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels / childCount;
            int i2 = (displayMetrics.widthPixels % childCount) / 2;
            this.b.setPadding(i2, 0, i2, 0);
            for (int i3 = 0; i3 < childCount; i3++) {
                ViewGroup.LayoutParams layoutParams = this.b.getChildAt(i3).getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = this.e;
            }
        }
    }

    private void a(Context context, com.meituan.mmp.lib.config.a aVar) {
        String str;
        String str2;
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387f5fc96f36beb82115a8a9fc213478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387f5fc96f36beb82115a8a9fc213478");
            return;
        }
        setOrientation(1);
        boolean k = aVar.k();
        this.e = p.d(k ? 30 : 50);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9dbe04ceeebaeefda318576091068067", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9dbe04ceeebaeefda318576091068067");
        } else {
            str = (aVar.f == null || !"white".equals(aVar.f.e)) ? "#e5e5e5" : "#f5f5f5";
        }
        String str3 = str;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.config.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6f3b292fcb44ecc3e8808ff905ba48e7", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6f3b292fcb44ecc3e8808ff905ba48e7");
        } else {
            str2 = (aVar.f == null || TextUtils.isEmpty(aVar.f.d) || !aVar.f.d.startsWith("#")) ? "#ffffff" : aVar.f.d;
        }
        List<com.meituan.mmp.lib.model.a> l = aVar.l();
        if (l == null || l.isEmpty()) {
            return;
        }
        setBackgroundColor(com.meituan.mmp.lib.utils.i.a(str2));
        this.d = new View(context);
        this.d.setBackgroundColor(com.meituan.mmp.lib.utils.i.a(str3));
        addView(this.d, new LinearLayout.LayoutParams(-1, 1));
        this.b = new LinearLayout(context);
        this.b.setOrientation(0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int size = displayMetrics.widthPixels / l.size();
        int size2 = (displayMetrics.widthPixels % l.size()) / 2;
        this.b.setPadding(size2, 0, size2, 0);
        addView(this.b, new LinearLayout.LayoutParams(-1, -2));
        for (int i = 0; i < l.size(); i++) {
            final com.meituan.mmp.lib.model.a aVar2 = l.get(i);
            k kVar = new k(context, aVar);
            kVar.setInfo(aVar2);
            kVar.setTop(k);
            kVar.setTag(Integer.valueOf(i));
            kVar.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.page.view.j.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "18efcae2cb7bd2ae1c543224600cd286", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "18efcae2cb7bd2ae1c543224600cd286");
                    } else if (j.this.c == null || !j.this.c.f()) {
                        k kVar2 = (k) view;
                        if (j.this.c != null) {
                            String pagePath = kVar2.getPagePath();
                            if (!kVar2.isSelected()) {
                                j.this.c.b(pagePath);
                            }
                            j.this.c.a(pagePath, String.valueOf(view.getTag()), aVar2 == null ? "" : aVar2.e);
                        }
                    }
                }
            });
            this.b.addView(kVar, new LinearLayout.LayoutParams(size, this.e));
        }
        if (k) {
            this.d = new View(context);
            this.d.setBackgroundColor(com.meituan.mmp.lib.utils.i.a(str3));
            addView(this.d, new LinearLayout.LayoutParams(-1, 1));
        }
    }

    @Nullable
    public final k a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716b6b5187d37618c71b6186122e4fc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716b6b5187d37618c71b6186122e4fc3");
        }
        if (i < 0 || this.b.getChildCount() <= i) {
            return null;
        }
        return (k) this.b.getChildAt(i);
    }

    public final int getTabItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4fe0aec9e40d94ec316ab633dfd7b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4fe0aec9e40d94ec316ab633dfd7b4")).intValue() : this.b.getChildCount();
    }

    public final int getTopBarHeight() {
        return this.e;
    }

    public final void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d0a32114ad1dec6227b479bdf4f1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d0a32114ad1dec6227b479bdf4f1d3");
        } else {
            this.d.setBackgroundColor(i);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d43c445fa05012547b5941016afff5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d43c445fa05012547b5941016afff5a");
            return;
        }
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            k kVar = (k) this.b.getChildAt(i);
            if (TextUtils.equals(str, kVar.getPagePath())) {
                kVar.setSelected(true);
            } else {
                kVar.setSelected(false);
            }
        }
    }

    public final void setOnSwitchTabListener(a aVar) {
        this.c = aVar;
    }
}
