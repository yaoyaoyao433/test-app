package com.sankuai.titans.widget.media.entity;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.BaseKit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Photo {
    public static final int MEDIA_PHOTO = 1;
    public static final int MEDIA_VIDEO = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String directId;
    private long duration;
    private int id;
    private int mediaType;
    private String path;

    public Photo(int i, String str, int i2, long j, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d95c18091edb05469110536bddcfe7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d95c18091edb05469110536bddcfe7f");
            return;
        }
        this.id = i;
        this.path = str;
        this.mediaType = i2;
        this.duration = j;
        this.directId = str2;
    }

    public Uri getUri() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed789f296924ffd2b590325cc2208337", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed789f296924ffd2b590325cc2208337");
        }
        if (this.mediaType == 2) {
            return ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.id);
        }
        return ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.id);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d68a69e64c4dd225e069d42fb276332b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d68a69e64c4dd225e069d42fb276332b")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof Photo) && this.id == ((Photo) obj).id;
    }

    public int hashCode() {
        return this.id;
    }

    public String getPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59a88707564c314cf9881e3512b3b37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59a88707564c314cf9881e3512b3b37");
        }
        if (BaseKit.getSDKVersion() >= 29) {
            return getUri().toString();
        }
        return this.path;
    }

    public String getOriginalPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public String getDirectId() {
        return this.directId;
    }
}
