package com.sankuai.waimai.drug.im.vessel.creator;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.i;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.im.base.prepare.a {
    public static ChangeQuickRedirect a;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e735d2b8168f8ae42c3539db972d1a12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e735d2b8168f8ae42c3539db972d1a12");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.prepare.a
    public final void a(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5831793bb37ac1c6fd26086d2a7238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5831793bb37ac1c6fd26086d2a7238");
        } else if (c(intent)) {
            e();
        }
    }

    private boolean c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045982dc8f2a118faf5a6243765e6af2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045982dc8f2a118faf5a6243765e6af2")).booleanValue();
        }
        String str = i.a + b.a(this.c, (int) R.string.wm_sg_imlight_mrn_page_url);
        try {
            String encodedQuery = intent.getData().getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                if (str.indexOf(CommonConstant.Symbol.QUESTION_MARK, str.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                    str = str + "&" + encodedQuery;
                } else {
                    str = str + CommonConstant.Symbol.QUESTION_MARK + encodedQuery;
                }
            }
            d.a(this.c, Uri.parse(str).toString());
            return true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.im.vessel.creator.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0935a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162a96c6c88db4017cf5173ba8fcc670", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162a96c6c88db4017cf5173ba8fcc670") : new a(sCBaseActivity);
        }
    }
}
