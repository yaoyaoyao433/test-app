package com.tencent.mapsdk.internal;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ru extends JsonComposer {
    @Json(name = "name")
    public String a;
    @Json(name = "style")
    public int b;
    @Json(name = KnbConstants.PARAMS_SCENE)
    public int c;
    @Json(name = "version")
    public int d;
    @Json(name = "url")
    public String e;
    @Json(name = "range")
    public int[] f;

    private String a() {
        return this.a;
    }

    private int b() {
        return this.b;
    }

    private int c() {
        return this.c;
    }

    private int d() {
        return this.d;
    }

    private String e() {
        return this.e;
    }

    private int[] f() {
        return this.f;
    }

    private void a(String str) {
        this.a = str;
    }

    private void a(int i) {
        this.b = i;
    }

    private void b(int i) {
        this.c = i;
    }

    private void c(int i) {
        this.d = i;
    }

    private void b(String str) {
        this.e = str;
    }

    private void a(int[] iArr) {
        this.f = iArr;
    }

    private String a(int i, int i2, int i3, String str) {
        String replaceFirst;
        String str2 = this.e;
        int[] iArr = this.f;
        if (iArr.length == 0) {
            replaceFirst = str2.replaceFirst("\\{range\\}", "");
        } else {
            replaceFirst = str2.replaceFirst("\\{range\\}", Integer.toString(a(i + i2, iArr.length)));
        }
        return replaceFirst.replaceFirst("\\{z\\}", Integer.toString(i3)).replaceFirst("\\{x\\}", Integer.toString(i)).replaceFirst("\\{y\\}", Integer.toString(i2)).replaceFirst("\\{style\\}", Integer.toString(this.b)).replaceFirst("\\{scene\\}", Integer.toString(this.c)).replaceFirst("\\{version\\}", Integer.toString(this.d)).replaceFirst("\\{ch\\}", str);
    }

    public static int a(int i, int i2) {
        int i3 = i % i2;
        return i3 * i2 < 0 ? i3 + i2 : i3;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("WorldMapTileSrc{");
        stringBuffer.append("mName='");
        stringBuffer.append(this.a);
        stringBuffer.append('\'');
        stringBuffer.append(", mStyle=");
        stringBuffer.append(this.b);
        stringBuffer.append(", mScene=");
        stringBuffer.append(this.c);
        stringBuffer.append(", mVersion=");
        stringBuffer.append(this.d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.e);
        stringBuffer.append('\'');
        stringBuffer.append(", mRanges=");
        if (this.f == null) {
            stringBuffer.append(StringUtil.NULL);
        } else {
            stringBuffer.append('[');
            int i = 0;
            while (i < this.f.length) {
                stringBuffer.append(i == 0 ? "" : ", ");
                stringBuffer.append(this.f[i]);
                i++;
            }
            stringBuffer.append(']');
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
