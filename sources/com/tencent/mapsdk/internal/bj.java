package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.common.StringUtil;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.jz;
import com.tencent.mapsdk.internal.pe;
import com.tencent.mapsdk.internal.rg;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bj implements bc, pe.a, rg.c {
    public final be a;
    jz.a b;
    public TencentMap.OnMarkerDragListener c;
    public final bi d;
    public ev e;
    public List<eu> f;
    public ex g;
    public es h;
    private Marker l;
    private Marker m;
    private Marker n;
    private Marker j = null;
    private boolean k = false;
    public final Map<Class<? extends mr>, mq> i = new HashMap();

    public bj(bi biVar, be beVar) {
        this.a = beVar;
        this.d = biVar;
    }

    public final void a(er erVar) {
        bi biVar = this.d;
        bf bfVar = biVar.h;
        synchronized (bfVar.a) {
            if (!bfVar.a.contains(erVar)) {
                bfVar.a.add(erVar);
            }
        }
        if (erVar instanceof en) {
            biVar.a((en) erVar);
        }
    }

    private void c(er erVar) {
        a(erVar);
    }

    private void d(er erVar) {
        a(erVar);
    }

    private void e(er erVar) {
        a(erVar);
    }

    private void f(er erVar) {
        a(erVar);
    }

    public final void b(er erVar) {
        bf bfVar = this.d.h;
        if (erVar != null) {
            synchronized (bfVar.a) {
                bfVar.a.remove(erVar);
                bfVar.b.add(erVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <O extends mr, L extends mp<O>> L a(O o) {
        be beVar = this.a;
        if (o == null || beVar == null) {
            return null;
        }
        mq mqVar = this.i.get(o.getClass());
        if (mqVar == null) {
            if (o.getClass() == nk.class) {
                mqVar = new nj(beVar.f());
            } else if (o.getClass() == my.class) {
                mqVar = new mx(beVar.f());
            } else if (o.getClass() == mu.class) {
                mqVar = new mv(beVar.f());
            } else if (o.getClass() == nb.class) {
                mqVar = new na(beVar.f());
            } else if (o.getClass() == ne.class) {
                mqVar = new nd(beVar.f());
            } else if (o.getClass() == nh.class) {
                mqVar = new nf(beVar.f());
            } else if (o.getClass() == nn.class) {
                mqVar = new nm(beVar.f());
            } else if (o.getClass() == nq.class) {
                mqVar = new np(beVar.f());
            }
            this.i.put(o.getClass(), mqVar);
        }
        return (L) mqVar.b((mq) o);
    }

    private <O extends mr, L extends mp<O>> void a(int i, O o) {
        mp a;
        mq mqVar = this.i.get(o.getClass());
        if (mqVar == null || (a = mqVar.a(i)) == null) {
            return;
        }
        a.a((mp) o);
        mqVar.a(a);
    }

    public final <O extends mr, L extends mp<O>> L a(Class<L> cls, int i) {
        L l;
        mq mqVar = this.i.get(((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]);
        if (mqVar == null || (l = (L) mqVar.a(i)) == null) {
            return null;
        }
        return l;
    }

    private <O extends mr, L extends mp<O>> boolean a(int i, Class<L> cls) {
        mp a = a(cls, i);
        if (a != null) {
            a.remove();
            return true;
        }
        return false;
    }

    private bi d() {
        return this.d;
    }

    @Deprecated
    private boolean a(GL10 gl10) {
        this.d.h.a(gl10);
        return true;
    }

    private boolean a(float f, float f2) {
        if (this.d.h.a(f, f2)) {
            return true;
        }
        TappedElement a = this.a.f().a(f, f2);
        if (a != null) {
            if (a.type == 1 && this.e != null) {
                new fr(a.name, kb.a(a.pixelX, a.pixelY));
                return true;
            } else if (a.type != 6 || this.f == null) {
                return false;
            } else {
                Iterator<eu> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return true;
            }
        }
        return false;
    }

    private void a(ev evVar) {
        this.e = evVar;
    }

    private void a(eu euVar) {
        if (euVar == null) {
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(euVar);
    }

    private void b(eu euVar) {
        if (euVar == null || this.f == null) {
            return;
        }
        this.f.remove(euVar);
    }

    private void a(ex exVar) {
        this.g = exVar;
    }

    private void a(es esVar) {
        this.h = esVar;
    }

    private boolean b(float f, float f2) {
        TappedElement a = this.a.f().a(f, f2);
        if (a == null) {
            return false;
        }
        if (a.type == 1 && this.e != null) {
            new fr(a.name, kb.a(a.pixelX, a.pixelY));
            return true;
        } else if (a.type != 6 || this.f == null) {
            return false;
        } else {
            Iterator<eu> it = this.f.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
    }

    private boolean c(float f, float f2) {
        TappedElement a = this.a.f().a(f, f2);
        if (a != null && a.type == 3) {
            if (this.h != null) {
                this.h.R();
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean d(float f, float f2) {
        TappedElement a = this.a.f().a(f, f2);
        return a != null && a.type == 6;
    }

    private void a(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        this.c = onMarkerDragListener;
    }

    @Override // com.tencent.mapsdk.internal.bc
    public final void a(MotionEvent motionEvent) {
        if (this.a == null || !this.k || this.j == null) {
            return;
        }
        switch (motionEvent.getAction()) {
            case 0:
                return;
            case 1:
            case 3:
            case 4:
                this.k = false;
                if (this.c != null) {
                    this.c.onMarkerDragEnd(this.j);
                }
                this.j = null;
                return;
            case 2:
                this.j.setPosition(kb.a(this.a.d().a(new fm((int) motionEvent.getX(), (int) motionEvent.getY()))));
                if (this.c != null) {
                    this.c.onMarkerDrag(this.j);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mapsdk.internal.bc
    public final void a(String str) {
        if (str.trim().length() == 0) {
            this.j = null;
            this.k = false;
            return;
        }
        this.j = (Marker) this.d.a(str, aw.class);
        if (this.j != null) {
            if (this.a instanceof bn) {
                bn bnVar = (bn) this.a;
                Marker marker = this.j;
                if ((marker == null || marker != this.l) ? false : gd.a(bnVar)) {
                    return;
                }
            }
            if (!this.j.isDraggable()) {
                this.j = null;
                this.k = false;
                return;
            }
            this.k = true;
            if (this.c != null) {
                this.c.onMarkerDragStart(this.j);
            }
        }
    }

    public final void b() {
        Collection<mq> values;
        if (this.i != null && (values = this.i.values()) != null && !values.isEmpty()) {
            for (mq mqVar : values) {
                mqVar.b();
            }
        }
        this.k = false;
        this.j = null;
    }

    @Override // com.tencent.mapsdk.internal.bc
    public final void a() {
        this.k = false;
        this.j = null;
    }

    private boolean a(bn bnVar, Marker marker) {
        if (marker == null || marker != this.l) {
            return false;
        }
        return gd.a(bnVar);
    }

    @Override // com.tencent.mapsdk.internal.rg.c
    public final void a(View view, Rect rect, boolean z) {
        Bitmap a;
        if (view == null || rect == null || (a = gx.a(view)) == null) {
            return;
        }
        if (this.l == null) {
            MarkerOptions visible = new MarkerOptions().anchor(0.0f, 0.0f).visible(false);
            visible.tag(pe.b);
            visible.fastLoad(true);
            this.l = this.d.a(visible);
            aw awVar = (aw) this.d.a(this.l.getId(), aw.class);
            if (awVar != null) {
                awVar.a.a(new TencentMap.OnMarkerClickListener() { // from class: com.tencent.mapsdk.internal.bj.1
                    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener
                    public final boolean onMarkerClick(Marker marker) {
                        if (bj.this.b == null) {
                            bj.this.b = jz.a(bj.this.a.getContext(), null, StringUtil.SPACE, 0);
                        }
                        kj.a(bj.this.a.getContext(), bj.this.b);
                        return false;
                    }
                });
            }
        }
        this.l.setFixingPoint(rect.left, rect.top);
        this.l.setIcon(BitmapDescriptorFactory.fromBitmap(this.a, a));
        this.l.setVisible(z);
        kd.a(a);
    }

    @Override // com.tencent.mapsdk.internal.rg.c
    public final void b(View view, Rect rect, boolean z) {
        Bitmap a;
        if (view == null || (a = gx.a(view)) == null) {
            return;
        }
        if (this.m == null) {
            MarkerOptions visible = new MarkerOptions().anchor(0.0f, 0.0f).visible(false);
            visible.tag(pe.b);
            visible.fastLoad(true);
            this.m = this.d.a(visible);
            this.m.setClickable(false);
        }
        this.m.setFixingPoint(rect.left, rect.top);
        this.m.setIcon(BitmapDescriptorFactory.fromBitmap(this.a, a));
        this.m.setVisible(z);
        kd.a(a);
    }

    @Override // com.tencent.mapsdk.internal.rg.c
    public final void a(rg rgVar) {
        if (this.m != null) {
            this.m.setVisible(false);
        }
        if (this.l == null || rgVar.k()) {
            return;
        }
        this.l.setVisible(false);
    }

    @Override // com.tencent.mapsdk.internal.rg.c
    public final void c() {
        if (this.m != null) {
            this.m.setVisible(true);
        }
        if (this.l != null) {
            this.l.setVisible(true);
        }
    }

    @Override // com.tencent.mapsdk.internal.pe.a
    public final void a(Bitmap bitmap, int i, int i2) {
        if (this.n == null) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.anchor(0.5f, 0.5f);
            markerOptions.tag(pe.b);
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(this.a, bitmap));
            this.n = this.d.a(markerOptions);
            this.n.setFixingPoint(i / 2, i2 / 2);
            this.n.setClickable(false);
        } else {
            this.n.setIcon(BitmapDescriptorFactory.fromBitmap(this.a, bitmap));
            this.n.setFixingPoint(i / 2, i2 / 2);
        }
        kd.a(bitmap);
    }

    private void e() {
        Collection<mq> values;
        if (this.i == null || (values = this.i.values()) == null || values.isEmpty()) {
            return;
        }
        for (mq mqVar : values) {
            mqVar.d();
        }
    }
}
