package com.meituan.android.common.aidata.data;

import android.text.TextUtils;
import com.meituan.android.common.aidata.data.api.EventFilterListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallbackWraper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public EventFilterListener mEventCB;
    public Filter mFilter;
    public String token;

    public CallbackWraper(String str, EventFilter eventFilter, EventFilterListener eventFilterListener) {
        this.mFilter = null;
        this.mFilter = new Filter(eventFilter);
        this.mEventCB = eventFilterListener;
        this.token = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Filter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ArrayList<Integer> mAutoList;
        public HashSet<String> mBidSet;
        public HashSet<String> mChannelSet;
        public HashSet<String> mCidSet;
        public HashSet<String> mEventNameSet;
        public ArrayList<Integer> mNtList;
        public HashSet<String> mValLabSet;

        public Filter(EventFilter eventFilter) {
            Object[] objArr = {eventFilter};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9be0cb594cf9d03926bbb677d9cc76ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9be0cb594cf9d03926bbb677d9cc76ab");
                return;
            }
            this.mEventNameSet = null;
            if (eventFilter != null) {
                if (!TextUtils.isEmpty(eventFilter.category)) {
                    this.mChannelSet = new HashSet<>(Arrays.asList(eventFilter.category.split(CommonConstant.Symbol.COMMA)));
                }
                if (!TextUtils.isEmpty(eventFilter.nm)) {
                    this.mEventNameSet = new HashSet<>(Arrays.asList(eventFilter.nm.toUpperCase().split(CommonConstant.Symbol.COMMA)));
                }
                if (!TextUtils.isEmpty(eventFilter.cid)) {
                    this.mCidSet = new HashSet<>(Arrays.asList(eventFilter.cid.split(CommonConstant.Symbol.COMMA)));
                }
                if (!TextUtils.isEmpty(eventFilter.bid)) {
                    this.mBidSet = new HashSet<>(Arrays.asList(eventFilter.bid.split(CommonConstant.Symbol.COMMA)));
                }
                if (!TextUtils.isEmpty(eventFilter.val_lab)) {
                    this.mValLabSet = new HashSet<>(Arrays.asList(eventFilter.val_lab.split(CommonConstant.Symbol.COMMA)));
                }
                if (eventFilter.nt != null && eventFilter.nt.length > 0) {
                    this.mNtList = new ArrayList<>();
                    for (int i : eventFilter.nt) {
                        this.mNtList.add(Integer.valueOf(i));
                    }
                }
                if (eventFilter.isAuto == null || eventFilter.isAuto.length <= 0) {
                    return;
                }
                this.mAutoList = new ArrayList<>();
                for (int i2 : eventFilter.isAuto) {
                    this.mAutoList.add(Integer.valueOf(i2));
                }
            }
        }

        public final boolean filter(EventBean eventBean) {
            Object[] objArr = {eventBean};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8e44a07ac76e47ca12a9253ff15020f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8e44a07ac76e47ca12a9253ff15020f")).booleanValue();
            }
            if (eventBean == null) {
                return false;
            }
            String str = eventBean.nm;
            String str2 = eventBean.cid;
            String str3 = eventBean.bid;
            JSONObject jSONObject = null;
            try {
                if (!TextUtils.isEmpty(eventBean.valLab)) {
                    jSONObject = new JSONObject(eventBean.valLab);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            int i = eventBean.nt;
            int i2 = eventBean.isAuto;
            if (this.mChannelSet == null || this.mChannelSet.size() <= 0 || this.mChannelSet.contains(eventBean.category)) {
                if (this.mEventNameSet == null || this.mEventNameSet.size() <= 0 || this.mEventNameSet.contains(str)) {
                    if (this.mCidSet == null || this.mCidSet.size() <= 0 || this.mCidSet.contains(str2)) {
                        if (this.mBidSet == null || this.mBidSet.size() <= 0 || this.mBidSet.contains(str3)) {
                            if (this.mNtList == null || this.mNtList.size() <= 0 || this.mNtList.contains(Integer.valueOf(i))) {
                                if (this.mAutoList == null || this.mAutoList.size() <= 0 || this.mAutoList.contains(Integer.valueOf(i2))) {
                                    if (this.mValLabSet == null || this.mValLabSet.size() <= 0) {
                                        return true;
                                    }
                                    if (jSONObject != null) {
                                        Iterator<String> it = this.mValLabSet.iterator();
                                        while (it.hasNext()) {
                                            if (jSONObject.has(it.next())) {
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
}
