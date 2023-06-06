package com.meituan.android.neohybrid.container;

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
import com.meituan.android.neohybrid.core.listener.d;
import com.meituan.android.neohybrid.core.m;
import com.meituan.android.neohybrid.core.n;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoBaseFragment extends Fragment implements d {
    public static ChangeQuickRedirect c;
    private boolean a;
    public com.meituan.android.neohybrid.core.a d;
    protected Bundle e;

    public void a(View view) {
    }

    public void a(@Nullable View view, boolean z, boolean z2) {
    }

    public boolean a(NeoConfig neoConfig) {
        return false;
    }

    public boolean a(String str, JSONObject jSONObject) {
        return false;
    }

    public boolean b(String str) {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void z_() {
    }

    public NeoBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf3c00fc624839ed8debc46cd537249", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf3c00fc624839ed8debc46cd537249");
        } else {
            this.a = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b6cb3e60e7c49082052145bb92d726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b6cb3e60e7c49082052145bb92d726");
            return;
        }
        com.meituan.android.neohybrid.base.a.a(this).c("onCreate");
        this.d = b();
        b(this.e);
        this.d.a(this, getArguments());
        com.meituan.android.neohybrid.neo.report.d.a(this.d, "neo_create");
        com.meituan.android.neohybrid.neo.report.d.a(this.d, "b_pay_neo_create_sc", "c_pay_neo", (Map<String, Object>) null);
        super.onCreate(bundle);
    }

    public com.meituan.android.neohybrid.core.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b90af9e165ec256294f475187b1ed2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b90af9e165ec256294f475187b1ed2a");
        }
        m a = m.a();
        a.b = t.BASE;
        return a.b();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100909a2507ce4f257af5dcb290d7122", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100909a2507ce4f257af5dcb290d7122") : this.d.a(layoutInflater, viewGroup);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94657d0a80b216f9eeafd205ed92ae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94657d0a80b216f9eeafd205ed92ae7");
            return;
        }
        super.onViewCreated(view, bundle);
        this.d.a(view, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327e2ed2d46a55325f3e351ece5786b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327e2ed2d46a55325f3e351ece5786b5");
            return;
        }
        super.onActivityCreated(bundle);
        this.d.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410492924baa3e859b339fa78eb12d75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410492924baa3e859b339fa78eb12d75");
            return;
        }
        super.onStart();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "dbdf947613fa4130ffbc01968738ba2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "dbdf947613fa4130ffbc01968738ba2d");
            return;
        }
        aVar.c.a();
        aVar.d.c();
        aVar.h.a(d.a.ON_START);
        if (aVar.e != null) {
            com.meituan.android.neohybrid.neo.breathe.a aVar2 = aVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.neo.breathe.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "141d01786aaf140189bdb89865b8c187", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "141d01786aaf140189bdb89865b8c187");
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
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df09ca744ab0873099daa750de989e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df09ca744ab0873099daa750de989e1a");
            return;
        }
        super.onResume();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5f1c8be1ae367de5a7b7dc6f9e3ca9ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5f1c8be1ae367de5a7b7dc6f9e3ca9ca");
        } else if (aVar.g) {
        } else {
            aVar.c.b();
            aVar.d.d();
            aVar.h.a(d.a.ON_RESUME);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b138eb2a281a238592d379cb346492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b138eb2a281a238592d379cb346492");
            return;
        }
        super.onPause();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fe549949ffbc69f45098ec9dc8fa6083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fe549949ffbc69f45098ec9dc8fa6083");
            return;
        }
        aVar.c.c();
        aVar.d.e();
        aVar.h.a(d.a.ON_PAUSE);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7346e6e6fc5c39c86250907247c1d878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7346e6e6fc5c39c86250907247c1d878");
            return;
        }
        super.onStop();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8db5edfdb7a23dcf65f1a637d961e111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8db5edfdb7a23dcf65f1a637d961e111");
            return;
        }
        aVar.c.d();
        aVar.d.f();
        aVar.h.a(d.a.ON_STOP);
        if (aVar.e != null) {
            com.meituan.android.neohybrid.neo.breathe.a aVar2 = aVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.neo.breathe.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "1436477a113ae384b233d3c4b0dd95e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "1436477a113ae384b233d3c4b0dd95e3");
                return;
            }
            f.a("neo_breathe onStop");
            aVar2.b = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d7d843ce7223e1fe9efc5a811efd8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d7d843ce7223e1fe9efc5a811efd8a");
            return;
        }
        super.onDestroy();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "710729f4fb3be775ee2dd13ded1a5621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "710729f4fb3be775ee2dd13ded1a5621");
        } else {
            aVar.h.a(d.a.ON_DESTROY);
            aVar.d.g();
            aVar.c.e();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.core.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "827fd5bbb0a99b161dd93b288b5afe1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "827fd5bbb0a99b161dd93b288b5afe1f");
            } else {
                aVar.a(R.id.neo_compat, (Object) null);
                aVar.b = null;
                aVar.f = true;
            }
        }
        this.d = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e8aef366934ba6ffcecdee104bb231b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e8aef366934ba6ffcecdee104bb231b");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1190efa56fd9de55c5f1fbc7d4e9680f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1190efa56fd9de55c5f1fbc7d4e9680f");
        } else {
            aVar.d.a(i, i2, intent);
            n nVar = aVar.c;
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect3 = n.a;
            if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "9dad92fd4bb16ff841ed8afc713d1bb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "9dad92fd4bb16ff841ed8afc713d1bb8");
            } else {
                nVar.d.onActivityResult(i, i2, intent);
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4f94f35c8da11d6f8976bb06ab3756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4f94f35c8da11d6f8976bb06ab3756");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            com.meituan.android.neohybrid.core.a aVar = this.d;
            Object[] objArr2 = {Integer.valueOf(i), strArr, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "af96da334959ae78002e0a3e01c718b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "af96da334959ae78002e0a3e01c718b3");
                return;
            }
            n nVar = aVar.c;
            Object[] objArr3 = {Integer.valueOf(i), strArr, iArr};
            ChangeQuickRedirect changeQuickRedirect3 = n.a;
            if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "ed272d72ff6dd17dcd62d1dbaf2fecd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "ed272d72ff6dd17dcd62d1dbaf2fecd9");
            } else {
                nVar.d.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41d8dd8247a12971243760319dde6ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41d8dd8247a12971243760319dde6ab")).booleanValue();
        }
        if (this.d != null) {
            com.meituan.android.neohybrid.core.a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5f76c6659898ef18701b59a8569e9737", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5f76c6659898ef18701b59a8569e9737");
            } else if (!aVar.f) {
                n nVar = aVar.c;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = n.a;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "c67f16b713ee468714df44c6f34042ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "c67f16b713ee468714df44c6f34042ad");
                } else {
                    nVar.d.onBackPressed();
                }
                if (aVar.c == null) {
                    b.c("NeoCompat_onBackPressed", "NeoCompatDelegate null", com.meituan.android.neohybrid.neo.report.a.c("NeoContainer", aVar.b).b("Activity", aVar.d()));
                }
            }
        }
        return false;
    }

    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b584d53dfa704a948a03420164b09d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b584d53dfa704a948a03420164b09d0");
            return;
        }
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7b486637c6e064bf3ffa06d1bc2c20ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7b486637c6e064bf3ffa06d1bc2c20ab");
        } else {
            aVar.c.b(bundle);
        }
    }

    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd219ff15a3d266a4bf77ba554328c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd219ff15a3d266a4bf77ba554328c69");
            return;
        }
        com.meituan.android.neohybrid.core.a aVar = this.d;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3f10afe3f68939aa311159316e17e4d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3f10afe3f68939aa311159316e17e4d1");
            return;
        }
        if (bundle != null) {
            bundle.setClassLoader(com.meituan.android.neohybrid.core.a.class.getClassLoader());
            aVar.c.c(bundle);
        }
        String str = bundle == null ? "0" : "1";
        com.meituan.android.neohybrid.neo.report.d.a(aVar, "is_saved_state", str);
        com.meituan.android.neohybrid.neo.tunnel.a.a().a(aVar, "is_saved_state", str);
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3494ad4d48223ab132ac6af01791f075", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3494ad4d48223ab132ac6af01791f075")).booleanValue();
        }
        this.d.b(str);
        return true;
    }

    public void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0fc2a6b3a685bab5b097a9230b127b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0fc2a6b3a685bab5b097a9230b127b");
        } else if (this.a) {
        } else {
            this.a = true;
            long d = com.meituan.android.neohybrid.base.a.a(this).d("onCreate");
            long currentTimeMillis = d > 0 ? System.currentTimeMillis() - d : 0L;
            com.meituan.android.neohybrid.core.a aVar = this.d;
            Float[] fArr = {Float.valueOf((float) currentTimeMillis)};
            Object[] objArr2 = {aVar, "neo_web_load_finish", null, fArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.neo.report.d.a;
            long j = currentTimeMillis;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c649ffafe5ca00176096ab82ccceaa76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c649ffafe5ca00176096ab82ccceaa76");
            } else {
                com.meituan.android.neohybrid.neo.report.d.a(aVar, "neo_web_load_finish", (Map<String, Object>) null, Arrays.asList(fArr));
            }
            com.meituan.android.neohybrid.neo.report.d.a(this.d, "b_pay_neo_web_load_finish_sc", "c_pay_neo", com.meituan.android.neohybrid.neo.report.a.c("duration", Long.valueOf(j)).b);
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean D_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81078994b5b4313d44493e8d90f43bbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81078994b5b4313d44493e8d90f43bbd")).booleanValue();
        }
        if (this.d != null) {
            this.d.a();
        }
        return false;
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddd5756ab5e9f8c984738c05648a124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddd5756ab5e9f8c984738c05648a124");
        } else {
            this.d.c(str);
        }
    }

    public final Intent j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344aa5270a3d1863ed2bded0dd6ac703", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344aa5270a3d1863ed2bded0dd6ac703");
        }
        if (getActivity() != null) {
            return getActivity().getIntent();
        }
        return null;
    }

    public final void a(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f4b37fd381190e2836e2cd63835a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f4b37fd381190e2836e2cd63835a21");
        } else if (getActivity() != null) {
            getActivity().setResult(i, intent);
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b93839ee146c035ead74662aac532b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b93839ee146c035ead74662aac532b");
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final Context g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70179bdafdf368ceb0e22a15270c5462", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70179bdafdf368ceb0e22a15270c5462") : getActivity();
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final com.meituan.android.neohybrid.core.listener.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29970a5e01dd0e6498466cb21dc66e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29970a5e01dd0e6498466cb21dc66e5f");
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof com.meituan.android.neohybrid.core.listener.a) {
            return (com.meituan.android.neohybrid.core.listener.a) activity;
        }
        return null;
    }

    public final com.meituan.android.neohybrid.base.a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df11d658632799ef8339997f5c7f9bb", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df11d658632799ef8339997f5c7f9bb") : com.meituan.android.neohybrid.base.a.a(this.d);
    }

    public final void c(Bundle bundle) {
        this.e = bundle;
    }
}
