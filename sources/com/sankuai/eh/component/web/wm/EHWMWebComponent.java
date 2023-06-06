package com.sankuai.eh.component.web.wm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.module.c;
import com.sankuai.eh.component.web.titans.EHMTWebFragment;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHWMWebComponent extends com.sankuai.eh.component.web.module.a {
    public static ChangeQuickRedirect d;
    private Fragment e;

    @Override // com.sankuai.eh.component.web.module.a
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d483ae98eede682dc00307de7be31ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d483ae98eede682dc00307de7be31ca3");
        } else if (this.b.i instanceof AppCompatActivity) {
            c cVar = this.b;
            Bundle bundle = this.c;
            Object[] objArr2 = {cVar, bundle};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            this.e = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "49ef47ecb4c8262d4cdbcc2e90e4f8df", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "49ef47ecb4c8262d4cdbcc2e90e4f8df") : EHMTWebFragment.a(cVar, bundle);
            ((AppCompatActivity) this.b.i).getSupportFragmentManager().beginTransaction().replace(R.id.eh_component_web_content, this.e).commitAllowingStateLoss();
        }
    }

    @Override // com.sankuai.eh.component.web.module.a, com.sankuai.eh.component.service.spi.IComponent
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7fc8fcd45dfaf20644ae6119cb089d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7fc8fcd45dfaf20644ae6119cb089d");
            return;
        }
        super.a(i, i2, intent);
        if (this.e != null) {
            this.e.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.sankuai.eh.component.web.module.a, com.sankuai.eh.component.service.spi.IComponent
    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0b722fe8835daf3744148f7f003c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0b722fe8835daf3744148f7f003c0a");
            return;
        }
        super.a(i, strArr, iArr);
        if (this.e != null) {
            this.e.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.sankuai.eh.component.web.module.a, com.sankuai.eh.component.service.spi.IComponent
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9459ac614b0515fe753e526770c16927", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9459ac614b0515fe753e526770c16927")).booleanValue();
        }
        if (super.c()) {
            return true;
        }
        if (this.e instanceof com.sankuai.eh.component.service.spi.a) {
            return ((com.sankuai.eh.component.service.spi.a) this.e).a();
        }
        return false;
    }

    @Override // com.sankuai.eh.component.web.module.a, com.sankuai.eh.component.service.spi.IComponent
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424501e4436ff93ab17bea7538d2b30b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424501e4436ff93ab17bea7538d2b30b")).booleanValue();
        }
        if (super.d()) {
            return true;
        }
        if (this.e instanceof com.sankuai.eh.component.service.spi.a) {
            ((com.sankuai.eh.component.service.spi.a) this.e).b();
        }
        return false;
    }
}
