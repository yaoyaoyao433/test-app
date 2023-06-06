package com.meituan.msc.views.precreate;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.msc.mmpviews.richtext.MPRichTextShadowNode;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.text.MPRawTextShadowNode;
import com.meituan.msc.mmpviews.text.MPTextShadowNode;
import com.meituan.msc.mmpviews.text.MPVirtualTextShadowNode;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b o;
    public final C0492b<MPLayoutShadowNode> b;
    public final C0492b<MPTextShadowNode> c;
    public final C0492b<MPVirtualTextShadowNode> d;
    public final C0492b<MPRawTextShadowNode> e;
    public final C0492b<MPRichTextShadowNode> f;
    public final C0492b<MPLayoutShadowNode> g;
    public final C0492b<MPLayoutShadowNode> h;
    public final C0492b<MPLayoutShadowNode> i;
    public final C0492b<MPLayoutShadowNode> j;
    public final C0492b<MPLayoutShadowNode> k;
    public final C0492b<MPLayoutShadowNode> l;
    public final C0492b<MPLayoutShadowNode> m;
    public final C0492b<MPLayoutShadowNode> n;

    public static /* synthetic */ aa a(b bVar, String str) {
        aa mPLayoutShadowNode;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "16a8813760e49a62509740ee757a4ed5", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "16a8813760e49a62509740ee757a4ed5");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1365074353:
                if (str.equals("MSCScrollView")) {
                    c = 2;
                    break;
                }
                break;
            case -1288108491:
                if (str.equals("MSCSwiper")) {
                    c = 7;
                    break;
                }
                break;
            case -967585048:
                if (str.equals("MSCSwiperItem")) {
                    c = '\b';
                    break;
                }
                break;
            case -605282306:
                if (str.equals("MSCImage")) {
                    c = 1;
                    break;
                }
                break;
            case -597945645:
                if (str.equals("MSCRList")) {
                    c = 5;
                    break;
                }
                break;
            case 512364957:
                if (str.equals("MSCListCell")) {
                    c = 4;
                    break;
                }
                break;
            case 512934624:
                if (str.equals("MSCListView")) {
                    c = 3;
                    break;
                }
                break;
            case 1472422022:
                if (str.equals("MSCRListItem")) {
                    c = 6;
                    break;
                }
                break;
            case 1513060184:
                if (str.equals("MSCRawText")) {
                    c = 11;
                    break;
                }
                break;
            case 1878854459:
                if (str.equals("MSCVirtualText")) {
                    c = '\n';
                    break;
                }
                break;
            case 1910650534:
                if (str.equals("MSCRichText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2059005482:
                if (str.equals("MSCText")) {
                    c = '\t';
                    break;
                }
                break;
            case 2059068322:
                if (str.equals("MSCView")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
                mPLayoutShadowNode = new MPLayoutShadowNode();
                break;
            case '\t':
                mPLayoutShadowNode = new MPTextShadowNode();
                break;
            case '\n':
                mPLayoutShadowNode = new MPVirtualTextShadowNode();
                break;
            case 11:
                mPLayoutShadowNode = new MPRawTextShadowNode();
                break;
            case '\f':
                mPLayoutShadowNode = new MPRichTextShadowNode();
                break;
            default:
                throw new RuntimeException("unknown class name for shadow cache");
        }
        mPLayoutShadowNode.b(str);
        mPLayoutShadowNode.c(str);
        mPLayoutShadowNode.g(1);
        return mPLayoutShadowNode;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9d114c154f491530d4868fc8efe3e9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9d114c154f491530d4868fc8efe3e9b");
        }
        if (o == null) {
            synchronized (b.class) {
                if (o == null) {
                    o = new b();
                }
            }
        }
        return o;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3072ddbe11a93d248720aef8d45415", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3072ddbe11a93d248720aef8d45415");
            return;
        }
        this.b = new C0492b<>(300, 30, new ArrayList());
        this.c = new C0492b<>(100, 20, new ArrayList());
        this.d = new C0492b<>(50, 20, new ArrayList());
        this.e = new C0492b<>(100, 20, new ArrayList());
        this.f = new C0492b<>(10, 3, new ArrayList());
        this.k = new C0492b<>(50, 20, new ArrayList());
        this.j = new C0492b<>(5, 2, new ArrayList());
        this.h = new C0492b<>(5, 2, new ArrayList());
        this.g = new C0492b<>(10, 3, new ArrayList());
        this.n = new C0492b<>(3, 1, new ArrayList());
        this.i = new C0492b<>(10, 3, new ArrayList());
        this.l = new C0492b<>(3, 1, new ArrayList());
        this.m = new C0492b<>(10, 3, new ArrayList());
    }

    public <T extends aa> void a(String str, C0492b<T> c0492b) {
        Object[] objArr = {str, c0492b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f612900d9288eed6004141a934320f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f612900d9288eed6004141a934320f");
            return;
        }
        synchronized (c0492b) {
            if (c0492b.e) {
                return;
            }
            c0492b.e = true;
            com.meituan.msc.common.executor.a.a(new a(str, c0492b));
        }
    }

    public final <T extends aa> T a(String str, as<? extends View, T> asVar) {
        C0492b c0492b;
        T remove;
        Object[] objArr = {str, asVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b1f84a6aeed92206214b9993901f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b1f84a6aeed92206214b9993901f87");
        }
        c.x++;
        String a2 = asVar.a();
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99988b8318342fa09d9c9a598c1dc400", RobustBitConfig.DEFAULT_VALUE)) {
            char c = 65535;
            switch (a2.hashCode()) {
                case -1365074353:
                    if (a2.equals("MSCScrollView")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1288108491:
                    if (a2.equals("MSCSwiper")) {
                        c = 6;
                        break;
                    }
                    break;
                case -967585048:
                    if (a2.equals("MSCSwiperItem")) {
                        c = 7;
                        break;
                    }
                    break;
                case -605282306:
                    if (a2.equals("MSCImage")) {
                        c = 1;
                        break;
                    }
                    break;
                case -597945645:
                    if (a2.equals("MSCRList")) {
                        c = 4;
                        break;
                    }
                    break;
                case 512364957:
                    if (a2.equals("MSCListCell")) {
                        c = 3;
                        break;
                    }
                    break;
                case 512934624:
                    if (a2.equals("MSCListView")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1472422022:
                    if (a2.equals("MSCRListItem")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1513060184:
                    if (a2.equals("MSCRawText")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1878854459:
                    if (a2.equals("MSCVirtualText")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1910650534:
                    if (a2.equals("MSCRichText")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2059005482:
                    if (a2.equals("MSCText")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2059068322:
                    if (a2.equals("MSCView")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c0492b = this.b;
                    break;
                case 1:
                    c0492b = this.k;
                    break;
                case 2:
                    c0492b = this.l;
                    break;
                case 3:
                    c0492b = this.m;
                    break;
                case 4:
                    c0492b = this.n;
                    break;
                case 5:
                    c0492b = this.i;
                    break;
                case 6:
                    c0492b = this.h;
                    break;
                case 7:
                    c0492b = this.g;
                    break;
                case '\b':
                    c0492b = this.j;
                    break;
                case '\t':
                    c0492b = this.c;
                    break;
                case '\n':
                    c0492b = this.d;
                    break;
                case 11:
                    c0492b = this.e;
                    break;
                case '\f':
                    c0492b = this.f;
                    break;
                default:
                    g.b("PreCreateShadow", "unknown class name for shadow cache: ", a2);
                    c0492b = null;
                    break;
            }
        } else {
            c0492b = (C0492b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99988b8318342fa09d9c9a598c1dc400");
        }
        if (c0492b != null) {
            synchronized (c0492b) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = C0492b.a;
                if (PatchProxy.isSupport(objArr3, c0492b, changeQuickRedirect3, false, "7cdadb237228acf57a53b5d0f2d99102", RobustBitConfig.DEFAULT_VALUE)) {
                    remove = (T) PatchProxy.accessDispatch(objArr3, c0492b, changeQuickRedirect3, false, "7cdadb237228acf57a53b5d0f2d99102");
                } else {
                    remove = c0492b.d.isEmpty() ? null : c0492b.d.remove(0);
                }
                if (c0492b.a() < c0492b.c && !c0492b.e) {
                    c0492b.e = true;
                    com.meituan.msc.common.executor.a.a(new a(str, c0492b));
                }
                if (remove != null) {
                    c.y++;
                    return remove;
                }
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.views.precreate.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0492b<T extends aa> {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public List<T> d;
        public boolean e;

        public C0492b(int i, int i2, List<T> list) {
            Object[] objArr = {b.this, Integer.valueOf(i), Integer.valueOf(i2), list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ccf0f48c1198d53971725fba51b7a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ccf0f48c1198d53971725fba51b7a1");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = list;
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74976037180b4417803dcc768c6e990f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74976037180b4417803dcc768c6e990f")).intValue() : this.d.size();
        }

        public final void a(List<T> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359af4d9f3d8f13c46f3d56f35dec3cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359af4d9f3d8f13c46f3d56f35dec3cb");
            } else {
                this.d.addAll(list);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a<T extends aa> implements Runnable {
        public static ChangeQuickRedirect a;
        public String b;
        public final C0492b<T> c;

        public a(String str, @NonNull C0492b<T> c0492b) {
            Object[] objArr = {b.this, str, c0492b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5513777df7c54f393f0f6f3c22ab3d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5513777df7c54f393f0f6f3c22ab3d8");
                return;
            }
            this.b = str;
            this.c = c0492b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643bf970d43994cd4671243e57b58ca5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643bf970d43994cd4671243e57b58ca5");
                return;
            }
            synchronized (this.c) {
                int a2 = this.c.b - this.c.a();
                if (a2 <= 0) {
                    return;
                }
                int i = a2 % 20;
                int i2 = (a2 / 20) + (i == 0 ? 0 : 1);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i3 != i2 - 1) {
                        List<T> a3 = a(20);
                        synchronized (this.c) {
                            this.c.a(a3);
                        }
                        continue;
                    } else {
                        List<T> a4 = a(i != 0 ? i : 20);
                        synchronized (this.c) {
                            this.c.a(a4);
                            this.c.e = false;
                        }
                        continue;
                    }
                }
            }
        }

        private List<T> a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3aafc55bd8c7e012d0ad18fc85ddd2", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3aafc55bd8c7e012d0ad18fc85ddd2");
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(b.a(b.this, this.b));
            }
            return arrayList;
        }
    }
}
