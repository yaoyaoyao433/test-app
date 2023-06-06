package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DealAlbum {
    public static ChangeQuickRedirect changeQuickRedirect;
    String desc;
    Long did;
    Long id;
    String pic;
    String thumb;

    public DealAlbum() {
    }

    public DealAlbum(Long l, Long l2, String str, String str2, String str3) {
        Object[] objArr = {l, l2, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1acabb61b5faa903a7dcec24fe9deded", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1acabb61b5faa903a7dcec24fe9deded");
            return;
        }
        this.id = l;
        this.did = l2;
        this.pic = str;
        this.thumb = str2;
        this.desc = str3;
    }
}
