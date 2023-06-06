package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T extends View> {
    public static ChangeQuickRedirect a = null;
    private static float i = 0.5f;
    public T b;
    public Context c;
    protected ViewGroup.MarginLayoutParams d;
    protected a e;
    protected List<a> f;
    protected float g;
    protected float h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0838a {
        void a(int i, View view);
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b3e8f76b762f2639c2bb4b5d0914db0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b3e8f76b762f2639c2bb4b5d0914db0");
            return;
        }
        this.f = new ArrayList();
        this.c = context;
    }

    public static void a(float f) {
        i = f;
    }

    public final T a() {
        return this.b;
    }

    public void a(JSONObject jSONObject) {
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71768a17b284048b17b6dd7dc2f5f465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71768a17b284048b17b6dd7dc2f5f465");
        } else if (jSONObject == null || this.b == null) {
        } else {
            String optString = jSONObject.optString("component_id", "");
            this.b.setId(TextUtils.isEmpty(optString) ? View.generateViewId() : Math.abs(optString.hashCode()));
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "503a9eade61ebcaf86a64c109af17154", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "503a9eade61ebcaf86a64c109af17154");
            } else {
                int a2 = jSONObject.has("width") ? com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("width")) : -2;
                int a3 = jSONObject.has("height") ? com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("height")) : -2;
                this.b.setMinimumWidth(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("min_width", 0.0d)));
                this.b.setMinimumHeight(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("min_height", 0.0d)));
                if (this.b.getLayoutParams() == null) {
                    this.d = new ViewGroup.MarginLayoutParams(a2, a3);
                } else {
                    this.d = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                    this.d.width = a2;
                    this.d.height = a3;
                }
            }
            Object[] objArr3 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "811f315a71f6fa7e1f0143e006a45331", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "811f315a71f6fa7e1f0143e006a45331");
            } else {
                this.d.setMargins(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("margin_left", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("margin_top", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("margin_right", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("margin_bottom", 0.0d)));
            }
            Object[] objArr4 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6a26de81a1dc0670a3e96f4aca6fc917", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6a26de81a1dc0670a3e96f4aca6fc917");
            } else {
                this.b.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("padding_left", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("padding_top", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("padding_right", 0.0d)), com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("padding_bottom", 0.0d)));
            }
            Object[] objArr5 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "302930c55fc2101cdf18b3071b0fdc3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "302930c55fc2101cdf18b3071b0fdc3a");
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("radius");
                if (optJSONArray == null || optJSONArray.length() != 4) {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                } else {
                    int a4 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(0, 0));
                    int a5 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(1, 0));
                    i3 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(2, 0));
                    i2 = com.sankuai.waimai.foundation.utils.g.a(this.c, optJSONArray.optInt(3, 0));
                    i4 = a4;
                    i5 = a5;
                }
                if (jSONObject.has("background_color")) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(ColorUtils.a(jSONObject.optString("background_color"), 0));
                    float f = i4;
                    float f2 = i5;
                    float f3 = i3;
                    float f4 = i2;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
                    this.b.setBackground(gradientDrawable);
                }
                if (jSONObject.has("background_url")) {
                    String optString2 = jSONObject.optString("background_url");
                    b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                    c.b = this.c;
                    c.c = optString2;
                    c.a(new RoundAndCenterCropTransform(com.meituan.android.singleton.b.a, i4, i5, i3, i2)).a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7668c9206652f5192545d1205dfedb1d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7668c9206652f5192545d1205dfedb1d");
                            } else {
                                a.this.b.setBackground(new BitmapDrawable(a.this.c.getResources(), bitmap));
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b86ea64b2f10124e64394aacfb16aa32", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b86ea64b2f10124e64394aacfb16aa32");
                            } else {
                                a.this.b.setBackground(null);
                            }
                        }
                    });
                }
            }
            Object[] objArr6 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "35b470d3de0213dedb6e5536981a7a7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "35b470d3de0213dedb6e5536981a7a7c");
            } else {
                this.h = (float) jSONObject.optDouble("alpha", 1.0d);
                this.g = (float) jSONObject.optDouble("gray_alpha", i);
            }
            this.b.setLayoutParams(this.d);
        }
    }

    public void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8163f6bf22130b97d1fa46da5ef491d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8163f6bf22130b97d1fa46da5ef491d1");
        } else if (jSONObject == null || (this.b instanceof ViewGroup)) {
        } else {
            if (jSONObject.optBoolean("cover_show", false)) {
                this.b.setAlpha(this.g);
            } else {
                this.b.setAlpha(this.h);
            }
        }
    }

    public final List<a> b() {
        return this.f;
    }

    public final void b(a aVar) {
        this.e = aVar;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca77f43baec2eeb742b4b01bf47f54b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca77f43baec2eeb742b4b01bf47f54b")).intValue();
        }
        if (this.b != null) {
            return this.b.getId();
        }
        return 0;
    }

    public final void a(int i2) {
        a<T> aVar = this;
        while (true) {
            Object[] objArr = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "399cf423da7ceab3b0526d2089d2181e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "399cf423da7ceab3b0526d2089d2181e");
                return;
            } else if (aVar.b == null) {
                return;
            } else {
                aVar.b.setVisibility(i2);
                if (aVar.e == null) {
                    return;
                }
                aVar = aVar.e;
            }
        }
    }

    public final void a(final InterfaceC0838a interfaceC0838a) {
        Object[] objArr = {interfaceC0838a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04655c2613b7972a394869542a07214e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04655c2613b7972a394869542a07214e");
        } else if (this.b != null) {
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0a14d2dd5b1655a2dffb3fc0ba8f540", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0a14d2dd5b1655a2dffb3fc0ba8f540");
                    } else if (interfaceC0838a != null) {
                        interfaceC0838a.a(-1, a.this.b);
                    }
                }
            });
        }
    }

    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd889f1a5c51198d1359f9d2a92d66ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd889f1a5c51198d1359f9d2a92d66ce");
        } else if (aVar == null || aVar.b == null) {
        } else {
            this.f.add(aVar);
            if (this.b instanceof ViewGroup) {
                ((ViewGroup) this.b).addView(aVar.b);
                aVar.e = this;
            }
        }
    }
}
