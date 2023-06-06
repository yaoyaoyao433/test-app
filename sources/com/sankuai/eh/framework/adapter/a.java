package com.sankuai.eh.framework.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.spi.IComponent;
import com.sankuai.eh.component.service.spi.IViewBuilder;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements IComponent, IViewBuilder {
    public static ChangeQuickRedirect a;
    protected IComponent b;
    protected List<IViewBuilder> c;
    private Activity d;

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722667cd32fe471b348cae2da8a2e4b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722667cd32fe471b348cae2da8a2e4b0");
        } else {
            this.d = activity;
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void a(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df86f4b25a413c895a4b50c04791e54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df86f4b25a413c895a4b50c04791e54d");
        } else {
            this.b.a(activity, bundle);
        }
    }

    public final void a(List<IViewBuilder> list) {
        this.c = list;
    }

    public final void a(IComponent iComponent) {
        this.b = iComponent;
    }

    public final IComponent e() {
        return this.b;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad127755502560a64f29227b21854bdb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad127755502560a64f29227b21854bdb")).intValue() : this.b.a();
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final <T> T a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096d2bee61a54ab11ae8f71645fd38ac", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096d2bee61a54ab11ae8f71645fd38ac") : (T) this.b.a(context);
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba303f68cb4877bcfb28311215205383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba303f68cb4877bcfb28311215205383");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28401bfb184a624682260e14e40b2080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28401bfb184a624682260e14e40b2080");
            return;
        }
        for (IViewBuilder iViewBuilder : this.c) {
            iViewBuilder.a(viewGroup);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f396c8f3885910775931a485b09c8fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f396c8f3885910775931a485b09c8fa2");
            return;
        }
        for (IViewBuilder iViewBuilder : this.c) {
            iViewBuilder.a(activity);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f444f1a340ae90ad4a93d5c0c92fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f444f1a340ae90ad4a93d5c0c92fdb");
            return;
        }
        for (IViewBuilder iViewBuilder : this.c) {
            iViewBuilder.b(activity);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4c9e9da40c1fe0c1afa1fe96a6ed3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4c9e9da40c1fe0c1afa1fe96a6ed3b")).booleanValue();
        }
        if (this.b != null) {
            return this.b.c();
        }
        return false;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f114dfd30075b5917ee1ff1a2fb72c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f114dfd30075b5917ee1ff1a2fb72c")).booleanValue();
        }
        if (this.b != null) {
            return this.b.d();
        }
        return false;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c0b7bfc31e7e28372da6a50a1f3e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c0b7bfc31e7e28372da6a50a1f3e4e");
        } else if (this.b != null) {
            this.b.a(i, i2, intent);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a012116d9bc545c0512c59b4feda947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a012116d9bc545c0512c59b4feda947");
        } else if (this.b != null) {
            this.b.a(i, strArr, iArr);
        }
    }
}
