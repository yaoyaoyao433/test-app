package com.facebook.react.views.text.glidesupport;

import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.image.c;
import com.facebook.react.views.text.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.o;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.metrics.common.Constants;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GlideBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {
    private float a = Float.NaN;
    private float b = Float.NaN;
    private c c;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = RaptorUploaderImpl.SRC)
    public void setSource(@Nullable ReadableArray readableArray) {
        if (this.c == null) {
            this.c = new c(getThemedContext());
        }
        if (readableArray == null || readableArray.size() <= 0) {
            return;
        }
        ReadableMap map = readableArray.getMap(0);
        String string = map.hasKey(Constants.TRAFFIC_URI) ? map.getString(Constants.TRAFFIC_URI) : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.c.a(string);
        if (map.hasKey("width")) {
            this.c.b = (int) w.a(map.getDouble("width"));
        }
        if (map.hasKey("height")) {
            this.c.c = (int) w.a(map.getDouble("height"));
        }
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.a = w.a(dynamic.asDouble());
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.b = w.a(dynamic.asDouble());
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    @Override // com.facebook.react.views.text.ReactTextInlineImageShadowNode
    public final o a() {
        return new a(getThemedContext(), this.c, (int) Math.ceil(this.a), (int) Math.ceil(this.b));
    }
}
