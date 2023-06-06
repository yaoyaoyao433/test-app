package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiEnv implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("instead_poi_id")
    public long insteadPoiId;
    @SerializedName("has_more")
    public boolean mAlbumHasMore;
    @SerializedName("thumbnails_url_list")
    public ArrayList<String> mAlbumThumbnails;
    @SerializedName("show")
    public boolean show;
    @SerializedName("thumbnails_url")
    public String thumbnailsUrl;

    public boolean ifShow() {
        return this.show;
    }

    public ArrayList<String> getAlbumThumbnails() {
        return this.mAlbumThumbnails;
    }

    public boolean isAlbumHasMore() {
        return this.mAlbumHasMore;
    }
}
