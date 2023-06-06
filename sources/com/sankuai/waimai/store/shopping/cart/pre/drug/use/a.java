package com.sankuai.waimai.store.shopping.cart.pre.drug.use;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.config.drug.DrugConfigPath;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.pre.b;
import com.sankuai.waimai.store.shopping.cart.pre.c;
import com.sankuai.waimai.store.shopping.cart.pre.drug.use.dlg.DrugAuthDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b, DrugAuthDialog.a {
    public static ChangeQuickRedirect a;
    private Activity b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private SCPageConfig d;
    private c e;

    public a(Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig) {
        Object[] objArr = {activity, aVar, sCPageConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f149c814984dc0c04e5aaafe8ee453", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f149c814984dc0c04e5aaafe8ee453");
            return;
        }
        this.b = activity;
        this.c = aVar;
        this.d = sCPageConfig;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.pre.b
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e625ca0cb690f09389dc41795d8aa34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e625ca0cb690f09389dc41795d8aa34");
            return;
        }
        this.e = cVar;
        if (!d.h().a(DrugConfigPath.ORDER_DRUG_DIALOG_SHOW_SWITCH, false)) {
            if (this.e != null) {
                this.e.a();
                return;
            }
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "233f85da1a03889d6217ca68ec50ec96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "233f85da1a03889d6217ca68ec50ec96");
            return;
        }
        String b = d.h().b(DrugConfigPath.ORDER_DRUG_AUTH_INFO);
        if (!TextUtils.isEmpty(b)) {
            b = b.replace("\\n", "\n").replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
        }
        if (TextUtils.isEmpty(b)) {
            if (this.e != null) {
                this.e.a();
                return;
            }
            return;
        }
        String replaceAll = b.replaceAll(this.b.getString(R.string.wm_sc_common_drug_name), this.c.j());
        DrugAuthDialog drugAuthDialog = new DrugAuthDialog(this.b);
        drugAuthDialog.d = this;
        drugAuthDialog.c = this.e;
        Object[] objArr3 = {replaceAll};
        ChangeQuickRedirect changeQuickRedirect3 = DrugAuthDialog.a;
        if (PatchProxy.isSupport(objArr3, drugAuthDialog, changeQuickRedirect3, false, "0248e5f934b84828970a402681ca44ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, drugAuthDialog, changeQuickRedirect3, false, "0248e5f934b84828970a402681ca44ac");
        } else {
            drugAuthDialog.b.setText(replaceAll);
        }
        drugAuthDialog.show();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.pre.drug.use.dlg.DrugAuthDialog.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d891ed8b5f36f0729d73d4b8dea9acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d891ed8b5f36f0729d73d4b8dea9acb");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.d.d, "b_gekqwqys").a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.pre.drug.use.dlg.DrugAuthDialog.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24923ef02dad969984b95ad3f6ad5231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24923ef02dad969984b95ad3f6ad5231");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.d.d, "b_byu5542v").a();
        }
    }
}
