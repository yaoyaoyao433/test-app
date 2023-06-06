package com.meituan.android.cube.pga.block;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.view.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a<ViewType extends com.meituan.android.cube.pga.view.a, ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends b<ViewModelType, ContextType> {
    public static ChangeQuickRedirect f;
    public ViewType g;
    @Nullable
    protected ViewStub h;
    protected Boolean i;
    private ArrayList<a> r;
    private ArrayList<a> s;
    private List<a> t;

    public void B() {
    }

    public View a(ViewGroup viewGroup) {
        return viewGroup;
    }

    public void y() {
    }

    public abstract ViewType z();

    public final ArrayList<a> q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c4a5457c01238c79a9d8795f4424cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c4a5457c01238c79a9d8795f4424cf");
        }
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        return this.r;
    }

    @Override // com.meituan.android.cube.core.f
    public View i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4f02dc498b4753f16d313cb67ace92", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4f02dc498b4753f16d313cb67ace92") : this.g.a();
    }

    public final ViewType r() {
        return this.g;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ff2650a418fdd1b03012c077221d98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ff2650a418fdd1b03012c077221d98");
            return;
        }
        this.s = new ArrayList<>();
        this.t = new ArrayList();
        this.i = Boolean.FALSE;
    }

    public a(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083888a97365a06b5abf41d23ac2149d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083888a97365a06b5abf41d23ac2149d");
            return;
        }
        this.s = new ArrayList<>();
        this.t = new ArrayList();
        this.i = Boolean.FALSE;
    }

    public a(ContextType contexttype, @Nullable ViewStub viewStub) {
        Object[] objArr = {contexttype, viewStub};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72aedce71d43729c2b0c8ccfa0c66297", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72aedce71d43729c2b0c8ccfa0c66297");
            return;
        }
        this.s = new ArrayList<>();
        this.t = new ArrayList();
        this.i = Boolean.FALSE;
        this.h = viewStub;
        a((a<ViewType, ViewModelType, ContextType>) contexttype);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a2205815ceefe58e6de0dd5ca4a34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a2205815ceefe58e6de0dd5ca4a34a");
            return;
        }
        this.g = z();
        super.s();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752fae2f96b2702458152b3a96ea4600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752fae2f96b2702458152b3a96ea4600");
            return;
        }
        if (this.n != null) {
            this.n.a(obj);
        }
        if (this.q) {
            for (b bVar : E()) {
                if (!bVar.p) {
                    com.meituan.android.cube.pga.action.c<Object, DataType> cVar = bVar.n.f;
                    bVar.b(cVar == 0 ? obj : cVar.a(obj));
                }
            }
            Iterator<a> it = q().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.p) {
                    com.meituan.android.cube.pga.action.c<Object, DataType> cVar2 = next.n.f;
                    next.b(cVar2 == 0 ? obj : cVar2.a(obj));
                }
            }
        }
    }

    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7144e5cd21047021d4d80f0d43895883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7144e5cd21047021d4d80f0d43895883");
        } else {
            a(aVar, -1);
        }
    }

    public final void a(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c383710e6d8d498dbb554f54f8052227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c383710e6d8d498dbb554f54f8052227");
        } else {
            a(aVar, (ViewGroup) u().findViewById(i));
        }
    }

    public void a(a aVar, ViewGroup viewGroup) {
        Object[] objArr = {aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd46fed30634bddd92015129461d36b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd46fed30634bddd92015129461d36b1");
        } else if (!(i() instanceof ViewGroup)) {
            throw new IllegalStateException("View无法添加子Block");
        } else {
            if (aVar.h == null && aVar.i().getParent() == null) {
                if (viewGroup != null) {
                    viewGroup.addView(aVar.i());
                } else {
                    u().addView(aVar.i());
                }
            }
            aVar.a((b) this);
            q().add(aVar);
            aVar.c((b) this);
            aVar.A();
        }
    }

    public void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1369c479469ccde31be26f4154b9c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1369c479469ccde31be26f4154b9c2");
        } else if (q().contains(aVar)) {
            if (!(i() instanceof ViewGroup)) {
                throw new IllegalStateException("View无法移除子Block");
            }
            if (aVar.i().getParent() instanceof ViewGroup) {
                ((ViewGroup) aVar.i().getParent()).removeView(aVar.i());
            }
            q().remove(aVar);
            aVar.k = null;
        }
    }

    public final ViewGroup u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2814a4ff2b5ac10e7014765eabefbcd2", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2814a4ff2b5ac10e7014765eabefbcd2") : (ViewGroup) i();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce558d9f863937a7779c3828d5b276d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce558d9f863937a7779c3828d5b276d3");
            return;
        }
        Iterator it = new ArrayList(q()).iterator();
        while (it.hasNext()) {
            ((a) it.next()).v();
        }
        a D = D();
        if (D != null) {
            D.b((a) this);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dc5763f734152423b2b7f6311a9ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dc5763f734152423b2b7f6311a9ce3");
            return;
        }
        super.w();
        Iterator it = new ArrayList(q()).iterator();
        while (it.hasNext()) {
            ((a) it.next()).v();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3a75466907cc93c1cec4ed7e0072b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3a75466907cc93c1cec4ed7e0072b5");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.g.a().getLayoutParams();
        if (layoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        this.g.a().setLayoutParams(marginLayoutParams);
    }

    public void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af1fe3dc5bb30d4d72796a6b86c1ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af1fe3dc5bb30d4d72796a6b86c1ddf");
        } else if (com.meituan.android.cube.util.a.a(this.g.a(), rect)) {
            Iterator<a> it = q().iterator();
            while (it.hasNext()) {
                it.next().a(rect);
            }
            y();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    @Nullable
    /* renamed from: x */
    public final a D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3328045f96c6a967cdcf4e76ebce6f6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3328045f96c6a967cdcf4e76ebce6f6e");
        }
        b D = super.D();
        if (D != null && !(D instanceof a)) {
            throw new IllegalStateException("Block的ParentBlock类型错误");
        }
        return (a) D;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd779d5474c70535aa43b2e1494f69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd779d5474c70535aa43b2e1494f69b");
        } else {
            super.A();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void a(@Nullable b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20c414e76f2059afc89f9dd037cc35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20c414e76f2059afc89f9dd037cc35e");
            return;
        }
        super.a(bVar);
        if (bVar == null) {
            Iterator<a> it = this.s.iterator();
            while (it.hasNext()) {
                it.next().v();
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45b7c6ce602434ba3c5a6f37529a68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45b7c6ce602434ba3c5a6f37529a68c");
            return;
        }
        super.b(bundle);
        ArrayList<a> q = q();
        for (int i = 0; i < q.size(); i++) {
            q.get(i).b(bundle);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8890015a5a7f114bac0213372eef216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8890015a5a7f114bac0213372eef216");
            return;
        }
        super.c(bundle);
        if (bundle == null) {
            return;
        }
        ArrayList<a> q = q();
        for (int i = 0; i < q.size(); i++) {
            a aVar = q.get(i);
            aVar.o = bundle;
            aVar.c(bundle);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void a(ViewModelType viewmodeltype) {
        Object[] objArr = {viewmodeltype};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d80b89bf7b81adad64ac2298171f99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d80b89bf7b81adad64ac2298171f99");
            return;
        }
        super.a((a<ViewType, ViewModelType, ContextType>) viewmodeltype);
        this.i = Boolean.TRUE;
    }

    public final Rect C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd47e4fbc33a985b4bb23be935207b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd47e4fbc33a985b4bb23be935207b2");
        }
        if (i() == null) {
            return new Rect();
        }
        return new Rect();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014740d181b568186ae6efce3c486f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014740d181b568186ae6efce3c486f4b");
            return;
        }
        if (this.q) {
            for (b bVar : E()) {
                if (!bVar.p) {
                    bVar.t();
                }
            }
            Iterator<a> it = q().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.p) {
                    next.t();
                }
            }
        }
        I();
    }
}
