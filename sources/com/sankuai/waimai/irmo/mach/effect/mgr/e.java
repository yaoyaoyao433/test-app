package com.sankuai.waimai.irmo.mach.effect.mgr;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectGyroConfig;
import com.sankuai.waimai.irmo.mach.effect.gyro.b;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends b<ViewGroup> implements b.InterfaceC0971b {
    public static ChangeQuickRedirect b;
    public EffectGyroConfig c;
    public com.sankuai.waimai.irmo.mach.effect.gyro.a d;
    public ViewGroup e;
    private double f;
    private double g;
    private double h;
    private double i;

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final /* synthetic */ void a(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768bebe73f2243f5e01fde40730f12a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768bebe73f2243f5e01fde40730f12a4");
            return;
        }
        this.e = viewGroup;
        this.e.setCameraDistance(this.e.getResources().getDisplayMetrics().density * 16000.0f);
        viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.irmo.mach.effect.mgr.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9683e7599518fdc48d1daa0d5d966ed7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9683e7599518fdc48d1daa0d5d966ed7");
                    return;
                }
                ViewGroup viewGroup2 = e.this.e;
                while (viewGroup2.getParent() != null && (viewGroup2.getParent() instanceof MachViewGroup)) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                    viewGroup2.setClipChildren(false);
                }
            }
        });
    }

    public e(EffectGyroConfig effectGyroConfig) {
        Object[] objArr = {effectGyroConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88e8557e78faf85a76db48c8e580b11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88e8557e78faf85a76db48c8e580b11");
            return;
        }
        this.c = effectGyroConfig;
        this.d = new com.sankuai.waimai.irmo.mach.effect.gyro.a();
        com.sankuai.waimai.irmo.mach.effect.gyro.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.mach.effect.gyro.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4873e63707c8f7c84e8787f68c7ac31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4873e63707c8f7c84e8787f68c7ac31d");
            return;
        }
        aVar.b = Privacy.createSensorManager(com.meituan.android.singleton.b.a, "irmo");
        if (aVar.b != null) {
            aVar.d = aVar.b.getDefaultSensor(2);
            aVar.c = aVar.b.getDefaultSensor(1);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db290ab4a30bff6243d76ccd5669a990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db290ab4a30bff6243d76ccd5669a990");
        } else {
            this.d.a(this);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f944744082582172a9915072dde42ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f944744082582172a9915072dde42ae");
        } else {
            this.d.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afde56cebf7262c13d9eca944f7e0f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afde56cebf7262c13d9eca944f7e0f86");
        } else {
            this.d.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f9debfda6208a57fa6069e94acc7e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f9debfda6208a57fa6069e94acc7e3");
        } else {
            this.d.a(this);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.node.a<ViewGroup> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c31b81b95808184eed63aa1da276d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c31b81b95808184eed63aa1da276d55");
        } else {
            super.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19e2bfc9eb491d642e13cf58c8b89a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19e2bfc9eb491d642e13cf58c8b89a7");
            return;
        }
        super.e();
        this.d.a();
        h();
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1645417bec99247bece7625b710737b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1645417bec99247bece7625b710737b");
        } else {
            this.d.a(this);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a542ca1488b0b45c5c98175b36d56d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a542ca1488b0b45c5c98175b36d56d");
            return;
        }
        this.d.a();
        h();
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.gyro.b.InterfaceC0971b
    public final void a(double d, double d2, double d3) {
        int i;
        int i2;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e363b3d1b474a97070dea0fde82da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e363b3d1b474a97070dea0fde82da7");
        } else if (this.c == null) {
        } else {
            int i3 = this.c.actionX == 0 ? 1 : this.c.actionX;
            int i4 = this.c.actionY == 0 ? 1 : this.c.actionY;
            int i5 = this.c.isPositive() ? 1 : -1;
            if (this.h == 0.0d) {
                this.f = d;
                com.sankuai.waimai.foundation.utils.log.a.c("EffectGyroManager", "mInitDegreeX:" + this.f, new Object[0]);
            }
            if (this.i == 0.0d) {
                this.g = d2;
                com.sankuai.waimai.foundation.utils.log.a.c("EffectGyroManager", "degreeY:" + d2, new Object[0]);
            }
            if (Math.abs(d2) > 80.0d || Math.abs(d) > 80.0d) {
                return;
            }
            double abs = Math.abs(this.h - d);
            double abs2 = Math.abs(this.i - d2);
            if (abs > 3.0d) {
                double d4 = d - this.f;
                if (this.c.actionType.equals(EffectGyroConfig.ACTION_TYPE_ROTATION)) {
                    ViewGroup viewGroup = this.e;
                    float f = (((float) d4) / 6.0f) * i3 * i5;
                    Object[] objArr2 = {viewGroup, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    i = i3;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "696d8c8a8ad2165197ac7b551bb34954", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "696d8c8a8ad2165197ac7b551bb34954");
                    } else {
                        a(viewGroup, RecceAnimUtils.ROTATION_X, f);
                    }
                } else {
                    i = i3;
                    if (this.c.actionType.equals(EffectGyroConfig.ACTION_TYPE_TRANSLATION)) {
                        ViewGroup viewGroup2 = this.e;
                        float f2 = (float) (((d4 / 3.141592653589793d) / 8.0d) * 20.0d * i4 * i5);
                        Object[] objArr3 = {viewGroup2, Float.valueOf(f2)};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        i2 = i5;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "579f6c2a55d68c1a430305b84f0747f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "579f6c2a55d68c1a430305b84f0747f4");
                        } else {
                            a(viewGroup2, RecceAnimUtils.TRANSLATION_Y, f2);
                        }
                        this.h = d;
                    }
                }
                i2 = i5;
                this.h = d;
            } else {
                i = i3;
                i2 = i5;
            }
            if (abs2 > 3.0d) {
                double d5 = d2 - this.g;
                if (this.c.actionType.equals(EffectGyroConfig.ACTION_TYPE_ROTATION)) {
                    ViewGroup viewGroup3 = this.e;
                    float f3 = (((float) d5) / 4.0f) * i4 * i2;
                    Object[] objArr4 = {viewGroup3, Float.valueOf(f3)};
                    ChangeQuickRedirect changeQuickRedirect4 = b;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b663e8c28eb01ce99f39e8c83b8f1f73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b663e8c28eb01ce99f39e8c83b8f1f73");
                    } else {
                        a(viewGroup3, RecceAnimUtils.ROTATION_Y, f3);
                    }
                } else {
                    int i6 = i2;
                    if (this.c.actionType.equals(EffectGyroConfig.ACTION_TYPE_TRANSLATION)) {
                        ViewGroup viewGroup4 = this.e;
                        float f4 = (float) (((d5 / 3.141592653589793d) / 8.0d) * 20.0d * i * i6);
                        Object[] objArr5 = {viewGroup4, Float.valueOf(f4)};
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e5dc7d746d14f34b70f9d57bdee48349", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e5dc7d746d14f34b70f9d57bdee48349");
                        } else {
                            a(viewGroup4, RecceAnimUtils.TRANSLATION_X, f4);
                        }
                    }
                }
                this.i = d2;
            }
        }
    }

    private void a(Object obj, String str, float f) {
        Object[] objArr = {obj, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5030b5b1346e637104810ec997d88302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5030b5b1346e637104810ec997d88302");
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, f);
        ofFloat.setDuration(60L);
        ofFloat.start();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1664e45cd153c4d94c413fb02c13c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1664e45cd153c4d94c413fb02c13c9");
            return;
        }
        this.h = 0.0d;
        this.i = 0.0d;
    }
}
