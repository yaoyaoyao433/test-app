package com.sankuai.waimai.store.router;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.BaseMemberActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends com.sankuai.waimai.store.base.preload.c {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x018c, code lost:
        if (r12 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
        if (com.sankuai.waimai.store.config.k.d() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a2, code lost:
        if (com.sankuai.waimai.store.config.k.c() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b0, code lost:
        if (com.sankuai.waimai.store.config.i.h().a(com.sankuai.waimai.store.config.SCConfigPath.NEW_USER_LAND_PRELOAD, false) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b6, code lost:
        if (com.sankuai.waimai.store.locate.a.g() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
        if (com.sankuai.waimai.store.poi.list.util.b.a().b() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
        r1 = com.sankuai.waimai.store.base.preload.d.a();
        r3 = (android.os.Bundle) r34.a(android.os.Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d0, code lost:
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d2, code lost:
        r3 = new android.os.Bundle();
        r3.putString("key_pre_request_cache", r1);
        r34.a("com.sankuai.waimai.router.activity.intent_extra", (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e3, code lost:
        r3.putString("key_pre_request_cache", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e9, code lost:
        r3 = com.sankuai.waimai.store.mrn.preload.p.a(r1);
        com.sankuai.waimai.store.mrn.preload.l.a().a(r3);
        r19 = com.sankuai.waimai.store.router.d.a(r0, "category_code", "category_code", "-999");
        r20 = com.sankuai.waimai.store.router.d.a(r0, "second_category_type", "second_category_type", "-999");
        r22 = com.sankuai.waimai.store.router.d.a(r0, "spu_id", "spu_id", "");
        r23 = com.sankuai.waimai.store.router.d.a(r0, "sku_id", "sku_id", "");
        r24 = com.sankuai.waimai.store.router.d.a(r0, com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader.URI_POI_STR, com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        r25 = com.sankuai.waimai.store.router.d.a(r0, "source_id", "source_id", "-999");
        r26 = com.sankuai.waimai.store.router.d.a(r0, "extra", "extra", "");
        r0 = com.sankuai.waimai.store.goods.list.utils.e.a(r0);
        com.sankuai.waimai.store.base.net.sg.a.a((java.lang.Object) r1).a(r19, r20, r2, r22, r23, r24, r25, r26, r0.upc, r0.hangDownProductsInfo, r0.reqSource, r0.thirdCategoryCode, new com.sankuai.waimai.store.router.k.AnonymousClass1(r33));
     */
    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull com.sankuai.waimai.router.core.j r34, @android.support.annotation.NonNull com.sankuai.waimai.router.core.g r35) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.router.k.a(com.sankuai.waimai.router.core.j, com.sankuai.waimai.router.core.g):void");
    }

    public k() {
        super(BaseMemberActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c8f7e2e5bf76a8d8391cf580ae93af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c8f7e2e5bf76a8d8391cf580ae93af");
        }
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b87b49fa1653a7cf3d93e4f5727aec", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b87b49fa1653a7cf3d93e4f5727aec");
        }
        Intent b = super.b(jVar);
        String path = jVar.d.getPath();
        b.putExtra("vessel_path", path);
        if (TextUtils.equals(path, "/supermarket/cdq/channelhome")) {
            b.setFlags(603979776);
        }
        com.sankuai.waimai.store.base.remote.a.a(path, com.sankuai.waimai.store.base.vessel.b.class);
        return b;
    }

    private boolean c(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        String str;
        String str2;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c56b8829775c3ca4b3d1bf41b4954b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c56b8829775c3ca4b3d1bf41b4954b")).booleanValue();
        }
        if (TextUtils.equals("/chat/1031", jVar.d.getPath())) {
            Uri uri = jVar.d;
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d02330b4d73d7d5728b385719ea59d1", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d02330b4d73d7d5728b385719ea59d1");
            } else if (uri != null) {
                str = uri.getScheme() + "://" + (TextUtils.isEmpty(uri.getHost()) ? "" : uri.getHost()) + (TextUtils.isEmpty(uri.getPath()) ? "" : uri.getPath());
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String str3 = i.a + com.sankuai.waimai.store.util.b.a(jVar.c, (int) R.string.wm_sg_inquiry_mrn_page_url);
            try {
                String encodedQuery = jVar.d.getEncodedQuery();
                Object[] objArr3 = {str3, encodedQuery};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c37a521550cc9904269b82c51b6c68d9", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c37a521550cc9904269b82c51b6c68d9");
                } else {
                    if (!TextUtils.isEmpty(encodedQuery)) {
                        if (str3.indexOf(CommonConstant.Symbol.QUESTION_MARK, str3.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                            str3 = str3 + "&" + encodedQuery;
                        } else {
                            str3 = str3 + CommonConstant.Symbol.QUESTION_MARK + encodedQuery;
                        }
                    }
                    str2 = str3;
                }
                jVar.a(Uri.parse(str2));
                gVar.a(301);
                return true;
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                return false;
            }
        }
        return false;
    }
}
