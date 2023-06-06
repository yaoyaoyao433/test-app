package com.sankuai.waimai.business.page.home.list.future;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static HashMap<String, String> b = null;
    private static final int r = 2131692216;
    View c;
    View d;
    ImageView e;
    TextView f;
    TextView g;
    TextView h;
    a i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    View.OnClickListener p;
    String q;
    private int s;
    private ViewStub t;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("c_m84bv26", "home_page_error");
        b.put("c_i5kxn8l", "sub_category_page_error");
        b.put("c_48pltlz", "order_list_page_error");
        b.put("c_hgowsqb", "order_status_detail_page_error");
        b.put("c_ykhs39e", "order_confirm_page_error");
        b.put("c_CijEL", "restaurant_page_error");
        b.put("c_u4fk4kw", "goods_detail_page_error");
        b.put("c_nfqbfvw", "search_food_page_error");
    }

    private f(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90f0c7b00b692454530c19c987058d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90f0c7b00b692454530c19c987058d2");
            return;
        }
        this.s = 0;
        this.c = view.findViewById(i);
        this.d = this.c.findViewById(R.id.info_padding);
        this.e = (ImageView) this.c.findViewById(R.id.img_info);
        this.f = (TextView) this.c.findViewById(R.id.txt_info);
        this.h = (TextView) this.c.findViewById(R.id.sub_txt_info);
        this.g = (TextView) this.c.findViewById(R.id.btn_info);
        this.t = (ViewStub) this.c.findViewById(R.id.info_skeleton);
    }

    public f(View view, int i, int i2) {
        this(view, R.id.layout_info);
        Object[] objArr = {view, Integer.valueOf((int) R.id.layout_info), Integer.valueOf((int) R.layout.wm_page_home_complex_skeleton)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9291bebdb3d2bef5321404ee8086a41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9291bebdb3d2bef5321404ee8086a41");
        } else {
            this.s = R.layout.wm_page_home_complex_skeleton;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "570dce86368bf911d0dbb7a6da754c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "570dce86368bf911d0dbb7a6da754c0c");
        } else if (this.i != a.HIDE) {
            this.c.setVisibility(8);
            b();
            a(a.HIDE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb6cd5a4c2abafd263af8aaa1cd773d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb6cd5a4c2abafd263af8aaa1cd773d");
        } else if (this.t != null) {
            this.t.setVisibility(8);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2f26e5f57ddc136803d78f33fd906d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2f26e5f57ddc136803d78f33fd906d");
        } else if (this.t == null || this.s == 0) {
        } else {
            this.t.setLayoutResource(this.s);
            this.t.setVisibility(0);
        }
    }

    public final void a(BaseResponse baseResponse) {
        ErrorCode errorCode;
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865a9fab48b711cc6793f2535cb745ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865a9fab48b711cc6793f2535cb745ae");
        } else if (this.i != a.DATA_ERROR) {
            b();
            this.f.setVisibility(0);
            this.e.setVisibility(0);
            this.g.setVisibility(8);
            this.f.setText(this.j);
            this.e.setImageResource(this.k);
            if (baseResponse == null) {
                errorCode = new ErrorCode("E", "010");
            } else {
                errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, String.valueOf(baseResponse.code));
            }
            ErrorCode errorCode2 = com.sankuai.waimai.monitor.a.a(errorCode).b("10324").b;
            String buildErrorCodeStr = errorCode2.buildErrorCodeStr();
            this.h.setVisibility(0);
            this.h.setText(buildErrorCodeStr);
            String randomPageId = errorCode2.getRandomPageId();
            com.sankuai.waimai.platform.widget.emptylayout.c.a(d(), buildErrorCodeStr, randomPageId, new com.sankuai.waimai.platform.widget.emptylayout.b(true));
            i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_future_tabs_list_empty").b(buildErrorCodeStr).c("列表为空导致页面显示失败异常").d(a(buildErrorCodeStr, baseResponse, com.sankuai.waimai.platform.capacity.log.f.a().a("/home/feeds/tabs"), randomPageId)).b(true).b());
            a(this.d, this.o);
            this.c.setVisibility(0);
            a(a.DATA_ERROR);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df64ff51aebfff51647b1371768b457a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df64ff51aebfff51647b1371768b457a");
        } else if (this.i != a.PROGRESS) {
            e();
            this.f.setVisibility(8);
            this.e.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            a(this.d, this.n);
            this.c.setVisibility(0);
            a(a.PROGRESS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af236ef26765960758259a3419aaa8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af236ef26765960758259a3419aaa8d");
        }
        String str = this.q != null ? b.get(this.q) : null;
        if (TextUtils.isEmpty(str)) {
            str = com.sankuai.waimai.platform.bizdiagnosis.a.d(this.c.getContext());
            if (!TextUtils.isEmpty(str)) {
                str = str + "_page_error";
            }
        }
        return TextUtils.isEmpty(str) ? "NetInfo_page_error" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:7:0x0040, B:9:0x0054, B:12:0x0059, B:16:0x0067, B:23:0x0080, B:27:0x008e, B:26:0x008a, B:19:0x0071, B:22:0x0078, B:15:0x0063), top: B:31:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r12, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r13, com.sankuai.waimai.platform.capacity.log.e r14, java.lang.String r15) {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            r1 = 2
            r0[r1] = r14
            r1 = 3
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.home.list.future.f.a
            java.lang.String r11 = "6c8a8671fe9bb5be15b09c2c4ec2b87a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L27:
            java.util.Map r0 = com.sankuai.waimai.business.page.home.utils.p.a()
            com.sankuai.waimai.foundation.location.v2.g r1 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r1 = r1.k()
            com.sankuai.waimai.foundation.location.v2.g r3 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r3 = r3.j()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "request_param"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La0
            r4.put(r5, r0)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "api_code"
            r4.put(r0, r12)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "future_data_is_null"
            if (r13 == 0) goto L58
            D r13 = r13.data     // Catch: java.lang.Exception -> La0
            if (r13 != 0) goto L59
        L58:
            r8 = 1
        L59:
            r4.put(r12, r8)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "address"
            if (r1 != 0) goto L63
            java.lang.String r13 = ""
            goto L67
        L63:
            java.lang.String r13 = r1.getAddress()     // Catch: java.lang.Exception -> La0
        L67:
            r4.put(r12, r13)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "cityName"
            if (r1 != 0) goto L71
        L6e:
            java.lang.String r13 = ""
            goto L80
        L71:
            com.sankuai.waimai.foundation.location.v2.City r13 = r1.getMeitaunCity()     // Catch: java.lang.Exception -> La0
            if (r13 != 0) goto L78
            goto L6e
        L78:
            com.sankuai.waimai.foundation.location.v2.City r13 = r1.getMeitaunCity()     // Catch: java.lang.Exception -> La0
            java.lang.String r13 = r13.getCityName()     // Catch: java.lang.Exception -> La0
        L80:
            r4.put(r12, r13)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "actualAddress"
            if (r3 != 0) goto L8a
            java.lang.String r13 = ""
            goto L8e
        L8a:
            java.lang.String r13 = r3.getAddress()     // Catch: java.lang.Exception -> La0
        L8e:
            r4.put(r12, r13)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "api_record"
            java.lang.String r13 = com.sankuai.waimai.platform.widget.emptylayout.c.a(r14, r2)     // Catch: java.lang.Exception -> La0
            r4.put(r12, r13)     // Catch: java.lang.Exception -> La0
            java.lang.String r12 = "random_pageid"
            r4.put(r12, r15)     // Catch: java.lang.Exception -> La0
        La0:
            java.lang.String r12 = r4.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.f.a(java.lang.String, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse, com.sankuai.waimai.platform.capacity.log.e, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e683191005558fedcc9d8f1f96b12a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e683191005558fedcc9d8f1f96b12a22");
        } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(this.c.getContext(), i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        if (aVar != this.i) {
            this.i = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        INITIAL,
        HIDE,
        PROGRESS,
        DATA_ERROR,
        NET_ERROR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417558fa9634d1c217a5a63b559b7198", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417558fa9634d1c217a5a63b559b7198");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "761ce9b3ee04364548ab6bbb1d51b746", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "761ce9b3ee04364548ab6bbb1d51b746") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "030104204a347f6cc86e0a7f653bcde5", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "030104204a347f6cc86e0a7f653bcde5") : (a[]) values().clone();
        }
    }
}
