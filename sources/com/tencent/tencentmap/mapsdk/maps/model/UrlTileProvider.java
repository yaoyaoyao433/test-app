package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.exception.NetErrorException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int mHeight;
    private final int mWidth;

    public abstract URL getTileUrl(int i, int i2, int i3);

    public UrlTileProvider() {
        this(256, 256);
    }

    public UrlTileProvider(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        URL tileUrl = getTileUrl(i, i2, i3);
        Tile tile = NO_TILE;
        if (tileUrl == null) {
            return tile;
        }
        NetResponse requestTileData = requestTileData(tileUrl.toString());
        byte[] bArr = null;
        if (requestTileData != null) {
            if (requestTileData.available()) {
                bArr = requestTileData.data;
            } else if (requestTileData.exception instanceof NetErrorException) {
                if (requestTileData.statusCode == 404) {
                    return NO_TILE;
                }
                return new Tile(this.mWidth, this.mHeight, null);
            }
        }
        return (bArr == null || bArr.length == 0) ? tile : new Tile(this.mWidth, this.mHeight, bArr);
    }

    protected NetResponse requestTileData(String str) {
        try {
            return NetManager.getInstance().builder().url(str).doGet();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
