package com.sankuai.titans.widget.media.entity;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.BaseKit;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PhotoDirectory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String id;
    private String name;
    private List<Photo> photos;

    public PhotoDirectory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7fd7dfaa41403b1f345329ad6e82d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7fd7dfaa41403b1f345329ad6e82d5");
        } else {
            this.photos = new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a068920cdc21bd13fc4742dc1160139", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a068920cdc21bd13fc4742dc1160139")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoDirectory) {
            PhotoDirectory photoDirectory = (PhotoDirectory) obj;
            boolean z = !TextUtils.isEmpty(this.id);
            boolean isEmpty = true ^ TextUtils.isEmpty(photoDirectory.id);
            if (z && isEmpty && TextUtils.equals(this.id, photoDirectory.id)) {
                return TextUtils.equals(this.name, photoDirectory.name);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13c59bca0ee36d5bba91b1b219cabae9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13c59bca0ee36d5bba91b1b219cabae9")).intValue();
        }
        if (TextUtils.isEmpty(this.id)) {
            if (TextUtils.isEmpty(this.name)) {
                return 0;
            }
            return this.name.hashCode();
        }
        int hashCode = this.id.hashCode();
        return TextUtils.isEmpty(this.name) ? hashCode : (hashCode * 31) + this.name.hashCode();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<Photo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "523f3a70650450433c534e4df7c02c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "523f3a70650450433c534e4df7c02c97");
        } else if (list != null) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Photo photo = list.get(i);
                if (photo == null || !BaseKit.isFileExists(photo.getPath())) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            this.photos = list;
        }
    }

    public List<String> getPhotoPaths() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85ba921bf17d534b7a948e6958ece9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85ba921bf17d534b7a948e6958ece9f");
        }
        ArrayList arrayList = new ArrayList(this.photos.size());
        for (Photo photo : this.photos) {
            arrayList.add(photo.getPath());
        }
        return arrayList;
    }

    public void addPhoto(Photo photo) {
        Object[] objArr = {photo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59fa6ece2aa4d26cbc180dd975d58ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59fa6ece2aa4d26cbc180dd975d58ec6");
        } else {
            this.photos.add(photo);
        }
    }

    public void addPhoto(int i, Photo photo) {
        Object[] objArr = {Integer.valueOf(i), photo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fa801961125d4681aae76e84cdcf1c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fa801961125d4681aae76e84cdcf1c0");
        } else {
            this.photos.add(i, photo);
        }
    }
}
