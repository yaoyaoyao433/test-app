package com.sankuai.waimai.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.actinfo.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.popup.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final Activity b;
    d c;
    d.a d;
    a e;
    private final PageFragment f;
    private final String g;
    private a.b h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void b();
    }

    public c(Activity activity, PageFragment pageFragment, String str, String str2, b bVar) {
        Object[] objArr = {activity, pageFragment, str, null, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1797e564a810e5b1fd3de60fa9a24972", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1797e564a810e5b1fd3de60fa9a24972");
            return;
        }
        this.e = new a() { // from class: com.sankuai.waimai.popup.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.popup.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9257cf907c944edeb896e005e474681", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9257cf907c944edeb896e005e474681");
                } else if (c.this.d != null) {
                    c.this.c.e = true;
                    c.this.c.a(c.this.d);
                }
            }
        };
        this.h = new a.b() { // from class: com.sankuai.waimai.popup.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.actinfo.a.b
            public final void a(Dialog dialog) {
                Object[] objArr2 = {dialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93898ead6d1eba342c01ca61c34bad10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93898ead6d1eba342c01ca61c34bad10");
                    return;
                }
                a aVar = c.this.e;
                Activity activity2 = c.this.b;
                Object[] objArr3 = {activity2};
                ChangeQuickRedirect changeQuickRedirect3 = a.c;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a2848967ce74fcd0a9fa3ecac997a08d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a2848967ce74fcd0a9fa3ecac997a08d");
                    return;
                }
                com.sankuai.waimai.platform.domain.manager.user.a.i().a(aVar);
                com.sankuai.waimai.platform.domain.manager.user.a.a((Context) activity2);
            }
        };
        this.b = activity;
        this.g = str;
        this.c = new d(activity, null);
        d dVar = this.c;
        dVar.getClass();
        this.d = new d.a();
        this.d.g = bVar;
        this.f = pageFragment;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b874cd411764944dec83d8d968a9fa87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b874cd411764944dec83d8d968a9fa87");
            return;
        }
        this.d.e = this.h;
        this.d.d = com.sankuai.waimai.platform.domain.manager.user.a.i().a();
        this.d.f = AppUtil.generatePageInfoKey(this.f);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e49c39731625a2d3dc5da6855e38d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e49c39731625a2d3dc5da6855e38d1");
        } else {
            this.c.e = z;
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0032a757489795b58d8cb4eaf5783005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0032a757489795b58d8cb4eaf5783005");
        } else if (com.sankuai.waimai.foundation.utils.f.a(this.b) || this.b.getResources().getBoolean(R.bool.wm_page_is_mt) || com.sankuai.waimai.platform.utils.sharedpreference.a.b()) {
        } else {
            this.c.g = z;
        }
    }

    public final void a(boolean z, boolean z2, String str) {
        boolean z3;
        boolean z4 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c6bf1f907ab32031929adedf18fc7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c6bf1f907ab32031929adedf18fc7a");
            return;
        }
        this.d.a = z;
        this.d.b = z2;
        this.d.c = str;
        this.d.d = com.sankuai.waimai.platform.domain.manager.user.a.i().a();
        this.d.h = this.f;
        final d dVar = this.c;
        final d.a aVar = this.d;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6e2dbc4579ec3576d6fbf6387dc9e641", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6e2dbc4579ec3576d6fbf6387dc9e641");
        } else if (dVar.b.isFinishing() || aVar == null) {
            com.sankuai.waimai.platform.popup.d.a().b("native activity finished");
            dVar.b(aVar);
        } else if (!aVar.a && aVar.b) {
            com.sankuai.waimai.platform.popup.d.a().b("no activity but needLogin");
            dVar.b(aVar);
        } else if (!aVar.a && !aVar.b) {
            com.sankuai.waimai.platform.popup.d.a().b("no activity and no needLogin");
            dVar.b(aVar);
        } else if (aVar.a && aVar.b) {
            com.sankuai.waimai.platform.popup.d.a().b("activity and needLogin");
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a1401e4279f80499d1dd2bc603ae5d26", RobustBitConfig.DEFAULT_VALUE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a1401e4279f80499d1dd2bc603ae5d26")).booleanValue();
            } else if (aVar != null && !aVar.d && dVar.e && !TextUtils.isEmpty(aVar.c) && (dVar.c == null || !dVar.c.isShowing())) {
                dVar.f = new com.sankuai.waimai.business.page.home.actinfo.a(dVar.b);
                final com.sankuai.waimai.business.page.home.actinfo.a aVar2 = dVar.f;
                String str2 = aVar.c;
                final a.b bVar = new a.b() { // from class: com.sankuai.waimai.popup.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.actinfo.a.b
                    public final void a(Dialog dialog) {
                        Object[] objArr4 = {dialog};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5d625b7c6ff015541806d0aa4031e360", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5d625b7c6ff015541806d0aa4031e360");
                            return;
                        }
                        com.sankuai.waimai.business.page.home.actinfo.b bVar2 = dVar.d;
                        String str3 = aVar.f;
                        Object[] objArr5 = {str3};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.actinfo.b.a;
                        if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "5dbe4517489122dded15a7a66ed36864", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "5dbe4517489122dded15a7a66ed36864");
                        } else {
                            JudasManualManager.a("b_u8INK", "c_m84bv26", str3).a();
                        }
                        if (aVar.e != null) {
                            aVar.e.a(dialog);
                        }
                    }
                };
                Object[] objArr4 = {str2, bVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.actinfo.a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "eeaf31f2139e0e2a1ba90c243b8c9da8", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar2 = (com.sankuai.waimai.business.page.home.actinfo.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "eeaf31f2139e0e2a1ba90c243b8c9da8");
                } else {
                    if (aVar2.g) {
                        z3 = true;
                    } else {
                        aVar2.g = true;
                        z3 = false;
                    }
                    if (!z3) {
                        final a.InterfaceC0768a interfaceC0768a = new a.InterfaceC0768a() { // from class: com.sankuai.waimai.business.page.home.actinfo.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.home.actinfo.a.InterfaceC0768a
                            public final void a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d013f7e4dbc9e6363584fb1e0e05518b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d013f7e4dbc9e6363584fb1e0e05518b");
                                } else if (bVar != null) {
                                    bVar.a(aVar2.f);
                                }
                            }
                        };
                        Object[] objArr5 = {str2, interfaceC0768a};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.actinfo.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "dd0cb1a461d10650169573deda85563f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "dd0cb1a461d10650169573deda85563f");
                        } else if (!TextUtils.isEmpty(str2)) {
                            View inflate = aVar2.d.inflate(R.layout.wm_page_main_dialog_adapter_act_info, aVar2.e, false);
                            ImageView imageView = (ImageView) inflate.findViewById(R.id.background);
                            ah.b((ImageView) inflate.findViewById(R.id.placeholder), (int) R.drawable.wm_common_progress_rotate);
                            Context context = aVar2.c;
                            Object[] objArr6 = {context, imageView, str2};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.actinfo.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "c177dc0652e13e8438f3a38c4fab9605", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "c177dc0652e13e8438f3a38c4fab9605");
                            } else if (!TextUtils.isEmpty(str2)) {
                                String b2 = ImageQualityUtil.b(context, str2, 2, context.getResources().getDimensionPixelSize(R.dimen.wm_page_main_actinfo_dialog_width));
                                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a2.b = context;
                                a2.c = b2;
                                a2.j = R.drawable.wm_common_dialog_activity_background;
                                a2.a(imageView);
                            }
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actinfo.a.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr7 = {view};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cbd88c39631ce79cfed4148d0cc59120", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cbd88c39631ce79cfed4148d0cc59120");
                                        return;
                                    }
                                    a.d(aVar2);
                                    a.a(aVar2, null);
                                    if (interfaceC0768a != null) {
                                        interfaceC0768a.a();
                                    }
                                }
                            });
                            aVar2.e.addView(inflate);
                        }
                    }
                }
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.d.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr7 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b149096e3468b65e3e91e1904843f9d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b149096e3468b65e3e91e1904843f9d4");
                            return;
                        }
                        if (dVar.f != null) {
                            dVar.f.a();
                        }
                        dVar.c = null;
                    }
                };
                Object[] objArr7 = {onDismissListener};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.actinfo.a.a;
                if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "562e88f036e5cfeee8e75a3c4283e369", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar2 = (com.sankuai.waimai.business.page.home.actinfo.a) PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "562e88f036e5cfeee8e75a3c4283e369");
                } else {
                    aVar2.f.setOnDismissListener(onDismissListener);
                }
                dVar.c = aVar2.b();
                com.sankuai.waimai.business.page.home.actinfo.b bVar2 = dVar.d;
                String str3 = aVar.f;
                Object[] objArr8 = {str3};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.home.actinfo.b.a;
                if (PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "031d6539fcbbb33dda3458362fcf4477", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "031d6539fcbbb33dda3458362fcf4477");
                } else {
                    JudasManualManager.b("b_ZZQPc", "c_m84bv26", str3).a();
                }
                z4 = true;
            }
            if (z4) {
                return;
            }
            dVar.b(aVar);
        } else if (!aVar.a || aVar.b) {
        } else {
            dVar.a(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    abstract class a implements com.sankuai.waimai.foundation.core.service.user.b {
        public static ChangeQuickRedirect c;

        public abstract void a();

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        }

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af39e3553686c6ae7c2d20aff5f1a12a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af39e3553686c6ae7c2d20aff5f1a12a");
            }
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onChanged(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47edaf9e782f11d54278cec50c740239", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47edaf9e782f11d54278cec50c740239");
                return;
            }
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
            if (aVar == b.a.LOGIN) {
                a();
            }
        }
    }
}
