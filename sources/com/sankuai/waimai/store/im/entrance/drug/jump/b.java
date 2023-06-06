package com.sankuai.waimai.store.im.entrance.drug.jump;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.store.im.medical.model.DrugImEnterErrTip;
import com.sankuai.waimai.store.router.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements com.sankuai.waimai.store.im.entrance.drug.jump.I.a {
    public static ChangeQuickRedirect a;
    Activity b;
    String c;
    private a d;
    private boolean e;

    public b(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7dcb2ad5d633b2bbf44b76341ba07b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7dcb2ad5d633b2bbf44b76341ba07b4");
            return;
        }
        this.e = false;
        this.b = activity;
        this.c = str;
        this.d = new a(this, str2);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.jump.I.a
    public final void a(int i, long j, String str, String str2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29dd02ad9ed7cd8bdedb7f04b12cfa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29dd02ad9ed7cd8bdedb7f04b12cfa9");
            return;
        }
        this.e = z;
        this.d.a(i, j, str, str2);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.jump.I.a
    public final Context a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.jump.I.a
    public final void a(final DrugImEnterErrTip drugImEnterErrTip) {
        Object[] objArr = {drugImEnterErrTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b17d9842873ab6876d690bfe39bed0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b17d9842873ab6876d690bfe39bed0d");
            return;
        }
        CustomDialog.a aVar = new CustomDialog.a(this.b);
        aVar.a(drugImEnterErrTip.title).b(drugImEnterErrTip.tip);
        if (drugImEnterErrTip.haveHistory) {
            aVar.a(com.sankuai.waimai.store.util.b.a(this.b, (int) R.string.wm_sc_chat_history), true, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.im.entrance.drug.jump.b.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52599bbc393a36394fba79f9d44def96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52599bbc393a36394fba79f9d44def96");
                        return;
                    }
                    dialogInterface.dismiss();
                    b bVar = b.this;
                    Activity activity = b.this.b;
                    Object[] objArr3 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a74fa8505990905b5304310695368b7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a74fa8505990905b5304310695368b7d");
                    } else {
                        d.b(activity, "flashbuy-medicine-chatlist");
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(b.this.c, "b_waimai_tnyis24o_mc").a("status_code", Long.valueOf(drugImEnterErrTip.code)).a();
                    b.this.c();
                }
            });
        }
        aVar.b(com.sankuai.waimai.store.util.b.a(this.b, (int) R.string.wm_sc_close), true, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.im.entrance.drug.jump.b.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1eac96856cb775bad1152eba68a0e68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1eac96856cb775bad1152eba68a0e68");
                    return;
                }
                dialogInterface.dismiss();
                b.this.c();
            }
        });
        aVar.a(false).b(false);
        com.sankuai.waimai.store.util.d.b(aVar.a());
        com.sankuai.waimai.store.manager.judas.b.b(this.c, "b_waimai_b2j3xpmu_mv").a("status_code", Long.valueOf(drugImEnterErrTip.code)).a();
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.jump.I.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d58f817405bfcf283adf94856adea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d58f817405bfcf283adf94856adea9");
        } else {
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5284b980d066117e3cc50a16a644ef3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5284b980d066117e3cc50a16a644ef3a");
        } else if (!this.e || com.sankuai.waimai.store.util.b.a(this.b)) {
        } else {
            this.b.finish();
        }
    }
}
