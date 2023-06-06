package com.tencent.map.lib.models;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class MapTileID {
    private int dataSource;
    private int priority;
    private int tileTag;
    private String url;
    private int x;
    private int y;
    private int z;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public String getUrl() {
        return this.url;
    }

    public DownloadPriority getPriority() {
        return DownloadPriority.get(this.priority);
    }

    public DataSource getDataSource() {
        return DataSource.get(this.dataSource);
    }

    public int getTileTag() {
        return this.tileTag;
    }

    public String toString() {
        return "MapTileID{x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", url='" + this.url + "', priority=" + this.priority + ", dataSource=" + this.dataSource + ", tileTag=" + this.tileTag + '}';
    }
}
