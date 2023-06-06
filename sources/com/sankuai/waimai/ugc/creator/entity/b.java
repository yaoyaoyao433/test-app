package com.sankuai.waimai.ugc.creator.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagData;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @SerializedName("localIdentifier")
    public String b;
    @SerializedName("uploadUrl")
    public String c;
    @SerializedName("picTag")
    public ArrayList<TagData> d;
    @SerializedName("imagePath")
    public String e;
    @SerializedName("imageEditInfo")
    public ImageEditInfo f;

    public final ImageData a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa3062cec25afa869eccea1de88785c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa3062cec25afa869eccea1de88785c");
        }
        ImageData imageData = new ImageData();
        if (this.f != null) {
            imageData.k = this.f.d;
            imageData.i = this.f.c;
            imageData.f = this.f.b;
        } else {
            imageData.k = this.c;
            imageData.i = TextUtils.isEmpty(this.e) ? this.b : this.e;
        }
        imageData.j = this.c;
        imageData.h = TextUtils.isEmpty(this.e) ? this.b : this.e;
        imageData.b = this.d;
        imageData.c = this.f;
        return imageData;
    }
}
