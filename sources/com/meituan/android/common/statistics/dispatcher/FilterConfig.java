package com.meituan.android.common.statistics.dispatcher;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FilterConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int[] isAuto;
    public ArrayList<String> mAutoList;
    public HashSet<String> mBidSet;
    public HashSet<String> mChannelSet;
    public HashSet<String> mCidSet;
    public HashSet<String> mEventNameSet;
    public ArrayList<String> mNtList;
    public HashSet<String> mValLabSet;
    public int[] nt;

    public FilterConfig(HashSet<String> hashSet, HashSet<String> hashSet2, HashSet<String> hashSet3, HashSet<String> hashSet4, HashSet<String> hashSet5, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Object[] objArr = {hashSet, hashSet2, hashSet3, hashSet4, hashSet5, arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b52f21cae631a4c93ff429f72984ab13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b52f21cae631a4c93ff429f72984ab13");
            return;
        }
        this.mEventNameSet = null;
        this.mChannelSet = hashSet;
        this.mEventNameSet = hashSet2;
        this.mCidSet = hashSet3;
        this.mBidSet = hashSet4;
        this.mValLabSet = hashSet5;
        this.mNtList = arrayList;
        this.mAutoList = arrayList2;
    }

    public boolean filter(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e733f0dc2b1a58cd97ff6c731d68501", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e733f0dc2b1a58cd97ff6c731d68501")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("evs");
        String optString = optJSONObject.optString("nm", "");
        String optString2 = optJSONObject.optString("val_cid", "");
        String optString3 = optJSONObject.optString("val_bid", "");
        JSONObject jSONObject2 = null;
        try {
            if (optJSONObject.has("val_lab")) {
                jSONObject2 = optJSONObject.getJSONObject("val_lab");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        int optInt = optJSONObject.optInt("nt", 1);
        int optInt2 = optJSONObject.optInt(Constants.EventInfoConsts.KEY_IS_AUTO);
        if (this.mChannelSet == null || this.mChannelSet.size() <= 0 || this.mChannelSet.contains(str)) {
            if (this.mEventNameSet == null || this.mEventNameSet.size() <= 0 || this.mEventNameSet.contains(optString)) {
                if (this.mCidSet == null || this.mCidSet.size() <= 0 || this.mCidSet.contains(optString2)) {
                    if (this.mBidSet == null || this.mBidSet.size() <= 0 || this.mBidSet.contains(optString3)) {
                        if (this.mNtList == null || this.mNtList.size() <= 0 || this.mNtList.contains(Integer.valueOf(optInt))) {
                            if (this.mAutoList == null || this.mAutoList.size() <= 0 || this.mAutoList.contains(Integer.valueOf(optInt2))) {
                                if (this.mValLabSet == null || this.mValLabSet.size() <= 0) {
                                    return true;
                                }
                                if (jSONObject2 != null) {
                                    Iterator<String> it = this.mValLabSet.iterator();
                                    while (it.hasNext()) {
                                        if (jSONObject2.has(it.next())) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
