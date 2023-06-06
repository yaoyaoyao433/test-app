package com.meituan.android.identifycardrecognizer.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PhotoFolder implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private int count;
    private String name;
    private final ArrayList<String> photoList;
    private String thumbnail;
    private int type;

    public PhotoFolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47efafbcead21f8944f58c1c10665f44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47efafbcead21f8944f58c1c10665f44");
        } else {
            this.photoList = new ArrayList<>();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public ArrayList<String> getPhotoList() {
        return this.photoList;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
