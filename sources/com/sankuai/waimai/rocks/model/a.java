package com.sankuai.waimai.rocks.model;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public a() {
    }

    public a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optInt("margin_left", 0);
            this.b = jSONObject.optInt("margin_right", 0);
            this.c = jSONObject.optInt("margin_top", 0);
            this.d = jSONObject.optInt("margin_bottom", 0);
            this.e = jSONObject.optInt("padding_left", 0);
            this.f = jSONObject.optInt("padding_right", 0);
            this.g = jSONObject.optInt("padding_top", 0);
            this.h = jSONObject.optInt("padding_bottom", 0);
            this.i = jSONObject.optInt("horz_space", 0);
            this.j = jSONObject.optInt("vertical_space", 0);
            this.k = jSONObject.optInt("header_margin_bottom", 0);
            this.l = jSONObject.optInt("corner_radius", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
