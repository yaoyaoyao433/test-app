package com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.j;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ImageView e;
    j f;
    String g;
    String h;
    String i;
    String j;
    private Space k;
    private boolean l;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_operation_area_view;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a9d6287854730169a972b32b0e47a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a9d6287854730169a972b32b0e47a2");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ccf58240ab0f19c40de03527e861f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ccf58240ab0f19c40de03527e861f2f");
            return;
        }
        super.b();
        this.e = (ImageView) this.b.findViewById(R.id.img_order_detail_banner);
        this.k = (Space) this.b.findViewById(R.id.space_operation);
        this.k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3513512d2bca37a61b8146098df3640e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3513512d2bca37a61b8146098df3640e");
            return;
        }
        this.g = null;
        this.h = null;
        this.i = null;
        if (this.f == null || TextUtils.isEmpty(this.f.a) || TextUtils.isEmpty(this.f.c)) {
            this.e.setVisibility(8);
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.e.setVisibility(0);
        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a.b = this.c;
        a.c = this.f.a;
        b.C0608b b = a.b(g.a(this.c));
        b.f = ImageQualityUtil.a();
        b.a(new RoundAndCenterCropTransform(this.c.getApplicationContext(), 6)).a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ad1ae3608495042d73da27f76e1ab63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ad1ae3608495042d73da27f76e1ab63");
                } else if (bitmap != null) {
                    e.this.e.setImageBitmap(bitmap);
                }
            }
        });
        Uri a2 = a(this.f.c);
        if (a2 != null) {
            this.g = a2.getQueryParameter("activity_id");
            this.h = a2.getQueryParameter("ys");
            this.i = a2.getQueryParameter("ys_id");
            this.j = a2.getQueryParameter("activity_type");
            if (!this.l) {
                this.l = true;
                JudasManualManager.b("b_vkHii").a("activity_id", this.g).a("ys", this.h).a("ys_id", this.i).a("index", 0).a("activity_type", this.j == null ? "0" : this.j).a("c_hgowsqb").a(this.c).a();
            }
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Map map;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7db9ae7fd4c45b31309b5d911ca491eb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7db9ae7fd4c45b31309b5d911ca491eb");
                } else if (e.this.f == null) {
                } else {
                    String str = e.this.i;
                    Object[] objArr3 = {"b_A7OTp", str, 0};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.utils.c.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ca11af25698fd9565e0432308c409124", RobustBitConfig.DEFAULT_VALUE)) {
                        map = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ca11af25698fd9565e0432308c409124");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("entry_id", "b_A7OTp");
                        hashMap.put("entry_item_id", str);
                        hashMap.put("entry_index", "0");
                        map = hashMap;
                    }
                    i.a(e.this.f.b, e.this.f.c, (Activity) e.this.c, map);
                    if (TextUtils.isEmpty(e.this.g) && TextUtils.isEmpty(e.this.h) && TextUtils.isEmpty(e.this.i)) {
                        return;
                    }
                    JudasManualManager.a("b_A7OTp").a("activity_id", e.this.g).a("ys", e.this.h).a("ys_id", e.this.i).a("index", 0).a("activity_type", e.this.j).a("c_hgowsqb").a(e.this.c).a();
                }
            }
        });
    }

    private Uri a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a38489d3d7024dfd8288c2a47331e6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a38489d3d7024dfd8288c2a47331e6c");
        }
        Uri parse = Uri.parse(str);
        if (str.contains("inner_url") || str.contains("activity_id")) {
            if (str.contains("inner_url")) {
                return Uri.parse(parse.getQueryParameter("inner_url"));
            }
            if (str.contains("activity_id")) {
                return parse;
            }
            return null;
        }
        return null;
    }
}
