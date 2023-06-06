package com.sankuai.waimai.store.im.entrance.drug.jump;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.medical.model.DrugEnterInfo;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.im.entrance.drug.jump.I.a b;
    private String c;

    public a(com.sankuai.waimai.store.im.entrance.drug.jump.I.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba41b5c8f858a972d436e72845e79298", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba41b5c8f858a972d436e72845e79298");
            return;
        }
        this.b = aVar;
        this.c = str;
    }

    public final void a(int i, long j, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2eea0e0b65f6767ff22905b86a2e4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2eea0e0b65f6767ff22905b86a2e4c2");
            return;
        }
        final Context a2 = this.b.a();
        final Dialog a3 = d.a(a2);
        com.sankuai.waimai.store.im.base.net.a.a(this.c).a(i, j, str, str2, new j<DrugEnterInfo>() { // from class: com.sankuai.waimai.store.im.entrance.drug.jump.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c08fe7f8332dbc4a5dae2b770f6d98af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c08fe7f8332dbc4a5dae2b770f6d98af");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(DrugEnterInfo drugEnterInfo) {
                DrugEnterInfo drugEnterInfo2 = drugEnterInfo;
                Object[] objArr2 = {drugEnterInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51db5ab6e0b1b5f35f74582c7dda2aea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51db5ab6e0b1b5f35f74582c7dda2aea");
                    return;
                }
                d.a(a3);
                if (TextUtils.isEmpty(drugEnterInfo2.scheme)) {
                    if (drugEnterInfo2.errorInfo == null) {
                        com.sankuai.waimai.store.im.util.b.a((com.sankuai.waimai.store.repository.net.b) null, a2);
                        if (a.this.b != null) {
                            a.this.b.b();
                            return;
                        }
                        return;
                    } else if (a.this.b != null) {
                        a.this.b.a(drugEnterInfo2.errorInfo);
                        return;
                    } else {
                        return;
                    }
                }
                if (a.this.a(drugEnterInfo2.scheme)) {
                    com.sankuai.waimai.store.router.d.a(a2, drugEnterInfo2.scheme);
                } else {
                    am.a(a2, (int) R.string.wm_sc_common_loading_fail_try_afterwhile);
                }
                if (a.this.b != null) {
                    a.this.b.b();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "748cf708347627be2f35d7e2d0d369ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "748cf708347627be2f35d7e2d0d369ca");
                    return;
                }
                d.a(a3);
                if (bVar.c == 0) {
                    return;
                }
                com.sankuai.waimai.store.im.util.b.a(bVar, a2);
                if (a.this.b != null) {
                    a.this.b.b();
                }
            }
        });
    }

    boolean a(String str) {
        Uri parse;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cf7720fbb5d6b0db043fad689871a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cf7720fbb5d6b0db043fad689871a4")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            try {
                if (NumberUtils.parseLong(parse.getQueryParameter("chatID"), 0L) <= 0) {
                    com.sankuai.waimai.store.im.base.log.b.a("pubid from api is 0 ,Scheme is " + str, "");
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        com.sankuai.waimai.store.im.base.log.b.a("Scheme from api error : " + str, "");
        return false;
    }
}
