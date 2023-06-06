package com.sankuai.waimai.rocks.page;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.a;
import com.sankuai.waimai.rocks.page.block.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class RocksPageFragment<RootBlock extends f, ContextType extends a> extends Fragment {
    public static ChangeQuickRedirect e;
    private ContextType a;
    public RootBlock f;

    public abstract RootBlock a(ContextType contexttype);

    public abstract ContextType b();

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad7a3f4072af163ab822f0ef2598240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad7a3f4072af163ab822f0ef2598240");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db3be2ecd4dce58dd5654d5db11e890", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db3be2ecd4dce58dd5654d5db11e890");
        }
        this.a = b();
        this.a.r = this;
        this.f = a(this.a);
        if (this.f == null) {
            throw new RuntimeException("页面RootBlock必须配置");
        }
        return this.f.i();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c2387ff24fcb70b166e342d2986d46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c2387ff24fcb70b166e342d2986d46");
            return;
        }
        super.onResume();
        if (this.f != null) {
            this.f.F();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc993a9f0beeeec4ba63678326789b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc993a9f0beeeec4ba63678326789b25");
            return;
        }
        super.onStart();
        if (this.f != null) {
            this.f.F();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd60a8d5bf891971ba61347faf9b076d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd60a8d5bf891971ba61347faf9b076d");
            return;
        }
        super.onPause();
        if (this.f != null) {
            this.f.F();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a3c781ee3d2c2de679874c4b764b88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a3c781ee3d2c2de679874c4b764b88");
            return;
        }
        super.onStop();
        if (this.f != null) {
            this.f.F();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cbb0b09e3c64f6248fbb5373b0a1525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cbb0b09e3c64f6248fbb5373b0a1525");
            return;
        }
        super.onDestroy();
        if (this.f != null) {
            this.f.F().m.a();
        }
    }
}
