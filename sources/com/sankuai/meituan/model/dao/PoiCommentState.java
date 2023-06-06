package com.sankuai.meituan.model.dao;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiCommentState implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avgscore")
    float avgScore;
    @SerializedName("total_bad")
    int countBad;
    @SerializedName("total_withpic")
    int countWithPic;
    String guide;
    long lastModified;
    long poiid;
    @SerializedName("scoreRatioTag")
    String ratioTag;
    int totalcomment;
    @SerializedName("total_noempty")
    int totalnoempty;

    public PoiCommentState() {
    }

    public PoiCommentState(long j, int i, int i2, int i3, String str, float f, long j2, String str2, int i4) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Float.valueOf(f), new Long(j2), str2, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dce924bfaca80065c49dcc886fc48389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dce924bfaca80065c49dcc886fc48389");
            return;
        }
        this.poiid = j;
        this.countWithPic = i;
        this.totalcomment = i2;
        this.totalnoempty = i3;
        this.ratioTag = str;
        this.avgScore = f;
        this.lastModified = j2;
        this.guide = str2;
        this.countBad = i4;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbcb56a94c33cf898e59601dc2a30bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbcb56a94c33cf898e59601dc2a30bfe");
        } else {
            this.poiid = j;
        }
    }
}
