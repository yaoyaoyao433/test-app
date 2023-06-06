package com.sankuai.waimai.rocks.page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.a;
import com.sankuai.waimai.rocks.page.block.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class RocksPageActivity<RootBlock extends f, ContextType extends a> extends Activity {
    public static ChangeQuickRedirect a;
    private RootBlock b;
    private ContextType c;

    public abstract ContextType a();

    public abstract RootBlock a(ContextType contexttype);

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f12ed51977e2e12a61ff86f6b77e372b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f12ed51977e2e12a61ff86f6b77e372b");
            return;
        }
        super.onCreate(bundle);
        this.c = a();
        this.b = a(this.c);
        if (this.b == null) {
            throw new RuntimeException("页面RootBlock必须配置");
        }
        setContentView(this.b.i());
        this.b.F();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a1b03f32b8d0fedaf993b6e6cbd652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a1b03f32b8d0fedaf993b6e6cbd652");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.b.F();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd0c251666b778df1457b760d6d09a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd0c251666b778df1457b760d6d09a9");
            return;
        }
        super.onRestoreInstanceState(bundle);
        this.b.F();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afaae893e59d3256dee86a86b59defb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afaae893e59d3256dee86a86b59defb7");
            return;
        }
        super.onNewIntent(intent);
        this.b.F();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e247d5d5617c412b83e4d923b8ef5d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e247d5d5617c412b83e4d923b8ef5d7");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.b.F();
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d042238f2be29c3020b1e341068e751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d042238f2be29c3020b1e341068e751");
            return;
        }
        super.onResume();
        this.b.F();
    }

    @Override // android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46c51d65e668a23c47ec8bd130004ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46c51d65e668a23c47ec8bd130004ac");
            return;
        }
        super.onStart();
        this.b.F();
    }

    @Override // android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ddd6eabb1280f4403ed01858e4e33a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ddd6eabb1280f4403ed01858e4e33a2");
            return;
        }
        super.onPause();
        this.b.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761227c5c70b145e67dc436551de0ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761227c5c70b145e67dc436551de0ad7");
            return;
        }
        super.onStop();
        this.b.F();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef87a9f3ea451bf4d480def304a2ec56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef87a9f3ea451bf4d480def304a2ec56");
            return;
        }
        super.onDestroy();
        this.b.F().m.a();
    }
}
