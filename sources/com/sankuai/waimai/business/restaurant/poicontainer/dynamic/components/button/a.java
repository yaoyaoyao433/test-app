package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.g;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.h;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a<RelativeLayout> {
    public static ChangeQuickRedirect i;
    public final ImageView j;
    public final ImageView k;
    final h l;
    final h m;
    private final g n;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0839a {
        void a(View view);

        void b(View view);
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b882e142fca89650fd9d9dc4c8c17f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b882e142fca89650fd9d9dc4c8c17f");
            return;
        }
        if (d.a(context)) {
            this.b = (RelativeLayout) e.a(context, R.layout.wm_restaurant_dy_add_dec_btn);
        } else {
            this.b = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.wm_restaurant_dy_add_dec_btn, (ViewGroup) null);
        }
        this.j = (ImageView) ((RelativeLayout) this.b).findViewById(R.id.img_foodCount_add);
        this.k = (ImageView) ((RelativeLayout) this.b).findViewById(R.id.img_foodCount_dec);
        this.n = new g(context, (TextView) ((RelativeLayout) this.b).findViewById(R.id.txt_foodCount_number));
        this.l = new h(context, (FrameLayout) ((RelativeLayout) this.b).findViewById(R.id.img_foodCount_add_delegate));
        this.m = new h(context, (FrameLayout) ((RelativeLayout) this.b).findViewById(R.id.img_foodCount_dec_delegate));
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5299517bd2852821afe908f4f838639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5299517bd2852821afe908f4f838639");
            return;
        }
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67e9994928631edce0d9e2fe751e5282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67e9994928631edce0d9e2fe751e5282");
        } else if (jSONObject != null) {
            try {
                jSONObject.put("width", 90);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
        super.a(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.n.a(jSONObject.optJSONObject("choose_text"));
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c38081fdc60721e6cd9f26e47781cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c38081fdc60721e6cd9f26e47781cb");
            return;
        }
        super.b(jSONObject);
        if (jSONObject == null) {
            a(8);
            return;
        }
        int optInt = jSONObject.optInt("ordered_goods_num");
        int optInt2 = jSONObject.optInt("real_stock");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("text", optInt);
        this.n.b(jSONObject2);
        if (optInt > 0) {
            if (optInt >= optInt2 && optInt2 != -1) {
                this.j.setEnabled(false);
            } else {
                this.j.setEnabled(true);
            }
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            this.m.a().setImportantForAccessibility(1);
            this.n.a().setContentDescription("已添加" + optInt + "份");
            this.n.a(0);
        } else {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
            this.m.a().setImportantForAccessibility(2);
            this.n.a(8);
        }
        a(0);
    }
}
