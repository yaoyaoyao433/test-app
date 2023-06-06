package com.tencent.mapsdk.engine.jni.models;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class IconImageInfo {
    public float anchorPointX1;
    public float anchorPointY1;
    public Bitmap bitmap;
    public float scale;

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("IconImageInfo{");
        stringBuffer.append("bitmap=");
        if (this.bitmap != null) {
            str = this.bitmap.getWidth() + CommonConstant.Symbol.COLON + this.bitmap.getHeight();
        } else {
            str = null;
        }
        stringBuffer.append(str);
        stringBuffer.append(", scale=");
        stringBuffer.append(this.scale);
        stringBuffer.append(", anchorPointX1=");
        stringBuffer.append(this.anchorPointX1);
        stringBuffer.append(", anchorPointY1=");
        stringBuffer.append(this.anchorPointY1);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
