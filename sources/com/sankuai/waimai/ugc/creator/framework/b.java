package com.sankuai.waimai.ugc.creator.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends Lifecycle {
    public static ChangeQuickRedirect r;
    private ViewGroup a;
    private b b;
    protected View s;
    protected e t;
    @NonNull
    protected final List<b> u;
    protected Fragment v;

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652c340b9d89108f257d6c9ab07d3519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652c340b9d89108f257d6c9ab07d3519");
        }
    }

    public boolean b(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        return false;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff859a1664cfc2956af55ec335b014b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff859a1664cfc2956af55ec335b014b");
        } else {
            this.u = new LinkedList();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d01e63f9b95dc5db11df23c27e0719a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d01e63f9b95dc5db11df23c27e0719a");
            return;
        }
        super.b(i, i2);
        a(i2);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60add71c7306477d692c370e90de7316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60add71c7306477d692c370e90de7316");
            return;
        }
        for (b bVar : this.u) {
            bVar.a(this.t, i);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    @CallSuper
    public void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307ed7745e69b8245aaaa6f7e969dbef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307ed7745e69b8245aaaa6f7e969dbef");
            return;
        }
        super.a(eVar);
        this.t = eVar;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a57d62193f201479b1cef737725a0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a57d62193f201479b1cef737725a0da");
            return;
        }
        super.a(bundle);
        e eVar = this.t;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "34fca25c8556ed104451c86e96c5c57f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "34fca25c8556ed104451c86e96c5c57f");
        } else if (this instanceof com.sankuai.waimai.ugc.creator.framework.event.e) {
            eVar.c.add((com.sankuai.waimai.ugc.creator.framework.event.e) this);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fffc0e15d2feae50d838882f0ff0fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fffc0e15d2feae50d838882f0ff0fa4");
            return;
        }
        super.y();
        if (this.s == null) {
            Context A = A();
            if (!E() || !o.a(A)) {
                c(String.format("%s createView error：当前没有attach，context为null", this));
            }
            this.s = a(LayoutInflater.from(A), this.a);
            if (this.a == null) {
                String.format("%s createView warning：BlockContainer为null,确认%s是RootBlock", this, this);
            } else if (this.a.getChildCount() > 0) {
                c(String.format("%s createView error：BlockContainer已有子View", this));
            } else {
                this.a.addView(this.s);
            }
            if (this.s != null) {
                a(this.s);
            }
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720aeeb235d721c603aae0c461ff06a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720aeeb235d721c603aae0c461ff06a0");
            return;
        }
        super.b();
        e eVar = this.t;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "bf22822c3fa60da56b77ad7a6d454a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "bf22822c3fa60da56b77ad7a6d454a41");
        } else if (this instanceof com.sankuai.waimai.ugc.creator.framework.event.e) {
            eVar.c.remove(this);
        }
        if (this.a != null) {
            this.a.removeView(this.s);
        }
        this.s = null;
        this.a = null;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593e8a2be21e0407d64c9ff0783988d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593e8a2be21e0407d64c9ff0783988d3");
            return;
        }
        super.z();
        this.t = null;
        this.b = null;
    }

    private <T extends b> void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0aae30f9180da856e1f6b9bfae5d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0aae30f9180da856e1f6b9bfae5d04");
        } else if (t != null) {
            if (t.E()) {
                c(String.format("Block (%s) 添加子Block (%s) 失败：子Block已经被attach", this, t));
                return;
            }
            t.b = this;
            t.a(this.t, this.y);
            this.u.add(t);
        }
    }

    @Nullable
    public final Context A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfdb3570a5afdcc6c6f708dad4bfcb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfdb3570a5afdcc6c6f708dad4bfcb3");
        }
        if (this.t == null) {
            return null;
        }
        return this.t.b;
    }

    @Nullable
    public final Activity B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d1dc26bcff93a160dbfc412f9d4a7d", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d1dc26bcff93a160dbfc412f9d4a7d") : (Activity) A();
    }

    public final <T extends com.sankuai.waimai.ugc.creator.framework.event.e> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf35612c45007b67a3806a66a5c21cc7", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf35612c45007b67a3806a66a5c21cc7") : (T) this.t.a(cls);
    }

    public final <T extends com.sankuai.waimai.ugc.creator.framework.event.e> com.sankuai.waimai.ugc.creator.framework.event.d<T> b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e37fb36a4e68647278c34e1b627c2cb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.creator.framework.event.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e37fb36a4e68647278c34e1b627c2cb") : this.t.b(cls);
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ac3955a21170968d3697e6686203a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ac3955a21170968d3697e6686203a8");
        } else {
            this.t.a(str, obj);
        }
    }

    @NonNull
    public final <T> T b(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2345ead6c1ffa259a3fcc0b43f32e6ad", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2345ead6c1ffa259a3fcc0b43f32e6ad") : (T) this.t.b(str, t);
    }

    public b(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90f78dedf85fa9960a7365471801038", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90f78dedf85fa9960a7365471801038");
            return;
        }
        this.u = new LinkedList();
        this.v = fragment;
    }

    @Nullable
    public final FragmentManager C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5fdf4d1468d6720c524f216a190e8a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5fdf4d1468d6720c524f216a190e8a8");
        }
        Activity B = B();
        if (B instanceof FragmentActivity) {
            return ((FragmentActivity) B).getSupportFragmentManager();
        }
        return null;
    }

    @Nullable
    public final FragmentManager D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116065b45267470df92165da16283422", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116065b45267470df92165da16283422");
        }
        if (this.v != null) {
            return this.v.getChildFragmentManager();
        }
        return null;
    }

    public boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a8ebadd1d6fd9fb8131157071c33c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a8ebadd1d6fd9fb8131157071c33c5")).booleanValue();
        }
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ac3c3184da06bb609c2a792c6901044", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ac3c3184da06bb609c2a792c6901044")).booleanValue();
        } else {
            Fragment fragment = this.v;
            z = (fragment instanceof BaseFragment) && !fragment.isAdded();
        }
        if (!z) {
            for (int size = this.u.size() - 1; size >= 0; size--) {
                if (this.u.get(size).a(bVar)) {
                    return true;
                }
            }
        }
        return b(bVar);
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb997b40896d3fae59c9947364d7533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb997b40896d3fae59c9947364d7533");
        } else if (this.a != null) {
            this.a.setVisibility(i);
        }
    }

    public final <T extends b> void a(@IdRes int i, T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b300f3126f8904055e5579ad1152dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b300f3126f8904055e5579ad1152dc");
        } else {
            a((ViewGroup) this.s.findViewById(i), (ViewGroup) t);
        }
    }

    public final <T extends b> void a(@NonNull ViewGroup viewGroup, T t) {
        Object[] objArr = {viewGroup, t};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafea589ca88cb01aaf00b2ff79fdcc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafea589ca88cb01aaf00b2ff79fdcc8");
            return;
        }
        t.a = viewGroup;
        a(t);
    }

    public final <T extends View> T b(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e057700e643805af999fdacc2cf1d17", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e057700e643805af999fdacc2cf1d17") : (T) this.s.findViewById(i);
    }
}
