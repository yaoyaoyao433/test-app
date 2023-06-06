package com.sankuai.eh.framework;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.meituan.android.knb.KNBInitCallback;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.services.IContainerProvider;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHContainerActivity extends AppCompatActivity implements IContainerProvider {
    public static ChangeQuickRedirect a = null;
    private static boolean c = false;
    private static boolean d = false;
    private com.sankuai.eh.framework.a b;
    private boolean e;
    private Bundle f;
    private ViewGroup g;
    private IContainerAdapter h;

    public EHContainerActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14efc53ac1d2ae5a04976f3c68896dc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14efc53ac1d2ae5a04976f3c68896dc4");
        } else {
            this.e = false;
        }
    }

    public static /* synthetic */ void a(EHContainerActivity eHContainerActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eHContainerActivity, changeQuickRedirect, false, "52d237282d7747d76e6cf26671470e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eHContainerActivity, changeQuickRedirect, false, "52d237282d7747d76e6cf26671470e82");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("saveState", eHContainerActivity.f);
        eHContainerActivity.a(bundle);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8928ff1b34c25adf8d490e83b7fffd43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8928ff1b34c25adf8d490e83b7fffd43");
            return;
        }
        d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0163dd9e1cc508ca696a6d218aa225b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0163dd9e1cc508ca696a6d218aa225b");
        } else {
            try {
                KNBInitCallback initCallback = KNBWebManager.getInitCallback();
                if (initCallback != null) {
                    initCallback.init(this);
                    KNBWebManager.setInitCallback(null);
                }
                com.sankuai.eh.component.service.a.a(this);
                com.sankuai.eh.component.service.database.d.e(this);
                getIntent().putExtra("ehc_loadConfig", com.sankuai.eh.component.service.database.d.b());
            } catch (Exception unused) {
            }
        }
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        this.h = a();
        this.b = new com.sankuai.eh.framework.a(this, bundle);
        com.sankuai.eh.framework.a aVar = this.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.framework.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "33d6732b55a8f0c24f9a9f3c0c6a3206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "33d6732b55a8f0c24f9a9f3c0c6a3206");
        } else {
            com.sankuai.eh.component.service.database.d.a(aVar.b, com.sankuai.eh.component.service.database.d.a(e.c(aVar.b.getIntent().getDataString())));
            aVar.c.a(aVar.b);
        }
        this.g = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.layout_container, (ViewGroup) null);
        setContentView(this.g);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c5453aa7fb7dd543ad8ac3e53a823573", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c5453aa7fb7dd543ad8ac3e53a823573")).booleanValue();
        } else {
            if (!c && getIntent() != null) {
                c = true;
                this.e = f.a(getIntent(), "first", false);
            }
            z = this.e;
        }
        if (z) {
            this.f = bundle;
        } else {
            a((Bundle) null);
        }
        d.a("step_onCreate");
    }

    private void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca989599361049c991c2d044ced29760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca989599361049c991c2d044ced29760");
        } else if (this.b.a() == null) {
            com.sankuai.meituan.android.ui.widget.a.a(this, "系统环境异常，请稍后重试", -1);
            finish();
        } else {
            this.b.a(bundle);
        }
    }

    private IContainerAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36fa3bdbdbde7fdde04cc42f21716b93", RobustBitConfig.DEFAULT_VALUE)) {
            return (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36fa3bdbdbde7fdde04cc42f21716b93");
        }
        List a2 = b.a(com.sankuai.eh.component.service.spi.b.class, (String) null);
        if (a2 == null || a2.size() <= 0) {
            return null;
        }
        return ((com.sankuai.eh.component.service.spi.b) a2.get(0)).a(this);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8184e066a353a3198a7304eb3cde89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8184e066a353a3198a7304eb3cde89");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6896942880afe8213ef72a3c702566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6896942880afe8213ef72a3c702566");
            return;
        }
        super.onResume();
        if (this.e) {
            new Handler(getMainLooper()).postDelayed(new a(this), 200L);
            this.e = false;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a01a664af17c1f66acbe3a9e86b80cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a01a664af17c1f66acbe3a9e86b80cb");
            return;
        }
        super.onPostResume();
        if (!d && getTaskId() == -1) {
            finish();
        }
        d = true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b44e8e1f15e01172361fcecf390bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b44e8e1f15e01172361fcecf390bbf");
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55894bf72d9296f9ed97a69ba4db560e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55894bf72d9296f9ed97a69ba4db560e");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb70ed01146ed63a0820ba5c6e60de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb70ed01146ed63a0820ba5c6e60de8");
            return;
        }
        super.onDestroy();
        com.sankuai.eh.framework.a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.framework.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ebd4d6c2911b2a374134e787db674790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ebd4d6c2911b2a374134e787db674790");
        } else {
            com.sankuai.eh.component.service.database.d.c(aVar.b);
            if (aVar.c != null) {
                aVar.c.b(aVar.b);
                aVar.c.b();
            }
        }
        d.b();
    }

    @Override // android.app.Activity
    public void finish() {
        boolean d2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebcc962ac684cf81fa1b35699ec42999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebcc962ac684cf81fa1b35699ec42999");
            return;
        }
        com.sankuai.eh.framework.a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.framework.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "bf3c4b01250062a8f83c92373e05e361", RobustBitConfig.DEFAULT_VALUE)) {
            d2 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "bf3c4b01250062a8f83c92373e05e361")).booleanValue();
        } else {
            d2 = aVar.c != null ? aVar.c.d() : false;
        }
        if (d2) {
            return;
        }
        super.finish();
        com.sankuai.eh.framework.a aVar2 = this.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.framework.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "697c2c0f65ff852e7f5a5ea92493f982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "697c2c0f65ff852e7f5a5ea92493f982");
        } else if (aVar2.c != null) {
            aVar2.c.b(aVar2.b);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb7df1468bc62d225177acfa366b7f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb7df1468bc62d225177acfa366b7f2");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.b != null) {
            com.sankuai.eh.framework.a aVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.framework.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f6cbdd66d75c0cdb2abbf1712023b5fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f6cbdd66d75c0cdb2abbf1712023b5fc");
            } else if (aVar.c != null) {
                aVar.c.a(i, i2, intent);
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a610fabe2410d4ad3e71d6b1d7a0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a610fabe2410d4ad3e71d6b1d7a0d4");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.b != null) {
                com.sankuai.eh.framework.a aVar = this.b;
                Object[] objArr2 = {Integer.valueOf(i), strArr, iArr};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.framework.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2dddbdfd9aaffaee14b8a18b361568e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2dddbdfd9aaffaee14b8a18b361568e2");
                } else if (aVar.c != null) {
                    aVar.c.a(i, strArr, iArr);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle, @NonNull PersistableBundle persistableBundle) {
        Object[] objArr = {bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba8776f85d1d4cc4e935ef7b3fa6877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba8776f85d1d4cc4e935ef7b3fa6877");
            return;
        }
        try {
            super.onSaveInstanceState(bundle, persistableBundle);
            if (bundle != null) {
                bundle.remove("android:viewHierarchyState");
            }
        } catch (Exception e) {
            d.a(e);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41eae11bbc01133ab89b14bf6cbb69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41eae11bbc01133ab89b14bf6cbb69c");
            return;
        }
        if (bundle != null) {
            try {
                bundle.remove("android:viewHierarchyState");
            } catch (Exception e) {
                d.a(e);
                return;
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00dcbe2e72aff1b67ea154df03b94215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00dcbe2e72aff1b67ea154df03b94215");
            return;
        }
        if (this.b != null) {
            com.sankuai.eh.framework.a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.framework.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5382a0f737f188b0275abf7a12d8c243", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5382a0f737f188b0275abf7a12d8c243")).booleanValue();
            } else if (aVar.c != null) {
                z = aVar.c.c();
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.sankuai.titans.protocol.services.IContainerProvider
    @NonNull
    public IContainerAdapter getIContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc79104b9760143b714fe885fc6c9539", RobustBitConfig.DEFAULT_VALUE)) {
            return (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc79104b9760143b714fe885fc6c9539");
        }
        if (this.h == null) {
            this.h = a();
        }
        return this.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        public WeakReference<EHContainerActivity> b;

        public a(EHContainerActivity eHContainerActivity) {
            Object[] objArr = {eHContainerActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8073b3f4db81cd5699edc65ad4f6d188", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8073b3f4db81cd5699edc65ad4f6d188");
            } else {
                this.b = new WeakReference<>(eHContainerActivity);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06c37c244b43ea77285d6dfedb08295", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06c37c244b43ea77285d6dfedb08295");
                return;
            }
            EHContainerActivity eHContainerActivity = this.b.get();
            if (eHContainerActivity != null) {
                EHContainerActivity.a(eHContainerActivity);
            }
        }
    }
}
