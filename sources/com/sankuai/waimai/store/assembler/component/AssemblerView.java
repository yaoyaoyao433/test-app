package com.sankuai.waimai.store.assembler.component;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.LayoutSizeObservableView;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AssemblerView extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener {
    public static ChangeQuickRedirect a;
    private boolean A;
    private PageEventHandler B;
    public PrioritySmoothNestedScrollView b;
    protected com.sankuai.waimai.store.param.a c;
    private FrameLayout d;
    private LinearLayout e;
    private LayoutSizeObservableView f;
    private LayoutSizeObservableView g;
    private ViewGroup h;
    private List<g> i;
    private List<BaseCard> j;
    private List<BaseCard> k;
    private List<Integer> l;
    private SparseArray<h> m;
    private Set<a> n;
    private q o;
    private final Handler p;
    private j q;
    private k r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public static /* synthetic */ ViewGroup a(AssemblerView assemblerView, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "901366f061e236347c0eb42a5195c006", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "901366f061e236347c0eb42a5195c006");
        }
        if (t.a(str)) {
            return null;
        }
        for (g gVar : assemblerView.i) {
            if (str.equals(gVar.d.c.b)) {
                return (ViewGroup) gVar.a;
            }
        }
        for (BaseCard baseCard : assemblerView.j) {
            if (str.equals(baseCard.c.b)) {
                return baseCard.b;
            }
        }
        for (BaseCard baseCard2 : assemblerView.k) {
            if (str.equals(baseCard2.c.b)) {
                return baseCard2.b;
            }
        }
        return null;
    }

    public static /* synthetic */ void a(AssemblerView assemblerView, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "a589f18314756fb887c5720e0ed6ceef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "a589f18314756fb887c5720e0ed6ceef");
        } else if (i2 <= 0 || assemblerView.h == null) {
        } else {
            h hVar = assemblerView.m.get(assemblerView.t);
            ViewGroup.LayoutParams layoutParams = assemblerView.h.getLayoutParams();
            if (hVar == null || layoutParams == null) {
                return;
            }
            if (layoutParams.height <= 0 || hVar.c <= 0) {
                hVar.c = i2;
                layoutParams.height = i2;
                assemblerView.h.setLayoutParams(layoutParams);
            }
        }
    }

    public static /* synthetic */ void a(AssemblerView assemblerView, BaseCard baseCard) {
        g gVar;
        Object[] objArr = {baseCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "bda8e545339b397cfa2cb4240eb3e2c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "bda8e545339b397cfa2cb4240eb3e2c9");
            return;
        }
        if (baseCard.c.a.equals(f.FloatTitle)) {
            assemblerView.t = -1;
        }
        switch (baseCard.c.a) {
            case Background:
                if (assemblerView.j.size() > 0 && baseCard == assemblerView.j.get(0)) {
                    assemblerView.d.removeView(assemblerView.j.get(0).b);
                    break;
                }
                break;
            case Float:
                if (assemblerView.k.size() > 0 && assemblerView.k.contains(baseCard)) {
                    assemblerView.removeView(baseCard.b);
                    assemblerView.k.remove(baseCard);
                    break;
                }
                break;
            default:
                Object[] objArr2 = {baseCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, assemblerView, changeQuickRedirect2, false, "4a286360052c864303aabb31da4ebe8f", RobustBitConfig.DEFAULT_VALUE)) {
                    if (assemblerView.o != null && assemblerView.i.size() > 0) {
                        int i = 0;
                        while (true) {
                            if (i >= assemblerView.i.size()) {
                                gVar = null;
                                i = -1;
                            } else if (assemblerView.i.get(i).b == System.identityHashCode(baseCard)) {
                                gVar = assemblerView.i.remove(i);
                            } else {
                                i++;
                            }
                        }
                        if (i != -1 && gVar != null) {
                            if (baseCard.c.a.equals(f.MultiList)) {
                                assemblerView.y = -1;
                            } else if (baseCard.c.a.equals(f.FloatTitle)) {
                                assemblerView.t = -1;
                            }
                            q qVar = assemblerView.o;
                            Object[] objArr3 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = q.a;
                            if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "fc88259a7631a594e17811dcc2099cf3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "fc88259a7631a594e17811dcc2099cf3");
                            } else {
                                View childAt = qVar.b.getChildAt(i);
                                if (childAt != null) {
                                    qVar.b.removeView(childAt);
                                }
                            }
                            h hVar = assemblerView.m.get(i);
                            if (hVar != null && hVar.a != null) {
                                if (hVar.d) {
                                    if (baseCard.c.a.equals(f.FloatTitle)) {
                                        assemblerView.g.removeView(hVar.a);
                                        assemblerView.f.setPadding(0, 0, 0, 0);
                                    } else {
                                        assemblerView.f.removeView(hVar.a);
                                    }
                                    hVar.d = false;
                                } else {
                                    if (baseCard.c.a.equals(f.FloatTitle)) {
                                        assemblerView.g.removeAllViews();
                                        assemblerView.f.setPadding(0, 0, 0, 0);
                                    }
                                    ((ViewGroup) gVar.a).removeView(baseCard.b);
                                }
                                assemblerView.m.remove(i);
                            } else {
                                ((ViewGroup) gVar.a).removeView(baseCard.b);
                            }
                        }
                        assemblerView.f();
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr2, assemblerView, changeQuickRedirect2, false, "4a286360052c864303aabb31da4ebe8f");
                    break;
                }
                break;
        }
        a aVar = baseCard instanceof a ? (a) baseCard : null;
        if (assemblerView.n.size() <= 0 || aVar == null || !assemblerView.n.contains(aVar)) {
            return;
        }
        assemblerView.n.remove(aVar);
    }

    public static /* synthetic */ void a(AssemblerView assemblerView, BaseCard baseCard, boolean z, int i) {
        Object[] objArr = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "d9a9c266e9f1c4e32ea56419e0c66815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "d9a9c266e9f1c4e32ea56419e0c66815");
        } else if (f.Background.equals(baseCard.c.a) || f.FloatTitle.equals(baseCard.c.a) || f.Float.equals(baseCard.c.a) || !assemblerView.a(baseCard)) {
        } else {
            if (z && i >= 0 && assemblerView.A && assemblerView.B != null) {
                assemblerView.B.a((PageEventHandler) new o(i));
            }
            View view = null;
            int i2 = 0;
            while (true) {
                if (i2 >= assemblerView.i.size()) {
                    break;
                } else if (baseCard == assemblerView.i.get(i2).d) {
                    view = assemblerView.i.get(i2).a;
                    break;
                } else {
                    i2++;
                }
            }
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int fakeViewHeight = (iArr[1] - assemblerView.getFakeViewHeight()) + baseCard.b();
                if (fakeViewHeight > 0) {
                    assemblerView.b.scrollBy(0, fakeViewHeight);
                }
            }
        }
    }

    public static /* synthetic */ void a(AssemblerView assemblerView, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "c00d4f53181253b25191adb4daea504a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "c00d4f53181253b25191adb4daea504a");
        } else if (list != null && list.size() > 0) {
            assemblerView.c();
            assemblerView.f.removeAllViews();
            assemblerView.g.removeAllViews();
            assemblerView.f.setPadding(0, 0, 0, 0);
            for (int i = 0; i < assemblerView.m.size(); i++) {
                assemblerView.m.valueAt(i).d = false;
            }
            assemblerView.t = -1;
            assemblerView.y = -1;
            while (assemblerView.i.size() > 0) {
                g remove = assemblerView.i.remove(assemblerView.i.size() - 1);
                a aVar = remove.d instanceof a ? (a) remove.d : null;
                if (aVar != null && assemblerView.n.contains(aVar)) {
                    assemblerView.n.remove(aVar);
                }
                ((ViewGroup) remove.a).removeAllViews();
            }
            assemblerView.m.clear();
            while (list.size() > 0) {
                BaseCard baseCard = (BaseCard) list.remove(0);
                if (baseCard != null) {
                    assemblerView.a(baseCard, true);
                }
            }
            assemblerView.f();
            assemblerView.o.a();
            assemblerView.d();
        }
    }

    public static /* synthetic */ void b(AssemblerView assemblerView, final List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "894580434ad32848611681055a9dd8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "894580434ad32848611681055a9dd8c0");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            assemblerView.p.removeCallbacksAndMessages(null);
            assemblerView.p.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19fdabb8012a0e97f89fdf45c7e46d72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19fdabb8012a0e97f89fdf45c7e46d72");
                        return;
                    }
                    while (AssemblerView.this.k.size() > 0) {
                        AssemblerView.a(AssemblerView.this, (BaseCard) AssemblerView.this.k.get(0));
                    }
                    for (BaseCard baseCard : list) {
                        if (baseCard != null) {
                            AssemblerView.this.a(baseCard, false);
                        }
                    }
                }
            }, 200L);
        }
    }

    public static /* synthetic */ void f(AssemblerView assemblerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "31647e5fee0c294b9708f965612dda57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "31647e5fee0c294b9708f965612dda57");
        } else if (assemblerView.n.size() > 0) {
            for (a aVar : assemblerView.n) {
                aVar.a(Math.max(assemblerView.u, 0), assemblerView.s, assemblerView.v, assemblerView.w);
            }
        }
    }

    public static /* synthetic */ void g(AssemblerView assemblerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "dfadcb74cb413c1d1c06c9d861fb16f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "dfadcb74cb413c1d1c06c9d861fb16f2");
            return;
        }
        for (int i = 0; i < assemblerView.l.size(); i++) {
            int intValue = assemblerView.l.get(i).intValue();
            g gVar = (g) com.sankuai.shangou.stone.util.a.a((List<Object>) assemblerView.i, intValue);
            n nVar = null;
            ViewGroup viewGroup = gVar == null ? null : (ViewGroup) gVar.a;
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                g gVar2 = assemblerView.i.get(intValue);
                if (gVar2 != null && (gVar2.d instanceof n)) {
                    nVar = (n) gVar2.d;
                }
                if (viewGroup != null) {
                    h hVar = assemblerView.m.get(intValue);
                    if (hVar == null || hVar.a == null) {
                        View childAt = viewGroup.getChildAt(0);
                        if (childAt != null) {
                            h hVar2 = new h();
                            hVar2.c = viewGroup.getHeight();
                            hVar2.b = viewGroup.getWidth();
                            hVar2.a = childAt;
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            layoutParams.width = hVar2.b;
                            layoutParams.height = hVar2.c;
                            viewGroup.setLayoutParams(layoutParams);
                            if (assemblerView.a(viewGroup, marginLayoutParams, assemblerView.v ? 0 : hVar2.c)) {
                                viewGroup.removeView(childAt);
                                assemblerView.f.addView(childAt);
                                hVar2.d = true;
                                assemblerView.x += hVar2.c;
                                if (nVar != null) {
                                    nVar.a(true);
                                }
                            }
                            assemblerView.m.put(intValue, hVar2);
                        }
                    } else if (assemblerView.a(viewGroup, marginLayoutParams, assemblerView.v ? 0 : hVar.c)) {
                        if (!hVar.d) {
                            viewGroup.removeView(hVar.a);
                            assemblerView.f.addView(hVar.a);
                            hVar.d = true;
                            assemblerView.x += hVar.c;
                            if (nVar != null) {
                                nVar.a(true);
                            }
                        }
                    } else if (hVar.d) {
                        assemblerView.f.removeView(hVar.a);
                        viewGroup.addView(hVar.a);
                        hVar.d = false;
                        assemblerView.x -= hVar.c;
                        if (nVar != null) {
                            nVar.a(false);
                        }
                    }
                }
            }
        }
        for (g gVar3 : assemblerView.i) {
            if (!f.Sticky.equals(gVar3.d.c.a) && (gVar3.d instanceof n)) {
                int[] iArr = new int[2];
                gVar3.a.getLocationOnScreen(iArr);
                ((n) gVar3.d).a(iArr[1] - assemblerView.f.getHeight() <= 0);
            }
        }
    }

    public static /* synthetic */ void o(AssemblerView assemblerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, assemblerView, changeQuickRedirect, false, "0ba30524101623f5edb9fbe3347091cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, assemblerView, changeQuickRedirect, false, "0ba30524101623f5edb9fbe3347091cb");
        } else if (assemblerView.t < 0 || assemblerView.m.get(assemblerView.t) != null) {
        } else {
            g gVar = (g) com.sankuai.shangou.stone.util.a.a((List<Object>) assemblerView.i, assemblerView.t);
            final ViewGroup viewGroup = gVar == null ? null : (ViewGroup) gVar.a;
            assemblerView.h = viewGroup;
            if (viewGroup != null) {
                viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f03313aae60c4b3fb054a1441ea94a50", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f03313aae60c4b3fb054a1441ea94a50");
                            return;
                        }
                        h hVar = new h();
                        hVar.c = viewGroup.getHeight();
                        hVar.b = viewGroup.getWidth();
                        hVar.a = viewGroup.getChildAt(0);
                        if (hVar.a != null) {
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            layoutParams.height = hVar.c;
                            layoutParams.width = hVar.b;
                            viewGroup.setLayoutParams(layoutParams);
                            viewGroup.removeView(hVar.a);
                            AssemblerView.this.g.addView(hVar.a);
                            AssemblerView.this.f.setPadding(0, hVar.c, 0, 0);
                            hVar.d = true;
                            AssemblerView.this.m.put(AssemblerView.this.t, hVar);
                        }
                        AssemblerView.this.b.setForbidScroll(false);
                    }
                });
            }
        }
    }

    public AssemblerView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce662ac967082538b9472b5c548271c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce662ac967082538b9472b5c548271c3");
            return;
        }
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new SparseArray<>();
        this.n = new HashSet();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new j() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(@NonNull BaseCard baseCard, boolean z, int i) {
                Object[] objArr2 = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d");
                } else {
                    AssemblerView.a(AssemblerView.this, baseCard, z, i);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3");
                } else {
                    AssemblerView.this.c();
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final ViewGroup a(@NonNull String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51") : AssemblerView.a(AssemblerView.this, str);
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            @NonNull
            public final ViewGroup b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf") : AssemblerView.this.e;
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767");
                } else {
                    AssemblerView.this.b.setForbidScroll(z);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z, boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2");
                } else if (AssemblerView.this.b != null) {
                    PrioritySmoothNestedScrollView prioritySmoothNestedScrollView = AssemblerView.this.b;
                    prioritySmoothNestedScrollView.e = z;
                    prioritySmoothNestedScrollView.f = z2;
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee");
                } else if (AssemblerView.this.b != null) {
                    AssemblerView.this.b.setSubCategoryHeight(i);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void b(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171");
                } else if (com.sankuai.shangou.stone.util.a.c(AssemblerView.this.k) > 0) {
                    BaseCard baseCard = (BaseCard) AssemblerView.this.k.get(0);
                    if (baseCard instanceof FloatBaseCard) {
                        ((FloatBaseCard) baseCard).a(z);
                    }
                }
            }
        };
        this.r = new k() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(@NonNull BaseCard baseCard) {
                Object[] objArr2 = {baseCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611");
                } else {
                    AssemblerView.this.a(baseCard, false);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1");
                } else {
                    AssemblerView.a(AssemblerView.this, list);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void b(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008");
                } else {
                    AssemblerView.b(AssemblerView.this, list);
                }
            }
        };
        this.s = 0;
        this.t = -1;
        this.x = 0;
        this.y = -1;
        this.A = false;
        a(context);
    }

    public AssemblerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282c21f32cd9f7dd3fc2f035e24e2d01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282c21f32cd9f7dd3fc2f035e24e2d01");
            return;
        }
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new SparseArray<>();
        this.n = new HashSet();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new j() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(@NonNull BaseCard baseCard, boolean z, int i) {
                Object[] objArr2 = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d");
                } else {
                    AssemblerView.a(AssemblerView.this, baseCard, z, i);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3");
                } else {
                    AssemblerView.this.c();
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final ViewGroup a(@NonNull String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51") : AssemblerView.a(AssemblerView.this, str);
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            @NonNull
            public final ViewGroup b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf") : AssemblerView.this.e;
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767");
                } else {
                    AssemblerView.this.b.setForbidScroll(z);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z, boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2");
                } else if (AssemblerView.this.b != null) {
                    PrioritySmoothNestedScrollView prioritySmoothNestedScrollView = AssemblerView.this.b;
                    prioritySmoothNestedScrollView.e = z;
                    prioritySmoothNestedScrollView.f = z2;
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee");
                } else if (AssemblerView.this.b != null) {
                    AssemblerView.this.b.setSubCategoryHeight(i);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void b(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171");
                } else if (com.sankuai.shangou.stone.util.a.c(AssemblerView.this.k) > 0) {
                    BaseCard baseCard = (BaseCard) AssemblerView.this.k.get(0);
                    if (baseCard instanceof FloatBaseCard) {
                        ((FloatBaseCard) baseCard).a(z);
                    }
                }
            }
        };
        this.r = new k() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(@NonNull BaseCard baseCard) {
                Object[] objArr2 = {baseCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611");
                } else {
                    AssemblerView.this.a(baseCard, false);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1");
                } else {
                    AssemblerView.a(AssemblerView.this, list);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void b(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008");
                } else {
                    AssemblerView.b(AssemblerView.this, list);
                }
            }
        };
        this.s = 0;
        this.t = -1;
        this.x = 0;
        this.y = -1;
        this.A = false;
        a(context);
    }

    public AssemblerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7375501e52b417b0fd788393c3ab3c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7375501e52b417b0fd788393c3ab3c73");
            return;
        }
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new SparseArray<>();
        this.n = new HashSet();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new j() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(@NonNull BaseCard baseCard, boolean z, int i2) {
                Object[] objArr2 = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce347ddc2000f4506636cbdbea3a054d");
                } else {
                    AssemblerView.a(AssemblerView.this, baseCard, z, i2);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f55ba8db3888dad5d80ea43aa51720a3");
                } else {
                    AssemblerView.this.c();
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final ViewGroup a(@NonNull String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f70e8bf12a97c99020a8835bbbf27d51") : AssemblerView.a(AssemblerView.this, str);
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            @NonNull
            public final ViewGroup b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5e7825af6aca44263d249f9de0aafaf") : AssemblerView.this.e;
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "788905007cda8aa8905dafbc4436f767");
                } else {
                    AssemblerView.this.b.setForbidScroll(z);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(boolean z, boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "072cc6182d83844fb5fd6acc0e7907e2");
                } else if (AssemblerView.this.b != null) {
                    PrioritySmoothNestedScrollView prioritySmoothNestedScrollView = AssemblerView.this.b;
                    prioritySmoothNestedScrollView.e = z;
                    prioritySmoothNestedScrollView.f = z2;
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24969078b50b3acfaf1d11bbf8c7c1ee");
                } else if (AssemblerView.this.b != null) {
                    AssemblerView.this.b.setSubCategoryHeight(i2);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.j
            public final void b(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeb0b728d2ab15c2c65960f07baad171");
                } else if (com.sankuai.shangou.stone.util.a.c(AssemblerView.this.k) > 0) {
                    BaseCard baseCard = (BaseCard) AssemblerView.this.k.get(0);
                    if (baseCard instanceof FloatBaseCard) {
                        ((FloatBaseCard) baseCard).a(z);
                    }
                }
            }
        };
        this.r = new k() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(@NonNull BaseCard baseCard) {
                Object[] objArr2 = {baseCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e0ca7f94b6a583a9e621dcd9db9611");
                } else {
                    AssemblerView.this.a(baseCard, false);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void a(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8156f06d44e164e0006bb4e499285dc1");
                } else {
                    AssemblerView.a(AssemblerView.this, list);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.k
            public final void b(List<BaseCard> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe5559680ed8da728d89269e42300008");
                } else {
                    AssemblerView.b(AssemblerView.this, list);
                }
            }
        };
        this.s = 0;
        this.t = -1;
        this.x = 0;
        this.y = -1;
        this.A = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40bbf08b0c34352b32d6596e3b2faae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40bbf08b0c34352b32d6596e3b2faae");
            return;
        }
        this.z = com.sankuai.shangou.stone.util.h.a(context, 48.0f) + u.a();
        this.d = new FrameLayout(context);
        this.b = new PrioritySmoothNestedScrollView(context);
        this.b.setFocusableInTouchMode(true);
        this.b.setFocusable(true);
        this.b.setIsVertical(true);
        this.e = new LinearLayout(context);
        this.e.setOrientation(1);
        this.f = new LayoutSizeObservableView(context);
        this.f.setOrientation(1);
        this.g = new LayoutSizeObservableView(context);
        this.g.setOrientation(1);
        addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        this.b.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f, new FrameLayout.LayoutParams(-1, -2));
        addView(this.g, new FrameLayout.LayoutParams(-1, -2));
        this.e.setBackgroundColor(0);
        this.f.setBackgroundColor(0);
        this.b.requestFocus();
        a();
        this.o = new q(this.e, this.i);
    }

    public void setTitleHeight(int i) {
        this.z = i;
    }

    public void setEnableForceRenderDelay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f448d935dfbf57609646c8907e92e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f448d935dfbf57609646c8907e92e2");
        } else {
            this.o.e = z;
        }
    }

    public void setEnableReceiveGlobalState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af421fc9cf0e90e2ded0cb77c3119a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af421fc9cf0e90e2ded0cb77c3119a78");
            return;
        }
        this.A = z;
        if (this.A && (getContext() instanceof FragmentActivity)) {
            this.B = (PageEventHandler) android.arch.lifecycle.q.a((FragmentActivity) getContext()).a(PageEventHandler.class);
        }
    }

    public void setIsFlowerType(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c6cf6199a8b82025cad68a65b5608f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c6cf6199a8b82025cad68a65b5608f");
        } else if (this.b != null) {
            this.b.setIsFlowerType(z);
        }
    }

    public void setInDataParam(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf201b144ef86f8087c5193cbbcc33c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf201b144ef86f8087c5193cbbcc33c");
            return;
        }
        this.c = aVar;
        if (this.c == null || !this.c.v()) {
            return;
        }
        b();
    }

    public void setForbidDelay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4069d79bbe50513e00ef59e7585f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4069d79bbe50513e00ef59e7585f41");
        } else {
            this.o.f = z;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3856ebfac2a1cbab9eff1bda215d6c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3856ebfac2a1cbab9eff1bda215d6c18");
            return;
        }
        this.b.a(new PrioritySmoothNestedScrollView.a() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
            public final void c_(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "719773bbd75dc96789c8645d6cb53133", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "719773bbd75dc96789c8645d6cb53133");
                    return;
                }
                if (i < 0) {
                    i = 0;
                }
                if (i > AssemblerView.this.u) {
                    AssemblerView.this.v = true;
                } else {
                    AssemblerView.this.v = false;
                }
                if (i != AssemblerView.this.u) {
                    AssemblerView.this.u = i;
                    AssemblerView.f(AssemblerView.this);
                    AssemblerView.g(AssemblerView.this);
                }
            }
        });
        this.b.setOnHomePageSmoothNestedScrollListener(new com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a
            public final void a(View view, int i) {
            }

            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a
            public final void a(View view, int i, boolean z) {
                Object[] objArr2 = {view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba9cdb74d96dda4a738a6bc0478b043", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba9cdb74d96dda4a738a6bc0478b043");
                    return;
                }
                AssemblerView.this.s = i;
                AssemblerView.this.w = z;
                AssemblerView.f(AssemblerView.this);
                if (!AssemblerView.this.A || AssemblerView.this.B == null) {
                    return;
                }
                AssemblerView.this.B.a((PageEventHandler) new l(i));
            }
        });
        this.f.setListener(new LayoutSizeObservableView.a() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.LayoutSizeObservableView.a
            public final void a(int i, int i2, int i3, int i4) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45b3974f7503792075a00106d05f7c06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45b3974f7503792075a00106d05f7c06");
                } else {
                    AssemblerView.this.b();
                }
            }
        });
        this.g.setListener(new LayoutSizeObservableView.a() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.LayoutSizeObservableView.a
            public final void a(int i, int i2, int i3, int i4) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d432ba0afa055f3b6dd2a27ca7c8487", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d432ba0afa055f3b6dd2a27ca7c8487");
                    return;
                }
                AssemblerView.this.f.setPadding(0, i2, 0, 0);
                AssemblerView.a(AssemblerView.this, i, i2);
            }
        });
        getViewTreeObserver().addOnScrollChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4987fd2c6598345ccf969ce20e1e4eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4987fd2c6598345ccf969ce20e1e4eb");
        } else if (this.y < 0 || this.i.get(this.y) == null) {
        } else {
            g gVar = this.i.get(this.y);
            View view = gVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int height = (getHeight() - getFakeViewHeight()) + gVar.d.b() + 1;
            if (height != view.getHeight()) {
                layoutParams.height = height;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    private boolean a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        h hVar;
        Object[] objArr = {view, marginLayoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2343bee1d2ef4907e72d8a19cd992404", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2343bee1d2ef4907e72d8a19cd992404")).booleanValue();
        }
        int height = (this.t < 0 || (hVar = this.m.get(this.t)) == null || !hVar.d) ? 0 : this.g.getHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return ((((iArr[1] - marginLayoutParams.topMargin) - this.b.getPaddingTop()) - height) - this.x) + i <= 0;
    }

    private int getFakeViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab0e3bde9f4e4e1234cf88723337b55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab0e3bde9f4e4e1234cf88723337b55")).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            h valueAt = this.m.valueAt(i2);
            if (valueAt != null) {
                if (this.t >= 0 && valueAt == this.m.get(this.t)) {
                    i += this.z;
                } else {
                    i += valueAt.c;
                }
            }
        }
        return i;
    }

    public k getCardOperator() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull BaseCard baseCard, boolean z) {
        Object[] objArr = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2b82440316b689446a017c2b060837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2b82440316b689446a017c2b060837");
        } else if (z || !a(baseCard)) {
            if (baseCard.c.a.equals(f.FloatTitle)) {
                this.t = 0;
            }
            switch (baseCard.c.a) {
                case Background:
                    if (this.j.size() > 0 && z) {
                        this.j.clear();
                        this.d.removeAllViews();
                    }
                    baseCard.f = this.q;
                    this.j.add(baseCard);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0af7cf16066ce357ddc08ed48efdbb65", RobustBitConfig.DEFAULT_VALUE)) {
                        if (this.j.size() > 0) {
                            this.d.addView(this.j.get(0).b, new ViewGroup.LayoutParams(-1, -1));
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0af7cf16066ce357ddc08ed48efdbb65");
                        break;
                    }
                    break;
                case Float:
                    if (this.k.size() > 0 && z) {
                        while (this.k.size() > 0) {
                            BaseCard remove = this.k.remove(0);
                            if (remove != null && remove.b != null) {
                                removeView(remove.b);
                            }
                        }
                    }
                    baseCard.f = this.q;
                    this.k.add(baseCard);
                    e();
                    break;
                default:
                    Object[] objArr3 = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4e4b3a1d67b01e8fa1716dbe544edb5", RobustBitConfig.DEFAULT_VALUE)) {
                        baseCard.f = this.q;
                        this.i.add(new g(baseCard));
                        if (!z) {
                            f();
                            this.o.a();
                            d();
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4e4b3a1d67b01e8fa1716dbe544edb5");
                        break;
                    }
                    break;
            }
            if (baseCard instanceof a) {
                this.n.add((a) baseCard);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d6c30d3370ed07cad4ce2e06847ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d6c30d3370ed07cad4ce2e06847ba4");
        } else {
            this.b.scrollTo(0, 0);
        }
    }

    public PrioritySmoothNestedScrollView getScrollRootView() {
        return this.b;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d013679e74451a7d470572764b66327a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d013679e74451a7d470572764b66327a");
            return;
        }
        this.b.setForbidScroll(true);
        this.b.post(new Runnable() { // from class: com.sankuai.waimai.store.assembler.component.AssemblerView.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "718a3d8c687f4180f5bebe11a09152a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "718a3d8c687f4180f5bebe11a09152a6");
                } else {
                    AssemblerView.o(AssemblerView.this);
                }
            }
        });
    }

    private boolean a(BaseCard baseCard) {
        boolean z = false;
        Object[] objArr = {baseCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ee49f945083af422a3c6f4ff9ebf1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ee49f945083af422a3c6f4ff9ebf1c")).booleanValue();
        }
        z = (this.k.contains(baseCard) || this.j.contains(baseCard)) ? true : true;
        for (g gVar : this.i) {
            if (gVar.d == baseCard) {
                return true;
            }
        }
        return z;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b98acec21eb445ac6ca4123aba79203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b98acec21eb445ac6ca4123aba79203");
            return;
        }
        for (BaseCard baseCard : this.k) {
            e a2 = baseCard.a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(getContext(), a2.e);
            layoutParams.bottomMargin = com.sankuai.shangou.stone.util.h.a(getContext(), a2.f);
            layoutParams.leftMargin = com.sankuai.shangou.stone.util.h.a(getContext(), a2.c);
            layoutParams.rightMargin = com.sankuai.shangou.stone.util.h.a(getContext(), a2.d);
            if (a2.a == 3 && a2.b == 2) {
                layoutParams.gravity = 83;
            } else if (a2.a == 4 && a2.b == 2) {
                layoutParams.gravity = 85;
            } else if (a2.a == 3 && a2.b == 1) {
                layoutParams.gravity = 51;
            } else if (a2.a == 4 && a2.b == 1) {
                layoutParams.gravity = 53;
            }
            addView(baseCard.b, layoutParams);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c1fefeb90122f6cdcb42af2f363297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c1fefeb90122f6cdcb42af2f363297");
            return;
        }
        this.l.clear();
        for (int i = 0; i < this.i.size(); i++) {
            g gVar = this.i.get(i);
            gVar.c = i;
            if (gVar.d.c.a.equals(f.MultiList)) {
                this.y = i;
            } else if (gVar.d.c.a.equals(f.Sticky)) {
                this.l.add(Integer.valueOf(i));
            } else if (gVar.d.c.a.equals(f.FloatTitle)) {
                this.t = 0;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa313068b549cd4126297bedf9a390b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa313068b549cd4126297bedf9a390b9");
        } else if (!this.o.d || this.y < 0 || this.i.get(this.y) == null) {
        } else {
            g gVar = (g) com.sankuai.shangou.stone.util.a.a((List<Object>) this.i, this.y);
            View view = gVar == null ? null : gVar.a;
            BaseCard baseCard = gVar == null ? null : gVar.d;
            if (view == null || baseCard == null) {
                return;
            }
            n nVar = baseCard instanceof n ? (n) baseCard : null;
            m mVar = baseCard instanceof m ? (m) baseCard : null;
            int b = baseCard.b();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = (this.m.size() != 1 || this.t < 0) ? this.f.getHeight() : this.z;
            if (mVar != null) {
                int i = iArr[1] - height;
                mVar.a(i <= 0, i + b <= 0, this.u);
            } else if (nVar != null) {
                boolean z = iArr[1] - height <= 0;
                if (view.getTag() == null) {
                    view.setTag(Boolean.valueOf(z));
                    nVar.a(z);
                    return;
                }
                if (((Boolean) view.getTag()).booleanValue() != z) {
                    nVar.a(z);
                }
                view.setTag(Boolean.valueOf(z));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e17427fc4128f517812956e4b0b908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e17427fc4128f517812956e4b0b908");
            return;
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this);
        this.p.removeCallbacksAndMessages(null);
        if (this.o != null) {
            q qVar = this.o;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = q.a;
            if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "415686262a707015ca5d543e4eb9fe3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "415686262a707015ca5d543e4eb9fe3f");
            } else {
                qVar.c.removeCallbacksAndMessages(null);
            }
        }
    }
}
