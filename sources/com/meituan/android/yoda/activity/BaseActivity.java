package com.meituan.android.yoda.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.callbacks.c;
import com.meituan.android.yoda.callbacks.e;
import com.meituan.android.yoda.config.ui.d;
import com.meituan.android.yoda.interfaces.b;
import com.meituan.android.yoda.interfaces.j;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.widget.tool.g;
import com.meituan.android.yoda.widget.view.OtherConfirmButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseActivity extends AppCompatActivity implements c, com.meituan.android.yoda.interfaces.c, j {
    public static ChangeQuickRedirect a;
    protected b b;
    protected String c;
    protected IYodaVerifyListener d;
    protected IYodaVerifyListener e;
    protected g f;
    protected com.meituan.android.yoda.data.a g;
    protected OtherConfirmButton h;
    protected Handler i;
    protected com.meituan.android.yoda.config.verify.a j;
    protected Runnable k;
    protected TextView l;
    protected boolean m;
    private com.meituan.android.yoda.interfaces.c n;
    private int o;

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205677aa992abaae5315115a54ed0be5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205677aa992abaae5315115a54ed0be5");
            return;
        }
        this.n = null;
        this.i = new Handler(Looper.getMainLooper());
        this.k = null;
        this.m = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b120b9ee4aa0f7fc6fec71580d2496d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b120b9ee4aa0f7fc6fec71580d2496d");
            return;
        }
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int b = d.a().b();
        if (b != -1) {
            try {
                setTheme(b);
            } catch (Exception unused) {
            }
        }
        setContentView(R.layout.yoda_activity_confirm);
        String generatePageInfoKey = AppUtil.generatePageInfoKey(this);
        Statistics.disablePageIdentify(generatePageInfoKey);
        Statistics.disableAutoPVPD(generatePageInfoKey);
        a(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69371749803c03c4f38a1c405c92400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69371749803c03c4f38a1c405c92400");
            return;
        }
        super.onResume();
        this.m = true;
        com.meituan.android.yoda.monitor.log.a.a("BaseActivity", "onResume, requestCode = " + this.c, true);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.behavior.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a9146cfd032554b727bc9969fdad7318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a9146cfd032554b727bc9969fdad7318");
            return;
        }
        com.meituan.android.yoda.model.behavior.a.a(this);
        com.meituan.android.yoda.model.behavior.b.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec8ae38c214da7e21fbdb748ac972d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec8ae38c214da7e21fbdb748ac972d2");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("BaseActivity", "onPause, requestCode = " + this.c, true);
        this.m = false;
        super.onPause();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.behavior.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7d4c4b4a245b0aa02daf3726c2567a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7d4c4b4a245b0aa02daf3726c2567a5d");
            return;
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.model.behavior.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ea4fb1769bdc89278c7c5b552ba8eecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ea4fb1769bdc89278c7c5b552ba8eecf");
        } else {
            com.meituan.android.yoda.model.behavior.tool.a.b(this);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5e379d34498f08ab0e1504e3aa43d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5e379d34498f08ab0e1504e3aa43d3");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37726f9b28d1dbd315ce9045f705027c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37726f9b28d1dbd315ce9045f705027c");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle, persistableBundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4065d757ce0c704f9bcb70a3dfe39b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4065d757ce0c704f9bcb70a3dfe39b");
            return;
        }
        b(this);
        super.onDestroy();
    }

    @Override // com.meituan.android.yoda.interfaces.j
    public void a(String str, int i, Bundle bundle) {
        int i2 = 0;
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ac0a14d7e3c88b4e5f2eedcd3c541d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ac0a14d7e3c88b4e5f2eedcd3c541d");
            return;
        }
        a(i);
        if (this.g != null && this.g.f != null) {
            this.g.e = this.o;
            ArrayList<Integer> a2 = this.g.f.a(this.o);
            if (a2 != null && !a2.isEmpty()) {
                i2 = a2.get(0).intValue();
            }
            a(str, i2);
            return;
        }
        b.a.a().a("mCallerPackage is null", this, null);
    }

    @Override // com.meituan.android.yoda.interfaces.j
    public void b(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb1d0ccbaf4603cba9c1562221c17d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb1d0ccbaf4603cba9c1562221c17d9");
            return;
        }
        this.f.a(str, i, bundle);
        a(this.h);
    }

    @Override // com.meituan.android.yoda.interfaces.j
    public void a(String str) {
        e eVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a94eeff1c585d28bedccfc04d74e795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a94eeff1c585d28bedccfc04d74e795");
            return;
        }
        e eVar2 = (e) com.meituan.android.yoda.data.b.a(this.c).b;
        Object[] objArr2 = {eVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecef092db2da53c34006a4ed940688a4", RobustBitConfig.DEFAULT_VALUE)) {
            eVar = (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecef092db2da53c34006a4ed940688a4");
        } else if (eVar2 != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.c;
            eVar = PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "161280099e51f8b315d4fcf20cd7831f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "161280099e51f8b315d4fcf20cd7831f") : new e(eVar2.e, eVar2.d);
        } else {
            eVar = null;
        }
        com.meituan.android.yoda.callbacks.d.a(eVar.a(), eVar).a(str);
        finish();
    }

    @Override // com.meituan.android.yoda.callbacks.c
    public void a(@NonNull com.meituan.android.yoda.interfaces.b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.android.yoda.callbacks.c
    public boolean b(@NonNull com.meituan.android.yoda.interfaces.b bVar) {
        this.b = null;
        return true;
    }

    @Override // com.meituan.android.yoda.callbacks.c
    public com.meituan.android.yoda.interfaces.b a() {
        return this.b;
    }

    public void a(@NonNull com.meituan.android.yoda.interfaces.c cVar) {
        this.n = cVar;
    }

    public void b(@NonNull com.meituan.android.yoda.interfaces.c cVar) {
        this.n = null;
    }

    @Override // com.meituan.android.yoda.callbacks.c
    public com.meituan.android.yoda.interfaces.c b() {
        return this.n;
    }

    public boolean c() {
        return this.m;
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd655a9a70e896abbc392f433b83e56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd655a9a70e896abbc392f433b83e56");
            return;
        }
        this.f.a(str, i, (Bundle) null);
        a(this.h);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f459aaae0270727dbceb35a87e778ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f459aaae0270727dbceb35a87e778ec")).booleanValue();
        }
        try {
            if (this.b != null) {
                return this.b.j();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4dd5f29db4f4d523e7ec1b743994752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4dd5f29db4f4d523e7ec1b743994752");
        } else if (this.b != null) {
            this.b.a(i, i2, intent);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0683577da6d27963a0056971eb7613b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0683577da6d27963a0056971eb7613b0");
            return;
        }
        this.o = i;
        this.f.g = i;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327065a9af3b6668032ed58a2a6839f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327065a9af3b6668032ed58a2a6839f6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3df14b74cdc512e1b6108bebd4817656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3df14b74cdc512e1b6108bebd4817656");
        } else {
            int d = com.meituan.android.yoda.config.verify.c.a() != null ? com.meituan.android.yoda.config.verify.c.a().d() : 0;
            if (d > 0) {
                this.j = new com.meituan.android.yoda.config.verify.a(this, this.c, this.e);
                this.f.h = this.j;
                this.i.postDelayed(this.j, d * 1000);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be8a7071c2eff9244a8218b91b7ddd4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be8a7071c2eff9244a8218b91b7ddd4f");
            return;
        }
        if (this.k == null) {
            this.k = new Runnable() { // from class: com.meituan.android.yoda.activity.BaseActivity.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "139af194dbd06f41d612393ef63cfa93", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "139af194dbd06f41d612393ef63cfa93");
                    } else if (BaseActivity.this.e != null) {
                        BaseActivity.this.e.onError(BaseActivity.this.c, x.h());
                    }
                }
            };
        } else {
            this.i.removeCallbacks(this.k);
        }
        this.i.postDelayed(this.k, 600000L);
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c69f5ea9ec341b6ef142f50ceed178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c69f5ea9ec341b6ef142f50ceed178");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3541819cc1137af2ec8c29684704fb52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3541819cc1137af2ec8c29684704fb52");
        } else if (this.j != null) {
            this.i.removeCallbacks(this.j);
            this.j = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8915c1fd21df450228a0b7b4a3aeb73f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8915c1fd21df450228a0b7b4a3aeb73f");
            return;
        }
        this.i.removeCallbacks(this.k);
        this.k = null;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c451dbab42cbaa608440fb92ffc0e2c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c451dbab42cbaa608440fb92ffc0e2c9")).booleanValue();
        }
        if (this.j != null) {
            return this.j.a();
        }
        return false;
    }

    private void a(View view) {
        int b;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81100e0f67ca75383d0ac355e2af997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81100e0f67ca75383d0ac355e2af997");
        } else if (view == null || this.f == null) {
        } else {
            if (this.g != null && this.g.f != null && this.g.f.a() > 1) {
                if (h()) {
                    view.setVisibility(0);
                    if (this.l != null) {
                        this.l.setVisibility(8);
                        return;
                    }
                    return;
                } else if (this.l != null) {
                    if (d.a().r() && (b = x.b(d.a().p(), 1)) != -1) {
                        this.l.setTextColor(b);
                    }
                    this.l.setVisibility(0);
                    view.setVisibility(8);
                    return;
                }
            } else if (h()) {
                view.setVisibility(0);
                if (this.l != null) {
                    this.l.setVisibility(8);
                    return;
                }
                return;
            }
            view.setVisibility(8);
            if (this.l != null) {
                this.l.setVisibility(8);
            }
        }
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47a90bdfbd52f1dec6fab7721e3b981", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47a90bdfbd52f1dec6fab7721e3b981")).booleanValue();
        }
        if (this.f == null) {
            return false;
        }
        return this.f.d == 108 || this.f.d == 109;
    }
}
