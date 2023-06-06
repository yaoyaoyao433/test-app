package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import com.sankuai.waimai.touchmatrix.rebuild.mach.c;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect f;
    private SingleModuleItemViewNew g;

    public d(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baae44a424c99c6458c657ee161b1607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baae44a424c99c6458c657ee161b1607");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb389b0fc57a9c4de1493f082e49306", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb389b0fc57a9c4de1493f082e49306");
            return;
        }
        inflate(context, R.layout.wm_tmatrix_dynamic_dialog_skeleton_fully_dynamic_content_layout_new, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "172f306a18779e1284d2d6a10cf2e876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "172f306a18779e1284d2d6a10cf2e876");
        } else {
            this.g = (SingleModuleItemViewNew) findViewById(R.id.module_view);
        }
    }

    public final View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515468cbf65d710e5af571a0085f7b5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515468cbf65d710e5af571a0085f7b5d");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.getContentView();
    }

    public final View getBgView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e540d63c4b073fc2b368ca4363eff99f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e540d63c4b073fc2b368ca4363eff99f");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.getBgView();
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.a
    public final void a(AlertInfo alertInfo, @NonNull final com.sankuai.waimai.touchmatrix.dialog.c cVar) {
        boolean z;
        char c = 2;
        Object[] objArr = {alertInfo, cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd2c35aee6315fdd0e3dde5599b0f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd2c35aee6315fdd0e3dde5599b0f61");
        } else if (alertInfo != null) {
            final SingleModuleItemViewNew singleModuleItemViewNew = this.g;
            List<AlertInfo.Module> list = alertInfo.modules;
            Object[] objArr2 = {list, cVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, singleModuleItemViewNew, changeQuickRedirect2, false, "88d5a6b88de7dc738ce9564ca21d37b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, singleModuleItemViewNew, changeQuickRedirect2, false, "88d5a6b88de7dc738ce9564ca21d37b7");
                return;
            }
            singleModuleItemViewNew.getModuleContainer().removeAllViews();
            Object[] objArr3 = {list};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3ea859a5a6b324ab325a26f9c8b65f17", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3ea859a5a6b324ab325a26f9c8b65f17")).booleanValue();
            } else {
                z = list == null || list.isEmpty();
            }
            if (z) {
                cVar.a();
                return;
            }
            final int i = 0;
            for (AlertInfo.Module module : list) {
                if (module != null) {
                    i++;
                }
            }
            if (i == 0) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.touchmatrix.monitor.b.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "47cc6962774df5f163490e4a915c14a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "47cc6962774df5f163490e4a915c14a2");
                } else {
                    com.sankuai.waimai.touchmatrix.monitor.b.a(18902);
                }
            }
            Object[] objArr5 = {Integer.valueOf(i), cVar};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            e eVar = PatchProxy.isSupport(objArr5, singleModuleItemViewNew, changeQuickRedirect5, false, "55678906b30fe3818787b999d67e2eeb", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr5, singleModuleItemViewNew, changeQuickRedirect5, false, "55678906b30fe3818787b999d67e2eeb") : new e() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.c.1
                public static ChangeQuickRedirect a;
                private int e;
                private int f;
                private int g;
                private int h;
                private int i;
                private int j;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.e
                public final void a(com.sankuai.waimai.touchmatrix.rebuild.mach.b bVar, int i2, Throwable th) {
                    a.C1348a b;
                    Object[] objArr6 = {bVar, Integer.valueOf(i2), th};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9c64bf62d67a21e2c01c7a7f32601b8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9c64bf62d67a21e2c01c7a7f32601b8e");
                        return;
                    }
                    this.f++;
                    if (i2 == 2) {
                        this.g++;
                    } else if (i2 == 1) {
                        this.h++;
                    } else if (i2 == 0) {
                        this.i++;
                    } else if (i2 == 3) {
                        this.j++;
                    }
                    a();
                    if (singleModuleItemViewNew.g != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("message_id", singleModuleItemViewNew.g.c);
                        hashMap.put("failure_status", "模板加载失败");
                        hashMap.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(singleModuleItemViewNew.g));
                        hashMap.put("status_code", 13004);
                        hashMap.putAll(singleModuleItemViewNew.g.e());
                        j.a().a(hashMap);
                        com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： Mach模板加载失败", new Object[0]);
                    }
                    if (singleModuleItemViewNew.g == null || singleModuleItemViewNew.g.k == null || com.sankuai.waimai.touchmatrix.utils.g.a(singleModuleItemViewNew.g.k.bizId) || (b = com.sankuai.waimai.touchmatrix.a.a().b(singleModuleItemViewNew.g.k.bizId)) == null || b.o == null) {
                        return;
                    }
                    com.sankuai.waimai.touchmatrix.data.a unused = singleModuleItemViewNew.g;
                }

                @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.e
                public final void a(com.sankuai.waimai.touchmatrix.rebuild.mach.b bVar) {
                    Object[] objArr6 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "76c9de52dc07663f617ec5443ea6fcdf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "76c9de52dc07663f617ec5443ea6fcdf");
                        return;
                    }
                    this.e++;
                    a();
                    c.c(singleModuleItemViewNew);
                }

                private void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e74b0edd6f9245463ee36521ba432dee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e74b0edd6f9245463ee36521ba432dee");
                    } else if (this.f + this.e == i) {
                        if (this.e > 0) {
                            singleModuleItemViewNew.getDialogContext().b();
                            singleModuleItemViewNew.post(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.c.1.1
                                public static ChangeQuickRedirect a;

                                {
                                    AnonymousClass1.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8094f41e64c2cd3138a1e9e5a3d194b4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8094f41e64c2cd3138a1e9e5a3d194b4");
                                        return;
                                    }
                                    c cVar2 = singleModuleItemViewNew;
                                    Object[] objArr8 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect8 = c.a;
                                    if (PatchProxy.isSupport(objArr8, cVar2, changeQuickRedirect8, false, "db28be79337503b1992d4dbbac45056a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, cVar2, changeQuickRedirect8, false, "db28be79337503b1992d4dbbac45056a");
                                        return;
                                    }
                                    for (a aVar : cVar2.c) {
                                        aVar.b();
                                    }
                                }
                            });
                        } else {
                            singleModuleItemViewNew.getDialogContext().a();
                            com.sankuai.waimai.touchmatrix.monitor.b.a();
                            com.sankuai.waimai.touchmatrix.monitor.g.a(this.g, this.h, this.i, this.j);
                        }
                        if (cVar != null) {
                            cVar.a();
                        }
                    }
                }
            };
            int i2 = 0;
            while (i2 < list.size()) {
                AlertInfo.Module module2 = list.get(i2);
                if (module2 != null) {
                    ViewGroup a = singleModuleItemViewNew.a(module2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(i2));
                    Object[] objArr6 = new Object[4];
                    objArr6[0] = a;
                    objArr6[1] = module2;
                    objArr6[c] = hashMap;
                    objArr6[3] = eVar;
                    ChangeQuickRedirect changeQuickRedirect6 = c.a;
                    a.addOnAttachStateChangeListener(new c.View$OnAttachStateChangeListenerC1353c(PatchProxy.isSupport(objArr6, singleModuleItemViewNew, changeQuickRedirect6, false, "9944218ddbbcb4bcc4a59c8913ccdea0", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr6, singleModuleItemViewNew, changeQuickRedirect6, false, "9944218ddbbcb4bcc4a59c8913ccdea0") : singleModuleItemViewNew.a(a, module2, hashMap, eVar)));
                    singleModuleItemViewNew.getModuleContainer().addView(a);
                }
                i2++;
                c = 2;
            }
            if (i != 0 || cVar == null) {
                return;
            }
            cVar.a();
        } else {
            cVar.a();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.dialog.view.a
    public final void a(@NonNull DynamicDialogNew.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8143a538edc5a7f702d56608bdbbf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8143a538edc5a7f702d56608bdbbf3");
            return;
        }
        super.a(eVar);
        this.g.a(eVar);
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.a
    public final void setMessage(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683137cc99ae638b7d953af13028099a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683137cc99ae638b7d953af13028099a");
            return;
        }
        super.setMessage(aVar);
        this.g.setTMatrixMessage(aVar);
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.a
    public final void setControler(com.sankuai.waimai.touchmatrix.rebuild.factory.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305c06c68454938d608aa466995ce073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305c06c68454938d608aa466995ce073");
            return;
        }
        super.setControler(cVar);
        this.g.setControler(cVar);
    }
}
