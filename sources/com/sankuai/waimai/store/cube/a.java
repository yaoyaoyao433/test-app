package com.sankuai.waimai.store.cube;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.android.cube.core.b;
import com.meituan.android.cube.core.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.ui.common.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends j implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public static ChangeQuickRedirect g;
    private j h;
    private b i;
    private Dialog j;
    private boolean k;
    private boolean l;

    public abstract void b(@NonNull View view);

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d655b87b8ef90e24f19d98b3e4483a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d655b87b8ef90e24f19d98b3e4483a4");
            return;
        }
        this.k = true;
        this.l = false;
        this.i = new b(context);
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca0e4946ee64864dc759c559c8b28de", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca0e4946ee64864dc759c559c8b28de") : i() == null ? layoutInflater.inflate(R.layout.wm_sc_goods_detail_poi_service_dialog, viewGroup, false) : i();
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88c71e4a4e9fad2e623be928f007171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88c71e4a4e9fad2e623be928f007171");
            return;
        }
        super.a_(view);
        if (!this.l) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g;
            this.j = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e91e2e64f52ba298cfaab62492791ad1", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e91e2e64f52ba298cfaab62492791ad1") : new CustomDialog(l());
            b(view);
            this.j.setContentView(view);
            this.j.setOnCancelListener(this);
            this.j.setOnShowListener(this);
            this.j.setOnDismissListener(this);
            this.l = true;
        }
        if (l().isFinishing()) {
            return;
        }
        this.j.setCancelable(this.k);
        this.j.setCanceledOnTouchOutside(this.k);
        this.j.show();
        Window window = this.j.getWindow();
        if (window != null) {
            a(window);
        }
    }

    public void a(Window window) {
        Object[] objArr = {window};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1691c59b7c7908375252655b6ce991c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1691c59b7c7908375252655b6ce991c");
            return;
        }
        window.setBackgroundDrawableResource(17170445);
        WindowManager.LayoutParams attributes = window.getAttributes();
        int[] iArr = {(int) (window.getWindowManager().getDefaultDisplay().getWidth() * 0.9f), -2};
        attributes.width = iArr[0];
        attributes.height = iArr[1];
        window.setAttributes(attributes);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5764ef7fdf61df0b42a0809a5905ec24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5764ef7fdf61df0b42a0809a5905ec24");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e92d965749168f8eb1f8fbcde27796e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e92d965749168f8eb1f8fbcde27796e");
        } else if (this.h != null) {
            this.h.a((j) this);
        } else if (this.i != null) {
            a(this.i, 0);
        }
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4481d03ec9c0371ff494f7a29a2ea19e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4481d03ec9c0371ff494f7a29a2ea19e")).booleanValue();
        }
        if (this.j == null || !this.j.isShowing()) {
            if (this.h != null) {
                j jVar = this.h;
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "a44400488fe68c1dfcc995a67ef0d77e", RobustBitConfig.DEFAULT_VALUE)) {
                    f fVar = (f) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "a44400488fe68c1dfcc995a67ef0d77e");
                } else {
                    jVar.b(this);
                }
                return true;
            } else if (this.i != null) {
                a(this.i, 5);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644b626a90dedd5541b7334c4c1d4de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644b626a90dedd5541b7334c4c1d4de4");
        } else if (this.j == null || l().isFinishing()) {
        } else {
            this.j.dismiss();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fea0b2f6c5a9461733eaca7c9a90c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fea0b2f6c5a9461733eaca7c9a90c4f");
            return;
        }
        super.bE_();
        s();
    }
}
