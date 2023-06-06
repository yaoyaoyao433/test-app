package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.widget.RoundRectImageView;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a<RoundRectImageView> {
    public static ChangeQuickRedirect i;
    private static Map<String, ImageView.ScaleType> k;
    boolean j;

    static {
        TreeMap treeMap = new TreeMap();
        k = treeMap;
        treeMap.put(DynamicTitleParser.PARSER_KEY_STRETCH, ImageView.ScaleType.FIT_XY);
        k.put("contain", ImageView.ScaleType.FIT_CENTER);
        k.put(DynamicTitleParser.PARSER_VAL_STRETCH_COVER, ImageView.ScaleType.CENTER_CROP);
        k.put("center", ImageView.ScaleType.CENTER_INSIDE);
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c23b2d8516da1e526e6551c4e015308", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c23b2d8516da1e526e6551c4e015308");
            return;
        }
        this.j = false;
        this.b = new RoundRectImageView(context);
    }

    public c(Context context, RoundRectImageView roundRectImageView) {
        super(context);
        Object[] objArr = {context, roundRectImageView};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c246e971d28d86c72c398274f22116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c246e971d28d86c72c398274f22116");
            return;
        }
        this.j = false;
        this.b = roundRectImageView;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e14b95c85e34a45ac4e32ad44c5a229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e14b95c85e34a45ac4e32ad44c5a229");
        } else if (jSONObject == null) {
        } else {
            super.a(jSONObject);
            String optString = jSONObject.optString(RaptorUploaderImpl.SRC, "");
            int optInt = jSONObject.optInt(ReactTextInputShadowNode.PROP_PLACEHOLDER, -1);
            if (optInt == -1) {
                if (!TextUtils.isEmpty(optString)) {
                    b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                    c.c = optString;
                    c.b(((RoundRectImageView) this.b).getLayoutParams().width).a((ImageView) this.b);
                }
            } else {
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.c = optString;
                c2.i = optInt;
                c2.j = optInt;
                c2.b(((RoundRectImageView) this.b).getLayoutParams().width).a((ImageView) this.b);
            }
            ImageView.ScaleType scaleType = k.get(jSONObject.optString("resize_mode", DynamicTitleParser.PARSER_VAL_STRETCH_COVER));
            RoundRectImageView roundRectImageView = (RoundRectImageView) this.b;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_XY;
            }
            roundRectImageView.setScaleType(scaleType);
            if (this.j && com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                ((RoundRectImageView) this.b).getLayoutParams().width = -1;
                ((RoundRectImageView) this.b).setScaleType(ImageView.ScaleType.FIT_END);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("radius");
            if (optJSONArray == null || optJSONArray.length() != 4) {
                return;
            }
            int a = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(0, 0));
            int a2 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(1, 0));
            int a3 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(2, 0));
            int a4 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(3, 0));
            RoundRectImageView roundRectImageView2 = (RoundRectImageView) this.b;
            Object[] objArr2 = {Integer.valueOf(a), Integer.valueOf(a2), Integer.valueOf(a4), Integer.valueOf(a3)};
            ChangeQuickRedirect changeQuickRedirect2 = RoundRectImageView.a;
            if (PatchProxy.isSupport(objArr2, roundRectImageView2, changeQuickRedirect2, false, "f9e2f525919fbefd498d77b9f542ce63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, roundRectImageView2, changeQuickRedirect2, false, "f9e2f525919fbefd498d77b9f542ce63");
                return;
            }
            roundRectImageView2.b = a;
            roundRectImageView2.c = a2;
            roundRectImageView2.d = a4;
            roundRectImageView2.e = a3;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46419cc87beccf17ce1a5a0b9c57eb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46419cc87beccf17ce1a5a0b9c57eb73");
            return;
        }
        super.b(jSONObject);
        if (jSONObject == null) {
            return;
        }
        try {
            String optString = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                a(8);
                return;
            }
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = optString;
            c.b(((RoundRectImageView) this.b).getLayoutParams().width).a((ImageView) this.b);
            a(0);
        } catch (Exception e) {
            throw new RuntimeException("ImageComponent data parse wrong", e);
        }
    }
}
