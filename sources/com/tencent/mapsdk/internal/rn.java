package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.util.Log;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rn extends OverSeaTileProvider {
    private ru a;
    private gs b;
    private Language c;
    private OverSeaSource d;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider
    public final Bitmap getLogo(boolean z) {
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final NetResponse requestTileData(String str) {
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        byte[] bArr = doGet != null ? doGet.data : null;
        if (bArr != null && bArr.length != 0 && this.b != null) {
            switch (this.d) {
                case DEFAULT:
                    this.b.b().a++;
                    break;
                case SPARE:
                    this.b.b().b++;
                    break;
            }
        }
        return doGet;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public final URL getTileUrl(int i, int i2, int i3) {
        String replaceFirst;
        ru ruVar = this.a;
        String name = this.c.name();
        String str = ruVar.e;
        int[] iArr = ruVar.f;
        if (iArr.length == 0) {
            replaceFirst = str.replaceFirst("\\{range\\}", "");
        } else {
            replaceFirst = str.replaceFirst("\\{range\\}", Integer.toString(ru.a(i + i2, iArr.length)));
        }
        String replaceFirst2 = replaceFirst.replaceFirst("\\{z\\}", Integer.toString(i3)).replaceFirst("\\{x\\}", Integer.toString(i)).replaceFirst("\\{y\\}", Integer.toString(i2)).replaceFirst("\\{style\\}", Integer.toString(ruVar.b)).replaceFirst("\\{scene\\}", Integer.toString(ruVar.c)).replaceFirst("\\{version\\}", Integer.toString(ruVar.d)).replaceFirst("\\{ch\\}", name);
        if (replaceFirst2 != null) {
            kj.c(ki.h, "请求海外图瓦片：".concat(String.valueOf(replaceFirst2)));
            try {
                return new URL(replaceFirst2);
            } catch (MalformedURLException e) {
                kj.c(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider
    public final boolean onLanguageChange(Language language) {
        this.c = language;
        return false;
    }

    public rn(@NonNull ru ruVar, OverSeaSource overSeaSource, gs gsVar) {
        super(ruVar.a, ruVar.d);
        this.c = Language.zh;
        this.b = gsVar;
        this.d = overSeaSource;
        this.a = ruVar;
    }
}
