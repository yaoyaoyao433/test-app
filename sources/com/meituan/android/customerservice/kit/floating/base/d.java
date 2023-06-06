package com.meituan.android.customerservice.kit.floating.base;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.meituan.android.customerservice.kit.floating.DrawOverPermissionActivity;
import com.meituan.android.customerservice.kit.floating.FloatingDialogActivity;
import com.meituan.android.customerservice.kit.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends a {
    public static ChangeQuickRedirect d;
    private final WindowManager e;
    private final WindowManager.LayoutParams f;
    private boolean g;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0a42d05e185cd9ea8f4f3e93829da8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0a42d05e185cd9ea8f4f3e93829da8");
            return;
        }
        this.e = (WindowManager) context.getSystemService("window");
        this.f = new WindowManager.LayoutParams();
        this.g = false;
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.a, com.meituan.android.customerservice.kit.floating.base.b
    public final void a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c5b07839240cd45385c3522a352ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c5b07839240cd45385c3522a352ffa");
            return;
        }
        super.a(view, i, i2);
        this.f.flags = 40;
        this.f.format = -2;
        this.f.width = i;
        this.f.height = i2;
        if (Build.VERSION.SDK_INT < 26) {
            this.f.type = 2002;
        } else {
            this.f.type = 2038;
        }
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4f2f372f9adc8a3b11635a39ee4435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4f2f372f9adc8a3b11635a39ee4435");
            return;
        }
        this.f.gravity = i;
        this.f.x = i2;
        this.f.y = i3;
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89194e9cbd87ffbcb42e5ad61c18c103", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89194e9cbd87ffbcb42e5ad61c18c103")).booleanValue();
        }
        final boolean[] zArr = new boolean[1];
        if (ViewCompat.isAttachedToWindow(this.c)) {
            return true;
        }
        if (h.a(this.b)) {
            a(this.e, this.c, this.f);
            zArr[0] = true;
            this.g = true;
        } else {
            DrawOverPermissionActivity.a(new com.meituan.android.customerservice.kit.floating.c() { // from class: com.meituan.android.customerservice.kit.floating.base.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.kit.floating.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ce31dccf9d20f0b62b29d5e7b2c20fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ce31dccf9d20f0b62b29d5e7b2c20fb");
                    } else if (!d.this.g) {
                        d.this.a(d.this.e, d.this.c, d.this.f);
                        zArr[0] = true;
                    } else {
                        zArr[0] = false;
                    }
                }

                @Override // com.meituan.android.customerservice.kit.floating.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a4bc830db115d7727483249b4d0b240", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a4bc830db115d7727483249b4d0b240");
                    } else {
                        zArr[0] = false;
                    }
                }
            });
            Intent intent = new Intent(this.b, FloatingDialogActivity.class);
            intent.putExtra("message", this.b.getString(R.string.cs_voip_floating_dialog_message));
            intent.setFlags(y.a);
            this.b.startActivity(intent);
        }
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {windowManager, view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922b389584b64bc2f676e124aad8cd12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922b389584b64bc2f676e124aad8cd12");
        } else if (ViewCompat.isAttachedToWindow(view)) {
        } else {
            windowManager.addView(view, layoutParams);
        }
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee7f30a2f3bda41b28efd67eeb5fb62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee7f30a2f3bda41b28efd67eeb5fb62");
            return;
        }
        this.g = true;
        if (ViewCompat.isAttachedToWindow(this.c)) {
            this.e.removeView(this.c);
        }
    }
}
