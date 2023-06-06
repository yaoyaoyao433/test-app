package com.sankuai.meituan.shortvideocore.adapter.holder;

import android.arch.lifecycle.k;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.shortvideocore.MTVideoListView;
import com.sankuai.meituan.shortvideocore.adapter.item.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T extends com.sankuai.meituan.shortvideocore.adapter.item.a> extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    protected k<com.sankuai.meituan.shortvideocore.adapter.item.a> b;
    protected InterfaceC0642a c;
    protected MTVideoListView.a d;
    protected com.sankuai.meituan.shortvideocore.statistics.a e;
    public boolean f;
    protected com.sankuai.meituan.shortvideocore.a g;
    protected b h;
    protected boolean i;
    protected boolean j;
    protected Integer k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.shortvideocore.adapter.holder.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0642a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public com.sankuai.meituan.shortvideocore.adapter.item.a a() {
        return null;
    }

    public abstract void a(T t);

    public void a(boolean z) {
    }

    public void b() {
    }

    public void b(boolean z) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public a(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd109a3ba05d620d9cc4daad25adf2d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd109a3ba05d620d9cc4daad25adf2d0");
            return;
        }
        this.f = true;
        this.i = true;
        this.j = true;
        this.k = null;
    }

    public final void a(k<com.sankuai.meituan.shortvideocore.adapter.item.a> kVar) {
        this.b = kVar;
    }

    public final void a(MTVideoListView.a aVar) {
        this.d = aVar;
    }

    public void f() {
        this.i = true;
        this.j = true;
    }

    public final void a(com.sankuai.meituan.shortvideocore.statistics.a aVar) {
        this.e = aVar;
    }

    public final void a(com.sankuai.meituan.shortvideocore.a aVar) {
        this.g = aVar;
    }
}
