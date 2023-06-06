package com.meituan.android.neohybrid.v2.container;

import android.arch.lifecycle.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.core.listener.d;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.neohybrid.v2.core.m;
import com.meituan.android.neohybrid.v2.core.n;
import com.meituan.android.neohybrid.v2.core.r;
import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.android.neohybrid.v2.neo.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoBaseFragment extends Fragment implements d {
    public static ChangeQuickRedirect b;
    private boolean a;
    protected com.meituan.android.neohybrid.v2.core.a c;
    protected Bundle d;

    public void a(View view) {
    }

    public void a(@Nullable View view, boolean z, boolean z2) {
    }

    public boolean a(NeoConfig neoConfig) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str, JSONObject jSONObject) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean b(String str) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void z_() {
    }

    public NeoBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477f7e750d8c3015c0a24c33b9fa8f76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477f7e750d8c3015c0a24c33b9fa8f76");
        } else {
            this.a = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        com.meituan.android.neohybrid.v2.core.a aVar;
        b bVar;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd33a68f8463e5e9779ca0148953f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd33a68f8463e5e9779ca0148953f78");
            return;
        }
        com.meituan.android.neohybrid.base.a.a(this).c("onCreate");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42d127f4d2862fd555106600755b2256", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42d127f4d2862fd555106600755b2256");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            m mVar = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "eb99d1b65cf0fc7f6de5d76a84d6cc00", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "eb99d1b65cf0fc7f6de5d76a84d6cc00") : new m();
            mVar.b = r.BASE;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = m.a;
            if (PatchProxy.isSupport(objArr4, mVar, changeQuickRedirect4, false, "8e2194ad1a3cd9d2d19b37121de86a2e", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr4, mVar, changeQuickRedirect4, false, "8e2194ad1a3cd9d2d19b37121de86a2e");
            } else {
                com.meituan.android.neohybrid.v2.core.a a = mVar.c != null ? com.meituan.android.neohybrid.v2.neo.nsr.a.a(mVar.c) : null;
                if (a == null) {
                    a = new com.meituan.android.neohybrid.v2.core.a(mVar.b);
                }
                aVar = a;
            }
        }
        this.c = aVar;
        b(this.d);
        com.meituan.android.neohybrid.v2.core.a aVar2 = this.c;
        Bundle arguments = getArguments();
        Object[] objArr5 = {this, arguments};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "8498bcc99d29833d2962426635ab42f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "8498bcc99d29833d2962426635ab42f2");
        } else {
            aVar2.b = this;
            aVar2.c.a(g(), arguments);
            Object[] objArr6 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect6 = b.d;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "314fe9d5ebdd96181514559169a74acb", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "314fe9d5ebdd96181514559169a74acb");
            } else {
                bVar = new b();
                Object[] objArr7 = {aVar2, null};
                ChangeQuickRedirect changeQuickRedirect7 = b.d;
                if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "24f3356835bde1d1ed09831648711f1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "24f3356835bde1d1ed09831648711f1e");
                } else {
                    bVar.a(aVar2);
                    bVar.a(new com.meituan.android.neohybrid.v2.neo.loading.d());
                    bVar.a(new com.meituan.android.neohybrid.v2.neo.ssr.a());
                    bVar.a(new com.meituan.android.neohybrid.v2.neo.bridge.a());
                    bVar.a(new com.meituan.android.neohybrid.v2.neo.recce.b());
                    if (((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).getRenderProcessGoneOptions() != null) {
                        bVar.a(new com.meituan.android.neohybrid.v2.neo.plugin.a());
                    }
                    Object[] objArr8 = {null};
                    ChangeQuickRedirect changeQuickRedirect8 = c.a;
                    bVar.a(PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "adddd4b1479969d9e042da6e78ef2185", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "adddd4b1479969d9e042da6e78ef2185") : new c(null), false);
                }
            }
            aVar2.d = bVar;
            aVar2.d.b();
            aVar2.g.a(d.a.ON_CREATE);
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.c, "neo_create");
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.c, "b_pay_neo_create_sc", "c_pay_neo", (Map<String, Object>) null);
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690f59508c6a0f2930f4e9d617c4ab03", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690f59508c6a0f2930f4e9d617c4ab03");
        }
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6653a104186a111b2ac62b02af2b0a96", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6653a104186a111b2ac62b02af2b0a96");
        }
        View a = aVar.c.a(layoutInflater, viewGroup);
        aVar.d.a(a);
        return a;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be91c0825904963ab5f4ac15afda4c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be91c0825904963ab5f4ac15afda4c23");
            return;
        }
        super.onViewCreated(view, bundle);
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a5a85752fc019cb5bc116e2bbb5d102f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a5a85752fc019cb5bc116e2bbb5d102f");
            return;
        }
        aVar.c.a(view, bundle);
        aVar.a(R.id.neo_compat, aVar);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b5297570888bb3bfca5fff4f722536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b5297570888bb3bfca5fff4f722536");
            return;
        }
        super.onActivityCreated(bundle);
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "788ec28af836a56857d735b437c01560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "788ec28af836a56857d735b437c01560");
            return;
        }
        aVar.c.a(bundle);
        aVar.d.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb2681ac8b2e4af6473830c73a22a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb2681ac8b2e4af6473830c73a22a43");
            return;
        }
        super.onStart();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "68217ea5daa6e30d4c98d7ed4b26fd7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "68217ea5daa6e30d4c98d7ed4b26fd7f");
            return;
        }
        aVar.c.a();
        aVar.d.c();
        aVar.g.a(d.a.ON_START);
        if (aVar.e != null) {
            com.meituan.android.neohybrid.v2.neo.breathe.a aVar2 = aVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.neo.breathe.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "add09fa0cd9ad4ad508b489e85979f37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "add09fa0cd9ad4ad508b489e85979f37");
                return;
            }
            f.a("neo_breathe onStart");
            aVar2.b = true;
            aVar2.a(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4750b1b6fda9a78941ddf8ab52ef783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4750b1b6fda9a78941ddf8ab52ef783");
            return;
        }
        super.onResume();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8b50b5c1fca0199ca9fb918254d5c00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8b50b5c1fca0199ca9fb918254d5c00f");
            return;
        }
        aVar.c.b();
        aVar.d.d();
        aVar.g.a(d.a.ON_RESUME);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2967a46b86cb54ee6b40a9c2f3569b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2967a46b86cb54ee6b40a9c2f3569b");
            return;
        }
        super.onPause();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ff1da4e3811c58ccbfdd53313099b539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ff1da4e3811c58ccbfdd53313099b539");
            return;
        }
        aVar.c.c();
        aVar.d.e();
        aVar.g.a(d.a.ON_PAUSE);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2284f3c08d6e137db4a5a4124086654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2284f3c08d6e137db4a5a4124086654");
            return;
        }
        super.onStop();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7c98edcb77baf675e0612097641a6123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7c98edcb77baf675e0612097641a6123");
            return;
        }
        aVar.c.d();
        aVar.d.f();
        aVar.g.a(d.a.ON_STOP);
        if (aVar.e != null) {
            com.meituan.android.neohybrid.v2.neo.breathe.a aVar2 = aVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.neo.breathe.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "81b2f60fdf79fb96fd1e47132563b0c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "81b2f60fdf79fb96fd1e47132563b0c3");
                return;
            }
            f.a("neo_breathe onStop");
            aVar2.b = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a66307ab380a5ddcfb31d9afbe5b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a66307ab380a5ddcfb31d9afbe5b41");
            return;
        }
        super.onDestroy();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ac71ab241bed9a674044585ab33c77c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ac71ab241bed9a674044585ab33c77c1");
        } else {
            aVar.g.a(d.a.ON_DESTROY);
            aVar.d.g();
            aVar.c.e();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.core.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b29248f3557a79208aca08ea0d4aa1be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b29248f3557a79208aca08ea0d4aa1be");
            } else {
                aVar.a(R.id.neo_compat, (Object) null);
                aVar.b = null;
                aVar.f = true;
            }
        }
        this.c = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7603c0b44e5cd45719a23eb5ed5d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7603c0b44e5cd45719a23eb5ed5d71");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9fbe11df0354d7dd2bd8d6f9f08e475c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9fbe11df0354d7dd2bd8d6f9f08e475c");
        } else {
            aVar.d.a(i, i2, intent);
            n nVar = aVar.c;
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect3 = n.a;
            if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "125bb98d5712a410731de4c719f2e8ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "125bb98d5712a410731de4c719f2e8ec");
            } else {
                nVar.d.a(i, i2, intent);
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3cc728585b03d25bb5ab286a89df62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3cc728585b03d25bb5ab286a89df62");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            com.meituan.android.neohybrid.v2.core.a aVar = this.c;
            Object[] objArr2 = {Integer.valueOf(i), strArr, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fb5712552c8ccb0bc47e1333e31dfad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fb5712552c8ccb0bc47e1333e31dfad7");
                return;
            }
            n nVar = aVar.c;
            Object[] objArr3 = {Integer.valueOf(i), strArr, iArr};
            ChangeQuickRedirect changeQuickRedirect3 = n.a;
            if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "3dadd0c82e2dae270f1f407a0ce54a95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "3dadd0c82e2dae270f1f407a0ce54a95");
            } else {
                nVar.d.a(i, strArr, iArr);
            }
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffa2b09f8405f69045ee11f00a613b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffa2b09f8405f69045ee11f00a613b2")).booleanValue();
        }
        if (this.c != null) {
            com.meituan.android.neohybrid.v2.core.a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7fe79f8309e8315c6f6db5cb442dbeff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7fe79f8309e8315c6f6db5cb442dbeff");
            } else if (!aVar.f) {
                n nVar = aVar.c;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = n.a;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "a72d344a48b6693282f0bac2faa3b46d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "a72d344a48b6693282f0bac2faa3b46d");
                } else {
                    nVar.d.f();
                }
                if (aVar.c == null) {
                    com.meituan.android.neohybrid.neo.report.b.c("NeoCompat_onBackPressed", "NeoCompatDelegate null", com.meituan.android.neohybrid.neo.report.a.c("NeoContainer", aVar.b).b("Activity", aVar.d()));
                }
            }
        }
        return false;
    }

    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5fe07f67dced0f9e069d69e76f20eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5fe07f67dced0f9e069d69e76f20eae");
            return;
        }
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a1af392a44c93a13cc82cc7575bbc523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a1af392a44c93a13cc82cc7575bbc523");
        } else {
            aVar.c.b(bundle);
        }
    }

    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb6bd2a88ecd8b513f320593f4dd2f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb6bd2a88ecd8b513f320593f4dd2f9");
            return;
        }
        com.meituan.android.neohybrid.v2.core.a aVar = this.c;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "96d0881618faab1a79fcb86e1878b7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "96d0881618faab1a79fcb86e1878b7e2");
            return;
        }
        if (bundle != null) {
            bundle.setClassLoader(com.meituan.android.neohybrid.v2.core.a.class.getClassLoader());
            aVar.c.c(bundle);
        }
        String str = bundle == null ? "0" : "1";
        com.meituan.android.neohybrid.v2.neo.report.a.a(aVar, "is_saved_state", str);
        com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(aVar, "is_saved_state", str);
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f856646b0496aaf0498dd6aed03a87bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f856646b0496aaf0498dd6aed03a87bb")).booleanValue();
        }
        this.c.b(str);
        return true;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467a1b83badb26502f868416f882cd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467a1b83badb26502f868416f882cd50");
        } else if (this.a) {
        } else {
            this.a = true;
            long d = com.meituan.android.neohybrid.base.a.a(this).d("onCreate");
            long currentTimeMillis = d > 0 ? System.currentTimeMillis() - d : 0L;
            com.meituan.android.neohybrid.v2.core.a aVar = this.c;
            Float[] fArr = {Float.valueOf((float) currentTimeMillis)};
            Object[] objArr2 = {aVar, "neo_web_load_finish", null, fArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.neo.report.a.a;
            long j = currentTimeMillis;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f34cb330fd3df090e0c7d167de70bb77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f34cb330fd3df090e0c7d167de70bb77");
            } else {
                com.meituan.android.neohybrid.v2.neo.report.a.a(aVar, "neo_web_load_finish", (Map<String, Object>) null, Arrays.asList(fArr));
            }
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.c, "b_pay_neo_web_load_finish_sc", "c_pay_neo", com.meituan.android.neohybrid.neo.report.a.c("duration", Long.valueOf(j)).b);
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean D_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549e87c21d80b2dd5fb82793ee106d94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549e87c21d80b2dd5fb82793ee106d94")).booleanValue();
        }
        if (this.c != null) {
            com.meituan.android.neohybrid.v2.core.a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e7d54120af34d0e19a16e700fe6ab94e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e7d54120af34d0e19a16e700fe6ab94e");
            } else {
                aVar.c.f();
            }
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final Context g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e6936b4fc1f1bd794547224d1cf2a4", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e6936b4fc1f1bd794547224d1cf2a4") : getActivity();
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final com.meituan.android.neohybrid.core.listener.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169cfa5e47455ff2d69ac3b95ed1e006", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169cfa5e47455ff2d69ac3b95ed1e006");
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof com.meituan.android.neohybrid.core.listener.a) {
            return (com.meituan.android.neohybrid.core.listener.a) activity;
        }
        return null;
    }

    public final void c(Bundle bundle) {
        this.d = bundle;
    }
}
