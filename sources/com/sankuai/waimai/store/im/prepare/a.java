package com.sankuai.waimai.store.im.prepare;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.im.entrance.drug.search.SchemeJumpDrugIMContractImpl;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.im.base.prepare.a {
    public static ChangeQuickRedirect a;

    private static String c(int i) {
        return i == 20 ? "c_nfqbfvw" : "c_waimai_w82fdlyn";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.platform.capacity.network.errorhanding.g
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1e0b013fb454c1f51ea892e68ab396", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1e0b013fb454c1f51ea892e68ab396");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.prepare.a
    public final void a(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3970544530b13afe2bcb31829b6b29ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3970544530b13afe2bcb31829b6b29ca");
            return;
        }
        long a2 = d.a(intent, "chatID", "chatID", 0L);
        if (com.sankuai.waimai.store.im.b.a().a(n(), a2, d.a(intent, "inquiryId", "inquiryId", 0L), intent)) {
            a(this.c, l());
            e();
            return;
        }
        String a3 = d.a(intent, "pageSource", "pageSource", "");
        d.a(intent, "newUser", "newUser", false);
        boolean a4 = d.a(intent, "needNewScheme", "needNewScheme", false);
        d.a(intent, "isNewSession", "isNewSession", 0);
        int a5 = (int) r.a(a3, 0.0f);
        if (a2 != 0) {
            if (b(this.c, l())) {
                e();
            }
        } else if (a4) {
            a(intent, a5);
        } else {
            a(intent, 70);
        }
    }

    private boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4653ae82a18d47ce2826fc75beb447a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4653ae82a18d47ce2826fc75beb447a8")).booleanValue();
        }
        String str = i.a + com.sankuai.waimai.store.util.b.a(context, (int) R.string.wm_sg_doctor_mrn_page_url);
        try {
            String encodedQuery = intent.getData().getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                if (str.indexOf(CommonConstant.Symbol.QUESTION_MARK, str.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                    str = str + "&" + encodedQuery;
                } else {
                    str = str + CommonConstant.Symbol.QUESTION_MARK + encodedQuery;
                }
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.store.im.b.a().b.inquiryId);
            d.a(context, buildUpon.appendQueryParameter("inquiryId", sb.toString()).build().toString());
            return true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return false;
        }
    }

    private boolean b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cedcbfa65be77b02c55505984d6f7309", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cedcbfa65be77b02c55505984d6f7309")).booleanValue();
        }
        String str = i.a + com.sankuai.waimai.store.util.b.a(context, (int) R.string.wm_sg_drug_mrn_page_url);
        try {
            String encodedQuery = intent.getData().getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                if (str.indexOf(CommonConstant.Symbol.QUESTION_MARK, str.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                    str = str + "&" + encodedQuery;
                } else {
                    str = str + CommonConstant.Symbol.QUESTION_MARK + encodedQuery;
                }
            }
            d.a(context, Uri.parse(str).toString());
            return true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return false;
        }
    }

    private void a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b58c35e3bc5954ed167711f6a1e4e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b58c35e3bc5954ed167711f6a1e4e9");
            return;
        }
        String a2 = d.a(intent, "cid", "cid", "");
        long a3 = d.a(intent, "poiId", "poiId", 0L);
        String a4 = d.a(intent, "poiIdStr", "poiIdStr", "");
        String a5 = d.a(intent, "spuId", "spuId", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = c(i);
        }
        SchemeJumpDrugIMContractImpl schemeJumpDrugIMContractImpl = new SchemeJumpDrugIMContractImpl();
        schemeJumpDrugIMContractImpl.init(this.c, a2, p());
        schemeJumpDrugIMContractImpl.jump(i, a3, a4, a5);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.im.prepare.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1213a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d867c45b34c4037c138117aa083b599", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d867c45b34c4037c138117aa083b599") : new a(sCBaseActivity);
        }
    }
}
