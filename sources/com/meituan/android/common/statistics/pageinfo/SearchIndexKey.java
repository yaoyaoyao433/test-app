package com.meituan.android.common.statistics.pageinfo;

import com.meituan.android.common.statistics.InnerDataBuilder.CidQuality;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SearchIndexKey {
    public static final int MATCH_MODE_EXACT_SEARCH = 2;
    public static final int MATCH_MODE_FUZZY_SEARCH = 1;
    public static final int RESULT_EXACT_MATCH_SUCC = 1;
    public static final int RESULT_FUZZY_MATCH_SUCC = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int matchMode;
    public int matchResult;
    public String primaryKey;
    public String secondaryKey;

    public SearchIndexKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9824e2806de35259482777528ec12d4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9824e2806de35259482777528ec12d4d");
            return;
        }
        this.matchMode = 1;
        this.matchResult = 0;
    }

    public SearchIndexKey(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dcbe9fcb248ec2cdfc031707f56fa2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dcbe9fcb248ec2cdfc031707f56fa2e");
            return;
        }
        this.matchMode = 1;
        this.matchResult = 0;
        if (jSONObject != null) {
            this.primaryKey = jSONObject.optString("val_cid");
            this.secondaryKey = CidQuality.getPoiId(jSONObject);
        }
    }

    public void setPrimaryKey(String str) {
        this.primaryKey = str;
    }
}
