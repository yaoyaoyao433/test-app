package com.sankuai.waimai.store.assembler.component;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public f b;
    public i c;
    private Class<? extends BaseCard> d;
    private android.arch.lifecycle.f e;
    private FragmentActivity f;
    private d g;

    public c(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551a45223c5d9303a6ec9e07a233a28b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551a45223c5d9303a6ec9e07a233a28b");
            return;
        }
        this.b = f.Normal;
        this.g = new d();
        this.e = fVar;
        this.f = fragmentActivity;
    }

    public final c a(String str) {
        this.g.b = str;
        return this;
    }

    public final c a(Object obj) {
        this.g.c = obj;
        return this;
    }

    public final BaseCard a() {
        BaseCard a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b936d30e3411bfb0b6bc5836c003e6d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b936d30e3411bfb0b6bc5836c003e6d9");
        }
        if (this.c == null) {
            a2 = a(this.d, this.e, this.f);
        } else {
            a2 = this.c.a();
        }
        if (a2 != null) {
            a2.c = this.g;
            a2.c.a = this.b;
            a2.a(a2.b);
            a2.a((View) a2.b);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = BaseCard.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1d26f85897cc44209a6aceb6068b01c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1d26f85897cc44209a6aceb6068b01c1");
            } else if (!a2.g) {
                a2.g = true;
                a2.d.getLifecycle().a(a2);
            }
        }
        return a2;
    }

    private <T extends BaseCard> T a(Class<T> cls, android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        Object[] objArr = {cls, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adefbdceae36bea7beb1e5b62497382b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adefbdceae36bea7beb1e5b62497382b");
        }
        try {
            return cls.getConstructor(android.arch.lifecycle.f.class, FragmentActivity.class).newInstance(fVar, fragmentActivity);
        } catch (IllegalAccessException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        } catch (InstantiationException e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            com.sankuai.waimai.store.base.log.a.a(e3);
            return null;
        } catch (InvocationTargetException e4) {
            com.sankuai.waimai.store.base.log.a.a(e4);
            return null;
        }
    }
}
