package com.meituan.android.common.statistics.mock;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface MockTemplate<T> {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class KEYS {
        public static final String ELEMENT_ID = "element_id";
        public static final String EVENT_TYPE = "event_type";
        public static final String INDEX = "index";
        public static final String NM = "nm";
        public static final String SEQ = "seq";
        public static final String VAL_ACT = "val_act";
        public static final String VAL_BID = "val_bid";
        public static final String VAL_CID = "val_cid";
        public static final String VAL_LAB = "val_lab";
        public static final String VAL_REF = "val_ref";
        public static final String VAL_VAL = "val_val";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    JSONObject getData(T t);

    String getPath(Uri uri);
}
