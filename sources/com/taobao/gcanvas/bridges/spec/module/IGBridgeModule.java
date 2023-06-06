package com.taobao.gcanvas.bridges.spec.module;

import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IGBridgeModule<JSCallback> {
    void disable(String str);

    String enable(JSONObject jSONObject);

    String extendCallNative(String str, String str2, int i);

    void preLoadImage(JSONArray jSONArray, JSCallback jscallback);

    void render(String str, String str2);

    void setContextType(String str, ContextType contextType);

    void setDevicePixelRatio(String str, double d);

    void setLogLevel(int i);

    void texImage2D(String str, int i, int i2, int i3, int i4, int i5, String str2);

    void texSubImage2D(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum ContextType {
        _2D(0),
        _3D(1);
        
        private int value;

        ContextType(int i) {
            this.value = i;
        }

        public final int value() {
            return this.value;
        }
    }
}
