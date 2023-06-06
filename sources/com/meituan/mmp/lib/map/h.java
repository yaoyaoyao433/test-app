package com.meituan.mmp.lib.map;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.mmp.lib.utils.be;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public final View a(Context context, final Marker marker, com.meituan.mmp.lib.widget.f fVar) {
        JSONObject jSONObject;
        Object[] objArr = {context, marker, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8ac98175bc55ccbe7d10d211b175b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8ac98175bc55ccbe7d10d211b175b7");
        }
        Object object = marker.getObject();
        String obj = object == null ? "" : object.toString();
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(obj);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (fVar != null && optJSONObject != null && !TextUtils.isEmpty(jSONObject.optString("customCallout"))) {
            String str = optJSONObject.optString("mapId") + CommonConstant.Symbol.UNDERLINE + jSONObject.optString("id");
            Object[] objArr2 = {str, marker, fVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e036da84eec6ea82668afb750512a9ac", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e036da84eec6ea82668afb750512a9ac");
            }
            com.meituan.mmp.lib.page.coverview.c cVar = (com.meituan.mmp.lib.page.coverview.c) fVar.a(str);
            cVar.f = new com.meituan.mmp.lib.api.coverview.b() { // from class: com.meituan.mmp.lib.map.h.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.coverview.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "213f382eb10e5fd8d800ef9c3f3386f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "213f382eb10e5fd8d800ef9c3f3386f6");
                    } else if (marker == null || !marker.isInfoWindowShown()) {
                    } else {
                        marker.refreshInfoWindow();
                    }
                }
            };
            be.a(cVar);
            return cVar;
        }
        return a(jSONObject.optString("callout"), context);
    }

    private View a(String str, Context context) {
        JSONObject jSONObject;
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ce08c7c24ceeea892a35968acb93d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ce08c7c24ceeea892a35968acb93d5");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int a2 = p.a(3.0f);
        linearLayout.setPadding(a2, a2, a2, a2);
        TextView textView = new TextView(context);
        String optString = jSONObject.optString("color");
        int parseColor = Color.parseColor(DiagnoseLog.COLOR_ERROR);
        if (!TextUtils.isEmpty(optString)) {
            parseColor = com.meituan.mmp.lib.utils.i.b(optString);
        }
        if (jSONObject.has("padding")) {
            int a3 = (int) p.a(jSONObject, "padding", 0.0f);
            textView.setPadding(a3, a3, a3, a3);
        }
        textView.setTextColor(parseColor);
        if (jSONObject.has("fontSize")) {
            textView.setTextSize(jSONObject.optInt("fontSize"));
        }
        if (jSONObject.has("content")) {
            textView.setText(jSONObject.optString("content"));
        }
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        if (jSONObject.has(TextAlign.LOWER_CASE_NAME)) {
            String optString2 = jSONObject.optString(TextAlign.LOWER_CASE_NAME, "");
            if (optString2.equals("left")) {
                textView.setGravity(3);
            } else if (optString2.equals("right")) {
                textView.setGravity(5);
            } else if (optString2.equals("center")) {
                textView.setGravity(17);
            }
        }
        linearLayout.addView(textView);
        com.meituan.mmp.lib.widget.internal.a aVar = new com.meituan.mmp.lib.widget.internal.a();
        if (jSONObject.has(BorderRadius.LOWER_CASE_NAME)) {
            aVar.b = jSONObject.optInt(BorderRadius.LOWER_CASE_NAME);
        }
        if (!TextUtils.isEmpty(jSONObject.optString("bgColor"))) {
            aVar.c.setColor(com.meituan.mmp.lib.utils.i.b(jSONObject.optString("bgColor", "#ffffff")));
        } else {
            aVar.c.setColor(-1);
        }
        linearLayout.setBackgroundDrawable(aVar);
        return linearLayout;
    }
}
