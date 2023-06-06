package com.meituan.msc.modules.page;

import android.animation.LayoutTransition;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.modules.page.view.tab.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r extends a implements h, com.meituan.msc.modules.page.transition.a, a.InterfaceC0471a {
    public static ChangeQuickRedirect h;
    private final FrameLayout i;
    private l j;
    private String k;
    private l[] l;
    private final Map<String, l> m;
    private List<com.meituan.msc.modules.page.view.tab.b> n;
    private com.meituan.msc.modules.page.view.tab.a o;
    private com.meituan.msc.modules.page.reload.b[] p;
    private boolean q;

    public r(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.container.p pVar, com.meituan.msc.common.framework.interfaces.b bVar, String str, @Nullable com.meituan.msc.modules.page.reload.a aVar, boolean z) {
        super(hVar, pVar, bVar, z);
        boolean z2;
        Object[] objArr = {hVar, pVar, bVar, str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a1db2bbd6ec020bf2a35bd1f54ae84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a1db2bbd6ec020bf2a35bd1f54ae84");
            return;
        }
        this.l = new l[0];
        this.m = new HashMap();
        inflate(getContext(), R.layout.msc_page, this);
        this.i = (FrameLayout) findViewById(R.id.web_layout);
        Object[] objArr2 = {this.d, str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4dd3db2ee8c7d88c6c5c424d176ba1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4dd3db2ee8c7d88c6c5c424d176ba1a");
        } else {
            if (aVar != null) {
                this.p = aVar.c;
            }
            this.n = this.c.r.h();
            this.l = new l[this.n == null ? 0 : this.n.size()];
            l c = c(str);
            this.k = str;
            this.j = c;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.top_layout);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.bottom_layout);
        Object[] objArr3 = {linearLayout, linearLayout2};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "395cb7c4553b9ea0dcf350f2043884c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "395cb7c4553b9ea0dcf350f2043884c0");
            return;
        }
        com.meituan.msc.modules.update.f fVar = this.c.r;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.f.a;
        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "54483df56a29827c5018d02ebc0da9d0", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "54483df56a29827c5018d02ebc0da9d0")).booleanValue();
        } else {
            com.meituan.msc.modules.update.a aVar2 = fVar.U_().s;
            z2 = aVar2.c != null ? aVar2.c.a : false;
        }
        if (z2) {
            this.o = null;
            this.q = true;
            return;
        }
        this.o = new com.meituan.msc.modules.page.view.tab.a(this.d, this.c.r);
        this.o.setOnSwitchTabListener(this);
        if (this.c.r.g()) {
            linearLayout2.setVisibility(8);
            linearLayout.addView(this.o, new RelativeLayout.LayoutParams(-1, -2));
            ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = com.meituan.msc.common.utils.n.a();
            return;
        }
        linearLayout2.setVisibility(0);
        linearLayout2.addView(this.o, new RelativeLayout.LayoutParams(-1, -2));
    }

    @Override // com.meituan.msc.modules.page.h, com.meituan.msc.modules.page.view.tab.a.InterfaceC0471a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce32cb7bc606d9cb68aad52fbc89ba4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce32cb7bc606d9cb68aad52fbc89ba4d");
        } else {
            a(str, "switchTab");
        }
    }

    @Override // com.meituan.msc.modules.page.view.tab.a.InterfaceC0471a
    public final void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f0c85e87399d8d299490a8aa86ab54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f0c85e87399d8d299490a8aa86ab54");
        } else {
            com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.page.r.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "779b32ca05ae2899fcdc5cd3a0e5f5b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "779b32ca05ae2899fcdc5cd3a0e5f5b9");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("pagePath", str);
                        jSONObject.put("index", str2);
                        jSONObject.put("text", str3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ((PageListener) r.this.c.a(PageListener.class)).onTabItemTap(jSONObject, r.this.j.getViewId());
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.page.view.tab.a.InterfaceC0471a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8303096b0623e43a359f4650d73223a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8303096b0623e43a359f4650d73223a9")).booleanValue() : this.j.g();
    }

    @Override // com.meituan.msc.modules.page.h
    public final com.meituan.msc.modules.page.view.tab.a getTabBar() {
        return this.o;
    }

    public final l getCurPage() {
        return this.j;
    }

    @Override // com.meituan.msc.modules.page.h
    public final boolean c() {
        return this.q;
    }

    @Override // com.meituan.msc.modules.page.h
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56f6bc44a3b031cdc9fffbe65888349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56f6bc44a3b031cdc9fffbe65888349");
            return;
        }
        String b = am.b(str);
        if (this.o != null) {
            this.o.a(b);
            this.o.setVisibility(0);
        }
        l c = c(str);
        if (this.j != c) {
            this.c.n.b(this.k, String.valueOf(this.j.getViewId()));
            this.j.a(3);
            this.j.setVisibility(8);
            this.c.n.a(this.k, String.valueOf(this.j.getViewId()));
        }
        c.setVisibility(0);
        c.b();
        c.a(str, str2);
        this.k = str;
        this.j = c;
    }

    private l a(int i, String str) {
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de84baa82006fcf8de8fe16e346e4b01", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de84baa82006fcf8de8fe16e346e4b01");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "028b4aef1818ac47b34254c7b97794a9", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "028b4aef1818ac47b34254c7b97794a9")).intValue();
        } else if (this.p == null || i >= this.p.length) {
            i3 = -1;
            l lVar = new l(this.c, this.e, this.f, str, this, i3, this.b);
            this.l[i] = lVar;
            this.m.put(am.b(str), lVar);
            this.i.addView(lVar, new ViewGroup.LayoutParams(-1, -1));
            return lVar;
        } else {
            i2 = this.p[i].c;
            this.p[i] = null;
        }
        i3 = i2;
        l lVar2 = new l(this.c, this.e, this.f, str, this, i3, this.b);
        this.l[i] = lVar2;
        this.m.put(am.b(str), lVar2);
        this.i.addView(lVar2, new ViewGroup.LayoutParams(-1, -1));
        return lVar2;
    }

    private int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfa93925490f44d4422b36a7b409db2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfa93925490f44d4422b36a7b409db2")).intValue();
        }
        if (this.n != null) {
            String b = am.b(str);
            for (int i = 0; i < this.n.size(); i++) {
                if (TextUtils.equals(this.n.get(i).f, b)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    private l c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb391be5dd486d5b9f15484269f912df", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb391be5dd486d5b9f15484269f912df");
        }
        l d = d(str);
        return d == null ? a(b(str), str) : d;
    }

    private l d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae143dffcea3a9e5dd9bf651b70eadd", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae143dffcea3a9e5dd9bf651b70eadd") : this.m.get(am.b(str));
    }

    @Override // com.meituan.msc.modules.page.transition.a
    public final LayoutTransition getPopTransition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dab0c46e57d4f51a2ce2dbd01b8e938", RobustBitConfig.DEFAULT_VALUE) ? (LayoutTransition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dab0c46e57d4f51a2ce2dbd01b8e938") : this.j.getPopTransition();
    }

    @Override // com.meituan.msc.modules.page.transition.a
    public final LayoutTransition getPushTransition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9161be19e80136decc89489e5c383bf4", RobustBitConfig.DEFAULT_VALUE) ? (LayoutTransition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9161be19e80136decc89489e5c383bf4") : this.j.getPushTransition();
    }

    @Override // com.meituan.msc.modules.page.a
    public final void a() {
        l[] lVarArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb23bfebf304cad29147faff3d0f1bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb23bfebf304cad29147faff3d0f1bdb");
            return;
        }
        for (l lVar : this.l) {
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Override // com.meituan.msc.modules.page.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7224415e4e0af26955b610a38387e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7224415e4e0af26955b610a38387e6");
        } else {
            this.j.b();
        }
    }

    @Override // com.meituan.msc.modules.page.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2ff06e7260f2d589329aed891008bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2ff06e7260f2d589329aed891008bf");
        } else {
            this.j.a(i);
        }
    }

    @Override // com.meituan.msc.modules.page.a
    public final String getRoutePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ebd00b2f9e2e54aca7b834af447823", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ebd00b2f9e2e54aca7b834af447823") : this.j.getRoutePath();
    }

    @Override // com.meituan.msc.modules.page.a
    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a939f356704eb17b65febe2fdc5c3c2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a939f356704eb17b65febe2fdc5c3c2")).intValue() : this.j.getViewId();
    }

    @Override // com.meituan.msc.modules.page.a
    public final e b(int i) {
        l[] lVarArr;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47eedf01d6bf2a2cad5088677db23d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47eedf01d6bf2a2cad5088677db23d6e");
        }
        for (l lVar : this.l) {
            if (lVar != null && i == lVar.getViewId()) {
                return lVar.b(i);
            }
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.a
    public final l getPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34e295e603c4fbb94b9cf8056e7c071", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34e295e603c4fbb94b9cf8056e7c071") : getCurPage();
    }

    @Override // com.meituan.msc.modules.page.a
    public final com.meituan.msc.modules.page.reload.b[] getPageInfos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4f9bc74aa27612fa7d18d6117209e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.reload.b[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4f9bc74aa27612fa7d18d6117209e3");
        }
        com.meituan.msc.modules.page.reload.b[] bVarArr = this.p != null ? this.p : new com.meituan.msc.modules.page.reload.b[this.l.length];
        for (int i = 0; i < bVarArr.length; i++) {
            com.meituan.msc.modules.page.reload.b bVar = bVarArr[i];
            if (bVar == null || bVar.c == -1 || bVar.a == null) {
                l lVar = this.l[i];
                bVar = lVar != null ? lVar.getPageInfoOne() : new com.meituan.msc.modules.page.reload.b();
            }
            if (bVar.c == getViewId()) {
                bVar.b = true;
            }
            bVarArr[i] = bVar;
        }
        return bVarArr;
    }
}
