package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ss implements ns {
    private Context c;
    private final float d;
    private String e;
    private String f;

    @Override // com.tencent.mapsdk.internal.ns
    public final String a() {
        return null;
    }

    public ss(Context context, String str) {
        this.c = context.getApplicationContext();
        this.d = hc.a(this.c);
        this.e = str;
    }

    @Override // com.tencent.mapsdk.internal.ns
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("../")) {
            str = str.replaceAll("\\.\\./", "");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
    }

    private Bitmap b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InputStream b = kd.b(mi.a(this.c, (TencentMapOptions) null).a(this.e) + str);
        if (b == null) {
            b = kd.b(mi.a(this.c, (TencentMapOptions) null).b(this.e) + str);
        }
        if (b == null) {
            b = kd.b(mi.a(this.c, (TencentMapOptions) null).e() + str);
        }
        if (b == null && this.f != null) {
            b = kd.a(new File(this.f, str));
        }
        if (b == null) {
            if (mf.a() != null) {
                Context context = this.c;
                b = mf.b(context, mf.a() + str);
            } else if (mf.b() != null) {
                b = kd.b(mf.b() + str);
            }
        }
        if (b == null) {
            b = mf.a(this.c, str);
        }
        if (b == null) {
            b = mf.b(this.c, str);
        }
        if (b == null) {
            return null;
        }
        Bitmap a = com.sankuai.waimai.launcher.util.image.a.a(b);
        kd.a((Closeable) b);
        return a;
    }

    @Override // com.tencent.mapsdk.internal.ns
    public final void a(String str, IconImageInfo iconImageInfo) {
        Bitmap a = gx.b.a(str);
        if (a == null) {
            a = gx.b.a(str);
        }
        iconImageInfo.bitmap = a;
        if (str.endsWith(eh.s) || str.contains("@2x")) {
            iconImageInfo.scale = 2.0f;
        } else if (str.endsWith("@3x.png") || str.contains("@3x")) {
            iconImageInfo.scale = 3.0f;
        } else {
            iconImageInfo.scale = this.d;
        }
        if (this.c != null && a == null) {
            try {
                if (str.startsWith("poi_icon") || str.startsWith(eh.r)) {
                    a = b(hb.b(str) + eh.s);
                }
                if (a != null) {
                    iconImageInfo.bitmap = a;
                    iconImageInfo.scale = 2.0f;
                    return;
                }
                iconImageInfo.bitmap = b(str);
                if (!str.equals(ns.a) && !str.equals(ns.b)) {
                    iconImageInfo.scale = 1.0f;
                    return;
                }
                iconImageInfo.scale = this.d;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
    }
}
