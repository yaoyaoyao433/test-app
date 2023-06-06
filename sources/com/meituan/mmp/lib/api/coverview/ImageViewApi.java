package com.meituan.mmp.lib.api.coverview;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageViewApi extends NativeViewApi<g> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "viewId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ g b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e510b54b9cb10fcb332ad54f491ad95f", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e510b54b9cb10fcb332ad54f491ad95f");
        }
        g gVar = new g(getContext());
        gVar.setScaleType(ImageView.ScaleType.FIT_XY);
        return gVar;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66a7d61bd69ade7545c539c0d5b9c8d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66a7d61bd69ade7545c539c0d5b9c8d") : new String[]{"insertImageView", "removeImageView", "updateImageView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e9450c772c952fe32f3727c0476dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e9450c772c952fe32f3727c0476dab");
        } else if ("insertImageView".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64ca754979bcb1d317f72b0ae4eb87c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64ca754979bcb1d317f72b0ae4eb87c0");
            } else {
                g gVar = (g) super.d(jSONObject, iApiCallback);
                if (gVar != null) {
                    a(jSONObject, d(jSONObject), a(jSONObject), (CoverViewWrapper) gVar.getParent(), gVar);
                    iApiCallback.onSuccess(null);
                }
            }
            b(jSONObject, iApiCallback);
        } else if ("removeImageView".equals(str)) {
            a(jSONObject, iApiCallback);
        } else if ("updateImageView".equals(str)) {
            Object[] objArr3 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56adf0b897e339582978eadb63f8fa61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56adf0b897e339582978eadb63f8fa61");
            } else {
                String d = d(jSONObject);
                int a = a(jSONObject);
                CoverViewWrapper c = c(jSONObject, iApiCallback);
                if (c != null) {
                    ImageView imageView = (ImageView) c.b(ImageView.class);
                    if (imageView == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                    } else {
                        a(jSONObject, d);
                        a(jSONObject, d, a, c, imageView);
                        iApiCallback.onSuccess(null);
                    }
                }
            }
            b(jSONObject, iApiCallback);
        }
    }

    private void a(JSONObject jSONObject, final String str, final int i, CoverViewWrapper coverViewWrapper, ImageView imageView) {
        Object[] objArr = {jSONObject, str, Integer.valueOf(i), coverViewWrapper, imageView};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fbbbbe2853f3b7cc3c6aea33a9a0d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fbbbbe2853f3b7cc3c6aea33a9a0d98");
            return;
        }
        coverViewWrapper.a(jSONObject.optJSONObject("style"));
        final JSONObject optJSONObject = jSONObject.optJSONObject("data");
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("gesture", false);
        if (jSONObject.has("gesture")) {
            if (imageView.getTag("mmp_touch".hashCode()) != null) {
                d dVar = (d) imageView.getTag("mmp_touch".hashCode());
                if (optBoolean2 != dVar.b) {
                    dVar.b = optBoolean2;
                }
            } else if (optBoolean2) {
                d dVar2 = new d(str, i, this.d, ViewConfiguration.get(getContext()).getScaledTouchSlop());
                imageView.setTag("mmp_touch".hashCode(), dVar2);
                imageView.setOnTouchListener(dVar2);
            }
        }
        if (jSONObject.has("clickable")) {
            imageView.setOnClickListener(null);
        }
        if (!optBoolean2 && optBoolean) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.coverview.ImageViewApi.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JSONObject jSONObject2;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00b01493f20e8b23e1481b827916dcc2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00b01493f20e8b23e1481b827916dcc2");
                        return;
                    }
                    try {
                        jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("id", str);
                            jSONObject2.put("data", optJSONObject);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    ImageViewApi.this.d.a("onImageViewClick", jSONObject2, i);
                }
            });
        }
        RequestCreator c = s.c(getContext(), jSONObject.optString("iconPath"), getAppConfig());
        if (c != null) {
            if (coverViewWrapper.getLayoutParams().height > 0 && coverViewWrapper.getLayoutParams().width > 0) {
                c.a(coverViewWrapper.getLayoutParams().width, coverViewWrapper.getLayoutParams().height);
            } else {
                c.d();
            }
            c.g().a(imageView, new Callback() { // from class: com.meituan.mmp.lib.api.coverview.ImageViewApi.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Callback
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ddddda750f2a8c9e8696c3dd3e444e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ddddda750f2a8c9e8696c3dd3e444e7");
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("status", "success");
                        jSONObject2.put("viewId", str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ImageViewApi.this.d.a("imageLoadEvent", jSONObject2, i);
                }

                @Override // com.squareup.picasso.Callback
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35a3219a3ad5dadcae70ab0c951b01d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35a3219a3ad5dadcae70ab0c951b01d1");
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("status", "error");
                        jSONObject2.put("viewId", str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ImageViewApi.this.d.a("imageLoadEvent", jSONObject2, i);
                }
            });
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", "error");
            jSONObject2.put("viewId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.d.a("imageLoadEvent", jSONObject2, i);
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        b coverUpdateObserver;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7644114b2f075522f3ec499c1ae8320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7644114b2f075522f3ec499c1ae8320");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c != null) {
            ImageView imageView = (ImageView) c.b(ImageView.class);
            ((ViewGroup) c.getParent()).removeView(c);
            if ((imageView instanceof g) && (coverUpdateObserver = ((g) imageView).getCoverUpdateObserver()) != null) {
                coverUpdateObserver.a();
            }
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail(a("view not found!", new Object[0]));
    }

    private void b(JSONObject jSONObject, IApiCallback iApiCallback) {
        ImageView imageView;
        b coverUpdateObserver;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce735a85235530e712422b690f4f9a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce735a85235530e712422b690f4f9a5");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null || (imageView = (ImageView) c.b(ImageView.class)) == null || !(imageView instanceof g) || (coverUpdateObserver = ((g) imageView).getCoverUpdateObserver()) == null) {
            return;
        }
        coverUpdateObserver.a();
    }
}
