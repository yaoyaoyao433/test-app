package com.tencent.mapsdk.internal;

import android.graphics.Color;
import android.graphics.Rect;
import com.tencent.mapsdk.internal.ap;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class or<D extends ap> extends av<D> implements en {
    private static final AtomicInteger a = new AtomicInteger(1);
    protected IndoorInfo c_;
    final ba l;
    volatile boolean m;
    private boolean o;
    private Object p;
    private boolean q;
    private Selectable.OnSelectedListener r;
    private float s;
    private boolean t;
    private boolean u;
    public final String b_ = String.valueOf(a.incrementAndGet());
    private boolean n = false;
    protected float d = 1.0f;
    protected int e = Color.argb(17, 0, (int) TbsListener.ErrorCode.STARTDOWNLOAD_4, 255);
    protected int f = Color.argb(255, 0, (int) TbsListener.ErrorCode.STARTDOWNLOAD_4, 255);
    protected float g = 0.0f;
    protected boolean h = true;
    protected boolean i = false;
    protected int j = 2;
    protected int k = -1;

    private static void h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h_() {
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean handleOnTap() {
        return false;
    }

    public void j() {
    }

    public void j_() {
    }

    @Override // com.tencent.mapsdk.internal.en
    public boolean k() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.en
    public final void l() {
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void releaseData() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
    }

    public or(ba baVar) {
        this.l = baVar;
    }

    private ba d() {
        return this.l;
    }

    @Override // com.tencent.mapsdk.internal.en
    public int a() {
        return this.k;
    }

    private void a(int i) {
        this.k = i;
    }

    public final boolean p() {
        return this.i;
    }

    public void q() {
        if (this.m) {
            return;
        }
        this.i = true;
    }

    private void e() {
        this.m = true;
    }

    public final void r() {
        this.m = false;
        q();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public void setVisible(boolean z) {
        this.h = z;
        q();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getZIndex() {
        return (int) this.g;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(int i) {
        setZIndex(i);
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(float f) {
        this.g = f;
        q();
    }

    public void setStrokeWidth(float f) {
        this.d = f;
        q();
    }

    public float getStrokeWidth() {
        return this.d;
    }

    public void setStrokeColor(int i) {
        this.f = i;
        q();
    }

    public int getStrokeColor() {
        return this.f;
    }

    public void setFillColor(int i) {
        this.e = i;
        q();
    }

    public int getFillColor() {
        return this.e;
    }

    public void setClickable(boolean z) {
        this.o = z;
    }

    public boolean isClickable() {
        return this.o;
    }

    public void setTag(Object obj) {
        this.p = obj;
    }

    public Object getTag() {
        return this.p;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setLevel(int i) {
        this.j = i;
        q();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getLevel() {
        return this.j;
    }

    public void setDraggable(boolean z) {
        this.t = z;
    }

    public boolean isDraggable() {
        return this.t;
    }

    public void setRotation(float f) {
        this.s = f;
    }

    public float getRotation() {
        return this.s;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelected(boolean z) {
        this.q = z;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public boolean isSelected() {
        return this.q;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
        this.r = onSelectedListener;
    }

    private Selectable.OnSelectedListener f() {
        return this.r;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        this.r = null;
        this.l.d(getId());
        h_();
        this.u = true;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public boolean isRemoved() {
        return this.u;
    }

    private String g() {
        return this.b_;
    }

    @Override // com.tencent.mapsdk.internal.ep
    public final void a(IndoorInfo indoorInfo) {
        this.c_ = indoorInfo;
    }

    @Override // com.tencent.mapsdk.internal.ep
    public final IndoorInfo m() {
        return this.c_;
    }

    @Override // com.tencent.mapsdk.internal.ep
    public final boolean n() {
        return this.n;
    }

    @Override // com.tencent.mapsdk.internal.ep
    public void a(IndoorBuilding indoorBuilding) {
        if (this.c_ != null) {
            this.n = this.c_.toString().equals(indoorBuilding.toString());
            q();
        }
        j();
    }

    @Override // com.tencent.mapsdk.internal.ep
    public void o() {
        if (this.c_ != null) {
            this.n = false;
            q();
        }
        j();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public List<Boundable<eq>> getGroupBounds() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this);
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public Rect getBound(eq eqVar) {
        return new Rect();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public String getId() {
        return this.b_;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public boolean isVisible() {
        if (this.c_ != null) {
            return this.h && this.n;
        }
        return this.h;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.mapsdk.internal.el
    public final void a(GL10 gl10) {
        boolean z = this.i;
        j_();
        if (z && this.l != null) {
            this.l.F();
        }
        this.i = false;
        s();
    }
}
