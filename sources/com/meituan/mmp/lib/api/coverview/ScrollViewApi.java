package com.meituan.mmp.lib.api.coverview;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScrollViewApi extends NativeViewApi<a> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "viewId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ a b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e09d68e77dbebd0b05fc7c2216cfdd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e09d68e77dbebd0b05fc7c2216cfdd") : new a(getContext());
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee168e0f5a7f9c33fe141fe887bbfc1f", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee168e0f5a7f9c33fe141fe887bbfc1f") : new String[]{"insertScrollView", "removeScrollView", "updateScrollView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2bbdf189c2414959c6f91d973be6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2bbdf189c2414959c6f91d973be6fb");
        } else if ("insertScrollView".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83bd33b4eae754d38c74e30651b94c4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83bd33b4eae754d38c74e30651b94c4d");
                return;
            }
            a d = d(jSONObject, iApiCallback);
            if (d != null) {
                a(d, jSONObject.optJSONObject("style"));
                a(d, jSONObject, d(jSONObject));
                iApiCallback.onSuccess(null);
            }
        } else if ("removeScrollView".equals(str)) {
            a(jSONObject, iApiCallback);
        } else if ("updateScrollView".equals(str)) {
            Object[] objArr3 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39b7f59f5a674bf0df09039c8b01514e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39b7f59f5a674bf0df09039c8b01514e");
                return;
            }
            String d2 = d(jSONObject);
            CoverViewWrapper c = c(jSONObject, iApiCallback);
            if (c != null) {
                a aVar = (a) c.b(a.class);
                if (aVar == null) {
                    iApiCallback.onFail(a("view not found!", new Object[0]));
                    return;
                }
                a(aVar, jSONObject.optJSONObject("style"));
                a(jSONObject, d2);
                a(aVar, jSONObject, d2);
                iApiCallback.onSuccess(null);
            }
        }
    }

    private void a(final a aVar, JSONObject jSONObject, final String str) {
        Object[] objArr = {aVar, jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5539d5ace3d1e68ec9f634d53d905bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5539d5ace3d1e68ec9f634d53d905bb8");
            return;
        }
        final int a = a(jSONObject);
        if (jSONObject.has("needScrollEvent")) {
            if (jSONObject.optBoolean("needScrollEvent", false)) {
                aVar.c = new f() { // from class: com.meituan.mmp.lib.api.coverview.ScrollViewApi.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.api.coverview.f
                    public final void a(View view, int i, int i2) {
                        JSONObject jSONObject2;
                        Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a77aedff5c972c543fdb07969e623980", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a77aedff5c972c543fdb07969e623980");
                            return;
                        }
                        try {
                            jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("id", str);
                                jSONObject2.put("scrollLeft", (int) p.b(i));
                                jSONObject2.put("scrollTop", (int) p.b(i2));
                                jSONObject2.put("scrollWidth", (int) p.b(view.getWidth()));
                                jSONObject2.put("scrollHeight", (int) p.b(view.getHeight()));
                            } catch (JSONException unused) {
                            }
                        } catch (JSONException unused2) {
                            jSONObject2 = null;
                        }
                        ScrollViewApi.this.d.a("onScrollViewScroll", jSONObject2, a);
                    }
                };
            } else {
                aVar.c = null;
            }
        }
        if (jSONObject.has("scrollX")) {
            aVar.setScrollHorizontal(jSONObject.optBoolean("scrollX", true));
        }
        if (jSONObject.has("scrollY")) {
            aVar.setScrollVertical(jSONObject.optBoolean("scrollY", true));
        }
        if (jSONObject.has("scrollTop")) {
            final int a2 = p.a((float) jSONObject.optDouble("scrollTop", 0.0d));
            aVar.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.coverview.ScrollViewApi.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "317010a2980169558778d98bf068fd55", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "317010a2980169558778d98bf068fd55");
                    } else {
                        aVar.scrollTo(aVar.getScrollX(), a2);
                    }
                }
            }, 100L);
        }
    }

    private void a(a aVar, JSONObject jSONObject) {
        Object[] objArr = {aVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65815b5e60daa9042239d2995180ae0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65815b5e60daa9042239d2995180ae0a");
        } else if (aVar == null || jSONObject == null) {
        } else {
            String optString = jSONObject.optString("bgColor");
            if (!TextUtils.isEmpty(optString)) {
                aVar.setBgColor(i.b(optString));
            }
            String optString2 = jSONObject.optString("borderColor");
            if (!TextUtils.isEmpty(optString2)) {
                aVar.setColor(i.b(optString2));
            }
            aVar.setBorderRadius(p.a((float) jSONObject.optDouble(BorderRadius.LOWER_CASE_NAME, 0.0d)));
            aVar.setBorderWidth(p.a((float) jSONObject.optDouble("borderWidth", 0.0d)));
            try {
                float f = (float) jSONObject.getDouble("opacity");
                if (f >= 0.0f && f <= 1.0f) {
                    aVar.setAlpha(f);
                }
            } catch (JSONException unused) {
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("padding");
            if (optJSONArray != null && optJSONArray.length() == 4) {
                aVar.setPadding((int) p.a(optJSONArray, 0), (int) p.a(optJSONArray, 1), (int) p.a(optJSONArray, 2), (int) p.a(optJSONArray, 3));
            }
            float optDouble = (float) jSONObject.optDouble(AnimationViewCommandModel.Rotation, 0.0d);
            float optDouble2 = (float) jSONObject.optDouble(RecceAnimUtils.SCALE_X, 1.0d);
            float optDouble3 = (float) jSONObject.optDouble(RecceAnimUtils.SCALE_Y, 1.0d);
            if (jSONObject.has(AnimationViewCommandModel.Rotation)) {
                aVar.setRotation(optDouble);
            }
            if (jSONObject.has(RecceAnimUtils.SCALE_X)) {
                aVar.setScaleX(optDouble2);
            }
            if (jSONObject.has(RecceAnimUtils.SCALE_Y)) {
                aVar.setScaleY(optDouble3);
            }
            aVar.invalidate();
        }
    }
}
