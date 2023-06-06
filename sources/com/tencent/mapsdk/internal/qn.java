package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qn extends UrlTileProvider {
    static int a = 0;
    private static final int c = 256;
    TileOverlayOptions b;

    public qn(TileOverlayOptions tileOverlayOptions) {
        super(256, 256);
        this.b = tileOverlayOptions;
        a = ql.a();
        if (this.b != null) {
            this.b.versionInfo(Integer.toString(a));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final URL getTileUrl(int i, int i2, int i3) {
        String sketchTileUrl = ((da) ((Cdo) ck.a(Cdo.class)).h()).sketchTileUrl(i, (int) ((Math.pow(2.0d, i3) - 1.0d) - i2), i3, a);
        try {
            if (TextUtils.isEmpty(sketchTileUrl)) {
                return null;
            }
            return new URL(sketchTileUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void b() {
        a = ql.a();
        if (this.b != null) {
            this.b.versionInfo(Integer.toString(a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return Integer.toString(a);
    }
}
