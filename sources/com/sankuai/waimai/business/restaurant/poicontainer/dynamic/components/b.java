package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.widget.RoundRectImageView;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a> {
    public static ChangeQuickRedirect i;
    private static Map<Integer, Integer> j;
    private c k;
    private h l;
    private c m;
    private c n;
    private c o;
    private g p;

    static {
        TreeMap treeMap = new TreeMap();
        j = treeMap;
        treeMap.put(0, 51);
        j.put(1, 53);
        j.put(2, 85);
        j.put(3, 83);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c246ba198da7bb46be91193f030ae4b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c246ba198da7bb46be91193f030ae4b1");
            return;
        }
        this.b = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a(context);
        this.m = new c(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getFoodImage());
        this.l = new h(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getImageContainer());
        this.k = new c(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getTagIconImage());
        this.k.j = true;
        this.n = new c(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getVideoIconImage());
        this.o = new c(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getShadowImage());
        this.p = new g(context, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.a) this.b).getLabelText());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        r0 = new android.widget.FrameLayout.LayoutParams(r13.k.a().getLayoutParams());
        r0.gravity = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.j.get(java.lang.Integer.valueOf(r9)).intValue();
        r13.k.a().setLayoutParams(r0);
     */
    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.json.JSONObject r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.i
            java.lang.String r11 = "85d86ac03fc4ac85a2c308a966f97bfa"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r9, r11)
            return
        L1b:
            super.a(r14)
            java.lang.String r1 = "tag_icon"
            org.json.JSONObject r1 = r14.optJSONObject(r1)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.i
            java.lang.String r12 = "d8deecd0ee5fc463cb533d5786ed594a"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r13
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3e
            com.meituan.robust.PatchProxy.accessDispatch(r10, r13, r11, r9, r12)
            goto L9b
        L3e:
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r2 = r13.k
            java.lang.String r3 = "style"
            org.json.JSONObject r3 = r1.optJSONObject(r3)
            r2.a(r3)
            java.lang.String r2 = "position"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch: org.json.JSONException -> L97
        L51:
            int r2 = r1.length()     // Catch: org.json.JSONException -> L97
            if (r9 >= r2) goto L9b
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.j     // Catch: org.json.JSONException -> L97
            int r2 = r2.size()     // Catch: org.json.JSONException -> L97
            if (r9 >= r2) goto L94
            int r2 = r1.getInt(r9)     // Catch: org.json.JSONException -> L97
            if (r2 != r0) goto L94
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: org.json.JSONException -> L97
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r1 = r13.k     // Catch: org.json.JSONException -> L97
            android.view.View r1 = r1.a()     // Catch: org.json.JSONException -> L97
            com.sankuai.waimai.platform.widget.RoundRectImageView r1 = (com.sankuai.waimai.platform.widget.RoundRectImageView) r1     // Catch: org.json.JSONException -> L97
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: org.json.JSONException -> L97
            r0.<init>(r1)     // Catch: org.json.JSONException -> L97
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.j     // Catch: org.json.JSONException -> L97
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: org.json.JSONException -> L97
            java.lang.Object r1 = r1.get(r2)     // Catch: org.json.JSONException -> L97
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: org.json.JSONException -> L97
            int r1 = r1.intValue()     // Catch: org.json.JSONException -> L97
            r0.gravity = r1     // Catch: org.json.JSONException -> L97
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r1 = r13.k     // Catch: org.json.JSONException -> L97
            android.view.View r1 = r1.a()     // Catch: org.json.JSONException -> L97
            com.sankuai.waimai.platform.widget.RoundRectImageView r1 = (com.sankuai.waimai.platform.widget.RoundRectImageView) r1     // Catch: org.json.JSONException -> L97
            r1.setLayoutParams(r0)     // Catch: org.json.JSONException -> L97
            goto L9b
        L94:
            int r9 = r9 + 1
            goto L51
        L97:
            r0 = move-exception
            r0.printStackTrace()
        L9b:
            java.lang.String r0 = "food_image"
            org.json.JSONObject r14 = r14.optJSONObject(r0)
            if (r14 == 0) goto Ld8
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.h r0 = r13.l
            r0.a(r14)
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r0 = r13.m
            java.lang.String r1 = "food"
            org.json.JSONObject r1 = r14.optJSONObject(r1)
            r0.a(r1)
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r0 = r13.n
            java.lang.String r1 = "video_icon"
            org.json.JSONObject r1 = r14.optJSONObject(r1)
            r0.a(r1)
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c r0 = r13.o
            java.lang.String r1 = "cover"
            org.json.JSONObject r1 = r14.optJSONObject(r1)
            r0.a(r1)
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.g r0 = r13.p
            java.lang.String r1 = "label"
            org.json.JSONObject r14 = r14.optJSONObject(r1)
            r0.a(r14)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.a(org.json.JSONObject):void");
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        int i2 = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f59f5f1ffa315dae7cd7df4d067b419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f59f5f1ffa315dae7cd7df4d067b419");
            return;
        }
        super.b(jSONObject);
        if (jSONObject == null) {
            this.m.a().setImageResource(R.drawable.wm_common_good_img_default);
            return;
        }
        try {
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = jSONObject.optString("img_url");
            c.f = ImageQualityUtil.b();
            c.l = true;
            c.k = 4;
            b.C0608b b = c.b(this.m.a().getLayoutParams().width);
            b.i = R.drawable.wm_common_good_img_default;
            b.C0608b a = b.a(new b.d() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d69c16c073063ce0fa531991ce8c2e40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d69c16c073063ce0fa531991ce8c2e40");
                    } else {
                        com.sankuai.waimai.business.restaurant.base.log.c.e();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i3, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i3), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb9bc19fda53768cec0a2efc74f9a40b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb9bc19fda53768cec0a2efc74f9a40b");
                    } else {
                        com.sankuai.waimai.business.restaurant.base.log.c.b(i3, com.sankuai.waimai.business.restaurant.base.log.b.a(exc));
                    }
                }
            });
            a.j = R.drawable.wm_common_good_img_default;
            a.a((ImageView) this.m.a());
            a(this.k.a(), jSONObject.optString("tag_icon_url"));
            a(this.n.a(), jSONObject.optString("video_icon_url"));
            boolean optBoolean = jSONObject.optBoolean("cover_show", false);
            RoundRectImageView a2 = this.o.a();
            if (!optBoolean) {
                i2 = 8;
            }
            a2.setVisibility(i2);
            if (optBoolean) {
                this.k.a().setAlpha(this.g);
            } else {
                this.k.a().setAlpha(this.h);
            }
            ah.a(this.p.a(), jSONObject.optString("label_text"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf011f65cb3985c2b87e6de533ae0cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf011f65cb3985c2b87e6de533ae0cc");
        } else if (TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = str;
            c.b(imageView.getLayoutParams().width).a(imageView);
        }
    }
}
