package com.meituan.msc.modules.page.view.tab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private InterfaceC0471a c;
    private View d;
    private int e;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.page.view.tab.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0471a {
        void a(String str);

        void a(String str, String str2, String str3);

        boolean d();
    }

    public a(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e452f3a901a6632d085a6456b3319ccb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e452f3a901a6632d085a6456b3319ccb");
        } else {
            a(context, fVar);
        }
    }

    private void a(Context context, f fVar) {
        String str;
        String str2;
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4057bab323633526b956218a6dd6e104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4057bab323633526b956218a6dd6e104");
            return;
        }
        setOrientation(1);
        boolean g = fVar.g();
        this.e = n.b(g ? 30 : 50);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "96d1b4662be9c544ab9ee53e8e64d82c", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "96d1b4662be9c544ab9ee53e8e64d82c");
        } else {
            com.meituan.msc.modules.update.a aVar = fVar.U_().s;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "905d58a4df37b2afa2116f6c0c749737", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "905d58a4df37b2afa2116f6c0c749737");
            } else {
                str = (aVar.c == null || !"white".equals(aVar.c.e)) ? "#e5e5e5" : "#f5f5f5";
            }
        }
        String str3 = str;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = f.a;
        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "2ec3bcb4c7f3f18d1e7ccdc6eb380e1f", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "2ec3bcb4c7f3f18d1e7ccdc6eb380e1f");
        } else {
            com.meituan.msc.modules.update.a aVar2 = fVar.U_().s;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.a.a;
            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "2166b2b1d2a8241534c244349eb678be", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "2166b2b1d2a8241534c244349eb678be");
            } else {
                str2 = (aVar2.c == null || TextUtils.isEmpty(aVar2.c.d) || !aVar2.c.d.startsWith("#")) ? "#ffffff" : aVar2.c.d;
            }
        }
        List<b> h = fVar.h();
        if (h == null || h.isEmpty()) {
            return;
        }
        setBackgroundColor(g.a(str2));
        this.d = new View(context);
        this.d.setBackgroundColor(g.a(str3));
        addView(this.d, new LinearLayout.LayoutParams(-1, 1));
        this.b = new LinearLayout(context);
        this.b.setOrientation(0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int size = displayMetrics.widthPixels / h.size();
        int size2 = (displayMetrics.widthPixels % h.size()) / 2;
        this.b.setPadding(size2, 0, size2, 0);
        addView(this.b, new LinearLayout.LayoutParams(-1, -2));
        for (int i = 0; i < h.size(); i++) {
            final b bVar = h.get(i);
            c cVar = new c(context, fVar);
            cVar.setInfo(bVar);
            cVar.setTop(g);
            cVar.setTag(Integer.valueOf(i));
            cVar.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.page.view.tab.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1d5358ff89185d73f20744cf2e1088b6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1d5358ff89185d73f20744cf2e1088b6");
                    } else if (a.this.c == null || !a.this.c.d()) {
                        c cVar2 = (c) view;
                        if (a.this.c != null) {
                            String pagePath = cVar2.getPagePath();
                            if (!cVar2.isSelected()) {
                                a.this.c.a(pagePath);
                            }
                            a.this.c.a(pagePath, String.valueOf(view.getTag()), bVar == null ? "" : bVar.e);
                        }
                    }
                }
            });
            this.b.addView(cVar, new LinearLayout.LayoutParams(size, this.e));
        }
        if (g) {
            this.d = new View(context);
            this.d.setBackgroundColor(g.a(str3));
            addView(this.d, new LinearLayout.LayoutParams(-1, 1));
        }
    }

    @Nullable
    public final c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dec74a100852b20e2a4ed2d07aca89", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dec74a100852b20e2a4ed2d07aca89");
        }
        if (i < 0 || this.b.getChildCount() <= i) {
            return null;
        }
        return (c) this.b.getChildAt(i);
    }

    public final int getTabItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb1fbe2581b2000f38f6f9420c0440d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb1fbe2581b2000f38f6f9420c0440d")).intValue() : this.b.getChildCount();
    }

    public final int getTopBarHeight() {
        return this.e;
    }

    public final void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57cfee440ee8054a3f17cd9810845ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57cfee440ee8054a3f17cd9810845ff");
        } else {
            this.d.setBackgroundColor(i);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9ead78f041a97490f8fdbf653545ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9ead78f041a97490f8fdbf653545ff");
            return;
        }
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            c cVar = (c) this.b.getChildAt(i);
            if (TextUtils.equals(str, cVar.getPagePath())) {
                cVar.setSelected(true);
            } else {
                cVar.setSelected(false);
            }
        }
    }

    public final void setOnSwitchTabListener(InterfaceC0471a interfaceC0471a) {
        this.c = interfaceC0471a;
    }
}
